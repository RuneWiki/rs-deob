import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class734 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lfba;")
    private class348 field10291 = new class348(64);

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Lfba;")
    public class348 field10299 = new class348(64);

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lla;")
    public class423 field10295;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lla;")
    private class423 field10298;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lfba;")
    public static class348 field10292 = new class348(128, 4);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field10288;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field10289;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field10290;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field10293;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field10294;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field10296;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field10297;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static final void method4084(boolean arg0) {
        if (arg0) {
            field10292 = null;
        }
        field10296++;
        if (class445.field6361 == 1 || class445.field6361 == 3 || class445.field6361 != class407.field5799 && (class445.field6361 == 0 || class407.field5799 == 0)) {
            class619.field8816 = 0;
            class551.field8042 = 0;
            class389.field5608.method4013(-3);
        }
        class407.field5799 = class445.field6361;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)Lrn;")
    public final class607 method4085(int arg0, boolean arg1) {
        field10294++;
        class348 var3 = this.field10291;
        class607 var4;
        synchronized (this.field10291) {
            var4 = (class607) this.field10291.method2216(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field10298;
        byte[] var6;
        synchronized (this.field10298) {
            var6 = this.field10298.method2600(0, 34, arg0);
        }
        class607 var7 = new class607();
        var7.field8609 = this;
        if (var6 != null) {
            var7.method3539(new class479(var6), true);
        }
        class348 var8 = this.field10291;
        synchronized (this.field10291) {
            this.field10291.method2213((byte) -16, (long) arg0, var7);
            if (!arg1) {
                this.field10291 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method4086(byte arg0) {
        int var1 = -10 % ((arg0 - 65) / 40);
        field10292 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZ)V")
    public final void method4087(int arg0, int arg1, boolean arg2) {
        this.field10291 = new class348(arg1);
        field10289++;
        this.field10299 = new class348(arg0);
        if (!arg2) {
            this.method4085(66, false);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
    public final void method4088(byte arg0) {
        field10293++;
        class348 var2 = this.field10291;
        synchronized (this.field10291) {
            this.field10291.method2220(false);
            if (arg0 <= 75) {
                this.field10291 = null;
            }
        }
        class348 var3 = this.field10299;
        synchronized (this.field10299) {
            this.field10299.method2220(false);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IZ)V")
    public final void method4089(int arg0, boolean arg1) {
        field10297++;
        class348 var3 = this.field10291;
        synchronized (this.field10291) {
            this.field10291.method2207(arg0, 1);
        }
        class348 var4 = this.field10299;
        synchronized (this.field10299) {
            this.field10299.method2207(arg0, 1);
        }
        if (arg1) {
            method4084(false);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)Z")
    public static final boolean method4090(int arg0, int arg1, int arg2) {
        if (arg0 != 29441) {
            field10292 = null;
        }
        field10290++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public final void method4091(int arg0) {
        class348 var2 = this.field10291;
        synchronized (this.field10291) {
            this.field10291.method2219(-5300);
        }
        field10288++;
        class348 var3 = this.field10299;
        synchronized (this.field10299) {
            if (arg0 == 19252) {
                this.field10299.method2219(-5300);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lmp;ILla;Lla;)V")
    public class734(class315 arg0, int arg1, class423 arg2, class423 arg3) {
        this.field10295 = arg3;
        this.field10298 = arg2;
        this.field10298.method2616(34, 0);
    }
}
