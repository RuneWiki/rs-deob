import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class184 extends class24 {

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    private final int field3376;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    private final int field3370;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    private final int field3366;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    private final int field3377;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Lud;")
    public static class279 field3368 = class130.method1024("<col=40ff00>", 255);

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "[Lud;")
    public static class279[] field3373 = new class279[500];

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Lud;")
    public static class279 field3367 = class130.method1024(":trade:", 255);

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Lud;")
    public static class279 field3382 = class130.method1024("Attaquer", 255);

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "[Lfg;")
    public static class211[] field3381 = new class211[14];

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "Lgf;")
    public static class8 field3384;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "[[[I")
    public static int[][][] field3369;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(III)V", line = 9)
    public final void method217(int arg0, int arg1, int arg2) {
        field3385++;
        if (arg1 != 13217) {
            field3368 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[I[JB)V", line = 20)
    public static final void method1419(int arg0, int arg1, int[] arg2, long[] arg3, byte arg4) {
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var9;
            for (int var10 = arg0; var10 < arg1; var10++) {
                if (arg3[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var13 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var13;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var9;
            method1419(arg0, var6 - 1, arg2, arg3, (byte) -32);
            method1419(var6 + 1, arg1, arg2, arg3, (byte) 108);
        }
        field3379++;
        int var14 = 80 % ((arg4 - 53) / 47);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIII)V", line = 85)
    public static final void method1420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3375++;
        if (class283.method2031(arg2 ^ 0x4CE3, arg4)) {
            if (arg2 != 7177) {
                field3384 = (class8) null;
            }
            client.method1794(class18.field545[arg4], -1, arg1, arg6, arg5, arg7, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V", line = 106)
    public static void method1421(int arg0) {
        field3384 = null;
        field3367 = null;
        if (arg0 != 16777215) {
            field3372 = 26;
        }
        field3369 = (int[][][]) null;
        field3382 = null;
        field3368 = null;
        field3373 = null;
        field3381 = null;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(III)J", line = 125)
    public static final long method1422(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3451; var4++) {
            class18 var5 = var3.field3455[var4];
            if ((var5.field546 >> 29 & 0x3L) == 2L && var5.field560 == arg1 && var5.field564 == arg2) {
                return var5.field546;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZI)V", line = 150)
    public final void method214(int arg0, boolean arg1, int arg2) {
        field3383++;
        int var4 = this.field3370 * arg0 >> 12;
        int var5 = this.field3376 * arg0 >> 12;
        int var6 = this.field3377 * arg2 >> 12;
        int var7 = this.field3366 * arg2 >> 12;
        method1424(var5, this.field615, var6, var7, var4, this.field609, 14, this.field614);
        if (!arg1) {
            field3368 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIBI)V", line = 169)
    public static final void method1423(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3371++;
        if (class135.field2463 <= arg4 && arg4 <= class108.field2002) {
            int var5 = class125.method1001(arg2, class44.field929, false, class249.field4449);
            int var6 = class125.method1001(arg0, class44.field929, false, class249.field4449);
            class18.method157(127, var5, arg1, arg4, var6);
        }
        if (arg3 != -82) {
            method1422(-65, 30, -6);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIIIIIII)V", line = 193)
    private static final void method1424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 14) {
            method1424(32, -92, 7, 39, 83, 100, -19, 61);
        }
        field3380++;
        if (arg3 == arg4) {
            class141.method1086(arg4, true, arg1, arg0, arg5, arg7, arg2);
        } else if (arg0 - arg4 >= class249.field4449 && (arg0 + arg4) <= class44.field929 && class135.field2463 <= (arg2 - arg3) && class108.field2002 >= (arg2 + arg3)) {
            class28.method262(arg0, arg2, arg1, arg7, arg4, arg3, arg5, arg6 + 1244828403);
        } else {
            class287.method2049(arg2, arg1, arg7, arg3, arg5, arg4, arg0, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZIII)V", line = 216)
    public static final void method1425(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3365++;
        class109 var5 = (class109) class103.field1928.method610((long) arg2, -1);
        if (var5 == null) {
            var5 = new class109();
            class103.field1928.method612(false, var5, (long) arg2);
        }
        if (arg3 >= var5.field2019.length) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field2019.length; var8++) {
                var6[var8] = var5.field2019[var8];
                var7[var8] = var5.field2013[var8];
            }
            for (int var9 = var5.field2019.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2019 = var6;
            var5.field2013 = var7;
        }
        var5.field2019[arg3] = arg4;
        var5.field2013[arg3] = arg0;
        if (arg1) {
            method1421(-87);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 268)
    public static final void method1426(boolean arg0) {
        field3386++;
        class12 var1 = class166.field2993;
        synchronized (class166.field2993) {
            class34.field778 = class262.field4689;
            if (arg0) {
                class7.field142++;
                class130.field2363 = class52.field1090;
                class51.field1056 = class293.field5228;
                class101.field1894 = class8.field189;
                class232.field4074 = class276.field4894;
                class64.field1307 = class176.field3155;
                class194.field3494 = class285.field5089;
                class8.field189 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(IIIIIII)V", line = 295)
    public class184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3376 = arg0;
        this.field3370 = arg2;
        this.field3366 = arg3;
        this.field3377 = arg1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 311)
    public final void method216(int arg0, int arg1, int arg2) {
        field3374++;
        int var4 = this.field3376 * arg2 >> 12;
        int var5 = this.field3370 * arg2 >> 12;
        int var6 = this.field3377 * arg1 >> 12;
        int var7 = this.field3366 * arg1 >> 12;
        class266.method1903(var5, var4, 24, var7, var6, this.field609);
        int var8 = 88 % ((arg0 + 72) / 34);
    }
}
