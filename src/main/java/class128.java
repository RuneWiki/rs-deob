import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class128 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1671 = -60;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1670 = 0;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I", line = 4)
    public static final int method814(int arg0, int arg1) {
        int var7 = arg1 - 1;
        field1669++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg0 != 423660257) {
            field1670 = -77;
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 30)
    public static final String method815(int arg0, boolean arg1) {
        field1672++;
        if (!arg1) {
            method814(94, -10);
        }
        class585 var2 = (class585) class604.field8417.method2552((long) arg0, -1);
        if (var2 != null) {
            class638 var3 = var2.field8189.method3708(1);
            if (var3 != null) {
                double var4 = var2.field8189.method3696((byte) -100);
                if ((double) var3.method3593(-48) <= var4 && var4 <= (double) var3.method3591(-6085)) {
                    return var3.method3585(22875);
                }
            }
        }
        return null;
    }
}
