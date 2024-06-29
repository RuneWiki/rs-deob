import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class231 extends class393 {

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "Lmi;")
    public static class408 field3260 = new class408();

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "Lsf;")
    public static class143 field3261 = new class143(64);

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "[I")
    public static int[] field3266 = new int[50];

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "Z")
    public static boolean field3265 = false;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "Lfi;")
    public static class165 field3262;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1426(int arg0, int arg1, String arg2) {
        class232.field3279.method756(0, 47);
        field3259++;
        class85.field1182++;
        class232.field3279.method1707(108, arg1 + class410.method2668((byte) -128, arg2));
        class232.field3279.method1662(arg2, (byte) 78);
        class232.field3279.method1696(true, arg0);
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)Loo;")
    public static final class384 method1427(int arg0, int arg1) {
        if (arg0 != -25652) {
            return null;
        }
        field3257++;
        class384 var2 = (class384) class318.field4545.method2319(-12, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class127.field1692.method1472(0, arg1, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class384 var4 = class374.method2476(var3, -2);
            class318.field4545.method2318(var4, false, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
    public class231() {
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)V")
    public static void method1428(byte arg0) {
        field3266 = null;
        field3262 = null;
        field3261 = null;
        field3260 = null;
        if (arg0 >= -4) {
            field3263 = 18;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lnr;I)V")
    public static final void method1429(class437 arg0, int arg1) {
        field3256++;
        if (arg1 != -1262) {
            method1426(123, -127, (String) null);
        }
        if (class193.field2688 != class187.field2545 && class343.field5032 != null && class410.method2670(arg0, class193.field2688, 20)) {
            class187.field2545 = class193.field2688;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(I)V")
    public class231(int arg0) {
        this.field3258 = arg0;
    }
}
