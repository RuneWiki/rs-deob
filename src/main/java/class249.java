import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class249 extends Canvas {

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Ljava/awt/Component;")
    private Component field4379;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Lsb;")
    public static class98 field4375 = class47.method368("_labels", 0);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field4370 = 0;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Lsb;")
    private static class98 field4377 = class47.method368("Please wait)3)3)3", 0);

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Lsb;")
    public static class98 field4376 = class47.method368(" <col=ffff00>", 0);

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Lsb;")
    public static class98 field4374 = field4377;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static void method1729(int arg0) {
        field4375 = null;
        field4377 = null;
        if (arg0 == 32) {
            field4376 = null;
            field4374 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public static final void method1730(int arg0) {
        while (true) {
            if (class144.field2536.method478(class47.field789, 122) >= 11) {
                int var1 = class144.field2536.method483(8, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class141.field2499[var1] == null) {
                        class141.field2499[var1] = new class192();
                        if (class129.field2304[var1] != null) {
                            class141.field2499[var1].method1328(class129.field2304[var1], (byte) -115);
                        }
                        var2 = true;
                    }
                    class51.field831[class97.field1671++] = var1;
                    class192 var3 = class141.field2499[var1];
                    var3.field4456 = class236.field4071;
                    int var4 = class144.field2536.method483(8, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class144.field2536.method483(8, 1);
                    if (var5 == 1) {
                        class244.field4240[class104.field1855++] = var1;
                    }
                    int var6 = class144.field2536.method483(arg0 ^ 0xFFFFFFFC, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class144.field2536.method483(8, 1);
                    int var8 = class28.field527[class144.field2536.method483(8, 3)];
                    if (var2) {
                        var3.field4480 = var3.field4527 = var8;
                    }
                    var3.method1765(var7 == 1, class163.field2943.field4501[0] + var6, class163.field2943.field4491[0] + var4, (byte) -126);
                    continue;
                }
            }
            class144.field2536.method479((byte) 126);
            field4378++;
            if (arg0 != -12) {
                method1731(100, (class75) null, (class8) null, (class75) null, (class75) null);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILtg;Lub;Ltg;Ltg;)Z")
    public static final boolean method1731(int arg0, class75 arg1, class8 arg2, class75 arg3, class75 arg4) {
        class86.field1518 = arg4;
        class120.field2180 = arg1;
        class224.field3869 = arg3;
        class131.field2330 = arg2;
        if (arg0 == -21040) {
            field4373++;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIIIII)V")
    public static final void method1732(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4380++;
        int var6 = 0;
        if (arg0 >= -34) {
            return;
        }
        int var7 = arg5 * arg5;
        int var8 = arg2 * arg2;
        int var9 = arg2;
        int var10 = var8 << 1;
        int var11 = arg2 << 1;
        int var12 = (1 - var11) * var7 + var10;
        int var13 = var7 << 2;
        int var14 = var7 << 1;
        int var15 = var8 << 2;
        int var16 = var8 - ((var11 - 1) * var14);
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var14;
        int var19 = (var6 + 1) * var15;
        int var20 = (arg2 - 1) * var13;
        if (class116.field2077 <= arg3 && class215.field3666 >= arg3) {
            int var21 = class47.method369(2, arg4 + arg5, class229.field3933, class106.field1899);
            int var22 = class47.method369(2, arg4 - arg5, class229.field3933, class106.field1899);
            class37.method305(-7, class43.field721[arg3], var21, arg1, var22);
        }
        while (var9 > 0) {
            if (var12 < 0) {
                while (var12 < 0) {
                    var6++;
                    var12 += var17;
                    var16 += var19;
                    var19 += var15;
                    var17 += var15;
                }
            }
            if (var16 < 0) {
                var12 += var17;
                var17 += var15;
                var16 += var19;
                var19 += var15;
                var6++;
            }
            var16 += -var18;
            var9--;
            int var23 = arg3 + var9;
            var18 -= var13;
            var12 += -var20;
            int var24 = arg3 - var9;
            if (var23 >= class116.field2077 && var24 <= class215.field3666) {
                int var25 = class47.method369(2, arg4 + var6, class229.field3933, class106.field1899);
                int var26 = class47.method369(2, arg4 - var6, class229.field3933, class106.field1899);
                if (var24 >= class116.field2077) {
                    class37.method305(-7, class43.field721[var24], var25, arg1, var26);
                }
                if (var23 <= class215.field3666) {
                    class37.method305(-7, class43.field721[var23], var25, arg1, var26);
                }
            }
            var20 -= var13;
        }
    }

    @OriginalMember(owner = "client!cj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4371++;
        this.field4379.update(arg0);
    }

    @OriginalMember(owner = "client!cj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field4372++;
        this.field4379.paint(arg0);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class249(Component arg0) {
        this.field4379 = arg0;
    }
}
