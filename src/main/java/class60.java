import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class60 {

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Llj;")
    private class25 field970 = new class25();

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[I")
    public static int[] field966 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lgh;")
    public static class24 field968 = new class24(0, 0);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Llj;")
    private class25 field978;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Lja;")
    public static class55 field977;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "[Lcg;")
    public static class156[] field980;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Llj;")
    public final class25 method395(int arg0) {
        field973++;
        class25 var2 = this.field970.field373;
        if (arg0 != -129) {
            this.field970 = null;
        }
        if (this.field970 == var2) {
            return null;
        } else {
            var2.method134(arg0 ^ 0xDE);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public final void method396(byte arg0) {
        while (true) {
            class25 var2 = this.field970.field373;
            if (this.field970 == var2) {
                field972++;
                if (arg0 > -65) {
                    method402((class111) null, -111, (byte) 110, false, 45, 63, 40);
                }
                this.field978 = null;
                return;
            }
            var2.method134(-91);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Llj;")
    public final class25 method397(int arg0) {
        field965++;
        class25 var2 = this.field978;
        if (this.field970 == var2) {
            this.field978 = null;
            return null;
        }
        this.field978 = var2.field373;
        if (arg0 != 0) {
            field968 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIZ[Lwc;I)V")
    public static final void method398(int arg0, int arg1, int arg2, boolean arg3, class213[] arg4, int arg5) {
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class213 var7 = arg4[var6];
            if (var7 != null && var7.field3689 == arg1) {
                class111.method816(5, arg2, arg0, arg3, var7);
                class130.method958(var7, arg2, true, arg0);
                if (var7.field3648 > var7.field3591 - var7.field3603) {
                    var7.field3648 = var7.field3591 - var7.field3603;
                }
                if (var7.field3593 > var7.field3546 - var7.field3608) {
                    var7.field3593 = var7.field3546 - var7.field3608;
                }
                if (var7.field3593 < 0) {
                    var7.field3593 = 0;
                }
                if (var7.field3648 < 0) {
                    var7.field3648 = 0;
                }
                if (var7.field3623 == 0) {
                    class97.method718(-65, arg3, var7);
                }
            }
        }
        if (arg5 != 128) {
            method400(52, 85, -75, (byte) 7, -31, 24);
        }
        field971++;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public static void method399(int arg0) {
        field980 = null;
        field977 = null;
        if (arg0 != -1) {
            method399(27);
        }
        field968 = null;
        field966 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIBII)V")
    public static final void method400(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        class247.field4316 = arg5;
        class116.field1969 = arg1;
        if (arg3 != -53) {
            field966 = null;
        }
        class101.field1684 = arg0;
        field976++;
        class66.field1073 = arg4;
        class248.field4362 = arg2;
        if (class248.field4362 >= 100) {
            int var6 = class247.field4316 * 128 + 64;
            int var7 = class66.field1073 * 128 + 64;
            int var8 = class207.method1424(class257.field4496, var6, (byte) 57, var7) - class101.field1684;
            int var9 = var6 - class209.field3488;
            int var10 = var8 - class120.field2001;
            int var11 = var7 - class144.field2408;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class107.field1763 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class128.field2143 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class107.field1763 < 128) {
                class107.field1763 = 128;
            }
            if (class107.field1763 > 383) {
                class107.field1763 = 383;
            }
        }
        class201.field3361 = 2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)Z")
    public static final boolean method401(int arg0, byte arg1) {
        field967++;
        if (arg1 < 53) {
            method398(29, -39, -99, true, (class213[]) null, 105);
        }
        return ((arg0 & 0x2911C4B5) >> 29) != 0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lu;IBZIII)V")
    public static final void method402(class111 arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class134.field2225 = arg0;
        class82.field1382 = arg6;
        field969++;
        int var7 = 56 / ((arg2 + 3) / 52);
        class204.field3419 = arg4;
        class144.field2402 = arg5;
        class227.field3974 = arg3;
        class52.field876 = 1;
        class128.field2152 = arg1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Llj;I)V")
    public final void method403(class25 arg0, int arg1) {
        if (arg0.field379 != null) {
            arg0.method134(-102);
        }
        if (arg1 >= -34) {
            field968 = null;
        }
        field975++;
        arg0.field373 = this.field970.field373;
        arg0.field379 = this.field970;
        arg0.field379.field373 = arg0;
        arg0.field373.field379 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Llj;Z)V")
    public final void method404(class25 arg0, boolean arg1) {
        field979++;
        if (arg0.field379 != null) {
            arg0.method134(-111);
        }
        arg0.field379 = this.field970.field379;
        arg0.field373 = this.field970;
        arg0.field379.field373 = arg0;
        if (arg1) {
            this.field970 = null;
        }
        arg0.field373.field379 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)Llj;")
    public final class25 method405(byte arg0) {
        class25 var2 = this.field970.field373;
        field974++;
        if (this.field970 == var2) {
            this.field978 = null;
            return null;
        } else {
            this.field978 = var2.field373;
            return arg0 < 30 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class60() {
        this.field970.field379 = this.field970;
        this.field970.field373 = this.field970;
    }
}
