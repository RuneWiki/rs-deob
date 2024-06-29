import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class281 extends class570 {

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "Lrm;")
    public class90 field4364;

    @OriginalMember(owner = "client!sea", name = "m", descriptor = "Z")
    public static boolean field4367 = false;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "F")
    public static float field4365;

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1851(byte arg0) {
        field4366++;
        if (class351.field5138 == null) {
            return;
        }
        try {
            String var1 = class351.field5138.getParameter("cookiehost");
            int var2 = (int) (class18.method109(-11121) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            class284.method1861(-89, class351.field5138, "document.cookie=\"" + var3 + "\"");
            if (arg0 >= -86) {
                field4367 = true;
            }
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lpj;II[B)V", line = 39)
    public class281(class38 arg0, int arg1, int arg2, byte[] arg3) {
        this.field4364 = arg0.method391(arg3, arg2, false, class215.field3556, arg1, 126);
        this.field4364.method597(-128, false, false);
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lpj;II[I)V", line = 51)
    public class281(class38 arg0, int arg1, int arg2, int[] arg3) {
        this.field4364 = arg0.method265(arg2, false, arg1, arg3, 0);
        this.field4364.method597(91, false, false);
    }
}
