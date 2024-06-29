import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class279 {

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "Luw;")
    public static class208 field3622 = new class208(71, -1);

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "Lhu;")
    public static class238 field3624 = new class238();

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "[Lvi;")
    public static class388[] field3626;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "[[B")
    public static byte[][] field3625;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V", line = 3)
    public static void method1713(int arg0) {
        field3622 = null;
        field3626 = null;
        field3625 = null;
        field3624 = null;
        if (arg0 != -5347) {
            field3624 = null;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IZ)Z", line = 20)
    public static final boolean method1714(int arg0, boolean arg1) {
        if (arg1) {
            method1715(-14, 21, 76, true, 19, -76, -116, -0.8810822F);
        }
        field3621++;
        return arg0 == 5 || arg0 == 53 || arg0 == 44 || arg0 == 21 || arg0 == 12 || arg0 == 49 || arg0 == 9;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIZIIIF)[I", line = 31)
    public static final int[] method1715(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, float arg7) {
        if (arg5 < 18) {
            method1713(22);
        }
        field3623++;
        int[] var8 = new int[arg0];
        class47 var9 = new class47();
        var9.field538 = (int) (arg7 * 4096.0F);
        var9.field540 = arg2;
        var9.field541 = arg4;
        var9.field543 = arg6;
        var9.field544 = arg3;
        var9.field542 = arg1;
        var9.method292((byte) 77);
        class76.method469(1, true, arg0);
        var9.method289(255, var8, 0);
        return var8;
    }
}
