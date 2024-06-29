import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class471 {

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Laj;")
    private class287 field6677 = new class287(64);

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Lom;")
    private class344 field6679;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "[I")
    public static int[] field6685 = new int[1000];

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "J")
    public static long field6678;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field6680;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6683++;
        int var8 = 0;
        if (arg0 > -108) {
            field6676 = 32;
        }
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg6 - arg1;
        int var12 = arg5 - arg1;
        int var13 = arg6 * arg6;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class582.field8429[arg7];
        class705.method3938(arg2 - var11, arg3, 30336, arg2 - arg6, var39);
        class705.method3938(arg2 + var11, arg4, 30336, arg2 - var11, var39);
        class705.method3938(arg2 + arg6, arg3, 30336, arg2 + var11, var39);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var41 = arg7 - var9;
            int var42 = arg7 + var9;
            int var43 = arg2 + var8;
            int var44 = arg2 - var8;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class705.method3938(var46, arg3, 30336, var44, class582.field8429[var41]);
                class705.method3938(var45, arg4, 30336, var46, class582.field8429[var41]);
                class705.method3938(var43, arg3, 30336, var45, class582.field8429[var41]);
                class705.method3938(var46, arg3, 30336, var44, class582.field8429[var42]);
                class705.method3938(var45, arg4, 30336, var46, class582.field8429[var42]);
                class705.method3938(var43, arg3, 30336, var45, class582.field8429[var42]);
            } else {
                class705.method3938(var43, arg3, 30336, var44, class582.field8429[var41]);
                class705.method3938(var43, arg3, 30336, var44, class582.field8429[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII[BI)Z")
    public static final boolean method2826(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field6681++;
        boolean var6 = true;
        class61 var7 = new class61(arg4);
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method703(128);
            if (var9 == 0) {
                if (arg0 != 3695) {
                    method2825(-60, -86, -99, -89, -63, -54, 67, 121);
                }
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class56 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method752(arg0 - 30973);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method732(-559537960);
                                    }
                                    int var12 = var7.method752(arg0 - 30973);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method732(-559537960) >> 2;
                                    var16 = arg3 + var14;
                                    var17 = arg2 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while ((arg1 - 1) <= var16);
                    } while (arg5 - 1 <= var17);
                    var18 = class237.field3521.method3515(var8, 50);
                } while (var15 == 22 && !class527.field7429.field2665 && var18.field1290 == 0 && var18.field1288 != 1 && !var18.field1283);
                var11 = true;
                if (!var18.method660((byte) 53)) {
                    class363.field5387++;
                    var6 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public final void method2827(int arg0) {
        class287 var2 = this.field6677;
        synchronized (this.field6677) {
            if (arg0 != -16697) {
                this.field6679 = null;
            }
            this.field6677.method1912(-2552);
        }
        field6675++;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public final void method2828(int arg0) {
        class287 var2 = this.field6677;
        synchronized (this.field6677) {
            this.field6677.method1913(true);
            int var3 = -44 / ((arg0 - 71) / 32);
        }
        field6674++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
    public final void method2829(int arg0, int arg1) {
        field6684++;
        class287 var3 = this.field6677;
        synchronized (this.field6677) {
            this.field6677.method1908(arg0, (byte) -11);
        }
        if (arg1 != 18294) {
            field6685 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public static void method2830(int arg0) {
        field6685 = null;
        int var1 = 55 / ((arg0 + 16) / 62);
        field6680 = null;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)Lhu;")
    public final class117 method2831(int arg0, int arg1) {
        field6682++;
        class287 var3 = this.field6677;
        class117 var4;
        synchronized (this.field6677) {
            var4 = (class117) this.field6677.method1900((long) arg0, 112);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field6679;
        byte[] var6;
        synchronized (this.field6679) {
            var6 = this.field6679.method2216(35, arg0, true);
        }
        class117 var7 = new class117();
        if (var6 != null) {
            var7.method1023(108, new class61(var6));
        }
        var7.method1026((byte) -98);
        class287 var8 = this.field6677;
        synchronized (this.field6677) {
            this.field6677.method1904(var7, (long) arg0, -1);
        }
        int var9 = -88 % ((60 - arg1) / 63);
        return var7;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class471(class398 arg0, int arg1, class344 arg2) {
        this.field6679 = arg2;
        if (this.field6679 != null) {
            this.field6679.method2236(35, 0);
        }
    }
}
