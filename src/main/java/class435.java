import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class435 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6201 = "Take";

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field6199 = 0;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Ljava/lang/String;")
    public static String field6204 = "Discard";

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static final void method2696(int arg0) {
        field6202++;
        if (class420.field5882 == 0) {
            return;
        }
        try {
            if ((++class335.field4542) > 1500) {
                if (class105.field1540 != null) {
                    class105.field1540.method2736(5000);
                    class105.field1540 = null;
                }
                if (class244.field3374 >= 1) {
                    class420.field5882 = 0;
                    class368.field5051 = -5;
                    return;
                }
                if (class229.field3189 == class124.field1736) {
                    class124.field1736 = class401.field5601;
                } else {
                    class124.field1736 = class229.field3189;
                }
                class420.field5882 = 1;
                class335.field4542 = 0;
                class244.field3374++;
            }
            if (class420.field5882 == arg0) {
                class128.field1821 = class30.field502.method1955(class124.field1736, class82.field1213, -123);
                class420.field5882 = 2;
            }
            if (class420.field5882 == 2) {
                if (class128.field1821.field3345 == 2) {
                    throw new IOException();
                }
                if (class128.field1821.field3345 != 1) {
                    return;
                }
                class105.field1540 = new class441((Socket) class128.field1821.field3341, class30.field502);
                class128.field1821 = null;
                class105.field1540.method2737(class355.field4828.field3882, 0, class355.field4828.field3938, -124);
                if (class76.field1136 != null) {
                    class76.field1136.method1563(120);
                }
                if (class365.field5037 != null) {
                    class365.field5037.method1563(arg0 + 122);
                }
                int var1 = class105.field1540.method2742(arg0 + 4999);
                if (class76.field1136 != null) {
                    class76.field1136.method1563(122);
                }
                if (class365.field5037 != null) {
                    class365.field5037.method1563(125);
                }
                if (var1 != 101) {
                    class420.field5882 = 0;
                    class368.field5051 = var1;
                    class105.field1540.method2736(5000);
                    class105.field1540 = null;
                    return;
                }
                class420.field5882 = 3;
            }
            if (class420.field5882 == 3 && class105.field1540.method2732(0) >= 2) {
                int var2 = class105.field1540.method2742(5000) << 8 | class105.field1540.method2742(5000);
                class194.method1393(-110, var2);
                if (class227.field3144 == -1) {
                    class368.field5051 = 6;
                    class420.field5882 = 0;
                    class105.field1540.method2736(5000);
                    class105.field1540 = null;
                } else {
                    class420.field5882 = 0;
                    class105.field1540.method2736(5000);
                    class105.field1540 = null;
                    class134.method1072(-2109085497);
                }
            }
        } catch (IOException var3) {
            if (class105.field1540 != null) {
                class105.field1540.method2736(5000);
                class105.field1540 = null;
            }
            if (class244.field3374 < 1) {
                class335.field4542 = 0;
                class244.field3374++;
                if (class229.field3189 == class124.field1736) {
                    class124.field1736 = class401.field5601;
                } else {
                    class124.field1736 = class229.field3189;
                }
                class420.field5882 = 1;
            } else {
                class368.field5051 = -4;
                class420.field5882 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static final void method2697(int arg0) {
        class153.field2332 = new class124(8);
        field6203++;
        class89.field1314 = 0;
        class48 var1 = (class48) class428.field6084.method891(20838);
        int var2 = 118 % ((3 - arg0) / 48);
        while (var1 != null) {
            var1.method492();
            var1 = (class48) class428.field6084.method898(64);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
    public static final void method2698() {
        class434.method2695(1, class388.field5464);
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public static void method2699(int arg0) {
        field6204 = null;
        field6201 = null;
        if (arg0 >= -98) {
            field6199 = 80;
        }
    }
}
