import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class403 {

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "Lla;")
    public static class422 field5986;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "[Lgu;")
    public static class726[] field5984;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIII)V")
    public static final void method2491(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5983++;
        if (arg0 > -25) {
            method2491(61, 37, -54, -9, -124);
        }
        for (int var5 = 0; var5 < class429.field6280; var5++) {
            Rectangle var6 = class466.field6792[var5];
            if (var6.x + var6.width > arg4 && var6.x < arg1 + arg4 && (var6.y + var6.height) > arg2 && var6.y < (arg2 + arg3)) {
                class376.field5666[var5] = true;
            }
        }
        class438.method2696(arg2, arg2 + arg3, arg4 - -arg1, (byte) 83, arg4);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
    public static void method2492(byte arg0) {
        field5984 = null;
        if (arg0 != -113) {
            field5984 = null;
        }
        field5986 = null;
    }
}
