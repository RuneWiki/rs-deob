import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class86 {

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "Loo;")
    private class652 field948 = new class652(64);

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "Loo;")
    private class652 field957 = new class652(100);

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "Lwia;")
    private class791 field951;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field950 = 0;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BI)Lak;")
    public final class369 method648(byte arg0, int arg1) {
        field947++;
        class652 var3 = this.field957;
        synchronized (this.field957) {
            class369 var4 = (class369) this.field957.method3742((byte) 67, (long) arg1);
            if (var4 == null) {
                var4 = new class369(arg1);
                this.field957.method3739((long) arg1, (byte) 32, var4);
            }
            if (var4.method2302(-6378)) {
                if (arg0 <= 31) {
                    this.field951 = null;
                }
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V")
    public final void method649(int arg0, int arg1) {
        if (arg1 >= -44) {
            field950 = -81;
        }
        field953++;
        class652 var3 = this.field948;
        synchronized (this.field948) {
            this.field948.method3741(arg0, 0);
        }
        class652 var4 = this.field957;
        synchronized (this.field957) {
            this.field957.method3741(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
    public final void method650(int arg0) {
        field954++;
        if (arg0 != 2) {
            this.field951 = null;
        }
        class652 var2 = this.field948;
        synchronized (this.field948) {
            this.field948.method3743(arg0 ^ 0xA);
        }
        class652 var3 = this.field957;
        synchronized (this.field957) {
            this.field957.method3743(8);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB)Lpf;")
    public final class607 method651(int arg0, byte arg1) {
        field955++;
        class652 var3 = this.field948;
        class607 var4;
        synchronized (this.field948) {
            if (arg1 < 89) {
                this.method648((byte) 127, -122);
            }
            var4 = (class607) this.field948.method3742((byte) 67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field951;
        byte[] var6;
        synchronized (this.field951) {
            var6 = this.field951.method4339(class96.method699((byte) 120, arg0), 0, class363.method2279(arg0, 87));
        }
        class607 var7 = new class607();
        var7.field8512 = arg0;
        var7.field8493 = this;
        if (var6 != null) {
            var7.method3525(-1, new class494(var6));
        }
        var7.method3527(true);
        class652 var8 = this.field948;
        synchronized (this.field948) {
            this.field948.method3739((long) arg0, (byte) 27, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZII)Lmaa;")
    public static final class495 method652(boolean arg0, int arg1, int arg2) {
        field952++;
        if (arg1 != 0) {
            field949 = 73;
        }
        class343[] var3 = class418.field5724;
        synchronized (class418.field5724) {
            class495 var4;
            if (class418.field5724.length <= arg2 || class418.field5724[arg2].method2168((byte) 88)) {
                var4 = new class495();
                var4.field7067 = new class711[arg2];
                for (int var5 = 0; var5 < arg2; var5++) {
                    var4.field7067[var5] = new class711();
                }
            } else {
                var4 = (class495) class418.field5724[arg2].method2175(0);
                var4.method3358(arg1 ^ 0xFFFFFFA8);
                int var10002 = class40.field528[arg2]--;
            }
            var4.field7062 = arg0;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
    public final void method653(int arg0) {
        if (arg0 != 1963) {
            this.field948 = null;
        }
        field956++;
        class652 var2 = this.field948;
        synchronized (this.field948) {
            this.field948.method3735(2);
        }
        class652 var3 = this.field957;
        synchronized (this.field957) {
            this.field957.method3735(2);
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Ldt;ILwia;Lwia;Lwia;)V")
    public class86(class252 arg0, int arg1, class791 arg2, class791 arg3, class791 arg4) {
        this.field951 = arg2;
        if (this.field951 != null) {
            int var6 = this.field951.method4332((byte) 127) - 1;
            this.field951.method4353(var6, true);
        }
        class649.method3717(arg4, (byte) -113, 2, arg3);
    }
}
