import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class112 extends class30 {

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public int field2521 = -1;

    @OriginalMember(owner = "client!qa", name = "fb", descriptor = "I")
    public int field2529 = -1;

    @OriginalMember(owner = "client!qa", name = "jb", descriptor = "I")
    private int field2533 = 128;

    @OriginalMember(owner = "client!qa", name = "ob", descriptor = "I")
    public int field2538 = 1;

    @OriginalMember(owner = "client!qa", name = "xb", descriptor = "Lje;")
    public class67 field2547 = class92.field2062;

    @OriginalMember(owner = "client!qa", name = "ub", descriptor = "I")
    public int field2544 = -1;

    @OriginalMember(owner = "client!qa", name = "gb", descriptor = "I")
    public int field2530 = -1;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    public int field2516 = -1;

    @OriginalMember(owner = "client!qa", name = "Ab", descriptor = "I")
    private int field2550 = 0;

    @OriginalMember(owner = "client!qa", name = "yb", descriptor = "[Lje;")
    public class67[] field2548 = new class67[5];

    @OriginalMember(owner = "client!qa", name = "kb", descriptor = "I")
    private int field2534 = -1;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public int field2520 = -1;

    @OriginalMember(owner = "client!qa", name = "Hb", descriptor = "I")
    public int field2557 = -1;

    @OriginalMember(owner = "client!qa", name = "Jb", descriptor = "I")
    public int field2559 = 32;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "Z")
    public boolean field2524 = true;

    @OriginalMember(owner = "client!qa", name = "tb", descriptor = "I")
    private int field2543 = -1;

    @OriginalMember(owner = "client!qa", name = "Pb", descriptor = "I")
    private int field2565 = 128;

    @OriginalMember(owner = "client!qa", name = "wb", descriptor = "Z")
    public boolean field2546 = false;

    @OriginalMember(owner = "client!qa", name = "Fb", descriptor = "I")
    public int field2555 = -1;

    @OriginalMember(owner = "client!qa", name = "Rb", descriptor = "Z")
    public boolean field2567 = true;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "Z")
    public boolean field2525 = true;

    @OriginalMember(owner = "client!qa", name = "Tb", descriptor = "I")
    public int field2569 = -1;

    @OriginalMember(owner = "client!qa", name = "Sb", descriptor = "I")
    private int field2568 = 0;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    public static int field2519 = -1;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "Lje;")
    public static class67 field2518 = class85.method592(255, "<col=ffffff>");

    @OriginalMember(owner = "client!qa", name = "pb", descriptor = "Lje;")
    public static class67 field2539 = class85.method592(255, ":chalreq:");

    @OriginalMember(owner = "client!qa", name = "Ib", descriptor = "Lje;")
    private static class67 field2558 = class85.method592(255, "Unexpected server response");

    @OriginalMember(owner = "client!qa", name = "Gb", descriptor = "Lje;")
    private static class67 field2556 = class85.method592(255, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!qa", name = "Eb", descriptor = "Lje;")
    public static class67 field2554 = field2556;

    @OriginalMember(owner = "client!qa", name = "Qb", descriptor = "Lje;")
    public static class67 field2566 = field2558;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "Z")
    public static boolean field2523 = false;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!qa", name = "ib", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!qa", name = "lb", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!qa", name = "nb", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!qa", name = "rb", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!qa", name = "sb", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!qa", name = "vb", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!qa", name = "zb", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!qa", name = "Bb", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!qa", name = "Db", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!qa", name = "Kb", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!qa", name = "Lb", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!qa", name = "Mb", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!qa", name = "Ob", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!qa", name = "hb", descriptor = "Lua;")
    public static class140 field2531;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "Lfd;")
    public static class40 field2522;

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "[I")
    private int[] field2527;

    @OriginalMember(owner = "client!qa", name = "mb", descriptor = "[I")
    public int[] field2536;

    @OriginalMember(owner = "client!qa", name = "Cb", descriptor = "[I")
    private int[] field2552;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "[S")
    private short[] field2515;

    @OriginalMember(owner = "client!qa", name = "eb", descriptor = "[S")
    private short[] field2528;

    @OriginalMember(owner = "client!qa", name = "qb", descriptor = "[S")
    private short[] field2540;

    @OriginalMember(owner = "client!qa", name = "Nb", descriptor = "[S")
    private short[] field2563;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public static void method883(int arg0) {
        field2556 = null;
        field2518 = null;
        field2558 = null;
        if (arg0 != -23005) {
            return;
        }
        field2531 = null;
        field2554 = null;
        field2539 = null;
        field2522 = null;
        field2566 = null;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(III)I")
    public static final int method884(int arg0, int arg1, int arg2) {
        field2561++;
        int var3 = class16.method110(57, arg2 - 1, arg0 - 1) + class16.method110(57, arg2 - 1, arg0 + 1) + class16.method110(57, arg2 + 1, arg0 + -1) + class16.method110(arg1 + -17663, arg2 + 1, arg0 + 1);
        if (arg1 != 17720) {
            method895(-111, 36, false, 127, -5);
        }
        int var4 = class16.method110(57, arg2, arg0 - 1) + class16.method110(57, arg2, arg0 + 1) + class16.method110(57, arg2 + -1, arg0) + class16.method110(57, arg2 + 1, arg0);
        int var5 = class16.method110(57, arg2, arg0);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(B)V")
    public final void method885(byte arg0) {
        field2549++;
        int var2 = 82 / ((arg0 + 25) / 36);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILnc;ILnc;I)Lad;")
    public final class5 method886(int arg0, class93 arg1, int arg2, class93 arg3, int arg4) {
        field2526++;
        if (this.field2536 != null) {
            class112 var6 = this.method890(-1);
            return var6 == null ? null : var6.method886(arg0, arg1, -15725, arg3, arg4);
        }
        class5 var7 = (class5) class106.field2427.method764((long) this.field2541, arg2 ^ 0xFFFF9CE5);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field2552.length; var9++) {
                if (!class133.field3002.method260(this.field2552[var9], 0, false)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class156[] var10 = new class156[this.field2552.length];
            for (int var11 = 0; var11 < this.field2552.length; var11++) {
                var10[var11] = class156.method1186(class133.field3002, this.field2552[var11], 0);
            }
            class156 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class156(var10, var10.length);
            }
            if (this.field2515 != null) {
                for (int var13 = 0; var13 < this.field2515.length; var13++) {
                    var12.method1195(this.field2515[var13], this.field2540[var13]);
                }
            }
            if (this.field2563 != null) {
                for (int var14 = 0; var14 < this.field2563.length; var14++) {
                    var12.method1202(this.field2563[var14], this.field2528[var14]);
                }
            }
            var7 = var12.method1187(this.field2568 + 64, this.field2550 + 850, -30, -50, -30);
            class106.field2427.method765((long) this.field2541, var7, (byte) -64);
        }
        class5 var15;
        if (arg1 != null && arg3 != null) {
            var15 = arg1.method690(arg0, -61, arg3, arg4, var7);
        } else if (arg1 != null) {
            var15 = arg1.method689(var7, false, arg4);
        } else if (arg3 == null) {
            var15 = var7.method41(true);
        } else {
            var15 = arg3.method689(var7, false, arg0);
        }
        if (this.field2533 != 128 || this.field2565 != 128) {
            var15.method37(this.field2533, this.field2565, this.field2533);
        }
        if (arg2 != -15725) {
            field2556 = null;
        }
        return var15;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method887(int arg0, Throwable arg1, String arg2) {
        field2535++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class107.method844((byte) -52, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            if (arg0 != -32453) {
                method884(64, -6, -104);
            }
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class159.field3647.field2500 != null) {
                class43 var8 = class159.field3647.method882(new URL(class159.field3647.field2500.getCodeBase(), "clienterror.ws?c=" + class155.field3537 + "&u=" + class40.field738 + "&v1=" + class111.field2506 + "&v2=" + class111.field2504 + "&e=" + var7), 72);
                while (var8.field806 == 0) {
                    class104.method822(119, 1L);
                }
                if (var8.field806 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field808;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILna;)V")
    private final void method888(int arg0, int arg1, class91 arg2) {
        field2517++;
        if (arg0 >= -18) {
            return;
        }
        if (arg1 == 1) {
            int var4 = arg2.method649(false);
            this.field2552 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2552[var5] = arg2.method641(255);
            }
        } else if (arg1 == 2) {
            this.field2547 = arg2.method634(-1);
        } else if (arg1 == 12) {
            this.field2538 = arg2.method649(false);
        } else if (arg1 == 13) {
            this.field2544 = arg2.method641(255);
        } else if (arg1 == 14) {
            this.field2557 = arg2.method641(255);
        } else if (arg1 == 15) {
            this.field2530 = arg2.method641(255);
        } else if (arg1 == 16) {
            this.field2529 = arg2.method641(255);
        } else if (arg1 == 17) {
            this.field2557 = arg2.method641(255);
            this.field2569 = arg2.method641(255);
            this.field2555 = arg2.method641(255);
            this.field2516 = arg2.method641(255);
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2548[arg1 - 30] = arg2.method634(-1);
            if (this.field2548[arg1 - 30].method479(63, class158.field3624)) {
                this.field2548[arg1 - 30] = null;
                return;
            }
        } else if (arg1 == 40) {
            int var6 = arg2.method649(false);
            this.field2515 = new short[var6];
            this.field2540 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2515[var7] = (short) arg2.method641(255);
                this.field2540[var7] = (short) arg2.method641(255);
            }
            return;
        } else if (arg1 == 41) {
            int var8 = arg2.method649(false);
            this.field2563 = new short[var8];
            this.field2528 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2563[var9] = (short) arg2.method641(255);
                this.field2528[var9] = (short) arg2.method641(255);
            }
            return;
        } else if (arg1 == 60) {
            int var10 = arg2.method649(false);
            this.field2527 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2527[var11] = arg2.method641(255);
            }
            return;
        } else if (arg1 == 93) {
            this.field2567 = false;
            return;
        } else if (arg1 == 95) {
            this.field2520 = arg2.method641(255);
        } else if (arg1 == 97) {
            this.field2533 = arg2.method641(255);
            return;
        } else if (arg1 == 98) {
            this.field2565 = arg2.method641(255);
            return;
        } else if (arg1 == 99) {
            this.field2546 = true;
            return;
        } else if (arg1 == 100) {
            this.field2568 = arg2.method667((byte) -37);
            return;
        } else if (arg1 == 101) {
            this.field2550 = arg2.method667((byte) -37) * 5;
            return;
        } else if (arg1 == 102) {
            this.field2521 = arg2.method641(255);
            return;
        } else if (arg1 == 103) {
            this.field2559 = arg2.method641(255);
            return;
        } else if (arg1 == 106) {
            this.field2534 = arg2.method641(255);
            if (this.field2534 == 65535) {
                this.field2534 = -1;
            }
            this.field2543 = arg2.method641(255);
            if (this.field2543 == 65535) {
                this.field2543 = -1;
            }
            int var12 = arg2.method649(false);
            this.field2536 = new int[var12 + 1];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field2536[var13] = arg2.method641(255);
                if (this.field2536[var13] == 65535) {
                    this.field2536[var13] = -1;
                }
            }
            return;
        } else {
            if (arg1 == 107) {
                this.field2524 = false;
            } else if (arg1 == 109) {
                this.field2525 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(B)Z")
    public final boolean method889(byte arg0) {
        field2537++;
        if (this.field2536 == null) {
            return true;
        }
        int var2 = -1;
        if (arg0 != -3) {
            this.method892(2);
        }
        if (this.field2534 != -1) {
            var2 = class60.method415(this.field2534, (byte) 60);
        } else if (this.field2543 != -1) {
            var2 = class42.field804[this.field2543];
        }
        return var2 >= 0 && this.field2536.length > var2 && this.field2536[var2] != -1;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Lqa;")
    public final class112 method890(int arg0) {
        field2560++;
        int var2 = arg0;
        if (this.field2534 != -1) {
            var2 = class60.method415(this.field2534, (byte) 93);
        } else if (this.field2543 != -1) {
            var2 = class42.field804[this.field2543];
        }
        return var2 < 0 || this.field2536.length <= var2 || this.field2536[var2] == -1 ? null : class106.method838(12861, this.field2536[var2]);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lna;ILq;I)V")
    public static final void method891(class91 arg0, int arg1, class111 arg2, int arg3) {
        field2545++;
        class56 var4 = new class56();
        if (arg3 <= 32) {
            method893(null, null, -33, -40, true, null);
        }
        var4.field1113 = arg0.method649(false);
        var4.field1121 = arg0.method631(-116);
        var4.field1124 = new byte[var4.field1113][][];
        var4.field1127 = new class43[var4.field1113];
        var4.field1125 = new int[var4.field1113];
        var4.field1119 = new int[var4.field1113];
        var4.field1122 = new class43[var4.field1113];
        var4.field1110 = new int[var4.field1113];
        for (int var5 = 0; var5 < var4.field1113; var5++) {
            try {
                int var6 = arg0.method649(false);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg0.method634(-1).method447(23368));
                    int var18 = 0;
                    String var19 = new String(arg0.method634(-1).method447(23368));
                    if (var6 == 1) {
                        var18 = arg0.method631(-122);
                    }
                    var4.field1125[var5] = var6;
                    var4.field1119[var5] = var18;
                    var4.field1127[var5] = arg2.method880(4, var19, class35.method228(var17, 15));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg0.method634(-1).method447(23368));
                    String var8 = new String(arg0.method634(-1).method447(23368));
                    int var9 = arg0.method649(false);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg0.method634(-1).method447(23368));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method631(-55);
                            var12[var13] = new byte[var14];
                            arg0.method652(var12[var13], 0, var14, -128);
                        }
                    }
                    var4.field1125[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class35.method228(var10[var16], 15);
                    }
                    var4.field1122[var5] = arg2.method876(var15, 100, class35.method228(var7, 15), var8);
                    var4.field1124[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1110[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1110[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1110[var5] = -3;
            } catch (Exception var23) {
                var4.field1110[var5] = -4;
            } catch (Throwable var24) {
                var4.field1110[var5] = -5;
            }
        }
        class107.field2448.method19((byte) 81, var4);
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Lwc;")
    public final class156 method892(int arg0) {
        field2542++;
        if (this.field2536 != null) {
            class112 var2 = this.method890(-1);
            return var2 == null ? null : var2.method892(-89);
        } else if (this.field2527 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field2527.length; var4++) {
                if (!class133.field3002.method260(this.field2527[var4], 0, false)) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            } else if (arg0 > -47) {
                return null;
            } else {
                class156[] var5 = new class156[this.field2527.length];
                for (int var6 = 0; var6 < this.field2527.length; var6++) {
                    var5[var6] = class156.method1186(class133.field3002, this.field2527[var6], 0);
                }
                class156 var7;
                if (var5.length == 1) {
                    var7 = var5[0];
                } else {
                    var7 = new class156(var5, var5.length);
                }
                if (this.field2515 != null) {
                    for (int var8 = 0; var8 < this.field2515.length; var8++) {
                        var7.method1195(this.field2515[var8], this.field2540[var8]);
                    }
                }
                if (this.field2563 != null) {
                    for (int var9 = 0; var9 < this.field2563.length; var9++) {
                        var7.method1202(this.field2563[var9], this.field2528[var9]);
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lhb;[Lee;IIZ[B)V")
    public static final void method893(class51 arg0, class34[] arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
        if (!arg4) {
            return;
        }
        field2562++;
        int var6 = -1;
        class91 var7 = new class91(arg5);
        while (true) {
            int var8 = var7.method662((byte) 111);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method662((byte) 59);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var7.method649(!arg4);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg3 + var11;
                int var18 = arg2 + var12;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    int var19 = var13;
                    if ((class82.field1809[1][var17][var18] & 0x2) == 2) {
                        var19 = var13 - 1;
                    }
                    class34 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg1[var19];
                    }
                    class19.method134(var15, arg0, var13, var6, var18, var17, var16, 24971, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLna;)V")
    public final void method894(byte arg0, class91 arg1) {
        while (true) {
            int var3 = arg1.method649(false);
            if (var3 == 0) {
                field2532++;
                int var4 = -7 % ((34 - arg0) / 55);
                return;
            }
            this.method888(-40, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZII)V")
    public static final void method895(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (class134.field3027 == 0 && !class38.field691) {
            class56.method396(arg4 - arg3, -arg1 + arg0, class52.field1030, 0, 22, (byte) -122, class159.field3648);
            class44.field817++;
        }
        field2564++;
        int var5 = -1;
        if (arg2) {
            return;
        }
        for (int var6 = 0; var6 < class5.field117; var6++) {
            int var7 = class5.field114[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 14 & 0x7FFF;
            int var11 = var7 >> 29 & 0x3;
            if (var5 != var7) {
                var5 = var7;
                if (var11 == 2 && class134.field3044.method371(class128.field2817, var8, var9, var7) >= 0) {
                    class47 var12 = class130.method993(var10, (byte) 127);
                    if (var12.field919 != null) {
                        var12 = var12.method305(false);
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (class134.field3027 == 1) {
                        class86.field1914++;
                        class56.method396(var9, var8, class49.method314(new class67[] { class3.field41, class67.field1308, var12.field890 }, 0), var7, 4, (byte) -81, class86.field1901);
                    } else if (!class38.field691) {
                        class26.field472++;
                        class67[] var13 = var12.field893;
                        if (class16.field298) {
                            var13 = client.method151(true, var13);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    class79.field1727++;
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 1;
                                    }
                                    if (var14 == 1) {
                                        var15 = 7;
                                    }
                                    if (var14 == 2) {
                                        var15 = 3;
                                    }
                                    if (var14 == 3) {
                                        var15 = 30;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1002;
                                    }
                                    class56.method396(var9, var8, class49.method314(new class67[] { class6.field146, var12.field890 }, 0), var7, var15, (byte) -91, var13[var14]);
                                }
                            }
                        }
                        class56.method396(var9, var8, class49.method314(new class67[] { class6.field146, var12.field890 }, 0), var12.field868 << 14, 1006, (byte) -119, class134.field3010);
                    } else if ((class116.field2622 & 0x4) == 4) {
                        class95.field2142++;
                        class56.method396(var9, var8, class49.method314(new class67[] { class142.field3255, class67.field1308, var12.field890 }, 0), var7, 15, (byte) -67, class41.field777);
                    }
                }
                if (var11 == 1) {
                    class24 var16 = class152.field3479[var10];
                    if (var16.field442.field2538 == 1 && (var16.field2957 & 0x7F) == 64 && (var16.field2963 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < class123.field2743; var17++) {
                            class24 var20 = class152.field3479[class45.field836[var17]];
                            if (var20 != null && var16 != var20 && var20.field442.field2538 == 1 && var16.field2957 == var20.field2957 && var16.field2963 == var20.field2963) {
                                class58.method407(class45.field836[var17], var20.field442, var8, 121, var9);
                            }
                        }
                        for (int var18 = 0; var18 < class155.field3540; var18++) {
                            class83 var19 = class85.field1885[class151.field3464[var18]];
                            if (var19 != null && var16.field2957 == var19.field2957 && var16.field2963 == var19.field2963) {
                                class130.method991((byte) 117, var19, var9, var8, class151.field3464[var18]);
                            }
                        }
                    }
                    class58.method407(var10, var16.field442, var8, 90, var9);
                }
                if (var11 == 0) {
                    class83 var21 = class85.field1885[var10];
                    if ((var21.field2957 & 0x7F) == 64 && (var21.field2963 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < class123.field2743; var22++) {
                            class24 var25 = class152.field3479[class45.field836[var22]];
                            if (var25 != null && var25.field442.field2538 == 1 && var21.field2957 == var25.field2957 && var21.field2963 == var25.field2963) {
                                class58.method407(class45.field836[var22], var25.field442, var8, 104, var9);
                            }
                        }
                        for (int var23 = 0; var23 < class155.field3540; var23++) {
                            class83 var24 = class85.field1885[class151.field3464[var23]];
                            if (var24 != null && var21 != var24 && var21.field2957 == var24.field2957 && var21.field2963 == var24.field2963) {
                                class130.method991((byte) 9, var24, var9, var8, class151.field3464[var23]);
                            }
                        }
                    }
                    class130.method991((byte) -113, var21, var9, var8, var10);
                }
                if (var11 == 3) {
                    class4 var26 = class99.field2200[class128.field2817][var8][var9];
                    if (var26 != null) {
                        for (class39 var27 = (class39) var26.method24(-6); var27 != null; var27 = (class39) var26.method17(-5226)) {
                            class103 var28 = class123.method961(var27.field698, 1658);
                            if (class134.field3027 == 1) {
                                class56.method396(var9, var8, class49.method314(new class67[] { class3.field41, class101.field2270, var28.field2302 }, 0), var27.field698, 12, (byte) -101, class86.field1901);
                                class92.field2058++;
                            } else if (!class38.field691) {
                                class118.field2656++;
                                class67[] var29 = var28.field2353;
                                if (class16.field298) {
                                    var29 = client.method151(true, var29);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        class148.field3388++;
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 49;
                                        }
                                        if (var30 == 1) {
                                            var31 = 44;
                                        }
                                        if (var30 == 2) {
                                            var31 = 29;
                                        }
                                        if (var30 == 3) {
                                            var31 = 24;
                                        }
                                        if (var30 == 4) {
                                            var31 = 26;
                                        }
                                        class56.method396(var9, var8, class49.method314(new class67[] { class135.field3051, var28.field2302 }, 0), var27.field698, var31, (byte) -94, var29[var30]);
                                    } else if (var30 == 2) {
                                        class56.method396(var9, var8, class49.method314(new class67[] { class135.field3051, var28.field2302 }, 0), var27.field698, 29, (byte) -88, class129.field2841);
                                        class152.field3465++;
                                    }
                                }
                                class56.method396(var9, var8, class49.method314(new class67[] { class135.field3051, var28.field2302 }, 0), var27.field698, 1007, (byte) -81, class134.field3010);
                            } else if ((class116.field2622 & 0x1) == 1) {
                                class56.method396(var9, var8, class49.method314(new class67[] { class142.field3255, class101.field2270, var28.field2302 }, 0), var27.field698, 58, (byte) -96, class41.field777);
                                class114.field2581++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(B)V")
    public static final void method896(byte arg0) {
        field2551++;
        try {
            if (class95.field2126 == 1) {
                int var1 = class154.field3499.method1087(96);
                if (var1 > 0 && class154.field3499.method1076(arg0 + 24)) {
                    int var2 = var1 - class86.field1916;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class154.field3499.method1078(var2, 14281);
                    return;
                }
                class154.field3499.method1071(true);
                class154.field3499.method1069(0);
                class114.field2588 = null;
                if (class147.field3360 == null) {
                    class95.field2126 = 0;
                } else {
                    class95.field2126 = 2;
                }
                class35.field651 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class154.field3499.method1071(true);
            class35.field651 = null;
            class95.field2126 = 0;
            class147.field3360 = null;
            class114.field2588 = null;
        }
        if (arg0 != 89) {
            field2539 = null;
        }
    }
}
