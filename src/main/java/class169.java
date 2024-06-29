import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class169 extends class437 {

    @OriginalMember(owner = "client!rq", name = "v", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!rq", name = "x", descriptor = "I")
    private int field2288;

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
    private int field2280;

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "I")
    private int field2293;

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "I")
    private int field2291;

    @OriginalMember(owner = "client!rq", name = "r", descriptor = "I")
    private int field2282;

    @OriginalMember(owner = "client!rq", name = "s", descriptor = "I")
    private int field2283;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
    private int field2278;

    @OriginalMember(owner = "client!rq", name = "w", descriptor = "Z")
    public static boolean field2287 = false;

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "I")
    public static int field2281 = -1;

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "Lsj;")
    public static class248 field2290 = null;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!rq", name = "t", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!rq", name = "u", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!rq", name = "y", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)V")
    public static final void method1127(byte arg0, int arg1) {
        class170.method1141(-1);
        ++field2277;
        class359.method2361(15816);
        class211.method1384((byte) 124, arg1, true);
        class74.method599(class126.field1647, class341.field5043, (byte) 126, class118.field1532);
        class248.method1629(class118.field1532, true, class126.field1647);
        class281.method1857(0, class109.field1428);
        if (arg0 <= -53) {
            class157.method1045((byte) 109);
            class274.method1812(-1695);
            if (~class381.field5579 == -11) {
                class296.method2009((byte) -14, false);
            } else if (~class381.field5579 == -31) {
                class63.method558(25, true);
            } else if (class381.field5579 == 5) {
                class423.method2660(class126.field1647, class118.field1532, 32245);
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2286 = arg0;
        this.field2288 = arg2;
        this.field2280 = arg5;
        this.field2293 = arg7;
        this.field2291 = arg1;
        this.field2282 = arg3;
        this.field2283 = arg4;
        this.field2278 = arg6;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1128(int arg0, Component arg1) {
        ++field2294;
        arg1.removeKeyListener(class254.field3706);
        arg1.removeFocusListener(class254.field3706);
        int var2 = 79 % ((arg0 - -74) / 47);
        class274.field4033 = -1;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(III)V")
    public final void method295(int arg0, int arg1, int arg2) {
        ++field2276;
        if (arg2 != -11654) {
            this.field2293 = 7;
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(III)V")
    public final void method290(int arg0, int arg1, int arg2) {
        ++field2284;
        int var4 = this.field2286 * arg2 >> 12;
        int var5 = this.field2291 * arg0 >> 12;
        int var6 = this.field2288 * arg2 >> 12;
        int var7 = this.field2282 * arg0 >> 12;
        int var8 = this.field2283 * arg2 >> 12;
        int var9 = this.field2280 * arg0 >> 12;
        int var10 = this.field2278 * arg2 >> 12;
        int var11 = this.field2293 * arg0 >> 12;
        class212.method1391(var7, var8, super.field6349, var11, var5, var6, var10, var4, 98, var9);
        if (arg1 != 8224) {
            field2281 = -68;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(BI)V")
    public static final void method1129(byte arg0, int arg1) {
        ++field2289;
        if (arg0 == -86) {
            class440 var2 = class186.method1241(arg1, 6, (byte) 56);
            var2.method2749(13828096);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIZI)V")
    public static final void method1130(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field2279;
        if (!arg3) {
            field2287 = true;
        }
        if (arg0 < arg4) {
            class351.method2317(!arg3, arg4, class444.field6416[arg2], arg0, arg1);
        } else {
            class351.method2317(false, arg0, class444.field6416[arg2], arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
    public static void method1131(int arg0) {
        if (arg0 >= -72) {
            field2290 = null;
        }
        field2290 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(III)V")
    public final void method294(int arg0, int arg1, int arg2) {
        ++field2292;
        if (arg0 != 352) {
            this.method294(68, 59, 6);
        }
    }
}
