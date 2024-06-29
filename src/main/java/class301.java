import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class301 extends class216 {

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Z")
    public boolean field4106 = false;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "Z")
    public boolean field4115 = false;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public int field4108;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public int field4109;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field4114 = 0;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field4113;

    // $FF: synthetic field
    @OriginalMember(owner = "client!je", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field4116;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)V")
    public static final void method1829(boolean arg0) {
        class68.field967.method2522((byte) 98);
        field4113++;
        class273.field3739.method2522((byte) 25);
        if (arg0) {
            field4107 = 101;
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)Z")
    public static final boolean method1830(int arg0) {
        if (arg0 < 4) {
            field4107 = 9;
        }
        field4111++;
        return class314.field4259 != 0 || class157.field2234 >= 2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLim;)V")
    public static final void method1831(boolean arg0, class352 arg1) {
        field4112++;
        if (class341.field4617 == null) {
            return;
        }
        if (arg0) {
            method1831(true, (class352) null);
        }
        class223 var2 = null;
        if (arg1.field4730 == 0) {
            var2 = (class223) class243.method1587(arg1.field4731, arg1.field4739, arg1.field4738);
        }
        if (arg1.field4730 == 1) {
            var2 = (class223) class85.method680(arg1.field4731, arg1.field4739, arg1.field4738);
        }
        if (arg1.field4730 == 2) {
            var2 = (class223) class95.method734(arg1.field4731, arg1.field4739, arg1.field4738, field4116 == null ? (field4116 = method1832("iq")) : field4116);
        }
        if (arg1.field4730 == 3) {
            var2 = (class223) class111.method852(arg1.field4731, arg1.field4739, arg1.field4738);
        }
        if (var2 == null) {
            arg1.field4727 = 0;
            arg1.field4740 = 0;
            arg1.field4734 = -1;
        } else {
            arg1.field4734 = var2.method711(!arg0);
            arg1.field4727 = var2.method695(898);
            arg1.field4740 = var2.method709(30030);
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIIZZ)V")
    public class301(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field4106 = arg3;
        this.field4110 = arg0;
        this.field4115 = arg4;
        this.field4108 = arg2;
        this.field4109 = arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1832(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
