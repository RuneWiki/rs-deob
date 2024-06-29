import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class61 extends class3 {

    @OriginalMember(owner = "client!ka", name = "ad", descriptor = "I")
    public static int field1501 = -1;

    @OriginalMember(owner = "client!ka", name = "Wc", descriptor = "Lad;")
    public static class5 field1497 = class88.method674("huffman", -115);

    @OriginalMember(owner = "client!ka", name = "Vc", descriptor = "Le;")
    public static class25 field1496 = new class25(5000);

    @OriginalMember(owner = "client!ka", name = "cd", descriptor = "Lhd;")
    public static class46 field1503 = new class46(4096);

    @OriginalMember(owner = "client!ka", name = "ed", descriptor = "Lad;")
    public static class5 field1505 = class88.method674("Wordpack geladen)3", -67);

    @OriginalMember(owner = "client!ka", name = "gd", descriptor = "Lad;")
    public static class5 field1507 = class88.method674("An", 120);

    @OriginalMember(owner = "client!ka", name = "hd", descriptor = "Lad;")
    private static class5 field1508 = class88.method674("Error connecting to server)3", 72);

    @OriginalMember(owner = "client!ka", name = "jd", descriptor = "I")
    public static int field1510 = -1;

    @OriginalMember(owner = "client!ka", name = "id", descriptor = "I")
    public static int field1509 = 0;

    @OriginalMember(owner = "client!ka", name = "kd", descriptor = "I")
    public static int field1511 = 0;

    @OriginalMember(owner = "client!ka", name = "fd", descriptor = "Lad;")
    public static class5 field1506 = field1508;

    @OriginalMember(owner = "client!ka", name = "Uc", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!ka", name = "Yc", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!ka", name = "Zc", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!ka", name = "bd", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!ka", name = "Xc", descriptor = "Ltd;")
    public class118 field1498;

    @OriginalMember(owner = "client!ka", name = "dd", descriptor = "[I")
    public static int[] field1504;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)Lhc;", line = 12)
    public final class45 method30(byte arg0) {
        ++field1502;
        if (this.field1498 == null) {
            return null;
        } else {
            class72 var2 = super.field85 != -1 && super.field82 == 0 ? class78.method605(super.field85, (byte) 20) : null;
            class72 var3 = super.field54 == -1 || super.field54 == super.field48 && var2 != null ? null : class78.method605(super.field54, (byte) 20);
            class45 var4 = this.field1498.method937(super.field109, var2, var3, super.field58, -1);
            if (var4 == null) {
                return null;
            } else {
                var4.method386();
                super.field56 = var4.field2505;
                int var5 = 111 % ((-14 - arg0) / 59);
                if (super.field103 != -1 && super.field108 != -1) {
                    class45 var6 = class52.method434(super.field103, false).method879(-1, super.field108);
                    if (var6 != null) {
                        var6.method397(0, -super.field88, 0);
                        class45[] var7 = new class45[] { var4, var6 };
                        var4 = new class45(var7, 2, true);
                    }
                }
                if (this.field1498.field2925 == 1) {
                    var4.field1122 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(B)V", line = 72)
    public static void method500(byte arg0) {
        field1496 = null;
        field1507 = null;
        field1508 = null;
        field1497 = null;
        field1503 = null;
        field1504 = null;
        if (arg0 != 23) {
            field1504 = null;
        }
        field1506 = null;
        field1505 = null;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)Z", line = 92)
    public final boolean method23(byte arg0) {
        ++field1499;
        if (arg0 > -24) {
            field1507 = null;
        }
        return this.field1498 != null;
    }
}
