import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class478 extends class312 {

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "[Ld;")
    public static class102[] field6985 = new class102[14];

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", line = 5)
    public static final void method2806(String arg0, int arg1, int arg2, int arg3, String arg4, String arg5) {
        class29.method200(arg1, arg5, (byte) 82, arg0, null, -1, arg4, arg2);
        if (arg3 == 4339) {
            field6988++;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V", line = 21)
    public static final void method2807(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 14) {
            field6989 = -55;
        }
        class456.field6661 = new byte[arg2][arg0][arg1];
        field6986++;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 32)
    public static void method2808(int arg0) {
        field6985 = null;
        int var1 = 126 % ((8 - arg0) / 61);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)Z", line = 47)
    public static final boolean method2809(int arg0, boolean arg1) {
        field6987++;
        if (class359.field4910[arg0]) {
            return true;
        } else if (!class36.field506.method1393(-109, arg0)) {
            return false;
        } else if (arg1) {
            return false;
        } else {
            int var2 = class36.field506.method1397((byte) 98, arg0);
            if (var2 == 0) {
                class359.field4910[arg0] = true;
                return true;
            }
            if (class522.field7701[arg0] == null) {
                class522.field7701[arg0] = new class295[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class522.field7701[arg0][var3] == null) {
                    byte[] var4 = class36.field506.method1411(true, var3, arg0);
                    if (var4 != null) {
                        class295 var5 = class522.field7701[arg0][var3] = new class295();
                        var5.field4073 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1700(new class365(var4), (byte) -50);
                    }
                }
            }
            class359.field4910[arg0] = true;
            return true;
        }
    }
}
