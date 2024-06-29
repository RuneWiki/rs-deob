import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class73 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "[[I")
    public static int[][] field1288 = new int[128][128];

    @OriginalMember(owner = "client!u", name = "c", descriptor = "[Z")
    public static boolean[] field1289 = new boolean[8];

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lud;I)Lk;")
    public static final class562 method735(class35 arg0, int arg1) {
        field1287++;
        class256 var2 = class153.method1175(13282, arg0);
        if (arg1 == -11043) {
            int var3 = arg0.method234((byte) -110);
            int var4 = arg0.method234((byte) -96);
            return new class562(var2.field3713, var2.field3711, var2.field3710, var2.field3702, var2.field3705, var2.field3701, var2.field3714, var2.field3709, var2.field3715, var3, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method736(int arg0) {
        field1288 = null;
        field1289 = null;
        if (arg0 != 128) {
            method735(null, -1);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIBI)V")
    public static final void method737(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1290++;
        class354 var5 = class501.method3012(arg1, 8, 2145997216);
        var5.method2222(-122);
        var5.field4990 = arg0;
        var5.field4980 = arg4;
        if (arg3 != 21) {
            field1288 = null;
        }
        var5.field4979 = arg2;
    }
}
