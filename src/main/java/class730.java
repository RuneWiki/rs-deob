import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class730 {

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "Ljt;")
    private class106 field10221 = new class106(64);

    @OriginalMember(owner = "client!sha", name = "h", descriptor = "Ljt;")
    public class106 field10228 = new class106(64);

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "Lvd;")
    private class39 field10225;

    @OriginalMember(owner = "client!sha", name = "f", descriptor = "Lvd;")
    public class39 field10226;

    @OriginalMember(owner = "client!sha", name = "j", descriptor = "Lbh;")
    public static class37 field10230 = new class37("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!sha", name = "l", descriptor = "I")
    public static int field10232 = 0;

    @OriginalMember(owner = "client!sha", name = "k", descriptor = "I")
    public static int field10231 = 0;

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "I")
    public static int field10222;

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
    public static int field10223;

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "I")
    public static int field10224;

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "I")
    public static int field10227;

    @OriginalMember(owner = "client!sha", name = "i", descriptor = "I")
    public static int field10229;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V")
    public final void method4119(int arg0) {
        field10227++;
        if (arg0 != 34) {
            method4121((byte) -44);
        }
        class106 var2 = this.field10221;
        synchronized (this.field10221) {
            this.field10221.method800(arg0 + 89);
        }
        class106 var3 = this.field10228;
        synchronized (this.field10228) {
            this.field10228.method800(arg0 ^ 0x6D);
        }
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)V")
    public final void method4120(int arg0) {
        class106 var2 = this.field10221;
        synchronized (this.field10221) {
            this.field10221.method809(true);
        }
        if (arg0 != 16729) {
            this.method4124(false, 29);
        }
        field10222++;
        class106 var3 = this.field10228;
        synchronized (this.field10228) {
            this.field10228.method809(true);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)V")
    public static void method4121(byte arg0) {
        if (arg0 == 92) {
            field10230 = null;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IB)Lor;")
    public final class643 method4122(int arg0, byte arg1) {
        field10223++;
        int var3 = -104 % ((-arg1 - 49) / 60);
        class106 var4 = this.field10221;
        class643 var5;
        synchronized (this.field10221) {
            var5 = (class643) this.field10221.method803(107, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class39 var6 = this.field10225;
        byte[] var7;
        synchronized (this.field10225) {
            var7 = this.field10225.method211(true, 34, arg0);
        }
        class643 var8 = new class643();
        var8.field9021 = this;
        if (var7 != null) {
            var8.method3687(3, new class645(var7));
        }
        class106 var9 = this.field10221;
        synchronized (this.field10221) {
            this.field10221.method801(1, var8, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(III)V")
    public final void method4123(int arg0, int arg1, int arg2) {
        field10229++;
        this.field10221 = new class106(arg2);
        this.field10228 = new class106(arg1);
        if (arg0 != -27393) {
            this.field10226 = null;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZI)V")
    public final void method4124(boolean arg0, int arg1) {
        class106 var3 = this.field10221;
        synchronized (this.field10221) {
            this.field10221.method807(arg1, -1);
            if (!arg0) {
                this.field10226 = null;
            }
        }
        field10224++;
        class106 var4 = this.field10228;
        synchronized (this.field10228) {
            this.field10228.method807(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lqg;ILvd;Lvd;)V")
    public class730(class464 arg0, int arg1, class39 arg2, class39 arg3) {
        this.field10225 = arg2;
        this.field10226 = arg3;
        this.field10225.method229(34, 0);
    }
}
