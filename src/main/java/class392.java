import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class392 {

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "Lbh;")
    private class538 field5457 = new class538(64);

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "Lwu;")
    private class557 field5464;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "I")
    public static int field5462 = 0;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5460 = "";

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method2383(int arg0, int arg1) {
        if (arg0 == 0) {
            field5463++;
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V", line = 14)
    public final void method2384(int arg0) {
        if (arg0 != -11574) {
            field5462 = 7;
        }
        field5454++;
        class538 var2 = this.field5457;
        synchronized (this.field5457) {
            this.field5457.method3210(false);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V", line = 32)
    public static void method2385(byte arg0) {
        field5460 = null;
        if (arg0 <= 124) {
            field5459 = 18;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(II)V", line = 43)
    public final void method2386(int arg0, int arg1) {
        field5456++;
        if (arg0 != -1) {
            field5460 = null;
        }
        class538 var3 = this.field5457;
        synchronized (this.field5457) {
            this.field5457.method3204((byte) -79, arg1);
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)V", line = 57)
    public final void method2387(int arg0) {
        if (arg0 != 0) {
            field5460 = null;
        }
        field5461++;
        class538 var2 = this.field5457;
        synchronized (this.field5457) {
            this.field5457.method3202((byte) 127);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)V", line = 73)
    public static final void method2388(int arg0, int arg1, int arg2) {
        boolean var3 = class352.field4549[0][arg1][arg2] != null && class352.field4549[0][arg1][arg2].field531 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class352.field4549[var4][arg1][arg2] == null) {
                class38 var5 = class352.field4549[var4][arg1][arg2] = new class38(var4);
                if (var3) {
                    var5.field535++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lpaa;I)Ljava/lang/String;", line = 97)
    public static final String method2389(class712 arg0, int arg1) {
        if (arg1 != 15269) {
            field5460 = null;
        }
        field5455++;
        if (client.method2675(arg0).method647((byte) -125) == 0) {
            return null;
        } else if (arg0.field10074 == null || arg0.field10074.trim().length() == 0) {
            return class399.field5526 ? "Hidden-use" : null;
        } else {
            return arg0.field10074;
        }
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(II)Lnp;", line = 131)
    public final class752 method2390(int arg0, int arg1) {
        field5458++;
        class538 var3 = this.field5457;
        class752 var4;
        synchronized (this.field5457) {
            var4 = (class752) this.field5457.method3200((long) arg1, arg0 ^ 0xFFFFB1F0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 1) {
            field5459 = -86;
        }
        class557 var5 = this.field5464;
        byte[] var6;
        synchronized (this.field5464) {
            var6 = this.field5464.method3322(11, arg1, (byte) 117);
        }
        class752 var7 = new class752();
        if (var6 != null) {
            var7.method4168(new class26(var6), (byte) -78);
        }
        class538 var8 = this.field5457;
        synchronized (this.field5457) {
            this.field5457.method3199((byte) 78, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lwj;ILwu;)V", line = 163)
    public class392(class121 arg0, int arg1, class557 arg2) {
        this.field5464 = arg2;
        if (this.field5464 != null) {
            this.field5464.method3333(11, 3443);
        }
    }
}
