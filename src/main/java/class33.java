import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class33 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field522 = 0;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Lcf;")
    public static class93 field524 = class147.method1066("K", -48);

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "Lcf;")
    public static class93 field527 = class147.method1066("welle:", -48);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Ljava/awt/Font;")
    public static Font field528;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)Lgb;")
    public static final class148 method193(int arg0, int arg1) {
        class148 var2 = (class148) class31.field491.method302((long) arg1, arg0);
        field525++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class232.field4147.method1271(4, arg0 ^ 0xFFFFF796, arg1);
        class148 var4 = new class148();
        if (var3 != null) {
            var4.method1070(new class280(var3), 4, arg1);
        }
        class31.field491.method297((long) arg1, var4, 10414);
        return var4;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZIIZ)V")
    public static final void method194(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field521++;
        if (arg3 != 25454) {
            method195(112);
        }
        class248.method1686(arg1, arg0, class86.field1559.length - 1, 1, 0, arg4, arg2);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method195(int arg0) {
        field528 = null;
        field527 = null;
        field524 = null;
        if (arg0 != 4) {
            method193(21, 106);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILhg;ILhg;B)Lvh;")
    public static final class274 method196(int arg0, class177 arg1, int arg2, class177 arg3, byte arg4) {
        int var5 = -127 % ((-arg4 - 42) / 54);
        field520++;
        return class149.method1074(arg0, arg1, 16597, arg2) ? class7.method30(60, arg3.method1271(arg2, -2154, arg0)) : null;
    }
}
