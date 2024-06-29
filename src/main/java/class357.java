import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class357 {

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Z")
    public static boolean field5465 = false;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public int field5467;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public int field5468;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public int field5470;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public int field5472;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public int field5473;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public int field5474;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5469;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(CI)Z")
    public static final boolean method2142(char arg0, int arg1) {
        field5471++;
        if (arg1 != -557) {
            field5469 = null;
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIZIII)Lqs;")
    public static final class50 method2143(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field5466++;
        long var7 = (long) arg6 * 76724863L ^ (long) arg4 * 32147369L ^ (long) arg0 * 475427L ^ (long) arg1 * 67481L ^ (long) arg2 * 97549L ^ (long) arg5 * 986053L;
        class50 var9 = (class50) class521.field7662.method2288(var7, 0);
        if (var9 != null) {
            return var9;
        }
        if (arg3) {
            field5465 = true;
        }
        class50 var10 = class27.field395.method158(arg1, arg2, arg0, arg5, arg4, arg6);
        class521.field7662.method2290(var7, var10, 110);
        return var10;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static void method2144(int arg0) {
        field5469 = null;
        if (arg0 != -46) {
            method2143(-96, -60, -28, false, -128, -63, 104);
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
    public static final void method2145(int arg0) {
        field5464++;
        for (class22 var1 = (class22) class110.field1644.method2957(99); var1 != null; var1 = (class22) class110.field1644.method2947(28)) {
            if (var1.field325 == -1) {
                var1.field318 = 0;
                if (var1.field326 >= 0 && var1.field321 >= 0 && class50.field640 > var1.field326 && class448.field6611 > var1.field321) {
                    class303.method1887((byte) 120, var1);
                }
            } else {
                var1.method876((byte) -96);
            }
        }
        if (arg0 < 6) {
            method2145(-29);
        }
    }
}
