import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class333 {

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "Luv;")
    public static class333 field4426 = new class333();

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "Luv;")
    public static class333 field4430 = new class333();

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "Luv;")
    public static class333 field4431 = new class333();

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "Luv;")
    public static class333 field4432 = new class333();

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "[I")
    public static int[] field4433 = new int[3];

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    public static int field4434 = 1407;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "Z")
    public static boolean field4435 = false;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    public static int field4436 = -1;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public static void method1928(int arg0) {
        if (arg0 != 750068456) {
            method1928(76);
        }
        field4430 = null;
        field4431 = null;
        field4426 = null;
        field4433 = null;
        field4432 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIILr;)V")
    public static final void method1929(int arg0, int arg1, int arg2, class165 arg3) {
        field4424++;
        if (arg1 < 0 || arg0 < 0 || class149.field1840 == 0 || class196.field2375 == 0) {
            return;
        }
        arg3.method301(class288.field3881, class213.field2652, class149.field1840, class196.field2375);
        arg3.method292(class442.field6297, class96.field1309, class149.field1840, class196.field2375);
        class394 var4 = arg3.method305();
        var4.method715(class129.field1647, class466.field6491, class59.field931, class188.field2296, class141.field1769, class180.field2214);
        arg3.method262(var4);
        if (class399.field5631 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg3.method260();
            int var8 = (arg1 - class288.field3881) * var7 / class149.field1840;
            int var9 = (arg0 - class213.field2652) * var7 / class196.field2375;
            int var10 = arg3.method287();
            int var11 = (arg1 - class288.field3881) * var10 / class149.field1840;
            int var12 = (arg0 - class213.field2652) * var10 / class196.field2375;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method709(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method709(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && class473.field6604 > var20 && class205.field2465 > var22) {
                    int var23 = class206.field2472.field532;
                    if (var23 < 3 && (class73.field1104[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class399.field5631[var23].method428(true, var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class206.field2472.method1284((byte) -124) - 1 << 8) >> 9;
                        var6 = var21 + (class206.field2472.method1284((byte) -124) - 1 << 8) >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class99.field1336 && (class251.field3440 & 0x40) != 0) {
                    class17 var24 = class346.method1981(class391.field5243, class386.field5147, (byte) -116);
                    if (var24 == null) {
                        class415.method2491(74);
                    } else {
                        class240.method1471(0L, -24453, 57, false, -1, class564.field8154, var6, class52.field844, var5, true, " ->");
                    }
                } else {
                    if (class664.field9394) {
                        class240.method1471(0L, -24453, 17, false, -1, -1, var6, class424.field6065.method2561(class370.field4980, 0), var5, true, "");
                    }
                    class240.method1471(0L, -24453, 60, false, -1, class521.field7632, var6, class62.field1000, var5, true, "");
                    class634.field9098++;
                }
            }
        }
        class363 var25 = class196.field2369;
        if (arg2 >= -62) {
            method1928(-66);
        }
        for (class626 var26 = (class626) var25.method2070((byte) 28); var26 != null; var26 = (class626) var25.method2068(-2001)) {
            if ((class570.field8336 || class206.field2472.field532 == var26.field8984.field532) && var26.method3601(arg3, -108, arg0, arg1)) {
                boolean var27 = false;
                boolean var28 = false;
                int var29;
                int var30;
                if (var26.field8984 instanceof class43) {
                    var29 = ((class43) var26.field8984).field769;
                    var30 = ((class43) var26.field8984).field768;
                } else {
                    var30 = var26.field8984.field531 >> 9;
                    var29 = var26.field8984.field530 >> 9;
                }
                if (var26.field8984 instanceof class613) {
                    class613 var31 = (class613) var26.field8984;
                    int var32 = var31.method1284((byte) -124);
                    if ((var32 & 0x1) == 0 && (var31.field530 & 0x1FF) == 0 && (var31.field531 & 0x1FF) == 0 || (var32 & 0x1) == 1 && (var31.field530 & 0x1FF) == 256 && (var31.field531 & 0x1FF) == 256) {
                        int var33 = var31.field530 - (var31.method1284((byte) -124) - 1 << 8);
                        int var34 = var31.field531 - (var31.method1284((byte) -124) - 1 << 8);
                        for (int var35 = 0; var35 < class99.field1332; var35++) {
                            class633 var42 = (class633) class522.field7662.method3678((long) class600.field8658[var35], -120);
                            if (var42 != null) {
                                class557 var43 = var42.field9097;
                                if (class543.field7882 != var43.field2670 && var43.field2597) {
                                    int var44 = var43.field530 - (var43.field8052.field4318 - 1 << 8);
                                    int var45 = var43.field531 - (var43.field8052.field4318 - 1 << 8);
                                    if (var33 <= var44 && var43.field8052.field4318 <= (var31.method1284((byte) -124) - (var44 - var33 >> 9)) && var34 <= var45 && var43.field8052.field4318 <= (var31.method1284((byte) -124) - (var45 - var34 >> 9))) {
                                        class528.method3108((byte) 0, class206.field2472.field532 != var26.field8984.field532, var43);
                                        var43.field2670 = class543.field7882;
                                    }
                                }
                            }
                        }
                        int var36 = class394.field5564;
                        int[] var37 = class82.field1176;
                        for (int var38 = 0; var38 < var36; var38++) {
                            class613 var39 = class184.field2252[var37[var38]];
                            if (var39 != null && class543.field7882 != var39.field2670 && var31 != var39 && var39.field2597) {
                                int var40 = var39.field530 - (var39.method1284((byte) -124) - 1 << 8);
                                int var41 = var39.field531 - (var39.method1284((byte) -124) - 1 << 8);
                                if (var40 >= var33 && var39.method1284((byte) -124) <= (var31.method1284((byte) -124) - (var40 - var33 >> 9)) && var41 >= var34 && var39.method1284((byte) -124) <= var31.method1284((byte) -124) - (var41 - var34 >> 9)) {
                                    class659.method3729(class206.field2472.field532 != var26.field8984.field532, 106, var39);
                                    var39.field2670 = class543.field7882;
                                }
                            }
                        }
                    }
                    if (class543.field7882 == var31.field2670) {
                        continue;
                    }
                    class659.method3729(class206.field2472.field532 != var26.field8984.field532, 105, var31);
                    var31.field2670 = class543.field7882;
                }
                if (var26.field8984 instanceof class557) {
                    class557 var46 = (class557) var26.field8984;
                    if (var46.field8052 != null) {
                        if ((var46.field8052.field4318 & 0x1) == 0 && (var46.field530 & 0x1FF) == 0 && (var46.field531 & 0x1FF) == 0 || (var46.field8052.field4318 & 0x1) == 1 && (var46.field530 & 0x1FF) == 256 && (var46.field531 & 0x1FF) == 256) {
                            int var47 = var46.field530 - (var46.field8052.field4318 - 1 << 8);
                            int var48 = var46.field531 - (var46.field8052.field4318 - 1 << 8);
                            for (int var49 = 0; var49 < class99.field1332; var49++) {
                                class633 var56 = (class633) class522.field7662.method3678((long) class600.field8658[var49], -124);
                                if (var56 != null) {
                                    class557 var57 = var56.field9097;
                                    if (class543.field7882 != var57.field2670 && var46 != var57 && var57.field2597) {
                                        int var58 = var57.field530 - (var57.field8052.field4318 - 1 << 8);
                                        int var59 = var57.field531 - (var57.field8052.field4318 - 1 << 8);
                                        if (var58 >= var47 && (var46.field8052.field4318 - (var58 - var47 >> 9)) >= var57.field8052.field4318 && var48 <= var59 && (var46.field8052.field4318 - (var59 - var48 >> 9)) >= var57.field8052.field4318) {
                                            class528.method3108((byte) 0, class206.field2472.field532 != var26.field8984.field532, var57);
                                            var57.field2670 = class543.field7882;
                                        }
                                    }
                                }
                            }
                            int var50 = class394.field5564;
                            int[] var51 = class82.field1176;
                            for (int var52 = 0; var52 < var50; var52++) {
                                class613 var53 = class184.field2252[var51[var52]];
                                if (var53 != null && class543.field7882 != var53.field2670 && var53.field2597) {
                                    int var54 = var53.field530 - (var53.method1284((byte) -124) - 1 << 8);
                                    int var55 = var53.field531 - (var53.method1284((byte) -124) - 1 << 8);
                                    if (var54 >= var47 && var53.method1284((byte) -124) <= var46.field8052.field4318 - (var54 - var47 >> 9) && var48 <= var55 && var53.method1284((byte) -124) <= (var46.field8052.field4318 - (var55 - var48 >> 9))) {
                                        class659.method3729(class206.field2472.field532 != var26.field8984.field532, 79, var53);
                                        var53.field2670 = class543.field7882;
                                    }
                                }
                            }
                        }
                        if (class543.field7882 == var46.field2670) {
                            continue;
                        }
                        class528.method3108((byte) 0, class206.field2472.field532 != var26.field8984.field532, var46);
                        var46.field2670 = class543.field7882;
                    }
                }
                if (var26.field8984 instanceof class523) {
                    int var60 = class36.field689 + var29;
                    int var61 = class88.field1239 + var30;
                    class507 var62 = (class507) class475.field6655.method3678((long) (var26.field8984.field532 << 28 | var61 << 14 | var60), -121);
                    if (var62 != null) {
                        for (class4 var63 = (class4) var62.field7422.method1140(262144); var63 != null; var63 = (class4) var62.field7422.method1139(67)) {
                            class238 var64 = class65.field1021.method178(false, var63.field25);
                            if (class99.field1336 && class206.field2472.field532 == var26.field8984.field532) {
                                class184 var65 = class19.field524 == -1 ? null : class582.field8483.method2536((byte) -128, class19.field524);
                                if ((class251.field3440 & 0x1) != 0 && (var65 == null || var64.method1459(var65.field2253, -7356, class19.field524) != var65.field2253)) {
                                    class547.field7942++;
                                    class240.method1471((long) var63.field25, -24453, 58, false, -1, class564.field8154, var30, class52.field844, var29, true, class255.field3461 + " -> <col=ff9040>" + var64.field3261);
                                }
                            }
                            if (class206.field2472.field532 == var26.field8984.field532) {
                                String[] var66 = var64.field3208;
                                for (int var67 = 4; var67 >= 0; var67--) {
                                    if (var66 != null && var66[var67] != null) {
                                        byte var68 = 0;
                                        int var69 = class660.field9376;
                                        if (var67 == 0) {
                                            var68 = 6;
                                        }
                                        if (var67 == 1) {
                                            var68 = 23;
                                        }
                                        if (var67 == 2) {
                                            var68 = 45;
                                        }
                                        if (var67 == 3) {
                                            var68 = 12;
                                        }
                                        if (var64.field3248 == var67) {
                                            var69 = var64.field3233;
                                        }
                                        if (var67 == 4) {
                                            var68 = 25;
                                        }
                                        if (var64.field3227 == var67) {
                                            var69 = var64.field3223;
                                        }
                                        class240.method1471((long) var63.field25, -24453, var68, false, -1, var69, var30, var66[var67], var29, true, "<col=ff9040>" + var64.field3261);
                                        class544.field7893++;
                                    }
                                }
                            }
                            class365.field4918++;
                            class240.method1471((long) var63.field25, -24453, 1009, class206.field2472.field532 != var26.field8984.field532, -1, class427.field6138, var30, class424.field6060.method2561(class370.field4980, 0), var29, true, "<col=ff9040>" + var64.field3261);
                        }
                    }
                }
                if (var26.field8984 instanceof class691) {
                    class691 var70 = (class691) var26.field8984;
                    class232 var71 = class37.field703.method807(0, var70.method1072(4378));
                    if (var71.field3094 != null) {
                        var71 = var71.method1412(81, class410.field5804);
                    }
                    if (var71 != null) {
                        if (class99.field1336 && class206.field2472.field532 == var26.field8984.field532) {
                            class184 var72 = class19.field524 == -1 ? null : class582.field8483.method2536((byte) -120, class19.field524);
                            if ((class251.field3440 & 0x4) != 0 && (var72 == null || var71.method1406((byte) 64, var72.field2253, class19.field524) != var72.field2253)) {
                                class498.field6957++;
                                class240.method1471(class393.method2360((byte) 19, var70, var30, var29), -24453, 44, false, -1, class564.field8154, var30, class52.field844, var29, true, class255.field3461 + " -> <col=00ffff>" + var71.field3093);
                            }
                        }
                        if (class206.field2472.field532 == var26.field8984.field532) {
                            String[] var73 = var71.field3061;
                            if (var73 != null) {
                                for (int var74 = 4; var74 >= 0; var74--) {
                                    if (var73[var74] != null) {
                                        short var75 = 0;
                                        int var76 = class660.field9376;
                                        if (var74 == 0) {
                                            var75 = 2;
                                        }
                                        if (var74 == 1) {
                                            var75 = 5;
                                        }
                                        if (var74 == 2) {
                                            var75 = 10;
                                        }
                                        if (var74 == 3) {
                                            var75 = 13;
                                        }
                                        if (var71.field3106 == var74) {
                                            var76 = var71.field3030;
                                        }
                                        if (var74 == 4) {
                                            var75 = 1001;
                                        }
                                        if (var71.field3049 == var74) {
                                            var76 = var71.field3055;
                                        }
                                        class240.method1471(class393.method2360((byte) -104, var70, var30, var29), -24453, var75, false, -1, var76, var30, var73[var74], var29, true, "<col=00ffff>" + var71.field3093);
                                        class401.field5660++;
                                    }
                                }
                            }
                        }
                        class240.method1471((long) var71.field3056, -24453, 1011, class206.field2472.field532 != var26.field8984.field532, -1, class427.field6138, var30, class424.field6060.method2561(class370.field4980, 0), var29, true, "<col=00ffff>" + var71.field3093);
                        class514.field7531++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILifa;[III[I)Lhv;")
    public static final class482 method1930(int arg0, class393 arg1, int[] arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 != -19406) {
            field4430 = null;
        }
        field4429++;
        if (!arg1.method481(class384.field5117, false, class279.field3793)) {
            int[] var10 = new int[arg3 * arg4];
            for (int var11 = 0; var11 < arg4; var11++) {
                int var12 = arg3 * var11 + arg2[var11];
                for (int var13 = 0; var13 < arg5[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class482(arg1, arg3, arg4, var10);
        }
        byte[] var6 = new byte[arg3 * arg4];
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg3 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class482(arg1, arg3, arg4, var6);
    }

    @OriginalMember(owner = "client!uv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4425++;
        throw new IllegalStateException();
    }
}
