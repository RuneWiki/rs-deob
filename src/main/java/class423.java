import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class423 {

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "[B")
    public static byte[] field5969 = new byte[520];

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "[I")
    public static int[] field5971 = new int[14];

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "[Z")
    public static boolean[] field5972 = new boolean[100];

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILha;BLga;)V")
    public static final void method2524(int arg0, int arg1, class66 arg2, byte arg3, class420 arg4) {
        field5970++;
        class425.field5983.method2503(10);
        if (arg3 >= -72) {
            method2526(50, true, null, 80);
        }
        if (class66.field876) {
            return;
        }
        for (class497 var5 = (class497) arg4.method2508((byte) 110); var5 != null; var5 = (class497) arg4.method2505((byte) -55)) {
            class665 var6 = class436.field6213.method3711((byte) 104, var5.field7063);
            if (class356.method2241(var6, (byte) 22)) {
                boolean var7 = class249.method1667(arg1, true, var5, arg0, arg2, var6);
                if (var7) {
                    class397.method2420((byte) -96, arg2, var5, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V")
    public static void method2525(byte arg0) {
        field5972 = null;
        field5971 = null;
        if (arg0 < -85) {
            field5969 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IZLwq;I)V")
    public static final void method2526(int arg0, boolean arg1, class176 arg2, int arg3) {
        field5973++;
        if (class169.field2433 != null || class422.field5962 || arg2 == null || class102.method709(-127, arg2) == null) {
            return;
        }
        if (!arg1) {
            method2525((byte) -9);
        }
        class169.field2433 = arg2;
        class731.field10218 = class102.method709(-56, arg2);
        class428.field6017 = 0;
        class763.field10506 = false;
        class655.field9236 = arg0;
        class117.field1461 = arg3;
    }
}
