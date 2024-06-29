import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class213 {

    @OriginalMember(owner = "client!kea", name = "s", descriptor = "I")
    private int field2973 = 0;

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "[Lpca;")
    public class665[] field2961;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
    public static int field2960 = 0;

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2969 = new String[100];

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "I")
    public static int field2966 = 1;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!kea", name = "r", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "J")
    private long field2962;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "Lpca;")
    private class665 field2959;

    @OriginalMember(owner = "client!kea", name = "t", descriptor = "Lpca;")
    private class665 field2974;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V", line = 4)
    public static void method1402(byte arg0) {
        field2969 = null;
        if (arg0 != -10) {
            field2966 = 10;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLpca;J)V", line = 14)
    public final void method1403(byte arg0, class665 arg1, long arg2) {
        field2968++;
        if (arg1.field9384 != null) {
            arg1.method3678(-1);
        }
        class665 var5 = this.field2961[(int) ((long) (this.field2967 - 1) & arg2)];
        arg1.field9384 = var5.field9384;
        arg1.field9382 = var5;
        arg1.field9384.field9382 = arg1;
        arg1.field9386 = arg2;
        arg1.field9382.field9384 = arg1;
        if (arg0 != -18) {
            field2960 = -104;
        }
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)I", line = 35)
    public final int method1404(byte arg0) {
        field2971++;
        int var2 = 11 / ((-arg0 - 22) / 45);
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2967; var4++) {
            class665 var5 = this.field2961[var4];
            class665 var6 = var5.field9382;
            while (var5 != var6) {
                var6 = var6.field9382;
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(JB)Lpca;", line = 69)
    public final class665 method1405(long arg0, byte arg1) {
        this.field2962 = arg0;
        field2972++;
        if (arg1 >= -13) {
            this.field2974 = null;
        }
        class665 var4 = this.field2961[(int) (arg0 & (long) (this.field2967 - 1))];
        for (this.field2959 = var4.field9382; this.field2959 != var4; this.field2959 = this.field2959.field9382) {
            if (this.field2959.field9386 == arg0) {
                class665 var5 = this.field2959;
                this.field2959 = this.field2959.field9382;
                return var5;
            }
        }
        this.field2959 = null;
        return null;
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(B)V", line = 99)
    public static final void method1406(byte arg0) {
        int var1 = -72 % ((-arg0 - 9) / 53);
        class229.field3593.method2285((byte) -77);
        field2964++;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Lpca;", line = 109)
    public final class665 method1407(int arg0) {
        this.field2973 = 0;
        field2958++;
        int var2 = 91 % ((arg0 + 47) / 43);
        return this.method1413(true);
    }

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(B)I", line = 121)
    public final int method1408(byte arg0) {
        field2970++;
        if (arg0 > -37) {
            method1412(-127, -1, null, 105);
        }
        return this.field2967;
    }

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "(B)V", line = 133)
    public final void method1409(byte arg0) {
        for (int var2 = 0; var2 < this.field2967; var2++) {
            class665 var3 = this.field2961[var2];
            while (true) {
                class665 var4 = var3.field9382;
                if (var3 == var4) {
                    break;
                }
                var4.method3678(arg0 ^ 0xFFFFFF88);
            }
        }
        if (arg0 == 119) {
            field2956++;
            this.field2959 = null;
            this.field2974 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "([Lpca;B)I", line = 171)
    public final int method1410(class665[] arg0, byte arg1) {
        field2965++;
        int var3 = 0;
        if (arg1 != 46) {
            this.method1404((byte) -17);
        }
        for (int var4 = 0; var4 < this.field2967; var4++) {
            class665 var5 = this.field2961[var4];
            for (class665 var6 = var5.field9382; var6 != var5; var6 = var6.field9382) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "(B)Lpca;", line = 204)
    public final class665 method1411(byte arg0) {
        field2955++;
        if (this.field2959 == null) {
            return null;
        } else if (arg0 < 24) {
            return null;
        } else {
            class665 var2 = this.field2961[(int) ((long) (this.field2967 - 1) & this.field2962)];
            while (this.field2959 != var2) {
                if (this.field2959.field9386 == this.field2962) {
                    class665 var3 = this.field2959;
                    this.field2959 = this.field2959.field9382;
                    return var3;
                }
                this.field2959 = this.field2959.field9382;
            }
            this.field2959 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IILvg;I)V", line = 242)
    public static final void method1412(int arg0, int arg1, class49 arg2, int arg3) {
        class226.field3181 = arg0;
        if (arg1 <= 107) {
            method1406((byte) 1);
        }
        class243.field3789 = arg3;
        field2963++;
        class569.field8022 = arg2;
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(I)V", line = 265)
    public class213(int arg0) {
        this.field2967 = arg0;
        this.field2961 = new class665[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class665 var3 = this.field2961[var2] = new class665();
            var3.field9384 = var3;
            var3.field9382 = var3;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z)Lpca;", line = 293)
    public final class665 method1413(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field2957++;
        if (this.field2973 > 0 && this.field2961[this.field2973 - 1] != this.field2974) {
            class665 var2 = this.field2974;
            this.field2974 = var2.field9382;
            return var2;
        }
        while (this.field2967 > this.field2973) {
            class665 var3 = this.field2961[this.field2973++].field9382;
            if (this.field2961[this.field2973 - 1] != var3) {
                this.field2974 = var3.field9382;
                return var3;
            }
        }
        return null;
    }
}
