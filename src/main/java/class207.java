import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class207 {

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "[[I")
    public static int[][] field2722 = new int[128][128];

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Lgda;")
    public static class53 field2724 = new class53(61, 6);

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "[I")
    public static int[] field2720;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1269(boolean arg0) {
        if (!arg0) {
            field2726 = 76;
        }
        field2722 = null;
        field2724 = null;
        field2720 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILha;IILjb;)V", line = 19)
    public static final void method1270(int arg0, class58 arg1, int arg2, int arg3, class493 arg4) {
        if (arg2 != 1) {
            return;
        }
        field2725++;
        class486 var5 = arg4.method2944((byte) 116, arg1);
        if (var5 == null) {
            return;
        }
        arg1.method469(arg3, arg0, arg4.field7095 + arg3, arg4.field7031 + arg0);
        if (class454.field6418 == 2 || class454.field6418 == 5 || class54.field622 == null) {
            arg1.method447(-16777216, var5, arg3, arg0);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class97.field1168 == 4) {
            var6 = class354.field5059;
            var7 = (int) (-class552.field7773) & 0x3FFF;
            var8 = 4096;
            var9 = class711.field9884;
        } else {
            var8 = 4096 - (class180.field2412 * 16);
            var7 = (int) (-class552.field7773) + class535.field7520 & 0x3FFF;
            var6 = class660.field9039.field1250;
            var9 = class660.field9039.field1264;
        }
        int var10 = var9 / 128 + 48 + 208 - (class336.field4683 * 2);
        int var11 = class700.field9768 * 4 + 48 - (var6 / 128) - ((class700.field9768 + -104) * 2);
        class54.field622.method675((float) arg4.field7095 / 2.0F + (float) arg3, (float) arg4.field7031 / 2.0F + (float) arg0, (float) var10, (float) var11, var8, var7 << 2, var5, arg3, arg0);
        for (class756 var12 = (class756) class141.field2028.method2765(-12261); var12 != null; var12 = (class756) class141.field2028.method2759(-15361)) {
            int var58 = var12.field10518;
            int var59 = (class124.field1501.field477[var58] >> 14 & 0x3FFF) - class228.field3063;
            int var60 = (class124.field1501.field477[var58] & 0x3FFF) - class3.field30;
            int var61 = var59 * 4 - (var9 / 128 - 2);
            int var62 = var60 * 4 + 2 - (var6 / 128);
            class48.method309(arg3, class124.field1501.field478[var58], arg0, arg1, arg4, var5, -13, var62, var61);
        }
        for (int var13 = 0; var13 < class353.field4982; var13++) {
            int var55 = class558.field7840[var13] * 4 + 2 - (var9 / 128);
            int var56 = class676.field9242[var13] * 4 + (2 - var6 / 128);
            class10 var57 = class612.field8588.method558((byte) -72, class522.field7397[var13]);
            if (var57.field226 != null) {
                var57 = var57.method67(class101.field1201, 0);
                if (var57 == null || var57.field180 == -1) {
                    continue;
                }
            }
            class48.method309(arg3, var57.field180, arg0, arg1, arg4, var5, arg2 - 14, var56, var55);
        }
        for (class338 var14 = (class338) class178.field2391.method1176(24490); var14 != null; var14 = (class338) class178.field2391.method1178((byte) 71)) {
            int var50 = (int) (var14.field2546 >> 28 & 0x3L);
            if (class674.field9143 == var50) {
                int var51 = (int) (var14.field2546 & 0x3FFFL) - class228.field3063;
                int var52 = (int) (var14.field2546 >> 14 & 0x3FFFL) - class3.field30;
                int var53 = var51 * 4 + 2 - (var9 / 128);
                int var54 = var52 * 4 - ((var6 / 128) - 2);
                class93.method691(-123, arg0, var53, var5, class48.field566[0], var54, arg3, arg4);
            }
        }
        for (int var15 = 0; var15 < class344.field4849; var15++) {
            class740 var45 = (class740) class373.field5230.method1180((byte) 26, (long) class100.field1196[var15]);
            if (var45 != null) {
                class468 var46 = var45.field10289;
                if (var46.method2792(92160000) && class660.field9039.field1266 == var46.field1266) {
                    class353 var47 = var46.field6632;
                    if (var47 != null && var47.field5026 != null) {
                        var47 = var47.method2273((byte) 29, class101.field1201);
                    }
                    if (var47 != null && var47.field4991 && var47.field5046) {
                        int var48 = var46.field1264 / 128 - (var9 / 128);
                        int var49 = var46.field1250 / 128 - (var6 / 128);
                        if (var47.field5040 == -1) {
                            class93.method691(arg2 ^ 0xFFFFFF89, arg0, var48, var5, class48.field566[1], var49, arg3, arg4);
                        } else {
                            class48.method309(arg3, var47.field5040, arg0, arg1, arg4, var5, -13, var49, var48);
                        }
                    }
                }
            }
        }
        int var16 = class578.field8168;
        int[] var17 = class240.field3201;
        for (int var18 = 0; var18 < var16; var18++) {
            class280 var37 = class309.field4311[var17[var18]];
            if (var37 != null && var37.method1834(92160000) && !var37.field3947 && class660.field9039 != var37 && class660.field9039.field1266 == var37.field1266) {
                int var38 = var37.field1264 / 128 - var9 / 128;
                int var39 = var37.field1250 / 128 - (var6 / 128);
                boolean var40 = false;
                for (int var41 = 0; var41 < class215.field2828; var41++) {
                    if (var37.field3965.equals(class703.field9786[var41]) && class533.field7498[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class741.field10299; var43++) {
                    if (var37.field3965.equals(class332.field4625[var43].field362)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class660.field9039.field3987 != 0 && var37.field3987 != 0 && class660.field9039.field3987 == var37.field3987) {
                    var44 = true;
                }
                if (var37.field3985) {
                    class93.method691(-119, arg0, var38, var5, class48.field566[6], var39, arg3, arg4);
                } else if (var40) {
                    class93.method691(-128, arg0, var38, var5, class48.field566[3], var39, arg3, arg4);
                } else if (var42) {
                    class93.method691(-126, arg0, var38, var5, class48.field566[5], var39, arg3, arg4);
                } else if (var44) {
                    class93.method691(-115, arg0, var38, var5, class48.field566[4], var39, arg3, arg4);
                } else {
                    class93.method691(-124, arg0, var38, var5, class48.field566[2], var39, arg3, arg4);
                }
            }
        }
        class584[] var19 = class98.field1180;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class584 var23 = var19[var20];
            if (var23 != null && var23.field8214 != 0 && class740.field10285 % 20 < 10) {
                if (var23.field8214 == 1) {
                    class740 var24 = (class740) class373.field5230.method1180((byte) 26, (long) var23.field8224);
                    if (var24 != null) {
                        class468 var25 = var24.field10289;
                        int var26 = var25.field1264 / 128 - (var9 / 128);
                        int var27 = var25.field1250 / 128 - var6 / 128;
                        class294.method1913(arg3, 2, arg0, var23.field8212, var27, arg4, 360000L, var5, var26);
                    }
                }
                if (var23.field8214 == 2) {
                    int var28 = var23.field8221 / 128 - (var9 / 128);
                    int var29 = var23.field8216 / 128 - var6 / 128;
                    long var30 = (long) (var23.field8225 << 7);
                    long var32 = var30 * var30;
                    class294.method1913(arg3, 2, arg0, var23.field8212, var29, arg4, var32, var5, var28);
                }
                if (var23.field8214 == 10 && var23.field8224 >= 0 && class309.field4311.length > var23.field8224) {
                    class280 var34 = class309.field4311[var23.field8224];
                    if (var34 != null) {
                        int var35 = var34.field1264 / 128 - (var9 / 128);
                        int var36 = var34.field1250 / 128 - (var6 / 128);
                        class294.method1913(arg3, 2, arg0, var23.field8212, var36, arg4, 360000L, var5, var35);
                    }
                }
            }
        }
        if (class97.field1168 == 4) {
            return;
        }
        if (class210.field2763 != 0) {
            int var21 = class210.field2763 * 4 + class660.field9039.method1835((byte) 127) * 2 + 2 - (var9 / 128) - 2;
            int var22 = class656.field8997 * 4 + (-(var6 / 128) - -((class660.field9039.method1835((byte) 127) - 1) * 2)) + 2;
            class93.method691(-122, arg0, var21, var5, class13.field250[class29.field387 ? 1 : 0], var22, arg3, arg4);
        }
        if (!class660.field9039.field3947) {
            arg1.method417(-1, arg4.field7095 / 2 + arg3 - 1, arg0 + -1 - -(arg4.field7031 / 2), (byte) 126, 3, 3);
            return;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 334)
    public static final void method1271(int arg0) {
        class714 var1 = class668.field9073;
        synchronized (class668.field9073) {
            class668.field9073.method4024(0);
            if (arg0 != -1842) {
                method1271(64);
            }
        }
        field2723++;
        class714 var2 = class90.field1079;
        synchronized (class90.field1079) {
            class90.field1079.method4024(0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "toString", descriptor = "()Ljava/lang/String;", line = 360)
    public final String toString() {
        field2721++;
        throw new IllegalStateException();
    }
}
