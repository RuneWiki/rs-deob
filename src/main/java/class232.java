import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class232 extends class270 {

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field2956 = 0;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "[Lxa;")
    public static class458[] field2957;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([SB)[S")
    public static final short[] method1348(short[] arg0, byte arg1) {
        field2952++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 21) {
            method1350(25, 8, 43);
        }
        short[] var2 = new short[arg0.length];
        class652.method3675(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
    public static final void method1349(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2953++;
        class411 var8 = new class411();
        var8.field5448 = arg6;
        var8.field5457 = class469.field6549 + arg7;
        var8.field5453 = arg3;
        var8.field5455 = arg0;
        var8.field5449 = arg5;
        var8.field5454 = arg2;
        int var9 = 104 / ((arg4 + 75) / 32);
        var8.field5456 = arg1;
        class224.field2837.method87(82, var8);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(III)V")
    public static final void method1350(int arg0, int arg1, int arg2) {
        if (arg1 > -94) {
            field2956 = -78;
        }
        field2955++;
        class530 var3 = class242.method1402(-55, 1, arg0);
        var3.method3025((byte) -69);
        var3.field7593 = arg2;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static void method1351(boolean arg0) {
        if (arg0) {
            field2954 = -35;
        }
        field2957 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V")
    public class232(int arg0, int arg1) {
        this.field2958 = arg0;
        this.field2951 = arg1;
    }
}
