import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class544 {

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lof;")
    private class620 field7824 = new class620(64);

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Loh;")
    public class404 field7829;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Loh;")
    private class404 field7821;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field7822 = 0;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "[I")
    public static int[] field7831 = new int[1];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Loh;")
    public static class404 field7827;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 5)
    public final void method3191(int arg0) {
        field7826++;
        if (arg0 != -257) {
            field7822 = -53;
        }
        class620 var2 = this.field7824;
        synchronized (this.field7824) {
            this.field7824.method3541(-647);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V", line = 19)
    public final void method3192(int arg0, int arg1) {
        class620 var3 = this.field7824;
        synchronized (this.field7824) {
            this.field7824.method3539((byte) -90, arg1);
        }
        field7825++;
        if (arg0 <= 5) {
            this.field7824 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 34)
    public static void method3193(boolean arg0) {
        if (arg0) {
            field7822 = 121;
        }
        field7831 = null;
        field7827 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 48)
    public final void method3194(int arg0) {
        class620 var2 = this.field7824;
        synchronized (this.field7824) {
            this.field7824.method3549(arg0 ^ arg0);
        }
        field7820++;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Lmv;", line = 62)
    public final class373 method3195(int arg0, int arg1) {
        field7823++;
        class620 var3 = this.field7824;
        class373 var4;
        synchronized (this.field7824) {
            var4 = (class373) this.field7824.method3538((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field7821;
        byte[] var6;
        synchronized (this.field7821) {
            var6 = this.field7821.method2481(arg0, arg1, (byte) 114);
        }
        class373 var7 = new class373();
        var7.field4760 = this;
        if (var6 != null) {
            var7.method2167(-1, new class244(var6));
        }
        class620 var8 = this.field7824;
        synchronized (this.field7824) {
            this.field7824.method3537(94, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)[Lsn;", line = 91)
    public static final class629[] method3196(int arg0) {
        field7830++;
        return arg0 == 9571 ? new class629[] { class342.field4425, class58.field592, class672.field9534, class465.field6661, class159.field1757, class109.field1159 } : null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)I", line = 106)
    public static final int method3197(int arg0, byte arg1) {
        field7828++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg1 >= -77) {
            return -80;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lnb;ILoh;Loh;)V", line = 159)
    public class544(class301 arg0, int arg1, class404 arg2, class404 arg3) {
        this.field7829 = arg3;
        this.field7821 = arg2;
        this.field7821.method2482(0, 3);
    }
}
