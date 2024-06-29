import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class11 extends class344 {

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "[I")
    private int[] field261 = new int[this.field5339];

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "J")
    public static long field243 = 0L;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field252 = 0;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field254 = 0;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "Ljava/lang/String;")
    public static String field257 = "Please remove ";

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field260 = 0;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "[I")
    public static int[] field250 = new int[100];

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "Lpk;")
    public static class120 field253;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "[B")
    private byte[] field263;

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIF)V", line = 5)
    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field5339; var7++) {
            this.field261[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)Lc;", line = 24)
    public static final class321 method155(int arg0, boolean arg1) {
        if (arg1) {
            method165(-43);
        }
        field244++;
        class321 var2 = (class321) class30.field471.method2288((long) arg0, (byte) 125);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class147.field2408.method967(33, arg0, 65280);
        class321 var4 = new class321();
        if (var3 != null) {
            var4.method2261(new class1(var3), arg0, (byte) -88);
        }
        class30.field471.method2281(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V", line = 55)
    public void method156(int arg0, byte arg1) {
        field258++;
        this.field263[this.field249++] = (byte) (class164.method1234(127, arg1 >> 1) + 127);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III[[[BIBII)V", line = 62)
    public static final void method157(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class266.field4024++;
        class26.field432 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class200.field3059; var12 < class343.field5331; var12++) {
            class42[][] var13 = class34.field521[var12];
            for (int var14 = class345.field5356; var14 < class191.field2986; var14++) {
                for (int var15 = class151.field2492; var15 < class6.field130; var15++) {
                    class42 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class142.field2296[var14 + class77.field1214 - class50.field762][var15 + class77.field1214 - class122.field1992] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field653 = true;
                            var16.field648 = true;
                            if (var16.field672 > 0) {
                                var16.field667 = true;
                            } else {
                                var16.field667 = false;
                            }
                            class26.field432++;
                        } else {
                            var16.field653 = false;
                            var16.field648 = false;
                            var16.field662 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field665 != null) {
                                    class105 var17 = var16.field665;
                                    var17.field1723.method111(0, var12, var17.field1726, var17.field1727, var17.field1725);
                                    if (var17.field1724 != null) {
                                        var17.field1724.method111(0, var12, var17.field1726, var17.field1727, var17.field1725);
                                    }
                                }
                                if (var16.field666 != null) {
                                    class293 var18 = var16.field666;
                                    var18.field4593.method111(var18.field4603, var12, var18.field4606, var18.field4598, var18.field4600);
                                    if (var18.field4595 != null) {
                                        var18.field4595.method111(var18.field4603, var12, var18.field4606, var18.field4598, var18.field4600);
                                    }
                                }
                                if (var16.field655 != null) {
                                    class241 var19 = var16.field655;
                                    var19.field3609.method111(0, var12, var19.field3611, var19.field3603, var19.field3613);
                                }
                                if (var16.field659 != null) {
                                    for (int var20 = 0; var20 < var16.field672; var20++) {
                                        class144 var21 = var16.field659[var20];
                                        var21.field2346.method111(var21.field2338, var12, var21.field2324, var21.field2327, var21.field2335);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class85.field1374 == class337.field5214;
        if (class162.field2623) {
            GL var23 = class162.field2654;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class303.method2152();
                class102.method830(3, 14804, -1);
                class168.field2716 = true;
                class300.method2123();
                class126.field2017 = -1;
                class4.field116 = -1;
                for (int var24 = 0; var24 < class22.field403[0].length; var24++) {
                    class256 var25 = class22.field403[0][var24];
                    float var26 = 251.5F - (var25.field3785 ? 1.0F : 0.5F);
                    if (class126.field2017 != var25.field3786) {
                        class126.field2017 = var25.field3786;
                        class191.method1375((byte) -11, var25.field3786);
                        class261.method1817(class204.method1466(127));
                    }
                    var25.method1769(class34.field521, var26, false);
                }
                class300.method2124();
            } else {
                int var27 = class200.field3059;
                while (true) {
                    if (var27 >= class343.field5331) {
                        class219.method1591(class50.field762, class122.field1992, class34.field521);
                        break;
                    }
                    for (int var28 = 0; var28 < class22.field403[var27].length; var28++) {
                        class256 var29 = class22.field403[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field3785 ? 1.0F : 0.5F);
                        if (var29.field3792 != -1 && class12.method170((byte) -35, class40.field614.method257(var29.field3792, 255)) && class154.field2511) {
                            class191.method1375((byte) -11, var29.field3786);
                        }
                        var29.method1769(class34.field521, var30, false);
                    }
                    if (var27 == 0 && class151.field2474 > 0) {
                        class162.method1190(101.5F);
                        class295.method2071(class50.field762, class122.field1992, class77.field1214, arg1, class142.field2296, class85.field1374[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class200.field3059; var31 < class343.field5331; var31++) {
            class42[][] var32 = class34.field521[var31];
            for (int var33 = -class77.field1214; var33 <= 0; var33++) {
                int var34 = class50.field762 + var33;
                int var35 = class50.field762 - var33;
                if (var34 >= class345.field5356 || var35 < class191.field2986) {
                    for (int var36 = -class77.field1214; var36 <= 0; var36++) {
                        int var37 = class122.field1992 + var36;
                        int var38 = class122.field1992 - var36;
                        if (var34 >= class345.field5356) {
                            if (var37 >= class151.field2492) {
                                class42 var39 = var32[var34][var37];
                                if (var39 != null && var39.field653) {
                                    class75.method595(var39, true);
                                }
                            }
                            if (var38 < class6.field130) {
                                class42 var40 = var32[var34][var38];
                                if (var40 != null && var40.field653) {
                                    class75.method595(var40, true);
                                }
                            }
                        }
                        if (var35 < class191.field2986) {
                            if (var37 >= class151.field2492) {
                                class42 var41 = var32[var35][var37];
                                if (var41 != null && var41.field653) {
                                    class75.method595(var41, true);
                                }
                            }
                            if (var38 < class6.field130) {
                                class42 var42 = var32[var35][var38];
                                if (var42 != null && var42.field653) {
                                    class75.method595(var42, true);
                                }
                            }
                        }
                        if (class26.field432 == 0) {
                            if (!var22) {
                                class30.field480 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class200.field3059; var43 < class343.field5331; var43++) {
            class42[][] var44 = class34.field521[var43];
            for (int var45 = -class77.field1214; var45 <= 0; var45++) {
                int var46 = class50.field762 + var45;
                int var47 = class50.field762 - var45;
                if (var46 >= class345.field5356 || var47 < class191.field2986) {
                    for (int var48 = -class77.field1214; var48 <= 0; var48++) {
                        int var49 = class122.field1992 + var48;
                        int var50 = class122.field1992 - var48;
                        if (var46 >= class345.field5356) {
                            if (var49 >= class151.field2492) {
                                class42 var51 = var44[var46][var49];
                                if (var51 != null && var51.field653) {
                                    class75.method595(var51, false);
                                }
                            }
                            if (var50 < class6.field130) {
                                class42 var52 = var44[var46][var50];
                                if (var52 != null && var52.field653) {
                                    class75.method595(var52, false);
                                }
                            }
                        }
                        if (var47 < class191.field2986) {
                            if (var49 >= class151.field2492) {
                                class42 var53 = var44[var47][var49];
                                if (var53 != null && var53.field653) {
                                    class75.method595(var53, false);
                                }
                            }
                            if (var50 < class6.field130) {
                                class42 var54 = var44[var47][var50];
                                if (var54 != null && var54.field653) {
                                    class75.method595(var54, false);
                                }
                            }
                        }
                        if (class26.field432 == 0) {
                            if (!var22) {
                                class30.field480 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class30.field480 = false;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)V", line = 435)
    public static void method158(byte arg0) {
        field253 = null;
        if (arg0 != -1) {
            field252 = 45;
        }
        field250 = null;
        field257 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZB)I", line = 450)
    public static final int method159(boolean arg0, byte arg1) {
        field256++;
        long var2 = class212.method1543(22326);
        if (arg1 > -48) {
            field250 = (int[]) null;
        }
        for (class173 var4 = arg0 ? (class173) class16.field332.method71((byte) -93) : (class173) class16.field332.method84(1); var4 != null; var4 = (class173) class16.field332.method84(1)) {
            if (var2 > (var4.field2771 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field2771 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field879;
                    class123.field1998[var5] = class93.field1518[var5];
                    var4.method489(false);
                    return var5;
                }
                var4.method489(false);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 489)
    public final void method160(byte arg0) {
        this.field259 = 0;
        field247++;
        if (arg0 <= 77) {
            method158((byte) 41);
        }
        this.field249 = 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V", line = 504)
    public final void method161(int arg0, int arg1, int arg2) {
        this.field259 += this.field261[arg1] * arg0 >> 12;
        field246++;
        if (arg2 != 1) {
            this.method161(-81, 26, -12);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V", line = 522)
    public static final void method162(int arg0, int arg1) {
        if (arg1 != -1) {
            method165(34);
        }
        class170.field2731.method2285(arg0, (byte) 123);
        field245++;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V", line = 539)
    public final void method163(byte arg0) {
        field248++;
        this.field259 = Math.abs(this.field259);
        if (arg0 != -8) {
            field257 = (String) null;
        }
        if (this.field259 >= 4096) {
            this.field259 = 4095;
        }
        this.method156(this.field249++, (byte) (this.field259 >> 4));
        this.field259 = 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([I[JI)V", line = 562)
    public static final void method164(int[] arg0, long[] arg1, int arg2) {
        if (arg2 >= -14) {
            field250 = (int[]) null;
        }
        class198.method1399(arg0, -1, arg1.length - 1, 0, arg1);
        field251++;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V", line = 579)
    public static final void method165(int arg0) {
        field255++;
        class96.field1550 = 0;
        class88.field1420 = arg0;
        class89.method705(2047);
        class343.method2384(arg0 ^ 0x71);
        class209.method1532(-12147);
        class70.method566(true);
        for (int var1 = 0; var1 < class96.field1550; var1++) {
            int var2 = class251.field3703[var1];
            if (class307.field4869 != class74.field1140[var2].field4673) {
                if (class74.field1140[var2].field1509 > 0) {
                    class327.method2301(class74.field1140[var2], false);
                }
                class74.field1140[var2] = null;
            }
        }
        if (class128.field2060 != class80.field1248.field48) {
            throw new RuntimeException("gpp1 pos:" + class80.field1248.field48 + " psize:" + class128.field2060);
        }
        for (int var3 = 0; var3 < class45.field703; var3++) {
            if (class74.field1140[class325.field5068[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class45.field703);
            }
        }
    }
}
