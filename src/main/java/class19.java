import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class19 {

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "[I")
    public static int[] field176;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBI)Z")
    public static final boolean method85(int arg0, byte arg1, int arg2) {
        field177++;
        if (arg1 != 112) {
            field176 = null;
        }
        return (class578.method3102(arg2, arg0, (byte) 105) | class307.method1811(arg2, arg0, 81) | class298.method1776(96, arg2, arg0)) & class650.method3506(2048, arg0, arg2);
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)V")
    public static void method86(int arg0) {
        if (arg0 == 22228) {
            field176 = null;
        }
    }
}
