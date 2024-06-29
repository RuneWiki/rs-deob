import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class274 extends class219 {

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    private int field4550 = 4096;

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "I")
    private int field4555 = 4096;

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "I")
    private int field4553 = 4096;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "Lbd;")
    public static class162 field4549 = class17.method142(0, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "[I")
    public static int[] field4552 = new int[1000];

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "I")
    public static int field4554 = 0;

    @OriginalMember(owner = "client!ll", name = "X", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4556 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ll", name = "Z", descriptor = "I")
    public static int field4558 = 20;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!ll", name = "bb", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "[[Lba;")
    public static class26[][] field4545;

    @OriginalMember(owner = "client!ll", name = "ab", descriptor = "[[[B")
    public static byte[][][] field4559;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(IB)V", line = 17)
    public static final void method1857(int arg0, byte arg1) {
        field4557++;
        class293.field4931--;
        if (class293.field4931 == arg0) {
            return;
        }
        class161.method1235(class1.field9, arg0 + 1, class1.field9, arg0, class293.field4931 - arg0);
        class161.method1235(class31.field516, arg0 + 1, class31.field516, arg0, class293.field4931 - arg0);
        if (arg1 == 93) {
            class161.method1233(class105.field1911, arg0 + 1, class105.field1911, arg0, class293.field4931 - arg0);
            class161.method1232(class240.field4002, arg0 + 1, class240.field4002, arg0, class293.field4931 - arg0);
            class161.method1237(class126.field2292, arg0 + 1, class126.field2292, arg0, class293.field4931 - arg0);
            class161.method1237(class35.field589, arg0 + 1, class35.field589, arg0, class293.field4931 - arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lda;BI)Lud;", line = 39)
    public static final class79 method1858(class143 arg0, byte arg1, int arg2) {
        field4546++;
        if (arg1 >= -111) {
            field4552 = (int[]) null;
        }
        return class212.method1555(61, arg0, arg2) ? class1.method6((byte) -75) : null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILb;)V", line = 53)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            return;
        }
        field4543++;
        if (arg0 == 0) {
            this.field4550 = arg2.method761((byte) 108);
        } else if (arg0 == 1) {
            this.field4553 = arg2.method761((byte) 108);
        } else if (arg0 == 2) {
            this.field4555 = arg2.method761((byte) 108);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)[[I", line = 102)
    public final int[][] method219(int arg0, byte arg1) {
        field4548++;
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int[][] var4 = this.method1583(arg0, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class128.field2326; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field4550 * var12 >> 12;
                    var9[var11] = this.field4553 * var13 >> 12;
                    var10[var11] = this.field4555 * var14 >> 12;
                } else {
                    var8[var11] = this.field4550;
                    var9[var11] = this.field4553;
                    var10[var11] = this.field4555;
                }
            }
        }
        if (arg1 != 83) {
            field4556 = (BigInteger) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V", line = 163)
    public static final void method1859(int arg0) {
        field4542++;
        for (class183 var1 = (class183) class10.field123.method169(-118); var1 != null; var1 = (class183) class10.field123.method165((byte) -101)) {
            if (var1.field3156 == -1) {
                var1.field3154 = 0;
                class126.method1017(var1, -11204);
            } else {
                var1.method1183(false);
            }
        }
        if (arg0 > -59) {
            field4545 = (class26[][]) ((class26[][]) null);
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 341)
    public class274() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V", line = 211)
    public static void method1860(int arg0) {
        field4549 = null;
        field4545 = (class26[][]) null;
        int var1 = -42 / ((-arg0 - 38) / 58);
        field4556 = null;
        field4559 = (byte[][][]) null;
        field4552 = null;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(Z)V", line = 226)
    public static final void method1861(boolean arg0) {
        field4544++;
        if (!arg0) {
            method1858((class143) null, (byte) -61, -102);
        }
        if (class73.field1169 == -1 || class168.field2951 == -1) {
            return;
        }
        int var1 = class57.field888 + ((class262.field4370 - class57.field888) * class303.field5107 >> 16);
        int var2 = class202.field3424 * 2;
        class303.field5107 += var1;
        if (class303.field5107 < 65535) {
            class93.field1643 = false;
            class7.field61 = false;
        } else {
            if (class93.field1643) {
                class7.field61 = false;
            } else {
                class7.field61 = true;
            }
            class303.field5107 = 65535;
            class93.field1643 = true;
        }
        float[] var3 = new float[3];
        float var4 = (float) class303.field5107 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class43.field719[class73.field1169][var2][var5] * 3;
            int var7 = class43.field719[class73.field1169][var2 + 1][var5] * 3;
            int var8 = var7 - var6;
            int var9 = class43.field719[class73.field1169][var2][var5];
            int var10 = (class43.field719[class73.field1169][var2 + 2][var5] - (class43.field719[class73.field1169][var2 + 3][var5] - class43.field719[class73.field1169][var2 + 2][var5])) * 3;
            int var11 = var6 + var10 - (var7 * 2);
            int var12 = class43.field719[class73.field1169][var2 + 2][var5] + var7 - var9 - var10;
            var3[var5] = (((float) var12 * var4 + (float) var11) * var4 + (float) var8) * var4 + (float) var9;
        }
        float[] var13 = new float[3];
        class160.field2800 = (int) var3[0] - (class178.field3052 * 128);
        class18.field294 = (int) var3[1] * -1;
        class67.field1083 = (int) var3[2] - (class258.field4294 * 128);
        int var14 = class212.field3559 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class43.field719[class168.field2951][var14][var15] * 3;
            int var17 = class43.field719[class168.field2951][var14 + 1][var15] * 3;
            int var18 = class43.field719[class168.field2951][var14][var15];
            int var19 = (class43.field719[class168.field2951][var14 + 2][var15] + class43.field719[class168.field2951][var14 + 2][var15] - class43.field719[class168.field2951][var14 + 3][var15]) * 3;
            int var20 = var17 - var16;
            int var21 = var16 + var19 - (var17 * 2);
            int var22 = class43.field719[class168.field2951][var14 + 2][var15] + var17 - var18 - var19;
            var13[var15] = (((float) var22 * var4 + (float) var21) * var4 + (float) var20) * var4 + (float) var18;
        }
        float var23 = var13[0] - var3[0];
        float var24 = (var13[1] - var3[1]) * -1.0F;
        float var25 = var13[2] - var3[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class207.field3489 = (float) Math.atan2((double) var24, var26);
        class115.field2046 = -((float) Math.atan2((double) var23, (double) var25));
        class180.field3088 = (int) ((double) class115.field2046 * 325.949D) & 0x7FF;
        class216.field3613 = (int) ((double) class207.field3489 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(Z)V", line = 349)
    public static final void method1862(boolean arg0) {
        field4547++;
        class90.field1600.method1529(arg0);
        if (arg0) {
            method1862(false);
        }
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)V", line = 363)
    public static final void method1863(int arg0) {
        if (arg0 == -31285) {
            class144.field2632 = new class18();
            field4560++;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lda;I)V", line = 374)
    public static final void method1864(class143 arg0, int arg1) {
        if (arg1 != 2) {
            method1858((class143) null, (byte) -16, -67);
        }
        class34.field554 = arg0;
        field4551++;
    }
}
