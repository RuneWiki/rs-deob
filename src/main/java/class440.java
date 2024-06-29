import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class440 {

    @OriginalMember(owner = "client!os", name = "m", descriptor = "Lnga;")
    private class510 field6144 = new class510(128);

    @OriginalMember(owner = "client!os", name = "p", descriptor = "Lnga;")
    public class510 field6147 = new class510(64);

    @OriginalMember(owner = "client!os", name = "b", descriptor = "Leq;")
    private class209 field6133;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "Leq;")
    public class209 field6135;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "Lnt;")
    public static class220 field6132 = new class220();

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field6138 = 0;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "[F")
    public static float[] field6141 = new float[4];

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    public static int field6145 = -1;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
    public final void method2640(boolean arg0) {
        class510 var2 = this.field6144;
        synchronized (this.field6144) {
            this.field6144.method3050(arg0);
        }
        field6136++;
        class510 var3 = this.field6147;
        synchronized (this.field6147) {
            this.field6147.method3050(false);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Lfd;")
    public final class524 method2641(int arg0, int arg1) {
        field6139++;
        class510 var3 = this.field6144;
        class524 var4;
        synchronized (this.field6144) {
            var4 = (class524) this.field6144.method3054((byte) -111, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field6133;
        byte[] var6;
        synchronized (this.field6133) {
            var6 = this.field6133.method1453(arg0, -127, 36);
        }
        class524 var7 = new class524();
        var7.field7422 = this;
        var7.field7447 = arg0;
        if (arg1 < 92) {
            field6138 = -88;
        }
        if (var6 != null) {
            var7.method3110(new class35(var6), -115);
        }
        var7.method3109(16);
        class510 var8 = this.field6144;
        synchronized (this.field6144) {
            this.field6144.method3047(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIB)V")
    public final void method2642(int arg0, int arg1, byte arg2) {
        this.field6144 = new class510(arg1);
        field6146++;
        if (arg2 != -50) {
            this.method2642(-40, 78, (byte) 91);
        }
        this.field6147 = new class510(arg0);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)S")
    public static final short method2643(byte arg0, int arg1) {
        field6134++;
        int var2 = (arg1 & 0xFC21) >> 10;
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        if (arg0 != -101) {
            field6142 = -67;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(II)V")
    public final void method2644(int arg0, int arg1) {
        if (arg1 != 1171111178) {
            return;
        }
        field6140++;
        class510 var3 = this.field6144;
        synchronized (this.field6144) {
            this.field6144.method3049(arg0, (byte) 127);
        }
        class510 var4 = this.field6147;
        synchronized (this.field6147) {
            this.field6147.method3049(arg0, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public final void method2645(int arg0) {
        if (arg0 != 2080593256) {
            this.method2641(-7, 108);
        }
        class510 var2 = this.field6144;
        synchronized (this.field6144) {
            this.field6144.method3048(false);
        }
        field6137++;
        class510 var3 = this.field6147;
        synchronized (this.field6147) {
            this.field6147.method3048(false);
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(Z)V")
    public static void method2646(boolean arg0) {
        if (!arg0) {
            field6141 = null;
            field6132 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lcw;ILeq;Leq;)V")
    public class440(class179 arg0, int arg1, class209 arg2, class209 arg3) {
        this.field6133 = arg2;
        this.field6135 = arg3;
        this.field6133.method1477(0, 36);
    }
}
