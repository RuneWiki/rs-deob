import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class626 {

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "Lvi;")
    private class560 field8516 = new class560(128);

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "Lpq;")
    private class159 field8520;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "Z")
    public static boolean field8518 = false;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "[S")
    public static short[] field8521 = new short[256];

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field8522 = 0;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "Lcb;")
    public static class318 field8519 = new class318(21, 2);

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "F")
    public static float field8523;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "Lrh;")
    public static class59 field8524;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)Lkt;", line = 7)
    public final class79 method3419(int arg0, int arg1) {
        field8515++;
        class560 var3 = this.field8516;
        class79 var4;
        synchronized (this.field8516) {
            var4 = (class79) this.field8516.method3134((long) arg1, -95);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 32764) {
            method3420(-68, null);
        }
        byte[] var5 = this.field8520.method1087(class331.method2119(arg1, (byte) -104), class603.method3334(0, arg1), 1);
        class79 var6 = new class79();
        if (var5 != null) {
            var6.method451((byte) -115, new class138(var5));
        }
        class560 var7 = this.field8516;
        synchronized (this.field8516) {
            this.field8516.method3130((long) arg1, true, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 36)
    public static final String method3420(int arg0, String arg1) {
        field8517++;
        if (arg0 != 21) {
            return null;
        }
        String var2 = class443.method2547(class522.method2981(arg1, 28484), 0);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V", line = 56)
    public static void method3421(int arg0) {
        field8519 = null;
        if (arg0 != 12341) {
            method3420(-41, null);
        }
        field8524 = null;
        field8521 = null;
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Luea;ILpq;)V", line = 90)
    public class626(class484 arg0, int arg1, class159 arg2) {
        this.field8520 = arg2;
        if (this.field8520 != null) {
            int var4 = this.field8520.method1074((byte) 78) - 1;
            this.field8520.method1076(var4, 0);
        }
    }
}
