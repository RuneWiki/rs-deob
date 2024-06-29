import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class473 extends class425 {

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public int field6709 = -1;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Z")
    public boolean field6707 = false;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Lja;")
    public static class254 field6705 = new class254(4, 1, 1, 1);

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field6710 = 0;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "[I")
    public static int[] field6711 = new int[1];

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public int field6701;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public int field6702;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public int field6704;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public int field6706;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public int field6712;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLr;Lhga;II)V")
    public static final void method2834(byte arg0, class167 arg1, class158 arg2, int arg3, int arg4) {
        if (arg0 < 12) {
            method2834((byte) -89, null, null, -112, 63);
        }
        field6703++;
        class38.field1052.method1222((byte) -95);
        if (class368.field5461) {
            return;
        }
        for (class473 var5 = (class473) arg2.method1224(-2); var5 != null; var5 = (class473) arg2.method1232(-2)) {
            class288 var6 = class407.field5864.method3355(var5.field6709, (byte) 74);
            if (class47.method597(50, var6)) {
                boolean var7 = class658.method3749(var6, arg1, arg3, arg4, var5, -121);
                if (var7) {
                    class446.method2685(var6, var5, arg1, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBIIIII)Ljs;")
    public static final class304 method2835(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6708++;
        if (arg1 < 86) {
            return null;
        }
        long var7 = (long) arg3 * 76724863L ^ (long) arg2 * 32147369L ^ (long) arg6 * 475427L ^ (long) arg5 * 67481L ^ (long) arg0 * 97549L ^ (long) arg4 * 986053L;
        class304 var9 = (class304) class290.field4368.method1900(var7, -110);
        if (var9 == null) {
            class304 var10 = class140.field2463.method96(arg5, arg0, arg6, arg4, arg2, arg3);
            class290.field4368.method1904(var10, var7, -1);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method2836(int arg0) {
        if (arg0 != 1) {
            method2834((byte) -67, null, null, 13, 109);
        }
        field6705 = null;
        field6711 = null;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I)V")
    public class473(int arg0) {
        this.field6709 = arg0;
    }
}
