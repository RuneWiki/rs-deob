import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 extends class118 {

    @OriginalMember(owner = "client!db", name = "E", descriptor = "Lg;")
    private class43 field459;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "[I")
    public static int[] field463 = new int[5];

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Lrd;")
    public static class114 field454 = class84.method656("@lre@", (byte) 122);

    @OriginalMember(owner = "client!db", name = "A", descriptor = "Lrd;")
    public static class114 field455 = class84.method656("compass", (byte) 115);

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Z")
    public static boolean field466 = false;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Z")
    public static boolean field460 = false;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field461 = 32;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field462 = 0;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "Lrd;")
    private static class114 field481 = class84.method656("On", (byte) 120);

    @OriginalMember(owner = "client!db", name = "M", descriptor = "[J")
    public static long[] field467 = new long[32];

    @OriginalMember(owner = "client!db", name = "db", descriptor = "Lrd;")
    public static class114 field483 = field481;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "Lrd;")
    public static class114 field477 = class84.method656("Fehler beim Laden Ihres Spielcharakters)3", (byte) 126);

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "Lpb;")
    public static class100 field452;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "Lpb;")
    public static class100 field464;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "Lpb;")
    public static class100 field487;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Lma;")
    private class81 field471;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Loa;")
    public static class93 field474;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "Z")
    private boolean field473;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "Z")
    private boolean field480;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "[B")
    private byte[] field478;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLf;)V")
    public static final void method166(boolean arg0, class36 arg1) {
        if (!arg0) {
            field460 = true;
        }
        arg1.field708 = 0;
        int var2 = arg1.field745 - class20.field370;
        if (arg1.field728 == 0) {
            arg1.field725 = 1024;
        }
        field456++;
        if (arg1.field728 == 1) {
            arg1.field725 = 1536;
        }
        if (arg1.field728 == 2) {
            arg1.field725 = 0;
        }
        if (arg1.field728 == 3) {
            arg1.field725 = 512;
        }
        int var3 = arg1.field724 * 128 + arg1.field735 * 64;
        int var4 = arg1.field735 * 64 + arg1.field703 * 128;
        arg1.field712 += (var3 - arg1.field712) / var2;
        arg1.field756 += (var4 - arg1.field756) / var2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
    public final void method167(int arg0, int arg1) {
        if (arg0 == 65535) {
            field475++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)I")
    public static final int method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field484++;
        int var7 = arg5 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg1;
            arg1 = var8;
        }
        int var9 = -94 / ((arg2 + 61) / 37);
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 1 + 7 - arg0 - arg4;
        } else if (var7 == 2) {
            return 7 + 1 - arg6 - arg1;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public final void method169(int arg0) {
        if (arg0 != 15299) {
            method171(125);
        }
        field476++;
        if (this.field471 == null || this.field471.field1826 == 0) {
            return;
        }
        if (this.field471.field1826 == 1) {
            class91 var2 = (class91) this.field471.field1823;
            try {
                var2.method699(70, this.field478.length, this.field478, 0);
                var2.method700(arg0 - 15227);
                try {
                    class76.method611(this.field459.field882, "midibox.loop=" + (this.field473 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method703(1).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field468 + ";", true);
                    this.field480 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method700(72);
                } catch (Exception var3) {
                }
            }
        }
        this.field471 = null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
    public static final void method170(int arg0, int arg1) {
        field469++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class72.field1594[arg0];
        int var3 = class117.field2734[arg0];
        int var4 = class118.field2767[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var5 = class103.field2415[arg0];
        if (class142.field3382 != 0 && var3 != 1004) {
            class140.field3335 = true;
            class142.field3382 = 0;
        }
        if (var3 == 11) {
            class126 var6 = class36.field762[var5];
            if (var6 != null) {
                class10.method80(var6.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var6.field758[0], 1, 0, -97, 0, 0, 1);
                class8.field113 = 0;
                class10.field144++;
                class63.field1350 = class118.field2758;
                class104.field2419 = 2;
                class69.field1512 = class142.field3392;
                class61.field1303.method1054(arg1 ^ 0xFFFFFFF5, 31);
                class61.field1303.method465(-19962, var5);
            }
        }
        if (var3 == 4) {
            class90 var7 = class92.method719((byte) -74, var4, var2);
            if (var7 != null) {
                class96.method735((byte) -124);
                class9.method74(class121.method941((byte) 69, class39.method278(var7, 1572721824)), var2, 126, var4);
                class145.field3452 = 0;
                field460 = true;
                class120.field2803 = class21.method140(var7, true);
                if (class120.field2803 == null) {
                    class120.field2803 = class106.field2450;
                }
                if (var7.field2011) {
                    class34.field683 = class101.method786((byte) 125, new class114[] { var7.field2106, class128.field3073 });
                } else {
                    class34.field683 = class101.method786((byte) 127, new class114[] { class85.field1885, var7.field2037, class128.field3073 });
                }
                if (class22.field427 == 16 && !var7.field2011) {
                    field460 = true;
                    class102.field2351 = 3;
                    class103.field2410 = true;
                }
            }
            return;
        }
        if (var3 == 51 && class22.method159((byte) -41, var4, var5, var2)) {
            class109.field2521++;
            class61.field1303.method1054(8, 174);
            class61.field1303.method479(23538, class80.field1818);
            class61.field1303.method441((byte) 16, class66.field1417);
            class61.field1303.method441((byte) 93, class72.field1611 + var2);
            class61.field1303.method464(var5 >> 14 & 0x7FFF, (byte) 125);
            class61.field1303.method496(class65.field1408 + var4, (byte) -116);
            class61.field1303.method441((byte) 98, class52.field1087);
        }
        if (var3 == 57) {
            class61.field1303.method1054(arg1 + 11, 29);
            class61.field1303.method496(var5, (byte) 93);
            class61.field1303.method476(-7155, var4);
            class64.field1361++;
            class61.field1303.method496(var2, (byte) -112);
            class117.field2739 = 0;
            class63.field1347 = var2;
            class141.field3374 = 2;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
            class123.field2895 = var4;
        }
        if (var3 == 1002) {
            class21.field374++;
            class22.method159((byte) 113, var4, var5, var2);
            class61.field1303.method1054(8, 248);
            class61.field1303.method464(class65.field1408 + var4, (byte) 18);
            class61.field1303.method441((byte) 14, var5 >> 14 & 0x7FFF);
            class61.field1303.method441((byte) 22, class72.field1611 + var2);
        }
        if (var3 == 44) {
            class50.field1043++;
            boolean var8 = class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 0, 0, 30, 0, 0, 0);
            if (!var8) {
                class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 1, 0, 17, 0, 0, 1);
            }
            class104.field2419 = 2;
            class69.field1512 = class142.field3392;
            class63.field1350 = class118.field2758;
            class8.field113 = 0;
            class61.field1303.method1054(arg1 + 11, 234);
            class61.field1303.method441((byte) 100, var5);
            class61.field1303.method496(class72.field1611 + var2, (byte) -104);
            class61.field1303.method441((byte) 36, class65.field1408 + var4);
        }
        if (var3 == 7 || var3 == 2 || var3 == 9 || var3 == 21) {
            class114 var10 = class123.field2878[arg0];
            int var11 = var10.method858((byte) 89, class128.field3073);
            if (var11 != -1) {
                long var12 = var10.method866(false, var11 + 5).method862(arg1 ^ 0x1955).method877(29486);
                if (var3 == 7) {
                    class121.method944(-125, var12);
                }
                if (var3 == 2) {
                    class66.method530((byte) -128, var12);
                }
                if (var3 == 9) {
                    class90.method697(var12, true);
                }
                if (var3 == 21) {
                    class56.method417(arg1 ^ 0xFFFFFFFD, var12);
                }
            }
        }
        if (var3 == 1003) {
            class63.field1350 = class118.field2758;
            class69.field1512 = class142.field3392;
            class104.field2419 = 2;
            class8.field113 = 0;
            class50.field1036++;
            class61.field1303.method1054(8, 246);
            class61.field1303.method496(var5 >> 14 & 0x7FFF, (byte) -115);
        }
        if (var3 == 26) {
            class126 var14 = class36.field762[var5];
            if (var14 != null) {
                class34.field664++;
                class10.method80(var14.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var14.field758[0], 1, 0, arg1 - 86, 0, 0, 1);
                class63.field1350 = class118.field2758;
                class8.field113 = 0;
                class104.field2419 = 2;
                class69.field1512 = class142.field3392;
                class61.field1303.method1054(arg1 + 11, 138);
                class61.field1303.method465(-19962, var5);
            }
        }
        if (var3 == 43) {
            class126 var15 = class36.field762[var5];
            if (var15 != null) {
                class10.method80(var15.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var15.field758[0], 1, 0, -85, 0, 0, 1);
                class143.field3411++;
                class8.field113 = 0;
                class63.field1350 = class118.field2758;
                class104.field2419 = 2;
                class69.field1512 = class142.field3392;
                class61.field1303.method1054(8, 51);
                class61.field1303.method464(var5, (byte) 100);
            }
        }
        if (var3 == 54) {
            class8 var16 = class123.field2894[var5];
            if (var16 != null) {
                class10.method80(var16.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var16.field758[0], 1, 0, 113, 0, 0, 1);
                class104.field2419 = 2;
                class63.field1350 = class118.field2758;
                class131.field3182++;
                class8.field113 = 0;
                class69.field1512 = class142.field3392;
                class61.field1303.method1054(8, 161);
                class61.field1303.method496(var5, (byte) -125);
            }
        }
        if (var3 == 53) {
            class61.field1303.method1054(8, 224);
            field457++;
            class61.field1303.method476(-7155, var4);
            class90 var17 = class14.method115(65535, var4);
            if (var17.field2055 != null && var17.field2055[0][0] == 5) {
                int var18 = var17.field2055[0][1];
                if (class123.field2896[var18] != var17.field2065[0]) {
                    class123.field2896[var18] = var17.field2065[0];
                    class72.method587((byte) -110, var18);
                    field460 = true;
                }
            }
        }
        if (var3 == 5) {
            class22.method159((byte) -127, var4, var5, var2);
            class92.field2146++;
            class61.field1303.method1054(8, 98);
            class61.field1303.method441((byte) 62, var4 + class65.field1408);
            class61.field1303.method465(arg1 ^ 0x4DFB, var2 + class72.field1611);
            class61.field1303.method441((byte) 90, var5 >> 14 & 0x7FFF);
        }
        if (var3 == 46) {
            class28.field568++;
            class22.method159((byte) -65, var4, var5, var2);
            class61.field1303.method1054(8, 226);
            class61.field1303.method496(var2 + class72.field1611, (byte) 116);
            class61.field1303.method465(arg1 ^ 0x4DFB, class65.field1408 + var4);
            class61.field1303.method464(var5 >> 14 & 0x7FFF, (byte) 127);
        }
        if (var3 == 28) {
            class102.field2383++;
            class61.field1303.method1054(arg1 ^ 0xFFFFFFF5, 21);
            class61.field1303.method465(-19962, var5);
            class61.field1303.method464(var2, (byte) 42);
            class61.field1303.method479(arg1 + 23541, var4);
            class123.field2895 = var4;
            class141.field3374 = 2;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            class63.field1347 = var2;
            class117.field2739 = 0;
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
        }
        if (var3 == 42) {
            class90 var19 = class14.method115(65535, var4);
            boolean var20 = true;
            if (var19.field2049 > 0) {
                var20 = class74.method603((byte) -39, var19);
            }
            if (var20) {
                class61.field1303.method1054(8, 224);
                field457++;
                class61.field1303.method476(-7155, var4);
            }
        }
        if (var3 == 8 && class22.method159((byte) 117, var4, var5, var2)) {
            class96.field2207++;
            class61.field1303.method1054(8, 7);
            class61.field1303.method465(-19962, class72.field1611 + var2);
            class61.field1303.method441((byte) 46, var5 >> 14 & 0x7FFF);
            class61.field1303.method488(class137.field3305, 357);
            class61.field1303.method464(var4 + class65.field1408, (byte) 83);
            class61.field1303.method496(class77.field1758, (byte) 66);
        }
        if (var3 == 10) {
            field450++;
            class61.field1303.method1054(8, 6);
            class61.field1303.method464(var2, (byte) 37);
            class61.field1303.method465(-19962, var5);
            class61.field1303.method479(23538, var4);
            class141.field3374 = 2;
            class63.field1347 = var2;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            class123.field2895 = var4;
            class117.field2739 = 0;
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
        }
        if (var3 == 47) {
            class8 var21 = class123.field2894[var5];
            if (var21 != null) {
                class96.field2213++;
                class10.method80(var21.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var21.field758[0], 1, 0, arg1 ^ 0xFFFFFF86, 0, 0, 1);
                class63.field1350 = class118.field2758;
                class8.field113 = 0;
                class69.field1512 = class142.field3392;
                class104.field2419 = 2;
                class61.field1303.method1054(8, 168);
                class61.field1303.method465(-19962, var5);
            }
        }
        if (var3 == 35) {
            class8 var22 = class123.field2894[var5];
            if (var22 != null) {
                class63.field1348++;
                class10.method80(var22.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var22.field758[0], 1, 0, arg1 - 79, 0, 0, 1);
                class69.field1512 = class142.field3392;
                class63.field1350 = class118.field2758;
                class8.field113 = 0;
                class104.field2419 = 2;
                class61.field1303.method1054(8, 109);
                class61.field1303.method464(var5, (byte) 103);
            }
        }
        if (var3 == 20) {
            class8 var23 = class123.field2894[var5];
            if (var23 != null) {
                class10.method80(var23.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var23.field758[0], 1, 0, arg1 + 18, 0, 0, 1);
                class104.field2419 = 2;
                class112.field2605++;
                class69.field1512 = class142.field3392;
                class63.field1350 = class118.field2758;
                class8.field113 = 0;
                class61.field1303.method1054(8, 113);
                class61.field1303.method496(var5, (byte) -106);
            }
        }
        if (var3 == 45 && class20.field357 == -1) {
            class63.method516(var4, 58, var2);
            class86.field1940 = var2;
            class20.field357 = var4;
        }
        if (var3 == 14) {
            class126 var24 = class36.field762[var5];
            if (var24 != null) {
                class10.method80(var24.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var24.field758[0], 1, 0, 8, 0, 0, 1);
                class63.field1350 = class118.field2758;
                class8.field113 = 0;
                class69.field1512 = class142.field3392;
                class104.field2419 = 2;
                class61.field1303.method1054(8, 30);
                class61.field1303.method465(-19962, class52.field1087);
                class86.field1937++;
                class61.field1303.method489(class80.field1818, arg1 - 1762115365);
                class61.field1303.method464(var5, (byte) 50);
                class61.field1303.method465(-19962, class66.field1417);
            }
        }
        if (var3 == 25) {
            class61.field1303.method1054(8, 224);
            class61.field1303.method476(-7155, var4);
            class90 var25 = class14.method115(65535, var4);
            field457++;
            if (var25.field2055 != null && var25.field2055[0][0] == 5) {
                int var26 = var25.field2055[0][1];
                class123.field2896[var26] = 1 - class123.field2896[var26];
                class72.method587((byte) -77, var26);
                field460 = true;
            }
        }
        if (var3 == 37) {
            class47.field958++;
            class61.field1303.method1054(8, 181);
            class61.field1303.method489(var4, -1762115368);
            class61.field1303.method496(var5, (byte) 124);
            class61.field1303.method465(-19962, var2);
            class63.field1347 = var2;
            class123.field2895 = var4;
            class141.field3374 = 2;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
            class117.field2739 = 0;
        }
        if (var3 == 58) {
            boolean var27 = class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 0, 0, -115, 0, 0, 0);
            class72.field1590++;
            if (!var27) {
                class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 1, 0, -98, 0, 0, 1);
            }
            class8.field113 = 0;
            class63.field1350 = class118.field2758;
            class104.field2419 = 2;
            class69.field1512 = class142.field3392;
            class61.field1303.method1054(arg1 + 11, 48);
            class61.field1303.method441((byte) 105, var2 + class72.field1611);
            class61.field1303.method441((byte) 90, class65.field1408 + var4);
            class61.field1303.method464(var5, (byte) 99);
        }
        if (var3 == 1001) {
            class8.field113 = 0;
            class63.field1350 = class118.field2758;
            class11.field196++;
            class69.field1512 = class142.field3392;
            class104.field2419 = 2;
            class61.field1303.method1054(8, 215);
            class61.field1303.method465(-19962, var5);
        }
        if (var3 == 22 || var3 == 27) {
            class114 var29 = class123.field2878[arg0];
            int var30 = var29.method858((byte) 46, class128.field3073);
            if (var30 != -1) {
                class114 var31 = var29.method866(false, var30 + 5).method862(-6488);
                class114 var32 = var31.method856(arg1 + 4012).method863(-88);
                boolean var33 = false;
                for (int var34 = 0; var34 < class8.field116; var34++) {
                    class126 var35 = class36.field762[class110.field2573[var34]];
                    if (var35 != null && var35.field3018 != null && var35.field3018.method886(var32, true)) {
                        class10.method80(var35.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var35.field758[0], 1, 0, arg1 ^ 0xFFFFFFF5, 0, 0, 1);
                        if (var3 == 22) {
                            class106.field2438++;
                            class61.field1303.method1054(arg1 + 11, 210);
                            class61.field1303.method441((byte) 67, class110.field2573[var34]);
                        }
                        if (var3 == 27) {
                            class143.field3411++;
                            class61.field1303.method1054(8, 51);
                            class61.field1303.method464(class110.field2573[var34], (byte) 79);
                        }
                        var33 = true;
                        break;
                    }
                }
                if (!var33) {
                    class86.method660(class72.field1610, class101.method786((byte) 127, new class114[] { class20.field349, var32 }), true, 0);
                }
            }
        }
        if (var3 == 49) {
            class8 var36 = class123.field2894[var5];
            if (var36 != null) {
                class31.field644++;
                class10.method80(var36.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var36.field758[0], 1, 0, -91, 0, 0, 1);
                class8.field113 = 0;
                class63.field1350 = class118.field2758;
                class104.field2419 = 2;
                class69.field1512 = class142.field3392;
                class61.field1303.method1054(8, 218);
                class61.field1303.method465(-19962, var5);
            }
        }
        if (var3 == 16) {
            class126 var37 = class36.field762[var5];
            if (var37 != null) {
                class10.method80(var37.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var37.field758[0], 1, 0, arg1 ^ 0xFFFFFFD2, 0, 0, 1);
                class63.field1350 = class118.field2758;
                class8.field113 = 0;
                class69.field1512 = class142.field3392;
                class104.field2419 = 2;
                class125.field2977++;
                class61.field1303.method1054(arg1 ^ 0xFFFFFFF5, 99);
                class61.field1303.method489(class137.field3305, -1762115368);
                class61.field1303.method465(arg1 - 19959, var5);
                class61.field1303.method465(-19962, class77.field1758);
            }
        }
        if (var3 == 18) {
            class101.field2320++;
            boolean var38 = class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 0, 0, 98, 0, 0, 0);
            if (!var38) {
                class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 1, 0, arg1 - 92, 0, 0, 1);
            }
            class104.field2419 = 2;
            class8.field113 = 0;
            class63.field1350 = class118.field2758;
            class69.field1512 = class142.field3392;
            class61.field1303.method1054(8, 192);
            class61.field1303.method441((byte) 121, var2 + class72.field1611);
            class61.field1303.method496(class65.field1408 + var4, (byte) 54);
            class61.field1303.method465(-19962, var5);
        }
        if (var3 == 30) {
            class8 var40 = class123.field2894[var5];
            if (var40 != null) {
                class58.field1204++;
                class10.method80(var40.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var40.field758[0], 1, 0, arg1 - 123, 0, 0, 1);
                class69.field1512 = class142.field3392;
                class8.field113 = 0;
                class63.field1350 = class118.field2758;
                class104.field2419 = 2;
                class61.field1303.method1054(arg1 ^ 0xFFFFFFF5, 103);
                class61.field1303.method464(var5, (byte) 108);
                class61.field1303.method465(arg1 - 19959, class52.field1087);
                class61.field1303.method489(class80.field1818, -1762115368);
                class61.field1303.method441((byte) 106, class66.field1417);
            }
        }
        if (var3 == 13) {
            class122.field2854++;
            class22.method159((byte) -37, var4, var5, var2);
            class61.field1303.method1054(8, 136);
            class61.field1303.method496(class65.field1408 + var4, (byte) 95);
            class61.field1303.method465(-19962, var5 >> 14 & 0x7FFF);
            class61.field1303.method464(class72.field1611 + var2, (byte) 72);
        }
        if (var3 == 23) {
            class96.method735((byte) -124);
            class52.field1087 = var2;
            field460 = true;
            class66.field1417 = var5;
            class80.field1818 = var4;
            class145.field3452 = 1;
            class16.field319 = class101.method786((byte) 125, new class114[] { field454, class128.method988(var5, false).field1111, class128.field3073 });
            if (class16.field319 == null) {
                class16.field319 = class145.field3455;
            }
            return;
        }
        if (var3 == 1) {
            class14.field301++;
            class61.field1303.method1054(8, 229);
            class61.field1303.method464(var2, (byte) 60);
            class61.field1303.method489(var4, arg1 - 1762115365);
            class61.field1303.method496(var5, (byte) 39);
            class117.field2739 = 0;
            class63.field1347 = var2;
            class141.field3374 = 2;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            class123.field2895 = var4;
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
        }
        if (var3 == 33) {
            boolean var41 = class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 0, 0, -117, 0, 0, 0);
            if (!var41) {
                class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 1, 0, -113, 0, 0, 1);
            }
            class69.field1512 = class142.field3392;
            class63.field1350 = class118.field2758;
            class86.field1935++;
            class104.field2419 = 2;
            class8.field113 = 0;
            class61.field1303.method1054(arg1 + 11, 57);
            class61.field1303.method464(class77.field1758, (byte) 32);
            class61.field1303.method441((byte) 114, var5);
            class61.field1303.method496(class65.field1408 + var4, (byte) 110);
            class61.field1303.method464(class72.field1611 + var2, (byte) 101);
            class61.field1303.method488(class137.field3305, arg1 ^ 0xFFFFFE98);
        }
        if (var3 == 1005) {
            class104.field2419 = 2;
            class69.field1512 = class142.field3392;
            class63.field1350 = class118.field2758;
            class8.field113 = 0;
            class8 var43 = class123.field2894[var5];
            if (var43 != null) {
                class124 var44 = var43.field121;
                if (var44.field2939 != null) {
                    var44 = var44.method961(-1);
                }
                if (var44 != null) {
                    class11.field193++;
                    class61.field1303.method1054(8, 105);
                    class61.field1303.method496(var44.field2933, (byte) -119);
                }
            }
        }
        if (var3 == 15) {
            class31.field627++;
            class61.field1303.method1054(8, 106);
            class61.field1303.method465(arg1 - 19959, class77.field1758);
            class61.field1303.method476(-7155, var4);
            class61.field1303.method479(23538, class137.field3305);
            class61.field1303.method496(var2, (byte) -128);
        }
        if (var3 == 17) {
            class114 var45 = class123.field2878[arg0];
            int var46 = var45.method858((byte) 122, class128.field3073);
            if (var46 != -1) {
                if (class117.field2747 == -1) {
                    class127.method981((byte) 99);
                    if (class128.field3057 != -1) {
                        class72.field1617 = var45.method866(false, var46 + 5).method862(-6488);
                        class20.field364 = false;
                        class121.field2832 = class117.field2747 = class128.field3057;
                    }
                } else {
                    class86.method660(class72.field1610, class9.field133, true, 0);
                    if (class49.field1034 != null) {
                        class86.method660(class72.field1610, class49.field1034, true, 0);
                    }
                }
            }
        }
        if (var3 == 24) {
            class22.method158(var2, var4, var5, 0);
        }
        if (var3 == 34) {
            class126 var47 = class36.field762[var5];
            if (var47 != null) {
                class106.field2438++;
                class10.method80(var47.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var47.field758[0], 1, 0, 104, 0, 0, 1);
                class69.field1512 = class142.field3392;
                class104.field2419 = 2;
                class63.field1350 = class118.field2758;
                class8.field113 = 0;
                class61.field1303.method1054(arg1 + 11, 210);
                class61.field1303.method441((byte) 48, var5);
            }
        }
        if (var3 == 38) {
            class55.field1136++;
            boolean var48 = class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 0, 0, 12, 0, 0, 0);
            if (!var48) {
                class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 1, 0, -122, 0, 0, 1);
            }
            class69.field1512 = class142.field3392;
            class8.field113 = 0;
            class63.field1350 = class118.field2758;
            class104.field2419 = 2;
            class61.field1303.method1054(arg1 ^ 0xFFFFFFF5, 159);
            class61.field1303.method464(class66.field1417, (byte) 17);
            class61.field1303.method464(class72.field1611 + var2, (byte) 62);
            class61.field1303.method496(class52.field1087, (byte) 107);
            class61.field1303.method465(-19962, class65.field1408 + var4);
            class61.field1303.method488(class80.field1818, 357);
            class61.field1303.method465(arg1 ^ 0x4DFB, var5);
        }
        if (var3 == 50) {
            class61.field1303.method1054(8, 117);
            class61.field1303.method496(var2, (byte) -117);
            class145.field3457++;
            class61.field1303.method479(23538, var4);
            class61.field1303.method465(arg1 - 19959, var5);
            class141.field3374 = 2;
            class117.field2739 = 0;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            class63.field1347 = var2;
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
            class123.field2895 = var4;
        }
        if (var3 == 6) {
            class18.field334++;
            class61.field1303.method1054(8, 243);
            class61.field1303.method489(var4, -1762115368);
            class61.field1303.method464(var5, (byte) 123);
            class61.field1303.method464(var2, (byte) 124);
            class123.field2895 = var4;
            class63.field1347 = var2;
            class141.field3374 = 2;
            class117.field2739 = 0;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
        }
        if (var3 == 40) {
            class114 var50 = class123.field2878[arg0];
            int var51 = var50.method858((byte) 84, class128.field3073);
            if (var51 != -1) {
                long var52 = var50.method866(false, var51 + 5).method862(-6488).method877(29486);
                int var54 = -1;
                for (int var55 = 0; var55 < class128.field3058; var55++) {
                    if (class18.field338[var55] == var52) {
                        var54 = var55;
                        break;
                    }
                }
                if (var54 != -1 && class34.field674[var54] > 0) {
                    class140.field3335 = true;
                    class5.field75 = true;
                    class72.field1619 = class72.field1610;
                    class142.field3382 = 0;
                    class51.field1056 = 3;
                    class42.field849 = class18.field338[var54];
                    class72.field1614 = class101.method786((byte) 125, new class114[] { class137.field3314, class5.field64[var54] });
                }
            }
        }
        if (var3 == 36) {
            class132.field3184++;
            class61.field1303.method1054(8, 33);
            class61.field1303.method496(var5, (byte) 43);
            class61.field1303.method476(arg1 - 7152, var4);
            class61.field1303.method465(-19962, var2);
            class117.field2739 = 0;
            class123.field2895 = var4;
            class63.field1347 = var2;
            class141.field3374 = 2;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
        }
        if (var3 == 39) {
            class127.method981((byte) 99);
        }
        if (var3 == 55) {
            class104.method800(class8.field120, (byte) -90);
            class140.field3335 = true;
            class8.field120 = -1;
        }
        if (var3 == 32) {
            class8 var56 = class123.field2894[var5];
            if (var56 != null) {
                class120.field2794++;
                class10.method80(var56.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var56.field758[0], 1, 0, -9, 0, 0, 1);
                class63.field1350 = class118.field2758;
                class69.field1512 = class142.field3392;
                class104.field2419 = 2;
                class8.field113 = 0;
                class61.field1303.method1054(8, 176);
                class61.field1303.method488(class137.field3305, 357);
                class61.field1303.method496(class77.field1758, (byte) -124);
                class61.field1303.method464(var5, (byte) 44);
            }
        }
        if (var3 == 52) {
            class22.method159((byte) 127, var4, var5, var2);
            class16.field329++;
            class61.field1303.method1054(arg1 + 11, 70);
            class61.field1303.method496(var5 >> 14 & 0x7FFF, (byte) 50);
            class61.field1303.method465(-19962, class65.field1408 + var4);
            class61.field1303.method441((byte) 92, class72.field1611 + var2);
        }
        if (var3 == 29) {
            class13.field298++;
            class61.field1303.method1054(8, 184);
            class61.field1303.method464(var2, (byte) 90);
            class61.field1303.method488(class80.field1818, 357);
            class61.field1303.method465(-19962, class52.field1087);
            class61.field1303.method441((byte) 91, class66.field1417);
            class61.field1303.method496(var5, (byte) -113);
            class61.field1303.method479(23538, var4);
            class63.field1347 = var2;
            class117.field2739 = 0;
            class141.field3374 = 2;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
            class123.field2895 = var4;
        }
        if (var3 == 31) {
            class61.field1303.method1054(8, 74);
            class85.field1905++;
            class61.field1303.method496(var5, (byte) -114);
            class61.field1303.method465(-19962, var2);
            class61.field1303.method489(var4, arg1 ^ 0x6907BF25);
            class63.field1347 = var2;
            class123.field2895 = var4;
            class117.field2739 = 0;
            class141.field3374 = 2;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
        }
        if (var3 == 12) {
            class126 var57 = class36.field762[var5];
            if (var57 != null) {
                class55.field1143++;
                class10.method80(var57.field748[0], class7.field103.field758[0], class7.field103.field748[0], 2, false, var57.field758[0], 1, 0, arg1 + 16, 0, 0, 1);
                class104.field2419 = 2;
                class63.field1350 = class118.field2758;
                class8.field113 = 0;
                class69.field1512 = class142.field3392;
                class61.field1303.method1054(8, 183);
                class61.field1303.method464(var5, (byte) 109);
            }
        }
        if (var3 == 56) {
            boolean var58 = class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 0, 0, -104, 0, 0, 0);
            class123.field2873++;
            if (!var58) {
                class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 1, 0, 35, 0, 0, 1);
            }
            class63.field1350 = class118.field2758;
            class104.field2419 = 2;
            class8.field113 = 0;
            class69.field1512 = class142.field3392;
            class61.field1303.method1054(8, 62);
            class61.field1303.method441((byte) 40, class72.field1611 + var2);
            class61.field1303.method441((byte) 127, var4 + class65.field1408);
            class61.field1303.method496(var5, (byte) -110);
        }
        if (var3 == 1006) {
            class90 var60 = class14.method115(65535, var4);
            if (var60 == null || var60.field2082[var2] < 100000) {
                class61.field1303.method1054(arg1 + 11, 215);
                class11.field196++;
                class61.field1303.method465(-19962, var5);
            } else {
                class86.method660(class72.field1610, class101.method786((byte) 125, new class114[] { class14.method113(var60.field2082[var2], arg1 - 31763), class7.field95, class128.method988(var5, false).field1111 }), true, 0);
            }
            class123.field2895 = var4;
            class117.field2739 = 0;
            class63.field1347 = var2;
            class141.field3374 = 2;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
        }
        if (var3 == 48) {
            class61.field1303.method1054(arg1 ^ 0xFFFFFFF5, 25);
            class1.field3++;
            class61.field1303.method465(-19962, var5);
            class61.field1303.method464(var2, (byte) 99);
            class61.field1303.method489(var4, -1762115368);
            class141.field3374 = 2;
            class63.field1347 = var2;
            class123.field2895 = var4;
            class117.field2739 = 0;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
        }
        if (var3 == 41) {
            class61.field1303.method1054(8, 84);
            class61.field1303.method496(var2, (byte) -128);
            class66.field1429++;
            class61.field1303.method489(var4, -1762115368);
            class61.field1303.method465(-19962, class77.field1758);
            class61.field1303.method464(var5, (byte) 38);
            class61.field1303.method476(-7155, class137.field3305);
            class123.field2895 = var4;
            class141.field3374 = 2;
            if (var4 >> 16 == class117.field2747) {
                class141.field3374 = 1;
            }
            class63.field1347 = var2;
            class117.field2739 = 0;
            if (var4 >> 16 == class123.field2899) {
                class141.field3374 = 3;
            }
        }
        if (var3 == 19) {
            if (class116.field2714) {
                class101.field2325.method1043(class20.field346, var2 - 4, var4 - 4);
            } else {
                class101.field2325.method1043(class20.field346, class142.field3392 - 4, class118.field2758 + -4);
            }
        }
        if (var3 == 3) {
            class85.field1887++;
            boolean var61 = class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 0, 0, 112, 0, 0, 0);
            if (!var61) {
                class10.method80(var2, class7.field103.field758[0], class7.field103.field748[0], 2, false, var4, 1, 0, -89, 0, 0, 1);
            }
            class104.field2419 = 2;
            class69.field1512 = class142.field3392;
            class63.field1350 = class118.field2758;
            class8.field113 = 0;
            class61.field1303.method1054(8, 13);
            class61.field1303.method464(var2 + class72.field1611, (byte) 121);
            class61.field1303.method465(-19962, var5);
            class61.field1303.method441((byte) 23, class65.field1408 + var4);
        }
        if (class145.field3452 != 0) {
            field460 = true;
            class145.field3452 = 0;
        }
        if (class125.field2975) {
            class96.method735((byte) -124);
            field460 = true;
        }
        if (arg1 != -3) {
            method171(-86);
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public static final void method171(int arg0) {
        field485++;
        int var1 = class131.field3165;
        int var2 = class132.field3190;
        int var3 = class86.field1930;
        int var4 = class143.field3414;
        int var5 = 6116423;
        class59.method434(var1, var3, var2, var4, var5);
        class59.method434(var1 + 1, var3 - -1, var2 - 2, 16, 0);
        class59.method427(var1 + 1, var3 + 18, var2 - 2, var4 + -19, 0);
        client.field399.method333(class64.field1380, var1 + 3, var3 - -14, var5);
        int var6 = class100.field2289;
        int var7 = class75.field1741;
        if (class14.field304 == 0) {
            var6 -= 4;
            var7 -= 4;
        }
        if (class14.field304 == 1) {
            var6 -= 553;
            var7 -= 205;
        }
        if (class14.field304 == 2) {
            var7 -= 357;
            var6 -= 17;
        }
        for (int var8 = 0; var8 < class60.field1263; var8++) {
            int var9 = var3 + (class60.field1263 - var8 - 1) * 15 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var6 < var1 + var2 && var9 - 13 < var7 && var7 < var9 + 3) {
                var10 = 16776960;
            }
            client.field399.method338(class123.field2878[var8], var1 + 3, var9, var10, true);
        }
        if (arg0 != -7) {
            field487 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public final void method172(int arg0) {
        int var2 = -83 % ((arg0 - 62) / 59);
        field470++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI[IIZ)V")
    public static final void method173(byte arg0, int arg1, int[] arg2, int arg3, boolean arg4) {
        field465++;
        class69.field1520.method528(-1926);
        class103.field2405.method722(0, 0);
        if (arg4) {
            if (arg2[arg1] != -1) {
                if (arg1 == 0) {
                    class101.field2334.method722(22, 10);
                }
                if (arg1 == 1) {
                    class60.field1251.method722(54, 8);
                }
                if (arg1 == 2) {
                    class60.field1251.method722(82, 8);
                }
                if (arg1 == 3) {
                    class79.field1803.method722(110, 8);
                }
                if (arg1 == 4) {
                    class3.field34.method722(153, 8);
                }
                if (arg1 == 5) {
                    class3.field34.method722(181, 8);
                }
                if (arg1 == 6) {
                    class121.field2828.method722(209, 9);
                }
            }
            if (arg2[0] != -1 && arg3 != 0) {
                class25.field489[0].method722(29, 13);
            }
            if (arg2[1] != -1 && arg3 != 1) {
                class25.field489[1].method722(53, 11);
            }
            if (arg2[2] != -1 && arg3 != 2) {
                class25.field489[2].method722(82, 11);
            }
            if (arg2[3] != -1 && arg3 != 3) {
                class25.field489[3].method722(115, 12);
            }
            if (arg2[4] != -1 && arg3 != 4) {
                class25.field489[4].method722(153, 13);
            }
            if (arg2[5] != -1 && arg3 != 5) {
                class25.field489[5].method722(180, 11);
            }
            if (arg2[6] != -1 && arg3 != 6) {
                class25.field489[6].method722(208, 13);
            }
        }
        class25.field514.method528(-1926);
        class73.field1643.method722(0, 0);
        if (arg4) {
            if (arg2[arg1] != -1) {
                if (arg1 == 7) {
                    class55.field1159.method722(42, 0);
                }
                if (arg1 == 8) {
                    class58.field1211.method722(74, 0);
                }
                if (arg1 == 9) {
                    class58.field1211.method722(102, 0);
                }
                if (arg1 == 10) {
                    class9.field131.method722(130, 1);
                }
                if (arg1 == 11) {
                    class39.field826.method722(173, 0);
                }
                if (arg1 == 12) {
                    class39.field826.method722(201, 0);
                }
                if (arg1 == 13) {
                    class61.field1307.method722(229, 0);
                }
            }
            if (arg2[8] != -1 && arg3 != 8) {
                class25.field489[7].method722(74, 2);
            }
            if (arg2[9] != -1 && arg3 != 9) {
                class25.field489[8].method722(102, 3);
            }
            if (arg2[10] != -1 && arg3 != 10) {
                class25.field489[9].method722(137, 4);
            }
            if (arg2[11] != -1 && arg3 != 11) {
                class25.field489[10].method722(174, 2);
            }
            if (arg2[12] != -1 && arg3 != 12) {
                class25.field489[11].method722(201, 2);
            }
            if (arg2[13] != -1 && arg3 != 13) {
                class25.field489[12].method722(226, 2);
            }
        }
        try {
            Graphics var5 = class114.field2678.getGraphics();
            class69.field1520.method526(0, 516, 160, var5);
            if (arg0 >= 121) {
                class25.field514.method526(0, 496, 466, var5);
            }
        } catch (Exception var6) {
            class114.field2678.repaint();
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
    public static void method174(boolean arg0) {
        field487 = null;
        field467 = null;
        field481 = null;
        field454 = null;
        field477 = null;
        field464 = null;
        field463 = null;
        field452 = null;
        if (!arg0) {
            field454 = null;
        }
        field455 = null;
        field483 = null;
        field474 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLrd;)Z")
    public static final boolean method175(byte arg0, class114 arg1) {
        field458++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 32) {
            method179(105);
        }
        for (int var2 = 0; var2 < class128.field3058; var2++) {
            if (arg1.method886(class5.field64[var2], true)) {
                return true;
            }
        }
        return arg1.method886(class7.field103.field3018, true);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
    public final void method176(int arg0, int arg1, int arg2) {
        field453++;
        if (arg2 != 14) {
            method177(-27);
        }
        if (arg1 == 0) {
            arg1 = 1;
        }
        int var4 = class106.method810(arg1, (byte) -128) - arg0;
        if (this.field471 != null) {
            this.field468 = var4;
        } else if (this.field480) {
            try {
                class76.method611(this.field459.field882, "midibox.volume=" + var4 + ";", true);
            } catch (Throwable var5) {
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static final void method177(int arg0) {
        class79.field1790.method200(arg0 - 92);
        class32.field654.method200(-104);
        class126.field3002.method200(-101);
        if (arg0 != 0) {
            field466 = false;
        }
        class107.field2467.method200(-99);
        field451++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIB[B)V")
    public final void method178(boolean arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 > -19) {
            return;
        }
        field479++;
        this.field471 = this.field459.method307(0);
        if (this.field471 == null) {
            return;
        }
        if (arg1 == 0) {
            arg1 = 1;
        }
        this.field468 = class106.method810(arg1, (byte) -118);
        this.field473 = arg0;
        this.field478 = arg3;
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
    public static final void method179(int arg0) {
        field486++;
        int var1 = class130.field3150 + class7.field103.field712;
        if (class101.field2339[96]) {
            class117.field2754 += (-class117.field2754 - 24) / 2;
        } else if (class101.field2339[97]) {
            class117.field2754 += (24 - class117.field2754) / 2;
        } else {
            class117.field2754 /= 2;
        }
        int var2 = 46 % ((2 - arg0) / 47);
        if (class101.field2339[98]) {
            class65.field1387 += (12 - class65.field1387) / 2;
        } else if (class101.field2339[99]) {
            class65.field1387 += (-class65.field1387 - 12) / 2;
        } else {
            class65.field1387 /= 2;
        }
        class92.field2159 = class117.field2754 / 2 + class92.field2159 & 0x7FF;
        class88.field1963 += class65.field1387 / 2;
        int var3 = class46.field946 + class7.field103.field756;
        if (class88.field1963 < 128) {
            class88.field1963 = 128;
        }
        if (class123.field2902 - var1 < -500 || class123.field2902 - var1 > 500 || class110.field2555 - var3 < -500 || class110.field2555 - var3 > 500) {
            class110.field2555 = var3;
            class123.field2902 = var1;
        }
        if (class88.field1963 > 383) {
            class88.field1963 = 383;
        }
        int var4 = 0;
        if (class123.field2902 != var1) {
            class123.field2902 += (var1 - class123.field2902) / 16;
        }
        if (class110.field2555 != var3) {
            class110.field2555 += (var3 - class110.field2555) / 16;
        }
        int var5 = class123.field2902 >> 7;
        int var6 = class110.field2555 >> 7;
        int var7 = class137.method1110(class20.field346, class123.field2902, class110.field2555, (byte) 37);
        if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
            for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                for (int var9 = var6 - 4; var9 <= var6 + 4; var9++) {
                    int var10 = class20.field346;
                    if (var10 < 3 && (class22.field430[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var7 - class124.field2958[var10][var8][var9];
                    if (var11 > var4) {
                        var4 = var11;
                    }
                }
            }
        }
        int var12 = var4 * 192;
        if (var12 > 98048) {
            var12 = 98048;
        }
        if (var12 < 32768) {
            var12 = 32768;
        }
        if (var12 > class92.field2166) {
            class92.field2166 += (var12 - class92.field2166) / 24;
        } else if (class92.field2166 > var12) {
            class92.field2166 += (var12 - class92.field2166) / 80;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lrd;Z)V")
    public static final void method180(class114 arg0, boolean arg1) {
        field482++;
        if (arg0 == null || arg0.method854(-29348) == 0) {
            class26.field543 = 0;
            return;
        }
        class114[] var2 = new class114[100];
        class114 var3 = arg0;
        if (arg1) {
            return;
        }
        int var4 = 0;
        while (true) {
            int var5 = var3.method875(32, (byte) 99);
            if (var5 == -1) {
                class114 var7 = var3.method862(-6488);
                if (var7.method854(-29348) > 0) {
                    var2[var4++] = var7.method888(-34);
                }
                class26.field543 = 0;
                label51: for (int var8 = 0; var8 < class7.field105; var8++) {
                    class52 var9 = class128.method988(var8, false);
                    if (var9.field1085 == -1 && var9.field1111 != null) {
                        class114 var10 = var9.field1111.method888(-34);
                        for (int var11 = 0; var11 < var4; var11++) {
                            if (var10.method858((byte) 81, var2[var11]) == -1) {
                                continue label51;
                            }
                        }
                        class8.field115[class26.field543] = var10;
                        class120.field2792[class26.field543] = var8;
                        class26.field543++;
                        if (class26.field543 >= class8.field115.length) {
                            return;
                        }
                    }
                }
                return;
            }
            class114 var6 = var3.method860(var5, -23745, 0).method862(-6488);
            if (var6.method854(-29348) > 0) {
                var2[var4++] = var6.method888(-34);
            }
            var3 = var3.method866(false, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lg;)V")
    public class24(class43 arg0) {
        this.field459 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public final void method181(byte arg0) {
        if (this.field480) {
            try {
                class76.method611(this.field459.field882, "midibox.src=\"c:/silence.mid\";", true);
            } catch (Throwable var3) {
            }
            this.field480 = false;
        }
        field472++;
        this.field471 = null;
        int var2 = 78 / ((71 - arg0) / 40);
    }
}
