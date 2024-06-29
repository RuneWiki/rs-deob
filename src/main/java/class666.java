import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class666 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "[I")
    public static int[] field9375 = new int[4096];

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[S")
    public static short[] field9376 = new short[] { 22, 49, 30, 48, 46, 12, 15, 16 };

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field9377 = 0;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public abstract void method3128(byte arg0);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILfaa;)V")
    public static final void method3693(int arg0, class140 arg1) {
        field9378++;
        if (!class457.field6455) {
            return;
        }
        class86.field1184++;
        if (arg1.field1995 != null) {
            class140 var2 = class474.method2695(-12025, class677.field9549, class366.field5205);
            if (var2 != null) {
                class388 var3 = new class388();
                var3.field5443 = arg1;
                var3.field5453 = var2;
                var3.field5451 = arg1.field1995;
                class523.method2890(var3);
            }
        }
        class1.method5(1, class46.field688);
        int var4 = -55 % ((64 - arg0) / 44);
        class288.field4014.method741(arg1.field2100, (byte) 27);
        class288.field4014.method740(class117.field1560, true);
        class288.field4014.method705(true, class677.field9549);
        class288.field4014.method740(class366.field5205, true);
        class288.field4014.method731(-2045573048, arg1.field1969);
        class288.field4014.method757(true, arg1.field2092);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Z")
    public abstract boolean method3124(byte arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public abstract void method3127(int arg0);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static void method3694(boolean arg0) {
        if (!arg0) {
            method3694(true);
        }
        field9376 = null;
        field9375 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB[B)I")
    public abstract int method3129(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([BZII)V")
    public abstract void method3126(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException;
}
