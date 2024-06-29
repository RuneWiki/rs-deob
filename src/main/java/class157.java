import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class157 extends class148 {

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "[J")
    private long[] field2719 = new long[10];

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    private int field2717 = 0;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    private int field2711 = 1;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    private int field2720 = 256;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "J")
    private long field2722 = class104.method785(-1);

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "[S")
    public static short[] field2713 = new short[] { 48, 7, 11, 24, 50, 10, 49, 6 };

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lij;")
    public static class50 field2712 = class78.method578(123, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lij;")
    public static class50 field2715 = class78.method578(127, "logo");

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    private int field2714;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static void method1093(boolean arg0) {
        field2715 = null;
        if (arg0) {
            field2712 = null;
        }
        field2713 = null;
        field2712 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
    public static final int method1094(int arg0, int arg1) {
        field2709++;
        return ~arg1 == arg0 ? -1 : class121.method880(arg1, (byte) -126);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public final void method1033(int arg0) {
        field2723++;
        for (int var2 = arg0; var2 < 10; var2++) {
            this.field2719[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I")
    public static final int method1095(int arg0) {
        if (arg0 == 0) {
            field2721++;
            return class63.field1215;
        } else {
            return -13;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
    public final int method1032(int arg0, int arg1, int arg2) {
        field2716++;
        int var4 = this.field2720;
        int var5 = this.field2711;
        this.field2711 = 1;
        this.field2720 = 300;
        this.field2722 = class104.method785(arg2 + 17243);
        if (this.field2719[this.field2714] == 0L) {
            this.field2711 = var5;
            this.field2720 = var4;
        } else if (this.field2719[this.field2714] < this.field2722) {
            this.field2720 = (int) ((long) (arg1 * 2560) / (this.field2722 - this.field2719[this.field2714]));
        }
        if (this.field2720 < 25) {
            this.field2720 = 25;
        }
        if (this.field2720 > 256) {
            this.field2720 = 256;
            this.field2711 = (int) ((long) arg1 - ((this.field2722 - this.field2719[this.field2714]) / 10L));
        }
        if (arg1 < this.field2711) {
            this.field2711 = arg1;
        }
        if (arg2 != -17244) {
            this.field2717 = -76;
        }
        this.field2719[this.field2714] = this.field2722;
        this.field2714 = (this.field2714 + 1) % 10;
        if (this.field2711 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2719[var6] != 0L) {
                    this.field2719[var6] -= -((long) this.field2711);
                }
            }
        }
        if (arg0 > this.field2711) {
            this.field2711 = arg0;
        }
        class162.method1137(72, (long) this.field2711);
        int var7 = 0;
        while (this.field2717 < 256) {
            var7++;
            this.field2717 += this.field2720;
        }
        this.field2717 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILda;)V")
    public static final void method1096(int arg0, class22 arg1) {
        field2718++;
        class133.field2331 = arg1;
        if (arg0 != 256) {
            method1096(18, (class22) null);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lwd;I)Lhc;")
    public static final class249 method1097(class217 arg0, int arg1) {
        if (arg1 > -36) {
            field2712 = null;
        }
        field2710++;
        return new class249(arg0.method1438(-110), arg0.method1438(-117), arg0.method1438(21), arg0.method1438(-125), arg0.method1447(122), arg0.method1487(255));
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class157() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2719[var1] = this.field2722;
        }
    }
}
