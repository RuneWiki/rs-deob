import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "k", descriptor = "Lqk;")
    private class16 field94 = new class16();

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    private int field95;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    private int field86;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "Ltba;")
    private class165 field102;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "Len;")
    public static class322 field91 = new class322();

    @OriginalMember(owner = "client!to", name = "t", descriptor = "Z")
    public static boolean field103 = false;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "J")
    public static long field89;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
    public final int method44(int arg0) {
        field88++;
        if (arg0 != 3206) {
            this.method49(-63, 71, null, null);
        }
        return this.field86;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)I")
    public final int method45(int arg0) {
        field84++;
        return arg0 == 15937 ? this.field95 : -20;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        field92++;
        this.field94.method113(73);
        this.field102.method1161(arg0);
        this.field95 = this.field86;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Z)V")
    public static void method47(boolean arg0) {
        if (!arg0) {
            field91 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lhh;I)V")
    private final void method48(class132 arg0, int arg1) {
        field87++;
        if (arg1 != 32700) {
            field91 = null;
        }
        long var3 = arg0.method983((byte) 78);
        for (class524 var5 = (class524) this.field102.method1160(var3, arg1 - 32575); var5 != null; var5 = (class524) this.field102.method1162(117)) {
            if (var5.field7327.method982(-13408, arg0)) {
                this.method54(0, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IILjava/lang/Object;Lhh;)V")
    private final void method49(int arg0, int arg1, Object arg2, class132 arg3) {
        field99++;
        if (this.field86 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method48(arg3, 32700);
        this.field95 -= arg0;
        while (this.field95 < 0) {
            class524 var6 = (class524) this.field94.method114(-120);
            this.method54(0, var6);
        }
        class80 var5 = new class80(arg3, arg2, arg0);
        this.field102.method1153(var5, arg3.method983((byte) 93), arg1);
        this.field94.method116(var5, arg1 + 2);
        var5.field8924 = 0L;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Lhh;I)Ljava/lang/Object;")
    public final Object method50(class132 arg0, int arg1) {
        field96++;
        long var3 = arg0.method983((byte) -60);
        class524 var5 = (class524) this.field102.method1160(var3, 125);
        int var6 = -114 % ((arg1 + 54) / 43);
        while (var5 != null) {
            if (var5.field7327.method982(-13408, arg0)) {
                Object var7 = var5.method681(-114);
                if (var7 != null) {
                    if (var5.method682(-92)) {
                        class80 var8 = new class80(arg0, var7, var5.field7326);
                        this.field102.method1153(var8, var5.field2333, -1);
                        this.field94.method116(var8, 1);
                        var8.field8924 = 0L;
                        var5.method1175(-2);
                        var5.method3615(103);
                    } else {
                        this.field94.method116(var5, 1);
                        var5.field8924 = 0L;
                    }
                    return var7;
                }
                var5.method1175(-2);
                var5.method3615(15);
                this.field95 += var5.field7326;
            }
            var5 = (class524) this.field102.method1162(127);
        }
        return null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILhh;Ljava/lang/Object;)V")
    public final void method51(int arg0, class132 arg1, Object arg2) {
        if (arg0 != 0) {
            field89 = -18L;
        }
        this.method49(1, ~arg0, arg2, arg1);
        field98++;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        if (arg1 != 0) {
            field101 = -71;
        }
        if (class657.field9147 != null) {
            for (class524 var3 = (class524) this.field94.method118(-30553); var3 != null; var3 = (class524) this.field94.method111(22548)) {
                if (var3.method682(29)) {
                    if (var3.method681(68) == null) {
                        var3.method1175(arg1 - 2);
                        var3.method3615(105);
                        this.field95 += var3.field7326;
                    }
                } else if (((long) arg0) < (++var3.field8924)) {
                    class524 var4 = class657.field9147.method679((byte) 111, var3);
                    this.field102.method1153(var4, var3.field2333, -1);
                    class94.method766(var3, false, var4);
                    var3.method1175(-2);
                    var3.method3615(97);
                }
            }
        }
        field90++;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
    public final void method53(int arg0) {
        field97++;
        if (arg0 != 0) {
            this.method52(0, -121);
        }
        for (class524 var2 = (class524) this.field94.method118(-30553); var2 != null; var2 = (class524) this.field94.method111(arg0 + 22548)) {
            if (var2.method682(arg0 - 71)) {
                var2.method1175(-2);
                var2.method3615(18);
                this.field95 += var2.field7326;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILni;)V")
    private final void method54(int arg0, class524 arg1) {
        if (arg1 != null) {
            arg1.method1175(-2);
            arg1.method3615(15);
            this.field95 += arg1.field7326;
        }
        field100++;
        if (arg0 != 0) {
            field93 = -115;
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(I)V")
    public class8(int arg0) {
        this.field95 = arg0;
        this.field86 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field102 = new class165(var2);
    }
}
