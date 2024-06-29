import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class74 extends class51 {

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    private int field1463 = 1;

    @OriginalMember(owner = "client!i", name = "hb", descriptor = "I")
    private int field1470 = 1;

    @OriginalMember(owner = "client!i", name = "eb", descriptor = "Led;")
    private static class43 field1467 = class191.method1219("Loaded title screen", false);

    @OriginalMember(owner = "client!i", name = "lb", descriptor = "I")
    public static int field1474 = 0;

    @OriginalMember(owner = "client!i", name = "kb", descriptor = "Led;")
    public static class43 field1473 = class191.method1219("Update)2Liste geladen)3", false);

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "Led;")
    public static class43 field1464 = field1467;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!i", name = "db", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!i", name = "fb", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!i", name = "gb", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!i", name = "ib", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!i", name = "jb", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!i", name = "mb", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!i", name = "nb", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "Lga;")
    public static class58 field1465;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLob;)V")
    public static final void method458(byte arg0, class129 arg1) {
        if (arg0 != 18) {
            field1471 = 76;
        }
        ++field1469;
        int var2 = arg1.field2646;
        if (~var2 == -325) {
            if (class98.field1897 == -1) {
                class9.field170 = arg1.field2696;
                class98.field1897 = arg1.field2623;
            }
            if (class5.field103.field1495) {
                arg1.field2623 = class98.field1897;
            } else {
                arg1.field2623 = class9.field170;
            }
        } else if (~var2 == -326) {
            if (~class98.field1897 == 0) {
                class98.field1897 = arg1.field2623;
                class9.field170 = arg1.field2696;
            }
            if (!class5.field103.field1495) {
                arg1.field2623 = class98.field1897;
            } else {
                arg1.field2623 = class9.field170;
            }
        } else if (~var2 == -328) {
            arg1.field2592 = 150;
            arg1.field2591 = 2047 & (int) (Math.sin((double) client.field559 / 40.0D) * 256.0D);
            arg1.field2635 = 5;
            arg1.field2604 = -1;
        } else if (var2 == 328) {
            if (class67.field1348.field23 == null) {
                arg1.field2604 = 0;
            } else {
                arg1.field2592 = 150;
                arg1.field2591 = 2047 & (int) (256.0D * Math.sin((double) client.field559 / 40.0D));
                arg1.field2635 = 5;
                arg1.field2604 = 2047 + ((int) class67.field1348.field23.method249(-48) << 11);
                arg1.field2589 = class67.field1348.field2346;
                arg1.field2586 = class67.field1348.field2344;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        if (arg1 != -94) {
            this.field1463 = 60;
        }
        ++field1475;
        int[][] var3 = super.field1027.method1087(arg0, -2);
        if (super.field1027.field3428) {
            int var4 = this.field1470 - (-this.field1470 + -1);
            int[][][] var5 = new int[var4][][];
            int var6 = this.field1463 + this.field1463 - -1;
            for (int var7 = arg0 - this.field1470; ~var7 >= ~(this.field1470 + arg0); ++var7) {
                int[][] var17 = this.method306(0, var7 & class71.field1407, 0);
                int[][] var18 = new int[3][class122.field2442];
                int var19 = 0;
                int var20 = 0;
                int[] var21 = var17[0];
                int var22 = 0;
                int[] var23 = var17[1];
                int[] var24 = var17[2];
                for (int var25 = -this.field1463; ~this.field1463 <= ~var25; ++var25) {
                    int var35 = var25 & class108.field2080;
                    var20 += var21[var35];
                    var22 += var23[var35];
                    var19 += var24[var35];
                }
                int[] var26 = var18[1];
                int[] var27 = var18[0];
                int[] var28 = var18[2];
                int var29 = 0;
                while (var29 < class122.field2442) {
                    var27[var29] = var20 / var6;
                    var26[var29] = var22 / var6;
                    var28[var29] = var19 / var6;
                    int var30 = var29 - this.field1463 & class108.field2080;
                    int var31 = var22 - var23[var30];
                    int var32 = var20 - var21[var30];
                    ++var29;
                    int var33 = var19 - var24[var30];
                    int var34 = this.field1463 + var29 & class108.field2080;
                    var20 = var21[var34] + var32;
                    var22 = var23[var34] + var31;
                    var19 = var24[var34] + var33;
                }
                var5[-arg0 + this.field1470 + var7] = var18;
            }
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class122.field2442 > var11; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; ~var15 > ~var4; ++var15) {
                    int[][] var16 = var5[var15];
                    var13 += var16[1][var11];
                    var14 += var16[2][var11];
                    var12 += var16[0][var11];
                }
                var8[var11] = var12 / var4;
                var9[var11] = var13 / var4;
                var10[var11] = var14 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
    public static void method459(int arg0) {
        field1473 = null;
        if (arg0 != 28031) {
            field1464 = null;
        }
        field1467 = null;
        field1465 = null;
        field1464 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field1029 = arg0.method538((byte) 76) == 1;
                }
            } else {
                this.field1470 = arg0.method538((byte) -62);
            }
        } else {
            this.field1463 = arg0.method538((byte) -44);
        }
        if (arg1 != 0) {
            field1474 = -15;
        }
        ++field1466;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BZ)V")
    public static final void method460(byte arg0, boolean arg1) {
        ++field1476;
        if (arg0 > -61) {
            field1467 = null;
        }
        if (client.field542 != null) {
            try {
                class89 var2 = new class89(4);
                var2.method539(arg1 ? 2 : 3, 27678);
                var2.method549(0, (byte) 91);
                client.field542.method524(var2.field1769, 4, (byte) 58, 0);
            } catch (IOException var4) {
                try {
                    client.field542.method522(-23002);
                } catch (Exception var3) {
                }
                client.field542 = null;
                ++class51.field1024;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field1472;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int var4 = this.field1470 - -this.field1470 + 1;
            int[][] var5 = new int[var4][];
            int var6 = this.field1463 + 1 - -this.field1463;
            for (int var7 = -this.field1470 + arg1; this.field1470 + arg1 >= var7; ++var7) {
                int[] var11 = this.method314(0, (byte) -76, var7 & class71.field1407);
                int[] var12 = new int[class122.field2442];
                int var13 = 0;
                for (int var14 = -this.field1463; ~var14 >= ~this.field1463; ++var14) {
                    var13 += var11[class108.field2080 & var14];
                }
                int var15 = 0;
                while (~class122.field2442 < ~var15) {
                    var12[var15] = var13 / var6;
                    int var16 = var13 - var11[-this.field1463 + var15 & class108.field2080];
                    ++var15;
                    var13 = var11[class108.field2080 & this.field1463 + var15] + var16;
                }
                var5[this.field1470 + var7 + -arg1] = var12;
            }
            for (int var8 = 0; ~var8 > ~class122.field2442; ++var8) {
                int var9 = 0;
                for (int var10 = 0; var10 < var4; ++var10) {
                    var9 += var5[var10][var8];
                }
                var3[var8] = var9 / var4;
            }
        }
        if (arg0 != 16) {
            field1467 = null;
        }
        return var3;
    }
}
