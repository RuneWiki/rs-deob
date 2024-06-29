import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class135 extends class112 {

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
    private int field1963;

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "Lsr;")
    private class251 field1964;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    private int field1958;

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "I")
    private int field1968;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    private int field1956;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "I")
    private int field1966;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "I")
    private int field1972;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "Lqfa;")
    public static class98 field1960 = new class98(64, -2);

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "I")
    public static int field1970 = 0;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "Z")
    public static boolean field1971 = false;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "[I")
    public static int[] field1973 = new int[64];

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "Lgw;")
    private class168 field1959;

    @OriginalMember(owner = "client!vr", name = "B", descriptor = "[Ls;")
    public static class278[] field1969;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(ZII)I", line = 3)
    public static final int method960(boolean arg0, int arg1, int arg2) {
        field1961++;
        int var3 = class597.method3364(arg2 + 91923, 4, (byte) 93, arg1 + 45365) - (128 - (class597.method3364(arg2 + 37821, 2, (byte) 93, arg1 + 10294) - 128 >> 1) - (class597.method3364(arg2, 1, (byte) 93, arg1) + -128 >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return arg0 ? 43 : var4;
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V", line = 25)
    public static final void method961(int arg0) {
        field1967++;
        class262.method1717(class557.field7812.field6514.method651(false), false);
        int var1 = (class511.field7303 >> 12) + (class228.field3063 >> 3);
        class526.field7430 = class660.field9039.field1266 = 0;
        int var2 = (class32.field426 >> 12) + (class3.field30 >> 3);
        class660.field9039.method1832(8, (byte) -40, arg0);
        byte var3 = 18;
        class539.field7560 = new int[var3];
        class46.field546 = new int[var3];
        class499.field7164 = new byte[var3][];
        class179.field2396 = new int[var3];
        class604.field8481 = new byte[var3][];
        class61.field753 = new int[var3];
        class500.field7181 = new byte[var3][];
        class376.field5273 = new byte[var3][];
        class401.field5698 = new int[var3];
        class207.field2720 = new int[var3];
        class268.field3822 = new int[var3][4];
        class636.field8763 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class336.field4683 >> 4)) / 8; var5 <= (((class336.field4683 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class700.field9768 >> 4)) / 8; var8 <= ((var2 + (class700.field9768 >> 4)) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class207.field2720[var4] = var9;
                class539.field7560[var4] = class299.field4218.method2090(-86, "m" + var5 + "_" + var8);
                class46.field546[var4] = class299.field4218.method2090(class286.method1875(arg0, -68), "l" + var5 + "_" + var8);
                class179.field2396[var4] = class299.field4218.method2090(-69, "n" + var5 + "_" + var8);
                class401.field5698[var4] = class299.field4218.method2090(-72, "um" + var5 + "_" + var8);
                class61.field753[var4] = class299.field4218.method2090(-18, "ul" + var5 + "_" + var8);
                if (class179.field2396[var4] == -1) {
                    class539.field7560[var4] = -1;
                    class46.field546[var4] = -1;
                    class401.field5698[var4] = -1;
                    class61.field753[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class179.field2396.length; var6++) {
            class179.field2396[var6] = -1;
            class539.field7560[var6] = -1;
            class46.field546[var6] = -1;
            class401.field5698[var6] = -1;
            class61.field753[var6] = -1;
        }
        byte var7;
        if (class222.field2897 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class657.method3610(var7, false, var1, var2, false);
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)V", line = 112)
    public static void method962(int arg0) {
        field1973 = null;
        field1969 = null;
        if (arg0 == -6804) {
            field1960 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "()V", line = 126)
    public static final void method963() {
        for (int var0 = class136.field1978; var0 < class634.field8744; var0++) {
            for (int var1 = 0; var1 < class492.field6939; var1++) {
                for (int var2 = 0; var2 < class365.field5171; var2++) {
                    class165 var3 = class553.field7776[var0][var1][var2];
                    if (var3 != null) {
                        class444 var4 = var3.field2269;
                        class444 var5 = var3.field2265;
                        if (var4 != null && var4.method621(-110)) {
                            class18.method115(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method621(-113)) {
                                class18.method115(var5, var0, var1, var2, 1, 1);
                                var5.method615(false, class362.field5135, 0, 0, var4, 22501, 0);
                                var5.method614(26062);
                            }
                            var4.method614(26062);
                        }
                        for (class356 var6 = var3.field2270; var6 != null; var6 = var6.field5066) {
                            class524 var8 = var6.field5067;
                            if (var8 != null && var8.method621(-122)) {
                                class18.method115(var8, var0, var1, var2, var8.field7413 + 1 - var8.field7415, var8.field7409 - var8.field7418 + 1);
                                var8.method614(26062);
                            }
                        }
                        class526 var7 = var3.field2266;
                        if (var7 != null && var7.method621(-108)) {
                            class494.method2954(var7, var0, var1, var2);
                            var7.method614(26062);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 203)
    public static final void method964(long[] arg0, int arg1, Object[] arg2) {
        field1957++;
        class156.method1043(arg1, arg1 ^ 0x7268, arg0, arg0.length - 1, arg2);
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)V", line = 212)
    public static final void method965(boolean arg0) {
        if (class231.field3111 == null || class97.field1172 == null) {
            class231.field3111 = new int[256];
            class97.field1172 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class231.field3111[var1] = (int) (Math.sin(var2) * 4096.0D);
                class97.field1172[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1962++;
        if (arg0) {
            field1971 = true;
        }
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)Lgw;", line = 254)
    public final class168 method794(int arg0) {
        field1965++;
        if (this.field1959 == null) {
            class4.field41[4] = this.field1963;
            class4.field41[1] = this.field1968;
            class4.field41[0] = this.field1972;
            class4.field41[3] = this.field1966;
            class4.field41[2] = this.field1958;
            class4.field41[5] = this.field1956;
            class149 var2 = this.field1964.field715;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method531(class4.field41[var5], arg0 + 107)) {
                    return null;
                }
                class502 var7 = var2.method532((byte) 127, class4.field41[var5]);
                int var8 = var7.field7208 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field7200 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class614.field8595[var6] = var2.method534(false, var4, 20377, var4, 1.0F, class4.field41[var6]);
            }
            this.field1959 = this.field1964.method1483(var4, class614.field8595, (byte) 76, var3 != 0);
        }
        return arg0 == 14 ? this.field1959 : null;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lsr;IIIIII)V", line = 318)
    public class135(class251 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1963 = arg5;
        this.field1964 = arg0;
        this.field1958 = arg3;
        this.field1968 = arg2;
        this.field1956 = arg6;
        this.field1966 = arg4;
        this.field1972 = arg1;
    }
}
