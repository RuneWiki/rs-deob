import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class185 {

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "Ltja;")
    private class288 field2242 = new class288(16);

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "Lbt;")
    private class48 field2237;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!tca", name = "j", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "Lhj;")
    public static class596 field2245;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(II)V", line = 4)
    public final void method1229(int arg0, int arg1) {
        if (arg0 != 29) {
            return;
        }
        class288 var3 = this.field2242;
        synchronized (this.field2242) {
            this.field2242.method1694(arg1, -34);
        }
        field2240++;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V", line = 18)
    public static void method1230(int arg0) {
        if (arg0 != 2) {
            field2245 = null;
        }
        field2245 = null;
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(II)Ljj;", line = 31)
    private final class130 method1231(int arg0, int arg1) {
        field2247++;
        class288 var3 = this.field2242;
        class130 var4;
        synchronized (this.field2242) {
            var4 = (class130) this.field2242.method1684((long) arg0, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field2237;
        byte[] var6;
        synchronized (this.field2237) {
            var6 = this.field2237.method437(29, (byte) 119, arg0);
        }
        class130 var7 = new class130();
        if (var6 != null) {
            var7.method974(new class403(var6), (byte) -128);
        }
        if (arg1 < 73) {
            this.method1236(4);
        }
        class288 var8 = this.field2242;
        synchronized (this.field2242) {
            this.field2242.method1686(-25638, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(JII)Ljava/lang/String;", line = 64)
    public static final String method1232(long arg0, int arg1, int arg2) {
        field2246++;
        class200.method1297(arg1 - 30416, arg0);
        int var4 = class532.field7493.get(5);
        int var5 = class532.field7493.get(arg1) + 1;
        int var6 = class532.field7493.get(1);
        return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V", line = 79)
    public static final void method1233(int arg0) {
        field2239++;
        class112.field1410 = true;
        if (arg0 != -24497) {
            field2245 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)Z", line = 90)
    public static final boolean method1234(int arg0, int arg1, int arg2) {
        field2241++;
        if (arg2 == 21997) {
            return class86.method794(arg0, (byte) -37, arg1) || class414.method2466(arg0, (byte) 112, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lmja;ILbt;)V", line = 136)
    public class185(class441 arg0, int arg1, class48 arg2) {
        this.field2237 = arg2;
        this.field2237.method431(4, 29);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V", line = 109)
    public final void method1235(byte arg0) {
        if (arg0 != 63) {
            return;
        }
        class288 var2 = this.field2242;
        synchronized (this.field2242) {
            this.field2242.method1687((byte) 61);
        }
        field2244++;
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)V", line = 123)
    public final void method1236(int arg0) {
        field2243++;
        class288 var2 = this.field2242;
        synchronized (this.field2242) {
            if (arg0 != 100) {
                this.field2242 = null;
            }
            this.field2242.method1690(0);
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIIIILpaa;)Lsj;", line = 154)
    public final class485 method1237(int arg0, int arg1, int arg2, int arg3, int arg4, class651 arg5) {
        if (arg1 != 5) {
            this.method1231(8, -73);
        }
        field2238++;
        class443[] var7 = null;
        class130 var8 = this.method1231(arg4, 82);
        if (var8.field1612 != null) {
            var7 = new class443[var8.field1612.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class505 var10 = arg5.method3678(var8.field1612[var9], 104);
                var7[var9] = new class443(var10.field7141, var10.field7148, var10.field7144, var10.field7150, var10.field7151, var10.field7146, var10.field7139, var10.field7143);
            }
        }
        return new class485(var8.field1608, var7, var8.field1613, arg3, arg2, arg0);
    }
}
