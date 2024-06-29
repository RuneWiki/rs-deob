import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class183 extends class440 implements class749 {

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    private int field3084;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "Ltm;")
    public static class334 field3090 = new class334(48, -2);

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "Lcb;")
    public static class631 field3091 = new class631(34, 2);

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "Lcb;")
    public static class631 field3092 = new class631(10, 0);

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "J")
    public static long field3094 = 0L;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "Lln;")
    public static class472 field3093 = new class472(0, 2, 2, 1);

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V", line = 3)
    public final void method847(byte arg0) {
        ++field3085;
        int var2 = -83 % ((arg0 - 80) / 34);
        super.field6403.method1249(this, (byte) 43);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)J", line = 14)
    public final long method1405(boolean arg0) {
        if (!arg0) {
            return 116L;
        } else {
            ++field3087;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(Z)V", line = 27)
    public static void method1406(boolean arg0) {
        field3090 = null;
        field3092 = null;
        field3093 = null;
        field3091 = null;
        if (!arg0) {
            method1406(true);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 40)
    public static final void method1407(byte arg0) {
        ++field3086;
        if (arg0 == -104) {
            for (class124 var1 = (class124) class662.field9426.method3508((byte) -36); var1 != null; var1 = (class124) class662.field9426.method3520(-1)) {
                if (var1.field1904.method4088(255)) {
                    class188.method1429(var1.field1896, arg0 + 199);
                } else {
                    var1.field1904.method1162((byte) 85);
                    try {
                        var1.field1904.method4078(true);
                    } catch (Exception var5) {
                        class333.method2135(var5, "TV: " + var1.field1896, -95);
                        class188.method1429(var1.field1896, 106);
                    }
                    if (!var1.field1903 && !var1.field1905) {
                        class175 var3 = var1.field1904.method4082((byte) 81);
                        if (var3 != null) {
                            class122 var4 = var3.method1377(119);
                            if (var4 != null) {
                                var4.method954(127, var1.field1906);
                                class324.field4793.method2226(var4);
                                var1.field1903 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lrs;I[BIZ)V", line = 99)
    public class183(class166 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field3084 = arg1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)I", line = 109)
    public final int method1408(int arg0) {
        ++field3088;
        int var2 = -9 / ((arg0 - 23) / 33);
        return this.field3084;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([BIIZ)V", line = 119)
    public final void method1409(byte[] arg0, int arg1, int arg2, boolean arg3) {
        ++field3083;
        this.method2708(arg0, arg1, 0);
        this.field3084 = arg2;
        if (!arg3) {
            method1407((byte) -78);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)I", line = 133)
    public final int method1410(int arg0) {
        if (arg0 != 27076) {
            this.method1410(36);
        }
        ++field3089;
        return super.field6412;
    }
}
