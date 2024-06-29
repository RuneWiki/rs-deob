import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class637 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lbh;")
    private class538 field9050 = new class538(64);

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lwu;")
    private class557 field9053;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public int field9048;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field9058;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lcha;")
    public static class279 field9059;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method3701(int arg0) {
        class422.method2575(255, -1, (byte) -95);
        field9051++;
        if (arg0 != -4198) {
            field9059 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(JJ)J")
    public static long method3702(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public final void method3703(int arg0) {
        int var2 = 99 % ((56 - arg0) / 33);
        field9049++;
        class538 var3 = this.field9050;
        synchronized (this.field9050) {
            this.field9050.method3202((byte) 127);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method3704(byte arg0) {
        field9059 = null;
        int var1 = -44 % ((-arg0 - 7) / 38);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
    public final void method3705(int arg0, int arg1) {
        class538 var3 = this.field9050;
        synchronized (this.field9050) {
            this.field9050.method3204((byte) -71, arg1);
            if (arg0 != -642) {
                this.method3707(false);
            }
        }
        field9055++;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)Lrc;")
    public final class54 method3706(int arg0, int arg1) {
        field9056++;
        class538 var3 = this.field9050;
        class54 var4;
        synchronized (this.field9050) {
            var4 = (class54) this.field9050.method3200((long) arg1, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field9053;
        byte[] var6;
        synchronized (this.field9053) {
            var6 = this.field9053.method3322(16, arg1, (byte) 120);
        }
        class54 var7 = new class54();
        if (var6 != null) {
            var7.method362((byte) 120, new class26(var6));
        }
        if (arg0 <= 94) {
            this.method3703(-103);
        }
        class538 var8 = this.field9050;
        synchronized (this.field9050) {
            this.field9050.method3199((byte) 78, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lwj;ILwu;)V")
    public class637(class121 arg0, int arg1, class557 arg2) {
        this.field9053 = arg2;
        if (this.field9053 == null) {
            this.field9048 = 0;
        } else {
            this.field9048 = this.field9053.method3333(16, 3443);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public final void method3707(boolean arg0) {
        field9058++;
        class538 var2 = this.field9050;
        synchronized (this.field9050) {
            this.field9050.method3210(!arg0);
            if (!arg0) {
                this.field9050 = null;
            }
        }
    }
}
