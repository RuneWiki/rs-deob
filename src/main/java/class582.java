import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class582 {

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    private int field8470 = 0;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lpt;")
    private class451 field8471;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Z")
    public static boolean field8467 = false;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Lwda;")
    private class544 field8473;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field8475;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3390(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIIII)V", line = 3)
    public static final void method3384(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field8468++;
        if (class565.field8299.field2167 != 0 && arg3 != 0 && class570.field8370 < 50 && arg1 != -1) {
            class250.field3228[class570.field8370++] = new class114((byte) 1, arg1, arg3, arg4, arg2, 0);
        }
        if (arg0) {
            field8467 = true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V", line = 27)
    public static final void method3385() {
        for (int var0 = 0; var0 < class460.field6344; var0++) {
            if (!class175.field2125[var0]) {
                class328 var1 = class602.field8699[var0];
                class469 var2 = var1.field4282;
                int var3 = var1.field4274;
                int var4 = var2.method2735((byte) 113) - class410.field5342;
                int var5 = (var4 * 2 >> class362.field4756) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2731((byte) -96) - var4 >> class362.field4756;
                int var9 = var2.method2737((byte) -86) - var4 >> class362.field4756;
                int var10 = var2.method2737((byte) -86) + var4 >> class362.field4756;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class548.field8061) {
                    var10 = class548.field8061 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field4271[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class238.field2985) {
                        var16 = class238.field2985 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class598 var19 = class198.method1072(var3, var17, var11, field8475 == null ? (field8475 = method3390("gn")) : field8475);
                        if (var19 != null && var19.field8656 != 0) {
                            if (var19.field8656 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field4271[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field4271[var6 - 1];
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
                                    short var30 = var1.field4271[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field4271[var6 + 1];
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
                class175.field2125[var0] = true;
                class128.field1574[var3].method850(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 201)
    public static final void method3386(String arg0, int arg1, int arg2) {
        field8469++;
        class557 var3 = class93.method564(arg2, arg2 - 14075, arg1);
        var3.method3257(1948);
        var3.field8216 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Lwda;", line = 212)
    public final class544 method3387(int arg0) {
        this.field8470 = arg0;
        field8466++;
        return this.method3389(arg0 ^ 0x1);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 274)
    public class582() {
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lpt;)V", line = 276)
    public class582(class451 arg0) {
        this.field8471 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 230)
    public static final void method3388(int arg0) {
        field8474++;
        if (arg0 == 255) {
            class172.field2092.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)Lwda;", line = 242)
    public final class544 method3389(int arg0) {
        field8472++;
        if (this.field8470 > 0 && this.field8471.field6243[this.field8470 - 1] != this.field8473) {
            class544 var2 = this.field8473;
            this.field8473 = var2.field7964;
            return var2;
        } else if (arg0 == 1) {
            while (this.field8471.field6246 > this.field8470) {
                class544 var3 = this.field8471.field6243[this.field8470++].field7964;
                if (this.field8471.field6243[this.field8470 - 1] != var3) {
                    this.field8473 = var3.field7964;
                    return var3;
                }
            }
            return null;
        } else {
            return null;
        }
    }
}
