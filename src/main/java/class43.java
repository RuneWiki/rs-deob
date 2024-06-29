import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 extends class24 {

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "[Lia;")
    public class57[] field863;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
    public static int field857 = -1;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "Lqf;")
    private static class117 field852 = class72.method514(122, "This computers address has been blocked");

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public static int field854 = 0;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "[I")
    public static int[] field859 = new int[128];

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    public static int field861 = 255;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "[J")
    public static long[] field862 = new long[100];

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "[[[Lad;")
    public static class5[][][] field858 = new class5[4][104][104];

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "Lqf;")
    public static class117 field860 = field852;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field855 = 0;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static void method300(byte arg0) {
        field859 = null;
        if (arg0 < 121) {
            field857 = -103;
        }
        field862 = null;
        field860 = null;
        field858 = null;
        field852 = null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
    public final boolean method301(int arg0, int arg1) {
        if (arg0 == 4) {
            field853++;
            return this.field863[arg1].field1166;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljb;Ljb;IZ)V")
    public class43(class64 arg0, class64 arg1, int arg2, boolean arg3) {
        class5 var5 = new class5();
        int var6 = arg0.method440(arg2, false);
        this.field863 = new class57[var6];
        int[] var7 = arg0.method457(arg2, true);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method458(false, var7[var8], arg2);
            class100 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class100 var12 = (class100) var5.method27(18823); var12 != null; var12 = (class100) var5.method25((byte) -126)) {
                if (var12.field2414 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method441(0, var11, -25850);
                } else {
                    var13 = arg1.method441(var11, 0, -25850);
                }
                var10 = new class100(var11, var13);
                var5.method22(var10, (byte) 70);
            }
            this.field863[var7[var8]] = new class57(var9, var10);
        }
    }
}
