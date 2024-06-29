import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class185 extends class220 {

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "[I")
    public static int[] field3227 = new int[5];

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "Lem;")
    public static class10 field3223;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "Loe;")
    private class120 field3231;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lbg;IB)V", line = 4)
    private final void method1248(class194 arg0, int arg1, byte arg2) {
        if (arg2 < 91) {
            this.method1251((class194) null, (byte) 124);
        }
        field3224++;
        if (arg1 != 249) {
            return;
        }
        int var4 = arg0.method1325(7627);
        if (this.field3231 == null) {
            int var5 = class58.method383((byte) -50, var4);
            this.field3231 = new class120(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method1325(7627) == 1;
            int var8 = arg0.method1349((byte) 91);
            class287 var9;
            if (var7) {
                var9 = new class57(arg0.method1319(1));
            } else {
                var9 = new class155(arg0.method1350(false));
            }
            this.field3231.method730(var9, (long) var8, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V", line = 50)
    public static void method1249(byte arg0) {
        field3223 = null;
        field3227 = null;
        int var1 = -58 / ((-arg0 - 15) / 49);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)I", line = 67)
    public static final int method1250(int arg0, int arg1) {
        field3230++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFFC6) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = 0.0D;
        double var10 = 0.0D;
        double var12 = var2;
        if (var4 < var2) {
            var12 = var4;
        }
        double var14 = var2;
        if (var2 < var4) {
            var14 = var4;
        }
        if (var14 < var6) {
            var14 = var6;
        }
        if (var6 < var12) {
            var12 = var6;
        }
        double var16 = (var12 + var14) / 2.0D;
        if (var12 != var14) {
            if (var2 == var14) {
                var8 = (var4 - var6) / (var14 - var12);
            } else if (var4 == var14) {
                var8 = (var6 - var2) / (var14 - var12) + 2.0D;
            } else if (var6 == var14) {
                var8 = (var2 - var4) / (var14 - var12) + 4.0D;
            }
            if (var16 < 0.5D) {
                var10 = (var14 - var12) / (var12 + var14);
            }
            if (var16 >= 0.5D) {
                var10 = (var14 - var12) / (2.0D - var14 - var12);
            }
        }
        int var18 = (int) (var10 * 256.0D);
        if (arg1 != -180) {
            return -87;
        }
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        double var19 = var8 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var18 >>= 0x4;
        } else if (var22 > 217) {
            var18 >>= 0x3;
        } else if (var22 > 192) {
            var18 >>= 0x2;
        } else if (var22 > 179) {
            var18 >>= 0x1;
        }
        return (var18 >> 5 << 7) + (var21 >> 2 << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lbg;B)V", line = 168)
    public final void method1251(class194 arg0, byte arg1) {
        field3233++;
        while (true) {
            int var3 = arg0.method1325(7627);
            if (var3 == 0) {
                if (arg1 >= -59) {
                    field3225 = 51;
                }
                return;
            }
            this.method1248(arg0, var3, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIII)V", line = 189)
    public static final void method1252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class6.field130 = arg4;
        class254.field4380 = arg1;
        field3229++;
        if (arg3 >= 89) {
            class146.field2508 = arg5;
            class245.field4176 = arg2;
            class57.field1099 = arg0;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BILmh;)Lmh;", line = 224)
    public final class128 method1253(byte arg0, int arg1, class128 arg2) {
        field3232++;
        if (arg0 != 48) {
            this.method1253((byte) -67, 4, (class128) null);
        }
        if (this.field3231 == null) {
            return arg2;
        } else {
            class57 var4 = (class57) this.field3231.method728(false, (long) arg1);
            return var4 == null ? arg2 : var4.field1096;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BII)I", line = 245)
    public final int method1254(byte arg0, int arg1, int arg2) {
        field3228++;
        if (arg0 != -53) {
            field3227 = (int[]) null;
        }
        if (this.field3231 == null) {
            return arg1;
        } else {
            class155 var4 = (class155) this.field3231.method728(false, (long) arg2);
            return var4 == null ? arg1 : var4.field2672;
        }
    }
}
