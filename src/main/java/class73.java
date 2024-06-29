import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class73 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1769 = 2;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lea;")
    public static class38 field1779 = class9.method46((byte) 113, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lea;")
    private static class38 field1783 = class9.method46((byte) 117, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Lea;")
    public static class38 field1784 = field1783;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lea;")
    public static class38 field1781 = class9.method46((byte) 106, "ams");

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lea;")
    public static class38 field1787 = class9.method46((byte) 113, "leuchten3:");

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    private int field1770;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "J")
    private long field1773;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "J")
    private long field1788;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lob;")
    public static class127 field1785;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Z")
    public boolean field1774;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    private int[] field1771;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
    private int[] field1776;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Lja;")
    public final class81 method577(boolean arg0) {
        field1786++;
        if (this.field1770 != -1) {
            return class188.method1268(-86, this.field1770).method1069(-1);
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1776[var3];
            if (var12 >= 256 && var12 < 512 && !class194.method1287(8237, var12 - 256).method69(-6)) {
                var2 = true;
            }
            if (var12 >= 512 && !class117.method908(var12 - 512, (byte) 79).method10(this.field1774, 20274)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class81[] var4 = new class81[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1776[var6];
            if (var9 >= 256 && var9 < 512) {
                class81 var10 = class194.method1287(8237, var9 - 256).method68((byte) -103);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class81 var11 = class117.method908(var9 - 512, (byte) 100).method8((byte) -119, this.field1774);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class81 var7 = new class81(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (class19.field442[var8].length > this.field1771[var8]) {
                var7.method698(class2.field71[var8], class19.field442[var8][this.field1771[var8]]);
            }
            if (this.field1771[var8] < class123.field2625[var8].length) {
                var7.method698(class95.field2143[var8], class123.field2625[var8][this.field1771[var8]]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZ)V")
    public final void method578(byte arg0, boolean arg1) {
        field1768++;
        if (arg0 != 55) {
            field1783 = null;
        }
        if (this.field1774 != arg1) {
            this.method585(null, arg1, (byte) -96, this.field1771, -1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lhc;I)V")
    public final void method579(class66 arg0, int arg1) {
        arg0.method495(98, this.field1774 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1776[class192.field3802[var3]];
            if (var5 == 0) {
                arg0.method495(107, -1);
            } else {
                arg0.method495(arg1 ^ 0xFFFFFF83, var5 - 256);
            }
        }
        int var4 = 0;
        if (arg1 != -1) {
            field1787 = null;
        }
        while (var4 < 5) {
            arg0.method495(arg1 + 101, this.field1771[var4]);
            var4++;
        }
        field1789++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[BIB)Z")
    public static final boolean method580(int arg0, byte[] arg1, int arg2, byte arg3) {
        boolean var4 = true;
        field1778++;
        if (arg3 <= 68) {
            method584((byte) -32);
        }
        class66 var5 = new class66(arg1);
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method492(255);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class106 var16;
                do {
                    int var12;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method492(255);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method509(116);
                                    }
                                    int var10 = var5.method492(255);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    var12 = arg2 + var11;
                                    var13 = var5.method509(124) >> 2;
                                    int var14 = var8 & 0x3F;
                                    var15 = arg0 + var14;
                                } while (var12 <= 0);
                            } while (var15 <= 0);
                        } while (var12 >= 103);
                    } while (var15 >= 103);
                    var16 = class70.method553(var6, 28067);
                } while (var13 == 22 && class31.field610 && var16.field2388 == 0 && var16.field2402 != 1 && !var16.field2390);
                var9 = true;
                if (!var16.method867(74)) {
                    var4 = false;
                    class177.field3594++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    private final void method581(int arg0) {
        field1780++;
        long var2 = this.field1773;
        this.field1773 = 0L;
        int var4 = this.field1776[9];
        if (arg0 >= -65) {
            field1783 = null;
        }
        int var5 = this.field1776[5];
        this.field1776[9] = var5;
        this.field1776[5] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1773 <<= 0x4;
            if (this.field1776[var6] >= 256) {
                this.field1773 += this.field1776[var6] - 256;
            }
        }
        if (this.field1776[0] >= 256) {
            this.field1773 += this.field1776[0] - 256 >> 4;
        }
        if (this.field1776[1] >= 256) {
            this.field1773 += this.field1776[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1773 <<= 0x3;
            this.field1773 += this.field1771[var7];
        }
        this.field1776[5] = var5;
        this.field1773 <<= 0x1;
        this.field1776[9] = var4;
        this.field1773 += this.field1774 ? 1 : 0;
        if (var2 != 0L && this.field1773 != var2) {
            class34.field707.method1081(var2, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZB)V")
    public final void method582(int arg0, boolean arg1, byte arg2) {
        int var4 = this.field1771[arg0];
        int var5 = -102 % ((arg2 + 24) / 32);
        if (arg1) {
            var4++;
            if (var4 >= class19.field442[arg0].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class19.field442[arg0].length - 1;
            }
        }
        field1777++;
        this.field1771[arg0] = var4;
        this.method581(-72);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I")
    public final int method583(int arg0) {
        if (arg0 == 4) {
            field1775++;
            return this.field1770 == -1 ? (this.field1776[8] << 10) + (this.field1776[0] << 15) + (this.field1771[4] << 20) + (this.field1771[0] << 25) + (this.field1776[11] << 5) + this.field1776[1] : class188.method1268(56, this.field1770).field3157 + 305419896;
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method584(byte arg0) {
        field1783 = null;
        field1785 = null;
        field1779 = null;
        field1781 = null;
        field1787 = null;
        field1784 = null;
        int var1 = -43 % ((arg0 - 2) / 44);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([IZB[II)V")
    public final void method585(int[] arg0, boolean arg1, byte arg2, int[] arg3, int arg4) {
        field1790++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class9.field213; var7++) {
                    class12 var8 = class194.method1287(8237, var7);
                    if (var8 != null && !var8.field258 && var8.field272 == (arg1 ? 7 : 0) + var6) {
                        arg0[class192.field3802[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1771 = arg3;
        if (arg2 != -96) {
            method580(-71, null, -29, (byte) -62);
        }
        this.field1774 = arg1;
        this.field1776 = arg0;
        this.field1770 = arg4;
        this.method581(-75);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZI)V")
    public final void method586(int arg0, boolean arg1, int arg2) {
        field1782++;
        if (arg2 == 1 && this.field1774) {
            return;
        }
        int var4 = this.field1776[class192.field3802[arg2]];
        if (var4 == 0 || arg0 >= -38) {
            return;
        }
        var4 -= 256;
        class12 var5;
        do {
            if (arg1) {
                var4++;
                if (class9.field213 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class9.field213 - 1;
                }
            }
            var5 = class194.method1287(8237, var4);
        } while (var5 == null || var5.field258 || var5.field272 != arg2 + (this.field1774 ? 7 : 0));
        this.field1776[class192.field3802[arg2]] = var4 + 256;
        this.method581(-86);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lpf;IIILpf;)Lrg;")
    public final class159 method587(class140 arg0, int arg1, int arg2, int arg3, class140 arg4) {
        field1772++;
        if (arg2 != -256) {
            return null;
        } else if (this.field1770 == -1) {
            long var6 = this.field1773;
            int[] var8 = this.field1776;
            if (arg0 != null && (arg0.field2927 >= 0 || arg0.field2916 >= 0)) {
                var8 = new int[12];
                for (int var9 = 0; var9 < 12; var9++) {
                    var8[var9] = this.field1776[var9];
                }
                if (arg0.field2927 >= 0) {
                    var6 += arg0.field2927 - this.field1776[5] << 8;
                    var8[5] = arg0.field2927;
                }
                if (arg0.field2916 >= 0) {
                    var6 += arg0.field2916 - this.field1776[3] << 16;
                    var8[3] = arg0.field2916;
                }
            }
            class159 var10 = (class159) class34.field707.method1078((byte) 97, var6);
            if (var10 == null) {
                boolean var11 = false;
                for (int var12 = 0; var12 < 12; var12++) {
                    int var21 = var8[var12];
                    if (var21 >= 256 && var21 < 512 && !class194.method1287(8237, var21 - 256).method66((byte) 4)) {
                        var11 = true;
                    }
                    if (var21 >= 512 && !class117.method908(var21 - 512, (byte) 113).method4((byte) 117, this.field1774)) {
                        var11 = true;
                    }
                }
                if (var11) {
                    if (this.field1788 != -1L) {
                        var10 = (class159) class34.field707.method1078((byte) 96, this.field1788);
                    }
                    if (var10 == null) {
                        return null;
                    }
                }
                if (var10 == null) {
                    class81[] var13 = new class81[12];
                    int var14 = 0;
                    for (int var15 = 0; var15 < 12; var15++) {
                        int var18 = var8[var15];
                        if (var18 >= 256 && var18 < 512) {
                            class81 var19 = class194.method1287(8237, var18 - 256).method67(0);
                            if (var19 != null) {
                                var13[var14++] = var19;
                            }
                        }
                        if (var18 >= 512) {
                            class81 var20 = class117.method908(var18 - 512, (byte) 91).method7(-109, this.field1774);
                            if (var20 != null) {
                                var13[var14++] = var20;
                            }
                        }
                    }
                    class81 var16 = new class81(var13, var14);
                    for (int var17 = 0; var17 < 5; var17++) {
                        if (this.field1771[var17] < class19.field442[var17].length) {
                            var16.method698(class2.field71[var17], class19.field442[var17][this.field1771[var17]]);
                        }
                        if (this.field1771[var17] < class123.field2625[var17].length) {
                            var16.method698(class95.field2143[var17], class123.field2625[var17][this.field1771[var17]]);
                        }
                    }
                    var10 = var16.method681(64, 850, -30, -50, -30, true, true);
                    class34.field707.method1076(var6, -4, var10);
                    this.field1788 = var6;
                }
            }
            if (arg0 == null && arg4 == null) {
                return var10;
            }
            class159 var22;
            if (arg0 != null && arg4 != null) {
                var22 = arg0.method1009(arg3, var10, (byte) -77, arg4, arg1);
            } else if (arg0 == null) {
                var22 = arg4.method1012(var10, arg1, 65535);
            } else {
                var22 = arg0.method1012(var10, arg3, 65535);
            }
            return var22;
        } else {
            return class188.method1268(-78, this.field1770).method1064(arg4, arg0, arg3, arg1, (byte) 114);
        }
    }
}
