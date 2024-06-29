import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class233 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lpa;")
    private class387 field3372 = new class387(64);

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lcb;")
    private class544 field3377;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lke;")
    public static class622 field3375 = new class622(78, 0);

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field3378 = 4;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1607(int arg0, int arg1, int arg2) {
        if (arg1 != 11) {
            method1612(1, null);
        }
        field3381++;
        return (arg2 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 19)
    public final void method1608(int arg0) {
        field3380++;
        class387 var2 = this.field3372;
        synchronized (this.field3372) {
            int var3 = -97 / ((-arg0 - 58) / 32);
            this.field3372.method2364(1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lcd;", line = 34)
    public final class330 method1609(int arg0, int arg1) {
        field3374++;
        class387 var3 = this.field3372;
        class330 var4;
        synchronized (this.field3372) {
            if (arg1 >= -67) {
                this.field3372 = null;
            }
            var4 = (class330) this.field3372.method2373((long) arg0, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field3377;
        byte[] var6;
        synchronized (this.field3377) {
            var6 = this.field3377.method3150(arg0, 20, 11);
        }
        class330 var7 = new class330();
        if (var6 != null) {
            var7.method2132((byte) -121, new class120(var6));
        }
        class387 var8 = this.field3372;
        synchronized (this.field3372) {
            this.field3372.method2362(var7, 0, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 66)
    public static void method1610(int arg0) {
        if (arg0 != 1340) {
            field3378 = 41;
        }
        field3375 = null;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 82)
    public final void method1611(int arg0) {
        class387 var2 = this.field3372;
        synchronized (this.field3372) {
            this.field3372.method2369(-1);
        }
        if (arg0 != 0) {
            this.method1609(1, -94);
        }
        field3376++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/lang/String;)I", line = 95)
    public static final int method1612(int arg0, String arg1) {
        if (arg0 != 1) {
            field3378 = -5;
        }
        field3373++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V", line = 107)
    public final void method1613(int arg0, int arg1) {
        if (arg1 != 540800) {
            field3375 = null;
        }
        field3379++;
        class387 var3 = this.field3372;
        synchronized (this.field3372) {
            this.field3372.method2366(arg0, 116);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Liv;ILcb;)V", line = 125)
    public class233(class106 arg0, int arg1, class544 arg2) {
        this.field3377 = arg2;
        if (this.field3377 != null) {
            this.field3377.method3147(11, -40);
        }
    }
}
