import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class351 {

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Z")
    public boolean field5088 = false;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Ldc;")
    private class5 field5097 = new class5(64);

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "Ldc;")
    public class5 field5099 = new class5(500);

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "Ldc;")
    public class5 field5101 = new class5(30);

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "Ldc;")
    public class5 field5103 = new class5(50);

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Lhe;")
    private class239 field5095;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "Z")
    public boolean field5091;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Lhe;")
    public class239 field5093;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public int field5104;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public final void method2129(int arg0) {
        class5 var2 = this.field5097;
        synchronized (this.field5097) {
            this.field5097.method35((byte) -1);
        }
        field5086++;
        class5 var3 = this.field5099;
        synchronized (this.field5099) {
            this.field5099.method35((byte) -1);
        }
        class5 var4 = this.field5101;
        synchronized (this.field5101) {
            this.field5101.method35((byte) -1);
        }
        if (arg0 != -3621) {
            this.field5099 = null;
        }
        class5 var5 = this.field5103;
        synchronized (this.field5103) {
            this.field5103.method35((byte) -1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
    public final void method2130(int arg0, int arg1) {
        if (arg0 != -10668) {
            this.method2134(-19, 10);
        }
        field5090++;
        this.field5097 = new class5(arg1);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V")
    public final void method2131(int arg0, int arg1) {
        class5 var3 = this.field5097;
        synchronized (this.field5097) {
            this.field5097.method39(false, arg1);
        }
        field5089++;
        class5 var4 = this.field5099;
        synchronized (this.field5099) {
            if (arg0 <= 27) {
                this.field5095 = null;
            }
            this.field5099.method39(false, arg1);
        }
        class5 var5 = this.field5101;
        synchronized (this.field5101) {
            this.field5101.method39(false, arg1);
        }
        class5 var6 = this.field5103;
        synchronized (this.field5103) {
            this.field5103.method39(false, arg1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)Lhn;")
    public final class486 method2132(byte arg0, int arg1) {
        field5094++;
        class5 var3 = this.field5097;
        class486 var4;
        synchronized (this.field5097) {
            var4 = (class486) this.field5097.method40(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5095.method1470(4, class361.method2202(0, arg1), class148.method915(arg1, (byte) 124));
        class486 var6 = new class486();
        var6.field7046 = arg1;
        var6.field7058 = this;
        if (var5 != null) {
            var6.method2847((byte) -21, new class156(var5));
        }
        var6.method2844(5);
        if (!this.field5091 && var6.field7055) {
            var6.field7077 = null;
            var6.field7076 = null;
        }
        if (arg0 <= 118) {
            this.method2133(58, false);
        }
        if (var6.field7026) {
            var6.field7074 = 0;
            var6.field7093 = false;
        }
        class5 var7 = this.field5097;
        synchronized (this.field5097) {
            this.field5097.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V")
    public final void method2133(int arg0, boolean arg1) {
        field5087++;
        if (arg0 != 64) {
            this.method2129(75);
        }
        if (arg1 != this.field5091) {
            this.field5091 = arg1;
            this.method2136(30);
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)V")
    public final void method2134(int arg0, int arg1) {
        this.field5104 = arg1;
        field5102++;
        class5 var3 = this.field5099;
        synchronized (this.field5099) {
            this.field5099.method38((byte) -31);
        }
        class5 var4 = this.field5101;
        synchronized (this.field5101) {
            this.field5101.method38((byte) -39);
        }
        if (arg0 == 500) {
            class5 var5 = this.field5103;
            synchronized (this.field5103) {
                this.field5103.method38((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V")
    public final void method2135(boolean arg0, int arg1) {
        int var3 = 15 / ((arg1 - 51) / 42);
        field5092++;
        if (arg0 != this.field5088) {
            this.field5088 = arg0;
            this.method2136(30);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public final void method2136(int arg0) {
        field5096++;
        if (arg0 != 30) {
            this.field5093 = null;
        }
        class5 var2 = this.field5097;
        synchronized (this.field5097) {
            this.field5097.method38((byte) -102);
        }
        class5 var3 = this.field5099;
        synchronized (this.field5099) {
            this.field5099.method38((byte) -41);
        }
        class5 var4 = this.field5101;
        synchronized (this.field5101) {
            this.field5101.method38((byte) -45);
        }
        class5 var5 = this.field5103;
        synchronized (this.field5103) {
            this.field5103.method38((byte) -48);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lci;IZLhe;Lhe;)V")
    public class351(class298 arg0, int arg1, boolean arg2, class239 arg3, class239 arg4) {
        this.field5095 = arg3;
        this.field5091 = arg2;
        this.field5093 = arg4;
        if (this.field5095 != null) {
            int var6 = this.field5095.method1466(false) - 1;
            this.field5095.method1473(4309, var6);
        }
    }

    static {
        new class194(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field5098 = 1;
    }
}
