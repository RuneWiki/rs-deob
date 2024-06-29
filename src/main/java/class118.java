import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class class118 {

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "Los;")
    public class468 field1544;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "[I")
    public static int[] field1540 = new int[16];

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field1542 = -1;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "Lnj;")
    public static class487 field1541 = new class487("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Lwu;")
    public static class500 field1545 = new class500("WTRC", 1);

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "F")
    public static float field1546;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)V", line = 5)
    public static void method726(byte arg0) {
        field1540 = null;
        field1541 = null;
        field1545 = null;
        int var1 = -68 % ((arg0 + 8) / 40);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILhca;BILih;IILlk;)V", line = 24)
    public static final void method727(int arg0, class179 arg1, byte arg2, int arg3, class158 arg4, int arg5, int arg6, class383 arg7) {
        if (arg2 != 67) {
            method726((byte) 106);
        }
        field1543++;
        class434 var8 = new class434();
        var8.field6369 = arg0 << 7;
        var8.field6363 = arg6 << 7;
        var8.field6352 = arg5;
        if (arg4 != null) {
            var8.field6362 = arg4;
            int var9 = arg4.field2017;
            int var10 = arg4.field2014;
            if (arg3 == 1 || arg3 == 3) {
                var10 = arg4.field2017;
                var9 = arg4.field2014;
            }
            var8.field6354 = arg6 + var9 << 7;
            var8.field6351 = arg4.field2085;
            var8.field6357 = arg4.field2064;
            var8.field6367 = arg4.field2066 << 7;
            var8.field6350 = arg0 + var10 << 7;
            var8.field6370 = arg4.field2098;
            var8.field6349 = arg4.field2041;
            var8.field6366 = arg4.field2099;
            if (arg4.field2035 != null) {
                var8.field6358 = true;
                var8.method2648(arg2 ^ 0xFFFFE100);
            }
            if (var8.field6370 != null) {
                var8.field6371 = (int) ((double) (var8.field6366 - var8.field6349) * Math.random()) + var8.field6349;
            }
            class566.field8403.method2492(var8, (byte) 66);
        } else if (arg7 != null) {
            var8.field6353 = arg7;
            class429 var11 = arg7.field5601;
            if (var11.field6238 != null) {
                var8.field6358 = true;
                var11 = var11.method2629(class406.field5823, (byte) 110);
            }
            if (var11 != null) {
                var8.field6350 = var11.field6234 + arg0 << 7;
                var8.field6354 = var11.field6234 + arg6 << 7;
                var8.field6351 = class153.method896(arg7, arg2 + 34);
                var8.field6367 = var11.field6264 << 7;
                var8.field6357 = var11.field6283;
            }
            class255.field3733.method2492(var8, (byte) -90);
        } else if (arg1 != null) {
            var8.field6372 = arg1;
            var8.field6354 = arg1.method514(arg2 - 67) + arg6 << 7;
            var8.field6350 = arg0 + arg1.method514(0) << 7;
            var8.field6351 = class62.method388(arg1, 96);
            var8.field6357 = arg1.field2737;
            var8.field6367 = arg1.field2722 << 7;
            class426.field6077.method1341(var8, (byte) -93, (long) arg1.field1053);
            return;
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Los;)V", line = 116)
    public class118(class468 arg0) {
        this.field1544 = arg0;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lqa;IILm;III[[[B[I[I[I[I[IIBIIZ)V", line = 136)
    public static final void method728(class167 arg0, int arg1, int arg2, class105 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class139.field1827 = arg0;
        class300.field4402 = arg1;
        class185.field2812 = arg3;
        class509.field7559 = class139.field1827.method994() > 0;
        class365.field5254 = arg4 >> class179.field2726;
        class613.field8993 = arg6 >> class179.field2726;
        class100.field1278 = arg4;
        class420.field6034 = arg6;
        class49.field578 = arg5;
        class580.field8548 = class365.field5254 - class67.field763;
        if (class580.field8548 < 0) {
            class272.field4033 = -class580.field8548;
            class580.field8548 = 0;
        } else {
            class272.field4033 = 0;
        }
        class10.field90 = class613.field8993 - class67.field763;
        if (class10.field90 < 0) {
            class493.field7444 = -class10.field90;
            class10.field90 = 0;
        } else {
            class493.field7444 = 0;
        }
        class309.field4509 = class67.field763 + class365.field5254;
        if (class309.field4509 > class331.field4909) {
            class309.field4509 = class331.field4909;
        }
        class605.field8906 = class67.field763 + class613.field8993;
        if (class605.field8906 > class366.field5271) {
            class605.field8906 = class366.field5271;
        }
        for (int var18 = 0; var18 < class67.field763 + class67.field763 + 2; var18++) {
            for (int var23 = 0; var23 < class67.field763 + class67.field763 + 2; var23++) {
                int var24 = class365.field5254 + var18 - class67.field763;
                int var25 = class613.field8993 + var23 - class67.field763;
                if (var24 >= 0 && var25 >= 0 && var24 < class331.field4909 && var25 < class366.field5271) {
                    int var26 = var24 << class179.field2726;
                    int var27 = var25 << class179.field2726;
                    int var28 = class562.field8337[class562.field8337.length - 1].method1319(var24, var25) - (0x3E8 << class179.field2726 - 7);
                    int var29 = class287.field4219 == null ? class562.field8337[0].method1319(var24, var25) + class177.field2692 : class287.field4219[0].method1319(var24, var25) + class177.field2692;
                    class268.field3982[var18][var23] = class139.field1827.method1027(var26, var28, var27, var26, var29, var27);
                } else {
                    class268.field3982[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class67.field763 + class67.field763 + 1; var19++) {
            for (int var22 = 0; var22 < class67.field763 + class67.field763 + 1; var22++) {
                class181.field2786[var19][var22] = class268.field3982[var19][var22] || class268.field3982[var19 + 1][var22] || class268.field3982[var19][var22 + 1] || class268.field3982[var19 + 1][var22 + 1];
            }
        }
        class600.field8856 = arg8;
        class240.field3504 = arg9;
        class648.field9391 = arg10;
        class318.field4750 = arg11;
        class622.field9114 = arg12;
        class386.method2337();
        class549.method3218(class139.field1827, (byte) -118);
        for (class239 var20 = (class239) class147.field1903.method772(0); var20 != null; var20 = (class239) class147.field1903.method775(2)) {
            var20.method736((byte) -126);
            class529.method3122(var20, 18605);
        }
        if (class509.field7559) {
            for (int var21 = 0; var21 < class318.field4753; var21++) {
                class29.field260[var21].method2017(arg1, arg17, -123);
            }
        }
        if (arg2 > 1) {
            class139.field1827.method970(0);
            if (class298.field4354 == null || class298.field4354 instanceof class161) {
                class298.field4354 = new class518();
            }
        } else if (class298.field4354 == null || class298.field4354 instanceof class518) {
            class298.field4354 = new class161();
        }
        class298.field4354.method943(1300271884, arg2);
        class298.field4354.method935(5000);
        if (class32.field330 != null) {
            class296.method1836(true);
            class298.field4354.method937(22, true);
            class95.method542(arg2, null, 0, (byte) 0, arg15, arg16);
            class298.field4354.method935(5000);
            class298.field4354.method937(23, true);
            class296.method1836(false);
        }
        class95.method542(arg2, arg7, arg13, arg14, arg15, arg16);
        class298.field4354.method935(5000);
        class298.field4354.method936((byte) 101);
        class298.field4354.method935(5000);
        if (arg2 > 1) {
            class139.field1827.method981(0);
        }
        class139.field1827.method1045(0, null);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZB)V")
    public abstract void method442(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Z")
    public abstract boolean method446(byte arg0);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BZ)V")
    public abstract void method439(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public abstract void method441(int arg0);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lbaa;IB)V")
    public abstract void method440(class541 arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBI)V")
    public abstract void method445(int arg0, byte arg1, int arg2);
}
