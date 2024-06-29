import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class65 {

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "Lgw;")
    private class690 field1008 = new class690(64);

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "Luu;")
    private class237 field1017;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "[I")
    public static int[] field1014 = new int[4096];

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "Lkr;")
    public static class602 field1011 = new class602(3, 4);

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "Lkr;")
    public static class602 field1020 = new class602(64, 2);

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)V", line = 6)
    public final void method522(boolean arg0) {
        class690 var2 = this.field1008;
        synchronized (this.field1008) {
            this.field1008.method3902(0);
        }
        if (!arg0) {
            field1015++;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZII)Z", line = 19)
    public static final boolean method523(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method523(true, 99, -36);
        }
        field1019++;
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)Ldga;", line = 31)
    public static final class479 method524(int arg0, int arg1) {
        int var2 = 45 / ((arg0 - 28) / 39);
        field1009++;
        return new class479(arg1, false);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZI)Laja;", line = 44)
    public final class653 method525(boolean arg0, int arg1) {
        field1010++;
        class690 var3 = this.field1008;
        class653 var4;
        synchronized (this.field1008) {
            var4 = (class653) this.field1008.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field1017;
        byte[] var6;
        synchronized (this.field1017) {
            var6 = this.field1017.method1572(16, 0, arg1);
        }
        class653 var7 = new class653();
        if (var6 != null) {
            var7.method3652(-1, new class63(var6));
        }
        class690 var8 = this.field1008;
        synchronized (this.field1008) {
            this.field1008.method3899(117, var7, (long) arg1);
            if (!arg0) {
                method528(83);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V", line = 79)
    public static void method526(int arg0) {
        int var1 = -18 / ((-arg0 - 44) / 62);
        field1014 = null;
        field1011 = null;
        field1020 = null;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(III)Lfe;", line = 91)
    public static final class638 method527(int arg0, int arg1, int arg2) {
        class262 var3 = class137.field1948[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3846;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V", line = 109)
    public static final void method528(int arg0) {
        field1016++;
        class336.field4726 = -1;
        if (arg0 != -26881) {
            field1011 = null;
        }
        class73.field1096 = 1;
        long var1 = 0L;
        if (class420.field5918 == null) {
            class97.method663(35, -2);
        } else {
            class63 var3 = new class63(class428.method2654(class172.method1099(class420.field5918, 123), -23767));
            long var4 = var3.method475(arg0 + 880486753);
            class152.field2102 = var3.method475(880459872);
            class115.method733(class312.method2046(arg0 ^ 0xFFFF96DA, var4), true, "", (byte) 113);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V", line = 139)
    public final void method529(byte arg0) {
        if (arg0 != 1) {
            field1014 = null;
        }
        class690 var2 = this.field1008;
        synchronized (this.field1008) {
            this.field1008.method3906(-96);
        }
        field1013++;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZ)V", line = 152)
    public final void method530(int arg0, boolean arg1) {
        class690 var3 = this.field1008;
        synchronized (this.field1008) {
            this.field1008.method3896(1, arg0);
            if (arg1) {
                this.method529((byte) 5);
            }
        }
        field1012++;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lgp;ILuu;)V", line = 171)
    public class65(class553 arg0, int arg1, class237 arg2) {
        this.field1017 = arg2;
        if (this.field1017 == null) {
            this.field1018 = 0;
        } else {
            this.field1018 = this.field1017.method1597(16, 0);
        }
    }
}
