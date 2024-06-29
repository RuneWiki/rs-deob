import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class191 extends class86 {

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
    private int field3012 = -1;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "Ll;")
    public static class66 field3002 = new class66(500);

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    public static int field3006 = -1;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    public static int field3007 = 0;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lvn;")
    public static class114 field3010;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "Lqi;")
    public static class246 field3009;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "[I")
    public int[] field2997;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "[I")
    public static int[] field3008;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V", line = 5)
    public static final void method1455(byte arg0) {
        class93.field1406 = null;
        class197.field3082 = (byte[][][]) null;
        class239.field3722 = (byte[][][]) null;
        class337.field5188 = (byte[][][]) null;
        class190.field2979 = (int[][][]) null;
        class297.field4608 = null;
        if (arg0 < 114) {
            field3009 = (class246) null;
        }
        class174.field2760 = null;
        class317.field4889 = null;
        field2992++;
        class19.field314 = (byte[][][]) null;
        class235.field3658 = (byte[][][]) null;
        class66.field1002 = null;
        class14.field235 = null;
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V", line = 29)
    public static void method1456(int arg0) {
        field3010 = null;
        field3009 = null;
        field3002 = null;
        if (arg0 != 2) {
            field3005 = 104;
        }
        field3008 = null;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(IB)[[I", line = 45)
    public int[][] method156(int arg0, byte arg1) {
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (arg1 > -126) {
            this.method156(116, (byte) -54);
        }
        if (this.field1227.field4277 && this.method1459(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class181.field2836 == this.field2995 ? arg0 : this.field2995 * arg0 / class181.field2836) * this.field2999;
            if (class93.field1424 == this.field2999) {
                for (int var11 = 0; var11 < class93.field1424; var11++) {
                    int var12 = this.field2997[var7++];
                    var6[var11] = class301.method2169(var12, 255) << 4;
                    var5[var11] = class301.method2169(var12 >> 4, 4080);
                    var4[var11] = class301.method2169(4080, var12 >> 12);
                }
            } else {
                for (int var8 = 0; var8 < class93.field1424; var8++) {
                    int var9 = this.field2999 * var8 / class93.field1424;
                    int var10 = this.field2997[var7 + var9];
                    var6[var8] = class301.method2169(4080, var10 << 4);
                    var5[var8] = class301.method2169(var10, 65280) >> 4;
                    var4[var8] = class301.method2169(var10 >> 12, 4080);
                }
            }
        }
        field2998++;
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)Ljava/lang/String;", line = 116)
    public static final String method1457(int arg0, int arg1) {
        field3001++;
        if (~arg1 <= arg0) {
            return arg1 < 10000000 ? "<col=ffffff>" + arg1 / 1000 + class184.field2893 + "</col>" : "<col=00ff80>" + arg1 / 1000000 + class238.field3688 + "</col>";
        } else {
            return "<col=ffff00>" + arg1 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 133)
    public static final int method1458(String arg0, boolean arg1) {
        field2993++;
        if (arg0 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg1) {
            return 24;
        }
        while (var2 < class131.field2215) {
            if (arg0.equalsIgnoreCase(class83.field1197[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V", line = 161)
    public final void method779(boolean arg0) {
        super.method779(arg0);
        this.field2997 = null;
        field3011++;
    }

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)Z", line = 172)
    public final boolean method1459(int arg0) {
        field3013++;
        if (this.field2997 != null) {
            return true;
        }
        if (arg0 != 0) {
            this.method1459(90);
        }
        if (this.field3012 < 0) {
            return false;
        }
        class361 var2 = class133.field2233 >= 0 ? class344.method2421(class133.field2233, true, class133.field2232, this.field3012) : class247.method1854(class133.field2232, 255, this.field3012);
        var2.method2541();
        this.field2999 = var2.field3366;
        this.field2997 = var2.field5720;
        this.field2995 = var2.field3367;
        return true;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)I", line = 206)
    public final int method778(int arg0) {
        field2996++;
        if (arg0 <= 78) {
            method1460(119);
        }
        return this.field3012;
    }

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "(I)I", line = 218)
    public static final int method1460(int arg0) {
        if (arg0 != -3086) {
            method1460(11);
        }
        field2994++;
        return class208.field3205 && class116.field1774[81] && class66.field1006 > 2 ? class78.field1134[class66.field1006 - 2] : class78.field1134[class66.field1006 - 1];
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 240)
    public class191() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZIIIIIIIIIB)V", line = 246)
    public static final void method1461(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field3000++;
        int var11 = 111 % ((arg10 - 42) / 61);
        if (class173.field2746.method808(127) == 2) {
            class264.method1953(arg9, arg5, arg8, arg1, arg4, arg2, arg6, arg7, arg0, arg3, (byte) 51);
        } else if (class173.field2746.method808(118) > 2) {
            class110.method954(arg9, 2884064, arg8, arg5, arg7, arg3, class173.field2746.method808(-29), arg6, arg2, arg1, arg4, arg0);
        } else {
            class104.method901(arg7, (byte) -84, arg5, arg9, arg6, arg8, arg1, arg2, arg4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZLug;)V", line = 267)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field3004++;
        if (arg0 == 0) {
            this.field3012 = arg2.method314((byte) 91);
        }
        if (arg1) {
            field3010 = (class114) null;
        }
    }
}
