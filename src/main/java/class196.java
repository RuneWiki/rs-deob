import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class196 {

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field2816 = 99;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field2815 = -1;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public int field2824 = -1;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public int field2821 = -1;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public int field2830 = 5;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Z")
    public boolean field2813 = false;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Z")
    public boolean field2823 = false;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public int field2820 = 2;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field2826 = -1;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public int field2828 = -1;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Z")
    public boolean field2836 = false;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Z")
    public boolean field2838 = false;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2814 = -1;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
    public int[] field2818;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "[I")
    public int[] field2825;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "[I")
    private int[] field2829;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "[Z")
    public boolean[] field2835;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "[[I")
    public int[][] field2834;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBILpa;I)Lpa;")
    public final class2 method1249(int arg0, int arg1, byte arg2, int arg3, class2 arg4, int arg5) {
        field2822++;
        int var7 = this.field2825[arg0];
        int var8 = this.field2818[arg0];
        class246 var9 = class172.method1134(false, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method18(true, true, true);
        }
        if (arg2 <= 25) {
            this.method1253(-81, (class2) null, 112, -72, -45);
        }
        int var11 = arg1 & 0x3;
        class246 var12 = null;
        if ((this.field2813 || class5.field80) && arg3 != -1 && arg3 < this.field2818.length) {
            int var13 = this.field2818[arg3];
            var12 = class172.method1134(false, var13 >> 16);
            arg3 = var13 & 0xFFFF;
        }
        class2 var14;
        if (var12 == null) {
            var14 = arg4.method18(!var9.method1609((byte) 126, var10), !var9.method1611(4, var10), !this.field2823);
        } else {
            var14 = arg4.method18(!var9.method1609((byte) 75, var10) & !var12.method1609((byte) 100, arg3), !var9.method1611(4, var10) & !var12.method1611(4, arg3), !this.field2823);
        }
        if (var11 == 1) {
            var14.method33();
        } else if (var11 == 2) {
            var14.method32();
        } else if (var11 == 3) {
            var14.method34();
        }
        var14.method17(var9, var10, var12, arg3, arg5 - 1, var7, this.field2823);
        if (var11 == 1) {
            var14.method34();
        } else if (var11 == 2) {
            var14.method32();
        } else if (var11 == 3) {
            var14.method33();
        }
        return var14;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lkl;I)V")
    public final void method1250(class114 arg0, int arg1) {
        field2833++;
        while (true) {
            int var3 = arg0.method760(false);
            if (var3 == 0) {
                if (arg1 == 11613) {
                    return;
                } else {
                    this.field2820 = 69;
                    return;
                }
            }
            this.method1255(var3, arg0, 529590160);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZII)Ljc;")
    public static final class261 method1251(int arg0, boolean arg1, int arg2, int arg3) {
        field2827++;
        class261 var4 = new class261();
        var4.field3941 = arg3;
        var4.field3940 = arg0;
        class128.field1874.method1215(var4, -124, (long) arg2);
        class68.method460(arg0, (byte) -98);
        class267 var5 = class282.method1897(arg2, 74);
        if (var5 != null) {
            class217.method1396(arg1, var5);
        }
        if (arg1) {
            return null;
        }
        if (class101.field1508 != null) {
            class217.method1396(false, class101.field1508);
            class101.field1508 = null;
        }
        int var6 = class283.field4508;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class224.method1460(105, class280.field4475[var7])) {
                class171.method1130(15, var7);
            }
        }
        if (class283.field4508 == 1) {
            class151.field2185 = false;
            class237.method1556(class200.field2896, class178.field2544, class218.field3225, -22059, class52.field763);
        } else {
            class237.method1556(class200.field2896, class178.field2544, class218.field3225, -22059, class52.field763);
            int var8 = class179.field2556.method1278(class253.field3848);
            for (int var9 = 0; var9 < class283.field4508; var9++) {
                int var10 = class179.field2556.method1278(class274.method1849((byte) 98, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class52.field763 = var8 + 8;
            class218.field3225 = class283.field4508 * 15 + (class56.field854 ? 26 : 22);
        }
        if (var5 != null) {
            class130.method897(-501, var5, false);
        }
        class89.method601(arg0, true);
        if (class193.field2774 != -1) {
            class168.method1114(false, class193.field2774, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lpa;IBII)Lpa;")
    public final class2 method1252(class2 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2819++;
        int var6 = this.field2825[arg4];
        int var7 = this.field2818[arg4];
        class246 var8 = class172.method1134(false, var7 >> 16);
        if (arg2 > -12) {
            return null;
        }
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg0.method15(true, true, true);
        }
        class246 var10 = null;
        if ((this.field2813 || class5.field80) && arg3 != -1 && arg3 < this.field2818.length) {
            int var11 = this.field2818[arg3];
            var10 = class172.method1134(false, var11 >> 16);
            arg3 = var11 & 0xFFFF;
        }
        class2 var12;
        if (var10 == null) {
            var12 = arg0.method15(!var8.method1609((byte) 126, var9), !var8.method1611(4, var9), !this.field2823);
        } else {
            var12 = arg0.method15(!var8.method1609((byte) 100, var9) & !var10.method1609((byte) 76, arg3), !var8.method1611(4, var9) & !var10.method1611(4, arg3), !this.field2823);
        }
        var12.method17(var8, var9, var10, arg3, arg1 - 1, var6, this.field2823);
        return var12;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILpa;III)Lpa;")
    public final class2 method1253(int arg0, class2 arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field2825[arg2];
        field2837++;
        int var7 = this.field2818[arg2];
        if (arg0 != -11163) {
            this.field2818 = null;
        }
        class246 var8 = class172.method1134(false, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method26(true, true, true);
        }
        class246 var10 = null;
        class246 var11 = null;
        if ((this.field2813 || class5.field80) && arg3 != -1 && this.field2818.length > arg3) {
            int var12 = this.field2818[arg3];
            var10 = class172.method1134(false, var12 >> 16);
            arg3 = var12 & 0xFFFF;
        }
        class246 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field2829 != null) {
            if (this.field2829.length > arg2) {
                var14 = this.field2829[arg2];
                if (var14 != 65535) {
                    var11 = class172.method1134(false, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field2813 || class5.field80) && arg3 != -1 && this.field2829.length > arg3) {
                var15 = this.field2829[arg3];
                if (var15 != 65535) {
                    var13 = class172.method1134(false, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1609((byte) 88, var9);
        boolean var17 = !var8.method1611(4, var9);
        if (var11 != null) {
            var16 &= !var11.method1609((byte) 90, var14);
            var17 &= !var11.method1611(arg0 ^ 0xFFFFD461, var14);
        }
        if (var10 != null) {
            var16 &= !var10.method1609((byte) 106, arg3);
            var17 &= !var10.method1611(4, arg3);
        }
        if (var13 != null) {
            var16 &= !var13.method1609((byte) 108, var15);
            var17 &= !var13.method1611(4, var15);
        }
        class2 var18 = arg1.method26(var16, var17, !this.field2823);
        var18.method17(var8, var9, var10, arg3, arg4 - 1, var6, this.field2823);
        if (var11 != null) {
            var18.method17(var11, var14, var13, var15, arg4 - 1, var6, this.field2823);
        }
        return var18;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public final void method1254(boolean arg0) {
        if (this.field2826 == -1) {
            if (this.field2835 == null) {
                this.field2826 = 0;
            } else {
                this.field2826 = 2;
            }
        }
        if (arg0) {
            return;
        }
        field2832++;
        if (this.field2821 != -1) {
            return;
        }
        if (this.field2835 == null) {
            this.field2821 = 0;
        } else {
            this.field2821 = 2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILkl;I)V")
    private final void method1255(int arg0, class114 arg1, int arg2) {
        field2817++;
        if (arg0 == 1) {
            int var13 = arg1.method756(arg2 - 529620061);
            this.field2825 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2825[var14] = arg1.method756(-29901);
            }
            this.field2818 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2818[var15] = arg1.method756(-29901);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2818[var16] = (arg1.method756(-29901) << 16) + this.field2818[var16];
            }
        } else if (arg0 == 2) {
            this.field2815 = arg1.method756(arg2 ^ 0xE06F6CA3);
        } else if (arg0 == 3) {
            this.field2835 = new boolean[256];
            int var11 = arg1.method760(false);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2835[arg1.method760(false)] = true;
            }
        } else if (arg0 == 4) {
            this.field2838 = true;
        } else if (arg0 == 5) {
            this.field2830 = arg1.method760(false);
        } else if (arg0 == 6) {
            this.field2824 = arg1.method756(-29901);
        } else if (arg0 == 7) {
            this.field2828 = arg1.method756(-29901);
        } else if (arg0 == 8) {
            this.field2816 = arg1.method760(false);
        } else if (arg0 == 9) {
            this.field2821 = arg1.method760(false);
        } else if (arg0 == 10) {
            this.field2826 = arg1.method760(false);
        } else if (arg0 == 11) {
            this.field2820 = arg1.method760(false);
        } else if (arg0 == 12) {
            int var8 = arg1.method760(false);
            this.field2829 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2829[var9] = arg1.method756(-29901);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2829[var10] += arg1.method756(-29901) << 16;
            }
        } else if (arg0 == 13) {
            int var4 = arg1.method756(-29901);
            this.field2834 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method760(false);
                if (var6 > 0) {
                    this.field2834[var5] = new int[var6];
                    this.field2834[var5][0] = arg1.method779(16711680);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field2834[var5][var7] = arg1.method756(-29901);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field2823 = true;
        } else if (arg0 == 15) {
            this.field2813 = true;
        } else if (arg0 == 16) {
            this.field2836 = true;
        }
        if (arg2 != 529590160) {
            this.method1249(36, 25, (byte) -21, -91, (class2) null, 91);
        }
    }
}
