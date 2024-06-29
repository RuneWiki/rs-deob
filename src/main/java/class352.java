import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class352 {

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    private int field4526 = 0;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[Lnd;")
    public class383[] field4511;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "[I")
    public static int[] field4519 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "[Lsr;")
    public static class166[] field4518 = new class166[6];

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Lap;")
    public static class335 field4525 = new class335("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "J")
    private long field4520;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "Lnd;")
    private class383 field4523;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "Lnd;")
    private class383 field4527;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[Lnd;)I", line = 6)
    public final int method2016(int arg0, class383[] arg1) {
        field4517++;
        int var3 = 0;
        if (arg0 != -1) {
            this.method2017(-13);
        }
        for (int var4 = 0; var4 < this.field4510; var4++) {
            class383 var5 = this.field4511[var4];
            for (class383 var6 = var5.field5042; var6 != var5; var6 = var6.field5042) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Lnd;", line = 37)
    public final class383 method2017(int arg0) {
        int var2 = 120 / ((33 - arg0) / 61);
        field4522++;
        if (this.field4526 > 0 && this.field4511[this.field4526 - 1] != this.field4527) {
            class383 var3 = this.field4527;
            this.field4527 = var3.field5042;
            return var3;
        }
        while (this.field4510 > this.field4526) {
            class383 var4 = this.field4511[this.field4526++].field5042;
            if (this.field4511[this.field4526 - 1] != var4) {
                this.field4527 = var4.field5042;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 69)
    public static void method2018(int arg0) {
        field4525 = null;
        field4518 = null;
        if (arg0 == 0) {
            field4519 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLnd;J)V", line = 82)
    public final void method2019(byte arg0, class383 arg1, long arg2) {
        field4521++;
        if (arg1.field5047 != null) {
            arg1.method2165(16225);
        }
        class383 var5 = this.field4511[(int) ((long) (this.field4510 - 1) & arg2)];
        if (arg0 > -31) {
            field4525 = null;
        }
        arg1.field5047 = var5.field5047;
        arg1.field5042 = var5;
        arg1.field5047.field5042 = arg1;
        arg1.field5043 = arg2;
        arg1.field5042.field5047 = arg1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Lnd;", line = 104)
    public final class383 method2020(byte arg0) {
        field4514++;
        if (this.field4523 == null) {
            return null;
        }
        class383 var2 = this.field4511[(int) ((long) (this.field4510 - 1) & this.field4520)];
        while (this.field4523 != var2) {
            if (this.field4523.field5043 == this.field4520) {
                class383 var3 = this.field4523;
                this.field4523 = this.field4523.field5042;
                return var3;
            }
            this.field4523 = this.field4523.field5042;
        }
        this.field4523 = null;
        if (arg0 > -16) {
            this.method2021(123);
        }
        return null;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Lnd;", line = 137)
    public final class383 method2021(int arg0) {
        field4515++;
        this.field4526 = 0;
        int var2 = 56 % ((24 - arg0) / 41);
        return this.method2017(-105);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IJ)Lnd;", line = 158)
    public final class383 method2022(int arg0, long arg1) {
        field4524++;
        this.field4520 = arg1;
        class383 var4 = this.field4511[(int) (arg1 & (long) (this.field4510 + arg0))];
        for (this.field4523 = var4.field5042; this.field4523 != var4; this.field4523 = this.field4523.field5042) {
            if (this.field4523.field5043 == arg1) {
                class383 var5 = this.field4523;
                this.field4523 = this.field4523.field5042;
                return var5;
            }
        }
        this.field4523 = null;
        return null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)I", line = 190)
    public final int method2023(boolean arg0) {
        field4512++;
        if (arg0) {
            this.method2017(-25);
        }
        return this.field4510;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)V", line = 203)
    public final void method2024(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field4510; var2++) {
            class383 var3 = this.field4511[var2];
            while (true) {
                class383 var4 = var3.field5042;
                if (var3 == var4) {
                    break;
                }
                var4.method2165(16225);
            }
        }
        field4513++;
        this.field4523 = null;
        this.field4527 = null;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(I)V", line = 240)
    public class352(int arg0) {
        this.field4510 = arg0;
        this.field4511 = new class383[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class383 var3 = this.field4511[var2] = new class383();
            var3.field5042 = var3;
            var3.field5047 = var3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)I", line = 262)
    public final int method2025(int arg0) {
        if (arg0 != -30075) {
            this.method2017(-70);
        }
        field4516++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4510; var3++) {
            class383 var4 = this.field4511[var3];
            class383 var5 = var4.field5042;
            while (var4 != var5) {
                var5 = var5.field5042;
                var2++;
            }
        }
        return var2;
    }
}
