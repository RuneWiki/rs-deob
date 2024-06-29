import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 extends class35 {

    @OriginalMember(owner = "client!hd", name = "Uc", descriptor = "Ljd;")
    public static class66 field1340 = new class66();

    @OriginalMember(owner = "client!hd", name = "Yc", descriptor = "Lid;")
    public static class60 field1344 = class11.method72("null", (byte) -127);

    @OriginalMember(owner = "client!hd", name = "Xc", descriptor = "Lid;")
    public static class60 field1343 = class11.method72("nicht hergestellt werden)3", (byte) -43);

    @OriginalMember(owner = "client!hd", name = "Wc", descriptor = "Lid;")
    private static class60 field1342 = class11.method72("Connecting to server)3)3)3", (byte) -51);

    @OriginalMember(owner = "client!hd", name = "cd", descriptor = "Lid;")
    public static class60 field1348 = field1342;

    @OriginalMember(owner = "client!hd", name = "Vc", descriptor = "Lid;")
    private static class60 field1341 = class11.method72("Please subscribe)1 or use a different world)3", (byte) 125);

    @OriginalMember(owner = "client!hd", name = "ad", descriptor = "Lid;")
    public static class60 field1346 = field1341;

    @OriginalMember(owner = "client!hd", name = "Zc", descriptor = "Lid;")
    public static class60 field1345 = class11.method72("Ihr Spielkonto wurde deaktiviert)3", (byte) 123);

    @OriginalMember(owner = "client!hd", name = "ed", descriptor = "Lid;")
    private static class60 field1350 = class11.method72("Unexpected server response", (byte) -58);

    @OriginalMember(owner = "client!hd", name = "dd", descriptor = "Lid;")
    public static class60 field1349 = field1350;

    @OriginalMember(owner = "client!hd", name = "Qc", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!hd", name = "Sc", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!hd", name = "bd", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!hd", name = "Rc", descriptor = "Lwa;")
    public class154 field1337;

    @OriginalMember(owner = "client!hd", name = "Tc", descriptor = "Lja;")
    public static class63 field1339;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
    public static void method391(byte arg0) {
        field1350 = null;
        field1339 = null;
        field1344 = null;
        field1348 = null;
        field1342 = null;
        field1340 = null;
        field1341 = null;
        field1345 = null;
        field1343 = null;
        field1349 = null;
        if (arg0 <= 58) {
            field1345 = null;
        }
        field1346 = null;
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)Lka;")
    public final class70 method1(int arg0) {
        ++field1336;
        if (this.field1337 == null) {
            return null;
        } else {
            class46 var2 = ~super.field806 != 0 && super.field842 == 0 ? class44.method344(super.field806, (byte) -106) : null;
            class46 var3 = ~super.field875 == 0 || ~super.field875 == ~super.field832 && var2 != null ? null : class44.method344(super.field875, (byte) -92);
            int var4 = -113 % ((-1 - arg0) / 43);
            class70 var5 = this.field1337.method1176(super.field820, -71, var3, super.field858, var2);
            if (var5 == null) {
                return null;
            } else {
                var5.method544();
                super.field881 = var5.field1272;
                if (super.field839 != -1 && ~super.field850 != 0) {
                    class70 var6 = class13.method81(21299, super.field839).method940(31710, super.field850);
                    if (var6 != null) {
                        var6.method528(0, -super.field830, 0);
                        class70[] var7 = new class70[] { var5, var6 };
                        var5 = new class70(var7, 2);
                    }
                }
                if (~this.field1337.field3463 == -2) {
                    var5.field1679 = true;
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)Z")
    public final boolean method2(byte arg0) {
        ++field1338;
        if (this.field1337 == null) {
            return false;
        } else {
            if (arg0 != 37) {
                field1341 = null;
            }
            return true;
        }
    }
}
