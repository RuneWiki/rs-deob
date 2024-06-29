import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class124 extends class154 {

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    private int field2079 = 4096;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
    private int field2074 = 4096;

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
    private int field2085 = 4096;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "Leg;")
    public static class37 field2076 = class174.method1167("<col=ffff00>", -44);

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "Z")
    public static boolean field2080 = true;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "Z")
    public static boolean field2083 = true;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "Ljl;")
    public static class101 field2077;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "Ljl;")
    public static class101 field2086;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    public static void method891(boolean arg0) {
        if (!arg0) {
            method895(108, (byte) 119);
        }
        field2076 = null;
        field2086 = null;
        field2077 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lme;III)V")
    public static final void method892(class67 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class175.field2936) {
            class111 var4 = class286.field5048[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1876 != null && var4.field1876.field4251.method464()) {
                arg0.method468(var4.field1876.field4251, 128, 0, 0, true);
            }
        }
        if (arg3 < class175.field2936) {
            class111 var5 = class286.field5048[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1876 != null && var5.field1876.field4251.method464()) {
                arg0.method468(var5.field1876.field4251, 0, 0, 128, true);
            }
        }
        if (arg2 < class175.field2936 && arg3 < class160.field2675) {
            class111 var6 = class286.field5048[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1876 != null && var6.field1876.field4251.method464()) {
                arg0.method468(var6.field1876.field4251, 128, 0, 128, true);
            }
        }
        if (arg2 < class175.field2936 && arg3 > 0) {
            class111 var7 = class286.field5048[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1876 != null && var7.field1876.field4251.method464()) {
                arg0.method468(var7.field1876.field4251, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(BI)V")
    public static final void method893(byte arg0, int arg1) {
        class119.field2017.method1402((byte) -124, arg1);
        if (arg0 != 53) {
            field2076 = null;
        }
        class273.field4796.method1402((byte) -86, arg1);
        ++field2078;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)V")
    public static final void method894(int arg0, int arg1) {
        ++field2073;
        class274 var2 = class166.method1116(6, arg1, true);
        var2.method1840(10000);
        if (arg0 != -22948) {
            field2080 = true;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 != -14015) {
            method893((byte) 79, -111);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2079 = arg0.method1244(false);
                }
            } else {
                this.field2074 = arg0.method1244(false);
            }
        } else {
            this.field2085 = arg0.method1244(false);
        }
        ++field2072;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class124() {
        super(1, false);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)V")
    public static final void method895(int arg0, byte arg1) {
        class125 var2 = class233.field4017;
        synchronized (class233.field4017) {
            class62.field1019 = arg0;
        }
        if (arg1 >= -113) {
            field2083 = false;
        }
        ++field2081;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        int[][] var3 = super.field2585.method1532(arg1, -27);
        ++field2082;
        if (arg0 != 115) {
            return null;
        } else {
            if (super.field2585.field3761) {
                int[][] var4 = this.method1054(0, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class227.field3898 > var11; ++var11) {
                    int var12 = var7[var11];
                    int var13 = var5[var11];
                    int var14 = var6[var11];
                    if (~var12 == ~var13 && var12 == var14) {
                        var8[var11] = this.field2085 * var13 >> 12;
                        var9[var11] = this.field2074 * var12 >> 12;
                        var10[var11] = this.field2079 * var14 >> 12;
                    } else {
                        var8[var11] = this.field2085;
                        var9[var11] = this.field2074;
                        var10[var11] = this.field2079;
                    }
                }
            }
            return var3;
        }
    }
}
