import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class283 extends class499 {

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "Lur;")
    public class373 field3711;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "Lcu;")
    public static class145 field3712 = new class145(24, 15);

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "Lld;")
    public static class114 field3713 = new class114();

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "Lqe;")
    public static class326 field3714;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method1681(int arg0) {
        field3712 = null;
        field3714 = null;
        field3713 = null;
        if (arg0 < 90) {
            method1682(-92, -78, 28, -53, 113, 119);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)I")
    public static final int method1682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 > -14) {
            method1682(-24, 90, 81, 105, 20, -106);
        }
        field3710++;
        if (class141.field2049 == null) {
            return 0;
        }
        if (arg3 < 3) {
            int var6 = arg1 >> 7;
            int var7 = arg4 >> 7;
            if (arg5 < 0 || arg2 < 0 || arg5 > class12.field251 - 1 || arg2 > (class289.field3782 - 1)) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > (class12.field251 - 1) || var7 > (class289.field3782 - 1)) {
                return 0;
            }
            boolean var8 = (class117.field1677[1][arg1 >> 7][arg4 >> 7] & 0x2) != 0;
            if ((arg1 & 0x7F) == 0) {
                boolean var9 = (class117.field1677[1][var6 - 1][arg4 >> 7] & 0x2) != 0;
                boolean var10 = (class117.field1677[1][var6][arg4 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class117.field1677[1][arg5][arg2] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x7F) == 0) {
                boolean var11 = (class117.field1677[1][arg1 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class117.field1677[1][arg1 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class117.field1677[1][arg5][arg2] & 0x2) != 0;
                }
            }
            if (var8) {
                arg3++;
            }
        }
        return class141.field2049[arg3].method276(arg1, arg4);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIIII)Lks;")
    public static final class301 method1683(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -19434) {
            field3713 = null;
        }
        field3709++;
        class301 var5 = new class301();
        var5.field3982 = arg3;
        var5.field3981 = arg2;
        class27.field457.method173((long) arg4, var5, (byte) 122);
        class259.method1564(arg3, (byte) -116);
        class403 var6 = class213.method1345((byte) 48, arg4);
        if (var6 != null) {
            class412.method2378(var6, (byte) -123);
        }
        if (class71.field1072 != null) {
            class412.method2378(class71.field1072, (byte) -116);
            class71.field1072 = null;
        }
        class385.method2282((byte) 55);
        if (var6 != null) {
            class388.method2290(121, !arg0, var6);
        }
        if (!arg0) {
            class122.method897(arg3);
        }
        if (!arg0 && class474.field6555 != -1) {
            class269.method1615(class474.field6555, 1, (byte) 20);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lur;)V")
    public class283(class373 arg0) {
        this.field3711 = arg0;
    }
}
