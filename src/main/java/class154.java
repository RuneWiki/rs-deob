import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class154 extends class264 implements class174 {

    @OriginalMember(owner = "client!sia", name = "D", descriptor = "Ljt;")
    private class38 field2110;

    @OriginalMember(owner = "client!sia", name = "x", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!sia", name = "y", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!sia", name = "z", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!sia", name = "A", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!sia", name = "B", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!sia", name = "E", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!sia", name = "F", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!sia", name = "G", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!sia", name = "H", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lhj;Ljt;Z)V", line = 10)
    public class154(class47 arg0, class38 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field2110 = arg1;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 24)
    public final Buffer method968(boolean arg0, byte arg1) {
        ++field2112;
        return arg1 != 45 ? null : super.method1803((byte) -106, super.field3860.field700, arg0);
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZI)V", line = 35)
    public final void method969(boolean arg0, int arg1) {
        super.method969(arg0, this.field2110.field460 * arg1);
        ++field2111;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V", line = 45)
    public final void method970(int arg0) {
        super.method970(-124);
        ++field2106;
        if (arg0 >= -95) {
            this.method970(108);
        }
    }

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "(I)I", line = 56)
    public final int method971(int arg0) {
        if (arg0 != -127) {
            return 111;
        } else {
            ++field2109;
            return super.method971(arg0);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)V", line = 67)
    public static final void method972(int arg0, int arg1) {
        ++field2105;
        if (arg0 >= 0) {
            class346 var2 = class299.method1976(0, 17, arg1);
            var2.method2208(-1719);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIILha;ILd;)V", line = 84)
    public static final void method973(int arg0, int arg1, int arg2, int arg3, class548 arg4, int arg5, class270 arg6) {
        ++field2108;
        if (~class537.field7447 > -101) {
            class343.method2195((byte) -80, arg4, arg6);
        }
        arg4.method1544(arg5, arg1, arg3 + arg5, arg1 + arg2);
        if (~class537.field7447 > -101) {
            byte var7 = 20;
            int var8 = arg5 - -(arg3 / 2);
            arg4.method1412(arg5, arg1, arg3, arg2, -16777216, 0);
            int var9 = arg2 / 2 - 18 + -var7 + arg1;
            arg4.method1534(var8 + -152, var9, 304, 34, class506.field7033[class534.field7413].getRGB(), 0);
            arg4.method1412(var8 - 150, var9 - -2, class537.field7447 * 3, 30, class477.field6638[class534.field7413].getRGB(), 0);
            class758.field10575.method2508(class155.field2137.method978(class120.field1576, (byte) -120), var9 - -var7, class315.field4357[class534.field7413].getRGB(), -1, arg0 + 10320, var8);
        } else {
            int var10 = -((int) ((float) arg3 / class461.field6388)) + class513.field7087;
            int var11 = (int) ((float) arg2 / class461.field6388) + class718.field10001;
            int var12 = class513.field7087 - -((int) ((float) arg3 / class461.field6388));
            int var13 = class718.field10001 - (int) ((float) arg2 / class461.field6388);
            class534.field7407 = (int) ((float) (arg3 * 2) / class461.field6388);
            class654.field8747 = -((int) ((float) arg3 / class461.field6388)) + class513.field7087;
            class750.field10325 = class718.field10001 - (int) ((float) arg2 / class461.field6388);
            class263.field3855 = (int) ((float) (arg2 * 2) / class461.field6388);
            if (arg0 == -10231) {
                class461.method2825(class461.field6400 + var10, class461.field6408 + var11, var12 - -class461.field6400, class461.field6408 + var13, arg5, arg1, arg5 - -arg3, arg1 + 1 - -arg2);
                class461.method2812(arg4);
                class646 var14 = class461.method2820(arg4);
                class202.method1227(false, var14, arg4, 0, 0);
                if (class224.field3017 > 0) {
                    --class659.field8770;
                    if (class659.field8770 == 0) {
                        class659.field8770 = 20;
                        --class224.field3017;
                    }
                }
                if (class702.field9788) {
                    int var15 = arg3 + arg5 + -5;
                    int var16 = arg1 + arg2 + -8;
                    class272.field3950.method2506(var15, 16776960, -125, var16, "Fps:" + class494.field6926, -1);
                    int var20 = var16 - 15;
                    Runtime var17 = Runtime.getRuntime();
                    int var18 = (int) ((var17.totalMemory() + -var17.freeMemory()) / 1024L);
                    int var19 = 16776960;
                    if (var18 > 65536) {
                        var19 = 16711680;
                    }
                    class272.field3950.method2506(var15, var19, -110, var20, "Mem:" + var18 + "k", -1);
                    var16 = var20 - 15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "(I)Ljt;", line = 165)
    public final class38 method974(int arg0) {
        ++field2113;
        return arg0 != 9484 ? null : this.field2110;
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(I)Z", line = 176)
    public final boolean method975(int arg0) {
        ++field2114;
        if (arg0 > -25) {
            field2107 = 53;
        }
        return super.method1807(super.field3860.field700, true);
    }
}
