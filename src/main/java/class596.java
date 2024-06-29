import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class596 extends class683 {

    @OriginalMember(owner = "client!tda", name = "cb", descriptor = "[I")
    public int[] field7990 = new int[12];

    @OriginalMember(owner = "client!tda", name = "db", descriptor = "[[I")
    public int[][] field7991 = new int[32][512];

    @OriginalMember(owner = "client!tda", name = "eb", descriptor = "[I")
    public int[] field7992 = new int[class651.field8829];

    @OriginalMember(owner = "client!tda", name = "ab", descriptor = "[I")
    public int[] field7988 = new int[2200];

    @OriginalMember(owner = "client!tda", name = "gb", descriptor = "[I")
    public int[] field7994 = new int[12];

    @OriginalMember(owner = "client!tda", name = "ib", descriptor = "[[I")
    public int[][] field7996 = new int[12][class651.field8811 + 8191];

    @OriginalMember(owner = "client!tda", name = "mb", descriptor = "[I")
    public int[] field8000 = new int[32];

    @OriginalMember(owner = "client!tda", name = "nb", descriptor = "[[I")
    public int[][] field8001 = new int[2200][64];

    @OriginalMember(owner = "client!tda", name = "kb", descriptor = "[I")
    public int[] field7998 = new int[class651.field8811 + 8191];

    @OriginalMember(owner = "client!tda", name = "lb", descriptor = "[I")
    public int[] field7999 = new int[class651.field8811 + 8191];

    @OriginalMember(owner = "client!tda", name = "hb", descriptor = "Lkc;")
    public class123 field7995;

    @OriginalMember(owner = "client!tda", name = "fb", descriptor = "I")
    public static int field7993 = 1;

    @OriginalMember(owner = "client!tda", name = "jb", descriptor = "I")
    public static int field7997 = -1;

    @OriginalMember(owner = "client!tda", name = "Z", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!tda", name = "bb", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!tda", name = "ob", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!tda", name = "pb", descriptor = "[I")
    public static int[] field8003;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)V")
    public static void method3292(int arg0) {
        field8003 = null;
        if (arg0 != 0) {
            method3293((byte) -26, (class32) null);
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(BLwv;)V")
    public static final void method3293(byte arg0, class32 arg1) {
        ++field7987;
        boolean var2 = false;
        if (class665.field9027 != arg1.field445 && arg1.field447 != -1 && ~arg1.field472 == -1) {
            class207 var3 = class11.field110.method1141(arg1.field447, (byte) 110);
            if (var3.field2434 || ~(arg1.field407 + 1) < ~var3.field2436[arg1.field478]) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = -arg1.field470 + arg1.field445;
            int var5 = -arg1.field470 + class665.field9027;
            int var6 = arg1.field456 * 512 + arg1.method210(false) * 256;
            int var7 = arg1.field449 * 512 - -(arg1.method210(false) * 256);
            int var8 = arg1.field437 * 512 + arg1.method210(false) * 256;
            int var9 = arg1.field410 * 512 + 256 * arg1.method210(false);
            arg1.field8018 = ((-var5 + var4) * var6 - -(var5 * var8)) / var4;
            arg1.field8011 = ((-var5 + var4) * var7 + var5 * var9) / var4;
        }
        arg1.field509 = 0;
        if (~arg1.field409 == -1) {
            arg1.method221(false, 8192, arg0 ^ -120);
        }
        if (arg0 != -118) {
            field8003 = null;
        }
        if (~arg1.field409 == -2) {
            arg1.method221(false, 12288, 2);
        }
        if (~arg1.field409 == -3) {
            arg1.method221(false, 0, 2);
        }
        if (arg1.field409 == 3) {
            arg1.method221(false, 4096, 2);
        }
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "(I)V")
    public static final void method3294(int arg0) {
        ++field7989;
        int var1 = class222.field2585.method3054(-2);
        int var2 = class222.field2585.method3076((byte) 106);
        class442.field5572 = class222.field2585.method3063(0);
        int var3 = class222.field2585.method3096(-8);
        boolean var4 = class222.field2585.method3063(0) == 1;
        if (arg0 >= 34) {
            class693.method3827((byte) -26);
            class107.method752(var2, (byte) 26);
            class222.field2585.method3582(116);
            for (int var5 = 0; var5 < 4; ++var5) {
                for (int var20 = 0; var20 < class85.field1090 >> 3; ++var20) {
                    for (int var21 = 0; ~(class656.field8932 >> 3) < ~var21; ++var21) {
                        int var22 = class222.field2585.method3578(8, 1);
                        if (~var22 == -2) {
                            class296.field3773[var5][var20][var21] = class222.field2585.method3578(8, 26);
                        } else {
                            class296.field3773[var5][var20][var21] = -1;
                        }
                    }
                }
            }
            class222.field2585.method3576((byte) 36);
            int var6 = (-class222.field2585.field7313 + class10.field100) / 16;
            class589.field7901 = new int[var6][4];
            for (int var7 = 0; var7 < var6; ++var7) {
                for (int var19 = 0; var19 < 4; ++var19) {
                    class589.field7901[var7][var19] = class222.field2585.method3064(-2031091464);
                }
            }
            class523.field6614 = new byte[var6][];
            class657.field8938 = new int[var6];
            class340.field4340 = new byte[var6][];
            class307.field3888 = new int[var6];
            class552.field6912 = new byte[var6][];
            class257.field3289 = null;
            class269.field3416 = new int[var6];
            class14.field139 = new int[var6];
            class418.field5342 = new byte[var6][];
            class599.field8032 = null;
            class576.field7563 = new int[var6];
            int var8 = 0;
            for (int var9 = 0; ~var9 > -5; ++var9) {
                for (int var10 = 0; class85.field1090 >> 3 > var10; ++var10) {
                    for (int var11 = 0; class656.field8932 >> 3 > var11; ++var11) {
                        int var12 = class296.field3773[var9][var10][var11];
                        if (var12 != -1) {
                            int var13 = 1023 & var12 >> 14;
                            int var14 = (16380 & var12) >> 3;
                            int var15 = (var13 / 8 << 8) - -(var14 / 8);
                            for (int var16 = 0; var8 > var16; ++var16) {
                                if (~class307.field3888[var16] == ~var15) {
                                    var15 = -1;
                                    break;
                                }
                            }
                            if (var15 != -1) {
                                class307.field3888[var8] = var15;
                                int var17 = (65320 & var15) >> 8;
                                int var18 = var15 & 255;
                                class576.field7563[var8] = class109.field1364.method1651("m" + var17 + "_" + var18, (byte) 77);
                                class269.field3416[var8] = class109.field1364.method1651("l" + var17 + "_" + var18, (byte) 77);
                                class14.field139[var8] = class109.field1364.method1651("um" + var17 + "_" + var18, (byte) 77);
                                class657.field8938[var8] = class109.field1364.method1651("ul" + var17 + "_" + var18, (byte) 77);
                                ++var8;
                            }
                        }
                    }
                }
            }
            class250.method1509(9840, var4, 11, var1, var3);
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
    public final void method1399(int arg0) {
        this.field7995 = new class123(super.field9308);
        ++field8002;
        if (arg0 != 10) {
            this.field7991 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Llea;)V")
    public class596(class574 arg0) {
        super(arg0);
        this.field7995 = new class123(arg0);
        super.field9329 = new class155(super.field9308);
        super.field9348 = new class155(super.field9308);
        super.field9339 = new class155(super.field9308);
        super.field9325 = new class155(super.field9308);
        super.field9333 = new class155(super.field9308);
        super.field9318 = new class155(super.field9308);
        super.field9345 = new class155(super.field9308);
        super.field9343 = new class155(super.field9308);
        super.field9313 = new class155(super.field9308);
        super.field9346 = new class155(super.field9308);
    }
}
