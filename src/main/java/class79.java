import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class79 {

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "Lhp;")
    private class277 field873 = new class277(128);

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "Lkea;")
    private class203 field867;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method512(boolean arg0) {
        field871++;
        if (arg0) {
            class308.method2044(class240.field3405, -7434);
            class568.field8157++;
            class468.field6960.method1205((byte) -69, 0);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IB)V", line = 21)
    public final void method513(int arg0, byte arg1) {
        field868++;
        class277 var3 = this.field873;
        synchronized (this.field873) {
            this.field873.method1811((byte) 127, arg0);
            if (arg1 != 25) {
                method512(true);
            }
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I[BII)Ljava/lang/String;", line = 34)
    public static final String method514(int arg0, byte[] arg1, int arg2, int arg3) {
        field872++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        if (arg2 != 1) {
            method518(null, true);
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg1[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class461.field6874[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(Z)V", line = 74)
    public final void method515(boolean arg0) {
        field874++;
        class277 var2 = this.field873;
        synchronized (this.field873) {
            this.field873.method1810(arg0);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)Lsca;", line = 87)
    public final class40 method516(int arg0, int arg1) {
        field875++;
        class277 var3 = this.field873;
        class40 var4;
        synchronized (this.field873) {
            var4 = (class40) this.field873.method1801(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field867;
        byte[] var6;
        synchronized (this.field867) {
            var6 = this.field867.method1286(arg0, 1, (byte) -49);
        }
        class40 var7 = new class40();
        if (var6 != null) {
            var7.method212(new class194(var6), -4129);
        }
        class277 var8 = this.field873;
        synchronized (this.field873) {
            int var9 = 86 % ((-arg1 - 62) / 61);
            this.field873.method1808((long) arg0, var7, (byte) -16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "(Z)V", line = 121)
    public final void method517(boolean arg0) {
        class277 var2 = this.field873;
        synchronized (this.field873) {
            this.field873.method1805(54);
        }
        if (!arg0) {
            this.field873 = null;
        }
        field869++;
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lcda;ILkea;)V", line = 152)
    public class79(class149 arg0, int arg1, class203 arg2) {
        this.field867 = arg2;
        this.field867.method1309(1675886592, 1);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lrt;Z)Lnd;", line = 138)
    public static final class473 method518(class194 arg0, boolean arg1) {
        field870++;
        class473 var2 = new class473();
        var2.field7003 = arg0.method1220(123);
        if (arg1) {
            return null;
        } else {
            var2.field7005 = class498.field7255.method3401(-1, var2.field7003);
            return var2;
        }
    }
}
