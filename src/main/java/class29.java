import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class29 extends class160 {

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    private final int field445;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    private final int field458;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    private final int field446;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    private final int field456;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "Lve;")
    public static class255 field448 = class87.method607(108, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "[I")
    public static int[] field450 = new int[2];

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field453 = 0;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "[[I")
    public static int[][] field457 = new int[5][5000];

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "Lve;")
    private static class255 field459 = class87.method607(96, "::errortest");

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "Z")
    public static boolean field461 = false;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Lpb;", line = 8)
    public static final class70 method157(int arg0) {
        field452++;
        class70 var1 = new class70(30);
        var1.method463(false, 7);
        if (arg0 != 1) {
            method162(98, false, 27, (class88) null, (class88) null);
        }
        var1.method463(false, class79.field1291);
        var1.method463(false, class47.field723 ? 1 : 0);
        var1.method463(false, class136.field2259 ? 1 : 0);
        var1.method463(false, class229.field3788 ? 1 : 0);
        var1.method463(false, class298.field5094 ? 1 : 0);
        var1.method463(false, class314.field5328 ? 1 : 0);
        var1.method463(false, class143.field2392 ? 1 : 0);
        var1.method463(false, class136.field2262 ? 1 : 0);
        var1.method463(false, class190.field3048 ? 1 : 0);
        var1.method463(false, class13.field176);
        var1.method463(false, class114.field1921 ? 1 : 0);
        var1.method463(false, class258.field4390 ? 1 : 0);
        var1.method463(false, class304.field5199 ? 1 : 0);
        var1.method463(false, class250.field4222);
        var1.method463(false, class150.field2546 ? 1 : 0);
        var1.method463(false, class25.field392);
        var1.method463(false, class184.field2963);
        var1.method463(false, class301.field5169);
        var1.method462(class264.field4469, (byte) -61);
        var1.method462(class9.field133, (byte) -61);
        var1.method463(false, 2);
        var1.method436(class293.field5023, -18820);
        var1.method463(false, class289.field4979);
        var1.method463(false, class63.field959 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)V", line = 46)
    public final void method158(int arg0, int arg1, int arg2) {
        field454++;
        if (arg0 != -30729) {
            field461 = true;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lve;I)V", line = 57)
    public static final void method159(class255 arg0, int arg1) {
        field455++;
        if (class201.field3483 >= 2) {
            if (arg0.method1779(115, class289.field4982)) {
                class6.method36((byte) 111);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class260.method1807(arg1 ^ 0x1, (class255) null, class3.method14(new class255[] { class49.field740, class215.method1532(var4, true), class183.field2953 }, (byte) -127), 0);
            }
            if (class281.field4827 && arg0.method1779(90, class14.field219)) {
                System.out.println("oncard_geometry:" + class139.field2327);
                System.out.println("oncard_2d:" + class139.field2325);
                System.out.println("oncard_texture:" + class139.field2326);
            }
            if (arg0.method1779(arg1 ^ 0xFFFFFFC9, class82.field1329)) {
                class315.method2174((byte) -68);
            }
            if (arg0.method1779(94, class174.field2885)) {
                class297.field5078.method1007((byte) 98);
            }
            if (arg0.method1779(-70, class128.field2124)) {
                class297.field5078.method1015(arg1);
            }
            if (arg0.method1779(90, class292.field5014)) {
                class37.field570 = true;
            }
            if (arg0.method1779(-95, class1.field9)) {
                class256.method1798(-103, 25);
            }
            if (arg0.method1779(93, class74.field1225)) {
                class103.field1734 = true;
            }
            if (arg0.method1779(-23, class68.field1014)) {
                class103.field1734 = false;
            }
            if (arg0.method1779(arg1 ^ 0x62, class90.field1530)) {
                class149.method1105(false, -1, -1, false, 0);
            }
            if (arg0.method1779(-10, class181.field2930)) {
                class149.method1105(false, -1, -1, false, 1);
            }
            if (arg0.method1779(124, class151.field2559)) {
                class149.method1105(false, -1, -1, false, 2);
            }
            if (arg0.method1779(113, class93.field1598)) {
                class149.method1105(false, 1024, 768, false, 3);
            }
            if (arg0.method1779(85, class258.field4387)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class310.field5292[var5].field2743[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method1768(true, class255.field4359) && class53.field831 != 0) {
                class154.method1133(arg0.method1786(6, 9751).method1746((byte) 50), 110);
            }
            if (arg0.method1779(arg1 - 91, field459) && class53.field831 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1768(true, class114.field1928)) {
                class239.field3995 = arg0.method1786(12, 9751).method1771(255).method1746((byte) 46);
                class260.method1807(1, (class255) null, class3.method14(new class255[] { class173.field2861, class215.method1532(class239.field3995, true) }, (byte) -77), 0);
            }
            if (arg0.method1779(94, class230.field3808)) {
                class198.field3421 = true;
            }
        }
        class266.field4500++;
        class255.field4318.method1523(arg1 ^ 0x56F4, 116);
        if (arg1 != 0) {
            method166((byte) -113);
        }
        class255.field4318.method463(false, arg0.method1774(-41) - 1);
        class255.field4318.method483(arg1 ^ 0xFA0DDC08, arg0.method1786(2, 9751));
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V", line = 209)
    public final void method160(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field460++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)V", line = 219)
    public static final void method161(byte arg0, int arg1) {
        class72.field1186.method562((byte) 92, arg1);
        field447++;
        int var2 = 62 % ((49 - arg0) / 53);
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIII)V", line = 234)
    public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field445 = arg1;
        this.field458 = arg3;
        this.field446 = arg2;
        this.field456 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZILrg;Lrg;)Lmf;", line = 248)
    public static final class42 method162(int arg0, boolean arg1, int arg2, class88 arg3, class88 arg4) {
        boolean var5 = true;
        int[] var6 = arg4.method613(0, arg0);
        if (arg2 != 12170) {
            method165(-62, -35, 111, -9);
        }
        field444++;
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method615((byte) -128, arg0, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg3.method615((byte) -108, 0, var9);
                } else {
                    var10 = arg3.method615((byte) -116, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class42(arg4, arg3, arg0, arg1);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)V", line = 318)
    public final void method163(byte arg0, int arg1, int arg2) {
        field451++;
        int var4 = this.field456 * arg2 >> 12;
        int var5 = this.field446 * arg2 >> 12;
        int var6 = -122 / ((arg0 - 28) / 63);
        int var7 = this.field445 * arg1 >> 12;
        int var8 = this.field458 * arg1 >> 12;
        class152.method1121(var7, (byte) -106, var5, var8, var4, this.field2693);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V", line = 341)
    public static final void method164(byte arg0) {
        field443++;
        if (class195.field3208 != null) {
            class195.field3208.method1034(256);
        }
        if (class250.field4219 != null) {
            class250.field4219.method1034(256);
        }
        if (arg0 != 30) {
            return;
        }
        class130.method962(11034, class150.field2546, 22050, 2);
        class195.field3208 = class151.method1118(class221.field3728, 0, 67, class240.field3999, 22050);
        class195.field3208.method1031(class17.field256, true);
        class250.field4219 = class151.method1118(class221.field3728, 1, arg0 + 70, class240.field3999, 2048);
        class250.field4219.method1031(class230.field3813, true);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)Z", line = 362)
    public static final boolean method165(int arg0, int arg1, int arg2, int arg3) {
        if (class97.method768(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class222.method1557(var4 + 1, class106.field1783[arg0][arg1][arg2] + arg3, var5 + 1) && class222.method1557(var4 + 128 - 1, class106.field1783[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class222.method1557(var4 + 128 - 1, class106.field1783[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class222.method1557(var4 + 1, class106.field1783[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)V", line = 382)
    public static void method166(byte arg0) {
        if (arg0 > -13) {
            field450 = (int[]) null;
        }
        field448 = null;
        field450 = null;
        field459 = null;
        field457 = (int[][]) null;
    }
}
