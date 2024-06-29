import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class84 {

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Laa;")
    public static class76 field1334 = new class76(26, 3);

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Luv;")
    public static class2 field1338 = new class2(73, -2);

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lgo;")
    public static class310 field1339 = null;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1335;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lgk;[BZ)V")
    public final void method671(class468 arg0, byte[] arg1, boolean arg2) {
        field1336++;
        if (arg0.field6868[arg0.field6830] != 31 || arg0.field6868[arg0.field6830 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1335 == null) {
            this.field1335 = new Inflater(true);
        }
        try {
            if (!arg2) {
                method674(false, -82, null);
            }
            this.field1335.setInput(arg0.field6868, arg0.field6830 + 10, arg0.field6868.length + -8 + -10 + -arg0.field6830);
            this.field1335.inflate(arg1);
        } catch (Exception var4) {
            this.field1335.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1335.reset();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
    public static final void method672(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class454.field6661.field976 != 0 && arg1 != 0 && class187.field2744 < 50 && arg3 != -1) {
            class158.field2387[class187.field2744++] = new class425((byte) 2, arg3, arg1, arg4, arg2, 0);
        }
        if (arg0 != 29314) {
            field1334 = null;
        }
        field1333++;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class84() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI[B)I")
    public static final int method673(byte arg0, int arg1, byte[] arg2) {
        if (arg0 == 51) {
            field1332++;
            return class439.method2575(arg1, arg2, (byte) 97, 0);
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method674(boolean arg0, int arg1, String arg2) {
        class509.field7486.field1051 = 1;
        field1337++;
        String var3 = arg2.toLowerCase();
        if (arg1 != -17916) {
            method676(null, 85, -71, null, 126, -43, -45, null, null, null, null, null, null, -48, (byte) -70, -28, -27, true);
        }
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class164.field2437.field4234; var6++) {
            class81 var9 = class164.field2437.method1749(var6, -20230);
            if ((!arg0 || var9.field1178) && var9.field1123 == -1 && var9.field1150 == -1 && var9.field1141 == 0 && var9.field1131.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class182.field2706 = null;
                    class6.field57 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class153.field2322 = 0;
        class6.field57 = var5;
        class182.field2706 = var4;
        String[] var7 = new String[class6.field57];
        for (int var8 = 0; var8 < class6.field57; var8++) {
            var7[var8] = class164.field2437.method1749(var4[var8], -20230).field1131;
        }
        class140.method1019(class182.field2706, var7, (byte) 122);
        class509.field7486.method517((byte) 9);
        class509.field7486.field1051 = 2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method675(int arg0) {
        int var1 = -27 / ((18 - arg0) / 56);
        field1338 = null;
        field1339 = null;
        field1334 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lya;IILc;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method676(class11 arg0, int arg1, int arg2, class511 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class521.field7669 = arg0;
        class269.field3999 = arg1;
        class18.field286 = arg3;
        class358.field5479 = class521.field7669.method72() > 0;
        class487.field7256 = arg4 >> class9.field75;
        class301.field4475 = arg6 >> class9.field75;
        class259.field3860 = arg4;
        class263.field3924 = arg6;
        class420.field6296 = arg5;
        class18.field283 = class487.field7256 - class489.field7290;
        if (class18.field283 < 0) {
            class327.field5113 = -class18.field283;
            class18.field283 = 0;
        } else {
            class327.field5113 = 0;
        }
        class508.field7457 = class301.field4475 - class489.field7290;
        if (class508.field7457 < 0) {
            class332.field5148 = -class508.field7457;
            class508.field7457 = 0;
        } else {
            class332.field5148 = 0;
        }
        class407.field6144 = class489.field7290 + class487.field7256;
        if (class407.field6144 > class445.field6562) {
            class407.field6144 = class445.field6562;
        }
        class520.field7617 = class489.field7290 + class301.field4475;
        if (class520.field7617 > class167.field2473) {
            class520.field7617 = class167.field2473;
        }
        for (int var18 = 0; var18 < class489.field7290 + class489.field7290 + 2; var18++) {
            for (int var23 = 0; var23 < class489.field7290 + class489.field7290 + 2; var23++) {
                int var24 = class487.field7256 + var18 - class489.field7290;
                int var25 = class301.field4475 + var23 - class489.field7290;
                if (var24 >= 0 && var25 >= 0 && var24 < class445.field6562 && var25 < class167.field2473) {
                    int var26 = var24 << class9.field75;
                    int var27 = var25 << class9.field75;
                    int var28 = class213.field3048[class213.field3048.length - 1].method707(var24, var25) - (0x3E8 << class9.field75 - 7);
                    int var29 = class420.field6281 == null ? class213.field3048[0].method707(var24, var25) + class324.field5060 : class420.field6281[0].method707(var24, var25) + class324.field5060;
                    class283.field4278[var18][var23] = class521.field7669.method101(var26, var28, var27, var26, var29, var27);
                } else {
                    class283.field4278[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class489.field7290 + class489.field7290 + 1; var19++) {
            for (int var22 = 0; var22 < class489.field7290 + class489.field7290 + 1; var22++) {
                class522.field7677[var19][var22] = class283.field4278[var19][var22] || class283.field4278[var19 + 1][var22] || class283.field4278[var19][var22 + 1] || class283.field4278[var19 + 1][var22 + 1];
            }
        }
        class314.field4854 = arg8;
        class394.field5907 = arg9;
        class61.field831 = arg10;
        class70.field933 = arg11;
        class269.field3997 = arg12;
        class467.method2711();
        class502.method2973(29459);
        for (class268 var20 = (class268) class268.field3989.method3089(70); var20 != null; var20 = (class268) class268.field3989.method3088((byte) -65)) {
            var20.method2096((byte) 86);
            class188.method1263((byte) -116, var20);
        }
        if (class358.field5479) {
            for (int var21 = 0; var21 < class309.field4634; var21++) {
                class486.field7238[var21].method2707(arg1, arg17, (byte) -78);
            }
        }
        if (arg2 > 1) {
            class521.field7669.method96(0);
            if (class159.field2393 == null || class159.field2393 instanceof class71) {
                class159.field2393 = new class70();
            }
        } else if (class159.field2393 == null || class159.field2393 instanceof class70) {
            class159.field2393 = new class71();
        }
        class159.field2393.method499(arg2, 1);
        class159.field2393.method493(0);
        if (class435.field6422 != null) {
            class502.method2975(true);
            class159.field2393.method491(22, 1048576);
            class494.method2940(arg2, null, 0, (byte) 0, arg15, arg16);
            class159.field2393.method493(0);
            class159.field2393.method491(23, 1048576);
            class502.method2975(false);
        }
        class494.method2940(arg2, arg7, arg13, arg14, arg15, arg16);
        class159.field2393.method493(0);
        class159.field2393.method496(0);
        class159.field2393.method493(0);
        if (arg2 > 1) {
            class521.field7669.method145(0);
        }
        class521.field7669.method114(0, null);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(III)V")
    private class84(int arg0, int arg1, int arg2) {
    }
}
