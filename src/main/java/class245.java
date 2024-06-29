import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class245 {

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Ltja;")
    private class288 field2897 = new class288(64);

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "Ltja;")
    public class288 field2899 = new class288(60);

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Lbt;")
    private class48 field2898;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lbt;")
    public class48 field2887;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field2894 = 0;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field2896 = 16777215;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2886 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1472(int arg0, String arg1) {
        field2888++;
        if (arg1 == null) {
            return;
        }
        int var2 = 8 / ((arg0 - 32) / 50);
        if (!(class651.field8992 < 200 || class324.field4018) || class651.field8992 >= 200) {
            class619.method3512(class637.field8686.method3584(class770.field10592, true), 4, false);
            return;
        }
        String var3 = class87.method803(arg1, false);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class651.field8992; var4++) {
            String var9 = class87.method803(class375.field4702[var4], false);
            if (var9 != null && var9.equals(var3)) {
                class619.method3512(arg1 + class637.field8713.method3584(class770.field10592, true), 4, false);
                return;
            }
            if (class156.field1942[var4] != null) {
                String var10 = class87.method803(class156.field1942[var4], false);
                if (var10 != null && var10.equals(var3)) {
                    class619.method3512(arg1 + class637.field8713.method3584(class770.field10592, true), 4, false);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class60.field803; var5++) {
            String var7 = class87.method803(class86.field1151[var5], false);
            if (var7 != null && var7.equals(var3)) {
                class619.method3512(class637.field8718.method3584(class770.field10592, true) + arg1 + class637.field8719.method3584(class770.field10592, true), 4, false);
                return;
            }
            if (class115.field1457[var5] != null) {
                String var8 = class87.method803(class115.field1457[var5], false);
                if (var8 != null && var8.equals(var3)) {
                    class619.method3512(class637.field8718.method3584(class770.field10592, true) + arg1 + class637.field8719.method3584(class770.field10592, true), 4, false);
                    return;
                }
            }
        }
        if (class87.method803(class300.field3596.field7399, false).equals(var3)) {
            class619.method3512(class637.field8716.method3584(class770.field10592, true), 4, false);
            return;
        }
        class518.field7303++;
        class336 var6 = class512.method3076(class779.field10753, class591.field8030, (byte) 118);
        var6.field4150.method2353(102, class615.method3482(arg1, 1));
        var6.field4150.method2388(255, arg1);
        class578.method3334(4, var6);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lsb;")
    public final class308 method1473(int arg0, int arg1) {
        field2889++;
        class288 var3 = this.field2897;
        class308 var4;
        synchronized (this.field2897) {
            if (arg0 >= -30) {
                method1480(false, 54, 6, -41, null, -31, null, -44);
            }
            var4 = (class308) this.field2897.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field2898;
        byte[] var6;
        synchronized (this.field2898) {
            var6 = this.field2898.method437(class32.method300(arg1, -1), (byte) -123, class596.method3410(arg1, (byte) -57));
        }
        class308 var7 = new class308();
        var7.field3806 = arg1;
        var7.field3827 = this;
        if (var6 != null) {
            var7.method1822((byte) 5, new class403(var6));
        }
        class288 var8 = this.field2897;
        synchronized (this.field2897) {
            this.field2897.method1686(-25638, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method1474(byte arg0) {
        int var1 = -63 % ((-arg0 - 20) / 38);
        field2886 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z")
    public static final boolean method1475(int arg0, int arg1, int arg2) {
        if (arg1 < 61) {
            method1474((byte) -103);
        }
        field2892++;
        return class688.method3843(103, arg0, arg2) | (arg2 & 0x70000) != 0 || class372.method2181(arg2, arg0, 10504);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
    public final void method1476(int arg0, int arg1) {
        if (arg0 != 64) {
            return;
        }
        class288 var3 = this.field2897;
        synchronized (this.field2897) {
            this.field2897.method1694(arg1, arg0 ^ 0xFFFFFFF2);
        }
        field2890++;
        class288 var4 = this.field2899;
        synchronized (this.field2899) {
            this.field2899.method1694(arg1, arg0 ^ 0xFFFFFFDC);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public final void method1477(boolean arg0) {
        class288 var2 = this.field2897;
        synchronized (this.field2897) {
            this.field2897.method1687((byte) 61);
        }
        field2885++;
        if (arg0) {
            class288 var3 = this.field2899;
            synchronized (this.field2899) {
                this.field2899.method1687((byte) 61);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
    public final void method1478(int arg0, byte arg1) {
        field2893++;
        this.field2900 = arg0;
        class288 var3 = this.field2899;
        synchronized (this.field2899) {
            this.field2899.method1690(0);
        }
        if (arg1 >= -64) {
            this.method1477(false);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public final void method1479(int arg0) {
        class288 var2 = this.field2897;
        synchronized (this.field2897) {
            this.field2897.method1690(arg0 - 254);
        }
        if (arg0 != 254) {
            return;
        }
        field2895++;
        class288 var3 = this.field2899;
        synchronized (this.field2899) {
            this.field2899.method1690(0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZIIILpc;I[II)Lqt;")
    public static final class664 method1480(boolean arg0, int arg1, int arg2, int arg3, class700 arg4, int arg5, int[] arg6, int arg7) {
        if (arg3 != 3553) {
            field2896 = 51;
        }
        field2891++;
        if (!arg4.field9846 && (!class152.method1091(arg2, -93) || !class152.method1091(arg7, -33))) {
            return arg4.field9842 ? new class664(arg4, 34037, arg2, arg7, arg0, arg6, arg5, arg1) : new class664(arg4, arg2, arg7, class783.method4337(arg2, (byte) 43), class783.method4337(arg7, (byte) 78), arg6);
        } else {
            return new class664(arg4, 3553, arg2, arg7, arg0, arg6, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lmja;ILbt;Lbt;)V")
    public class245(class441 arg0, int arg1, class48 arg2, class48 arg3) {
        this.field2898 = arg2;
        this.field2887 = arg3;
        int var5 = this.field2898.method445(-105) - 1;
        this.field2898.method431(4, var5);
    }
}
