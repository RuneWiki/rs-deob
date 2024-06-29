import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class49 extends class112 {

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field676 = -1;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Lbo;")
    public static class333 field670;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "Ljd;")
    public static class95 field677;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "[Lrj;")
    public static class269[] field673;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljd;IZ)Z", line = 4)
    public static final boolean method371(class95 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method377(true, 56, 120, -67L, -46);
        }
        field679++;
        byte[] var3 = arg0.method715((byte) 108, arg1);
        if (var3 == null) {
            return false;
        } else {
            class225.method1605((byte) -125, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZZ)Ljava/lang/String;", line = 22)
    public static final String method372(int arg0, boolean arg1, boolean arg2) {
        field678++;
        if (arg2 && arg0 >= 0) {
            if (arg1) {
                method376(-48, -4, 45, (byte[][][]) ((byte[][][]) null), 122, (byte) -9, -29, -22);
            }
            return class76.method603(arg2, 10, arg0, -90);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLjd;I)Lrj;", line = 47)
    public static final class269 method373(byte arg0, class95 arg1, int arg2) {
        field675++;
        if (arg0 != 91) {
            method376(96, 63, 52, (byte[][][]) ((byte[][][]) null), 13, (byte) -27, -88, 50);
        }
        return method371(arg1, arg2, true) ? class158.method1188(arg0 - 91) : null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 72)
    public static final long method374(String arg0, int arg1) {
        field671++;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1 != -1) {
            field673 = (class269[]) null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (1 - (65 - var6));
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 116)
    public static void method375(byte arg0) {
        field677 = null;
        field670 = null;
        field673 = null;
        int var1 = 11 % ((arg0 - 65) / 58);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III[[[BIBII)V", line = 134)
    public static final void method376(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class318.field4916++;
        class89.field1271 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class144.field2208; var12 < class139.field2088; var12++) {
            class79[][] var13 = class213.field3262[var12];
            for (int var14 = class162.field2629; var14 < class30.field361; var14++) {
                for (int var15 = class75.field1087; var15 < class29.field345; var15++) {
                    class79 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class278.field4320[var14 + class341.field5290 - class237.field3609][var15 + class341.field5290 - class193.field3014] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field1163 = true;
                            var16.field1177 = true;
                            if (var16.field1169 > 0) {
                                var16.field1153 = true;
                            } else {
                                var16.field1153 = false;
                            }
                            class89.field1271++;
                        } else {
                            var16.field1163 = false;
                            var16.field1177 = false;
                            var16.field1165 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field1161 != null) {
                                    class35 var17 = var16.field1161;
                                    var17.field511.method572(0, var12, var17.field502, var17.field506, var17.field516);
                                    if (var17.field508 != null) {
                                        var17.field508.method572(0, var12, var17.field502, var17.field506, var17.field516);
                                    }
                                }
                                if (var16.field1175 != null) {
                                    class158 var18 = var16.field1175;
                                    var18.field2402.method572(var18.field2406, var12, var18.field2410, var18.field2394, var18.field2409);
                                    if (var18.field2398 != null) {
                                        var18.field2398.method572(var18.field2406, var12, var18.field2410, var18.field2394, var18.field2409);
                                    }
                                }
                                if (var16.field1179 != null) {
                                    class341 var19 = var16.field1179;
                                    var19.field5305.method572(0, var12, var19.field5295, var19.field5304, var19.field5302);
                                }
                                if (var16.field1157 != null) {
                                    for (int var20 = 0; var20 < var16.field1169; var20++) {
                                        class228 var21 = var16.field1157[var20];
                                        var21.field3480.method572(var21.field3476, var12, var21.field3485, var21.field3483, var21.field3477);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class71.field1024 == class203.field3111;
        if (class73.field1058) {
            GL var23 = class73.field1051;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class160.method1197();
                class241.method1672(-1, -126, 3);
                class234.field3557 = true;
                class46.method350();
                class268.field4164 = -1;
                class64.field893 = -1;
                for (int var24 = 0; var24 < class251.field3797[0].length; var24++) {
                    class58 var25 = class251.field3797[0][var24];
                    float var26 = 251.5F - (var25.field767 ? 1.0F : 0.5F);
                    if (class268.field4164 != var25.field769) {
                        class268.field4164 = var25.field769;
                        class332.method2326(var25.field769, 1);
                        class179.method1344(class322.method2234(22313));
                    }
                    var25.method411(class213.field3262, var26, false);
                }
                class46.method354();
            } else {
                int var27 = class144.field2208;
                while (true) {
                    if (var27 >= class139.field2088) {
                        class315.method2148(class237.field3609, class193.field3014, class213.field3262);
                        break;
                    }
                    for (int var28 = 0; var28 < class251.field3797[var27].length; var28++) {
                        class58 var29 = class251.field3797[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field767 ? 1.0F : 0.5F);
                        if (var29.field750 != -1 && class7.method74(class164.field2662.method667(-126, var29.field750), true) && class122.field1874) {
                            class332.method2326(var29.field769, 1);
                        }
                        var29.method411(class213.field3262, var30, false);
                    }
                    if (var27 == 0 && class165.field2674 > 0) {
                        class73.method522(101.5F);
                        class125.method928(class237.field3609, class193.field3014, class341.field5290, arg1, class278.field4320, class203.field3111[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class144.field2208; var31 < class139.field2088; var31++) {
            class79[][] var32 = class213.field3262[var31];
            for (int var33 = -class341.field5290; var33 <= 0; var33++) {
                int var34 = class237.field3609 + var33;
                int var35 = class237.field3609 - var33;
                if (var34 >= class162.field2629 || var35 < class30.field361) {
                    for (int var36 = -class341.field5290; var36 <= 0; var36++) {
                        int var37 = class193.field3014 + var36;
                        int var38 = class193.field3014 - var36;
                        if (var34 >= class162.field2629) {
                            if (var37 >= class75.field1087) {
                                class79 var39 = var32[var34][var37];
                                if (var39 != null && var39.field1163) {
                                    class87.method644(var39, true);
                                }
                            }
                            if (var38 < class29.field345) {
                                class79 var40 = var32[var34][var38];
                                if (var40 != null && var40.field1163) {
                                    class87.method644(var40, true);
                                }
                            }
                        }
                        if (var35 < class30.field361) {
                            if (var37 >= class75.field1087) {
                                class79 var41 = var32[var35][var37];
                                if (var41 != null && var41.field1163) {
                                    class87.method644(var41, true);
                                }
                            }
                            if (var38 < class29.field345) {
                                class79 var42 = var32[var35][var38];
                                if (var42 != null && var42.field1163) {
                                    class87.method644(var42, true);
                                }
                            }
                        }
                        if (class89.field1271 == 0) {
                            if (!var22) {
                                class95.field1368 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class144.field2208; var43 < class139.field2088; var43++) {
            class79[][] var44 = class213.field3262[var43];
            for (int var45 = -class341.field5290; var45 <= 0; var45++) {
                int var46 = class237.field3609 + var45;
                int var47 = class237.field3609 - var45;
                if (var46 >= class162.field2629 || var47 < class30.field361) {
                    for (int var48 = -class341.field5290; var48 <= 0; var48++) {
                        int var49 = class193.field3014 + var48;
                        int var50 = class193.field3014 - var48;
                        if (var46 >= class162.field2629) {
                            if (var49 >= class75.field1087) {
                                class79 var51 = var44[var46][var49];
                                if (var51 != null && var51.field1163) {
                                    class87.method644(var51, false);
                                }
                            }
                            if (var50 < class29.field345) {
                                class79 var52 = var44[var46][var50];
                                if (var52 != null && var52.field1163) {
                                    class87.method644(var52, false);
                                }
                            }
                        }
                        if (var47 < class30.field361) {
                            if (var49 >= class75.field1087) {
                                class79 var53 = var44[var47][var49];
                                if (var53 != null && var53.field1163) {
                                    class87.method644(var53, false);
                                }
                            }
                            if (var50 < class29.field345) {
                                class79 var54 = var44[var47][var50];
                                if (var54 != null && var54.field1163) {
                                    class87.method644(var54, false);
                                }
                            }
                        }
                        if (class89.field1271 == 0) {
                            if (!var22) {
                                class95.field1368 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class95.field1368 = false;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIIJI)Ljava/lang/String;", line = 505)
    public static final String method377(boolean arg0, int arg1, int arg2, long arg3, int arg4) {
        field674++;
        char var6 = ',';
        boolean var7 = false;
        if (arg1 != 48) {
            return (String) null;
        }
        char var8 = '.';
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 < 0L) {
            arg3 = -arg3;
            var7 = true;
        }
        if (arg4 == 0) {
            var6 = '.';
            var8 = ',';
        }
        if (arg4 == 2) {
            var8 = ' ';
        }
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var7) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var8);
                }
            }
        }
    }
}
