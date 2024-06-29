import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class668 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)I")
    public static final int method3699(int arg0, int arg1) {
        if (arg0 != 28069) {
            return 113;
        }
        field9321++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }
}
