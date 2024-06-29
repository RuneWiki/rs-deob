import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 extends class2 {

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lkc;")
    private static class67 field600 = class19.method144("glow2:", 91);

    @OriginalMember(owner = "client!e", name = "r", descriptor = "Lkc;")
    public static class67 field603 = class19.method144("Ihr Spielkonto wurde deaktiviert)3", 106);

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Lkc;")
    public static class67 field601 = field600;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field609 = 0;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lkc;")
    private static class67 field606 = class19.method144(" has logged out)3", 86);

    @OriginalMember(owner = "client!e", name = "A", descriptor = "Z")
    public static boolean field612 = true;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field616 = -1;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lkc;")
    public static class67 field604 = field606;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "[I")
    public static int[] field615 = new int[500];

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lkc;")
    public static class67 field608 = class19.method144("Gegenstand f-Ur Mitglieder", 81);

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public static int field618 = 0;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "Lkc;")
    private static class67 field617 = class19.method144("Prepared sound engine", 123);

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Lkc;")
    public static class67 field602 = field617;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "Lkc;")
    public class67 field610;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "[[[B")
    public static byte[][][] field613;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V", line = 16)
    public static void method250(int arg0) {
        if (arg0 != -1) {
            field602 = null;
        }
        field602 = null;
        field604 = null;
        field603 = null;
        field601 = null;
        field608 = null;
        field600 = null;
        field606 = null;
        field613 = null;
        field617 = null;
        field615 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLac;Lac;IB)Lba;", line = 80)
    public static final class9 method251(boolean arg0, class4 arg1, class4 arg2, int arg3, byte arg4) {
        if (arg4 < 58) {
            field616 = 12;
        }
        int[] var5 = arg2.method42(arg3, -82);
        field607++;
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg2.method30(arg3, var5[var7], false);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg0) {
                    var10 = arg1.method30(0, var9, false);
                } else {
                    var10 = arg1.method30(var9, 0, false);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class9(arg2, arg1, arg3, arg0);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V", line = 153)
    public static final void method252(boolean arg0) {
        field599++;
        class112.method854((byte) -101);
        if (class9.field195 == 1) {
            class19.field367[class112.field2591 / 100].method661(class50.field1242 - 12, class20.field406 + -8 - 4);
        }
        if (class9.field195 == 2) {
            class19.field367[class112.field2591 / 100 + 4].method661(class50.field1242 - 8 - 4, class20.field406 + -4 + -8);
        }
        if (arg0) {
            return;
        }
        if (class41.field992 != -1) {
            class81.method637(0, class41.field992);
            class99.method762(0, 334, 512, 0, 4, false, class41.field992);
        }
        if (class96.field2163 != -1) {
            class81.method637(0, class96.field2163);
            class99.method762(0, 334, 512, 0, 0, false, class96.field2163);
        }
        class20.method153((byte) 114);
        if (!class90.field2066) {
            class85.method657(453);
            class70.method579(2);
        } else if (class31.field663 == 0) {
            class115.method921(-1);
        }
        if (class20.field407 == 1) {
            class1.field15.method661(472, 296);
        }
        if (class69.field1655) {
            byte var1 = 20;
            short var2 = 507;
            class14.field301.method242(class63.method479(new class67[] { class63.field1497, class71.method586(103, class4.field86) }, 0), var2, var1, 16776960);
            int var9 = var1 + 15;
            int var3 = 16776960;
            Runtime var4 = Runtime.getRuntime();
            int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
            if (var5 > 32768 && class45.field1105) {
                var3 = 16711680;
            }
            if (var5 > 65536 && !class45.field1105) {
                var3 = 16711680;
            }
            class14.field301.method242(class63.method479(new class67[] { class19.field372, class71.method586(103, var5), class134.field3219 }, 0), var2, var9, var3);
            var9 += 15;
            if (class132.field3119) {
                class14.field301.method242(class10.field214, var2, var9, 16711680);
                class132.field3119 = false;
                var9 += 15;
            }
            if (class127.field2962) {
                class14.field301.method242(class108.field2441, var2, var9, 16711680);
                var9 += 15;
                class127.field2962 = false;
            }
            if (class111.field2542) {
                class14.field301.method242(class30.field641, var2, var9, 16711680);
                var9 += 15;
                class111.field2542 = false;
            }
        }
        if (class12.field256 == 0) {
            return;
        }
        int var6 = class12.field256 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 < 10) {
            class14.field301.method229(class63.method479(new class67[] { class41.field1010, class71.method586(103, var7), client.field466, class71.method586(103, var8) }, 0), 4, 329, 16776960);
        } else {
            class14.field301.method229(class63.method479(new class67[] { class41.field1010, class71.method586(103, var7), class78.field1842, class71.method586(103, var8) }, 0), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIBII)V", line = 267)
    public static final void method253(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field619++;
        if (arg4 < 17) {
            field615 = null;
        }
        if (class42.method365(92, arg2)) {
            class24.method191(arg1, arg5, 0, 0, arg3, (byte) 114, class54.field1305[arg2], -1, arg6, arg0);
        }
    }
}
