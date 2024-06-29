import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class381 {

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lp;")
    private class161 field5198 = new class161();

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Lp;")
    private class161 field5206 = new class161();

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Lp;")
    private class161 field5207 = new class161();

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "Lp;")
    private class161 field5208 = new class161();

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Lbg;")
    private class242 field5210 = new class242(4);

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "B")
    private byte field5213 = 0;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public volatile int field5214 = 0;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public volatile int field5215 = 0;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "Lbg;")
    private class242 field5216 = new class242(8);

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5204 = null;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "[I")
    public static int[] field5202 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lcq;")
    public static class72 field5186 = new class72("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    private int field5211;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "J")
    private long field5209;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "Lrb;")
    private class249 field5217;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "Lod;")
    private class399 field5212;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method2364(int arg0) {
        field5186 = null;
        if (arg0 != -2) {
            method2370(45, (class118) null, 64);
        }
        field5204 = null;
        field5202 = null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I")
    private final int method2365(int arg0) {
        field5190++;
        int var2 = -34 % ((arg0 + 69) / 55);
        return this.field5207.method1022(0) + this.field5208.method1022(0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public static final void method2366(int arg0, int arg1) {
        class42.field501 = -1;
        class390.field5325 = arg0;
        class373.field5052 = arg1;
        field5195++;
        class76.field943 = 3;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final void method2367(int arg0) {
        field5201++;
        if (this.field5212 != null) {
            this.field5212.method2465((byte) -85);
        }
        if (arg0 < 73) {
            field5186 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lod;ZB)V")
    public final void method2368(class399 arg0, boolean arg1, byte arg2) {
        if (this.field5212 != null) {
            try {
                this.field5212.method2465((byte) -85);
            } catch (Exception var8) {
            }
            this.field5212 = null;
        }
        field5192++;
        this.field5212 = arg0;
        this.method2375(66);
        this.method2379(arg1, -2);
        this.field5217 = null;
        if (arg2 != 88) {
            this.field5217 = null;
        }
        this.field5216.field3211 = 0;
        while (true) {
            class249 var4 = (class249) this.field5206.method1024(256);
            if (var4 == null) {
                while (true) {
                    class249 var5 = (class249) this.field5208.method1024(256);
                    if (var5 == null) {
                        if (this.field5213 != 0) {
                            try {
                                this.field5210.field3211 = 0;
                                this.field5210.method1593(4, arg2 ^ 0xFFFFFFD5);
                                this.field5210.method1593(this.field5213, arg2 - 204);
                                this.field5210.method1573(-6266, 0);
                                this.field5212.method2464((byte) 48, 0, 4, this.field5210.field3188);
                            } catch (IOException var7) {
                                try {
                                    this.field5212.method2465((byte) -85);
                                } catch (Exception var6) {
                                }
                                this.field5215 = -2;
                                this.field5212 = null;
                                this.field5214++;
                            }
                        }
                        this.field5211 = 0;
                        this.field5209 = class164.method1038(8635);
                        return;
                    }
                    this.field5207.method1028((byte) 33, var5);
                }
            }
            this.field5198.method1028((byte) 33, var4);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method2369(int arg0, byte[] arg1, int arg2, int arg3) {
        field5196++;
        boolean var4 = true;
        class242 var5 = new class242(arg1);
        if (arg0 < 8) {
            return true;
        }
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method1561(-125);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class446 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method1559((byte) -60);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method1563(-128);
                                    }
                                    int var10 = var5.method1559((byte) -92);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = (var8 & 0xFC2) >> 6;
                                    var13 = var5.method1563(-128) >> 2;
                                    var14 = arg3 + var12;
                                    var15 = arg2 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while ((class22.field232 - 1) <= var14);
                    } while (var15 >= class196.field2329 - 1);
                    var16 = class380.method2361(var6, -29012);
                } while (var13 == 22 && !class167.field1948 && var16.field6235 == 0 && var16.field6179 != 1 && !var16.field6195);
                var9 = true;
                if (!var16.method2770(-107)) {
                    class374.field5072++;
                    var4 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILuo;I)V")
    public static final void method2370(int arg0, class118 arg1, int arg2) {
        field5203++;
        class221.method1342(arg1);
        if (arg2 > 1) {
            for (int var3 = 0; var3 < class22.field232; var3++) {
                for (int var4 = 0; var4 < class196.field2329; var4++) {
                    if ((class222.field2770[1][var3][var4] & 0x2) == 2) {
                        class186.method1153(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg2; var5++) {
            for (int var6 = 0; var6 <= class196.field2329; var6++) {
                for (int var7 = 0; var7 <= class22.field232; var7++) {
                    if ((class80.field972[var5][var7][var6] & 0x1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (var8 > 0 && (class80.field972[var5][var7][var8 - 1] & 0x1) != 0) {
                            var8--;
                        }
                        while (var9 < class196.field2329 && (class80.field972[var5][var7][var9 + 1] & 0x1) != 0) {
                            var9++;
                        }
                        label169: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; var12++) {
                                if ((class80.field972[var10 - 1][var7][var12] & 0x1) == 0) {
                                    break label169;
                                }
                            }
                            var10--;
                        }
                        label158: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; var13++) {
                                if ((class80.field972[var11 + 1][var7][var13] & 0x1) == 0) {
                                    break label158;
                                }
                            }
                            var11++;
                        }
                        int var14 = (var9 + 1 - var8) * (var11 + 1 - var10);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = class226.field2868[var11][var7][var8] - var15;
                            int var17 = class226.field2868[var10][var7][var8];
                            class32.method212(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var18 <= var11; var18++) {
                                for (int var19 = var8; var19 <= var9; var19++) {
                                    class80.field972[var18][var7][var19] = (byte) class191.method1183(class80.field972[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((class80.field972[var5][var7][var6] & 0x2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (var20 > 0 && (class80.field972[var5][var20 - 1][var6] & 0x2) != 0) {
                            var20--;
                        }
                        while (class22.field232 > var21 && (class80.field972[var5][var21 + 1][var6] & 0x2) != 0) {
                            var21++;
                        }
                        label222: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; var24++) {
                                if ((class80.field972[var22 - 1][var24][var6] & 0x2) == 0) {
                                    break label222;
                                }
                            }
                            var22--;
                        }
                        label211: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; var25++) {
                                if ((class80.field972[var23 + 1][var25][var6] & 0x2) == 0) {
                                    break label211;
                                }
                            }
                            var23++;
                        }
                        int var26 = (var21 + 1 - var20) * (var23 + 1 - var22);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = class226.field2868[var23][var20][var6] - var27;
                            int var29 = class226.field2868[var22][var20][var6];
                            class32.method212(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; var30++) {
                                for (int var31 = var20; var31 <= var21; var31++) {
                                    class80.field972[var30][var31][var6] = (byte) class191.method1183(class80.field972[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((class80.field972[var5][var7][var6] & 0x4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (var34 > 0 && (class80.field972[var5][var7][var34 - 1] & 0x4) != 0) {
                            var34--;
                        }
                        while (var35 < class196.field2329 && (class80.field972[var5][var7][var35 + 1] & 0x4) != 0) {
                            var35++;
                        }
                        label275: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; var36++) {
                                if ((class80.field972[var5][var32 - 1][var36] & 0x4) == 0) {
                                    break label275;
                                }
                            }
                            var32--;
                        }
                        label264: while (class22.field232 > var33) {
                            for (int var37 = var34; var37 <= var35; var37++) {
                                if ((class80.field972[var5][var33 + 1][var37] & 0x4) == 0) {
                                    break label264;
                                }
                            }
                            var33++;
                        }
                        if (((var33 + 1 - var32) * (var35 + 1 - var34)) >= 4) {
                            int var38 = class226.field2868[var5][var32][var34];
                            class32.method212(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; var39++) {
                                for (int var40 = var34; var40 <= var35; var40++) {
                                    class80.field972[var5][var39][var40] = (byte) class191.method1183(class80.field972[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 2) {
            field5204 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public final void method2371(byte arg0) {
        field5188++;
        if (this.field5212 == null) {
            return;
        }
        try {
            this.field5210.field3211 = 0;
            this.field5210.method1593(7, -110);
            this.field5210.method1580(0, -6629);
            this.field5212.method2464((byte) 117, 0, 4, this.field5210.field3188);
            if (arg0 <= 82) {
                this.method2367(-95);
            }
        } catch (IOException var3) {
            try {
                this.field5212.method2465((byte) -85);
            } catch (Exception var2) {
            }
            this.field5214++;
            this.field5215 = -2;
            this.field5212 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
    public final void method2372(byte arg0) {
        if (this.field5212 != null) {
            this.field5212.method2461(false);
        }
        if (arg0 == 64) {
            field5199++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)Z")
    public final boolean method2373(byte arg0) {
        if (arg0 >= -9) {
            return false;
        } else {
            field5200++;
            return this.method2365(102) >= 20;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZBIZ)Lrb;")
    public final class249 method2374(int arg0, boolean arg1, byte arg2, int arg3, boolean arg4) {
        field5189++;
        long var6 = (long) ((arg3 << 16) + arg0);
        class249 var8 = new class249();
        var8.field1538 = arg4;
        if (!arg1) {
            this.field5198 = null;
        }
        var8.field3270 = arg2;
        var8.field2090 = var6;
        if (arg4) {
            if (this.method2378((byte) 85) >= 20) {
                throw new RuntimeException();
            }
            this.field5198.method1028((byte) 33, var8);
        } else if (this.method2365(78) < 20) {
            this.field5207.method1028((byte) 33, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
    private final void method2375(int arg0) {
        field5191++;
        if (this.field5212 == null) {
            return;
        }
        try {
            this.field5210.field3211 = 0;
            this.field5210.method1593(6, -128);
            this.field5210.method1580(3, -6629);
            this.field5212.method2464((byte) 44, 0, 4, this.field5210.field3188);
        } catch (IOException var4) {
            try {
                this.field5212.method2465((byte) -85);
            } catch (Exception var3) {
            }
            this.field5214++;
            this.field5215 = -2;
            this.field5212 = null;
        }
        int var2 = -44 / ((-arg0 - 38) / 50);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)Z")
    public final boolean method2376(boolean arg0) {
        if (this.field5212 != null) {
            long var2 = class164.method1038(8635);
            int var4 = (int) (var2 - this.field5209);
            this.field5209 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5211 += var4;
            if (this.field5211 > 30000) {
                try {
                    this.field5212.method2465((byte) -85);
                } catch (Exception var27) {
                }
                this.field5212 = null;
            }
        }
        field5187++;
        if (this.field5212 == null) {
            return this.method2378((byte) 83) == 0 && this.method2365(107) == 0;
        }
        try {
            this.field5212.method2462(1);
            for (class249 var5 = (class249) this.field5198.method1027(-20578); var5 != null; var5 = (class249) this.field5198.method1023(60)) {
                this.field5210.field3211 = 0;
                this.field5210.method1593(1, -104);
                this.field5210.method1580((int) var5.field2090, -6629);
                this.field5212.method2464((byte) 53, 0, 4, this.field5210.field3188);
                this.field5206.method1028((byte) 33, var5);
            }
            for (class249 var6 = (class249) this.field5207.method1027(-20578); var6 != null; var6 = (class249) this.field5207.method1023(-73)) {
                this.field5210.field3211 = 0;
                this.field5210.method1593(0, -126);
                this.field5210.method1580((int) var6.field2090, -6629);
                this.field5212.method2464((byte) 126, 0, 4, this.field5210.field3188);
                this.field5208.method1028((byte) 33, var6);
            }
            if (arg0) {
                this.method2371((byte) -21);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field5212.method2467((byte) -111);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field5211 = 0;
                byte var9 = 0;
                if (this.field5217 == null) {
                    var9 = 8;
                } else if (this.field5217.field3269 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field5216.field3211;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field5212.method2466(this.field5216.field3211, var10, 16752, this.field5216.field3188);
                    if (this.field5213 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field5216.field3188[this.field5216.field3211 + var11] = (byte) class262.method1658(this.field5216.field3188[this.field5216.field3211 + var11], this.field5213);
                        }
                    }
                    this.field5216.field3211 += var10;
                    if (this.field5216.field3211 >= var9) {
                        if (this.field5217 == null) {
                            this.field5216.field3211 = 0;
                            int var12 = this.field5216.method1563(-128);
                            int var13 = this.field5216.method1587((byte) -102);
                            int var14 = this.field5216.method1563(-128);
                            int var15 = this.field5216.method1576((byte) 127);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class249 var21;
                            if (var17) {
                                for (var21 = (class249) this.field5208.method1027(-20578); var21 != null && var21.field2090 != var18; var21 = (class249) this.field5208.method1023(-73)) {
                                }
                            } else {
                                for (var21 = (class249) this.field5206.method1027(-20578); var21 != null && var21.field2090 != var18; var21 = (class249) this.field5206.method1023(-34)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field5217 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field5217.field3275 = new class242(var15 - (-this.field5217.field3270 - var22));
                            this.field5217.field3275.method1593(var16, -101);
                            this.field5217.field3275.method1560(-26356, var15);
                            this.field5216.field3211 = 0;
                            this.field5217.field3269 = 8;
                        } else if (this.field5217.field3269 != 0) {
                            throw new IOException();
                        } else if (this.field5216.field3188[0] == -1) {
                            this.field5216.field3211 = 0;
                            this.field5217.field3269 = 1;
                        } else {
                            this.field5217 = null;
                        }
                    }
                } else {
                    int var23 = this.field5217.field3275.field3188.length - this.field5217.field3270;
                    int var24 = 512 - this.field5217.field3269;
                    if (var24 > var23 - this.field5217.field3275.field3211) {
                        var24 = var23 - this.field5217.field3275.field3211;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field5212.method2466(this.field5217.field3275.field3211, var24, 16752, this.field5217.field3275.field3188);
                    if (this.field5213 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field5217.field3275.field3188[this.field5217.field3275.field3211 + var25] = (byte) class262.method1658(this.field5217.field3275.field3188[this.field5217.field3275.field3211 + var25], this.field5213);
                        }
                    }
                    this.field5217.field3269 += var24;
                    this.field5217.field3275.field3211 += var24;
                    if (this.field5217.field3275.field3211 == var23) {
                        this.field5217.method1123((byte) -31);
                        this.field5217.field1539 = false;
                        this.field5217 = null;
                    } else if (this.field5217.field3269 == 512) {
                        this.field5217.field3269 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field5212.method2465((byte) -85);
            } catch (Exception var26) {
            }
            this.field5212 = null;
            this.field5215 = -2;
            this.field5214++;
            return this.method2378((byte) 48) == 0 && this.method2365(-128) == 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
    public final void method2377(int arg0) {
        try {
            this.field5212.method2465((byte) -85);
        } catch (Exception var2) {
        }
        field5197++;
        this.field5213 = (byte) ((int) ((double) arg0 * Math.random() + 1.0D));
        this.field5215 = -1;
        this.field5212 = null;
        this.field5214++;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)I")
    public final int method2378(byte arg0) {
        if (arg0 < 13) {
            this.field5209 = 25L;
        }
        field5205++;
        return this.field5198.method1022(0) + this.field5206.method1022(0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)V")
    public final void method2379(boolean arg0, int arg1) {
        field5193++;
        if (arg1 != -2 || this.field5212 == null) {
            return;
        }
        try {
            this.field5210.field3211 = 0;
            this.field5210.method1593(arg0 ? 2 : 3, -105);
            this.field5210.method1580(0, -6629);
            this.field5212.method2464((byte) 62, 0, 4, this.field5210.field3188);
        } catch (IOException var4) {
            try {
                this.field5212.method2465((byte) -85);
            } catch (Exception var3) {
            }
            this.field5214++;
            this.field5215 = -2;
            this.field5212 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(B)Z")
    public final boolean method2380(byte arg0) {
        if (arg0 != -32) {
            this.field5217 = null;
        }
        field5194++;
        return this.method2378((byte) 29) >= 20;
    }
}
