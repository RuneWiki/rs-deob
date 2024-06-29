import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class400 {

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public int field5550 = 0;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public int field5553 = 0;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "Z")
    private boolean field5559 = false;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "Lfc;")
    public static class235 field5554 = new class235(109, 0);

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public int field5551;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public int field5552;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public int field5555;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    private int field5556;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public int field5557;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    public int field5558;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    public int field5561;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public int field5562;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
    public int field5564;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
    public int field5565;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "J")
    public long field5563;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjr;B)V", line = 3)
    private final void method2271(int arg0, class96 arg1, byte arg2) {
        int var4 = -7 % ((-arg2 - 30) / 60);
        if (arg0 == 1) {
            this.field5556 = arg1.method743((byte) -25);
        } else if (arg0 == 2) {
            arg1.method718(125);
        } else if (arg0 == 3) {
            this.field5562 = arg1.method714(false);
            this.field5558 = arg1.method714(false);
            this.field5551 = arg1.method714(false);
        } else if (arg0 == 4) {
            this.field5555 = arg1.method718(-89);
            this.field5552 = arg1.method714(false);
        } else if (arg0 == 6) {
            this.field5561 = arg1.method718(74);
        } else if (arg0 == 8) {
            this.field5550 = 1;
        } else if (arg0 == 9) {
            this.field5553 = 1;
        } else if (arg0 == 10) {
            this.field5559 = true;
        }
        field5567++;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lpj;B[ILpj;)V", line = 66)
    public static final void method2272(class132 arg0, byte arg1, int[] arg2, class132 arg3) {
        class164.field2497 = arg0;
        class32.field384 = arg3;
        if (arg2 != null) {
            class377.field5333 = arg2;
        }
        field5549++;
        if (arg1 != 114) {
            method2274((byte) -10);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V", line = 99)
    public final void method2273(byte arg0) {
        if (arg0 <= 98) {
            return;
        }
        field5560++;
        this.field5557 = class675.field9541[this.field5556 << 3];
        this.field5564 = (int) Math.sqrt((double) (this.field5551 * this.field5551 + (this.field5562 * this.field5562 + (this.field5558 * this.field5558))));
        if (this.field5552 == 0) {
            this.field5552 = 1;
        }
        if (this.field5555 == 0) {
            this.field5563 = 2147483647L;
        } else if (this.field5555 == 1) {
            this.field5563 = (this.field5564 * 8 / this.field5552);
            this.field5563 *= this.field5563;
        } else if (this.field5555 == 2) {
            this.field5563 = (this.field5564 * 8 / this.field5552);
        }
        if (this.field5559) {
            this.field5564 *= -1;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)V", line = 142)
    public static void method2274(byte arg0) {
        if (arg0 != -63) {
            method2274((byte) 46);
        }
        field5554 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjr;)V", line = 152)
    public final void method2275(int arg0, class96 arg1) {
        while (true) {
            int var3 = arg1.method718(121);
            if (var3 == 0) {
                if (arg0 != 0) {
                    return;
                }
                field5566++;
                return;
            }
            this.method2271(var3, arg1, (byte) 77);
        }
    }
}
