import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class299 {

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "Lpja;")
    private class43 field4119 = new class43(64);

    @OriginalMember(owner = "client!wha", name = "i", descriptor = "Lgj;")
    private class662 field4118;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "Lfja;")
    public static class783 field4110 = new class783(14, 3);

    @OriginalMember(owner = "client!wha", name = "h", descriptor = "Z")
    public static boolean field4117 = false;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!wha", name = "g", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
    public final void method1921(int arg0) {
        if (arg0 != 3) {
            return;
        }
        class43 var2 = this.field4119;
        synchronized (this.field4119) {
            this.field4119.method273(17);
        }
        field4112++;
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)V")
    public static void method1922(int arg0) {
        field4110 = null;
        if (arg0 < 44) {
            method1922(64);
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(II)V")
    public final void method1923(int arg0, int arg1) {
        field4111++;
        class43 var3 = this.field4119;
        synchronized (this.field4119) {
            this.field4119.method265(arg0, arg1 - 191);
            if (arg1 != 64) {
                this.method1924(-10);
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)V")
    public final void method1924(int arg0) {
        field4115++;
        class43 var2 = this.field4119;
        synchronized (this.field4119) {
            this.field4119.method272(20);
        }
        if (arg0 != 1031) {
            field4116 = -29;
        }
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(II)Lsda;")
    public final class273 method1925(int arg0, int arg1) {
        field4113++;
        class43 var3 = this.field4119;
        class273 var4;
        synchronized (this.field4119) {
            var4 = (class273) this.field4119.method266((byte) -100, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field4118;
        byte[] var6;
        synchronized (this.field4118) {
            var6 = this.field4118.method3732(class565.method3265(arg1, -19952), 8906, class467.method2688(-1670, arg1));
        }
        class273 var7 = new class273();
        if (var6 != null) {
            var7.method1763(-1, new class93(var6));
        }
        class43 var8 = this.field4119;
        synchronized (this.field4119) {
            this.field4119.method270(var7, (long) arg1, -122);
            if (arg0 != 3) {
                field4117 = true;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "(II)V")
    public final void method1926(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field4119 = null;
        }
        class43 var3 = this.field4119;
        synchronized (this.field4119) {
            this.field4119.method273(-70);
            this.field4119 = new class43(arg0);
        }
        field4114++;
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lim;ILgj;)V")
    public class299(class598 arg0, int arg1, class662 arg2) {
        this.field4118 = arg2;
        if (this.field4118 != null) {
            int var4 = this.field4118.method3723(5) - 1;
            this.field4118.method3730((byte) 46, var4);
        }
    }
}
