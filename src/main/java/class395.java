import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class395 {

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public int field5460 = 0;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "Z")
    private boolean field5463 = false;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public int field5446 = 0;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "[[B")
    public static byte[][] field5447 = new byte[250][];

    @OriginalMember(owner = "client!om", name = "h", descriptor = "Lvl;")
    public static class15 field5452 = new class15(23, 3);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public int field5445;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public int field5449;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public int field5450;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public int field5453;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public int field5454;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    private int field5455;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public int field5456;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    public int field5461;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public int field5462;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public int field5464;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "J")
    public long field5458;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public final void method2387(int arg0) {
        field5451++;
        this.field5461 = class191.field2936[this.field5455 << 3];
        long var2 = (long) this.field5464;
        long var4 = (long) this.field5449;
        long var6 = (long) this.field5453;
        if (arg0 > -38) {
            this.field5450 = 84;
        }
        this.field5454 = (int) Math.sqrt((double) (var6 * var6 + var2 * var2 + var4 * var4));
        if (this.field5445 == 0) {
            this.field5445 = 1;
        }
        if (this.field5462 == 0) {
            this.field5458 = 2147483647L;
        } else if (this.field5462 == 1) {
            this.field5458 = (this.field5454 * 8 / this.field5445);
            this.field5458 *= this.field5458;
        } else if (this.field5462 == 2) {
            this.field5458 = (this.field5454 * 8 / this.field5445);
        }
        if (this.field5463) {
            this.field5454 *= -1;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILfca;I)V")
    private final void method2388(int arg0, class93 arg1, int arg2) {
        if (arg2 != 2) {
            return;
        }
        field5459++;
        if (arg0 == 1) {
            this.field5455 = arg1.method763(arg2 ^ 0x56);
        } else if (arg0 == 2) {
            arg1.method793((byte) 118);
        } else if (arg0 == 3) {
            this.field5464 = arg1.method773(3);
            this.field5449 = arg1.method773(3);
            this.field5453 = arg1.method773(3);
        } else if (arg0 == 4) {
            this.field5462 = arg1.method793((byte) 13);
            this.field5445 = arg1.method773(3);
            return;
        } else if (arg0 == 6) {
            this.field5450 = arg1.method793((byte) 20);
            return;
        } else if (arg0 == 8) {
            this.field5460 = 1;
            return;
        } else if (arg0 == 9) {
            this.field5446 = 1;
            return;
        } else if (arg0 == 10) {
            this.field5463 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILfl;Z)V")
    public static final void method2389(int arg0, int arg1, class771 arg2, boolean arg3) {
        field5457++;
        int[] var4 = new int[4];
        class275.method1772(var4, 0, var4.length, arg0);
        class486.method2777(arg2, arg1, var4, (byte) -119);
        if (arg3) {
            field5452 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public static void method2390(int arg0) {
        field5447 = null;
        int var1 = -124 / ((arg0 - 47) / 51);
        field5452 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILfca;)V")
    public final void method2391(int arg0, class93 arg1) {
        if (arg0 != 19974) {
            this.field5453 = 59;
        }
        field5448++;
        while (true) {
            int var3 = arg1.method793((byte) 123);
            if (var3 == 0) {
                return;
            }
            this.method2388(var3, arg1, 2);
        }
    }
}
