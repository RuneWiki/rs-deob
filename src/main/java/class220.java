import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class220 extends class326 {

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    private int field3475 = 4096;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    private int field3485 = 409;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
    private int field3489 = 4096;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "[I")
    private int[] field3488 = new int[3];

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    private int field3486 = 4096;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field3476 = -1;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "Z")
    public static boolean field3482 = true;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "[I")
    public static int[] field3477 = new int[2500];

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    public static int field3483 = 0;

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
    public static int field3491 = -1;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "Z")
    public static boolean field3484 = false;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    public static int field3487 = 1;

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "F")
    public static float field3492;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)[[I", line = 4)
    public final int[][] method253(int arg0, byte arg1) {
        field3479++;
        int var3 = 100 % ((arg1 - 60) / 51);
        int[][] var4 = this.field5104.method2365((byte) -61, arg0);
        if (this.field5104.field5325) {
            int[][] var5 = this.method2293(-15033, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class166.field2731; var12++) {
                int var13 = var6[var12];
                int var14 = var13 - this.field3488[0];
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (var14 > this.field3485) {
                    var10[var12] = var13;
                    var9[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = var15 - this.field3488[1];
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (var16 <= this.field3485) {
                        int var17 = var8[var12];
                        int var18 = var17 - this.field3488[2];
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (this.field3485 < var18) {
                            var10[var12] = var13;
                            var9[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var10[var12] = this.field3475 * var13 >> 12;
                            var9[var12] = this.field3489 * var15 >> 12;
                            var11[var12] = this.field3486 * var17 >> 12;
                        }
                    } else {
                        var10[var12] = var13;
                        var9[var12] = var15;
                        var11[var12] = var8[var12];
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(B)Llc;", line = 106)
    public static final class294 method1610(byte arg0) {
        field3478++;
        return arg0 > -39 ? (class294) null : class136.field2174;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lug;Lug;I)V", line = 120)
    public static final void method1611(class253 arg0, class253 arg1, int arg2) {
        class97.field1280 = arg0;
        field3480++;
        class20.field310 = arg1;
        class5.field64 = class97.field1280.method1826(arg2 ^ arg2, 3);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 132)
    public class220() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BIIIIIII)V", line = 152)
    public static final void method1612(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3490++;
        if (arg0 < 21 || arg6 < 0 || arg4 < 0 || arg6 >= 103 || arg4 >= 103) {
            return;
        }
        if (arg1 == 0) {
            class102 var8 = class128.method935(arg5, arg6, arg4);
            if (var8 != null) {
                int var9 = (int) (var8.field1364 >>> 32) & Integer.MAX_VALUE;
                if (arg7 == 2) {
                    var8.field1362 = new class128(var9, 2, arg3 + 4, arg5, arg6, arg4, arg2, false, var8.field1362);
                    var8.field1365 = new class128(var9, 2, arg3 + 1 & 0x3, arg5, arg6, arg4, arg2, false, var8.field1365);
                } else {
                    var8.field1362 = new class128(var9, arg7, arg3, arg5, arg6, arg4, arg2, false, var8.field1362);
                }
            }
        }
        if (arg1 == 1) {
            class283 var10 = class126.method915(arg5, arg6, arg4);
            if (var10 != null) {
                int var11 = (int) (var10.field4373 >>> 32) & Integer.MAX_VALUE;
                if (arg7 == 4 || arg7 == 5) {
                    var10.field4382 = new class128(var11, 4, arg3, arg5, arg6, arg4, arg2, false, var10.field4382);
                } else if (arg7 == 6) {
                    var10.field4382 = new class128(var11, 4, arg3 + 4, arg5, arg6, arg4, arg2, false, var10.field4382);
                } else if (arg7 == 7) {
                    var10.field4382 = new class128(var11, 4, (arg3 + 2 & 0x3) + 4, arg5, arg6, arg4, arg2, false, var10.field4382);
                } else if (arg7 == 8) {
                    var10.field4382 = new class128(var11, 4, arg3 + 4, arg5, arg6, arg4, arg2, false, var10.field4382);
                    var10.field4384 = new class128(var11, 4, (arg3 + 2 & 0x3) + 4, arg5, arg6, arg4, arg2, false, var10.field4384);
                }
            }
        }
        if (arg1 == 2) {
            if (arg7 == 11) {
                arg7 = 10;
            }
            class263 var12 = class117.method826(arg5, arg6, arg4);
            if (var12 != null) {
                var12.field4118 = new class128((int) (var12.field4122 >>> 32) & Integer.MAX_VALUE, arg7, arg3, arg5, arg6, arg4, arg2, false, var12.field4118);
            }
        }
        if (arg1 == 3) {
            class138 var13 = class253.method1840(arg5, arg6, arg4);
            if (var13 != null) {
                var13.field2205 = new class128(Integer.MAX_VALUE & (int) (var13.field2200 >>> 32), 22, arg3, arg5, arg6, arg4, arg2, false, var13.field2205);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V", line = 247)
    public static void method1613(boolean arg0) {
        field3477 = null;
        if (arg0) {
            method1612((byte) 45, -75, -47, -118, -79, 15, -29, -98);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZLvl;)V", line = 258)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field3485 = arg2.method39((byte) 68);
        } else if (arg0 == 1) {
            this.field3486 = arg2.method39((byte) 47);
        } else if (arg0 == 2) {
            this.field3489 = arg2.method39((byte) 113);
        } else if (arg0 == 3) {
            this.field3475 = arg2.method39((byte) 80);
        } else if (arg0 == 4) {
            int var5 = arg2.method31(-22888);
            this.field3488[1] = class333.method2319(4080, var5 >> 4);
            this.field3488[0] = class333.method2319(267386880, var5 << 4);
            this.field3488[2] = class333.method2319(255, var5) >> 12;
        }
        field3493++;
    }
}
