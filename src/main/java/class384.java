import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class384 {

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "Lme;")
    private class668 field4906 = new class668(64);

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "Lpe;")
    private class615 field4907;

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "Lnj;")
    public static class415 field4911 = new class415(44, 8);

    @OriginalMember(owner = "client!cga", name = "k", descriptor = "Lki;")
    public static class364 field4912 = new class364();

    @OriginalMember(owner = "client!cga", name = "l", descriptor = "Lfs;")
    public static class546 field4913 = new class546("WTI", 5);

    @OriginalMember(owner = "client!cga", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4915 = null;

    @OriginalMember(owner = "client!cga", name = "o", descriptor = "I")
    public static int field4916 = -1;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!cga", name = "m", descriptor = "[Ltc;")
    public static class477[] field4914;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method2182(boolean arg0, int arg1) {
        class668 var3 = this.field4906;
        synchronized (this.field4906) {
            if (arg0) {
                return;
            }
            this.field4906.method3659(-117, arg1);
        }
        field4903++;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)Lida;", line = 20)
    public final class608 method2183(int arg0, int arg1) {
        field4902++;
        class668 var3 = this.field4906;
        class608 var4;
        synchronized (this.field4906) {
            var4 = (class608) this.field4906.method3655(24, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field4907;
        byte[] var6;
        synchronized (this.field4907) {
            var6 = this.field4907.method3346(-1, class51.method458(-93, arg0), class536.method2852(10002, arg0));
        }
        class608 var7 = new class608();
        if (arg1 > -39) {
            this.method2188(false, 86);
        }
        if (var6 != null) {
            var7.method3307(false, new class418(var6));
        }
        class668 var8 = this.field4906;
        synchronized (this.field4906) {
            this.field4906.method3650((long) arg0, -108, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V", line = 51)
    public static void method2184(int arg0) {
        field4914 = null;
        if (arg0 >= -42) {
            method2184(50);
        }
        field4913 = null;
        field4915 = null;
        field4911 = null;
        field4912 = null;
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)V", line = 68)
    public final void method2185(int arg0) {
        class668 var2 = this.field4906;
        synchronized (this.field4906) {
            this.field4906.method3656((byte) 0);
        }
        field4910++;
        if (arg0 != -1) {
            this.field4906 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "(I)V", line = 83)
    public final void method2186(int arg0) {
        class668 var2 = this.field4906;
        synchronized (this.field4906) {
            if (arg0 != -1) {
                method2184(7);
            }
            this.field4906.method3658(0);
        }
        field4909++;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZ)V", line = 96)
    public static final void method2187(int arg0, boolean arg1) {
        class668 var2 = class369.field4757;
        synchronized (class369.field4757) {
            if (!arg1) {
                method2184(-120);
            }
            class369.field4757.method3659(-105, arg0);
        }
        field4905++;
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(ZI)V", line = 112)
    public final void method2188(boolean arg0, int arg1) {
        class668 var3 = this.field4906;
        synchronized (this.field4906) {
            this.field4906.method3656((byte) 0);
            this.field4906 = new class668(arg1);
            if (!arg0) {
                this.field4906 = null;
            }
        }
        field4904++;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 126)
    public static final void method2189(String arg0, int arg1, boolean arg2) {
        field4908++;
        if (arg2) {
            method2187(100, true);
        }
        class367 var3 = class573.method3057(3, arg1, 2);
        var3.method2115(1);
        var3.field4739 = arg0;
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lvd;ILpe;)V", line = 148)
    public class384(class635 arg0, int arg1, class615 arg2) {
        this.field4907 = arg2;
        if (this.field4907 != null) {
            int var4 = this.field4907.method3366(-100) - 1;
            this.field4907.method3341(var4, -19046);
        }
    }
}
