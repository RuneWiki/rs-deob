import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class157 extends class286 {

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "Ldf;")
    public static class177 field2517 = new class177(128);

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "[J")
    public static long[] field2518 = new long[256];

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "[I")
    public static int[] field2520;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "J")
    public static long field2522;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public int field2514;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "Lth;")
    public class153 field2512;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "[B")
    public byte[] field2510;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "[[[B")
    public static byte[][][] field2521;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([IBII[I)V", line = 8)
    public static final void method1274(int[] arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 < arg2) {
            int var5 = arg3;
            int var6 = (arg2 + arg3) / 2;
            int var7 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var7;
            int var8 = arg0[var6];
            arg0[var6] = arg0[arg2];
            arg0[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (var7 + (var9 & 0x1) > arg4[var9]) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg4[arg2] = arg4[var5];
            arg4[var5] = var7;
            arg0[arg2] = arg0[var5];
            arg0[var5] = var8;
            method1274(arg0, (byte) 77, var5 - 1, arg3, arg4);
            method1274(arg0, (byte) 120, arg2, var5 + 1, arg4);
        }
        field2516++;
        if (arg1 < 47) {
            method1276(70);
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V", line = 64)
    public static final void method1275(byte arg0) {
        if (arg0 > -122) {
            return;
        }
        field2509++;
        if (class94.field1434 != null) {
            class94.field1434.method1879(true);
        }
        if (class68.field1048 != null) {
            class68.field1048.method1879(true);
        }
        class195.method1482((byte) -100, 2, class110.field1686, 22050);
        class94.field1434 = class98.method868(0, class64.field974, (byte) -7, 22050, class340.field5234);
        class94.field1434.method1876(30555, class93.field1409);
        class68.field1048 = class98.method868(1, class64.field974, (byte) 24, 2048, class340.field5234);
        class68.field1048.method1876(30555, class19.field316);
    }

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V", line = 87)
    public static void method1276(int arg0) {
        field2518 = null;
        field2521 = (byte[][][]) null;
        int var1 = -12 / ((-arg0 - 52) / 48);
        field2520 = null;
        field2517 = null;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)[B", line = 101)
    public final byte[] method871(byte arg0) {
        field2513++;
        if (arg0 >= -86) {
            method1275((byte) 126);
        }
        if (this.field4435) {
            throw new RuntimeException();
        }
        return this.field2510;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)I", line = 121)
    public final int method870(boolean arg0) {
        field2511++;
        if (this.field4435) {
            return 0;
        } else if (arg0) {
            return -106;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lrn;Z)V", line = 138)
    public static final void method1277(class18 arg0, boolean arg1) {
        field2515++;
        if (class311.field4839) {
            return;
        }
        if (class240.field3737) {
            class213.method1598();
        } else {
            class60.method592();
        }
        class298.field4625 = class342.method2402(113, arg0, class297.field4610);
        int var2 = class362.field5740;
        int var3 = var2 * 956 / 503;
        class298.field4625.method13((class126.field2113 - var3) / 2, 0, var3, var2);
        class191.field3009 = class317.method2236(class185.field2895, (byte) 38, arg0);
        class191.field3009.method711(class126.field2113 / 2 - (class191.field3009.field3827 / 2), 18);
        class311.field4839 = true;
        if (arg1) {
            method1276(-76);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2518[var0] = var1;
        }
        field2519 = 1;
        field2520 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
        field2522 = 0L;
    }
}
