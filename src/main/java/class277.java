import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class277 extends class644 {

    @OriginalMember(owner = "client!vea", name = "x", descriptor = "Z")
    public boolean field3476;

    @OriginalMember(owner = "client!vea", name = "F", descriptor = "Z")
    public boolean field3484;

    @OriginalMember(owner = "client!vea", name = "w", descriptor = "Ljava/lang/String;")
    public String field3475;

    @OriginalMember(owner = "client!vea", name = "r", descriptor = "Z")
    public boolean field3470;

    @OriginalMember(owner = "client!vea", name = "C", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!vea", name = "s", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!vea", name = "E", descriptor = "Ljava/lang/String;")
    public String field3483;

    @OriginalMember(owner = "client!vea", name = "t", descriptor = "J")
    public long field3472;

    @OriginalMember(owner = "client!vea", name = "u", descriptor = "I")
    public int field3473;

    @OriginalMember(owner = "client!vea", name = "y", descriptor = "I")
    public int field3477;

    @OriginalMember(owner = "client!vea", name = "B", descriptor = "J")
    public long field3480;

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "I")
    public int field3478;

    @OriginalMember(owner = "client!vea", name = "G", descriptor = "I")
    public static int field3485 = 0;

    @OriginalMember(owner = "client!vea", name = "A", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!vea", name = "v", descriptor = "Lpda;")
    public static class631 field3474;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vea", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field3486;

    @OriginalMember(owner = "client!vea", name = "D", descriptor = "Ljava/lang/String;")
    public String field3482;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILria;)V")
    public static final void method1635(int arg0, class288 arg1) {
        field3479++;
        if (class472.field6331 == arg1.field3715) {
            if (class380.field4847.field10062 == null) {
                arg1.field3668 = 0;
                arg1.field3755 = 0;
            } else {
                arg1.field3765 = 150;
                arg1.field3708 = (int) (Math.sin((double) class463.field6224 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3689 = 5;
                arg1.field3755 = class54.field755;
                arg1.field3668 = class638.method3578(class380.field4847.field10062, 7390);
                arg1.field3648 = class380.field4847.field215;
                arg1.field3616 = class380.field4847.field251;
                arg1.field3748 = 0;
                arg1.field3776 = class380.field4847.field168;
                class56 var2 = arg1.field3648 == -1 ? null : class66.field941.method1299((byte) -106, arg1.field3648);
                if (var2 != null) {
                    class484.method2857(true, var2, arg1.field3776);
                }
            }
        } else if (arg0 < 79) {
            method1635(91, null);
        }
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(B)V")
    public static void method1636(byte arg0) {
        field3474 = null;
        if (arg0 > -30) {
            field3485 = 72;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "()V")
    public static final void method1637() {
        for (int var0 = 0; var0 < class178.field2498; var0++) {
            if (!class592.field8277[var0]) {
                class667 var1 = class58.field808[var0];
                class123 var2 = var1.field9381;
                int var3 = var1.field9375;
                int var4 = var2.method935(0) - class139.field1991;
                int var5 = (var4 * 2 >> class480.field6531) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method932(-16562) - var4 >> class480.field6531;
                int var9 = var2.method938(0) - var4 >> class480.field6531;
                int var10 = var2.method938(0) + var4 >> class480.field6531;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class463.field6223) {
                    var10 = class463.field6223 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field9376[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class289.field3784) {
                        var16 = class289.field3784 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class556 var19 = class290.method1735(var3, var17, var11, field3486 == null ? (field3486 = method1638("ii")) : field3486);
                        if (var19 != null && var19.field7738 != 0) {
                            if (var19.field7738 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field9376[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field9376[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field9376[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field9376[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class592.field8277[var0] = true;
                class195.field2669[var3].method1687(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class277(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field3476 = arg8;
        this.field3484 = arg9;
        this.field3475 = arg1;
        this.field3470 = arg11;
        this.field3481 = arg7;
        this.field3471 = arg6;
        this.field3483 = arg0;
        this.field3472 = arg10;
        this.field3473 = arg4;
        this.field3477 = arg2;
        this.field3480 = arg5;
        this.field3478 = arg3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1638(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
