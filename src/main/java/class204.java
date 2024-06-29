import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class204 {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field2793 = 0;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field2796 = 0;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "[Z")
    public static boolean[] field2797 = new boolean[8];

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    private int field2802;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)I")
    public static final int method1109(boolean arg0) {
        field2795++;
        if (arg0) {
            return 89;
        } else if (class479.field6773) {
            return 0;
        } else if (class420.method2503((byte) 102)) {
            return class445.field6337 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)I")
    public static final int method1110(byte arg0) {
        field2806++;
        if (arg0 > -44) {
            field2797 = null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)V")
    public static void method1111(boolean arg0) {
        if (!arg0) {
            method1110((byte) 98);
        }
        field2797 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBII)Z")
    public final boolean method1112(int arg0, byte arg1, int arg2, int arg3) {
        field2804++;
        int var5 = this.field2802;
        if (this.field2805 == arg3 && this.field2802 == 0) {
            return false;
        } else if (arg1 < 104) {
            return true;
        } else {
            boolean var8;
            if (this.field2802 == 0) {
                if (this.field2805 < arg3 && arg3 <= (this.field2805 + arg2) || arg3 < this.field2805 && this.field2805 - arg2 <= arg3) {
                    this.field2805 = arg3;
                    return false;
                }
                var8 = true;
            } else if (this.field2802 > 0 && arg3 > this.field2805) {
                int var6 = this.field2802 * this.field2802 / (arg2 * 2);
                int var7 = this.field2805 + var6;
                if (var7 < arg3 && this.field2805 <= var7) {
                    var8 = true;
                } else {
                    var8 = false;
                }
            } else if (this.field2802 < 0 && this.field2805 > arg3) {
                int var9 = this.field2802 * this.field2802 / (arg2 * 2);
                int var10 = this.field2805 - var9;
                if (arg3 < var10 && var10 <= this.field2805) {
                    var8 = true;
                } else {
                    var8 = false;
                }
            } else {
                var8 = false;
            }
            if (var8) {
                if (this.field2805 >= arg3) {
                    this.field2802 -= arg2;
                    if (arg0 != 0 && -arg0 > this.field2802) {
                        this.field2802 = -arg0;
                    }
                } else {
                    this.field2802 += arg2;
                    if (arg0 != 0 && this.field2802 > arg0) {
                        this.field2802 = arg0;
                    }
                }
                if (this.field2802 != var5) {
                    int var11 = this.field2802 * this.field2802 / (arg2 * 2);
                    if (arg3 <= this.field2805) {
                        if (this.field2805 > arg3 && (this.field2805 - var11) < arg3) {
                            this.field2802 = var5;
                        }
                    } else if (arg3 < (this.field2805 + var11)) {
                        this.field2802 = var5;
                    }
                }
            } else if (this.field2802 > 0) {
                this.field2802 -= arg2;
                if (this.field2802 < 0) {
                    this.field2802 = 0;
                }
            } else {
                this.field2802 += arg2;
                if (this.field2802 > 0) {
                    this.field2802 = 0;
                }
            }
            this.field2805 += this.field2802 + var5 >> 1;
            return var8;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIB)I")
    public static final int method1113(int arg0, int arg1, byte arg2) {
        if (arg2 > -68) {
            field2796 = -60;
        }
        field2799++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg1--;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIILva;)V")
    public static final void method1114(int arg0, int arg1, int arg2, class60 arg3) {
        class263 var4 = class88.method444(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field3798 = arg3;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
    public static final void method1115(int arg0, int arg1) {
        field2798++;
        class210 var2 = class160.field1926;
        synchronized (class160.field1926) {
            class160.field1926.method1166(arg0, (byte) -52);
        }
        if (arg1 <= 9) {
            field2797 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)I")
    public final int method1116(byte arg0) {
        field2803++;
        if (arg0 <= 114) {
            method1111(false);
        }
        return this.field2805 & 0x3FFF;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public final void method1117(int arg0) {
        field2800++;
        this.field2805 &= arg0;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(Z)V")
    public static final void method1118(boolean arg0) {
        field2794++;
        class398.method2383(class484.field6868, 87);
        class146.field1770++;
        if (class183.field2365 && class105.field1271) {
            int var1 = class278.field3966.method837(-1);
            int var2 = class278.field3966.method838(121);
            int var3 = var1 - class101.field1231;
            int var4 = var2 - class318.field4635;
            if (var3 < class404.field5750) {
                var3 = class404.field5750;
            }
            if (class404.field5750 + class487.field6916.field3597 < class484.field6868.field3597 + var3) {
                var3 = class404.field5750 + class487.field6916.field3597 - class484.field6868.field3597;
            }
            if (var4 < class297.field4435) {
                var4 = class297.field4435;
            }
            if (class297.field4435 + class487.field6916.field3707 < class484.field6868.field3707 + var4) {
                var4 = class487.field6916.field3707 + class297.field4435 - class484.field6868.field3707;
            }
            int var5 = var3 + class487.field6916.field3638 - class404.field5750;
            if (!arg0) {
                int var6 = class487.field6916.field3658 + var4 - class297.field4435;
                if (class278.field3966.method2178(0)) {
                    if (class146.field1770 > class484.field6868.field3682) {
                        int var7 = var3 - class415.field5991;
                        int var8 = var4 - class420.field6054;
                        if (var7 > class484.field6868.field3629 || var7 < -class484.field6868.field3629 || class484.field6868.field3629 < var8 || var8 < -class484.field6868.field3629) {
                            class157.field1873 = true;
                        }
                    }
                    if (class484.field6868.field3566 != null && class157.field1873) {
                        class35 var9 = new class35();
                        var9.field429 = class484.field6868;
                        var9.field430 = var6;
                        var9.field433 = var5;
                        var9.field435 = class484.field6868.field3566;
                        class396.method2371(var9);
                        return;
                    }
                } else {
                    if (class157.field1873) {
                        class379.method2270((byte) -37);
                        if (class484.field6868.field3709 != null) {
                            class35 var10 = new class35();
                            var10.field430 = var6;
                            var10.field433 = var5;
                            var10.field429 = class484.field6868;
                            var10.field424 = class261.field3763;
                            var10.field435 = class484.field6868.field3709;
                            class396.method2371(var10);
                        }
                        if (class261.field3763 != null && client.method1673(class484.field6868) != null) {
                            class184.method998(class261.field3763, class484.field6868, 1);
                        }
                    } else if ((class381.field5402 == 1 || class312.method1932(-1011)) && class223.field3099 > 2) {
                        class480.method2836(class415.field5991 + class101.field1231, 0, class420.field6054 + class318.field4635);
                    } else if (class78.method395(-1)) {
                        class480.method2836(class415.field5991 + class101.field1231, 0, class420.field6054 + class318.field4635);
                    }
                    class484.field6868 = null;
                }
            }
        } else if (class146.field1770 > 1) {
            class484.field6868 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V")
    public final void method1119(int arg0, int arg1) {
        field2801++;
        this.field2802 = 0;
        if (arg1 != -1728840991) {
            this.field2805 = 22;
        }
        this.field2805 = arg0;
    }
}
