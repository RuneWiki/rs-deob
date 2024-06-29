import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class146 {

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lraa;")
    public static class353 field2298 = null;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
    public static int[] field2293;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[Ljo;")
    public class20[] field2292;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lofa;Lvj;I)Ljo;")
    private final class20 method1119(class301 arg0, class26 arg1, int arg2) {
        field2301++;
        if (class567.field8047 == arg1) {
            return class87.method760(-6733, arg0);
        } else if (class53.field848 == arg1) {
            return class532.method3147((byte) -17, arg0);
        } else if (class263.field4077 == arg1) {
            return class31.method163(-2, arg0);
        } else if (class306.field4641 == arg1) {
            return class756.method4212((byte) -24, arg0);
        } else if (class540.field7709 == arg1) {
            return class559.method3245(arg0, -114);
        } else {
            if (arg2 <= 23) {
                method1121(null, true);
            }
            if (class197.field3392 == arg1) {
                return class680.method3791(125, arg0);
            } else if (class33.field314 == arg1) {
                return method1121(arg0, true);
            } else if (class701.field9906 == arg1) {
                return class301.method1943(0, arg0);
            } else if (class70.field1085 == arg1) {
                return class25.method140(115, arg0);
            } else if (class119.field1827 == arg1) {
                return class140.method1099(arg0, 0);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLofa;)V")
    public final void method1120(byte arg0, class301 arg1) {
        field2299++;
        this.field2294 = arg1.method1952(22085);
        this.field2295 = arg1.method1989((byte) -75);
        this.field2292 = new class20[arg1.method1987(-54)];
        class26[] var3 = class257.method1731((byte) -86);
        int var4 = 0;
        if (arg0 == 15) {
            while (var4 < this.field2292.length) {
                this.field2292[var4] = this.method1119(arg1, var3[arg1.method1987(-77)], arg0 + 66);
                var4++;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lofa;Z)Lor;")
    public static final class325 method1121(class301 arg0, boolean arg1) {
        field2302++;
        class70 var2 = class425.method2652(arg0, (byte) -122);
        int var3 = arg0.method1989((byte) -73);
        if (!arg1) {
            field2300 = -59;
        }
        int var4 = arg0.method1989((byte) -128);
        int var5 = arg0.method1989((byte) -63);
        int var6 = arg0.method1989((byte) -36);
        int var7 = arg0.method1989((byte) -82);
        int var8 = arg0.method1989((byte) -67);
        return new class325(var2.field1081, var2.field1075, var2.field1082, var2.field1079, var2.field1076, var2.field1078, var2.field1071, var2.field1074, var2.field1073, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1122(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2296++;
        if (class654.field9289.field5439.method155(3) != 0 && arg5 != 0 && class115.field1790 < 50 && arg2 != -1) {
            class374.field5649[class115.field1790++] = new class625((byte) 1, arg2, arg5, arg1, arg0, 0, arg3, null);
        }
        if (arg4 != -113) {
            field2293 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method1123(byte arg0) {
        field2293 = null;
        if (arg0 != 125) {
            method1123((byte) -13);
        }
        field2298 = null;
    }
}
