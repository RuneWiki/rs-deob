import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class300 {

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field4812 = 0;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "J")
    public static long field4811 = -1L;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "[[I")
    public static int[][] field4814 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "[I")
    public static int[] field4818 = new int[25];

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "[B")
    public static byte[] field4817 = new byte[520];

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field4813 = 0;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lnk;")
    public static class326 field4819;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Luo;")
    public static class468 field4809;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[S")
    public static short[] field4816;

    static {
        new class306(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field4819 = new class326(41, 0);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)Z", line = 4)
    public static final boolean method1921(int arg0, byte arg1) {
        int var2 = -73 / ((arg1 + 25) / 36);
        field4815++;
        for (class162 var3 = (class162) class108.field1934.method2538(-3); var3 != null; var3 = (class162) class108.field1934.method2535((byte) -70)) {
            if (class63.method416(var3.field2576, true) && ((long) arg0) == var3.field2578) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V", line = 41)
    public static void method1922(boolean arg0) {
        if (arg0) {
            method1921(61, (byte) -77);
        }
        field4816 = null;
        field4818 = null;
        field4817 = null;
        field4809 = null;
        field4819 = null;
        field4814 = null;
    }
}
