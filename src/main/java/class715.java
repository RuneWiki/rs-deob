import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class715 extends class170 {

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "Lmq;")
    public static class78 field10070 = new class78(31, 0);

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "Lmq;")
    public static class78 field10074 = new class78(79, 3);

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "[F")
    public static float[] field10078 = new float[16];

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
    public static int field10068;

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "I")
    public static int field10069;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
    public static int field10071;

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "I")
    public static int field10072;

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
    public static int field10073;

    @OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
    public static int field10075;

    @OriginalMember(owner = "client!ot", name = "B", descriptor = "I")
    public static int field10076;

    @OriginalMember(owner = "client!ot", name = "C", descriptor = "I")
    public static int field10077;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method931(int arg0, OggPacket arg1) {
        field10073++;
        if (arg0 >= -87) {
            field10078 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIBLkba;III)V")
    public static final void method3966(int arg0, int arg1, byte arg2, class24 arg3, int arg4, int arg5, int arg6) {
        class35.method318(0, arg3.field5790, arg6, arg0, arg1, 0, arg3.field5784, arg5, arg3.field5779, arg4);
        field10069++;
        if (arg2 != -25) {
            field10076 = -5;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB)I")
    public static final int method3967(int arg0, byte arg1) {
        field10068++;
        return arg1 == 122 ? arg0 >>> 8 : -17;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)Z")
    public static final boolean method3968(int arg0, int arg1, int arg2) {
        if (arg1 > -14) {
            method3968(-51, 90, 42);
        }
        field10072++;
        return class382.method2301((byte) -15, arg2, arg0) | (arg2 & 0x70000) != 0 || class10.method45(0, arg0, arg2);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V")
    public final void method926(boolean arg0) {
        field10075++;
        if (!arg0) {
            field10070 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
    public static void method3969(int arg0) {
        field10078 = null;
        if (arg0 != 1812) {
            field10076 = 80;
        }
        field10070 = null;
        field10074 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lha;Ljo;IIIIIIIIII)V")
    public static final void method3970(class454 arg0, class359 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field10071++;
        if (arg4 < arg7 && arg7 < arg4 + arg10 && arg11 > (arg3 - 13) && arg3 + 3 > arg11) {
            arg8 = arg2;
        }
        String var12 = method3971((byte) -45, arg1);
        if (arg9 != 26241) {
            method3968(-39, 34, 105);
        }
        class100.field1234.method2512(class289.field3681, 0, arg8, var12, arg3, arg4 + 3, 110, class367.field5193);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLjo;)Ljava/lang/String;")
    public static final String method3971(byte arg0, class359 arg1) {
        field10077++;
        if (arg0 != -45) {
            field10070 = null;
        }
        return arg1.field5119 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class715(OggStreamState arg0) {
        super(arg0);
    }
}
