import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class326 {

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Lhn;")
    private class509 field4342 = new class509(64);

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lfo;")
    private class361 field4339;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lao;")
    public static class191 field4343 = new class191(84, -2);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lfo;B)V")
    public static final void method1917(class361 arg0, byte arg1) {
        if (arg1 != 38) {
            field4343 = null;
        }
        field4340++;
        class36.field371 = arg0.method2148("titlebg", arg1 - 38);
        class339.field4486 = arg0.method2148("logo", 0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)V")
    public static final void method1918(byte arg0, int arg1) {
        if (class48.field505 == 1) {
            class130.field1681 = arg1;
        } else if (class48.field505 == 2 || class48.field505 == 3) {
            class254.field3378 = arg1;
        }
        if (arg0 < 108) {
            method1918((byte) -7, -54);
        }
        field4338++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public final void method1919(int arg0) {
        class509 var2 = this.field4342;
        synchronized (this.field4342) {
            this.field4342.method3034((byte) 89);
            if (arg0 >= -88) {
                this.field4342 = null;
            }
        }
        field4341++;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public final void method1920(int arg0) {
        class509 var2 = this.field4342;
        synchronized (this.field4342) {
            if (arg0 < 105) {
                this.field4342 = null;
            }
            this.field4342.method3045(48);
        }
        field4335++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)Lti;")
    public final class306 method1921(int arg0, byte arg1) {
        field4337++;
        if (arg1 <= 17) {
            return null;
        }
        class509 var3 = this.field4342;
        class306 var4;
        synchronized (this.field4342) {
            var4 = (class306) this.field4342.method3032(3589, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field4339;
        byte[] var6;
        synchronized (this.field4339) {
            var6 = this.field4339.method2130(32, arg0, -104);
        }
        class306 var7 = new class306();
        if (var6 != null) {
            var7.method1826(-1, new class396(var6));
        }
        class509 var8 = this.field4342;
        synchronized (this.field4342) {
            this.field4342.method3046((long) arg0, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
    public final void method1922(int arg0, int arg1) {
        field4336++;
        class509 var3 = this.field4342;
        synchronized (this.field4342) {
            this.field4342.method3036(arg0, (byte) -89);
            if (arg1 != -12565) {
                this.field4339 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static void method1923(int arg0) {
        field4343 = null;
        if (arg0 != 3) {
            method1918((byte) 97, 117);
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Ld;ILfo;)V")
    public class326(class104 arg0, int arg1, class361 arg2) {
        this.field4339 = arg2;
        this.field4339.method2136(-121, 32);
    }
}
