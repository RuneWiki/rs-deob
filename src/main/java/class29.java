import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class29 extends class239 {

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    private final int field544;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    private final int field554;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    private final int field545;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    private final int field548;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Lie;")
    public static class117 field547 = new class117(5);

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field560 = 0;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static final void method238(boolean arg0) {
        class239.field4104.method833(0);
        if (arg0) {
            method239((byte) -24);
        }
        ++field550;
        class27.field521.method833(0);
        class40.field829.method833(0);
        class248.field4287.method833(0);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
    public static final void method239(byte arg0) {
        class129.field2302.method833(0);
        ++field549;
        if (arg0 != -50) {
            field560 = 98;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)V")
    public final void method240(byte arg0, int arg1, int arg2) {
        ++field553;
        if (arg0 != -15) {
            method238(false);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
    public final void method241(int arg0, int arg1, int arg2) {
        int var4 = this.field554 * arg2 >> 12;
        ++field559;
        int var5 = this.field548 * arg0 >> 12;
        int var6 = -122 % ((62 - arg1) / 40);
        int var7 = this.field544 * arg0 >> 12;
        int var8 = this.field545 * arg2 >> 12;
        class85.method639(var8, var4, var7, true, var5, super.field4111);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBI)V")
    public final void method242(int arg0, byte arg1, int arg2) {
        ++field555;
        int var4 = this.field554 * arg2 >> 12;
        int var5 = this.field545 * arg2 >> 12;
        int var6 = this.field548 * arg0 >> 12;
        if (arg1 > -10) {
            field560 = -21;
        }
        int var7 = this.field544 * arg0 >> 12;
        class181.method1243(super.field4111, super.field4115, (byte) 60, var6, super.field4102, var4, var7, var5);
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
    public static final void method243(byte arg0) {
        ++field546;
        try {
            int var1 = 110 / ((arg0 - 29) / 41);
            if (~class244.field4242 == -2) {
                int var2 = class40.field835.method18((byte) 71);
                if (var2 > 0 && class40.field835.method32(4096)) {
                    int var3 = var2 - class89.field1707;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class40.field835.method6((byte) 125, var3);
                } else {
                    class40.field835.method25(false);
                    class40.field835.method10((byte) 65);
                    class42.field847 = null;
                    if (class252.field4334 == null) {
                        class244.field4242 = 0;
                    } else {
                        class244.field4242 = 2;
                    }
                    class182.field3154 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class40.field835.method25(false);
            class182.field3154 = null;
            class244.field4242 = 0;
            class42.field847 = null;
            class252.field4334 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)I")
    public static final int method244(int arg0, byte arg1) {
        ++field552;
        if (arg1 != -15) {
            return 113;
        } else {
            return arg0 == 16711935 ? -1 : class245.method1611(30, arg0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method245(int arg0) {
        if (arg0 == 10828) {
            field547 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[B)V")
    public static final void method246(byte arg0, byte[] arg1) {
        ++field557;
        class152 var2 = new class152(arg1);
        int var3 = var2.method1063(-17162);
        if (arg0 == -56) {
            for (int var4 = 0; ~var3 < ~var4; ++var4) {
                class209 var5 = new class209();
                class257 var6 = var2.method1039(1995);
                var5.field3581 = var2.method1063(-17162);
                var5.field3567 = var2.method1063(-17162);
                var5.field3574 = var2.method1051((byte) 94);
                var5.field3585 = var6.method1698(arg0 ^ -24680, 47, 32);
                var5.field3576 = var6.method1689((byte) -111, 47);
                class144.field2522.method287(var5, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIII)V")
    public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field544 = arg3;
        this.field554 = arg0;
        this.field545 = arg2;
        this.field548 = arg1;
    }
}
