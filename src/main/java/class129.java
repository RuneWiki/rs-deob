import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class129 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    private int field2096 = 0;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "Ljj;")
    private class156 field2106;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Z")
    public static boolean field2108 = false;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field2111 = 0;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "Lmb;")
    public static class258 field2110 = null;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lon;")
    private class35 field2097;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lr;")
    public static class63 field2100;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lvq;ILja;IZ)V")
    public static final void method1085(class22 arg0, int arg1, class90 arg2, int arg3, boolean arg4) {
        class356.field5064.method147(35);
        field2107++;
        if (class72.field1209) {
            return;
        }
        for (class198 var5 = (class198) arg0.method157((byte) -125); var5 != null; var5 = (class198) arg0.method145(20)) {
            class242 var6 = class1.method3(var5.field2883, 36);
            if (class161.method1259(var6, 10418)) {
                boolean var7 = class285.method2016(arg3, var6, var5, arg2, arg1, (byte) 87);
                if (var7) {
                    class37.method280((byte) 38, var5, arg2, var6);
                }
            }
        }
        if (arg4) {
            field2100 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static final void method1086(byte arg0) {
        field2101++;
        class40.field622 = null;
        class303.method2077(class277.field4170, class113.field1819, class321.field4642, 0, 17968, 0, 0, 0, -1);
        int var1 = -35 / ((12 - arg0) / 46);
        if (class40.field622 != null) {
            class91.method771(-1412584499, class276.field4156.field3885, 0, 0, class40.field622, class277.field4170, class113.field1819, class117.field1852, class452.field6567, false);
            class40.field622 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static void method1087(byte arg0) {
        field2110 = null;
        field2100 = null;
        if (arg0 != 48) {
            field2111 = 26;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1088(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -127 % ((-arg4 - 45) / 49);
        field2102++;
        if (class185.field2727 <= arg5 && class278.field4184 >= arg3 && arg0 >= class308.field4507 && class383.field5497 >= arg1) {
            class268.method1909(arg6, arg2, -101, arg1, arg3, arg5, arg7, arg0);
        } else {
            class447.method2794(arg1, arg0, arg3, arg2, arg6, arg7, arg5, 0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Lon;")
    public final class35 method1089(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field2099++;
        if (this.field2096 > 0 && this.field2106.field2360[this.field2096 - 1] != this.field2097) {
            class35 var2 = this.field2097;
            this.field2097 = var2.field498;
            return var2;
        }
        while (this.field2106.field2363 > this.field2096) {
            class35 var3 = this.field2106.field2360[this.field2096++].field498;
            if (this.field2106.field2360[this.field2096 - 1] != var3) {
                this.field2097 = var3.field498;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljj;)V")
    public class129(class156 arg0) {
        this.field2106 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Lon;")
    public final class35 method1090(boolean arg0) {
        this.field2096 = 0;
        field2104++;
        return arg0 ? this.method1089(0) : null;
    }
}
