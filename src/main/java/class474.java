import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class474 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[Ltm;")
    private class405[] field6980;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    private int field6984;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Ldp;")
    public static class347 field6982 = new class347("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field6985 = -1;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "J")
    private long field6979;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Ltm;")
    private class405 field6981;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZB)V", line = 4)
    public static final void method2819(int arg0, boolean arg1, byte arg2) {
        field6987++;
        if (arg2 <= 91) {
            return;
        }
        class516.field7574 = 3;
        class42.field553 = arg0;
        class83.method667(class150.field2287.field3021, 28637, class150.field2287.field3023);
        if (arg1) {
            class478.method2844("", 23238, "");
        } else {
            class394.method2366(13773);
            class478.method2844(class269.field4001, 23238, class489.field7291);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 26)
    public static void method2820(int arg0) {
        field6982 = null;
        if (arg0 != 6106) {
            method2822(null, null, null, 38, -39, -4, 101, 19, 95);
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(I)V", line = 51)
    public class474(int arg0) {
        this.field6980 = new class405[arg0];
        this.field6984 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class405 var3 = this.field6980[var2] = new class405();
            var3.field6100 = var3;
            var3.field6101 = var3;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(JI)Ltm;", line = 73)
    public final class405 method2821(long arg0, int arg1) {
        field6978++;
        this.field6979 = arg0;
        class405 var4 = this.field6980[(int) (arg0 & (long) (this.field6984 + arg1))];
        for (this.field6981 = var4.field6100; this.field6981 != var4; this.field6981 = this.field6981.field6100) {
            if (this.field6981.field6102 == arg0) {
                class405 var5 = this.field6981;
                this.field6981 = this.field6981.field6100;
                return var5;
            }
        }
        this.field6981 = null;
        return null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lma;Lya;Lgo;IIIIII)V", line = 101)
    public static final void method2822(class249 arg0, class11 arg1, class310 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6986++;
        class473 var9 = class36.field497.method699(arg6, arg8 + 115);
        if (var9 != null && var9.field6943 && var9.method2818(class307.field4619, -128)) {
            if (var9.field6951 != null) {
                int[] var10 = new int[var9.field6951.length];
                for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                    int var13;
                    if (class350.field5388 == 4) {
                        var13 = (int) class311.field4836 & 0x3FFF;
                    } else {
                        var13 = (int) class311.field4836 + class469.field6881 & 0x3FFF;
                    }
                    int var14 = class445.field6545[var13];
                    int var15 = class445.field6544[var13];
                    if (class350.field5388 != 4) {
                        var14 = var14 * 256 / (class230.field3230 + 256);
                        var15 = var15 * 256 / (class230.field3230 + 256);
                    }
                    var10[var11 * 2] = arg2.field4661 / 2 + ((arg4 + (var9.field6951[var11 * 2 + 1] * 4)) * var14 + ((var9.field6951[var11 * 2] * 4 + arg5) * var15) >> 15) + arg7;
                    var10[var11 * 2 + 1] = arg2.field4736 / 2 + arg3 - ((arg4 + (var9.field6951[var11 * 2 + 1] * 4)) * var15 - ((var9.field6951[var11 * 2] * 4 + arg5) * var14) >> 15);
                }
                class199.method1321(arg1, var10, var9.field6930, arg2.field4639, arg2.field4669);
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    arg1.method142(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field6945, 1, arg0, arg7, arg3);
                }
                arg1.method142(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field6945, 1, arg0, arg7, arg3);
            }
            class127 var16 = null;
            if (var9.field6937 != -1) {
                var16 = var9.method2810(arg1, false, false);
                if (var16 != null) {
                    class299.method1857(arg3, 97, arg5, arg0, var16, arg7, arg2, arg4);
                }
            }
            if (var9.field6938 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method465();
                }
                class307 var18 = class267.field3975;
                class443 var19 = class269.field3996;
                if (var9.field6929 == 1) {
                    var18 = class164.field2445;
                    var19 = class192.field2837;
                }
                if (var9.field6929 == 2) {
                    var18 = class345.field5325;
                    var19 = class342.field5252;
                }
                class237.method1459(var9.field6938, arg2, arg0, var17, arg7, var19, arg4, arg5, var18, var9.field6940, 9, arg3);
            }
        }
        if (arg8 != 4) {
            field6985 = -68;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Ltm;", line = 204)
    public final class405 method2823(int arg0) {
        int var2 = 47 % ((-arg0 - 15) / 37);
        field6988++;
        if (this.field6981 == null) {
            return null;
        }
        class405 var3 = this.field6980[(int) (this.field6979 & (long) (this.field6984 - 1))];
        while (this.field6981 != var3) {
            if (this.field6981.field6102 == this.field6979) {
                class405 var4 = this.field6981;
                this.field6981 = this.field6981.field6100;
                return var4;
            }
            this.field6981 = this.field6981.field6100;
        }
        this.field6981 = null;
        return null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILtm;J)V", line = 235)
    public final void method2824(int arg0, class405 arg1, long arg2) {
        if (arg1.field6101 != null) {
            arg1.method2440(-106);
        }
        field6983++;
        class405 var5 = this.field6980[(int) ((long) (this.field6984 + arg0) & arg2)];
        arg1.field6101 = var5.field6101;
        arg1.field6100 = var5;
        arg1.field6101.field6100 = arg1;
        arg1.field6102 = arg2;
        arg1.field6100.field6101 = arg1;
    }
}
