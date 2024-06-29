import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class235 extends class424 {

    @OriginalMember(owner = "client!bfa", name = "n", descriptor = "I")
    private int field3136;

    @OriginalMember(owner = "client!bfa", name = "B", descriptor = "I")
    public int field3150;

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!bfa", name = "p", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!bfa", name = "v", descriptor = "I")
    private int field3144;

    @OriginalMember(owner = "client!bfa", name = "s", descriptor = "I")
    private int field3141;

    @OriginalMember(owner = "client!bfa", name = "w", descriptor = "I")
    private int field3145;

    @OriginalMember(owner = "client!bfa", name = "C", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!bfa", name = "A", descriptor = "I")
    private int field3149;

    @OriginalMember(owner = "client!bfa", name = "x", descriptor = "Lbm;")
    public static class637 field3146 = new class637();

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!bfa", name = "r", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!bfa", name = "t", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!bfa", name = "u", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!bfa", name = "y", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!bfa", name = "D", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(BII)Z")
    public final boolean method1486(byte arg0, int arg1, int arg2) {
        field3152++;
        if (arg0 != 121) {
            this.field3149 = -64;
        }
        return arg2 >= this.field3144 && this.field3141 >= arg2 && arg1 >= this.field3149 && this.field3145 >= arg1;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III[I)V")
    public final void method1487(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = this.field3144 + arg0 - this.field3151;
        arg3[2] = -this.field3138 - (-this.field3149 - arg1);
        if (arg2 != 8) {
            this.method1486((byte) 44, -14, -120);
        }
        field3147++;
        arg3[0] = this.field3136;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZI)Z")
    public final boolean method1488(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return false;
        } else {
            field3137++;
            return arg2 >= this.field3151 && arg2 <= this.field3148 && arg0 >= this.field3138 && this.field3150 >= arg0;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B[III)V")
    public final void method1489(byte arg0, int[] arg1, int arg2, int arg3) {
        arg1[2] = this.field3138 + arg3 - this.field3149;
        if (arg0 > -116) {
            method1490(21);
        }
        arg1[1] = arg2 + this.field3151 - this.field3144;
        field3143++;
        arg1[0] = 0;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
    public static void method1490(int arg0) {
        if (arg0 <= -74) {
            field3146 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(JI)V")
    public static final void method1491(long arg0, int arg1) {
        if (arg1 > -3) {
            method1491(79L, -111);
        }
        field3142++;
        int var3 = class425.field5518;
        if (class473.field6168 != var3) {
            int var4 = var3 - class473.field6168;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var4 > var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var4 < var5) {
                var5 = var4;
            }
            class473.field6168 += var5;
        }
        int var6 = class509.field6669;
        if (class219.field2880 != var6) {
            int var7 = var6 - class219.field2880;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class219.field2880 += var8;
        }
        if (!class260.field3509.field1283) {
            class141.field1859 += (float) arg0 * class507.field6661 / 40.0F * 8.0F;
            class710.field9918 += (float) arg0 * class66.field907 / 40.0F * 8.0F;
        }
        class560.method2999(16384);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BIII)Z")
    public final boolean method1492(byte arg0, int arg1, int arg2, int arg3) {
        field3139++;
        if (arg0 > -67) {
            return true;
        } else {
            return this.field3136 == arg3 && arg2 >= this.field3144 && arg2 <= this.field3141 && arg1 >= this.field3149 && arg1 <= this.field3145;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field3136 = arg0;
        this.field3150 = arg8;
        this.field3148 = arg7;
        this.field3138 = arg6;
        this.field3144 = arg1;
        this.field3141 = arg3;
        this.field3145 = arg4;
        this.field3151 = arg5;
        this.field3149 = arg2;
    }
}
