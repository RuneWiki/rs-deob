import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class42 extends class114 {

    @OriginalMember(owner = "client!he", name = "I", descriptor = "Lwd;")
    public class40 field848;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "[I")
    public static int[] field846 = new int[2];

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field849 = -1;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "[I")
    public static int[] field851 = new int[4096];

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "Lpi;")
    public static class191 field847;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "Lvb;")
    public static class226 field850;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z")
    public static final boolean method332(int arg0, int arg1, int arg2) {
        int var3 = class105.field1947[arg0][arg1][arg2];
        if (-class126.field2266 == var3) {
            return false;
        } else if (class126.field2266 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class175.method1188(var4 + 1, class243.field4208[arg0][arg1][arg2], var5 + 1) && class175.method1188(var4 + 128 - 1, class243.field4208[arg0][arg1 + 1][arg2], var5 + 1) && class175.method1188(var4 + 128 - 1, class243.field4208[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class175.method1188(var4 + 1, class243.field4208[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class105.field1947[arg0][arg1][arg2] = class126.field2266;
                return true;
            } else {
                class105.field1947[arg0][arg1][arg2] = -class126.field2266;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)V")
    public static void method333(int arg0) {
        field850 = null;
        field846 = null;
        field847 = null;
        if (arg0 != 16926) {
            method332(122, -44, 107);
        }
        field851 = null;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lwd;)V")
    public class42(class40 arg0) {
        this.field848 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field851[var0] = class193.method1302(false, var0);
        }
        field852 = 1;
    }
}
