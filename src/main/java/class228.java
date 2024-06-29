import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class228 extends class90 {

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "Lqd;")
    public static class37 field3418 = new class37(32);

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3422 = "flash1:";

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "C")
    private char field3413;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "Ljava/lang/String;")
    public String field3414;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "[[[I")
    public static int[][][] field3421;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3412++;
        class267 var7 = class22.method165(arg0, false, arg4);
        if (var7 != null && var7.field4042 != null) {
            class234 var8 = new class234();
            var8.field3531 = var7;
            var8.field3530 = var7.field4042;
            class15.method118((byte) 119, var8);
        }
        class102.field1511 = arg0;
        class172.field2462 = arg4;
        class255.field3866 = arg5;
        class136.field1970 = arg1;
        if (arg6 != 0) {
            field3422 = null;
        }
        class67.field1043 = arg2;
        class275.field4416 = arg3;
        class275.field4406 = true;
        class217.method1396(false, var7);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lkl;I)V")
    public final void method1487(class114 arg0, int arg1) {
        field3420++;
        while (true) {
            int var3 = arg0.method760(false);
            if (var3 == 0) {
                int var4 = 99 % ((22 - arg1) / 51);
                return;
            }
            this.method1488(arg0, var3, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lkl;IB)V")
    private final void method1488(class114 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field3413 = class188.method1210(arg0.method741(3083), false);
        } else if (arg1 == 2) {
            this.field3410 = arg0.method759((byte) 111);
        } else if (arg1 == 5) {
            this.field3414 = arg0.method753(-128);
        }
        field3417++;
        if (arg2 > -95) {
            method1493(-95, (String) null);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Llb;")
    public static final class183 method1489(byte arg0, int arg1) {
        field3416++;
        class183 var2 = (class183) class258.field3913.method1501((long) arg1, (byte) 118);
        if (var2 != null) {
            return var2;
        } else if (arg0 >= -28) {
            return null;
        } else {
            byte[] var3 = class162.field2344.method1538(5, arg1, (byte) 64);
            class183 var4 = new class183();
            if (var3 != null) {
                var4.method1180(110, new class114(var3));
            }
            class258.field3913.method1499((long) arg1, -121, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)Z")
    public final boolean method1490(int arg0) {
        field3411++;
        if (arg0 > -12) {
            method1489((byte) -49, -23);
        }
        return this.field3413 == 's';
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
    public static void method1491(int arg0) {
        field3418 = null;
        field3421 = null;
        field3422 = null;
        if (arg0 != 182) {
            method1492((byte) -38);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static final void method1492(byte arg0) {
        if (arg0 <= 38) {
            field3422 = null;
        }
        field3418.method257(false);
        field3419++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1493(int arg0, String arg1) {
        field3415++;
        if (class213.field3068 == null) {
            return;
        }
        int var2 = 0;
        long var3 = class109.method712((byte) -126, arg1);
        if (var3 == 0L) {
            return;
        }
        if (arg0 != -16991) {
            field3422 = null;
        }
        while (var2 < class213.field3068.length && class213.field3068[var2].field3851 != var3) {
            var2++;
        }
        if (var2 < class213.field3068.length && class213.field3068[var2] != null) {
            class242.field3619++;
            class95.field1451.method522(182, 28727);
            class95.field1451.method765(532401312, class213.field3068[var2].field3851);
        }
    }
}
