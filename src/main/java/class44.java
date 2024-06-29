import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class44 {

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lcd;")
    private class19 field1072 = new class19();

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "La;")
    private class1 field1081 = new class1();

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    private int field1085;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lja;")
    private class59 field1080;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field1069 = -1;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[Lqc;")
    public static class103[] field1067 = new class103[2048];

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lkc;")
    public static class67 field1079 = class19.method144(" ", 85);

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lkc;")
    private static class67 field1075 = class19.method144("Too many connections from your address)3", 94);

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lkc;")
    public static class67 field1088 = field1075;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lkc;")
    public static class67 field1086 = class19.method144("(U", 96);

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Lkc;")
    private static class67 field1084 = class19.method144("This world is full)3", 126);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lkc;")
    public static class67 field1065 = field1084;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lgd;")
    public static class44 field1083 = new class44(100);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "J")
    public static long field1070;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lta;")
    public static class119 field1071;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Z")
    public static boolean field1068;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 5)
    public static final void method372(byte arg0) {
        method377(false, false);
        boolean var1 = true;
        class61.field1448 = 0;
        field1073++;
        for (int var2 = 0; var2 < class20.field414.length; var2++) {
            if (class33.field819[var2] != -1 && class20.field414[var2] == null) {
                class20.field414[var2] = class132.field3138.method27(0, true, class33.field819[var2]);
                if (class20.field414[var2] == null) {
                    class61.field1448++;
                    var1 = false;
                }
            }
            if (class46.field1111[var2] != -1 && class42.field1061[var2] == null) {
                class42.field1061[var2] = class132.field3138.method32(0, class46.field1111[var2], class101.field2282[var2], (byte) -49);
                if (class42.field1061[var2] == null) {
                    var1 = false;
                    class61.field1448++;
                }
            }
        }
        if (!var1) {
            class133.field3189 = 1;
            return;
        }
        boolean var3 = true;
        class122.field2877 = 0;
        for (int var4 = 0; var4 < class20.field414.length; var4++) {
            byte[] var56 = class42.field1061[var4];
            if (var56 != null) {
                int var57 = (class25.field542[var4] >> 8) * 64 - class32.field685;
                int var58 = (class25.field542[var4] & 0xFF) * 64 - class30.field640;
                if (class130.field3038) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class81.method640(var57, -30816, var56, var58);
            }
        }
        if (!var3) {
            class133.field3189 = 2;
            return;
        }
        if (class133.field3189 != 0) {
            class108.method827(true, class121.field2828, class19.field373, -8038);
        }
        class20.method156(-128);
        class103.field2332.method872();
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class14.field295[var5].method52(1);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class21.field443[var6][var54][var55] = 0;
                }
            }
        }
        class135.method1051(-25719);
        int var7 = class20.field414.length;
        class129.method998(2);
        method377(false, true);
        if (!class130.field3038) {
            for (int var8 = 0; var8 < var7; var8++) {
                byte[] var17 = class20.field414[var8];
                int var18 = (class25.field542[var8] & 0xFF) * 64 - class30.field640;
                int var19 = (class25.field542[var8] >> 8) * 64 - class32.field685;
                if (var17 != null) {
                    class71.method583((class88.field2022 - 6) * 8, class14.field295, var18, var17, (byte) -123, class29.field614 * 8 - 48, var19);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class25.field542[var9] >> 8) * 64 - class32.field685;
                int var15 = (class25.field542[var9] & 0xFF) * 64 - class30.field640;
                byte[] var16 = class20.field414[var9];
                if (var16 == null && class88.field2022 < 800) {
                    class114.method912(64, 64, var15, var14, 60);
                }
            }
            method377(false, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class42.field1061[var10];
                if (var11 != null) {
                    int var12 = (class25.field542[var10] >> 8) * 64 - class32.field685;
                    int var13 = (class25.field542[var10] & 0xFF) * 64 - class30.field640;
                    class102.method783(class14.field295, 15547, var11, var13, var12, class103.field2332);
                }
            }
        }
        if (class130.field3038) {
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class65.field1537[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 1 & 0x3;
                            int var40 = var37 >> 14 & 0x3FF;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class25.field542.length; var43++) {
                                if (class25.field542[var43] == var42 && class20.field414[var43] != null) {
                                    var36 = true;
                                    class75.method609((var40 & 0x7) * 8, (var41 & 0x7) * 8, var20, class20.field414[var43], false, class14.field295, var39, var38, var34 * 8, var35 * 8);
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class102.method784(var20, var34 * 8, var35 * 8, 2);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class65.field1537[0][var21][var32];
                    if (var33 == -1) {
                        class114.method912(8, 8, var32 * 8, var21 * 8, 60);
                    }
                }
            }
            method377(false, true);
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class65.field1537[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class25.field542.length; var31++) {
                                if (class25.field542[var31] == var30 && class42.field1061[var31] != null) {
                                    class106.method820((byte) -123, class14.field295, (var29 & 0x7) * 8, var27, var24 * 8, var22, var23 * 8, var26, (var28 & 0x7) * 8, class103.field2332, class42.field1061[var31]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method377(false, true);
        class20.method156(-127);
        if (arg0 <= 107) {
            return;
        }
        class78.method623(false, class14.field295, class103.field2332);
        method377(false, true);
        int var44 = class67.field1618;
        if (var44 > class112.field2593) {
            var44 = class112.field2593;
        }
        if (class112.field2593 - 1 > var44) {
            int var45 = class112.field2593 - 1;
        }
        if (class45.field1105) {
            class103.field2332.method908(class67.field1618);
        } else {
            class103.field2332.method908(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class82.method642(var53, 2028745255, var46);
            }
        }
        class2.method9(0);
        class69.field1653.method378((byte) -61);
        if (class18.field358 != null) {
            class90.field2048++;
            class54.field1295.method713(503, 226);
            class54.field1295.method1100(1057001181, (byte) 105);
        }
        if (!class130.field3038) {
            int var47 = (class29.field614 - 6) / 8;
            int var48 = (class29.field614 + 6) / 8;
            int var49 = (class88.field2022 - 6) / 8;
            int var50 = (class88.field2022 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                    if (var51 < var47 || var51 > var48 || var52 < var49 || var52 > var50) {
                        class132.field3138.method26(class63.method479(new class67[] { class128.field3002, class71.method586(103, var51), class135.field3250, class71.method586(103, var52) }, 0), -21231);
                        class132.field3138.method26(class63.method479(new class67[] { class70.field1676, class71.method586(103, var51), class135.field3250, class71.method586(103, var52) }, 0), -21231);
                    }
                }
            }
        }
        if (class59.field1387 == -1) {
            class126.method981(30, (byte) -120);
        } else {
            class126.method981(35, (byte) -120);
        }
        class103.method787((byte) 39);
        class54.field1295.method713(503, 230);
        class101.method774(-38);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BJ)Lcd;", line = 466)
    public final class19 method373(byte arg0, long arg1) {
        field1076++;
        if (arg0 <= 102) {
            return null;
        }
        class19 var4 = (class19) this.field1080.method462(false, arg1);
        if (var4 != null) {
            this.field1081.method5(var4, 550);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILcd;J)V", line = 500)
    public final void method374(int arg0, class19 arg1, long arg2) {
        field1082++;
        if (this.field1078 == arg0) {
            class19 var5 = this.field1081.method6(true);
            var5.method13(arg0 ^ 0x58);
            var5.method152(arg0 - 128);
            if (this.field1072 == var5) {
                class19 var6 = this.field1081.method6(true);
                var6.method13(arg0 ^ 0x4D);
                var6.method152(-128);
            }
        } else {
            this.field1078--;
        }
        this.field1080.method469(~arg0, arg2, arg1);
        this.field1081.method5(arg1, 550);
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V", line = 683)
    public class44(int arg0) {
        this.field1085 = arg0;
        this.field1078 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1080 = new class59(var2);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IJ)V", line = 566)
    public final void method375(int arg0, long arg1) {
        field1066++;
        if (arg0 > -26) {
            field1069 = 122;
        }
        class19 var4 = (class19) this.field1080.method462(false, arg1);
        if (var4 != null) {
            var4.method13(125);
            var4.method152(-128);
            this.field1078++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 592)
    public static void method376(int arg0) {
        if (arg0 != 13) {
            return;
        }
        field1075 = null;
        field1065 = null;
        field1086 = null;
        field1067 = null;
        field1083 = null;
        field1079 = null;
        field1071 = null;
        field1084 = null;
        field1088 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZ)V", line = 618)
    private static final void method377(boolean arg0, boolean arg1) {
        field1077++;
        class88.field2031++;
        if (arg0) {
            method376(-41);
        }
        if (class88.field2031 < 50 && !arg1) {
            return;
        }
        class88.field2031 = 0;
        if (class85.field2010 || class71.field1679 == null) {
            return;
        }
        class54.field1295.method713(503, 99);
        class69.field1648++;
        try {
            class71.field1679.method754(class54.field1295.field3347, 32741, 0, class54.field1295.field3325);
            class54.field1295.field3347 = 0;
        } catch (IOException var2) {
            class85.field2010 = true;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V", line = 658)
    public final void method378(byte arg0) {
        if (arg0 >= -30) {
            method379(-103, -120, -18, null, 49, null, (byte) -112);
        }
        field1064++;
        while (true) {
            class19 var2 = this.field1081.method6(true);
            if (var2 == null) {
                this.field1078 = this.field1085;
                return;
            }
            var2.method13(126);
            var2.method152(-128);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIILkc;ILkc;B)V", line = 699)
    public static final void method379(int arg0, int arg1, int arg2, class67 arg3, int arg4, class67 arg5, byte arg6) {
        field1074++;
        if (class55.field1323 < 500) {
            if (arg3.method539(2618) <= 0) {
                class109.field2471[class55.field1323] = arg5;
            } else {
                class109.field2471[class55.field1323] = class63.method479(new class67[] { arg5, class108.field2447, arg3 }, 0);
            }
            class69.field1650[class55.field1323] = arg0;
            class29.field615[class55.field1323] = arg4;
            class71.field1698[class55.field1323] = arg2;
            class65.field1538[class55.field1323] = arg1;
            class55.field1323++;
        }
        if (arg6 < 16) {
            method377(false, true);
        }
    }
}
