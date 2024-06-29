import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class254 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "[Lug;")
    private class200[] field4378;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    private int field4380;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field4391 = 0;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "Loa;")
    public static class99 field4394 = class221.method1463(2844, "l");

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Loa;")
    public static class99 field4385 = class221.method1463(2844, "::rebuild");

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "Lng;")
    public static class76 field4397 = new class76();

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "Loa;")
    public static class99 field4400 = class221.method1463(2844, " <col=ffff00>");

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "J")
    private long field4399;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "Lug;")
    private class200 field4398;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "[Loa;")
    public static class99[] field4388;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILug;J)V")
    public final void method1639(int arg0, class200 arg1, long arg2) {
        field4389++;
        if (arg1.field3478 != null) {
            arg1.method1346(126);
        }
        if (arg0 != 1) {
            field4400 = null;
        }
        class200 var5 = this.field4378[(int) ((long) (this.field4380 - 1) & arg2)];
        arg1.field3476 = arg2;
        arg1.field3478 = var5.field3478;
        arg1.field3472 = var5;
        arg1.field3478.field3472 = arg1;
        arg1.field3472.field3478 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIBIII)V")
    public static final void method1640(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field4396++;
        if (arg1 == arg5) {
            class19.method112(arg0, (byte) 127, arg5, arg4, arg3);
            return;
        }
        if ((arg3 - arg5) >= class197.field3437 && arg3 + arg5 <= class79.field1395 && arg0 - arg1 >= class178.field3101 && class137.field2414 >= arg0 + arg1) {
            class289.method1941(arg0, arg1, arg5, arg3, arg4, (byte) -121);
        } else {
            class81.method558(arg0, arg1, arg5, (byte) 86, arg3, arg4);
        }
        if (arg2 < 2) {
            field4397 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BJ)Lug;")
    public final class200 method1641(byte arg0, long arg1) {
        this.field4399 = arg1;
        field4395++;
        if (arg0 != -73) {
            return null;
        }
        class200 var4 = this.field4378[(int) ((long) (this.field4380 - 1) & arg1)];
        for (this.field4398 = var4.field3472; this.field4398 != var4; this.field4398 = this.field4398.field3472) {
            if (this.field4398.field3476 == arg1) {
                class200 var5 = this.field4398;
                this.field4398 = this.field4398.field3472;
                return var5;
            }
        }
        this.field4398 = null;
        return null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Lpi;")
    public static final class139 method1642(int arg0) {
        int var1 = class223.field3885[0] * class193.field3395[0];
        field4393++;
        byte[] var2 = class181.field3151[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class173.field3062[class71.method502(255, var2[var4])];
        }
        if (arg0 >= -36) {
            return null;
        } else {
            class4 var5 = new class4(class164.field2883, class88.field1520, class290.field5082[0], class11.field94[0], class223.field3885[0], class193.field3395[0], var3);
            class24.method181(false);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method1643(byte arg0) {
        field4400 = null;
        int var1 = -12 % ((-arg0 - 25) / 57);
        field4385 = null;
        field4388 = null;
        field4394 = null;
        field4397 = null;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)Lug;")
    public final class200 method1644(byte arg0) {
        field4382++;
        if (this.field4398 == null) {
            return null;
        }
        class200 var2 = this.field4378[(int) (this.field4399 & (long) (this.field4380 - 1))];
        while (this.field4398 != var2) {
            if (this.field4398.field3476 == this.field4399) {
                class200 var3 = this.field4398;
                this.field4398 = this.field4398.field3472;
                return var3;
            }
            this.field4398 = this.field4398.field3472;
        }
        this.field4398 = null;
        if (arg0 <= 13) {
            method1640(-72, -71, (byte) 127, 25, 45, -5);
        }
        return null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
    public static final int method1645(int arg0, int arg1) {
        int var2 = -3 % ((arg0 - 4) / 44);
        field4381++;
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var4 = arg1 * 6 - 61440;
        int var5 = (arg1 * var4 >> 12) + 40960;
        return var3 * var5 >> 12;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)Lbf;")
    public static final class201 method1646(int arg0, int arg1) {
        field4387++;
        class201 var2 = (class201) class59.field991.method512((byte) 52, (long) arg0);
        if (arg1 < 95) {
            field4391 = 83;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class94.field1591.method1242(arg0, 0, 6801);
        } else {
            var3 = class36.field630.method1242(arg0 & 0x7FFF, 0, 6801);
        }
        class201 var4 = new class201();
        if (var3 != null) {
            var4.method1349((byte) -57, new class261(var3));
        }
        if (arg0 >= 32768) {
            var4.method1351(0);
        }
        class59.field991.method511(-122, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)Lw;")
    public static final class144 method1647(int arg0, byte arg1) {
        field4379++;
        if (arg1 != -56) {
            field4386 = -80;
        }
        return class30.field554 && arg0 >= class141.field2487 && class69.field1142 >= arg0 ? class146.field2588[arg0 - class141.field2487] : null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V")
    public class254(int arg0) {
        this.field4378 = new class200[arg0];
        this.field4380 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class200 var3 = this.field4378[var2] = new class200();
            var3.field3478 = var3;
            var3.field3472 = var3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    public static final void method1648(int arg0) {
        for (int var1 = 0; var1 < class64.field1078; var1++) {
            int var2 = class25.field438[var1];
            class183 var3 = class259.field4515[var2];
            int var4 = class129.field2252.method1693((byte) -123);
            if ((var4 & 0x1) != 0) {
                var4 += class129.field2252.method1693((byte) 93) << 8;
            }
            class168.method1140(var3, var2, 0, var4);
        }
        if (arg0 != 2053661320) {
            method1647(-37, (byte) 125);
        }
        field4392++;
    }
}
