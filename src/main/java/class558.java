import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class558 {

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "Lth;")
    private class288 field7969 = new class288();

    @OriginalMember(owner = "client!kga", name = "o", descriptor = "I")
    private int field7970;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "I")
    private int field7957;

    @OriginalMember(owner = "client!kga", name = "s", descriptor = "Lwa;")
    private class661 field7974;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "S")
    public static short field7965 = 1;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "Lcq;")
    public static class110 field7960 = new class110(9, -1);

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "F")
    public static float field7958;

    @OriginalMember(owner = "client!kga", name = "r", descriptor = "F")
    public static float field7973;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "I")
    public static int field7963;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
    public static int field7964;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!kga", name = "p", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!kga", name = "q", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)V")
    public final void method3159(int arg0, boolean arg1) {
        field7959++;
        if (arg1) {
            this.field7970 = -86;
        }
        if (class614.field8645 == null) {
            return;
        }
        for (class477 var3 = (class477) this.field7969.method1677(-120); var3 != null; var3 = (class477) this.field7969.method1681(80)) {
            if (var3.method808(20712)) {
                if (var3.method807(44) == null) {
                    var3.method1922(123);
                    var3.method3443(115);
                    this.field7957 += var3.field6874;
                }
            } else if (++var3.field8693 > (long) arg0) {
                class477 var4 = class614.field8645.method60(-71, var3);
                this.field7974.method3671(false, var4, var3.field4176);
                class91.method462(var3, 125, var4);
                var3.method1922(85);
                var3.method3443(110);
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLso;Ljava/lang/Object;)V")
    public final void method3160(byte arg0, class276 arg1, Object arg2) {
        this.method3170(arg1, 1, arg2, true);
        if (arg0 == -18) {
            field7966++;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)I")
    public final int method3161(byte arg0) {
        field7962++;
        if (arg0 != 66) {
            this.method3166((byte) -49);
        }
        return this.field7970;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BII)Z")
    public static final boolean method3162(byte arg0, int arg1, int arg2) {
        field7964++;
        if (arg0 >= -48) {
            return false;
        } else {
            return class647.method3622(arg2, 0, arg1) | (arg1 & 0x70000) != 0 || class662.method3678(arg2, arg1, 8);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Len;B)V")
    private final void method3163(class477 arg0, byte arg1) {
        field7971++;
        if (arg1 != 65) {
            field7965 = 20;
        }
        if (arg0 != null) {
            arg0.method1922(127);
            arg0.method3443(103);
            this.field7957 += arg0.field6874;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lso;B)V")
    private final void method3164(class276 arg0, byte arg1) {
        field7956++;
        long var3 = arg0.method1465(true);
        class477 var5 = (class477) this.field7974.method3669(var3, -1);
        if (arg1 != 77) {
            return;
        }
        while (var5 != null) {
            if (var5.field6872.method1464(arg0, true)) {
                this.method3163(var5, (byte) 65);
                return;
            }
            var5 = (class477) this.field7974.method3673((byte) 122);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
    public final void method3165(int arg0) {
        this.field7969.method1682(0);
        field7963++;
        this.field7974.method3667(5488);
        this.field7957 = this.field7970;
        if (arg0 != -10859) {
            this.field7969 = null;
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)V")
    public final void method3166(byte arg0) {
        field7961++;
        if (arg0 != 80) {
            return;
        }
        for (class477 var2 = (class477) this.field7969.method1677(arg0 + 2); var2 != null; var2 = (class477) this.field7969.method1681(arg0 ^ 0x2D)) {
            if (var2.method808(20712)) {
                var2.method1922(96);
                var2.method3443(arg0 ^ 0x3E);
                this.field7957 += var2.field6874;
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(B)I")
    public final int method3167(byte arg0) {
        field7967++;
        if (arg0 != -126) {
            this.field7970 = 58;
        }
        return this.field7957;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILso;)Ljava/lang/Object;")
    public final Object method3168(int arg0, class276 arg1) {
        field7972++;
        if (arg0 != 20548) {
            this.method3160((byte) -89, null, null);
        }
        long var3 = arg1.method1465(true);
        for (class477 var5 = (class477) this.field7974.method3669(var3, -1); var5 != null; var5 = (class477) this.field7974.method3673((byte) 106)) {
            if (var5.field6872.method1464(arg1, true)) {
                Object var6 = var5.method807(arg0 ^ 0x5068);
                if (var6 != null) {
                    if (var5.method808(20712)) {
                        class147 var7 = new class147(arg1, var6, var5.field6874);
                        this.field7974.method3671(false, var7, var5.field4176);
                        this.field7969.method1680(46, var7);
                        var7.field8693 = 0L;
                        var5.method1922(arg0 - 20466);
                        var5.method3443(121);
                    } else {
                        this.field7969.method1680(39, var5);
                        var5.field8693 = 0L;
                    }
                    return var6;
                }
                var5.method1922(91);
                var5.method3443(arg0 - 20439);
                this.field7957 += var5.field6874;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)V")
    public static void method3169(int arg0) {
        field7960 = null;
        if (arg0 != 31185) {
            method3162((byte) 125, -111, -90);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lso;ILjava/lang/Object;Z)V")
    private final void method3170(class276 arg0, int arg1, Object arg2, boolean arg3) {
        field7968++;
        if (this.field7970 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method3164(arg0, (byte) 77);
        this.field7957 -= arg1;
        while (this.field7957 < 0) {
            class477 var6 = (class477) this.field7969.method1678(true);
            this.method3163(var6, (byte) 65);
        }
        class147 var5 = new class147(arg0, arg2, arg1);
        if (arg3) {
            this.field7974.method3671(false, var5, arg0.method1465(arg3));
            this.field7969.method1680(41, var5);
            var5.field8693 = 0L;
        }
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(I)V")
    public class558(int arg0) {
        this.field7970 = arg0;
        this.field7957 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field7974 = new class661(var2);
    }
}
