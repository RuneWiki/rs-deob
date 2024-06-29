import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class class190 {

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "[F")
    public static float[] field2717 = new float[4];

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Z")
    public static boolean field2712 = false;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field2715 = 0;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field2719 = -1;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Lkn;")
    public static class530 field2713 = new class530("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Leh;")
    public static class246 field2721 = new class246(18, -2);

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field2723 = -1;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method1209(boolean arg0, int arg1) {
        if (class15.field189 == 0) {
            class22.field267.method563(21431, arg1);
        } else {
            class102.field1358 = arg1;
        }
        field2718++;
        if (!arg0) {
            field2712 = true;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljg;I)V", line = 26)
    public static final void method1211(class228 arg0, int arg1) {
        if (arg1 != -64) {
            method1212((byte) -48);
        }
        field2720++;
        boolean var2 = false;
        if (class390.field5481 == arg0.field3365 || arg0.field3320 == -1 || arg0.field3361 != 0) {
            var2 = true;
        } else {
            class449 var3 = class62.field784.method2566(arg0.field3320, -19);
            if (var3.field6270 || var3.field6258[arg0.field3312] < (arg0.field3277 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field3365 - arg0.field3319;
            int var5 = class390.field5481 - arg0.field3319;
            int var6 = arg0.field3304 * 128 + (arg0.method125((byte) -120) * 64);
            int var7 = arg0.field3351 * 128 + (arg0.method125((byte) -84) * 64);
            int var8 = arg0.field3324 * 128 + (arg0.method125((byte) -92) * 64);
            int var9 = arg0.field3307 * 128 + (arg0.method125((byte) -87) * 64);
            arg0.field1899 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg0.field1896 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg0.field3377 = 0;
        if (arg0.field3305 == 0) {
            arg0.method1408(8192, false, 989076559);
        }
        if (arg0.field3305 == 1) {
            arg0.method1408(12288, false, arg1 + 989076623);
        }
        if (arg0.field3305 == 2) {
            arg0.method1408(0, false, 989076559);
        }
        if (arg0.field3305 == 3) {
            arg0.method1408(4096, false, 989076559);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 85)
    public static void method1212(byte arg0) {
        field2717 = null;
        field2713 = null;
        if (arg0 == 30) {
            field2721 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIBLeb;IZI)V", line = 110)
    public static final void method1213(int arg0, int arg1, byte arg2, class449 arg3, int arg4, boolean arg5, int arg6) {
        field2716++;
        if (class10.field140 >= 50 || arg3 == null || arg3.field6268 == null || arg0 >= arg3.field6268.length || arg3.field6268[arg0] == null) {
            return;
        }
        int var7 = arg3.field6268[arg0][0];
        int var8 = 10 / ((-arg2 - 45) / 56);
        int var9 = var7 >> 8;
        int var10 = var7 >> 5 & 0x7;
        if (arg3.field6268[arg0].length > 1) {
            int var11 = (int) ((double) arg3.field6268[arg0].length * Math.random());
            if (var11 > 0) {
                var9 = arg3.field6268[arg0][var11];
            }
        }
        int var12 = var7 & 0x1F;
        if (var12 == 0) {
            if (arg5) {
                class464.method2695((byte) 119, 0, var9, var10, 255);
            }
        } else if (class4.field81.field1418 != 0) {
            int var13 = arg1 - 64 >> 7;
            int var14 = arg6 - 64 >> 7;
            class289.field4229[class10.field140++] = new class78((byte) 1, var9, var10, 0, 255, (arg4 << 24) + (var13 << 16) - (-(var14 << 8) - var12));
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I[Lo;)V", line = 160)
    public static final void method1214(int arg0, class24[] arg1) {
        field2714++;
        class119.field1643 = arg1.length;
        class81.field1048 = new int[class119.field1643 + 10];
        class487.field6796 = new class24[class119.field1643 + 10];
        class182.method1140(arg1, 0, class487.field6796, 0, class119.field1643);
        if (arg0 < 50) {
            return;
        }
        for (int var2 = 0; var2 < class119.field1643; var2++) {
            class81.field1048[var2] = class487.field6796[var2].method157();
        }
        for (int var3 = class119.field1643; var3 < class487.field6796.length; var3++) {
            class81.field1048[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(FIIFIFIIIF[F)V")
    public abstract void method1210(float arg0, int arg1, int arg2, float arg3, int arg4, float arg5, int arg6, int arg7, int arg8, float arg9, float[] arg10);
}
