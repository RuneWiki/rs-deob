import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class257 extends class60 {

    @OriginalMember(owner = "client!am", name = "j", descriptor = "Ljf;")
    public static class229 field4477 = class212.method1457((byte) 94, "Texturen geladen)3");

    @OriginalMember(owner = "client!am", name = "k", descriptor = "[[[I")
    public static int[][][] field4478 = new int[4][13][13];

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Ljf;")
    public static class229 field4479 = class212.method1457((byte) 61, " ");

    @OriginalMember(owner = "client!am", name = "p", descriptor = "[I")
    public static int[] field4483 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!am", name = "o", descriptor = "Ljf;")
    public static class229 field4482 = class212.method1457((byte) 127, "(U(Y");

    @OriginalMember(owner = "client!am", name = "m", descriptor = "Lwf;")
    public static class58 field4480 = null;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "[I")
    public static int[] field4481 = new int[99];

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field4486 = 0;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(BII)V", line = 4)
    public static final void method1832(byte arg0, int arg1, int arg2) {
        field4476++;
        if (arg1 == 4 && !class98.field1750) {
            arg2 = 2;
            arg1 = 2;
        }
        if (class111.field1960 != arg1) {
            if (class25.field460) {
                return;
            }
            if (class111.field1960 != 0) {
                class15.field228[class111.field1960].method486();
            }
            if (arg1 != 0) {
                class210 var3 = class15.field228[arg1];
                var3.method483();
                var3.method484(arg2);
            }
            class317.field5357 = arg2;
            class111.field1960 = arg1;
        } else if (arg1 != 0 && class317.field5357 != arg2) {
            class15.field228[arg1].method484(arg2);
            class317.field5357 = arg2;
        }
        if (arg0 <= 6) {
            method1834(113);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 50)
    public static final void method1833(int arg0) {
        if (arg0 != -758) {
            field4479 = (class229) null;
        }
        class73.field1392.method230(true);
        field4485++;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V", line = 61)
    public static void method1834(int arg0) {
        field4483 = null;
        field4481 = null;
        field4478 = (int[][][]) null;
        field4479 = null;
        if (arg0 == -5) {
            field4480 = null;
            field4477 = null;
            field4482 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V", line = 78)
    public static final void method1835(int arg0) {
        if (arg0 != -27251) {
            field4478 = (int[][][]) ((int[][][]) null);
        }
        field4487++;
        while (class171.field2972.method1400(-112, class51.field902) >= 27) {
            int var1 = class171.field2972.method1396(15, arg0 ^ 0xFFFF95A3);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class331.field5637[var1] == null) {
                class331.field5637[var1] = new class331();
                var2 = true;
            }
            class331 var3 = class331.field5637[var1];
            class283.field4858[class126.field2238++] = var1;
            var3.field1962 = class199.field3475;
            if (var3.field5631 != null && var3.field5631.method1157(true)) {
                class155.method1039((byte) 96, var3);
            }
            int var4 = class171.field2972.method1396(5, -128);
            int var5 = class171.field2972.method1396(5, -125);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class329.field5584[class171.field2972.method1396(3, -127)];
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var2) {
                var3.field1964 = var3.field1987 = var6;
            }
            int var7 = class171.field2972.method1396(1, 41);
            if (var7 == 1) {
                class201.field3529[class100.field1762++] = var1;
            }
            var3.method2256((byte) -80, class224.method1541((byte) 20, class171.field2972.method1396(14, arg0 + 27123)));
            int var8 = class171.field2972.method1396(1, 92);
            var3.method792(var3.field5631.field2952, arg0 ^ 0x3EA0);
            var3.field1994 = var3.field5631.field2942;
            var3.field1986 = var3.field5631.field2913;
            var3.field2004 = var3.field5631.field2899;
            var3.field2008 = var3.field5631.field2949;
            var3.field1981 = var3.field5631.field2929;
            var3.field2026 = var3.field5631.field2932;
            if (var3.field2004 == 0) {
                var3.field1987 = 0;
            }
            var3.field2027 = var3.field5631.field2959;
            var3.field2030 = var3.field5631.field2918;
            var3.method795(var8 == 1, (byte) 70, class301.field5124.field2017[0] + var5, class301.field5124.field2018[0] + var4, var3.method299(true));
            if (var3.field5631.method1157(true)) {
                class172.method1171(var3, false, 0, (class33) null, var3.field2017[0], (class83) null, class16.field254, var3.field2018[0]);
            }
        }
        class171.field2972.method1401(7);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4481[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lkh;B)Lpj;", line = 193)
    public static final class184 method1836(class14 arg0, byte arg1) {
        field4489++;
        return arg1 == -38 ? new class184(arg0.method113((byte) -83), arg0.method113((byte) -125), arg0.method113((byte) -100), arg0.method113((byte) -120), arg0.method114(0), arg0.method93(false)) : (class184) null;
    }
}
