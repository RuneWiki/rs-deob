import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class611 {

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "Laf;")
    private class39 field8605 = new class39(128);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "Lae;")
    private class283 field8602;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "Ljn;")
    public static class134 field8604 = new class134(117, 7);

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "[I")
    public static int[] field8607;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3536(boolean arg0, int arg1, int arg2) {
        field8603++;
        if (arg0) {
            return true;
        } else if (arg2 >= 1000 && arg1 < 1000) {
            return true;
        } else if (arg2 >= 1000 || arg1 >= 1000) {
            return arg2 >= 1000 && arg1 >= 1000;
        } else if (class50.method420(arg1, (byte) 41)) {
            return true;
        } else {
            return !class50.method420(arg2, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V")
    public static void method3537(int arg0) {
        field8604 = null;
        field8607 = null;
        if (arg0 != 7) {
            field8607 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)Loha;")
    public final class559 method3538(int arg0, int arg1) {
        field8606++;
        class39 var3 = this.field8605;
        class559 var4;
        synchronized (this.field8605) {
            var4 = (class559) this.field8605.method312(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field8602.method1849(class357.method2237(127, arg1), (byte) -87, class494.method2910(512, arg1));
        class559 var6 = new class559();
        if (var5 != null) {
            var6.method3299(new class511(var5), (byte) 45);
        }
        if (arg0 > -107) {
            this.field8605 = null;
        }
        class39 var7 = this.field8605;
        synchronized (this.field8605) {
            this.field8605.method305(var6, (long) arg1, 18320);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Ljk;ILae;)V")
    public class611(class788 arg0, int arg1, class283 arg2) {
        this.field8602 = arg2;
        if (this.field8602 != null) {
            int var4 = this.field8602.method1866((byte) 94) - 1;
            this.field8602.method1867(var4, (byte) 49);
        }
    }
}
