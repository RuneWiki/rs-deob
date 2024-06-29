import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public abstract class class184 extends class383 {

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "[Lmm;")
    public class184[] field2407;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "Z")
    public boolean field2406;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "[I")
    public static int[] field2414 = new int[2];

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "Z")
    public static boolean field2419 = false;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "Lgs;")
    public class34 field2409;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "Llu;")
    public class503 field2416;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)[I", line = 3)
    public int[] method6(int arg0, int arg1) {
        if (arg1 == 578) {
            field2421++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Z)V", line = 18)
    public void method109(boolean arg0) {
        field2418++;
        if (arg0) {
            field2414 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(Z)I", line = 30)
    public int method814(boolean arg0) {
        if (!arg0) {
            this.field2409 = null;
        }
        field2405++;
        return -1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)[I", line = 42)
    public final int[] method1159(int arg0, int arg1, int arg2) {
        if (arg0 < 23) {
            this.field2409 = null;
        }
        field2422++;
        return this.field2407[arg2].field2406 ? this.field2407[arg2].method6(arg1, 578) : this.field2407[arg2].method13(arg1, 1)[0];
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)V", line = 67)
    public void method816(int arg0, int arg1, int arg2) {
        field2412++;
        int var4 = -126 / ((arg2 + 48) / 62);
        int var5 = this.field2408 == 255 ? arg1 : this.field2408;
        if (this.field2406) {
            this.field2409 = new class34(var5, arg1, arg0);
        } else {
            this.field2416 = new class503(var5, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 90)
    public void method549(int arg0) {
        if (this.field2406) {
            this.field2409.method246(-22958);
            this.field2409 = null;
        } else {
            this.field2416.method3032(103);
            this.field2416 = null;
        }
        if (arg0 == -1) {
            field2404++;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)[[I", line = 117)
    public int[][] method13(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method548((byte) -99);
        }
        field2411++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([IIIII)V", line = 130)
    public static final void method1160(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field2415++;
        arg4--;
        int var6 = arg3 - 1;
        int var5 = arg1 + var6;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var11 = var10 + 1;
            arg0[var11] = arg2;
            int var12 = var11 + 1;
            arg0[var12] = arg2;
            int var13 = var12 + 1;
            arg0[var13] = arg2;
            arg4 = var13 + 1;
            arg0[arg4] = arg2;
        }
        while (var6 > arg4) {
            arg4++;
            arg0[arg4] = arg2;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)I", line = 158)
    public int method548(byte arg0) {
        int var2 = 10 / ((arg0 - 54) / 44);
        field2417++;
        return -1;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IZ)V", line = 171)
    public class184(int arg0, boolean arg1) {
        this.field2407 = new class184[arg0];
        this.field2406 = arg1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BILfh;)V", line = 189)
    public void method7(byte arg0, int arg1, class463 arg2) {
        field2410++;
        int var4 = -107 / ((arg0 + 13) / 51);
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(Z)V", line = 205)
    public static void method1161(boolean arg0) {
        field2414 = null;
        if (arg0) {
            field2419 = true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lfh;B)V", line = 215)
    public static final void method1162(class463 arg0, byte arg1) {
        field2403++;
        if (arg0.field6618.length - arg0.field6631 < 1) {
            return;
        }
        int var2 = arg0.method2737(false);
        if (var2 < 0 || var2 > 1 || arg0.field6618.length - arg0.field6631 < 2) {
            return;
        }
        int var3 = arg0.method2758((byte) 79);
        if (var3 * 6 > arg0.field6618.length - arg0.field6631) {
            return;
        }
        int var4 = 0;
        if (arg1 >= -85) {
            field2414 = null;
        }
        while (var3 > var4) {
            int var5 = arg0.method2758((byte) 77);
            int var6 = arg0.method2727(-91);
            if (class372.field4824.length > var5 && class341.field4300[var5] && (class359.field4640.method574(var5, (byte) 53).field1121 != '1' || var6 >= -1 && var6 <= 1)) {
                class372.field4824[var5] = var6;
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(III)[[I", line = 265)
    public final int[][] method1163(int arg0, int arg1, int arg2) {
        field2413++;
        if (arg0 != 1) {
            field2419 = false;
        }
        if (this.field2407[arg2].field2406) {
            int[] var4 = this.field2407[arg2].method6(arg1, 578);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2407[arg2].method13(arg1, 1);
        }
    }
}
