import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class54 extends class16 {

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    private int field969 = -32768;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    private int field978 = 0;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "Z")
    private boolean field975 = false;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    private int field982 = 0;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    private int field990;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "Lab;")
    private class248 field976;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Le;")
    public static class191 field970 = method368(" )2> <col=00ffff>", 2047);

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "Le;")
    public static class191 field1003 = method368("event_opbase", 2047);

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "Le;")
    public static class191 field1000 = method368(" zuerst von Ihrer Freunde)2Liste(Q", 2047);

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "Lwe;")
    public static class147 field1005 = new class147(100);

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "Le;")
    public static class191 field1010 = method368(":", 2047);

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "[I")
    public static int[] field1012 = new int[1000];

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "D")
    private double field1004;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "D")
    public double field972;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "D")
    public double field973;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "D")
    private double field974;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "D")
    private double field979;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "D")
    private double field984;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "D")
    public double field992;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "D")
    private double field994;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    private int field980;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "Lng;")
    public static class121 field1011;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field971++;
        class251 var11 = this.method364(43);
        if (var11 != null) {
            var11.method127(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field969 = var11.method126();
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V")
    public final void method363(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1002++;
        if (!this.field975) {
            double var6 = (double) (arg1 - this.field1001);
            double var8 = (double) (arg3 - this.field1008);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field973 = (double) this.field986 * var8 / var10 + (double) this.field1008;
            this.field972 = (double) this.field1007;
            this.field992 = (double) this.field986 * var6 / var10 + (double) this.field1001;
        }
        if (arg2 != 9507) {
            return;
        }
        double var12 = (double) (this.field991 + 1 - arg0);
        this.field994 = ((double) arg1 - this.field992) / var12;
        this.field984 = ((double) arg3 - this.field973) / var12;
        this.field1004 = Math.sqrt(this.field994 * this.field994 + this.field984 * this.field984);
        if (!this.field975) {
            this.field974 = -this.field1004 * Math.tan((double) this.field990 * 0.02454369D);
        }
        this.field979 = ((double) arg4 - this.field972 - this.field974 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)Lee;")
    private final class251 method364(int arg0) {
        field999++;
        class14 var2 = class47.method323(-4453, this.field987);
        class251 var3 = var2.method96(true, this.field978);
        if (arg0 != 43) {
            field1009 = -41;
        }
        if (var3 == null) {
            return null;
        } else {
            var3.method974(this.field980);
            return var3;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lng;I)V")
    public static final void method365(class121 arg0, int arg1) {
        class200.field3574 = arg0.method824(true, class92.field1512);
        field981++;
        class45.field804 = arg0.method824(true, class188.field3298);
        class263.field4667 = arg0.method824(true, class170.field2879);
        class86.field1417 = arg0.method824(true, class242.field4307);
        class191.field3407 = arg0.method824(true, class97.field1566);
        class62.field1113 = arg0.method824(true, class181.field3120);
        class53.field962 = arg0.method824(true, class36.field660);
        class196.field3500 = arg0.method824(true, class79.field1347);
        class14.field178 = arg0.method824(true, class211.field3752);
        class83.field1396 = arg0.method824(true, class123.field2034);
        class189.field3323 = arg0.method824(true, class201.field3610);
        int var2 = -2 / ((13 - arg1) / 46);
        class67.field1164 = arg0.method824(true, class67.field1162);
        class126.field2082 = arg0.method824(true, class243.field4342);
        class248.field4410 = arg0.method824(true, class236.field4192);
        class175.field2939 = arg0.method824(true, class255.field4529);
        class137.field2297 = arg0.method824(true, class55.field1015);
        arg0.method824(true, class137.field2293);
        class133.field2227 = arg0.method824(true, class132.field2212);
        class21.field306 = arg0.method824(true, class40.field719);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V")
    public final void method366(int arg0, byte arg1) {
        this.field973 += (double) arg0 * this.field984;
        field995++;
        this.field972 += this.field979 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field974;
        this.field974 += (double) arg0 * this.field979;
        if (arg1 != -104) {
            return;
        }
        this.field975 = true;
        this.field992 += (double) arg0 * this.field994;
        this.field977 = (int) (Math.atan2(this.field994, this.field984) * 325.949D) + 1024 & 0x7FF;
        this.field980 = (int) (Math.atan2(this.field974, this.field1004) * 325.949D) & 0x7FF;
        if (this.field976 == null) {
            return;
        }
        this.field982 += arg0;
        while (true) {
            do {
                do {
                    if (this.field982 <= this.field976.field4406[this.field978]) {
                        return;
                    }
                    this.field982 -= this.field976.field4406[this.field978];
                    this.field978++;
                } while (this.field978 < this.field976.field4419.length);
                this.field978 -= this.field976.field4402;
            } while (this.field978 >= 0 && this.field976.field4419.length > this.field978);
            this.field978 = 0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)Le;")
    public static final class191 method367(int arg0, int arg1) {
        if (arg1 != -13400) {
            field1009 = -105;
        }
        field998++;
        class191 var2 = class92.method563(-57, arg0);
        for (int var3 = var2.method1304(arg1 ^ -13417) - 3; var3 > 0; var3 -= 3) {
            var2 = class228.method1629(new class191[] { var2.method1330(0, 68, var3), class254.field4505, var2.method1315(var3, (byte) 33) }, (byte) -114);
        }
        if (var2.method1304(arg1 ^ 0xFFFFCB97) > 9) {
            return class228.method1629(new class191[] { class213.field3769, var2.method1330(0, -94, var2.method1304(63) - 8), class1.field15, class43.field753, var2, class8.field78 }, (byte) -77);
        } else if (var2.method1304(63) > 6) {
            return class228.method1629(new class191[] { class159.field2694, var2.method1330(0, arg1 ^ 0x3404, var2.method1304(63) - 4), class127.field2099, class43.field753, var2, class8.field78 }, (byte) -58);
        } else {
            return class228.method1629(new class191[] { class62.field1117, var2, class183.field3158 }, (byte) -60);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;I)Le;")
    public static final class191 method368(String arg0, int arg1) {
        field997++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        if (arg1 != 2047) {
            method368((String) null, 110);
        }
        class191 var4 = new class191();
        var4.field3392 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field3392[var4.field3379++] = (byte) (var6 * 43 + var7 - 48 - 1720);
            } else if (var6 != 0) {
                var4.field3392[var4.field3379++] = (byte) var6;
            }
        }
        var4.method1307((byte) 94);
        return var4.method1349(4096);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "()I")
    public final int method126() {
        field985++;
        return this.field969;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method369(KeyEvent arg0, int arg1) {
        field989++;
        if (arg1 < 111) {
            field1009 = -4;
        }
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static void method370(boolean arg0) {
        field1010 = null;
        if (!arg0) {
            field970 = null;
        }
        field1011 = null;
        field1005 = null;
        field1003 = null;
        field1000 = null;
        field1012 = null;
        field970 = null;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field996 = arg5;
        this.field990 = arg7;
        this.field1006 = arg1;
        this.field988 = arg10;
        this.field986 = arg8;
        this.field975 = false;
        this.field1001 = arg2;
        this.field991 = arg6;
        this.field1008 = arg3;
        this.field983 = arg9;
        this.field987 = arg0;
        this.field1007 = arg4;
        int var12 = class47.method323(-4453, this.field987).field170;
        if (var12 == -1) {
            this.field976 = null;
        } else {
            this.field976 = class67.method445((byte) -61, var12);
        }
    }
}
