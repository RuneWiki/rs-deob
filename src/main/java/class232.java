import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class232 {

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    private int field4354 = 0;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    private int field4342;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[Lmd;")
    private class132[] field4347;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "[Lvc;")
    public static class221[] field4351 = new class221[6];

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "J")
    private long field4350;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lmd;")
    private class132 field4349;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lmd;")
    private class132 field4352;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
    public static final int method1516(int arg0, int arg1) {
        field4340++;
        if (arg0 >= 97 && arg0 <= 122 || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        }
        if (arg1 != 1275158561) {
            method1524((byte) -110, 0, 43, -22, -1, 82);
        }
        if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lmd;")
    public final class132 method1517(int arg0) {
        this.field4354 = arg0;
        field4341++;
        return this.method1522(-1);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lmd;")
    public final class132 method1518(int arg0) {
        field4345++;
        if (this.field4349 == null) {
            return null;
        }
        class132 var2 = this.field4347[(int) (this.field4350 & (long) (this.field4342 + arg0))];
        while (this.field4349 != var2) {
            if (this.field4349.field2555 == this.field4350) {
                class132 var3 = this.field4349;
                this.field4349 = this.field4349.field2554;
                return var3;
            }
            this.field4349 = this.field4349.field2554;
        }
        this.field4349 = null;
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLmd;J)V")
    public final void method1519(boolean arg0, class132 arg1, long arg2) {
        if (arg1.field2558 != null) {
            arg1.method826(-22101);
        }
        class132 var5 = this.field4347[(int) ((long) (this.field4342 - 1) & arg2)];
        arg1.field2555 = arg2;
        arg1.field2554 = var5;
        arg1.field2558 = var5.field2558;
        if (!arg0) {
            this.field4352 = null;
        }
        arg1.field2558.field2554 = arg1;
        field4343++;
        arg1.field2554.field2558 = arg1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(JI)Lmd;")
    public final class132 method1520(long arg0, int arg1) {
        this.field4350 = arg0;
        if (arg1 < 11) {
            this.field4352 = null;
        }
        class132 var4 = this.field4347[(int) ((long) (this.field4342 - 1) & arg0)];
        field4348++;
        for (this.field4349 = var4.field2554; this.field4349 != var4; this.field4349 = this.field4349.field2554) {
            if (this.field4349.field2555 == arg0) {
                class132 var5 = this.field4349;
                this.field4349 = this.field4349.field2554;
                return var5;
            }
        }
        this.field4349 = null;
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
    public static final void method1521(int arg0, int arg1, int arg2) {
        class42.field895.method1347((byte) -89, 98);
        class216.field4000++;
        field4353++;
        class42.field895.method672(-279704376, arg2);
        class42.field895.method678(arg0, true);
        if (arg1 <= 38) {
            method1524((byte) -72, -30, -24, -23, -59, 125);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Lmd;")
    public final class132 method1522(int arg0) {
        field4346++;
        if (arg0 > ~this.field4354 && this.field4347[this.field4354 - 1] != this.field4352) {
            class132 var2 = this.field4352;
            this.field4352 = var2.field2554;
            return var2;
        }
        while (this.field4354 < this.field4342) {
            class132 var3 = this.field4347[this.field4354++].field2554;
            if (this.field4347[this.field4354 - 1] != var3) {
                this.field4352 = var3.field2554;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public static void method1523(int arg0) {
        field4351 = null;
        if (arg0 != 0) {
            field4351 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
    public class232(int arg0) {
        this.field4342 = arg0;
        this.field4347 = new class132[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class132 var3 = this.field4347[var2] = new class132();
            var3.field2558 = var3;
            var3.field2554 = var3;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIIIII)V")
    public static final void method1524(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4344++;
        int var6 = arg2;
        int var7 = arg2 * arg2;
        int var8 = 0;
        int var9 = var7 << 1;
        int var10 = arg1 * arg1;
        int var11 = arg2 << 1;
        int var12 = var10 << 1;
        int var13 = (1 - var11) * var10 + var9;
        int var14 = var10 << 2;
        int var15 = var7 - (var11 - 1) * var12;
        int var16 = 70 / ((arg0 - 67) / 37);
        int var17 = ((var8 << 1) + 3) * var9;
        int var18 = var7 << 2;
        int var19 = ((arg2 << 1) - 3) * var12;
        int var20 = (var8 + 1) * var18;
        int var21 = (arg2 - 1) * var14;
        if (class129.field2514 <= arg4 && class230.field4322 >= arg4) {
            int var22 = class22.method209(class112.field2107, arg5 + arg1, 116, class127.field2448);
            int var23 = class22.method209(class112.field2107, arg5 - arg1, 105, class127.field2448);
            class81.method532(var23, arg3, class156.field2981[arg4], var22, -7);
        }
        while (var6 > 0) {
            var6--;
            int var24 = arg4 - var6;
            int var25 = arg4 + var6;
            if (var13 < 0) {
                while (var13 < 0) {
                    var8++;
                    var13 += var17;
                    var15 += var20;
                    var17 += var18;
                    var20 += var18;
                }
            }
            if (var15 < 0) {
                var8++;
                var13 += var17;
                var15 += var20;
                var20 += var18;
                var17 += var18;
            }
            if (var25 >= class129.field2514 && class230.field4322 >= var24) {
                int var26 = class22.method209(class112.field2107, arg5 + var8, -110, class127.field2448);
                int var27 = class22.method209(class112.field2107, arg5 - var8, 96, class127.field2448);
                if (class129.field2514 <= var24) {
                    class81.method532(var27, arg3, class156.field2981[var24], var26, -7);
                }
                if (var25 <= class230.field4322) {
                    class81.method532(var27, arg3, class156.field2981[var25], var26, -7);
                }
            }
            var15 += -var19;
            var19 -= var14;
            var13 += -var21;
            var21 -= var14;
        }
    }
}
