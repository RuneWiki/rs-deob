import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 {

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    private int field100 = 32;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "J")
    private long field97 = class180.method1236(-94);

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    private int field111 = 0;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "[Lmh;")
    private class151[] field110 = new class151[8];

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    private int field115 = 0;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "J")
    private long field119 = 0L;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "J")
    private long field121 = 0L;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "Z")
    private boolean field124 = true;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "[Lmh;")
    private class151[] field123 = new class151[8];

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "I")
    private int field128 = 0;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    private int field118 = 0;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Z")
    public static boolean field78 = false;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "[[I")
    public static int[][] field96 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "Lla;")
    public static class95 field98 = new class95(64);

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "Lcc;")
    private static class209 field108 = class95.method669(124, "Feb");

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "Lcc;")
    private static class209 field102 = class95.method669(118, "Oct");

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "Lcc;")
    private static class209 field104 = class95.method669(104, "May");

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "Lcc;")
    private static class209 field114 = class95.method669(120, "Aug");

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "Lcc;")
    private static class209 field107 = class95.method669(107, "Jul");

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "Lcc;")
    private static class209 field106 = class95.method669(107, "Jun");

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "Lcc;")
    private static class209 field112 = class95.method669(85, "Apr");

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "Lcc;")
    public static class209 field101 = class95.method669(85, "M");

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "Lcc;")
    private static class209 field105 = class95.method669(88, "Sep");

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "Lcc;")
    private static class209 field116 = class95.method669(99, "Jan");

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "Lcc;")
    public static class209 field103 = class95.method669(126, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "Lcc;")
    private static class209 field122 = class95.method669(120, "Nov");

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "Lcc;")
    private static class209 field120 = class95.method669(114, "Mar");

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "Lcc;")
    private static class209 field125 = class95.method669(82, "Dec");

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "[Lcc;")
    public static class209[] field126 = new class209[] { field116, field108, field120, field112, field104, field106, field107, field114, field105, field102, field122, field125 };

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Lmh;")
    private class151 field85;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "[I")
    public int[] field80;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLmh;)V")
    public final synchronized void method46(byte arg0, class151 arg1) {
        if (arg0 < -30) {
            field91++;
            this.field85 = arg1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static final void method47(byte arg0) {
        field88++;
        if (class78.field1444 == 0) {
            return;
        }
        try {
            if ((++class64.field1247) > 2000) {
                if (class193.field3488 != null) {
                    class193.field3488.method1924(false);
                    class193.field3488 = null;
                }
                if (class141.field2608 >= 1) {
                    class72.field1360 = -5;
                    class78.field1444 = 0;
                    return;
                }
                if (class59.field1186 == class45.field898) {
                    class45.field898 = class155.field2845;
                } else {
                    class45.field898 = class59.field1186;
                }
                class141.field2608++;
                class64.field1247 = 0;
                class78.field1444 = 1;
            }
            if (class78.field1444 == 1) {
                class246.field4458 = class230.field4187.method994(class45.field898, -32322, class64.field1255);
                class78.field1444 = 2;
            }
            if (arg0 <= -108) {
                if (class78.field1444 == 2) {
                    if (class246.field4458.field3646 == 2) {
                        throw new IOException();
                    }
                    if (class246.field4458.field3646 != 1) {
                        return;
                    }
                    class193.field3488 = new class285((Socket) class246.field4458.field3642, class230.field4187);
                    class246.field4458 = null;
                    class193.field3488.method1921(class84.field1677.field2108, class84.field1677.field2085, -32362, 0);
                    if (class95.field1876 != null) {
                        class95.field1876.method66((byte) -59);
                    }
                    if (class227.field4148 != null) {
                        class227.field4148.method66((byte) -59);
                    }
                    int var1 = class193.field3488.method1918((byte) 62);
                    if (class95.field1876 != null) {
                        class95.field1876.method66((byte) -59);
                    }
                    if (class227.field4148 != null) {
                        class227.field4148.method66((byte) -59);
                    }
                    if (var1 != 21) {
                        class72.field1360 = var1;
                        class78.field1444 = 0;
                        class193.field3488.method1924(false);
                        class193.field3488 = null;
                        return;
                    }
                    class78.field1444 = 3;
                }
                if (class78.field1444 == 3) {
                    if (class193.field3488.method1915(1) < 1) {
                        return;
                    }
                    class144.field2655 = new class209[class193.field3488.method1918((byte) -64)];
                    class78.field1444 = 4;
                }
                if (class78.field1444 == 4 && class193.field3488.method1915(1) >= class144.field2655.length * 8) {
                    client.field2818.field2085 = 0;
                    class193.field3488.method1922(client.field2818.field2108, 0, -1, class144.field2655.length * 8);
                    for (int var2 = 0; var2 < class144.field2655.length; var2++) {
                        class144.field2655[var2] = class56.method437(client.field2818.method753(9444), (byte) 44);
                    }
                    class78.field1444 = 0;
                    class72.field1360 = 21;
                    class193.field3488.method1924(false);
                    class193.field3488 = null;
                }
            }
        } catch (IOException var3) {
            if (class193.field3488 != null) {
                class193.field3488.method1924(false);
                class193.field3488 = null;
            }
            if (class141.field2608 < 1) {
                class64.field1247 = 0;
                class141.field2608++;
                if (class59.field1186 == class45.field898) {
                    class45.field898 = class155.field2845;
                } else {
                    class45.field898 = class59.field1186;
                }
                class78.field1444 = 1;
            } else {
                class72.field1360 = -4;
                class78.field1444 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
    public void method48() throws Exception {
        field77++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BILmh;)V")
    private final void method49(byte arg0, int arg1, class151 arg2) {
        field82++;
        int var4 = arg1 >> 5;
        class151 var5 = this.field123[var4];
        if (var5 == null) {
            this.field110[var4] = arg2;
        } else {
            var5.field2752 = arg2;
        }
        this.field123[var4] = arg2;
        if (arg0 < 62) {
            field96 = null;
        }
        arg2.field2753 = arg1;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public void method50(int arg0) throws Exception {
        field95++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method51(Component arg0) throws Exception {
        field86++;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
    public static void method52(byte arg0) {
        field102 = null;
        field107 = null;
        field114 = null;
        field96 = null;
        field108 = null;
        field98 = null;
        if (arg0 > -105) {
            return;
        }
        field126 = null;
        field116 = null;
        field122 = null;
        field112 = null;
        field103 = null;
        field101 = null;
        field120 = null;
        field105 = null;
        field125 = null;
        field104 = null;
        field106 = null;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "()V")
    public void method53() {
        field87++;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
    public final synchronized void method54(byte arg0) {
        field90++;
        if (this.field80 == null) {
            return;
        }
        long var2 = class180.method1236(-18);
        try {
            if (arg0 < 15) {
                this.field111 = 18;
            }
            if (this.field119 != 0L) {
                if (var2 < this.field119) {
                    return;
                }
                this.method50(this.field117);
                this.field119 = 0L;
                this.field124 = true;
            }
            int var4 = this.method58();
            if (this.field128 - var4 > this.field118) {
                this.field118 = this.field128 - var4;
            }
            int var5 = this.field127 + this.field109;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field117) {
                this.field117 += 1024;
                if (this.field117 > 16384) {
                    this.field117 = 16384;
                }
                var4 = 0;
                this.method53();
                this.method50(this.field117);
                this.field124 = true;
                if (this.field117 < (var5 + 256)) {
                    var5 = this.field117 - 256;
                    this.field109 = var5 - this.field127;
                }
            }
            while (var5 > var4) {
                this.method62(this.field80, 256);
                this.method48();
                var4 += 256;
            }
            if (this.field121 < var2) {
                if (this.field124) {
                    this.field124 = false;
                } else if (this.field118 == 0 && this.field111 == 0) {
                    this.method53();
                    this.field119 = var2 + 2000L;
                    return;
                } else {
                    this.field109 = Math.min(this.field111, this.field118);
                    this.field111 = this.field118;
                }
                this.field121 = var2 + 2000L;
                this.field118 = 0;
            }
            this.field128 = var4;
        } catch (Exception var7) {
            this.method53();
            this.field119 = var2 + 2000L;
        }
        try {
            if ((this.field97 + 500000L) < var2) {
                var2 = this.field97;
            }
            while (var2 > (this.field97 + 5000L)) {
                this.method55(-93, 256);
                this.field97 += (long) (256000 / class192.field3479);
            }
        } catch (Exception var6) {
            this.field97 = var2;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V")
    private final void method55(int arg0, int arg1) {
        this.field115 -= arg1;
        if (this.field115 < 0) {
            this.field115 = 0;
        }
        field93++;
        int var3 = 53 % ((-arg0 - 19) / 57);
        if (this.field85 != null) {
            this.field85.method133(arg1);
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public final synchronized void method56(int arg0) {
        if (class115.field2318 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class115.field2318.field4691[var3] == this) {
                    class115.field2318.field4691[var3] = null;
                }
                if (class115.field2318.field4691[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class115.field2318.field4692 = true;
                while (class115.field2318.field4690) {
                    class174.method1196((byte) 109, 50L);
                }
                class115.field2318 = null;
            }
        }
        int var4 = -121 % ((arg0 + 7) / 53);
        field79++;
        this.method53();
        this.field80 = null;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)V")
    public final synchronized void method57(byte arg0) {
        this.field124 = true;
        field81++;
        try {
            if (arg0 == 105) {
                this.method64();
            }
        } catch (Exception var2) {
            this.method53();
            this.field119 = class180.method1236(106) + 2000L;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "()I")
    public int method58() throws Exception {
        field89++;
        return this.field117;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILjava/awt/Component;II)Llc;")
    public static final class83 method59(int arg0, Component arg1, int arg2, int arg3) {
        field99++;
        try {
            Class var4 = Class.forName("q");
            int var5 = 106 / ((arg3 + 22) / 41);
            class83 var6 = (class83) var4.getDeclaredConstructor().newInstance();
            var6.method70(arg1, arg0, (byte) 118, arg2);
            return var6;
        } catch (Throwable var8) {
            class7 var7 = new class7();
            var7.method70(arg1, arg0, (byte) 36, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)V")
    public static final void method60(byte arg0) {
        int var1 = -20 % ((-arg0 - 34) / 49);
        field92++;
        class251.field4507.method665(1);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class56 var20 = new class56(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class106.field2089[var21][arg1][arg2] == null) {
                    class106.field2089[var21][arg1][arg2] = new class109(var21, arg1, arg2);
                }
            }
            class106.field2089[arg0][arg1][arg2].field2217 = var20;
        } else if (arg3 == 1) {
            class56 var22 = new class56(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class106.field2089[var23][arg1][arg2] == null) {
                    class106.field2089[var23][arg1][arg2] = new class109(var23, arg1, arg2);
                }
            }
            class106.field2089[arg0][arg1][arg2].field2217 = var22;
        } else {
            class107 var24 = new class107(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class106.field2089[var25][arg1][arg2] == null) {
                    class106.field2089[var25][arg1][arg2] = new class109(var25, arg1, arg2);
                }
            }
            class106.field2089[arg0][arg1][arg2].field2214 = var24;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([II)V")
    private final void method62(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class32.field577) {
            var3 = arg1 << 1;
        }
        class270.method1841(arg0, 0, var3);
        this.field115 -= arg1;
        if (this.field85 != null && this.field115 <= 0) {
            this.field115 += class192.field3479 >> 4;
            class181.method1240((byte) -82, this.field85);
            this.method49((byte) 120, this.field85.method869(), this.field85);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class151 var10 = null;
                        class151 var11 = this.field110[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class26 var12 = var11.field2751;
                                if (var12 == null || var12.field483 <= var8) {
                                    var11.field2754 = true;
                                    int var13 = var11.method163();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field483 += var13;
                                    }
                                    if (var4 >= this.field100) {
                                        break label107;
                                    }
                                    class151 var14 = var11.method137();
                                    if (var14 != null) {
                                        int var15 = var11.field2753;
                                        while (var14 != null) {
                                            this.method49((byte) 96, var15 * var14.method869() >> 8, var14);
                                            var14 = var11.method148();
                                        }
                                    }
                                    class151 var16 = var11.field2752;
                                    var11.field2752 = null;
                                    if (var10 == null) {
                                        this.field110[var7] = var16;
                                    } else {
                                        var10.field2752 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field123[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2752;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class151 var18 = this.field110[var17];
                this.field110[var17] = this.field123[var17] = null;
                while (var18 != null) {
                    class151 var19 = var18.field2752;
                    var18.field2752 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field115 < 0) {
            this.field115 = 0;
        }
        if (this.field85 != null) {
            this.field85.method153(arg0, 0, arg1);
        }
        this.field97 = class180.method1236(-12);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)I")
    public static int method63(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "()V")
    public void method64() throws Exception {
        field83++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lji;IBI)V")
    public static final void method65(class42 arg0, int arg1, byte arg2, int arg3) {
        int var4 = -109 / (arg2 / 56);
        field94++;
        if (class98.field1912 < 2 && class25.field445 == 0 && !class260.field4689) {
            return;
        }
        class209 var5;
        if (class25.field445 == 1 && class98.field1912 < 2) {
            var5 = class229.method1604(new class209[] { class124.field2417, class187.field3375, class114.field2289, class40.field684 }, (byte) 118);
        } else if (class260.field4689 && class98.field1912 < 2) {
            var5 = class229.method1604(new class209[] { class184.field3318, class187.field3375, class44.field879, class40.field684 }, (byte) 52);
        } else if (class118.field2368 && class228.field4153[81] && class98.field1912 > 2) {
            var5 = class99.method690(-123, class98.field1912 - 2);
        } else {
            var5 = class99.method690(-109, class98.field1912 - 1);
        }
        if (class98.field1912 > 2) {
            var5 = class229.method1604(new class209[] { var5, class9.field181, class66.method485(class98.field1912 - 2, (byte) 105), class157.field2859 }, (byte) 23);
        }
        if (arg0 == null) {
            int var6 = class66.field1269.method1296(var5, arg1 + 4, arg3 + 15, 16777215, 0, class42.field858, class130.field2497);
            class21.method185(arg3, var6 + class66.field1269.method1298(var5), 0, arg1 + 4, 15);
            return;
        }
        class188 var7 = arg0.method318(16165, class234.field4218);
        if (var7 == null) {
            var7 = class66.field1269;
        }
        var7.method1297(var5, arg1, arg3, arg0.field789, arg0.field758, arg0.field727, arg0.field851, arg0.field767, arg0.field694, class42.field858, class130.field2497, class145.field2677);
        class21.method185(class145.field2677[1], class145.field2677[2], 0, class145.field2677[0], class145.field2677[3]);
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)V")
    public final void method66(byte arg0) {
        this.field124 = true;
        field84++;
        if (arg0 != -59) {
            this.method56(1);
        }
    }
}
