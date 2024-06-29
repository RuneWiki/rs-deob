import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class582 {

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "Lpca;")
    private class653 field8270 = new class653(64);

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "Lpca;")
    public class653 field8276 = new class653(50);

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "Lpca;")
    public class653 field8277 = new class653(5);

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "Ljo;")
    public class303 field8263;

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "Ljo;")
    private class303 field8273;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "Z")
    public boolean field8272;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "Ljda;")
    public class207 field8269;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "Lpr;")
    public static class407 field8266 = new class407(96, 0);

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "Lmfa;")
    public static class562 field8274 = new class562();

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "I")
    public int field8278;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)V", line = 5)
    public final void method3269(byte arg0) {
        field8265++;
        class653 var2 = this.field8270;
        synchronized (this.field8270) {
            this.field8270.method3687((byte) -10);
        }
        class653 var3 = this.field8276;
        synchronized (this.field8276) {
            this.field8276.method3687((byte) -10);
        }
        class653 var4 = this.field8277;
        synchronized (this.field8277) {
            this.field8277.method3687((byte) -10);
        }
        if (arg0 != -63) {
            method3276((byte) 98);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)V", line = 28)
    public final void method3270(boolean arg0) {
        field8262++;
        if (arg0) {
            this.method3272(false, -118);
        }
        class653 var2 = this.field8270;
        synchronized (this.field8270) {
            this.field8270.method3684(-17200);
        }
        class653 var3 = this.field8276;
        synchronized (this.field8276) {
            this.field8276.method3684(-17200);
        }
        class653 var4 = this.field8277;
        synchronized (this.field8277) {
            this.field8277.method3684(-17200);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V", line = 51)
    public final void method3271(int arg0) {
        class653 var2 = this.field8276;
        synchronized (this.field8276) {
            this.field8276.method3687((byte) -10);
        }
        field8271++;
        class653 var3 = this.field8277;
        synchronized (this.field8277) {
            this.field8277.method3687((byte) -10);
            int var4 = 97 / ((arg0 - 35) / 54);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZI)V", line = 66)
    public final void method3272(boolean arg0, int arg1) {
        if (arg1 != -16663) {
            return;
        }
        field8275++;
        if (this.field8272 != arg0) {
            this.field8272 = arg0;
            this.method3269((byte) -63);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(II)Lnc;", line = 91)
    public final class23 method3273(int arg0, int arg1) {
        field8267++;
        class653 var3 = this.field8270;
        class23 var4;
        synchronized (this.field8270) {
            var4 = (class23) this.field8270.method3690((byte) 116, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field8273;
        byte[] var6;
        synchronized (this.field8273) {
            var6 = this.field8273.method1719(class419.method2269(127, arg1), class288.method1628(arg1, arg0 + 1120), arg0 + 1123);
        }
        class23 var7 = new class23();
        var7.field220 = arg1;
        var7.field267 = this;
        if (var6 != null) {
            var7.method101((byte) -113, new class452(var6));
        }
        var7.method109((byte) 1);
        class653 var8 = this.field8270;
        synchronized (this.field8270) {
            this.field8270.method3683(var7, (byte) -21, (long) arg1);
            if (arg0 != -1119) {
                this.method3275(-122, -86);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(II)V", line = 124)
    public final void method3274(int arg0, int arg1) {
        field8268++;
        this.field8278 = arg1;
        class653 var3 = this.field8276;
        synchronized (this.field8276) {
            this.field8276.method3687((byte) -10);
            if (arg0 != -3617) {
                method3276((byte) -76);
            }
        }
        class653 var4 = this.field8277;
        synchronized (this.field8277) {
            this.field8277.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "(II)V", line = 141)
    public final void method3275(int arg0, int arg1) {
        class653 var3 = this.field8270;
        synchronized (this.field8270) {
            this.field8270.method3691(false, arg0);
        }
        field8261++;
        class653 var4 = this.field8276;
        synchronized (this.field8276) {
            this.field8276.method3691(false, arg0);
            if (arg1 != 26655) {
                this.field8278 = -127;
            }
        }
        class653 var5 = this.field8277;
        synchronized (this.field8277) {
            this.field8277.method3691(false, arg0);
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(B)V", line = 162)
    public static void method3276(byte arg0) {
        field8266 = null;
        field8274 = null;
        if (arg0 <= 1) {
            method3276((byte) 64);
        }
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ljda;IZLjo;Ljo;)V", line = 193)
    public class582(class207 arg0, int arg1, boolean arg2, class303 arg3, class303 arg4) {
        this.field8263 = arg4;
        this.field8273 = arg3;
        this.field8272 = arg2;
        this.field8269 = arg0;
        if (this.field8273 != null) {
            int var6 = this.field8273.method1740((byte) 96) - 1;
            this.field8273.method1727(-77, var6);
        }
    }
}
