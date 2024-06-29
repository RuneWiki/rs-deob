import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public abstract class class17 extends class498 {

    @OriginalMember(owner = "client!bu", name = "x", descriptor = "[Lbu;")
    public class17[] field207;

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "Z")
    public boolean field205;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "Ldg;")
    public static class288 field209 = new class288(128);

    @OriginalMember(owner = "client!bu", name = "C", descriptor = "[I")
    public static int[] field212 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!bu", name = "y", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "Lud;")
    public static class27 field213;

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "Lgr;")
    public class303 field201;

    @OriginalMember(owner = "client!bu", name = "A", descriptor = "Lav;")
    public class460 field210;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 4)
    public void method84(int arg0) {
        if (arg0 != -24566) {
            this.method86((byte) 52);
        }
        field211++;
        if (this.field205) {
            this.field210.method2678(arg0 + 24499);
            this.field210 = null;
        } else {
            this.field201.method1848(arg0 ^ 0xFFFFA055);
            this.field201 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "(I)I", line = 37)
    public int method85(int arg0) {
        if (arg0 == -1) {
            field214++;
            return -1;
        } else {
            return 17;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)I", line = 48)
    public int method86(byte arg0) {
        if (arg0 > -11) {
            this.field202 = 76;
        }
        field208++;
        return -1;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)[I", line = 62)
    public int[] method27(int arg0, int arg1) {
        field198++;
        if (arg1 <= 53) {
            this.field201 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lwm;II)V", line = 74)
    public void method34(class403 arg0, int arg1, int arg2) {
        field200++;
        if (arg2 != 5159) {
            this.field205 = true;
        }
    }

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "(I)V", line = 85)
    public static void method87(int arg0) {
        field213 = null;
        if (arg0 == 3) {
            field212 = null;
            field209 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)[I", line = 98)
    public final int[] method88(int arg0, int arg1, int arg2) {
        field204++;
        if (arg1 == -4526) {
            return this.field207[arg2].field205 ? this.field207[arg2].method27(arg0, 115) : this.field207[arg2].method89(arg0, (byte) -25)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IB)[[I", line = 119)
    public int[][] method89(int arg0, byte arg1) {
        field206++;
        if (arg1 != -25) {
            this.method34(null, -117, 124);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(III)V", line = 133)
    public void method90(int arg0, int arg1, int arg2) {
        field203++;
        int var4 = ~this.field202 == arg1 ? arg2 : this.field202;
        if (this.field205) {
            this.field210 = new class460(var4, arg2, arg0);
        } else {
            this.field201 = new class303(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "(I)V", line = 156)
    public void method31(int arg0) {
        field199++;
        if (arg0 != -9) {
            this.method88(-87, 116, 98);
        }
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(III)[[I", line = 169)
    public final int[][] method91(int arg0, int arg1, int arg2) {
        field197++;
        if (arg1 != 0) {
            field213 = null;
        }
        if (this.field207[arg0].field205) {
            int[] var4 = this.field207[arg0].method27(arg2, 102);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field207[arg0].method89(arg2, (byte) -25);
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IZ)V", line = 216)
    public class17(int arg0, boolean arg1) {
        this.field207 = new class17[arg0];
        this.field205 = arg1;
    }
}
