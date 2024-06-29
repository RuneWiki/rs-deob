import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class152 {

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "[I")
    private int[] field2628;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "[I")
    private int[] field2623;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Lp;")
    public static class280 field2622 = class18.method140((byte) -125, "Number of player models in cache:");

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2636 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    private int field2621;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    private int field2632;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    private int field2633;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    private int field2634;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Luc;")
    public static class38 field2629;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IJ)Lp;")
    public static final class280 method1071(int arg0, long arg1) {
        field2624++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var9 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class14.field273[(int) (var9 - (arg1 * 37L))];
            }
            class280 var7 = new class280();
            var7.field4907 = var6;
            int var8 = -110 / ((arg0 - 1) / 63);
            var7.field4908 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I")
    public final int method1072(int arg0) {
        if (this.field2621-- == 0) {
            this.method1073(128);
            this.field2621 = 255;
        }
        if (arg0 > -55) {
            return 30;
        } else {
            field2627++;
            return this.field2623[this.field2621];
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    private final void method1073(int arg0) {
        this.field2632 += ++this.field2634;
        if (arg0 != 128) {
            this.field2623 = null;
        }
        field2630++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2628[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2633 ^= this.field2633 << 13;
                } else {
                    this.field2633 ^= this.field2633 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2633 ^= this.field2633 << 2;
            } else {
                this.field2633 ^= this.field2633 >>> 16;
            }
            this.field2633 += this.field2628[var2 + 128 & 0xFF];
            int var4;
            this.field2628[var2] = var4 = this.field2632 + this.field2628[class214.method1432(var3 >> 2, 255)] + this.field2633;
            this.field2623[var2] = this.field2632 = this.field2628[class214.method1432(1020, var4 >> 8) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    private final void method1074(int arg0) {
        if (arg0 != -12842) {
            return;
        }
        field2626++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var3 + var6;
            int var72 = var69 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var71 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2623[var11 + 1] + var8;
            int var38 = this.field2623[var11 + 2] + var7;
            int var39 = this.field2623[var11] + var9;
            int var40 = this.field2623[var11 + 3] + var6;
            int var41 = this.field2623[var11 + 6] + var3;
            int var42 = this.field2623[var11 + 4] + var5;
            int var43 = this.field2623[var11 + 7] + var2;
            int var44 = this.field2623[var11 + 5] + var4;
            int var45 = var39 ^ var37 << 11;
            int var46 = var37 + var38;
            int var47 = var40 + var45;
            int var48 = var46 ^ var38 >>> 2;
            int var49 = var42 + var48;
            int var50 = var38 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var47 + var49;
            var6 = var52 ^ var49 >>> 16;
            int var53 = var44 + var51;
            int var54 = var49 + var53;
            int var55 = var6 + var41;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var43;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var59 = var4 + var45;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field2628[var11] = var9;
            this.field2628[var11 + 1] = var8;
            this.field2628[var11 + 2] = var7;
            this.field2628[var11 + 3] = var6;
            this.field2628[var11 + 4] = var5;
            this.field2628[var11 + 5] = var4;
            this.field2628[var11 + 6] = var3;
            this.field2628[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2628[var12 + 4] + var5;
            int var14 = this.field2628[var12 + 1] + var8;
            int var15 = this.field2628[var12] + var9;
            int var16 = this.field2628[var12 + 6] + var3;
            int var17 = this.field2628[var12 + 2] + var7;
            int var18 = this.field2628[var12 + 7] + var2;
            int var19 = this.field2628[var12 + 5] + var4;
            int var20 = this.field2628[var12 + 3] + var6;
            int var21 = var15 ^ var14 << 11;
            int var22 = var14 + var17;
            int var23 = var20 + var21;
            int var24 = var22 ^ var17 >>> 2;
            int var25 = var13 + var24;
            int var26 = var17 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var19 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var5 + var18;
            int var32 = var6 + var16;
            int var33 = var28 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var31 << 8;
            int var36 = var31 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var8 = var3 + var24;
            var9 = var8 + var34;
            this.field2628[var12] = var9;
            this.field2628[var12 + 1] = var8;
            this.field2628[var12 + 2] = var7;
            this.field2628[var12 + 3] = var6;
            this.field2628[var12 + 4] = var5;
            this.field2628[var12 + 5] = var4;
            this.field2628[var12 + 6] = var3;
            this.field2628[var12 + 7] = var2;
        }
        this.method1073(128);
        this.field2621 = 256;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILtg;ZZLtg;)Lv;")
    public static final class149 method1075(int arg0, class180 arg1, boolean arg2, boolean arg3, class180 arg4) {
        boolean var5 = true;
        if (arg2) {
            field2622 = null;
        }
        field2635++;
        int[] var6 = arg4.method1237(arg0, -1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method1243(var6[var7], arg0, -22272);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg1.method1243(var9, 0, -22272);
                } else {
                    var10 = arg1.method1243(0, var9, -22272);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class149(arg4, arg1, arg0, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
    public static void method1076(int arg0) {
        field2629 = null;
        field2636 = null;
        field2622 = null;
        int var1 = 120 % ((-arg0 - 28) / 59);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)I")
    public static final int method1077(int arg0, int arg1) {
        field2631++;
        if (arg0 < 28) {
            method1078(-22);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
    public static final void method1078(int arg0) {
        if (arg0 != -21306) {
            field2638 = -29;
        }
        field2620++;
        class212.field3654.method1481(false);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    private class152() {
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([I)V")
    public class152(int[] arg0) {
        this.field2628 = new int[256];
        this.field2623 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2623[var2] = arg0[var2];
        }
        this.method1074(-12842);
    }
}
