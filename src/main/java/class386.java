import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class386 {

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public int field5647;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "[B")
    private byte[] field5655;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field5658 = 0;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "Lud;")
    public static class119 field5653 = new class119();

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public int field5641;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public int field5643;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public int field5652;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Lab;")
    public class293 field5642;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "[I")
    public int[] field5640;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "[I")
    public int[] field5644;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "[I")
    public int[] field5648;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "[I")
    public int[] field5649;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "[I")
    public int[] field5650;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "[I")
    public int[] field5656;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "[Lha;")
    public static class116[] field5646;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "[Lab;")
    public class293[] field5659;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "[[B")
    public byte[][] field5645;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "[[I")
    public int[][] field5651;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "[[I")
    public int[][] field5657;

    static {
        new class487("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "()V", line = 17)
    public static final void method2337() {
        class147.field1905 = 0;
        label212: for (int var0 = 0; var0 < class382.field5585; var0++) {
            class272 var1 = class595.field8777[var0];
            if (class600.field8856 != null) {
                for (int var2 = 0; var2 < class600.field8856.length; var2++) {
                    if (class600.field8856[var2] != -1000000 && (var1.field4018 <= class600.field8856[var2] || var1.field4028 <= class600.field8856[var2]) && (var1.field4020 <= class648.field9391[var2] || var1.field4023 <= class648.field9391[var2]) && (var1.field4020 >= class240.field3504[var2] || var1.field4023 >= class240.field3504[var2]) && (var1.field4031 <= class318.field4750[var2] || var1.field4032 <= class318.field4750[var2]) && (var1.field4031 >= class622.field9114[var2] || var1.field4032 >= class622.field9114[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field4025 == 1) {
                int var3 = var1.field4019 + class67.field763 - class365.field5254;
                if (var3 >= 0 && var3 <= class67.field763 + class67.field763) {
                    int var4 = var1.field4012 + class67.field763 - class613.field8993;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class67.field763 + class67.field763) {
                        continue;
                    }
                    int var5 = var1.field4011 + class67.field763 - class613.field8993;
                    if (var5 > class67.field763 + class67.field763) {
                        var5 = class67.field763 + class67.field763;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class181.field2786[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class100.field1278 - var1.field4020;
                        if (var7 > class437.field6432) {
                            var1.field4026 = 1;
                        } else {
                            if (var7 >= -class437.field6432) {
                                continue;
                            }
                            var1.field4026 = 2;
                            var7 = -var7;
                        }
                        var1.field4027 = (var1.field4031 - class420.field6034 << 8) / var7;
                        var1.field4022 = (var1.field4032 - class420.field6034 << 8) / var7;
                        var1.field4013 = (var1.field4018 - class49.field578 << 8) / var7;
                        var1.field4029 = (var1.field4028 - class49.field578 << 8) / var7;
                        class295.field4326[class147.field1905++] = var1;
                    }
                }
            } else if (var1.field4025 == 2) {
                int var8 = var1.field4012 + class67.field763 - class613.field8993;
                if (var8 >= 0 && var8 <= class67.field763 + class67.field763) {
                    int var9 = var1.field4019 + class67.field763 - class365.field5254;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class67.field763 + class67.field763) {
                        continue;
                    }
                    int var10 = var1.field4021 + class67.field763 - class365.field5254;
                    if (var10 > class67.field763 + class67.field763) {
                        var10 = class67.field763 + class67.field763;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class181.field2786[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class420.field6034 - var1.field4031;
                        if (var12 > class437.field6432) {
                            var1.field4026 = 3;
                        } else {
                            if (var12 >= -class437.field6432) {
                                continue;
                            }
                            var1.field4026 = 4;
                            var12 = -var12;
                        }
                        var1.field4016 = (var1.field4020 - class100.field1278 << 8) / var12;
                        var1.field4017 = (var1.field4023 - class100.field1278 << 8) / var12;
                        var1.field4013 = (var1.field4018 - class49.field578 << 8) / var12;
                        var1.field4029 = (var1.field4028 - class49.field578 << 8) / var12;
                        class295.field4326[class147.field1905++] = var1;
                    }
                }
            } else if (var1.field4025 == 4) {
                int var13 = var1.field4018 - class49.field578;
                if (var13 > class177.field2693) {
                    int var14 = var1.field4012 + class67.field763 - class613.field8993;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class67.field763 + class67.field763) {
                        continue;
                    }
                    int var15 = var1.field4011 + class67.field763 - class613.field8993;
                    if (var15 > class67.field763 + class67.field763) {
                        var15 = class67.field763 + class67.field763;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field4019 + class67.field763 - class365.field5254;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class67.field763 + class67.field763) {
                        continue;
                    }
                    int var17 = var1.field4021 + class67.field763 - class365.field5254;
                    if (var17 > class67.field763 + class67.field763) {
                        var17 = class67.field763 + class67.field763;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class181.field2786[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field4026 = 5;
                        var1.field4016 = (var1.field4020 - class100.field1278 << 8) / var13;
                        var1.field4017 = (var1.field4023 - class100.field1278 << 8) / var13;
                        var1.field4027 = (var1.field4031 - class420.field6034 << 8) / var13;
                        var1.field4022 = (var1.field4032 - class420.field6034 << 8) / var13;
                        class295.field4326[class147.field1905++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 273)
    public static void method2338(int arg0) {
        if (arg0 != 7588) {
            field5646 = null;
        }
        field5653 = null;
        field5646 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B[B)V", line = 288)
    private final void method2339(byte arg0, byte[] arg1) {
        field5654++;
        class428 var3 = new class428(class210.method1358(arg1, -83));
        int var4 = var3.method2561((byte) -58);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field5641 = var3.method2589(-11179);
        } else {
            this.field5641 = 0;
        }
        int var5 = var3.method2561((byte) 117);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field5652 = var3.method2620(61);
        int var8 = 0;
        int var9 = -1;
        this.field5650 = new int[this.field5652];
        for (int var10 = 0; var10 < this.field5652; var10++) {
            this.field5650[var10] = var8 += var3.method2620(41);
            if (var9 < this.field5650[var10]) {
                var9 = this.field5650[var10];
            }
        }
        this.field5643 = var9 + 1;
        this.field5649 = new int[this.field5643];
        this.field5644 = new int[this.field5643];
        this.field5657 = new int[this.field5643][];
        this.field5656 = new int[this.field5643];
        if (var7) {
            this.field5645 = new byte[this.field5643][];
        }
        this.field5648 = new int[this.field5643];
        if (arg0 > -92) {
            this.method2339((byte) 103, null);
        }
        if (var6) {
            this.field5640 = new int[this.field5643];
            for (int var11 = 0; var11 < this.field5643; var11++) {
                this.field5640[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field5652; var12++) {
                this.field5640[this.field5650[var12]] = var3.method2589(-11179);
            }
            this.field5642 = new class293(this.field5640);
        }
        for (int var13 = 0; var13 < this.field5652; var13++) {
            this.field5644[this.field5650[var13]] = var3.method2589(-11179);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field5652; var14++) {
                byte[] var15 = new byte[64];
                var3.method2575(28637, 64, var15, 0);
                this.field5645[this.field5650[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field5652; var16++) {
            this.field5656[this.field5650[var16]] = var3.method2589(-11179);
        }
        for (int var17 = 0; var17 < this.field5652; var17++) {
            this.field5648[this.field5650[var17]] = var3.method2620(32);
        }
        for (int var18 = 0; var18 < this.field5652; var18++) {
            int var25 = this.field5650[var18];
            int var26 = this.field5648[var25];
            int var27 = 0;
            int var28 = -1;
            this.field5657[var25] = new int[var26];
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field5657[var25][var29] = var27 += var3.method2620(104);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field5649[var25] = var28 + 1;
            if (var28 + 1 == var26) {
                this.field5657[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field5651 = new int[var9 + 1][];
        this.field5659 = new class293[var9 + 1];
        for (int var19 = 0; var19 < this.field5652; var19++) {
            int var20 = this.field5650[var19];
            int var21 = this.field5648[var20];
            this.field5651[var20] = new int[this.field5649[var20]];
            for (int var22 = 0; var22 < this.field5649[var20]; var22++) {
                this.field5651[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field5657[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field5657[var20][var23];
                }
                this.field5651[var20][var24] = var3.method2589(-11179);
            }
            this.field5659[var20] = new class293(this.field5651[var20]);
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "([BI[B)V", line = 493)
    public class386(byte[] arg0, int arg1, byte[] arg2) {
        this.field5647 = class335.method2095(arg0.length, arg0, 10425);
        if (this.field5647 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field5655 = class239.method1533(0, arg0.length, arg0, 36);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field5655[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method2339((byte) -120, arg0);
    }
}
