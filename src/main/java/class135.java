import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class135 extends class177 {

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    private int field2105 = 4096;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    private int field2115 = 4096;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    private int field2111 = 4096;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    private int field2116 = 409;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "[I")
    private int[] field2114 = new int[3];

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field2103 = 0;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "[I")
    public static int[] field2112 = new int[5];

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)V", line = 7)
    public static final void method1031(byte arg0) {
        int var1 = 46 % ((30 - arg0) / 51);
        for (class117 var2 = (class117) class154.field2330.method986(false); var2 != null; var2 = (class117) class154.field2330.method982(14877)) {
            if (var2.field1825) {
                var2.method908(2);
            }
        }
        field2106++;
        for (class117 var3 = (class117) class200.field3169.method986(false); var3 != null; var3 = (class117) class200.field3169.method982(14877)) {
            if (var3.field1825) {
                var3.method908(2);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)V", line = 39)
    public static final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 85) {
            method1032(113, 67, 81, -98, 64);
        }
        for (int var5 = 0; var5 < class112.field1762; var5++) {
            if (class245.field3687[var5] + class154.field2331[var5] > arg3 && (arg0 + arg3) > class154.field2331[var5] && arg2 < class304.field4765[var5] + class266.field3990[var5] && arg2 + arg4 > class304.field4765[var5]) {
                class238.field3621[var5] = true;
            }
        }
        field2107++;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 65)
    public class135() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lhb;II)V", line = 72)
    public final void method97(class35 arg0, int arg1, int arg2) {
        field2110++;
        if (arg1 != -18061) {
            method1035((byte) 84);
        }
        if (arg2 == 0) {
            this.field2116 = arg0.method300(-1394191632);
        } else if (arg2 == 1) {
            this.field2115 = arg0.method300(-1394191632);
        } else if (arg2 == 2) {
            this.field2111 = arg0.method300(-1394191632);
        } else if (arg2 == 3) {
            this.field2105 = arg0.method300(-1394191632);
        } else if (arg2 == 4) {
            int var5 = arg0.method269(false);
            this.field2114[1] = class142.method1078(var5 >> 4, 4080);
            this.field2114[0] = class142.method1078(16711680, var5) << 4;
            this.field2114[2] = class142.method1078(var5, 255) >> 12;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Loa;I)V", line = 143)
    public static final void method1033(class288 arg0, int arg1) {
        if (class312.field4852 == arg0.field4474 || arg0.field4439 == -1 || arg0.field4437 != 0 || (arg0.field4508 + 1) > class173.method1259((byte) 119, arg0.field4439).field2423[arg0.field4536]) {
            int var2 = arg0.field4474 - arg0.field4521;
            int var3 = class312.field4852 - arg0.field4521;
            int var4 = arg0.field4467 * 128 + (arg0.method929(12) * 64);
            int var5 = arg0.field4452 * 128 + arg0.method929(12) * 64;
            int var6 = arg0.field4471 * 128 + (arg0.method929(12) * 64);
            int var7 = arg0.field4529 * 128 + arg0.method929(12) * 64;
            arg0.field4507 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg0.field4496 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0.field4445 == 0) {
            arg0.field4497 = 1024;
        }
        if (arg0.field4445 == 1) {
            arg0.field4497 = 1536;
        }
        arg0.field4495 = 0;
        field2113++;
        if (arg0.field4445 == 2) {
            arg0.field4497 = 0;
        }
        if (arg1 < 96) {
            field2103 = -29;
        }
        if (arg0.field4445 == 3) {
            arg0.field4497 = 512;
        }
        arg0.field4438 = arg0.field4497;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[[[BIBII)V", line = 191)
    public static final void method1034(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class63.field949++;
        class178.field2669 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class112.field1759; var12 < class136.field2126; var12++) {
            class99[][] var13 = class250.field3746[var12];
            for (int var14 = class117.field1841; var14 < class90.field1311; var14++) {
                for (int var15 = class102.field1580; var15 < class29.field335; var15++) {
                    class99 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class312.field4849[var14 + class293.field4601 - class310.field4837][var15 + class293.field4601 - class58.field865] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field1485 = true;
                            var16.field1466 = true;
                            if (var16.field1488 > 0) {
                                var16.field1481 = true;
                            } else {
                                var16.field1481 = false;
                            }
                            class178.field2669++;
                        } else {
                            var16.field1485 = false;
                            var16.field1466 = false;
                            var16.field1482 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field1486 != null) {
                                    class10 var17 = var16.field1486;
                                    var17.field98.method16(0, var12, var17.field99, var17.field92, var17.field96);
                                    if (var17.field94 != null) {
                                        var17.field94.method16(0, var12, var17.field99, var17.field92, var17.field96);
                                    }
                                }
                                if (var16.field1474 != null) {
                                    class290 var18 = var16.field1474;
                                    var18.field4563.method16(var18.field4557, var12, var18.field4559, var18.field4551, var18.field4548);
                                    if (var18.field4549 != null) {
                                        var18.field4549.method16(var18.field4557, var12, var18.field4559, var18.field4551, var18.field4548);
                                    }
                                }
                                if (var16.field1472 != null) {
                                    class173 var19 = var16.field1472;
                                    var19.field2560.method16(0, var12, var19.field2564, var19.field2565, var19.field2555);
                                }
                                if (var16.field1471 != null) {
                                    for (int var20 = 0; var20 < var16.field1488; var20++) {
                                        class91 var21 = var16.field1471[var20];
                                        var21.field1326.method16(var21.field1316, var12, var21.field1328, var21.field1324, var21.field1322);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class41.field612 == class308.field4797;
        if (class36.field534) {
            GL var23 = class36.field518;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class136.method1040();
                class309.method2143(-1, -107, 3);
                class201.field3197 = true;
                class25.method157();
                class176.field2630 = -1;
                class110.field1741 = -1;
                for (int var24 = 0; var24 < class212.field3364[0].length; var24++) {
                    class123 var25 = class212.field3364[0][var24];
                    float var26 = 251.5F - (var25.field1942 ? 1.0F : 0.5F);
                    if (class176.field2630 != var25.field1943) {
                        class176.field2630 = var25.field1943;
                        class7.method61(var25.field1943, -107);
                        class264.method1819(class257.method1786((byte) 33));
                    }
                    var25.method943(class250.field3746, var26, false);
                }
                class25.method154();
            } else {
                int var27 = class112.field1759;
                while (true) {
                    if (var27 >= class136.field2126) {
                        class286.method2011(class310.field4837, class58.field865, class250.field3746);
                        break;
                    }
                    for (int var28 = 0; var28 < class212.field3364[var27].length; var28++) {
                        class123 var29 = class212.field3364[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field1942 ? 1.0F : 0.5F);
                        if (var29.field1939 != -1 && class56.field829.method1743(var29.field1939, (byte) -115) == 4 && class289.field4541) {
                            class7.method61(var29.field1943, -45);
                        }
                        var29.method943(class250.field3746, var30, false);
                    }
                    if (var27 == 0 && class143.field2212 > 0) {
                        class36.method330(101.5F);
                        class247.method1709(class310.field4837, class58.field865, class293.field4601, arg1, class312.field4849, class41.field612[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class112.field1759; var31 < class136.field2126; var31++) {
            class99[][] var32 = class250.field3746[var31];
            for (int var33 = -class293.field4601; var33 <= 0; var33++) {
                int var34 = class310.field4837 + var33;
                int var35 = class310.field4837 - var33;
                if (var34 >= class117.field1841 || var35 < class90.field1311) {
                    for (int var36 = -class293.field4601; var36 <= 0; var36++) {
                        int var37 = class58.field865 + var36;
                        int var38 = class58.field865 - var36;
                        if (var34 >= class117.field1841) {
                            if (var37 >= class102.field1580) {
                                class99 var39 = var32[var34][var37];
                                if (var39 != null && var39.field1485) {
                                    class175.method1271(var39, true);
                                }
                            }
                            if (var38 < class29.field335) {
                                class99 var40 = var32[var34][var38];
                                if (var40 != null && var40.field1485) {
                                    class175.method1271(var40, true);
                                }
                            }
                        }
                        if (var35 < class90.field1311) {
                            if (var37 >= class102.field1580) {
                                class99 var41 = var32[var35][var37];
                                if (var41 != null && var41.field1485) {
                                    class175.method1271(var41, true);
                                }
                            }
                            if (var38 < class29.field335) {
                                class99 var42 = var32[var35][var38];
                                if (var42 != null && var42.field1485) {
                                    class175.method1271(var42, true);
                                }
                            }
                        }
                        if (class178.field2669 == 0) {
                            if (!var22) {
                                class244.field3682 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class112.field1759; var43 < class136.field2126; var43++) {
            class99[][] var44 = class250.field3746[var43];
            for (int var45 = -class293.field4601; var45 <= 0; var45++) {
                int var46 = class310.field4837 + var45;
                int var47 = class310.field4837 - var45;
                if (var46 >= class117.field1841 || var47 < class90.field1311) {
                    for (int var48 = -class293.field4601; var48 <= 0; var48++) {
                        int var49 = class58.field865 + var48;
                        int var50 = class58.field865 - var48;
                        if (var46 >= class117.field1841) {
                            if (var49 >= class102.field1580) {
                                class99 var51 = var44[var46][var49];
                                if (var51 != null && var51.field1485) {
                                    class175.method1271(var51, false);
                                }
                            }
                            if (var50 < class29.field335) {
                                class99 var52 = var44[var46][var50];
                                if (var52 != null && var52.field1485) {
                                    class175.method1271(var52, false);
                                }
                            }
                        }
                        if (var47 < class90.field1311) {
                            if (var49 >= class102.field1580) {
                                class99 var53 = var44[var47][var49];
                                if (var53 != null && var53.field1485) {
                                    class175.method1271(var53, false);
                                }
                            }
                            if (var50 < class29.field335) {
                                class99 var54 = var44[var47][var50];
                                if (var54 != null && var54.field1485) {
                                    class175.method1271(var54, false);
                                }
                            }
                        }
                        if (class178.field2669 == 0) {
                            if (!var22) {
                                class244.field3682 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class244.field3682 = false;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)V", line = 562)
    public static void method1035(byte arg0) {
        field2112 = null;
        if (arg0 >= -25) {
            field2103 = -81;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 575)
    public static final void method1036(String arg0, int arg1) {
        if (arg1 <= 89) {
            field2102 = 32;
        }
        field2104++;
        class208.method1485(128, false);
        class121.method934(-69, arg0);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)[[I", line = 600)
    public final int[][] method99(int arg0, int arg1) {
        field2109++;
        if (arg1 != -23387) {
            method1033((class288) null, -71);
        }
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (this.field2645.field3203) {
            int[][] var4 = this.method1285(0, arg0, 27847);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class287.field4415; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field2114[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field2116 >= var13) {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field2114[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field2116 >= var15) {
                        int var16 = var8[var11];
                        int var17 = var16 - this.field2114[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field2116) {
                            var7[var11] = this.field2105 * var12 >> 12;
                            var9[var11] = this.field2111 * var14 >> 12;
                            var10[var11] = this.field2115 * var16 >> 12;
                        } else {
                            var7[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        }
                    } else {
                        var7[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var8[var11];
                    }
                } else {
                    var7[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var8[var11];
                }
            }
        }
        return var3;
    }
}
