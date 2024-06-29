import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class211 {

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lce;")
    private class216 field3296 = new class216();

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    private int field3302;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    private int field3294;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lpk;")
    private class100 field3300;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3290 = "Allocating memory";

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "[I")
    public static int[] field3295 = new int[2500];

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3307 = "Loading wordpack - ";

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILdl;)V")
    public static final void method1419(int arg0, class123 arg1) {
        if (arg0 != 0) {
            method1419(78, (class123) null);
        }
        field3304++;
        class216.field3532 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public final void method1420(int arg0) {
        field3308++;
        this.field3296.method1465((byte) 105);
        this.field3300.method670(115);
        this.field3302 = this.field3294;
        if (arg0 != -1) {
            field3307 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZIII)V")
    public static final void method1421(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field3301++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg3 * arg3;
        int var9 = var8 << 1;
        int var10 = arg4 * arg4;
        int var11 = var10 << 1;
        int var12 = var8 << 2;
        int var13 = var10 << 2;
        int var14 = ((arg4 << 1) - 3) * var9;
        int var15 = ((var6 << 1) + 3) * var11;
        int var16 = arg4 << 1;
        int var17 = (1 - var16) * var8 + var11;
        if (arg2) {
            method1426(-73);
        }
        int var18 = var10 - (var16 - 1) * var9;
        int var19 = (var6 + 1) * var13;
        int var20 = (arg4 - 1) * var12;
        if (arg1 >= class110.field1669 && arg1 <= class189.field2984) {
            int var21 = class34.method273(class96.field1484, arg3 + arg5, arg2, class51.field710);
            int var22 = class34.method273(class96.field1484, arg5 - arg3, false, class51.field710);
            class8.method52(var22, class106.field1637[arg1], var21, arg0, true);
        }
        while (var7 > 0) {
            if (var17 < 0) {
                while (var17 < 0) {
                    var18 += var19;
                    var6++;
                    var19 += var13;
                    var17 += var15;
                    var15 += var13;
                }
            }
            var7--;
            int var23 = arg1 - var7;
            if (var18 < 0) {
                var6++;
                var18 += var19;
                var19 += var13;
                var17 += var15;
                var15 += var13;
            }
            int var24 = arg1 + var7;
            var17 += -var20;
            var20 -= var12;
            var18 += -var14;
            if (class110.field1669 <= var24 && var23 <= class189.field2984) {
                int var25 = class34.method273(class96.field1484, arg5 + var6, false, class51.field710);
                int var26 = class34.method273(class96.field1484, arg5 - var6, false, class51.field710);
                if (var23 >= class110.field1669) {
                    class8.method52(var26, class106.field1637[var23], var25, arg0, true);
                }
                if (var24 <= class189.field2984) {
                    class8.method52(var26, class106.field1637[var24], var25, arg0, !arg2);
                }
            }
            var14 -= var12;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)I")
    public final int method1422(int arg0) {
        if (arg0 != 2997) {
            field3290 = null;
        }
        int var2 = 0;
        for (class86 var3 = (class86) this.field3296.method1467(arg0 - 2997); var3 != null; var3 = (class86) this.field3296.method1461((byte) -116)) {
            if (!var3.method329((byte) 115)) {
                var2++;
            }
        }
        field3293++;
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public static void method1423(int arg0) {
        field3307 = null;
        field3295 = null;
        field3290 = null;
        if (arg0 > -71) {
            method1429((byte) 83);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JLjava/lang/Object;I)V")
    public final void method1424(long arg0, Object arg1, int arg2) {
        if (arg2 != -2003648287) {
            method1419(-95, (class123) null);
        }
        this.method1427((byte) -120, arg0);
        field3303++;
        if (this.field3302 == 0) {
            class86 var5 = (class86) this.field3296.method1464(true);
            var5.method784(false);
            var5.method912(30);
        } else {
            this.field3302--;
        }
        class97 var6 = new class97(arg1);
        this.field3300.method662(0, var6, arg0);
        this.field3296.method1466(var6, -71);
        var6.field1958 = 0L;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    public final void method1425(int arg0, int arg1) {
        if (arg1 > -108) {
            this.field3302 = 121;
        }
        field3289++;
        if (class242.field3873 == null) {
            return;
        }
        for (class86 var3 = (class86) this.field3296.method1467(0); var3 != null; var3 = (class86) this.field3296.method1461((byte) -116)) {
            if (var3.method329((byte) 114)) {
                if (var3.method330((byte) 107) == null) {
                    var3.method784(false);
                    var3.method912(-121);
                    this.field3302++;
                }
            } else if (++var3.field1958 > (long) arg0) {
                class86 var4 = class242.field3873.method603(var3, -73);
                this.field3300.method662(0, var4, var3.field1750);
                class103.method683(var4, (byte) -118, var3);
                var3.method784(false);
                var3.method912(-125);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)Lng;")
    public static final class76 method1426(int arg0) {
        field3291++;
        if (arg0 != 1577271969) {
            return null;
        }
        try {
            return (class76) Class.forName("lh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class282();
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BJ)V")
    public final void method1427(byte arg0, long arg1) {
        class86 var4 = (class86) this.field3300.method665((byte) -59, arg1);
        field3306++;
        if (arg0 < -96 && var4 != null) {
            var4.method784(false);
            var4.method912(44);
            this.field3302++;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method1428(long arg0, byte arg1) {
        if (arg1 > -39) {
            return null;
        }
        field3298++;
        class86 var4 = (class86) this.field3300.method665((byte) 123, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method330((byte) 117);
        if (var5 == null) {
            var4.method784(false);
            var4.method912(40);
            this.field3302++;
            return null;
        }
        if (var4.method329((byte) 117)) {
            class97 var6 = new class97(var5);
            this.field3300.method662(0, var6, var4.field1750);
            this.field3296.method1466(var6, -90);
            var6.field1958 = 0L;
            var4.method784(false);
            var4.method912(50);
        } else {
            this.field3296.method1466(var4, -84);
            var4.field1958 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static final void method1429(byte arg0) {
        field3305++;
        int var1 = -1;
        int var2 = 42 / ((arg0 + 4) / 41);
        while (class73.field1040 > var1) {
            int var3;
            if (var1 == -1) {
                var3 = 2047;
            } else {
                var3 = class8.field117[var1];
            }
            class186 var4 = class153.field2277[var3];
            if (var4 != null) {
                class102.method678((byte) -110, var4, var4.method565((byte) 0));
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public final void method1430(int arg0) {
        field3297++;
        for (class86 var2 = (class86) this.field3296.method1467(0); var2 != null; var2 = (class86) this.field3296.method1461((byte) -116)) {
            if (var2.method329((byte) 119)) {
                var2.method784(false);
                var2.method912(-118);
                this.field3302++;
            }
        }
        if (arg0 != -1) {
            this.method1422(-55);
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
    public class211(int arg0) {
        this.field3302 = arg0;
        this.field3294 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3300 = new class100(var2);
    }
}
