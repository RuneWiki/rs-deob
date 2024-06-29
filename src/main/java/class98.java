import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class98 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1419 = 0;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lec;")
    public static class178 field1421 = null;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Lqj;")
    public static class196 field1423 = class80.method502("<col=ff3000>", -48);

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "S")
    public static short field1422 = 256;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method600(int arg0) {
        field1421 = null;
        if (arg0 != 256) {
            method601(-19, -79);
        }
        field1423 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
    public static final void method601(int arg0, int arg1) {
        class85.field1246 = arg1 / arg0;
        field1420++;
    }
}
