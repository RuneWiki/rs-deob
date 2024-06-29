import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class711 {

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "Z")
    public boolean field10011 = false;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "Lof;")
    private class620 field10012 = new class620(64);

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "Lof;")
    public class620 field10020 = new class620(500);

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "Lof;")
    public class620 field10021 = new class620(30);

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "Lof;")
    public class620 field10022 = new class620(50);

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "Z")
    public boolean field10018;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "Loh;")
    public class404 field10004;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "Loh;")
    private class404 field10005;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field10006;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field10008;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    public static int field10009;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
    public static int field10013;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    public static int field10015;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    public static int field10016;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    public static int field10019;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    public int field10023;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "Loh;")
    public static class404 field10010;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method3971(boolean arg0, int arg1) {
        field10006++;
        if (arg1 != 50) {
            method3976(-24, 89, 38);
        }
        if (arg0 != this.field10018) {
            this.field10018 = arg0;
            this.method3974(-124);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BI)Lvc;", line = 21)
    public final class316 method3972(byte arg0, int arg1) {
        field10014++;
        class620 var3 = this.field10012;
        class316 var4;
        synchronized (this.field10012) {
            var4 = (class316) this.field10012.method3538((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field10005;
        byte[] var6;
        synchronized (this.field10005) {
            var6 = this.field10005.method2481(class232.method1345(arg1, false), class85.method597(arg1, 255), (byte) 102);
        }
        class316 var7 = new class316();
        var7.field3962 = arg1;
        var7.field4023 = this;
        if (var6 != null) {
            var7.method1884(-3, new class244(var6));
        }
        var7.method1900((byte) 94);
        if (var7.field4030) {
            var7.field3964 = false;
            var7.field4046 = 0;
        }
        if (arg0 <= 97) {
            this.field10023 = -78;
        }
        if (!this.field10018 && var7.field3959) {
            var7.field4040 = null;
            var7.field4013 = null;
        }
        class620 var8 = this.field10012;
        synchronized (this.field10012) {
            this.field10012.method3537(101, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZ)V", line = 72)
    public final void method3973(int arg0, boolean arg1) {
        field10009++;
        if (this.field10011 != arg1) {
            this.field10011 = arg1;
            if (arg0 >= 44) {
                this.method3974(37);
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 87)
    public final void method3974(int arg0) {
        class620 var2 = this.field10012;
        synchronized (this.field10012) {
            this.field10012.method3549(0);
        }
        int var3 = -2 % ((arg0 + 60) / 40);
        field10007++;
        class620 var4 = this.field10020;
        synchronized (this.field10020) {
            this.field10020.method3549(0);
        }
        class620 var5 = this.field10021;
        synchronized (this.field10021) {
            this.field10021.method3549(0);
        }
        class620 var6 = this.field10022;
        synchronized (this.field10022) {
            this.field10022.method3549(0);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)V", line = 111)
    public final void method3975(int arg0, int arg1) {
        field10015++;
        this.field10023 = arg1;
        class620 var3 = this.field10020;
        synchronized (this.field10020) {
            if (arg0 < 47) {
                this.field10005 = null;
            }
            this.field10020.method3549(0);
        }
        class620 var4 = this.field10021;
        synchronized (this.field10021) {
            this.field10021.method3549(0);
        }
        class620 var5 = this.field10022;
        synchronized (this.field10022) {
            this.field10022.method3549(0);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Laha;", line = 137)
    public static final class380 method3976(int arg0, int arg1, int arg2) {
        class691 var3 = class638.field9170[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class380 var4 = var3.field9733;
            var3.field9733 = null;
            class334.method1997(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)V", line = 148)
    public final void method3977(int arg0, int arg1) {
        if (arg0 == 30) {
            this.field10012 = new class620(arg1);
            field10019++;
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V", line = 161)
    public static void method3978(int arg0) {
        field10010 = null;
        if (arg0 != 8037) {
            field10016 = 33;
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lnb;IZLoh;Loh;)V", line = 238)
    public class711(class301 arg0, int arg1, boolean arg2, class404 arg3, class404 arg4) {
        this.field10018 = arg2;
        this.field10004 = arg4;
        this.field10005 = arg3;
        if (this.field10005 != null) {
            int var6 = this.field10005.method2478((byte) -96) - 1;
            this.field10005.method2482(0, var6);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V", line = 177)
    public final void method3979(byte arg0) {
        class620 var2 = this.field10012;
        synchronized (this.field10012) {
            this.field10012.method3541(-647);
        }
        field10008++;
        class620 var3 = this.field10020;
        synchronized (this.field10020) {
            this.field10020.method3541(-647);
        }
        if (arg0 <= 39) {
            this.field10011 = true;
        }
        class620 var4 = this.field10021;
        synchronized (this.field10021) {
            this.field10021.method3541(-647);
        }
        class620 var5 = this.field10022;
        synchronized (this.field10022) {
            this.field10022.method3541(-647);
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(IZ)V", line = 200)
    public final void method3980(int arg0, boolean arg1) {
        if (!arg1) {
            this.field10004 = null;
        }
        class620 var3 = this.field10012;
        synchronized (this.field10012) {
            this.field10012.method3539((byte) 114, arg0);
        }
        field10013++;
        class620 var4 = this.field10020;
        synchronized (this.field10020) {
            this.field10020.method3539((byte) 125, arg0);
        }
        class620 var5 = this.field10021;
        synchronized (this.field10021) {
            this.field10021.method3539((byte) 116, arg0);
        }
        class620 var6 = this.field10022;
        synchronized (this.field10022) {
            this.field10022.method3539((byte) 122, arg0);
        }
    }
}
