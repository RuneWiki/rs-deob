import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class251 extends class335 {

    @OriginalMember(owner = "client!wn", name = "P", descriptor = "I")
    private int field3959 = 0;

    @OriginalMember(owner = "client!wn", name = "R", descriptor = "I")
    private int field3961 = 1;

    @OriginalMember(owner = "client!wn", name = "X", descriptor = "I")
    private int field3967 = 0;

    @OriginalMember(owner = "client!wn", name = "U", descriptor = "I")
    public static int field3964 = 0;

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "Lba;")
    public static class53 field3956 = new class53(64);

    @OriginalMember(owner = "client!wn", name = "Y", descriptor = "Lpg;")
    public static class320 field3968 = new class320(64);

    @OriginalMember(owner = "client!wn", name = "Z", descriptor = "I")
    public static int field3969 = 0;

    @OriginalMember(owner = "client!wn", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field3970 = "wave2:";

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!wn", name = "Q", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!wn", name = "S", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!wn", name = "T", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!wn", name = "V", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!wn", name = "W", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!wn", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field3958;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)[I", line = 5)
    public final int[] method149(int arg0, int arg1) {
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (arg1 != 621) {
            this.method230(-79, (class166) null, -71);
        }
        field3960++;
        if (this.field5233.field2467) {
            int var4 = class280.field4316[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class105.field1630; var6++) {
                int var7 = class90.field1437[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field3967 == 0) {
                    var9 = (var7 - var4) * this.field3961;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3961 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field3959 == 0) {
                    var12 = class128.field2009[(var12 & 0xFFD) >> 4] + 4096 >> 1;
                } else if (this.field3959 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZLqf;ZILqf;B)I", line = 77)
    public static final int method1739(int arg0, boolean arg1, class341 arg2, boolean arg3, int arg4, class341 arg5, byte arg6) {
        int var7 = -102 % ((arg6 - 14) / 40);
        int var8 = class315.method2140(arg2, arg5, arg0, 1, arg3);
        field3966++;
        if (var8 != 0) {
            return arg3 ? -var8 : var8;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var9 = class315.method2140(arg2, arg5, arg4, 1, arg1);
            return arg1 ? -var9 : var9;
        }
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V", line = 109)
    public final void method381(int arg0) {
        field3963++;
        int var2 = -49 % ((44 - arg0) / 35);
        class117.method865(10);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/awt/Component;ILki;I)Loa;", line = 120)
    public static final class22 method1740(int arg0, Component arg1, int arg2, class180 arg3, int arg4) {
        field3957++;
        if (class220.field3413 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class22 var5 = (class22) Class.forName("cc").getDeclaredConstructor().newInstance();
                var5.field349 = new int[(class156.field2337 ? 2 : 1) * 256];
                var5.field365 = arg0;
                var5.method96(arg1);
                var5.field368 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field368 > 16384) {
                    var5.field368 = 16384;
                }
                var5.method95(var5.field368);
                if (class55.field918 > 0 && class68.field1127 == null) {
                    class68.field1127 = new class161();
                    class68.field1127.field2426 = arg3;
                    arg3.method1291(class55.field918, 24229, class68.field1127);
                }
                if (class68.field1127 != null) {
                    if (class68.field1127.field2430[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class68.field1127.field2430[arg4] = var5;
                }
                return var5;
            } catch (Throwable var11) {
                try {
                    class13 var7 = new class13(arg3, arg4);
                    int var8 = 43 % ((-arg2 - 15) / 39);
                    var7.field365 = arg0;
                    var7.field349 = new int[(class156.field2337 ? 2 : 1) * 256];
                    var7.method96(arg1);
                    var7.field368 = 16384;
                    var7.method95(var7.field368);
                    if (class55.field918 > 0 && class68.field1127 == null) {
                        class68.field1127 = new class161();
                        class68.field1127.field2426 = arg3;
                        arg3.method1291(class55.field918, 24229, class68.field1127);
                    }
                    if (class68.field1127 != null) {
                        if (class68.field1127.field2430[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class68.field1127.field2430[arg4] = var7;
                    }
                    return var7;
                } catch (Throwable var10) {
                    return new class22();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILkh;I)V", line = 220)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field3967 = arg1.method1178(0);
        } else if (arg0 == 1) {
            this.field3959 = arg1.method1178(0);
        } else if (arg0 == 3) {
            this.field3961 = arg1.method1178(0);
        }
        field3965++;
        if (arg2 < 51) {
            method1739(40, true, (class341) null, false, -103, (class341) null, (byte) 5);
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V", line = 403)
    public class251() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZZIZIIILid;)Lwj;", line = 264)
    public static final class270 method1741(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, class189 arg8) {
        class299 var9 = class237.method1657(2, arg3);
        field3962++;
        if (arg7 > 1 && var9.field4672 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg7 >= var9.field4642[var11] && var9.field4642[var11] != 0) {
                    var10 = var9.field4672[var11];
                }
            }
            if (var10 != -1) {
                var9 = class237.method1657(2, var10);
            }
        }
        class66 var12 = var9.method2031(arg8, 69);
        if (var12 == null) {
            return null;
        }
        class249 var13 = null;
        if (var9.field4616 != -1) {
            var13 = (class249) method1741(0, true, true, var9.field4623, false, 272444528, 1, 10, arg8);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field4668 != -1) {
            var13 = (class249) method1741(arg0, true, false, var9.field4635, false, arg5, arg6, arg7, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = class109.field1702;
        int[] var15 = new int[4];
        int var16 = class109.field1709;
        int[] var17 = class109.field1704;
        class109.method811(var15);
        class249 var18 = new class249(36, 32);
        class109.method800(var18.field3942, 36, 32);
        class15.method121();
        class15.method119(16, 16);
        int var19 = var9.field4631;
        class15.field209 = false;
        if (arg2) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg6 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class15.field216[var9.field4663] * var19 >> 16;
        int var21 = class15.field204[var9.field4663] * var19 >> 16;
        var12.method199(0, var9.field4607, var9.field4680, var9.field4663, var9.field4661, var21 + var9.field4662 - (var12.method76() / 2), var20 - -var9.field4662, -1L);
        if (arg6 >= 1) {
            var18.method1716(1);
            if (arg6 >= 2) {
                var18.method1716(16777215);
            }
            class109.method800(var18.field3942, 36, 32);
        }
        if (arg0 != 0) {
            var18.method1725(arg0);
        }
        if (arg5 != 272444528) {
            method1740(-38, (Component) null, 0, (class180) null, 123);
        }
        if (var9.field4616 != -1) {
            var13.method617(0, 0);
        } else if (var9.field4668 != -1) {
            class109.method800(var13.field3942, 36, 32);
            var18.method617(0, 0);
            var18 = var13;
        }
        if (arg4 && (var9.field4641 == 1 || arg7 != 1) && arg7 != -1) {
            class181.field2735.method2245(class267.method1844(arg7, true), 0, 9, 16776960, 1);
        }
        class109.method800(var17, var16, var14);
        class109.method816(var15);
        class15.method121();
        class15.field209 = true;
        return class94.field1516 && !arg1 ? new class86(var18) : var18;
    }

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)V", line = 391)
    public static void method1742(int arg0) {
        field3970 = null;
        field3956 = null;
        if (arg0 >= -56) {
            method1740(-102, (Component) null, -61, (class180) null, -13);
        }
        field3968 = null;
        field3958 = null;
    }
}
