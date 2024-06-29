import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class199 extends class46 {

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "Z")
    public static boolean field2976 = true;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static volatile int field2974 = 0;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field2978 = 0;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "J")
    public long field2980;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Laj;")
    public class199 field2979;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Laj;")
    public class199 field2982;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "[I")
    public static int[] field2973;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V", line = 17)
    public final void method1412(int arg0) {
        field2981++;
        if (arg0 == 0 && this.field2979 != null) {
            this.field2979.field2982 = this.field2982;
            this.field2982.field2979 = this.field2979;
            this.field2982 = null;
            this.field2979 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)V", line = 42)
    public static void method1413(int arg0) {
        if (arg0 == 0) {
            field2973 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 53)
    public static final void method1414(Component arg0, boolean arg1) {
        field2984++;
        if (arg1) {
            method1417((class33) null, -102);
        }
        arg0.removeMouseListener(class318.field4968);
        arg0.removeMouseMotionListener(class318.field4968);
        arg0.removeFocusListener(class318.field4968);
        class203.field3046 = 0;
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)V", line = 67)
    public static final void method1415(int arg0) {
        field2975++;
        if (arg0 != 10106) {
            return;
        }
        for (int var1 = 0; var1 < class312.field4839; var1++) {
            int var2 = class325.field5049[var1];
            class313 var3 = class254.field3989[var2];
            if (var3 != null) {
                class227.method1608(var3, var3.field4859.field3118, -11777);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)V", line = 99)
    public static final void method1416(byte arg0, int arg1) {
        if (arg0 <= -85) {
            field2983++;
            class338 var2 = class195.method1391(6, (byte) -92, arg1);
            var2.method2347(true);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lqh;I)V", line = 116)
    public static final void method1417(class33 arg0, int arg1) {
        field2977++;
        class239 var2 = (class239) class55.field917.method1222(arg1, class128.method926(arg0.field477, (byte) -53));
        if (var2 == null) {
            return;
        }
        if (var2.field3806 != null) {
            class98.field1560.method1864(var2.field3806);
            var2.field3806 = null;
        }
        var2.method403(1);
    }
}
