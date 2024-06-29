import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class309 extends class182 {

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    private int field5047 = 32768;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field5046 = 0;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field5045 = -1;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "Llj;")
    public static class59 field5049 = new class59(128);

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "[[B")
    public static byte[][] field5053;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Loe;IB)V", line = 5)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        field5044++;
        if (arg2 != 60) {
            field5052 = 19;
        }
        if (arg1 == 0) {
            this.field5047 = arg0.method989(105) << 4;
        } else if (arg1 == 1) {
            this.field3154 = arg0.method1005((byte) 122) == 1;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)[[I", line = 41)
    public final int[][] method122(int arg0, int arg1) {
        field5048++;
        int[][] var3 = this.field3152.method1953(arg0, 82);
        if (arg1 != 4944) {
            this.field5047 = -61;
        }
        if (this.field3152.field4493) {
            int[] var4 = this.method1292(arg0, 1, -97);
            int[] var5 = this.method1292(arg0, 2, arg1 ^ 0xFFFFECD1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class26.field672; var9++) {
                int var10 = (var4[var9] * 255 & 0xFF9E2) >> 12;
                int var11 = var5[var9] * this.field5047 >> 12;
                int var12 = class107.field1937[var10] * var11 >> 12;
                int var13 = class223.field3690[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class53.field1056;
                int var15 = class194.field3266 & (var13 >> 12) + arg0;
                int[][] var16 = this.method1291(var15, (byte) 37, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)V", line = 97)
    public static void method2251(int arg0) {
        field5053 = (byte[][]) null;
        field5049 = null;
        if (arg0 != 16350) {
            method2251(-45);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)[I", line = 113)
    public final int[] method125(int arg0, int arg1) {
        field5051++;
        int[] var3 = this.field3166.method775(arg1, arg0 ^ 0x7C);
        if (this.field3166.field1903) {
            int[] var4 = this.method1292(arg1, 1, -125);
            int[] var5 = this.method1292(arg1, 2, -95);
            for (int var6 = 0; var6 < class26.field672; var6++) {
                int var7 = (var4[var6] & 0xFF4) >> 4;
                int var8 = var5[var6] * this.field5047 >> 12;
                int var9 = class223.field3690[var7] * var8 >> 12;
                int var10 = class194.field3266 & arg1 + (var9 >> 12);
                int var11 = class107.field1937[var7] * var8 >> 12;
                int var12 = class53.field1056 & (var11 >> 12) + var6;
                int[] var13 = this.method1292(var10, 0, -121);
                var3[var6] = var13[var12];
            }
        }
        return arg0 == 2 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V", line = 160)
    public final void method163(int arg0) {
        if (arg0 == 100) {
            class219.method1526(256);
            field5050++;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 185)
    public class309() {
        super(3, false);
    }
}
