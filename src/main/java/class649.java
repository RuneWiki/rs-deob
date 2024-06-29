import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class649 {

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "Lpa;")
    private class387 field9131 = new class387(128);

    @OriginalMember(owner = "client!lha", name = "o", descriptor = "Lpa;")
    public class387 field9144 = new class387(64);

    @OriginalMember(owner = "client!lha", name = "l", descriptor = "Lcb;")
    public class544 field9141;

    @OriginalMember(owner = "client!lha", name = "f", descriptor = "Lcb;")
    private class544 field9135;

    @OriginalMember(owner = "client!lha", name = "g", descriptor = "Ljava/lang/String;")
    public static String field9136 = null;

    @OriginalMember(owner = "client!lha", name = "e", descriptor = "Ltga;")
    public static class64 field9134 = new class64(16);

    @OriginalMember(owner = "client!lha", name = "n", descriptor = "Ljo;")
    public static class351 field9143 = new class351(44, 3);

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!lha", name = "d", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!lha", name = "h", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!lha", name = "i", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!lha", name = "j", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!lha", name = "k", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!lha", name = "m", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(BII)V")
    public final void method3705(byte arg0, int arg1, int arg2) {
        this.field9131 = new class387(arg1);
        if (arg0 != -25) {
            this.field9135 = null;
        }
        field9142++;
        this.field9144 = new class387(arg2);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(B)V")
    public final void method3706(byte arg0) {
        class387 var2 = this.field9131;
        synchronized (this.field9131) {
            this.field9131.method2364(arg0 + 47);
        }
        if (arg0 != -46) {
            field9136 = null;
        }
        field9140++;
        class387 var3 = this.field9144;
        synchronized (this.field9144) {
            this.field9144.method2364(1);
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V")
    public static void method3707(int arg0) {
        if (arg0 == 128) {
            field9143 = null;
            field9134 = null;
            field9136 = null;
        }
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)V")
    public final void method3708(int arg0) {
        class387 var2 = this.field9131;
        synchronized (this.field9131) {
            this.field9131.method2369(-1);
        }
        field9130++;
        if (arg0 < 57) {
            this.field9141 = null;
        }
        class387 var3 = this.field9144;
        synchronized (this.field9144) {
            this.field9144.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lsu;Lsu;I)V")
    public static final void method3709(class219 arg0, class219 arg1, int arg2) {
        if (arg1.field3125 != null) {
            arg1.method1512(false);
        }
        if (arg2 != -28407) {
            return;
        }
        field9139++;
        arg1.field3125 = arg0;
        arg1.field3126 = arg0.field3126;
        arg1.field3125.field3126 = arg1;
        arg1.field3126.field3125 = arg1;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IBI)V")
    public static final void method3710(int arg0, byte arg1, int arg2) {
        field9138++;
        if (arg1 != 63) {
            field9134 = null;
        }
        class678 var3 = class630.method3597(29636, 18, (long) arg2 | (long) arg0 << 32);
        var3.method3836((byte) -36);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(BI)Lor;")
    public final class665 method3711(byte arg0, int arg1) {
        field9132++;
        class387 var3 = this.field9131;
        class665 var4;
        synchronized (this.field9131) {
            var4 = (class665) this.field9131.method2373((long) arg1, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field9135;
        byte[] var6;
        synchronized (this.field9135) {
            var6 = this.field9135.method3150(arg1, -100, 36);
        }
        class665 var7 = new class665();
        var7.field9371 = arg1;
        int var8 = -66 % ((arg0 + 6) / 54);
        var7.field9366 = this;
        if (var6 != null) {
            var7.method3787(new class120(var6), (byte) 33);
        }
        var7.method3792(3466);
        class387 var9 = this.field9131;
        synchronized (this.field9131) {
            this.field9131.method2362(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(BI)V")
    public final void method3712(byte arg0, int arg1) {
        field9133++;
        class387 var3 = this.field9131;
        synchronized (this.field9131) {
            this.field9131.method2366(arg1, 119);
            if (arg0 <= 8) {
                field9134 = null;
            }
        }
        class387 var4 = this.field9144;
        synchronized (this.field9144) {
            this.field9144.method2366(arg1, 105);
        }
    }

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Liv;ILcb;Lcb;)V")
    public class649(class106 arg0, int arg1, class544 arg2, class544 arg3) {
        this.field9141 = arg3;
        this.field9135 = arg2;
        this.field9135.method3147(36, -103);
    }
}
