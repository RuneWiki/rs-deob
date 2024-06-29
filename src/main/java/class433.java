import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class433 extends class80 {

    @OriginalMember(owner = "client!ou", name = "R", descriptor = "I")
    private int field6453 = 4096;

    @OriginalMember(owner = "client!ou", name = "O", descriptor = "I")
    public static int field6450 = 0;

    @OriginalMember(owner = "client!ou", name = "Q", descriptor = "[F")
    public static float[] field6452 = new float[4];

    @OriginalMember(owner = "client!ou", name = "S", descriptor = "B")
    public static byte field6454;

    @OriginalMember(owner = "client!ou", name = "I", descriptor = "F")
    public static float field6444;

    @OriginalMember(owner = "client!ou", name = "J", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!ou", name = "K", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!ou", name = "L", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!ou", name = "M", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!ou", name = "N", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!ou", name = "P", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!ou", name = "T", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)V")
    public static void method2599(int arg0) {
        int var1 = -24 / ((arg0 - 15) / 58);
        field6452 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILgh;)V")
    public static final void method2600(int arg0, class388 arg1) {
        ++field6447;
        if (class315.field4755 == arg1.field5765) {
            if (class15.field266.field5381 == null) {
                arg1.field5779 = 0;
                arg1.field5794 = 0;
            } else {
                arg1.field5675 = 150;
                arg1.field5716 = 2047 & (int) (256.0D * Math.sin((double) class62.field1268 / 40.0D));
                arg1.field5794 = class174.field2806;
                arg1.field5785 = 5;
                arg1.field5779 = class415.method2548((byte) -108, class15.field266.field5381);
                arg1.field5672 = 0;
                arg1.field5678 = class15.field266.field7770;
                arg1.field5737 = class15.field266.field7800;
                arg1.field5747 = class15.field266.field7826;
            }
        } else if (arg0 != 7623) {
            method2602((class57) null, 20, -121, (byte) -66, 117, -120, false);
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V")
    public class433() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V")
    public static final void method2601(int arg0) {
        ++field6455;
        class332.field5041 = arg0;
        class373.field5469.method1891(-3);
        class76.field1543 = false;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field6446;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (arg1 != -16828) {
            field6452 = null;
        }
        if (super.field1601.field124) {
            int[] var4 = this.method710(arg0 - 1 & class359.field5269, 0, (byte) 86);
            int[] var5 = this.method710(arg0, 0, (byte) 123);
            int[] var6 = this.method710(class359.field5269 & arg0 + 1, 0, (byte) 81);
            for (int var7 = 0; class137.field2308 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field6453;
                int var9 = (var5[class308.field4672 & var7 + 1] + -var5[class308.field4672 & var7 + -1]) * this.field6453;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljv;IIBIIZ)V")
    public static final void method2602(class57 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        ++field6449;
        if (class218.field3439 < 50) {
            if (arg0 != null && arg0.field1214 != null && ~arg5 > ~arg0.field1214.length && arg0.field1214[arg5] != null) {
                int var7 = arg0.field1214[arg5][0];
                int var8 = var7 >> 8;
                int var9 = 7 & var7 >> 5;
                if (arg0.field1214[arg5].length > 1) {
                    int var10 = (int) (Math.random() * (double) arg0.field1214[arg5].length);
                    if (var10 > 0) {
                        var8 = arg0.field1214[arg5][var10];
                    }
                }
                int var11 = 31 & var7;
                if (var11 == 0) {
                    if (arg6) {
                        class175.method1209(var9, 255, var8, 8, 0);
                    }
                } else if (~class186.field2990.field2544 != -1) {
                    if (arg3 >= 36) {
                        int var12 = arg1 + -64 >> 7;
                        int var13 = arg2 + -64 >> 7;
                        class276.field4170[class218.field3439++] = new class387((byte) 1, var8, var9, 0, 255, (var12 << 16) + ((arg4 << 24) - -(var13 << 8) - -var11));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BIILjq;II)V")
    public static final void method2603(byte arg0, int arg1, int arg2, class358 arg3, int arg4, int arg5) {
        ++field6451;
        if (~arg3.field5256 != 0 || arg3.field5249 != null) {
            int var6 = 0;
            int var7 = class186.field2990.field2544 * arg3.field5264 >> 8;
            if (arg1 > arg3.field5250) {
                var6 += arg1 - arg3.field5250;
            } else if (~arg1 > ~arg3.field5262) {
                var6 += -arg1 + arg3.field5262;
            }
            if (arg3.field5255 >= arg4) {
                if (~arg4 > ~arg3.field5267) {
                    var6 += arg3.field5267 - arg4;
                }
            } else {
                var6 += arg4 - arg3.field5255;
            }
            if (~arg3.field5247 != -1 && arg3.field5247 >= var6 + -64 && class186.field2990.field2544 != 0 && arg3.field5245 == arg5) {
                var6 -= 64;
                if (~var6 > -1) {
                    var6 = 0;
                }
                int var8 = (-var6 + arg3.field5247) * var7 / arg3.field5247;
                int var9 = 54 % ((arg0 - 12) / 63);
                if (arg3.field5248 != null) {
                    arg3.field5248.method2916(var8);
                } else if (arg3.field5256 >= 0) {
                    class367 var10 = class367.method2250(class237.field3657, arg3.field5256, 0);
                    if (var10 != null) {
                        class116 var11 = var10.method2251().method955(class385.field5622);
                        class487 var12 = class487.method2936(var11, 100, var8);
                        var12.method2955(-1);
                        class288.field4357.method2160(var12);
                        arg3.field5248 = var12;
                    }
                }
                if (arg3.field5266 == null) {
                    if (arg3.field5249 != null && (arg3.field5257 -= arg2) <= 0) {
                        int var13 = (int) ((double) arg3.field5249.length * Math.random());
                        class367 var14 = class367.method2250(class237.field3657, arg3.field5249[var13], 0);
                        if (var14 != null) {
                            class116 var15 = var14.method2251().method955(class385.field5622);
                            class487 var16 = class487.method2936(var15, 100, var8);
                            var16.method2955(0);
                            class288.field4357.method2160(var16);
                            arg3.field5257 = (int) ((double) (arg3.field5246 - arg3.field5265) * Math.random()) + arg3.field5265;
                            arg3.field5266 = var16;
                            return;
                        }
                    }
                } else {
                    arg3.field5266.method2916(var8);
                    if (arg3.field5266.method1677(-1)) {
                        return;
                    }
                    arg3.field5266 = null;
                }
            } else {
                if (arg3.field5248 != null) {
                    class288.field4357.method2157(arg3.field5248);
                    arg3.field5248 = null;
                }
                if (arg3.field5266 != null) {
                    class288.field4357.method2157(arg3.field5266);
                    arg3.field5266 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field6448;
        int var4 = 5 / ((arg1 - 28) / 53);
        if (arg0 == 0) {
            this.field6453 = arg2.method1841((byte) -128);
        }
    }
}
