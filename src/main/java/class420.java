import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public abstract class class420 {

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "Lcga;")
    public static class449 field5349 = new class449(52, 7);

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public static int field5352 = -1;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V", line = 3)
    public static void method2329(int arg0) {
        if (arg0 != -6693) {
            method2330(-122, 42, -0.29563582F, -33, 125, 97, false, -20, 80);
        }
        field5349 = null;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIFIIIZII)[[I", line = 15)
    public static final int[][] method2330(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field5350++;
        int[][] var9 = new int[arg7][arg3];
        class157 var10 = new class157();
        var10.field1850 = arg8;
        var10.field1847 = arg5;
        var10.field1845 = (int) (arg2 * 4096.0F);
        var10.field1856 = arg1;
        var10.field1839 = arg6;
        var10.method91((byte) 93);
        class527.method2848((byte) -112, arg3, arg7);
        if (arg4 < 88) {
            method2331((byte) 78);
        }
        for (int var11 = 0; var11 < arg7; var11++) {
            var10.method964((byte) 84, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)I", line = 57)
    public static final int method2331(byte arg0) {
        if (arg0 <= 4) {
            return 3;
        }
        field5351++;
        class208 var1 = class442.field5559;
        synchronized (class442.field5559) {
            return class442.field5559.method1226(-92);
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
    public abstract void method1591(int arg0);

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "(I)Lfs;")
    public abstract class521 method1593(int arg0);

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "(I)V")
    public abstract void method1601(int arg0);

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)Z")
    public abstract boolean method1592(byte arg0, int arg1);
}
