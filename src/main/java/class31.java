import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class31 {

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
    public static int field455 = -1;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field456 = new Hashtable();

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "Lau;")
    public static class692 field459 = new class692();

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIILjava/lang/Class;)Lat;", line = 9)
    public static final class144 method286(int arg0, int arg1, int arg2, Class arg3) {
        class293 var4 = class541.field7946[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class198 var5 = var4.field4097; var5 != null; var5 = var5.field3078) {
            class144 var6 = var5.field3085;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2481 == arg1 && var6.field2484 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 37)
    public static void method287(int arg0) {
        if (arg0 != -1) {
            field455 = -93;
        }
        field456 = null;
        field459 = null;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZ)V", line = 48)
    public static final void method288(int arg0, boolean arg1) {
        class555.field8116++;
        field454++;
        class699 var2 = class452.method2630(class699.field9897, class434.field6241, (byte) 121);
        if (arg0 != -22995) {
            method287(-91);
        }
        class149.method1134(var2, true);
        for (class259 var3 = (class259) class199.field3098.method2815(0); var3 != null; var3 = (class259) class199.field3098.method2814(4)) {
            if (!var3.method2555(19742)) {
                var3 = (class259) class199.field3098.method2815(arg0 + 22995);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field3711 == 0) {
                class270.method1705(true, arg0 + 22948, var3, arg1);
            }
        }
        if (class223.field3353 != null) {
            class326.method1948(arg0 ^ 0xFFFFA62C, class223.field3353);
            class223.field3353 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V", line = 91)
    public static final void method289(int arg0) {
        field457++;
        int var1 = -92 / ((2 - arg0) / 59);
        class659.field9285.method936(-94);
    }
}
