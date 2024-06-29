import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class548 {

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public int field7500 = 1;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "C")
    public char field7501;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "Lrca;")
    public static class34 field7499;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "Lr;")
    public static class562 field7502;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lio;II)V")
    private final void method3068(class157 arg0, int arg1, int arg2) {
        field7498++;
        if (arg1 <= 71) {
            return;
        }
        if (arg2 == 1) {
            this.field7501 = class55.method322(arg0.method969(3), (byte) 38);
        } else if (arg2 == 2) {
            this.field7500 = 0;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILlv;Lr;ILkt;)Z")
    public static final boolean method3069(int arg0, int arg1, class694 arg2, class562 arg3, int arg4, class83 arg5) {
        field7497++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg5.field975 != null) {
            var9 = class672.field9578 - ((arg2.field9784 + arg5.field961 - class672.field9574) * (class672.field9578 - class672.field9569) / (class672.field9585 - class672.field9574));
            var8 = class672.field9578 - ((arg2.field9784 + arg5.field978 - class672.field9574) * (class672.field9578 - class672.field9569) / (class672.field9585 - class672.field9574));
            var6 = class672.field9575 + ((arg5.field976 + arg2.field9789 - class672.field9584) * (class672.field9576 - class672.field9575) / (class672.field9572 - class672.field9584));
            var7 = class672.field9575 + ((class672.field9576 - class672.field9575) * (arg5.field971 + arg2.field9789 - class672.field9584) / (class672.field9572 - class672.field9584));
        }
        class532 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        if (arg4 != 2) {
            field7499 = null;
        }
        int var14 = 0;
        if (arg5.field999 != -1) {
            if (arg2.field9787 && arg5.field996 != -1) {
                var10 = arg5.method442(arg3, true, (byte) 116);
            } else {
                var10 = arg5.method442(arg3, false, (byte) 81);
            }
            if (var10 != null) {
                var11 = arg2.field9788 - (var10.method523() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg2.field9788 + (var10.method523() + 1 >> 1);
                var13 = arg2.field9782 - (var10.method532() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg2.field9782 + (var10.method532() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class437 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg5.field1003 != null) {
            var15 = class448.method2529(arg5.field989, -100);
            if (var15 != null) {
                var16 = class671.field9544.method3760(null, arg4 + 1497, class333.field4486, arg5.field1003, null);
                int var23 = arg2.field9782;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method2475() / 2;
                } else {
                    var17 = var23 - ((var10.method532() >> 1) + var16 * var15.method2470());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class333.field4486[var24];
                    if (var24 < var16 - 1) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2476(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg2.field9788 + arg1 - (var18 / 2);
                if (var6 > var19) {
                    var6 = var19;
                }
                var20 = arg2.field9788 - (-(var18 / 2) - arg1);
                if (var7 < var20) {
                    var7 = var20;
                }
                var21 = arg0 + var17;
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = arg0 + var17 + (var15.method2470() * var16);
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (class672.field9575 > var7 || var6 > class672.field9576 || class672.field9569 > var9 || var8 > class672.field9578) {
            return true;
        }
        if (arg5.field975 != null) {
            int[] var27 = new int[arg5.field975.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg5.field975[var28 * 2] + arg2.field9789;
                int var31 = arg5.field975[var28 * 2 + 1] + arg2.field9784;
                var27[var28 * 2] = (var30 - class672.field9584) * (class672.field9576 - class672.field9575) / (class672.field9572 - class672.field9584) + class672.field9575;
                var27[var28 * 2 + 1] = class672.field9578 - ((class672.field9578 - class672.field9569) * (var31 - class672.field9574) / (class672.field9585 - class672.field9574));
            }
            class44.method231(arg3, var27, arg5.field986);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg3.method3120(11743, arg5.field988, var27[var29 * 2], var27[var29 * 2 + 2 + 1], var27[var29 * 2 + 2], var27[var29 * 2 + 1]);
            }
            arg3.method3120(11743, arg5.field988, var27[var27.length - 2], var27[1], var27[0], var27[var27.length - 1]);
        }
        if (var10 != null) {
            if (class158.field2276 > 0 && (class619.field8600 != -1 && class619.field8600 == arg2.field9786 || class10.field102 != -1 && class10.field102 == arg5.field991)) {
                int var32;
                if (class321.field4289 > 50) {
                    var32 = (100 - class321.field4289) * 2;
                } else {
                    var32 = class321.field4289 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg3.method3124(arg2.field9782, var33, arg4 ^ 0x3, arg2.field9788, var10.method530() / 2 + 7);
                arg3.method3124(arg2.field9782, var33, 1, arg2.field9788, var10.method530() / 2 + 5);
                arg3.method3124(arg2.field9782, var33, 1, arg2.field9788, var10.method530() / 2 + 3);
                arg3.method3124(arg2.field9782, var33, arg4 ^ 0x3, arg2.field9788, var10.method530() / 2 + 1);
                arg3.method3124(arg2.field9782, var33, 1, arg2.field9788, var10.method530() / 2);
            }
            var10.method2990(arg2.field9788 - (var10.method523() >> 1), arg2.field9782 + -(var10.method532() >> 1));
        }
        if (arg5.field1003 != null && var15 != null) {
            class305.method1790(arg5, arg3, var16, var17, var18, (byte) -69, arg2, var15);
        }
        if (arg5.field999 != -1 || arg5.field1003 != null) {
            class31 var34 = new class31(arg2);
            var34.field436 = var13;
            var34.field430 = var11;
            var34.field438 = var19;
            var34.field442 = var21;
            var34.field435 = var14;
            var34.field439 = var20;
            var34.field441 = var12;
            var34.field433 = var22;
            class533.field7329.method2507(var34, (byte) -122);
        }
        return false;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lio;I)V")
    public final void method3070(class157 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field7504++;
        while (true) {
            int var3 = arg0.method930(255);
            if (var3 == 0) {
                return;
            }
            this.method3068(arg0, arg1 + 73, var3);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)V")
    public static final void method3071(boolean arg0, int arg1) {
        class360.field4779 = arg1;
        field7503++;
        class244.field3197 = 0;
        class572.method3160((byte) 116);
        class591.method3270((byte) -58, arg0);
        class663.method3782(arg1 ^ 0x100);
        boolean var2 = false;
        for (int var3 = 0; var3 < class244.field3197; var3++) {
            int var5 = class651.field9044[var3];
            class407 var6 = (class407) class296.field3921.method3057(1, (long) var5);
            class351 var7 = var6.field5354;
            if (class674.field9590 && class367.method2132(65280, var5)) {
                class143.method819(200);
            }
            if (class327.field4404 != var7.field2998) {
                if (var7.field4671.method2199(true)) {
                    class454.method2552(0, var7);
                }
                var7.method2074(null, true);
                var2 = true;
                var6.method242(true);
            }
        }
        if (var2) {
            class468.field6163 = class296.field3921.method3060(0);
            class296.field3921.method3052(13534, class591.field8148);
        }
        if (class151.field2070 != class289.field3807.field2219) {
            throw new RuntimeException("gnp1 pos:" + class289.field3807.field2219 + " psize:" + class151.field2070);
        }
        for (int var4 = 0; var4 < class289.field3820; var4++) {
            if (class296.field3921.method3057(1, (long) class389.field5220[var4]) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class289.field3820);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public static void method3072(byte arg0) {
        field7499 = null;
        field7502 = null;
        if (arg0 != 72) {
            method3071(true, 51);
        }
    }
}
