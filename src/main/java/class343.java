import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class343 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "[I")
    public static int[] field4958 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method2238(int arg0) {
        field4958 = null;
        if (arg0 >= -19) {
            field4958 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2239(int arg0, int arg1, String arg2) {
        class185.field2507.method5(-6445, arg1);
        class38.field537++;
        field4962++;
        class185.field2507.method1346(class125.method795(arg1 - 223, arg2) + 1, 32767);
        class185.field2507.method1377(arg0, (byte) 88);
        class185.field2507.method1380(65280, arg2);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILlm;Lii;Llm;)V")
    public static final void method2240(int arg0, class347 arg1, class405 arg2, class347 arg3) {
        field4960++;
        class410.field6062 = class271.method1868(32, class156.field2117, 0, arg3);
        if (arg0 != -20667) {
            method2241(-90, -55, 6);
        }
        class294.field4209 = arg2.method1683(class410.field6062, class441.method2779(arg1, class156.field2117, 0), true);
        class283.field4123 = class271.method1868(84, class377.field5493, 0, arg3);
        class393.field5626 = arg2.method1683(class283.field4123, class441.method2779(arg1, class377.field5493, 0), true);
        class191.field2562 = class271.method1868(88, class201.field2694, 0, arg3);
        class422.field6227 = arg2.method1683(class191.field2562, class441.method2779(arg1, class201.field2694, 0), true);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
    public static final void method2241(int arg0, int arg1, int arg2) {
        class254 var3 = class213.field2852[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field3519 != null) {
            var3.field3519 = null;
        }
        if (var3.field3502 != null) {
            var3.field3502 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIBI)V")
    public static final void method2242(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field4963++;
        if (arg1 == arg3) {
            class96.method658(arg3, arg5, 16250, arg0, arg2);
            return;
        }
        if (arg0 - arg3 >= class87.field1227 && arg0 + arg3 <= class299.field4382 && (arg5 - arg1) >= class379.field5521 && arg1 + arg5 <= class125.field1751) {
            class312.method2114(arg1, arg3, arg5, 90724161, arg2, arg0);
        } else {
            class30.method203((byte) -72, arg2, arg3, arg5, arg0, arg1);
        }
        if (arg4 != -80) {
            method2242(79, -13, -71, -5, (byte) 57, -122);
        }
    }
}
