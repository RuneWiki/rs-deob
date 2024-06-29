import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class48 extends class70 {

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field759 = -1;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "Ldf;")
    public static class51 field760 = class46.method233("floorshadows", 100);

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "Ldf;")
    public static class51 field763 = class46.method233("underlay", 100);

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "Lbg;")
    public static class217 field761 = new class217(64);

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Laj;")
    public static class44 field766;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "[Ljg;")
    public static class158[] field764;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static void method246(byte arg0) {
        field760 = null;
        field766 = null;
        field764 = null;
        field761 = null;
        field763 = null;
        if (arg0 < 8) {
            field759 = -97;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
    public static final void method247(boolean arg0, int arg1) {
        class42.field683 = new int[104];
        class172.field2825 = new int[104];
        class17.field261 = new int[104];
        class3.field23 = new int[104];
        class13.field198 = new int[104];
        field765++;
        class62.field1010 = 99;
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class142.field2383 = new byte[var2][104][104];
        class64.field1039 = new byte[var2][105][105];
        class57.field954 = new byte[var2][104][104];
        class195.field3263 = new byte[var2][104][104];
        class5.field56 = new int[var2][105][105];
        if (arg1 == -18493) {
            class3.field18 = new byte[var2][104][104];
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIZ)Ldf;")
    public static final class51 method248(int arg0, int arg1, boolean arg2) {
        field755++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return class218.field3805;
        } else if (var3 < -6) {
            return class218.field3787;
        } else if (var3 < -3) {
            return class138.field2326;
        } else if (var3 < 0) {
            return class17.field263;
        } else if (var3 > 9) {
            return class182.field3008;
        } else {
            if (arg2) {
                method248(95, 84, true);
            }
            if (var3 > 6) {
                return class231.field4038;
            } else if (var3 > 3) {
                return class131.field2189;
            } else if (var3 > 0) {
                return class106.field1742;
            } else {
                return class167.field2722;
            }
        }
    }
}
