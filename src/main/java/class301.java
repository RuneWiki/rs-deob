import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class301 {

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIBIII)Llj;")
    public static final class60 method1746(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3744++;
        long var7 = (long) arg2 * 32147369L ^ (long) arg5 * 986053L ^ (long) arg0 * 67481L ^ (long) arg4 * 97549L ^ (long) arg1 * 475427L ^ (long) arg6 * 76724863L;
        if (arg3 != -24) {
            field3745 = -59;
        }
        class60 var9 = (class60) class472.field6808.method78(0, var7);
        if (var9 == null) {
            class60 var10 = class185.field2107.method961(arg0, arg4, arg1, arg5, arg2, arg6);
            class472.field6808.method92(1, var7, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILal;)I")
    public static final int method1747(int arg0, class307 arg1) {
        if (arg0 != 1564) {
            method1750(null, 28);
        }
        field3747++;
        if (class107.field1160 == arg1) {
            return 9216;
        } else if (class73.field764 == arg1) {
            return 34065;
        } else if (class102.field1107 == arg1) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public static final void method1748(int arg0, int arg1, int arg2, String arg3, int arg4) {
        field3742++;
        class452 var5 = class633.method3558(arg0, -1, arg4);
        if (var5 == null) {
            return;
        }
        if (var5.field6320 != null) {
            class213 var6 = new class213();
            var6.field2592 = var5;
            var6.field2594 = arg1;
            var6.field2587 = var5.field6320;
            var6.field2599 = arg3;
            class281.method1642(var6);
        }
        if (class421.field5601 != 10 || !client.method3750(var5).method1803(arg1 - 1, -22899)) {
            return;
        }
        if (arg1 == 1) {
            class46.field478++;
            class653 var7 = class699.method3845((byte) 45, class39.field395, class400.field5383);
            class129.method733(arg0, arg4, var5.field6434, var7, 12354);
            class568.method3220(var7, (byte) 58);
        }
        if (arg1 == 2) {
            class103.field1113++;
            class653 var8 = class699.method3845((byte) 45, class39.field395, class64.field660);
            class129.method733(arg0, arg4, var5.field6434, var8, 12354);
            class568.method3220(var8, (byte) 88);
        }
        if (arg1 == 3) {
            class269.field3350++;
            class653 var9 = class699.method3845((byte) 45, class39.field395, class585.field8303);
            class129.method733(arg0, arg4, var5.field6434, var9, 12354);
            class568.method3220(var9, (byte) 77);
        }
        if (arg1 == 4) {
            class530.field7462++;
            class653 var10 = class699.method3845((byte) 45, class39.field395, class446.field6292);
            class129.method733(arg0, arg4, var5.field6434, var10, 12354);
            class568.method3220(var10, (byte) 99);
        }
        if (arg1 == 5) {
            class319.field3936++;
            class653 var11 = class699.method3845((byte) 45, class39.field395, class226.field2785);
            class129.method733(arg0, arg4, var5.field6434, var11, 12354);
            class568.method3220(var11, (byte) 62);
        }
        if (arg1 == 6) {
            class585.field8300++;
            class653 var12 = class699.method3845((byte) 45, class39.field395, class26.field238);
            class129.method733(arg0, arg4, var5.field6434, var12, 12354);
            class568.method3220(var12, (byte) 45);
        }
        if (arg1 == 7) {
            class426.field6062++;
            class653 var13 = class699.method3845((byte) 45, class39.field395, class126.field1429);
            class129.method733(arg0, arg4, var5.field6434, var13, arg2 ^ 0x304A);
            class568.method3220(var13, (byte) 117);
        }
        if (arg1 == arg2) {
            class423.field5975++;
            class653 var14 = class699.method3845((byte) 45, class39.field395, class434.field6128);
            class129.method733(arg0, arg4, var5.field6434, var14, 12354);
            class568.method3220(var14, (byte) 50);
        }
        if (arg1 == 9) {
            class496.field7183++;
            class653 var15 = class699.method3845((byte) 45, class39.field395, class272.field3381);
            class129.method733(arg0, arg4, var5.field6434, var15, 12354);
            class568.method3220(var15, (byte) 111);
        }
        if (arg1 == 10) {
            class476.field6865++;
            class653 var16 = class699.method3845((byte) 45, class39.field395, class522.field7397);
            class129.method733(arg0, arg4, var5.field6434, var16, 12354);
            class568.method3220(var16, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V")
    public static final void method1749(int arg0, int arg1) {
        for (class333 var2 = class595.field8386.method3674(126); var2 != null; var2 = class595.field8386.method3672(-1)) {
            if ((var2.field4176 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method1922(105);
            }
        }
        if (arg1 != 65535) {
            field3745 = -87;
        }
        field3746++;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lsp;I)I")
    public static final int method1750(class677 arg0, int arg1) {
        field3743++;
        if (arg0.field9469 == 0) {
            return 0;
        }
        if (arg1 >= -104) {
            method1749(-47, -96);
        }
        if (arg0.field9448 != -1) {
            class677 var2 = null;
            if (arg0.field9448 < 32768) {
                class214 var3 = (class214) class274.field3433.method3669((long) arg0.field9448, -1);
                if (var3 != null) {
                    var2 = var3.field2601;
                }
            } else if (arg0.field9448 >= 32768) {
                var2 = class139.field1540[arg0.field9448 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field5179 - var2.field5179;
                int var5 = arg0.field5176 - var2.field5176;
                if (var4 != 0 || var5 != 0) {
                    arg0.method3740((byte) -29, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg0 instanceof class236)) {
            class236 var9 = (class236) arg0;
            if (var9.field2918 != -1 && (var9.field9518 == 0 || var9.field9514 > 0)) {
                var9.method3740((byte) -29, var9.field2918);
                var9.field2918 = -1;
            }
        } else if (arg0 instanceof class600) {
            class600 var6 = (class600) arg0;
            if (var6.field8443 != -1 && (var6.field9518 == 0 || var6.field9514 > 0)) {
                int var7 = var6.field5179 - ((var6.field8443 - class26.field245 - class26.field245) * 256);
                int var8 = var6.field5176 - ((var6.field8460 - class231.field2860 - class231.field2860) * 256);
                if (var7 != 0 || var8 != 0) {
                    var6.method3740((byte) -29, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
                var6.field8443 = -1;
            }
        }
        return arg0.method3744((byte) -10);
    }
}
