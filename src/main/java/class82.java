import java.io.InputStream;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class82 extends InputStream {

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lin;")
    public static class344 field1193 = null;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lfm;")
    public static class53 field1187 = new class53(128);

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Ldc;")
    public static class75 field1195;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "[I")
    public static int[] field1196;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III[[[BIBII)V", line = 9)
    public static final void method639(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class24.field300++;
        class161.field2219 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class186.field2569; var12 < class313.field4724; var12++) {
            class202[][] var13 = class142.field1940[var12];
            for (int var14 = class110.field1484; var14 < class316.field4758; var14++) {
                for (int var15 = class161.field2213; var15 < class230.field3254; var15++) {
                    class202 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class240.field3399[var14 + class208.field2988 - class175.field2383][var15 + class208.field2988 - class25.field315] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field2870 = true;
                            var16.field2892 = true;
                            if (var16.field2875 > 0) {
                                var16.field2893 = true;
                            } else {
                                var16.field2893 = false;
                            }
                            class161.field2219++;
                        } else {
                            var16.field2870 = false;
                            var16.field2892 = false;
                            var16.field2882 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field2873 != null) {
                                    class7 var17 = var16.field2873;
                                    var17.field57.method100(0, var12, var17.field68, var17.field62, var17.field60);
                                    if (var17.field55 != null) {
                                        var17.field55.method100(0, var12, var17.field68, var17.field62, var17.field60);
                                    }
                                }
                                if (var16.field2879 != null) {
                                    class269 var18 = var16.field2879;
                                    var18.field3987.method100(var18.field3996, var12, var18.field3989, var18.field3986, var18.field3980);
                                    if (var18.field3995 != null) {
                                        var18.field3995.method100(var18.field3996, var12, var18.field3989, var18.field3986, var18.field3980);
                                    }
                                }
                                if (var16.field2869 != null) {
                                    class306 var19 = var16.field2869;
                                    var19.field4586.method100(0, var12, var19.field4583, var19.field4581, var19.field4588);
                                }
                                if (var16.field2896 != null) {
                                    for (int var20 = 0; var20 < var16.field2875; var20++) {
                                        class280 var21 = var16.field2896[var20];
                                        var21.field4199.method100(var21.field4213, var12, var21.field4206, var21.field4212, var21.field4214);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class333.field5020 == class143.field1967;
        if (class67.field908) {
            GL var23 = class67.field899;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class20.method129();
                class123.method884(-1, 3, 127);
                class310.field4686 = true;
                class5.method28();
                class33.field399 = -1;
                class36.field419 = -1;
                for (int var24 = 0; var24 < class278.field4175[0].length; var24++) {
                    class268 var25 = class278.field4175[0][var24];
                    float var26 = 251.5F - (var25.field3960 ? 1.0F : 0.5F);
                    if (class33.field399 != var25.field3969) {
                        class33.field399 = var25.field3969;
                        class111.method808((byte) 89, var25.field3969);
                        class139.method1005(class6.method34(-18072));
                    }
                    var25.method1846(class142.field1940, var26, false);
                }
                class5.method23();
            } else {
                int var27 = class186.field2569;
                while (true) {
                    if (var27 >= class313.field4724) {
                        class147.method1069(class175.field2383, class25.field315, class142.field1940);
                        break;
                    }
                    for (int var28 = 0; var28 < class278.field4175[var27].length; var28++) {
                        class268 var29 = class278.field4175[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field3960 ? 1.0F : 0.5F);
                        if (var29.field3978 != -1 && class208.method1465(-117, class184.field2543.method667(119, var29.field3978)) && class131.field1793) {
                            class111.method808((byte) 89, var29.field3969);
                        }
                        var29.method1846(class142.field1940, var30, false);
                    }
                    if (var27 == 0 && class216.field3091 > 0) {
                        class67.method488(101.5F);
                        class322.method2250(class175.field2383, class25.field315, class208.field2988, arg1, class240.field3399, class333.field5020[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class186.field2569; var31 < class313.field4724; var31++) {
            class202[][] var32 = class142.field1940[var31];
            for (int var33 = -class208.field2988; var33 <= 0; var33++) {
                int var34 = class175.field2383 + var33;
                int var35 = class175.field2383 - var33;
                if (var34 >= class110.field1484 || var35 < class316.field4758) {
                    for (int var36 = -class208.field2988; var36 <= 0; var36++) {
                        int var37 = class25.field315 + var36;
                        int var38 = class25.field315 - var36;
                        if (var34 >= class110.field1484) {
                            if (var37 >= class161.field2213) {
                                class202 var39 = var32[var34][var37];
                                if (var39 != null && var39.field2870) {
                                    class99.method727(var39, true);
                                }
                            }
                            if (var38 < class230.field3254) {
                                class202 var40 = var32[var34][var38];
                                if (var40 != null && var40.field2870) {
                                    class99.method727(var40, true);
                                }
                            }
                        }
                        if (var35 < class316.field4758) {
                            if (var37 >= class161.field2213) {
                                class202 var41 = var32[var35][var37];
                                if (var41 != null && var41.field2870) {
                                    class99.method727(var41, true);
                                }
                            }
                            if (var38 < class230.field3254) {
                                class202 var42 = var32[var35][var38];
                                if (var42 != null && var42.field2870) {
                                    class99.method727(var42, true);
                                }
                            }
                        }
                        if (class161.field2219 == 0) {
                            if (!var22) {
                                class312.field4720 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class186.field2569; var43 < class313.field4724; var43++) {
            class202[][] var44 = class142.field1940[var43];
            for (int var45 = -class208.field2988; var45 <= 0; var45++) {
                int var46 = class175.field2383 + var45;
                int var47 = class175.field2383 - var45;
                if (var46 >= class110.field1484 || var47 < class316.field4758) {
                    for (int var48 = -class208.field2988; var48 <= 0; var48++) {
                        int var49 = class25.field315 + var48;
                        int var50 = class25.field315 - var48;
                        if (var46 >= class110.field1484) {
                            if (var49 >= class161.field2213) {
                                class202 var51 = var44[var46][var49];
                                if (var51 != null && var51.field2870) {
                                    class99.method727(var51, false);
                                }
                            }
                            if (var50 < class230.field3254) {
                                class202 var52 = var44[var46][var50];
                                if (var52 != null && var52.field2870) {
                                    class99.method727(var52, false);
                                }
                            }
                        }
                        if (var47 < class316.field4758) {
                            if (var49 >= class161.field2213) {
                                class202 var53 = var44[var47][var49];
                                if (var53 != null && var53.field2870) {
                                    class99.method727(var53, false);
                                }
                            }
                            if (var50 < class230.field3254) {
                                class202 var54 = var44[var47][var50];
                                if (var54 != null && var54.field2870) {
                                    class99.method727(var54, false);
                                }
                            }
                        }
                        if (class161.field2219 == 0) {
                            if (!var22) {
                                class312.field4720 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class312.field4720 = false;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIBI)V", line = 381)
    public static final void method640(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = -32 % ((arg3 - 55) / 35);
        field1191++;
        class143 var6 = class163.method1176((byte) -64, arg2, 10);
        var6.method1032((byte) 123);
        var6.field1963 = arg4;
        var6.field1965 = arg1;
        var6.field1958 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lpl;", line = 396)
    public static final class327 method641(int arg0, int arg1) {
        field1194++;
        class327 var2 = (class327) class159.field2182.method716((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class221.field3172.method955(arg1, arg0, -21853);
        class327 var4 = new class327();
        if (var3 != null) {
            var4.method2284(arg0, (byte) -113, new class316(var3));
        }
        class159.field2182.method721((long) arg0, var4, arg1 ^ 0x21);
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 423)
    public static void method642(byte arg0) {
        field1193 = null;
        field1187 = null;
        if (arg0 < 46) {
            field1189 = -94;
        }
        field1196 = null;
        field1195 = null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V", line = 439)
    public static final void method643(int arg0, int arg1) {
        field1197++;
        class143 var2 = class163.method1176((byte) 124, arg0, arg1);
        var2.method1038(0);
    }

    @OriginalMember(owner = "client!cf", name = "read", descriptor = "()I", line = 449)
    public final int read() {
        class186.method1304(10, 30000L);
        field1190++;
        return -1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IJ)V", line = 462)
    public static final void method644(int arg0, long arg1) {
        if (class343.field5168 == 1 || class343.field5168 == 5) {
            class23.method137(-36, arg1);
        } else if (class343.field5168 == 2) {
            class206.method1454((byte) 59);
        } else {
            class78.method605(2);
        }
        field1188++;
        if (!class100.field1380) {
            class135.field1868[0] = class42.field485;
            if (class316.field4811 != 0) {
                field1189 = class247.field3560;
                class55.field751 = class89.field1253;
            } else if (class123.field1666 == 0) {
                class55.field751 = class206.field2962;
                field1189 = class282.field4220;
            } else {
                class55.field751 = class217.field3104;
                field1189 = class155.field2142;
            }
            class111.field1487[0] = class251.field3602;
            class204.field2938 = 1;
            class54.field722[0] = 1004;
            class88.field1251[0] = "";
        }
        if (class183.field2521 != -1) {
            class28.method170((byte) -94, class183.field2521);
        }
        for (int var3 = 0; var3 < class231.field3266; var3++) {
            if (class121.field1644[var3]) {
                class304.field4571[var3] = true;
            }
            class288.field4285[var3] = class121.field1644[var3];
            class121.field1644[var3] = false;
        }
        class271.field4051 = -1;
        class222.field3189 = null;
        if (class67.field908) {
            class287.field4275 = true;
        }
        class170.field2320 = class329.field4966;
        class290.field4324 = null;
        class153.field2130 = -1;
        if (class183.field2521 != -1) {
            class231.field3266 = 0;
            class186.method1303(false);
        }
        if (class67.field908) {
            class102.method748();
        } else {
            class38.method222();
        }
        class28.method172((byte) -103);
        if (class100.field1380) {
            if (class141.field1924) {
                class123.method887(13718);
            } else {
                class237.method1636((byte) 84);
            }
        } else if (class290.field4324 != null) {
            class270.method1861(class290.field4324, arg0 + 18020, class242.field3451, class56.field775);
        } else if (class271.field4051 != -1) {
            class270.method1861((class344) null, arg0 ^ 0x4664, class271.field4051, class153.field2130);
        }
        int var4 = class100.field1380 ? -1 : class150.method1086((byte) 102);
        if (~var4 == arg0) {
            var4 = class111.field1491;
        }
        class10.method57(0, var4);
        if (class344.field5238 == 1) {
            class344.field5238 = 2;
        }
        if (class327.field4946 == 1) {
            class327.field4946 = 2;
        }
        if (class194.field2677 == 3) {
            for (int var5 = 0; var5 < class231.field3266; var5++) {
                if (class288.field4285[var5]) {
                    if (class67.field908) {
                        class102.method745(class333.field5009[var5], class262.field3852[var5], class66.field868[var5], class234.field3318[var5], 16711935, 128);
                    } else {
                        class38.method231(class333.field5009[var5], class262.field3852[var5], class66.field868[var5], class234.field3318[var5], 16711935, 128);
                    }
                } else if (class304.field4571[var5]) {
                    if (class67.field908) {
                        class102.method745(class333.field5009[var5], class262.field3852[var5], class66.field868[var5], class234.field3318[var5], 16711680, 128);
                    } else {
                        class38.method231(class333.field5009[var5], class262.field3852[var5], class66.field868[var5], class234.field3318[var5], 16711680, 128);
                    }
                }
            }
        }
        class161.method1164(class287.field4278, class173.field2356.field3679, class173.field2356.field3745, -1, class251.field3603);
        class287.field4278 = 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I", line = 615)
    public static final int method645(String arg0, String arg1, int arg2, int arg3) {
        field1192++;
        int var4 = 0;
        int var5 = 0;
        if (arg2 != 5660) {
            return -127;
        }
        char var6 = 0;
        int var7 = arg1.length();
        int var8 = arg0.length();
        char var9 = 0;
        while (var7 > var4 - var6 || var8 > var5 - var9) {
            if (var4 - var6 >= var7) {
                return -1;
            }
            if ((var5 - var9) >= var8) {
                return 1;
            }
            char var22;
            if (var6 == '\u0000') {
                var22 = arg1.charAt(var4++);
            } else {
                var22 = var6;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var5++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var6 = class292.method1997(var22, arg2 ^ 0x4FFA);
            var9 = class292.method1997(var24, 23014);
            char var26 = class309.method2119(200, arg3, var22);
            char var27 = class309.method2119(200, arg3, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class221.method1562(arg3, var28, (byte) 115) - class221.method1562(arg3, var29, (byte) 122);
                }
            }
        }
        int var10 = Math.min(var7, var8);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg3 == 2) {
                var12 = var7 - var11 - 1;
                var13 = var8 - var11 - 1;
            } else {
                var13 = var11;
                var12 = var11;
            }
            char var14 = arg1.charAt(var12);
            char var15 = arg0.charAt(var13);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class221.method1562(arg3, var16, (byte) 113) - class221.method1562(arg3, var17, (byte) 111);
                }
            }
        }
        int var18 = var7 - var8;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg1.charAt(var19);
            char var21 = arg0.charAt(var19);
            if (var20 != var21) {
                return class221.method1562(arg3, var20, (byte) 111) - class221.method1562(arg3, var21, (byte) 127);
            }
        }
        return 0;
    }
}
