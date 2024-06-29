import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class394 implements class472 {

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "Luj;")
    private class574 field5898 = new class574(256);

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "Lgp;")
    private class561 field5896;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "Lgp;")
    private class561 field5907;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    private int field5897;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "[Lsm;")
    private class576[] field5906;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "Luaa;")
    public static class395 field5904 = new class395(8);

    @OriginalMember(owner = "client!wba", name = "r", descriptor = "[I")
    public static int[] field5912 = new int[5];

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "Lgp;")
    public static class561 field5908;

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "Lhaa;")
    public static class77 field5911;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V", line = 4)
    public static void method2384(byte arg0) {
        field5911 = null;
        field5912 = null;
        if (arg0 == -76) {
            field5904 = null;
            field5908 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(FIZIZI)[I", line = 19)
    public final int[] method2385(float arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        field5903++;
        if (!arg4) {
            this.method2387((byte) 62, -101);
        }
        return this.method2386(arg3, 0).method3503((double) arg0, arg1, 119, this, this.field5906[arg3].field8211, this.field5907, arg5);
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)Ltg;", line = 30)
    private final class621 method2386(int arg0, int arg1) {
        field5900++;
        class443 var3 = this.field5898.method3286(-91, (long) arg0);
        if (var3 != null) {
            return (class621) var3;
        }
        byte[] var4 = this.field5896.method3177(arg1, arg0);
        if (var4 == null) {
            return null;
        } else {
            class621 var5 = new class621(new class268(var4));
            this.field5898.method3287(0, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)Lsm;", line = 55)
    public final class576 method2387(byte arg0, int arg1) {
        field5895++;
        if (arg0 <= 126) {
            this.method2389(119, 65);
        }
        return this.field5906[arg1];
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIZIFB)[I", line = 72)
    public final int[] method2388(int arg0, int arg1, boolean arg2, int arg3, float arg4, byte arg5) {
        if (arg5 == -64) {
            field5899++;
            return this.method2386(arg3, 0).method3505((double) arg4, arg1, arg0, arg2, -1, this.field5907, this, this.field5906[arg3].field8211);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)Z", line = 83)
    public final boolean method2389(int arg0, int arg1) {
        field5902++;
        if (arg0 >= -13) {
            this.method2388(12, -104, false, -39, -0.433821F, (byte) 61);
        }
        class621 var3 = this.method2386(arg1, 0);
        return var3 != null && var3.method3507(26002, this, this.field5907);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IB)V", line = 105)
    public static final void method2390(int arg0, byte arg1) {
        field5901++;
        int var2 = class310.field4553 - class561.field8026;
        if (var2 >= 100) {
            class377.field5547 = 1;
            return;
        }
        int var3 = (int) class181.field2622;
        if (arg1 < 57) {
            field5912 = null;
        }
        if (var3 < (class32.field436 >> 8)) {
            var3 = class32.field436 >> 8;
        }
        if (class574.field8178[4] && (class362.field5147[4] + 128) > var3) {
            var3 = class362.field5147[4] + 128;
        }
        int var4 = (int) class523.field7256 + class105.field1760 & 0x3FFF;
        class301.method1880(class372.field5377, arg0, true, var4, class355.method2160(class644.field9367.field5108, class644.field9367.field5109, class545.field7583, (byte) 103) - 50, class8.field81, (var3 >> 3) * 3 + 600 << 0, var3);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class217.field3284 = (int) ((float) (class217.field3284 - class216.field3264) * var5 + (float) class216.field3264);
        class216.field3274 = (int) ((float) (class216.field3274 - class95.field1675) * var5 + (float) class95.field1675);
        class448.field6535 = (int) ((float) (class448.field6535 - class548.field7622) * var5 + (float) class548.field7622);
        class545.field7584 = (int) ((float) (class545.field7584 - class141.field2212) * var5 + (float) class141.field2212);
        int var6 = class265.field3862 - class134.field2162;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class265.field3862 = (int) ((float) var6 * var5 + (float) class134.field2162);
        class265.field3862 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)I", line = 152)
    public final int method2391(int arg0) {
        field5909++;
        return arg0 <= 89 ? -31 : this.field5897;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(FIIIZI)[F", line = 164)
    public final float[] method2392(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field5905++;
        return arg3 == 2995 ? this.method2386(arg2, arg3 - 2995).method3508(this, this.field5907, this.field5906[arg2].field8211, 79, arg5, arg1) : null;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lgp;Lgp;Lgp;)V", line = 182)
    public class394(class561 arg0, class561 arg1, class561 arg2) {
        this.field5896 = arg1;
        this.field5907 = arg2;
        class268 var4 = new class268(arg0.method3175(0, (byte) -53, 0));
        this.field5897 = var4.method1745(32132);
        this.field5906 = new class576[this.field5897];
        for (int var5 = 0; var5 < this.field5897; var5++) {
            if (var4.method1738(255) == 1) {
                this.field5906[var5] = new class576();
            }
        }
        for (int var6 = 0; var6 < this.field5897; var6++) {
            if (this.field5906[var6] != null) {
                this.field5906[var6].field8222 = var4.method1738(255) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field5897; var7++) {
            if (this.field5906[var7] != null) {
                this.field5906[var7].field8213 = var4.method1738(255) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field5897; var8++) {
            if (this.field5906[var8] != null) {
                this.field5906[var8].field8205 = var4.method1738(255) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field5897; var9++) {
            if (this.field5906[var9] != null) {
                this.field5906[var9].field8204 = var4.method1738(255) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field5897; var10++) {
            if (this.field5906[var10] != null) {
                this.field5906[var10].field8216 = var4.method1714(-31536);
            }
        }
        for (int var11 = 0; var11 < this.field5897; var11++) {
            if (this.field5906[var11] != null) {
                this.field5906[var11].field8212 = var4.method1714(-31536);
            }
        }
        for (int var12 = 0; var12 < this.field5897; var12++) {
            if (this.field5906[var12] != null) {
                this.field5906[var12].field8203 = var4.method1714(-31536);
            }
        }
        for (int var13 = 0; var13 < this.field5897; var13++) {
            if (this.field5906[var13] != null) {
                this.field5906[var13].field8206 = var4.method1714(-31536);
            }
        }
        for (int var14 = 0; var14 < this.field5897; var14++) {
            if (this.field5906[var14] != null) {
                this.field5906[var14].field8209 = (short) var4.method1745(32132);
            }
        }
        for (int var15 = 0; var15 < this.field5897; var15++) {
            if (this.field5906[var15] != null) {
                this.field5906[var15].field8215 = var4.method1714(-31536);
            }
        }
        for (int var16 = 0; var16 < this.field5897; var16++) {
            if (this.field5906[var16] != null) {
                this.field5906[var16].field8214 = var4.method1714(-31536);
            }
        }
        for (int var17 = 0; var17 < this.field5897; var17++) {
            if (this.field5906[var17] != null) {
                this.field5906[var17].field8219 = var4.method1738(255) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field5897; var18++) {
            if (this.field5906[var18] != null) {
                this.field5906[var18].field8211 = var4.method1738(255) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field5897; var19++) {
            if (this.field5906[var19] != null) {
                this.field5906[var19].field8201 = var4.method1714(-31536);
            }
        }
        for (int var20 = 0; var20 < this.field5897; var20++) {
            if (this.field5906[var20] != null) {
                this.field5906[var20].field8207 = var4.method1738(255) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field5897; var21++) {
            if (this.field5906[var21] != null) {
                this.field5906[var21].field8218 = var4.method1738(255) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field5897; var22++) {
            if (this.field5906[var22] != null) {
                this.field5906[var22].field8221 = var4.method1738(255) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field5897; var23++) {
            if (this.field5906[var23] != null) {
                this.field5906[var23].field8220 = var4.method1738(255);
            }
        }
        for (int var24 = 0; var24 < this.field5897; var24++) {
            if (this.field5906[var24] != null) {
                this.field5906[var24].field8210 = var4.method1748(-88);
            }
        }
        for (int var25 = 0; var25 < this.field5897; var25++) {
            if (this.field5906[var25] != null) {
                this.field5906[var25].field8217 = var4.method1738(255) == 1;
            }
        }
    }
}
