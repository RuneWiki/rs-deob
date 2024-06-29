import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class30 {

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public int field856 = 0;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public int field870 = 0;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lpd;")
    public static class94 field850 = class28.method249(-101, "blinken1:");

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field860 = -1;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lpd;")
    private static class94 field854 = class28.method249(123, "Enter amount:");

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lpd;")
    private static class94 field855 = class28.method249(-50, "wave2:");

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Lpd;")
    public static class94 field862 = field855;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "Lpd;")
    public static class94 field871 = class28.method249(81, "Entfernen");

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lpd;")
    private static class94 field864 = class28.method249(-71, "button near the top of that page)3");

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lpd;")
    public static class94 field859 = field864;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "Lpd;")
    public static class94 field866 = field854;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field875 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public int field869;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "Ls;")
    public static class111 field872;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Ltc;")
    public static class116 field852;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lbe;")
    public class12 field858;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Lbe;")
    public class12 field865;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "Lmb;")
    public static class73 field867;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[Lad;")
    public static class5[] field849;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V", line = 40)
    public static final void method259(int arg0, boolean arg1) {
        if (arg0 > -98) {
            field866 = null;
        }
        field853++;
        if (class86.field2186 == null) {
            return;
        }
        try {
            class122 var2 = new class122(4);
            var2.method916(-2, arg1 ? 2 : 3);
            var2.method962(0, (byte) -126);
            class86.field2186.method639(var2.field3074, 1885, 4, 0);
        } catch (IOException var4) {
            try {
                class86.field2186.method636(1);
            } catch (Exception var3) {
            }
            class28.field814++;
            class86.field2186 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 98)
    public static void method260(int arg0) {
        field866 = null;
        field849 = null;
        field867 = null;
        field859 = null;
        if (arg0 > -68) {
            method260(-108);
        }
        field871 = null;
        field862 = null;
        field855 = null;
        field852 = null;
        field854 = null;
        field850 = null;
        field872 = null;
        field864 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lbd;Luc;II)V", line = 126)
    public static final void method261(class11 arg0, class122 arg1, int arg2, int arg3) {
        field851++;
        if (arg3 != 10348) {
            field854 = null;
        }
        class6 var4 = new class6();
        var4.field117 = arg1.method943(arg3 - 11373);
        var4.field120 = arg1.method952(false);
        var4.field127 = new int[var4.field117];
        var4.field115 = new int[var4.field117];
        var4.field124 = new class118[var4.field117];
        var4.field119 = new class118[var4.field117];
        var4.field123 = new int[var4.field117];
        var4.field125 = new byte[var4.field117][][];
        for (int var5 = 0; var5 < var4.field117; var5++) {
            try {
                int var6 = arg1.method943(-1025);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var17 = 0;
                    String var18 = new String(arg1.method937(1).method715(0));
                    String var19 = new String(arg1.method937(1).method715(arg3 ^ 0x286C));
                    if (var6 == 1) {
                        var17 = arg1.method952(false);
                    }
                    var4.field115[var5] = var6;
                    var4.field127[var5] = var17;
                    var4.field119[var5] = arg0.method69(class64.method478((byte) -102, var18), 85, var19);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg1.method937(arg3 ^ 0x286D).method715(arg3 - 10348));
                    String var8 = new String(arg1.method937(1).method715(0));
                    int var9 = arg1.method943(-1025);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg1.method937(1).method715(0));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg1.method952(false);
                            var12[var13] = new byte[var14];
                            arg1.method945(255, var14, var12[var13], 0);
                        }
                    }
                    var4.field115[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class64.method478((byte) -6, var10[var16]);
                    }
                    var4.field124[var5] = arg0.method62(var8, var15, class64.method478((byte) -3, var7), -25053);
                    var4.field125[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field123[var5] = -1;
            } catch (SecurityException var21) {
                var4.field123[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field123[var5] = -3;
            } catch (Exception var23) {
                var4.field123[var5] = -4;
            } catch (Throwable var24) {
                var4.field123[var5] = -5;
            }
        }
        class42.field1061.method894(12800, var4);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)Z", line = 252)
    public static final boolean method262(int arg0) {
        int var1 = -1 % ((24 - arg0) / 63);
        long var2 = class115.method856(true);
        int var4 = (int) (var2 - class100.field2542);
        field861++;
        class100.field2542 = var2;
        if (var4 > 200) {
            var4 = 200;
        }
        class38.field999 += var4;
        if (class26.field705 == 0 && class98.field2486 == 0 && class82.field2099 == 0 && class37.field966 == 0) {
            return true;
        } else if (class86.field2186 == null) {
            return false;
        } else {
            try {
                if (class38.field999 > 30000) {
                    throw new IOException();
                }
                while (class98.field2486 < 20 && class37.field966 > 0) {
                    class7 var5 = (class7) class86.field2188.method22(13389);
                    class122 var6 = new class122(4);
                    var6.method916(-2, 1);
                    var6.method962((int) var5.field3345, (byte) -123);
                    class86.field2186.method639(var6.field3074, 1885, 4, 0);
                    class89.field2278.method24(var5.field3345, var5, -82);
                    class98.field2486++;
                    class37.field966--;
                }
                while (class26.field705 < 20 && class82.field2099 > 0) {
                    class7 var7 = (class7) class64.field1578.method232(29272);
                    class122 var8 = new class122(4);
                    var8.method916(-2, 0);
                    var8.method962((int) var7.field3345, (byte) -123);
                    class86.field2186.method639(var8.field3074, 1885, 4, 0);
                    var7.method744((byte) 109);
                    class81.field2080.method24(var7.field3345, var7, -94);
                    class26.field705++;
                    class82.field2099--;
                }
                for (int var9 = 0; var9 < 100; var9++) {
                    int var10 = class86.field2186.method637(1);
                    if (var10 < 0) {
                        throw new IOException();
                    }
                    if (var10 == 0) {
                        break;
                    }
                    class38.field999 = 0;
                    byte var11 = 0;
                    if (class27.field708 == null) {
                        var11 = 8;
                    } else if (class117.field2936 == 0) {
                        var11 = 1;
                    }
                    if (var11 <= 0) {
                        int var12 = class119.field2971.field3074.length - class27.field708.field140;
                        int var13 = 512 - class117.field2936;
                        if (var13 > var12 - class119.field2971.field3047) {
                            var13 = var12 - class119.field2971.field3047;
                        }
                        if (var10 < var13) {
                            var13 = var10;
                        }
                        class86.field2186.method642(-24993, var13, class119.field2971.field3047, class119.field2971.field3074);
                        if (class89.field2324 != 0) {
                            for (int var14 = 0; var14 < var13; var14++) {
                                class119.field2971.field3074[class119.field2971.field3047 + var14] = (byte) class21.method156(class119.field2971.field3074[class119.field2971.field3047 + var14], class89.field2324);
                            }
                        }
                        class119.field2971.field3047 += var13;
                        class117.field2936 += var13;
                        if (class119.field2971.field3047 == var12) {
                            if (class27.field708.field3345 == 16711935L) {
                                class25.field678 = class119.field2971;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class73 var16 = class75.field1835[var15];
                                    if (var16 != null) {
                                        class25.field678.field3047 = var15 * 4 + 5;
                                        int var17 = class25.field678.method952(false);
                                        var16.method549(9505, var17);
                                    }
                                }
                            } else {
                                class86.field2167.reset();
                                class86.field2167.update(class119.field2971.field3074, 0, var12);
                                int var18 = (int) class86.field2167.getValue();
                                if (class27.field708.field147 != var18) {
                                    try {
                                        class86.field2186.method636(1);
                                    } catch (Exception var30) {
                                    }
                                    class89.field2324 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class86.field2186 = null;
                                    class107.field2667++;
                                    return false;
                                }
                                class107.field2667 = 0;
                                class28.field814 = 0;
                                class27.field708.field153.method548((int) (class27.field708.field3345 & 0xFFFFL), class1.field3, class119.field2971.field3074, -3508, (class27.field708.field3345 & 0xFF0000L) == 16711680L);
                            }
                            class27.field708.method1074((byte) -28);
                            class119.field2971 = null;
                            class117.field2936 = 0;
                            if (class1.field3) {
                                class98.field2486--;
                            } else {
                                class26.field705--;
                            }
                            class27.field708 = null;
                        } else {
                            if (class117.field2936 != 512) {
                                break;
                            }
                            class117.field2936 = 0;
                        }
                    } else {
                        int var19 = var11 - class123.field3108.field3047;
                        if (var10 < var19) {
                            var19 = var10;
                        }
                        class86.field2186.method642(-24993, var19, class123.field3108.field3047, class123.field3108.field3074);
                        if (class89.field2324 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class123.field3108.field3074[class123.field3108.field3047 + var20] = (byte) class21.method156(class123.field3108.field3074[class123.field3108.field3047 + var20], class89.field2324);
                            }
                        }
                        class123.field3108.field3047 += var19;
                        if (class123.field3108.field3047 < var11) {
                            break;
                        }
                        if (class27.field708 == null) {
                            class123.field3108.field3047 = 0;
                            int var21 = class123.field3108.method943(-1025);
                            int var22 = class123.field3108.method938((byte) -107);
                            int var23 = class123.field3108.method943(-1025);
                            int var24 = class123.field3108.method952(false);
                            long var25 = (long) ((var21 << 16) + var22);
                            class7 var27 = (class7) class89.field2278.method19(25239, var25);
                            class1.field3 = true;
                            if (var27 == null) {
                                var27 = (class7) class81.field2080.method19(25239, var25);
                                class1.field3 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class27.field708 = var27;
                            int var28 = var23 == 0 ? 5 : 9;
                            class119.field2971 = new class122(var24 + var28 + class27.field708.field140);
                            class119.field2971.method916(-2, var23);
                            class119.field2971.method917(var24, true);
                            class117.field2936 = 8;
                            class123.field3108.field3047 = 0;
                        } else if (class117.field2936 == 0) {
                            if (class123.field3108.field3074[0] == -1) {
                                class117.field2936 = 1;
                                class123.field3108.field3047 = 0;
                            } else {
                                class27.field708 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class86.field2186.method636(1);
                } catch (Exception var29) {
                }
                class86.field2186 = null;
                class28.field814++;
                return false;
            }
        }
    }
}
