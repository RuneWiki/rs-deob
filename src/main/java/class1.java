import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class1 {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Lgw;")
    private class690 field6 = new class690(128);

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "Lgw;")
    public class690 field16 = new class690(64);

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Luu;")
    private class237 field9;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Luu;")
    public class237 field5;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field3 = 0;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "Z")
    public static boolean field12 = false;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Lda;")
    public static class402 field14;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
    public static final int method1(int arg0, int arg1) {
        if (arg1 == 21045) {
            field1++;
            return arg0 & 0xFF;
        } else {
            return 79;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
    public final void method2(int arg0, byte arg1) {
        field10++;
        class690 var3 = this.field6;
        synchronized (this.field6) {
            this.field6.method3896(1, arg0);
        }
        class690 var4 = this.field16;
        synchronized (this.field16) {
            this.field16.method3896(1, arg0);
        }
        int var5 = 73 / ((arg1 - 26) / 45);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lha;IIZLuv;)V")
    public static final void method3(class548 arg0, int arg1, int arg2, boolean arg3, class755 arg4) {
        field15++;
        class573 var5 = arg4.method4186(arg0, -126);
        if (var5 == null) {
            return;
        }
        arg0.method1544(arg2, arg1, arg4.field10393 + arg2, arg1 - -arg4.field10501);
        if (class728.field10131 == 2 || class728.field10131 == 5 || class555.field7741 == null) {
            arg0.method1402(-16777216, var5, arg2, arg1);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class720.field10023 == 4) {
                var6 = class43.field532;
                var7 = (int) (-class596.field8093) & 0x3FFF;
                var9 = class544.field7541;
                var8 = 4096;
            } else {
                var6 = class388.field5601.field4410;
                var7 = (int) (-class596.field8093) + class439.field6126 & 0x3FFF;
                var8 = 4096 - class31.field372 * 16;
                var9 = class388.field5601.field4418;
            }
            int var10 = var6 / 128 + 48 + 208 - (class277.field4036 * 2);
            int var11 = class667.field9202 * 4 + 48 + 208 - (var9 / 128) - (class667.field9202 * 2);
            class555.field7741.method1956((float) arg4.field10393 / 2.0F + (float) arg2, (float) arg4.field10501 / 2.0F + (float) arg1, (float) var10, (float) var11, var8, var7 << 2, var5, arg2, arg1);
            for (class27 var12 = (class27) class80.field1149.method3618(-114); var12 != null; var12 = (class27) class80.field1149.method3619(0)) {
                int var58 = var12.field347;
                int var59 = (class643.field8616.field5275[var58] >> 14 & 0x3FFF) - class113.field1509;
                int var60 = (class643.field8616.field5275[var58] & 0x3FFF) - class587.field7995;
                int var61 = var59 * 4 + 2 - (var6 / 128);
                int var62 = var60 * 4 + 2 - var9 / 128;
                class142.method935(arg4, var61, var5, 2, arg0, arg1, var62, arg2, class643.field8616.field5274[var58]);
            }
            for (int var13 = 0; var13 < class746.field10254; var13++) {
                int var55 = class274.field3974[var13] * 4 + 2 - var6 / 128;
                int var56 = class303.field4287[var13] * 4 + 2 - (var9 / 128);
                class220 var57 = class20.field192.method716(6, class621.field8310[var13]);
                if (var57.field2966 != null) {
                    var57 = var57.method1297(class124.field1712, 21559);
                    if (var57 == null || var57.field2901 == -1) {
                        continue;
                    }
                }
                class142.method935(arg4, var55, var5, 2, arg0, arg1, var56, arg2, var57.field2901);
            }
            for (class662 var14 = (class662) class541.field7521.method821((byte) 109); var14 != null; var14 = (class662) class541.field7521.method818(29)) {
                int var50 = (int) (var14.field1079 >> 28 & 0x3L);
                if (class570.field7877 == var50) {
                    int var51 = (int) (var14.field1079 & 0x3FFFL) - class113.field1509;
                    int var52 = (int) (var14.field1079 >> 14 & 0x3FFFL) - class587.field7995;
                    int var53 = var51 * 4 + 2 - (var6 / 128);
                    int var54 = var52 * 4 + 2 - (var9 / 128);
                    class381.method2388(arg4, arg2, var5, var54, var53, (byte) 114, arg1, class349.field4955[0]);
                }
            }
            for (int var15 = 0; var15 < class262.field3837; var15++) {
                class234 var45 = (class234) class372.field5245.method812(105, (long) class446.field6192[var15]);
                if (var45 != null) {
                    class679 var46 = var45.field3471;
                    if (var46.method3820(-83) && class388.field5601.field4408 == var46.field4408) {
                        class123 var47 = var46.field9436;
                        if (var47 != null && var47.field1700 != null) {
                            var47 = var47.method773(class124.field1712, false);
                        }
                        if (var47 != null && var47.field1648 && var47.field1647) {
                            int var48 = var46.field4410 / 128 - (var6 / 128);
                            int var49 = var46.field4418 / 128 - (var9 / 128);
                            if (var47.field1645 == -1) {
                                class381.method2388(arg4, arg2, var5, var49, var48, (byte) 94, arg1, class349.field4955[1]);
                            } else {
                                class142.method935(arg4, var48, var5, 2, arg0, arg1, var49, arg2, var47.field1645);
                            }
                        }
                    }
                }
            }
            int var16 = class209.field2736;
            int[] var17 = class344.field4898;
            for (int var18 = 0; var18 < var16; var18++) {
                class96 var37 = class251.field3675[var17[var18]];
                if (var37 != null && var37.method655(-27) && !var37.field1328 && class388.field5601 != var37 && class388.field5601.field4408 == var37.field4408) {
                    int var38 = var37.field4410 / 128 - (var6 / 128);
                    int var39 = var37.field4418 / 128 - (var9 / 128);
                    boolean var40 = false;
                    for (int var41 = 0; var41 < class239.field3558; var41++) {
                        if (var37.field1313.equals(class193.field2627[var41]) && class88.field1246[var41] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var42 = false;
                    for (int var43 = 0; var43 < class691.field9619; var43++) {
                        if (var37.field1313.equals(class623.field8402[var43].field3655)) {
                            var42 = true;
                            break;
                        }
                    }
                    boolean var44 = false;
                    if (class388.field5601.field1317 != 0 && var37.field1317 != 0 && class388.field5601.field1317 == var37.field1317) {
                        var44 = true;
                    }
                    if (var37.field1351) {
                        class381.method2388(arg4, arg2, var5, var39, var38, (byte) 96, arg1, class349.field4955[6]);
                    } else if (var40) {
                        class381.method2388(arg4, arg2, var5, var39, var38, (byte) 113, arg1, class349.field4955[3]);
                    } else if (var42) {
                        class381.method2388(arg4, arg2, var5, var39, var38, (byte) 96, arg1, class349.field4955[5]);
                    } else if (var44) {
                        class381.method2388(arg4, arg2, var5, var39, var38, (byte) 95, arg1, class349.field4955[4]);
                    } else {
                        class381.method2388(arg4, arg2, var5, var39, var38, (byte) 125, arg1, class349.field4955[2]);
                    }
                }
            }
            class596[] var19 = class653.field8740;
            for (int var20 = 0; var20 < var19.length; var20++) {
                class596 var23 = var19[var20];
                if (var23 != null && var23.field8081 != 0 && class483.field6741 % 20 < 10) {
                    if (var23.field8081 == 1) {
                        class234 var24 = (class234) class372.field5245.method812(115, (long) var23.field8082);
                        if (var24 != null) {
                            class679 var25 = var24.field3471;
                            int var26 = var25.field4410 / 128 - (var6 / 128);
                            int var27 = var25.field4418 / 128 - (var9 / 128);
                            class606.method3448(var26, 360000L, arg1, var27, arg4, var23.field8077, (byte) 127, var5, arg2);
                        }
                    }
                    if (var23.field8081 == 2) {
                        int var28 = var23.field8086 / 128 - var6 / 128;
                        int var29 = var23.field8080 / 128 - (var9 / 128);
                        long var30 = (long) (var23.field8088 << 7);
                        long var32 = var30 * var30;
                        class606.method3448(var28, var32, arg1, var29, arg4, var23.field8077, (byte) 125, var5, arg2);
                    }
                    if (var23.field8081 == 10 && var23.field8082 >= 0 && var23.field8082 < class251.field3675.length) {
                        class96 var34 = class251.field3675[var23.field8082];
                        if (var34 != null) {
                            int var35 = var34.field4410 / 128 - var6 / 128;
                            int var36 = var34.field4418 / 128 - (var9 / 128);
                            class606.method3448(var35, 360000L, arg1, var36, arg4, var23.field8077, (byte) 120, var5, arg2);
                        }
                    }
                }
            }
            if (class720.field10023 != 4) {
                if (class486.field6806 != 0) {
                    int var21 = (class486.field6806 * 4 - -((class388.field5601.method662((byte) 15) + -1) * 2)) + 2 - (var6 / 128);
                    int var22 = class171.field2378 * 4 + class388.field5601.method662((byte) 15) * 2 + 2 - (var9 / 128) - 2;
                    class381.method2388(arg4, arg2, var5, var22, var21, (byte) 118, arg1, class289.field4129[class684.field9516 ? 1 : 0]);
                }
                if (!class388.field5601.field1328) {
                    arg0.method3249(arg4.field10393 / 2 + arg2 - 1, 124, 3, 3, -1, arg4.field10501 / 2 + arg1 - 1);
                }
            }
        }
        if (arg3) {
            method7(null);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method4(int arg0) {
        field14 = null;
        if (arg0 != 2) {
            method4(5);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZII)V")
    public final void method5(boolean arg0, int arg1, int arg2) {
        this.field6 = new class690(arg2);
        field11++;
        this.field16 = new class690(arg1);
        if (arg0) {
            method9((byte) 9, null);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public final void method6(int arg0) {
        class690 var2 = this.field6;
        synchronized (this.field6) {
            this.field6.method3902(arg0 ^ arg0);
        }
        field13++;
        class690 var3 = this.field16;
        synchronized (this.field16) {
            this.field16.method3902(0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Luq;)V")
    public static final void method7(class318 arg0) {
        class441.field6132.method1424(arg0.field4410, arg0.field4413 + (arg0.method790(-11692) >> 1), arg0.field4418, class537.field7433);
        arg0.field4417 = class537.field7433[0];
        arg0.field4415 = class537.field7433[1];
        arg0.field4409 = class537.field7433[2];
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([ILdw;III[I)Lnw;")
    public static final class444 method8(int[] arg0, class664 arg1, int arg2, int arg3, int arg4, int[] arg5) {
        field4++;
        if (arg2 > -14) {
            field14 = null;
        }
        byte[] var6 = new byte[arg3 * arg4];
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg3 * var7 + arg5[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class444(arg1, arg3, arg4, var6);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method9(byte arg0, String arg1) {
        field7++;
        class583 var2 = class385.method2413(0);
        var2.field7963.method444(class62.field917.field3032, arg0 ^ 0x81);
        var2.field7963.method492(arg0 - 3, 0);
        if (arg0 != 1) {
            return;
        }
        int var3 = var2.field7963.field956;
        var2.field7963.method492(-2, 641);
        int[] var4 = class702.method3962(-64, var2);
        int var5 = var2.field7963.field956;
        var2.field7963.method510(arg1, (byte) 61);
        var2.field7963.method444(class120.field1576, 128);
        var2.field7963.field956 += 7;
        var2.field7963.method448(var2.field7963.field956, var4, var5, arg0 ^ 0x21);
        var2.field7963.method501(true, var2.field7963.field956 - var3);
        class463.method2838(var2, (byte) 125);
        class332.field4708 = -3;
        class297.field4231 = 0;
        class210.field2748 = 1;
        class527.field7312 = 0;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public final void method10(int arg0) {
        int var2 = -13 / ((arg0 - 67) / 56);
        field8++;
        class690 var3 = this.field6;
        synchronized (this.field6) {
            this.field6.method3906(-113);
        }
        class690 var4 = this.field16;
        synchronized (this.field16) {
            this.field16.method3906(-122);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)Ljo;")
    public final class21 method11(int arg0, int arg1) {
        field2++;
        class690 var3 = this.field6;
        class21 var4;
        synchronized (this.field6) {
            var4 = (class21) this.field6.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -125 / ((arg0 + 45) / 56);
        class237 var6 = this.field9;
        byte[] var7;
        synchronized (this.field9) {
            var7 = this.field9.method1572(36, 0, arg1);
        }
        class21 var8 = new class21();
        var8.field248 = this;
        var8.field245 = arg1;
        if (var7 != null) {
            var8.method116(new class63(var7), (byte) -80);
        }
        var8.method108((byte) 30);
        class690 var9 = this.field6;
        synchronized (this.field6) {
            this.field6.method3899(109, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lgp;ILuu;Luu;)V")
    public class1(class553 arg0, int arg1, class237 arg2, class237 arg3) {
        this.field9 = arg2;
        this.field5 = arg3;
        this.field9.method1597(36, 0);
    }
}
