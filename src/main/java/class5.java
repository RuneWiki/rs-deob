import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lnf;")
    private class389 field73 = new class389();

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    private int field82;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "Lfe;")
    private class384 field85;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lgn;")
    public static class475 field71 = new class475(61, -1);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method32(int arg0) {
        field78++;
        class435 var2 = (class435) this.field85.method2316(4999);
        while (var2 != null) {
            Object var4 = var2.method1226(-1);
            if (var4 != null) {
                return var4;
            }
            class435 var5 = var2;
            var2 = (class435) this.field85.method2308((byte) 120);
            var5.method536(false);
            var5.method589((byte) 51);
            this.field69 += var2.field6377;
        }
        int var3 = -87 % ((-arg0 - 62) / 41);
        return null;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)I")
    public final int method33(int arg0) {
        field68++;
        int var2 = arg0;
        for (class435 var3 = (class435) this.field73.method2347((byte) -124); var3 != null; var3 = (class435) this.field73.method2341(117)) {
            if (!var3.method1225(false)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILor;)V")
    private final void method34(int arg0, class435 arg1) {
        if (arg0 >= -60) {
            return;
        }
        field70++;
        if (arg1 != null) {
            arg1.method536(false);
            arg1.method589((byte) 51);
            this.field69 += arg1.field6377;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public final void method35(byte arg0) {
        for (class435 var2 = (class435) this.field73.method2347((byte) -118); var2 != null; var2 = (class435) this.field73.method2341(arg0 ^ 0xFFFFFF96)) {
            if (var2.method1225(false)) {
                var2.method536(false);
                var2.method589((byte) 51);
                this.field69 += var2.field6377;
            }
        }
        if (arg0 != -1) {
            this.method39(false, -124);
        }
        field83++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/lang/Object;J)V")
    public final void method36(int arg0, Object arg1, long arg2) {
        field81++;
        this.method42(arg1, 1, (byte) -64, arg2);
        if (arg0 != -20960) {
            this.method42(null, -74, (byte) -96, -90L);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method37(byte arg0) {
        int var2 = 81 / ((arg0 + 47) / 59);
        field79++;
        class435 var3 = (class435) this.field85.method2308((byte) -65);
        while (var3 != null) {
            Object var4 = var3.method1226(-1);
            if (var4 != null) {
                return var4;
            }
            class435 var5 = var3;
            var3 = (class435) this.field85.method2308((byte) 122);
            var5.method536(false);
            var5.method589((byte) 51);
            this.field69 += var3.field6377;
        }
        return null;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
    public final void method38(byte arg0) {
        this.field73.method2348(false);
        if (arg0 > -1) {
            this.field73 = null;
        }
        field80++;
        this.field85.method2315((byte) -124);
        this.field69 = this.field82;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
    public final void method39(boolean arg0, int arg1) {
        if (class170.field2269 != null) {
            for (class435 var3 = (class435) this.field73.method2347((byte) -112); var3 != null; var3 = (class435) this.field73.method2341(98)) {
                if (var3.method1225(arg0)) {
                    if (var3.method1226(-1) == null) {
                        var3.method536(false);
                        var3.method589((byte) 51);
                        this.field69++;
                    }
                } else if (((long) arg1) < (++var3.field1291)) {
                    class435 var4 = class170.field2269.method703(var3, 122);
                    this.field85.method2317(-1, var3.field1177, var4);
                    class106.method634(var4, 0, var3);
                    var3.method536(false);
                    var3.method589((byte) 51);
                }
            }
        }
        if (arg0) {
            this.method37((byte) 56);
        }
        field76++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method40(int arg0, long arg1) {
        field84++;
        class435 var4 = (class435) this.field85.method2310((byte) 71, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1226(-1);
        if (var5 == null) {
            var4.method536(false);
            var4.method589((byte) 51);
            this.field69 += var4.field6377;
            return null;
        }
        if (var4.method1225(false)) {
            class407 var6 = new class407(var5, var4.field6377);
            this.field85.method2317(arg0 - 1, var4.field1177, var6);
            this.field73.method2342((byte) 127, var6);
            var6.field1291 = 0L;
            var4.method536(false);
            var4.method589((byte) 51);
        } else {
            this.field73.method2342((byte) 81, var4);
            var4.field1291 = 0L;
        }
        if (arg0 != 0) {
            field71 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)I")
    public final int method41(int arg0) {
        field75++;
        if (arg0 != 0) {
            this.field82 = -79;
        }
        return this.field82;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Object;IBJ)V")
    private final void method42(Object arg0, int arg1, byte arg2, long arg3) {
        field72++;
        if (this.field82 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method44(-30337, arg3);
        this.field69 -= arg1;
        while (this.field69 < 0) {
            class435 var8 = (class435) this.field73.method2344(1);
            this.method34(-91, var8);
        }
        int var6 = 65 % ((arg2 - 22) / 47);
        class407 var7 = new class407(arg0, arg1);
        this.field85.method2317(-1, arg3, var7);
        this.field73.method2342((byte) 91, var7);
        var7.field1291 = 0L;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static void method43(int arg0) {
        if (arg0 != 0) {
            method43(63);
        }
        field71 = null;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(IJ)V")
    private final void method44(int arg0, long arg1) {
        field77++;
        class435 var4 = (class435) this.field85.method2310((byte) 89, arg1);
        this.method34(arg0 + 30272, var4);
        if (arg0 != -30337) {
            this.method34(119, null);
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)I")
    public final int method45(int arg0) {
        if (arg0 != 0) {
            this.field85 = null;
        }
        field74++;
        return this.field69;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
    public class5(int arg0) {
        this.field82 = arg0;
        this.field69 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field85 = new class384(var2);
    }
}
