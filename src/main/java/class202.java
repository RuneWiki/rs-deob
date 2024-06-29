import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class202 extends class210 {

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "Lvq;")
    public static class24 field2844 = new class24(32, 15);

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    public static int field2855 = 2;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "Lvq;")
    public static class24 field2856 = new class24(6, 4);

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "Ljn;")
    public static class409 field2857 = new class409("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "Lvq;")
    public static class24 field2858 = new class24(17, 8);

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "Lbt;")
    public static class363 field2859 = new class363(20);

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    public static int field2860 = 52;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "Lsd;")
    public static class71 field2846;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "[Lfn;")
    private class328[] field2851;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z[[I)V", line = 3)
    private final void method1389(boolean arg0, int[][] arg1) {
        ++field2848;
        if (!arg0) {
            field2856 = null;
        }
        int var3 = field2852;
        int var4 = class130.field1771;
        class53.method406(-13, arg1);
        class375.method2376(0, class437.field6373, 0, class139.field1911, (byte) -63);
        if (this.field2851 != null) {
            for (int var5 = 0; ~this.field2851.length < ~var5; ++var5) {
                class328 var6 = this.field2851[var5];
                int var7 = var6.field4883;
                int var8 = var6.field4884;
                if (~var7 <= -1) {
                    if (var8 >= 0) {
                        var6.method325(0, var4, var3);
                    } else {
                        var6.method328((byte) 20, var4, var3);
                    }
                } else if (~var8 <= -1) {
                    var6.method330(var4, var3, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V", line = 56)
    public static void method1390(int arg0) {
        if (arg0 != 1450089892) {
            field2846 = null;
        }
        field2844 = null;
        field2859 = null;
        field2857 = null;
        field2858 = null;
        field2846 = null;
        field2856 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)[I", line = 71)
    public final int[] method361(int arg0, byte arg1) {
        ++field2854;
        if (arg1 != -38) {
            this.method56(31, 52, (class256) null);
        }
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            this.method1389(true, super.field2950.method1888(arg1 ^ -38));
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 97)
    public class202() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(III)V", line = 109)
    public static final void method1391(int arg0, int arg1, int arg2) {
        boolean var3 = class178.field2530[0][arg1][arg2] != null && class178.field2530[0][arg1][arg2].field5351 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class178.field2530[var4][arg1][arg2] == null) {
                class369 var5 = class178.field2530[var4][arg1][arg2] = new class369(var4, arg1, arg2);
                if (var3) {
                    ++var5.field5352;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lct;Lct;IZI)V", line = 129)
    public static final void method1392(class104 arg0, class104 arg1, int arg2, boolean arg3, int arg4) {
        class313.field4594 = arg3;
        ++field2847;
        class159.field2134 = arg0;
        if (arg2 != 29144) {
            method1390(34);
        }
        class92.field1146 = arg1;
        class9.field127 = arg4;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)Z", line = 145)
    public static final boolean method1393(int arg0, boolean arg1) {
        class153.field2072 = true;
        ++field2850;
        if (arg1) {
            return true;
        } else {
            class458.field6776 = 65535 & arg0 + 1;
            return true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILat;)V", line = 161)
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field2853;
        if (arg1 != -11941) {
            this.method361(-85, (byte) 17);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field2956 = arg2.method1738((byte) -118) == 1;
                return;
            }
        } else {
            this.field2851 = new class328[arg2.method1738((byte) -87)];
            for (int var4 = 0; this.field2851.length > var4; ++var4) {
                int var5 = arg2.method1738((byte) 100);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field2851[var4] = class60.method454(arg2, (byte) 80);
                            }
                        } else {
                            this.field2851[var4] = class376.method2378(arg2, class134.method895(arg1, -26760));
                        }
                    } else {
                        this.field2851[var4] = class240.method1616((byte) 118, arg2);
                    }
                } else {
                    this.field2851[var4] = class103.method690(arg2, 88);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[[I", line = 235)
    public final int[][] method58(int arg0, int arg1) {
        ++field2845;
        if (arg1 < 94) {
            return null;
        } else {
            int[][] var3 = super.field2967.method1572(121, arg0);
            if (super.field2967.field3454) {
                int var4 = field2852;
                int var5 = class130.field1771;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field2967.method1569(23745);
                this.method1389(true, var6);
                for (int var8 = 0; var8 < class130.field1771; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; field2852 > var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class386.method2438(255, var15) << 4;
                        var12[var14] = class386.method2438(4080, var15 >> 4);
                        var11[var14] = class386.method2438(4080, var15 >> 12);
                    }
                }
            }
            return var3;
        }
    }
}
