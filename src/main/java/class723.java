import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class723 implements class245 {

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Ldu;")
    private class360 field10067 = new class360(128);

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "[I")
    private int[] field10073 = new int[class70.field854.field10086];

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "[I")
    public int[] field10076 = new int[class70.field854.field10086];

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field10069 = 0;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "[Lbe;")
    public static class37[] field10070 = new class37[14];

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "Lhda;")
    public static class752 field10079 = new class752(51, 16);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field10065;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field10066;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field10068;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field10071;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field10072;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field10074;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field10075;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field10077;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field10078;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public final void method4067(int arg0) {
        if (arg0 != -12777) {
            return;
        }
        for (int var2 = 0; var2 < class70.field854.field10086; var2++) {
            class159 var3 = class70.field854.method4077(var2, (byte) -53);
            if (var3 != null && var3.field2396 == 0) {
                this.field10073[var2] = 0;
                this.field10076[var2] = 0;
            }
        }
        field10068++;
        this.field10067 = new class360(128);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)I")
    public final int method4068(int arg0, boolean arg1) {
        field10074++;
        if (arg0 <= 113) {
            method4073((byte) -6, null, 119, 57);
        }
        long var3 = class375.method2193(116);
        for (class31 var5 = arg1 ? (class31) this.field10067.method2144(true) : (class31) this.field10067.method2146(false); var5 != null; var5 = (class31) this.field10067.method2146(false)) {
            if ((var5.field487 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field487 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field8680;
                    this.field10076[var6] = this.field10073[var6];
                    var5.method3564(true);
                    return var6;
                }
                var5.method3564(true);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIB)V")
    public final void method4069(int arg0, int arg1, byte arg2) {
        field10078++;
        class671 var4 = class224.field3172.method2588(arg2 ^ 0xFFFFFFE8, arg1);
        int var5 = var4.field9151;
        if (arg2 != 98) {
            this.method4071(8, -13, 9);
        }
        int var6 = var4.field9150;
        int var7 = var4.field9158;
        int var8 = class227.field3242[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method4072(var9 & arg0 << var6 | ~var9 & this.field10076[var5], var5, 0);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public static void method4070(int arg0) {
        if (arg0 != -1) {
            method4073((byte) -50, null, 100, -80);
        }
        field10079 = null;
        field10070 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
    public final void method4071(int arg0, int arg1, int arg2) {
        this.field10073[arg1] = arg2;
        int var4 = -40 % ((arg0 + 74) / 37);
        field10075++;
        class31 var5 = (class31) this.field10067.method2135((long) arg1, (byte) 31);
        if (var5 == null) {
            class31 var6 = new class31(4611686018427387905L);
            this.field10067.method2143(-1, var6, (long) arg1);
        } else if (var5.field487 != 4611686018427387905L) {
            var5.field487 = class375.method2193(116) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)V")
    public final void method4072(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method4069(-83, -6, (byte) -98);
        }
        field10071++;
        this.field10076[arg1] = arg0;
        class31 var4 = (class31) this.field10067.method2135((long) arg1, (byte) 31);
        if (var4 == null) {
            class31 var5 = new class31(class375.method2193(116) + 500L);
            this.field10067.method2143(-1, var5, (long) arg1);
        } else {
            var4.field487 = class375.method2193(116) + 500L;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)I")
    public final int method1524(int arg0, byte arg1) {
        field10066++;
        class671 var3 = class224.field3172.method2588(-97, arg0);
        if (arg1 > -85) {
            return -29;
        }
        int var4 = var3.field9151;
        int var5 = var3.field9150;
        int var6 = var3.field9158;
        int var7 = class227.field3242[var6 - var5];
        return var7 & this.field10076[var4] >> var5;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(IB)I")
    public final int method1525(int arg0, byte arg1) {
        if (arg1 < 35) {
            this.field10073 = null;
        }
        field10065++;
        return this.field10076[arg0];
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLfa;II)V")
    public static final void method4073(byte arg0, class236 arg1, int arg2, int arg3) {
        field10077++;
        if (!class403.field5625) {
            return;
        }
        int var4 = -64 % ((27 - arg0) / 63);
        int var5 = 0;
        for (class433 var6 = (class433) arg1.field3322.method4051(896); var6 != null; var6 = (class433) arg1.field3322.method4049(true)) {
            int var11 = class110.method810(-38, var6);
            if (var5 < var11) {
                var5 = var11;
            }
        }
        var5 += 8;
        class274.field3814 = (class743.field10329 ? 26 : 22) + arg1.field3323 * 16;
        int var7 = arg1.field3323 * 16 + 21;
        int var8 = class477.field6534 + class575.field7554;
        if (class228.field3251 < (var5 + var8)) {
            var8 = class477.field6534 - var5;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = class743.field10329 ? 33 : 31;
        int var10 = arg3 + 13 - var9;
        if ((var10 + var7) > class199.field2993) {
            var10 = class199.field2993 - var7;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        class267.field3716 = var8;
        class21.field392 = arg1;
        class214.field3121 = var10;
        class366.field5133 = var5;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(III)V")
    public final void method4074(int arg0, int arg1, int arg2) {
        int var4 = 33 / ((arg1 - 65) / 39);
        field10072++;
        class671 var5 = class224.field3172.method2588(-116, arg0);
        int var6 = var5.field9151;
        int var7 = var5.field9150;
        int var8 = var5.field9158;
        int var9 = class227.field3242[var8 - var7];
        if (arg2 < 0 || arg2 > var9) {
            arg2 = 0;
        }
        int var10 = var9 << var7;
        this.method4071(74, var6, arg2 << var7 & var10 | this.field10073[var6] & ~var10);
    }
}
