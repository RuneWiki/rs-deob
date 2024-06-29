import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public abstract class class111 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Lsk;")
    public static class423 field1898 = new class423("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII[FII)V")
    public static final void method793(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        field1899++;
        if (arg5 > 0 && !class110.method789(arg5, 1135345664)) {
            throw new IllegalArgumentException("");
        }
        if (arg1 != 1) {
            method798(125);
        }
        if (arg6 > 0 && !class110.method789(arg6, 1135345664)) {
            throw new IllegalArgumentException("");
        }
        int var7 = class287.method1746(-121, arg2);
        int var8 = 0;
        int var9 = arg6 <= arg5 ? arg6 : arg5;
        int var10 = arg5 >> 1;
        int var11 = arg6 >> 1;
        float[] var12 = arg4;
        float[] var13 = new float[var7 * var11 * var10];
        while (true) {
            OpenGL.glTexImage2Df(arg0, var8, arg3, arg5, arg6, 0, arg2, 5126, var12, 0);
            if (var9 <= 1) {
                return;
            }
            int var14 = arg5 * var7;
            float[] var15 = var13;
            for (int var16 = 0; var16 < var7; var16++) {
                int var17 = var16;
                int var18 = var16;
                int var19 = var14 + var16;
                for (int var20 = 0; var20 < var11; var20++) {
                    for (int var21 = 0; var21 < var10; var21++) {
                        float var22 = var12[var18];
                        int var23 = var7 + var18;
                        float var24 = var12[var23] + var22;
                        float var25 = var12[var19] + var24;
                        var18 = var7 + var23;
                        int var26 = var7 + var19;
                        float var27 = var12[var26] + var25;
                        var19 = var7 + var26;
                        var13[var17] = var27 * 0.25F;
                        var17 += var7;
                    }
                    var19 += var14;
                    var18 += var14;
                }
            }
            var13 = var12;
            arg5 = var10;
            arg6 = var11;
            var12 = var15;
            var11 >>= 0x1;
            var10 >>= 0x1;
            var8++;
            var9 >>= 0x1;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(FIFI[FZIFIFI)V")
    public abstract void method794(float arg0, int arg1, float arg2, int arg3, float[] arg4, boolean arg5, int arg6, float arg7, int arg8, float arg9, int arg10);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
    public static final void method795() {
        class218.method1337(1, class483.field7381);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()V")
    public static final void method796() {
        if (class20.field253 != null) {
            for (int var0 = 0; var0 < class20.field253.length; var0++) {
                for (int var1 = 0; var1 < class377.field5492; var1++) {
                    for (int var2 = 0; var2 < class347.field5132; var2++) {
                        if (class20.field253[var0][var1][var2] != null) {
                            class20.field253[var0][var1][var2].method1632((byte) 93);
                        }
                        class20.field253[var0][var1][var2] = null;
                    }
                }
            }
        }
        class20.field253 = null;
        class201.field3195 = null;
        if (class471.field7206 != null) {
            for (int var3 = 0; var3 < class471.field7206.length; var3++) {
                for (int var4 = 0; var4 < class377.field5492; var4++) {
                    for (int var5 = 0; var5 < class347.field5132; var5++) {
                        if (class471.field7206[var3][var4][var5] != null) {
                            class471.field7206[var3][var4][var5].method1632((byte) 88);
                        }
                        class471.field7206[var3][var4][var5] = null;
                    }
                }
            }
        }
        class471.field7206 = null;
        class262.field3978 = null;
        class321.field4830 = null;
        class99.field1801 = null;
        class370.field5434 = 0;
        if (class150.field2419 != null) {
            for (int var6 = 0; var6 < class370.field5434; var6++) {
                class150.field2419[var6] = null;
            }
        }
        if (class355.field5297 != null) {
            for (int var7 = 0; var7 < class103.field1830; var7++) {
                class355.field5297[var7] = null;
            }
            class103.field1830 = 0;
        }
        if (class162.field2532 != null) {
            for (int var8 = 0; var8 < class51.field766; var8++) {
                class162.field2532[var8] = null;
            }
            for (int var9 = 0; var9 < class483.field7381; var9++) {
                for (int var10 = 0; var10 < class377.field5492; var10++) {
                    for (int var11 = 0; var11 < class347.field5132; var11++) {
                        class155.field2450[var9][var10][var11] = 0L;
                    }
                }
            }
            class51.field766 = 0;
        }
        class17.field237 = null;
        class57.method406((byte) -122);
        class359.field5315.method1317(3);
        class31.field407 = null;
        class280.field4251 = null;
        class226.field3467 = null;
        class100.field1810 = null;
        class144.field2346 = null;
        class179.field2801 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static final void method797(int arg0) {
        field1900++;
        if (arg0 != 0) {
            field1903 = -96;
        }
        if (class462.field7108 != null) {
            class462.field7108.method1638(true);
        }
        if (class386.field5607 != null) {
            class386.field5607.method1638(true);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static void method798(int arg0) {
        field1898 = null;
        if (arg0 != -28123) {
            method800(null, 65);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Z")
    public static final boolean method799(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method798(74);
        }
        field1902++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method800(String arg0, int arg1) {
        field1901++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class290.method1768(arg0, false);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg1 != 1) {
            field1903 = 86;
        }
        while (class7.field79 > var3) {
            String var4 = class51.field767[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class290.method1768(var4, false);
            if (var5 != null && var5.equals(var2)) {
                class7.field79--;
                for (int var6 = var3; var6 < class7.field79; var6++) {
                    class51.field767[var6] = class51.field767[var6 + 1];
                    class472.field7212[var6] = class472.field7212[var6 + 1];
                    class366.field5375[var6] = class366.field5375[var6 + 1];
                    class296.field4497[var6] = class296.field4497[var6 + 1];
                    class478.field7308[var6] = class478.field7308[var6 + 1];
                    class147.field2388[var6] = class147.field2388[var6 + 1];
                }
                class191.field3037++;
                class153.field2448 = class298.field4515;
                class400.method2379((byte) -75, class231.field3516);
                class230.field3508.method221(-1, class220.method1343(arg0, (byte) -82));
                class230.field3508.method240(arg0, 125);
                return;
            }
            var3++;
        }
    }
}
