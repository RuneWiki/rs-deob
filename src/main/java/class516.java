import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class516 implements class175 {

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Lew;")
    private class270 field7571 = new class270(128);

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "[I")
    private int[] field7573 = new int[class110.field1782.field3231];

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "[I")
    public int[] field7581 = new int[class110.field1782.field3231];

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Lrb;")
    public static class283 field7566 = new class283(82, 4);

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field7580 = 0;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field7579 = 0;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "[I")
    public static int[] field7577 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)V", line = 7)
    public final void method3069(int arg0, int arg1, int arg2) {
        field7578++;
        class212 var4 = class296.field3994.method1319((byte) -126, arg2);
        int var5 = var4.field3014;
        int var6 = var4.field3020;
        int var7 = var4.field3013;
        int var8 = class229.field3207[var7 - var6];
        if (arg0 > arg1 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method3074(var9 & arg1 << var6 | ~var9 & this.field7573[var5], var5, (byte) -80);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BII)V", line = 32)
    public final void method3070(byte arg0, int arg1, int arg2) {
        field7576++;
        class212 var4 = class296.field3994.method1319((byte) -128, arg2);
        int var5 = var4.field3014;
        int var6 = var4.field3020;
        int var7 = var4.field3013;
        int var8 = class229.field3207[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        if (arg0 != -91) {
            method3076(true);
        }
        int var9 = var8 << var6;
        this.method3075(this.field7581[var5] & ~var9 | var9 & arg1 << var6, 0, var5);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZI)I", line = 61)
    public final int method3071(boolean arg0, int arg1) {
        field7570++;
        if (arg1 != -1) {
            this.field7573 = null;
        }
        long var3 = class254.method1522((byte) -51);
        for (class136 var5 = arg0 ? (class136) this.field7571.method1588(arg1 + 23) : (class136) this.field7571.method1582(-120); var5 != null; var5 = (class136) this.field7571.method1582(-106)) {
            if ((var5.field2059 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field2059 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field6883;
                    this.field7581[var6] = this.field7573[var6];
                    var5.method2791((byte) 112);
                    return var6;
                }
                var5.method2791((byte) 112);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)I", line = 101)
    public final int method1205(int arg0, int arg1) {
        if (arg0 >= -121) {
            this.field7573 = null;
        }
        field7568++;
        return this.field7581[arg1];
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 112)
    public final void method3072(int arg0) {
        int var2 = 2 / ((35 - arg0) / 39);
        field7569++;
        for (int var3 = 0; var3 < class110.field1782.field3231; var3++) {
            class491 var4 = class110.field1782.method1414(var3, 31946);
            if (var4 != null && var4.field7087 == 0) {
                this.field7573[var3] = 0;
                this.field7581[var3] = 0;
            }
        }
        this.field7571 = new class270(128);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 138)
    public static void method3073(int arg0) {
        field7577 = null;
        field7566 = null;
        if (arg0 != 82) {
            method3076(false);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIB)V", line = 153)
    public final void method3074(int arg0, int arg1, byte arg2) {
        field7574++;
        int var4 = -106 / ((6 - arg2) / 42);
        this.field7573[arg1] = arg0;
        class136 var5 = (class136) this.field7571.method1592((byte) -25, (long) arg1);
        if (var5 == null) {
            class136 var6 = new class136(4611686018427387905L);
            this.field7571.method1586(var6, (long) arg1, 1);
        } else if (var5.field2059 != 4611686018427387905L) {
            var5.field2059 = class254.method1522((byte) -51) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)I", line = 180)
    public final int method1206(int arg0, byte arg1) {
        field7567++;
        class212 var3 = class296.field3994.method1319((byte) -124, arg0);
        int var4 = -10 % ((2 - arg1) / 45);
        int var5 = var3.field3014;
        int var6 = var3.field3020;
        int var7 = var3.field3013;
        int var8 = class229.field3207[var7 - var6];
        return var8 & this.field7581[var5] >> var6;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(III)V", line = 200)
    public final void method3075(int arg0, int arg1, int arg2) {
        this.field7581[arg2] = arg0;
        field7572++;
        class136 var4 = (class136) this.field7571.method1592((byte) -25, (long) arg2);
        if (arg1 != 0) {
            method3076(true);
        }
        if (var4 == null) {
            class136 var5 = new class136(class254.method1522((byte) -51) + 500L);
            this.field7571.method1586(var5, (long) arg2, 1);
        } else {
            var4.field2059 = class254.method1522((byte) -51) + 500L;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)Z", line = 238)
    public static final boolean method3076(boolean arg0) {
        field7575++;
        if (class219.field3091) {
            try {
                if ((Boolean) class344.method2077(arg0, "showingVideoAd", class346.field4985.field2623)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0) {
            field7580 = -17;
        }
        return true;
    }
}
