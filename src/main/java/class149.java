import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class149 extends class183 {

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    private int field2572 = 4;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    private int field2571 = 4;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2573 = new CRC32();

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "[[Lrg;")
    public static class96[][] field2576 = new class96[13][13];

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "Lpc;")
    public static class91 field2575 = new class91(16);

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "I")
    public static int field2578 = 0;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILkh;I)V", line = 12)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2572 = arg1.method93(false);
        } else if (arg2 == 1) {
            this.field2571 = arg1.method93(false);
        }
        if (arg0 > -43) {
            this.method10(44, 119);
        }
        field2574++;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V", line = 52)
    public static void method1021(int arg0) {
        field2573 = null;
        if (arg0 >= -8) {
            field2575 = (class91) null;
        }
        field2575 = null;
        field2576 = (class96[][]) null;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 68)
    public class149() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)Z", line = 74)
    public static final boolean method1022(int arg0) {
        if (arg0 < 95) {
            method1022(-80);
        }
        field2577++;
        if (class74.field1404) {
            try {
                class274.field4697.method1634((byte) -2, class215.field3689.field3461);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)[[I", line = 95)
    public final int[][] method12(int arg0, int arg1) {
        field2569++;
        int var3 = 94 / ((arg0 - 18) / 61);
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int var5 = class22.field393 / this.field2572;
            int var6 = class144.field2508 / this.field2571;
            int[][] var8;
            if (var6 > 0) {
                int var7 = arg1 % var6;
                var8 = this.method1250(class144.field2508 * var7 / var6, 0, (byte) 84);
            } else {
                var8 = this.method1250(0, 0, (byte) 66);
            }
            int[] var9 = var8[1];
            int[] var10 = var8[2];
            int[] var11 = var8[0];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; var15 < class22.field393; var15++) {
                int var17;
                if (var5 > 0) {
                    int var16 = var15 % var5;
                    var17 = class22.field393 * var16 / var5;
                } else {
                    var17 = 0;
                }
                var12[var15] = var11[var17];
                var13[var15] = var9[var17];
                var14[var15] = var10[var17];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(II)[I", line = 178)
    public final int[] method10(int arg0, int arg1) {
        if (arg1 != -1) {
            return (int[]) null;
        }
        field2570++;
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            int var4 = class22.field393 / this.field2572;
            int var5 = class144.field2508 / this.field2571;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method1253(0, class144.field2508 * var6 / var5, arg1 + 99);
            } else {
                var7 = this.method1253(0, 0, 99);
            }
            for (int var8 = 0; var8 < class22.field393; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class22.field393 * var9 / var4];
                }
            }
        }
        return var3;
    }
}
