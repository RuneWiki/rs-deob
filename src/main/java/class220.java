import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class220 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field3523 = 0;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lck;")
    public static class119 field3520 = class298.method1987((byte) 30, "Spieler");

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
    public static int[] field3526 = new int[25];

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lck;")
    private static class119 field3530 = class298.method1987((byte) 39, "Continue");

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field3528 = 0;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field3529 = 1;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "[I")
    public static int[] field3535 = new int[50];

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lck;")
    public static class119 field3522 = field3530;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "F")
    public static float field3534;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Llh;")
    public static class282 field3533;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Lmd;")
    public static class88 field3532;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "[I")
    public static int[] field3531;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[[[B")
    public static byte[][][] field3525;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 8)
    public static void method1395(int arg0) {
        field3535 = null;
        field3526 = null;
        field3525 = (byte[][][]) null;
        if (arg0 >= -62) {
            field3522 = (class119) null;
        }
        field3531 = null;
        field3522 = null;
        field3533 = null;
        field3532 = null;
        field3530 = null;
        field3520 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 56)
    public static final void method1396(boolean arg0) {
        field3537++;
        try {
            if (class288.field4740 == 0) {
                if (class44.field660 != null) {
                    class44.field660.method1629(-95);
                    class44.field660 = null;
                }
                class63.field1003 = false;
                class85.field1283 = 0;
                class3.field82 = null;
                class288.field4740 = 1;
            }
            if (class288.field4740 == 1) {
                if (class3.field82 == null) {
                    class3.field82 = field3533.method1871(0, class215.field3443, class207.field3292);
                }
                if (class3.field82.field4496 == 2) {
                    throw new IOException();
                }
                if (class3.field82.field4496 == 1) {
                    class44.field660 = new class253((Socket) class3.field82.field4499, field3533);
                    class288.field4740 = 2;
                    class3.field82 = null;
                }
            }
            if (class288.field4740 == 2) {
                long var1 = class227.field3642 = class203.field3216.method786((byte) 112);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class6.field149.field44 = 0;
                class6.field149.method32(14, (byte) -99);
                class6.field149.method32(var3, (byte) -99);
                class44.field660.method1630(0, 2, (byte) -70, class6.field149.field101);
                class22.field333.field44 = 0;
                class288.field4740 = 3;
            }
            if (class288.field4740 == 3) {
                if (class49.field767 != null) {
                    class49.field767.method307(16384);
                }
                if (class195.field3110 != null) {
                    class195.field3110.method307(16384);
                }
                int var4 = class44.field660.method1632((byte) -125);
                if (class49.field767 != null) {
                    class49.field767.method307(16384);
                }
                if (class195.field3110 != null) {
                    class195.field3110.method307(16384);
                }
                if (var4 != 0) {
                    class67.method490(var4, true);
                    return;
                }
                class288.field4740 = 4;
                class22.field333.field44 = 0;
            }
            if (class288.field4740 == 4) {
                if (class22.field333.field44 < 8) {
                    int var5 = class44.field660.method1633(117);
                    if (8 - class22.field333.field44 < var5) {
                        var5 = 8 - class22.field333.field44;
                    }
                    if (var5 > 0) {
                        class44.field660.method1627(class22.field333.field44, (byte) 101, var5, class22.field333.field101);
                        class22.field333.field44 += var5;
                    }
                }
                if (class22.field333.field44 == 8) {
                    class22.field333.field44 = 0;
                    class132.field2014 = class22.field333.method43(-125);
                    class288.field4740 = 5;
                }
            }
            if (class288.field4740 == 5) {
                int[] var6 = new int[4];
                var6[2] = (int) (class132.field2014 >> 32);
                class6.field149.field44 = 0;
                var6[1] = (int) (Math.random() * 9.9999999E7D);
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                var6[3] = (int) class132.field2014;
                class6.field149.method32(10, (byte) -99);
                class6.field149.method26(var6[0], 88);
                class6.field149.method26(var6[1], 36);
                class6.field149.method26(var6[2], 103);
                class6.field149.method26(var6[3], 38);
                class6.field149.method29(2069, class203.field3216.method786((byte) 112));
                class6.field149.method61(false, class203.field3226);
                class6.field149.method66(false, class181.field2875, class30.field433);
                class227.field3637.field44 = 0;
                if (class214.field3407 == 40) {
                    class227.field3637.method32(18, (byte) -99);
                } else {
                    class227.field3637.method32(16, (byte) -99);
                }
                class227.field3637.method40(class6.field149.field44 + class280.method1860(-98, class241.field3875) + 149, -23);
                class227.field3637.method26(503, 39);
                class227.field3637.method32(1, (byte) -99);
                class227.field3637.method40(class269.field4437, -116);
                class227.field3637.method40(class131.field2000, 86);
                class207.method1303(class227.field3637, 122);
                class227.field3637.method61(false, class241.field3875);
                class227.field3637.method26(class54.field867, 44);
                class227.field3637.method26(class57.method426(126), 115);
                class295.field4914 = true;
                class227.field3637.method26(class210.field3352.field553, 13);
                class227.field3637.method26(class61.field974.field553, 121);
                class227.field3637.method26(class182.field2885.field553, 11);
                class227.field3637.method26(class283.field4678.field553, 24);
                class227.field3637.method26(class168.field2652.field553, 41);
                class227.field3637.method26(class196.field3152.field553, 121);
                class227.field3637.method26(class11.field193.field553, 16);
                class227.field3637.method26(class117.field1764.field553, 56);
                class227.field3637.method26(class1.field21.field553, 34);
                class227.field3637.method26(class26.field389.field553, 63);
                class227.field3637.method26(class13.field203.field553, 125);
                class227.field3637.method26(class13.field208.field553, 122);
                class227.field3637.method26(class42.field629.field553, 109);
                class227.field3637.method26(class81.field1246.field553, 30);
                class227.field3637.method26(class68.field1056.field553, 48);
                class227.field3637.method26(class46.field668.field553, 101);
                class227.field3637.method26(class82.field1251.field553, 81);
                class227.field3637.method26(class72.field1118.field553, 94);
                class227.field3637.method26(class30.field429.field553, 88);
                class227.field3637.method26(class295.field4901.field553, 120);
                class227.field3637.method26(class9.field177.field553, 48);
                class227.field3637.method26(class201.field3195.field553, 102);
                class227.field3637.method26(class139.field2233.field553, 82);
                class227.field3637.method26(class152.field2426.field553, 121);
                class227.field3637.method26(class70.field1102.field553, 53);
                class227.field3637.method26(class249.field4026.field553, 44);
                class227.field3637.method26(class55.field885.field553, 52);
                class227.field3637.method73(class6.field149.field44, (byte) 119, 0, class6.field149.field101);
                class44.field660.method1630(0, class227.field3637.field44, (byte) -70, class227.field3637.field101);
                class6.field149.method956(var6, -18834);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class22.field333.method956(var6, -18834);
                class288.field4740 = 6;
            }
            if (class288.field4740 == 6 && class44.field660.method1633(72) > 0) {
                int var8 = class44.field660.method1632((byte) -115);
                if (var8 == 21 && class214.field3407 == 20) {
                    class288.field4740 = 7;
                } else if (var8 == 2) {
                    class288.field4740 = 9;
                } else if (var8 == 15 && class214.field3407 == 40) {
                    class73.method518((byte) 41);
                    return;
                } else if (var8 == 23 && class75.field1181 < 1) {
                    class75.field1181++;
                    class288.field4740 = 0;
                } else {
                    class67.method490(var8, true);
                    return;
                }
            }
            if (arg0) {
                method1398((byte) -52, -39);
            }
            if (class288.field4740 == 7 && class44.field660.method1633(123) > 0) {
                client.field1401 = (class44.field660.method1632((byte) -128) + 3) * 60;
                class242.field3891 = 21;
                class288.field4740 = 8;
            }
            if (class288.field4740 == 8) {
                if (--client.field1401 <= 0) {
                    class288.field4740 = 0;
                }
                class85.field1283 = 0;
            } else {
                if (class288.field4740 == 9 && class44.field660.method1633(96) >= 9) {
                    class19.field248 = class44.field660.method1632((byte) -121);
                    class11.field194 = class44.field660.method1632((byte) -121);
                    class261.field4180 = class44.field660.method1632((byte) -116);
                    if (class261.field4180 == 1) {
                        try {
                            class151.field2415.method774(field3533.field4664, (byte) -116);
                        } catch (Throwable var12) {
                        }
                    } else {
                        try {
                            class20.field291.method774(field3533.field4664, (byte) -115);
                        } catch (Throwable var13) {
                        }
                    }
                    class245.field3972 = class44.field660.method1632((byte) -117);
                    class81.field1237 = class44.field660.method1632((byte) -120) == 1;
                    class262.field4259 = class44.field660.method1632((byte) -124);
                    class262.field4259 <<= 0x8;
                    class262.field4259 += class44.field660.method1632((byte) -127);
                    class140.field2254 = class44.field660.method1632((byte) -125);
                    class44.field660.method1627(0, (byte) 112, 1, class22.field333.field101);
                    class22.field333.field44 = 0;
                    class69.field1087 = class22.field333.method958((byte) 25);
                    class44.field660.method1627(0, (byte) 126, 2, class22.field333.field101);
                    class22.field333.field44 = 0;
                    class4.field123 = class22.field333.method63((byte) 1);
                    class288.field4740 = 10;
                }
                if (class288.field4740 != 10) {
                    class85.field1283++;
                    if (class85.field1283 > 2000) {
                        if (class75.field1181 >= 1) {
                            class67.method490(-3, !arg0);
                        } else {
                            class75.field1181++;
                            if (class273.field4483 == class207.field3292) {
                                class207.field3292 = class176.field2812;
                            } else {
                                class207.field3292 = class273.field4483;
                            }
                            class288.field4740 = 0;
                        }
                    }
                } else if (class44.field660.method1633(93) >= class4.field123) {
                    class22.field333.field44 = 0;
                    class44.field660.method1627(0, (byte) 114, class4.field123, class22.field333.field101);
                    class128.method856(false);
                    class177.field2816 = -1;
                    class272.method1798(false, (byte) -128);
                    class69.field1087 = -1;
                }
            }
        } catch (IOException var14) {
            if (class75.field1181 < 1) {
                class288.field4740 = 0;
                class75.field1181++;
                if (class273.field4483 == class207.field3292) {
                    class207.field3292 = class176.field2812;
                } else {
                    class207.field3292 = class273.field4483;
                }
            } else {
                class67.method490(-2, true);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIILvc;IJZ)Z", line = 417)
    public static final boolean method1397(int arg0, int arg1, int arg2, int arg3, int arg4, class293 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class42.method325(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V", line = 456)
    public static final void method1398(byte arg0, int arg1) {
        class257.method1647(-1);
        class238.method1521((byte) 110);
        int var2 = class132.method873(arg1, false).field4055;
        field3536++;
        int var3 = 1 % ((-arg0 - 9) / 46);
        if (var2 == 0) {
            return;
        }
        int var4 = class106.field1641[arg1];
        if (var2 == 9) {
            class253.field4069 = var4;
        }
        if (var2 == 6) {
            class244.field3945 = var4;
        }
        if (var2 == 5) {
            class238.field3815 = var4;
        }
    }
}
