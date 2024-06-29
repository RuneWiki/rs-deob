import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class737 extends class316 {

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Lfba;")
    public static class27 field10161 = new class27(72, 2);

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field10160;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    private int field10162;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field10163;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field10164;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field10165;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field10166;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field10168;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field10170;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field10171;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "J")
    private long field10167;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Lgfa;")
    public static class782 field10169;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method4102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10160++;
        class313 var5 = class312.method1998((long) arg2 | (long) arg3 << 32, 18, arg1);
        var5.method2001((byte) 94);
        var5.field4455 = arg4;
        var5.field4464 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIII)I", line = 16)
    public static final int method4103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10168++;
        if (arg1 != -30666) {
            method4106(19);
        }
        if (class208.field3219 == null) {
            return 0;
        }
        if (arg0 < 3) {
            int var6 = arg4 >> 9;
            int var7 = arg2 >> 9;
            if (arg5 < 0 || arg3 < 0 || (class768.field10571 - 1) < arg5 || class350.field4898 - 1 < arg3) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class768.field10571 - 1) < var6 || var7 > (class350.field4898 - 1)) {
                return 0;
            }
            boolean var8 = (class190.field2932[1][arg4 >> 9][arg2 >> 9] & 0x2) != 0;
            if ((arg4 & 0x1FF) == 0) {
                boolean var9 = (class190.field2932[1][var6 - 1][arg2 >> 9] & 0x2) != 0;
                boolean var10 = (class190.field2932[1][var6][arg2 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class190.field2932[1][arg5][arg3] & 0x2) != 0;
                }
            }
            if ((arg2 & 0x1FF) == 0) {
                boolean var11 = (class190.field2932[1][arg4 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class190.field2932[1][arg4 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class190.field2932[1][arg5][arg3] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        return class208.field3219[arg0].method1918(arg4, (byte) 126, arg2);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLmda;)V", line = 76)
    public final void method152(byte arg0, class276 arg1) {
        if (arg0 < 80) {
            method4103(43, -87, -27, -37, 10, 52);
        }
        arg1.method1798(this.field10167, this.field10162, (byte) -117);
        field10164++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILso;)V", line = 88)
    public final void method148(int arg0, class494 arg1) {
        if (arg0 == -1001) {
            this.field10162 = arg1.method2976(-125);
            field10165++;
            this.field10167 = arg1.method3005(-100);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V", line = 100)
    public static final void method4104(byte arg0) {
        field10166++;
        class591.field8330 = 0;
        class704.field9812++;
        class45.field566 = 0;
        class625.method3597((byte) 31);
        class505.method3047(true);
        class202.method1414(false);
        boolean var1 = false;
        for (int var2 = 0; var2 < class591.field8330; var2++) {
            int var5 = class318.field4521[var2];
            class205 var6 = (class205) class645.field9014.method2242((long) var5, -1);
            class665 var7 = var6.field3181;
            if (class626.field8777 && class313.method2004((byte) 21, var5)) {
                class751.method4180(6);
            }
            if (class704.field9812 != var7.field4633) {
                if (var7.field9240.method838(20710)) {
                    class674.method3835(var7, (byte) -123);
                }
                var7.method3783(null, 126);
                var6.method3387((byte) -98);
                var1 = true;
            }
        }
        if (var1) {
            class36.field483 = class645.field9014.method2244(false);
            class645.field9014.method2251(-78, class164.field2601);
        }
        if (class15.field293 != class110.field1640.field7042) {
            throw new RuntimeException("gnp1 pos:" + class110.field1640.field7042 + " psize:" + class15.field293);
        }
        for (int var3 = 0; var3 < class235.field3545; var3++) {
            if (class645.field9014.method2242((long) class216.field3356[var3], -1) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class235.field3545);
            }
        }
        if ((class36.field483 - class235.field3545) != 0) {
            throw new RuntimeException("gnp3 mis:" + (class36.field483 - class235.field3545));
        } else if (arg0 < -74) {
            for (int var4 = 0; var4 < class36.field483; var4++) {
                if (class704.field9812 != class164.field2601[var4].field3181.field4633) {
                    throw new RuntimeException("gnp4 uk:" + class164.field2601[var4].field3181.field4640);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V", line = 187)
    public static void method4105(byte arg0) {
        field10169 = null;
        if (arg0 != 77) {
            field10170 = 42;
        }
        field10161 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)I", line = 203)
    public static final int method4106(int arg0) {
        if (arg0 == 1011472681) {
            field10163++;
            return class763.field10520 == 1 ? class549.field7896 : class82.field908;
        } else {
            return 24;
        }
    }
}
