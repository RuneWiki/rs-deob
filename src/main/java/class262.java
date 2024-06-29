import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class262 extends class223 {

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    private final int field4359;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    private final int field4355;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    private final int field4351;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    private final int field4357;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    private final int field4369;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    private final int field4358;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    private final int field4356;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    private final int field4352;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "Lpg;")
    public static class292 field4360 = class80.method612(100);

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public static int field4364 = -1;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field4362 = 0;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    public static int field4361 = 0;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "Ltl;")
    public static class59 field4367 = class85.method639("blinken2:", 9588);

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "Ljc;")
    public static class213 field4365 = new class213();

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "Ltl;")
    public static class59 field4371 = class85.method639("<col=00ff00>", 9588);

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "Ltl;")
    public static class59 field4372 = class85.method639("Weiter", 9588);

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "Lkl;")
    public static class64 field4373 = new class64();

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public static int field4375 = 0;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public static int field4374 = -1;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "[[[B")
    public static byte[][][] field4366;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)V", line = 4)
    public final void method1149(int arg0, int arg1, int arg2) {
        field4370++;
        int var4 = 102 / ((arg1 - 75) / 43);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)V", line = 15)
    public final void method1144(int arg0, int arg1, int arg2) {
        field4354++;
        int var4 = this.field4369 * arg1 >> 12;
        int var5 = this.field4352 * arg1 >> 12;
        int var6 = this.field4351 * arg0 >> 12;
        int var7 = this.field4358 * arg0 >> 12;
        int var8 = this.field4356 * arg1 >> 12;
        int var9 = this.field4357 * arg0 >> 12;
        if (arg2 != -19486) {
            field4361 = -62;
        }
        int var10 = this.field4359 * arg0 >> 12;
        int var11 = this.field4355 * arg1 >> 12;
        class275.method1924(this.field3608, var5, var10, var4, var7, var9, var11, -108, var8, var6);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIILfg;IJZ)Z", line = 59)
    public static final boolean method1807(int arg0, int arg1, int arg2, int arg3, int arg4, class176 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class12.method82(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 94)
    public final void method1148(int arg0, int arg1, int arg2) {
        field4353++;
        if (arg2 >= -54) {
            this.method1144(121, 14, 107);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)I", line = 106)
    public static final int method1808(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            field4363++;
            return arg1 <= arg0 ? (arg0 <= arg3 ? arg0 : arg3) : arg1;
        } else {
            return 17;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLs;)V", line = 133)
    public static final void method1809(byte arg0, class170 arg1) {
        for (int var2 = 0; var2 < class73.field1171; var2++) {
            int var3 = arg1.method1249(false);
            int var4 = arg1.method1214(-18254);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class179.field2941[var3] != null) {
                class179.field2941[var3].field3360 = var4;
            }
        }
        if (arg0 != 12) {
            method1809((byte) 43, (class170) null);
        }
        field4350++;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V", line = 162)
    public static void method1810(int arg0) {
        int var1 = 61 / ((-arg0 - 28) / 52);
        field4366 = (byte[][][]) null;
        field4365 = null;
        field4367 = null;
        field4373 = null;
        field4360 = null;
        field4372 = null;
        field4371 = null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)Z", line = 182)
    public static final boolean method1811(int arg0, int arg1) {
        field4368++;
        int var2 = 3 % ((4 - arg1) / 40);
        return ((arg0 & 0x14556430) >> 28) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 191)
    public class262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4359 = arg7;
        this.field4355 = arg6;
        this.field4351 = arg3;
        this.field4357 = arg5;
        this.field4369 = arg0;
        this.field4358 = arg1;
        this.field4356 = arg4;
        this.field4352 = arg2;
    }
}
