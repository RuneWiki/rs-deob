import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class193 {

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIBI)V", line = 8)
    public static final void method1172(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (int var5 = 0; var5 < class717.field10056; var5++) {
            Rectangle var6 = class452.field6510[var5];
            if ((var6.x + var6.width) > arg4 && var6.x < arg4 + arg0 && var6.y + var6.height > arg1 && (arg1 + arg2) > var6.y) {
                class344.field4472[var5] = true;
            }
        }
        if (arg3 > -20) {
            method1173((byte) 17, -121, 64);
        }
        field2275++;
        class16.method75(arg1, (byte) 127, arg1 + arg2, arg4, arg0 + arg4);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BII)Z", line = 34)
    public static final boolean method1173(byte arg0, int arg1, int arg2) {
        if (arg0 > -6) {
            method1172(-108, 2, -21, (byte) -111, -71);
        }
        field2274++;
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V", line = 45)
    public static final void method1174(boolean arg0) {
        field2276++;
        if (class255.field3123 == null) {
            return;
        }
        try {
            String var1 = class255.field3123.getParameter("cookiehost");
            int var2 = (int) (class652.method3700(-1) / 86400000L) - 11745;
            if (!arg0) {
                String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
                class393.method2416(class255.field3123, -25442, "document.cookie=\"" + var3 + "\"");
            }
        } catch (Throwable var4) {
        }
    }
}
