import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class423 extends class325 {

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    private int field6043 = 4096;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Z")
    private boolean field6042 = true;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "Z")
    public static boolean field6046 = false;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 13)
    public class423() {
        super(1, false);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)[[I", line = 16)
    public final int[][] method360(int arg0, byte arg1) {
        if (arg1 != -9) {
            method2597((byte) 51);
        }
        ++field6047;
        int[][] var3 = super.field4733.method1251((byte) 42, arg0);
        if (super.field4733.field2369) {
            int[] var4 = this.method2062(arg0 + -1 & class566.field7574, 0, (byte) 33);
            int[] var5 = this.method2062(arg0, 0, (byte) 33);
            int[] var6 = this.method2062(class566.field7574 & arg0 + 1, 0, (byte) 33);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class261.field3874; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field6043;
                int var12 = (var5[var10 + 1 & class625.field8423] + -var5[var10 + -1 & class625.field8423]) * this.field6043;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - -var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                }
                if (this.field6042) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljp;IB)V", line = 97)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field6042 = ~arg0.method2398(-1372747256) == -2;
            }
        } else {
            this.field6043 = arg0.method2359(-1);
        }
        ++field6045;
        if (arg2 >= -41) {
            this.field6043 = -43;
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(B)V", line = 135)
    public static final void method2597(byte arg0) {
        while (true) {
            if (~class89.field1233.method1986(class206.field2700, 113) <= -16) {
                int var1 = class89.field1233.method1993(-1, 15);
                if (~var1 != -32768) {
                    boolean var2 = false;
                    class174 var3 = (class174) class234.field3169.method3953((long) var1, 14);
                    if (var3 == null) {
                        class192 var4 = new class192();
                        var4.field1812 = var1;
                        var3 = new class174(var4);
                        class234.field3169.method3962((long) var1, var3, -110);
                        class495.field6850[class184.field2457++] = var3;
                        var2 = true;
                    }
                    class192 var5 = var3.field2336;
                    class382.field5588[class688.field9678++] = var1;
                    var5.field1844 = class499.field6889;
                    if (var5.field2577 != null && var5.field2577.method1459(true)) {
                        class417.method2574(var5, (byte) -123);
                    }
                    int var6 = class89.field1233.method1993(-1, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class89.field1233.method1993(-1, 1);
                    int var8 = class89.field1233.method1993(-1, 2);
                    int var9 = class89.field1233.method1993(-1, 1);
                    if (~var9 == -2) {
                        class584.field7798[class667.field9214++] = var1;
                    }
                    var5.method1328(class364.field5309.method3338((byte) 118, class89.field1233.method1993(-1, 14)), false);
                    int var10 = class89.field1233.method1993(-1, 3) + 4 << 11 & 16217;
                    int var11 = class89.field1233.method1993(-1, 5);
                    if (var11 > 15) {
                        var11 -= 32;
                    }
                    var5.method1020(-1, var5.field2577.field2960);
                    var5.field1790 = var5.field2577.field2961 << 3;
                    if (var2) {
                        var5.method1021(16383, true, var10);
                    }
                    var5.method1327(var8, (byte) -62, class551.field7456.field1890[0] + var11, class551.field7456.field1884[0] + var6, var5.method655(-128), var7 == 1);
                    if (var5.field2577.method1459(true)) {
                        class647.method3618(var5.field1890[0], var5.field1884[0], var5, (class589) null, (class73) null, 0, -114, var5.field2250);
                    }
                    continue;
                }
            }
            ++field6041;
            if (arg0 <= 98) {
                method2597((byte) -126);
            }
            class89.field1233.method1984(-97);
            return;
        }
    }
}
