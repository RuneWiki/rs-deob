import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class172 {

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "Lqr;")
    private class65 field2626 = new class65(256);

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "Lwu;")
    private class376 field2628;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field2634 = 0;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "Z")
    public static boolean field2632 = false;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "Lht;")
    public static class582 field2633 = new class582(2, 16);

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public final void method1212(int arg0) {
        class65 var2 = this.field2626;
        synchronized (this.field2626) {
            this.field2626.method558(0);
        }
        if (arg0 >= -19) {
            field2633 = null;
        }
        field2630++;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
    public final void method1213(int arg0) {
        class65 var2 = this.field2626;
        synchronized (this.field2626) {
            this.field2626.method561((byte) -78);
        }
        if (arg0 != 16) {
            this.method1216(76, -94);
        }
        field2629++;
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
    public static void method1214(int arg0) {
        if (arg0 < 84) {
            field2633 = null;
        }
        field2633 = null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)Lgia;")
    public final class273 method1215(int arg0, byte arg1) {
        field2627++;
        class65 var3 = this.field2626;
        class273 var5;
        synchronized (this.field2626) {
            int var4 = -70 % ((20 - arg1) / 33);
            var5 = (class273) this.field2626.method552(4, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class376 var6 = this.field2628;
        byte[] var7;
        synchronized (this.field2628) {
            var7 = this.field2628.method2218((byte) 116, 26, arg0);
        }
        class273 var8 = new class273();
        if (var7 != null) {
            var8.method1636(-2, new class677(var7));
        }
        class65 var9 = this.field2626;
        synchronized (this.field2626) {
            this.field2626.method556((byte) 0, (long) arg0, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
    public final void method1216(int arg0, int arg1) {
        if (arg0 != 26) {
            return;
        }
        field2625++;
        class65 var3 = this.field2626;
        synchronized (this.field2626) {
            this.field2626.method553(arg1, -15782);
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lms;ILwu;)V")
    public class172(class763 arg0, int arg1, class376 arg2) {
        this.field2628 = arg2;
        this.field2628.method2195(26, 0);
    }
}
