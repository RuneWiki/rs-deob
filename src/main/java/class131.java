import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class131 {

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Lsb;")
    public static class98 field2333 = class47.method368("mem=", 0);

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[Ljd;")
    public static class74[] field2334 = new class74[500];

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Lq;")
    public static class148 field2329 = null;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Lub;")
    public static class8 field2330;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "[S")
    public static short[] field2331;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method989(byte arg0) {
        field2334 = null;
        field2330 = null;
        field2333 = null;
        if (arg0 != -79) {
            field2331 = null;
        }
        field2329 = null;
        field2331 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)V")
    public static final void method990(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 5064) {
            field2331 = null;
        }
        if (class37.field627 != 0 && arg3 != 0 && class105.field1866 < 50 && arg1 != -1) {
            class181.field3120[class105.field1866] = arg1;
            class226.field3898[class105.field1866] = arg3;
            class211.field3617[class105.field1866] = arg2;
            class75.field1320[class105.field1866] = null;
            class148.field2706[class105.field1866] = 0;
            class105.field1866++;
        }
        field2332++;
    }
}
