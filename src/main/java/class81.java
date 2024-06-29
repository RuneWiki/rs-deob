import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class81 extends class7 {

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    private int field1133 = 0;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    private int field1140 = 0;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    private int field1131 = -32768;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Z")
    public boolean field1147 = false;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    private int field1145 = -1;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lpi;")
    private class202 field1134;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1132 = "Cancel";

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field1130 = 1;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Z")
    public static boolean field1126 = false;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field1136 = 0;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "[I")
    public static int[] field1146 = new int[100];

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "Lpe;")
    private class294 field1148;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[Lmh;")
    public static class20[] field1135;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)I", line = 10)
    public static final int method550(int arg0, boolean arg1) {
        if (arg1) {
            field1124++;
            return arg0 >>> 8;
        } else {
            return 8;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIIJILpe;)V", line = 28)
    public final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class294 arg10) {
        class262 var13 = this.method554(-1);
        field1151++;
        if (var13 != null) {
            var13.method38(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1148);
            this.field1131 = var13.method33();
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIII)V", line = 44)
    public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1138++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)I", line = 53)
    public static final int method551(int arg0, byte arg1) {
        field1129++;
        int var2 = arg0 & 0x3F;
        if (arg1 > -7) {
            return -115;
        }
        int var3 = (arg0 & 0xCA) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 109)
    public static void method552(int arg0) {
        field1132 = null;
        field1135 = null;
        if (arg0 == 3) {
            field1146 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lak;Z)V", line = 131)
    public static final void method553(class172 arg0, boolean arg1) {
        if (arg1) {
            field1141++;
            class43.field540 = arg0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()I", line = 155)
    public final int method33() {
        field1142++;
        return this.field1131;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Lei;", line = 165)
    private final class262 method554(int arg0) {
        if (arg0 != -1) {
            return (class262) null;
        }
        field1144++;
        class323 var2 = class215.method1545(this.field1139, 1);
        class262 var3;
        if (this.field1147) {
            var3 = var2.method2265(62, 0, -1, -1);
        } else {
            var3 = var2.method2265(-52, this.field1140, this.field1145, this.field1133);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IZ)V", line = 189)
    public final void method555(int arg0, boolean arg1) {
        field1128++;
        if (this.field1147 || !arg1) {
            return;
        }
        this.field1140 += arg0;
        while (this.field1140 > this.field1134.field3290[this.field1133]) {
            this.field1140 -= this.field1134.field3290[this.field1133];
            this.field1133++;
            if (this.field1133 >= this.field1134.field3293.length) {
                this.field1147 = true;
                break;
            }
        }
        if (!this.field1147) {
            class190.method1411(31, false, this.field1134, this.field1123, this.field1133, this.field1149);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIII)V", line = 244)
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1150 = arg5 + arg6;
        this.field1139 = arg0;
        this.field1123 = arg3;
        this.field1149 = arg2;
        this.field1143 = arg4;
        this.field1125 = arg1;
        int var8 = class215.method1545(this.field1139, 1).field5011;
        if (var8 == -1) {
            this.field1147 = true;
        } else {
            this.field1147 = false;
            this.field1134 = class325.method2274(var8, -115);
        }
        if (this.field1150 == arg6) {
            class190.method1411(31, false, this.field1134, this.field1123, this.field1133, this.field1149);
        }
    }
}
