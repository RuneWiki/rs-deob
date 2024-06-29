import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class14 {

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "Lvu;")
    private class677 field142;

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client!eda", name = "i", descriptor = "Lpl;")
    private class616 field139;

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "Lcb;")
    public static class631 field138 = new class631(75, 8);

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!eda", name = "s", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!eda", name = "t", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!eda", name = "u", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!eda", name = "v", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)Z", line = 11)
    public static final boolean method66(byte arg0) {
        field146++;
        if (arg0 >= -101) {
            method77(58);
        }
        try {
            return class516.method3087(1);
        } catch (IOException var4) {
            class498.method3019(7);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class153.field2383 == null ? -1 : class153.field2383.method2143((byte) 24)) + "," + (class263.field4081 == null ? -1 : class263.field4081.method2143((byte) 24)) + "," + (class340.field4998 == null ? -1 : class340.field4998.method2143((byte) 24)) + " - " + class495.field7166 + "," + (class145.field2251.field1702[0] + class265.field4123) + "," + (class145.field2251.field1704[0] + class723.field10155) + " - ";
            for (int var3 = 0; class495.field7166 > var3 && var3 < 50; var3++) {
                var2 = var2 + class624.field8742.field4543[var3] + ",";
            }
            class333.method2135(var5, var2, -99);
            class694.method3874(false, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 46)
    public final void method67(long arg0, Object arg1, int arg2) {
        field143++;
        this.method79((byte) 26, arg0, arg1, 1);
        if (arg2 != -6772) {
            field151 = 92;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)V", line = 57)
    public final void method68(int arg0, int arg1) {
        if (arg0 != -16878) {
            return;
        }
        if (class440.field6409 != null) {
            for (class317 var3 = (class317) this.field142.method3772(true); var3 != null; var3 = (class317) this.field142.method3780(23774)) {
                if (var3.method2080(1)) {
                    if (var3.method2078(1) == null) {
                        var3.method636((byte) 97);
                        var3.method1507(1);
                        this.field134 += var3.field4741;
                    }
                } else if ((long) arg1 < ++var3.field3444) {
                    class317 var4 = class440.field6409.method3039((byte) 54, var3);
                    this.field139.method3516(255, var3.field1039, var4);
                    class379.method2388(var4, 100, var3);
                    var3.method636((byte) 97);
                    var3.method1507(arg0 + 16879);
                }
            }
        }
        field132++;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 108)
    public final Object method69(int arg0) {
        field148++;
        class317 var2 = (class317) this.field139.method3508((byte) -65);
        while (var2 != null) {
            Object var3 = var2.method2078(1);
            if (var3 != null) {
                return var3;
            }
            class317 var4 = var2;
            var2 = (class317) this.field139.method3520(-1);
            var4.method636((byte) 97);
            var4.method1507(1);
            this.field134 += var4.field4741;
        }
        if (arg0 != -6) {
            field138 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)I", line = 139)
    public final int method70(boolean arg0) {
        field147++;
        int var2 = 0;
        if (arg0) {
            this.field145 = 41;
        }
        for (class317 var3 = (class317) this.field142.method3772(true); var3 != null; var3 = (class317) this.field142.method3780(23774)) {
            if (!var3.method2080(1)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)V", line = 164)
    public final void method71(byte arg0) {
        field150++;
        if (arg0 != 44) {
            this.method67(-91L, null, 14);
        }
        for (class317 var2 = (class317) this.field142.method3772(true); var2 != null; var2 = (class317) this.field142.method3780(23774)) {
            if (var2.method2080(1)) {
                var2.method636((byte) 97);
                var2.method1507(1);
                this.field134 += var2.field4741;
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 189)
    public final Object method72(int arg0) {
        if (arg0 > -24) {
            return null;
        }
        field135++;
        class317 var2 = (class317) this.field139.method3520(-1);
        while (var2 != null) {
            Object var3 = var2.method2078(1);
            if (var3 != null) {
                return var3;
            }
            class317 var4 = var2;
            var2 = (class317) this.field139.method3520(-1);
            var4.method636((byte) 97);
            var4.method1507(1);
            this.field134 += var4.field4741;
        }
        return null;
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)V", line = 221)
    public static final void method73(int arg0) {
        field137++;
        for (int var1 = 0; var1 < 5; var1++) {
            class235.field3785[var1] = false;
        }
        class440.field6414 = -1;
        class366.field5581 = 0;
        if (arg0 <= 62) {
            field138 = null;
        }
        class188.field3134 = 0;
        class448.field6538 = -1;
        class657.field9353 = class199.field3403;
        class275.field4202 = -1;
        class87.field1279 = -1;
        class639.field8978 = 5;
        class499.field7265 = class101.field1507;
        class545.field7801 = class608.field8587;
        class540.field7705 = class497.field7212;
        class77.field1141 = class329.field4857;
        class694.field9846 = class81.field1167;
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(B)I", line = 253)
    public final int method74(byte arg0) {
        if (arg0 >= -47) {
            return -116;
        } else {
            field136++;
            return this.field134;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(JI)V", line = 266)
    private final void method75(long arg0, int arg1) {
        field133++;
        class317 var4 = (class317) this.field139.method3512(true, arg0);
        if (arg1 != 26458) {
            this.method81(null, (byte) 119);
        }
        this.method81(var4, (byte) -90);
    }

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "(I)V", line = 279)
    public final void method76(int arg0) {
        int var2 = 34 / ((-arg0 - 43) / 46);
        this.field142.method3773((byte) 35);
        field144++;
        this.field139.method3517(-84);
        this.field134 = this.field145;
    }

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "(I)V", line = 291)
    public static void method77(int arg0) {
        if (arg0 != 21331) {
            field152 = 91;
        }
        field138 = null;
    }

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "(B)I", line = 305)
    public final int method78(byte arg0) {
        field149++;
        return arg0 <= 33 ? 32 : this.field145;
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(I)V", line = 316)
    public class14(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BJLjava/lang/Object;I)V", line = 320)
    public final void method79(byte arg0, long arg1, Object arg2, int arg3) {
        field131++;
        if (arg3 > this.field145) {
            throw new IllegalStateException("s>cs");
        }
        this.method75(arg1, 26458);
        this.field134 -= arg3;
        while (this.field134 < 0) {
            class317 var8 = (class317) this.field142.method3775(30);
            this.method81(var8, (byte) -122);
        }
        class439 var6 = new class439(arg2, arg3);
        this.field139.method3516(255, arg1, var6);
        this.field142.method3779(-14068, var6);
        int var7 = -14 / ((arg0 - 66) / 37);
        var6.field3444 = 0L;
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(II)V", line = 355)
    public class14(int arg0, int arg1) {
        this.field142 = new class677();
        this.field145 = arg0;
        this.field134 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && var3 < arg1; var3 += var3) {
        }
        this.field139 = new class616(var3);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 372)
    public final Object method80(byte arg0, long arg1) {
        field140++;
        if (arg0 >= -8) {
            this.field134 = -90;
        }
        class317 var4 = (class317) this.field139.method3512(true, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method2078(1);
        if (var5 == null) {
            var4.method636((byte) 97);
            var4.method1507(1);
            this.field134 += var4.field4741;
            return null;
        }
        if (var4.method2080(1)) {
            class439 var6 = new class439(var5, var4.field4741);
            this.field139.method3516(255, var4.field1039, var6);
            this.field142.method3779(-14068, var6);
            var6.field3444 = 0L;
            var4.method636((byte) 97);
            var4.method1507(1);
        } else {
            this.field142.method3779(-14068, var4);
            var4.field3444 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Leg;B)V", line = 417)
    private final void method81(class317 arg0, byte arg1) {
        field141++;
        if (arg0 != null) {
            arg0.method636((byte) 97);
            arg0.method1507(1);
            this.field134 += arg0.field4741;
        }
        if (arg1 > -71) {
            field152 = -1;
        }
    }
}
