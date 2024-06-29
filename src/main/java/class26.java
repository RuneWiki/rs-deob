import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class26 implements class524 {

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Lgq;")
    private class334 field236 = new class334(256);

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "Ltf;")
    private class701 field242;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Ltf;")
    private class701 field232;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "[Lco;")
    private class295[] field241;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "[I")
    public static int[] field233 = new int[3];

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Lsb;")
    public static class305 field238 = new class305(76, 8);

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "F")
    public static float field250;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIFIZ)[F")
    public final float[] method139(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5) {
        field244++;
        if (arg0 != 16564) {
            field250 = 1.1910791F;
        }
        return this.method146(arg4, true).method1452(this, arg2, (byte) -50, this.field242, this.field241[arg4].field3672, arg1);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)Lco;")
    public final class295 method140(int arg0, int arg1) {
        field240++;
        return arg1 == 862 ? this.field241[arg0] : null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZIIFII)[I")
    public final int[] method141(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5) {
        field247++;
        if (arg4 != 16944) {
            this.method144(-19, 127);
        }
        return this.method146(arg1, true).method1447(arg2, arg5, this.field242, this, this.field241[arg1].field3672, (byte) -88, (double) arg3);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)I")
    public final int method142(int arg0) {
        field243++;
        if (arg0 != -26131) {
            field233 = null;
        }
        return this.field249;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V")
    public static final void method143(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -118) {
            method147(-58);
        }
        field237++;
        String var4 = "tele " + arg3 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        class353.method2088(true, false, var4, -1);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)Z")
    public final boolean method144(int arg0, int arg1) {
        field239++;
        class246 var3 = this.method146(arg1, true);
        if (arg0 != 8649) {
            this.method141(true, 106, -39, -0.34478396F, -81, -123);
        }
        return var3 != null && var3.method1451((byte) 120, this.field242, this);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZFIII)[I")
    public final int[] method145(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5) {
        field234++;
        if (arg3 != -18551) {
            this.method142(-81);
        }
        return this.method146(arg5, true).method1449(arg1, (double) arg2, arg0, -8339, this.field241[arg5].field3672, this, arg4, this.field242);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)Leh;")
    private final class246 method146(int arg0, boolean arg1) {
        field248++;
        class617 var3 = this.field236.method1927((long) arg0, 0);
        if (var3 != null) {
            return (class246) var3;
        }
        byte[] var4 = this.field232.method3859((byte) 123, arg0);
        if (var4 == null) {
            return null;
        }
        if (!arg1) {
            this.field242 = null;
        }
        class246 var5 = new class246(new class115(var4));
        this.field236.method1928(-114, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
    public static void method147(int arg0) {
        if (arg0 == 2) {
            field233 = null;
            field238 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BZ)I")
    public static final int method148(byte arg0, boolean arg1) {
        field235++;
        if (class274.field3434 == null) {
            return 0;
        } else if (arg1 || class517.field7368 == null) {
            int var2 = 0;
            if (arg0 != 115) {
                return -100;
            }
            for (int var3 = 0; var3 < class274.field3434.length; var3++) {
                int var4 = class274.field3434[var3];
                if (class157.field1759.method3849(var4, false)) {
                    var2++;
                }
                if (class489.field7119.method3849(var4, false)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class274.field3434.length * 2;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Ltf;Ltf;Ltf;)V")
    public class26(class701 arg0, class701 arg1, class701 arg2) {
        this.field242 = arg2;
        this.field232 = arg1;
        class115 var4 = new class115(arg0.method3854((byte) 30, 0, 0));
        this.field249 = var4.method643((byte) -77);
        this.field241 = new class295[this.field249];
        for (int var5 = 0; var5 < this.field249; var5++) {
            if (var4.method620((byte) -127) == 1) {
                this.field241[var5] = new class295();
            }
        }
        for (int var6 = 0; var6 < this.field249; var6++) {
            if (this.field241[var6] != null) {
                this.field241[var6].field3674 = var4.method620((byte) 40) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field249; var7++) {
            if (this.field241[var7] != null) {
                this.field241[var7].field3665 = var4.method620((byte) -128) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field249; var8++) {
            if (this.field241[var8] != null) {
                this.field241[var8].field3668 = var4.method620((byte) -126) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field249; var9++) {
            if (this.field241[var9] != null) {
                this.field241[var9].field3670 = var4.method620((byte) -126) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field249; var10++) {
            if (this.field241[var10] != null) {
                this.field241[var10].field3667 = var4.method657(false);
            }
        }
        for (int var11 = 0; var11 < this.field249; var11++) {
            if (this.field241[var11] != null) {
                this.field241[var11].field3671 = var4.method657(false);
            }
        }
        for (int var12 = 0; var12 < this.field249; var12++) {
            if (this.field241[var12] != null) {
                this.field241[var12].field3669 = var4.method657(false);
            }
        }
        for (int var13 = 0; var13 < this.field249; var13++) {
            if (this.field241[var13] != null) {
                this.field241[var13].field3676 = var4.method657(false);
            }
        }
        for (int var14 = 0; var14 < this.field249; var14++) {
            if (this.field241[var14] != null) {
                this.field241[var14].field3683 = (short) var4.method643((byte) -77);
            }
        }
        for (int var15 = 0; var15 < this.field249; var15++) {
            if (this.field241[var15] != null) {
                this.field241[var15].field3673 = var4.method657(false);
            }
        }
        for (int var16 = 0; var16 < this.field249; var16++) {
            if (this.field241[var16] != null) {
                this.field241[var16].field3681 = var4.method657(false);
            }
        }
        for (int var17 = 0; var17 < this.field249; var17++) {
            if (this.field241[var17] != null) {
                this.field241[var17].field3680 = var4.method620((byte) -21) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field249; var18++) {
            if (this.field241[var18] != null) {
                this.field241[var18].field3672 = var4.method620((byte) -126) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field249; var19++) {
            if (this.field241[var19] != null) {
                this.field241[var19].field3675 = var4.method657(false);
            }
        }
        for (int var20 = 0; var20 < this.field249; var20++) {
            if (this.field241[var20] != null) {
                this.field241[var20].field3687 = var4.method620((byte) 115) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field249; var21++) {
            if (this.field241[var21] != null) {
                this.field241[var21].field3678 = var4.method620((byte) 23) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field249; var22++) {
            if (this.field241[var22] != null) {
                this.field241[var22].field3679 = var4.method620((byte) -10) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field249; var23++) {
            if (this.field241[var23] != null) {
                this.field241[var23].field3682 = var4.method620((byte) -127);
            }
        }
        for (int var24 = 0; var24 < this.field249; var24++) {
            if (this.field241[var24] != null) {
                this.field241[var24].field3677 = var4.method631(false);
            }
        }
        for (int var25 = 0; var25 < this.field249; var25++) {
            if (this.field241[var25] != null) {
                this.field241[var25].field3666 = var4.method620((byte) 102) == 1;
            }
        }
    }
}
