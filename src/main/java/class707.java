import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class707 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    private int field9949 = 0;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public int field9964 = -1;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Z")
    public boolean field9962 = true;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public int field9963 = 512;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Z")
    public boolean field9965 = true;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lqe;")
    public static class469 field9956 = new class469(41, -2);

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "F")
    public static float field9959;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public int field9950;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field9951;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field9952;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field9953;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public int field9954;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field9955;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public int field9957;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field9958;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public int field9961;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[I")
    public static int[] field9960;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)I", line = 6)
    public static final int method4018(boolean arg0) {
        field9958++;
        if (class29.field277 == 0) {
            class334.field4796.method2108(1, new class4("jaclib"));
            if (class334.field4796.method2105(86).method31((byte) -74) != 100) {
                return 1;
            }
            if (!((class4) class334.field4796.method2105(86)).method25(-566831732)) {
                class236.field3433.method1001(0);
            }
            class29.field277 = 1;
        }
        if (class29.field277 == 1) {
            class612.field8647 = class334.method2104((byte) 67);
            class334.field4787.method2108(1, new class636(class597.field8455));
            class334.field4797.method2108(1, new class4("jaggl"));
            class334.field4798.method2108(1, new class4("jagdx"));
            class334.field4799.method2108(1, new class4("jagmisc"));
            class334.field4800.method2108(1, new class4("sw3d"));
            class334.field4801.method2108(1, new class4("hw3d"));
            class334.field4802.method2108(1, new class4("jagtheora"));
            class334.field4803.method2108(1, new class636(class492.field7019));
            class334.field4804.method2108(1, new class636(class538.field7687));
            class334.field4805.method2108(1, new class636(class734.field10278));
            class334.field4806.method2108(1, new class636(class588.field8343));
            class334.field4807.method2108(1, new class636(class421.field6286));
            class334.field4808.method2108(1, new class636(class411.field6187));
            class334.field4809.method2108(1, new class636(class259.field3698));
            class334.field4810.method2108(1, new class636(class134.field1791));
            class334.field4811.method2108(1, new class636(class565.field8034));
            class334.field4812.method2108(1, new class636(class574.field8114));
            class334.field4813.method2108(1, new class636(class87.field1245));
            class334.field4814.method2108(1, new class636(class636.field8936));
            class334.field4815.method2108(1, new class636(class596.field8446));
            class334.field4816.method2108(1, new class636(class265.field3796));
            class334.field4817.method2108(1, new class760(class201.field3014, "huffman"));
            class334.field4818.method2108(1, new class636(class326.field4658));
            class334.field4819.method2108(1, new class636(class248.field3606));
            class334.field4820.method2108(1, new class636(class338.field4915));
            class334.field4821.method2108(1, new class13(class564.field8027, "details"));
            for (int var1 = 0; var1 < class612.field8647.length; var1++) {
                if (class612.field8647[var1].method2105(86) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class334[] var3 = class612.field8647;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class334 var5 = var3[var4];
                int var6 = var5.method2106(-20);
                int var7 = var5.method2105(86).method31((byte) -118);
                var2 += var6 * var7 / 100;
            }
            class29.field277 = 2;
            class285.field4053 = var2;
        }
        if (class612.field8647 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = arg0;
        class334[] var11 = class612.field8647;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class334 var16 = var11[var12];
            int var17 = var16.method2106(114);
            int var18 = var16.method2105(86).method31((byte) -110);
            if (var18 < 100) {
                var10 = false;
            }
            var9 += var17 * var18 / 100;
            var8 += var17;
        }
        if (var10) {
            if (!((class4) class334.field4799.method2105(86)).method25(-566831732)) {
                class236.field3433.method1010(0);
            }
            if (!((class4) class334.field4802.method2105(86)).method25(-566831732)) {
                class710.field9999 = class236.field3433.method1006((byte) 123);
            }
            class612.field8647 = null;
        }
        int var13 = var8 - class285.field4053;
        int var14 = var9 - class285.field4053;
        int var15 = var13 <= 0 ? 100 : var14 * 100 / var13;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 150)
    public static void method4019(int arg0) {
        if (arg0 >= -101) {
            field9959 = -0.95548224F;
        }
        field9956 = null;
        field9960 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;BLjava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", line = 163)
    public static final void method4020(String arg0, int arg1, String arg2, byte arg3, String arg4, int arg5, String arg6, String arg7, int arg8) {
        field9953++;
        class710 var9 = class590.field8371[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class590.field8371[var10] = class590.field8371[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class710(arg1, arg8, arg7, arg2, arg4, arg0, arg5, arg6);
        } else {
            var9.method4039(arg6, arg5, arg1, arg7, (byte) 115, arg0, arg4, arg2, arg8);
        }
        class78.field1084++;
        class590.field8371[0] = var9;
        class81.field1137 = class589.field8351;
        if (arg3 < 12) {
            field9960 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lrg;II)V", line = 196)
    private final void method4021(class645 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field9949 = arg0.method3747((byte) -74);
            this.method4023(-85, this.field9949);
        } else if (arg2 == 2) {
            this.field9964 = arg0.method3712((byte) 102);
            if (this.field9964 == 65535) {
                this.field9964 = -1;
            }
        } else if (arg2 == 3) {
            this.field9963 = arg0.method3712((byte) 55) << 2;
        } else if (arg2 == 4) {
            this.field9962 = false;
        } else if (arg2 == 5) {
            this.field9965 = false;
        }
        field9951++;
        if (arg1 != 255) {
            this.method4022(-85, null);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILrg;)V", line = 241)
    public final void method4022(int arg0, class645 arg1) {
        while (true) {
            int var3 = arg1.method3745(arg0 - 6313);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.method4023(26, 100);
                }
                field9955++;
                return;
            }
            this.method4021(arg1, arg0 + 256, var3);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V", line = 274)
    private final void method4023(int arg0, int arg1) {
        field9952++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field9950 = (int) (var15 * 256.0D);
        this.field9957 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (var17 > 0.5D) {
            this.field9961 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field9961 = (int) (var15 * var17 * 512.0D);
        }
        if (arg0 > -55) {
            return;
        }
        if (this.field9957 < 0) {
            this.field9957 = 0;
        } else if (this.field9957 > 255) {
            this.field9957 = 255;
        }
        if (this.field9950 < 0) {
            this.field9950 = 0;
        } else if (this.field9950 > 255) {
            this.field9950 = 255;
        }
        if (this.field9961 < 1) {
            this.field9961 = 1;
        }
        this.field9954 = (int) ((double) this.field9961 * var19);
    }
}
