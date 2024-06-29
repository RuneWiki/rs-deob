import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class279 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Z")
    public boolean field4291 = false;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4302 = "Loaded fonts";

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lkh;")
    public static class166 field4298 = new class166(new byte[5000]);

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field4303 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public int field4293;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public int field4295;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "J")
    public long field4300;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Ll;")
    public static class133 field4304;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lwb;")
    public class253 field4297;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(SI)Z", line = 8)
    public static final boolean method1912(short arg0, int arg1) {
        field4299++;
        if (arg0 == 26 || arg0 == 45 || arg0 == 5 || arg0 == 15 || arg0 == 4 || arg0 == 9 || arg0 == 20 || arg0 == 59) {
            return true;
        } else if (arg0 == 34 || arg0 == 18 || arg0 == 1005 || arg0 == 1003) {
            return true;
        } else if (arg0 == 49 || arg0 == 17 || arg0 == 31 || arg0 == 43 || arg0 == 32) {
            return true;
        } else {
            return ~arg0 == arg1 || arg0 == 21 || arg0 == 30 || arg0 == 11 || arg0 == 51 || arg0 == 3;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 49)
    public static final void method1913(int arg0) {
        class224 var1 = class318.field4968;
        synchronized (class318.field4968) {
            class256.field4016 = class203.field3046;
            class333.field5200++;
            class119.field1815 = class17.field234;
            class253.field3984 = class23.field384;
            class171.field2604 = class199.field2974;
            class205.field3084 = class70.field1133;
            if (arg0 < 23) {
                field4292 = -92;
            }
            class47.field776 = class231.field3664;
            class194.field2901 = class345.field5349;
            class199.field2974 = 0;
        }
        field4296++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 87)
    public static void method1914(byte arg0) {
        field4298 = null;
        if (arg0 <= 104) {
            method1915(-62);
        }
        field4302 = null;
        field4304 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 104)
    public static final void method1915(int arg0) {
        field4301++;
        try {
            if (class225.field3583 == 1) {
                int var1 = class160.field2416.method1969(-127);
                if (var1 > 0 && class160.field2416.method1942(-94)) {
                    int var2 = var1 - class165.field2479;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class160.field2416.method1939(var2, (byte) 31);
                    return;
                }
                class160.field2416.method1968(0);
                class160.field2416.method1952((byte) -95);
                class337.field5271 = null;
                if (class50.field803 == null) {
                    class225.field3583 = 0;
                } else {
                    class225.field3583 = 2;
                }
                class48.field785 = null;
            }
            if (arg0 >= -46) {
                field4298 = (class166) null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class160.field2416.method1968(0);
            class48.field785 = null;
            class50.field803 = null;
            class225.field3583 = 0;
            class337.field5271 = null;
        }
    }
}
