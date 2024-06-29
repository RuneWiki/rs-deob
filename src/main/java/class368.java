import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class368 implements class131 {

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lan;")
    private class20 field5556 = new class20(128);

    @OriginalMember(owner = "client!de", name = "l", descriptor = "[I")
    private int[] field5562 = new int[class255.field3670.field4781];

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
    public int[] field5552 = new int[class255.field3670.field4781];

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lpi;")
    public static class342 field5557 = new class342(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field5570 = 0;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field5569 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Lbu;")
    public static class17 field5571;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lli;")
    public static class293 field5553;

    // $FF: synthetic field
    @OriginalMember(owner = "client!de", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field5572;

    // $FF: synthetic method
    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2311(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIILno;)Ldj;", line = 3)
    public static final class227 method2300(int arg0, int arg1, int arg2, class494 arg3) {
        field5559++;
        int var4 = arg0 << 8 | arg3.field7302;
        class227 var5 = (class227) class308.field4696.method2289(-74, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class201.field2946.method140(class201.field2946.method127(-24189, var4), 1);
        if (var6 == null) {
            int var8 = arg3.field7302 | arg1 + 65536 << 8;
            class227 var9 = (class227) class308.field4696.method2289(arg2 ^ 0x6DDA, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class201.field2946.method140(class201.field2946.method127(-24189, var8), 1);
            if (var10 == null) {
                int var12 = arg3.field7302 | 0xFFFF00;
                class227 var13 = (class227) class308.field4696.method2289(-49, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class201.field2946.method140(class201.field2946.method127(-24189, var12), 1);
                if (var14 == null) {
                    if (arg2 != 28069) {
                        method2306(23, null, -13);
                    }
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class227 var15 = class260.method1687((byte) 46, var14);
                    var15.field3230 = arg3;
                    class308.field4696.method2287((long) var12 << 16, (byte) 93, var15);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class227 var11 = class260.method1687((byte) 46, var10);
                var11.field3230 = arg3;
                class308.field4696.method2287((long) var8 << 16, (byte) 118, var11);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class227 var7 = class260.method1687((byte) 46, var6);
            var7.field3230 = arg3;
            class308.field4696.method2287((long) var4 << 16, (byte) 98, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 72)
    public static final void method2301(int arg0) {
        field5558++;
        if (arg0 > -80) {
            return;
        }
        int var1 = class464.field6941.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class464.field6941[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class296.field4207; var4++) {
                    if (class381.field5776[var2] == class264.field3809[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class264.field3809[class296.field4207] = class381.field5776[var2];
                    var3 = class296.field4207++;
                }
                class145 var5 = new class145(class464.field6941[var2]);
                int var6 = 0;
                while (var5.field2289 < class464.field6941[var2].length && var6 < 511 && class510.field7529 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1069((byte) -111);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class381.field5776[var2] >> 8) * 64 + var10 - class200.field2931;
                    int var13 = (class381.field5776[var2] & 0xFF) * 64 + var11 - class403.field6059;
                    class42 var14 = class61.field1070.method502(var5.method1069((byte) -26), -95);
                    if (class34.field668[var7] == null && (var14.field756 & 0x1) > 0 && class430.field6392 == var9 && var12 >= 0 && var12 + var14.field807 < class33.field662 && var13 >= 0 && (var13 + var14.field807) < class121.field1966) {
                        class34.field668[var7] = new class255();
                        class34.field668[var7].field7669 = var7;
                        class255 var15 = class34.field668[var7];
                        class148.field2363[class510.field7529++] = var7;
                        var15.field7632 = class531.field7821;
                        var15.method1648(-77, var14);
                        var15.method3095(var15.field3677.field807, (byte) -110);
                        var15.field7638 = var15.field3677.field768 << 3;
                        if (var15.field7638 == 0) {
                            var15.method3085(0, 2090249552);
                        } else {
                            var15.method3085((var15.field3677.field747 + 4 & 0xCB000007) << 11, 2090249552);
                        }
                        var15.method1652((byte) -83, var15.method1654(98), var9, true, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)I", line = 168)
    public final int method2302(int arg0, boolean arg1) {
        if (arg0 < 20) {
            this.method2303(-3, -90, 118);
        }
        field5567++;
        long var3 = class211.method1419(12921);
        for (class92 var5 = arg1 ? (class92) this.field5556.method160((byte) -20) : (class92) this.field5556.method163(126); var5 != null; var5 = (class92) this.field5556.method163(120)) {
            if ((var5.field1574 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field1574 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field4904;
                    this.field5552[var6] = this.field5562[var6];
                    var5.method2090(-1);
                    return var6;
                }
                var5.method2090(-1);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V", line = 210)
    public final void method2303(int arg0, int arg1, int arg2) {
        field5551++;
        class416 var4 = class419.field6271.method1389(arg1, arg2 + 1403);
        int var5 = var4.field6220;
        int var6 = var4.field6209;
        int var7 = var4.field6213;
        int var8 = class417.field6239[var7 - var6];
        if (arg2 > arg0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method2310(var5, arg2 - 101, arg0 << var6 & var9 | this.field5552[var5] & ~var9);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBI)V", line = 236)
    public final void method2304(int arg0, byte arg1, int arg2) {
        this.field5562[arg2] = arg0;
        field5565++;
        if (arg1 > -69) {
            this.method2310(-6, 11, 68);
        }
        class92 var4 = (class92) this.field5556.method171((byte) 114, (long) arg2);
        if (var4 == null) {
            class92 var5 = new class92(4611686018427387905L);
            this.field5556.method166(var5, (long) arg2, 87);
        } else if (var4.field1574 != 4611686018427387905L) {
            var4.field1574 = class211.method1419(12921) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 264)
    public final void method2305(boolean arg0) {
        if (!arg0) {
            this.field5562 = null;
        }
        for (int var2 = 0; var2 < class255.field3670.field4781; var2++) {
            class300 var3 = class255.field3670.method2065(var2, -44);
            if (var3 != null && var3.field4269 == 0) {
                this.field5562[var2] = 0;
                this.field5552[var2] = 0;
            }
        }
        field5564++;
        this.field5556 = new class20(128);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)I", line = 291)
    public final int method981(int arg0, int arg1) {
        field5554++;
        if (arg0 > -56) {
            return -64;
        }
        class416 var3 = class419.field6271.method1389(arg1, 1403);
        int var4 = var3.field6220;
        int var5 = var3.field6209;
        int var6 = var3.field6213;
        int var7 = class417.field6239[var6 - var5];
        return var7 & this.field5552[var4] >> var5;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILqa;I)Z", line = 314)
    public static final boolean method2306(int arg0, class162 arg1, int arg2) {
        field5555++;
        int var3 = (class33.field662 - 104) / 2;
        int var4 = (class121.field1966 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class114.method850(var51, var6, var52, arg2, 100)) {
                        int var53 = var52;
                        if (class389.method2400(var6, var51, 2)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class95.method730(76, var53, var51, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class295.field4197 = arg1.method306(var7, 0, 512, 512, 512);
        class185.method1294(arg0 ^ arg0);
        int var9 = ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 228 | 0xC009FF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class341.field5149][class341.field5149];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class341.field5149) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class341.field5149) {
                arg1.method298(0, 0, class341.field5149 * 4, class341.field5149 * 4);
                arg1.method241(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class341.field5149; var44++) {
                        for (int var50 = 0; var50 < class341.field5149; var50++) {
                            var12[var44][var50] = class114.method850(var36 + var50, var13 + var44, var37, arg2, arg0 - 731103522);
                        }
                    }
                    class43.field829[var37].method374(0, 0, 1024, var13, var36, class341.field5149 + var13, class341.field5149 + var36, var12);
                    if (!class245.field3528) {
                        for (int var45 = -4; var45 < class341.field5149; var45++) {
                            for (int var46 = -4; var46 < class341.field5149; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var4 <= var48 && class114.method850(var48, var47, var37, arg2, 103)) {
                                    int var49 = var37;
                                    if (class389.method2400(var47, var48, 2)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class217.method1450(var48, var10, (class341.field5149 - var46) * 4 - 4, var47, var45 * 4, var49, arg1, var9, false);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class245.field3528) {
                    class268 var38 = class141.field2244[arg2];
                    for (int var39 = 0; var39 < class341.field5149; var39++) {
                        for (int var40 = 0; var40 < class341.field5149; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field3853[var41 - var38.field3862][var42 - var38.field3869];
                            if ((var43 & 0x40240000) != 0) {
                                arg1.method1200(-1713569622, 4, var39 * 4, (class341.field5149 - var40) * 4 - 4, 4, arg0 - 731103620);
                            } else if ((var43 & 0x800000) != 0) {
                                arg1.method1202(var39 * 4, -1713569622, 1, (class341.field5149 - var40) * 4 - 4, 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg1.method1197(4, var39 * 4 + 3, 116, (class341.field5149 - var40) * 4 - 4, -1713569622);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg1.method1202(var39 * 4, -1713569622, 1, (class341.field5149 - var40) * 4 + 3 - 4, 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg1.method1197(4, var39 * 4, 120, (class341.field5149 - var40) * 4 - 4, -1713569622);
                            }
                        }
                    }
                }
                arg1.method253(0, 0, class341.field5149 * 4, class341.field5149 * 4, var11, 2);
                class295.field4197.method97(((var13 - var3) * 4) + 48, -(class341.field5149 * 4) + 464 + -((-var4 + var36) * 4), class341.field5149 * 4, class341.field5149 * 4, 0, 0);
            }
        }
        arg1.method258();
        arg1.method241(-16777215);
        class511.method3061(22843);
        class146.field2335 = 0;
        class453.field6769.method2419((byte) 107);
        if (!class245.field3528) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; var21 <= (arg2 + 1) && var21 <= 3; var21++) {
                        if (class114.method850(var20, var14, var21, arg2, 112)) {
                            class248 var22 = (class248) class412.method2496(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class248) class367.method2294(var21, var14, var20, field5572 == null ? (field5572 = method2311("pa")) : field5572);
                            }
                            if (var22 == null) {
                                var22 = (class248) class310.method2028(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class248) class462.method2745(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class79 var23 = class319.field4807.method2874(var22.method17((byte) 99), -17045);
                                if (!var23.field1346 || class223.field3193) {
                                    int var24 = var23.field1397;
                                    if (var23.field1370 != null) {
                                        for (int var25 = 0; var25 < var23.field1370.length; var25++) {
                                            if (var23.field1370[var25] != -1) {
                                                class79 var26 = class319.field4807.method2874(var23.field1370[var25], -17045);
                                                if (var26.field1397 >= 0) {
                                                    var24 = var26.field1397;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class447 var28 = class160.field2479.method1812((byte) 28, var24);
                                            if (var28 != null && var28.field6685) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class141.field2244[var21].field3853;
                                            int var32 = class141.field2244[var21].field3862;
                                            int var33 = class141.field2244[var21].field3869;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var14 - 3 < var29 && (var31[var29 - (var32 + 1)][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 103 && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 104 - 1 && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class445.field6650[class146.field2335] = var23.field1318;
                                        class14.field223[class146.field2335] = var29;
                                        class468.field6971[class146.field2335] = var30;
                                        class146.field2335++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class306.field4687 != null) {
                class445.field6649.field247 = 1;
                class160.field2479.method1813((byte) -118, 64, 1024);
                for (int var15 = 0; var15 < class306.field4687.field133; var15++) {
                    int var16 = class306.field4687.field134[var15];
                    if (var16 >> 28 == class139.field2224.field6232) {
                        int var17 = ((var16 & 0xFFFFC43) >> 14) - class200.field2931;
                        int var18 = (var16 & 0x3FFF) - class403.field6059;
                        if (var17 >= 0 && var17 < class33.field662 && var18 >= 0 && class121.field1966 > var18) {
                            class453.field6769.method2417(-122, new class451(var15));
                        } else {
                            class447 var19 = class160.field2479.method1812((byte) 28, class306.field4687.field136[var15]);
                            if (var19.field6680 != null && var19.field6689 + var17 >= 0 && (var19.field6681 + var17) < class33.field662 && var19.field6692 + var18 >= 0 && class121.field1966 > var19.field6714 + var18) {
                                class453.field6769.method2417(-126, new class451(var15));
                            }
                        }
                    }
                }
                class160.field2479.method1813((byte) -118, 64, 128);
                class445.field6649.field247 = 2;
                class445.field6649.method132((byte) -1);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)I", line = 719)
    public final int method980(int arg0, int arg1) {
        if (arg1 != 17281) {
            this.method2305(true);
        }
        field5563++;
        return this.field5552[arg0];
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIII)V", line = 731)
    public static final void method2307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5560++;
        int var7 = class409.field6135;
        class227.field3240 = 0;
        int[] var8 = class358.field5445;
        for (int var9 = 0; var9 < class510.field7529 + var7; var9++) {
            class42 var33 = null;
            class517 var34;
            if (var9 < var7) {
                var34 = class183.field2747[var8[var9]];
            } else {
                var34 = class34.field668[class148.field2363[var9 - var7]];
                var33 = ((class255) var34).field3677;
                if (var33.field797 != null) {
                    var33 = var33.method427(class335.field5059, (byte) -110);
                    if (var33 == null) {
                        continue;
                    }
                }
            }
            if (var34.field7630 >= 0 && (class173.field2664 == var34.field7651 || class139.field2224.field6232 == var34.field6232)) {
                class515.method3073(arg0 >> 1, arg6, arg5 >> 1, false, var34, var34.method1645(-1), arg3);
                if (class72.field1246[0] >= 0) {
                    if (var34.field7657 != null && (var7 <= var9 || class435.field6465 == 0 || class435.field6465 == 3 || class435.field6465 == 1 && class206.method1401(0, ((class256) var34).field3684)) && class227.field3240 < class447.field6705) {
                        class447.field6672[class227.field3240] = class501.field7392.method2136(var34.field7657, 13216) / 2;
                        class447.field6682[class227.field3240] = class72.field1246[0];
                        class447.field6695[class227.field3240] = class72.field1246[1];
                        class447.field6702[class227.field3240] = var34.field7643;
                        class447.field6693[class227.field3240] = var34.field7653;
                        class447.field6708[class227.field3240] = var34.field7606;
                        class447.field6710[class227.field3240] = var34.field7657;
                        class227.field3240++;
                    }
                    int var35 = arg2 + class72.field1246[1];
                    int var46;
                    if (var34.field7608 || class531.field7821 >= var34.field7616) {
                        var46 = var35 - Math.max(class501.field7392.field5028, class228.field3248[0].method109());
                    } else {
                        boolean var36 = true;
                        byte var37 = 1;
                        int var38;
                        if (var7 <= var9) {
                            var38 = var33.field813;
                            if (var38 == -1) {
                                var38 = var34.method3094(-107).field6466;
                            }
                        } else {
                            class256 var39 = class183.field2747[var8[var9]];
                            var38 = var34.method3094(-31).field6466;
                            if (var39.field3685) {
                                var37 = 2;
                            }
                        }
                        class529[] var40 = class228.field3248;
                        if (var38 != -1) {
                            class529[] var41 = (class529[]) class226.field3221.method494(0, (long) var38);
                            if (var41 == null) {
                                class279[] var42 = class279.method1779(class151.field2407, var38, 0);
                                if (var42 != null) {
                                    var41 = new class529[var42.length];
                                    for (int var43 = 0; var43 < var42.length; var43++) {
                                        var41[var43] = class4.field109.method304(var42[var43], true);
                                    }
                                    class226.field3221.method485((long) var38, (byte) -125, var41);
                                }
                            }
                            if (var41 != null && var41.length >= 2) {
                                var40 = var41;
                            }
                        }
                        if (var37 >= var40.length) {
                            var37 = 1;
                        }
                        class529 var44 = var40[0];
                        class529 var45 = var40[var37];
                        var46 = var35 - Math.max(class501.field7392.field5028, var44.method109());
                        int var47 = class72.field1246[0] + (arg1 - (var44.method96() >> 1));
                        int var48 = var44.method96() * var34.field7652 / 255;
                        if (var34.field7652 > 0 && var48 < 2) {
                            var48 = 2;
                        }
                        var44.method3137(var47, var46);
                        class4.field109.method198(var47, var46, var47 + var48, var44.method109() + var46);
                        var45.method3137(var47, var46);
                        class4.field109.method298(arg1, arg2, arg0 + arg1, arg2 + arg5);
                    }
                    var46 -= 2;
                    if (!var34.field7608) {
                        if (class531.field7821 < var34.field7605) {
                            class529 var49 = class45.field843[var34.field7668 ? 2 : 0];
                            class529 var50 = class45.field843[var34.field7668 ? 3 : 1];
                            boolean var51 = true;
                            int var52;
                            if ((var34 instanceof class255)) {
                                var52 = var33.field784;
                                if (var52 == -1) {
                                    var52 = var34.method3094(-99).field6467;
                                }
                            } else {
                                var52 = var34.method3094(-113).field6467;
                            }
                            if (var52 != -1) {
                                class529[] var53 = (class529[]) class268.field3851.method494(0, (long) var52);
                                if (var53 == null) {
                                    class279[] var54 = class279.method1779(class151.field2407, var52, 0);
                                    if (var54 != null) {
                                        var53 = new class529[var54.length];
                                        for (int var55 = 0; var55 < var54.length; var55++) {
                                            var53[var55] = class4.field109.method304(var54[var55], true);
                                        }
                                        class268.field3851.method485((long) var52, (byte) -125, var53);
                                    }
                                }
                                if (var53 != null && var53.length == 4) {
                                    var50 = var53[var34.field7668 ? 3 : 1];
                                    var49 = var53[var34.field7668 ? 2 : 0];
                                }
                            }
                            int var56 = var34.field7605 - class531.field7821;
                            int var57;
                            if (var34.field7660 >= var56) {
                                var57 = var49.method96();
                            } else {
                                int var58 = var56 - var34.field7660;
                                int var59 = var34.field7633 == 0 ? 0 : (var34.field7609 - var58) / var34.field7633 * var34.field7633;
                                var57 = var59 * var49.method96() / var34.field7609;
                            }
                            int var60 = var49.method109();
                            var46 -= var60;
                            int var61 = arg1 - ((var49.method96() >> 1) - class72.field1246[0]);
                            var49.method3137(var61, var46);
                            class4.field109.method198(var61, var46, var57 + var61, var46 - -var60);
                            var50.method3137(var61, var46);
                            class4.field109.method298(arg1, arg2, arg0 + arg1, arg2 - -arg5);
                            var46 -= 2;
                        }
                        if (var9 < var7) {
                            class256 var63 = (class256) var34;
                            if (var63.field3689 != -1) {
                                var46 -= 25;
                                class85.field1469[var63.field3689].method3137(class72.field1246[0] + arg1 - 12, var46);
                                var46 -= 2;
                            }
                            if (var63.field3710 != -1) {
                                var46 -= 25;
                                class491.field7266[var63.field3710].method3137(class72.field1246[0] + arg1 - 12, var46);
                                var46 -= 2;
                            }
                        } else if (var33.field785 >= 0 && var33.field785 < class491.field7266.length) {
                            var46 -= 25;
                            class529 var62 = class491.field7266[var33.field785];
                            var62.method3137(class72.field1246[0] + arg1 - (var62.method96() >> 1), var46);
                            var46 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var34 instanceof class256)) {
                        int var64 = 0;
                        class128[] var65 = class45.field835;
                        for (int var66 = 0; var66 < var65.length; var66++) {
                            class128 var68 = var65[var66];
                            if (var68 != null && var68.field2038 == 1 && class148.field2363[var9 - var7] == var68.field2032) {
                                class529 var69 = class261.field3789[var68.field2033];
                                if (var64 < var69.method109()) {
                                    var64 = var69.method109();
                                }
                                if (class531.field7821 % 20 < 10) {
                                    var69.method3137(class72.field1246[0] + arg1 - 12, -var69.method109() + var46);
                                }
                            }
                        }
                        if (var64 > 0) {
                            var10000 = var46 - (var64 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var70 = 0;
                        class128[] var71 = class45.field835;
                        for (int var72 = 0; var72 < var71.length; var72++) {
                            class128 var74 = var71[var72];
                            if (var74 != null && var74.field2038 == 10 && var8[var9] == var74.field2032) {
                                class529 var75 = class261.field3789[var74.field2033];
                                if (var70 < var75.method109()) {
                                    var70 = var75.method109();
                                }
                                var75.method3137(arg1 + class72.field1246[0] - 12, var46 + -var75.method109());
                            }
                        }
                        if (var70 > 0) {
                            var10000 = var46 - (var70 + 2);
                        }
                    }
                    for (int var76 = 0; var76 < 4; var76++) {
                        if (class531.field7821 < var34.field7681[var76]) {
                            int var77 = var34.method1645(-1) / 2;
                            class515.method3073(arg0 >> 1, arg6, arg5 >> 1, false, var34, var77, arg3);
                            if (class72.field1246[0] > -1) {
                                if (var76 == 1) {
                                    class72.field1246[1] -= 20;
                                }
                                if (var76 == 2) {
                                    class72.field1246[1] -= 10;
                                    class72.field1246[0] -= 15;
                                }
                                if (var76 == 3) {
                                    class72.field1246[0] += 15;
                                    class72.field1246[1] -= 10;
                                }
                                class419.field6268[var34.field7595[var76]].method3137(arg1 + class72.field1246[0] - 12, class72.field1246[1] + -12 + arg2);
                                class328.field4954.method2900(Integer.toString(var34.field7603[var76]), -1, -117, 0, arg2 + class72.field1246[1] + 3, class72.field1246[0] + arg1 + -1);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class385.field5813; var10++) {
            int var29 = class95.field1605[var10];
            class517 var30;
            if (var29 >= 2048) {
                var30 = class34.field668[var29 - 2048];
            } else {
                var30 = class183.field2747[var29];
            }
            int var31 = class366.field5529[var10];
            class517 var32;
            if (var31 < 2048) {
                var32 = class183.field2747[var31];
            } else {
                var32 = class34.field668[var31 - 2048];
            }
            class334.method2141(arg3, --var30.field7649, arg1, var32, arg2, arg0, arg5, arg6, var30, 108);
        }
        int var11 = -67 % ((arg4 - 81) / 36);
        int var12 = class501.field7392.field5028 + class501.field7392.field5018 + 2;
        for (int var13 = 0; var13 < class227.field3240; var13++) {
            int var14 = class447.field6682[var13];
            int var15 = class447.field6695[var13];
            int var16 = class447.field6672[var13];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var28 = 0; var28 < var13; var28++) {
                    if (var15 + 2 > class447.field6695[var28] + -var12 && class447.field6695[var28] + 2 > -var12 + var15 && class447.field6682[var28] + class447.field6672[var28] > -var16 + var14 && var14 + var16 > class447.field6682[var28] + -class447.field6672[var28] && var15 > class447.field6695[var28] - var12) {
                        var17 = true;
                        var15 = class447.field6695[var28] - var12;
                    }
                }
            }
            class447.field6695[var13] = var15;
            String var18 = class447.field6710[var13];
            if (class483.field7194 == 0) {
                int var19 = 16776960;
                if (class447.field6702[var13] < 6) {
                    var19 = class413.field6172[class447.field6702[var13]];
                }
                if (class447.field6702[var13] == 6) {
                    var19 = class173.field2664 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class447.field6702[var13] == 7) {
                    var19 = (class173.field2664 % 20) < 10 ? 255 : 65535;
                }
                if (class447.field6702[var13] == 8) {
                    var19 = (class173.field2664 % 20) < 10 ? 45056 : 8454016;
                }
                if (class447.field6702[var13] == 9) {
                    int var20 = 150 - class447.field6708[var13];
                    if (var20 < 50) {
                        var19 = (var20 * 1280) + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 + 16384000 - (var20 * 327680);
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (class447.field6702[var13] == 10) {
                    int var21 = 150 - class447.field6708[var13];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16384000 + 16711935 - var21 * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 + 500 - (var21 * 5);
                    }
                }
                if (class447.field6702[var13] == 11) {
                    int var22 = 150 - class447.field6708[var13];
                    if (var22 < 50) {
                        var19 = 16777215 - (var22 * 327685);
                    } else if (var22 < 100) {
                        var19 = ((var22 - 50) * 327685) + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - ((var22 - 100) * 327680);
                    }
                }
                int var23 = var19 | 0xFF000000;
                if (class447.field6693[var13] == 0) {
                    class310.field4726.method2900(var18, var23, -59, -16777216, arg2 + var15, arg1 - -var14);
                }
                if (class447.field6693[var13] == 1) {
                    class310.field4726.method2898(0, var18, class173.field2664, arg2 + var15, var23, arg1 + var14, -16777216);
                }
                if (class447.field6693[var13] == 2) {
                    class310.field4726.method2904(var23, -16777216, arg2 + var15, var18, arg1 + var14, class173.field2664, 0);
                }
                if (class447.field6693[var13] == 3) {
                    class310.field4726.method2899(arg2 + var15, 0, class173.field2664, -16777216, var23, arg1 + var14, -class447.field6708[var13] + 150, var18);
                }
                if (class447.field6693[var13] == 4) {
                    int var24 = (150 - class447.field6708[var13]) * (class501.field7392.method2136(var18, 13216) + 100) / 150;
                    class4.field109.method198(arg1 + var14 - 50, arg2, arg1 + var14 + 50, arg2 + arg5);
                    class310.field4726.method2913(-16777216, var18, -60, var23, arg1 + var14 + (50 - var24), arg2 + var15);
                    class4.field109.method298(arg1, arg2, arg0 + arg1, arg2 - -arg5);
                }
                if (class447.field6693[var13] == 5) {
                    int var25 = 150 - class447.field6708[var13];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    int var27 = class501.field7392.field5028 + class501.field7392.field5018;
                    class4.field109.method198(arg1, arg2 + var15 - var27 - 1, arg1 - -arg0, var15 + arg2 + 5);
                    class310.field4726.method2900(var18, var23, -105, -16777216, arg2 + var15 + var26, arg1 - -var14);
                    class4.field109.method298(arg1, arg2, arg0 + arg1, arg2 + arg5);
                }
            } else {
                class310.field4726.method2900(var18, -256, -50, -16777216, arg2 + var15, arg1 + var14);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V", line = 1308)
    public static void method2308(boolean arg0) {
        field5557 = null;
        field5571 = null;
        if (arg0) {
            field5553 = null;
        }
        field5553 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(III)V", line = 1338)
    public final void method2309(int arg0, int arg1, int arg2) {
        field5561++;
        class416 var4 = class419.field6271.method1389(arg1, arg0 + 1404);
        int var5 = var4.field6220;
        int var6 = var4.field6209;
        int var7 = var4.field6213;
        int var8 = class417.field6239[var7 - var6];
        if (arg0 < ~arg2 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2304(this.field5562[var5] & ~var9 | var9 & arg2 << var6, (byte) -126, var5);
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(III)V", line = 1368)
    public final void method2310(int arg0, int arg1, int arg2) {
        field5566++;
        this.field5552[arg0] = arg2;
        class92 var4 = (class92) this.field5556.method171((byte) 11, (long) arg0);
        if (arg1 != -101) {
            return;
        }
        if (var4 == null) {
            class92 var5 = new class92(class211.method1419(arg1 + 13022) + 500L);
            this.field5556.method166(var5, (long) arg0, -74);
        } else {
            var4.field1574 = class211.method1419(arg1 ^ 0xFFFFCDE2) + 500L;
        }
    }
}
