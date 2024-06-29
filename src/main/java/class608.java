import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class608 {

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "Lan;")
    private class22 field8742 = new class22();

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    private int field8737;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    private int field8733;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "Lwaa;")
    private class652 field8731;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "[I")
    public static int[] field8735 = new int[2];

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field8729;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/Object;ILbe;I)V")
    private final void method3484(Object arg0, int arg1, class35 arg2, int arg3) {
        field8740++;
        if (arg3 > this.field8733) {
            throw new IllegalStateException("s>cs");
        }
        this.method3493(-90, arg2);
        this.field8737 -= arg3;
        while (this.field8737 < 0) {
            class136 var6 = (class136) this.field8742.method352((byte) 115);
            this.method3495((byte) 114, var6);
        }
        class188 var5 = new class188(arg2, arg0, arg3);
        this.field8731.method3670(arg2.method413(true), var5, (byte) 127);
        this.field8742.method345(var5, ~arg1);
        var5.field2006 = arg1;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLbe;Ljava/lang/Object;)V")
    public final void method3485(byte arg0, class35 arg1, Object arg2) {
        field8734++;
        if (arg0 == -119) {
            this.method3484(arg2, arg0 + 119, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
    public static void method3486(byte arg0) {
        if (arg0 == -36) {
            field8735 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public final void method3487(int arg0) {
        field8738++;
        if (arg0 != -19432) {
            field8735 = null;
        }
        for (class136 var2 = (class136) this.field8742.method347(0); var2 != null; var2 = (class136) this.field8742.method344((byte) 24)) {
            if (var2.method904((byte) -84)) {
                var2.method3045(true);
                var2.method1037(arg0 ^ 0x4BAE);
                this.field8737 += var2.field1730;
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILrda;)I")
    public static final int method3488(int arg0, class613 arg1) {
        if (arg0 <= 45) {
            field8735 = null;
        }
        field8725++;
        int var2 = arg1.field8815;
        class573 var3 = arg1.method1280(-1);
        if (arg1.field2634 == -1 || arg1.field2594) {
            var2 = arg1.field8785;
        } else if (arg1.field2634 == var3.field8386 || arg1.field2634 == var3.field8382 || arg1.field2634 == var3.field8398 || arg1.field2634 == var3.field8358) {
            var2 = arg1.field8806;
        } else if (arg1.field2634 == var3.field8389 || arg1.field2634 == var3.field8391 || arg1.field2634 == var3.field8405 || arg1.field2634 == var3.field8377) {
            var2 = arg1.field8813;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILbe;)Ljava/lang/Object;")
    public final Object method3489(int arg0, class35 arg1) {
        field8729++;
        long var3 = arg1.method413(true);
        class136 var5 = (class136) this.field8731.method3678(var3, -122);
        if (arg0 != 221) {
            method3496(12);
        }
        while (var5 != null) {
            if (var5.field1729.method414(-13652, arg1)) {
                Object var6 = var5.method906(45);
                if (var6 != null) {
                    if (var5.method904((byte) -45)) {
                        class188 var7 = new class188(arg1, var6, var5.field1730);
                        this.field8731.method3670(var5.field7519, var7, (byte) 127);
                        this.field8742.method345(var7, -1);
                        var7.field2006 = 0L;
                        var5.method3045(true);
                        var5.method1037(-91);
                    } else {
                        this.field8742.method345(var5, -1);
                        var5.field2006 = 0L;
                    }
                    return var6;
                }
                var5.method3045(true);
                var5.method1037(-109);
                this.field8737 += var5.field1730;
            }
            var5 = (class136) this.field8731.method3671((byte) 117);
        }
        return null;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
    public final void method3490(byte arg0) {
        if (arg0 != 50) {
            this.method3484(null, -49, null, -103);
        }
        this.field8742.method353(0);
        field8739++;
        this.field8731.method3674((byte) -86);
        this.field8737 = this.field8733;
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)I")
    public final int method3491(byte arg0) {
        int var2 = -3 / ((-arg0 - 50) / 41);
        field8727++;
        return this.field8737;
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(B)V")
    public static final void method3492(byte arg0) {
        class612.field8766.method3674((byte) -76);
        if (arg0 != 122) {
            method3486((byte) -29);
        }
        field8741++;
        class425.field6104.method353(0);
        class264.field3635.method353(0);
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(ILbe;)V")
    private final void method3493(int arg0, class35 arg1) {
        if (arg0 > -52) {
            this.field8733 = 119;
        }
        field8730++;
        long var3 = arg1.method413(true);
        for (class136 var5 = (class136) this.field8731.method3678(var3, -127); var5 != null; var5 = (class136) this.field8731.method3671((byte) 101)) {
            if (var5.field1729.method414(-13652, arg1)) {
                this.method3495((byte) 122, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "(B)I")
    public final int method3494(byte arg0) {
        if (arg0 == -22) {
            field8736++;
            return this.field8733;
        } else {
            return -41;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLas;)V")
    private final void method3495(byte arg0, class136 arg1) {
        if (arg1 != null) {
            arg1.method3045(true);
            arg1.method1037(-87);
            this.field8737 += arg1.field1730;
        }
        field8726++;
        int var3 = 121 % ((arg0 - 68) / 46);
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public static final void method3496(int arg0) {
        field8728++;
        if (arg0 > -88) {
            method3486((byte) -99);
        }
        if (class149.field1828) {
            return;
        }
        if (class221.field2851.field4141) {
            class393.field5309 = ((int) class393.field5309 - 17 & 0xFFFFFFF0);
        } else {
            class59.field936 += (-12.0F - class59.field936) / 2.0F;
        }
        class447.field6335 = true;
        class149.field1828 = true;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)V")
    public final void method3497(int arg0, byte arg1) {
        if (arg1 != -2) {
            return;
        }
        if (class149.field1827 != null) {
            for (class136 var3 = (class136) this.field8742.method347(0); var3 != null; var3 = (class136) this.field8742.method344((byte) 24)) {
                if (var3.method904((byte) -83)) {
                    if (var3.method906(-90) == null) {
                        var3.method3045(true);
                        var3.method1037(arg1 ^ 0x6B);
                        this.field8737 += var3.field1730;
                    }
                } else if ((long) arg0 < ++var3.field2006) {
                    class136 var4 = class149.field1827.method2572(true, var3);
                    this.field8731.method3670(var3.field7519, var4, (byte) 127);
                    class297.method1764(var4, (byte) -41, var3);
                    var3.method3045(true);
                    var3.method1037(arg1 - 111);
                }
            }
        }
        field8732++;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(I)V")
    public class608(int arg0) {
        this.field8737 = arg0;
        this.field8733 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field8731 = new class652(var2);
    }
}
