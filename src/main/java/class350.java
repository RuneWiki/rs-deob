import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class350 {

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field5115 = 1400;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Ljj;")
    public static class398 field5120 = new class398(67, -1);

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field5121 = 0;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static void method2187(byte arg0) {
        field5120 = null;
        if (arg0 != 72) {
            method2187((byte) -11);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIILwda;Lwda;)V")
    public static final void method2188(int arg0, int arg1, int arg2, class142 arg3, class142 arg4) {
        class651 var5 = class29.method180(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field9220 = arg3;
            var5.field9224 = arg4;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static final void method2189(int arg0) {
        class681.field9681 = new class69(class243.field3168.method1491(field5121, (byte) 125), "", class664.field9413, 1002, -1, 0L, arg0, 0, true, false);
        field5116++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
    public static final void method2190(int arg0, int arg1) {
        field5117++;
        if (arg1 != -1) {
            method2189(-103);
        }
        if (class369.field5301 == 0) {
            class648.field9178.method346(2, arg0);
        } else {
            class333.field4865 = arg0;
        }
    }
}
