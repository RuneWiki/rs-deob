import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class45 extends class61 {

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "Lwm;")
    public static class152 field721 = class157.method1048(" s(West connect-B)3", 107);

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "[Lii;")
    public static class212[] field711 = new class212[28];

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    public static int field726 = 0;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field718 = 0;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "Lwm;")
    public static class152 field723 = class157.method1048(")3", 124);

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    private int field713;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "Lwm;")
    public class152 field715;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V", line = 16)
    public static final void method306(boolean arg0) {
        for (class172 var1 = (class172) class94.field1334.method1221((byte) 97); var1 != null; var1 = (class172) class94.field1334.method1223(53)) {
            if (var1.field2749) {
                var1.method1155((byte) 60);
            }
        }
        field725++;
        if (arg0) {
            return;
        }
        for (class172 var2 = (class172) class17.field240.method1221((byte) 113); var2 != null; var2 = (class172) class17.field240.method1223(64)) {
            if (var2.field2749) {
                var2.method1155((byte) 48);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)Z", line = 57)
    public final boolean method307(int arg0) {
        field724++;
        if (arg0 <= 122) {
            field721 = (class152) null;
        }
        return this.field713 == 115;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILhi;I)V", line = 68)
    private final void method308(int arg0, class291 arg1, int arg2) {
        field710++;
        if (arg2 != -1606) {
            this.method308(68, (class291) null, -101);
        }
        if (arg0 == 1) {
            this.field713 = arg1.method2011(arg2 + 1590);
        } else if (arg0 == 2) {
            this.field720 = arg1.method1969((byte) -16);
        } else if (arg0 == 5) {
            this.field715 = arg1.method2017(true);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIII)V", line = 98)
    public static final void method309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg2 - arg6;
        int var9 = arg6 + arg7;
        int var10 = arg0 + arg6;
        int var11 = arg3 - arg6;
        field716++;
        for (int var12 = arg7; var12 < var9; var12++) {
            class275.method1885(arg5, class179.field2843[var12], arg0, arg3, -2611);
        }
        for (int var13 = arg2; var13 > var8; var13--) {
            class275.method1885(arg5, class179.field2843[var13], arg0, arg3, -2611);
        }
        if (arg1 != -1) {
            method309(91, -88, 10, 120, 27, -93, -126, 28);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class179.field2843[var14];
            class275.method1885(arg5, var15, arg0, var10, -2611);
            class275.method1885(arg4, var15, var10, var11, -2611);
            class275.method1885(arg5, var15, var11, arg3, -2611);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)V", line = 153)
    public static final void method310(byte arg0, int arg1) {
        field727++;
        class85.field1194.method1617(arg1, 50);
        class205.field3320.method1617(arg1, 50);
        if (arg0 < 116) {
            method306(true);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLhi;)V", line = 175)
    public final void method311(byte arg0, class291 arg1) {
        field722++;
        if (arg0 > -57) {
            return;
        }
        while (true) {
            int var3 = arg1.method2011(-105);
            if (var3 == 0) {
                return;
            }
            this.method308(var3, arg1, -1606);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIB)I", line = 198)
    public static final int method312(int arg0, int arg1, byte arg2) {
        if (arg2 < 94) {
            field717 = -60;
        }
        class123 var3 = (class123) class225.field3655.method1586((long) arg1, -57);
        field714++;
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field1729.length) {
            return var3.field1729[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V", line = 224)
    public static void method313(int arg0) {
        field711 = null;
        if (arg0 > -68) {
            field717 = 62;
        }
        field723 = null;
        field721 = null;
    }
}
