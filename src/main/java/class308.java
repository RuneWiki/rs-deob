import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class308 {

    @OriginalMember(owner = "client!us", name = "c", descriptor = "Ljn;")
    private class117 field4278 = new class117(128);

    @OriginalMember(owner = "client!us", name = "e", descriptor = "Lvo;")
    private class345 field4280;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "Z")
    public static boolean field4277 = false;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4283 = "";

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    public static int field4282 = 500;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V", line = 9)
    public final void method1865(byte arg0) {
        class117 var2 = this.field4278;
        synchronized (this.field4278) {
            this.field4278.method936(-73);
        }
        if (arg0 != -73) {
            this.method1868(110, 1);
        }
        field4284++;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)V", line = 22)
    public final void method1866(int arg0, int arg1) {
        class117 var3 = this.field4278;
        synchronized (this.field4278) {
            if (arg0 != 128) {
                return;
            }
            this.field4278.method939(28093, arg1);
        }
        field4281++;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 36)
    public static void method1867(int arg0) {
        if (arg0 != 1) {
            field4277 = false;
        }
        field4283 = null;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(II)Lb;", line = 50)
    public final class177 method1868(int arg0, int arg1) {
        field4276++;
        class117 var3 = this.field4278;
        class177 var4;
        synchronized (this.field4278) {
            var4 = (class177) this.field4278.method941((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field4280;
        byte[] var6;
        synchronized (this.field4280) {
            var6 = this.field4280.method2081(-26, arg0, arg1);
        }
        class177 var7 = new class177();
        if (var6 != null) {
            var7.method1291(new class465(var6), true);
        }
        class117 var8 = this.field4278;
        synchronized (this.field4278) {
            this.field4278.method949((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lgn;ILvo;)V", line = 100)
    public class308(class529 arg0, int arg1, class345 arg2) {
        this.field4280 = arg2;
        this.field4280.method2098(0, 1);
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V", line = 86)
    public final void method1869(byte arg0) {
        class117 var2 = this.field4278;
        synchronized (this.field4278) {
            if (arg0 != 117) {
                return;
            }
            this.field4278.method950((byte) 6);
        }
        field4285++;
    }
}
