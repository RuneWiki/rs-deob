import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class207 {

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public int field2839 = -1;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "Z")
    public boolean field2846 = false;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
    public int field2857 = 99;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "Z")
    public boolean field2856 = false;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public int field2848 = 2;

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "I")
    public int field2860 = 5;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public int field2851 = -1;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "Z")
    public boolean field2840 = false;

    @OriginalMember(owner = "client!hu", name = "B", descriptor = "I")
    public int field2865 = -1;

    @OriginalMember(owner = "client!hu", name = "A", descriptor = "I")
    public int field2864 = -1;

    @OriginalMember(owner = "client!hu", name = "D", descriptor = "Z")
    public boolean field2867 = false;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public int field2854 = -1;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "Lco;")
    public static class210 field2844 = new class210(8);

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "[I")
    public static int[] field2859 = new int[25];

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "I")
    public static int field2868 = 0;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "S")
    public static short field2847 = 320;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public int field2838;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!hu", name = "C", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "Ldd;")
    public class229 field2842;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "[I")
    public int[] field2843;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "[I")
    private int[] field2850;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "[I")
    public int[] field2853;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "[Z")
    public boolean[] field2845;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "[[I")
    public int[][] field2852;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZIII)I")
    public final int method1143(boolean arg0, int arg1, int arg2, int arg3) {
        field2858++;
        int var5 = 0;
        int var6 = 0;
        if (arg2 != -1632205712) {
            this.field2853 = null;
        }
        int var7 = this.field2853[arg1];
        class170 var8 = null;
        class170 var9 = this.field2842.method1265(var7 >> 16, arg2 + 1632196722);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2867 || class445.field6334) && arg3 != -1 && this.field2853.length > arg3) {
            int var11 = this.field2853[arg3];
            var8 = this.field2842.method1265(var11 >> 16, -8990);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2846) {
            var5 |= 0x200;
        }
        if (var9.method826(var10, (byte) -97)) {
            var5 |= 0x80;
        }
        if (var9.method831(var10, (byte) 93)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method826(var6, (byte) -97)) {
                var5 |= 0x80;
            }
            if (var8.method831(var6, (byte) 93)) {
                var5 |= 0x100;
            }
        }
        if (this.field2850 != null && arg0) {
            if (arg1 < this.field2850.length) {
                int var12 = this.field2850[arg1];
                if (var12 != 65535) {
                    class170 var13 = this.field2842.method1265(var12 >> 16, -8990);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method826(var14, (byte) -97)) {
                            var5 |= 0x80;
                        }
                        if (var13.method831(var14, (byte) 93)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field2867 || class445.field6334) && arg3 != -1 && arg3 < this.field2850.length) {
                int var15 = this.field2850[arg3];
                if (var15 != 65535) {
                    class170 var16 = this.field2842.method1265(var15 >> 16, -8990);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method826(var17, (byte) -97)) {
                            var5 |= 0x80;
                        }
                        if (var16.method831(var17, (byte) 93)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Z")
    public static final boolean method1144(int arg0, int arg1) {
        field2866++;
        class239 var2 = class199.method1090(128, arg1);
        if (var2 == null) {
            return false;
        } else if (class355.field5092 == 3) {
            String var3 = "";
            if (class414.field5904 != class145.field1754) {
                var3 = ":" + (var2.field3299 + 7000);
            }
            String var4 = "";
            if (class326.field4695 != null) {
                var4 = "/p=" + class326.field4695;
            }
            if (arg0 != 6990) {
                method1145((byte) -45);
            }
            String var5 = "http://" + var2.field3294 + var3 + "/l=" + class68.field849 + "/a=" + class62.field772 + var4 + "/j" + (class220.field3076 ? "1" : "0") + ",o" + (class275.field3919 ? "1" : "0") + ",a2";
            try {
                class310.field4546.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class169.field2007 = var2.field3294;
            class232.field3220 = var2.field3299;
            if (class414.field5904 != class145.field1754) {
                class335.field4841 = class232.field3220 + 40000;
                class236.field3268 = class232.field3220 + 50000;
                class463.field6529 = class335.field4841;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
    public static void method1145(byte arg0) {
        field2859 = null;
        field2844 = null;
        if (arg0 != -80) {
            field2847 = 86;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
    public final void method1146(int arg0) {
        field2855++;
        if (this.field2839 == -1) {
            if (this.field2845 == null) {
                this.field2839 = 0;
            } else {
                this.field2839 = 2;
            }
        }
        if (arg0 != 2) {
            this.method1146(-95);
        }
        if (this.field2854 != -1) {
            return;
        }
        if (this.field2845 == null) {
            this.field2854 = 0;
        } else {
            this.field2854 = 2;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lvt;B)V")
    public final void method1147(class179 arg0, byte arg1) {
        field2863++;
        while (true) {
            int var3 = arg0.method895((byte) -102);
            if (var3 == 0) {
                if (arg1 == -32) {
                    return;
                } else {
                    this.method1150(9, 54, (class179) null);
                    return;
                }
            }
            this.method1150(var3, -12024, arg0);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lqh;IIIII)Lqh;")
    public final class352 method1148(class352 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2862++;
        int var7 = this.field2843[arg2];
        int var8 = this.field2853[arg2];
        class170 var9 = this.field2842.method1265(var8 >> 16, arg3 ^ 0x231D);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method1749((byte) 1, arg1, true);
        }
        class170 var11 = null;
        if ((this.field2867 || class445.field6334) && arg4 != -1 && arg4 < this.field2853.length) {
            int var12 = this.field2853[arg4];
            var11 = this.field2842.method1265(var12 >> 16, -8990);
            arg4 = var12 & 0xFFFF;
        }
        class170 var13 = null;
        class170 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2850 != null) {
            if (this.field2850.length > arg2) {
                var15 = this.field2850[arg2];
                if (var15 != 65535) {
                    var13 = this.field2842.method1265(var15 >> 16, arg3 ^ 0x231D);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2867 || class445.field6334) && arg4 != -1 && this.field2850.length > arg4) {
                var16 = this.field2850[arg4];
                if (var16 != 65535) {
                    var14 = this.field2842.method1265(var16 >> 16, -8990);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2846) {
            arg1 |= 0x200;
        }
        if (var9.method826(var10, (byte) -97)) {
            arg1 |= 0x80;
        }
        if (var9.method831(var10, (byte) 93)) {
            arg1 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method826(var15, (byte) -97)) {
                arg1 |= 0x80;
            }
            if (var13.method831(var15, (byte) 93)) {
                arg1 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method826(arg4, (byte) -97)) {
                arg1 |= 0x80;
            }
            if (var11.method831(arg4, (byte) 93)) {
                arg1 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method826(var16, (byte) -97)) {
                arg1 |= 0x80;
            }
            if (var14.method831(var16, (byte) 93)) {
                arg1 |= 0x100;
            }
        }
        int var17 = arg1 | 0x20;
        class352 var18 = arg0.method1749((byte) 1, var17, true);
        var18.method2136(0, (byte) -127, arg4, this.field2846, var7, var11, arg3 + arg5, var10, var9);
        if (var13 != null) {
            var18.method2136(0, (byte) -98, var16, this.field2846, var7, var14, arg5 - 1, var15, var13);
        }
        return var18;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BILqh;IIIII)Lqh;")
    public final class352 method1149(byte arg0, int arg1, class352 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2861++;
        int var9 = this.field2843[arg4];
        int var10 = this.field2853[arg4];
        class170 var11 = this.field2842.method1265(var10 >> 16, -8990);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg2.method1749(arg0, arg6, true);
        }
        class170 var13 = null;
        if ((this.field2867 || class445.field6334) && arg1 != -1 && arg1 < this.field2853.length) {
            int var14 = this.field2853[arg1];
            var13 = this.field2842.method1265(var14 >> 16, arg3 - 13981);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field2846) {
            arg6 |= 0x200;
        }
        if (var11.method826(var12, (byte) -97)) {
            arg6 |= 0x80;
        }
        if (var11.method831(var12, (byte) 93)) {
            arg6 |= 0x100;
        }
        if (arg3 != 4991) {
            return null;
        }
        if (var13 != null) {
            if (var13.method826(arg1, (byte) -97)) {
                arg6 |= 0x80;
            }
            if (var13.method831(arg1, (byte) 93)) {
                arg6 |= 0x100;
            }
        }
        int var15 = arg6 | 0x20;
        class352 var16 = arg2.method1749(arg0, var15, true);
        var16.method2136(arg5, (byte) 33, arg1, this.field2846, var9, var13, arg7 - 1, var12, var11);
        return var16;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILvt;)V")
    private final void method1150(int arg0, int arg1, class179 arg2) {
        field2841++;
        if (arg1 != -12024) {
            this.field2864 = 116;
        }
        if (arg0 == 1) {
            int var13 = arg2.method916(arg1 ^ 0xFFFF84A5);
            this.field2843 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2843[var14] = arg2.method916(21933);
            }
            this.field2853 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2853[var15] = arg2.method916(class293.method1843(arg1, -31579));
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2853[var16] += arg2.method916(21933) << 16;
            }
        } else if (arg0 == 2) {
            this.field2864 = arg2.method916(21933);
        } else if (arg0 == 3) {
            this.field2845 = new boolean[256];
            int var4 = arg2.method895((byte) -97);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2845[arg2.method895((byte) -73)] = true;
            }
        } else if (arg0 == 4) {
            this.field2856 = true;
        } else if (arg0 == 5) {
            this.field2860 = arg2.method895((byte) -118);
        } else if (arg0 == 6) {
            this.field2865 = arg2.method916(21933);
        } else if (arg0 == 7) {
            this.field2851 = arg2.method916(21933);
        } else if (arg0 == 8) {
            this.field2857 = arg2.method895((byte) -98);
        } else if (arg0 == 9) {
            this.field2839 = arg2.method895((byte) -124);
        } else if (arg0 == 10) {
            this.field2854 = arg2.method895((byte) -114);
        } else if (arg0 == 11) {
            this.field2848 = arg2.method895((byte) -88);
        } else if (arg0 == 12) {
            int var6 = arg2.method895((byte) -120);
            this.field2850 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2850[var7] = arg2.method916(class293.method1843(arg1, -31579));
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field2850[var8] += arg2.method916(arg1 + 33957) << 16;
            }
        } else if (arg0 == 13) {
            int var9 = arg2.method916(21933);
            this.field2852 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg2.method895((byte) -112);
                if (var11 > 0) {
                    this.field2852[var10] = new int[var11];
                    this.field2852[var10][0] = arg2.method899((byte) 113);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field2852[var10][var12] = arg2.method916(21933);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field2846 = true;
        } else if (arg0 == 15) {
            this.field2867 = true;
        } else if (arg0 == 16) {
            this.field2840 = true;
            return;
        }
    }
}
