import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class370 extends class28 {

    @OriginalMember(owner = "client!bga", name = "u", descriptor = "Lra;")
    public static class361 field4767 = new class361(101, 6);

    @OriginalMember(owner = "client!bga", name = "v", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!bga", name = "y", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!bga", name = "A", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!bga", name = "C", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!bga", name = "E", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!bga", name = "G", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!bga", name = "H", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!bga", name = "w", descriptor = "Ljava/lang/String;")
    public String field4769;

    @OriginalMember(owner = "client!bga", name = "x", descriptor = "[C")
    public char[] field4770;

    @OriginalMember(owner = "client!bga", name = "F", descriptor = "[C")
    public char[] field4778;

    @OriginalMember(owner = "client!bga", name = "B", descriptor = "[I")
    public int[] field4774;

    @OriginalMember(owner = "client!bga", name = "D", descriptor = "[I")
    public int[] field4776;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V")
    public final void method2127(byte arg0) {
        if (this.field4776 != null) {
            for (int var2 = 0; var2 < this.field4776.length; var2++) {
                this.field4776[var2] = class131.method954(this.field4776[var2], 32768);
            }
        }
        field4780++;
        int var3 = 78 / ((arg0 + 6) / 37);
        if (this.field4774 != null) {
            for (int var4 = 0; var4 < this.field4774.length; var4++) {
                this.field4774[var4] = class131.method954(this.field4774[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IILfd;)V")
    private final void method2128(int arg0, int arg1, class418 arg2) {
        field4768++;
        int var4 = 127 / ((69 - arg1) / 53);
        if (arg0 == 1) {
            this.field4769 = arg2.method2394(4);
        } else if (arg0 == 2) {
            int var8 = arg2.method2396(-126);
            this.field4774 = new int[var8];
            this.field4770 = new char[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4774[var9] = arg2.method2393(-30727);
                byte var10 = arg2.method2387((byte) -24);
                this.field4770[var9] = var10 == 0 ? 0 : class103.method778(12270, var10);
            }
        } else if (arg0 == 3) {
            int var5 = arg2.method2396(-110);
            this.field4776 = new int[var5];
            this.field4778 = new char[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4776[var6] = arg2.method2393(-30727);
                byte var7 = arg2.method2387((byte) -102);
                this.field4778[var6] = var7 == 0 ? 0 : class103.method778(12270, var7);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method2129(byte arg0, String arg1, boolean arg2) {
        field4775++;
        if (arg1 == null) {
            return;
        }
        if (class703.field9804 >= 100) {
            class433.method2476(class604.field8163.method3280((byte) 122, class144.field1890), false, 4);
            return;
        }
        String var3 = class315.method1841((byte) 119, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class703.field9804; var4++) {
            String var9 = class315.method1841((byte) 109, class408.field5236[var4]);
            if (var9 != null && var9.equals(var3)) {
                class433.method2476(arg1 + class604.field8164.method3280((byte) 71, class144.field1890), false, 4);
                return;
            }
            if (class580.field7903[var4] != null) {
                String var10 = class315.method1841((byte) 79, class580.field7903[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class433.method2476(arg1 + class604.field8164.method3280((byte) -102, class144.field1890), false, 4);
                    return;
                }
            }
        }
        int var5 = 0;
        if (arg0 != -8) {
            field4767 = null;
        }
        while (var5 < class665.field9225) {
            String var7 = class315.method1841((byte) 90, class405.field5160[var5]);
            if (var7 != null && var7.equals(var3)) {
                class433.method2476(class604.field8169.method3280((byte) 80, class144.field1890) + arg1 + class604.field8170.method3280((byte) 115, class144.field1890), false, 4);
                return;
            }
            if (class329.field4274[var5] != null) {
                String var8 = class315.method1841((byte) 117, class329.field4274[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class433.method2476(class604.field8169.method3280((byte) 116, class144.field1890) + arg1 + class604.field8170.method3280((byte) -83, class144.field1890), false, 4);
                    return;
                }
            }
            var5++;
        }
        if (class315.method1841((byte) 70, class233.field3130.field2492).equals(var3)) {
            class433.method2476(class604.field8166.method3280((byte) 109, class144.field1890), false, 4);
            return;
        }
        class270.field3585++;
        class11 var6 = class130.method931(class649.field9035, (byte) 54, class398.field5067);
        var6.field114.method2352(true, class367.method2111(2, arg1) + 1);
        var6.field114.method2374(arg1, -84);
        var6.field114.method2352(true, arg2 ? 1 : 0);
        class100.method760(var6, 98);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "()V")
    public static final void method2130() {
        for (int var0 = 0; var0 < class516.field6758; var0++) {
            class34 var1 = class57.field772[var0];
            class708.method3876(var1);
            class57.field772[var0] = null;
        }
        class516.field6758 = 0;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(JJ)J")
    public static long method2131(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(B)V")
    public static void method2132(byte arg0) {
        field4767 = null;
        int var1 = -13 / ((arg0 + 10) / 45);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(BC)I")
    public final int method2133(byte arg0, char arg1) {
        field4777++;
        if (this.field4774 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 != -83) {
            method2129((byte) -99, null, false);
        }
        while (this.field4774.length > var3) {
            if (this.field4770[var3] == arg1) {
                return this.field4774[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(CB)I")
    public final int method2134(char arg0, byte arg1) {
        field4771++;
        if (this.field4776 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4776.length; var3++) {
            if (this.field4778[var3] == arg0) {
                return this.field4776[var3];
            }
        }
        return arg1 == 8 ? -1 : 82;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Le;ZLpe;)V")
    public static final void method2135(class702 arg0, boolean arg1, class615 arg2) {
        class547.field7106 = arg0;
        class647.field9016 = arg2;
        if (arg1) {
            field4767 = null;
        }
        field4779++;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "([ILdg;IB)V")
    public static final void method2136(int[] arg0, class193 arg1, int arg2, byte arg3) {
        field4773++;
        if (arg1.field2979 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field2979.length; var5++) {
                if (arg1.field2979[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field3021 != -1) {
                class348 var6 = class552.field7163.method3031(-111, arg1.field3021);
                int var7 = var6.field4447;
                if (var7 == 1) {
                    arg1.field2943 = 0;
                    arg1.field2972 = 1;
                    arg1.field2939 = arg2;
                    arg1.field2944 = 0;
                    arg1.field3015 = 0;
                    class451.method2548(var6, arg1.field508, arg1.field503, arg1.field506, arg3 + 213, class233.field3130 == arg1, arg1.field3015);
                }
                if (var7 == 2) {
                    arg1.field2944 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg1.field2979 == null || arg1.field2979[var9] == -1 || class552.field7163.method3031(124, arg0[var9]).field4466 >= class552.field7163.method3031(arg3 ^ 0x5B, arg1.field2979[var9]).field4466) {
                arg1.field2979 = arg0;
                arg1.field2939 = arg2;
                break;
            }
        }
        if (var8) {
            arg1.field2979 = arg0;
            arg1.field2939 = arg2;
        }
        if (arg3 != 42) {
            field4767 = null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lfd;I)V")
    public final void method2137(class418 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2396(arg1 ^ 0x36);
            if (var3 == 0) {
                if (arg1 != 0) {
                    return;
                }
                field4772++;
                return;
            }
            this.method2128(var3, -57, arg0);
        }
    }
}
