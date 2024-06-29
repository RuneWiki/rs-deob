import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class210 {

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Lgj;")
    private class220 field3719 = new class220();

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Ldh;")
    private class159 field3726 = new class159();

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    private int field3720;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Loe;")
    private class120 field3724;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lfh;")
    public static class189 field3715 = new class189();

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lmh;")
    public static class128 field3723 = class22.method156(123, "<col=ffffff>");

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "[Lmh;")
    public static class128[] field3725 = new class128[500];

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Ldj;")
    public static class314 field3727;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "[Lmh;")
    public static class128[] field3722;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IJLgj;)V", line = 5)
    public final void method1442(int arg0, long arg1, class220 arg2) {
        field3711++;
        if (this.field3720 == 0) {
            class220 var5 = this.field3726.method1047((byte) -74);
            var5.method1978((byte) -127);
            var5.method1521(-3810);
            if (this.field3719 == var5) {
                class220 var6 = this.field3726.method1047((byte) -47);
                var6.method1978((byte) -119);
                var6.method1521(-3810);
            }
        } else {
            this.field3720--;
        }
        this.field3724.method730(arg2, arg1, (byte) 120);
        this.field3726.method1046(arg0 ^ arg0, arg2);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(JZ)Lgj;", line = 43)
    public final class220 method1443(long arg0, boolean arg1) {
        field3717++;
        class220 var4 = (class220) this.field3724.method728(arg1, arg0);
        if (var4 != null) {
            this.field3726.method1046(0, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([Ljava/lang/Object;I[JII)V", line = 64)
    public static final void method1444(Object[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        field3709++;
        if (arg1 < arg3) {
            int var5 = (arg1 + arg3) / 2;
            long var6 = arg2[var5];
            arg2[var5] = arg2[arg3];
            int var8 = arg1;
            arg2[arg3] = var6;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var9;
            for (int var10 = arg1; var10 < arg3; var10++) {
                if (arg2[var10] < ((long) (var10 & 0x1) + var6)) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var8];
                    arg2[var8] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var8];
                    arg0[var8++] = var13;
                }
            }
            arg2[arg3] = arg2[var8];
            arg2[var8] = var6;
            arg0[arg3] = arg0[var8];
            arg0[var8] = var9;
            method1444(arg0, arg1, arg2, var8 - 1, 0);
            method1444(arg0, var8 + 1, arg2, arg3, 0);
        }
        if (arg4 != 0) {
            field3723 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 123)
    public static void method1445(int arg0) {
        field3715 = null;
        field3725 = null;
        field3722 = null;
        if (arg0 > -29) {
            method1445(127);
        }
        field3723 = null;
        field3727 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)Lnm;", line = 141)
    public static final class176 method1446(byte arg0) {
        field3716++;
        try {
            if (arg0 != 58) {
                field3722 = (class128[]) null;
            }
            return (class176) Class.forName("vh").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V", line = 159)
    public static final void method1447(int arg0, int arg1) {
        field3710++;
        if (arg1 != 0) {
            field3722 = (class128[]) null;
        }
        class229 var2 = class241.method1638(11, 126, arg0);
        var2.method1566((byte) -3);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)Lqg;", line = 173)
    public static final class231 method1448(byte arg0) {
        field3714++;
        byte[] var1 = class157.field2690[0];
        if (arg0 > -4) {
            return (class231) null;
        }
        int var2 = class178.field3128[0] * class125.field2106[0];
        class231 var5;
        if (class139.field2383[0]) {
            byte[] var6 = class217.field3829[0];
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class279.method1951(class238.method1622(-16777216, var6[var8] << 24), class205.field3614[class238.method1622(var1[var8], 255)]);
            }
            var5 = new class122(class72.field1327, class132.field2294, class151.field2607[0], class266.field4603[0], class125.field2106[0], class178.field3128[0], var7);
        } else {
            int[] var3 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = class205.field3614[class238.method1622(var1[var4], 255)];
            }
            var5 = new class231(class72.field1327, class132.field2294, class151.field2607[0], class266.field4603[0], class125.field2106[0], class178.field3128[0], var3);
        }
        class15.method113(125);
        return var5;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Lqh;", line = 220)
    public final class287 method1449(int arg0) {
        if (arg0 != 0) {
            method1445(-127);
        }
        field3713++;
        return this.field3724.method732(1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)Lqh;", line = 238)
    public final class287 method1450(boolean arg0) {
        if (arg0) {
            field3712++;
            return this.field3724.method729(-121);
        } else {
            return (class287) null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 259)
    public final void method1451(int arg0) {
        field3718++;
        if (arg0 != 20650) {
            this.method1451(-52);
        }
        this.field3726.method1054((byte) -83);
        this.field3724.method733((byte) 121);
        this.field3719 = new class220();
        this.field3720 = this.field3721;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V", line = 309)
    public class210(int arg0) {
        this.field3720 = arg0;
        this.field3721 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3724 = new class120(var2);
    }
}
