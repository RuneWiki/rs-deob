import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class49 extends class285 implements class438 {

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    private int field754;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Loe;")
    public static class127 field747 = new class127(108, 2);

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field756 = 0;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "Lbg;")
    public static class310 field755 = new class310(46, 3);

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "Loe;")
    public static class127 field758 = new class127(29, 8);

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field759 = new String[100];

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V", line = 4)
    public static void method345(boolean arg0) {
        field755 = null;
        field747 = null;
        if (!arg0) {
            field759 = null;
        }
        field758 = null;
        field759 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IC)Z", line = 19)
    public static final boolean method346(int arg0, char arg1) {
        ++field746;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class127.method866(arg1, (byte) 125)) {
            return true;
        } else {
            if (arg0 != 25688) {
                field758 = null;
            }
            char[] var2 = class487.field7413;
            for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                char var7 = var2[var3];
                if (~arg1 == ~var7) {
                    return true;
                }
            }
            char[] var4 = class105.field1853;
            for (int var5 = 0; var5 < var4.length; ++var5) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/lang/Object;Lhf;)V", line = 64)
    public static final void method347(int arg0, Object arg1, class260 arg2) {
        ++field752;
        if (arg2.field3932 != null) {
            for (int var3 = arg0; ~var3 > -51 && arg2.field3932.peekEvent() != null; ++var3) {
                class414.method2437(1L, (byte) -122);
            }
            if (arg1 != null) {
                arg2.field3932.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLjava/lang/String;)V", line = 86)
    public static final void method348(byte arg0, String arg1) {
        class138.field2274 = arg1;
        ++field751;
        if (class7.field86.field3929 != null) {
            try {
                String var2 = class7.field86.field3929.getParameter("cookieprefix");
                if (arg0 != -86) {
                    method347(33, (Object) null, (class260) null);
                }
                String var3 = class7.field86.field3929.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (~arg1.length() == -1) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class383.method2298(94608000000L + class344.method2111((byte) -53), (byte) -101) + "; Max-Age=" + 94608000L;
                }
                class209.method1280("document.cookie=\"" + var5 + "\"", -94, class7.field86.field3929);
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V", line = 119)
    public static final void method349(int arg0) {
        ++field757;
        int var1 = -1 / ((arg0 - 58) / 41);
        for (class477 var2 = (class477) class139.field2285.method1319(121); var2 != null; var2 = (class477) class139.field2285.method1320((byte) -116)) {
            var2.method2884();
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)I", line = 138)
    public final int method350(int arg0) {
        if (arg0 != 12399) {
            method345(false);
        }
        ++field753;
        return 0;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lbl;I[BI)V", line = 158)
    public class49(class442 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field754 = arg1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)I", line = 166)
    public final int method351(boolean arg0) {
        if (arg0) {
            field759 = null;
        }
        ++field749;
        return this.field754;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)J", line = 178)
    public final long method352(int arg0) {
        int var2 = -54 / ((arg0 - 21) / 57);
        ++field750;
        return super.field4317.method2479();
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[BIB)V", line = 192)
    public final void method353(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 == -27) {
            this.method1739(arg1, arg2);
            ++field748;
            this.field754 = arg0;
        }
    }
}
