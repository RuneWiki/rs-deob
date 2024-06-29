import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class236 {

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    private int field4406 = 0;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    private int field4391;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "[Lji;")
    private class106[] field4404;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Loc;")
    private static class151 field4387 = class137.method873(2, "Tue");

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Loc;")
    public static class151 field4388 = class137.method873(2, ":clanreq:");

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Loc;")
    private static class151 field4398 = class137.method873(2, "Mon");

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Loc;")
    private static class151 field4393 = class137.method873(2, "Sat");

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "Loc;")
    private static class151 field4402 = class137.method873(2, "Wed");

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Loc;")
    private static class151 field4401 = class137.method873(2, "Sun");

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "Loc;")
    private static class151 field4400 = class137.method873(2, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "Loc;")
    private static class151 field4403 = class137.method873(2, "Fri");

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Loc;")
    public static class151 field4385 = field4400;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "Loc;")
    private static class151 field4409 = class137.method873(2, "Thu");

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "[Loc;")
    public static class151[] field4389 = new class151[] { field4401, field4398, field4387, field4402, field4409, field4403, field4393 };

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Loh;")
    public static class156 field4397 = new class156(4);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "J")
    public static long field4396;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "J")
    private long field4399;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lji;")
    private class106 field4394;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "Lji;")
    private class106 field4408;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Lnd;")
    public static class142 field4383;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "[I")
    public static int[] field4410;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)I")
    public static final int method1532(boolean arg0, int arg1) {
        field4392++;
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAB) >>> 1);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        if (arg0) {
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        } else {
            return -49;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method1533(int arg0) {
        field4398 = null;
        int var1 = 24 / ((-arg0 - 31) / 55);
        field4402 = null;
        field4387 = null;
        field4409 = null;
        field4383 = null;
        field4400 = null;
        field4393 = null;
        field4410 = null;
        field4389 = null;
        field4385 = null;
        field4397 = null;
        field4388 = null;
        field4403 = null;
        field4401 = null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)Lji;")
    public final class106 method1534(int arg0) {
        if (arg0 != 20912) {
            this.method1539(38);
        }
        field4390++;
        this.field4406 = 0;
        return this.method1535(0);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)Lji;")
    public final class106 method1535(int arg0) {
        field4381++;
        if (this.field4406 > 0 && this.field4404[this.field4406 - 1] != this.field4408) {
            class106 var2 = this.field4408;
            this.field4408 = var2.field1887;
            return var2;
        }
        if (arg0 != 0) {
            this.method1538(24L, (byte) -123);
        }
        while (this.field4391 > this.field4406) {
            class106 var3 = this.field4404[this.field4406++].field1887;
            if (this.field4404[this.field4406 - 1] != var3) {
                this.field4408 = var3.field1887;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLji;J)V")
    public final void method1536(byte arg0, class106 arg1, long arg2) {
        if (arg1.field1889 != null) {
            arg1.method636(96);
        }
        field4405++;
        int var5 = -86 / ((9 - arg0) / 52);
        class106 var6 = this.field4404[(int) (arg2 & (long) (this.field4391 - 1))];
        arg1.field1887 = var6;
        arg1.field1881 = arg2;
        arg1.field1889 = var6.field1889;
        arg1.field1889.field1887 = arg1;
        arg1.field1887.field1889 = arg1;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
    public static final void method1537(int arg0) {
        if (arg0 == 0) {
            field4382++;
            class216.field3770.method1317((byte) -125);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(JB)Lji;")
    public final class106 method1538(long arg0, byte arg1) {
        this.field4399 = arg0;
        class106 var4 = this.field4404[(int) (arg0 & (long) (this.field4391 - 1))];
        this.field4394 = var4.field1887;
        field4384++;
        while (this.field4394 != var4) {
            if (this.field4394.field1881 == arg0) {
                class106 var5 = this.field4394;
                this.field4394 = this.field4394.field1887;
                return var5;
            }
            this.field4394 = this.field4394.field1887;
        }
        this.field4394 = null;
        if (arg1 < 126) {
            this.method1534(-51);
        }
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)Lji;")
    public final class106 method1539(int arg0) {
        field4386++;
        if (this.field4394 == null) {
            return null;
        }
        class106 var2 = this.field4404[(int) (this.field4399 & (long) (this.field4391 + arg0))];
        while (this.field4394 != var2) {
            if (this.field4394.field1881 == this.field4399) {
                class106 var3 = this.field4394;
                this.field4394 = this.field4394.field1887;
                return var3;
            }
            this.field4394 = this.field4394.field1887;
        }
        this.field4394 = null;
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
    public static final void method1540(int arg0, int arg1) {
        class72 var2 = class95.field1776[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class72 var4 = class95.field1776[var3][arg0][arg1] = class95.field1776[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1416--;
                for (int var5 = 0; var5 < var4.field1397; var5++) {
                    class124 var6 = var4.field1405[var5];
                    if ((var6.field2230 >> 29 & 0x3L) == 2L && var6.field2224 == arg0 && var6.field2214 == arg1) {
                        var6.field2223--;
                    }
                }
            }
        }
        if (class95.field1776[0][arg0][arg1] == null) {
            class95.field1776[0][arg0][arg1] = new class72(0, arg0, arg1);
        }
        class95.field1776[0][arg0][arg1].field1392 = var2;
        class95.field1776[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(I)V")
    public class236(int arg0) {
        this.field4391 = arg0;
        this.field4404 = new class106[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class106 var3 = this.field4404[var2] = new class106();
            var3.field1887 = var3;
            var3.field1889 = var3;
        }
    }
}
