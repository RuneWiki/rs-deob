import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class438 extends class66 {

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field6673 = 0;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "Lhga;")
    public static class158 field6671 = new class158(4, -2);

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public int field6670;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public int field6674;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    public int field6678;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public int field6680;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    public int field6682;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public int field6683;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "Lpca;")
    public class665 field6676;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "Lpca;")
    public class665 field6677;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Ljava/lang/String;")
    public String field6672;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "Z")
    public boolean field6681;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "[Ljava/lang/Object;")
    public Object[] field6684;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 19)
    public static void method2776(int arg0) {
        field6671 = null;
        if (arg0 != -14689) {
            method2778(42, 93, false, -29, 105, 27);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)[B", line = 35)
    public static final byte[] method2777(int arg0, boolean arg1) {
        if (!arg1) {
            method2776(116);
        }
        field6679++;
        class61 var2 = (class61) class610.field8675.method1899(-75, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class93.method902(8047, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class61(var3);
            class610.field8675.method1902(-19867, (long) arg0, var2);
        }
        return var2.field786;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZIII)I", line = 84)
    public static final int method2778(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            field6671 = null;
        }
        field6675++;
        if (class587.field8346 == null) {
            return 0;
        }
        if (arg5 < 3) {
            int var6 = arg4 >> 9;
            int var7 = arg0 >> 9;
            if (arg3 < 0 || arg1 < 0 || arg3 > class275.field4426 - 1 || class417.field6374 - 1 < arg1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class275.field4426 - 1) < var6 || class417.field6374 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class690.field9676[1][arg4 >> 9][arg0 >> 9] & 0x2) != 0;
            if ((arg4 & 0x1FF) == 0) {
                boolean var9 = (class690.field9676[1][var6 - 1][arg0 >> 9] & 0x2) != 0;
                boolean var10 = (class690.field9676[1][var6][arg0 >> 9] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class690.field9676[1][arg3][arg1] & 0x2) != 0;
                }
            }
            if ((arg0 & 0x1FF) == 0) {
                boolean var11 = (class690.field9676[1][arg4 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class690.field9676[1][arg4 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class690.field9676[1][arg3][arg1] & 0x2) != 0;
                }
            }
            if (var8) {
                arg5++;
            }
        }
        return class587.field8346[arg5].method477(-1, arg0, arg4);
    }
}
