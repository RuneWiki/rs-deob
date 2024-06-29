import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class150 extends class71 {

    @OriginalMember(owner = "client!di", name = "L", descriptor = "[I")
    private int[] field2741 = new int[3];

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    private int field2739 = 4096;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    private int field2742 = 4096;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "I")
    private int field2750 = 4096;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "I")
    private int field2749 = 409;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "Lud;")
    public static class279 field2743 = class130.method1024("Update)2Liste geladen)3", 255);

    @OriginalMember(owner = "client!di", name = "P", descriptor = "I")
    public static int field2745 = -1;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field2747 = 0;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "I")
    public static int field2748 = 0;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!di", name = "V", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!di", name = "X", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "Lok;")
    public static class149 field2754;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lok;ZLok;Lok;Lok;)V", line = 7)
    public static final void method1195(class149 arg0, boolean arg1, class149 arg2, class149 arg3, class149 arg4) {
        field2752++;
        class112.field2056 = arg0;
        class90.field1695 = arg3;
        class132.field2418 = arg2;
        class52.field1085 = arg4;
        class18.field545 = new class8[class112.field2056.method1181(-125)][];
        if (!arg1) {
            field2743 = (class279) null;
        }
        class142.field2573 = new boolean[class112.field2056.method1181(-108)];
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)Z", line = 24)
    public static final boolean method1196(int arg0, int arg1, int arg2, int arg3) {
        if (!class42.method361(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class165.field2970[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class306.field5430) {
                    if (!class213.method1564(var4, var6, var5)) {
                        return false;
                    }
                    if (!class213.method1564(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class213.method1564(var4, var7, var5)) {
                        return false;
                    }
                    if (!class213.method1564(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class213.method1564(var4, var8, var5)) {
                    return false;
                }
                if (!class213.method1564(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class233.field4083) {
                    if (!class213.method1564(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class213.method1564(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class213.method1564(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class213.method1564(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class213.method1564(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class213.method1564(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class306.field5430) {
                    if (!class213.method1564(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class213.method1564(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class213.method1564(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class213.method1564(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class213.method1564(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class213.method1564(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class233.field4083) {
                    if (!class213.method1564(var4, var6, var5)) {
                        return false;
                    }
                    if (!class213.method1564(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class213.method1564(var4, var7, var5)) {
                        return false;
                    }
                    if (!class213.method1564(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class213.method1564(var4, var8, var5)) {
                    return false;
                }
                if (!class213.method1564(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class213.method1564(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class213.method1564(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class213.method1564(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class213.method1564(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class213.method1564(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[[I", line = 213)
    public final int[][] method86(int arg0, int arg1) {
        int var3 = 117 % ((arg1 + 70) / 54);
        int[][] var4 = this.field1400.method1746((byte) -99, arg0);
        if (this.field1400.field4363) {
            int[][] var5 = this.method619(0, 2, arg0);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            int[] var10 = var5[0];
            int[] var11 = var4[1];
            for (int var12 = 0; var12 < class215.field3787; var12++) {
                int var13 = var10[var12];
                int var14 = var13 - this.field2741[0];
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (var14 <= this.field2749) {
                    int var15 = var6[var12];
                    int var16 = var15 - this.field2741[1];
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (this.field2749 >= var16) {
                        int var17 = var7[var12];
                        int var18 = var17 - this.field2741[2];
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (var18 <= this.field2749) {
                            var8[var12] = this.field2750 * var13 >> 12;
                            var11[var12] = this.field2742 * var15 >> 12;
                            var9[var12] = this.field2739 * var17 >> 12;
                        } else {
                            var8[var12] = var13;
                            var11[var12] = var15;
                            var9[var12] = var17;
                        }
                    } else {
                        var8[var12] = var13;
                        var11[var12] = var15;
                        var9[var12] = var7[var12];
                    }
                } else {
                    var8[var12] = var13;
                    var11[var12] = var6[var12];
                    var9[var12] = var7[var12];
                }
            }
        }
        field2746++;
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 435)
    public class150() {
        super(1, false);
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V", line = 306)
    public static final void method1197(int arg0) {
        field2751++;
        if (arg0 != -19131) {
            field2747 = 108;
        }
        class143.field2592.method1334((byte) -25);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZLvh;)V", line = 319)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            method1198(43, -19);
        }
        if (arg0 == 0) {
            this.field2749 = arg2.method468(28214);
        } else if (arg0 == 1) {
            this.field2739 = arg2.method468(28214);
        } else if (arg0 == 2) {
            this.field2742 = arg2.method468(28214);
        } else if (arg0 == 3) {
            this.field2750 = arg2.method468(28214);
        } else if (arg0 == 4) {
            int var5 = arg2.method461((byte) -14);
            this.field2741[1] = class52.method442(4080, var5 >> 4);
            this.field2741[0] = class52.method442(var5 << 4, 267386880);
            this.field2741[2] = class52.method442(0, var5 >> 12);
        }
        field2740++;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)Lai;", line = 385)
    public static final class125 method1198(int arg0, int arg1) {
        field2753++;
        class125 var2 = (class125) class8.field155.method1336((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class261.field4638.method1192(0, class276.method1949(arg0, 170296428), class166.method1300((byte) -18, arg0));
        class125 var4 = new class125();
        var4.field2327 = arg0;
        if (arg1 < 13) {
            field2747 = -103;
        }
        if (var3 != null) {
            var4.method1003(9068, new class53(var3));
        }
        var4.method1004(-107);
        class8.field155.method1331(var4, 30237, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)Lpf;", line = 446)
    public static final class85 method1199(int arg0) {
        if (arg0 != 0) {
            return (class85) null;
        }
        field2744++;
        try {
            return (class85) Class.forName("fd").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V", line = 476)
    public static void method1200(byte arg0) {
        if (arg0 >= -119) {
            method1199(-24);
        }
        field2754 = null;
        field2743 = null;
    }
}
