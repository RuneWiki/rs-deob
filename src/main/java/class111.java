import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class111 extends class9 {

    @OriginalMember(owner = "client!q", name = "Qc", descriptor = "Lu;")
    public static class135 field2692 = class87.method676((byte) -67, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!q", name = "Xc", descriptor = "I")
    public static int field2699 = 0;

    @OriginalMember(owner = "client!q", name = "Zc", descriptor = "I")
    public static int field2701 = 0;

    @OriginalMember(owner = "client!q", name = "Pc", descriptor = "Le;")
    public static class29 field2691 = new class29(50);

    @OriginalMember(owner = "client!q", name = "bd", descriptor = "Lu;")
    private static class135 field2703 = class87.method676((byte) -120, "Loading textures )2 ");

    @OriginalMember(owner = "client!q", name = "cd", descriptor = "Lu;")
    public static class135 field2704 = field2703;

    @OriginalMember(owner = "client!q", name = "Rc", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!q", name = "Sc", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!q", name = "Tc", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!q", name = "Uc", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!q", name = "Wc", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!q", name = "Yc", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!q", name = "ad", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!q", name = "Oc", descriptor = "Lde;")
    public static class27 field2690;

    @OriginalMember(owner = "client!q", name = "Vc", descriptor = "Lhf;")
    public class55 field2697;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lvd;IIII)V")
    public static final void method908(class145 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2700;
        if (class116.field2789 != arg0) {
            if (arg4 < ~class131.field3135) {
                class135 var5;
                if (arg0.field3513 != 0) {
                    var5 = class107.method867(2, new class135[] { arg0.field3516, class40.field928, class44.field1081, class68.method547(arg4 + 400, arg0.field3513), class75.field1776 });
                } else {
                    var5 = class107.method867(2, new class135[] { arg0.field3516, class126.method981((byte) -60, arg0.field3523, class116.field2789.field3523), class40.field928, class20.field471, class68.method547(-1, arg0.field3523), class75.field1776 });
                }
                if (class47.field1125 != 1) {
                    if (class8.field143) {
                        if (~(class79.field1887 & 8) == -9) {
                            ++class41.field948;
                            class95.method785(arg1, (byte) -99, arg2, class107.method867(2, new class135[] { class4.field102, class130.field3122, var5 }), class30.field741, arg3, 16);
                        }
                    } else {
                        for (int var6 = 4; ~var6 <= -1; --var6) {
                            if (class77.field1832[var6] != null) {
                                ++class79.field1862;
                                short var7 = 0;
                                if (!class77.field1832[var6].method1069(90, class82.field1960)) {
                                    if (class76.field1800[var6]) {
                                        var7 = 2000;
                                    }
                                } else {
                                    if (~arg0.field3523 < ~class116.field2789.field3523) {
                                        var7 = 2000;
                                    }
                                    if (~class116.field2789.field3547 != -1 && ~arg0.field3547 != -1) {
                                        if (class116.field2789.field3547 == arg0.field3547) {
                                            var7 = 2000;
                                        } else {
                                            var7 = 0;
                                        }
                                    }
                                }
                                int var8 = 0;
                                if (var6 == 0) {
                                    var8 = var7 + 53;
                                }
                                if (var6 == 1) {
                                    var8 = var7 + 50;
                                }
                                if (var6 == 2) {
                                    var8 = 20 - -var7;
                                }
                                if (var6 == 3) {
                                    var8 = 30 - -var7;
                                }
                                if (var6 == 4) {
                                    var8 = var7 + 23;
                                }
                                class95.method785(arg1, (byte) -99, arg2, class107.method867(2, new class135[] { class49.field1160, var5 }), class77.field1832[var6], arg3, var8);
                            }
                        }
                    }
                } else {
                    class95.method785(arg1, (byte) -99, arg2, class107.method867(arg4 ^ -403, new class135[] { class141.field3433, class130.field3122, var5 }), class108.field2607, arg3, 32);
                    ++class40.field916;
                }
                for (int var9 = 0; class131.field3135 > var9; ++var9) {
                    if (~class69.field1706[var9] == -36) {
                        class108.field2599[var9] = class107.method867(arg4 + 403, new class135[] { class99.field2403, class56.field1348, class49.field1160, var5 });
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lg;II)Lae;")
    public static final class6 method909(class43 arg0, int arg1, int arg2) {
        ++field2696;
        if (!class138.method1119(arg2, arg0, -1)) {
            return null;
        } else {
            if (arg1 != 0) {
                field2691 = null;
            }
            return class105.method855(88);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)Z")
    public final boolean method45(byte arg0) {
        ++field2694;
        if (this.field2697 == null) {
            return false;
        } else {
            if (arg0 != 55) {
                method911(-125);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!q", name = "i", descriptor = "(I)V")
    public static void method910(int arg0) {
        if (arg0 == 10626) {
            field2703 = null;
            field2692 = null;
            field2690 = null;
            field2691 = null;
            field2704 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "j", descriptor = "(I)V")
    public static final void method911(int arg0) {
        Object var1 = class60.field1528;
        synchronized (class60.field1528) {
            if (~class93.field2216 != -1) {
                class93.field2216 = 1;
                try {
                    class60.field1528.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        if (arg0 != -20743) {
            method912(-86, (byte) -39);
        }
        ++field2695;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Lna;")
    public final class91 method273(byte arg0) {
        ++field2698;
        if (this.field2697 == null) {
            return null;
        } else {
            class84 var2 = super.field170 != -1 && ~super.field177 == -1 ? class17.method108(super.field170, 0) : null;
            class84 var3 = ~super.field159 == 0 || super.field232 == super.field159 && var2 != null ? null : class17.method108(super.field159, 0);
            class91 var4 = this.field2697.method415(var3, (byte) 114, super.field194, super.field163, var2);
            if (var4 == null) {
                return null;
            } else {
                var4.method702();
                super.field167 = var4.field3495;
                if (super.field155 != -1 && super.field201 != -1) {
                    class91 var5 = class44.method345(super.field155, true).method146(30814, super.field201);
                    if (var5 != null) {
                        var5.method707(0, -super.field188, 0);
                        class91[] var6 = new class91[] { var4, var5 };
                        var4 = new class91(var6, 2);
                    }
                }
                int var7 = -73 % ((-59 - arg0) / 51);
                if (this.field2697.field1319 == 1) {
                    var4.field2125 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
    public static final void method912(int arg0, byte arg1) {
        ++field2702;
        if (arg1 <= 60) {
            method908((class145) null, -13, -4, 107, -97);
        }
        class148.field3701 = arg0;
    }
}
