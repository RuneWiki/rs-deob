import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class29 {

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lod;")
    private class130 field686 = new class130();

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "Lai;")
    private class10 field692 = new class10();

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "Lid;")
    private class78 field691;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Z")
    public static boolean field673 = false;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "Lgg;")
    public static class63 field684 = class116.method911(43, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[I")
    public static int[] field689 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field685 = 2;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Lqd;")
    public static class148 field671 = new class148();

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "Lbe;")
    public static class16 field693 = new class16();

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field695 = 0;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "Lgg;")
    public static class63 field696 = class116.method911(43, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "Lgg;")
    public static class63 field698 = class116.method911(43, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Lmc;")
    public static class111 field681;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lth;")
    public static class179 field675;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Lwc;")
    public static class201 field676;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public final void method282(byte arg0) {
        field672++;
        while (true) {
            class130 var2 = this.field692.method138(-18062);
            if (var2 == null) {
                if (arg0 > -42) {
                    return;
                } else {
                    this.field694 = this.field690;
                    return;
                }
            }
            var2.method1172(-115);
            var2.method962((byte) 33);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)Z")
    public static final boolean method283(int arg0, boolean arg1) {
        field688++;
        if (arg1) {
            return true;
        } else {
            return (arg0 >> 29 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Lte;")
    public final class176 method284(int arg0) {
        field680++;
        if (arg0 != -20164) {
            this.method282((byte) 114);
        }
        return this.field691.method701(arg0 + 20255);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIII)I")
    public static final int method285(byte arg0, int arg1, int arg2, int arg3) {
        field677++;
        int var4 = -33 / ((arg0 - 31) / 46);
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        return (arg2 >> 1) + (arg1 >> 5 << 7) + (arg3 >> 2 << 10);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(JI)V")
    public final void method286(long arg0, int arg1) {
        if (arg1 != 1) {
            method290((byte) -42);
        }
        field683++;
        class130 var4 = (class130) this.field691.method694(arg1 ^ 0xFFFFA254, arg0);
        if (var4 != null) {
            var4.method1172(-12);
            var4.method962((byte) 103);
            this.field694++;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)Lte;")
    public final class176 method287(byte arg0) {
        if (arg0 > -43) {
            this.method293(true, 116L, null);
        }
        field697++;
        return this.field691.method699(-10679);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public static void method288(int arg0) {
        field671 = null;
        field676 = null;
        field675 = null;
        field684 = null;
        field698 = null;
        if (arg0 == -993700571) {
            field693 = null;
            field689 = null;
            field696 = null;
            field681 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(JI)Lod;")
    public final class130 method289(long arg0, int arg1) {
        field679++;
        class130 var4 = (class130) this.field691.method694(-23979, arg0);
        if (var4 != null) {
            this.field692.method133(-90, var4);
        }
        if (arg1 != -130079263) {
            this.method286(1L, 122);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)I")
    public static final int method290(byte arg0) {
        field682++;
        if (arg0 != 92) {
            method290((byte) 34);
        }
        return class108.field2441++;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public static final void method291(int arg0) {
        field674++;
        int var1 = class167.field3437.method856((byte) 2, 8);
        if (var1 < class34.field813) {
            for (int var2 = var1; var2 < class34.field813; var2++) {
                class126.field2784[class90.field2108++] = class177.field3641[var2];
            }
        }
        if (var1 > class34.field813) {
            throw new RuntimeException("gppov1");
        }
        class34.field813 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class177.field3641[var3];
            class62 var5 = class33.field806[var4];
            int var6 = class167.field3437.method856((byte) 2, 1);
            if (var6 == 0) {
                class177.field3641[class34.field813++] = var4;
                var5.field1163 = class173.field3571;
            } else {
                int var7 = class167.field3437.method856((byte) 2, 2);
                if (var7 == 0) {
                    class177.field3641[class34.field813++] = var4;
                    var5.field1163 = class173.field3571;
                    class3.field84[class89.field2092++] = var4;
                } else if (var7 == 1) {
                    class177.field3641[class34.field813++] = var4;
                    var5.field1163 = class173.field3571;
                    int var8 = class167.field3437.method856((byte) 2, 3);
                    var5.method466(-1, false, var8);
                    int var9 = class167.field3437.method856((byte) 2, 1);
                    if (var9 == 1) {
                        class3.field84[class89.field2092++] = var4;
                    }
                } else if (var7 == 2) {
                    class177.field3641[class34.field813++] = var4;
                    var5.field1163 = class173.field3571;
                    int var10 = class167.field3437.method856((byte) 2, 3);
                    var5.method466(-74, true, var10);
                    int var11 = class167.field3437.method856((byte) 2, 3);
                    var5.method466(126, true, var11);
                    int var12 = class167.field3437.method856((byte) 2, 1);
                    if (var12 == 1) {
                        class3.field84[class89.field2092++] = var4;
                    }
                } else if (var7 == 3) {
                    class126.field2784[class90.field2108++] = var4;
                }
            }
        }
        if (arg0 != -1) {
            method290((byte) 68);
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
    public static final void method292(int arg0) {
        field678++;
        if (!class177.field3642) {
            return;
        }
        class124.field2752 = null;
        class186.field3754 = null;
        class165.field3386 = null;
        class136.field2936 = null;
        class91.field2129 = null;
        class48.field1183 = null;
        class131.field2858 = null;
        class157.field3266 = null;
        class73.field1810 = null;
        class196.field3940 = null;
        class180.field3664 = null;
        class34.field814 = null;
        class166.field3401 = null;
        class26.field601 = null;
        class158.field3271 = null;
        class88.field2070 = null;
        class83.field1977 = null;
        class19.field452 = null;
        class114.field2549 = null;
        class41.field952 = null;
        class127.field2802 = null;
        class182.field3700 = null;
        class91.method779((byte) 102, arg0);
        class129.method959(true, (byte) -112);
        class177.field3642 = false;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZJLod;)V")
    public final void method293(boolean arg0, long arg1, class130 arg2) {
        field687++;
        if (this.field694 == 0) {
            class130 var5 = this.field692.method138(-18062);
            var5.method1172(-52);
            var5.method962((byte) 64);
            if (this.field686 == var5) {
                class130 var6 = this.field692.method138(-18062);
                var6.method1172(-75);
                var6.method962((byte) 126);
            }
        } else {
            this.field694--;
        }
        this.field691.method702((byte) 113, arg2, arg1);
        this.field692.method133(77, arg2);
        if (arg0) {
            field676 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V")
    public class29(int arg0) {
        this.field694 = arg0;
        this.field690 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field691 = new class78(var2);
    }
}
