import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class159 extends class12 {

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public int field2896 = -1;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public int field2908 = 0;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Lkh;")
    public static class117 field2890 = class224.method1450((byte) 127, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!of", name = "u", descriptor = "Lge;")
    public static class71 field2889 = new class71(100);

    @OriginalMember(owner = "client!of", name = "G", descriptor = "Lkh;")
    public static class117 field2901 = class224.method1450((byte) 2, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    public static int field2910 = 0;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "Z")
    public static boolean field2909 = false;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field2913 = 0;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "[Lfa;")
    public static class57[] field2912 = new class57[5000];

    @OriginalMember(owner = "client!of", name = "U", descriptor = "Lkh;")
    public static class117 field2915 = class224.method1450((byte) -62, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!of", name = "V", descriptor = "Lkh;")
    public static class117 field2916 = class224.method1450((byte) -14, ":chalreq:");

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public int field2906;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public int field2911;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "Lai;")
    public static class10 field2917;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2907++;
        if (arg3 == arg4 && arg0 == arg2 && arg6 == arg7 && arg8 == arg9) {
            class167.method1188(arg2, arg7, arg8, arg3, (byte) 35, arg1);
        } else {
            int var10 = arg3;
            int var11 = arg3 * 3;
            int var12 = arg4 * 3;
            int var13 = arg6 * 3;
            int var14 = arg0 * 3;
            int var15 = arg2;
            int var16 = var12 + arg7 - arg3 - var13;
            int var17 = arg9 * 3;
            int var18 = arg8 + var14 - arg2 - var17;
            int var19 = arg2 * 3;
            int var20 = var17 + var19 - var14 - var14;
            int var21 = var13 + var11 - var12 - var12;
            int var22 = var14 - var19;
            int var23 = var12 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var16 * var27;
                int var29 = var18 * var27;
                int var30 = var21 * var26;
                int var31 = var20 * var26;
                int var32 = var23 * var24;
                int var33 = var22 * var24;
                int var34 = arg2 + (var31 + var33 + var29 >> 12);
                int var35 = (var28 + var30 + var32 >> 12) + arg3;
                class167.method1188(var15, var35, var34, var10, (byte) -93, arg1);
                var15 = var34;
                var10 = var35;
            }
        }
        int var25 = 95 % ((-arg5 - 3) / 33);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static void method1132(int arg0) {
        field2915 = null;
        field2890 = null;
        field2912 = null;
        if (arg0 != 8) {
            method1134(-80, (byte) 18);
        }
        field2901 = null;
        field2889 = null;
        field2916 = null;
        field2917 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lkh;Lkh;ILkh;)V")
    public static final void method1133(class117 arg0, class117 arg1, int arg2, class117 arg3) {
        field2894++;
        class13.field422 = arg0;
        class13.field413 = arg3;
        int var4 = -52 / ((29 - arg2) / 49);
        class13.field409 = arg1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)I")
    public static final int method1134(int arg0, byte arg1) {
        field2897++;
        if (arg1 < 117) {
            field2909 = false;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILf;II)V")
    public static final void method1135(int arg0, class56 arg1, int arg2, int arg3) {
        if ((arg0 & 0x4) != 0) {
            arg1.field4263 = class18.field511.method1038(102);
            if (arg1.field4263.method777(true, 0) == 126) {
                arg1.field4263 = arg1.field4263.method802(1, 1176819746);
                class14.method129(arg1.field1141, arg1.field4263, 0, 2);
            } else if (class93.field1712 == arg1) {
                class14.method129(arg1.field1141, arg1.field4263, 0, 2);
            }
            arg1.field4217 = 150;
            arg1.field4236 = 0;
            arg1.field4212 = 0;
        }
        field2904++;
        if ((arg0 & 0x400) != 0) {
            arg1.field4239 = class18.field511.method1033(-128);
            arg1.field4227 = class18.field511.method1042(true);
            arg1.field4271 = class18.field511.method1042(true);
            arg1.field4254 = class18.field511.method1045((byte) 52);
            arg1.field4278 = class18.field511.method1019((byte) 91) + class44.field966;
            arg1.field4252 = class18.field511.method1019((byte) 101) + class44.field966;
            arg1.field4264 = class18.field511.method1045((byte) 37);
            arg1.field4267 = 0;
            arg1.field4272 = 1;
        }
        if (~(arg0 & 0x10) != arg3) {
            arg1.field4245 = class18.field511.method1004(255);
            arg1.field4237 = class18.field511.method988(110);
        }
        if ((arg0 & 0x200) != 0) {
            arg1.field4233 = class18.field511.method1049((byte) 127);
            int var4 = class18.field511.method1026(false);
            if (arg1.field4233 == 65535) {
                arg1.field4233 = -1;
            }
            arg1.field4248 = 0;
            arg1.field4253 = var4 >> 16;
            arg1.field4209 = 0;
            arg1.field4222 = (var4 & 0xFFFF) + class44.field966;
            if (class44.field966 < arg1.field4222) {
                arg1.field4209 = -1;
            }
        }
        if ((arg0 & 0x8) != 0) {
            int var5 = class18.field511.method1049((byte) 110);
            int var6 = class18.field511.method998(70);
            if (var5 == 65535) {
                var5 = -1;
            }
            class246.method1614(var6, var5, -2, arg1);
        }
        if ((arg0 & 0x40) != 0) {
            int var7 = class18.field511.method998(69);
            byte[] var8 = new byte[var7];
            class145 var9 = new class145(var8);
            class18.field511.method1022(-15020, var7, 0, var8);
            class114.field2135[arg2] = var9;
            arg1.method430((byte) -100, var9);
        }
        if ((arg0 & 0x80) != 0) {
            int var10 = class18.field511.method1033(-128);
            int var11 = class18.field511.method998(95);
            arg1.method1514(var10, (byte) -119, var11, class44.field966);
            arg1.field4235 = class44.field966 + 300;
            arg1.field4215 = class18.field511.method1042(true);
        }
        if ((arg0 & 0x100) != 0) {
            int var12 = class18.field511.method1033(arg3 ^ 0x7F);
            int var13 = class18.field511.method1033(-128);
            arg1.method1514(var12, (byte) -119, var13, class44.field966);
        }
        if ((arg0 & 0x1) != 0) {
            int var14 = class18.field511.method1004(arg3 + 256);
            int var15 = class18.field511.method1033(-128);
            int var16 = class18.field511.method998(87);
            int var17 = class18.field511.field2643;
            boolean var18 = (var14 & 0x8000) != 0;
            if (arg1.field1141 != null && arg1.field1143 != null) {
                long var19 = arg1.field1141.method813((byte) 93);
                boolean var21 = false;
                if (var15 <= 1) {
                    if (!var18 && (class198.field3548 == 1 || class67.field1292 == 1)) {
                        var21 = true;
                    } else {
                        for (int var22 = 0; var22 < class85.field1613; var22++) {
                            if (class158.field2873[var22] == var19) {
                                var21 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var21 && class160.field2926 == 0) {
                    int var23 = -1;
                    class56.field1158.field2643 = 0;
                    class18.field511.method997(class56.field1158.field2613, 0, -1, var16);
                    class56.field1158.field2643 = 0;
                    class117 var24;
                    if (var18) {
                        var14 &= 0x7FFF;
                        class95 var25 = class68.method480(class56.field1158, 11146);
                        var23 = var25.field1745;
                        var24 = var25.field1741.method1119(class56.field1158, false);
                    } else {
                        var24 = class138.method925(class8.method59((byte) -116, class56.field1158).method811(-14443));
                    }
                    arg1.field4263 = var24.method798((byte) 113);
                    arg1.field4217 = 150;
                    arg1.field4236 = var14 >> 8;
                    arg1.field4212 = var14 & 0xFF;
                    if (var15 == 2) {
                        class151.method1078(var23, (byte) 119, var18 ? 17 : 1, class36.method316((byte) -34, new class117[] { class13.field416, arg1.field1141 }), null, var24);
                    } else if (var15 == 1) {
                        class151.method1078(var23, (byte) 119, var18 ? 17 : 1, class36.method316((byte) -34, new class117[] { class103.field1888, arg1.field1141 }), null, var24);
                    } else {
                        class151.method1078(var23, (byte) 119, var18 ? 17 : 2, arg1.field1141, null, var24);
                    }
                }
            }
            class18.field511.field2643 = var17 + var16;
        }
        if ((arg0 & 0x20) == 0) {
            return;
        }
        arg1.field4280 = class18.field511.method1049((byte) 101);
        if (arg1.field4280 == 65535) {
            arg1.field4280 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lsf;Lvb;IZ)V")
    public static final void method1136(class203 arg0, class232 arg1, int arg2, boolean arg3) {
        field2891++;
        class185 var4 = new class185();
        var4.field389 = arg2;
        var4.field3322 = arg0;
        var4.field3328 = arg1;
        var4.field3327 = 1;
        if (!arg3) {
            method1136(null, null, 1, true);
        }
        class36 var5 = class55.field1118;
        synchronized (class55.field1118) {
            class55.field1118.method325(115, var4);
        }
        class247.method1616(13819);
    }
}
