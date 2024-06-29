import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class409 {

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "Lmf;")
    private class382 field5971 = new class382(16);

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "Lpu;")
    private class522 field5970;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "Lam;")
    public static class585 field5972;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BI)Luca;", line = 3)
    public final class473 method2469(byte arg0, int arg1) {
        if (arg0 != 15) {
            this.field5970 = null;
        }
        field5967++;
        class382 var3 = this.field5971;
        class473 var4;
        synchronized (this.field5971) {
            var4 = (class473) this.field5971.method2287(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field5970;
        byte[] var6;
        synchronized (this.field5970) {
            var6 = this.field5970.method3007(30, arg1, 5);
        }
        class473 var7 = new class473();
        if (var6 != null) {
            var7.method2778((byte) -57, new class695(var6));
        }
        class382 var8 = this.field5971;
        synchronized (this.field5971) {
            this.field5971.method2291(var7, (long) arg1, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V", line = 33)
    public final void method2470(byte arg0) {
        class382 var2 = this.field5971;
        synchronized (this.field5971) {
            this.field5971.method2279(0);
            if (arg0 != -87) {
                this.field5971 = null;
            }
        }
        field5965++;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 47)
    public static void method2471(int arg0) {
        field5972 = null;
        if (arg0 < 10) {
            field5972 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lha;III[Z)Z", line = 60)
    public static final boolean method2472(class54 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class499.field7071 != class296.field4340) {
            int var6 = class420.field6108[arg1].method442(arg2, true, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class37 var8 = class420.field6108[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method442(arg2, true, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method430(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method446(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILjava/lang/String;)V", line = 96)
    public static final void method2473(int arg0, int arg1, String arg2) {
        field5968++;
        if (arg0 == 0) {
            class191 var3 = class6.method38(2, -123, arg1);
            var3.method1285((byte) -1);
            var3.field2752 = arg2;
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)V", line = 111)
    public final void method2474(byte arg0) {
        class382 var2 = this.field5971;
        synchronized (this.field5971) {
            this.field5971.method2285((byte) -125);
            if (arg0 <= 6) {
                this.method2469((byte) 85, -51);
            }
        }
        field5969++;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IB)V", line = 126)
    public final void method2475(int arg0, byte arg1) {
        if (arg1 <= 113) {
            return;
        }
        class382 var3 = this.field5971;
        synchronized (this.field5971) {
            this.field5971.method2290(false, arg0);
        }
        field5966++;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lkr;ILpu;)V", line = 147)
    public class409(class693 arg0, int arg1, class522 arg2) {
        this.field5970 = arg2;
        this.field5970.method2988(73, 30);
    }
}
