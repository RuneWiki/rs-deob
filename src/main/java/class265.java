import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class265 {

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Lnk;")
    private class95 field4624 = new class95();

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    private int field4628;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    private int field4623;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Lhd;")
    private class214 field4634;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "[Lsc;")
    public static class181[] field4626 = new class181[1000];

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lsc;")
    public static class181 field4633 = class149.method967(255, "showVideoAd");

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method1790(int arg0) {
        field4622++;
        this.field4624.method628(-94);
        this.field4634.method1420(arg0 ^ 0x1405);
        this.field4623 = this.field4628;
        if (arg0 != 0) {
            field4625 = 66;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1791(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field4632++;
        class203[] var7 = class74.field1187;
        int var8 = 0;
        if (arg5 != -43) {
            method1792((class181) null, 101);
        }
        while (var8 < var7.length) {
            class203 var9 = var7[var8];
            if (var9 != null && var9.field3503 == 2) {
                class116.method767(var9.field3499 * 2, (var9.field3495 - class253.field4420 << 7) + var9.field3482, arg4, arg3 >> 1, false, (var9.field3484 - class222.field3844 << 7) + var9.field3492, arg2 >> 1, arg6);
                if (class238.field4135 > -1 && (class237.field4125 % 20) < 10) {
                    class18.field318[var9.field3488].method322(class238.field4135 + arg1 - 12, class11.field228 + arg0 + -28);
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lsc;I)V")
    public static final void method1792(class181 arg0, int arg1) {
        field4617++;
        int var2 = class16.method139((byte) -87, arg0);
        if (var2 == -1) {
            return;
        }
        class98.field1584 = class242.field4214.field3734[var2] - field4625;
        class76.field1222 = class164.field2786 + class222.field3840 - class242.field4214.field3716[var2] - 1;
        int var3 = class98.field1584 - (int) ((float) class160.field2736.field3057 / class22.field388);
        int var4 = (int) ((float) class160.field2736.field3057 / class22.field388) + class98.field1584;
        if (arg1 != 1196741633) {
            field4625 = -23;
        }
        int var5 = class76.field1222 - (int) ((float) class160.field2736.field3041 / class22.field388);
        int var6 = (int) ((float) class160.field2736.field3041 / class22.field388) + class76.field1222;
        if (var5 < 0) {
            class76.field1222 = (int) ((float) class160.field2736.field3041 / class22.field388);
        }
        if (var3 < 0) {
            class98.field1584 = (int) ((float) class160.field2736.field3057 / class22.field388);
        }
        if (class62.field967 < var4) {
            class98.field1584 = class62.field967 - ((int) ((float) class160.field2736.field3057 / class22.field388));
        }
        if (var6 > class222.field3840) {
            class76.field1222 = class222.field3840 - (int) ((float) class160.field2736.field3041 / class22.field388);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static void method1793(int arg0) {
        int var1 = -92 % ((68 - arg0) / 44);
        field4626 = null;
        field4633 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method1794(int arg0, long arg1) {
        field4616++;
        class31 var4 = (class31) this.field4634.method1424(true, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method246((byte) 77);
        if (arg0 != -1) {
            method1799(-26, -36, (byte) 97, -89, -108);
        }
        if (var5 == null) {
            var4.method290((byte) -48);
            var4.method1128((byte) 20);
            this.field4623++;
            return null;
        }
        if (var4.method245(-19)) {
            class89 var6 = new class89(var5);
            this.field4634.method1422(var4.field606, var6, -1);
            this.field4624.method633(var6, -88);
            var6.field2854 = 0L;
            var4.method290((byte) -48);
            var4.method1128((byte) 20);
        } else {
            this.field4624.method633(var4, arg0 ^ 0xFFFFFF99);
            var4.field2854 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IJLjava/lang/Object;)V")
    public final void method1795(int arg0, long arg1, Object arg2) {
        this.method1797(arg1, arg0 + 16319);
        if (arg0 != 14177) {
            return;
        }
        field4627++;
        if (this.field4623 == 0) {
            class31 var5 = (class31) this.field4624.method630(6798);
            var5.method290((byte) -48);
            var5.method1128((byte) 20);
        } else {
            this.field4623--;
        }
        class89 var6 = new class89(arg2);
        this.field4634.method1422(arg1, var6, -1);
        this.field4624.method633(var6, arg0 - 14256);
        var6.field2854 = 0L;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
    public final void method1796(int arg0, int arg1) {
        if (class68.field1086 != null) {
            for (class31 var3 = (class31) this.field4624.method626((byte) -117); var3 != null; var3 = (class31) this.field4624.method629(true)) {
                if (var3.method245(-102)) {
                    if (var3.method246((byte) -79) == null) {
                        var3.method290((byte) -48);
                        var3.method1128((byte) 20);
                        this.field4623++;
                    }
                } else if (++var3.field2854 > (long) arg1) {
                    class31 var4 = class68.field1086.method890(1, var3);
                    this.field4634.method1422(var3.field606, var4, -1);
                    class189.method1309(0, var3, var4);
                    var3.method290((byte) -48);
                    var3.method1128((byte) 20);
                }
            }
        }
        field4631++;
        if (arg0 != 20) {
            field4621 = -48;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(JI)V")
    public final void method1797(long arg0, int arg1) {
        field4619++;
        if (arg1 != 30496) {
            return;
        }
        class31 var4 = (class31) this.field4634.method1424(true, arg0);
        if (var4 != null) {
            var4.method290((byte) -48);
            var4.method1128((byte) 20);
            this.field4623++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    public final void method1798(int arg0) {
        field4620++;
        if (arg0 >= -14) {
            field4626 = null;
        }
        for (class31 var2 = (class31) this.field4624.method626((byte) -117); var2 != null; var2 = (class31) this.field4624.method629(true)) {
            if (var2.method245(-100)) {
                var2.method290((byte) -48);
                var2.method1128((byte) 20);
                this.field4623++;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIBII)V")
    public static final void method1799(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = -47 / ((-arg2 - 15) / 62);
        field4618++;
        for (int var6 = 0; var6 < class207.field3551; var6++) {
            if ((class62.field957[var6] + class25.field434[var6]) > arg0 && class25.field434[var6] < arg0 + arg3 && (class258.field4508[var6] + class137.field2252[var6]) > arg1 && arg1 + arg4 > class137.field2252[var6]) {
                class114.field1849[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)Lgd;")
    public static final class228 method1800(int arg0, int arg1, int arg2, int arg3) {
        field4630++;
        class228 var4 = new class228();
        var4.field3913 = arg2;
        var4.field3914 = arg1;
        class165.field2807.method1422((long) arg0, var4, arg3);
        class115.method762(0, arg2);
        class175 var5 = class52.method394(arg0, false);
        if (var5 != null) {
            class218.method1453((byte) -122, var5);
        }
        if (class210.field3608 != null) {
            class218.method1453((byte) -97, class210.field3608);
            class210.field3608 = null;
        }
        class33.field534 = false;
        class131.field2177 = 0;
        class191.method1318(class64.field1002, class8.field154, class250.field4360, field4621, arg3 - 20);
        if (var5 != null) {
            class66.method469(var5, false, arg3 + 268100241);
        }
        class230.method1512((byte) -124, arg2);
        if (class243.field4227 != -1) {
            class51.method380(1, 1, class243.field4227);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V")
    public class265(int arg0) {
        this.field4628 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field4623 = arg0;
        this.field4634 = new class214(var2);
    }
}
