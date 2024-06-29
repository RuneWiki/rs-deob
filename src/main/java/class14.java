import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 extends class23 {

    @OriginalMember(owner = "client!bf", name = "jb", descriptor = "[I")
    public int[] field393 = new int[16];

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "[I")
    private int[] field372 = new int[16];

    @OriginalMember(owner = "client!bf", name = "tb", descriptor = "[I")
    private int[] field403 = new int[16];

    @OriginalMember(owner = "client!bf", name = "yb", descriptor = "[I")
    private int[] field408 = new int[16];

    @OriginalMember(owner = "client!bf", name = "zb", descriptor = "[I")
    private int[] field409 = new int[16];

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "[I")
    private int[] field387 = new int[16];

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "I")
    private int field391 = 1000000;

    @OriginalMember(owner = "client!bf", name = "Nb", descriptor = "[I")
    private int[] field423 = new int[16];

    @OriginalMember(owner = "client!bf", name = "wb", descriptor = "[I")
    private int[] field406 = new int[16];

    @OriginalMember(owner = "client!bf", name = "vb", descriptor = "[[Lkc;")
    private class72[][] field405 = new class72[16][128];

    @OriginalMember(owner = "client!bf", name = "Jb", descriptor = "[I")
    public int[] field419 = new int[16];

    @OriginalMember(owner = "client!bf", name = "mb", descriptor = "[I")
    private int[] field396 = new int[16];

    @OriginalMember(owner = "client!bf", name = "Vb", descriptor = "[[Lkc;")
    private class72[][] field431 = new class72[16][128];

    @OriginalMember(owner = "client!bf", name = "Sb", descriptor = "[I")
    private int[] field428 = new int[16];

    @OriginalMember(owner = "client!bf", name = "Xb", descriptor = "[I")
    private int[] field433 = new int[16];

    @OriginalMember(owner = "client!bf", name = "ac", descriptor = "[I")
    private int[] field436 = new int[16];

    @OriginalMember(owner = "client!bf", name = "Rb", descriptor = "[I")
    private int[] field427 = new int[16];

    @OriginalMember(owner = "client!bf", name = "Ub", descriptor = "I")
    private int field430 = 256;

    @OriginalMember(owner = "client!bf", name = "Ob", descriptor = "[I")
    public int[] field424 = new int[16];

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "Lid;")
    private class60 field381 = new class60();

    @OriginalMember(owner = "client!bf", name = "dc", descriptor = "Lue;")
    private class144 field439 = new class144(this);

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "Lec;")
    private class32 field373 = new class32(128);

    @OriginalMember(owner = "client!bf", name = "rb", descriptor = "Lhe;")
    public static class54 field401 = class6.method58("Clientscript error )2 check log for details", false);

    @OriginalMember(owner = "client!bf", name = "kb", descriptor = "[Lhe;")
    public static class54[] field394 = new class54[100];

    @OriginalMember(owner = "client!bf", name = "Db", descriptor = "I")
    public static int field413 = 3353893;

    @OriginalMember(owner = "client!bf", name = "Fb", descriptor = "Lhe;")
    public static class54 field415 = class6.method58("<img=0>", false);

    @OriginalMember(owner = "client!bf", name = "Ab", descriptor = "I")
    public static int field410 = 0;

    @OriginalMember(owner = "client!bf", name = "Kb", descriptor = "[Lqb;")
    public static class113[] field420 = new class113[1000];

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!bf", name = "lb", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!bf", name = "nb", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!bf", name = "ob", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!bf", name = "qb", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!bf", name = "sb", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!bf", name = "ub", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!bf", name = "xb", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!bf", name = "Bb", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!bf", name = "Cb", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!bf", name = "Gb", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!bf", name = "Hb", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!bf", name = "Ib", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!bf", name = "Lb", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!bf", name = "Mb", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!bf", name = "Pb", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!bf", name = "Qb", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!bf", name = "Tb", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!bf", name = "Wb", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!bf", name = "Yb", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!bf", name = "Zb", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!bf", name = "ec", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!bf", name = "gc", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!bf", name = "Eb", descriptor = "J")
    public static long field414;

    @OriginalMember(owner = "client!bf", name = "cc", descriptor = "J")
    private long field438;

    @OriginalMember(owner = "client!bf", name = "fc", descriptor = "J")
    private long field441;

    @OriginalMember(owner = "client!bf", name = "pb", descriptor = "Lef;")
    public static class35 field399;

    @OriginalMember(owner = "client!bf", name = "bc", descriptor = "Z")
    private boolean field437;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
    public final synchronized void method98(int arg0, int arg1, int arg2) {
        field380++;
        this.method118((byte) -95, arg0, arg1);
        if (arg2 <= 124) {
            this.field440 = 28;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
    private final void method99(int arg0, int arg1, int arg2) {
        if (this.field387[arg2] != arg0) {
            this.field387[arg2] = arg0;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field405[arg2][var4] = null;
            }
        }
        if (arg1 < 119) {
            this.field439 = null;
        }
        field416++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V")
    private final void method100(byte arg0, int arg1) {
        field400++;
        int var3 = arg1 & 0xF0;
        if (var3 == 128) {
            int var4 = arg1 & 0xF;
            int var5 = arg1 >> 8 & 0x7F;
            int var6 = arg1 >> 16 & 0x7F;
            this.method112(var5, var6, var4, (byte) 111);
        } else if (var3 == 144) {
            int var7 = arg1 >> 16 & 0x7F;
            int var8 = arg1 & 0xF;
            int var9 = arg1 >> 8 & 0x7F;
            if (var7 > 0) {
                this.method129(var8, (byte) -99, var9, var7);
            } else {
                this.method112(var9, 64, var8, (byte) 113);
            }
        } else if (var3 == 160) {
            int var10 = arg1 & 0xF;
            int var11 = arg1 >> 8 & 0x7F;
            int var12 = arg1 >> 16 & 0x7F;
            this.method105(var11, var10, var12, (byte) -115);
        } else {
            int var13 = -75 / ((-arg0 - 16) / 35);
            if (var3 == 176) {
                int var14 = arg1 & 0xF;
                int var15 = arg1 >> 8 & 0x7F;
                int var16 = arg1 >> 16 & 0x7F;
                if (var15 == 0) {
                    this.field409[var14] = (var16 << 14) + class118.method887(-2080769, this.field409[var14]);
                }
                if (var15 == 32) {
                    this.field409[var14] = class118.method887(this.field409[var14], -16257) + (var16 << 7);
                }
                if (var15 == 1) {
                    this.field403[var14] = class118.method887(-16257, this.field403[var14]) + (var16 << 7);
                }
                if (var15 == 33) {
                    this.field403[var14] = class118.method887(this.field403[var14], -128) + var16;
                }
                if (var15 == 5) {
                    this.field406[var14] = class118.method887(this.field406[var14], -16257) + (var16 << 7);
                }
                if (var15 == 37) {
                    this.field406[var14] = class118.method887(this.field406[var14], -128) + var16;
                }
                if (var15 == 7) {
                    this.field436[var14] = (var16 << 7) + class118.method887(-16257, this.field436[var14]);
                }
                if (var15 == 39) {
                    this.field436[var14] = class118.method887(-128, this.field436[var14]) + var16;
                }
                if (var15 == 10) {
                    this.field427[var14] = (var16 << 7) + class118.method887(-16257, this.field427[var14]);
                }
                if (var15 == 42) {
                    this.field427[var14] = class118.method887(this.field427[var14], -128) + var16;
                }
                if (var15 == 11) {
                    this.field428[var14] = class118.method887(this.field428[var14], -16257) + (var16 << 7);
                }
                if (var15 == 43) {
                    this.field428[var14] = class118.method887(-128, this.field428[var14]) + var16;
                }
                if (var15 == 64) {
                    if (var16 >= 64) {
                        this.field393[var14] = class38.method292(this.field393[var14], 1);
                    } else {
                        this.field393[var14] = class118.method887(this.field393[var14], -2);
                    }
                }
                if (var15 == 65) {
                    if (var16 < 64) {
                        this.method114(var14, (byte) 109);
                        this.field393[var14] = class118.method887(this.field393[var14], -3);
                    } else {
                        this.field393[var14] = class38.method292(this.field393[var14], 2);
                    }
                }
                if (var15 == 99) {
                    this.field372[var14] = class118.method887(this.field372[var14], 127) + (var16 << 7);
                }
                if (var15 == 98) {
                    this.field372[var14] = class118.method887(16256, this.field372[var14]) + var16;
                }
                if (var15 == 101) {
                    this.field372[var14] = (var16 << 7) + class118.method887(this.field372[var14], 127) + 16384;
                }
                if (var15 == 100) {
                    this.field372[var14] = class118.method887(16256, this.field372[var14]) + var16 + 16384;
                }
                if (var15 == 120) {
                    this.method120(var14, -3666);
                }
                if (var15 == 121) {
                    this.method102(var14, false);
                }
                if (var15 == 123) {
                    this.method103(-1, var14);
                }
                if (var15 == 6) {
                    int var17 = this.field372[var14];
                    if (var17 == 16384) {
                        this.field396[var14] = (var16 << 7) + class118.method887(this.field396[var14], -16257);
                    }
                }
                if (var15 == 38) {
                    int var18 = this.field372[var14];
                    if (var18 == 16384) {
                        this.field396[var14] = class118.method887(-128, this.field396[var14]) + var16;
                    }
                }
                if (var15 == 16) {
                    this.field419[var14] = class118.method887(-16257, this.field419[var14]) + (var16 << 7);
                }
                if (var15 == 48) {
                    this.field419[var14] = var16 + class118.method887(-128, this.field419[var14]);
                }
                if (var15 == 81) {
                    if (var16 >= 64) {
                        this.field393[var14] = class38.method292(this.field393[var14], 4);
                    } else {
                        this.method121(var14, 29);
                        this.field393[var14] = class118.method887(this.field393[var14], -5);
                    }
                }
                if (var15 == 17) {
                    this.method101(var14, (byte) -123, (this.field423[var14] & 0xFFFFC07F) + (var16 << 7));
                }
                if (var15 == 49) {
                    this.method101(var14, (byte) -69, (this.field423[var14] & 0xFFFFFF80) + var16);
                }
            } else if (var3 == 192) {
                int var19 = arg1 & 0xF;
                int var20 = arg1 >> 8 & 0x7F;
                this.method99(this.field409[var19] + var20, 126, var19);
            } else if (var3 == 208) {
                int var21 = arg1 >> 8 & 0x7F;
                int var22 = arg1 & 0xF;
                this.method136(var21, 869414375, var22);
            } else if (var3 == 224) {
                int var23 = arg1 & 0xF;
                int var24 = (arg1 >> 9 & 0x3F80) + (arg1 >> 8 & 0x7F);
                this.method127(true, var23, var24);
            } else {
                int var25 = arg1 & 0xFF;
                if (var25 == 255) {
                    this.method132((byte) 33);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)V")
    private final void method101(int arg0, byte arg1, int arg2) {
        this.field423[arg0] = arg2;
        this.field424[arg0] = (int) (Math.pow(2.0D, (double) arg2 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
        field425++;
        int var4 = 38 % ((arg1 - 54) / 52);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
    private final void method102(int arg0, boolean arg1) {
        field371++;
        if (arg0 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method102(var3, false);
            }
            return;
        }
        this.field436[arg0] = 12800;
        this.field427[arg0] = 8192;
        this.field428[arg0] = 16383;
        this.field433[arg0] = 8192;
        this.field403[arg0] = 0;
        this.field406[arg0] = 8192;
        this.method114(arg0, (byte) 10);
        this.method121(arg0, 90);
        this.field393[arg0] = 0;
        this.field372[arg0] = 32767;
        if (!arg1) {
            this.field396[arg0] = 256;
            this.field419[arg0] = 0;
            this.method101(arg0, (byte) -4, 8192);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    private final void method103(int arg0, int arg1) {
        field418++;
        if (arg0 != -1) {
            return;
        }
        for (class72 var3 = (class72) this.field439.field3293.method979(-127); var3 != null; var3 = (class72) this.field439.field3293.method983(18485)) {
            if ((arg1 < 0 || var3.field1773 == arg1) && var3.field1774 < 0) {
                this.field431[var3.field1773][var3.field1797] = null;
                var3.field1774 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()Lda;")
    public final synchronized class23 method104() {
        field432++;
        return this.field439;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIB)V")
    private final void method105(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == -115) {
            field385++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
    public static void method106(byte arg0) {
        field399 = null;
        field415 = null;
        field401 = null;
        if (arg0 > -25) {
            method106((byte) 59);
        }
        field420 = null;
        field394 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLod;Lod;)V")
    public static final void method107(byte arg0, class101 arg1, class101 arg2) {
        field390++;
        if (class21.field585 == null) {
            class21.field585 = class132.method996(class63.field1531, client.field607, class66.field1607, true);
        }
        if (class19.field561 == null) {
            class19.field561 = class125.method957(class66.field1607, client.field607, 27, class5.field146);
        }
        if (class59.field1484 == null) {
            class59.field1484 = class125.method957(class66.field1607, client.field607, 74, class19.field563);
        }
        if (class118.field2753 == null) {
            class118.field2753 = class125.method957(class66.field1607, client.field607, 120, class18.field526);
        }
        class90.method710(0, 23, 765, 480, 0);
        class90.method722(0, 0, 125, 23, 12425273, 9135624);
        class90.method722(125, 0, 640, 23, 5197647, 2697513);
        if (arg0 >= -55) {
            return;
        }
        arg2.method1183(class51.field1229, 62, 15, 0, -1);
        if (class118.field2753 != null) {
            class118.field2753[1].method161(140, 1);
            arg1.method1189(class57.field1447, 152, 10, 16777215, -1);
            class118.field2753[0].method161(140, 12);
            arg1.method1189(class149.field3366, 152, 21, 16777215, -1);
        }
        if (class59.field1484 != null) {
            short var3 = 390;
            short var4 = 280;
            short var5 = 610;
            short var6 = 500;
            if (class43.field1096[0] == 0 && class130.field2930[0] == 0) {
                class59.field1484[2].method161(var4, 4);
            } else {
                class59.field1484[0].method161(var4, 4);
            }
            if (class43.field1096[0] == 0 && class130.field2930[0] == 1) {
                class59.field1484[3].method161(var4 + 15, 4);
            } else {
                class59.field1484[1].method161(var4 + 15, 4);
            }
            arg2.method1189(class48.field1152, var4 + 32, 17, 16777215, -1);
            if (class43.field1096[0] == 1 && class130.field2930[0] == 0) {
                class59.field1484[2].method161(var3, 4);
            } else {
                class59.field1484[0].method161(var3, 4);
            }
            if (class43.field1096[0] == 1 && class130.field2930[0] == 1) {
                class59.field1484[3].method161(var3 + 15, 4);
            } else {
                class59.field1484[1].method161(var3 + 15, 4);
            }
            arg2.method1189(class120.field2797, var3 + 32, 17, 16777215, -1);
            if (class43.field1096[0] == 2 && class130.field2930[0] == 0) {
                class59.field1484[2].method161(var6, 4);
            } else {
                class59.field1484[0].method161(var6, 4);
            }
            if (class43.field1096[0] == 2 && class130.field2930[0] == 1) {
                class59.field1484[3].method161(var6 + 15, 4);
            } else {
                class59.field1484[1].method161(var6 + 15, 4);
            }
            arg2.method1189(class103.field2571, var6 + 32, 17, 16777215, -1);
            if (class43.field1096[0] == 3 && class130.field2930[0] == 0) {
                class59.field1484[2].method161(var5, 4);
            } else {
                class59.field1484[0].method161(var5, 4);
            }
            if (class43.field1096[0] == 3 && class130.field2930[0] == 1) {
                class59.field1484[3].method161(var5 + 15, 4);
            } else {
                class59.field1484[1].method161(var5 + 15, 4);
            }
            arg2.method1189(class118.field2762, var5 + 32, 17, 16777215, -1);
        }
        class90.method710(708, 4, 50, 16, 0);
        arg1.method1183(class157.field3575, 733, 16, 16777215, -1);
        class129.field2918 = -1;
        if (class21.field585 != null) {
            byte var7 = 88;
            byte var8 = 19;
            int var9 = 765 / (var7 + 1);
            int var10 = 480 / (var8 + 1);
            int var11;
            int var12;
            do {
                var11 = var10;
                var12 = var9;
                if ((var9 - 1) * var10 >= class71.field1765) {
                    var9--;
                }
                if (class71.field1765 <= (var10 - 1) * var9) {
                    var10--;
                }
                if (class71.field1765 <= (var10 - 1) * var9) {
                    var10--;
                }
            } while (var10 != var11 || var9 != var12);
            int var13 = (480 - var8 * var10) / (var10 - -1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (765 - var7 * var9) / (var9 + 1);
            if (var14 > 5) {
                var14 = 5;
            }
            int var15 = (765 - var7 * var9 - (var9 + -1) * var14) / 2;
            int var16 = (480 - var8 * var10 - (var10 - 1) * var13) / 2;
            int var17 = var16 + 23;
            int var18 = var15;
            int var19 = 0;
            for (int var20 = 0; var20 < class71.field1765; var20++) {
                boolean var21 = true;
                class15 var22 = class22.field612[var20];
                class54 var23 = class147.method1117(-70, var22.field445);
                if (var22.field445 == -1) {
                    var21 = false;
                    var23 = class124.field2865;
                } else if (var22.field445 > 1980) {
                    var21 = false;
                    var23 = class99.field2520;
                }
                if (class71.field1772 >= var18 && var17 <= class7.field211 && var18 + var7 > class71.field1772 && class7.field211 < var8 + var17 && var21) {
                    class129.field2918 = var20;
                    class21.field585[var22.field447 ? 1 : 0].method863(var18, var17, 128, 16777215);
                } else {
                    class21.field585[var22.field447 ? 1 : 0].method856(var18, var17);
                }
                if (class19.field561 != null) {
                    class19.field561[var22.field451 + (var22.field447 ? 8 : 0)].method161(var18 + 29, var17);
                }
                arg2.method1183(class147.method1117(-19, var22.field459), var18 + 15, var8 / 2 + (var17 - -5), 0, -1);
                arg1.method1183(var23, var18 + 60, var17 - -(var8 / 2) + 5, 268435455, -1);
                var17 += var13 + var8;
                var19++;
                if (var19 >= var10) {
                    var19 = 0;
                    var18 += var7 + var14;
                    var17 = var16 + 23;
                }
            }
        }
        try {
            Graphics var24 = class70.field1753.getGraphics();
            class124.field2852.method81(var24, 0, 0, true);
        } catch (Exception var25) {
            class70.field1753.repaint();
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method108(Component arg0, int arg1) {
        field369++;
        arg0.removeKeyListener(class100.field2527);
        arg0.removeFocusListener(class100.field2527);
        if (arg1 != 4) {
            field399 = null;
        }
        class85.field2124 = -1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([III)V")
    public final synchronized void method109(int[] arg0, int arg1, int arg2) {
        field375++;
        if (this.field381.method477()) {
            int var4 = this.field381.field1494 * this.field391 / class134.field3037;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field441;
                if (this.field438 - var5 >= 0L) {
                    this.field441 = var5;
                    break;
                }
                int var7 = (int) (((long) var4 + this.field438 - this.field441 - 1L) / (long) var4);
                arg2 -= var7;
                this.field441 += (long) var4 * (long) var7;
                this.field439.method109(arg0, arg1, var7);
                this.method117((byte) -126);
                arg1 += var7;
            } while (this.field381.method477());
        }
        this.field439.method109(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public final synchronized void method110(int arg0) {
        if (arg0 == 21022) {
            for (class141 var2 = (class141) this.field373.method245((byte) -110); var2 != null; var2 = (class141) this.field373.method244((byte) -25)) {
                var2.method48(-315);
            }
            field426++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public final synchronized void method111(int arg0) {
        field389++;
        if (this.field381.method477()) {
            int var2 = this.field381.field1494 * this.field391 / class134.field3037;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field441;
                if (this.field438 - var3 >= 0L) {
                    this.field441 = var3;
                    break;
                }
                int var5 = (int) ((this.field438 + (long) var2 - this.field441 - 1L) / (long) var2);
                arg0 -= var5;
                this.field441 += (long) var2 * (long) var5;
                this.field439.method111(var5);
                this.method117((byte) -118);
            } while (this.field381.method477());
        }
        this.field439.method111(arg0);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIB)V")
    private final void method112(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 105) {
            this.field372 = null;
        }
        field382++;
        class72 var5 = this.field431[arg2][arg0];
        if (var5 == null) {
            return;
        }
        this.field431[arg2][arg0] = null;
        if ((this.field393[arg2] & 0x2) == 0) {
            var5.field1774 = 0;
            return;
        }
        for (class72 var6 = (class72) this.field439.field3293.method979(-120); var6 != null; var6 = (class72) this.field439.field3293.method983(18485)) {
            if (var5.field1773 == var6.field1773 && var6.field1774 < 0 && var5 != var6) {
                var5.field1774 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lkc;I)I")
    private final int method113(class72 arg0, int arg1) {
        field392++;
        if (arg1 > -65) {
            this.field396 = null;
        }
        class111 var3 = arg0.field1794;
        int var4 = arg0.field1792 + (arg0.field1798 * arg0.field1795 >> 12);
        int var5 = ((this.field433[arg0.field1773] - 8192) * this.field396[arg0.field1773] >> 12) + var4;
        if (var3.field2665 > 0 && (var3.field2653 > 0 || this.field403[arg0.field1773] > 0)) {
            int var6 = var3.field2653 << 2;
            int var7 = var3.field2651 << 1;
            if (arg0.field1784 < var7) {
                var6 = arg0.field1784 * var6 / var7;
            }
            int var8 = (this.field403[arg0.field1773] >> 7) + var6;
            double var9 = Math.sin((double) (arg0.field1777 & 0x1FF) * 0.01227184630308513D);
            var5 += (int) ((double) var8 * var9);
        }
        int var11 = (int) ((double) (arg0.field1789.field2228 * 256) * Math.pow(2.0D, (double) var5 * 3.255208333333333E-4D) / (double) class134.field3037 + 0.5D);
        return var11 >= 1 ? var11 : 1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
    private final void method114(int arg0, byte arg1) {
        if ((this.field393[arg0] & 0x2) != 0) {
            for (class72 var3 = (class72) this.field439.field3293.method979(-122); var3 != null; var3 = (class72) this.field439.field3293.method983(18485)) {
                if (var3.field1773 == arg0 && this.field431[arg0][var3.field1797] == null && var3.field1774 < 0) {
                    var3.field1774 = 0;
                }
            }
        }
        if (arg1 < 4) {
            this.method98(8, -18, -58);
        }
        field386++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILkc;[IBI)Z")
    public final boolean method115(int arg0, class72 arg1, int[] arg2, byte arg3, int arg4) {
        arg1.field1775 = class134.field3037 / 100;
        field370++;
        if (arg1.field1774 >= 0 && (arg1.field1786 == null || arg1.field1786.method899())) {
            arg1.method564((byte) 74);
            arg1.method48(-315);
            if (arg1.field1788 > 0 && this.field405[arg1.field1773][arg1.field1788] == arg1) {
                this.field405[arg1.field1773][arg1.field1788] = null;
            }
            return true;
        }
        int var6 = arg1.field1798;
        if (var6 > 0) {
            int var7 = var6 - (int) (Math.pow(2.0D, (double) this.field406[arg1.field1773] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var7 < 0) {
                var7 = 0;
            }
            arg1.field1798 = var7;
        }
        arg1.field1786.method892(this.method113(arg1, -72));
        arg1.field1784++;
        boolean var8 = false;
        class111 var9 = arg1.field1794;
        arg1.field1777 += var9.field2665;
        int var10 = 70 / ((arg3 - 2) / 37);
        double var11 = (double) ((arg1.field1797 - 60 << 8) + (arg1.field1798 * arg1.field1795 >> 12)) * 5.086263020833333E-6D;
        if (var9.field2677 > 0) {
            if (var9.field2668 > 0) {
                arg1.field1787 += (int) (Math.pow(2.0D, (double) var9.field2668 * var11) * 128.0D + 0.5D);
            } else {
                arg1.field1787 += 128;
            }
        }
        if (var9.field2672 != null) {
            if (var9.field2676 <= 0) {
                arg1.field1802 += 128;
            } else {
                arg1.field1802 += (int) (Math.pow(2.0D, (double) var9.field2676 * var11) * 128.0D + 0.5D);
            }
            while (arg1.field1791 < var9.field2672.length - 2 && arg1.field1802 > (var9.field2672[arg1.field1791 + 2] & 0xFF) << 8) {
                arg1.field1791 += 2;
            }
            if (var9.field2672.length - 2 == arg1.field1791 && var9.field2672[arg1.field1791 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg1.field1774 >= 0 && var9.field2671 != null && (this.field393[arg1.field1773] & 0x1) == 0 && (arg1.field1788 < 0 || this.field405[arg1.field1773][arg1.field1788] != arg1)) {
            if (var9.field2657 <= 0) {
                arg1.field1774 += 128;
            } else {
                arg1.field1774 += (int) (Math.pow(2.0D, (double) var9.field2657 * var11) * 128.0D + 0.5D);
            }
            while (arg1.field1800 < var9.field2671.length - 2 && arg1.field1774 > (var9.field2671[arg1.field1800 + 2] & 0xFF) << 8) {
                arg1.field1800 += 2;
            }
            if (var9.field2671.length - 2 == arg1.field1800) {
                var8 = true;
            }
        }
        if (!var8) {
            arg1.field1786.method920(arg1.field1775, this.method133(arg1, -4), this.method131(arg1, (byte) 44));
            return false;
        }
        arg1.field1786.method927(arg1.field1775);
        if (arg2 == null) {
            arg1.field1786.method111(arg4);
        } else {
            arg1.field1786.method109(arg2, arg0, arg4);
        }
        if (arg1.field1786.method921()) {
            this.field439.field3298.method484(arg1.field1786);
        }
        arg1.method564((byte) 74);
        if (arg1.field1774 >= 0) {
            arg1.method48(-315);
            if (arg1.field1788 > 0 && this.field405[arg1.field1773][arg1.field1788] == arg1) {
                this.field405[arg1.field1773][arg1.field1788] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIBI)V")
    public static final void method116(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = -98 % ((40 - arg3) / 46);
        field422++;
        class158.field3592 = 0;
        for (int var6 = -1; var6 < class74.field1823 + class158.field3598; var6++) {
            class38 var22;
            if (var6 == -1) {
                var22 = class108.field2639;
            } else if (var6 < class74.field1823) {
                var22 = class48.field1148[class141.field3227[var6]];
            } else {
                var22 = class111.field2679[class58.field1480[var6 - class74.field1823]];
            }
            if (var22 != null && var22.method183(-19456)) {
                if (var22 instanceof class120) {
                    class9 var23 = ((class120) var22).field2788;
                    if (var23.field293 != null) {
                        var23 = var23.method78((byte) 125);
                    }
                    if (var23 == null) {
                        continue;
                    }
                }
                if (class74.field1823 <= var6) {
                    class9 var24 = ((class120) var22).field2788;
                    if (var24.field293 != null) {
                        var24 = var24.method78((byte) 92);
                    }
                    if (var24.field258 >= 0 && class132.field2993.length > var24.field258) {
                        class49.method355(var22.field986 + 15, var22, -127);
                        if (class57.field1422 > -1) {
                            class132.field2993[var24.field258].method865(class57.field1422 + arg0 - 12, arg1 - (-class16.field485 + 30));
                        }
                    }
                    if (class111.field2669 == 1 && class58.field1480[var6 - class74.field1823] == class17.field515 && class4.field138 % 20 < 10) {
                        class49.method355(var22.field986 + 15, var22, -128);
                        if (class57.field1422 > -1) {
                            class28.field750[0].method865(class57.field1422 + arg0 - 12, arg1 + -28 - -class16.field485);
                        }
                    }
                } else {
                    class22 var25 = (class22) var22;
                    int var26 = 30;
                    if (var25.field630 != -1 || var25.field618 != -1) {
                        class49.method355(var22.field986 + 15, var22, -126);
                        if (class57.field1422 > -1) {
                            if (var25.field630 != -1) {
                                class105.field2587[var25.field630].method865(arg0 + class57.field1422 - 12, class16.field485 + arg1 - var26);
                                var26 += 25;
                            }
                            if (var25.field618 != -1) {
                                class132.field2993[var25.field618].method865(class57.field1422 + arg0 - 12, -var26 + class16.field485 + arg1);
                                var26 += 25;
                            }
                        }
                    }
                    if (var6 >= 0 && class111.field2669 == 10 && class141.field3227[var6] == class32.field806) {
                        class49.method355(var22.field986 + 15, var22, -126);
                        if (class57.field1422 > -1) {
                            class28.field750[1].method865(class57.field1422 + arg0 - 12, arg1 - -class16.field485 + -var26);
                        }
                    }
                }
                if (var22.field975 != null && (var6 >= class74.field1823 || class57.field1436 == 0 || class57.field1436 == 3 || class57.field1436 == 1 && class54.method409(60, ((class22) var22).field626))) {
                    class49.method355(var22.field986, var22, -128);
                    if (class57.field1422 > -1 && class158.field3592 < class8.field245) {
                        class8.field233[class158.field3592] = class135.field3067.method1172(var22.field975) / 2;
                        class8.field250[class158.field3592] = class135.field3067.field3463;
                        class8.field242[class158.field3592] = class57.field1422;
                        class8.field226[class158.field3592] = class16.field485;
                        class8.field237[class158.field3592] = var22.field929;
                        class8.field232[class158.field3592] = var22.field924;
                        class8.field236[class158.field3592] = var22.field957;
                        class8.field239[class158.field3592] = var22.field975;
                        class158.field3592++;
                    }
                }
                if (class4.field138 < var22.field977) {
                    class49.method355(var22.field986 + 15, var22, -126);
                    if (class57.field1422 > -1) {
                        int var27 = var22.field963 * 30 / var22.field966;
                        if (var27 > 30) {
                            var27 = 30;
                        }
                        class90.method710(arg0 + class57.field1422 - 15, class16.field485 + arg1 + -3, var27, 5, 65280);
                        class90.method710(class57.field1422 + arg0 + var27 - 15, arg1 + -3 + class16.field485, 30 - var27, 5, 16711680);
                    }
                }
                for (int var28 = 0; var28 < 4; var28++) {
                    if (class4.field138 < var22.field927[var28]) {
                        class49.method355(var22.field986 / 2, var22, -128);
                        if (class57.field1422 > -1) {
                            if (var28 == 1) {
                                class16.field485 -= 20;
                            }
                            if (var28 == 2) {
                                class16.field485 -= 10;
                                class57.field1422 -= 15;
                            }
                            if (var28 == 3) {
                                class16.field485 -= 10;
                                class57.field1422 += 15;
                            }
                            class130.field2931[var22.field979[var28]].method865(class57.field1422 + arg0 - 12, class16.field485 + arg1 + -12);
                            class65.field1570.method1183(class147.method1117(-78, var22.field968[var28]), arg0 + class57.field1422 - 1, arg1 - -class16.field485 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var7 = 0; var7 < class158.field3592; var7++) {
            int var8 = class8.field242[var7];
            int var9 = class8.field233[var7];
            int var10 = class8.field226[var7];
            boolean var11 = true;
            int var12 = class8.field250[var7];
            while (var11) {
                var11 = false;
                for (int var21 = 0; var21 < var7; var21++) {
                    if (var10 + 2 > class8.field226[var21] - class8.field250[var21] && class8.field226[var21] + 2 > var10 - var12 && class8.field242[var21] + class8.field233[var21] > -var9 + var8 && class8.field242[var21] - class8.field233[var21] < var8 + var9 && var10 > class8.field226[var21] - class8.field250[var21]) {
                        var10 = class8.field226[var21] - class8.field250[var21];
                        var11 = true;
                    }
                }
            }
            class57.field1422 = class8.field242[var7];
            class16.field485 = class8.field226[var7] = var10;
            class54 var13 = class8.field239[var7];
            if (class28.field757 == 0) {
                int var14 = 16776960;
                if (class8.field237[var7] < 6) {
                    var14 = class120.field2795[class8.field237[var7]];
                }
                if (class8.field237[var7] == 6) {
                    var14 = class80.field1951 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class8.field237[var7] == 7) {
                    var14 = class80.field1951 % 20 < 10 ? 255 : 65535;
                }
                if (class8.field237[var7] == 8) {
                    var14 = class80.field1951 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class8.field237[var7] == 9) {
                    int var15 = 150 - class8.field236[var7];
                    if (var15 < 50) {
                        var14 = var15 * 1280 + 16711680;
                    } else if (var15 < 100) {
                        var14 = 16776960 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var14 = var15 * 5 + 64780;
                    }
                }
                if (class8.field237[var7] == 10) {
                    int var16 = 150 - class8.field236[var7];
                    if (var16 < 50) {
                        var14 = var16 * 5 + 16711680;
                    } else if (var16 < 100) {
                        var14 = 16711935 - (var16 - 50) * 327680;
                    } else if (var16 < 150) {
                        var14 = (var16 - 100) * 327680 + 255 - (var16 - 100) * 5;
                    }
                }
                if (class8.field237[var7] == 11) {
                    int var17 = 150 - class8.field236[var7];
                    if (var17 < 50) {
                        var14 = 16777215 - var17 * 327685;
                    } else if (var17 < 100) {
                        var14 = var17 * 327685 + 65280 - 16384250;
                    } else if (var17 < 150) {
                        var14 = 32768000 + 16777215 - var17 * 327680;
                    }
                }
                if (class8.field232[var7] == 0) {
                    class135.field3067.method1183(var13, class57.field1422 + arg0, class16.field485 + arg1, var14, 0);
                }
                if (class8.field232[var7] == 1) {
                    class135.field3067.method1175(var13, class57.field1422 + arg0, class16.field485 + arg1, var14, 0, class80.field1951);
                }
                if (class8.field232[var7] == 2) {
                    class135.field3067.method1181(var13, class57.field1422 + arg0, class16.field485 + arg1, var14, 0, class80.field1951);
                }
                if (class8.field232[var7] == 3) {
                    class135.field3067.method1179(var13, class57.field1422 + arg0, class16.field485 + arg1, var14, 0, class80.field1951, 150 - class8.field236[var7]);
                }
                if (class8.field232[var7] == 4) {
                    int var18 = (150 - class8.field236[var7]) * (class135.field3067.method1172(var13) - -100) / 150;
                    class90.method725(arg0 + class57.field1422 - 50, arg1, arg0 + class57.field1422 + 50, arg1 + arg4);
                    class135.field3067.method1189(var13, class57.field1422 + arg0 + 50 - var18, class16.field485 + arg1, var14, 0);
                    class90.method714(arg0, arg1, arg0 + arg2, arg1 - -arg4);
                }
                if (class8.field232[var7] == 5) {
                    int var19 = 150 - class8.field236[var7];
                    class90.method725(arg0, class16.field485 + arg1 - class135.field3067.field3463 - 1, arg0 + arg2, arg1 + class16.field485 + 5);
                    int var20 = 0;
                    if (var19 < 25) {
                        var20 = var19 - 25;
                    } else if (var19 > 125) {
                        var20 = var19 - 125;
                    }
                    class135.field3067.method1183(var13, class57.field1422 + arg0, arg1 - -class16.field485 + var20, var14, 0);
                    class90.method714(arg0, arg1, arg0 + arg2, arg1 + arg4);
                }
            } else {
                class135.field3067.method1183(var13, class57.field1422 + arg0, class16.field485 + arg1, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)V")
    private final void method117(byte arg0) {
        int var2 = this.field442;
        field383++;
        if (arg0 >= -109) {
            this.method121(123, -119);
        }
        int var3 = this.field440;
        long var4 = this.field438;
        while (this.field440 == var3) {
            while (this.field381.field1496[var2] == var3) {
                this.field381.method483(var2);
                int var6 = this.field381.method482(var2);
                if (var6 == 1) {
                    this.field381.method468();
                    this.field381.method473(var2);
                    if (this.field381.method470()) {
                        if (!this.field437 || var3 == 0) {
                            this.method132((byte) 33);
                            this.field381.method481();
                            return;
                        }
                        this.field381.method474(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method100((byte) -111, var6);
                }
                this.field381.method472(var2);
                this.field381.method473(var2);
            }
            var2 = this.field381.method479();
            var3 = this.field381.field1496[var2];
            var4 = this.field381.method471(var3);
        }
        this.field440 = var3;
        this.field442 = var2;
        this.field438 = var4;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)V")
    private final void method118(byte arg0, int arg1, int arg2) {
        field384++;
        this.field408[arg1] = arg2;
        this.field409[arg1] = class118.method887(arg2, -128);
        if (arg0 >= -75) {
            this.field436 = null;
        }
        this.method99(arg2, 126, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILwc;ZLqe;Lef;)Z")
    public final synchronized boolean method119(int arg0, class156 arg1, boolean arg2, class116 arg3, class35 arg4) {
        field429++;
        arg3.method880();
        boolean var6 = true;
        int[] var7 = null;
        if (arg0 > 0) {
            var7 = new int[] { arg0 };
        }
        if (arg2) {
            return true;
        }
        for (class114 var8 = (class114) arg3.field2741.method245((byte) -116); var8 != null; var8 = (class114) arg3.field2741.method244((byte) -25)) {
            int var9 = (int) var8.field154;
            class141 var10 = (class141) this.field373.method246((byte) 117, (long) var9);
            if (var10 == null) {
                var10 = class93.method739(var9, (byte) -86, arg4);
                if (var10 == null) {
                    var6 = false;
                    continue;
                }
                this.field373.method241(var10, (long) var9, false);
            }
            if (!var10.method1087(var8.field2719, arg1, var7, false)) {
                var6 = false;
            }
        }
        if (var6) {
            arg3.method879();
        }
        return var6;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
    private final void method120(int arg0, int arg1) {
        for (class72 var3 = (class72) this.field439.field3293.method979(-124); var3 != null; var3 = (class72) this.field439.field3293.method983(arg1 ^ 0xFFFFB99B)) {
            if (arg0 < 0 || var3.field1773 == arg0) {
                if (var3.field1786 != null) {
                    var3.field1786.method927(class134.field3037 / 100);
                    if (var3.field1786.method921()) {
                        this.field439.field3298.method484(var3.field1786);
                    }
                    var3.method564((byte) 74);
                }
                if (var3.field1774 < 0) {
                    this.field431[var3.field1773][var3.field1797] = null;
                }
                var3.method48(-315);
            }
        }
        field404++;
        if (arg1 != -3666) {
            method107((byte) -50, null, null);
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V")
    private final void method121(int arg0, int arg1) {
        if (arg1 <= 12) {
            this.field428 = null;
        }
        field407++;
        if ((this.field393[arg0] & 0x4) == 0) {
            return;
        }
        for (class72 var3 = (class72) this.field439.field3293.method979(-124); var3 != null; var3 = (class72) this.field439.field3293.method983(18485)) {
            if (var3.field1773 == arg0) {
                var3.field1801 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)I")
    public final int method122(boolean arg0) {
        if (!arg0) {
            this.field437 = true;
        }
        field377++;
        return this.field430;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(Z)V")
    public final synchronized void method123(boolean arg0) {
        class141 var2 = (class141) this.field373.method245((byte) 122);
        if (arg0) {
            return;
        }
        while (var2 != null) {
            var2.method1089(0);
            var2 = (class141) this.field373.method244((byte) -25);
        }
        field421++;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lkc;I)Z")
    public final boolean method124(class72 arg0, int arg1) {
        if (arg1 != 0) {
            return false;
        }
        field411++;
        if (arg0.field1786 != null) {
            return false;
        }
        if (arg0.field1774 >= 0) {
            arg0.method48(-315);
            if (arg0.field1788 > 0 && this.field405[arg0.field1773][arg0.field1788] == arg0) {
                this.field405[arg0.field1773][arg0.field1788] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lqe;IZ)V")
    public final synchronized void method125(class116 arg0, int arg1, boolean arg2) {
        this.method126((byte) -34);
        this.field381.method469(arg0.field2740);
        this.field437 = arg2;
        field374++;
        this.field441 = 0L;
        int var4 = this.field381.method478();
        if (arg1 <= 119) {
            this.field428 = null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            this.field381.method483(var5);
            this.field381.method472(var5);
            this.field381.method473(var5);
        }
        this.field442 = this.field381.method479();
        this.field440 = this.field381.field1496[this.field442];
        this.field438 = this.field381.method471(this.field440);
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
    public final synchronized void method126(byte arg0) {
        field402++;
        this.field381.method481();
        this.method132((byte) 33);
        if (arg0 > -1) {
            this.method101(-20, (byte) 66, -61);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZII)V")
    private final void method127(boolean arg0, int arg1, int arg2) {
        this.field433[arg1] = arg2;
        if (!arg0) {
            method108(null, 59);
        }
        field397++;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)V")
    public final synchronized void method128(int arg0, int arg1) {
        if (arg1 != 98) {
            this.field408 = null;
        }
        field388++;
        this.field430 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBII)V")
    private final void method129(int arg0, byte arg1, int arg2, int arg3) {
        field379++;
        this.method112(arg2, 64, arg0, (byte) 124);
        if ((this.field393[arg0] & 0x2) != 0) {
            for (class72 var5 = (class72) this.field439.field3293.method986(0); var5 != null; var5 = (class72) this.field439.field3293.method975(false)) {
                if (var5.field1773 == arg0 && var5.field1774 < 0) {
                    this.field431[arg0][var5.field1797] = null;
                    this.field431[arg0][arg2] = var5;
                    int var6 = (var5.field1798 * var5.field1795 >> 12) + var5.field1792;
                    var5.field1798 = 4096;
                    var5.field1792 += arg2 - var5.field1797 << 8;
                    var5.field1797 = arg2;
                    var5.field1795 = var6 - var5.field1792;
                    return;
                }
            }
        }
        class141 var7 = (class141) this.field373.method246((byte) 117, (long) this.field387[arg0]);
        if (var7 == null) {
            return;
        }
        class92 var8 = var7.field3229[arg2];
        if (var8 == null) {
            return;
        }
        class72 var9 = new class72();
        var9.field1789 = var8;
        var9.field1793 = var7;
        var9.field1773 = arg0;
        var9.field1794 = var7.field3222[arg2];
        var9.field1788 = var7.field3215[arg2];
        var9.field1797 = arg2;
        var9.field1776 = var7.field3205[arg2] * var7.field3226 * arg3 * arg3 + 1024 >> 11;
        var9.field1799 = var7.field3219[arg2] & 0xFF;
        var9.field1792 = (arg2 << 8) - (var7.field3225[arg2] & 0x7FFF);
        var9.field1800 = 0;
        if (arg1 != -99) {
            this.field405 = null;
        }
        var9.field1774 = -1;
        var9.field1802 = 0;
        var9.field1787 = 0;
        var9.field1791 = 0;
        if (this.field419[arg0] == 0) {
            var9.field1786 = class119.method902(var8, this.method113(var9, -85), this.method133(var9, -4), this.method131(var9, (byte) 44));
        } else {
            var9.field1786 = class119.method902(var8, this.method113(var9, -123), 0, this.method131(var9, (byte) 44));
            this.method130(var7.field3225[arg2] < 0, (byte) -126, var9);
        }
        if (var7.field3225[arg2] < 0) {
            var9.field1786.method905(-1);
        }
        if (var9.field1788 >= 0) {
            class72 var10 = this.field405[arg0][var9.field1788];
            if (var10 != null && var10.field1774 < 0) {
                this.field431[arg0][var10.field1797] = null;
                var10.field1774 = 0;
            }
            this.field405[arg0][var9.field1788] = var9;
        }
        this.field439.field3293.method976(var9, (byte) -125);
        this.field431[arg0][arg2] = var9;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZBLkc;)V")
    public final void method130(boolean arg0, byte arg1, class72 arg2) {
        field417++;
        int var4 = arg2.field1789.field2227.length;
        int var5 = -6 % ((-arg1 - 34) / 55);
        int var8;
        if (arg0 && arg2.field1789.field2230) {
            int var6 = var4 + var4 - arg2.field1789.field2229;
            int var7 = var4 << 8;
            var8 = (int) ((long) this.field419[arg2.field1773] * (long) var6 >> 6);
            if (var8 >= var7) {
                arg2.field1786.method918(true);
                var8 = var7 + var7 - var8 - 1;
            }
        } else {
            var8 = (int) ((long) this.field419[arg2.field1773] * (long) var4 >> 6);
        }
        arg2.field1786.method910(var8);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lkc;B)I")
    private final int method131(class72 arg0, byte arg1) {
        field395++;
        int var3 = this.field427[arg0.field1773];
        if (arg1 != 44) {
            this.method104();
        }
        return var3 >= 8192 ? 16384 - ((128 - arg0.field1799) * (-var3 + 16384) + 32 >> 6) : arg0.field1799 * var3 - -32 >> 6;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)V")
    private final void method132(byte arg0) {
        this.method120(-1, -3666);
        this.method102(-1, false);
        field378++;
        for (int var2 = 0; var2 < 16; var2++) {
            this.field387[var2] = this.field408[var2];
        }
        int var3 = 0;
        if (arg0 != 33) {
            this.method101(-4, (byte) -46, -67);
        }
        while (var3 < 16) {
            this.field409[var3] = class118.method887(this.field408[var3], -128);
            var3++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(Lkc;I)I")
    private final int method133(class72 arg0, int arg1) {
        field376++;
        class111 var3 = arg0.field1794;
        int var4 = this.field436[arg0.field1773] * this.field428[arg0.field1773] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg0.field1776 * var5 + 16384 >> 15;
        int var7 = this.field430 * var6 + 128 >> 8;
        if (arg1 != -4) {
            this.method137((byte) -102);
        }
        if (var3.field2677 > 0) {
            var7 = (int) ((double) var7 * Math.pow(0.5D, (double) arg0.field1787 * 1.953125E-5D * (double) var3.field2677) + 0.5D);
        }
        if (var3.field2672 != null) {
            int var8 = var3.field2672[arg0.field1791 + 1];
            int var9 = arg0.field1802;
            if (arg0.field1791 < var3.field2672.length - 2) {
                int var10 = (var3.field2672[arg0.field1791] & 0xFF) << 8;
                int var11 = (var3.field2672[arg0.field1791 + 2] & 0xFF) << 8;
                var8 += (var3.field2672[arg0.field1791 + 3] - var8) * (var9 - var10) / (var11 - var10);
            }
            var7 = var7 * var8 + 32 >> 6;
        }
        if (arg0.field1774 > 0 && var3.field2671 != null) {
            int var12 = arg0.field1774;
            int var13 = var3.field2671[arg0.field1800 + 1];
            if (var3.field2671.length - 2 > arg0.field1800) {
                int var14 = (var3.field2671[arg0.field1800 + 2] & 0xFF) << 8;
                int var15 = (var3.field2671[arg0.field1800] & 0xFF) << 8;
                var13 += (var3.field2671[arg0.field1800 + 3] - var13) * (var12 - var15) / (var14 - var15);
            }
            var7 = var7 * var13 + 32 >> 6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
    public final synchronized int method134() {
        field398++;
        return 0;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()Lda;")
    public final synchronized class23 method135() {
        field412++;
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
    private final void method136(int arg0, int arg1, int arg2) {
        if (arg1 != 869414375) {
            this.method98(-105, 24, -92);
        }
        field435++;
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)Z")
    public final synchronized boolean method137(byte arg0) {
        if (arg0 != -25) {
            this.field436 = null;
        }
        field434++;
        return this.field381.method477();
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class14() {
        this.method132((byte) 33);
    }
}
