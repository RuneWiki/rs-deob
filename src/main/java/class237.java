import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class237 {

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "Lgg;")
    private class114 field3062 = new class114(64);

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "Lgg;")
    public class114 field3070 = new class114(64);

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "Lkha;")
    public class687 field3069;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "Lkha;")
    private class687 field3058;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "Lmq;")
    public static class78 field3066 = new class78(43, 1);

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field3068 = 0;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public static int field3071 = 0;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "[I")
    public static int[] field3063;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)[Lkfa;", line = 6)
    public static final class407[] method1481(int arg0) {
        field3064++;
        return arg0 < 57 ? null : new class407[] { class646.field8899, class53.field773, class421.field5992 };
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V", line = 23)
    public final void method1482(int arg0, int arg1, int arg2) {
        field3060++;
        this.field3062 = new class114(arg1);
        if (arg0 > 95) {
            this.field3070 = new class114(arg2);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)Ljn;", line = 35)
    public final class128 method1483(int arg0, byte arg1) {
        field3061++;
        if (arg1 != -1) {
            field3063 = null;
        }
        class114 var3 = this.field3062;
        class128 var4;
        synchronized (this.field3062) {
            var4 = (class128) this.field3062.method778((long) arg0, arg1 ^ 0xFFFFFF87);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field3058;
        byte[] var6;
        synchronized (this.field3058) {
            var6 = this.field3058.method3810(34, -23360, arg0);
        }
        class128 var7 = new class128();
        var7.field1553 = this;
        if (var6 != null) {
            var7.method831(new class179(var6), -99);
        }
        class114 var8 = this.field3062;
        synchronized (this.field3062) {
            this.field3062.method774((long) arg0, 112, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)Ltd;", line = 70)
    public static final class525 method1484(int arg0, int arg1, int arg2) {
        class73 var3 = class495.field7002[arg0][arg1][arg2];
        return var3 == null ? null : var3.field961;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 78)
    public final void method1485(byte arg0) {
        field3057++;
        class114 var2 = this.field3062;
        synchronized (this.field3062) {
            if (arg0 != -84) {
                field3071 = 86;
            }
            this.field3062.method776((byte) 105);
        }
        class114 var3 = this.field3070;
        synchronized (this.field3070) {
            this.field3070.method776((byte) 72);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V", line = 98)
    public static void method1486(byte arg0) {
        field3063 = null;
        field3066 = null;
        if (arg0 > -24) {
            field3063 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(IB)V", line = 109)
    public final void method1487(int arg0, byte arg1) {
        field3065++;
        class114 var3 = this.field3062;
        synchronized (this.field3062) {
            this.field3062.method775(1, arg0);
            int var4 = 41 % ((arg1 - 45) / 35);
        }
        class114 var5 = this.field3070;
        synchronized (this.field3070) {
            this.field3070.method775(1, arg0);
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)V", line = 130)
    public final void method1488(byte arg0) {
        field3059++;
        class114 var2 = this.field3062;
        synchronized (this.field3062) {
            this.field3062.method781((byte) 47);
            if (arg0 != -117) {
                this.method1483(47, (byte) -94);
            }
        }
        class114 var3 = this.field3070;
        synchronized (this.field3070) {
            this.field3070.method781((byte) 47);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Ldh;ILkha;Lkha;)V", line = 163)
    public class237(class286 arg0, int arg1, class687 arg2, class687 arg3) {
        this.field3069 = arg3;
        this.field3058 = arg2;
        this.field3058.method3812(0, 34);
    }
}
