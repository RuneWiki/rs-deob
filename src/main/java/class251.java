import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class251 implements Runnable {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Z")
    public boolean field4393 = true;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field4394 = new Object();

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "[I")
    public int[] field4401 = new int[500];

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "[I")
    public int[] field4400 = new int[500];

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public int field4399 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lsb;")
    public static class98 field4391 = class47.method368("<col=40ff00>", 0);

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lsb;")
    public static class98 field4396 = class47.method368("Lade Sprites )2 ", 0);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ic", name = "run", descriptor = "()V")
    public final void run() {
        field4392++;
        while (this.field4393) {
            Object var1 = this.field4394;
            synchronized (this.field4394) {
                if (this.field4399 < 500) {
                    this.field4401[this.field4399] = class75.field1322;
                    this.field4400[this.field4399] = class199.field3426;
                    this.field4399++;
                }
            }
            class234.method1603(50L, 32);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method1739(int arg0) {
        if (arg0 == 20823) {
            field4396 = null;
            field4391 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII)V")
    public static final void method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 <= (arg1 + arg5); var6++) {
            for (int var11 = arg3; var11 <= (arg0 + arg3); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class135.field2392[arg2][var11][var6] = 127;
                }
            }
        }
        field4395++;
        for (int var7 = arg5; var7 < arg1 + arg5; var7++) {
            for (int var10 = arg3; var10 < arg3 + arg0; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class78.field1393[arg2][var10][var7] = arg2 > 0 ? class78.field1393[arg2 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var8 = arg5 + 1; var8 < arg5 + arg1; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class78.field1393[arg2][arg3][var8] = class78.field1393[arg2][arg3 - 1][var8];
                }
            }
        }
        if (arg5 > arg4 && arg5 < 104) {
            for (int var9 = arg3 + 1; var9 < arg0 + arg3; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class78.field1393[arg2][var9][arg5] = class78.field1393[arg2][var9][arg5 - 1];
                }
            }
        }
        if (arg3 < 0 || arg5 < 0 || arg3 >= 104 || arg5 >= 104) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 <= 0 || class78.field1393[arg2][arg3 - 1][arg5] == 0) {
                if (arg5 > 0 && class78.field1393[arg2][arg3][arg5 - 1] != 0) {
                    class78.field1393[arg2][arg3][arg5] = class78.field1393[arg2][arg3][arg5 - 1];
                    return;
                }
                if (arg3 > 0 && arg5 > 0 && class78.field1393[arg2][arg3 - 1][arg5 - 1] != 0) {
                    class78.field1393[arg2][arg3][arg5] = class78.field1393[arg2][arg3 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            class78.field1393[arg2][arg3][arg5] = class78.field1393[arg2][arg3 - 1][arg5];
        } else if (arg3 <= 0 || class78.field1393[arg2 - 1][arg3 - 1][arg5] == class78.field1393[arg2][arg3 - 1][arg5]) {
            if (arg5 > 0 && class78.field1393[arg2 - 1][arg3][arg5 - 1] != class78.field1393[arg2][arg3][arg5 - 1]) {
                class78.field1393[arg2][arg3][arg5] = class78.field1393[arg2][arg3][arg5 - 1];
                return;
            }
            if (arg3 > 0 && arg5 > 0 && class78.field1393[arg2][arg3 - 1][arg5 - 1] != class78.field1393[arg2 - 1][arg3 - 1][arg5 - 1]) {
                class78.field1393[arg2][arg3][arg5] = class78.field1393[arg2][arg3 - 1][arg5 - 1];
                return;
            }
        } else {
            class78.field1393[arg2][arg3][arg5] = class78.field1393[arg2][arg3 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static final void method1741(int arg0) {
        class53.field849.method1565(arg0 - 1);
        if (arg0 == 0) {
            field4402++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V")
    public static final void method1742(boolean arg0, int arg1) {
        class207.field3546.method1561(-55, arg1);
        field4397++;
        class122.field2240.method1561(-108, arg1);
        class13.field246.method1561(-57, arg1);
        if (!arg0) {
            method1742(false, -97);
        }
    }
}
