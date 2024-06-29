import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class242 {

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
    public static int[] field4357 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4358 = 0;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field4361 = 0;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field4363 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Lnc;")
    public static class11 field4356;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "[Z")
    public static boolean[] field4362;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1669(int arg0, int arg1, int arg2, int arg3) {
        if (class51.method330(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class113.method808(var4 + 1, class218.field3754[arg0][arg1][arg2] + arg3, var5 + 1) && class113.method808(var4 + 128 - 1, class218.field3754[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class113.method808(var4 + 128 - 1, class218.field3754[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class113.method808(var4 + 1, class218.field3754[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static final void method1670(byte arg0) {
        if (arg0 > 1) {
            field4359++;
            class66.field1055.method985(0);
            class120.field2028.method1145(101);
            class224.field3846.method1145(96);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method1671(int arg0) {
        field4356 = null;
        field4362 = null;
        if (arg0 != 23578) {
            method1670((byte) -13);
        }
        field4357 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1672(byte arg0, byte[] arg1) {
        class187 var2 = new class187(arg1);
        if (arg0 != 4) {
            field4362 = null;
        }
        field4355++;
        int var3 = var2.method1268(255);
        int var4 = var2.method1290((byte) 90);
        if (var4 < 0 || !(class120.field2026 == 0 || class120.field2026 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1280(255, var4, 0, var7);
            return var7;
        } else {
            int var5 = var2.method1290((byte) 90);
            if (var5 < 0 || !(class120.field2026 == 0 || class120.field2026 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class261.method1760(var6, var5, arg1, var4, 9);
            } else {
                class83.field1302.method836(1, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
    public static final void method1673(int arg0, int arg1, int arg2) {
        field4360++;
        if (class160.field2674 > 0) {
            class22.method136(class160.field2674, 1);
            class160.field2674 = 0;
        }
        int var3 = -125 / ((-arg1 - 18) / 56);
        short var4 = 256;
        int var5 = class122.field2048 * arg2;
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 1; var8 < (var4 - 1); var8++) {
            int var9 = (var4 - var8) * class32.field469[var8] / var4;
            if (var9 < 0) {
                var9 = 0;
            }
            var7 += var9;
            for (int var10 = var9; var10 < 128; var10++) {
                int var12 = class122.field2050[arg0 + (var5++)];
                int var13 = class10.field178[var7++];
                if (var13 == 0) {
                    class291.field5128.field3331[var6++] = var12;
                } else {
                    int var14 = var13 + 18;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = 238 - var13;
                    if (var15 > 255) {
                        var15 = 255;
                    }
                    int var16 = class138.field2355[var13];
                    class291.field5128.field3331[var6++] = class96.method626(var15 * class96.method626(16711935, var12) + var14 * class96.method626(var16, 16711935), -16711936) + class96.method626(16711680, class96.method626(var12, 65280) * var15 + var14 * class96.method626(var16, 65280)) >> 8;
                }
            }
            for (int var11 = 0; var11 < var9; var11++) {
                class291.field5128.field3331[var6++] = class122.field2050[var5++ + arg0];
            }
            var5 += class122.field2048 - 128;
        }
        class291.field5128.method705(arg0, arg2);
    }
}
