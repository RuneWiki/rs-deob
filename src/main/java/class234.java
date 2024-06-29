import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class234 {

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public int field3126 = 0;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public int field3132 = 0;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lhn;")
    private class509 field3127 = new class509(64);

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lh;")
    private class473 field3133 = null;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Lfo;")
    private class361 field3124;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Lfo;")
    private class361 field3128;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field3122 = -1;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[I")
    public static int[] field3129 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "F")
    public static float field3130;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3131;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static void method1480(byte arg0) {
        field3129 = null;
        if (arg0 >= -73) {
            field3129 = null;
        }
        field3131 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Lsk;")
    public final class442 method1481(int arg0, byte arg1) {
        field3125++;
        class442 var3 = (class442) this.field3127.method3032(3589, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        if (arg1 > -88) {
            this.field3128 = null;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field3124.method2130(1, arg0, -110);
        } else {
            var4 = this.field3128.method2130(1, arg0 & 0x7FFF, -63);
        }
        class442 var5 = new class442();
        var5.field6423 = this;
        if (var4 != null) {
            var5.method2716(-88, new class396(var4));
        }
        if (arg0 >= 32768) {
            var5.method2717((byte) 111);
        }
        this.field3127.method3046((long) arg0, var5, 1);
        return var5;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([ILsd;JB)Ljava/lang/String;")
    public final String method1482(int[] arg0, class63 arg1, long arg2, byte arg3) {
        field3123++;
        if (arg3 != -113) {
            this.method1482(null, null, 112L, (byte) -73);
        }
        if (this.field3133 != null) {
            String var6 = this.field3133.method2888(0, arg0, arg1, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(ILfo;Lfo;Lh;)V")
    public class234(int arg0, class361 arg1, class361 arg2, class473 arg3) {
        this.field3124 = arg1;
        this.field3128 = arg2;
        this.field3133 = arg3;
        if (this.field3124 != null) {
            this.field3132 = this.field3124.method2136(-29, 1);
        }
        if (this.field3128 != null) {
            this.field3126 = this.field3128.method2136(-92, 1);
        }
    }
}
