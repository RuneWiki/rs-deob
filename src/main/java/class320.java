import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class320 {

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "Ljo;")
    private class382 field4926 = new class382(128);

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "Lok;")
    private class74 field4930;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "Lwt;")
    public static class17 field4935;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "[I")
    public static int[] field4934;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "[Ll;")
    public static class127[] field4929;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "[Ll;")
    public static class127[] field4932;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V", line = 11)
    public final void method2000(byte arg0) {
        class382 var2 = this.field4926;
        synchronized (this.field4926) {
            this.field4926.method2287(arg0 ^ 0x5);
        }
        field4928++;
        if (arg0 != 89) {
            this.method2000((byte) 90);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)Lkm;", line = 24)
    public final class95 method2001(boolean arg0, int arg1) {
        field4936++;
        class382 var3 = this.field4926;
        class95 var4;
        synchronized (this.field4926) {
            var4 = (class95) this.field4926.method2288((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field4930;
        byte[] var6;
        synchronized (this.field4930) {
            var6 = this.field4930.method541(arg1, 1, (byte) -122);
        }
        class95 var7 = new class95();
        if (!arg0) {
            field4932 = null;
        }
        if (var6 != null) {
            var7.method746(true, new class468(var6));
        }
        class382 var8 = this.field4926;
        synchronized (this.field4926) {
            this.field4926.method2290((long) arg1, var7, 100);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILgo;)Lgo;", line = 58)
    public static final class310 method2002(int arg0, class310 arg1) {
        field4927++;
        class310 var2 = client.method3052(arg1);
        if (arg0 != 128) {
            method2002(76, null);
        }
        if (var2 == null) {
            var2 = arg1.field4696;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V", line = 76)
    public final void method2003(byte arg0) {
        class382 var2 = this.field4926;
        synchronized (this.field4926) {
            this.field4926.method2293(false);
            int var3 = 87 / ((arg0 + 15) / 59);
        }
        field4931++;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI)V", line = 92)
    public final void method2004(byte arg0, int arg1) {
        field4933++;
        class382 var3 = this.field4926;
        synchronized (this.field4926) {
            this.field4926.method2294(arg1, true);
            if (arg0 != -109) {
                this.method2000((byte) -44);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lkr;ILok;)V", line = 107)
    public class320(class262 arg0, int arg1, class74 arg2) {
        this.field4930 = arg2;
        this.field4930.method536(false, 1);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V", line = 122)
    public static void method2005(boolean arg0) {
        field4932 = null;
        field4929 = null;
        field4935 = null;
        field4934 = null;
        if (!arg0) {
            field4929 = null;
        }
    }
}
