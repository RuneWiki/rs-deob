import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class465 implements class39 {

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lek;")
    private class352 field6707 = new class352(128);

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "[I")
    public int[] field6712 = new int[class436.field6239.field7108];

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "[I")
    private int[] field6705 = new int[class436.field6239.field7108];

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Ldq;")
    public static class493 field6709 = new class493(63, 6);

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "F")
    public static float field6714 = 1.0F;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "[Ll;")
    public static class16[] field6715;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLpc;)[Ltm;", line = 3)
    public static final class266[] method2800(boolean arg0, class476 arg1) {
        field6706++;
        if (!arg1.method2878(arg0)) {
            return new class266[0];
        }
        class121 var2 = arg1.method2868(-25232);
        while (var2.field1628 == 0) {
            class199.method1251(10L, (byte) 29);
        }
        if (var2.field1628 == 2) {
            return new class266[0];
        }
        int[] var3 = (int[]) var2.field1627;
        class266[] var4 = new class266[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class266 var6 = new class266();
            var4[var5] = var6;
            var6.field3356 = var3[var5 << 2];
            var6.field3352 = var3[(var5 << 2) + 1];
            var6.field3353 = var3[(var5 << 2) + 2];
            var6.field3351 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BII)V", line = 44)
    public final void method2801(byte arg0, int arg1, int arg2) {
        field6702++;
        if (arg0 <= 68) {
            field6714 = 3.0585587F;
        }
        this.field6712[arg2] = arg1;
        class24 var4 = (class24) this.field6707.method2022(-1, (long) arg2);
        if (var4 == null) {
            class24 var5 = new class24(class504.method3034((byte) -122) + 500L);
            this.field6707.method2019((byte) -41, var5, (long) arg2);
        } else {
            var4.field344 = class504.method3034((byte) -121) + 500L;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 67)
    public final void method2802(byte arg0) {
        field6704++;
        if (arg0 < 101) {
            method2800(false, null);
        }
        for (int var2 = 0; var2 < class436.field6239.field7108; var2++) {
            class281 var3 = class436.field6239.method2963((byte) -61, var2);
            if (var3 != null && var3.field3581 == 0) {
                this.field6705[var2] = 0;
                this.field6712[var2] = 0;
            }
        }
        this.field6707 = new class352(128);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 98)
    public static final String method2803(String arg0, byte arg1) {
        if (arg1 <= 67) {
            method2803(null, (byte) 14);
        }
        field6703++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var3 > var2 && class213.method1318(45, arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class213.method1318(45, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class52.method517((byte) 59, var7)) {
                char var8 = class297.method1747(var7, -246);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)I", line = 156)
    public final int method376(int arg0, int arg1) {
        field6708++;
        int var3 = -69 / (arg0 / 38);
        return this.field6712[arg1];
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZI)V", line = 168)
    public final void method2804(int arg0, boolean arg1, int arg2) {
        field6700++;
        if (!arg1) {
            field6709 = null;
        }
        class300 var4 = class242.field3132.method1690(0, arg2);
        int var5 = var4.field3860;
        int var6 = var4.field3861;
        int var7 = var4.field3864;
        int var8 = class257.field3269[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method2808(!arg1, var5, arg0 << var6 & var9 | ~var9 & this.field6705[var5]);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)V", line = 196)
    public final void method2805(int arg0, int arg1, int arg2) {
        field6710++;
        class300 var4 = class242.field3132.method1690(arg1 ^ arg1, arg0);
        int var5 = var4.field3860;
        int var6 = var4.field3861;
        int var7 = var4.field3864;
        int var8 = class257.field3269[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2801((byte) 78, var9 & arg2 << var6 | this.field6712[var5] & ~var9, var5);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 224)
    public static void method2806(int arg0) {
        field6709 = null;
        field6715 = null;
        if (arg0 != -1994346078) {
            method2800(false, null);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)I", line = 235)
    public final int method377(int arg0, int arg1) {
        if (arg0 != -1994346078) {
            return 45;
        }
        field6713++;
        class300 var3 = class242.field3132.method1690(0, arg1);
        int var4 = var3.field3860;
        int var5 = var3.field3861;
        int var6 = var3.field3864;
        int var7 = class257.field3269[var6 - var5];
        return var7 & this.field6712[var4] >> var5;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BZ)I", line = 257)
    public final int method2807(byte arg0, boolean arg1) {
        field6711++;
        long var3 = class504.method3034((byte) -101);
        if (arg0 < 88) {
            return -118;
        }
        for (class24 var5 = arg1 ? (class24) this.field6707.method2021(69) : (class24) this.field6707.method2017(-42); var5 != null; var5 = (class24) this.field6707.method2017(-28)) {
            if ((var5.field344 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field344 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field5043;
                    this.field6712[var6] = this.field6705[var6];
                    var5.method2165(16225);
                    return var6;
                }
                var5.method2165(16225);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZII)V", line = 298)
    public final void method2808(boolean arg0, int arg1, int arg2) {
        this.field6705[arg1] = arg2;
        if (arg0) {
            this.method2804(124, false, -128);
        }
        field6701++;
        class24 var4 = (class24) this.field6707.method2022(-1, (long) arg1);
        if (var4 == null) {
            class24 var5 = new class24(4611686018427387905L);
            this.field6707.method2019((byte) -83, var5, (long) arg1);
        } else if (var4.field344 != 4611686018427387905L) {
            var4.field344 = class504.method3034((byte) -118) + 500L | 0x4000000000000000L;
        }
    }
}
