import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class77 {

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field1493 = 0;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Ldj;")
    private static class44 field1492 = class89.method650(255, "Sorry invited players only)3");

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Ldj;")
    public static class44 field1491 = field1492;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1495 = -1;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field1497 = 0;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lgb;")
    public static class69 field1489;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILvc;IIBII)V")
    public static final void method588(int arg0, class223 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1496++;
        int var7 = arg6 * arg6 + arg3 * arg3;
        if (arg4 < 0 || var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg1.field4130 / 2, arg1.field4134 / 2);
        if (var8 * var8 >= var7) {
            class114.method802(arg0, class154.field2677[arg2], arg3, arg1, true, arg5, arg6);
            return;
        }
        var8 -= 10;
        int var9 = class73.field1384 + class129.field2303 & 0x7FF;
        int var10 = class206.field3700[var9];
        int var11 = class206.field3684[var9];
        int var12 = var10 * 256 / (class218.field3959 + 256);
        int var13 = var11 * 256 / (class218.field3959 + 256);
        int var14 = arg3 * var12 - arg6 * var13 >> 16;
        int var15 = arg3 * var13 + arg6 * var12 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        class57.field1062[arg2].method1013(arg1.field4130 / 2 + arg0 + var18 - 10, arg1.field4134 / 2 + -var19 + arg5 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I")
    public abstract int method589(int arg0);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1489 = null;
        field1492 = null;
        field1491 = null;
        if (arg0 != -22273) {
            field1495 = 57;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method591(Component arg0, byte arg1);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V")
    public static final void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = class221.method1426(arg2, arg4, arg0);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 14 & 0x1F;
            int var9 = (int) var6 >> 20 & 0x3;
            int var10 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            int var11 = (52736 - arg0 * 512) * 4 + arg4 * 4 + 24624;
            int var12 = arg3;
            if (var6 > 0L) {
                var12 = arg1;
            }
            int[] var13 = class193.field3388.field2691;
            class39 var14 = class40.method281(true, var10);
            if (var14.field685 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var9 == 0) {
                        var13[var11] = var12;
                        var13[var11 + 512] = var12;
                        var13[var11 + 1024] = var12;
                        var13[var11 + 1536] = var12;
                    } else if (var9 == 1) {
                        var13[var11] = var12;
                        var13[var11 + 1] = var12;
                        var13[var11 + 2] = var12;
                        var13[var11 + 3] = var12;
                    } else if (var9 == 2) {
                        var13[var11 + 3] = var12;
                        var13[var11 + 515] = var12;
                        var13[var11 + 1027] = var12;
                        var13[var11 + 3 + 1536] = var12;
                    } else if (var9 == 3) {
                        var13[var11 + 1536] = var12;
                        var13[var11 + 1536 + 1] = var12;
                        var13[var11 + 1536 + 2] = var12;
                        var13[var11 + 1536 + 3] = var12;
                    }
                }
                if (var8 == 3) {
                    if (var9 == 0) {
                        var13[var11] = var12;
                    } else if (var9 == 1) {
                        var13[var11 + 3] = var12;
                    } else if (var9 == 2) {
                        var13[var11 + 3 + 1536] = var12;
                    } else if (var9 == 3) {
                        var13[var11 + 1536] = var12;
                    }
                }
                if (var8 == 2) {
                    if (var9 == 3) {
                        var13[var11] = var12;
                        var13[var11 + 512] = var12;
                        var13[var11 + 1024] = var12;
                        var13[var11 + 1536] = var12;
                    } else if (var9 == 0) {
                        var13[var11] = var12;
                        var13[var11 + 1] = var12;
                        var13[var11 + 2] = var12;
                        var13[var11 + 3] = var12;
                    } else if (var9 == 1) {
                        var13[var11 + 3] = var12;
                        var13[var11 + 3 + 512] = var12;
                        var13[var11 + 3 + 1024] = var12;
                        var13[var11 + 1539] = var12;
                    } else if (var9 == 2) {
                        var13[var11 + 1536] = var12;
                        var13[var11 + 1536 + 1] = var12;
                        var13[var11 + 2 + 1536] = var12;
                        var13[var11 + 1536 + 3] = var12;
                    }
                }
            } else {
                class125 var15 = class211.field3785[var14.field685];
                if (var15 != null) {
                    int var16 = (var14.field725 * 4 - var15.field2271) / 2;
                    int var17 = (var14.field698 * 4 - var15.field2269) / 2;
                    var15.method863(arg4 * 4 + var16 + 48, (-var14.field698 + 104 + -arg0) * 4 + var17 + 48);
                }
            }
        }
        long var18 = class86.method640(arg2, arg4, arg0);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 14 & 0x1F;
            int var21 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            int var22 = (int) var18 >> 20 & 0x3;
            class39 var23 = class40.method281(true, var21);
            if (var23.field685 != -1) {
                class125 var27 = class211.field3785[var23.field685];
                if (var27 != null) {
                    int var28 = (var23.field698 * 4 - var27.field2269) / 2;
                    int var29 = (var23.field725 * 4 - var27.field2271) / 2;
                    var27.method863(arg4 * 4 + var29 + 48, (104 - var23.field698 + -arg0) * 4 + var28 + 48);
                }
            } else if (var20 == 9) {
                int var24 = (52736 - arg0 * 512) * 4 + arg4 * 4 + 24624;
                int var25 = 15658734;
                int[] var26 = class193.field3388.field2691;
                if (var18 > 0L) {
                    var25 = 15597568;
                }
                if (var22 == 0 || var22 == 2) {
                    var26[var24 + 1536] = var25;
                    var26[var24 + 1025] = var25;
                    var26[var24 + 514] = var25;
                    var26[var24 + 3] = var25;
                } else {
                    var26[var24] = var25;
                    var26[var24 + 512 + 1] = var25;
                    var26[var24 + 1024 + 2] = var25;
                    var26[var24 + 1536 + 3] = var25;
                }
            }
        }
        int var30 = 6 % ((34 - arg5) / 45);
        long var31 = class239.method1552(arg2, arg4, arg0);
        field1490++;
        if (var31 == 0L) {
            return;
        }
        int var33 = (int) (var31 >>> 32) & Integer.MAX_VALUE;
        class39 var34 = class40.method281(true, var33);
        if (var34.field685 == -1) {
            return;
        }
        class125 var35 = class211.field3785[var34.field685];
        if (var35 != null) {
            int var36 = (var34.field725 * 4 - var35.field2271) / 2;
            int var37 = (var34.field698 * 4 - var35.field2269) / 2;
            var35.method863(arg4 * 4 + var36 + 48, var37 + 48 - -((-var34.field698 + -arg0 + 104) * 4));
            return;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method593(int arg0, int arg1, int arg2, long arg3) {
        class68 var5 = class32.field567[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1298 != null && var5.field1298.field581 == arg3) {
            return true;
        } else if (var5.field1318 != null && var5.field1318.field1811 == arg3) {
            return true;
        } else if (var5.field1304 != null && var5.field1304.field3997 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1300; var6++) {
                if (var5.field1314[var6].field1953 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method594(boolean arg0, Component arg1);
}
