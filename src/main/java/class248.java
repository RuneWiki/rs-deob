import java.awt.Component;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class248 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[[[I")
    public static int[][][] field4152 = new int[4][13][13];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public int field4150;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field4160;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field4161;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Ljg;")
    public static class288 field4162;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4153;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[[[B")
    public static byte[][][] field4156;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Ljm;", line = 24)
    public static final class225 method1707(int arg0) {
        if (arg0 != 0) {
            method1708((byte) 100);
        }
        field4159++;
        try {
            return (class225) Class.forName("fh").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 46)
    public static void method1708(byte arg0) {
        field4162 = null;
        if (arg0 < 19) {
            method1713(true, (class255[]) null);
        }
        field4156 = (byte[][][]) null;
        field4152 = (int[][][]) null;
        field4153 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIII)V", line = 65)
    public static final void method1709(boolean arg0, int arg1, int arg2, int arg3) {
        field4154++;
        class197 var4 = class91.method685(arg3, (byte) -47, arg2);
        if (var4 != null && var4.field3408 != null) {
            class26 var5 = new class26();
            var5.field414 = var4.field3408;
            var5.field424 = var4;
            class114.method873(-83, var5);
        }
        class42.field653 = true;
        class168.field2823 = arg3;
        class41.field645 = arg1;
        if (!arg0) {
            class46.field694 = arg2;
            class108.method834((byte) 49, var4);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III[[[BIBII)V", line = 100)
    public static final void method1710(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class54.field857++;
        class55.field866 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class149.field2522; var12 < class295.field5061; var12++) {
            class249[][] var13 = class118.field1984[var12];
            for (int var14 = class70.field1078; var14 < class238.field3954; var14++) {
                for (int var15 = class69.field1037; var15 < class4.field64; var15++) {
                    class249 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class218.field3698[var14 + class76.field1249 - class77.field1264][var15 + class76.field1249 - class81.field1305] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field4187 = true;
                            var16.field4191 = true;
                            if (var16.field4188 > 0) {
                                var16.field4198 = true;
                            } else {
                                var16.field4198 = false;
                            }
                            class55.field866++;
                        } else {
                            var16.field4187 = false;
                            var16.field4191 = false;
                            var16.field4193 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field4192 != null) {
                                    class216 var17 = var16.field4192;
                                    var17.field3663.method521(-19940, var17.field3667, var17.field3662, var17.field3667, var17.field3662);
                                    if (var17.field3668 != null) {
                                        var17.field3668.method521(-19940, var17.field3667, var17.field3662, var17.field3667, var17.field3662);
                                    }
                                }
                                if (var16.field4183 != null) {
                                    class213 var18 = var16.field4183;
                                    var18.field3634.method521(-19940, var18.field3639, var18.field3622, var18.field3639, var18.field3622);
                                    if (var18.field3637 != null) {
                                        var18.field3637.method521(-19940, var18.field3639, var18.field3622, var18.field3639, var18.field3622);
                                    }
                                }
                                if (var16.field4184 != null) {
                                    class304 var19 = var16.field4184;
                                    var19.field5194.method521(-19940, var19.field5195, var19.field5203, var19.field5195, var19.field5203);
                                }
                                if (var16.field4182 != null) {
                                    for (int var20 = 0; var20 < var16.field4188; var20++) {
                                        class250 var21 = var16.field4182[var20];
                                        var21.field4215.method521(-19940, var21.field4208, var21.field4212, var21.field4216, var21.field4207);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class279.field4783 == class106.field1783;
        if (class281.field4827) {
            GL var23 = class281.field4839;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class119.method886();
                class256.method1795(3, -1, -536);
                class249.field4174 = true;
                class134.method1001();
                class224.field3759 = -1;
                class144.field2409 = -1;
                for (int var24 = 0; var24 < class215.field3650[0].length; var24++) {
                    class142 var25 = class215.field3650[0][var24];
                    float var26 = 251.5F - (var25.field2371 ? 1.0F : 0.5F);
                    if (class224.field3759 != var25.field2367) {
                        class224.field3759 = var25.field2367;
                        class68.method411(false, var25.field2367);
                        class272.method1905(class305.method2118(-60));
                    }
                    var25.method1060(class118.field1984, var26, false);
                }
                class134.method1000();
            } else {
                int var27 = class149.field2522;
                while (true) {
                    if (var27 >= class295.field5061) {
                        class164.method1201(class77.field1264, class81.field1305, class118.field1984);
                        break;
                    }
                    for (int var28 = 0; var28 < class215.field3650[var27].length; var28++) {
                        class142 var29 = class215.field3650[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field2371 ? 1.0F : 0.5F);
                        if (var29.field2346 != -1 && class283.field4866.method979(186, var29.field2346) == 4 && class258.field4390) {
                            class68.method411(false, var29.field2367);
                        }
                        var29.method1060(class118.field1984, var30, false);
                    }
                    if (var27 == 0 && class13.field176 > 0) {
                        class281.method1952(101.5F);
                        class35.method200(class77.field1264, class81.field1305, class76.field1249, arg1, class218.field3698, class106.field1783[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class149.field2522; var31 < class295.field5061; var31++) {
            class249[][] var32 = class118.field1984[var31];
            for (int var33 = -class76.field1249; var33 <= 0; var33++) {
                int var34 = class77.field1264 + var33;
                int var35 = class77.field1264 - var33;
                if (var34 >= class70.field1078 || var35 < class238.field3954) {
                    for (int var36 = -class76.field1249; var36 <= 0; var36++) {
                        int var37 = class81.field1305 + var36;
                        int var38 = class81.field1305 - var36;
                        if (var34 >= class70.field1078) {
                            if (var37 >= class69.field1037) {
                                class249 var39 = var32[var34][var37];
                                if (var39 != null && var39.field4187) {
                                    class224.method1567(var39, true);
                                }
                            }
                            if (var38 < class4.field64) {
                                class249 var40 = var32[var34][var38];
                                if (var40 != null && var40.field4187) {
                                    class224.method1567(var40, true);
                                }
                            }
                        }
                        if (var35 < class238.field3954) {
                            if (var37 >= class69.field1037) {
                                class249 var41 = var32[var35][var37];
                                if (var41 != null && var41.field4187) {
                                    class224.method1567(var41, true);
                                }
                            }
                            if (var38 < class4.field64) {
                                class249 var42 = var32[var35][var38];
                                if (var42 != null && var42.field4187) {
                                    class224.method1567(var42, true);
                                }
                            }
                        }
                        if (class55.field866 == 0) {
                            if (!var22) {
                                class29.field461 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class149.field2522; var43 < class295.field5061; var43++) {
            class249[][] var44 = class118.field1984[var43];
            for (int var45 = -class76.field1249; var45 <= 0; var45++) {
                int var46 = class77.field1264 + var45;
                int var47 = class77.field1264 - var45;
                if (var46 >= class70.field1078 || var47 < class238.field3954) {
                    for (int var48 = -class76.field1249; var48 <= 0; var48++) {
                        int var49 = class81.field1305 + var48;
                        int var50 = class81.field1305 - var48;
                        if (var46 >= class70.field1078) {
                            if (var49 >= class69.field1037) {
                                class249 var51 = var44[var46][var49];
                                if (var51 != null && var51.field4187) {
                                    class224.method1567(var51, false);
                                }
                            }
                            if (var50 < class4.field64) {
                                class249 var52 = var44[var46][var50];
                                if (var52 != null && var52.field4187) {
                                    class224.method1567(var52, false);
                                }
                            }
                        }
                        if (var47 < class238.field3954) {
                            if (var49 >= class69.field1037) {
                                class249 var53 = var44[var47][var49];
                                if (var53 != null && var53.field4187) {
                                    class224.method1567(var53, false);
                                }
                            }
                            if (var50 < class4.field64) {
                                class249 var54 = var44[var47][var50];
                                if (var54 != null && var54.field4187) {
                                    class224.method1567(var54, false);
                                }
                            }
                        }
                        if (class55.field866 == 0) {
                            if (!var22) {
                                class29.field461 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class29.field461 = false;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 467)
    public static final void method1711(int arg0, Component arg1) {
        arg1.removeMouseListener(class107.field1810);
        arg1.removeMouseMotionListener(class107.field1810);
        arg1.removeFocusListener(class107.field1810);
        field4151++;
        class43.field672 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIIII)V", line = 479)
    public static final void method1712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg2 && arg7 == arg8 && arg5 == arg9 && arg1 == arg6) {
            class288.method2043(arg2, arg7, arg4, true, arg9, arg6);
        } else {
            int var10 = arg2;
            int var11 = arg7;
            int var12 = arg2 * 3;
            int var13 = arg7 * 3;
            int var14 = arg0 * 3;
            int var15 = arg5 * 3;
            int var16 = arg8 * 3;
            int var17 = arg1 * 3;
            int var18 = arg9 + var14 - var15 - arg2;
            int var19 = var16 + arg6 - arg7 - var17;
            int var20 = var15 - (var14 - var12) - var14;
            int var21 = var13 + var17 - var16 - var16;
            int var22 = var16 - var13;
            int var23 = var14 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var20 * var25;
                int var28 = var19 * var26;
                int var29 = var18 * var26;
                int var30 = var21 * var25;
                int var31 = var23 * var24;
                int var32 = var22 * var24;
                int var33 = arg2 + (var27 + var31 + var29 >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg7;
                class288.method2043(var10, var11, arg4, true, var33, var34);
                var10 = var33;
                var11 = var34;
            }
        }
        field4163++;
        if (arg3 != -16032) {
            method1709(true, -4, -54, 7);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z[Lve;)[Lve;", line = 560)
    public static final class255[] method1713(boolean arg0, class255[] arg1) {
        field4155++;
        class255[] var2 = new class255[5];
        if (arg0) {
            method1707(-99);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class3.method14(new class255[] { class215.method1532(var3, !arg0), class74.field1226 }, (byte) -112);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class3.method14(new class255[] { var2[var3], arg1[var3] }, (byte) -91);
            }
        }
        return var2;
    }
}
