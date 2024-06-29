import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class185 {

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Z")
    public boolean field3340 = false;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field3338 = -1;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Lid;")
    public static class149 field3337 = class60.method382("Verbindung zum Update)2Server hergestellt)3", (byte) 94);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Z")
    public static boolean field3334 = false;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public int field3342;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method1273(byte arg0) {
        field3337 = null;
        if (arg0 < 6) {
            method1274(-31, (class127) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILpb;)I")
    public static final int method1274(int arg0, class127 arg1) {
        field3343++;
        int var2 = arg1.field2241;
        class264 var3 = arg1.method923((byte) -124);
        if (arg1.field2334 == var3.field4718) {
            var2 = arg1.field2248;
        } else if (arg1.field2334 == var3.field4733 || arg1.field2334 == var3.field4716 || arg1.field2334 == var3.field4703 || arg1.field2334 == var3.field4727) {
            var2 = arg1.field2232;
        } else if (arg1.field2334 == var3.field4711 || arg1.field2334 == var3.field4714 || arg1.field2334 == var3.field4710 || arg1.field2334 == var3.field4690) {
            var2 = arg1.field2223;
        }
        return arg0 <= 88 ? -100 : var2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjb;IILpb;ILbk;I)V")
    public static final void method1275(int arg0, class268 arg1, int arg2, int arg3, class127 arg4, int arg5, class20 arg6, int arg7) {
        field3332++;
        class259 var8 = new class259();
        var8.field4544 = arg0 * 128;
        var8.field4543 = arg3;
        var8.field4534 = arg2 * arg5;
        if (arg1 != null) {
            var8.field4527 = arg1.field4823;
            var8.field4545 = arg1.field4793;
            var8.field4529 = arg1;
            var8.field4526 = arg1.field4765;
            var8.field4522 = arg1.field4827;
            int var9 = arg1.field4820;
            var8.field4532 = arg1.field4830 * 128;
            int var10 = arg1.field4787;
            if (arg7 == 1 || arg7 == 3) {
                var9 = arg1.field4787;
                var10 = arg1.field4820;
            }
            var8.field4533 = (arg5 + var9) * 128;
            var8.field4536 = (arg0 + var10) * 128;
            if (arg1.field4767 != null) {
                var8.field4530 = true;
                var8.method1784(-120);
            }
            if (var8.field4522 != null) {
                var8.field4525 = var8.field4526 + (int) (Math.random() * (double) (var8.field4527 - var8.field4526));
            }
            class85.field1550.method1131(var8, false);
        } else if (arg6 != null) {
            var8.field4540 = arg6;
            class59 var11 = arg6.field296;
            if (var11.field1046 != null) {
                var8.field4530 = true;
                var11 = var11.method374(-1);
            }
            if (var11 != null) {
                var8.field4533 = (var11.field1049 + arg5) * 128;
                var8.field4536 = (var11.field1049 + arg0) * 128;
                var8.field4545 = class237.method1604((byte) 125, arg6);
                var8.field4532 = var11.field1038 * 128;
            }
            class259.field4524.method1131(var8, false);
        } else if (arg4 != null) {
            var8.field4550 = arg4;
            var8.field4533 = (arg4.method885((byte) -36) + arg5) * 128;
            var8.field4536 = (arg4.method885((byte) -85) + arg0) * 128;
            var8.field4545 = method1274(94, arg4);
            var8.field4532 = arg4.field2219 * 128;
            class252.field4419.method638((byte) -89, var8, arg4.field2243.method1023((byte) -16));
            return;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lgd;BI)V")
    public final void method1276(class74 arg0, byte arg1, int arg2) {
        while (true) {
            int var4 = arg0.method489((byte) 93);
            if (var4 == 0) {
                field3341++;
                if (arg1 != -99) {
                    this.method1279(98, 102, (class74) null, 64);
                    return;
                }
                return;
            }
            this.method1279(arg1 - 29339, arg2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)Lch;")
    public final class282 method1277(int arg0, byte arg1) {
        field3336++;
        if (arg1 >= -50) {
            this.field3331 = 87;
        }
        class282 var3 = (class282) class103.field1802.method1293((long) (this.field3342 | arg0 << 16), false);
        if (var3 != null) {
            return var3;
        }
        class113.field1936.method1556(this.field3342, true);
        class282 var4 = class63.method395(this.field3342, class113.field1936, 0, 3576);
        if (var4 != null) {
            var4.method1941(class210.field3752, class71.field1245, class247.field4334);
            var4.field3589 = var4.field3600;
            var4.field3601 = var4.field3598;
            for (int var5 = 0; var5 < arg0; var5++) {
                var4.method1938();
            }
            class103.field1802.method1295((long) (this.field3342 | arg0 << 16), var4, (byte) -71);
        }
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
    public static final void method1278(byte arg0) {
        class162.field3013 = 0;
        class283.field5002 = 0;
        field3333++;
        class131.method922((byte) 88);
        class61.method388(-18961);
        class22.method125(-124);
        int var1 = -121 / ((53 - arg0) / 44);
        for (int var2 = 0; var2 < class283.field5002; var2++) {
            int var4 = class186.field3345[var2];
            if (class118.field2022 != class38.field572[var4].field2403) {
                if (class38.field572[var4].field296.method372((byte) 82)) {
                    class163.method1197(15, class38.field572[var4]);
                }
                class38.field572[var4].method115((byte) -51, (class59) null);
                class38.field572[var4] = null;
            }
        }
        if (class68.field1188 != class11.field150.field1340) {
            throw new RuntimeException("gnp1 pos:" + class11.field150.field1340 + " psize:" + class68.field1188);
        }
        for (int var3 = 0; var3 < class182.field3281; var3++) {
            if (class38.field572[class110.field1906[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class182.field3281);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILgd;I)V")
    private final void method1279(int arg0, int arg1, class74 arg2, int arg3) {
        if (arg0 != -29438) {
            field3337 = null;
        }
        field3339++;
        if (arg3 == 1) {
            this.field3342 = arg2.method485(-2386);
        } else if (arg3 == 2) {
            this.field3331 = arg2.method525(65280);
        } else if (arg3 == 3) {
            this.field3340 = true;
            return;
        } else if (arg3 == 4) {
            this.field3342 = -1;
            return;
        }
    }
}
