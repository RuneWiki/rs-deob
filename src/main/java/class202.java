import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class202 extends class197 {

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    private int field3242 = -32768;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Z")
    public static boolean field3246 = false;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field3248 = 0;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "[I")
    public static int[] field3249 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Leg;")
    public static class272 field3239 = new class272(64);

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public int field3245;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public int field3250;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Ljj;")
    public static class134 field3244;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fc", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field3252;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method1356(int arg0) {
        try {
            Method var1 = (field3252 == null ? (field3252 = method1360("java.lang.Runtime")) : field3252).getMethod("maxMemory");
            int var2 = 98 % ((-arg0 - 4) / 48);
            if (var1 != null) {
                try {
                    Runtime var3 = Runtime.getRuntime();
                    Long var4 = (Long) var1.invoke(var3, (Object[]) null);
                    class30.field370 = (int) (var4 / 1048576L) + 1;
                } catch (Throwable var5) {
                }
            }
        } catch (Exception var6) {
        }
        field3247++;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I")
    public static final int method1357(int arg0) {
        if (arg0 < 49) {
            method1356(60);
        }
        class222.field3530 = 0;
        field3251++;
        return class271.method1829(-1);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()I")
    public final int method88() {
        field3243++;
        return this.field3242;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIJILqc;)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class4 arg10) {
        field3241++;
        class13 var13 = class64.method514(this.field3250, 0).method1400(-1, 0, 0, this.field3245, (class95) null, (class21) null, (byte) 113);
        if (var13 != null) {
            var13.method85(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field3242 = var13.method88();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILli;JLli;Lli;)V")
    public static final void method1358(int arg0, int arg1, int arg2, int arg3, class197 arg4, long arg5, class197 arg6, class197 arg7) {
        class82 var9 = new class82();
        var9.field1135 = arg4;
        var9.field1138 = arg1 * 128 + 64;
        var9.field1131 = arg2 * 128 + 64;
        var9.field1132 = arg3;
        var9.field1142 = arg5;
        var9.field1145 = arg6;
        var9.field1136 = arg7;
        int var10 = 0;
        class99 var11 = class273.field4415[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1503; var12++) {
                class138 var13 = var11.field1496[var12];
                if ((var13.field2275 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2291.method88();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1133 = -var10;
        if (class273.field4415[arg0][arg1][arg2] == null) {
            class273.field4415[arg0][arg1][arg2] = new class99(arg0, arg1, arg2);
        }
        class273.field4415[arg0][arg1][arg2].field1500 = var9;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public static void method1359(int arg0) {
        field3249 = null;
        field3239 = null;
        field3244 = null;
        int var1 = -108 % ((arg0 + 66) / 55);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3240++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1360(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
