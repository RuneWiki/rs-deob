import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class257 extends class152 {

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    private int field4323 = 1;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    private int field4324 = 1;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field4316 = 0;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "Lce;")
    public static class126 field4320 = class206.method1445(-7923, "mapfunction");

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "Lce;")
    public static class126 field4326 = class206.method1445(-7923, "::setparticles");

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "Lce;")
    public static class126 field4328 = class206.method1445(-7923, "(U1");

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "Lce;")
    public static class126 field4330 = class206.method1445(-7923, "Lade)3)3)3");

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "Lce;")
    public static class126 field4327 = class206.method1445(-7923, "<col=00ff80>");

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "Lsi;")
    public static class237 field4321;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "Ld;")
    public static class60 field4317;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V", line = 7)
    public static final void method1742(int arg0) {
        field4322++;
        if (!class264.field4407) {
            return;
        }
        class264.field4407 = false;
        class221.field3720 = null;
        class272.field4574 = null;
        if (arg0 != 0) {
            method1743(true, (class313) null, -69, 39, -21, 126);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLcc;IIII)V", line = 31)
    public static final void method1743(boolean arg0, class313 arg1, int arg2, int arg3, int arg4, int arg5) {
        class100.field1608 = arg1;
        if (arg5 != 2) {
            method1742(-17);
        }
        class272.field4587 = arg2;
        class150.field2751 = 10000;
        class315.field5413 = arg4;
        class33.field477 = 1;
        field4329++;
        class288.field4785 = arg0;
        class240.field4050 = arg3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)[I", line = 58)
    public final int[] method6(boolean arg0, int arg1) {
        if (!arg0) {
            this.field4324 = -30;
        }
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        field4325++;
        if (this.field2776.field4516) {
            int var4 = this.field4323 + this.field4323 + 1;
            int var5 = this.field4324 + this.field4324 + 1;
            int var6 = 65536 / var5;
            int var7 = 65536 / var4;
            int[][] var8 = new int[var5][];
            for (int var9 = arg1 - this.field4324; var9 <= (this.field4324 + arg1); var9++) {
                int[] var10 = this.method1132(class314.field5378 & var9, -56, 0);
                int var11 = 0;
                int[] var12 = new int[class244.field4133];
                for (int var13 = -this.field4323; var13 <= this.field4323; var13++) {
                    var11 += var10[class321.field5490 & var13];
                }
                int var14 = 0;
                while (class244.field4133 > var14) {
                    var12[var14] = var7 * var11 >> 16;
                    int var15 = var11 - var10[class321.field5490 & var14 - this.field4323];
                    var14++;
                    var11 = var10[this.field4323 + var14 & class321.field5490] + var15;
                }
                var8[this.field4324 + var9 - arg1] = var12;
            }
            for (int var16 = 0; var16 < class244.field4133; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var5; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var6 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Luh;IZ)V", line = 144)
    public static final void method1744(class65 arg0, int arg1, boolean arg2) {
        if (arg1 != 1819444368) {
            field4317 = (class60) null;
        }
        field4319++;
        int var3 = arg0.field1097;
        int var4 = (int) arg0.field1117;
        arg0.method499((byte) 64);
        if (arg2) {
            class176.method1282(var3, 4);
        }
        class297.method2003(var3, -89);
        class112 var5 = class252.method1706(5157, var4);
        if (var5 != null) {
            class23.method114(var5, (byte) 94);
        }
        int var6 = class173.field3067;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class89.method621((byte) -3, class84.field1341[var7])) {
                class243.method1671(var7, 79);
            }
        }
        if (class173.field3067 == 1) {
            class51.field783 = false;
            class182.method1303(class301.field5009, -1048576, class228.field3850, class17.field236, class105.field1657);
        } else {
            class182.method1303(class301.field5009, -1048576, class228.field3850, class17.field236, class105.field1657);
            int var8 = class200.field3414.method2154(class166.field2961);
            for (int var9 = 0; var9 < class173.field3067; var9++) {
                int var10 = class200.field3414.method2154(class202.method1426(22247, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class17.field236 = class173.field3067 * 15 + (class202.field3453 ? 26 : 22);
            class301.field5009 = var8 + 8;
        }
        if (class182.field3162 != -1) {
            class266.method1793(1, false, class182.field3162);
        }
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)V", line = 216)
    public static void method1745(byte arg0) {
        field4317 = null;
        field4327 = null;
        field4326 = null;
        field4320 = null;
        field4330 = null;
        field4321 = null;
        if (arg0 > 16) {
            field4328 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 387)
    public class257() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(II)[[I", line = 237)
    public final int[][] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            return (int[][]) ((int[][]) null);
        }
        field4318++;
        int[][] var3 = this.field2775.method319(-61, arg1);
        if (this.field2775.field775) {
            int var4 = this.field4324 + this.field4324 + 1;
            int var5 = 65536 / var4;
            int[][][] var6 = new int[var4][][];
            int var7 = this.field4323 + this.field4323 + 1;
            int var8 = 65536 / var7;
            for (int var9 = arg1 - this.field4324; var9 <= this.field4324 + arg1; var9++) {
                int[][] var10 = this.method1133(class314.field5378 & var9, 0, true);
                int[][] var11 = new int[3][class244.field4133];
                int var12 = 0;
                int[] var13 = var10[0];
                int var14 = 0;
                int var15 = 0;
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field4323; var18 <= this.field4323; var18++) {
                    int var19 = class321.field5490 & var18;
                    var14 += var17[var19];
                    var12 += var16[var19];
                    var15 += var13[var19];
                }
                int[] var20 = var11[2];
                int[] var21 = var11[0];
                int[] var22 = var11[1];
                int var23 = 0;
                while (class244.field4133 > var23) {
                    var21[var23] = var8 * var15 >> 16;
                    var22[var23] = var8 * var12 >> 16;
                    var20[var23] = var8 * var14 >> 16;
                    int var24 = var23 - this.field4323 & class321.field5490;
                    int var25 = var12 - var16[var24];
                    var23++;
                    int var26 = var14 - var17[var24];
                    int var27 = var15 - var13[var24];
                    int var28 = this.field4323 + var23 & class321.field5490;
                    var14 = var17[var28] + var26;
                    var12 = var16[var28] + var25;
                    var15 = var13[var28] + var27;
                }
                var6[this.field4324 + var9 - arg1] = var11;
            }
            int[] var29 = var3[2];
            int[] var30 = var3[0];
            int[] var31 = var3[1];
            for (int var32 = 0; var32 < class244.field4133; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var6[var36];
                    var33 += var37[0][var32];
                    var35 += var37[2][var32];
                    var34 += var37[1][var32];
                }
                var30[var32] = var5 * var33 >> 16;
                var31[var32] = var5 * var34 >> 16;
                var29[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILbb;)V", line = 391)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field4315++;
        if (arg1 == 0) {
            this.field4323 = arg2.method948(-124);
        } else if (arg1 == 1) {
            this.field4324 = arg2.method948(-122);
        } else if (arg1 == 2) {
            this.field2781 = arg2.method948(-125) == 1;
        }
        if (arg0 != 8) {
            field4316 = 92;
        }
    }
}
