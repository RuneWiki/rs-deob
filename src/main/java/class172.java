import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class172 extends class184 {

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    private int field3135;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "[Z")
    public boolean[] field3147;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "[[I")
    public int[][] field3133;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "[I")
    public int[] field3137;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field3142 = 0;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "Lsf;")
    private static class108 field3145 = class140.method973(255, "Checking for updates )2 ");

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field3146 = 0;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Lsf;")
    public static class108 field3139 = field3145;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Z")
    public static boolean field3132 = false;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "Lik;")
    public static class262 field3141;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILjava/awt/Component;)Lr;", line = 5)
    public static final class274 method1220(int arg0, int arg1, int arg2, Component arg3) {
        field3140++;
        try {
            Class var4 = Class.forName("lf");
            class274 var5 = (class274) var4.getDeclaredConstructor().newInstance();
            if (arg0 != 0) {
                field3145 = (class108) null;
            }
            var5.method263((byte) -105, arg2, arg1, arg3);
            return var5;
        } catch (Throwable var8) {
            class38 var7 = new class38();
            var7.method263((byte) 125, arg2, arg1, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 28)
    public static final void method1221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class140 var20 = new class140(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class99.field1759[var21][arg1][arg2] == null) {
                    class99.field1759[var21][arg1][arg2] = new class74(var21, arg1, arg2);
                }
            }
            class99.field1759[arg0][arg1][arg2].field1122 = var20;
        } else if (arg3 == 1) {
            class140 var22 = new class140(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class99.field1759[var23][arg1][arg2] == null) {
                    class99.field1759[var23][arg1][arg2] = new class74(var23, arg1, arg2);
                }
            }
            class99.field1759[arg0][arg1][arg2].field1122 = var22;
        } else {
            class18 var24 = new class18(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class99.field1759[var25][arg1][arg2] == null) {
                    class99.field1759[var25][arg1][arg2] = new class74(var25, arg1, arg2);
                }
            }
            class99.field1759[arg0][arg1][arg2].field1144 = var24;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIII)V", line = 81)
    public static final void method1222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3148++;
        int var9 = arg5 - arg2;
        if (arg0 >= -105) {
            field3145 = (class108) null;
        }
        int var10 = arg6 - arg8;
        int var11 = (arg3 - arg1 << 16) / var10;
        int var12 = (arg4 - arg7 << 16) / var9;
        class93.method629(arg2, var12, 0, 0, arg7, arg5, arg8, 983040, var11, arg6, arg1);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V", line = 114)
    public static final void method1223(int arg0) {
        field3134++;
        class119.method837();
        if (arg0 == -32511) {
            for (int var1 = 0; var1 < 4; var1++) {
                class330.field5644[var1].method2248(4256);
            }
            System.gc();
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLik;Lik;)V", line = 137)
    public static final void method1224(byte arg0, class262 arg1, class262 arg2) {
        field3136++;
        class223.field3953 = class128.method884(arg1, arg2, class147.field2637, -1, 0);
        if (class231.field4051) {
            class318.field5470 = class146.method1021(arg2, class147.field2637, arg1, 0, 522598380);
        } else {
            class318.field5470 = (class250) class223.field3953;
        }
        class158.field2850 = class128.method884(arg1, arg2, class72.field1091, -1, 0);
        if (arg0 >= -84) {
            method1227((byte) 84);
        }
        class256.field4525 = class128.method884(arg1, arg2, class175.field3190, -1, 0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZB)V", line = 156)
    public static final void method1225(boolean arg0, byte arg1) {
        if (arg1 > -102) {
            method1227((byte) -82);
        }
        for (class299 var2 = (class299) class273.field4794.method13(0); var2 != null; var2 = (class299) class273.field4794.method15((byte) 47)) {
            if (var2.field5220 != null) {
                class213.field3789.method2186(var2.field5220);
                var2.field5220 = null;
            }
            if (var2.field5222 != null) {
                class213.field3789.method2186(var2.field5222);
                var2.field5222 = null;
            }
            var2.method1325(0);
        }
        field3144++;
        if (!arg0) {
            return;
        }
        for (class299 var3 = (class299) class277.field4856.method13(0); var3 != null; var3 = (class299) class277.field4856.method15((byte) 47)) {
            if (var3.field5220 != null) {
                class213.field3789.method2186(var3.field5220);
                var3.field5220 = null;
            }
            var3.method1325(0);
        }
        for (class299 var4 = (class299) class36.field494.method1672(0); var4 != null; var4 = (class299) class36.field494.method1678(21)) {
            if (var4.field5220 != null) {
                class213.field3789.method2186(var4.field5220);
                var4.field5220 = null;
            }
            var4.method1325(0);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I[B)V", line = 235)
    public class172(int arg0, byte[] arg1) {
        this.field3149 = arg0;
        class249 var3 = new class249(arg1);
        this.field3135 = var3.method1731(true);
        this.field3147 = new boolean[this.field3135];
        this.field3133 = new int[this.field3135][];
        this.field3137 = new int[this.field3135];
        for (int var4 = 0; var4 < this.field3135; var4++) {
            this.field3137[var4] = var3.method1731(true);
        }
        for (int var5 = 0; var5 < this.field3135; var5++) {
            this.field3147[var5] = var3.method1731(true) == 1;
        }
        for (int var6 = 0; var6 < this.field3135; var6++) {
            this.field3133[var6] = new int[var3.method1731(true)];
        }
        for (int var7 = 0; var7 < this.field3135; var7++) {
            for (int var8 = 0; var8 < this.field3133[var7].length; var8++) {
                this.field3133[var7][var8] = var3.method1731(true);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljh;IIIZI)V", line = 286)
    public static final void method1226(class272 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3143++;
        if (class315.field5419 >= 50 || arg0.field4763 == null || arg3 >= arg0.field4763.length || arg0.field4763[arg3] == null) {
            return;
        }
        int var6 = arg0.field4763[arg3][0];
        int var7 = var6 >> 8;
        if (arg0.field4763[arg3].length > 1) {
            int var8 = (int) (Math.random() * (double) arg0.field4763[arg3].length);
            if (var8 > 0) {
                var7 = arg0.field4763[arg3][var8];
            }
        }
        if (arg2 != -21329) {
            field3132 = false;
        }
        int var9 = (var6 & 0x72) >> 4;
        int var10 = var6 & 0xF;
        if (var10 == 0) {
            if (arg4) {
                class224.method1522(var7, 0, var9, -1);
            }
        } else if (class42.field561 != 0) {
            class21.field322[class315.field5419] = var7;
            class266.field4681[class315.field5419] = var9;
            int var11 = (arg5 - 64) / 128;
            class54.field796[class315.field5419] = 0;
            int var12 = (arg1 - 64) / 128;
            class154.field2768[class315.field5419] = null;
            class62.field1004[class315.field5419] = (var11 << 16) + (var12 << 8) + var10;
            class315.field5419++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V", line = 357)
    public static void method1227(byte arg0) {
        if (arg0 <= -111) {
            field3139 = null;
            field3145 = null;
            field3141 = null;
        }
    }
}
