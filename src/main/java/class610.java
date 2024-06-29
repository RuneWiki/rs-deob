import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class610 extends class153 {

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "Lida;")
    public static class272 field8211 = null;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "Lst;")
    public static class335 field8212 = new class335(1, -1);

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "Lfv;")
    public static class718 field8213 = new class718();

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
    public static int field8215 = 1407;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "Lkr;")
    public static class602 field8216 = new class602(65, -2);

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
    public static void method3461(byte arg0) {
        field8212 = null;
        if (arg0 < 120) {
            field8213 = null;
        }
        field8211 = null;
        field8216 = null;
        field8213 = null;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZZLjava/lang/String;BLrp;)V")
    public static final void method3462(boolean arg0, boolean arg1, String arg2, byte arg3, class135 arg4) {
        field8210++;
        if (arg1) {
            if (class135.field1937.startsWith("win") && arg4.field1936) {
                String var5 = null;
                if (class320.field4445 != null) {
                    var5 = class320.field4445.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class246 var6 = class172.method1104(0, (byte) -97, arg2, arg4);
                    class664.field8914 = var6;
                    class262.field3839 = arg4;
                    class649.field8706 = arg2;
                    return;
                }
            }
            if (class135.field1937.startsWith("mac")) {
                String var7 = null;
                if (class320.field4445 != null) {
                    var7 = class320.field4445.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg0) {
                    class172.method1104(1, (byte) -99, arg2, arg4);
                    return;
                }
            }
            class172.method1104(2, (byte) -96, arg2, arg4);
        } else {
            class172.method1104(3, (byte) 44, arg2, arg4);
        }
        if (arg3 >= -63) {
            method3461((byte) -78);
        }
    }
}
