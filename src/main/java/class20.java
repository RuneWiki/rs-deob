import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class20 {

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "[I")
    private int[] field267;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "[I")
    private int[] field270;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[B")
    private byte[] field258;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Ltl;")
    public static class59 field262 = class85.method639("gleiten:", 9588);

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Ls;")
    public static class170 field264 = new class170(new byte[5000]);

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Ltl;")
    public static class59 field274 = class85.method639("name_icons", 9588);

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field273 = 2301979;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Ltl;")
    private static class59 field275 = class85.method639(" is already on your friend list)3", 9588);

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Ltl;")
    public static class59 field272 = field275;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BII[BBI)I", line = 9)
    public final int method131(byte[] arg0, int arg1, int arg2, byte[] arg3, byte arg4, int arg5) {
        if (arg4 <= 118) {
            return -77;
        }
        int var7 = arg2 << 3;
        field269++;
        int var8 = arg1 + arg5;
        int var9 = 0;
        while (arg1 < var8) {
            int var10 = arg0[arg1] & 0xFF;
            byte var11 = this.field258[var10];
            int var12 = this.field267[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var7 >> 3;
            int var14 = var7 & 0x7;
            var7 += var11;
            int var15 = (var11 + var14 - 1 >> 3) + var13;
            int var16 = var9 & -var14 >> 31;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var9 = class239.method1677(var16, var12 >>> var17));
            if (var15 > var13) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var9 = var12 >>> var14);
                if (var15 > var13) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var9 = var12 >>> var14);
                    if (var13 < var15) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var9 = var12 >>> var14);
                        if (var13 < var15) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var7 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[BIII[B)I", line = 80)
    public final int method132(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field260++;
        if (arg2 == arg4) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg3 + arg4;
        int var9 = arg0;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field270[var7];
            }
            int var11;
            if ((var11 = this.field270[var7]) < 0) {
                arg1[arg3++] = (byte) (~var11);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field270[var7];
            }
            int var12;
            if ((var12 = this.field270[var7]) < 0) {
                arg1[arg3++] = (byte) (~var12);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field270[var7];
            }
            int var13;
            if ((var13 = this.field270[var7]) < 0) {
                arg1[arg3++] = (byte) (~var13);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field270[var7];
            }
            int var14;
            if ((var14 = this.field270[var7]) < 0) {
                arg1[arg3++] = (byte) (~var14);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field270[var7];
            }
            int var15;
            if ((var15 = this.field270[var7]) < 0) {
                arg1[arg3++] = (byte) (~var15);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field270[var7];
            }
            int var16;
            if ((var16 = this.field270[var7]) < 0) {
                arg1[arg3++] = (byte) (~var16);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field270[var7];
            }
            int var17;
            if ((var17 = this.field270[var7]) < 0) {
                arg1[arg3++] = (byte) (~var17);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field270[var7];
            }
            int var18;
            if ((var18 = this.field270[var7]) < 0) {
                arg1[arg3++] = (byte) (~var18);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V", line = 224)
    public static final void method133(byte arg0, int arg1) {
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        field261++;
        class39.field595 += arg1 * 128;
        if (class39.field595 > class29.field377.length) {
            class39.field595 -= class29.field377.length;
            int var3 = (int) (Math.random() * 12.0D);
            class171.method1266((byte) 115, class198.field3273[var3]);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        if (arg0 != 120) {
            field264 = (class170) null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class156.field2557[var4 + var5] - (class29.field377[class39.field595 + var4 & class29.field377.length + -1] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class156.field2557[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class156.field2557[var10 + var11] = 255;
                } else {
                    class156.field2557[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg1; var13++) {
            class169.field2727[var13] = class169.field2727[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class169.field2727[var14] = (int) (Math.sin((double) class98.field1578 / 14.0D) * 16.0D + Math.sin((double) class98.field1578 / 15.0D) * 14.0D + Math.sin((double) class98.field1578 / 16.0D) * 12.0D);
            class98.field1578++;
        }
        class72.field1121 += arg1;
        int var15 = (arg1 + (class30.field420 & 0x1)) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class72.field1121; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class156.field2557[var17 + (var18 << 7)] = 192;
        }
        class72.field1121 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var22 + var15 < 128) {
                    var20 += class156.field2557[var21 + var22 + var15];
                }
                if ((var22 - var15 - 1) >= 0) {
                    var20 -= class156.field2557[var22 + var21 + (-1 - var15)];
                }
                if (var22 >= 0) {
                    class73.field1170[var22 + var21] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if ((var15 + var25) < var2) {
                    var24 += class73.field1170[var15 * 128 + var23 + var26];
                }
                if ((var25 - var15 - 1) >= 0) {
                    var24 -= class73.field1170[var23 + var26 - (var15 * 128) - 128];
                }
                if (var25 >= 0) {
                    class156.field2557[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Lnk;", line = 397)
    public static final class195 method134(int arg0) {
        field266++;
        try {
            int var1 = -76 / ((arg0 + 40) / 63);
            return (class195) Class.forName("wj").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V", line = 411)
    public static final void method135(boolean arg0, int arg1) {
        if (arg1 != 14304) {
            field262 = (class59) null;
        }
        field263++;
        class199.field3298 = arg0;
        class293.field4997 = !class125.method922((byte) 77);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZB)V", line = 424)
    public static final void method136(boolean arg0, byte arg1) {
        field265++;
        if (arg0) {
            if (class262.field4364 != -1) {
                class16.method105(class262.field4364, true);
            }
            for (class297 var2 = (class297) class190.field3181.method692(arg1 - 46); var2 != null; var2 = (class297) class190.field3181.method693((byte) 106)) {
                class151.method1090(var2, 98, true);
            }
            class262.field4364 = -1;
            class190.field3181 = new class94(8);
            class316.method2177(arg1 + 23274);
            class262.field4364 = class21.field276;
            class40.method261((byte) -13, false);
            class179.method1322(-47);
            class243.method1727(class262.field4364, 4387);
        }
        class286.field4920 = new class102();
        class286.field4920.field1769 = 3000;
        class286.field4920.field1774 = 3000;
        if (class55.field815) {
            if (class266.field4585 == 2) {
                class216.field3528 = class222.field3607 << 7;
                class226.field3640 = class88.field1381 << 7;
            } else {
                class10.method76(-1);
            }
            class255.method1779(-12843);
            class227.method1562(true);
            class286.method1996(arg1 ^ 0x75D1, 28);
        } else {
            class37.method247(0, class34.field502);
            class286.method1996(30143, 10);
        }
        if (arg1 != 110) {
            method138(true);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[J[I)V", line = 488)
    public static final void method137(int arg0, long[] arg1, int[] arg2) {
        field268++;
        class234.method1645(arg1.length - 1, arg1, arg2, 83, 0);
        if (arg0 != 19085) {
            method136(true, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 500)
    public static void method138(boolean arg0) {
        field274 = null;
        field272 = null;
        if (!arg0) {
            method135(true, -19);
        }
        field275 = null;
        field262 = null;
        field264 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JB)V", line = 524)
    public static final void method139(long arg0, byte arg1) {
        field271++;
        if (arg1 != -99 || arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class156.field2548; var3++) {
            if (class305.field5166[var3] == arg0) {
                class77.field1225++;
                class156.field2548--;
                for (int var4 = var3; var4 < class156.field2548; var4++) {
                    class305.field5166[var4] = class305.field5166[var4 + 1];
                    class232.field3814[var4] = class232.field3814[var4 + 1];
                }
                class154.field2520 = class180.field3007;
                class234.field3888.method1768(true, 168);
                class234.field3888.method1206(arg0, false);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "([B)V", line = 568)
    public class20(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field267 = new int[var2];
        this.field270 = new int[8];
        int var4 = 0;
        this.field258 = arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field267[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class239.method1677(var10, var11);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field270[var14] == 0) {
                            this.field270[var14] = var4;
                        }
                        var14 = this.field270[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field270.length) {
                        int[] var18 = new int[this.field270.length * 2];
                        for (int var19 = 0; var19 < this.field270.length; var19++) {
                            var18[var19] = this.field270[var19];
                        }
                        this.field270 = var18;
                    }
                }
                this.field270[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
