import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class195 {

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "Luaa;")
    private class395 field2800 = new class395(64);

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public int field2805 = 0;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "Lgp;")
    private class561 field2797;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Lpp;")
    public static class464 field2799 = new class464(0, 0);

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "F")
    public static float field2801;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)V", line = 3)
    public final void method1283(int arg0, int arg1) {
        class395 var3 = this.field2800;
        synchronized (this.field2800) {
            this.field2800.method2397(arg0, (byte) -64);
        }
        field2798++;
        if (arg1 > -46) {
            field2799 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V", line = 27)
    public final void method1284(int arg0) {
        class395 var2 = this.field2800;
        synchronized (this.field2800) {
            this.field2800.method2404((byte) -88);
        }
        if (arg0 <= 30) {
            this.field2797 = null;
        }
        field2802++;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V", line = 41)
    public final void method1285(int arg0) {
        class395 var2 = this.field2800;
        synchronized (this.field2800) {
            this.field2800.method2406(52);
            if (arg0 < 106) {
                method1287((byte) 75);
            }
        }
        field2796++;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)Lsb;", line = 54)
    public final class278 method1286(int arg0, int arg1) {
        if (arg0 >= -84) {
            this.field2805 = 102;
        }
        field2803++;
        class395 var3 = this.field2800;
        class278 var4;
        synchronized (this.field2800) {
            var4 = (class278) this.field2800.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field2797;
        byte[] var6;
        synchronized (this.field2797) {
            var6 = this.field2797.method3175(arg1, (byte) -53, 4);
        }
        class278 var7 = new class278();
        var7.field4054 = this;
        var7.field4065 = arg1;
        if (var6 != null) {
            var7.method1793(new class268(var6), 14195);
        }
        var7.method1792((byte) -113);
        class395 var8 = this.field2800;
        synchronized (this.field2800) {
            this.field2800.method2408(var7, (long) arg1, -112);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V", line = 87)
    public static void method1287(byte arg0) {
        field2799 = null;
        if (arg0 != 38) {
            method1287((byte) -49);
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Ljc;ILgp;)V", line = 106)
    public class195(class584 arg0, int arg1, class561 arg2) {
        this.field2797 = arg2;
        this.field2804 = this.field2797.method3164(4, true);
    }
}
