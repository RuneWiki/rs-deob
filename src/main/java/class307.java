import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class307 extends class381 {

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "[Lfp;")
    public static class7[] field4163 = new class7[29];

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "[I")
    public static int[] field4166 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field4152;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public int field4154;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public int field4156;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public int field4159;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public int field4160;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public int field4161;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public int field4162;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public int field4164;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public int field4167;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public int field4168;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "[I")
    public static int[] field4151;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static final void method1976(boolean arg0) {
        field4165++;
        if (arg0) {
            class410 var1 = class417.field5844;
            synchronized (class417.field5844) {
                class417.field5844.method2533(0);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    public static void method1977(int arg0) {
        if (arg0 == 0) {
            field4151 = null;
            field4166 = null;
            field4163 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V")
    public static final void method1978(byte arg0) {
        field4155++;
        if (arg0 != -75) {
            method1976(true);
        }
        if (class293.field3959 == null) {
            return;
        }
        while (true) {
            while (class167.field2477 < class365.field5034.length) {
                class187 var1 = class365.field5034[class167.field2477];
                if (var1 != null && var1.field2706 == -1) {
                    if (class322.field4363 == null) {
                        class322.field4363 = class293.field3959.method2713(-92, var1.field2700);
                    }
                    int var2 = class322.field4363.field3251;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field2706 = var2;
                    class322.field4363 = null;
                    class167.field2477++;
                } else {
                    class167.field2477++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([JIIZ[Ljava/lang/Object;)V")
    public static final void method1979(long[] arg0, int arg1, int arg2, boolean arg3, Object[] arg4) {
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (var7 + ((long) (var10 & 0x1)) > arg0[var10]) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    Object var13 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var13;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var9;
            method1979(arg0, arg1, var6 - 1, arg3, arg4);
            method1979(arg0, var6 + 1, arg2, false, arg4);
        }
        if (arg3) {
            field4151 = null;
        }
        field4158++;
    }
}
