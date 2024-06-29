import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class311 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljl;")
    public static class332 field4956 = new class332(64);

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field4964 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lcj;")
    public static class147 field4963;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4955;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lwf;I)Z", line = 4)
    public static final boolean method2206(class250 arg0, int arg1) {
        field4959++;
        if (arg1 != 16) {
            return false;
        } else if (arg0.field4134 == 205) {
            class221.field3609 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[Lwf;Z)V", line = 28)
    public static final void method2207(int arg0, class250[] arg1, boolean arg2) {
        if (!arg2) {
            method2208(-1);
        }
        field4957++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class250 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field4078 == 0) {
                    if (var4.field4171 != null) {
                        method2207(arg0, var4.field4171, true);
                    }
                    class259 var5 = (class259) class226.field3723.method1268(92, (long) var4.field4167);
                    if (var5 != null) {
                        class32.method221(var5.field4358, -32471, arg0);
                    }
                }
                if (arg0 == 0 && var4.field4105 != null) {
                    class40 var6 = new class40();
                    var6.field581 = var4.field4105;
                    var6.field593 = var4;
                    class29.method183((byte) 122, var6);
                }
                if (arg0 == 1 && var4.field4080 != null) {
                    if (var4.field4229 >= 0) {
                        class250 var7 = class13.method74(-69, var4.field4167);
                        if (var7 == null || var7.field4171 == null || var7.field4171.length <= var4.field4229 || var7.field4171[var4.field4229] != var4) {
                            continue;
                        }
                    }
                    class40 var8 = new class40();
                    var8.field581 = var4.field4080;
                    var8.field593 = var4;
                    class29.method183((byte) 127, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 98)
    public static void method2208(int arg0) {
        field4956 = null;
        field4963 = null;
        int var1 = 72 % ((arg0 + 11) / 35);
        field4955 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILqm;I)V", line = 112)
    public static final void method2209(int arg0, class227 arg1, int arg2) {
        field4962++;
        if (class20.field230 != null) {
            try {
                class20.field230.method1794(0L, (byte) 70);
                class20.field230.method1796((byte) -125, arg0, arg1.field3793, 24);
            } catch (Exception var4) {
            }
        }
        if (arg2 != 0) {
            method2211(45, -41, 126, (byte[][][]) ((byte[][][]) null), -127, (byte) 35, -34, 121);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BZ)V", line = 133)
    public static final void method2210(byte arg0, boolean arg1) {
        if (arg0 != 65) {
            return;
        }
        field4960++;
        byte[][] var2;
        byte var3;
        if (class42.field607 && arg1) {
            var2 = class160.field2546;
            var3 = 1;
        } else {
            var2 = class227.field3786;
            var3 = 4;
        }
        int[] var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class195.method1506(false);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class267.field4476[var5][var6][var7];
                    boolean var9 = false;
                    if (var8 != -1) {
                        int var10 = (var8 & 0x38D67D1) >> 24;
                        if (!arg1 || var10 == 0) {
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            int var14 = (var8 & 0x7) >> 1;
                            for (int var15 = 0; var15 < class121.field2079.length; var15++) {
                                if (class121.field2079[var15] == var13 && var2[var15] != null) {
                                    var9 = true;
                                    int[] var16 = class169.method1311(var10, class32.field459, var5, arg1, (byte) -1, var12, var6 * 8, var2[var15], var11, var7 * 8, var14);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var9) {
                        class50.method390(var6 * 8, var7 * 8, 8, var5, 8, arg0 ^ 0xFFFFC695);
                    }
                }
            }
        }
        if (var4 == null) {
            class293.field4732 = -1;
            return;
        }
        class326.field5186 = var4[4];
        class89.field1501 = var4[2];
        class293.field4732 = var4[0];
        class125.field2139 = var4[3];
        class239.field3939 = var4[1];
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[[[BIBII)V", line = 243)
    public static final void method2211(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class151.field2404++;
        class51.field811 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class98.field1603; var12 < class56.field942; var12++) {
            class36[][] var13 = class129.field2184[var12];
            for (int var14 = class184.field2971; var14 < class83.field1414; var14++) {
                for (int var15 = class159.field2533; var15 < class117.field1980; var15++) {
                    class36 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class166.field2653[var14 + class172.field2740 - class245.field4011][var15 + class172.field2740 - class125.field2138] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field543 = true;
                            var16.field549 = true;
                            if (var16.field531 > 0) {
                                var16.field532 = true;
                            } else {
                                var16.field532 = false;
                            }
                            class51.field811++;
                        } else {
                            var16.field543 = false;
                            var16.field549 = false;
                            var16.field542 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field533 != null) {
                                    class338 var17 = var16.field533;
                                    var17.field5392.method445(0, var12, var17.field5396, var17.field5394, var17.field5391);
                                    if (var17.field5390 != null) {
                                        var17.field5390.method445(0, var12, var17.field5396, var17.field5394, var17.field5391);
                                    }
                                }
                                if (var16.field526 != null) {
                                    class339 var18 = var16.field526;
                                    var18.field5400.method445(var18.field5403, var12, var18.field5399, var18.field5404, var18.field5401);
                                    if (var18.field5410 != null) {
                                        var18.field5410.method445(var18.field5403, var12, var18.field5399, var18.field5404, var18.field5401);
                                    }
                                }
                                if (var16.field537 != null) {
                                    class184 var19 = var16.field537;
                                    var19.field2968.method445(0, var12, var19.field2963, var19.field2960, var19.field2966);
                                }
                                if (var16.field544 != null) {
                                    for (int var20 = 0; var20 < var16.field531; var20++) {
                                        class209 var21 = var16.field544[var20];
                                        var21.field3287.method445(var21.field3295, var12, var21.field3286, var21.field3288, var21.field3290);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class27.field332 == class101.field1656;
        if (class42.field607) {
            GL var23 = class42.field627;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class31.method214();
                class310.method2203(-1, 3, -124);
                class348.field5529 = true;
                class269.method2030();
                class31.field443 = -1;
                class190.field3044 = -1;
                for (int var24 = 0; var24 < class329.field5237[0].length; var24++) {
                    class299 var25 = class329.field5237[0][var24];
                    float var26 = 251.5F - (var25.field4797 ? 1.0F : 0.5F);
                    if (class31.field443 != var25.field4823) {
                        class31.field443 = var25.field4823;
                        class148.method1150(var25.field4823, 28946);
                        class167.method1296(class329.method2320((byte) 123));
                    }
                    var25.method2141(class129.field2184, var26, false);
                }
                class269.method2029();
            } else {
                int var27 = class98.field1603;
                while (true) {
                    if (var27 >= class56.field942) {
                        class30.method206(class245.field4011, class125.field2138, class129.field2184);
                        break;
                    }
                    for (int var28 = 0; var28 < class329.field5237[var27].length; var28++) {
                        class299 var29 = class329.field5237[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field4797 ? 1.0F : 0.5F);
                        if (var29.field4810 != -1 && class27.method170((byte) -126, class153.field2439.method776(var29.field4810, (byte) 21)) && class193.field3083) {
                            class148.method1150(var29.field4823, 28946);
                        }
                        var29.method2141(class129.field2184, var30, false);
                    }
                    if (var27 == 0 && class131.field2214 > 0) {
                        class42.method298(101.5F);
                        class249.method1924(class245.field4011, class125.field2138, class172.field2740, arg1, class166.field2653, class101.field1656[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class98.field1603; var31 < class56.field942; var31++) {
            class36[][] var32 = class129.field2184[var31];
            for (int var33 = -class172.field2740; var33 <= 0; var33++) {
                int var34 = class245.field4011 + var33;
                int var35 = class245.field4011 - var33;
                if (var34 >= class184.field2971 || var35 < class83.field1414) {
                    for (int var36 = -class172.field2740; var36 <= 0; var36++) {
                        int var37 = class125.field2138 + var36;
                        int var38 = class125.field2138 - var36;
                        if (var34 >= class184.field2971) {
                            if (var37 >= class159.field2533) {
                                class36 var39 = var32[var34][var37];
                                if (var39 != null && var39.field543) {
                                    class12.method64(var39, true);
                                }
                            }
                            if (var38 < class117.field1980) {
                                class36 var40 = var32[var34][var38];
                                if (var40 != null && var40.field543) {
                                    class12.method64(var40, true);
                                }
                            }
                        }
                        if (var35 < class83.field1414) {
                            if (var37 >= class159.field2533) {
                                class36 var41 = var32[var35][var37];
                                if (var41 != null && var41.field543) {
                                    class12.method64(var41, true);
                                }
                            }
                            if (var38 < class117.field1980) {
                                class36 var42 = var32[var35][var38];
                                if (var42 != null && var42.field543) {
                                    class12.method64(var42, true);
                                }
                            }
                        }
                        if (class51.field811 == 0) {
                            if (!var22) {
                                class253.field4274 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class98.field1603; var43 < class56.field942; var43++) {
            class36[][] var44 = class129.field2184[var43];
            for (int var45 = -class172.field2740; var45 <= 0; var45++) {
                int var46 = class245.field4011 + var45;
                int var47 = class245.field4011 - var45;
                if (var46 >= class184.field2971 || var47 < class83.field1414) {
                    for (int var48 = -class172.field2740; var48 <= 0; var48++) {
                        int var49 = class125.field2138 + var48;
                        int var50 = class125.field2138 - var48;
                        if (var46 >= class184.field2971) {
                            if (var49 >= class159.field2533) {
                                class36 var51 = var44[var46][var49];
                                if (var51 != null && var51.field543) {
                                    class12.method64(var51, false);
                                }
                            }
                            if (var50 < class117.field1980) {
                                class36 var52 = var44[var46][var50];
                                if (var52 != null && var52.field543) {
                                    class12.method64(var52, false);
                                }
                            }
                        }
                        if (var47 < class83.field1414) {
                            if (var49 >= class159.field2533) {
                                class36 var53 = var44[var47][var49];
                                if (var53 != null && var53.field543) {
                                    class12.method64(var53, false);
                                }
                            }
                            if (var50 < class117.field1980) {
                                class36 var54 = var44[var47][var50];
                                if (var54 != null && var54.field543) {
                                    class12.method64(var54, false);
                                }
                            }
                        }
                        if (class51.field811 == 0) {
                            if (!var22) {
                                class253.field4274 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class253.field4274 = false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 618)
    public static final void method2212(byte arg0) {
        field4961++;
        if (class10.field83) {
            return;
        }
        class10.field83 = true;
        if (class336.field5314) {
            class84.field1426 = (float) ((int) class84.field1426 - 17 & 0xFFFFFFF0);
        } else {
            class357.field5652 += (-class357.field5652 - 12.0F) / 2.0F;
        }
        class175.field2807 = true;
        if (arg0 != 4) {
            field4955 = (String) null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI[Lic;[BIZ)V", line = 645)
    public static final void method2213(boolean arg0, int arg1, class22[] arg2, byte[] arg3, int arg4, boolean arg5) {
        field4958++;
        class227 var6 = new class227(arg3);
        if (!arg5) {
            method2213(true, 122, (class22[]) null, (byte[]) null, -56, true);
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method1742(6789);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method1708((byte) 103);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method1720((byte) -81);
                int var15 = var14 & 0x3;
                int var16 = arg4 + var12;
                int var17 = arg1 + var11;
                int var18 = var14 >> 2;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    class22 var19 = null;
                    if (!arg0) {
                        int var20 = var13;
                        if ((class178.field2856[1][var16][var17] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class134.method1023(var7, arg0, 1, var13, var18, var15, var13, var17, var16, !arg0, var19);
                }
            }
        }
    }
}
