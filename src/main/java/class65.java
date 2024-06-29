import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class65 {

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "[I")
    private int[] field1195;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[I")
    private int[] field1192;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lrd;")
    private class252 field1189;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Lrd;")
    private class252 field1200;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[Lrd;")
    private class252[] field1186;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field1187 = 0;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Laa;")
    public static class164 field1193 = null;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Ljd;")
    private static class85 field1198 = class221.method1499("cyan:", (byte) 87);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Ljd;")
    public static class85 field1188 = field1198;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Ljd;")
    public static class85 field1197 = field1198;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "[Lqf;")
    public static class232[] field1196;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IJ)V")
    public static final void method435(int arg0, long arg1) {
        field1194++;
        if (arg1 == 0L) {
            return;
        }
        int var3 = 24 / ((-arg0 - 3) / 54);
        for (int var4 = 0; var4 < class56.field978; var4++) {
            if (class137.field2379[var4] == arg1) {
                class56.field978--;
                for (int var5 = var4; var5 < class56.field978; var5++) {
                    class137.field2379[var5] = class137.field2379[var5 + 1];
                    class256.field4572[var5] = class256.field4572[var5 + 1];
                }
                class207.field3613 = class43.field755;
                class111.field1934++;
                class207.field3618.method483(-24260, 45);
                class207.field3618.method1674((byte) 101, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLoa;ILge;DIIZ)[I")
    public final int[] method436(boolean arg0, class96 arg1, int arg2, class68 arg3, double arg4, int arg5, int arg6, boolean arg7) {
        class185.method1277(arg4, (byte) -66);
        int[] var10 = new int[arg2 * arg5];
        class20.field283 = arg1;
        field1190++;
        class244.field4175 = arg3;
        class140.method920(-48, arg5, arg2);
        for (int var11 = 0; var11 < this.field1186.length; var11++) {
            this.field1186[var11].method1738(arg2, (byte) -113, arg5);
        }
        int var12;
        int var13;
        byte var14;
        if (arg7) {
            var12 = arg5 - 1;
            var14 = -1;
            var13 = -1;
        } else {
            var12 = 0;
            var13 = arg5;
            var14 = 1;
        }
        int var15 = arg6;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1189.field4338) {
                int[] var18 = this.field1189.method149(var16, (byte) -55);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1189.method89(var16, (byte) -123);
                var20 = var22[0];
                var21 = var22[2];
                var19 = var22[1];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = class216.field3797[var24];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class216.field3797[var25];
                int var28 = var21[var23] >> 4;
                if (var28 > 255) {
                    var28 = 255;
                }
                if (var28 < 0) {
                    var28 = 0;
                }
                int var29 = class216.field3797[var28];
                var10[var15++] = (var27 << 8) + (var26 << 16) + var29;
                if (arg0) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1186.length; var17++) {
            this.field1186[var17].method94((byte) 48);
        }
        return var10;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Loa;Lge;I)Z")
    public final boolean method437(class96 arg0, class68 arg1, int arg2) {
        field1201++;
        int var4 = 0;
        if (arg2 != 19661184) {
            return true;
        }
        while (var4 < this.field1192.length) {
            if (!arg1.method468(true, this.field1192[var4])) {
                return false;
            }
            var4++;
        }
        for (int var5 = 0; var5 < this.field1195.length; var5++) {
            if (!arg0.method686(false, this.field1195[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    public static final void method438(int arg0, int arg1) {
        field1199++;
        if (arg1 != -4734) {
            method435(63, -5L);
        }
        class266 var2;
        if (class245.field4186 == null) {
            var2 = new class266(512, 512);
        } else {
            var2 = (class266) class245.field4186;
        }
        int[] var3 = var2.field4745;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var24 = ((52736 - (var6 * 512)) * 4) + 24628;
            for (int var25 = 1; var25 < 103; var25++) {
                if ((class228.field3952[arg0][var25][var6] & 0x18) == 0) {
                    class88.method654(var3, var24, 512, arg0, var25, var6);
                }
                if (arg0 < 3 && (class228.field3952[arg0 + 1][var25][var6] & 0x8) != 0) {
                    class88.method654(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method1836();
        int var7 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) + 238 - 10;
        int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class228.field3952[arg0][var23][var9] & 0x18) == 0) {
                    class131.method878(var9, var8, arg0, var23, -25063, var7);
                }
                if (arg0 < 3 && (class228.field3952[arg0 + 1][var23][var9] & 0x8) != 0) {
                    class131.method878(var9, var8, arg0 + 1, var23, -25063, var7);
                }
            }
        }
        class162.field2786 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class95.method679(class116.field2066, var10, var11);
                if (var12 != 0L) {
                    class199 var14 = class110.method753((int) (var12 >>> 32) & Integer.MAX_VALUE, (byte) -48);
                    int var15 = var14.field3470;
                    if (var14.field3474 != null) {
                        for (int var16 = 0; var16 < var14.field3474.length; var16++) {
                            if (var14.field3474[var16] != -1) {
                                class199 var17 = class110.method753(var14.field3474[var16], (byte) 127);
                                if (var17.field3470 >= 0) {
                                    var15 = var17.field3470;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var10;
                        int var19 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var20 = class34.field529[class116.field2066].field4719;
                            for (int var21 = 0; var21 < 10; var21++) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var18 > 0 && var18 > var10 - 3 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                    var18--;
                                }
                                if (var22 == 1 && var18 < 103 && var18 < (var10 + 3) && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                    var18++;
                                }
                                if (var22 == 2 && var19 > 0 && var19 > var11 - 3 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                    var19--;
                                }
                                if (var22 == 3 && var19 < 103 && var19 < (var11 + 3) && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                    var19++;
                                }
                            }
                        }
                        class117.field2098[class162.field2786] = var14.field3420;
                        class178.field3063[class162.field2786] = var18;
                        class234.field4059[class162.field2786] = var19;
                        class162.field2786++;
                    }
                }
            }
        }
        class245.field4186 = var2;
        class230.field3972.method1511((byte) 34);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method439(byte arg0) {
        field1188 = null;
        field1197 = null;
        field1193 = null;
        if (arg0 < 67) {
            method438(11, -38);
        }
        field1198 = null;
        field1196 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class65() {
        this.field1195 = new int[0];
        this.field1192 = new int[0];
        this.field1189 = new class22();
        this.field1189.field4340 = 1;
        this.field1200 = new class22();
        this.field1186 = new class252[] { this.field1189, this.field1200 };
        this.field1200.field4340 = 1;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lik;)V")
    public class65(class247 arg0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = arg0.method1711((byte) -67);
        this.field1186 = new class252[var4];
        int[][] var5 = new int[var4][];
        for (int var6 = 0; var6 < var4; var6++) {
            class252 var16 = class114.method807(false, arg0);
            if (var16.method1004((byte) 73) >= 0) {
                var2++;
            }
            if (var16.method96(2) >= 0) {
                var3++;
            }
            int var17 = var16.field4346.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1711((byte) -67);
            }
            this.field1186[var6] = var16;
        }
        this.field1195 = new int[var3];
        this.field1192 = new int[var2];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var4; var9++) {
            class252 var11 = this.field1186[var9];
            int var12 = var11.field4346.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4346[var13] = this.field1186[var5[var9][var13]];
            }
            int var14 = var11.method1004((byte) -92);
            int var15 = var11.method96(2);
            if (var14 > 0) {
                this.field1192[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1195[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1189 = this.field1186[arg0.method1711((byte) -67)];
        Object var10 = null;
        this.field1200 = this.field1186[arg0.method1711((byte) -67)];
    }
}
