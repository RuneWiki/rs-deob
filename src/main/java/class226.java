import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class226 extends class404 {

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    private int field3470 = 4096;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    private int field3469 = 4096;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    private int field3468 = 4096;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "[B")
    public static byte[] field3464;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "Luu;")
    public static class180 field3462;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "Llt;")
    public static class458 field3466;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "[[B")
    public static byte[][] field3467;

    static {
        int var0 = 0;
        field3464 = new byte[32896];
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; var1 >= var2; ++var2) {
                field3464[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3471 = -1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILha;I)V", line = 3)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 == 0) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field3468 = arg1.method254((byte) -45);
                    }
                } else {
                    this.field3470 = arg1.method254((byte) -97);
                }
            } else {
                this.field3469 = arg1.method254((byte) -95);
            }
            ++field3465;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 47)
    public class226() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 51)
    public static void method1364(byte arg0) {
        int var1 = 86 % ((arg0 - -11) / 55);
        field3467 = null;
        field3466 = null;
        field3462 = null;
        field3464 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)[[I", line = 91)
    public final int[][] method89(int arg0, int arg1) {
        ++field3463;
        if (arg0 != -1) {
            return null;
        } else {
            int[][] var3 = super.field5869.method2819(arg1, arg0 ^ -2);
            if (super.field5869.field7156) {
                int[][] var4 = this.method2400(-11872, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class431.field6348 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (~var12 == ~var13 && ~var13 == ~var14) {
                        var8[var11] = this.field3469 * var12 >> 12;
                        var9[var11] = this.field3470 * var13 >> 12;
                        var10[var11] = this.field3468 * var14 >> 12;
                    } else {
                        var8[var11] = this.field3469;
                        var9[var11] = this.field3470;
                        var10[var11] = this.field3468;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILia;)V", line = 158)
    public static final void method1365(int arg0, class399 arg1) {
        arg1.method2367(8);
        ++field3472;
        int var2 = class507.field7667;
        class47 var3 = class286.field4329 = class224.field3450[var2] = new class47();
        var3.field2197 = var2;
        int var4 = arg1.method2364(30, true);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 16383;
        int var7 = 16383 & var4;
        var3.field2232[0] = var6 - class381.field5550;
        var3.field3218 = (var3.field2232[0] << 7) - -(var3.method337(arg0 ^ arg0) << 6);
        var3.field2239[0] = -class320.field4827 + var7;
        var3.field3222 = (var3.field2239[0] << 7) + (var3.method337(0) << 6);
        class362.field5339 = var3.field3217 = var5;
        if (class58.field997[var2] != null) {
            var3.method340((byte) 97, class58.field997[var2]);
        }
        class328.field4921 = 0;
        class280.field4247[class328.field4921++] = var2;
        class402.field5850[var2] = 0;
        class18.field246 = 0;
        for (int var8 = 1; ~var8 > -2049; ++var8) {
            if (var2 != var8) {
                int var9 = arg1.method2364(18, true);
                int var10 = var9 >> 16;
                int var11 = (var9 & 65423) >> 8;
                int var12 = 255 & var9;
                class322 var13 = class60.field1010[var8] = new class322();
                var13.field4837 = (var10 << 28) + (var11 << 14) + var12;
                var13.field4839 = 0;
                var13.field4838 = -1;
                var13.field4840 = false;
                class56.field938[class18.field246++] = var8;
                class402.field5850[var8] = 0;
            }
        }
        arg1.method2373(false);
    }
}
