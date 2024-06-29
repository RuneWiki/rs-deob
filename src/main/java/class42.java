import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Laf;")
    private static class7 field994 = class48.method406(40, ": ");

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field998 = 0;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Laf;")
    private static class7 field1003 = class48.method406(40, "No reply from loginserver)3");

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Laf;")
    private static class7 field997 = class48.method406(40, "Continue");

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
    public static int[] field996 = new int[100];

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field1009 = 0;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Laf;")
    public static class7 field1019 = class48.method406(40, "<col=ffff00>*V");

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "Laf;")
    public static class7 field1017 = field997;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public static int field1015 = 50;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[I")
    public static int[] field1001 = new int[field1015];

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "[I")
    public static int[] field1005 = new int[field1015];

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "[Laf;")
    public static class7[] field1006 = new class7[field1015];

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field1012 = 0;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Laf;")
    public static class7 field993 = class48.method406(40, ")1j");

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "[I")
    public static int[] field1011 = new int[field1015];

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
    public static int[] field995 = new int[field1015];

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "[I")
    public static int[] field1013 = new int[field1015];

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Laf;")
    public static class7 field1007 = field1003;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "[I")
    public static int[] field1010 = new int[field1015];

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "[I")
    public static int[] field1022 = new int[field1015];

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([Laf;I)[Laf;")
    public static final class7[] method369(class7[] arg0, int arg1) {
        field1016++;
        class7[] var2 = new class7[5];
        if (arg1 != 8) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class116.method905(new class7[] { class51.method421((byte) 119, var3), field994 }, 1);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class116.method905(new class7[] { var2[var3], arg0[var3] }, arg1 - 7);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method370(int arg0) {
        field1011 = null;
        if (arg0 != -3) {
            field1003 = null;
        }
        field1003 = null;
        field997 = null;
        field1019 = null;
        field1022 = null;
        field1001 = null;
        field1006 = null;
        field993 = null;
        field994 = null;
        field1005 = null;
        field1010 = null;
        field995 = null;
        field996 = null;
        field1017 = null;
        field1013 = null;
        field1007 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)V")
    public static final void method371(byte arg0, int arg1, int arg2) {
        field1002++;
        long var3 = (long) ((arg1 << 16) + arg2);
        int var5 = 63 / ((53 - arg0) / 60);
        class109 var6 = (class109) class108.field2631.method126(var3, (byte) 117);
        if (var6 != null) {
            class7.field143.method259(var6, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([BI)V")
    public static final void method372(byte[] arg0, int arg1) {
        field1000++;
        class122 var2 = new class122(arg0);
        var2.field2903 = arg0.length - 2;
        class49.field1177 = var2.method965(false);
        class51.field1234 = new int[class49.field1177];
        class82.field1879 = new byte[class49.field1177][];
        class86.field2005 = new int[class49.field1177];
        class127.field3059 = new int[class49.field1177];
        class84.field1990 = new int[class49.field1177];
        var2.field2903 = arg0.length - class49.field1177 * 8 - 7;
        class12.field310 = var2.method965(false);
        class136.field3249 = var2.method965(false);
        int var3 = (var2.method931((byte) 124) & 0xFF) + 1;
        for (int var4 = 0; var4 < class49.field1177; var4++) {
            class84.field1990[var4] = var2.method965(false);
        }
        for (int var5 = 0; var5 < class49.field1177; var5++) {
            class51.field1234[var5] = var2.method965(false);
        }
        for (int var6 = 0; var6 < class49.field1177; var6++) {
            class127.field3059[var6] = var2.method965(false);
        }
        for (int var7 = 0; var7 < class49.field1177; var7++) {
            class86.field2005[var7] = var2.method965(false);
        }
        var2.field2903 = arg0.length + 3 - class49.field1177 * 8 - var3 * 3 - 7;
        if (arg1 != -2) {
            return;
        }
        class27.field697 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class27.field697[var8] = var2.method953(92);
            if (class27.field697[var8] == 0) {
                class27.field697[var8] = 1;
            }
        }
        var2.field2903 = 0;
        for (int var9 = 0; var9 < class49.field1177; var9++) {
            int var10 = class86.field2005[var9];
            int var11 = class127.field3059[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class82.field1879[var9] = var13;
            int var14 = var2.method931((byte) 124);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method977(true);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var10; var17++) {
                        var13[var11 * var17 + var16] = var2.method977(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method373(byte arg0, int arg1) {
        field1008++;
        if (arg1 == 100 && class48.field1171 > 0) {
            byte[] var2 = class46.field1100[--class48.field1171];
            class46.field1100[class48.field1171] = null;
            return var2;
        } else if (arg1 == 5000 && class75.field1749 > 0) {
            byte[] var3 = class74.field1728[--class75.field1749];
            class74.field1728[class75.field1749] = null;
            return var3;
        } else {
            if (arg0 != 116) {
                field1012 = -106;
            }
            if (arg1 == 30000 && class123.field2933 > 0) {
                byte[] var4 = class18.field419[--class123.field2933];
                class18.field419[class123.field2933] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
    public static final byte[] method374(Object arg0, byte arg1, boolean arg2) {
        field1014++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class4.method22((byte) 107, var3) : var3;
        } else if (arg0 instanceof class48) {
            class48 var4 = (class48) arg0;
            return var4.method405(-94);
        } else {
            if (arg1 != -84) {
                method372(null, 93);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(BI)V")
    public static final void method375(byte arg0, int arg1) {
        if (arg0 != 116) {
            method369(null, -68);
        }
        field999++;
        class2 var2 = (class2) class68.field1479.method126((long) arg1, (byte) 38);
        if (var2 != null) {
            var2.method1124((byte) 62);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)I")
    public static final int method376(boolean arg0) {
        field1020++;
        int var1 = 3;
        if (class127.field3056 < 310) {
            int var2 = class75.field1753 >> 7;
            int var3 = class143.field3392 >> 7;
            int var4 = class21.field531.field491 >> 7;
            int var5 = class21.field531.field505 >> 7;
            if ((class25.field670[class8.field186][var2][var3] & 0x4) != 0) {
                var1 = class8.field186;
            }
            int var6;
            if (var2 >= var5) {
                var6 = var2 - var5;
            } else {
                var6 = var5 - var2;
            }
            int var7;
            if (var3 < var4) {
                var7 = var4 - var3;
            } else {
                var7 = var3 - var4;
            }
            if (var6 <= var7) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var3 != var4) {
                    var9 += var8;
                    if (var4 > var3) {
                        var3++;
                    } else if (var3 > var4) {
                        var3--;
                    }
                    if ((class25.field670[class8.field186][var2][var3] & 0x4) != 0) {
                        var1 = class8.field186;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var5 > var2) {
                            var2++;
                        } else if (var2 > var5) {
                            var2--;
                        }
                        if ((class25.field670[class8.field186][var2][var3] & 0x4) != 0) {
                            var1 = class8.field186;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var6;
                int var11 = 32768;
                while (var2 != var5) {
                    var11 += var10;
                    if (var2 < var5) {
                        var2++;
                    } else if (var5 < var2) {
                        var2--;
                    }
                    if ((class25.field670[class8.field186][var2][var3] & 0x4) != 0) {
                        var1 = class8.field186;
                    }
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var3 < var4) {
                            var3++;
                        } else if (var3 > var4) {
                            var3--;
                        }
                        if ((class25.field670[class8.field186][var2][var3] & 0x4) != 0) {
                            var1 = class8.field186;
                        }
                    }
                }
            }
        }
        if ((class25.field670[class8.field186][class21.field531.field505 >> 7][class21.field531.field491 >> 7] & 0x4) != 0) {
            var1 = class8.field186;
        }
        if (arg0) {
            field1015 = -33;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Z")
    public static final boolean method377(int arg0) {
        field1021++;
        long var1 = class55.method445(arg0);
        int var3 = (int) (var1 - class96.field2281);
        class96.field2281 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class39.field969 += var3;
        if (class102.field2420 == 0 && class2.field19 == 0 && class83.field1943 == 0 && class64.field1418 == 0) {
            return true;
        } else if (class2.field16 == null) {
            return false;
        } else {
            try {
                if (class39.field969 > 30000) {
                    throw new IOException();
                }
                while (class2.field19 < 20 && class64.field1418 > 0) {
                    class109 var4 = (class109) class89.field2068.method127(-41);
                    class122 var5 = new class122(4);
                    var5.method959(1, (byte) -120);
                    var5.method982((int) var4.field3261, (byte) 58);
                    class2.field16.method1178(4, (byte) 77, 0, var5.field2895);
                    class10.field255.method130(105, var4, var4.field3261);
                    class2.field19++;
                    class64.field1418--;
                }
                while (class102.field2420 < 20 && class83.field1943 > 0) {
                    class109 var6 = (class109) class7.field143.method258(true);
                    class122 var7 = new class122(4);
                    var7.method959(0, (byte) -120);
                    var7.method982((int) var6.field3261, (byte) 58);
                    class2.field16.method1178(4, (byte) 82, 0, var7.field2895);
                    var6.method818((byte) -118);
                    client.field551.method130(89, var6, var6.field3261);
                    class102.field2420++;
                    class83.field1943--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class2.field16.method1175((byte) -113);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class39.field969 = 0;
                    byte var10 = 0;
                    if (class54.field1323 == null) {
                        var10 = 8;
                    } else if (class111.field2667 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class67.field1470.field2903;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class2.field16.method1176(-1549, class67.field1470.field2895, var11, class67.field1470.field2903);
                        if (class143.field3397 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class67.field1470.field2895[class67.field1470.field2903 + var12] = (byte) class96.method785(class67.field1470.field2895[class67.field1470.field2903 + var12], class143.field3397);
                            }
                        }
                        class67.field1470.field2903 += var11;
                        if (var10 > class67.field1470.field2903) {
                            break;
                        }
                        if (class54.field1323 == null) {
                            class67.field1470.field2903 = 0;
                            int var13 = class67.field1470.method931((byte) 124);
                            int var14 = class67.field1470.method965(false);
                            int var15 = class67.field1470.method931((byte) 124);
                            int var16 = class67.field1470.method972(arg0 + 60);
                            long var17 = (long) ((var13 << 16) + var14);
                            class109 var19 = (class109) class10.field255.method126(var17, (byte) -127);
                            class27.field717 = true;
                            if (var19 == null) {
                                var19 = (class109) client.field551.method126(var17, (byte) 69);
                                class27.field717 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class54.field1323 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class116.field2772 = new class122(class54.field1323.field2663 + var20 + var16);
                            class116.field2772.method959(var15, (byte) -120);
                            class116.field2772.method970((byte) -96, var16);
                            class111.field2667 = 8;
                            class67.field1470.field2903 = 0;
                        } else if (class111.field2667 == 0) {
                            if (class67.field1470.field2895[0] == -1) {
                                class111.field2667 = 1;
                                class67.field1470.field2903 = 0;
                            } else {
                                class54.field1323 = null;
                            }
                        }
                    } else {
                        int var21 = 512 - class111.field2667;
                        int var22 = class116.field2772.field2895.length - class54.field1323.field2663;
                        if (var21 > var22 - class116.field2772.field2903) {
                            var21 = var22 - class116.field2772.field2903;
                        }
                        if (var9 < var21) {
                            var21 = var9;
                        }
                        class2.field16.method1176(-1549, class116.field2772.field2895, var21, class116.field2772.field2903);
                        if (class143.field3397 != 0) {
                            for (int var23 = 0; var23 < var21; var23++) {
                                class116.field2772.field2895[class116.field2772.field2903 + var23] = (byte) class96.method785(class116.field2772.field2895[class116.field2772.field2903 + var23], class143.field3397);
                            }
                        }
                        class111.field2667 += var21;
                        class116.field2772.field2903 += var21;
                        if (class116.field2772.field2903 == var22) {
                            if (class54.field1323.field3261 == 16711935L) {
                                class44.field1043 = class116.field2772;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class118 var26 = class38.field946[var25];
                                    if (var26 != null) {
                                        class44.field1043.field2903 = var25 * 8 + 5;
                                        int var27 = class44.field1043.method972(121);
                                        int var28 = class44.field1043.method972(-95);
                                        var26.method918(var28, -1946, var27);
                                    }
                                }
                            } else {
                                client.field576.reset();
                                client.field576.update(class116.field2772.field2895, 0, var22);
                                int var24 = (int) client.field576.getValue();
                                if (class54.field1323.field2652 != var24) {
                                    try {
                                        class2.field16.method1172((byte) 10);
                                    } catch (Exception var30) {
                                    }
                                    class2.field16 = null;
                                    class92.field2122++;
                                    class143.field3397 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class142.field3338 = 0;
                                class92.field2122 = 0;
                                class54.field1323.field2654.method910((class54.field1323.field3261 & 0xFF0000L) == 16711680L, 1, class27.field717, class116.field2772.field2895, (int) (class54.field1323.field3261 & 0xFFFFL));
                            }
                            class54.field1323.method1124((byte) 62);
                            if (class27.field717) {
                                class2.field19--;
                            } else {
                                class102.field2420--;
                            }
                            class111.field2667 = 0;
                            class54.field1323 = null;
                            class116.field2772 = null;
                        } else {
                            if (class111.field2667 != 512) {
                                break;
                            }
                            class111.field2667 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class2.field16.method1172((byte) 10);
                } catch (Exception var29) {
                }
                class142.field3338++;
                class2.field16 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I")
    public static final int method378(int arg0, int arg1, int arg2) {
        field1018++;
        if (arg2 != 0) {
            return 110;
        }
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }
}
