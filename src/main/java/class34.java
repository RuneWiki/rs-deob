import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class class34 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ldd;")
    public static class26 field666 = new class26(64);

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "[I")
    public static int[] field673 = new int[4000];

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field671 = -1;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lrd;")
    private static class114 field676 = class84.method656("Friends", (byte) 123);

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "[I")
    public static int[] field674 = new int[200];

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "Z")
    public static volatile boolean field678 = true;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lrd;")
    public static class114 field681 = class84.method656("Lade Texturen )2 ", (byte) 121);

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "Lrd;")
    public static class114 field683 = null;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "Lrd;")
    public static class114 field684 = field676;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lrd;")
    public static class114 field675 = class84.method656("zur-Uck auf die RuneScape)2Webseite gehen", (byte) 119);

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lrd;")
    private static class114 field680 = class84.method656("Service unavailable)3", (byte) 121);

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "Lrd;")
    public static class114 field689 = class84.method656("Wir vermuten)1 dass Ihr Konto gestohlen wurde", (byte) 117);

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "Lrd;")
    public static class114 field685 = class84.method656("@yel@*V", (byte) 126);

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Lrd;")
    public static class114 field687 = field680;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Lrd;")
    private static class114 field686 = class84.method656("Starting game engine)3)3)3", (byte) 115);

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lrd;")
    public static class114 field677 = field686;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
    public static int[] field669;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static final void method243(int arg0) {
        if (arg0 != 32555) {
            method249(33);
        }
        field667++;
        while (class77.field1752.method1058(arg0 - 32672, class74.field1697) >= 27) {
            int var1 = class77.field1752.method1050((byte) 87, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class123.field2894[var1] == null) {
                class123.field2894[var1] = new class8();
                var2 = true;
            }
            class8 var3 = class123.field2894[var1];
            class16.field317[class77.field1765++] = var1;
            var3.field714 = class20.field370;
            int var4 = class77.field1752.method1050((byte) 41, 5);
            var3.field121 = class51.method361(class77.field1752.method1050((byte) 121, 13), (byte) 48);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class16.field330[class77.field1752.method1050((byte) 65, 3)];
            if (var2) {
                var3.field700 = var5;
            }
            int var6 = class77.field1752.method1050((byte) 127, 5);
            int var7 = class77.field1752.method1050((byte) 18, 1);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var7 == 1) {
                class118.field2771[class48.field1004++] = var1;
            }
            int var8 = class77.field1752.method1050((byte) 91, 1);
            var3.field739 = var3.field121.field2931;
            var3.field743 = var3.field121.field2929;
            var3.field722 = var3.field121.field2942;
            if (var3.field722 == 0) {
                var3.field700 = 0;
            }
            var3.field716 = var3.field121.field2948;
            var3.field735 = var3.field121.field2946;
            var3.field696 = var3.field121.field2935;
            var3.field697 = var3.field121.field2923;
            var3.field757 = var3.field121.field2954;
            var3.field730 = var3.field121.field2912;
            var3.method255((byte) -121, var8 == 1, class7.field103.field758[0] + var4, class7.field103.field748[0] + var6);
        }
        class77.field1752.method1055((byte) 61);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
    public static final int method244(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg0 << 16) + arg2);
        field682++;
        if (arg1 <= 0) {
            return 15;
        } else if (class102.field2392 != null && class102.field2392.field1448 == var3) {
            return class127.field3046.field1227 * 99 / (class127.field3046.field1248.length - class102.field2392.field3068) + 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)I")
    public abstract int method6(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lpb;BLrd;Lrd;)Lgb;")
    public static final class45 method245(class100 arg0, byte arg1, class114 arg2, class114 arg3) {
        if (arg1 == 126) {
            int var4 = arg0.method766(arg3, (byte) -108);
            int var5 = arg0.method752(arg2, arg1 - 31883, var4);
            field670++;
            return class96.method731(-104, var4, arg0, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static final void method246(int arg0) {
        class140.field3346 = null;
        class120.field2814 = null;
        field679++;
        class111.field2594 = null;
        class29.field599 = null;
        class140.field3328 = null;
        if (arg0 == -1958111762) {
            class31.field630 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public abstract void method7(int arg0);

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    public static final void method247(int arg0) {
        Object var1 = class36.field751;
        synchronized (class36.field751) {
            if (class39.field818 != 0) {
                class39.field818 = 1;
                try {
                    class36.field751.wait();
                } catch (InterruptedException var2) {
                }
            }
            if (arg0 != 30770) {
                method246(10);
            }
        }
        field668++;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    public abstract void method8(int arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static final void method248(boolean arg0) {
        int var1 = -1;
        if (class145.field3452 == 0 && !class125.field2975) {
            class73.field1635++;
            class3.method10(class100.field2289, class72.field1610, class75.field1741, (byte) 124, 19, class107.field2470, 0);
        }
        for (int var2 = 0; var2 < class133.field3260; var2++) {
            int var3 = class133.field3244[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 29 & 0x3;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var6 == 2 && class101.field2325.method1009(class20.field346, var4, var5, var3) >= 0) {
                    class12 var8 = class130.method1048(-62, var7);
                    if (var8.field241 != null) {
                        var8 = var8.method91(-1);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class145.field3452 == 1) {
                        class82.field1845++;
                        class3.method10(var4, class101.method786((byte) 126, new class114[] { class16.field319, class92.field2162, var8.field243 }), var5, (byte) 122, 51, class117.field2724, var3);
                    } else if (!class125.field2975) {
                        class3.field23++;
                        class114[] var9 = var8.field257;
                        if (class106.field2445) {
                            var9 = class29.method220(110, var9);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class21.field377++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 52;
                                    }
                                    if (var10 == 1) {
                                        var11 = 5;
                                    }
                                    if (var10 == 2) {
                                        var11 = 46;
                                    }
                                    if (var10 == 3) {
                                        var11 = 13;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1002;
                                    }
                                    class3.method10(var4, class101.method786((byte) 127, new class114[] { class111.field2602, var8.field243 }), var5, (byte) 125, var11, var9[var10], var3);
                                }
                            }
                        }
                        class3.method10(var4, class101.method786((byte) 126, new class114[] { class111.field2602, var8.field243 }), var5, (byte) 125, 1003, class124.field2937, var8.field206 << 14);
                    } else if ((class22.field427 & 0x4) == 4) {
                        class48.field988++;
                        class3.method10(var4, class101.method786((byte) 127, new class114[] { field683, class92.field2162, var8.field243 }), var5, (byte) 126, 8, class120.field2803, var3);
                    }
                }
                if (var6 == 1) {
                    class8 var12 = class123.field2894[var7];
                    if (var12.field121.field2946 == 1 && (var12.field712 & 0x7F) == 64 && (var12.field756 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class77.field1765; var13++) {
                            class8 var16 = class123.field2894[class16.field317[var13]];
                            if (var16 != null && var12 != var16 && var16.field121.field2946 == 1 && var12.field712 == var16.field712 && var12.field756 == var16.field756) {
                                class50.method357((byte) -86, var4, class16.field317[var13], var5, var16.field121);
                            }
                        }
                        for (int var14 = 0; var14 < class8.field116; var14++) {
                            class126 var15 = class36.field762[class110.field2573[var14]];
                            if (var15 != null && var12.field712 == var15.field712 && var12.field756 == var15.field756) {
                                class135.method1107(var5, 14, var4, var15, class110.field2573[var14]);
                            }
                        }
                    }
                    class50.method357((byte) -90, var4, var7, var5, var12.field121);
                }
                if (var6 == 0) {
                    class126 var17 = class36.field762[var7];
                    if ((var17.field712 & 0x7F) == 64 && (var17.field756 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class77.field1765; var18++) {
                            class8 var21 = class123.field2894[class16.field317[var18]];
                            if (var21 != null && var21.field121.field2946 == 1 && var17.field712 == var21.field712 && var17.field756 == var21.field756) {
                                class50.method357((byte) -86, var4, class16.field317[var18], var5, var21.field121);
                            }
                        }
                        for (int var19 = 0; var19 < class8.field116; var19++) {
                            class126 var20 = class36.field762[class110.field2573[var19]];
                            if (var20 != null && var17 != var20 && var17.field712 == var20.field712 && var17.field756 == var20.field756) {
                                class135.method1107(var5, 14, var4, var20, class110.field2573[var19]);
                            }
                        }
                    }
                    class135.method1107(var5, 14, var4, var17, var7);
                }
                if (var6 == 3) {
                    class84 var22 = class77.field1767[class20.field346][var4][var5];
                    if (var22 != null) {
                        for (class96 var23 = (class96) var22.method646((byte) 24); var23 != null; var23 = (class96) var22.method650(-117)) {
                            class52 var24 = class128.method988(var23.field2205, false);
                            if (class145.field3452 == 1) {
                                class3.method10(var4, class101.method786((byte) 127, new class114[] { class16.field319, class25.field504, var24.field1111 }), var5, (byte) 124, 38, class117.field2724, var23.field2205);
                                class38.field793++;
                            } else if (!class125.field2975) {
                                class56.field1175++;
                                class114[] var25 = var24.field1095;
                                if (class106.field2445) {
                                    var25 = class29.method220(124, var25);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        class62.field1314++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 58;
                                        }
                                        if (var26 == 1) {
                                            var27 = 44;
                                        }
                                        if (var26 == 2) {
                                            var27 = 3;
                                        }
                                        if (var26 == 3) {
                                            var27 = 56;
                                        }
                                        if (var26 == 4) {
                                            var27 = 18;
                                        }
                                        class3.method10(var4, class101.method786((byte) 125, new class114[] { class24.field454, var24.field1111 }), var5, (byte) 121, var27, var25[var26], var23.field2205);
                                    } else if (var26 == 2) {
                                        class3.method10(var4, class101.method786((byte) 127, new class114[] { class24.field454, var24.field1111 }), var5, (byte) 119, 3, class21.field375, var23.field2205);
                                        class142.field3387++;
                                    }
                                }
                                class3.method10(var4, class101.method786((byte) 127, new class114[] { class24.field454, var24.field1111 }), var5, (byte) 125, 1001, class124.field2937, var23.field2205);
                            } else if ((class22.field427 & 0x1) == 1) {
                                class3.method10(var4, class101.method786((byte) 127, new class114[] { field683, class25.field504, var24.field1111 }), var5, (byte) 122, 33, class120.field2803, var23.field2205);
                                field688++;
                            }
                        }
                    }
                }
            }
        }
        if (arg0) {
            field678 = true;
        }
        field672++;
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    public static void method249(int arg0) {
        field676 = null;
        field666 = null;
        field677 = null;
        if (arg0 != -10377) {
            return;
        }
        field680 = null;
        field673 = null;
        field683 = null;
        field675 = null;
        field685 = null;
        field689 = null;
        field684 = null;
        field687 = null;
        field686 = null;
        field669 = null;
        field681 = null;
        field674 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method250(byte[] arg0, boolean arg1) {
        field665++;
        class60 var2 = new class60(arg0);
        if (arg1) {
            method249(-35);
        }
        int var3 = var2.method462((byte) 116);
        int var4 = var2.method442((byte) -107);
        if (var4 < 0 || class79.field1791 != 0 && var4 > class79.field1791) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method471(var4, var5, (byte) 112, 0);
            return var5;
        } else {
            int var6 = var2.method442((byte) -89);
            if (var6 < 0 || class79.field1791 != 0 && var6 > class79.field1791) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class40.method280(var7, var6, arg0, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var9) {
                }
            }
            return var7;
        }
    }
}
