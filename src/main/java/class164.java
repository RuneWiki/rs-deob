import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class164 extends class170 {

    @OriginalMember(owner = "client!j", name = "db", descriptor = "Lqk;")
    public static class207 field2896 = class24.method212(255, " GMT");

    @OriginalMember(owner = "client!j", name = "ib", descriptor = "Lqk;")
    private static class207 field2901 = class24.method212(255, "Loading sprites )2 ");

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "Lqk;")
    public static class207 field2891 = field2901;

    @OriginalMember(owner = "client!j", name = "kb", descriptor = "I")
    public static int field2903 = 0;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "I")
    private static int field2889 = 0;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!j", name = "jb", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!j", name = "mb", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!j", name = "nb", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!j", name = "ob", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!j", name = "lb", descriptor = "Lle;")
    public static class42 field2904;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V")
    public static final void method1184(boolean arg0, int arg1) {
        ++field2892;
        if (~arg1 <= -1 && ~arg1 > ~class195.field3435.length) {
            if (arg0) {
                class195.field3435[arg1] = !class195.field3435[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lpk;II)Luh;")
    public static final class100 method1185(class99 arg0, int arg1, int arg2) {
        ++field2897;
        if (!class135.method943(arg2, arg0, 2)) {
            return null;
        } else {
            return arg1 != -2048 ? null : class155.method1137(-1);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class164() {
        super(1, false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)Llg;")
    public static final class13 method1186(int arg0, byte arg1) {
        if (arg1 != 44) {
            field2898 = -44;
        }
        ++field2899;
        class13 var2 = (class13) class65.field1165.method1387((long) arg0, 127);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class199.field3499.method705(34, arg0, arg1 ^ -45);
            class13 var4 = new class13();
            if (var3 != null) {
                var4.method75(arg0, 20, new class149(var3));
            }
            class65.field1165.method1385((long) arg0, var4, (byte) -126);
            return var4;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
    public static void method1187(byte arg0) {
        int var1 = 3 / ((arg0 - -23) / 38);
        field2901 = null;
        field2904 = null;
        field2896 = null;
        field2891 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)V")
    public static final void method1188(int arg0, byte arg1, int arg2) {
        class90 var3 = class221.method1575(13, arg2, 1651481952);
        var3.method648((byte) -90);
        if (arg1 > -83) {
            method1189((class207) null, (byte) 79);
        }
        var3.field1621 = arg0;
        ++field2907;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lqk;B)V")
    public static final void method1189(class207 arg0, byte arg1) {
        if (arg1 != -24) {
            method1187((byte) 83);
        }
        int var2 = class167.method1204(arg0, -1);
        ++field2893;
        if (var2 != -1) {
            class31.method240(class57.field1052.field3294[var2], class57.field1052.field3297[var2], true);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 == 5877) {
            if (~arg2 == -1) {
                super.field2998 = ~arg0.method1045((byte) 107) == -2;
            }
            ++field2900;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILpk;)V")
    public static final void method1190(int arg0, class99 arg1) {
        if (arg0 != -11147) {
            field2891 = null;
        }
        ++field2905;
        class266.field4712 = arg1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field2894;
        int[] var3 = super.field3001.method1538(arg0 ^ -78, arg1);
        if (super.field3001.field3835) {
            for (int var4 = 0; var4 < class88.field1595; ++var4) {
                this.method1191(true, var4, arg1);
                int[] var5 = this.method1226(0, class6.field90, -32);
                var3[var4] = var5[field2889];
            }
        }
        if (arg0 != -30) {
            field2889 = -100;
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)V")
    private final void method1191(boolean arg0, int arg1, int arg2) {
        int var4 = class68.field1211[arg1];
        int var5 = class282.field4964[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        ++field2895;
        if (arg0) {
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                field2889 = arg1;
                class6.field90 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class6.field90 = arg1;
                field2889 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class6.field90 = arg1;
                field2889 = -arg2 + class88.field1595;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class6.field90 = -arg2 + class30.field620;
                field2889 = arg1;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                field2889 = -arg1 + class88.field1595;
                class6.field90 = -arg2 + class30.field620;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                field2889 = -arg2 + class88.field1595;
                class6.field90 = -arg1 + class30.field620;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class6.field90 = class30.field620 - arg1;
                field2889 = arg2;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                field2889 = class88.field1595 - arg1;
                class6.field90 = arg2;
            }
            class6.field90 &= class233.field4294;
            field2889 &= class94.field1684;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        int[][] var3 = super.field3002.method427(arg0, 239);
        if (super.field3002.field1077) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            for (int var7 = 0; var7 < class88.field1595; ++var7) {
                this.method1191(true, var7, arg0);
                int[][] var8 = this.method1223(0, -82, class6.field90);
                var6[var7] = var8[0][field2889];
                var4[var7] = var8[1][field2889];
                var5[var7] = var8[2][field2889];
            }
        }
        ++field2906;
        return arg1 ? null : var3;
    }
}
