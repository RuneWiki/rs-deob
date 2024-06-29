import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class34 {

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Lwm;")
    private class399 field524 = new class399(64);

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "Lwm;")
    private class399 field532 = new class399(100);

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "Lph;")
    private class459 field531;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "Lza;")
    public static class288 field522;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "Z")
    public static boolean field525;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 3)
    public final void method235(byte arg0) {
        field526++;
        class399 var2 = this.field524;
        synchronized (this.field524) {
            this.field524.method2475((byte) 67);
        }
        if (arg0 != 91) {
            this.field532 = null;
        }
        class399 var3 = this.field532;
        synchronized (this.field532) {
            this.field532.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB)Ljv;", line = 21)
    public final class57 method236(int arg0, byte arg1) {
        field527++;
        class399 var3 = this.field524;
        class57 var4;
        synchronized (this.field524) {
            var4 = (class57) this.field524.method2478(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field531;
        byte[] var6;
        synchronized (this.field531) {
            var6 = this.field531.method2757(class336.method2111(arg0, -1555686937), class310.method1979(arg0, false), (byte) -121);
        }
        class57 var7 = new class57();
        var7.field1205 = arg0;
        var7.field1201 = this;
        if (var6 != null) {
            var7.method520(121, new class289(var6));
        }
        var7.method514(0);
        class399 var8 = this.field524;
        synchronized (this.field524) {
            this.field524.method2472(108, var7, (long) arg0);
            int var9 = 96 % ((-arg1 - 18) / 34);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)I", line = 59)
    public static final int method237(int arg0, int arg1) {
        return class283.field4264 == null ? 0 : class283.field4264[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V", line = 62)
    public final void method238(int arg0) {
        field528++;
        class399 var2 = this.field524;
        synchronized (this.field524) {
            if (arg0 != 1) {
                this.field532 = null;
            }
            this.field524.method2477(87);
        }
        class399 var3 = this.field532;
        synchronized (this.field532) {
            this.field532.method2477(53);
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V", line = 81)
    public final void method239(int arg0, int arg1) {
        field530++;
        class399 var3 = this.field524;
        synchronized (this.field524) {
            this.field524.method2471((byte) 98, arg1);
        }
        class399 var4 = this.field532;
        synchronized (this.field532) {
            this.field532.method2471((byte) 98, arg1);
            if (arg0 != 100) {
                field523 = -20;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(II)Lei;", line = 101)
    public final class119 method240(int arg0, int arg1) {
        field529++;
        class399 var3 = this.field532;
        class119 var4;
        synchronized (this.field532) {
            var4 = (class119) this.field532.method2478(1, (long) arg0);
            if (var4 == null) {
                var4 = new class119(arg0);
                this.field532.method2472(103, var4, (long) arg0);
            }
        }
        if (arg1 != 31706) {
            method241(true);
        }
        synchronized (var4) {
            return var4.method960((byte) 116) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lkp;ILph;Lph;Lph;)V", line = 145)
    public class34(class341 arg0, int arg1, class459 arg2, class459 arg3, class459 arg4) {
        this.field531 = arg2;
        if (this.field531 != null) {
            int var6 = this.field531.method2759(16460) - 1;
            this.field531.method2763(var6, -3);
        }
        class416.method2551(arg3, arg4, (byte) 33);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V", line = 133)
    public static void method241(boolean arg0) {
        field522 = null;
        if (!arg0) {
            field522 = null;
        }
    }
}
