import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class112 {

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field1912 = 1;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Leg;")
    public static class37 field1913 = class174.method1167("Utiliser", 88);

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Leg;")
    public static class37 field1915 = class174.method1167("Bitte warten Sie)3)3)3", 120);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Ljl;")
    public static class101 field1907;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field1911;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Z")
    public static boolean field1914;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)I")
    public static final int method800(int arg0, int arg1) {
        if (arg1 > -60) {
            return -19;
        } else {
            field1908++;
            return arg0 >>> 7;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjl;)V")
    public static final void method801(int arg0, class101 arg1) {
        if (arg0 < 86) {
            field1911 = null;
        }
        field1916++;
        class200.field3400 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method802(int arg0) {
        field1911 = null;
        field1913 = null;
        field1915 = null;
        field1907 = null;
        if (arg0 != -141) {
            method804(true, 46);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILpi;II)V")
    public static final void method803(int arg0, class188 arg1, int arg2, int arg3) {
        if (arg2 != 239) {
            return;
        }
        field1909++;
        if (arg1.field1800 == arg3 && arg3 != -1) {
            class2 var4 = class186.method1242(0, arg3);
            int var5 = var4.field38;
            if (var5 == 1) {
                arg1.field1797 = 0;
                arg1.field1785 = arg0;
                arg1.field1771 = 0;
                arg1.field1825 = 0;
                class182.method1201(arg1.field1799, var4, 255, arg1.field1793, class82.field1285 == arg1, arg1.field1771);
            }
            if (var5 == 2) {
                arg1.field1825 = 0;
                return;
            }
        } else if (arg3 == -1 || arg1.field1800 == -1 || class186.method1242(0, arg3).field25 >= class186.method1242(0, arg1.field1800).field25) {
            arg1.field1797 = 0;
            arg1.field1800 = arg3;
            arg1.field1771 = 0;
            arg1.field1785 = arg0;
            arg1.field1766 = arg1.field1834;
            arg1.field1825 = 0;
            if (arg1.field1800 != -1) {
                class182.method1201(arg1.field1799, class186.method1242(0, arg1.field1800), 255, arg1.field1793, class82.field1285 == arg1, arg1.field1771);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)Z")
    public static final boolean method804(boolean arg0, int arg1) {
        if (arg0) {
            field1911 = null;
        }
        field1910++;
        return arg1 >= 0 && arg1 < class201.field3422.length ? class201.field3422[arg1] : false;
    }
}
