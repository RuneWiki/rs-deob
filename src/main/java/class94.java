import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 extends class148 {

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "[Lke;")
    public class74[] field2190;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "[B")
    public byte[] field2193;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "[S")
    public short[] field2194;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "[B")
    public byte[] field2212;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "[I")
    private int[] field2191;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "[Lob;")
    public class98[] field2202;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "[B")
    public byte[] field2203;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Lja;")
    public static class62 field2186 = class30.method243(43, "M");

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field2192 = 0;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "Lja;")
    private static class62 field2195 = class30.method243(43, "yellow:");

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "Lja;")
    public static class62 field2204 = class30.method243(43, "Fps:");

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "Lja;")
    private static class62 field2206 = class30.method243(43, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "Lja;")
    public static class62 field2196 = field2206;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "Lja;")
    public static class62 field2205 = class30.method243(43, "gleiten:");

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Lja;")
    public static class62 field2188 = field2195;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "Lja;")
    public static class62 field2214 = field2206;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Lja;")
    public static class62 field2197 = class30.method243(43, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "Lja;")
    public static class62 field2216 = field2195;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "[J")
    public static long[] field2217 = new long[200];

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "Lja;")
    private static class62 field2209 = class30.method243(43, "white:");

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "Lja;")
    public static class62 field2189 = field2209;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "Lja;")
    public static class62 field2200 = field2209;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "Lad;")
    public static class5 field2215;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lca;[B[IB)Z")
    public final boolean method719(class15 arg0, byte[] arg1, int[] arg2, byte arg3) {
        field2198++;
        if (arg3 != 102) {
            method725(-124, 22);
        }
        boolean var5 = true;
        int var6 = 0;
        class74 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field2191[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method108((byte) 37, var9 >> 2, arg2);
                        } else {
                            var7 = arg0.method109(arg2, (byte) 48, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2190[var8] = var7;
                        this.field2191[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public static void method720(int arg0) {
        field2215 = null;
        field2186 = null;
        field2188 = null;
        field2200 = null;
        field2206 = null;
        field2196 = null;
        field2189 = null;
        field2209 = null;
        field2195 = null;
        field2216 = null;
        field2205 = null;
        field2217 = null;
        field2214 = null;
        field2197 = null;
        if (arg0 != 0) {
            field2206 = null;
        }
        field2204 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lmf;BLmf;)V")
    public static final void method721(class89 arg0, byte arg1, class89 arg2) {
        field2208++;
        if (class131.field2988 == null) {
            class131.field2988 = class102.method819(class149.field3504, class7.field211, class12.field292, 26425);
        }
        if (class130.field2978 == null) {
            class130.field2978 = class50.method348(class7.field211, class38.field886, class149.field3504, 2);
        }
        if (class90.field2154 == null) {
            class90.field2154 = class50.method348(class7.field211, class151.field3541, class149.field3504, 2);
        }
        if (class18.field415 == null) {
            class18.field415 = class50.method348(class7.field211, class15.field364, class149.field3504, 2);
        }
        class19.method143(0, 23, 765, 480, 0);
        class19.method145(0, 0, 125, 23, 12425273, 9135624);
        class19.method145(125, 0, 640, 23, 5197647, 2697513);
        arg0.method696(class18.field413, 62, 15, 0, -1);
        if (class18.field415 != null) {
            class18.field415[1].method932(140, 1);
            arg2.method688(class88.field2092, 152, 10, 16777215, -1);
            class18.field415[0].method932(140, 12);
            arg2.method688(class6.field204, 152, 21, 16777215, -1);
        }
        if (class90.field2154 != null) {
            short var3 = 280;
            if (class59.field1450[0] == 0 && class151.field3557[0] == 0) {
                class90.field2154[2].method932(var3, 4);
            } else {
                class90.field2154[0].method932(var3, 4);
            }
            if (class59.field1450[0] == 0 && class151.field3557[0] == 1) {
                class90.field2154[3].method932(var3 + 15, 4);
            } else {
                class90.field2154[1].method932(var3 + 15, 4);
            }
            arg0.method688(class26.field615, var3 + 32, 17, 16777215, -1);
            short var4 = 610;
            short var5 = 390;
            short var6 = 500;
            if (class59.field1450[0] == 1 && class151.field3557[0] == 0) {
                class90.field2154[2].method932(var5, 4);
            } else {
                class90.field2154[0].method932(var5, 4);
            }
            if (class59.field1450[0] == 1 && class151.field3557[0] == 1) {
                class90.field2154[3].method932(var5 + 15, 4);
            } else {
                class90.field2154[1].method932(var5 + 15, 4);
            }
            arg0.method688(class110.field2515, var5 + 32, 17, 16777215, -1);
            if (class59.field1450[0] == 2 && class151.field3557[0] == 0) {
                class90.field2154[2].method932(var6, 4);
            } else {
                class90.field2154[0].method932(var6, 4);
            }
            if (class59.field1450[0] == 2 && class151.field3557[0] == 1) {
                class90.field2154[3].method932(var6 + 15, 4);
            } else {
                class90.field2154[1].method932(var6 + 15, 4);
            }
            arg0.method688(class43.field1005, var6 + 32, 17, 16777215, -1);
            if (class59.field1450[0] == 3 && class151.field3557[0] == 0) {
                class90.field2154[2].method932(var4, 4);
            } else {
                class90.field2154[0].method932(var4, 4);
            }
            if (class59.field1450[0] == 3 && class151.field3557[0] == 1) {
                class90.field2154[3].method932(var4 + 15, 4);
            } else {
                class90.field2154[1].method932(var4 + 15, 4);
            }
            arg0.method688(class63.field1555, var4 + 32, 17, 16777215, -1);
        }
        class19.method143(708, 4, 50, 16, 0);
        arg2.method696(class70.field1782, 733, 16, 16777215, -1);
        class59.field1443 = -1;
        if (class131.field2988 != null) {
            byte var7 = 88;
            int var8 = 765 / (var7 + 1);
            byte var9 = 19;
            int var10 = 480 / (var9 + 1);
            int var11;
            int var12;
            do {
                var11 = var8;
                if (class82.field1981 <= (var8 - 1) * var10) {
                    var8--;
                }
                var12 = var10;
                if ((var10 - 1) * var8 >= class82.field1981) {
                    var10--;
                }
                if ((var10 - 1) * var8 >= class82.field1981) {
                    var10--;
                }
            } while (var10 != var12 || var8 != var11);
            int var13 = (765 - var7 * var8) / (var8 + 1);
            int var14 = (480 - var9 * var10) / (var10 + 1);
            if (var14 > 5) {
                var14 = 5;
            }
            if (var13 > 5) {
                var13 = 5;
            }
            int var15 = (765 - (var8 - 1) * var13 - var7 * var8) / 2;
            int var16 = (480 - (var10 - 1) * var14 - var9 * var10) / 2;
            int var17 = var15;
            int var18 = var16 + 23;
            int var19 = 0;
            for (int var20 = 0; var20 < class82.field1981; var20++) {
                class139 var21 = class126.field2861[var20];
                class62 var22 = class31.method249(true, var21.field3223);
                boolean var23 = true;
                if (var21.field3223 == -1) {
                    var23 = false;
                    var22 = class8.field227;
                } else if (var21.field3223 > 1980) {
                    var23 = false;
                    var22 = class72.field1842;
                }
                if (class103.field2398 >= var17 && var18 <= class84.field2032 && class103.field2398 < var7 + var17 && class84.field2032 < var9 + var18 && var23) {
                    class59.field1443 = var20;
                    class131.field2988[var21.field3229 ? 1 : 0].method405(var17, var18, 128, 16777215);
                } else {
                    class131.field2988[var21.field3229 ? 1 : 0].method411(var17, var18);
                }
                if (class130.field2978 != null) {
                    class130.field2978[(var21.field3229 ? 8 : 0) + var21.field3233].method932(var17 + 29, var18);
                }
                arg0.method696(class31.method249(true, var21.field3232), var17 + 15, var9 / 2 + var18 + 5, 0, -1);
                arg2.method696(var22, var17 + 60, var9 / 2 + var18 - -5, 268435455, -1);
                var18 += var9 + var14;
                var19++;
                if (var19 >= var10) {
                    var18 = var16 + 23;
                    var17 += var7 + var13;
                    var19 = 0;
                }
            }
        }
        try {
            if (arg1 > 48) {
                Graphics var24 = class9.field240.getGraphics();
                class105.field2419.method83(0, (byte) -119, var24, 0);
            }
        } catch (Exception var25) {
            class9.field240.repaint();
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public final void method722(boolean arg0) {
        this.field2191 = null;
        field2199++;
        if (!arg0) {
            method721(null, (byte) -86, null);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/awt/Component;Lfe;BII)Lib;")
    public static final class57 method723(Component arg0, class41 arg1, byte arg2, int arg3, int arg4) {
        field2201++;
        if (class144.field3371 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class57 var5 = (class57) Class.forName("qf").getDeclaredConstructor().newInstance();
                if (arg2 != -114) {
                    method723(null, null, (byte) -26, 45, -117);
                }
                var5.field1425 = arg4;
                var5.field1400 = new int[(class8.field231 ? 2 : 1) * 256];
                var5.method285(arg0);
                var5.field1426 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field1426 > 16384) {
                    var5.field1426 = 16384;
                }
                var5.method281(var5.field1426);
                if (class118.field2686 > 0 && class9.field243 == null) {
                    class9.field243 = new class46();
                    class9.field243.field1046 = arg1;
                    arg1.method310(class9.field243, class118.field2686, (byte) -1);
                }
                if (class9.field243 != null) {
                    if (class9.field243.field1042[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class9.field243.field1042[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class37 var6 = new class37(arg1, arg3);
                    var6.field1400 = new int[(class8.field231 ? 2 : 1) * 256];
                    var6.field1425 = arg4;
                    var6.method285(arg0);
                    var6.field1426 = 16384;
                    var6.method281(var6.field1426);
                    if (class118.field2686 > 0 && class9.field243 == null) {
                        class9.field243 = new class46();
                        class9.field243.field1046 = arg1;
                        arg1.method310(class9.field243, class118.field2686, (byte) -1);
                    }
                    if (class9.field243 != null) {
                        if (class9.field243.field1042[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class9.field243.field1042[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class57();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
    public static final void method724(byte arg0) {
        field2207++;
        int var1 = class84.field2021;
        int var2 = class79.field1914;
        int var3 = class57.field1410;
        int var4 = class148.field3484;
        int var5 = 6116423;
        class19.method141(var1, var2, var1 + var3, var2 - -var4);
        class19.method143(var1, var2, var3, var4, var5);
        class19.method143(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class19.method144(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        class70.field1789.method688(class140.field3252, var1 + 3, var2 - -14, var5, -1);
        int var6 = class84.field2032;
        int var7 = class103.field2398;
        int var8 = 1 / ((arg0 + 43) / 63);
        for (int var9 = 0; var9 < class128.field2889; var9++) {
            int var10 = (class128.field2889 - var9 - 1) * 15 + var2 + 31;
            int var11 = 16777215;
            if (var1 < var7 && var7 < var1 + var3 && var10 - 13 < var6 && var6 < var10 + 3) {
                var11 = 16776960;
            }
            class70.field1789.method688(class97.method756(-119, var9), var1 + 3, var10, var11, 0);
        }
        class40.method298(class79.field1914, (byte) 81, class84.field2021, class57.field1410, class148.field3484);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)Z")
    public static final boolean method725(int arg0, int arg1) {
        if (arg1 == 19139) {
            field2210++;
            return (arg0 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class94() {
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B)V")
    public class94(byte[] arg0) {
        this.field2190 = new class74[128];
        this.field2193 = new byte[128];
        this.field2194 = new short[128];
        this.field2212 = new byte[128];
        this.field2191 = new int[128];
        int var2 = 0;
        this.field2202 = new class98[128];
        this.field2203 = new byte[128];
        class128 var3 = new class128(arg0);
        while (var3.field2874[var3.field2873 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1028(-115487256);
        }
        var2++;
        var3.field2873++;
        int var6 = var3.field2873;
        int var7 = 0;
        var3.field2873 += var2;
        while (var3.field2874[var3.field2873 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1028(-115487256);
        }
        var7++;
        int var10 = 0;
        var3.field2873++;
        int var11 = var3.field2873;
        var3.field2873 += var7;
        while (var3.field2874[var3.field2873 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1028(-115487256);
        }
        var3.field2873++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method1025(255);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var10;
        }
        class98[] var19 = new class98[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class98 var103 = var19[var20] = new class98();
            int var104 = var3.method1025(255);
            if (var104 > 0) {
                var103.field2279 = new byte[var104 * 2];
            }
            int var105 = var3.method1025(255);
            if (var105 > 0) {
                var103.field2272 = new byte[var105 * 2 + 2];
                var103.field2272[1] = 64;
            }
        }
        int var21 = var3.method1025(255);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var3.method1025(255);
        int var24;
        for (var24 = 0; var3.field2874[var3.field2873 + var24] != 0; var24++) {
        }
        byte[] var25 = var23 <= 0 ? null : new byte[var23 * 2];
        byte[] var26 = new byte[var24];
        for (int var27 = 0; var27 < var24; var27++) {
            var26[var27] = var3.method1028(-115487256);
        }
        var3.field2873++;
        var24++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1025(255);
            this.field2194[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1025(255);
            this.field2194[var31] = (short) (this.field2194[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var33 == 0) {
                if (var26.length <= var32) {
                    var33 = -1;
                } else {
                    var33 = var26[var32++];
                }
                var34 = var3.method1006((byte) -126);
            }
            var33--;
            this.field2194[var35] = (short) (this.field2194[var35] + class24.method192(32768, var34 - 1 << 14));
            this.field2191[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2191[var39] != 0) {
                if (var36 == 0) {
                    var37 = var3.field2874[var6++] - 1;
                    if (var38 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var38++];
                    }
                }
                this.field2193[var39] = (byte) var37;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2191[var43] != 0) {
                if (var40 == 0) {
                    var41 = var3.field2874[var11++] + 16 << 2;
                    if (var42 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var42++];
                    }
                }
                var40--;
                this.field2212[var43] = (byte) var41;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class98 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2191[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field2202[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 < var26.length) {
                    var48 = var26[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field2191[var51] > 0) {
                    var50 = var3.method1025(255) + 1;
                }
            }
            var48--;
            this.field2203[var51] = (byte) var50;
        }
        this.field2187 = var3.method1025(255) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class98 var100 = var19[var52];
            if (var100.field2279 != null) {
                for (int var101 = 1; var101 < var100.field2279.length; var101 += 2) {
                    var100.field2279[var101] = var3.method1028(-115487256);
                }
            }
            if (var100.field2272 != null) {
                for (int var102 = 3; var102 < var100.field2272.length - 2; var102 += 2) {
                    var100.field2272[var102] = var3.method1028(-115487256);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method1028(-115487256);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method1028(-115487256);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class98 var97 = var19[var55];
            if (var97.field2272 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2272.length; var99 += 2) {
                    var98 = var3.method1025(255) + var98 + 1;
                    var97.field2272[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class98 var94 = var19[var56];
            if (var94.field2279 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2279.length; var96 += 2) {
                    var95 = var95 + var3.method1025(255) + 1;
                    var94.field2279[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method1025(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var3.method1025(255) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2203[var61] = (byte) (this.field2203[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62 + 1];
                byte var66 = var22[var62];
                int var67 = (var66 - var59) / 2 + (var66 - var59) * var60;
                var62 += 2;
                for (int var68 = var59; var68 < var66; var68++) {
                    int var69 = class86.method672(var67, var66 - var59, (byte) 90);
                    this.field2203[var68] = (byte) (this.field2203[var68] * var69 + 32 >> 6);
                    var67 += var65 - var60;
                }
                var60 = var65;
                var59 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2203[var63] = (byte) (this.field2203[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method1025(255);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var70 + var3.method1025(255) + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2212[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2212[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var72) * var73 + (var79 - var72) / 2;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class86.method672(var81, var79 - var72, (byte) 101);
                    int var84 = (this.field2212[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field2212[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field2212[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2212[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2285 = var3.method1025(255);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class98 var93 = var19[var87];
            if (var93.field2279 != null) {
                var93.field2291 = var3.method1025(255);
            }
            if (var93.field2272 != null) {
                var93.field2283 = var3.method1025(255);
            }
            if (var93.field2285 > 0) {
                var93.field2282 = var3.method1025(255);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2287 = var3.method1025(255);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class98 var92 = var19[var89];
            if (var92.field2287 > 0) {
                var92.field2276 = var3.method1025(255);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class98 var91 = var19[var90];
            if (var91.field2276 > 0) {
                var91.field2284 = var3.method1025(255);
            }
        }
    }
}
