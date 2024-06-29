import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class31 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lsu;")
    private class219 field414 = new class219();

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lhf;")
    private class413 field425 = new class413();

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Ltga;")
    private class64 field428;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field421 = 0;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lsi;")
    public static class583 field419 = new class583();

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lhk;")
    public static class110 field420;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Lls;")
    public static class148 field424;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[[Z")
    public static boolean[][] field418;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V", line = 4)
    public final void method217(boolean arg0) {
        field415++;
        this.field425.method2477(arg0);
        this.field428.method387(-21125);
        this.field414 = new class219();
        this.field423 = this.field426;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BJ)V", line = 17)
    public final void method218(byte arg0, long arg1) {
        int var4 = -28 / ((-arg0 - 63) / 43);
        field416++;
        class219 var5 = (class219) this.field428.method380((byte) -3, arg1);
        if (var5 != null) {
            var5.method3117((byte) 69);
            var5.method1512(false);
            this.field423++;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 35)
    public static void method219(byte arg0) {
        field420 = null;
        field419 = null;
        field424 = null;
        int var1 = 104 / ((-arg0 - 46) / 55);
        field418 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(JI)Lsu;", line = 49)
    public final class219 method220(long arg0, int arg1) {
        field417++;
        class219 var4 = (class219) this.field428.method380((byte) -3, arg0);
        if (var4 != null) {
            this.field425.method2475(var4, -19680);
        }
        if (arg1 != 0) {
            method223(-26, 105, 19, -64, -74, 99);
        }
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lsu;ZJ)V", line = 73)
    public final void method221(class219 arg0, boolean arg1, long arg2) {
        field427++;
        if (this.field423 == 0) {
            class219 var5 = this.field425.method2481((byte) 68);
            var5.method3117((byte) -119);
            var5.method1512(arg1);
            if (this.field414 == var5) {
                class219 var6 = this.field425.method2481((byte) 82);
                var6.method3117((byte) -92);
                var6.method1512(arg1);
            }
        } else {
            this.field423--;
        }
        this.field428.method384(arg2, arg0, arg1);
        this.field425.method2475(arg0, -19680);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 115)
    public static final void method222(int arg0, int arg1) {
        class379 var2 = class378.field5427[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class379 var4 = class378.field5427[var3][arg0][arg1] = class378.field5427[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class393 var5 = var4.field5437; var5 != null; var5 = var5.field5574) {
                    class778 var6 = var5.field5578;
                    if (var6.field10733 == arg0 && var6.field10730 == arg1) {
                        var6.field7710--;
                    }
                }
                if (var4.field5446 != null) {
                    var4.field5446.field7710--;
                }
                if (var4.field5439 != null) {
                    var4.field5439.field7710--;
                }
                if (var4.field5430 != null) {
                    var4.field5430.field7710--;
                }
                if (var4.field5432 != null) {
                    var4.field5432.field7710--;
                }
                if (var4.field5444 != null) {
                    var4.field5444.field7710--;
                }
            }
        }
        if (class378.field5427[0][arg0][arg1] == null) {
            class378.field5427[0][arg0][arg1] = new class379(0);
            class378.field5427[0][arg0][arg1].field5440 = 1;
        }
        class378.field5427[0][arg0][arg1].field5431 = var2;
        class378.field5427[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)V", line = 176)
    public static final void method223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field422++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg3 * arg3;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        if (arg1 > -26) {
            method222(-101, 5);
        }
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class738.field10297 <= arg0 && class414.field5846 >= arg0) {
            int var20 = class387.method2374(1, arg3 + arg4, class450.field6463, class285.field4372);
            int var21 = class387.method2374(1, arg4 - arg3, class450.field6463, class285.field4372);
            class382.method2347(var21, class347.field5087[arg0], arg2, 7, var20);
        }
        int var22 = (arg5 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var6++;
                var17 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var18 -= var15;
            var22 -= var15;
            var7--;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (class738.field10297 <= var24 && var23 <= class414.field5846) {
                int var25 = class387.method2374(1, arg4 + var6, class450.field6463, class285.field4372);
                int var26 = class387.method2374(1, arg4 - var6, class450.field6463, class285.field4372);
                if (class738.field10297 <= var23) {
                    class382.method2347(var26, class347.field5087[var23], arg2, 7, var25);
                }
                if (var24 <= class414.field5846) {
                    class382.method2347(var26, class347.field5087[var24], arg2, 7, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V", line = 295)
    public class31(int arg0) {
        this.field426 = arg0;
        this.field423 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field428 = new class64(var2);
    }
}
