import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class105 {

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public int field1732;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "Lvj;")
    public class204 field1741;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "B")
    public byte field1745;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field1736 = 0;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "[I")
    public static int[] field1748 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "Lon;")
    public static class674 field1746 = new class674();

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "Lub;")
    public class146 field1733;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "Lee;")
    public class459 field1731;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "Llc;")
    public class652 field1744;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "Ltk;")
    public class95 field1738;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "Ljava/awt/Image;")
    public static Image field1750;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method880(int arg0) {
        field1740++;
        if (arg0 >= -1) {
            return false;
        } else {
            return this.field1745 == 2 || this.field1745 == 3;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V", line = 30)
    public static final void method881(byte arg0) {
        field1739++;
        if (class404.field5808 < 0) {
            class371.field5147 = -1;
            class404.field5808 = 0;
            class34.field480 = -1;
        }
        if (class404.field5808 > class161.field2640) {
            class404.field5808 = class161.field2640;
            class34.field480 = -1;
            class371.field5147 = -1;
        }
        if (class438.field6298 < 0) {
            class371.field5147 = -1;
            class438.field6298 = 0;
            class34.field480 = -1;
        }
        if (class161.field2631 < class438.field6298) {
            class438.field6298 = class161.field2631;
            class371.field5147 = -1;
            class34.field480 = -1;
        }
        int var1 = -42 / ((68 - arg0) / 55);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)Loda;", line = 73)
    public static final class653 method882(int arg0, int arg1) {
        if (arg0 == 2) {
            field1735++;
            return new class653(arg1, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILek;)Lem;", line = 86)
    public static final class567 method883(int arg0, class465 arg1) {
        field1737++;
        if (arg0 != 1) {
            return null;
        }
        class186 var2 = class405.method2437((byte) -112)[arg1.method2705(arg0 - 37)];
        class409 var3 = class113.method919(false)[arg1.method2705(-116)];
        int var4 = arg1.method2744(-1);
        int var5 = arg1.method2744(-1);
        int var6 = arg1.method2755((byte) -77);
        int var7 = arg1.method2755((byte) -83);
        int var8 = arg1.method2744(arg0 - 2);
        int var9 = arg1.method2691((byte) -67);
        int var10 = arg1.method2691((byte) -67);
        return new class567(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLwv;ILjava/lang/String;Z)V", line = 120)
    public static final void method884(boolean arg0, class705 arg1, int arg2, String arg3, boolean arg4) {
        if (arg2 != -1) {
            return;
        }
        field1749++;
        if (!arg0) {
            class660.method3715((byte) 115, arg3, 3, arg1);
            return;
        }
        if (class705.field9971.startsWith("win") && arg1.field9983) {
            String var5 = null;
            if (class492.field7063 != null) {
                var5 = class492.field7063.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class614 var6 = class660.method3715((byte) 69, arg3, 0, arg1);
                class520.field7670 = var6;
                class608.field8737 = arg1;
                class573.field8422 = arg3;
                return;
            }
        }
        if (class705.field9971.startsWith("mac")) {
            String var7 = null;
            if (class492.field7063 != null) {
                var7 = class492.field7063.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg4) {
                class660.method3715((byte) 100, arg3, 1, arg1);
                return;
            }
        }
        class660.method3715((byte) 95, arg3, 2, arg1);
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V", line = 182)
    public static void method885(int arg0) {
        field1746 = null;
        field1750 = null;
        if (arg0 != -32342) {
            field1750 = null;
        }
        field1748 = null;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(BIIIIIILvj;)V", line = 194)
    public class105(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class204 arg7) {
        this.field1747 = arg6;
        this.field1732 = arg5;
        this.field1742 = arg3;
        this.field1729 = arg4;
        this.field1730 = arg1;
        this.field1741 = arg7;
        this.field1734 = arg2;
        this.field1745 = arg0;
    }
}
