import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class238 extends class30 {

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
    private int field3954 = 0;

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    private int field3955 = 4096;

    @OriginalMember(owner = "client!nn", name = "S", descriptor = "I")
    private int field3962 = 0;

    @OriginalMember(owner = "client!nn", name = "bb", descriptor = "I")
    private int field3970 = 2048;

    @OriginalMember(owner = "client!nn", name = "cb", descriptor = "I")
    private int field3971 = 12288;

    @OriginalMember(owner = "client!nn", name = "X", descriptor = "I")
    private int field3966 = 2048;

    @OriginalMember(owner = "client!nn", name = "P", descriptor = "I")
    private int field3959 = 8192;

    @OriginalMember(owner = "client!nn", name = "Q", descriptor = "[I")
    public static int[] field3960 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!nn", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field3969 = "green:";

    @OriginalMember(owner = "client!nn", name = "eb", descriptor = "[[I")
    public static int[][] field3973 = new int[128][128];

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!nn", name = "N", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!nn", name = "R", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!nn", name = "U", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!nn", name = "V", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!nn", name = "W", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!nn", name = "Y", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!nn", name = "Z", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!nn", name = "db", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!nn", name = "fb", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
    public class238() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIZI)Lic;")
    public static final class415 method1680(int arg0, int arg1, boolean arg2, int arg3) {
        ++field3972;
        int var4 = arg3 | arg0 << 8;
        class415 var5 = (class415) class300.field4763.method1660(2, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class377.field5700.method2776(0, class377.field5700.method2765(var4, arg2));
            if (var6 != null) {
                if (~var6.length >= -2) {
                    return null;
                } else {
                    class415 var7 = class182.method1247((byte) -63, var6);
                    var7.field6135 = arg3;
                    class300.field4763.method1655(false, var7, (long) var4 << 16);
                    return var7;
                }
            } else {
                int var8 = arg3 | arg1 + 65536 << 8;
                class415 var9 = (class415) class300.field4763.method1660(2, (long) var8 << 16);
                if (var9 != null) {
                    return var9;
                } else {
                    byte[] var10 = class377.field5700.method2776(0, class377.field5700.method2765(var8, true));
                    if (var10 != null) {
                        if (~var10.length >= -2) {
                            return null;
                        } else {
                            class415 var11 = class182.method1247((byte) -63, var10);
                            var11.field6135 = arg3;
                            class300.field4763.method1655(false, var11, (long) var8 << 16);
                            return var11;
                        }
                    } else {
                        int var12 = arg3 | 16776960;
                        class415 var13 = (class415) class300.field4763.method1660(2, (long) var12 << 16);
                        if (var13 != null) {
                            return var13;
                        } else {
                            byte[] var14 = class377.field5700.method2776(0, class377.field5700.method2765(var12, arg2));
                            if (var14 != null) {
                                if (var14.length <= 1) {
                                    return null;
                                } else {
                                    class415 var15 = class182.method1247((byte) -63, var14);
                                    var15.field6135 = arg3;
                                    class300.field4763.method1655(!arg2, var15, (long) var12 << 16);
                                    return var15;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(BII)Z")
    private final boolean method1681(byte arg0, int arg1, int arg2) {
        ++field3961;
        int var4 = (arg1 - -arg2) * this.field3971 >> 12;
        int var5 = class183.field2986[(1044589 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3971;
        int var7 = (var6 << 12) / this.field3959;
        int var8 = this.field3955 * var7 >> 12;
        if (arg0 != -1) {
            return false;
        } else {
            return ~(arg1 - arg2) > ~var8 && -arg2 + arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)V")
    public final void method111(byte arg0) {
        if (arg0 < 90) {
            field3969 = null;
        }
        class173.method1208(4096);
        ++field3965;
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(B)Lln;")
    public static final class211 method1682(byte arg0) {
        ++field3968;
        if (arg0 != 44) {
            return null;
        } else {
            class211 var1 = (class211) class58.field758.method364(arg0 + -44);
            if (var1 != null) {
                var1.method1120(83);
                var1.method90((byte) -53);
                return var1;
            } else {
                class211 var2;
                do {
                    var2 = (class211) class8.field105.method364(0);
                    if (var2 == null) {
                        return null;
                    }
                    if (~var2.method1485(0) < ~class46.method297(27104)) {
                        return null;
                    }
                    var2.method1120(87);
                    var2.method90((byte) -53);
                } while ((Long.MIN_VALUE & var2.field86) == 0L);
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)V")
    public static final void method1683(int arg0) {
        class52 var1 = class248.field4056;
        synchronized (class248.field4056) {
            class248.field4056.method336(112);
            if (arg0 != 14826) {
                field3969 = null;
            }
        }
        ++field3964;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(III)Lcb;")
    public static final class303 method1684(int arg0, int arg1, int arg2) {
        class232 var3 = class423.field6252[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3878;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 != 6456) {
            method1684(9, -99, -4);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field3959 = arg0.method1272((byte) -79);
                                }
                            } else {
                                this.field3955 = arg0.method1272((byte) -122);
                            }
                        } else {
                            this.field3971 = arg0.method1272((byte) -61);
                        }
                    } else {
                        this.field3966 = arg0.method1272((byte) -96);
                    }
                } else {
                    this.field3954 = arg0.method1272((byte) -105);
                }
            } else {
                this.field3962 = arg0.method1272((byte) -51);
            }
        } else {
            this.field3970 = arg0.method1272((byte) -124);
        }
        ++field3956;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZII)Z")
    private final boolean method1685(boolean arg0, int arg1, int arg2) {
        ++field3957;
        int var4 = (arg2 - arg1) * this.field3971 >> 12;
        int var5 = class183.field2986[(1045853 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3971;
        if (!arg0) {
            this.field3955 = -106;
        }
        int var7 = (var6 << 12) / this.field3959;
        int var8 = this.field3955 * var7 >> 12;
        return ~(arg1 + arg2) > ~var8 && ~(-var8) > ~(arg1 + arg2);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field3974;
        int[] var3 = super.field371.method2367((byte) 72, arg0);
        if (arg1 < 49) {
            this.field3959 = 0;
        }
        if (super.field371.field5586) {
            int var4 = class132.field2064[arg0] - 2048;
            for (int var5 = 0; class369.field5610 > var5; ++var5) {
                int var6 = class79.field995[var5] + -2048;
                int var7 = this.field3970 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                int var10 = this.field3962 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = var11 > 2048 ? var11 + -4096 : var11;
                int var13 = this.field3954 + var6;
                int var14 = ~var13 <= 2047 ? var13 : var13 - -4096;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field3966 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method1685(true, var9, var12) && !this.method1681((byte) -1, var18, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lkk;IIII)V")
    public static final void method1686(class102 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class306.method2058(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class156.field2449) {
            class306.method2058(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class306.method2058(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class361.field5513) {
            class306.method2058(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class361.field5513) {
            class306.method2058(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class156.field2449 && arg4 <= class361.field5513) {
            class306.method2058(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class306.method2058(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class156.field2449 && arg4 > 0) {
            class306.method2058(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)V")
    public static void method1687(int arg0) {
        field3973 = null;
        if (arg0 <= 104) {
            field3960 = null;
        }
        field3960 = null;
        field3969 = null;
    }
}
