import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class288 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    private int field5120 = 128;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    private int field5128 = 0;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    private int field5126 = 128;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    private int field5134 = 0;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Z")
    public boolean field5125 = false;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public int field5130 = -1;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    private int field5140 = 0;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Lid;")
    public static class149 field5138 = class60.method382("<col=ff0000>", (byte) 44);

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Lid;")
    public static class149 field5135 = class60.method382(")2", (byte) 52);

    @OriginalMember(owner = "client!li", name = "t", descriptor = "Lvb;")
    public static class60 field5139 = new class60();

    @OriginalMember(owner = "client!li", name = "x", descriptor = "Lid;")
    public static class149 field5143 = class60.method382("W-=hlen Sie eine Option", (byte) 124);

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field5144 = -1;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "Lid;")
    public static class149 field5148 = class60.method382("D-Bmarrage de la librairie 3D", (byte) 37);

    @OriginalMember(owner = "client!li", name = "v", descriptor = "Lid;")
    private static class149 field5141 = class60.method382("flash3:", (byte) 10);

    @OriginalMember(owner = "client!li", name = "w", descriptor = "Lid;")
    public static class149 field5142 = field5141;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "Lid;")
    public static class149 field5149 = class60.method382("(U1", (byte) 9);

    @OriginalMember(owner = "client!li", name = "z", descriptor = "Lid;")
    public static class149 field5145 = field5141;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field5146 = 2;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public int field5123;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    private int field5136;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "[I")
    public static int[] field5147;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "[S")
    private short[] field5127;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "[S")
    private short[] field5129;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "[S")
    private short[] field5133;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "[S")
    private short[] field5137;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILgd;I)V")
    private final void method1970(int arg0, class74 arg1, int arg2) {
        field5122++;
        if (arg0 == 1) {
            this.field5136 = arg1.method485(-2386);
        } else if (arg0 == 2) {
            this.field5130 = arg1.method485(-2386);
        } else if (arg0 == 4) {
            this.field5126 = arg1.method485(-2386);
        } else if (arg0 == 5) {
            this.field5120 = arg1.method485(-2386);
        } else if (arg0 == 6) {
            this.field5128 = arg1.method485(-2386);
        } else if (arg0 == 7) {
            this.field5134 = arg1.method489((byte) 111);
        } else if (arg0 == 8) {
            this.field5140 = arg1.method489((byte) 99);
        } else if (arg0 == 9) {
            this.field5125 = true;
        } else if (arg0 == 40) {
            int var4 = arg1.method489((byte) 119);
            this.field5137 = new short[var4];
            this.field5133 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5137[var5] = (short) arg1.method485(-2386);
                this.field5133[var5] = (short) arg1.method485(-2386);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method489((byte) -119);
            this.field5127 = new short[var6];
            this.field5129 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5127[var7] = (short) arg1.method485(-2386);
                this.field5129[var7] = (short) arg1.method485(-2386);
            }
        }
        int var8 = 12 % ((arg2 - 24) / 55);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLgd;)V")
    public final void method1971(boolean arg0, class74 arg1) {
        field5121++;
        if (arg0) {
            this.field5130 = 11;
        }
        while (true) {
            int var3 = arg1.method489((byte) 82);
            if (var3 == 0) {
                return;
            }
            this.method1970(var3, arg1, -100);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IBII)Lnd;")
    public final class262 method1972(int arg0, byte arg1, int arg2, int arg3) {
        field5131++;
        class262 var5 = (class262) class116.field1987.method1293((long) this.field5123, false);
        if (arg1 > -43) {
            return null;
        }
        if (var5 == null) {
            class241 var6 = class241.method1661(class23.field327, this.field5136, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field5137 != null) {
                for (int var7 = 0; var7 < this.field5137.length; var7++) {
                    var6.method1677(this.field5137[var7], this.field5133[var7]);
                }
            }
            if (this.field5127 != null) {
                for (int var8 = 0; var8 < this.field5127.length; var8++) {
                    var6.method1672(this.field5127[var8], this.field5129[var8]);
                }
            }
            var5 = var6.method1668(this.field5134 + 64, this.field5140 + 850, -30, -50, -30);
            class116.field1987.method1295((long) this.field5123, var5, (byte) -71);
        }
        class262 var9;
        if (this.field5130 == -1 || arg3 == -1) {
            var9 = var5.method848(true, true, true);
        } else {
            var9 = class69.method436(this.field5130, -32).method1207(91, arg2, var5, arg3, arg0);
        }
        if (this.field5126 != 128 || this.field5120 != 128) {
            var9.method845(this.field5126, this.field5120, this.field5126);
        }
        if (this.field5128 != 0) {
            if (this.field5128 == 90) {
                var9.method857();
            }
            if (this.field5128 == 180) {
                var9.method836();
            }
            if (this.field5128 == 270) {
                var9.method839();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lwf;I)V")
    public static final void method1973(class1 arg0, int arg1) {
        int var2 = 99 / ((16 - arg1) / 40);
        class24.method139(arg0, -22368, 200000);
        field5124++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static void method1974(byte arg0) {
        field5148 = null;
        field5149 = null;
        field5139 = null;
        field5143 = null;
        field5142 = null;
        field5141 = null;
        if (arg0 >= -71) {
            method1973((class1) null, -82);
        }
        field5147 = null;
        field5145 = null;
        field5135 = null;
        field5138 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(JI)V")
    public static final void method1975(long arg0, int arg1) {
        field5132++;
        if (arg0 != 0L && arg1 >= 106) {
            class167.field3096++;
            class208.field3720.method162(2, 104);
            class208.field3720.method496(2, arg0);
        }
    }
}
