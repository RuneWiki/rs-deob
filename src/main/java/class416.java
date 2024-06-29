import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class416 {

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Lkha;")
    private class687 field5923;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "Lkha;")
    private class687 field5922;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field5915 = 0;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field5920 = 0;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "Lmq;")
    public static class78 field5914 = new class78(34, 12);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "Lpia;")
    private class649 field5913;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lada;I)Lbq;")
    public final class698 method2474(class255 arg0, int arg1) {
        field5912++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 70) {
            method2476(20, -49, null, -93, 118, 79, -85, -120, 88, null);
        }
        class669 var3 = arg0.method271(false);
        if (class508.field7187 == var3) {
            return new class491((class204) arg0);
        } else if (class516.field7273 == var3) {
            return new class388(this.method2477(true), (class741) arg0);
        } else if (class63.field861 == var3) {
            return new class707(this.field5923, (class565) arg0);
        } else if (class335.field4308 == var3) {
            return new class509(this.field5923, (class267) arg0);
        } else if (class125.field1495 == var3) {
            return new class199(this.field5923, this.field5922, (class642) arg0);
        } else if (class306.field3931 == var3) {
            return new class508(this.field5923, this.field5922, (class663) arg0);
        } else if (class567.field7916 == var3) {
            return new class311(this.field5923, this.field5922, (class569) arg0);
        } else if (class6.field66 == var3) {
            return new class289(this.field5923, this.field5922, (class420) arg0);
        } else if (class480.field6848 == var3) {
            return new class374(this.field5923, (class439) arg0);
        } else if (class540.field7604 == var3) {
            return new class198(this.field5923, this.field5922, (class25) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIII)V")
    public static final void method2475(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        int var5 = arg3 << 3;
        field5919++;
        int var6 = arg2 << 3;
        class748.field10471 = var6;
        if (arg0 >= -78) {
            method2475(-96, 124, -60, -115);
        }
        class602.field8360 = var4;
        if (class276.field3497 == 2) {
            class688.field9781 = var6;
            class156.field1974 = var5;
            class411.field5801 = var4;
        }
        class106.method727(false);
        class70.field945 = true;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILkba;IIIIIILkba;)V")
    public static final void method2476(int arg0, int arg1, class24 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class24 arg9) {
        field5917++;
        int var10 = arg2.method250((byte) -43);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class712 var12 = (class712) class229.field2992.method778((long) var10, -121);
        if (var12 == null) {
            class196[] var13 = class196.method1225(class645.field8897, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class458.field6407.method60(var13[0], true);
            class229.field2992.method774((long) var10, 119, var12);
        }
        class35.method318(0, arg9.field5790, arg8, arg1 >> 1, arg6, arg9.method253((byte) -27) * 256, arg9.field5784, arg5 >> 1, arg9.field5779, 0);
        int var14 = arg7 + class681.field9310[0] - 18;
        int var15 = class681.field9310[arg3] + arg0 - 70;
        int var16 = arg4 / 4 * 18 + var14;
        int var17 = arg4 % 4 * 18 + var15;
        var12.method3929(var16, var17);
        if (arg2 == arg9) {
            class458.field6407.method2659(18, var16 - 1, 18, 0, -256, var17 - 1);
        }
        class365.method2249(true, var17 + 18, var17 + -1, var16 + 18, var16 + -1);
        class144 var18 = class185.method1184(true);
        var18.field1716 = var16 + 16;
        var18.field1715 = var17;
        var18.field1714 = arg2;
        var18.field1713 = var16;
        var18.field1710 = var17 + 16;
        class488.field6950.method1840(18, var18);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)Lpia;")
    private final class649 method2477(boolean arg0) {
        if (this.field5913 == null) {
            this.field5913 = new class649();
        }
        field5916++;
        if (!arg0) {
            method2479((byte) -39);
        }
        return this.field5913;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2478(String arg0, byte arg1) {
        field5921++;
        if (arg1 >= -74) {
            field5918 = 126;
        }
        class371.field5224 = arg0;
        if (class745.field10393 == null) {
            return;
        }
        try {
            String var2 = class745.field10393.getParameter("cookieprefix");
            String var3 = class745.field10393.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class265.method1596(10, class97.method654((byte) 89) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class193.method1212(class745.field10393, "document.cookie=\"" + var5 + "\"", (byte) 38);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lkha;Lkha;)V")
    public class416(class687 arg0, class687 arg1) {
        this.field5923 = arg0;
        this.field5922 = arg1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
    public static void method2479(byte arg0) {
        int var1 = 3 % ((arg0 - 12) / 56);
        field5914 = null;
    }
}
