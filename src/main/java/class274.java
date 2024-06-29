import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class274 {

    @OriginalMember(owner = "client!tca", name = "j", descriptor = "Lbh;")
    private class538 field3683 = new class538(64);

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "Lwu;")
    private class557 field3680;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "Z")
    public static boolean field3674 = false;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "[I")
    public static int[] field3679 = new int[8];

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "[I")
    public static int[] field3682 = new int[6];

    @OriginalMember(owner = "client!tca", name = "m", descriptor = "Z")
    public static boolean field3686 = false;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!tca", name = "l", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "Ljn;")
    public static class322 field3684;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
    public final void method1659(int arg0) {
        field3677++;
        class538 var2 = this.field3683;
        synchronized (this.field3683) {
            this.field3683.method3202((byte) 127);
            if (arg0 != 15060) {
                this.field3683 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZ)V")
    public final void method1660(int arg0, boolean arg1) {
        class538 var3 = this.field3683;
        synchronized (this.field3683) {
            this.field3683.method3210(arg1);
            this.field3683 = new class538(arg0);
        }
        if (arg1) {
            method1663(38);
        }
        field3676++;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(II)V")
    public final void method1661(int arg0, int arg1) {
        field3675++;
        if (arg0 == 64) {
            class538 var3 = this.field3683;
            synchronized (this.field3683) {
                this.field3683.method3204((byte) -76, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(II)Liga;")
    public final class494 method1662(int arg0, int arg1) {
        field3678++;
        class538 var3 = this.field3683;
        class494 var4;
        synchronized (this.field3683) {
            var4 = (class494) this.field3683.method3200((long) arg0, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field3680;
        byte[] var6;
        synchronized (this.field3680) {
            var6 = this.field3680.method3322(class687.method3916(arg0, -116), class270.method1650(arg1 ^ 0xBDDB8E1A, arg0), (byte) 106);
        }
        class494 var7 = new class494();
        if (var6 != null) {
            var7.method2953(new class26(var6), -1);
        }
        class538 var8 = this.field3683;
        synchronized (this.field3683) {
            this.field3683.method3199((byte) 78, var7, (long) arg0);
        }
        if (arg1 != -29158) {
            this.field3683 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
    public static void method1663(int arg0) {
        field3679 = null;
        field3682 = null;
        if (arg0 < 125) {
            method1663(-75);
        }
        field3684 = null;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V")
    public final void method1664(byte arg0) {
        class538 var2 = this.field3683;
        synchronized (this.field3683) {
            this.field3683.method3210(false);
        }
        if (arg0 != -94) {
            this.method1660(-53, false);
        }
        field3681++;
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lwj;ILwu;)V")
    public class274(class121 arg0, int arg1, class557 arg2) {
        this.field3680 = arg2;
        if (this.field3680 != null) {
            int var4 = this.field3680.method3341((byte) -124) - 1;
            this.field3680.method3333(var4, 3443);
        }
    }
}
