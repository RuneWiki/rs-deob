import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class47 extends class197 {

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    private int field702 = 0;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    private int field705 = 0;

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "I")
    private int field715 = 0;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field698 = -1;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field706 = 0;

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "Loh;")
    public static class258 field713 = class153.method1046("gr-Un:", 113);

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    private int field697;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    private int field701;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    private int field704;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
    private int field711;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
    private int field714;

    @OriginalMember(owner = "client!gg", name = "fb", descriptor = "Lgb;")
    public static class213 field716;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)V", line = 4)
    public static final void method383(boolean arg0) {
        class171.method1144();
        field703++;
        for (int var1 = 0; var1 < 4; var1++) {
            class243.field4216[var1].method1673((byte) -90);
        }
        if (!arg0) {
            field698 = 13;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZI)V", line = 26)
    private final void method384(int arg0, int arg1, boolean arg2, int arg3) {
        field707++;
        int var5 = arg0 <= 2048 ? (arg1 + 4096) * arg0 >> 12 : arg0 + arg1 - (arg0 * arg1 >> 12);
        if (arg2) {
            return;
        }
        if (var5 <= 0) {
            this.field711 = this.field697 = this.field704 = arg0;
            return;
        }
        int var6 = arg3 * 6;
        int var7 = arg0 + arg0 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var11 = var8 * var5 >> 12;
        int var12 = var6 - (var9 << 12);
        int var13 = var11 * var12 >> 12;
        int var14 = var7 + var13;
        int var15 = var5 - var13;
        if (var9 == 0) {
            this.field711 = var5;
            this.field704 = var7;
            this.field697 = var14;
        } else if (var9 == 1) {
            this.field704 = var7;
            this.field711 = var15;
            this.field697 = var5;
        } else if (var9 == 2) {
            this.field711 = var7;
            this.field697 = var5;
            this.field704 = var14;
        } else if (var9 == 3) {
            this.field711 = var7;
            this.field697 = var15;
            this.field704 = var5;
        } else if (var9 == 4) {
            this.field711 = var14;
            this.field704 = var5;
            this.field697 = var7;
        } else if (var9 == 5) {
            this.field711 = var5;
            this.field697 = var7;
            this.field704 = var15;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)[Lkl;", line = 135)
    public static final class65[] method385(int arg0) {
        class65[] var1 = new class65[class152.field2608];
        for (int var2 = arg0; var2 < class152.field2608; var2++) {
            int var3 = class301.field5149[var2] * class113.field1958[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class37.field497[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class121.field2143[class2.method15(255, var5[var6])];
            }
            if (class257.field4390) {
                var1[var2] = new class221(class108.field1919, class23.field279, class279.field4795[var2], class280.field4819[var2], class113.field1958[var2], class301.field5149[var2], var4);
            } else {
                var1[var2] = new class41(class108.field1919, class23.field279, class279.field4795[var2], class280.field4819[var2], class113.field1958[var2], class301.field5149[var2], var4);
            }
        }
        field712++;
        class290.method2038(113);
        return var1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[[I", line = 190)
    public final int[][] method101(int arg0, byte arg1) {
        field708++;
        int[][] var3 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765) {
            int[][] var4 = this.method1322(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class190.field3362; var11++) {
                this.method388(var6[var11], -3, var7[var11], var5[var11]);
                this.field701 += this.field705;
                this.field699 += this.field715;
                if (this.field699 < 0) {
                    this.field699 = 0;
                }
                if (this.field699 > 4096) {
                    this.field699 = 4096;
                }
                while (this.field701 < 0) {
                    this.field701 += 4096;
                }
                while (this.field701 > 4096) {
                    this.field701 -= 4096;
                }
                this.field714 += this.field702;
                if (this.field714 < 0) {
                    this.field714 = 0;
                }
                if (this.field714 > 4096) {
                    this.field714 = 4096;
                }
                this.method384(this.field714, this.field699, false, this.field701);
                var10[var11] = this.field711;
                var8[var11] = this.field697;
                var9[var11] = this.field704;
            }
        }
        int var12 = -55 / ((arg1 - 1) / 37);
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 256)
    public class47() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(B)V", line = 265)
    public static void method386(byte arg0) {
        if (arg0 >= 44) {
            field713 = null;
            field716 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILva;I)V", line = 282)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            field706 = -21;
        }
        if (arg2 == 0) {
            this.field705 = arg1.method1574(-41);
        } else if (arg2 == 1) {
            this.field715 = (arg1.method1617((byte) -117) << 12) / 100;
        } else if (arg2 == 2) {
            this.field702 = (arg1.method1617((byte) -117) << 12) / 100;
        }
        field710++;
    }

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "(B)Lam;", line = 325)
    public static final class137 method387(byte arg0) {
        field709++;
        try {
            if (arg0 > -101) {
                field706 = 81;
            }
            return (class137) Class.forName("ad").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class56();
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)V", line = 344)
    private final void method388(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -3) {
            method387((byte) 28);
        }
        field700++;
        int var5 = arg3 <= arg2 ? arg2 : arg3;
        int var6 = arg2 > arg3 ? arg3 : arg2;
        int var7 = var6 > arg0 ? arg0 : var6;
        int var8 = arg0 > var5 ? arg0 : var5;
        this.field714 = (var7 + var8) / 2;
        int var9 = var8 - var7;
        if (var9 > 0) {
            int var10 = (var8 - arg0 << 12) / var9;
            int var11 = (var8 - arg2 << 12) / var9;
            int var12 = (var8 - arg3 << 12) / var9;
            if (arg3 == var8) {
                this.field701 = arg2 == var7 ? var10 + 20480 : -var11 + 4096;
            } else if (arg2 == var8) {
                this.field701 = arg0 == var7 ? var12 + 4096 : -var10 + 12288;
            } else {
                this.field701 = arg3 == var7 ? var11 + 12288 : 20480 - var12;
            }
            this.field701 /= 6;
        } else {
            this.field701 = 0;
        }
        if (this.field714 > 0 && this.field714 < 4096) {
            this.field699 = (var9 << 12) / (this.field714 <= 2048 ? this.field714 * 2 : 8192 - (this.field714 * 2));
        } else {
            this.field699 = 0;
        }
    }
}
