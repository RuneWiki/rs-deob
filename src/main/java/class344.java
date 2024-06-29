import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class344 {

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Lbo;")
    private class355 field4676 = new class355();

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    private int field4673;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    private int field4671;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Laj;")
    private class71 field4674;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "J")
    public static long field4669 = 0L;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
    public static int[] field4664 = new int[250];

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Z")
    public static boolean field4666;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLpc;)V")
    private final void method2174(byte arg0, class34 arg1) {
        field4672++;
        long var3 = arg1.method354(-125);
        if (arg0 != 60) {
            this.field4673 = 107;
        }
        for (class23 var5 = (class23) this.field4674.method614(-85, var3); var5 != null; var5 = (class23) this.field4674.method605(arg0 ^ 0xFFFFFF89)) {
            if (var5.field423.method355(arg1, (byte) 106)) {
                var5.method2367(arg0 ^ 0x39);
                var5.method1902(32);
                this.field4673++;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILpc;)Ljava/lang/Object;")
    public final Object method2175(int arg0, class34 arg1) {
        field4675++;
        long var3 = arg1.method354(93);
        class23 var5 = (class23) this.field4674.method614(-77, var3);
        if (arg0 >= -12) {
            method2183(-91, (byte) -31);
        }
        while (var5 != null) {
            if (var5.field423.method355(arg1, (byte) 118)) {
                Object var6 = var5.method289(-14795);
                if (var6 != null) {
                    if (var5.method287((byte) -126)) {
                        class28 var7 = new class28(arg1, var6);
                        this.field4674.method612(var5.field5349, -1, var7);
                        this.field4676.method2244(11310, var7);
                        var7.field3984 = 0L;
                        var5.method2367(5);
                        var5.method1902(32);
                    } else {
                        this.field4676.method2244(11310, var5);
                        var5.field3984 = 0L;
                    }
                    return var6;
                }
                var5.method2367(5);
                var5.method1902(32);
                this.field4673++;
            }
            var5 = (class23) this.field4674.method605(-28);
        }
        return null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public final void method2176(int arg0) {
        field4670++;
        this.field4676.method2238(5);
        this.field4674.method607(0);
        int var2 = -81 % ((21 - arg0) / 34);
        this.field4673 = this.field4671;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)I")
    public final int method2177(int arg0) {
        if (arg0 != 0) {
            this.method2175(78, (class34) null);
        }
        field4667++;
        return this.field4673;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V")
    public final void method2178(int arg0, byte arg1) {
        if (arg1 < 48) {
            return;
        }
        if (class218.field3031 != null) {
            for (class23 var3 = (class23) this.field4676.method2234(9700); var3 != null; var3 = (class23) this.field4676.method2237((byte) -128)) {
                if (var3.method287((byte) -85)) {
                    if (var3.method289(-14795) == null) {
                        var3.method2367(5);
                        var3.method1902(32);
                        this.field4673++;
                    }
                } else if ((++var3.field3984) > ((long) arg0)) {
                    class23 var4 = class218.field3031.method1630(var3, 124);
                    this.field4674.method612(var3.field5349, -1, var4);
                    class417.method2583(var4, var3, -128);
                    var3.method2367(5);
                    var3.method1902(32);
                }
            }
        }
        field4665++;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public static void method2179(int arg0) {
        field4664 = null;
        if (arg0 != 17376) {
            method2181((class116) null, -84, (byte) 8, 6);
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)I")
    public final int method2180(int arg0) {
        field4662++;
        int var2 = 83 % ((arg0 + 60) / 39);
        return this.field4671;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lao;IBI)V")
    public static final void method2181(class116 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= 87) {
            class150.field2295[arg3][arg1] = arg0;
            field4668++;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public final void method2182(byte arg0) {
        field4677++;
        if (arg0 != 107) {
            method2181((class116) null, -121, (byte) 43, 23);
        }
        for (class23 var2 = (class23) this.field4676.method2234(9700); var2 != null; var2 = (class23) this.field4676.method2237((byte) -95)) {
            if (var2.method287((byte) -120)) {
                var2.method2367(5);
                var2.method1902(arg0 - 75);
                this.field4673++;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IB)V")
    public static final void method2183(int arg0, byte arg1) {
        field4678++;
        if (class15.method76(6, arg0)) {
            int var2 = -17 / ((1 - arg1) / 56);
            class95.method810(class291.field3949[arg0], true, -1);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/Object;ILpc;)V")
    public final void method2184(Object arg0, int arg1, class34 arg2) {
        field4663++;
        this.method2174((byte) 60, arg2);
        if (this.field4673 == 0) {
            class23 var4 = (class23) this.field4676.method2243(0);
            var4.method2367(5);
            var4.method1902(32);
        } else {
            this.field4673--;
        }
        if (arg1 <= 44) {
            this.method2177(116);
        }
        class28 var5 = new class28(arg2, arg0);
        this.field4674.method612(arg2.method354(34), -1, var5);
        this.field4676.method2244(11310, var5);
        var5.field3984 = 0L;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(I)V")
    public class344(int arg0) {
        this.field4673 = arg0;
        this.field4671 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field4674 = new class71(var2);
    }
}
