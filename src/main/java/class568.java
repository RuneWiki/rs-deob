import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class568 {

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public int field8309;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "J")
    public long field8304;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "Ljava/lang/String;")
    public String field8308;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public int field8312;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "Ljava/lang/String;")
    public String field8305;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "Lvh;")
    public static class125 field8307 = new class125(24, 3);

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "Leda;")
    public static class116 field8310 = new class116(1, -2);

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public static int field8311 = 0;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 5)
    public static void method3317(int arg0) {
        field8310 = null;
        field8307 = null;
        if (arg0 != 3) {
            method3317(-108);
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V", line = 21)
    public static final void method3318(int arg0) {
        class117 var1 = class603.field8668;
        synchronized (class603.field8668) {
            class603.field8668.method950((byte) 79);
        }
        if (arg0 != 19950) {
            method3318(79);
        }
        field8306++;
        class117 var2 = class45.field602;
        synchronized (class45.field602) {
            class45.field602.method950((byte) 27);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V", line = 38)
    public static final void method3319(byte arg0) {
        class318.field4387.method2821(1);
        if (arg0 != 97) {
            field8307 = null;
        }
        field8303++;
        class187.field2933.method2821(arg0 - 96);
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 63)
    public class568(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field8309 = arg2;
        this.field8304 = arg4;
        this.field8308 = arg1;
        this.field8312 = arg0;
        this.field8305 = arg3;
    }
}
