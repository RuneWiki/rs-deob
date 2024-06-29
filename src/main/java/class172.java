import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class172 {

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "J")
    public long field2569 = 0L;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[I")
    public static int[] field2561 = new int[4096];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public int field2557;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public int field2559;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Lbf;")
    public class205 field2566;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[Lag;")
    public static class188[] field2555;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public static final void method1135(int arg0, int arg1) {
        class249.field3839.method1778(arg1, -61);
        if (arg0 < 112) {
            field2555 = null;
        }
        class25.field390.method1778(arg1, -97);
        field2554++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lna;III)V")
    public static final void method1136(class32 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field4210 == arg2 && arg2 != -1) {
            class223 var4 = class28.method224(arg2, 127);
            int var5 = var4.field3509;
            if (var5 == 1) {
                arg0.field4196 = 1;
                arg0.field4179 = arg1;
                arg0.field4185 = 0;
                arg0.field4194 = 0;
                arg0.field4181 = 0;
                class56.method452((byte) 126, arg0.field4185, arg0.field4176, var4, false, arg0.field4123);
            }
            if (var5 == 2) {
                arg0.field4181 = 0;
            }
        } else if (arg2 == -1 || arg0.field4210 == -1 || class28.method224(arg2, 97).field3481 >= class28.method224(arg0.field4210, arg3 ^ 0x2443).field3481) {
            arg0.field4181 = 0;
            arg0.field4179 = arg1;
            arg0.field4210 = arg2;
            arg0.field4194 = 0;
            arg0.field4196 = 1;
            arg0.field4151 = arg0.field4208;
            arg0.field4185 = 0;
            if (arg0.field4210 != -1) {
                class56.method452((byte) 105, arg0.field4185, arg0.field4176, class28.method224(arg0.field4210, arg3 ^ 0x2453), false, arg0.field4123);
            }
        }
        if (arg3 != 9261) {
            method1138((byte) 99, (byte) 96);
        }
        field2567++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZD)V")
    public static final void method1137(boolean arg0, double arg1) {
        field2562++;
        if (!arg0) {
            method1140(-95);
        }
        if (class211.field3276 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class48.field785[var3] = var4 > 255 ? 255 : var4;
        }
        class211.field3276 = arg1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BB)V")
    public static final void method1138(byte arg0, byte arg1) {
        if (class140.field2150 == null) {
            class140.field2150 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class140.field2150[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 != -126) {
            field2561 = null;
        }
        field2571++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method1139(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class37.field632[var1] = true;
        }
        field2564++;
        if (arg0 <= 77) {
            field2561 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static void method1140(int arg0) {
        if (arg0 != -3) {
            field2561 = null;
        }
        field2561 = null;
        field2555 = null;
    }
}
