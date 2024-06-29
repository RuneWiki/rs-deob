import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class75 {

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "I")
    public static int field994 = 0;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
    public static final void method598(int arg0) {
        class367.field4752 = false;
        field992++;
        if (arg0 != 0) {
            field994 = -51;
        }
        class434.method2390(class284.field3593, class559.field6988, class484.field6012, class465.field5774, (byte) -20);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IBI)Z")
    public static final boolean method599(int arg0, byte arg1, int arg2) {
        if (arg1 != 38) {
            method599(61, (byte) -46, -93);
        }
        field993++;
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLji;)Ljava/lang/String;")
    public static final String method600(byte arg0, class572 arg1) {
        field990++;
        if (arg0 >= -105) {
            method601(null, true);
        }
        return class65.method521((byte) 5, 32767, arg1);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lji;Z)Loaa;")
    public static final class268 method601(class572 arg0, boolean arg1) {
        field991++;
        if (!arg1) {
            field994 = -115;
        }
        int var2 = arg0.method3031(-1);
        class580 var3 = class682.method3772((byte) -81)[arg0.method3097((byte) 12)];
        class241 var4 = class457.method2517(!arg1)[arg0.method3097((byte) 12)];
        int var5 = arg0.method3086(65280);
        int var6 = arg0.method3086(65280);
        return new class268(var2, var3, var4, var5, var6);
    }
}
