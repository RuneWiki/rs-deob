import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public abstract class class263 extends class337 {

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "Lck;")
    public class733 field3505;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "[I")
    public static int[] field3500 = new int[120];

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "[Ljha;")
    public static class33[] field3508;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "Ltba;")
    public static class339 field3510;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "Z")
    public boolean field3499;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field3500[var1] = var0 / 4;
        }
        field3508 = new class33[2048];
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Z", line = 7)
    public final boolean method1664(int arg0) {
        if (arg0 != 1) {
            this.method1224(102);
        }
        field3509++;
        return this.field3499;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)I", line = 32)
    public int method1215(boolean arg0) {
        field3504++;
        if (!arg0) {
            field3510 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)Z", line = 44)
    public final boolean method1665(int arg0) {
        if (arg0 < 97) {
            field3510 = null;
        }
        field3501++;
        return false;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)V", line = 74)
    public static final void method1666(int arg0, int arg1, int arg2, int arg3) {
        field3507++;
        int var4 = class714.field9407 + arg2;
        int var5 = class240.field3293 + arg3;
        if (class28.field252 == null || arg2 < 0 || arg3 < 0 || arg2 >= class240.field3280 || arg3 >= class276.field3602 || class485.field6252.field6942.method2278(false) == 0 && class422.field5564.field2895 != arg1) {
            return;
        }
        long var6 = (long) (arg1 << 28 | var5 << 14 | var4);
        class89 var8 = (class89) class407.field5401.method2616(var6, (byte) -111);
        if (var8 == null) {
            class435.method2496(arg1, arg2, arg3);
            return;
        }
        class64 var9 = (class64) var8.field1228.method3591(0);
        if (var9 == null) {
            class435.method2496(arg1, arg2, arg3);
            return;
        }
        class449 var10 = (class449) class435.method2496(arg1, arg2, arg3);
        if (var10 == null) {
            var10 = new class449(arg2 << 9, class116.field1542[arg1].method2060(arg3, -100, arg2), arg3 << 9, arg1, arg1);
        } else {
            var10.field5859 = var10.field5869 = -1;
        }
        var10.field5863 = var9.field838;
        var10.field5868 = var9.field840;
        label57: while (true) {
            class64 var11 = (class64) var8.field1228.method3600((byte) 120);
            if (var11 == null) {
                break;
            }
            if (var10.field5863 != var11.field838) {
                var10.field5862 = var11.field840;
                var10.field5859 = var11.field838;
                while (true) {
                    class64 var12 = (class64) var8.field1228.method3600((byte) 127);
                    if (var12 == null) {
                        break label57;
                    }
                    if (var10.field5863 != var12.field838 && var10.field5859 != var12.field838) {
                        var10.field5851 = var12.field840;
                        var10.field5869 = var12.field838;
                    }
                }
            }
        }
        int var13 = class512.method2831(arg1, (byte) 82, (arg2 << 9) + 256, (arg3 << 9) - -256);
        var10.field5866 = 0;
        var10.field2889 = (byte) arg1;
        var10.field2900 = arg3 << 9;
        int var14 = 4 / ((-arg0 - 12) / 45);
        var10.field2895 = (byte) arg1;
        var10.field2896 = arg2 << 9;
        var10.field2892 = var13;
        if (class433.method2484(arg3, 0, arg2)) {
            var10.field2889++;
        }
        class324.method1879(arg1, arg2, arg3, var13, var10);
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lck;)V", line = 167)
    public class263(class733 arg0) {
        this.field3505 = arg0;
    }

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "(I)V", line = 176)
    public static void method1667(int arg0) {
        if (arg0 != 0) {
            method1670(-20, -52, null, (byte) -110, 50, null, 68, 32L, 86);
        }
        field3508 = null;
        field3510 = null;
        field3500 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lwm;ILoq;)V", line = 189)
    public static final void method1668(class30 arg0, int arg1, class775 arg2) {
        if (arg1 != -1455598052) {
            method1666(6, -35, -120, 127);
        }
        class668.field8685 = "";
        class4.field51 = arg2;
        field3503++;
        class335.field4084 = arg0;
        if (class377.field4615.startsWith("win")) {
            class668.field8685 = class668.field8685 + "windows/";
        } else if (class377.field4615.startsWith("linux")) {
            class668.field8685 = class668.field8685 + "linux/";
        } else if (class377.field4615.startsWith("mac")) {
            class668.field8685 = class668.field8685 + "macos/";
        }
        if (class4.field51.field10581) {
            class668.field8685 = class668.field8685 + "msjava/";
        } else if (class377.field4606.startsWith("amd64") || class377.field4606.startsWith("x86_64")) {
            class668.field8685 = class668.field8685 + "x86_64/";
        } else if (class377.field4606.startsWith("i386") || class377.field4606.startsWith("i486") || class377.field4606.startsWith("i586") || class377.field4606.startsWith("x86")) {
            class668.field8685 = class668.field8685 + "x86/";
        } else if (class377.field4606.startsWith("ppc")) {
            class668.field8685 = class668.field8685 + "ppc/";
        } else {
            class668.field8685 = class668.field8685 + "universal/";
        }
    }

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "(I)I", line = 236)
    public final int method1669(int arg0) {
        field3502++;
        return arg0 == 5 ? 1 : 40;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILuaa;BILaa;IJI)V", line = 247)
    public static final void method1670(int arg0, int arg1, class391 arg2, byte arg3, int arg4, class596 arg5, int arg6, long arg7, int arg8) {
        if (arg3 != 98) {
            return;
        }
        field3506++;
        int var10 = arg0 * arg0 + arg1 * arg1;
        if ((long) var10 > arg7) {
            return;
        }
        int var11 = Math.min(arg2.field5117 / 2, arg2.field5031 / 2);
        if ((var11 * var11) >= var10) {
            class510.method2817(arg5, arg2, class235.field3205[arg8], arg6, (byte) -88, arg0, arg1, arg4);
            return;
        }
        var11 -= 10;
        int var12;
        if (class507.field6476 == 4) {
            var12 = (int) class698.field9250 & 0x3FFF;
        } else {
            var12 = (int) class698.field9250 + class757.field10329 & 0x3FFF;
        }
        int var13 = class541.field6805[var12];
        int var14 = class541.field6806[var12];
        if (class507.field6476 != 4) {
            var13 = var13 * 256 / (class718.field9432 + 256);
            var14 = var14 * 256 / (class718.field9432 + 256);
        }
        int var15 = arg0 * var14 + arg1 * var13 >> 14;
        int var16 = arg1 * var14 - (arg0 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class88.field1220[arg8].method4197((float) arg2.field5117 / 2.0F + (float) arg6 + (float) var19, (float) arg2.field5031 / 2.0F + (float) arg4 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILgha;ZLgha;)V")
    public abstract void method1219(int arg0, class520 arg1, boolean arg2, class520 arg3);

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Z")
    public abstract boolean method1221(int arg0);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V")
    public abstract void method1218(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IB)V")
    public abstract void method1220(int arg0, byte arg1);

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)V")
    public abstract void method1224(int arg0);

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "(I)Z")
    public abstract boolean method1217(int arg0);
}
