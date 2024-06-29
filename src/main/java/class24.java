import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class24 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    private int field338 = 0;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public int field349 = -1;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public int field351 = 128;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Z")
    public boolean field348 = true;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Lna;")
    private static class26 field352 = class69.method505("Loaded input handler", (byte) -125);

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Lna;")
    public static class26 field346 = field352;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Lsm;")
    public static class157 field350 = new class157();

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Lve;")
    public static class266 field347;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V", line = 13)
    private final void method148(int arg0, byte arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field342++;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        if (var5 < var3) {
            var7 = var5;
        }
        if (var9 < var7) {
            var7 = var9;
        }
        double var11 = var3;
        int var13 = 77 % ((arg1 - 21) / 57);
        double var14 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var9 > var11) {
            var11 = var9;
        }
        double var16 = 0.0D;
        double var18 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var18 < 0.5D) {
                var16 = (var11 - var7) / (var7 + var11);
            }
            if (var3 == var11) {
                var14 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var14 = (var9 - var3) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var14 = (var3 - var5) / (var11 - var7) + 4.0D;
            }
            if (var18 >= 0.5D) {
                var16 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        if (var18 > 0.5D) {
            this.field357 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field357 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field357 < 1) {
            this.field357 = 1;
        }
        this.field340 = (int) (var16 * 256.0D);
        this.field354 = (int) (var18 * 256.0D);
        if (this.field354 < 0) {
            this.field354 = 0;
        } else if (this.field354 > 255) {
            this.field354 = 255;
        }
        double var20 = var14 / 6.0D;
        this.field345 = (int) ((double) this.field357 * var20);
        if (this.field340 < 0) {
            this.field340 = 0;
        } else if (this.field340 > 255) {
            this.field340 = 255;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILwa;I)V", line = 100)
    public final void method149(int arg0, class82 arg1, int arg2) {
        field343++;
        while (true) {
            int var4 = arg1.method642((byte) -43);
            if (var4 == 0) {
                if (arg2 != 255) {
                    field344 = -8;
                }
                return;
            }
            this.method152((byte) -52, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILna;)I", line = 133)
    public static final int method150(int arg0, class26 arg1) {
        field341++;
        if (class298.field5133 == null || arg1.method171(arg0 ^ 0xFFFFFF95) == 0) {
            return -1;
        }
        for (int var2 = arg0; var2 < class298.field5133.field165; var2++) {
            if (class298.field5133.field166[var2].method191(class20.field270, true, class103.field1649).method193((byte) -32, arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILjava/util/Random;)I", line = 165)
    public static final int method151(byte arg0, int arg1, Random arg2) {
        field356++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class319.method2213((byte) -115, arg1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            int var5 = -101 % ((arg0 + 52) / 33);
            return class142.method944(var4, arg1, -58);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILwa;I)V", line = 194)
    private final void method152(byte arg0, int arg1, class82 arg2, int arg3) {
        if (arg1 == 1) {
            this.field338 = arg2.method633((byte) 93);
            this.method148(this.field338, (byte) 81);
        } else if (arg1 == 2) {
            this.field349 = arg2.method576(1);
            if (this.field349 == 65535) {
                this.field349 = -1;
            }
        } else if (arg1 == 3) {
            this.field351 = arg2.method576(1);
        } else if (arg1 == 4) {
            this.field348 = false;
        }
        if (arg0 != -52) {
            field344 = -121;
        }
        field355++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILna;I)V", line = 254)
    public static final void method153(int arg0, class26 arg1, int arg2) {
        class164.field2542++;
        class114.field1789.method1431(arg0 - 255, 188);
        field337++;
        class114.field1789.method629(arg2, arg0 - 13326);
        if (arg0 == 255) {
            class114.field1789.method579(arg1.method209(-126), -2037491440);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 280)
    public static void method154(byte arg0) {
        field352 = null;
        field346 = null;
        int var1 = 86 % ((49 - arg0) / 48);
        field347 = null;
        field350 = null;
    }
}
