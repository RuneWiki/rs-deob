import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class class254 {

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3654 = new String[100];

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field3653 = 0;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Lmia;")
    public static class63 field3652 = new class63(12, 1);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
    public static void method1670(byte arg0) {
        field3652 = null;
        field3654 = null;
        if (arg0 != -75) {
            field3653 = -18;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBII)I")
    public static final int method1671(int arg0, byte arg1, int arg2, int arg3) {
        field3651++;
        if (class735.field10311 < 100) {
            return -2;
        }
        if (arg1 != -87) {
            field3654 = null;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg0 - class84.field1201;
        int var7 = arg2 - class84.field1190;
        for (class622 var8 = (class622) class84.field1180.method1195(arg1 + 87); var8 != null; var8 = (class622) class84.field1180.method1201(2)) {
            if (var8.field8729 == arg3) {
                int var9 = var8.field8732;
                int var10 = var8.field8735;
                int var11 = var9 + class84.field1201 << 14 | class84.field1190 + var10;
                int var12 = (var7 - var10) * (var7 - var10) + (var6 - var9) * (var6 - var9);
                if (var4 < 0 || var12 < var5) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }
}
