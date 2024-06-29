import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class93 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[Z")
    public static boolean[] field1737 = new boolean[200];

    @OriginalMember(owner = "client!la", name = "n", descriptor = "[J")
    public static long[] field1745 = new long[1000];

    @OriginalMember(owner = "client!la", name = "j", descriptor = "F")
    public static float field1741;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public int field1738;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "J")
    private long field1747;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "J")
    private long field1749;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Z")
    public boolean field1736;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "[I")
    private int[] field1733;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "[I")
    private int[] field1746;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    private final void method671(int arg0) {
        field1748++;
        long var2 = this.field1749;
        this.field1749 = -1L;
        long[] var4 = class191.field3460;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1749 = var4[(int) (((long) (this.field1733[var5] >> 24) ^ this.field1749) & 0xFFL)] ^ this.field1749 >>> 8;
            this.field1749 = var4[(int) ((this.field1749 ^ (long) (this.field1733[var5] >> 16)) & 0xFFL)] ^ this.field1749 >>> 8;
            this.field1749 = this.field1749 >>> 8 ^ var4[(int) ((this.field1749 ^ (long) (this.field1733[var5] >> 8)) & 0xFFL)];
            this.field1749 = var4[(int) (((long) this.field1733[var5] ^ this.field1749) & 0xFFL)] ^ this.field1749 >>> 8;
        }
        if (arg0 != 1265307720) {
            this.field1746 = null;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1749 = var4[(int) ((this.field1749 ^ (long) this.field1746[var6]) & 0xFFL)] ^ this.field1749 >>> 8;
        }
        this.field1749 = var4[(int) (((long) (this.field1736 ? 1 : 0) ^ this.field1749) & 0xFFL)] ^ this.field1749 >>> 8;
        if (var2 != 0L && this.field1749 != var2) {
            class124.field2299.method1712(var2, -26870);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BZ)V")
    public final void method672(byte arg0, boolean arg1) {
        this.field1736 = arg1;
        field1743++;
        this.method671(1265307720);
        if (arg0 != 53) {
            this.field1749 = 90L;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZILek;I)Lsf;")
    public final class92 method673(int arg0, boolean arg1, int arg2, class159 arg3, int arg4) {
        field1744++;
        long var6 = (long) arg2 << 32 | (long) (arg4 << 16) | (long) arg2;
        class92 var8 = (class92) class116.field2224.method1714(var6, (byte) -126);
        if (var8 == null) {
            int var9 = 0;
            class74[] var10 = new class74[2];
            if (!class97.method712(1, arg2).method1111(-15070) || !class97.method712(1, arg4).method1111(-15070)) {
                return null;
            }
            class74 var11 = class97.method712(1, arg2).method1112(-114);
            if (var11 != null) {
                var10[var9++] = var11;
            }
            class74 var12 = class97.method712(1, arg4).method1112(-82);
            if (var12 != null) {
                var10[var9++] = var12;
            }
            class74 var13 = new class74(var10, var9);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class244.field4478[var14].length > this.field1746[var14]) {
                    var13.method533(class186.field3369[var14], class244.field4478[var14][this.field1746[var14]]);
                }
                if (this.field1746[var14] < class245.field4488[var14].length) {
                    var13.method533(class224.field4073[var14], class245.field4488[var14][this.field1746[var14]]);
                }
            }
            var8 = var13.method526(64, 768, -50, -10, -50);
            class116.field2224.method1705((byte) 127, var8, var6);
        }
        if (!arg1) {
            this.method679(-8, -60, -89, (class159) null, (class159) null);
        }
        if (arg3 != null) {
            var8 = arg3.method1202(123, var8, arg0);
        }
        return var8;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z[I[III)V")
    public final void method674(boolean arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 != Integer.MIN_VALUE) {
            return;
        }
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class201.field3643; var7++) {
                    class146 var8 = class97.method712(arg3 ^ 0x80000001, var7);
                    if (var8 != null && !var8.field2706 && var8.field2709 == (var6 + (arg0 ? 7 : 0))) {
                        arg2[class66.field1267[var6]] = class230.method1644(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field1746 = arg1;
        this.field1733 = arg2;
        this.field1738 = arg4;
        field1740++;
        this.field1736 = arg0;
        this.method671(arg3 - 882175928);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lek;II)Lsf;")
    public final class92 method675(class159 arg0, int arg1, int arg2) {
        field1734++;
        if (this.field1738 != -1) {
            return class62.method386((byte) 95, this.field1738).method1350(arg1, (byte) -94, arg0);
        }
        class92 var4 = (class92) class116.field2224.method1714(this.field1749, (byte) -125);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field1733[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class97.method712(1, var15 & 0x3FFFFFFF).method1111(-15070)) {
                        var5 = true;
                    }
                } else if (!class83.method585(var15 & 0x3FFFFFFF, arg2 ^ 0x8FDA3377).method1483((byte) -77, this.field1736)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var7 = 0;
            class74[] var8 = new class74[12];
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field1733[var9];
                if ((var12 & 0x40000000) != 0) {
                    class74 var13 = class83.method585(var12 & 0x3FFFFFFF, -1).method1491(0, this.field1736);
                    if (var13 != null) {
                        var8[var7++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class74 var14 = class97.method712(arg2 - 1881525383, var12 & 0x3FFFFFFF).method1112(-87);
                    if (var14 != null) {
                        var8[var7++] = var14;
                    }
                }
            }
            class74 var10 = new class74(var8, var7);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class244.field4478[var11].length > this.field1746[var11]) {
                    var10.method533(class186.field3369[var11], class244.field4478[var11][this.field1746[var11]]);
                }
                if (class245.field4488[var11].length > this.field1746[var11]) {
                    var10.method533(class224.field4073[var11], class245.field4488[var11][this.field1746[var11]]);
                }
            }
            var4 = var10.method526(64, 768, -50, -10, -50);
            class116.field2224.method1705((byte) 123, var4, this.field1749);
        }
        if (arg2 != 1881525384) {
            this.method676(81, -4, 30);
        }
        if (arg0 != null) {
            var4 = arg0.method1202(123, var4, arg1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    public final void method676(int arg0, int arg1, int arg2) {
        if (arg2 >= -23) {
            this.method679(84, 85, 36, (class159) null, (class159) null);
        }
        field1742++;
        this.field1746[arg0] = arg1;
        this.method671(1265307720);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method677(byte arg0) {
        field1745 = null;
        field1737 = null;
        if (arg0 != -28) {
            field1737 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(III)V")
    public final void method678(int arg0, int arg1, int arg2) {
        field1735++;
        int var4 = class66.field1267[arg0];
        if (this.field1733[var4] == 0 || class97.method712(1, arg2) == null) {
            return;
        }
        this.field1733[var4] = class230.method1644(arg2, Integer.MIN_VALUE);
        this.method671(1265307720);
        if (arg1 != -29455) {
            this.method675((class159) null, 25, -43);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILek;Lek;)Lsf;")
    public final class92 method679(int arg0, int arg1, int arg2, class159 arg3, class159 arg4) {
        field1739++;
        if (this.field1738 != -1) {
            return class62.method386((byte) 95, this.field1738).method1352(arg3, (byte) 58, arg2, arg1, arg4);
        }
        long var6 = this.field1749;
        int[] var8 = this.field1733;
        if (arg3 != null && (arg3.field2957 >= 0 || arg3.field2958 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1733[var9];
            }
            if (arg3.field2957 >= 0) {
                if (arg3.field2957 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class230.method1644(1073741824, arg3.field2957);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg3.field2958 >= 0) {
                if (arg3.field2958 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class230.method1644(arg3.field2958, 1073741824);
                    var6 ^= (long) var8[3];
                }
            }
        }
        if (arg0 != 64) {
            this.field1746 = null;
        }
        class92 var10 = (class92) class124.field2299.method1714(var6, (byte) -128);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((var30 & Integer.MIN_VALUE) != 0 && !class97.method712(1, var30 & 0x3FFFFFFF).method1108(arg0 ^ 0x40)) {
                        var11 = true;
                    }
                } else if (!class83.method585(var30 & 0x3FFFFFFF, -1).method1484(arg0 ^ 0xFFFF83CE, this.field1736)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1747 != -1L) {
                    var10 = (class92) class124.field2299.method1714(this.field1747, (byte) -126);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class74[] var13 = new class74[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class74 var28 = class83.method585(var27 & 0x3FFFFFFF, arg0 ^ 0xFFFFFFBF).method1485(this.field1736, (byte) -81);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    } else if ((Integer.MIN_VALUE & var27) != 0) {
                        class74 var29 = class97.method712(1, var27 & 0x3FFFFFFF).method1105(true);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class205 var17 = class83.method585(var16 & 0x3FFFFFFF, -1);
                    if (var17.field3743 != null) {
                        for (int var18 = 0; var18 < var17.field3743.length; var18++) {
                            if (var17.field3743[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field3743[var18][0];
                                int var20 = var17.field3743[var18][1];
                                int var21 = var17.field3743[var18][2];
                                int var22 = var17.field3743[var18][3];
                                int var23 = var17.field3743[var18][5];
                                int var24 = var17.field3743[var18][4];
                                var13[var18 + 1].method540(var19, var20, var21);
                                var13[var18 + 1].method543(var22, var24, var23);
                            }
                        }
                    }
                }
                class74 var25 = new class74(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (class244.field4478[var26].length > this.field1746[var26]) {
                        var25.method533(class186.field3369[var26], class244.field4478[var26][this.field1746[var26]]);
                    }
                    if (class245.field4488[var26].length > this.field1746[var26]) {
                        var25.method533(class224.field4073[var26], class245.field4488[var26][this.field1746[var26]]);
                    }
                }
                var10 = var25.method526(64, 850, -30, -50, -30);
                class124.field2299.method1705((byte) 125, var10, var6);
                this.field1747 = var6;
            }
        }
        if (arg3 == null && arg4 == null) {
            return var10;
        }
        class92 var31;
        if (arg3 != null && arg4 != null) {
            var31 = arg3.method1198(arg2, arg1, 65535, arg4, var10);
        } else if (arg3 == null) {
            var31 = arg4.method1201(var10, false, arg2);
        } else {
            var31 = arg3.method1201(var10, false, arg1);
        }
        return var31;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)I")
    public final int method680(boolean arg0) {
        field1732++;
        if (arg0) {
            this.method674(false, (int[]) null, (int[]) null, 118, 59);
        }
        return this.field1738 == -1 ? (this.field1733[8] << 10) + (this.field1733[11] << 5) + (this.field1733[0] << 15) + (this.field1746[0] << 25) + (this.field1746[4] << 20) + this.field1733[1] : class62.method386((byte) 95, this.field1738).field3399 + 305419896;
    }
}
