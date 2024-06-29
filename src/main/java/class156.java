import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class156 {

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    private int field2790 = 0;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    private int field2794 = -1;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field2783 = 0;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "[I")
    public static int[] field2789 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2787 = 0;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "S")
    public static short field2797 = 32767;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Z")
    public static boolean field2795 = false;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lha;")
    public static class46 field2796 = class271.method1828("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", -46);

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Lha;")
    public static class46 field2800 = class271.method1828("mapfunction", -46);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public int field2786;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
    public static final Class method1149(String arg0, boolean arg1) throws ClassNotFoundException {
        field2782++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else {
            if (!arg1) {
                method1152(-64, (byte) -66);
            }
            if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1150(byte arg0) {
        field2800 = null;
        field2789 = null;
        if (arg0 > -70) {
            field2795 = false;
        }
        field2796 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILwe;I)V")
    public final void method1151(int arg0, class75 arg1, int arg2) {
        if (arg2 != 0) {
            field2800 = null;
        }
        field2785++;
        while (true) {
            int var4 = arg1.method558(1);
            if (var4 == 0) {
                return;
            }
            this.method1154(arg1, 561, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Ldj;")
    public static final class78 method1152(int arg0, byte arg1) {
        class78 var2 = (class78) class129.field2361.method86(7961, (long) arg0);
        field2791++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 > -112) {
            field2797 = -9;
        }
        byte[] var3 = class80.field1523.method1293(class175.method1257(-118, arg0), class3.method13(82, arg0), (byte) 126);
        class78 var4 = new class78();
        var4.field1445 = arg0;
        if (var3 != null) {
            var4.method618(new class75(var3), (byte) -106);
        }
        var4.method624(-54);
        class129.field2361.method80(var4, (long) arg0, (byte) 67);
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
    private final void method1153(int arg0, int arg1) {
        field2799++;
        double var3 = (double) (arg1 >> 8 & arg0) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = (double) ((arg1 & 0xFF6BC5) >> 16) / 256.0D;
        double var9 = var7;
        double var11 = var7;
        if (var3 < var7) {
            var9 = var3;
        }
        if (var7 < var3) {
            var11 = var3;
        }
        if (var5 > var11) {
            var11 = var5;
        }
        if (var5 < var9) {
            var9 = var5;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field2786 = (int) (var17 * 256.0D);
        if (this.field2786 < 0) {
            this.field2786 = 0;
        } else if (this.field2786 > 255) {
            this.field2786 = 255;
        }
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var7 == var11) {
                var15 = (var3 - var5) / (var11 - var9);
            } else if (var3 == var11) {
                var15 = (var5 - var7) / (var11 - var9) + 2.0D;
            } else if (var5 == var11) {
                var15 = (var7 - var3) / (var11 - var9) + 4.0D;
            }
        }
        if ((var17 > 0.5D)) {
            this.field2788 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field2788 = (int) (var13 * var17 * 512.0D);
        }
        this.field2792 = (int) (var13 * 256.0D);
        if (this.field2792 < 0) {
            this.field2792 = 0;
        } else if (this.field2792 > 255) {
            this.field2792 = 255;
        }
        double var19 = var15 / 6.0D;
        if (this.field2788 < 1) {
            this.field2788 = 1;
        }
        this.field2784 = (int) ((double) this.field2788 * var19);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lwe;III)V")
    private final void method1154(class75 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 561) {
            return;
        }
        field2798++;
        if (arg3 == 1) {
            this.field2790 = arg0.method559(arg1 ^ 0xFFFFFDCE);
            this.method1153(255, this.field2790);
        } else if (arg3 == 2) {
            this.field2794 = arg0.method545((byte) 51);
            if (this.field2794 == 65535) {
                this.field2794 = -1;
                return;
            }
            return;
        } else if (arg3 == 3) {
            arg0.method545((byte) 104);
            return;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILvd;)V")
    public static final void method1155(int arg0, int arg1, class141 arg2) {
        if (class157.field2803 < arg2.field2576) {
            class220.method1528(false, arg2);
        } else if (arg2.field2587 >= class157.field2803) {
            class248.method1684(true, arg2);
        } else {
            class271.method1826(arg2, (byte) -128);
        }
        field2793++;
        if (arg2.field2585 < 128 || arg2.field2546 < 128 || arg2.field2585 >= 13184 || arg2.field2546 >= 13184) {
            arg2.field2575 = -1;
            arg2.field2543 = -1;
            arg2.field2576 = 0;
            arg2.field2587 = 0;
            arg2.field2585 = arg2.field2523[0] * 128 + (arg2.method642(103) * 64);
            arg2.field2546 = arg2.field2517[0] * 128 + arg2.method642(109) * 64;
            arg2.method1066(-50);
        }
        if (class277.field4824 == arg2 && (arg2.field2585 < 1536 || arg2.field2546 < 1536 || arg2.field2585 >= 11776 || arg2.field2546 >= 11776)) {
            arg2.field2576 = 0;
            arg2.field2543 = -1;
            arg2.field2587 = 0;
            arg2.field2575 = -1;
            arg2.field2585 = arg2.field2523[0] * 128 + (arg2.method642(117) * 64);
            arg2.field2546 = arg2.field2517[0] * 128 + arg2.method642(56) * 64;
            arg2.method1066(125);
        }
        class145.method1080((byte) 120, arg2);
        if (arg0 < -29) {
            class231.method1567(-59, arg2);
        }
    }
}
