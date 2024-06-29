import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class239 {

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "Lqj;")
    private class535 field3164 = new class535(64);

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "Lqj;")
    public class535 field3172 = new class535(2);

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "Luq;")
    public class172 field3167;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "Luq;")
    private class172 field3168;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "I")
    public static int field3170 = 0;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "Lmw;")
    public static class517 field3166 = new class517(38, 15);

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "Ljb;")
    public static class519 field3173 = new class519(70, 4);

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIIII)I", line = 4)
    public static final int method1507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3163++;
        if (class645.field8694 == null) {
            return 0;
        }
        int var6 = 13 % ((9 - arg0) / 36);
        if (arg4 < 3) {
            int var7 = arg3 >> 9;
            int var8 = arg2 >> 9;
            if (arg1 < 0 || arg5 < 0 || arg1 > class102.field1467 - 1 || (class393.field5663 - 1) < arg5) {
                return 0;
            }
            if (var7 < 1 || var8 < 1 || var7 > class102.field1467 - 1 || class393.field5663 - 1 < var8) {
                return 0;
            }
            boolean var9 = (class328.field4667[1][arg3 >> 9][arg2 >> 9] & 0x2) != 0;
            if ((arg3 & 0x1FF) == 0) {
                boolean var10 = (class328.field4667[1][var7 - 1][arg2 >> 9] & 0x2) != 0;
                boolean var11 = (class328.field4667[1][var7][arg2 >> 9] & 0x2) != 0;
                if (var10 != var11) {
                    var9 = (class328.field4667[1][arg1][arg5] & 0x2) != 0;
                }
            }
            if ((arg2 & 0x1FF) == 0) {
                boolean var12 = (class328.field4667[1][arg3 >> 9][var8 - 1] & 0x2) != 0;
                boolean var13 = (class328.field4667[1][arg3 >> 9][var8] & 0x2) != 0;
                if (var13 != var12) {
                    var9 = (class328.field4667[1][arg1][arg5] & 0x2) != 0;
                }
            }
            if (var9) {
                arg4++;
            }
        }
        return class645.field8694[arg4].method1895(arg3, arg2, 108);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)V", line = 63)
    public final void method1508(int arg0, int arg1) {
        class535 var3 = this.field3164;
        synchronized (this.field3164) {
            this.field3164.method3101(false, arg0);
        }
        field3171++;
        if (arg1 != -1) {
            field3170 = 111;
        }
        class535 var4 = this.field3172;
        synchronized (this.field3172) {
            this.field3172.method3101(false, arg0);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V", line = 80)
    public final void method1509(int arg0) {
        class535 var2 = this.field3164;
        synchronized (this.field3164) {
            this.field3164.method3103(-11294);
            if (arg0 != 2) {
                field3166 = null;
            }
        }
        field3165++;
        class535 var3 = this.field3172;
        synchronized (this.field3172) {
            this.field3172.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)Z", line = 98)
    public static final boolean method1510(int arg0, int arg1, int arg2) {
        field3161++;
        if (arg2 < 33) {
            field3173 = null;
        }
        return (arg0 & 0x70000) != 0 | class158.method1098(-126, arg1, arg0) || class521.method3030(arg1, -61, arg0);
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(II)Lcia;", line = 116)
    public final class638 method1511(int arg0, int arg1) {
        field3162++;
        class535 var3 = this.field3164;
        class638 var4;
        synchronized (this.field3164) {
            var4 = (class638) this.field3164.method3109((byte) 122, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field3168;
        byte[] var6;
        synchronized (this.field3168) {
            var6 = this.field3168.method1188(arg0, arg0 - 18080, arg1);
        }
        class638 var7 = new class638();
        var7.field8590 = this;
        if (var6 != null) {
            var7.method3513(true, new class254(var6));
        }
        class535 var8 = this.field3164;
        synchronized (this.field3164) {
            this.field3164.method3108((long) arg1, arg0 ^ 0x3FF0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V", line = 144)
    public static void method1512(byte arg0) {
        field3173 = null;
        field3166 = null;
        int var1 = -83 % ((arg0 - 42) / 49);
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V", line = 156)
    public final void method1513(int arg0) {
        field3169++;
        class535 var2 = this.field3164;
        synchronized (this.field3164) {
            this.field3164.method3113(arg0 + 1951749207);
        }
        class535 var3 = this.field3172;
        synchronized (this.field3172) {
            this.field3172.method3113(-127);
        }
        if (arg0 != -1951749335) {
            method1512((byte) 87);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lnq;)V", line = 172)
    public static final void method1514(class485 arg0) {
        class627.field8492 = arg0;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lkw;ILuq;Luq;)V", line = 184)
    public class239(class263 arg0, int arg1, class172 arg2, class172 arg3) {
        this.field3167 = arg3;
        this.field3168 = arg2;
        this.field3168.method1175(33, (byte) 87);
    }
}
