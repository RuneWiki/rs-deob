import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class351 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public int field4680;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "Z")
    public boolean field4689;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public int field4688;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "S")
    public short field4687;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "S")
    public short field4686;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public int field4692;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public int field4685;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "B")
    public byte field4681;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "S")
    public short field4684;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "Ljava/util/Random;")
    public static Random field4690 = new Random();

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field4693 = 0;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Ljn;")
    public static class668 field4691;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 16)
    public static void method1994(byte arg0) {
        field4691 = null;
        field4690 = null;
        if (arg0 != -87) {
            field4690 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 28)
    public static final void method1995(String arg0, boolean arg1) {
        field4682++;
        class190.field2323 = arg0;
        if (class627.field8991 == null) {
            return;
        }
        try {
            if (!arg1) {
                method1995(null, false);
            }
            String var2 = class627.field8991.getParameter("cookieprefix");
            String var3 = class627.field8991.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class656.method3708(7, class301.method1787((byte) 90) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class140.method925(class627.field8991, "document.cookie=\"" + var5 + "\"", (byte) -62);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIILdn;Ldn;)V", line = 66)
    public static final void method1996(int arg0, int arg1, int arg2, class480 arg3, class480 arg4) {
        class433 var5 = class222.method1354(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field6212 = arg3;
        var5.field6209 = arg4;
        int var6 = class340.field4500 == class155.field1899 ? 1 : 0;
        if (!arg3.method175(0)) {
            class67.field1036[var6][class571.field8344[var6]++] = arg3;
        } else if (arg3.method165((byte) -39)) {
            class516.field7547[var6][class596.field8613[var6]++] = arg3;
        } else {
            class549.field7969[var6][class196.field2370[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method175(0)) {
            if (arg4.method165((byte) -94)) {
                class516.field7547[var6][class596.field8613[var6]++] = arg4;
                return;
            }
            class549.field7969[var6][class196.field2370[var6]++] = arg4;
            return;
        }
        class67.field1036[var6][class571.field8344[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 103)
    public class351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4680 = arg2;
        this.field4689 = arg10;
        this.field4688 = arg0;
        this.field4687 = (short) arg5;
        this.field4686 = (short) arg6;
        this.field4692 = arg1;
        this.field4685 = arg11;
        this.field4681 = (byte) arg8;
        this.field4683 = arg3;
        this.field4684 = (short) arg4;
    }
}
