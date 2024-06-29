import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class66 {

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lrn;")
    public static class633 field866 = new class633(58, 6);

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field870 = 1337;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lne;")
    public static class166 field868;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lqea;")
    public static class356 field869;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V", line = 8)
    public static final void method385(int arg0, int arg1, int arg2) {
        field864++;
        if (arg1 != 0) {
            field867 = -86;
        }
        class614 var3 = class497.method2759(13, 5977, (long) arg2);
        var3.method3277(639);
        var3.field7742 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BIIIIII)V", line = 27)
    public static final void method386(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class56.method342(arg1, -1);
        field865++;
        int var7 = 0;
        int var8 = arg1 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = 78 / ((arg0 + 89) / 35);
        int var10 = arg1;
        int var11 = -arg1;
        int var12 = var8;
        int var13 = -var8;
        int var14 = -1;
        int var15 = -1;
        if (arg3 >= class80.field1131 && class405.field5375 >= arg3) {
            int[] var16 = class207.field2840[arg3];
            int var17 = class774.method4226(class498.field6390, (byte) -72, class30.field274, arg5 - arg1);
            int var18 = class774.method4226(class498.field6390, (byte) -61, class30.field274, arg1 + arg5);
            int var19 = class774.method4226(class498.field6390, (byte) -111, class30.field274, arg5 - var8);
            int var20 = class774.method4226(class498.field6390, (byte) -70, class30.field274, arg5 + var8);
            class54.method333(var19, var16, 7, var17, arg6);
            class54.method333(var20, var16, 7, var19, arg4);
            class54.method333(var18, var16, 7, var20, arg6);
        }
        while (var10 > var7) {
            var15 += 2;
            var14 += 2;
            var13 += var15;
            var11 += var14;
            if (var13 >= 0 && var12 >= 1) {
                var12--;
                var13 -= var12 << 1;
                class333.field4070[var12] = var7;
            }
            var7++;
            if (var11 >= 0) {
                var10--;
                var11 -= var10 << 1;
                int var21 = arg3 - var10;
                int var22 = arg3 + var10;
                if (var22 >= class80.field1131 && class405.field5375 >= var21) {
                    if (var8 <= var10) {
                        int var23 = class774.method4226(class498.field6390, (byte) -47, class30.field274, arg5 + var7);
                        int var24 = class774.method4226(class498.field6390, (byte) -52, class30.field274, arg5 - var7);
                        if (class405.field5375 >= var22) {
                            class54.method333(var23, class207.field2840[var22], 7, var24, arg6);
                        }
                        if (class80.field1131 <= var21) {
                            class54.method333(var23, class207.field2840[var21], 7, var24, arg6);
                        }
                    } else {
                        int var25 = class333.field4070[var10];
                        int var26 = class774.method4226(class498.field6390, (byte) -37, class30.field274, arg5 + var7);
                        int var27 = class774.method4226(class498.field6390, (byte) -43, class30.field274, arg5 - var7);
                        int var28 = class774.method4226(class498.field6390, (byte) -53, class30.field274, arg5 + var25);
                        int var29 = class774.method4226(class498.field6390, (byte) -25, class30.field274, arg5 - var25);
                        if (var22 <= class405.field5375) {
                            int[] var30 = class207.field2840[var22];
                            class54.method333(var29, var30, 7, var27, arg6);
                            class54.method333(var28, var30, 7, var29, arg4);
                            class54.method333(var26, var30, 7, var28, arg6);
                        }
                        if (var21 >= class80.field1131) {
                            int[] var31 = class207.field2840[var21];
                            class54.method333(var29, var31, 7, var27, arg6);
                            class54.method333(var28, var31, 7, var29, arg4);
                            class54.method333(var26, var31, 7, var28, arg6);
                        }
                    }
                }
            }
            int var32 = arg3 - var7;
            int var33 = arg3 + var7;
            if (var33 >= class80.field1131 && var32 <= class405.field5375) {
                int var34 = arg5 + var10;
                int var35 = arg5 - var10;
                if (var34 >= class498.field6390 && class30.field274 >= var35) {
                    int var36 = class774.method4226(class498.field6390, (byte) -28, class30.field274, var34);
                    int var37 = class774.method4226(class498.field6390, (byte) -105, class30.field274, var35);
                    if (var8 > var7) {
                        int var38 = var12 < var7 ? class333.field4070[var7] : var12;
                        int var39 = class774.method4226(class498.field6390, (byte) -79, class30.field274, arg5 + var38);
                        int var40 = class774.method4226(class498.field6390, (byte) -49, class30.field274, arg5 - var38);
                        if (class405.field5375 >= var33) {
                            int[] var41 = class207.field2840[var33];
                            class54.method333(var40, var41, 7, var37, arg6);
                            class54.method333(var39, var41, 7, var40, arg4);
                            class54.method333(var36, var41, 7, var39, arg6);
                        }
                        if (class80.field1131 <= var32) {
                            int[] var42 = class207.field2840[var32];
                            class54.method333(var40, var42, 7, var37, arg6);
                            class54.method333(var39, var42, 7, var40, arg4);
                            class54.method333(var36, var42, 7, var39, arg6);
                        }
                    } else {
                        if (var33 <= class405.field5375) {
                            class54.method333(var36, class207.field2840[var33], 7, var37, arg6);
                        }
                        if (var32 >= class80.field1131) {
                            class54.method333(var36, class207.field2840[var32], 7, var37, arg6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 215)
    public static void method387(int arg0) {
        field869 = null;
        int var1 = 65 / ((-arg0 - 20) / 46);
        field866 = null;
        field868 = null;
    }

    @OriginalMember(owner = "client!k", name = "toString", descriptor = "()Ljava/lang/String;", line = 226)
    public final String toString() {
        field872++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 242)
    public class66(String arg0, String arg1, String arg2, int arg3) {
        this.field871 = arg3;
    }
}
