import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class135 {

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Lkc;")
    public static class67 field3234 = class19.method144("Benutzen Sie die (WPasswort -=ndern(W Option", 108);

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Lkc;")
    public static class67 field3241 = class19.method144("Keine Antwort vom Anmelde)2Server)3", 84);

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field3243 = 0;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Lkc;")
    private static class67 field3239 = class19.method144("Private chat", 70);

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lkc;")
    public static class67 field3235 = field3239;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "Lja;")
    public static class59 field3245 = new class59(512);

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "Lkc;")
    public static class67 field3249 = class19.method144("mapback", 118);

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "Lkc;")
    public static class67 field3250 = class19.method144("_", 97);

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field3247 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lta;")
    public static class119 field3228;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lje;")
    public static class63 field3236;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "[I")
    public static int[] field3233;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "[I")
    public static int[] field3246;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 10)
    public static final synchronized void method1041(int arg0) {
        field3229++;
        if (class126.method980(11881)) {
            class134.method1036(arg0);
            class108.field2459 = null;
            class34.field821 = false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lac;IIZIIII)V", line = 24)
    public static final synchronized void method1042(class4 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field3240++;
        if (!class126.method980(11881)) {
            return;
        }
        class65.field1533 = arg6;
        class10.field231 = arg1;
        class114.field2685 = arg2;
        class81.field1923 = arg5;
        class108.field2459 = arg0;
        class130.field3055 = arg7;
        class112.field2594 = arg4;
        class34.field821 = true;
        class12.field262 = arg3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 46)
    public static final void method1043(Component arg0, int arg1) {
        field3237++;
        arg0.addMouseListener(class66.field1543);
        arg0.addMouseMotionListener(class66.field1543);
        if (arg1 > -34) {
            field3235 = null;
        }
        arg0.addFocusListener(class66.field1543);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 60)
    public static final synchronized void method1044(int arg0) {
        field3225++;
        class65.method504(43);
        if (arg0 != 28587) {
            method1047(90, true);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILkc;Lac;IBILkc;Z)V", line = 73)
    public static final synchronized void method1045(int arg0, class67 arg1, class4 arg2, int arg3, byte arg4, int arg5, class67 arg6, boolean arg7) {
        if (arg4 > -116) {
            field3249 = null;
        }
        field3226++;
        if (class126.method980(11881)) {
            int var8 = arg2.method31(arg1, 0);
            int var9 = arg2.method35(var8, arg6, 56);
            method1042(arg2, arg3, arg5, arg7, arg0, var9, -1, var8);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 95)
    public static void method1046(byte arg0) {
        field3250 = null;
        field3239 = null;
        field3235 = null;
        field3233 = null;
        field3241 = null;
        field3246 = null;
        if (arg0 <= 7) {
            return;
        }
        field3228 = null;
        field3249 = null;
        field3245 = null;
        field3234 = null;
        field3236 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)V", line = 115)
    public static final synchronized void method1047(int arg0, boolean arg1) {
        field3227++;
        if (class126.method980(11881)) {
            class126.method982(true, arg0);
            class34.field821 = arg1;
            class108.field2459 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V", line = 131)
    public static final void method1048(int arg0) {
        field3242++;
        int var1 = class117.field2789.method231(class115.field2722);
        for (int var2 = 0; var2 < class55.field1323; var2++) {
            int var11 = class117.field2789.method235(class109.field2471[var2]);
            if (var1 < var11) {
                var1 = var11;
            }
        }
        var1 += 8;
        int var3 = class55.field1323 * 15 + 21;
        if (class74.field1758 > 4 && class109.field2504 > 4 && class74.field1758 < 516 && class109.field2504 < 338) {
            class114.field2681 = var1;
            class31.field663 = 0;
            int var4 = class74.field1758 - var1 / 2 - 4;
            class90.field2066 = true;
            class115.field2701 = class55.field1323 * 15 + 22;
            if (var1 + var4 > 512) {
                var4 = 512 - var1;
            }
            int var5 = class109.field2504 - 4;
            if (var4 < 0) {
                var4 = 0;
            }
            class76.field1815 = var4;
            if (var3 + var5 > 334) {
                var5 = 334 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class94.field2155 = var5;
        }
        if (class74.field1758 > 553 && class109.field2504 > 205 && class74.field1758 < 743 && class109.field2504 < 466) {
            class115.field2701 = class55.field1323 * 15 + 22;
            class114.field2681 = var1;
            class31.field663 = 1;
            int var6 = class74.field1758 - var1 / 2 - 553;
            class90.field2066 = true;
            if (var6 < 0) {
                var6 = 0;
            } else if (var1 + var6 > 190) {
                var6 = 190 - var1;
            }
            class76.field1815 = var6;
            int var7 = class109.field2504 - 205;
            if (var7 < 0) {
                var7 = 0;
            } else if (var3 + var7 > 261) {
                var7 = 261 - var3;
            }
            class94.field2155 = var7;
        }
        int var8 = 20 % ((arg0 - 26) / 63);
        if (class74.field1758 <= 17 || class109.field2504 <= 357 || class74.field1758 >= 496 || class109.field2504 >= 453) {
            return;
        }
        class115.field2701 = class55.field1323 * 15 + 22;
        class90.field2066 = true;
        class31.field663 = 2;
        int var9 = class74.field1758 - var1 / 2 - 17;
        class114.field2681 = var1;
        if (var9 < 0) {
            var9 = 0;
        } else if (var1 + var9 > 479) {
            var9 = 479 - var1;
        }
        int var10 = class109.field2504 - 357;
        class76.field1815 = var9;
        if (var10 < 0) {
            var10 = 0;
        } else if (var3 + var10 > 96) {
            var10 = 96 - var3;
        }
        class94.field2155 = var10;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILac;IIZI)V", line = 247)
    public static final synchronized void method1049(int arg0, int arg1, class4 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3232++;
        if (!class126.method980(11881)) {
            return;
        }
        class81.field1923 = arg1;
        class34.field821 = true;
        class114.field2685 = -1;
        class10.field231 = arg6;
        class108.field2459 = arg2;
        class130.field3055 = arg3;
        class65.field1533 = -1;
        class12.field262 = arg5;
        int var7 = -43 / ((43 - arg0) / 36);
        class112.field2594 = arg4;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V", line = 277)
    public static final synchronized void method1050(int arg0) {
        if (arg0 != 8896) {
            return;
        }
        field3244++;
        if (!class126.method980(11881)) {
            return;
        }
        if (class34.field821) {
            byte[] var1 = class121.method950(class108.field2459, class112.field2594, class130.field3055, class81.field1923, 0);
            if (var1 != null) {
                if (class114.field2685 >= 0) {
                    class130.method1000(var1, class114.field2685, 70, class10.field231, class12.field262);
                } else if (class65.field1533 >= 0) {
                    class48.method398(class12.field262, var1, class65.field1533, -1, class10.field231);
                } else {
                    class46.method385(class10.field231, arg0 ^ 0x3C59, class12.field262, var1);
                }
                class108.field2459 = null;
                class34.field821 = false;
            }
        }
        class55.method442(200);
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V", line = 320)
    public static final void method1051(int arg0) {
        class25.field532 = new int[4][105][105];
        class108.field2450 = new byte[4][104][104];
        class67.field1618 = 99;
        class132.field3144 = new int[104];
        class98.field2210 = new int[104];
        class94.field2154 = new int[104];
        class45.field1095 = new byte[4][105][105];
        class133.field3157 = new byte[4][104][104];
        class18.field343 = new int[105][105];
        class29.field613 = new byte[4][104][104];
        class50.field1244 = new int[104];
        class12.field282 = new byte[4][104][104];
        class76.field1818 = new int[104];
        field3238++;
        if (arg0 != -25719) {
            method1047(1, false);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILwd;BLc;)V", line = 361)
    public static final void method1052(int arg0, class140 arg1, byte arg2, class15 arg3) {
        field3224++;
        class84 var4 = new class84();
        var4.field1980 = arg1.method1105(255);
        var4.field1984 = arg1.method1118(4);
        var4.field1981 = new int[var4.field1980];
        var4.field1987 = new int[var4.field1980];
        if (arg2 > -22) {
            method1051(70);
        }
        var4.field1982 = new byte[var4.field1980][][];
        var4.field1976 = new int[var4.field1980];
        var4.field1992 = new class62[var4.field1980];
        var4.field1979 = new class62[var4.field1980];
        for (int var5 = 0; var5 < var4.field1980; var5++) {
            try {
                int var6 = arg1.method1105(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg1.method1110(false).method544(16597));
                    int var8 = 0;
                    String var9 = new String(arg1.method1110(false).method544(16597));
                    if (var6 == 1) {
                        var8 = arg1.method1118(4);
                    }
                    var4.field1981[var5] = var6;
                    var4.field1987[var5] = var8;
                    var4.field1992[var5] = arg3.method131((byte) -23, var9, class38.method309((byte) 114, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg1.method1110(false).method544(16597));
                    String var11 = new String(arg1.method1110(false).method544(16597));
                    int var12 = arg1.method1105(255);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg1.method1110(false).method544(16597));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method1118(4);
                            var15[var16] = new byte[var17];
                            arg1.method1120(19515, var15[var16], var17, 0);
                        }
                    }
                    var4.field1981[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class38.method309((byte) 114, var13[var19]);
                    }
                    var4.field1979[var5] = arg3.method132(class38.method309((byte) 114, var10), var18, var11, 102);
                    var4.field1982[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1976[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1976[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1976[var5] = -3;
            } catch (Exception var23) {
                var4.field1976[var5] = -4;
            } catch (Throwable var24) {
                var4.field1976[var5] = -5;
            }
        }
        class109.field2462.method95((byte) 112, var4);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 487)
    public static final void method1053(boolean arg0) {
        if (!arg0) {
            class10.field207.method378((byte) -34);
            field3231++;
        }
    }
}
