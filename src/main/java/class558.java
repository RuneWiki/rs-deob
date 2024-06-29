import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class558 {

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public static int field7854 = 0;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILsba;Lha;II)V")
    public static final void method3157(int arg0, class218 arg1, class60 arg2, int arg3, int arg4) {
        field7857++;
        class487 var5 = arg1.method1236(arg2, arg0 + 117);
        if (var5 == null) {
            return;
        }
        arg2.method426(arg3, arg4, arg1.field2781 + arg3, arg1.field2718 + arg4);
        if (class168.field2101 == 2 || class168.field2101 == 5 || class480.field6631 == null) {
            arg2.method365(-16777216, var5, arg3, arg4);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class8.field57 == 4) {
                var6 = class86.field1179;
                var7 = class232.field2981;
                var8 = 4096;
                var9 = (int) (-class183.field2237) & 0x3FFF;
            } else {
                var8 = 4096 - (class283.field3747 * 16);
                var6 = class653.field9086.field2170;
                var9 = (int) (-class183.field2237) + class514.field6956 & 0x3FFF;
                var7 = class653.field9086.field2165;
            }
            int var10 = var6 / 128 + 48 - ((class272.field3589 - 104) * 2);
            int var11 = 48 - (var7 / 128) - (-(class3.field26 * 4) - -(class3.field26 * 2) - 208);
            class480.field6631.method3864((float) arg1.field2781 / 2.0F + (float) arg3, (float) arg1.field2718 / 2.0F + (float) arg4, (float) var10, (float) var11, var8, var9 << 2, var5, arg3, arg4);
            for (class629 var12 = (class629) class110.field1462.method724(32); var12 != null; var12 = (class629) class110.field1462.method723(arg0 ^ 0x64)) {
                int var58 = var12.field8775;
                int var59 = (class330.field4451.field1740[var58] >> 14 & 0x3FFF) - class99.field1313;
                int var60 = (class330.field4451.field1740[var58] & 0x3FFF) - class133.field1704;
                int var61 = var59 * 4 + 2 - (var6 / 128);
                int var62 = var60 * 4 + 2 - var7 / 128;
                class159.method952(var61, class330.field4451.field1745[var58], arg4, var5, arg2, arg0 ^ 0x8668008A, arg1, arg3, var62);
            }
            for (int var13 = 0; var13 < class3.field33; var13++) {
                int var55 = class37.field388[var13] * 4 + 2 - (var6 / 128);
                int var56 = class348.field4631[var13] * 4 + 2 - (var7 / 128);
                class685 var57 = class707.field9894.method4109(class262.field3432[var13], (byte) 119);
                if (var57.field9528 != null) {
                    var57 = var57.method3875(class386.field5455, (byte) -95);
                    if (var57 == null || var57.field9566 == -1) {
                        continue;
                    }
                }
                class159.method952(var55, var57.field9566, arg4, var5, arg2, -2040004466, arg1, arg3, var56);
            }
            for (class270 var14 = (class270) class472.field6537.method2560(97); var14 != null; var14 = (class270) class472.field6537.method2557(-1)) {
                int var50 = (int) (var14.field556 >> 28 & 0x3L);
                if (class445.field6185 == var50) {
                    int var51 = (int) (var14.field556 & 0x3FFFL) - class99.field1313;
                    int var52 = (int) (var14.field556 >> 14 & 0x3FFFL) - class133.field1704;
                    int var53 = var51 * 4 + 2 - (var6 / 128);
                    int var54 = var52 * 4 + 2 - (var7 / 128);
                    class51.method301(arg4, var54, arg3, arg1, var5, var53, (byte) -24, class203.field2413[0]);
                }
            }
            for (int var15 = 0; var15 < class84.field1169; var15++) {
                class706 var45 = (class706) class681.field9475.method2552((long) class665.field9261[var15], arg0 - 5);
                if (var45 != null) {
                    class215 var46 = var45.field9890;
                    if (var46.method1198((byte) 106) && class653.field9086.field2175 == var46.field2175) {
                        class274 var47 = var46.field2589;
                        if (var47 != null && var47.field3616 != null) {
                            var47 = var47.method1637(class386.field5455, (byte) 78);
                        }
                        if (var47 != null && var47.field3652 && var47.field3624) {
                            int var48 = var46.field2170 / 128 - var6 / 128;
                            int var49 = var46.field2165 / 128 - (var7 / 128);
                            if (var47.field3626 == -1) {
                                class51.method301(arg4, var49, arg3, arg1, var5, var48, (byte) -24, class203.field2413[1]);
                            } else {
                                class159.method952(var48, var47.field3626, arg4, var5, arg2, -2040004466, arg1, arg3, var49);
                            }
                        }
                    }
                }
            }
            int var16 = class427.field6032;
            int[] var17 = class619.field8682;
            for (int var18 = 0; var18 < var16; var18++) {
                class83 var37 = class361.field4793[var17[var18]];
                if (var37 != null && var37.method607((byte) 106) && !var37.field1126 && class653.field9086 != var37 && class653.field9086.field2175 == var37.field2175) {
                    int var38 = var37.field2170 / 128 - (var6 / 128);
                    int var39 = var37.field2165 / 128 - (var7 / 128);
                    boolean var40 = false;
                    for (int var41 = 0; var41 < class233.field3026; var41++) {
                        if (var37.field1148.equals(class512.field6935[var41]) && class48.field490[var41] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var42 = false;
                    for (int var43 = 0; var43 < class170.field2122; var43++) {
                        if (var37.field1148.equals(class723.field10093[var43].field9660)) {
                            var42 = true;
                            break;
                        }
                    }
                    boolean var44 = false;
                    if (class653.field9086.field1133 != 0 && var37.field1133 != 0 && class653.field9086.field1133 == var37.field1133) {
                        var44 = true;
                    }
                    if (var37.field1142) {
                        class51.method301(arg4, var39, arg3, arg1, var5, var38, (byte) -24, class203.field2413[6]);
                    } else if (var40) {
                        class51.method301(arg4, var39, arg3, arg1, var5, var38, (byte) -24, class203.field2413[3]);
                    } else if (var42) {
                        class51.method301(arg4, var39, arg3, arg1, var5, var38, (byte) -24, class203.field2413[5]);
                    } else if (var44) {
                        class51.method301(arg4, var39, arg3, arg1, var5, var38, (byte) -24, class203.field2413[4]);
                    } else {
                        class51.method301(arg4, var39, arg3, arg1, var5, var38, (byte) -24, class203.field2413[2]);
                    }
                }
            }
            class641[] var19 = class475.field6572;
            for (int var20 = 0; var20 < var19.length; var20++) {
                class641 var23 = var19[var20];
                if (var23 != null && var23.field8921 != 0 && (class406.field5732 % 20) < 10) {
                    if (var23.field8921 == 1) {
                        class706 var24 = (class706) class681.field9475.method2552((long) var23.field8918, -1);
                        if (var24 != null) {
                            class215 var25 = var24.field9890;
                            int var26 = var25.field2170 / 128 - var6 / 128;
                            int var27 = var25.field2165 / 128 - var7 / 128;
                            class27.method103(var23.field8913, var5, var27, var26, arg1, arg4, 360000L, arg3, 4);
                        }
                    }
                    if (var23.field8921 == 2) {
                        int var28 = var23.field8910 / 128 - (var6 / 128);
                        int var29 = var23.field8922 / 128 - (var7 / 128);
                        long var30 = (long) (var23.field8912 << 7);
                        long var32 = var30 * var30;
                        class27.method103(var23.field8913, var5, var29, var28, arg1, arg4, var32, arg3, 4);
                    }
                    if (var23.field8921 == 10 && var23.field8918 >= 0 && var23.field8918 < class361.field4793.length) {
                        class83 var34 = class361.field4793[var23.field8918];
                        if (var34 != null) {
                            int var35 = var34.field2170 / 128 - var6 / 128;
                            int var36 = var34.field2165 / 128 - (var7 / 128);
                            class27.method103(var23.field8913, var5, var36, var35, arg1, arg4, 360000L, arg3, 4);
                        }
                    }
                }
            }
            if (class8.field57 != 4) {
                if (class476.field6576 != 0) {
                    int var21 = class476.field6576 * 4 + (class653.field9086.method543(0) + -1) * 2 + 2 - (var6 / 128);
                    int var22 = class98.field1303 * 4 + (((class653.field9086.method543(arg0 ^ 0x4) - 1) * 2) + 2 - var7 / 128);
                    class51.method301(arg4, var22, arg3, arg1, var5, var21, (byte) -24, class577.field8098[class50.field530 ? 1 : 0]);
                }
                if (!class653.field9086.field1126) {
                    arg2.method368(3, 3, arg1.field2718 / 2 + arg4 - 1, -1, (byte) -66, arg3 - (1 - (arg1.field2781 / 2)));
                }
            }
        }
        if (arg0 != 4) {
            field7855 = 36;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IZ)V")
    public static final void method3158(int arg0, boolean arg1) {
        if (arg0 != -546) {
            return;
        }
        field7856++;
        int var2 = class295.field3974;
        int var3 = class608.field8499;
        if (arg1 && class670.field9312) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class21.field142.method349(var3, var2);
    }
}
