import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class404 {

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lfr;")
    private class231 field6138 = new class231(16);

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lqs;")
    private class496 field6132;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field6135 = 0;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "[I")
    public static int[] field6139 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)Lfm;")
    public final class188 method2501(boolean arg0, int arg1) {
        field6142++;
        if (!arg0) {
            this.field6132 = null;
        }
        class231 var3 = this.field6138;
        class188 var4;
        synchronized (this.field6138) {
            var4 = (class188) this.field6138.method1593((byte) -125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field6132;
        byte[] var6;
        synchronized (this.field6132) {
            var6 = this.field6132.method2926(arg1, -80, 30);
        }
        class188 var7 = new class188();
        if (var6 != null) {
            var7.method1273(new class23(var6), -1);
        }
        class231 var8 = this.field6138;
        synchronized (this.field6138) {
            this.field6138.method1595(var7, (long) arg1, (byte) 17);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)I")
    public static final int method2502(int arg0, boolean arg1) {
        if (arg1) {
            method2502(21, true);
        }
        field6131++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static final void method2503(byte arg0) {
        field6140++;
        if (class32.field515 == 6) {
            class165.method1132(false, false);
        } else if (class265.field4447 > 0) {
            class165.method1132(class302.field4849, false);
        } else {
            class91.field1515 = class463.field6886;
            class463.field6886 = null;
            if (arg0 > -113) {
                method2503((byte) -100);
            }
            class75.method540(-7, 12);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
    public final void method2504(boolean arg0) {
        class231 var2 = this.field6138;
        synchronized (this.field6138) {
            this.field6138.method1604(4);
            if (!arg0) {
                method2506(-64, -15);
            }
        }
        field6134++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method2505(int arg0) {
        int var1 = 62 % ((-arg0 - 23) / 52);
        field6139 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I")
    public static final int method2506(int arg0, int arg1) {
        field6137++;
        return arg1 == 32693 ? arg0 & 0xFF : -31;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public final void method2507(byte arg0) {
        field6141++;
        class231 var2 = this.field6138;
        synchronized (this.field6138) {
            if (arg0 != -62) {
                this.field6138 = null;
            }
            this.field6138.method1598(92);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
    public final void method2508(int arg0, byte arg1) {
        if (arg1 <= 91) {
            this.method2504(true);
        }
        class231 var3 = this.field6138;
        synchronized (this.field6138) {
            this.field6138.method1603((byte) -127, arg0);
        }
        field6136++;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lwv;ILqs;)V")
    public class404(class535 arg0, int arg1, class496 arg2) {
        this.field6132 = arg2;
        this.field6132.method2940(30, -10511);
    }
}
