import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class357 {

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public int field5656;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field5651 = 0;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field5657 = 0;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public int field5652;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public int field5653;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public int field5661;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Lrl;")
    public class344 field5654;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[I")
    public int[] field5645;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "[I")
    public int[] field5659;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "[I")
    public int[] field5660;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "[I")
    public int[] field5663;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "[I")
    public int[] field5664;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "[I")
    public int[] field5666;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "[Lrl;")
    public class344[] field5655;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "[[I")
    public int[][] field5658;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "[[I")
    public int[][] field5665;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZ)I", line = 7)
    public static final int method2484(int arg0, int arg1, boolean arg2) {
        field5650++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else if (arg2) {
            return -121;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBILsi;)V", line = 48)
    public static final void method2485(int arg0, byte arg1, int arg2, class264 arg3) {
        field5649++;
        if (class117.field1701 < 2 && class56.field856 == 0 && !class107.field1532) {
            return;
        }
        String var4 = class217.method1470(false);
        if (arg3 == null) {
            int var6 = class31.field471.method1209(var4, arg0 + 4, arg2 - -15, 16777215, 0, class270.field4455, class138.field2177);
            class279.method1986(arg2, 15, arg0 + 4, var6 + class31.field471.method1216(var4), 27960);
        } else {
            class175 var5 = arg3.method1855(class13.field175, (byte) 89);
            if (var5 == null) {
                var5 = class31.field471;
            }
            var5.method1221(var4, arg0, arg2, arg3.field4223, arg3.field4236, arg3.field4261, arg3.field4207, arg3.field4234, arg3.field4213, class270.field4455, class138.field2177, class139.field2235);
            class279.method1986(class139.field2235[1], class139.field2235[3], class139.field2235[0], class139.field2235[2], 27960);
        }
        int var7 = 112 % ((42 - arg1) / 34);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 84)
    public static final void method2486(int arg0) {
        field5648++;
        if (arg0 != -1) {
            return;
        }
        while (class159.field2552.method249(class201.field3091, -6941) >= 11) {
            int var1 = class159.field2552.method246(8, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class130.field1984[var1] == null) {
                class130.field1984[var1] = new class39();
                var2 = true;
                if (class310.field5051[var1] != null) {
                    class130.field1984[var1].method314(class310.field5051[var1], -1);
                }
            }
            class150.field2410[class38.field561++] = var1;
            class39 var3 = class130.field1984[var1];
            var3.field4743 = class58.field875;
            int var4 = class236.field3739[class159.field2552.method246(8, 3)];
            if (var2) {
                var3.field4780 = var3.field4778 = var4;
            }
            int var5 = class159.field2552.method246(arg0 + 9, 5);
            int var6 = class159.field2552.method246(arg0 + 9, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class159.field2552.method246(8, 1);
            if (var7 == 1) {
                class166.field2611[class99.field1440++] = var1;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            int var8 = class159.field2552.method246(8, 1);
            var3.method317(var8 == 1, 0, class329.field5388.field4762[0] + var6, class329.field5388.field4757[0] + var5);
        }
        class159.field2552.method253((byte) -93);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[B)V", line = 157)
    private final void method2487(int arg0, byte[] arg1) {
        field5647++;
        class313 var3 = new class313(class11.method69(0, arg1));
        int var4 = var3.method2224(-122);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field5661 = 0;
        } else {
            this.field5661 = var3.method2231((byte) -127);
        }
        int var5 = var3.method2224(-126);
        int var6 = -1;
        this.field5652 = var3.method2250(arg0 ^ 0xE3F3408F);
        int var7 = 0;
        this.field5645 = new int[this.field5652];
        for (int var8 = 0; var8 < this.field5652; var8++) {
            this.field5645[var8] = var7 += var3.method2250(class185.method1279(arg0, -470597489));
            if (var6 < this.field5645[var8]) {
                var6 = this.field5645[var8];
            }
        }
        this.field5653 = var6 + 1;
        this.field5666 = new int[this.field5653];
        this.field5660 = new int[this.field5653];
        this.field5663 = new int[this.field5653];
        this.field5664 = new int[this.field5653];
        this.field5665 = new int[this.field5653][];
        if (var5 != 0) {
            this.field5659 = new int[this.field5653];
            for (int var9 = 0; var9 < this.field5653; var9++) {
                this.field5659[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field5652; var10++) {
                this.field5659[this.field5645[var10]] = var3.method2231((byte) -125);
            }
            this.field5654 = new class344(this.field5659);
        }
        for (int var11 = 0; var11 < this.field5652; var11++) {
            this.field5664[this.field5645[var11]] = var3.method2231((byte) -123);
        }
        if (arg0 != 2083232455) {
            this.field5658 = (int[][]) ((int[][]) null);
        }
        for (int var12 = 0; var12 < this.field5652; var12++) {
            this.field5666[this.field5645[var12]] = var3.method2231((byte) -124);
        }
        for (int var13 = 0; var13 < this.field5652; var13++) {
            this.field5663[this.field5645[var13]] = var3.method2250(class185.method1279(arg0, -470597489));
        }
        for (int var14 = 0; var14 < this.field5652; var14++) {
            int var15 = 0;
            int var16 = this.field5645[var14];
            int var17 = this.field5663[var16];
            int var18 = -1;
            this.field5665[var16] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field5665[var16][var19] = var15 += var3.method2250(-1613178296);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field5660[var16] = var18 + 1;
            if ((var18 + 1) == var17) {
                this.field5665[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field5655 = new class344[var6 + 1];
        this.field5658 = new int[var6 + 1][];
        for (int var21 = 0; var21 < this.field5652; var21++) {
            int var22 = this.field5645[var21];
            int var23 = this.field5663[var22];
            this.field5658[var22] = new int[this.field5660[var22]];
            for (int var24 = 0; var24 < this.field5660[var22]; var24++) {
                this.field5658[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field5665[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field5665[var22][var25];
                }
                this.field5658[var22][var26] = var3.method2231((byte) -126);
            }
            this.field5655[var22] = new class344(this.field5658[var22]);
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([BI)V", line = 340)
    public class357(byte[] arg0, int arg1) {
        this.field5656 = class140.method995(arg0, arg0.length, 0);
        if (this.field5656 != arg1) {
            throw new RuntimeException();
        }
        this.method2487(2083232455, arg0);
    }
}
