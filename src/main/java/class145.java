import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class145 extends class271 {

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "[B")
    public byte[] field2494;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "Lwa;")
    public static class75 field2501 = class66.method560("Versteckt", false);

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static volatile int field2499 = 0;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "[I")
    public static int[] field2500 = new int[2];

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "[B")
    public static byte[] field2498 = new byte[32896];

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "Lwa;")
    public static class75 field2503;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([B)V", line = 10)
    public class145(byte[] arg0) {
        this.field2494 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lwa;IZ)V", line = 19)
    public static final void method1110(class75 arg0, int arg1, boolean arg2) {
        field2497++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class269.field4654.method789(arg0, 250);
        int var7 = class269.field4654.method776(arg0, 250) * 13;
        class222.method1632(var5 - var3, var4 - var3, var3 + var6 + var3, var3 + var7 - -var3, 0);
        class222.method1640(var5 - var3, var4 - var3, var3 + var6 + var3, var3 + var3 + var7, 16777215);
        class269.field4654.method780(arg0, var5, var4, var6, var7, 16777215, arg1, 1, 1, 0);
        class177.method1306(var4 - var3, var3 + var3 + var6, var5 - var3, var7 - -var3 + var3, (byte) -106);
        if (arg2) {
            class47.method311();
        } else {
            class134.method1039(var6, 0, var5, var4, var7);
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V", line = 58)
    public static void method1111(int arg0) {
        field2498 = null;
        field2503 = null;
        if (arg0 == 1) {
            field2501 = null;
            field2500 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)I", line = 72)
    public static final int method1112(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 24001) {
            return -104;
        }
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        field2496++;
        return (arg3 >> 2 << 10) + (arg2 >> 5 << 7) + (arg0 >> 1);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2498[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
        field2503 = class66.method560(" zuerst von Ihrer Freunde)2Liste(Q", false);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)V", line = 150)
    public static final void method1113(int arg0, int arg1, int arg2) {
        if (class269.field4644 != arg2) {
            class67.field1178 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class67.field1178[var3] = (var3 << 12) / arg2;
            }
            class157.field2697 = arg2 - 1;
            class269.field4644 = arg2;
            class305.field5217 = arg2 == 64 ? 2048 : 4096;
        }
        if (class303.field5189 != arg1) {
            if (class269.field4644 == arg1) {
                class50.field814 = class67.field1178;
            } else {
                class50.field814 = new int[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    class50.field814[var4] = (var4 << 12) / arg1;
                }
            }
            class303.field5189 = arg1;
            class3.field31 = arg1 - 1;
        }
        if (arg0 < -121) {
            field2495++;
        }
    }
}
