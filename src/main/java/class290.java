import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class290 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Lmf;")
    private class382 field4305 = new class382(64);

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lpu;")
    public class522 field4307;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Lpu;")
    private class522 field4304;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "F")
    public static float field4303 = 0.0F;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "[I")
    public static int[] field4301 = new int[1];

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
    public final void method1850(int arg0, int arg1) {
        if (arg0 >= -54) {
            return;
        }
        field4306++;
        class382 var3 = this.field4305;
        synchronized (this.field4305) {
            this.field4305.method2290(false, arg1);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public final void method1851(int arg0) {
        field4302++;
        class382 var2 = this.field4305;
        synchronized (this.field4305) {
            this.field4305.method2285((byte) -116);
            if (arg0 != -10159) {
                this.method1850(113, -5);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)Ljn;")
    public final class669 method1852(int arg0, int arg1) {
        field4300++;
        class382 var3 = this.field4305;
        class669 var4;
        synchronized (this.field4305) {
            var4 = (class669) this.field4305.method2287(1, (long) arg0);
        }
        if (arg1 != 5823) {
            this.method1854((byte) 2);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field4304;
        byte[] var6;
        synchronized (this.field4304) {
            var6 = this.field4304.method3007(3, arg0, 5);
        }
        class669 var7 = new class669();
        var7.field9462 = this;
        if (var6 != null) {
            var7.method3706(10083, new class695(var6));
        }
        class382 var8 = this.field4305;
        synchronized (this.field4305) {
            this.field4305.method2291(var7, (long) arg0, arg1 - 5822);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static void method1853(int arg0) {
        field4301 = null;
        if (arg0 != 8643) {
            method1853(40);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public final void method1854(byte arg0) {
        class382 var2 = this.field4305;
        synchronized (this.field4305) {
            this.field4305.method2279(0);
        }
        field4308++;
        int var3 = 122 / ((50 - arg0) / 55);
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lkr;ILpu;Lpu;)V")
    public class290(class693 arg0, int arg1, class522 arg2, class522 arg3) {
        this.field4307 = arg3;
        this.field4304 = arg2;
        this.field4304.method2988(71, 3);
    }
}
