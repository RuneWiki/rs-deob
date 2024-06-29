import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class252 extends class12 {

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public int field4339;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Lvf;")
    public static class265 field4338 = class87.method582(-46, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Z")
    public static boolean field4343 = false;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "Z")
    public static boolean field4341 = false;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field4344 = 0;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Lok;")
    public static class127 field4334;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "Lfl;")
    public static class192 field4340;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lvj;")
    public static class88 field4330;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "[Lr;")
    public static class229[] field4331;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
    public static final void method1669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4332++;
        for (int var6 = arg3; var6 <= (arg3 + arg5); var6++) {
            for (int var11 = arg1; var11 <= (arg1 + arg4); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class11.field385[arg0][var11][var6] = 127;
                }
            }
        }
        int var7 = arg3;
        if (arg2 != -17939) {
            field4330 = null;
        }
        while (var7 < arg3 + arg5) {
            for (int var10 = arg1; var10 < arg1 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class279.field4936[arg0][var10][var7] = arg0 > 0 ? class279.field4936[arg0 - 1][var10][var7] : 0;
                }
            }
            var7++;
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var8 = arg3 + 1; var8 < (arg3 + arg5); var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class279.field4936[arg0][arg1][var8] = class279.field4936[arg0][arg1 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var9 = arg1 + 1; var9 < arg1 + arg4; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class279.field4936[arg0][var9][arg3] = class279.field4936[arg0][var9][arg3 - 1];
                }
            }
        }
        if (arg1 < 0 || arg3 < 0 || arg1 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 > 0 && class279.field4936[arg0][arg1 - 1][arg3] != 0) {
                class279.field4936[arg0][arg1][arg3] = class279.field4936[arg0][arg1 - 1][arg3];
                return;
            }
            if (arg3 > 0 && class279.field4936[arg0][arg1][arg3 - 1] != 0) {
                class279.field4936[arg0][arg1][arg3] = class279.field4936[arg0][arg1][arg3 - 1];
                return;
            }
            if (arg1 > 0 && arg3 > 0 && class279.field4936[arg0][arg1 - 1][arg3 - 1] != 0) {
                class279.field4936[arg0][arg1][arg3] = class279.field4936[arg0][arg1 - 1][arg3 - 1];
                return;
            }
            return;
        }
        if (arg1 > 0 && class279.field4936[arg0 - 1][arg1 - 1][arg3] != class279.field4936[arg0][arg1 - 1][arg3]) {
            class279.field4936[arg0][arg1][arg3] = class279.field4936[arg0][arg1 - 1][arg3];
            return;
        }
        if (arg3 > 0 && class279.field4936[arg0 - 1][arg1][arg3 - 1] != class279.field4936[arg0][arg1][arg3 - 1]) {
            class279.field4936[arg0][arg1][arg3] = class279.field4936[arg0][arg1][arg3 - 1];
            return;
        }
        if (arg1 > 0 && arg3 > 0 && class279.field4936[arg0][arg1 - 1][arg3 - 1] != class279.field4936[arg0 - 1][arg1 - 1][arg3 - 1]) {
            class279.field4936[arg0][arg1][arg3] = class279.field4936[arg0][arg1 - 1][arg3 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static void method1670(boolean arg0) {
        field4330 = null;
        field4334 = null;
        field4331 = null;
        if (arg0) {
            method1671(17, -76);
        }
        field4338 = null;
        field4340 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lih;")
    public static final class26 method1671(int arg0, int arg1) {
        field4336++;
        class26 var2 = (class26) class242.field4204.method1424((long) arg0, (byte) 98);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class116.field2061.method1332(true, 0, arg0);
        if (var3 == null) {
            return null;
        }
        class26 var4 = new class26();
        class135 var5 = new class135(var3);
        var5.field2449 = var5.field2483.length - 2;
        int var6 = 96 / ((-arg1 - 65) / 59);
        int var7 = var5.method927(127);
        int var8 = var5.field2483.length - var7 - 2 - 12;
        var5.field2449 = var8;
        int var9 = var5.method949(3933);
        var4.field710 = var5.method927(125);
        var4.field705 = var5.method927(126);
        var4.field715 = var5.method927(126);
        var4.field704 = var5.method927(126);
        int var10 = var5.method920((byte) 63);
        if (var10 > 0) {
            var4.field701 = new class269[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = var5.method927(125);
                class269 var13 = new class269(class98.method651(var12, (byte) -125));
                var4.field701[var11] = var13;
                while ((var12--) > 0) {
                    int var14 = var5.method949(3933);
                    int var15 = var5.method949(3933);
                    var13.method1838((long) var14, new class203(var15), (byte) 8);
                }
            }
        }
        var5.field2449 = 0;
        var4.field713 = var5.method896(false);
        int var16 = 0;
        var4.field714 = new int[var9];
        var4.field712 = new int[var9];
        var4.field700 = new class265[var9];
        while (var8 > var5.field2449) {
            int var17 = var5.method927(126);
            if (var17 == 3) {
                var4.field700[var16] = var5.method942(false);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var4.field712[var16] = var5.method920((byte) 33);
            } else {
                var4.field712[var16] = var5.method949(3933);
            }
            var4.field714[var16++] = var17;
        }
        class242.field4204.method1419(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V")
    public class252(int arg0, int arg1) {
        this.field4335 = arg0;
        this.field4339 = arg1;
    }
}
