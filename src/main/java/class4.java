import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class4 extends class64 {

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    private int field45 = -32768;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Ll;")
    public static class66 field47 = new class66(64);

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "Z")
    public static boolean field56 = false;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "[Lpc;")
    public static class100[] field57;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZBILjava/lang/String;)Z", line = 14)
    public static final boolean method33(boolean arg0, byte arg1, int arg2, String arg3) {
        field48++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg3.length();
        int var7 = 0;
        int var8 = -36 % ((31 - arg1) / 60);
        for (int var9 = 0; var9 < var6; var9++) {
            char var10 = arg3.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var5 = true;
                    continue;
                }
                if (var10 == '+' && arg0) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var12) {
                return false;
            }
            if (var5) {
                var12 = -var12;
            }
            int var11 = arg2 * var7 + var12;
            if ((var11 / arg2) != var7) {
                return false;
            }
            var7 = var11;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()I", line = 90)
    public final int method21() {
        field44++;
        return this.field45;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 102)
    public static final void method34(int arg0) {
        class281.field4345 = null;
        class350.field5563 = null;
        class324.field4983 = null;
        class346.field5506 = null;
        class148.field2429 = null;
        class314.field4853 = null;
        class160.field2557 = null;
        class221.field3434 = null;
        class43.field690 = null;
        class310.field4806 = null;
        class167.field2665 = null;
        class334.field5114 = null;
        field52++;
        class306.field4750 = null;
        if (arg0 == -23080) {
            class19.field312 = null;
            class64.field988 = null;
            class85.field1216 = null;
            class342.field5410 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V", line = 129)
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field53++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIJILem;)V", line = 147)
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class273 arg10) {
        field50++;
        class52 var13 = class48.method469(10, this.field51).method1936(-1, 0, this.field55, (class93) null, 19239, (class207) null, 0);
        if (var13 != null) {
            var13.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field45 = var13.method21();
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V", line = 165)
    public static void method35(boolean arg0) {
        field47 = null;
        if (!arg0) {
            field46 = -92;
        }
        field57 = null;
    }
}
