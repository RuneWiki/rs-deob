import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class43 extends class123 {

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    private int field636 = -1;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    private int field642 = 0;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    private int field645 = -32768;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    private int field632 = -1;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    private int field633 = 0;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    private int field648 = 0;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "Z")
    private boolean field647 = true;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "Lvi;")
    private class129 field652 = null;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    private int field634;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    private int field638;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    private int field643;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "client!tk", name = "W", descriptor = "I")
    private int field659;

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "I")
    private int field657;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "Lpb;")
    private class2 field639;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    private int field631;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "Loh;")
    public static class258 field640 = class153.method1046("hint_mapmarkers", 99);

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field629 = 1;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "Loh;")
    public static class258 field655 = class153.method1046("Eingabeprozedur geladen)3", 96);

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "Loh;")
    public static class258 field653 = class153.method1046("blinken3:", 127);

    @OriginalMember(owner = "client!tk", name = "V", descriptor = "Loh;")
    public static class258 field658 = class153.method1046("Musik)2Engine vorbereitet)3", 106);

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 8)
    public static final void method360(byte arg0) {
        if (arg0 != -68) {
            method367(20, 51, (byte) -15, -81, 126, 19);
        }
        field649++;
        if (class280.field4818 == 10 && class257.field4390) {
            class106.method791((byte) 8, 28);
        }
        if (class280.field4818 == 30) {
            class106.method791((byte) 8, 25);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()I", line = 27)
    public final int method361() {
        field635++;
        return this.field645;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)Lrk;", line = 36)
    private final class123 method362(int arg0) {
        field641++;
        return arg0 == -13538 ? this.method366(-1749267326, false) : (class123) null;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IIIIIIIZLrk;)V", line = 417)
    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class123 arg8) {
        this.field634 = arg2;
        this.field638 = arg4;
        this.field643 = arg0;
        this.field651 = arg1;
        this.field659 = arg5;
        this.field657 = arg3;
        if (class257.field4390 && arg8 != null) {
            if (arg8 instanceof class43) {
                ((class43) arg8).method365(-1);
            } else {
                class101 var10 = class123.method898(-935, this.field643);
                if (var10.field1797 != null) {
                    var10 = var10.method768(-50);
                }
                if (var10 != null) {
                    class14.method95(0, this.field651, this.field634, var10, this.field659, 0, (byte) -109, this.field638, this.field657);
                }
            }
        }
        if (arg6 != -1) {
            this.field639 = class263.method1842(arg6, (byte) -114);
            this.field630 = 0;
            this.field631 = class202.field3498 - 1;
            if (this.field639.field31 == 0 && arg8 != null && arg8 instanceof class43) {
                class43 var11 = (class43) arg8;
                if (this.field639 == var11.field639) {
                    this.field631 = var11.field631;
                    this.field630 = var11.field630;
                    return;
                }
            }
            if (arg7 && this.field639.field14 != -1) {
                this.field630 = (int) (Math.random() * (double) this.field639.field41.length);
                this.field631 -= (int) (Math.random() * (double) this.field639.field35[this.field630]);
            }
        }
        if (class257.field4390 && arg8 != null) {
            this.method366(-1749267326, true);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIIIIJ)V", line = 75)
    public final void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field644++;
        class123 var11 = this.method362(-13538);
        if (var11 != null) {
            var11.method363(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field645 = var11.method361();
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V", line = 99)
    public static void method364(byte arg0) {
        field640 = null;
        int var1 = -62 % ((arg0) / 47);
        field653 = null;
        field658 = null;
        field655 = null;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V", line = 119)
    public final void method365(int arg0) {
        field637++;
        if (this.field652 != null) {
            class9.method63(this.field652, this.field642, this.field648, this.field633);
        }
        this.field632 = arg0;
        this.field652 = null;
        this.field636 = -1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)Lrk;", line = 140)
    private final class123 method366(int arg0, boolean arg1) {
        boolean var3 = class201.field3482 != class134.field2317;
        field646++;
        class101 var4 = class123.method898(arg0 + 1749266391, this.field643);
        if (var4.field1797 != null) {
            var4 = var4.method768(-50);
        }
        if (var4 == null) {
            if (class257.field4390 && !var3) {
                this.method365(-1);
            }
            return null;
        }
        int var5 = this.field634 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field1839;
            var6 = var4.field1790;
        } else {
            var6 = var4.field1839;
            var7 = var4.field1790;
        }
        int var8 = (var6 >> 1) + this.field659;
        int var9 = (var6 + 1 >> 1) + this.field659;
        int var10 = (var7 >> 1) + this.field638;
        int var11 = this.field638 + (var7 + 1 >> 1);
        this.method369(var8 * 128, (byte) 118, var10 * 128);
        boolean var12 = !var3 && var4.field1840 && (this.field636 != var4.field1801 || this.field632 != this.field630 && class250.field4312 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class201.field3482[this.field657];
        int var14 = (this.field638 << 7) + (var7 << 6);
        int var15 = var13[var10][var9] + var13[var11][var9] + var13[var10][var8] + var13[var11][var8] >> 2;
        int var16 = (this.field659 << 7) + (var6 << 6);
        int[][] var17 = (int[][]) null;
        if (var3) {
            var17 = class134.field2317[0];
        } else if (this.field657 < 3) {
            var17 = class201.field3482[this.field657 + 1];
        }
        if (class257.field4390 && var12) {
            class9.method63(this.field652, this.field642, this.field648, this.field633);
        }
        boolean var18 = this.field652 == null;
        if (arg0 != -1749267326) {
            this.field632 = 84;
        }
        class294 var19;
        if (this.field639 == null) {
            var19 = var4.method756(var12, var13, this.field634, var17, true, false, var16, var18 ? class125.field2239 : this.field652, var15, this.field651, var14);
        } else {
            var19 = var4.method761(var18 ? class125.field2239 : this.field652, var13, var14, this.field634, var16, var15, var12, this.field630, var17, this.field651, this.field639, (byte) -96);
        }
        if (var19 == null) {
            return null;
        }
        if (class257.field4390 && var12) {
            if (var18) {
                class125.field2239 = var19.field5049;
            }
            int var20 = 0;
            if (this.field657 != 0) {
                int[][] var21 = class201.field3482[0];
                var20 = var15 - (var21[var10][var8] + var21[var10][var9] + var21[var11][var8] + var21[var11][var9] >> 2);
            }
            class129 var22 = var19.field5049;
            if (this.field647 && class9.method57(var22, var14, var20, var16)) {
                this.field647 = false;
            }
            if (!this.field647) {
                class9.method60(var22, var14, var20, var16);
                this.field652 = var22;
                this.field642 = var14;
                if (var18) {
                    class125.field2239 = null;
                }
                this.field648 = var20;
                this.field633 = var16;
            }
            this.field632 = this.field630;
            this.field636 = var4.field1801;
        }
        return var19.field5054;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBIII)V", line = 277)
    public static final void method367(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field656++;
        class245.field4263 = arg3;
        if (arg2 != -117) {
            field640 = (class258) null;
        }
        class236.field4126 = arg1;
        class101.field1825 = arg4;
        class5.field69 = arg5;
        class194.field3428 = arg0;
        if (class101.field1825 >= 100) {
            int var6 = class5.field69 * 128 + 64;
            int var7 = class236.field4126 * 128 + 64;
            int var8 = class228.method1525(true, class272.field4704, var7, var6) - class245.field4263;
            int var9 = var8 - class245.field4258;
            int var10 = var6 - class285.field4906;
            int var11 = var7 - class61.field1086;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class106.field1894 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class90.field1576 = (int) (Math.atan2((double) var10, (double) var11) * -325.949D) & 0x7FF;
            if (class106.field1894 < 128) {
                class106.field1894 = 128;
            }
            if (class106.field1894 > 383) {
                class106.field1894 = 383;
            }
        }
        class109.field1926 = 2;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)V", line = 323)
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 63) {
            method360((byte) 1);
        }
        field650++;
        if (class257.field4390) {
            this.method366(-1749267326, true);
        } else {
            this.method369(((arg4 - arg1 >> 1) + arg1) * 128 + 64, (byte) 111, ((arg3 - arg2 >> 1) + arg2) * 128 + 64);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBI)V", line = 338)
    private final void method369(int arg0, byte arg1, int arg2) {
        if (this.field639 != null) {
            int var4 = class202.field3498 - this.field631;
            if (var4 > 100 && this.field639.field14 > 0) {
                int var5 = this.field639.field41.length - this.field639.field14;
                while (var5 > this.field630 && var4 > this.field639.field35[this.field630]) {
                    var4 -= this.field639.field35[this.field630];
                    this.field630++;
                }
                if (var5 <= this.field630) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field639.field41.length; var7++) {
                        var6 += this.field639.field35[var7];
                    }
                    var4 %= var6;
                }
            }
            label63: {
                do {
                    do {
                        if (var4 <= this.field639.field35[this.field630]) {
                            break label63;
                        }
                        class122.method891(false, arg0, this.field630, this.field639, (byte) -72, arg2);
                        var4 -= this.field639.field35[this.field630];
                        this.field630++;
                    } while (this.field630 < this.field639.field41.length);
                    this.field630 -= this.field639.field14;
                } while (this.field630 >= 0 && this.field630 < this.field639.field41.length);
                this.field639 = null;
            }
            this.field631 = class202.field3498 - var4;
        }
        if (arg1 < 98) {
            this.field652 = (class129) null;
        }
        field654++;
    }
}
