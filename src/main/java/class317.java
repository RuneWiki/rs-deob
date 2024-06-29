import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class317 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public int field4982;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public int field4983;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public int field4986;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lo;")
    public static class138 field4981;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Ll;")
    public static class196 field4980;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z")
    public final boolean method2008(byte arg0) {
        field4985++;
        int var2 = -93 % ((arg0 + 52) / 40);
        return (this.field4982 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Z")
    public final boolean method2009(int arg0) {
        if (arg0 == -1) {
            field4988++;
            return (this.field4982 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Z")
    public final boolean method2010(boolean arg0) {
        if (arg0) {
            field4987++;
            return (this.field4982 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static void method2011(int arg0) {
        field4981 = null;
        field4980 = null;
        if (arg0 != -1) {
            method2014((byte) -47, false, null, null, true);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIILql;)V")
    public static final void method2012(int arg0, int arg1, int arg2, int arg3, class129 arg4) {
        class465 var5 = class406.method2512(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field2216 = (arg1 << class276.field4534) + class331.field5211;
        arg4.field2217 = arg3;
        arg4.field2222 = (arg2 << class276.field4534) + class331.field5211;
        for (class1 var7 = var5.field6898; var7 != null; var7 = var7.field2) {
            if (var7.field9.field4725) {
                int var8 = var7.field9.method325(5);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field2217 += var6;
            arg4.field2221 = true;
        } else if (var5.field6913 != null) {
            arg4.field2217 -= var5.field6913.field2173;
        }
        var5.field6909 = arg4;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)Z")
    public final boolean method2013(int arg0) {
        field4984++;
        if (arg0 > -53) {
            return true;
        } else {
            return (this.field4982 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BZLjava/lang/String;Lnv;Z)V")
    public static final void method2014(byte arg0, boolean arg1, String arg2, class493 arg3, boolean arg4) {
        field4989++;
        int var5 = -74 % ((arg0 + 29) / 43);
        if (!arg4) {
            class280.method1836(true, arg3, 3, arg2);
            return;
        }
        if (class493.field7187.startsWith("win") && class493.field7198 != 3) {
            String var6 = null;
            if (arg3.field7203 != null) {
                var6 = arg3.field7203.getParameter("haveie6");
            }
            if (var6 == null || !var6.equals("1")) {
                class169 var7 = class280.method1836(true, arg3, 0, arg2);
                class340.field5326 = arg3;
                class517.field7659 = arg2;
                class275.field4529 = var7;
                return;
            }
        }
        if (class493.field7187.startsWith("mac")) {
            String var8 = null;
            if (arg3.field7203 != null) {
                var8 = arg3.field7203.getParameter("havefirefox");
            }
            if (var8 != null && var8.equals("1") && arg1) {
                class280.method1836(true, arg3, 1, arg2);
                return;
            }
        }
        class280.method1836(true, arg3, 2, arg2);
    }
}
