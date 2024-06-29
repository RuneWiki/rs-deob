import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class692 {

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "Luf;")
    private class380 field9750 = new class380(64);

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "Lga;")
    private class332 field9753;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "Lga;")
    public class332 field9758;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "Ltt;")
    public static class338 field9754 = new class338(19, 7);

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "[I")
    public static int[] field9756 = new int[25];

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "Ltca;")
    public static class141 field9759 = new class141(2, 2);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field9751;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public static int field9755;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "[Lir;")
    public static class27[] field9757;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    public final void method3900(byte arg0) {
        class380 var2 = this.field9750;
        synchronized (this.field9750) {
            if (arg0 >= -42) {
                return;
            }
            this.field9750.method2168((byte) -117);
        }
        field9755++;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
    public final void method3901(int arg0, int arg1) {
        field9748++;
        if (arg0 != 3) {
            this.field9758 = null;
        }
        class380 var3 = this.field9750;
        synchronized (this.field9750) {
            this.field9750.method2179(false, arg1);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)Lvq;")
    public final class471 method3902(int arg0, boolean arg1) {
        field9751++;
        class380 var3 = this.field9750;
        class471 var4;
        synchronized (this.field9750) {
            var4 = (class471) this.field9750.method2176(-128, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field9753;
        byte[] var6;
        synchronized (this.field9753) {
            var6 = this.field9753.method1938(arg0, 3, -17);
        }
        class471 var7 = new class471();
        if (!arg1) {
            method3904(-48);
        }
        var7.field6565 = this;
        if (var6 != null) {
            var7.method2722(new class157(var6), false);
        }
        class380 var8 = this.field9750;
        synchronized (this.field9750) {
            this.field9750.method2174(var7, (long) arg0, (byte) 122);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Z")
    public static final boolean method3903(int arg0, int arg1, int arg2) {
        field9749++;
        if (arg0 != -1) {
            method3903(51, 87, -47);
        }
        return ((arg1 & 0x2000) != 0 | class299.method1764((byte) -126, arg2, arg1) | class209.method1329(arg2, (byte) 82, arg1)) & class615.method3403(false, arg2, arg1);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public static void method3904(int arg0) {
        field9754 = null;
        field9757 = null;
        field9759 = null;
        if (arg0 != 2) {
            field9754 = null;
        }
        field9756 = null;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
    public final void method3905(int arg0) {
        if (arg0 != 64) {
            return;
        }
        class380 var2 = this.field9750;
        synchronized (this.field9750) {
            this.field9750.method2172(-15112);
        }
        field9752++;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lnq;ILga;Lga;)V")
    public class692(class650 arg0, int arg1, class332 arg2, class332 arg3) {
        this.field9753 = arg2;
        this.field9758 = arg3;
        this.field9753.method1939(0, 3);
    }
}
