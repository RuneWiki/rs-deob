import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class485 {

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!fja", name = "c", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "Lsf;")
    public static class551 field6252;

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(IIFZIIBII)[[I", line = 3)
    public static final int[][] method2719(int arg0, int arg1, float arg2, boolean arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field6253++;
        int[][] var9 = new int[arg7][arg1];
        if (arg6 != 91) {
            method2720((byte) -119, 104, -27, true, null, -76, 117);
        }
        class47 var10 = new class47();
        var10.field538 = (int) (arg2 * 4096.0F);
        var10.field540 = arg4;
        var10.field544 = arg3;
        var10.field541 = arg0;
        var10.field543 = arg5;
        var10.method292((byte) 124);
        class76.method469(arg7, true, arg1);
        for (int var11 = 0; var11 < arg7; var11++) {
            var10.method289(255, var9[var11], var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(BIIZLwm;II)V", line = 35)
    public static final void method2720(byte arg0, int arg1, int arg2, boolean arg3, class30 arg4, int arg5, int arg6) {
        class540.field6799 = arg5;
        class685.field8831 = arg6;
        class416.field5500 = arg4;
        class691.field8879 = arg3;
        field6254++;
        class745.field10115 = arg2;
        class168.field2234 = null;
        class693.field8903 = 1;
        class483.field6236 = arg1;
        if (arg0 < 34) {
            field6252 = null;
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(Z)V", line = 61)
    public static void method2721(boolean arg0) {
        field6252 = null;
        if (arg0) {
            method2721(true);
        }
    }
}
