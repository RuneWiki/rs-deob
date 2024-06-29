import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class222 {

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    private int field3459 = 0;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "[Lhb;")
    public class154[] field3448;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field3460 = -1;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3447 = new CRC32();

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "[I")
    public static int[] field3462 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3463 = " is already on your friend list.";

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "[I")
    public static int[] field3464 = new int[500];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "J")
    private long field3454;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lhb;")
    private class154 field3453;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Lhb;")
    private class154 field3461;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)I")
    public final int method1451(int arg0) {
        int var2 = 0;
        field3449++;
        for (int var3 = 0; var3 < this.field3451; var3++) {
            class154 var4 = this.field3448[var3];
            for (class154 var5 = var4.field2144; var5 != var4; var5 = var5.field2144) {
                var2++;
            }
        }
        if (arg0 != 2173) {
            this.field3451 = 119;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(JLhb;I)V")
    public final void method1452(long arg0, class154 arg1, int arg2) {
        if (arg1.field2137 != null) {
            arg1.method962(arg2 + 128);
        }
        field3443++;
        class154 var5 = this.field3448[(int) ((long) (this.field3451 - 1) & arg0)];
        arg1.field2144 = var5;
        arg1.field2141 = arg0;
        if (arg2 != 0) {
            this.method1459((byte) 44);
        }
        arg1.field2137 = var5.field2137;
        arg1.field2137.field2144 = arg1;
        arg1.field2144.field2137 = arg1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZJ)Lhb;")
    public final class154 method1453(boolean arg0, long arg1) {
        this.field3454 = arg1;
        field3452++;
        class154 var4 = this.field3448[(int) (arg1 & (long) (this.field3451 - 1))];
        this.field3453 = var4.field2144;
        if (!arg0) {
            method1457(true);
        }
        while (this.field3453 != var4) {
            if (this.field3453.field2141 == arg1) {
                class154 var5 = this.field3453;
                this.field3453 = this.field3453.field2144;
                return var5;
            }
            this.field3453 = this.field3453.field2144;
        }
        this.field3453 = null;
        return null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lnh;I)V")
    public static final void method1454(class305 arg0, int arg1) {
        if (arg1 != 0) {
            method1457(false);
        }
        field3446++;
        class165.field2345 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method1455(int arg0, byte arg1) {
        field3450++;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else {
            if (arg1 != 9) {
                field3460 = -37;
            }
            return arg0 < 10000000 ? "<col=ffffff>" + arg0 / 1000 + class5.field46 + "</col>" : "<col=00ff80>" + arg0 / 1000000 + class59.field816 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public final void method1456(int arg0) {
        for (int var2 = arg0; var2 < this.field3451; var2++) {
            class154 var3 = this.field3448[var2];
            while (true) {
                class154 var4 = var3.field2144;
                if (var3 == var4) {
                    break;
                }
                var4.method962(arg0 ^ 0x80);
            }
        }
        this.field3453 = null;
        this.field3461 = null;
        field3456++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)[Lta;")
    public static final class203[] method1457(boolean arg0) {
        class203[] var1 = new class203[class56.field784];
        for (int var2 = 0; var2 < class56.field784; var2++) {
            int var3 = class137.field1869[var2] * class112.field1613[var2];
            byte[] var4 = class134.field1847[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class298.field4748[class32.method199(var4[var6], 255)];
            }
            var1[var2] = new class203(class242.field3805, class70.field1021, class275.field4376[var2], class96.field1381[var2], class137.field1869[var2], class112.field1613[var2], var5);
        }
        class282.method1840(arg0);
        field3444++;
        if (!arg0) {
            method1460(85);
        }
        return var1;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)Lhb;")
    public final class154 method1458(int arg0) {
        this.field3459 = arg0;
        field3457++;
        return this.method1462(-10000001);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)I")
    public final int method1459(byte arg0) {
        if (arg0 != -45) {
            field3463 = null;
        }
        field3455++;
        return this.field3451;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(I)V")
    public class222(int arg0) {
        this.field3451 = arg0;
        this.field3448 = new class154[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class154 var3 = this.field3448[var2] = new class154();
            var3.field2137 = var3;
            var3.field2144 = var3;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static void method1460(int arg0) {
        field3463 = null;
        field3462 = null;
        field3447 = null;
        if (arg0 != 26030) {
            field3462 = null;
        }
        field3464 = null;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)Lhb;")
    public final class154 method1461(int arg0) {
        field3458++;
        if (this.field3453 == null) {
            return null;
        }
        class154 var2 = this.field3448[(int) ((long) (this.field3451 - 1) & this.field3454)];
        while (this.field3453 != var2) {
            if (this.field3453.field2141 == this.field3454) {
                class154 var4 = this.field3453;
                this.field3453 = this.field3453.field2144;
                return var4;
            }
            this.field3453 = this.field3453.field2144;
        }
        int var3 = 43 / ((arg0 - 51) / 43);
        this.field3453 = null;
        return null;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)Lhb;")
    public final class154 method1462(int arg0) {
        field3445++;
        if (arg0 != -10000001) {
            this.field3453 = null;
        }
        if (this.field3459 > 0 && this.field3448[this.field3459 - 1] != this.field3461) {
            class154 var2 = this.field3461;
            this.field3461 = var2.field2144;
            return var2;
        }
        while (this.field3459 < this.field3451) {
            class154 var3 = this.field3448[this.field3459++].field2144;
            if (this.field3448[this.field3459 - 1] != var3) {
                this.field3461 = var3.field2144;
                return var3;
            }
        }
        return null;
    }
}
