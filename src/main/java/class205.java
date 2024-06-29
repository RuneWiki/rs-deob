import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class205 extends class155 {

    @OriginalMember(owner = "client!f", name = "B", descriptor = "Z")
    public boolean field3284 = true;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public int field3289 = -1;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public int field3294 = 12800;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public int field3283 = 12800;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public int field3303 = 0;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
    public int field3310 = 0;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    public int field3311 = -1;

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "Ljava/lang/String;")
    public String field3308;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "Ljava/lang/String;")
    public String field3293;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public int field3301;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "Lbb;")
    public class49 field3287;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field3285 = 0;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "[I")
    public static int[] field3297 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!f", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3292 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "[Lmd;")
    public static class273[] field3299;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III[I)Z")
    public final boolean method1426(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg2 <= 6) {
            return true;
        }
        field3291++;
        for (class108 var5 = (class108) this.field3287.method309(0); var5 != null; var5 = (class108) this.field3287.method312((byte) -89)) {
            if (var5.method807(arg0, true, arg1)) {
                var5.method806(arg1, arg0, 1, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!f", name = "i", descriptor = "(I)V")
    public final void method1427(int arg0) {
        field3304++;
        this.field3310 = arg0;
        this.field3294 = 12800;
        this.field3283 = 12800;
        this.field3303 = 0;
        for (class108 var2 = (class108) this.field3287.method309(arg0); var2 != null; var2 = (class108) this.field3287.method312((byte) 118)) {
            if (var2.field1766 < this.field3294) {
                this.field3294 = var2.field1766;
            }
            if (this.field3303 < var2.field1769) {
                this.field3303 = var2.field1769;
            }
            if (this.field3310 < var2.field1779) {
                this.field3310 = var2.field1779;
            }
            if (this.field3283 > var2.field1772) {
                this.field3283 = var2.field1772;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([III[Ljava/lang/Object;I)V")
    public static final void method1428(int[] arg0, int arg1, int arg2, Object[] arg3, int arg4) {
        if (arg1 < arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg0[var5];
            int var7 = arg1;
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var6;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; var9++) {
                if (arg0[var9] < (var6 + (var9 & 0x1))) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7] = var10;
                    Object var11 = arg3[var9];
                    arg3[var9] = arg3[var7];
                    arg3[var7++] = var11;
                }
            }
            arg0[arg4] = arg0[var7];
            arg0[var7] = var6;
            arg3[arg4] = arg3[var7];
            arg3[var7] = var8;
            method1428(arg0, arg1, -116, arg3, var7 - 1);
            method1428(arg0, var7 + 1, -95, arg3, arg4);
        }
        field3298++;
        if (arg2 >= -57) {
            field3292 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Lnj;")
    public static final class206 method1429(boolean arg0) {
        if (arg0) {
            return null;
        }
        field3307++;
        if (class148.field2439 == null) {
            return null;
        } else {
            class149.field2469.method1953((byte) -98, class148.field2439);
            class206 var1 = (class206) class149.field2469.method1952((byte) -97);
            class195 var2 = class22.method146((byte) -48, var1.field3327);
            return var2 != null && var2.field3126 && var2.method1395(29435) ? var1 : class35.method217(0);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Z")
    public final boolean method1430(int arg0, int arg1, int arg2) {
        field3288++;
        for (class108 var4 = (class108) this.field3287.method309(arg0); var4 != null; var4 = (class108) this.field3287.method312((byte) 118)) {
            if (var4.method811(arg2, (byte) 54, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIII)V")
    public static final void method1431(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            return;
        }
        class36 var4 = class136.method1013(9, arg2, (byte) -90);
        field3300++;
        var4.method224(false);
        var4.field577 = arg3;
        var4.field560 = arg1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([IIIII)Z")
    public final boolean method1432(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field3302++;
        class108 var6 = (class108) this.field3287.method309(0);
        int var7 = -40 / ((36 - arg3) / 33);
        while (var6 != null) {
            if (var6.method805((byte) 3, arg2, arg1, arg4)) {
                var6.method809(5782, arg4, arg0, arg1);
                return true;
            }
            var6 = (class108) this.field3287.method312((byte) -105);
        }
        return false;
    }

    @OriginalMember(owner = "client!f", name = "j", descriptor = "(I)V")
    public static void method1433(int arg0) {
        field3299 = null;
        field3292 = null;
        field3297 = null;
        if (arg0 > -39) {
            method1428((int[]) null, 104, -75, (Object[]) null, 44);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static final void method1434(byte arg0) {
        field3309++;
        if (arg0 == -84) {
            ;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([IIII)Z")
    public final boolean method1435(int[] arg0, int arg1, int arg2, int arg3) {
        field3305++;
        for (class108 var5 = (class108) this.field3287.method309(0); var5 != null; var5 = (class108) this.field3287.method312((byte) 55)) {
            if (var5.method811(arg1, (byte) 56, arg3)) {
                var5.method809(5782, arg3, arg0, arg1);
                return true;
            }
        }
        if (arg2 < 76) {
            this.field3303 = -29;
        }
        return false;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IIIII)V")
    public static final void method1436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class36 var5 = class136.method1013(4, arg0, (byte) -90);
        int var6 = 116 % ((arg3 - 75) / 36);
        var5.method224(false);
        var5.field560 = arg4;
        field3290++;
        var5.field577 = arg1;
        var5.field562 = arg2;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class205(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field3311 = arg4;
        this.field3289 = arg6;
        this.field3308 = arg1;
        this.field3293 = arg2;
        this.field3295 = arg3;
        this.field3284 = arg5;
        if (this.field3289 == 255) {
            this.field3289 = 0;
        }
        this.field3301 = arg0;
        this.field3287 = new class49();
    }
}
