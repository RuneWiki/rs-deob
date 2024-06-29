import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class90 {

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    private int field1457 = -1;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    private int field1451 = 0;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Le;")
    public static class191 field1454 = class54.method368(")1", 2047);

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Le;")
    public static class191 field1455 = class54.method368("Stufe)2", 2047);

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[I")
    public static int[] field1453 = new int[50];

    @OriginalMember(owner = "client!se", name = "p", descriptor = "[S")
    public static short[] field1466 = new short[256];

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field1473 = -2;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field1460 = 0;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Le;")
    private static class191 field1465 = class54.method368(" has logged out)3", 2047);

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Le;")
    public static class191 field1462 = field1465;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Lng;")
    public static class121 field1471;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILji;I)V")
    public final void method543(int arg0, class225 arg1, int arg2) {
        field1463++;
        if (arg2 != -1) {
            field1460 = 12;
        }
        while (true) {
            int var4 = arg1.method1580(arg2 - 20);
            if (var4 == 0) {
                return;
            }
            this.method548(var4, arg0, arg1, arg2 - 103);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILji;)V")
    public static final void method544(int arg0, class225 arg1) {
        field1472++;
        if ((arg1.field3995.length - arg1.field3996) < 1) {
            return;
        }
        int var2 = arg1.method1580(arg0 - 37);
        if (var2 < 0 || var2 > 3) {
            return;
        }
        byte var3;
        if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field3995.length - arg1.field3996 < var3) {
            return;
        }
        class87.field1421 = arg1.method1580(-29);
        if (class87.field1421 < 1) {
            class87.field1421 = 1;
        } else if (class87.field1421 > 4) {
            class87.field1421 = 4;
        }
        class168.method1135(arg1.method1580(arg0 ^ 0x66) == 1, arg0 ^ 0x6E);
        class183.field3154 = arg1.method1580(-80) == 1;
        class225.field4029 = arg1.method1580(-114) == 1;
        class209.field3721 = arg1.method1580(-24) == 1;
        class41.field729 = arg1.method1580(-117) == 1;
        class127.field2111 = arg1.method1580(-85) == 1;
        class226.field4074 = arg1.method1580(-95) == 1;
        class252.field4472 = arg1.method1580(-25) == 1;
        class102.field1660 = arg1.method1580(-75);
        if (class102.field1660 > 2) {
            class102.field1660 = 2;
        }
        if (~var2 > arg0) {
            class75.field1289 = arg1.method1580(-19) == 1;
            arg1.method1580(-99);
        } else {
            class75.field1289 = arg1.method1580(-100) == 1;
        }
        class213.field3772 = arg1.method1580(-52) == 1;
        class50.field898 = arg1.method1580(-6) == 1;
        class56.field1036 = arg1.method1580(arg0 ^ 0x44);
        if (class56.field1036 > 2) {
            class56.field1036 = 2;
        }
        class126.field2088 = arg1.method1580(-86) == 1;
        class30.field425 = arg1.method1580(arg0 ^ 0xE);
        if (class30.field425 > 127) {
            class30.field425 = 127;
        }
        class255.field4532 = arg1.method1580(arg0 - 22);
        class173.field2904 = arg1.method1580(-57);
        if (class173.field2904 > 127) {
            class173.field2904 = 127;
        }
        if (var2 >= 1) {
            class273.field4836 = arg1.method1593(true);
            class27.field398 = arg1.method1593(true);
        }
        if (var2 >= 3) {
            class61.field1105 = arg1.method1580(-109) == 1;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)V")
    public static final void method545(boolean arg0, int arg1) {
        field1470++;
        byte[][] var2 = class69.field1214;
        if (arg1 != -27996) {
            method549((byte) 112);
        }
        byte var3 = 4;
        for (int var4 = 0; var4 < var3; var4++) {
            class228.method1632((byte) 90);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class273.field4832[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0xFFC528) >> 14;
                            int var10 = (var7 & 0x7) >> 1;
                            int var11 = (var7 & 0x3FFC) >> 3;
                            int var12 = (var9 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class154.field2642.length; var13++) {
                                if (class154.field2642[var13] == var12 && var2[var13] != null) {
                                    class240.method1684(var4, var5 * 8, var2[var13], -22149, var6 * 8, var10, (var11 & 0x7) * 8, var8, (var9 & 0x7) * 8, class82.field1383, arg0);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)Lli;")
    public static final class155 method546(boolean arg0) {
        if (!arg0) {
            method546(true);
        }
        field1467++;
        int var1 = class68.field1183[0] * class47.field842[0];
        byte[] var2 = class161.field2731[0];
        class155 var5;
        if (class240.field4273[0]) {
            byte[] var6 = class61.field1098[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class217.method1476(class19.field261[class167.method1128(255, var2[var8])], class167.method1128(255, var6[var8]) << 24);
            }
            var5 = new class96(class36.field661, class3.field22, class253.field4489[0], class245.field4360[0], class68.field1183[0], class47.field842[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class19.field261[class167.method1128(var2[var4], 255)];
            }
            var5 = new class155(class36.field661, class3.field22, class253.field4489[0], class245.field4360[0], class68.field1183[0], class47.field842[0], var3);
        }
        class228.method1628((byte) 0);
        return var5;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)V")
    private final void method547(byte arg0, int arg1) {
        field1469++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = (double) ((arg1 & 0xFF11) >> 8) / 256.0D;
        double var9 = var3;
        int var11 = 9 % ((-arg0 - 42) / 60);
        if (var7 < var3) {
            var9 = var7;
        }
        if (var5 < var9) {
            var9 = var5;
        }
        double var12 = var3;
        double var14 = 0.0D;
        if (var3 < var7) {
            var12 = var7;
        }
        double var16 = 0.0D;
        if (var5 > var12) {
            var12 = var5;
        }
        double var18 = (var9 + var12) / 2.0D;
        if (var9 != var12) {
            if (var3 == var12) {
                var14 = (var7 - var5) / (var12 - var9);
            } else if (var7 == var12) {
                var14 = (var5 - var3) / (var12 - var9) + 2.0D;
            } else if (var5 == var12) {
                var14 = (var3 - var7) / (var12 - var9) + 4.0D;
            }
            if (var18 < 0.5D) {
                var16 = (var12 - var9) / (var9 + var12);
            }
            if (var18 >= 0.5D) {
                var16 = (var12 - var9) / (2.0D - var12 - var9);
            }
        }
        double var20 = var14 / 6.0D;
        if ((var18 > 0.5D)) {
            this.field1459 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field1459 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field1459 < 1) {
            this.field1459 = 1;
        }
        this.field1468 = (int) ((double) this.field1459 * var20);
        this.field1474 = (int) (var18 * 256.0D);
        this.field1464 = (int) (var16 * 256.0D);
        if (this.field1474 < 0) {
            this.field1474 = 0;
        } else if (this.field1474 > 255) {
            this.field1474 = 255;
        }
        if (this.field1464 < 0) {
            this.field1464 = 0;
        } else if (this.field1464 > 255) {
            this.field1464 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILji;I)V")
    private final void method548(int arg0, int arg1, class225 arg2, int arg3) {
        int var5 = -103 / ((-arg3 - 19) / 60);
        field1461++;
        if (arg0 == 1) {
            this.field1451 = arg2.method1591(2);
            this.method547((byte) 111, this.field1451);
        } else if (arg0 == 2) {
            this.field1457 = arg2.method1593(true);
            if (this.field1457 == 65535) {
                this.field1457 = -1;
                return;
            }
        } else if (arg0 == 3) {
            arg2.method1593(true);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method549(byte arg0) {
        field1453 = null;
        field1455 = null;
        field1454 = null;
        field1471 = null;
        field1465 = null;
        if (arg0 <= 37) {
            field1454 = null;
        }
        field1462 = null;
        field1466 = null;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static final void method550(byte arg0) {
        field1452++;
        for (int var1 = 0; var1 < class249.field4422; var1++) {
            int var10002 = field1453[var1]--;
            if (field1453[var1] >= -10) {
                class77 var4 = class129.field2149[var1];
                if (var4 == null) {
                    var4 = class77.method497(class137.field2303, class253.field4480[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    field1453[var1] += var4.method496();
                    class129.field2149[var1] = var4;
                }
                if (field1453[var1] < 0) {
                    int var11;
                    if (class21.field287[var1] == 0) {
                        var11 = class30.field425;
                    } else {
                        int var5 = (class21.field287[var1] & 0xFF9538) >> 16;
                        int var6 = (class21.field287[var1] & 0xFF) * 128;
                        int var7 = (class21.field287[var1] & 0xFFF0) >> 8;
                        int var8 = var5 * 128 + 64 - class175.field2946.field3003;
                        int var9 = var7 * 128 + 64 - class175.field2946.field2972;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var8 + var9 - 128;
                        if (var10 > var6) {
                            field1453[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var11 = (var6 - var10) * class173.field2904 / var6;
                    }
                    if (var11 > 0) {
                        class103 var12 = var4.method498().method647(class128.field2124);
                        class116 var13 = class116.method754(var12, 100, var11);
                        var13.method770(class245.field4355[var1] - 1);
                        class270.field4764.method502(var13);
                    }
                    field1453[var1] = -100;
                }
            } else {
                class249.field4422--;
                for (int var3 = var1; var3 < class249.field4422; var3++) {
                    class253.field4480[var3] = class253.field4480[var3 + 1];
                    class129.field2149[var3] = class129.field2149[var3 + 1];
                    class245.field4355[var3] = class245.field4355[var3 + 1];
                    field1453[var3] = field1453[var3 + 1];
                    class21.field287[var3] = class21.field287[var3 + 1];
                }
                var1--;
            }
        }
        int var2 = 56 / ((-arg0 - 54) / 52);
        if (class141.field2360 && !class45.method310(-9488)) {
            if (class255.field4532 != 0 && class11.field128 != -1) {
                class184.method1249((byte) -80, 0, class11.field128, class102.field1653, false, class255.field4532);
            }
            class141.field2360 = false;
        } else if (class255.field4532 != 0 && class11.field128 != -1 && !class45.method310(-9488)) {
            class223.field3979++;
            class53.field963.method1096(216, 0);
            class53.field963.method1576(30289, class11.field128);
            class11.field128 = -1;
        }
    }
}
