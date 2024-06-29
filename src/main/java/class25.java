import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 {

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    private int field329 = 0;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public int field324;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "[Lre;")
    public class222[] field321;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[Z")
    public static boolean[] field314 = new boolean[100];

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "[I")
    public static int[] field316 = new int[1000];

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field317 = -1;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "[I")
    public static int[] field311 = new int[100];

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Lcf;")
    public static class93 field328 = class147.method1066(":assistreq:", -48);

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Lcf;")
    public static class93 field318 = class147.method1066("M-Bmoire attribu-Be", -48);

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lcf;")
    public static class93 field313 = class147.method1066("Connexion perdue)3", -48);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "J")
    private long field325;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Lre;")
    private class222 field315;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Lre;")
    private class222 field330;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lcc;I)V")
    public static final void method129(class210 arg0, int arg1) {
        arg0.field3795 = false;
        if (arg0.field3797 != -1) {
            class31 var2 = class131.method964(arg0.field3797, true);
            if (var2 == null || var2.field479 == null) {
                arg0.field3797 = -1;
            } else {
                arg0.field3767++;
                if (var2.field479.length > arg0.field3862 && var2.field486[arg0.field3862] < arg0.field3767) {
                    arg0.field3796++;
                    arg0.field3767 = 1;
                    arg0.field3862++;
                    class55.method309(arg0.field3784, arg0.field3862, var2, arg0.field3868, -17474, class166.field2927 == arg0);
                }
                if (arg0.field3862 >= var2.field479.length) {
                    arg0.field3767 = 0;
                    arg0.field3862 = 0;
                    class55.method309(arg0.field3784, arg0.field3862, var2, arg0.field3868, -17474, class166.field2927 == arg0);
                }
                arg0.field3796 = arg0.field3862 + 1;
                if (arg0.field3796 >= var2.field479.length) {
                    arg0.field3796 = 0;
                }
            }
        }
        field332++;
        if (arg0.field3846 != -1 && arg0.field3802 <= class275.field4921) {
            int var3 = class188.method1359(arg0.field3846, -83).field2352;
            if (var3 == -1) {
                arg0.field3846 = -1;
            } else {
                class31 var4 = class131.method964(var3, true);
                if (var4 == null || var4.field479 == null) {
                    arg0.field3846 = -1;
                } else {
                    if (arg0.field3847 < 0) {
                        arg0.field3847 = 0;
                        class55.method309(arg0.field3784, 0, var4, arg0.field3868, arg1 - 29952, class166.field2927 == arg0);
                    }
                    arg0.field3798++;
                    if (var4.field479.length > arg0.field3847 && var4.field486[arg0.field3847] < arg0.field3798) {
                        arg0.field3847++;
                        arg0.field3798 = 1;
                        class55.method309(arg0.field3784, arg0.field3847, var4, arg0.field3868, arg1 - 29952, class166.field2927 == arg0);
                    }
                    if (var4.field479.length <= arg0.field3847) {
                        arg0.field3846 = -1;
                    }
                    arg0.field3829 = arg0.field3847 + 1;
                    if (arg0.field3829 >= var4.field479.length) {
                        arg0.field3829 = -1;
                    }
                }
            }
        }
        if (arg0.field3840 != -1 && arg0.field3869 <= 1) {
            class31 var5 = class131.method964(arg0.field3840, true);
            if (var5.field473 == 1 && arg0.field3785 > 0 && arg0.field3804 <= class275.field4921 && arg0.field3833 < class275.field4921) {
                arg0.field3869 = 1;
                return;
            }
        }
        if (arg0.field3840 != -1 && arg0.field3869 == 0) {
            class31 var6 = class131.method964(arg0.field3840, true);
            if (var6 == null || var6.field479 == null) {
                arg0.field3840 = -1;
            } else {
                arg0.field3811++;
                if (var6.field479.length > arg0.field3852 && arg0.field3811 > var6.field486[arg0.field3852]) {
                    arg0.field3811 = 1;
                    arg0.field3852++;
                    class55.method309(arg0.field3784, arg0.field3852, var6, arg0.field3868, arg1 ^ 0xFFFF8B00, class166.field2927 == arg0);
                }
                if (arg0.field3852 >= var6.field479.length) {
                    arg0.field3856++;
                    arg0.field3852 -= var6.field489;
                    if (arg0.field3856 >= var6.field481) {
                        arg0.field3840 = -1;
                    } else if (arg0.field3852 >= 0 && var6.field479.length > arg0.field3852) {
                        class55.method309(arg0.field3784, arg0.field3852, var6, arg0.field3868, arg1 ^ 0xFFFF8B00, class166.field2927 == arg0);
                    } else {
                        arg0.field3840 = -1;
                    }
                }
                arg0.field3817 = arg0.field3852 + 1;
                if (arg0.field3817 >= var6.field479.length) {
                    arg0.field3817 -= var6.field489;
                    if (var6.field481 <= arg0.field3856 + 1) {
                        arg0.field3817 = -1;
                    } else if (arg0.field3817 < 0 || arg0.field3817 >= var6.field479.length) {
                        arg0.field3817 = -1;
                    }
                }
                arg0.field3795 = var6.field484;
            }
        }
        if (arg0.field3869 > 0) {
            arg0.field3869--;
        }
        if (arg1 != 12478) {
            field313 = null;
        }
        for (int var7 = 0; var7 < arg0.field3775.length; var7++) {
            class208 var8 = arg0.field3775[var7];
            if (var8 != null) {
                if (var8.field3720 > 0) {
                    var8.field3720--;
                } else {
                    class31 var9 = class131.method964(var8.field3729, true);
                    if (var9 == null || var9.field479 == null) {
                        arg0.field3775[var7] = null;
                    } else {
                        var8.field3719++;
                        if (var9.field479.length > var8.field3724 && var8.field3719 > var9.field486[var8.field3724]) {
                            var8.field3719 = 1;
                            var8.field3724++;
                            class55.method309(arg0.field3784, var8.field3724, var9, arg0.field3868, -17474, class166.field2927 == arg0);
                        }
                        if (var9.field479.length <= var8.field3724) {
                            var8.field3723++;
                            var8.field3724 -= var9.field489;
                            if (var9.field481 <= var8.field3723) {
                                arg0.field3775[var7] = null;
                            } else if (var8.field3724 >= 0 && var9.field479.length > var8.field3724) {
                                class55.method309(arg0.field3784, var8.field3724, var9, arg0.field3868, -17474, class166.field2927 == arg0);
                            } else {
                                arg0.field3775[var7] = null;
                            }
                        }
                        var8.field3730 = var8.field3724 + 1;
                        if (var9.field479.length <= var8.field3730) {
                            var8.field3730 -= var9.field489;
                            if (var9.field481 <= (var8.field3723 + 1)) {
                                var8.field3730 = -1;
                            } else if (var8.field3730 < 0 || var9.field479.length <= var8.field3730) {
                                var8.field3730 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static final void method130(byte arg0) {
        class276.field4938 = 0;
        field310++;
        class138.field2407 = 0;
        class63.method415((byte) 94);
        class54.method303((byte) -115);
        class180.method1325(27159);
        int var1 = 0;
        if (arg0 != -26) {
            return;
        }
        while (var1 < class276.field4938) {
            int var3 = class18.field235[var1];
            if (class275.field4921 != class155.field2709[var3].field3793) {
                if (class155.field2709[var3].field4062.method1048(-8442)) {
                    class213.method1505(arg0 + 25, class155.field2709[var3]);
                }
                class155.field2709[var3].method1561((class145) null, 14579);
                class155.field2709[var3] = null;
            }
            var1++;
        }
        if (class72.field1300 != class250.field4504.field5027) {
            throw new RuntimeException("gnp1 pos:" + class250.field4504.field5027 + " psize:" + class72.field1300);
        }
        for (int var2 = 0; var2 < class72.field1299; var2++) {
            if (class155.field2709[class58.field995[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class72.field1299);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)I")
    public final int method131(int arg0) {
        if (arg0 < 15) {
            this.method133((byte) 49);
        }
        field327++;
        return this.field324;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)Lre;")
    public final class222 method132(byte arg0) {
        this.field329 = 0;
        if (arg0 == 103) {
            field322++;
            return this.method136(81);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)I")
    public final int method133(byte arg0) {
        field326++;
        if (arg0 != -45) {
            return -34;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field324; var3++) {
            class222 var4 = this.field321[var3];
            for (class222 var5 = var4.field4007; var5 != var4; var5 = var5.field4007) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)Lre;")
    public final class222 method134(int arg0) {
        field333++;
        if (arg0 != 3090) {
            this.method136(50);
        }
        if (this.field315 == null) {
            return null;
        }
        class222 var2 = this.field321[(int) ((long) (this.field324 - 1) & this.field325)];
        while (this.field315 != var2) {
            if (this.field315.field4006 == this.field325) {
                class222 var3 = this.field315;
                this.field315 = this.field315.field4007;
                return var3;
            }
            this.field315 = this.field315.field4007;
        }
        this.field315 = null;
        return null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(JZ)Lre;")
    public final class222 method135(long arg0, boolean arg1) {
        this.field325 = arg0;
        field331++;
        if (!arg1) {
            this.method132((byte) -40);
        }
        class222 var4 = this.field321[(int) (arg0 & (long) (this.field324 - 1))];
        for (this.field315 = var4.field4007; this.field315 != var4; this.field315 = this.field315.field4007) {
            if (this.field315.field4006 == arg0) {
                class222 var5 = this.field315;
                this.field315 = this.field315.field4007;
                return var5;
            }
        }
        this.field315 = null;
        return null;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(I)V")
    public class25(int arg0) {
        this.field324 = arg0;
        this.field321 = new class222[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class222 var3 = this.field321[var2] = new class222();
            var3.field4007 = var3;
            var3.field4005 = var3;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)Lre;")
    public final class222 method136(int arg0) {
        field319++;
        if (this.field329 > 0 && this.field321[this.field329 - 1] != this.field330) {
            class222 var2 = this.field330;
            this.field330 = var2.field4007;
            return var2;
        }
        while (this.field324 > this.field329) {
            class222 var4 = this.field321[this.field329++].field4007;
            if (this.field321[this.field329 - 1] != var4) {
                this.field330 = var4.field4007;
                return var4;
            }
        }
        int var3 = 40 / ((arg0 + 37) / 50);
        return null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(JLre;I)V")
    public final void method137(long arg0, class222 arg1, int arg2) {
        if (arg1.field4005 != null) {
            arg1.method1544((byte) -26);
        }
        field320++;
        class222 var5 = this.field321[(int) ((long) (this.field324 + arg2) & arg0)];
        arg1.field4005 = var5.field4005;
        arg1.field4006 = arg0;
        arg1.field4007 = var5;
        arg1.field4005.field4007 = arg1;
        arg1.field4007.field4005 = arg1;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
    public static void method138(int arg0) {
        if (arg0 != -96) {
            field317 = -100;
        }
        field311 = null;
        field316 = null;
        field328 = null;
        field318 = null;
        field313 = null;
        field314 = null;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
    public final void method139(int arg0) {
        field312++;
        for (int var2 = arg0; var2 < this.field324; var2++) {
            class222 var3 = this.field321[var2];
            while (true) {
                class222 var4 = var3.field4007;
                if (var3 == var4) {
                    break;
                }
                var4.method1544((byte) -53);
            }
        }
        this.field330 = null;
        this.field315 = null;
    }
}
