import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class1 extends class247 {

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field1 = 127;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "Ljk;")
    public static class76 field2 = new class76();

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "[Luf;")
    public static class168[] field7;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZZ[B)Ljava/lang/Object;", line = 4)
    public static final Object method1(boolean arg0, boolean arg1, byte[] arg2) {
        field6++;
        if (arg0) {
            method3((byte) -68);
        }
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class142.field2189) {
            try {
                class39 var3 = (class39) Class.forName("c").getDeclaredConstructor().newInstance();
                var3.method217(arg2, -1);
                return var3;
            } catch (Throwable var5) {
                class142.field2189 = true;
            }
        }
        return arg1 ? client.method2006(0, arg2) : arg2;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII)I", line = 57)
    public static final int method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg2;
            arg2 = var8;
        }
        field4++;
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return arg1;
        } else if (var7 == 2) {
            return 7 - (arg6 - (1 - arg0));
        } else {
            int var9 = -5 % ((arg5 - 60) / 62);
            return 1 + 7 - arg1 - arg2;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V", line = 96)
    public static void method3(byte arg0) {
        int var1 = -2 / ((arg0 + 32) / 32);
        field2 = null;
        field7 = null;
    }
}
