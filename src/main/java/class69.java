import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class69 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lia;")
    private static class257 field1372 = class28.method234(86, "Prepared sound engine");

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "[I")
    public static int[] field1378 = new int[5];

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Lia;")
    public static class257 field1377 = field1372;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "J")
    public static long field1373;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Lmb;")
    public static class178 field1371;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "[Z")
    public static boolean[] field1375;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Z")
    public static final boolean method524(byte arg0) {
        int var1 = 49 / ((80 - arg0) / 39);
        field1376++;
        return class215.field3651;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILme;)Lia;")
    public static final class257 method525(int arg0, class44 arg1) {
        field1374++;
        if (class137.method946(client.method590(arg1), (byte) 116) == 0) {
            return null;
        } else if (arg0 != -10182) {
            return null;
        } else if (arg1.field914 == null || arg1.field914.method1716((byte) 38).method1679((byte) 96) == 0) {
            return class87.field1695 ? class90.field1726 : null;
        } else {
            return arg1.field914;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static void method526(int arg0) {
        if (arg0 != -1) {
            method525(-40, (class44) null);
        }
        field1378 = null;
        field1375 = null;
        field1371 = null;
        field1372 = null;
        field1377 = null;
    }
}
