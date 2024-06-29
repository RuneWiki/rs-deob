import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class139 {

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Ln;")
    private class125 field2782 = new class125();

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lsf;")
    private class176 field2791 = new class176();

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    private int field2793;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    private int field2790;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Ldb;")
    private class33 field2794;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Ljd;")
    public static class92 field2777 = class202.method1325((byte) 90, "rect_debug=");

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lrf;")
    public static class167 field2784;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
    public static boolean field2778;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "[[[B")
    public static byte[][][] field2789;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method921(int arg0) {
        field2777 = null;
        if (arg0 <= -118) {
            field2784 = null;
            field2789 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Lwd;")
    public final class210 method922(int arg0) {
        field2779++;
        return arg0 > -84 ? null : this.field2794.method209(false);
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public final void method923(int arg0) {
        if (arg0 >= -92) {
            this.field2794 = null;
        }
        field2795++;
        while (true) {
            class125 var2 = this.field2791.method1165(233647623);
            if (var2 == null) {
                this.field2790 = this.field2793;
                return;
            }
            var2.method1370(126);
            var2.method838(8163);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V")
    public static final void method924(int arg0, byte arg1) {
        field2792++;
        class28.method179(0);
        class28.method176(true);
        int var2 = class55.method325(arg0, 28037).field635;
        if (var2 == 0) {
            return;
        }
        if (arg1 != 125) {
            method924(-3, (byte) 93);
        }
        int var3 = class165.field3242[arg0];
        if (var2 == 1) {
            class34.field775 = var3;
            if (class34.field775 == 1) {
                class194.method1297(0.9F);
            }
            if (class34.field775 == 2) {
                class194.method1297(0.8F);
            }
            if (class34.field775 == 3) {
                class194.method1297(0.7F);
            }
            if (class34.field775 == 4) {
                class194.method1297(0.6F);
            }
            class59.method360((byte) 17);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class151.field2996 != var4) {
                if (class151.field2996 == 0 && class116.field2349 != -1) {
                    class131.method866(1, false, var4, class116.field2349, class81.field1653, 0);
                    class118.field2399 = false;
                } else if (var4 == 0) {
                    class55.method320(77);
                    class118.field2399 = false;
                } else {
                    class86.method580(var4, true);
                }
                class151.field2996 = var4;
            }
        }
        if (var2 == 5) {
            class98.field1992 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class136.field2730 = 127;
            }
            if (var3 == 1) {
                class136.field2730 = 96;
            }
            if (var3 == 2) {
                class136.field2730 = 64;
            }
            if (var3 == 3) {
                class136.field2730 = 32;
            }
            if (var3 == 4) {
                class136.field2730 = 0;
            }
        }
        if (var2 == 9) {
            class136.field2717 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class30.field648 = 127;
            }
            if (var3 == 1) {
                class30.field648 = 96;
            }
            if (var3 == 2) {
                class30.field648 = 64;
            }
            if (var3 == 3) {
                class30.field648 = 32;
            }
            if (var3 == 4) {
                class30.field648 = 0;
            }
        }
        if (var2 == 6) {
            class31.field710 = var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BJ)V")
    public final void method925(byte arg0, long arg1) {
        field2788++;
        class125 var4 = (class125) this.field2794.method216(-108, arg1);
        if (var4 != null) {
            var4.method1370(127);
            var4.method838(8163);
            this.field2790++;
        }
        if (arg0 != -30) {
            field2789 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Lwd;")
    public final class210 method926(int arg0) {
        if (arg0 <= 111) {
            return null;
        } else {
            field2781++;
            return this.field2794.method215((byte) -101);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILn;J)V")
    public final void method927(int arg0, class125 arg1, long arg2) {
        field2787++;
        if (this.field2790 == 0) {
            class125 var5 = this.field2791.method1165(233647623);
            var5.method1370(arg0 - 24620);
            var5.method838(arg0 - 16581);
            if (this.field2782 == var5) {
                class125 var6 = this.field2791.method1165(233647623);
                var6.method1370(arg0 - 24623);
                var6.method838(8163);
            }
        } else {
            this.field2790--;
        }
        this.field2794.method210((byte) -126, arg2, arg1);
        this.field2791.method1163(arg1, 200);
        if (arg0 != 24744) {
            method928(-116, -51, -108, (byte) 35, null, 102, false);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIBLud;IZ)V")
    public static final void method928(int arg0, int arg1, int arg2, byte arg3, class192 arg4, int arg5, boolean arg6) {
        long var7 = (long) ((arg5 << 16) + arg0);
        field2786++;
        class153 var9 = (class153) class100.field2058.method216(-102, var7);
        if (var9 != null) {
            return;
        }
        class153 var10 = (class153) class190.field3610.method216(-107, var7);
        if (var10 != null) {
            return;
        }
        class153 var11 = (class153) class164.field3198.method216(-91, var7);
        if (var11 == null) {
            if (!arg6) {
                class153 var12 = (class153) class126.field2547.method216(-121, var7);
                if (var12 != null) {
                    return;
                }
            }
            class153 var13 = new class153();
            var13.field3028 = arg2;
            if (arg1 != 25213) {
                method924(73, (byte) 42);
            }
            var13.field3035 = arg4;
            var13.field3031 = arg3;
            if (arg6) {
                class100.field2058.method210((byte) -53, var7, var13);
                class208.field4002++;
            } else {
                class156.field3094.method1163(var13, arg1 ^ 0x62B5);
                class164.field3198.method210((byte) -111, var7, var13);
                class74.field1563++;
            }
        } else if (arg6) {
            var11.method838(arg1 ^ 0x7D9E);
            class100.field2058.method210((byte) -78, var7, var11);
            class74.field1563--;
            class208.field4002++;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZIZ)I")
    public static final int method929(boolean arg0, int arg1, boolean arg2) {
        field2780++;
        int var3 = 0;
        if (arg0) {
            var3 += class208.field4002 + class129.field2600;
        }
        if (arg2) {
            var3 += class74.field1563 + class182.field3465;
        }
        int var4 = 25 / ((51 - arg1) / 46);
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IJ)Ln;")
    public final class125 method930(int arg0, long arg1) {
        field2785++;
        int var4 = 120 / ((arg0 + 17) / 45);
        class125 var5 = (class125) this.field2794.method216(-85, arg1);
        if (var5 != null) {
            this.field2791.method1163(var5, 200);
        }
        return var5;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
    public class139(int arg0) {
        this.field2793 = arg0;
        this.field2790 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2794 = new class33(var2);
    }
}
