import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class277 {

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lmf;")
    private class382 field4195 = new class382(64);

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lpu;")
    private class522 field4189;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[F")
    public static float[] field4193 = new float[4];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "[[Lvg;")
    public static class49[][] field4197;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V", line = 6)
    public final void method1808(int arg0, byte arg1) {
        class382 var3 = this.field4195;
        synchronized (this.field4195) {
            this.field4195.method2290(false, arg0);
        }
        field4194++;
        if (arg1 != 88) {
            this.method1811((byte) -62);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 20)
    public final void method1809(int arg0) {
        class382 var2 = this.field4195;
        synchronized (this.field4195) {
            this.field4195.method2279(0);
            if (arg0 != 64) {
                this.method1811((byte) 67);
            }
        }
        field4188++;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 33)
    public static void method1810(int arg0) {
        if (arg0 != 1) {
            field4190 = 82;
        }
        field4193 = null;
        field4197 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 44)
    public final void method1811(byte arg0) {
        field4187++;
        class382 var2 = this.field4195;
        synchronized (this.field4195) {
            this.field4195.method2285((byte) -104);
            if (arg0 != -59) {
                method1810(101);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Lkf;", line = 61)
    public final class227 method1812(int arg0, int arg1) {
        field4192++;
        class382 var3 = this.field4195;
        class227 var4;
        synchronized (this.field4195) {
            var4 = (class227) this.field4195.method2287(arg1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field4189;
        byte[] var6;
        synchronized (this.field4189) {
            var6 = this.field4189.method3007(31, arg0, 5);
        }
        class227 var7 = new class227();
        if (var6 != null) {
            var7.method1491(new class695(var6), (byte) -3);
        }
        class382 var8 = this.field4195;
        synchronized (this.field4195) {
            this.field4195.method2291(var7, (long) arg0, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 93)
    public static final void method1813(String arg0, boolean arg1, int arg2) {
        field4196++;
        class122.field1833++;
        class135 var3 = class688.method3794(class572.field8051, class583.field8198, (byte) 38);
        var3.field1978.method3853((byte) 51, class652.method3606(12351, arg0) + 1);
        var3.field1978.method3837(4102, arg0);
        if (arg1) {
            field4190 = -90;
        }
        var3.field1978.method3832(-32768, arg2);
        class19.method223(var3, 0);
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lkr;ILpu;)V", line = 118)
    public class277(class693 arg0, int arg1, class522 arg2) {
        this.field4189 = arg2;
        this.field4189.method2988(88, 31);
    }
}
