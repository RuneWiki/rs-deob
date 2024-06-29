import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class148 extends class279 {

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "Lcb;")
    public static class631 field2312 = new class631(73, 6);

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "[F")
    public static float[] field2318 = new float[2];

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public static final void method1126(Canvas arg0, boolean arg1) {
        if (!arg1) {
            ++field2309;
            Dimension var2 = arg0.getSize();
            class447.method2753(var2.width, var2.height, (byte) 90);
            if (class554.field7897 != 1) {
                class13.field119.method361(arg0, class661.field9411, class478.field6934);
            } else {
                class13.field119.method361(arg0, class208.field3477, class379.field5699);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Z")
    public final boolean method438(byte arg0) {
        ++field2314;
        if (arg0 >= -32) {
            this.method443(126, 21, 18);
        }
        return false;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)V")
    public final void method435(boolean arg0, int arg1) {
        ++field2310;
        if (arg1 != 2048) {
            field2315 = 76;
        }
    }

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)V")
    public static void method1127(int arg0) {
        field2318 = null;
        if (arg0 <= 109) {
            field2312 = null;
        }
        field2312 = null;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lpj;)V")
    public class148(class38 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
    public final void method443(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field2315 = 17;
        }
        ++field2317;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BZ)V")
    public final void method441(byte arg0, boolean arg1) {
        ++field2311;
        if (arg0 != 9) {
            field2312 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZLiu;)V")
    public final void method437(int arg0, boolean arg1, class506 arg2) {
        super.field4267.method215(8, arg2);
        if (arg1) {
            field2318 = null;
        }
        ++field2316;
        super.field4267.method405(arg0, (byte) 121);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
    public final void method442(boolean arg0) {
        if (!arg0) {
            ++field2313;
        }
    }
}
