import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class337 {

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2061(int arg0) {
        int var1 = 59 % ((arg0 - 54) / 51);
        field4786++;
        class76.method694((byte) 89);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)J", line = 17)
    public static final synchronized long method2062(boolean arg0) {
        field4785++;
        long var1 = System.currentTimeMillis();
        if (var1 < class646.field9181) {
            class691.field9738 += class646.field9181 - var1;
        }
        if (arg0) {
            method2064((byte) -22);
        }
        class646.field9181 = var1;
        return var1 + class691.field9738;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V", line = 41)
    public static final void method2063(byte arg0) {
        field4784++;
        if (class343.field4881 == null) {
            return;
        }
        try {
            String var1 = class343.field4881.getParameter("cookiehost");
            int var2 = (int) (method2062(false) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            class154.method1205(-38, "document.cookie=\"" + var3 + "\"", class343.field4881);
        } catch (Throwable var4) {
        }
        if (arg0 != -51) {
            field4787 = 100;
        }
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)V", line = 70)
    public static final void method2064(byte arg0) {
        field4783++;
        if (arg0 != 107) {
            method2063((byte) -112);
        }
        class219.field3210 = true;
    }
}
