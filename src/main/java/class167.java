import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class167 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "F")
    public static float field2379;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)Lvm;")
    public static final class409 method1202(boolean arg0, int arg1) {
        field2378++;
        class15 var2 = class441.field6313;
        class409 var3;
        synchronized (class441.field6313) {
            var3 = (class409) class441.field6313.method99(arg0, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class399.field5607.method643(class97.method574(arg1, (byte) -127), class373.method2389(108, arg1), arg0);
        class409 var5 = new class409();
        var5.field5825 = arg1;
        var5.field5833 = new String[] { null, null, class431.field6150.method2284((byte) 116, class373.field5313), null, null };
        var5.field5858 = new String[] { null, null, null, null, class296.field4274.method2284((byte) -16, class373.field5313) };
        if (var4 != null) {
            var5.method2577(new class130(var4), -1);
        }
        var5.method2582(128);
        if (var5.field5840 != -1) {
            var5.method2578(method1202(arg0, var5.field5840), method1202(true, var5.field5845), !arg0);
        }
        if (var5.field5856 != -1) {
            var5.method2576(method1202(arg0, var5.field5856), method1202(true, var5.field5864), (byte) 50);
        }
        if (!class43.field584 && var5.field5843) {
            var5.field5871 = class205.field2889.method2284((byte) 113, class373.field5313);
            var5.field5807 = null;
            var5.field5833 = class220.field3163;
            var5.field5858 = class56.field752;
            var5.field5805 = false;
            var5.field5863 = 0;
            if (var5.field5796 != null) {
                boolean var6 = false;
                for (class425 var7 = var5.field5796.method1383(-32); var7 != null; var7 = var5.field5796.method1378((byte) 98)) {
                    class319 var8 = class58.method378((int) var7.field6070, (byte) 118);
                    if (var8.field4669) {
                        var7.method2660((byte) 116);
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var5.field5796 = null;
                }
            }
        }
        class15 var9 = class441.field6313;
        synchronized (class441.field6313) {
            class441.field6313.method90(var5, (long) arg1, 0);
            return var5;
        }
    }
}
