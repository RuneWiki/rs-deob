import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class44 {

    @OriginalMember(owner = "client!m", name = "b", descriptor = "[Z")
    public static boolean[] field526 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Z")
    public static boolean field527 = false;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[I")
    public static int[] field528 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field530;

    // $FF: synthetic field
    @OriginalMember(owner = "client!m", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field531;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "[I")
    public static int[] field525;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method279(int arg0) {
        field525 = null;
        if (arg0 != 0) {
            field525 = null;
        }
        field528 = null;
        field526 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lpk;Z)V")
    public static final void method280(class43 arg0, boolean arg1) {
        for (int var2 = 0; var2 < class7.field96.length; var2++) {
            class7.field96[var2] = 0;
        }
        short var3 = 256;
        if (!arg1) {
            return;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * Math.random() * 128.0D);
            class7.field96[var16] = (int) (Math.random() * 284.0D);
        }
        field530++;
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class88.field1190[var15] = (class7.field96[var15 - 1] + class7.field96[var15 + 128] + class7.field96[var15 - 128] + class7.field96[var15 + 1]) / 4;
                }
            }
            int[] var13 = class7.field96;
            class7.field96 = class88.field1190;
            class88.field1190 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field11; var7++) {
            for (int var8 = 0; var8 < arg0.field18; var8++) {
                if (arg0.field523[var6++] != 0) {
                    int var9 = arg0.field13 + var8 + 16;
                    int var10 = var7 + arg0.field14 + 16;
                    int var11 = (var10 << 7) + var9;
                    class7.field96[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static final void method281(boolean arg0) {
        try {
            if (arg0) {
                field526 = null;
            }
            Method var1 = (field531 == null ? (field531 = method283("java.lang.Runtime")) : field531).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class224.field3163 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field529++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIIILca;IZJ)Z")
    public static final boolean method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class131 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class290.field4536 == class220.field3122;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class268.field3922 || var24 >= class97.field1292) {
                    return false;
                }
                class133 var25 = class6.field94[arg0][var15][var24];
                if (var25 != null && var25.field1934 >= 5) {
                    return false;
                }
            }
        }
        class243 var16 = new class243();
        var16.field3539 = arg11;
        var16.field3534 = arg0;
        var16.field3538 = arg5;
        var16.field3542 = arg6;
        var16.field3530 = arg7;
        var16.field3526 = arg8;
        var16.field3543 = arg9;
        var16.field3540 = arg1;
        var16.field3527 = arg2;
        var16.field3533 = arg1 + arg3 - 1;
        var16.field3532 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class6.field94[var22][var17][var20] == null) {
                        class6.field94[var22][var17][var20] = new class133(var22, var17, var20);
                    }
                }
                class133 var23 = class6.field94[arg0][var17][var20];
                var23.field1930[var23.field1934] = var16;
                var23.field1941[var23.field1934] = var21;
                var23.field1919 |= var21;
                var23.field1934++;
                if (var13 && class91.field1244[var17][var20] != 0) {
                    var14 = class91.field1244[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class91.field1244[var18][var19] == 0) {
                        class91.field1244[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class293.field4632[class200.field2845++] = var16;
        }
        return true;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method283(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
