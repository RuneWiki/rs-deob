import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class172 {

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
    public int field2840 = 128;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    public int field2842 = 128;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "Lsh;")
    public static class62 field2837 = new class62();

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)Lov;")
    public final class172 method1292(int arg0) {
        if (arg0 < 99) {
            this.field2847 = -52;
        }
        field2843++;
        return new class172(this.field2844, this.field2842, this.field2840, this.field2841, this.field2846, this.field2847);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1293(byte arg0, String arg1) {
        field2845++;
        if (arg0 != -120) {
            method1294((byte) 88);
        }
        String var2 = null;
        int var3 = arg1.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg1.substring(0, var3 + 4);
            arg1 = arg1.substring(var3 + 4);
        }
        if (arg1.startsWith("directlogin ")) {
            int var4 = arg1.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg1.length();
                arg1 = arg1.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var2 == null ? arg1 : var2 + arg1;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
    public static void method1294(byte arg0) {
        field2837 = null;
        if (arg0 != 19) {
            field2837 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lov;I)V")
    public final void method1295(class172 arg0, int arg1) {
        this.field2840 = arg0.field2840;
        this.field2842 = arg0.field2842;
        field2839++;
        this.field2844 = arg0.field2844;
        this.field2841 = arg0.field2841;
        this.field2847 = arg0.field2847;
        if (arg1 != 1) {
            method1293((byte) -34, null);
        }
        this.field2846 = arg0.field2846;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(I)V")
    public class172(int arg0) {
        this.field2844 = arg0;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(IIIIII)V")
    private class172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2841 = arg3;
        this.field2840 = arg2;
        this.field2844 = arg0;
        this.field2847 = arg5;
        this.field2846 = arg4;
        this.field2842 = arg1;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILlk;ILua;ZIIILr;)V")
    public static final void method1296(int arg0, class545 arg1, int arg2, class619 arg3, boolean arg4, int arg5, int arg6, int arg7, class167 arg8) {
        if (arg4) {
            field2837 = null;
        }
        field2838++;
        class288 var9 = class342.field5099.method3355(arg0, (byte) 15);
        if (var9 == null || !var9.field4334 || !var9.method1923(class113.field2038, 31846)) {
            return;
        }
        if (var9.field4295 != null) {
            int[] var10 = new int[var9.field4295.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class423.field6123 == 4) {
                    var13 = (int) class591.field8509 & 0x3FFF;
                } else {
                    var13 = (int) class591.field8509 + class527.field7433 & 0x3FFF;
                }
                int var14 = class509.field7210[var13];
                int var15 = class509.field7220[var13];
                if (class423.field6123 != 4) {
                    var15 = var15 * 256 / (class130.field2350 + 256);
                    var14 = var14 * 256 / (class130.field2350 + 256);
                }
                var10[var11 * 2] = arg1.field7718 / 2 + ((arg2 + (var9.field4295[var11 * 2 + 1] * 4)) * var14 + ((arg5 + (var9.field4295[var11 * 2] * 4)) * var15) >> 14) + arg7;
                var10[var11 * 2 + 1] = arg1.field7652 / 2 + arg6 - ((arg2 + (var9.field4295[var11 * 2 + 1] * 4)) * var15 - ((var9.field4295[var11 * 2] * 4 + arg5) * var14) >> 14);
            }
            class340.method2186(arg8, var10, var9.field4302, arg1.field7665, arg1.field7644);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg8.method24(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field4323, 1, arg3, arg7, arg6);
            }
            arg8.method24(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field4323, 1, arg3, arg7, arg6);
        }
        class702 var16 = null;
        if (var9.field4306 != -1) {
            var16 = var9.method1916(arg8, -124, false);
            if (var16 != null) {
                class36.method533(arg1, arg2, 15687, arg6, arg5, arg3, var16, arg7);
            }
        }
        if (var9.field4308 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method1785();
        }
        class421 var18 = class542.field7569;
        class11 var19 = class79.field1581;
        if (var9.field4297 == 1) {
            var18 = class363.field5394;
            var19 = class612.field8916;
        }
        if (var9.field4297 == 2) {
            var18 = class367.field5445;
            var19 = class141.field2478;
        }
        class66.method767(arg3, arg6, arg2, arg7, arg1, var18, var17, -56, var9.field4308, arg5, var19, var9.field4314);
        return;
    }
}
