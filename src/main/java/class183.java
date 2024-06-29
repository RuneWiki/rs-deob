import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class183 extends class205 {

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    private int field2229;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
    private int field2234;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    private int field2228;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    private int field2225;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "Lhj;")
    public static class596 field2231 = new class596(22, -1);

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "Ltm;")
    public static class410 field2235 = class392.method2299(-8456);

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(IIIIIII)V", line = 7)
    public class183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2229 = arg3;
        this.field2234 = arg1;
        this.field2228 = arg2;
        this.field2225 = arg0;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(III)V", line = 18)
    public final void method1222(int arg0, int arg1, int arg2) {
        ++field2227;
        if (arg1 != -10852) {
            method1224(65);
        }
        int var4 = this.field2225 * arg2 >> 12;
        int var5 = this.field2228 * arg2 >> 12;
        int var6 = this.field2234 * arg0 >> 12;
        int var7 = this.field2229 * arg0 >> 12;
        class27.method265(super.field2449, var6, var7, var4, -118, var5, super.field2447, super.field2450);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(III)V", line = 40)
    public final void method1223(int arg0, int arg1, int arg2) {
        ++field2232;
        int var4 = this.field2225 * arg1 >> 12;
        int var5 = this.field2228 * arg1 >> 12;
        int var6 = this.field2234 * arg2 >> 12;
        if (arg0 != 1) {
            method1227((byte) 69, 53);
        }
        int var7 = this.field2229 * arg2 >> 12;
        class662.method3722(var4, super.field2449, var7, 0, var5, var6);
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V", line = 60)
    public static void method1224(int arg0) {
        field2235 = null;
        field2231 = null;
        if (arg0 != 22) {
            method1226(-10, (String) null);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIB)V", line = 71)
    public final void method1225(int arg0, int arg1, byte arg2) {
        ++field2233;
        int var4 = this.field2225 * arg1 >> 12;
        if (arg2 >= -6) {
            this.field2228 = 101;
        }
        int var5 = this.field2228 * arg1 >> 12;
        int var6 = this.field2234 * arg0 >> 12;
        int var7 = this.field2229 * arg0 >> 12;
        class153.method1093(-54, var7, var5, var6, var4, super.field2447, super.field2450);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILjava/lang/String;)V", line = 95)
    public static final void method1226(int arg0, String arg1) {
        ++field2226;
        if (class77.field1049 != null) {
            ++class259.field3073;
            class336 var2 = class512.method3076(class792.field10887, class591.field8030, (byte) 106);
            if (arg0 < -5) {
                var2.field4150.method2353(74, class615.method3482(arg1, 1));
                var2.field4150.method2388(255, arg1);
                class578.method3334(4, var2);
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BI)Z", line = 119)
    public static final boolean method1227(byte arg0, int arg1) {
        int var2 = -30 / ((22 - arg0) / 42);
        ++field2230;
        return arg1 == 0 || ~arg1 == -2 || ~arg1 == -3;
    }
}
