import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class190 extends class81 {

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "Lpj;")
    public class237 field3303;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Lpj;")
    public static class237 field3302 = null;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "Lak;")
    public static class135 field3304 = new class135(64);

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "J")
    public static long field3309 = 0L;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    public static int field3311 = -1;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "[Lf;")
    public static class36[] field3310;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
    public static void method1286(int arg0) {
        field3304 = null;
        if (arg0 == 5) {
            field3310 = null;
            field3302 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class190() {
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IB)Lej;")
    public static final class49 method1288(int arg0, byte arg1) {
        class49 var2 = (class49) class55.field1131.method940((long) arg0, 85);
        field3305++;
        if (var2 != null) {
            return var2;
        } else if (arg1 <= 87) {
            return null;
        } else {
            byte[] var3 = class41.field933.method1645(true, class269.method1786(64, arg0), class222.method1474(arg0, -11960));
            class49 var4 = new class49();
            var4.field1046 = arg0;
            if (var3 != null) {
                var4.method448((byte) -60, new class32(var3));
            }
            class55.field1131.method937(-28, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBI)V")
    public static final void method1289(int arg0, byte arg1, int arg2) {
        if (arg1 >= -111) {
            field3310 = null;
        }
        field3307++;
        class270 var3 = class202.method1368(-15, 6, arg0);
        var3.method1793(13);
        var3.field4619 = arg2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static final void method1290(byte arg0) {
        class149.method1009(241, 5);
        field3301++;
        class230.method1525((byte) 116, 5);
        class77.method595(5, 123);
        class227.method1511(5, 0);
        class20.method200(5, (byte) -103);
        class181.method1243((byte) 48, 5);
        class48.method445(-38, 5);
        class224.method1486(false, 5);
        class81.method633(5, (byte) -127);
        if (arg0 > -26) {
            return;
        }
        class213.method1425(126, 5);
        class32.method342(5, (byte) -101);
        class21.method205(41, 50);
        class96.method716((byte) -124, 5);
        class188.method1278(81, 5);
        class180.field3165.method939(5, 1);
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lpj;)V")
    public class190(class237 arg0) {
        this.field3303 = arg0;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
    public static final void method1291(byte arg0) {
        if (arg0 != 103) {
            method1287(-61, 62, -86, -4, -100, -39, -2, -91);
        }
        class139.field2398 = null;
        field3306++;
        class127.field2221 = null;
        class252.field4341 = null;
        class226.field3868 = null;
        class174.field3060 = null;
        class175.field3063 = null;
    }
}
