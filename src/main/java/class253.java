import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class253 {

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Llh;")
    private class364 field3642 = new class364(64);

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Llh;")
    public class364 field3654 = new class364(50);

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "Llh;")
    public class364 field3655 = new class364(5);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Z")
    public boolean field3638;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lhh;")
    public class84 field3641;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "Lhh;")
    private class84 field3653;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[Lti;")
    public static class303[] field3640 = new class303[2048];

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lao;")
    public static class188 field3643 = new class188(63, -1);

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Lgf;")
    public static class180 field3648 = new class180("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "F")
    public static float field3652;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public int field3656;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)Lqb;", line = 3)
    public final class148 method1605(byte arg0, int arg1) {
        field3650++;
        class364 var3 = this.field3642;
        class148 var4;
        synchronized (this.field3642) {
            var4 = (class148) this.field3642.method2339(-107, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3653.method683(class16.method149(12346, arg1), class57.method407(arg1, (byte) -115), 5);
        class148 var6 = new class148();
        var6.field2241 = arg1;
        var6.field2226 = this;
        if (arg0 != -117) {
            return null;
        }
        if (var5 != null) {
            var6.method1052(arg0 ^ 0x74, new class303(var5));
        }
        var6.method1058(0);
        class364 var7 = this.field3642;
        synchronized (this.field3642) {
            this.field3642.method2342((long) arg1, var6, -67);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 35)
    public final void method1606(byte arg0) {
        if (arg0 != 57) {
            return;
        }
        class364 var2 = this.field3642;
        synchronized (this.field3642) {
            this.field3642.method2350((byte) 112);
        }
        field3644++;
        class364 var3 = this.field3654;
        synchronized (this.field3654) {
            this.field3654.method2350((byte) 112);
        }
        class364 var4 = this.field3655;
        synchronized (this.field3655) {
            this.field3655.method2350((byte) 112);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 54)
    public final void method1607(int arg0) {
        class364 var2 = this.field3654;
        synchronized (this.field3654) {
            this.field3654.method2349(0);
        }
        field3646++;
        class364 var3 = this.field3655;
        synchronized (this.field3655) {
            this.field3655.method2349(0);
        }
        if (arg0 != -3) {
            field3640 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V", line = 71)
    public final void method1608(int arg0, int arg1) {
        if (arg0 != -1) {
            this.field3641 = null;
        }
        this.field3656 = arg1;
        field3647++;
        class364 var3 = this.field3654;
        synchronized (this.field3654) {
            this.field3654.method2349(0);
        }
        class364 var4 = this.field3655;
        synchronized (this.field3655) {
            this.field3655.method2349(0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 92)
    public static void method1609(int arg0) {
        field3648 = null;
        field3640 = null;
        field3643 = null;
        if (arg0 != 9363) {
            field3640 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V", line = 108)
    public final void method1610(int arg0, int arg1) {
        field3639++;
        class364 var3 = this.field3642;
        synchronized (this.field3642) {
            this.field3642.method2348(arg1, arg0 - 177);
        }
        class364 var4 = this.field3654;
        synchronized (this.field3654) {
            this.field3654.method2348(arg1, -128);
        }
        class364 var5 = this.field3655;
        synchronized (this.field3655) {
            this.field3655.method2348(arg1, 5);
        }
        if (arg0 != 50) {
            this.method1610(-97, -100);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)Z", line = 131)
    public static final boolean method1611(byte arg0) {
        field3649++;
        if (arg0 >= -110) {
            field3643 = null;
        }
        return class502.field7371 != class108.field1683 || class42.field642 >= 2;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 152)
    public final void method1612(int arg0) {
        class364 var2 = this.field3642;
        synchronized (this.field3642) {
            this.field3642.method2349(0);
        }
        field3645++;
        class364 var3 = this.field3654;
        synchronized (this.field3654) {
            this.field3654.method2349(0);
        }
        class364 var4 = this.field3655;
        synchronized (this.field3655) {
            this.field3655.method2349(0);
            if (arg0 <= 44) {
                method1611((byte) 73);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)V", line = 177)
    public final void method1613(boolean arg0, int arg1) {
        if (arg1 != 6410) {
            return;
        }
        field3651++;
        if (this.field3638 != arg0) {
            this.field3638 = arg0;
            this.method1612(59);
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lmt;IZLhh;Lhh;)V", line = 204)
    public class253(class271 arg0, int arg1, boolean arg2, class84 arg3, class84 arg4) {
        this.field3638 = arg2;
        this.field3641 = arg4;
        this.field3653 = arg3;
        if (this.field3653 != null) {
            int var6 = this.field3653.method658((byte) -99) - 1;
            this.field3653.method656((byte) 122, var6);
        }
    }
}
