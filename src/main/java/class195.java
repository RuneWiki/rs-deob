import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class195 {

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field3115 = 0;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field3116 = -1;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Leh;")
    public static class137 field3114;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "[I")
    public static int[] field3112;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;IJBILjava/lang/String;S)V")
    public static final void method1373(int arg0, String arg1, int arg2, long arg3, byte arg4, int arg5, String arg6, short arg7) {
        field3113++;
        if (class262.field4250) {
            return;
        }
        if (arg4 >= -69) {
            field3114 = null;
        }
        if (class34.field437 >= 500) {
            return;
        }
        class191.field3084[class34.field437] = arg6;
        class78.field977[class34.field437] = arg1;
        class187.field2989[class34.field437] = arg2 == -1 ? class136.field2157 : arg2;
        class155.field2423[class34.field437] = arg7;
        class276.field4403[class34.field437] = arg3;
        class251.field4104[class34.field437] = arg5;
        class61.field805[class34.field437] = arg0;
        class34.field437++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public static void method1374(boolean arg0) {
        field3114 = null;
        if (arg0) {
            method1373(41, (String) null, -112, 97L, (byte) -6, -47, (String) null, (short) 113);
        }
        field3112 = null;
    }
}
