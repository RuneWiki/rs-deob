import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class261 extends class226 {

    @OriginalMember(owner = "client!jfa", name = "s", descriptor = "I")
    public int field3708 = (int) (class680.method3756(-114) / 1000L);

    @OriginalMember(owner = "client!jfa", name = "t", descriptor = "S")
    public short field3709;

    @OriginalMember(owner = "client!jfa", name = "u", descriptor = "Ljava/lang/String;")
    public String field3710;

    @OriginalMember(owner = "client!jfa", name = "v", descriptor = "I")
    public static int field3711 = 0;

    @OriginalMember(owner = "client!jfa", name = "y", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!jfa", name = "A", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!jfa", name = "x", descriptor = "[Lem;")
    public static class205[] field3713;

    @OriginalMember(owner = "client!jfa", name = "w", descriptor = "[Lxa;")
    public static class461[] field3712;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(CB)Z")
    public static final boolean method1596(char arg0, byte arg1) {
        if (arg1 != -43) {
            method1597(true);
        }
        field3715++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)V")
    public static final void method1597(boolean arg0) {
        class134.field1897 = arg0;
        field3716++;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Loa;BLsu;II)V")
    public static final void method1598(class638 arg0, byte arg1, class192 arg2, int arg3, int arg4) {
        class154.field2325.method1269((byte) 116);
        field3714++;
        if (arg1 > -35) {
            field3712 = null;
        }
        if (class387.field5437) {
            return;
        }
        for (class209 var5 = (class209) arg2.method1270((byte) -25); var5 != null; var5 = (class209) arg2.method1282(0)) {
            class307 var6 = class148.field2180.method2872((byte) 121, var5.field3086);
            if (class345.method2055(var6, (byte) 101)) {
                boolean var7 = class473.method2686(arg0, -30771, arg3, arg4, var6, var5);
                if (var7) {
                    class387.method2230(-124, arg0, var5, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)V")
    public static void method1599(byte arg0) {
        field3713 = null;
        int var1 = -34 % ((arg0 - 9) / 46);
        field3712 = null;
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class261(String arg0, int arg1) {
        this.field3709 = (short) arg1;
        this.field3710 = arg0;
    }
}
