import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class291 {

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Lau;")
    private class692 field4278 = new class692(128);

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "Lmv;")
    private class295 field4277;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "J")
    public static long field4280 = -1L;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "Lvg;")
    public static class622 field4282 = new class622(85, 1);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1794(int arg0) {
        class683.field9638 = false;
        field4281++;
        if (arg0 == 15669) {
            class430.method2569(class232.field3067, 0, class201.field2730, class367.field5374, field4283);
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 16)
    public static void method1795(int arg0) {
        field4282 = null;
        if (arg0 != 128) {
            field4282 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)Z", line = 33)
    public static final boolean method1796(boolean arg0) {
        if (arg0) {
            field4279++;
            return class656.field9370;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)Lfi;", line = 47)
    public final class237 method1797(int arg0, int arg1) {
        field4275++;
        class692 var3 = this.field4278;
        class237 var4;
        synchronized (this.field4278) {
            var4 = (class237) this.field4278.method3901((long) arg0, -75);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4277.method1844(class12.method82(arg0, (byte) -112), 31330, class239.method1472(false, arg0));
        if (arg1 != -14715) {
            return null;
        }
        class237 var6 = new class237();
        if (var5 != null) {
            var6.method1458(new class540(var5), 14804);
        }
        class692 var7 = this.field4278;
        synchronized (this.field4278) {
            this.field4278.method3894(var6, (byte) 60, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lsea;ILmv;)V", line = 83)
    public class291(class373 arg0, int arg1, class295 arg2) {
        this.field4277 = arg2;
        if (this.field4277 != null) {
            int var4 = this.field4277.method1816(62) - 1;
            this.field4277.method1845(var4, true);
        }
    }
}
