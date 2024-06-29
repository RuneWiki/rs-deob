import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class130 extends class279 {

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    private int field2149 = -1;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "Lgb;")
    public static class212 field2152 = new class212(64);

    @OriginalMember(owner = "client!na", name = "U", descriptor = "Lkl;")
    public static class64 field2157 = new class64();

    @OriginalMember(owner = "client!na", name = "V", descriptor = "Ltl;")
    public static class59 field2158 = class85.method639("null", 9588);

    @OriginalMember(owner = "client!na", name = "W", descriptor = "Ltl;")
    public static class59 field2159 = class85.method639("Sprites geladen)3", 9588);

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "[I")
    public int[] field2147;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "[Lhi;")
    public static class189[] field2160;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILs;)V", line = 4)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field2149 = arg2.method1214(-18254);
        }
        if (arg0 >= -125) {
            method960(-42);
        }
        field2146++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIII)V", line = 30)
    public static final void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 <= 123) {
            field2152 = (class212) null;
        }
        for (int var9 = 0; var9 < class23.field310.field116; var9++) {
            int var10 = class23.field310.field122[var9] - class140.field2304;
            int var11 = class216.field3532 + class155.field2540 - class23.field310.field121[var9] - 1;
            int var12 = (arg3 - arg6) * (var10 - arg8) / (arg1 - arg8) + arg6;
            int var13 = (var11 - arg5) * (arg4 - arg2) / (arg0 - arg5) + arg2;
            int var14 = 16777215;
            class166 var15 = null;
            int var16 = class23.field310.method73(-109, var9);
            if (var16 == 0) {
                if ((double) class293.field4998 == 3.0D) {
                    var15 = class296.field5080;
                }
                if ((double) class293.field4998 == 4.0D) {
                    var15 = class45.field741;
                }
                if ((double) class293.field4998 == 6.0D) {
                    var15 = class209.field3413;
                }
                if ((double) class293.field4998 == 8.0D) {
                    var15 = class102.field1673;
                }
            }
            if (var16 == 1) {
                if ((double) class293.field4998 == 3.0D) {
                    var15 = class209.field3413;
                }
                if ((double) class293.field4998 == 4.0D) {
                    var15 = class102.field1673;
                }
                if ((double) class293.field4998 == 6.0D) {
                    var15 = class100.field1609;
                }
                if ((double) class293.field4998 == 8.0D) {
                    var15 = class97.field1559;
                }
            }
            if (var16 == 2) {
                if ((double) class293.field4998 == 3.0D) {
                    var15 = class100.field1609;
                }
                var14 = 16755200;
                if ((double) class293.field4998 == 4.0D) {
                    var15 = class97.field1559;
                }
                if ((double) class293.field4998 == 6.0D) {
                    var15 = class306.field5192;
                }
                if ((double) class293.field4998 == 8.0D) {
                    var15 = class178.field2921;
                }
            }
            if (class23.field310.field110[var9] != -1) {
                var14 = class23.field310.field110[var9];
            }
            if (var15 != null) {
                class59[] var17 = new class59[class23.field310.field114[var9].method471(60, (byte) -111) + 1];
                class178.field2923.method699(class23.field310.field114[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var13 - var15.method1172() * (var18 - 1) / 2;
                int var20 = var19 + var15.method1177() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class59 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method473(var17[var21].method495(-125) - 4, 0, (byte) 111);
                    var15.method1171(var22, var12, var20, var14, true);
                    var20 += var15.method1172();
                }
            }
        }
        field2153++;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(II)[[I", line = 144)
    public int[][] method87(int arg0, int arg1) {
        if (arg0 != -7523) {
            method957((byte) -74);
        }
        field2156++;
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (this.field4786.field3297 && this.method958((byte) -23)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = this.field2148 * (class284.field4887 == this.field2144 ? arg1 : this.field2144 * arg1 / class284.field4887);
            if (class56.field835 == this.field2148) {
                for (int var8 = 0; var8 < class56.field835; var8++) {
                    int var9 = this.field2147[var7++];
                    var5[var8] = class93.method680(var9, 255) << 4;
                    var6[var8] = class93.method680(var9 >> 4, 4080);
                    var4[var8] = class93.method680(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class56.field835; var10++) {
                    int var11 = this.field2148 * var10 / class56.field835;
                    int var12 = this.field2147[var7 + var11];
                    var5[var10] = class93.method680(255, var12) << 4;
                    var6[var10] = class93.method680(var12 >> 4, 4080);
                    var4[var10] = class93.method680(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)I", line = 219)
    public final int method956(int arg0) {
        if (arg0 > -56) {
            return -86;
        } else {
            field2151++;
            return this.field2149;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V", line = 229)
    public class130() {
        super(0, false);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V", line = 237)
    public final void method254(byte arg0) {
        super.method254((byte) 19);
        this.field2147 = null;
        if (arg0 <= 11) {
            this.method87(46, -103);
        }
        field2154++;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V", line = 249)
    public static void method957(byte arg0) {
        field2157 = null;
        field2160 = null;
        field2159 = null;
        field2152 = null;
        field2158 = null;
        if (arg0 != 65) {
            field2157 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)Z", line = 264)
    public final boolean method958(byte arg0) {
        if (arg0 != -23) {
            this.method254((byte) -18);
        }
        field2155++;
        if (this.field2147 != null) {
            return true;
        } else if (this.field2149 >= 0) {
            class47 var2 = class280.method1962(-73, this.field2149, class17.field221);
            var2.method336();
            this.field2148 = var2.field4342;
            this.field2147 = var2.field757;
            this.field2144 = var2.field4337;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLme;)V", line = 297)
    public static final void method959(byte arg0, class295 arg1) {
        field2145++;
        class179.field2937 = arg1;
        if (arg0 > -16) {
            method955(35, -47, 12, -30, -112, -119, -46, 92, -62);
        }
        class230.field3787 = class179.field2937.method2040(16, (byte) -97);
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V", line = 311)
    public static final void method960(int arg0) {
        field2150++;
        if (arg0 != 20033) {
            return;
        }
        class234.field3888.method1768(true, 87);
        class219.field3555++;
        for (class297 var1 = (class297) class190.field3181.method692(64); var1 != null; var1 = (class297) class190.field3181.method693((byte) 106)) {
            if (var1.field5084 == 0) {
                class151.method1090(var1, arg0 - 19911, true);
            }
        }
        if (class65.field998 != null) {
            class140.method1019(class65.field998, (byte) 59);
            class65.field998 = null;
        }
    }
}
