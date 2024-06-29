import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class580 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Laj;")
    private class287 field8416 = new class287(256);

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lom;")
    private class344 field8420;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lqfa;")
    public static class85 field8418 = new class85(40, 6);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field8417;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lfu;")
    public static class360 field8422;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)Loi;")
    public final class65 method3330(byte arg0, int arg1) {
        field8423++;
        class287 var3 = this.field8416;
        class65 var4;
        synchronized (this.field8416) {
            var4 = (class65) this.field8416.method1900((long) arg1, 100);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 == -56) {
            class344 var5 = this.field8420;
            byte[] var6;
            synchronized (this.field8420) {
                var6 = this.field8420.method2216(26, arg1, true);
            }
            class65 var7 = new class65();
            if (var6 != null) {
                var7.method761(new class61(var6), (byte) -106);
            }
            class287 var8 = this.field8416;
            synchronized (this.field8416) {
                this.field8416.method1904(var7, (long) arg1, -1);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public final void method3331(boolean arg0) {
        class287 var2 = this.field8416;
        synchronized (this.field8416) {
            this.field8416.method1913(!arg0);
            if (arg0) {
                method3334(-43);
            }
        }
        field8419++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public final void method3332(int arg0) {
        class287 var2 = this.field8416;
        synchronized (this.field8416) {
            this.field8416.method1912(-2552);
            if (arg0 != -14612) {
                this.method3331(false);
            }
        }
        field8421++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V")
    public final void method3333(int arg0, boolean arg1) {
        class287 var3 = this.field8416;
        synchronized (this.field8416) {
            this.field8416.method1908(arg0, (byte) -11);
        }
        if (arg1) {
            this.field8416 = null;
        }
        field8417++;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static void method3334(int arg0) {
        field8422 = null;
        field8418 = null;
        if (arg0 != 21914) {
            method3334(-128);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class580(class398 arg0, int arg1, class344 arg2) {
        this.field8420 = arg2;
        this.field8420.method2236(26, 0);
    }
}
