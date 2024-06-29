import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class184 {

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "Z")
    public boolean field2251 = true;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "[Lrda;")
    public static class613[] field2252 = new class613[2048];

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field2257 = 0;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "C")
    private char field2255;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "Ljava/lang/String;")
    public String field2249;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 5)
    public static void method1143(int arg0) {
        if (arg0 != 0) {
            method1143(-65);
        }
        field2252 = null;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)Z", line = 23)
    public final boolean method1144(int arg0) {
        field2258++;
        if (arg0 != -5) {
            field2257 = -26;
        }
        return this.field2255 == 's';
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "()V", line = 38)
    public static final void method1145() {
        for (int var0 = class342.field4521; var0 < class663.field9391; var0++) {
            for (int var1 = 0; var1 < class455.field6393; var1++) {
                for (int var2 = 0; var2 < class302.field4057; var2++) {
                    class433 var3 = class281.field3808[var0][var1][var2];
                    if (var3 != null) {
                        class242 var4 = var3.field6217;
                        class242 var5 = var3.field6210;
                        if (var4 != null && var4.method167((byte) 118)) {
                            class471.method2765(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method167((byte) 118)) {
                                class471.method2765(var5, var0, var1, var2, 1, 1);
                                var5.method169(0, 0, false, class298.field4017, 126, var4, 0);
                                var5.method163(98);
                            }
                            var4.method163(102);
                        }
                        for (class182 var6 = var3.field6218; var6 != null; var6 = var6.field2226) {
                            class43 var8 = var6.field2227;
                            if (var8 != null && var8.method167((byte) 118)) {
                                class471.method2765(var8, var0, var1, var2, var8.field770 + 1 - var8.field769, var8.field765 - var8.field768 + 1);
                                var8.method163(105);
                            }
                        }
                        class524 var7 = var3.field6221;
                        if (var7 != null && var7.method167((byte) 118)) {
                            class588.method3411(var7, var0, var1, var2);
                            var7.method163(-117);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[Ljava/lang/Object;I[IB)V", line = 117)
    public static final void method1146(int arg0, Object[] arg1, int arg2, int[] arg3, byte arg4) {
        if (arg4 != -107) {
            return;
        }
        if (arg2 > arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if (arg3[var10] < (var10 & var9) + var7) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method1146(arg0, arg1, var6 - 1, arg3, (byte) -107);
            method1146(var6 + 1, arg1, arg2, arg3, (byte) -107);
        }
        field2254++;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBLun;)V", line = 173)
    private final void method1147(int arg0, byte arg1, class389 arg2) {
        if (arg0 == 1) {
            this.field2255 = class507.method3016((byte) -88, arg2.method2249((byte) -70));
        } else if (arg0 == 2) {
            this.field2253 = arg2.method2255(255);
        } else if (arg0 == 4) {
            this.field2251 = false;
        } else if (arg0 == 5) {
            this.field2249 = arg2.method2244((byte) -83);
        }
        if (arg1 <= 101) {
            method1143(-96);
        }
        field2256++;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(CI)Z", line = 202)
    public static final boolean method1148(char arg0, int arg1) {
        field2250++;
        int var2 = -70 % ((21 - arg1) / 47);
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var3 = class661.field9379;
            for (int var4 = 0; var4 < var3.length; var4++) {
                char var5 = var3[var4];
                if (arg0 == var5) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BLun;)V", line = 239)
    public final void method1149(byte arg0, class389 arg1) {
        if (arg0 != -51) {
            method1143(-71);
        }
        field2259++;
        while (true) {
            int var3 = arg1.method2229(arg0 ^ 0xFFFFFF32);
            if (var3 == 0) {
                return;
            }
            this.method1147(var3, (byte) 118, arg1);
        }
    }
}
