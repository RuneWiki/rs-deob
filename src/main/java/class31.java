import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class31 {

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field378 = 0;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "[I")
    public static int[] field377 = new int[14];

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z")
    public static final boolean method189(int arg0, int arg1) {
        field376++;
        if (class327.field4950[arg1]) {
            return true;
        } else if (class254.field4106.method757(true, arg1)) {
            int var2 = class254.field4106.method748(arg1, 12408);
            if (var2 == 0) {
                class327.field4950[arg1] = true;
                return true;
            } else if (arg0 == 14) {
                if (class237.field3555[arg1] == null) {
                    class237.field3555[arg1] = new class38[var2];
                }
                for (int var3 = 0; var3 < var2; var3++) {
                    if (class237.field3555[arg1][var3] == null) {
                        byte[] var4 = class254.field4106.method731(arg0 ^ 0xE, var3, arg1);
                        if (var4 != null) {
                            class38 var5 = class237.field3555[arg1][var3] = new class38();
                            var5.field580 = (arg1 << 16) + var3;
                            if (var4[0] != -1) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method253((byte) -22, new class194(var4));
                        }
                    }
                }
                class327.field4950[arg1] = true;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZB)Ljava/lang/String;")
    public static final String method190(int arg0, boolean arg1, byte arg2) {
        if (arg2 == 92) {
            field379++;
            return arg1 && arg0 >= 0 ? class316.method2102(arg1, 10, arg0, 48) : Integer.toString(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    public static void method191(int arg0) {
        field377 = null;
        if (arg0 != 3309) {
            field378 = 33;
        }
    }
}
