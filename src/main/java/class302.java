import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class302 extends class287 {

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "Z")
    public volatile boolean field4123 = true;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "[I")
    public static int[] field4116 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "Lat;")
    public static class444 field4126 = null;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "Z")
    public boolean field4120;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "Z")
    public boolean field4125;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "[I")
    public static int[] field4119;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "[[Lat;")
    public static class444[][] field4121;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V")
    public static void method1750(int arg0) {
        if (arg0 != 21787) {
            method1753(87, 85);
        }
        field4119 = null;
        field4126 = null;
        field4121 = null;
        field4116 = null;
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "(I)V")
    public static final void method1751(int arg0) {
        field4122++;
        if (class433.field6273 != null) {
            class433.field6273.method1713(arg0 - 3);
            class200.field2913 = null;
            class433.field6273 = null;
        }
        if (arg0 != 2) {
            method1750(-27);
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)I")
    public abstract int method1720(byte arg0);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Z")
    public static final boolean method1752(int arg0, int arg1) {
        field4118++;
        int var2 = 16 % ((31 - arg0) / 42);
        if (arg1 == 20 || arg1 == 30 || arg1 == 47 || arg1 == 44 || arg1 == 48) {
            return true;
        } else {
            return arg1 == 51 || arg1 == 1006;
        }
    }

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "(I)[B")
    public abstract byte[] method1716(int arg0);

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)Lho;")
    public static final class343 method1753(int arg0, int arg1) {
        field4117++;
        class343 var2 = (class343) class199.field2898.method2371((long) arg0, -77);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class358.field5162.method2512(arg0, (byte) -93, 0);
        if (arg1 < 59) {
            return null;
        } else if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class343 var4 = class116.method865((byte) -126, var3);
            class199.field2898.method2370(28281, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(II)V")
    public static final void method1754(int arg0, int arg1) {
        field4124++;
        class314 var2 = class177.method1213(false, arg1, arg0);
        var2.method1811((byte) 86);
    }
}
