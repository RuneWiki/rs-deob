import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class231 {

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lfc;")
    private class262 field2970 = new class262(64);

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lfc;")
    public class262 field2978 = new class262(64);

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Lni;")
    private class522 field2974;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Lni;")
    public class522 field2972;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Llga;")
    public static class712 field2969 = new class712(56, 4);

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Z")
    public static boolean field2977 = false;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lea;")
    public static class547 field2975 = new class547(71, 6);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)I", line = 4)
    public static final int method1364(boolean arg0) {
        if (arg0) {
            return -46;
        } else {
            field2967++;
            return class392.field5553 == 1 ? class99.field1312 : 0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Lan;", line = 19)
    public final class23 method1365(int arg0, byte arg1) {
        field2966++;
        class262 var3 = this.field2970;
        class23 var4;
        synchronized (this.field2970) {
            var4 = (class23) this.field2970.method1571(-121, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = 64 % ((35 - arg1) / 43);
        class522 var6 = this.field2974;
        byte[] var7;
        synchronized (this.field2974) {
            var7 = this.field2974.method2885(arg0, 34, false);
        }
        class23 var8 = new class23();
        var8.field175 = this;
        if (var7 != null) {
            var8.method91(new class611(var7), false);
        }
        class262 var9 = this.field2970;
        synchronized (this.field2970) {
            this.field2970.method1574((long) arg0, var8, (byte) -80);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V", line = 50)
    public final void method1366(int arg0, int arg1) {
        class262 var3 = this.field2970;
        synchronized (this.field2970) {
            this.field2970.method1569((byte) 62, arg1);
            if (arg0 != 56) {
                this.method1367(-12);
            }
        }
        field2973++;
        class262 var4 = this.field2978;
        synchronized (this.field2978) {
            this.field2978.method1569((byte) 62, arg1);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 69)
    public final void method1367(int arg0) {
        class262 var2 = this.field2970;
        synchronized (this.field2970) {
            this.field2970.method1575((byte) 36);
        }
        field2971++;
        class262 var3 = this.field2978;
        synchronized (this.field2978) {
            if (arg0 != 10673) {
                this.method1370(65, -107, -65);
            }
            this.field2978.method1575((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 86)
    public static void method1368(byte arg0) {
        field2975 = null;
        field2969 = null;
        if (arg0 < 59) {
            field2977 = true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 103)
    public final void method1369(int arg0) {
        class262 var2 = this.field2970;
        synchronized (this.field2970) {
            this.field2970.method1563(21);
        }
        field2976++;
        class262 var3 = this.field2978;
        synchronized (this.field2978) {
            this.field2978.method1563(108);
        }
        if (arg0 != 34) {
            this.field2978 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V", line = 122)
    public final void method1370(int arg0, int arg1, int arg2) {
        field2968++;
        this.field2970 = new class262(arg1);
        if (arg0 < 107) {
            this.method1366(37, 14);
        }
        this.field2978 = new class262(arg2);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lrga;ILni;Lni;)V", line = 158)
    public class231(class242 arg0, int arg1, class522 arg2, class522 arg3) {
        this.field2974 = arg2;
        this.field2972 = arg3;
        this.field2974.method2901(0, 34);
    }
}
