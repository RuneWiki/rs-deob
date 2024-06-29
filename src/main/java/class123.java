import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class123 extends class294 {

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field1690 = 0;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field1694 = -1;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public int field1697;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "Lhm;")
    public class352 field1696;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Ljava/awt/Frame;")
    public static Frame field1698;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "[Lro;")
    public class117[] field1695;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBLtq;I)Z", line = 3)
    public final boolean method862(int arg0, byte arg1, class63 arg2, int arg3) {
        if (arg1 != 123) {
            method865(89);
        }
        field1691++;
        if (this.field1695 != null) {
            for (int var5 = 0; var5 < this.field1695.length; var5++) {
                if (this.field1695[var5].method840(arg0, arg3) && this.field1696.method259(arg2, arg0, -125, arg3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Lmp;", line = 39)
    public static final class100 method863(int arg0, int arg1, int arg2) {
        class337 var3 = class170.field2427[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5047;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lcj;B)V", line = 53)
    public static final void method864(class123 arg0, byte arg1) {
        arg0.field1696 = null;
        if (arg1 > -55) {
            return;
        }
        field1699++;
        int var2 = arg0.field1695.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field1695[var3].field1628 = false;
        }
        class250[] var4 = class96.field1390;
        synchronized (class96.field1390) {
            if (var2 < class96.field1390.length && class456.field6470[var2] < 200) {
                class96.field1390[var2].method1597(arg0, (byte) 66);
                int var10002 = class456.field6470[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 84)
    public static void method865(int arg0) {
        if (arg0 != 0) {
            method865(-95);
        }
        field1698 = null;
    }
}
