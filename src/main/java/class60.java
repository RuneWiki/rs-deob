import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class60 extends class309 {

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!tn", name = "N", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!tn", name = "L", descriptor = "Lok;")
    public static class169 field698;

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "Lob;")
    public static class521 field699;

    @OriginalMember(owner = "client!tn", name = "O", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field701;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "[Lqv;")
    public static class311[] field693;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "(B)V", line = 4)
    public static void method359(byte arg0) {
        field699 = null;
        field701 = null;
        if (arg0 != 48) {
            method363((byte) 126);
        }
        field693 = null;
        field698 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BIZZI)V", line = 17)
    public static final void method360(byte arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field691;
        if (arg0 >= -76) {
            field700 = 69;
        }
        class456.method2810(arg2, class55.field637.length - 1, arg3, 0, -97, arg4, arg1);
        class99.field1353 = 0;
        class463.field6903 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)V", line = 30)
    public static final void method361(int arg0, byte arg1) {
        ++field697;
        if (~class178.field2307 != ~arg0) {
            class308.field4128 = class426.field6200 = class488.field7163[arg0];
            class207.method1312(-105);
            class495.field7230 = new int[4][class308.field4128 >> 3][class426.field6200 >> 3];
            class291.field3842 = new int[class308.field4128][class426.field6200];
            class74.field937 = new int[class308.field4128][class426.field6200];
            for (int var2 = 0; var2 < 4; ++var2) {
                class96.field1223[var2] = class15.method88(class426.field6200, class308.field4128, 1);
            }
            class33.field339 = new byte[4][class308.field4128][class426.field6200];
            class235.method1488(class426.field6200, 4, (byte) 54, class308.field4128);
            if (arg1 == -18) {
                class43.method247(5, class343.field4596, class426.field6200 >> 3, class308.field4128 >> 3);
                class178.field2307 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIF)V", line = 66)
    public class60(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IF)V", line = 70)
    public final void method362(int arg0, float arg1) {
        int var3 = 63 / ((22 - arg0) / 50);
        super.field4134 = arg1;
        ++field692;
    }

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "(B)I", line = 81)
    public static final int method363(byte arg0) {
        ++field694;
        class509 var1 = class528.field7748;
        synchronized (class528.field7748) {
            if (arg0 != -20) {
                method361(-68, (byte) -33);
            }
            return class528.field7748.method3038(0);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIZ[Ljk;B)V", line = 94)
    public static final void method364(int arg0, int arg1, int arg2, boolean arg3, class450[] arg4, byte arg5) {
        ++field695;
        if (arg5 >= -123) {
            field701 = null;
        }
        for (int var6 = 0; arg4.length > var6; ++var6) {
            class450 var7 = arg4[var6];
            if (var7 != null && ~var7.field6550 == ~arg0) {
                class380.method2321(arg3, var7, arg2, 0, arg1);
                class274.method1668(-32, var7, arg1, arg2);
                if (var7.field6634 > -var7.field6612 + var7.field6632) {
                    var7.field6634 = var7.field6632 - var7.field6612;
                }
                if (~var7.field6634 > -1) {
                    var7.field6634 = 0;
                }
                if (-var7.field6573 + var7.field6684 < var7.field6687) {
                    var7.field6687 = -var7.field6573 + var7.field6684;
                }
                if (~var7.field6687 > -1) {
                    var7.field6687 = 0;
                }
                if (~var7.field6686 == -1) {
                    class433.method2667(0, var7, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIZ)V", line = 148)
    public final void method365(int arg0, int arg1, int arg2, boolean arg3) {
        ++field696;
        super.field4143 = arg1;
        super.field4142 = arg0;
        super.field4136 = arg2;
        if (arg3) {
            method360((byte) -13, -38, false, true, 88);
        }
    }
}
