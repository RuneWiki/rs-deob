import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class719 implements class150 {

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "Ljl;")
    private class270 field10083 = new class270(256);

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Loh;")
    private class404 field10081;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Loh;")
    private class404 field10082;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    private int field10079;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "[Lnba;")
    private class298[] field10090;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field10080;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field10084;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field10085;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field10086;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field10087;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field10088;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field10089;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Z", line = 6)
    public final boolean method929(int arg0, int arg1) {
        if (arg0 != 15715) {
            this.field10082 = null;
        }
        field10084++;
        class646 var3 = this.method4012(arg1, false);
        return var3 != null && var3.method3677(this, this.field10082, (byte) -106);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZIIIBF)[F", line = 23)
    public final float[] method933(boolean arg0, int arg1, int arg2, int arg3, byte arg4, float arg5) {
        field10089++;
        int var7 = -2 % ((arg4 - 18) / 61);
        return this.method4012(arg1, false).method3675(this, this.field10090[arg1].field3703, this.field10082, 0, arg2, arg3);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZIIIFI)[I", line = 34)
    public final int[] method930(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5) {
        int var7 = -93 / ((41 - arg1) / 45);
        field10080++;
        return this.method4012(arg3, false).method3683((double) arg4, arg5, (byte) -92, arg0, arg2, this, this.field10090[arg3].field3703, this.field10082);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)Lnba;", line = 44)
    public final class298 method931(int arg0, boolean arg1) {
        if (!arg1) {
            this.method4012(-39, false);
        }
        field10088++;
        return this.field10090[arg0];
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)I", line = 60)
    public final int method928(byte arg0) {
        field10086++;
        if (arg0 > -8) {
            this.method932(-0.8693417F, 67, 125, false, 68, -58);
        }
        return this.field10079;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(FIIZII)[I", line = 71)
    public final int[] method932(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg4 != -20255) {
            this.field10079 = -64;
        }
        field10085++;
        return this.method4012(arg2, false).method3678(arg1, arg5, (double) arg0, this.field10082, (byte) -91, this, this.field10090[arg2].field3703);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(IZ)Log;", line = 82)
    private final class646 method4012(int arg0, boolean arg1) {
        field10087++;
        class623 var3 = this.field10083.method1613((long) arg0, 99);
        if (var3 != null) {
            return (class646) var3;
        }
        byte[] var4 = this.field10081.method2472(arg1, arg0);
        if (var4 == null) {
            return null;
        } else {
            class646 var5 = new class646(new class244(var4));
            this.field10083.method1611((long) arg0, (byte) -122, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Loh;Loh;Loh;)V", line = 107)
    public class719(class404 arg0, class404 arg1, class404 arg2) {
        this.field10081 = arg1;
        this.field10082 = arg2;
        class244 var4 = new class244(arg0.method2481(0, 0, (byte) 114));
        this.field10079 = var4.method1476(19);
        this.field10090 = new class298[this.field10079];
        for (int var5 = 0; var5 < this.field10079; var5++) {
            if (var4.method1423(-111) == 1) {
                this.field10090[var5] = new class298();
            }
        }
        for (int var6 = 0; var6 < this.field10079; var6++) {
            if (this.field10090[var6] != null) {
                this.field10090[var6].field3694 = var4.method1423(-118) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field10079; var7++) {
            if (this.field10090[var7] != null) {
                this.field10090[var7].field3711 = var4.method1423(-58) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field10079; var8++) {
            if (this.field10090[var8] != null) {
                this.field10090[var8].field3710 = var4.method1423(-109) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field10079; var9++) {
            if (this.field10090[var9] != null) {
                this.field10090[var9].field3709 = var4.method1448((byte) -105);
            }
        }
        for (int var10 = 0; var10 < this.field10079; var10++) {
            if (this.field10090[var10] != null) {
                this.field10090[var10].field3696 = var4.method1448((byte) -91);
            }
        }
        for (int var11 = 0; var11 < this.field10079; var11++) {
            if (this.field10090[var11] != null) {
                this.field10090[var11].field3702 = var4.method1448((byte) -111);
            }
        }
        for (int var12 = 0; var12 < this.field10079; var12++) {
            if (this.field10090[var12] != null) {
                this.field10090[var12].field3695 = var4.method1448((byte) -96);
            }
        }
        for (int var13 = 0; var13 < this.field10079; var13++) {
            if (this.field10090[var13] != null) {
                this.field10090[var13].field3706 = (short) var4.method1476(104);
            }
        }
        for (int var14 = 0; var14 < this.field10079; var14++) {
            if (this.field10090[var14] != null) {
                this.field10090[var14].field3704 = var4.method1448((byte) -128);
            }
        }
        for (int var15 = 0; var15 < this.field10079; var15++) {
            if (this.field10090[var15] != null) {
                this.field10090[var15].field3699 = var4.method1448((byte) -87);
            }
        }
        for (int var16 = 0; var16 < this.field10079; var16++) {
            if (this.field10090[var16] != null) {
                this.field10090[var16].field3707 = var4.method1423(-62) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field10079; var17++) {
            if (this.field10090[var17] != null) {
                this.field10090[var17].field3703 = var4.method1423(-19) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field10079; var18++) {
            if (this.field10090[var18] != null) {
                this.field10090[var18].field3701 = var4.method1448((byte) -87);
            }
        }
        for (int var19 = 0; var19 < this.field10079; var19++) {
            if (this.field10090[var19] != null) {
                this.field10090[var19].field3716 = var4.method1423(-14) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field10079; var20++) {
            if (this.field10090[var20] != null) {
                this.field10090[var20].field3700 = var4.method1423(-80) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field10079; var21++) {
            if (this.field10090[var21] != null) {
                this.field10090[var21].field3714 = var4.method1423(-12) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field10079; var22++) {
            if (this.field10090[var22] != null) {
                this.field10090[var22].field3705 = var4.method1423(-128);
            }
        }
        for (int var23 = 0; var23 < this.field10079; var23++) {
            if (this.field10090[var23] != null) {
                this.field10090[var23].field3712 = var4.method1438(112);
            }
        }
        for (int var24 = 0; var24 < this.field10079; var24++) {
            if (this.field10090[var24] != null) {
                this.field10090[var24].field3698 = var4.method1423(-61);
            }
        }
    }
}
