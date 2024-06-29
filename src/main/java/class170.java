import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class170 {

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Lgba;")
    private class358 field2152 = new class358();

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    private int field2146;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    private int field2162;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "Lba;")
    private class607 field2154;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lvt;")
    public static class344 field2149 = new class344(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Z")
    public static boolean field2155 = false;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "Luv;")
    public static class3 field2159 = new class3(16, 8);

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "[I")
    public static int[] field2161 = new int[13];

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "F")
    public static float field2164;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "[Lha;")
    public static class116[] field2165;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)I")
    public final int method1020(int arg0) {
        if (arg0 != -25022) {
            this.method1030(null, 27, null);
        }
        field2150++;
        return this.field2146;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILmaa;)Ljava/lang/Object;")
    public final Object method1021(int arg0, class42 arg1) {
        field2156++;
        long var3 = arg1.method237(-6403);
        if (arg0 < 53) {
            this.method1030(null, 47, null);
        }
        for (class100 var5 = (class100) this.field2154.method3476(var3, (byte) 28); var5 != null; var5 = (class100) this.field2154.method3481(65)) {
            if (var5.field1333.method236(arg1, -19126)) {
                Object var6 = var5.method449(true);
                if (var6 != null) {
                    if (var5.method448(-124)) {
                        class168 var7 = new class168(arg1, var6, var5.field1337);
                        this.field2154.method3475(-112, var7, var5.field1401);
                        this.field2152.method2228((byte) 101, var7);
                        var7.field7830 = 0L;
                        var5.method589(-8880);
                        var5.method3149(-18724);
                    } else {
                        this.field2152.method2228((byte) 76, var5);
                        var5.field7830 = 0L;
                    }
                    return var6;
                }
                var5.method589(-8880);
                var5.method3149(-18724);
                this.field2146 += var5.field1337;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)I")
    public final int method1022(boolean arg0) {
        field2160++;
        return arg0 ? this.field2162 : -59;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(Z)V")
    public final void method1023(boolean arg0) {
        this.field2152.method2227(16383);
        field2166++;
        this.field2154.method3472((byte) -128);
        if (arg0) {
            field2161 = null;
        }
        this.field2146 = this.field2162;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
    public final void method1024(int arg0, int arg1) {
        if (class580.field8074 != null) {
            for (class100 var3 = (class100) this.field2152.method2222((byte) -125); var3 != null; var3 = (class100) this.field2152.method2225(85)) {
                if (var3.method448(-125)) {
                    if (var3.method449(true) == null) {
                        var3.method589(-8880);
                        var3.method3149(arg1 - 18732);
                        this.field2146 += var3.field1337;
                    }
                } else if ((long) arg0 < ++var3.field7830) {
                    class100 var4 = class580.field8074.method864(arg1 + 78, var3);
                    this.field2154.method3475(-125, var4, var3.field1401);
                    class148.method806(var3, var4, (byte) -125);
                    var3.method589(-8880);
                    var3.method3149(-18724);
                }
            }
        }
        field2158++;
        if (arg1 != 8) {
            field2161 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lmaa;I)V")
    private final void method1025(class42 arg0, int arg1) {
        field2147++;
        long var3 = arg0.method237(-6403);
        if (arg1 != 13) {
            field2149 = null;
        }
        for (class100 var5 = (class100) this.field2154.method3476(var3, (byte) 28); var5 != null; var5 = (class100) this.field2154.method3481(107)) {
            if (var5.field1333.method236(arg0, arg1 - 19139)) {
                this.method1029((byte) 36, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    public final void method1026(int arg0) {
        field2157++;
        if (arg0 != 0) {
            return;
        }
        for (class100 var2 = (class100) this.field2152.method2222((byte) -65); var2 != null; var2 = (class100) this.field2152.method2225(arg0 + 63)) {
            if (var2.method448(-124)) {
                var2.method589(-8880);
                var2.method3149(-18724);
                this.field2146 += var2.field1337;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
    public static void method1027(int arg0) {
        field2165 = null;
        if (arg0 >= -73) {
            field2165 = null;
        }
        field2149 = null;
        field2161 = null;
        field2159 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILmaa;Ljava/lang/Object;)V")
    private final void method1028(int arg0, int arg1, class42 arg2, Object arg3) {
        field2151++;
        if (arg1 > this.field2162) {
            throw new IllegalStateException("s>cs");
        }
        this.method1025(arg2, 13);
        this.field2146 -= arg1;
        while (this.field2146 < 0) {
            class100 var6 = (class100) this.field2152.method2226(0);
            this.method1029((byte) 36, var6);
        }
        class168 var5 = new class168(arg2, arg3, arg1);
        this.field2154.method3475(-127, var5, arg2.method237(-6403));
        this.field2152.method2228((byte) 95, var5);
        var5.field7830 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLaa;)V")
    private final void method1029(byte arg0, class100 arg1) {
        if (arg0 != 36) {
            return;
        }
        if (arg1 != null) {
            arg1.method589(arg0 - 8916);
            arg1.method3149(-18724);
            this.field2146 += arg1.field1337;
        }
        field2163++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lmaa;ILjava/lang/Object;)V")
    public final void method1030(class42 arg0, int arg1, Object arg2) {
        this.method1028(arg1 ^ arg1, 1, arg0, arg2);
        field2148++;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V")
    public class170(int arg0) {
        this.field2146 = arg0;
        this.field2162 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2154 = new class607(var2);
    }
}
