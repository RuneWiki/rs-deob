import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class475 {

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)V")
    public static final void method2750(int arg0, int arg1) {
        if (arg0 != -25446) {
            field6801 = -13;
        }
        field6799++;
        class21 var2 = class601.method3413(arg1, 12, (byte) 90);
        var2.method227(true);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZII)V")
    public static final void method2751(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            method2751(-40, true, 118, 24);
        }
        field6800++;
        class21 var4 = class601.method3413(arg2, 11, (byte) 92);
        var4.method230(18340);
        var4.field302 = arg3;
        var4.field308 = arg0;
    }

    static {
        new class567(null, "der Spieler ist momentan nicht verfügbar.", null, null);
    }
}
