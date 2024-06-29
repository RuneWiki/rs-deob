import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class class194 {

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field2783 = 13156520;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2784;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)I", line = 4)
    public static final int method1389(int arg0, int arg1) {
        if (arg0 != 255) {
            method1394(120, 78, -87);
        }
        field2786++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIBII)V", line = 17)
    public static final void method1390(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2789++;
        class139 var7 = class44.method411(arg2, true, arg6);
        if (var7 != null && var7.field1994 != null) {
            class361 var8 = new class361();
            var8.field4905 = var7.field1994;
            var8.field4903 = var7;
            class18.method267(var8);
        }
        class386.field5439 = arg3;
        class163.field2409 = arg0;
        class280.field3750 = arg1;
        class3.field16 = true;
        class124.field1733 = arg5;
        class328.field4456 = arg2;
        class418.field5864 = arg6;
        class10.method52(var7, (byte) -89);
        if (arg4 != -103) {
            field2784 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V", line = 48)
    public static void method1391(byte arg0) {
        field2784 = null;
        if (arg0 != 20) {
            method1392(89);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 61)
    public static final void method1392(int arg0) {
        class189.method1362(arg0 - 38097);
        field2785++;
        class150.field2295 = null;
        if (arg0 != 40000) {
            field2784 = null;
        }
        class387.field5450 = null;
        class39.field592 = null;
        class367.field5043 = null;
        class6.field41 = null;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(II)Z", line = 78)
    public static final boolean method1393(int arg0, int arg1) {
        field2791++;
        class187 var2 = class32.method348(0, arg1);
        if (var2 == null) {
            return false;
        } else if (class304.field4109 == 3) {
            if (arg0 > -56) {
                method1392(87);
            }
            String var3 = "";
            if (class445.field6400 != 0) {
                var3 = ":" + (var2.field2701 + 7000);
            }
            String var4 = "";
            if (class301.field4042 != null) {
                var4 = "/p=" + class301.field4042;
            }
            String var5 = "http://" + var2.field2700 + var3 + "/l=" + class89.field1320 + "/a=" + class346.field4689 + var4 + "/j" + (class101.field1504 ? "1" : "0") + ",o" + (class243.field3363 ? "1" : "0") + ",a2";
            try {
                class244.field3371.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class227.field3144 = var2.field2701;
            class295.field3985 = var2.field2700;
            if (class445.field6400 != 0) {
                class87.field1298 = class227.field3144 + 40000;
                class416.field5816 = class227.field3144 + 50000;
                class31.field518 = class87.field1298;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(III)Lgl;", line = 131)
    public static final class339 method1394(int arg0, int arg1, int arg2) {
        class224 var3 = class118.field1653[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3108;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(III)V", line = 138)
    public class194(int arg0, int arg1, int arg2) {
        this.field2788 = arg1;
        this.field2787 = arg0;
        this.field2782 = arg2;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIB)V", line = 148)
    public static final void method1395(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2790++;
        if (arg2 == arg3) {
            class255.method1661(arg0, arg5 ^ 0x34E2, arg3, arg4, arg1);
            return;
        }
        if ((arg0 - arg3) >= class433.field6144 && class69.field1047 >= (arg0 + arg3) && class39.field595 <= (arg4 - arg2) && class134.field1917 >= arg2 + arg4) {
            class193.method1386(arg4, arg3, arg1, arg0, (byte) -29, arg2);
        } else {
            class229.method1538(arg4, arg1, arg0, (byte) 126, arg2, arg3);
        }
        if (arg5 != 23) {
            field2784 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
    public abstract void method594(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIB)V")
    public abstract void method593(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(III)V")
    public abstract void method592(int arg0, int arg1, int arg2);
}
