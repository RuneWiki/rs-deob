import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class49 {

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "Lvv;")
    private class343 field624 = new class343();

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Ljava/lang/String;")
    public String field618;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    private volatile int field625;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "Lfl;")
    private class770 field626;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gs", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field627;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method352(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)Lea;", line = 6)
    public final class571 method345(boolean arg0) {
        field623++;
        if (!arg0) {
            return null;
        }
        Object var2 = null;
        class343 var3 = this.field624;
        synchronized (this.field624) {
            class571 var4 = this.field624.method2170(false);
            var4.method3358(126);
            this.field625--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLje;)V", line = 25)
    public final void method346(byte arg0, class421 arg1) {
        field620++;
        arg1.field5751 = true;
        class343 var3 = this.field624;
        synchronized (this.field624) {
            this.field624.method2173(-32, arg1);
            if (arg0 != 39) {
                this.method351(7, null);
            }
            this.field625++;
        }
        if (this.field626 != null) {
            class770 var4 = this.field626;
            synchronized (this.field626) {
                this.field626.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZLje;)V", line = 48)
    public final void method347(boolean arg0, class421 arg1) {
        arg1.field5751 = arg0;
        field616++;
        class343 var3 = this.field624;
        synchronized (this.field624) {
            this.field624.method2173(-36, arg1);
            this.field625++;
        }
        if (this.field626 != null) {
            class770 var4 = this.field626;
            synchronized (this.field626) {
                this.field626.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Z", line = 68)
    public final boolean method348(int arg0) {
        field621++;
        int var2 = 85 / ((8 - arg0) / 52);
        return this.field625 == 0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLcga;)V", line = 84)
    public static final void method349(byte arg0, class506 arg1) {
        field622++;
        if (class767.field10562 == null) {
            return;
        }
        class484 var2 = null;
        if (arg1.field7200 == 0) {
            var2 = (class484) class335.method2132(arg1.field7201, arg1.field7189, arg1.field7192);
        }
        if (arg1.field7200 == 1) {
            var2 = (class484) class26.method241(arg1.field7201, arg1.field7189, arg1.field7192);
        }
        int var3 = 71 % ((arg0 + 7) / 61);
        if (arg1.field7200 == 2) {
            var2 = (class484) class537.method3227(arg1.field7201, arg1.field7189, arg1.field7192, field627 == null ? (field627 = method352("nq")) : field627);
        }
        if (arg1.field7200 == 3) {
            var2 = (class484) class266.method1725(arg1.field7201, arg1.field7189, arg1.field7192);
        }
        if (var2 == null) {
            arg1.field7187 = 0;
            arg1.field7188 = 0;
            arg1.field7198 = -1;
        } else {
            arg1.field7198 = var2.method1483(24853);
            arg1.field7188 = var2.method1482(true);
            arg1.field7187 = var2.method1478((byte) 114);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLhk;)V", line = 127)
    public final void method350(byte arg0, class109 arg1) {
        field619++;
        if (arg0 != 43) {
            this.method348(70);
        }
        class343 var3 = this.field624;
        synchronized (this.field624) {
            this.field624.method2173(77, arg1);
            this.field625++;
        }
        if (this.field626 != null) {
            class770 var4 = this.field626;
            synchronized (this.field626) {
                this.field626.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 165)
    public class49(String arg0) {
        this.field618 = arg0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILfl;)V", line = 152)
    public final void method351(int arg0, class770 arg1) {
        field617++;
        this.field626 = arg1;
        if (arg0 != 0) {
            this.method347(true, null);
        }
    }
}
