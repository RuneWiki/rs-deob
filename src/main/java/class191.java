import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class191 {

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    private int field2634 = 0;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Z")
    public boolean field2630 = false;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Z")
    public boolean field2636 = false;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    private int field2644 = 0;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public int field2638 = -1;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    private int field2628 = 0;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    private int field2643 = 128;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    private int field2635 = 128;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2642 = "Please wait...";

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "[I")
    public static int[] field2647 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lic;")
    public static class143 field2629 = new class143(64);

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    private int field2640;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "[S")
    private short[] field2637;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "[S")
    private short[] field2645;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "[S")
    private short[] field2646;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "[S")
    private short[] field2649;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "[Z")
    public static boolean[] field2650;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method1222(int arg0) {
        if (arg0 == 7301) {
            field2647 = null;
            field2629 = null;
            field2650 = null;
            field2642 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILql;I)V")
    private final void method1223(int arg0, class224 arg1, int arg2) {
        field2641++;
        if (arg0 != -20580) {
            this.field2636 = false;
        }
        if (arg2 == 1) {
            this.field2640 = arg1.method1445(false);
        } else if (arg2 == 2) {
            this.field2638 = arg1.method1445(false);
        } else if (arg2 == 4) {
            this.field2643 = arg1.method1445(false);
        } else if (arg2 == 5) {
            this.field2635 = arg1.method1445(false);
        } else if (arg2 == 6) {
            this.field2628 = arg1.method1445(false);
        } else if (arg2 == 7) {
            this.field2634 = arg1.method1453((byte) -128);
        } else if (arg2 == 8) {
            this.field2644 = arg1.method1453((byte) -128);
        } else if (arg2 == 9) {
            this.field2636 = true;
        } else if (arg2 == 10) {
            this.field2630 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method1453((byte) -127);
            this.field2637 = new short[var4];
            this.field2645 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2637[var5] = (short) arg1.method1445(false);
                this.field2645[var5] = (short) arg1.method1445(false);
            }
            return;
        } else if (arg2 == 41) {
            int var6 = arg1.method1453((byte) -128);
            this.field2646 = new short[var6];
            this.field2649 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2649[var7] = (short) arg1.method1445(false);
                this.field2646[var7] = (short) arg1.method1445(false);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLql;)V")
    public final void method1224(byte arg0, class224 arg1) {
        while (true) {
            int var3 = arg1.method1453((byte) -127);
            if (var3 == 0) {
                if (arg0 != -50) {
                    this.field2649 = null;
                }
                field2648++;
                return;
            }
            this.method1223(-20580, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZ)Lgh;")
    public final class25 method1225(int arg0, int arg1, int arg2, boolean arg3) {
        field2631++;
        class25 var5 = (class25) class71.field991.method540((byte) -124, (long) this.field2639);
        if (var5 == null) {
            class271 var6 = class271.method1813(class17.field176, this.field2640, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field2637 != null) {
                for (int var7 = 0; var7 < this.field2637.length; var7++) {
                    var6.method1796(this.field2637[var7], this.field2645[var7]);
                }
            }
            if (this.field2649 != null) {
                for (int var8 = 0; var8 < this.field2649.length; var8++) {
                    var6.method1797(this.field2649[var8], this.field2646[var8]);
                }
            }
            var5 = var6.method1794(this.field2634 + 64, 850 - -this.field2644, -30, -50, -30);
            class71.field991.method543(var5, (long) this.field2639, 858993459);
        }
        if (arg3) {
            this.field2628 = 64;
        }
        class25 var9;
        if (this.field2638 == -1 || arg1 == -1) {
            var9 = var5.method136(true, true, true);
        } else {
            var9 = class132.method905(!arg3, this.field2638).method1606((byte) -10, arg2, var5, arg0, arg1);
        }
        if (this.field2643 != 128 || this.field2635 != 128) {
            var9.method135(this.field2643, this.field2635, this.field2643);
        }
        if (this.field2628 != 0) {
            if (this.field2628 == 90) {
                var9.method112();
            }
            if (this.field2628 == 180) {
                var9.method123();
            }
            if (this.field2628 == 270) {
                var9.method128();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(BLql;)Lch;")
    public static final class290 method1226(byte arg0, class224 arg1) {
        field2633++;
        if (arg0 != -109) {
            method1222(-118);
        }
        return new class290(arg1.method1479(false), arg1.method1479(false), arg1.method1479(false), arg1.method1479(false), arg1.method1454(-95), arg1.method1453((byte) -128));
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lhc;[Lq;Z)V")
    public static final void method1227(class235 arg0, class128[] arg1, boolean arg2) {
        field2632++;
        class5.field41 = arg0;
        class156.field2176 = arg1;
        class93.field1296 = new boolean[class156.field2176.length];
        class229.field3473.method19((byte) 11);
        int var3 = class5.field41.method1568("details", -7551);
        int[] var4 = class5.field41.method1567((byte) 104, var3);
        if (arg2) {
            method1226((byte) 120, (class224) null);
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class229.field3473.method20(class212.method1381(var4[var5], 20788, new class224(class5.field41.method1576(-102, var3, var4[var5]))), (long) var4[var5], 0);
        }
    }
}
