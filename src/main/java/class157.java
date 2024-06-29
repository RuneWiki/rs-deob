import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class157 {

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Lsaa;")
    private class345 field2115 = new class345();

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Ljava/lang/String;")
    public String field2104;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
    public static int[] field2114 = new int[2];

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "S")
    public static short field2112 = 32767;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
    public static boolean field2116 = false;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2106 = null;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    private volatile int field2119;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Lda;")
    public static class67 field2118;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Lqn;")
    private class71 field2120;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "[I")
    public static int[] field2113;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Luq;Luq;BLuq;Luq;)V")
    public static final void method1087(class172 arg0, class172 arg1, byte arg2, class172 arg3, class172 arg4) {
        class355.field5187 = arg0;
        if (arg2 != -48) {
            method1088((byte) 89);
        }
        class775.field10663 = arg4;
        class82.field1139 = arg1;
        field2111++;
        class419.field6032 = new class347[class82.field1139.method1193(true)][];
        class408.field5782 = new boolean[class82.field1139.method1193(true)];
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method1088(byte arg0) {
        field2113 = null;
        int var1 = 47 % ((-arg0 - 34) / 59);
        field2114 = null;
        field2118 = null;
        field2106 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)Lvia;")
    public final class589 method1089(int arg0) {
        field2108++;
        Object var2 = null;
        class345 var3 = this.field2115;
        synchronized (this.field2115) {
            class589 var4 = this.field2115.method2189((byte) 40);
            var4.method3310(30305);
            if (arg0 != 32767) {
                this.method1094(null, (byte) -29);
            }
            this.field2119--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lfq;I)V")
    public final void method1090(class214 arg0, int arg1) {
        field2105++;
        if (arg1 >= -96) {
            this.field2115 = null;
        }
        arg0.field2804 = false;
        class345 var3 = this.field2115;
        synchronized (this.field2115) {
            this.field2115.method2188((byte) 31, arg0);
            this.field2119++;
        }
        if (this.field2120 != null) {
            class71 var4 = this.field2120;
            synchronized (this.field2120) {
                this.field2120.notify();
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljc;I)V")
    public final void method1091(class463 arg0, int arg1) {
        field2117++;
        class345 var3 = this.field2115;
        synchronized (this.field2115) {
            this.field2115.method2188((byte) 31, arg0);
            if (arg1 != 0) {
                this.method1091(null, -64);
            }
            this.field2119++;
        }
        if (this.field2120 != null) {
            class71 var4 = this.field2120;
            synchronized (this.field2120) {
                this.field2120.notify();
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)Z")
    public final boolean method1092(int arg0) {
        field2109++;
        if (arg0 != 32767) {
            this.method1089(19);
        }
        return this.field2119 == 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLqn;)V")
    public final void method1093(byte arg0, class71 arg1) {
        int var3 = -62 % ((arg0 - 41) / 57);
        this.field2120 = arg1;
        field2110++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lfq;B)V")
    public final void method1094(class214 arg0, byte arg1) {
        field2107++;
        arg0.field2804 = true;
        int var3 = -63 / ((arg1 + 79) / 40);
        class345 var4 = this.field2115;
        synchronized (this.field2115) {
            this.field2115.method2188((byte) 31, arg0);
            this.field2119++;
        }
        if (this.field2120 != null) {
            class71 var5 = this.field2120;
            synchronized (this.field2120) {
                this.field2120.notify();
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class157(String arg0) {
        this.field2104 = arg0;
    }
}
