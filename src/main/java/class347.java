import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class347 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public int field4750 = 128;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public int field4763 = 128;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public int field4758;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public int field4762;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lss;")
    public static class295 field4748 = null;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lqo;")
    public static class19 field4756 = new class19("", 14);

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public int field4752;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public int field4753;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public int field4759;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public int field4764;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field4765;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field4766;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Lve;")
    public final class347 method1921(int arg0) {
        if (arg0 != 2) {
            this.field4752 = 113;
        }
        field4755++;
        return new class347(this.field4749, this.field4763, this.field4750, this.field4751, this.field4762, this.field4758);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)I")
    public static final int method1922(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field4765++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            int var5 = -125 % ((arg2 - 1) / 58);
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method1923(int arg0) {
        if (arg0 == -686) {
            field4756 = null;
            field4748 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method1924(boolean arg0, String arg1, int arg2) {
        field4757++;
        class435.field6343.field3322 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        if (arg2 >= -27) {
            field4748 = null;
        }
        for (int var6 = 0; var6 < class75.field1097.field1713; var6++) {
            class316 var9 = class75.field1097.method823(false, var6);
            if ((!arg0 || var9.field4338) && var9.field4370 == -1 && var9.field4387 == -1 && var9.field4366 == 0 && var9.field4345.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class344.field4740 = null;
                    class141.field2014 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class344.field4740 = var4;
        class133.field1925 = 0;
        class141.field2014 = var5;
        String[] var7 = new String[class141.field2014];
        for (int var8 = 0; var8 < class141.field2014; var8++) {
            var7[var8] = class75.field1097.method823(false, var4[var8]).field4345;
        }
        class244.method1448(var7, class344.field4740, 12950);
        class435.field6343.method1420(2);
        class435.field6343.field3322 = 2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZII)Z")
    public static final boolean method1925(int arg0, boolean arg1, int arg2, int arg3) {
        field4754++;
        class55 var4 = (class55) class195.method1184(arg3, arg0, arg2);
        boolean var5 = arg1;
        if (var4 != null) {
            var5 = arg1 & class446.method2640(var4, (byte) -60);
        }
        class55 var6 = (class55) class490.method2876(arg3, arg0, arg2, field4766 == null ? (field4766 = method1927("jv")) : field4766);
        if (var6 != null) {
            var5 &= class446.method2640(var6, (byte) -60);
        }
        class55 var7 = (class55) class391.method2240(arg3, arg0, arg2);
        if (var7 != null) {
            var5 &= class446.method2640(var7, (byte) -60);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lve;B)V")
    public final void method1926(class347 arg0, byte arg1) {
        this.field4749 = arg0.field4749;
        this.field4763 = arg0.field4763;
        this.field4750 = arg0.field4750;
        this.field4762 = arg0.field4762;
        this.field4751 = arg0.field4751;
        this.field4758 = arg0.field4758;
        if (arg1 <= -112) {
            field4760++;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V")
    public class347(int arg0) {
        this.field4749 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIII)V")
    private class347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4750 = arg2;
        this.field4758 = arg5;
        this.field4749 = arg0;
        this.field4763 = arg1;
        this.field4751 = arg3;
        this.field4762 = arg4;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1927(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
