import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class223 extends class77 {

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    private int field4133 = -1;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    private int field4135 = 0;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "Lqb;")
    public static class176 field4128 = new class176(5);

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "Ldc;")
    public static class37 field4137 = class185.method1233((byte) 86, ":");

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "[I")
    public static int[] field4139 = new int[2000];

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field4136 = 0;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "Ldc;")
    public static class37 field4142 = null;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "[I")
    public static int[] field4140 = new int[100];

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "Ldc;")
    public static class37 field4138 = class185.method1233((byte) 86, "VOLL");

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "B")
    public static byte field4141;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public int field4129;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public int field4131;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V")
    public static void method1466(byte arg0) {
        field4140 = null;
        if (arg0 != -117) {
            method1471(99, -77);
        }
        field4138 = null;
        field4142 = null;
        field4137 = null;
        field4139 = null;
        field4128 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)V")
    private final void method1467(int arg0, byte arg1) {
        field4132++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (arg1 < 9) {
            field4142 = null;
        }
        double var9 = var3;
        double var11 = var3;
        if (var3 > var7) {
            var9 = var7;
        }
        if (var5 < var9) {
            var9 = var5;
        }
        double var13 = 0.0D;
        if (var7 > var3) {
            var11 = var7;
        }
        double var15 = 0.0D;
        if (var5 > var11) {
            var11 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field4125 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var3 == var11) {
                var15 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var15 = (var5 - var3) / (-var9 + var11) + 2.0D;
            } else if (var5 == var11) {
                var15 = (var3 - var7) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        if (var17 > 0.5D) {
            this.field4129 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field4129 = (int) (var13 * var17 * 512.0D);
        }
        this.field4131 = (int) (var13 * 256.0D);
        if (this.field4131 < 0) {
            this.field4131 = 0;
        } else if (this.field4131 > 255) {
            this.field4131 = 255;
        }
        if (this.field4125 < 0) {
            this.field4125 = 0;
        } else if (this.field4125 > 255) {
            this.field4125 = 255;
        }
        if (this.field4129 < 1) {
            this.field4129 = 1;
        }
        double var19 = var15 / 6.0D;
        this.field4124 = (int) ((double) this.field4129 * var19);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILce;)V")
    private final void method1468(int arg0, int arg1, int arg2, class28 arg3) {
        field4130++;
        if (arg0 == 1) {
            this.field4135 = arg3.method225(111);
            this.method1467(this.field4135, (byte) 29);
        } else if (arg0 == 2) {
            this.field4133 = arg3.method230((byte) -115);
            if (this.field4133 == 65535) {
                this.field4133 = -1;
            }
        } else if (arg0 == 3) {
            arg3.method230((byte) -103);
        }
        if (arg2 != -1) {
            this.method1467(80, (byte) -24);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILce;)V")
    public final void method1469(int arg0, int arg1, class28 arg2) {
        if (arg1 != -29710) {
            method1466((byte) 99);
        }
        while (true) {
            int var4 = arg2.method215(arg1 ^ 0x6B2801FA);
            if (var4 == 0) {
                field4126++;
                return;
            }
            this.method1468(var4, arg0, -1, arg2);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)I")
    public static final int method1470(int arg0, int arg1, int arg2) {
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (arg1 <= 65) {
            return 48;
        }
        field4127++;
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Llf;")
    public static final class125 method1471(int arg0, int arg1) {
        int var2 = 44 / ((arg0 - 56) / 60);
        field4134++;
        class125 var3 = (class125) class2.field4.method87(-62, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class94.field1658.method1547(class31.method259(-21502, arg1), 0, class209.method1388(arg1, (byte) -99));
        class125 var5 = new class125();
        var5.field2256 = arg1;
        if (var4 != null) {
            var5.method853(new class28(var4), (byte) 99);
        }
        var5.method852(-1025);
        if (var5.field2285 != -1) {
            var5.method846(127, method1471(123, var5.field2285), method1471(-116, var5.field2291));
        }
        if (var5.field2245 != -1) {
            var5.method859(method1471(-80, var5.field2245), method1471(123, var5.field2224), (byte) -22);
        }
        if (!class161.field3049 && var5.field2238) {
            var5.field2230 = false;
            var5.field2273 = 0;
            var5.field2275 = null;
            var5.field2232 = class110.field1921;
            var5.field2240 = null;
        }
        class2.field4.method92((long) arg1, var5, true);
        return var5;
    }
}
