import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class321 extends class139 {

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "F")
    public static float field4819;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "[B")
    private byte[] field4821;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIB)V")
    public final void method1009(int arg0, int arg1, byte arg2) {
        field4818++;
        byte var4 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var5 = arg0 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field4821[var10001] = var4;
        this.field4821[var6] = var4;
        if (arg1 != -32400) {
            field4822 = -58;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(IIII)[B")
    public final byte[] method2050(int arg0, int arg1, int arg2, int arg3) {
        field4820++;
        this.field4821 = new byte[arg1 * arg3 * arg0 * 2];
        if (arg2 >= -96) {
            this.field4821 = null;
        }
        this.method1336(arg3, arg1, arg0, 732);
        return this.field4821;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILya;Lql;ILkn;)Z")
    public static final boolean method2051(int arg0, int arg1, class38 arg2, class519 arg3, int arg4, class523 arg5) {
        int var6 = -26 / ((arg1 + 68) / 44);
        field4823++;
        int var7 = Integer.MAX_VALUE;
        int var8 = Integer.MIN_VALUE;
        int var9 = Integer.MAX_VALUE;
        int var10 = Integer.MIN_VALUE;
        if (arg3.field7578 != null) {
            var8 = (class7.field111 - class7.field94) * (arg3.field7601 + arg5.field7643 - class7.field112) / (class7.field102 - class7.field112) + class7.field94;
            var9 = class7.field98 - (class7.field98 - class7.field113) * (arg3.field7567 + arg5.field7647 - class7.field99) / (class7.field93 - class7.field99);
            var7 = (arg3.field7602 + arg5.field7643 - class7.field112) * (class7.field111 - class7.field94) / (class7.field102 - class7.field112) + class7.field94;
            var10 = class7.field98 - ((arg3.field7571 + arg5.field7647 - class7.field99) * (class7.field98 - class7.field113) / (class7.field93 - class7.field99));
        }
        class16 var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (arg3.field7581 != -1) {
            if (arg5.field7650 && arg3.field7584 != -1) {
                var11 = arg3.method3085(arg2, 1599534109, true);
            } else {
                var11 = arg3.method3085(arg2, 1599534109, false);
            }
            if (var11 != null) {
                var12 = arg5.field7646 - (var11.method129() + 1 >> 1);
                var13 = arg5.field7646 + (var11.method129() + 1 >> 1);
                if (var12 < var7) {
                    var7 = var12;
                }
                var14 = arg5.field7644 - (var11.method139() + 1 >> 1);
                if (var8 < var13) {
                    var8 = var13;
                }
                var15 = arg5.field7644 + (var11.method139() + 1 >> 1);
                if (var9 > var14) {
                    var9 = var14;
                }
                if (var15 > var10) {
                    var10 = var15;
                }
            }
        }
        class205 var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg3.field7576 != null) {
            var16 = class460.method2787(arg3.field7599, (byte) 127);
            if (var16 != null) {
                var17 = class431.field6391.method2164(null, (byte) 103, arg3.field7576, null, class227.field3697);
                int var24 = arg5.field7644;
                if (var11 == null) {
                    var18 = var24 - var17 * var16.method1423() / 2;
                } else {
                    var18 = var24 - ((var11.method139() >> 1) + (var16.method1427() * var17));
                }
                for (int var25 = 0; var25 < var17; var25++) {
                    String var26 = class227.field3697[var25];
                    if (var25 < var17 - 1) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var16.method1421(var26);
                    if (var19 < var27) {
                        var19 = var27;
                    }
                }
                var20 = arg5.field7646 + arg4 - (var19 / 2);
                var21 = var19 / 2 + arg4 + arg5.field7646;
                if (var20 < var7) {
                    var7 = var20;
                }
                var22 = arg0 + var18;
                if (var8 < var21) {
                    var8 = var21;
                }
                var23 = arg0 + var17 * var16.method1427() + var18;
                if (var22 < var9) {
                    var9 = var22;
                }
                if (var10 < var23) {
                    var10 = var23;
                }
            }
        }
        if (class7.field94 > var8 || var7 > class7.field111 || class7.field113 > var10 || var9 > class7.field98) {
            return true;
        }
        if (arg3.field7578 != null) {
            int[] var28 = new int[arg3.field7578.length];
            for (int var29 = 0; var29 < (var28.length / 2); var29++) {
                int var31 = arg3.field7578[var29 * 2] + arg5.field7643;
                int var32 = arg3.field7578[var29 * 2 + 1] + arg5.field7647;
                var28[var29 * 2] = (class7.field111 - class7.field94) * (var31 - class7.field112) / (class7.field102 - class7.field112) + class7.field94;
                var28[var29 * 2 + 1] = class7.field98 - (var32 - class7.field99) * (class7.field98 - class7.field113) / (class7.field93 - class7.field99);
            }
            class423.method2646(arg2, var28, arg3.field7598);
            for (int var30 = 0; var30 < var28.length / 2 - 1; var30++) {
                arg2.method316(10823, var28[var30 * 2 + 1], var28[var30 * 2], var28[(var30 + 1) * 2 + 1], arg3.field7605, var28[var30 * 2 + 2]);
            }
            arg2.method316(10823, var28[var28.length - 1], var28[var28.length - 2], var28[1], arg3.field7605, var28[0]);
        }
        if (var11 != null) {
            if (class197.field3283 > 0 && (class458.field6663 != -1 && class458.field6663 == arg5.field7645 || class71.field1026 != -1 && class71.field1026 == arg3.field7562)) {
                int var33;
                if (class324.field4851 <= 50) {
                    var33 = class324.field4851 * 2;
                } else {
                    var33 = 200 - (class324.field4851 * 2);
                }
                int var34 = var33 << 24 | 0xFFFF00;
                arg2.method288(arg5.field7646, 123, arg5.field7644, var11.method123() / 2 + 7, var34);
                arg2.method288(arg5.field7646, 123, arg5.field7644, var11.method123() / 2 + 5, var34);
                arg2.method288(arg5.field7646, 14, arg5.field7644, var11.method123() / 2 + 3, var34);
                arg2.method288(arg5.field7646, -57, arg5.field7644, var11.method123() / 2 + 1, var34);
                arg2.method288(arg5.field7646, -54, arg5.field7644, var11.method123() / 2, var34);
            }
            var11.method132(arg5.field7646 - (var11.method129() >> 1), arg5.field7644 + -(var11.method139() >> 1));
        }
        if (arg3.field7576 != null && var16 != null) {
            class58.method520(var16, arg5, arg2, var19, var17, var18, (byte) 107, arg3);
        }
        if (arg3.field7581 != -1 || arg3.field7576 != null) {
            class162 var35 = new class162(arg5);
            var35.field2405 = var13;
            var35.field2410 = var14;
            var35.field2402 = var21;
            var35.field2411 = var12;
            var35.field2403 = var23;
            var35.field2412 = var20;
            var35.field2408 = var22;
            var35.field2401 = var15;
            class34.field394.method994(var35, -3610);
        }
        return false;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
    public class321() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    static {
        new class315("", 73);
        field4822 = 0;
    }
}
