import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class232 extends class258 {

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Z")
    public boolean field4124 = false;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    private int field4127 = 0;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    private int field4138 = -32768;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    private int field4131 = 0;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public int field4145;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    private int field4122;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    public int field4134;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "Lm;")
    private class149 field4140;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "[I")
    public static int[] field4128 = new int[1000];

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field4126 = 50;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "Lqj;")
    public static class196 field4135 = null;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "[I")
    public static int[] field4143 = new int[field4126];

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "[I")
    public static int[] field4139 = new int[field4126];

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "[Lqj;")
    public static class196[] field4130 = new class196[field4126];

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "[I")
    public static int[] field4141 = new int[field4126];

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "[I")
    public static int[] field4132 = new int[field4126];

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "Lqj;")
    public static class196 field4149 = class80.method502(")1j", -48);

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "[I")
    public static int[] field4136 = new int[field4126];

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "[I")
    public static int[] field4146 = new int[field4126];

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "Lqj;")
    public static class196 field4150 = class80.method502("hitbar_default", -48);

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "[I")
    public static int[] field4148 = new int[field4126];

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method1556(int arg0) {
        field4148 = null;
        field4135 = null;
        if (arg0 != 18780) {
            method1557(124, 73, 68, -114, 126, 127, -104, -45);
        }
        field4130 = null;
        field4150 = null;
        field4139 = null;
        field4149 = null;
        field4136 = null;
        field4132 = null;
        field4146 = null;
        field4143 = null;
        field4128 = null;
        field4141 = null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIIIIIII)Z")
    public static final boolean method1557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Loc;")
    private final class119 method1558(byte arg0) {
        class209 var2 = class148.method929(1, this.field4122);
        field4137++;
        class119 var3;
        if (this.field4124) {
            var3 = var2.method1446(-1, (byte) -51);
        } else {
            var3 = var2.method1446(this.field4131, (byte) -51);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -63) {
                field4150 = null;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "()I")
    public final int method266() {
        field4142++;
        return this.field4138;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class119 var11 = this.method1558((byte) -63);
        field4123++;
        if (var11 != null) {
            var11.method269(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4138 = var11.method266();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V")
    public final void method1559(boolean arg0, int arg1) {
        field4129++;
        if (this.field4124 || arg0) {
            return;
        }
        this.field4127 += arg1;
        while (this.field4140.field2361[this.field4131] < this.field4127) {
            this.field4127 -= this.field4140.field2361[this.field4131];
            this.field4131++;
            if (this.field4131 >= this.field4140.field2362.length) {
                this.field4124 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIIIII)V")
    public class232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4147 = arg3;
        this.field4144 = arg5 + arg6;
        this.field4145 = arg4;
        this.field4122 = arg0;
        this.field4134 = arg1;
        this.field4125 = arg2;
        int var8 = class148.method929(1, this.field4122).field3773;
        if (var8 == -1) {
            this.field4124 = true;
        } else {
            this.field4124 = false;
            this.field4140 = class116.method704(var8, -10304);
        }
    }
}
