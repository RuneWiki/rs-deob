import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class253 {

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Lkb;")
    private class53 field4434 = new class53();

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Lna;")
    private class31 field4435 = new class31();

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    private int field4440;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    private int field4438;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "Lhe;")
    private class19 field4439;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Lp;")
    public static class280 field4433 = class18.method140((byte) -127, "::noclip");

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field4427 = 1;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lp;")
    private static class280 field4432 = class18.method140((byte) -127, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Lp;")
    public static class280 field4437 = field4432;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field4441 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "[[[I")
    public static int[][][] field4431;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
    public static final void method1697(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4423++;
        class201 var5 = (class201) class103.field1708.method150((long) arg0, -123);
        if (arg3 < 12) {
            return;
        }
        if (var5 == null) {
            var5 = new class201();
            class103.field1708.method148(-1, var5, (long) arg0);
        }
        if (var5.field3511.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field3511.length; var8++) {
                var6[var8] = var5.field3511[var8];
                var7[var8] = var5.field3520[var8];
            }
            for (int var9 = var5.field3511.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3511 = var6;
            var5.field3520 = var7;
        }
        var5.field3511[arg2] = arg4;
        var5.field3520[arg2] = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ltg;B)I")
    public static final int method1698(class180 arg0, byte arg1) {
        field4428++;
        int var2 = 0;
        if (arg0.method1262(class38.field680, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class86.field1405, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class264.field4651, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class266.field4674, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(client.field2699, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class182.field3206, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class18.field336, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class98.field1590, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class86.field1424, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class93.field1508, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class152.field2638, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class78.field1272, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class255.field4452, (byte) 93)) {
            var2++;
        }
        if (arg1 <= 18) {
            return 80;
        }
        if (arg0.method1262(class6.field125, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class176.field3069, (byte) 93)) {
            var2++;
        }
        if (arg0.method1262(class92.field1504, (byte) 93)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(JI)Lkb;")
    public final class53 method1699(long arg0, int arg1) {
        field4425++;
        class53 var4 = (class53) this.field4439.method150(arg0, -123);
        if (var4 != null) {
            this.field4435.method273(0, var4);
        }
        if (arg1 <= 92) {
            method1697(-113, -26, 93, 103, -80);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)Lil;")
    public final class161 method1700(byte arg0) {
        field4436++;
        if (arg0 != -77) {
            this.method1702(-33);
        }
        return this.field4439.method142(true);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lua;IIBIIII)V")
    public static final void method1701(class113 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4429++;
        int var8 = 102 / ((55 - arg3) / 53);
        if (class98.field1565) {
            class18.field328 = 32;
        } else {
            class18.field328 = 0;
        }
        class98.field1565 = false;
        if (class74.field1229 != 0) {
            if (arg2 <= arg7 && (arg2 + 16) > arg7 && arg4 >= arg5 && arg4 < arg5 + 16) {
                arg0.field2025 -= 4;
                class242.method1642((byte) 96, arg0);
            } else if (arg2 <= arg7 && arg2 + 16 > arg7 && arg4 >= (arg1 + arg5 - 16) && (arg1 + arg5) > arg4) {
                arg0.field2025 += 4;
                class242.method1642((byte) 96, arg0);
            } else if (arg2 - class18.field328 <= arg7 && arg7 < arg2 + class18.field328 + 16 && arg5 + 16 <= arg4 && arg4 < arg5 - (16 - arg1)) {
                int var9 = (arg1 - 32) * arg1 / arg6;
                if (var9 < 8) {
                    var9 = 8;
                }
                int var10 = arg1 - var9 - 32;
                int var11 = arg4 - arg5 - var9 / 2 - 16;
                arg0.field2025 = (arg6 - arg1) * var11 / var10;
                class242.method1642((byte) 77, arg0);
                class98.field1565 = true;
            }
        }
        if (class19.field365 == 0) {
            return;
        }
        int var12 = arg0.field1869;
        if ((arg2 - var12) <= arg7 && arg5 <= arg4 && arg7 < (arg2 + 16) && (arg1 + arg5) >= arg4) {
            arg0.field2025 += class19.field365 * 45;
            class242.method1642((byte) 31, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Lil;")
    public final class161 method1702(int arg0) {
        field4430++;
        if (arg0 != -16170) {
            field4433 = null;
        }
        return this.field4439.method143((byte) -123);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkb;BJ)V")
    public final void method1703(class53 arg0, byte arg1, long arg2) {
        field4422++;
        if (this.field4440 == 0) {
            class53 var5 = this.field4435.method267(-121);
            var5.method1146(26159);
            var5.method392(1);
            if (this.field4434 == var5) {
                class53 var6 = this.field4435.method267(-127);
                var6.method1146(arg1 + 26048);
                var6.method392(1);
            }
        } else {
            this.field4440--;
        }
        if (arg1 == 111) {
            this.field4439.method148(arg1 ^ 0xFFFFFF90, arg0, arg2);
            this.field4435.method273(arg1 ^ 0x6F, arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public final void method1704(int arg0) {
        this.field4435.method270((byte) 115);
        field4421++;
        this.field4439.method146(-1);
        if (arg0 == 1) {
            this.field4434 = new class53();
            this.field4440 = this.field4438;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
    public static void method1705(int arg0) {
        if (arg0 == 0) {
            field4432 = null;
            field4433 = null;
            field4437 = null;
            field4431 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
    public static final void method1706(boolean arg0, int arg1) {
        if (arg0) {
            field4432 = null;
        }
        field4426++;
        class188.field3297.method1478(arg1, 117);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILlj;)V")
    public static final void method1707(int arg0, class25 arg1) {
        field4424++;
        byte[] var2 = new byte[24];
        if (class191.field3338 != null) {
            try {
                class191.field3338.method1307(127, 0L);
                int var3 = 0;
                class191.field3338.method1305(var2, (byte) -25);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method207(24, arg0, (byte) 54, var2);
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
    public class253(int arg0) {
        this.field4440 = arg0;
        this.field4438 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4439 = new class19(var2);
    }
}
