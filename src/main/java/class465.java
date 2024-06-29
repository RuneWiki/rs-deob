import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class465 extends class223 {

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public int field6829;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public int field6830;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public int field6828;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public int field6834;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "Z")
    public boolean field6836;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    public int field6835;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field6831 = 1;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "Lsl;")
    public static class318 field6837;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "S")
    public static short field6838;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method2784(int arg0) {
        if (arg0 <= -33) {
            field6837 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lba;III[Z)V")
    public static final void method2785(class263 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class52.field578 == class131.field1899) {
            return;
        }
        int var5 = class283.field4115[arg1].method426(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class142 var7 = class283.field4115[var6];
                if (var7 != null) {
                    var7.method425(arg0, arg2, var5 - var7.method426(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Luu;I)V")
    public static final void method2786(class188 arg0, int arg1) {
        field6832++;
        if (arg1 != 0) {
            field6839 = 48;
        }
        class188 var2 = class232.method1555(arg0, (byte) 73);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class410.field6100;
            var4 = class94.field1278;
        } else {
            var4 = var2.field2711;
            var3 = var2.field2672;
        }
        class122.method971(false, var4, arg0, -124, var3);
        class523.method3109(arg0, var4, var3, 2);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIIIIZ)V")
    public class465(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field6829 = arg4;
        this.field6830 = arg1;
        this.field6828 = arg3;
        this.field6834 = arg0;
        this.field6836 = arg5;
        this.field6835 = arg2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZIIILbn;I)V")
    public static final void method2787(boolean arg0, int arg1, int arg2, int arg3, class307 arg4, int arg5) {
        field6833++;
        if (arg4.field4356 == -1 && arg4.field4352 == null) {
            return;
        }
        int var6 = 0;
        if (!arg0) {
            method2786(null, 55);
        }
        int var7 = class478.field7044.field3350 * arg4.field4361 >> 8;
        if (arg4.field4354 < arg3) {
            var6 += arg3 - arg4.field4354;
        } else if (arg4.field4353 > arg3) {
            var6 += arg4.field4353 - arg3;
        }
        if (arg2 > arg4.field4346) {
            var6 += arg2 - arg4.field4346;
        } else if (arg4.field4350 > arg2) {
            var6 += arg4.field4350 - arg2;
        }
        if (arg4.field4344 == 0 || (var6 - 64) > arg4.field4344 || class478.field7044.field3350 == 0 || arg4.field4360 != arg1) {
            if (arg4.field4367 != null) {
                class273.field4030.method1242(arg4.field4367);
                arg4.field4367 = null;
            }
            if (arg4.field4348 != null) {
                class273.field4030.method1242(arg4.field4348);
                arg4.field4348 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg4.field4344 - var6) * var7 / arg4.field4344;
        if (arg4.field4367 != null) {
            arg4.field4367.method166(var8);
        } else if (arg4.field4356 >= 0) {
            class362 var9 = class362.method2165(class283.field4117, arg4.field4356, 0);
            if (var9 != null) {
                class217 var10 = var9.method2166().method1483(class287.field4139);
                class19 var11 = class19.method178(var10, 100, var8);
                var11.method146(-1);
                class273.field4030.method1241(var11);
                arg4.field4367 = var11;
            }
        }
        if (arg4.field4348 != null) {
            arg4.field4348.method166(var8);
            if (arg4.field4348.method1524(75)) {
                return;
            }
            arg4.field4348 = null;
        } else if (arg4.field4352 != null && (arg4.field4358 -= arg5) <= 0) {
            int var12 = (int) (Math.random() * (double) arg4.field4352.length);
            class362 var13 = class362.method2165(class283.field4117, arg4.field4352[var12], 0);
            if (var13 != null) {
                class217 var14 = var13.method2166().method1483(class287.field4139);
                class19 var15 = class19.method178(var14, 100, var8);
                var15.method146(0);
                class273.field4030.method1241(var15);
                arg4.field4358 = (int) ((double) (arg4.field4363 - arg4.field4364) * Math.random()) + arg4.field4364;
                arg4.field4348 = var15;
                return;
            }
        }
    }

    static {
        new class331(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
        field6837 = new class318(73, 2);
        field6838 = 32767;
        field6839 = 0;
    }
}
