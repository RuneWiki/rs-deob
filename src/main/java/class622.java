import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class622 {

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Lfc;")
    private class262 field8712 = new class262(64);

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Lfc;")
    public class262 field8714 = new class262(60);

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lni;")
    public class522 field8713;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Lni;")
    private class522 field8705;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field8708 = 0;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "[I")
    public static int[] field8715 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field8707;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field8709;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field8710;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public int field8717;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "[[S")
    public static short[][] field8711;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public final void method3516(int arg0) {
        field8706++;
        class262 var2 = this.field8712;
        synchronized (this.field8712) {
            this.field8712.method1575((byte) -126);
        }
        class262 var3 = this.field8714;
        synchronized (this.field8714) {
            this.field8714.method1575((byte) 23);
        }
        if (arg0 != 4) {
            this.field8717 = -6;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
    public final void method3517(int arg0, int arg1) {
        this.field8717 = arg0;
        field8716++;
        class262 var3 = this.field8714;
        synchronized (this.field8714) {
            if (arg1 != 0) {
                this.field8705 = null;
            }
            this.field8714.method1563(49);
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
    public static void method3518(int arg0) {
        field8715 = null;
        field8711 = null;
        if (arg0 != -19357) {
            method3519(-126, -89, -59, null);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIILsba;)V")
    public static final void method3519(int arg0, int arg1, int arg2, class218 arg3) {
        field8710++;
        class487 var4 = arg3.method1236(class21.field142, arg0 - 3999);
        if (var4 == null || arg0 != 4096) {
            return;
        }
        class21.field142.method426(arg1, arg2, arg1 + arg3.field2781, arg3.field2718 + arg2);
        if (class168.field2101 < 3) {
            class246.field3205.method3861((float) arg3.field2781 / 2.0F + (float) arg1, (float) arg3.field2718 / 2.0F + (float) arg2, 4096, ((int) (-class183.field2237) & 0x3FFF) << 2, var4, arg1, arg2);
        } else {
            class21.field142.method365(-16777216, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILsba;II)V")
    public static final void method3520(int arg0, class218 arg1, int arg2, int arg3) {
        field8704++;
        class277.field3702 = arg2;
        if (arg3 == 60) {
            class233.field3023 = arg0;
            class596.field8311 = arg1;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)Lgp;")
    public final class49 method3521(int arg0, int arg1) {
        field8709++;
        class262 var3 = this.field8712;
        class49 var4;
        synchronized (this.field8712) {
            var4 = (class49) this.field8712.method1571(-123, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field8705;
        byte[] var6;
        synchronized (this.field8705) {
            var6 = this.field8705.method2885(class233.method1387(arg0 ^ 0xFFFFC578, arg1), class28.method109((byte) 117, arg1), false);
            if (arg0 != 2) {
                this.field8717 = 42;
            }
        }
        class49 var7 = new class49();
        var7.field511 = this;
        var7.field518 = arg1;
        if (var6 != null) {
            var7.method289(arg0 - 2, new class611(var6));
        }
        class262 var8 = this.field8712;
        synchronized (this.field8712) {
            this.field8712.method1574((long) arg1, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public final void method3522(byte arg0) {
        class262 var2 = this.field8712;
        synchronized (this.field8712) {
            this.field8712.method1563(46);
        }
        field8703++;
        if (arg0 == 0) {
            class262 var3 = this.field8714;
            synchronized (this.field8714) {
                this.field8714.method1563(89);
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BI)V")
    public final void method3523(byte arg0, int arg1) {
        field8707++;
        class262 var3 = this.field8712;
        synchronized (this.field8712) {
            this.field8712.method1569((byte) 62, arg1);
            if (arg0 != -53) {
                method3520(-6, null, -120, 48);
            }
        }
        class262 var4 = this.field8714;
        synchronized (this.field8714) {
            this.field8714.method1569((byte) 62, arg1);
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lrga;ILni;Lni;)V")
    public class622(class242 arg0, int arg1, class522 arg2, class522 arg3) {
        this.field8713 = arg3;
        this.field8705 = arg2;
        int var5 = this.field8705.method2892((byte) -11) - 1;
        this.field8705.method2901(0, var5);
    }
}
