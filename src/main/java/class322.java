import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class322 {

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public int field4962;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "[I")
    public static int[] field4946 = new int[2];

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Z")
    public static boolean field4950 = false;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field4957 = -1;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field4945 = -1;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field4939 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public int field4943;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public int field4944;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public int field4961;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Led;")
    public class310 field4951;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Lkg;")
    public static class82 field4948;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "[I")
    public int[] field4941;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "[I")
    public int[] field4942;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "[I")
    public int[] field4953;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "[I")
    public int[] field4955;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "[I")
    public int[] field4959;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "[I")
    public int[] field4960;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "[Led;")
    public class310[] field4954;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "[[I")
    public int[][] field4947;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "[[I")
    public int[][] field4956;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIB)V", line = 4)
    public static final void method2240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field4938++;
        int var7 = class140.method930(24918, arg5, class248.field3759, class272.field4273);
        int var8 = class140.method930(24918, arg4, class248.field3759, class272.field4273);
        int var9 = class140.method930(24918, arg0, class56.field678, class109.field1494);
        int var10 = class140.method930(24918, arg2, class56.field678, class109.field1494);
        int var11 = class140.method930(24918, arg1 + arg5, class248.field3759, class272.field4273);
        int var12 = class140.method930(24918, arg4 - arg1, class248.field3759, class272.field4273);
        for (int var13 = var7; var13 < var11; var13++) {
            class279.method1997(var10, -824384948, var9, arg3, class206.field2886[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class279.method1997(var10, -824384948, var9, arg3, class206.field2886[var14]);
        }
        int var15 = 4 / ((arg6 + 22) / 43);
        int var16 = class140.method930(24918, arg0 + arg1, class56.field678, class109.field1494);
        int var17 = class140.method930(24918, arg2 - arg1, class56.field678, class109.field1494);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class206.field2886[var18];
            class279.method1997(var16, -824384948, var9, arg3, var19);
            class279.method1997(var10, -824384948, var17, arg3, var19);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;)V", line = 58)
    public static final void method2241(int arg0, String arg1) {
        field4937++;
        if (arg0 != 12) {
            return;
        }
        if (class154.field2151 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class116.method792(-29452);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class150.method1010("mem=" + var4 + "k", 0, (byte) -59, (String) null);
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class116.method792(-29452);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class150.method1010("Memory before cleanup=" + var7 + "k", 0, (byte) -59, (String) null);
                class31.method191(-1);
                class116.method792(-29452);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class150.method1010("Memory after cleanup=" + var9 + "k", 0, (byte) -59, (String) null);
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class150.method1010("Number of player models in cache:" + class36.method211(arg0 + 25924), 0, (byte) -59, (String) null);
            }
            if (class250.field3787 && arg1.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class266.field4193);
                System.out.println("oncard_2d:" + class266.field4195);
                System.out.println("oncard_texture:" + class266.field4196);
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class282.method2017(-44);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class22.field283.method955((byte) 120);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class22.field283.method946((byte) -111);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class9.field131.method1913(false);
                class236.field3463.method1095(28782);
                class22.field283.method938((byte) 77);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class63.field823 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class97.method587(-15525, 25);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class132.field1819 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class132.field1819 = false;
            }
            if (arg1.equalsIgnoreCase("::wm0")) {
                class35.method208(false, 0, -1, -1, arg0 ^ 0x66D0);
            }
            if (arg1.equalsIgnoreCase("::wm1")) {
                class35.method208(false, 1, -1, -1, 26332);
            }
            if (arg1.equalsIgnoreCase("::wm2")) {
                class35.method208(false, 2, -1, -1, 26332);
            }
            if (arg1.equalsIgnoreCase("::wm3")) {
                class35.method208(false, 3, 1024, 768, 26332);
            }
            if (arg1.startsWith("::setba")) {
                class163.field2260 = class235.method1672(arg1.substring(8), 10);
                class319.method2223(class9.field131, 24398);
                class136.field1881 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class274.method1978(class235.method1672(arg1.substring(15), 10));
                class319.method2223(class9.field131, arg0 ^ 0x5F42);
                class136.field1881 = false;
            }
            if (arg1.startsWith("::fps ") && class5.field83 != 0) {
                class13.method92(class235.method1672(arg1.substring(6), 10), 1);
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class177.field2569 = class235.method1672(arg1.substring(12).trim(), 10);
                class150.method1010("rect_debug=" + class177.field2569, 0, (byte) -59, (String) null);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class309.field4772 = true;
            }
            if (arg1.startsWith("::hdr") && class250.field3787 && !class187.method1298(!class124.method840(), 0)) {
                class150.method1010("Failed to enable hdr", 0, (byte) -59, (String) null);
            }
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class37.field445) {
                    class37.field445 = false;
                    class150.method1010("Forced tweening disabled.", 0, (byte) -59, (String) null);
                } else {
                    class37.field445 = true;
                    class150.method1010("Forced tweening ENABLED!", 0, (byte) -59, (String) null);
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class163.field2247) {
                    System.out.println("Shift-click disabled.");
                    class163.field2247 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class163.field2247 = true;
                }
            }
        }
        class140.field1954.method573(115, 152);
        class38.field457++;
        class140.field1954.method648(arg1.length() - 1, (byte) 38);
        class140.field1954.method636(arg0 ^ 0xF3, arg1.substring(2));
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([BI)V", line = 280)
    private final void method2242(byte[] arg0, int arg1) {
        field4958++;
        class107 var3 = new class107(class191.method1328(arg0, -27147));
        int var4 = var3.method661(-1);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field4961 = 0;
        } else {
            this.field4961 = var3.method676(true);
        }
        int var5 = var3.method661(-1);
        this.field4943 = var3.method624(14612);
        this.field4941 = new int[this.field4943];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field4943; var8++) {
            this.field4941[var8] = var6 += var3.method624(14612);
            if (var7 < this.field4941[var8]) {
                var7 = this.field4941[var8];
            }
        }
        this.field4944 = var7 + 1;
        this.field4942 = new int[this.field4944];
        this.field4959 = new int[this.field4944];
        this.field4956 = new int[this.field4944][];
        this.field4955 = new int[this.field4944];
        this.field4953 = new int[this.field4944];
        if (var5 != 0) {
            this.field4960 = new int[this.field4944];
            for (int var9 = 0; var9 < this.field4944; var9++) {
                this.field4960[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4943; var10++) {
                this.field4960[this.field4941[var10]] = var3.method676(true);
            }
            this.field4951 = new class310(this.field4960);
        }
        for (int var11 = 0; var11 < this.field4943; var11++) {
            this.field4953[this.field4941[var11]] = var3.method676(true);
        }
        if (arg1 >= -42) {
            return;
        }
        for (int var12 = 0; var12 < this.field4943; var12++) {
            this.field4942[this.field4941[var12]] = var3.method676(true);
        }
        for (int var13 = 0; var13 < this.field4943; var13++) {
            this.field4955[this.field4941[var13]] = var3.method624(14612);
        }
        for (int var14 = 0; var14 < this.field4943; var14++) {
            int var15 = 0;
            int var16 = this.field4941[var14];
            int var17 = this.field4955[var16];
            this.field4956[var16] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field4956[var16][var19] = var15 += var3.method624(14612);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field4959[var16] = var18 + 1;
            if (var18 + 1 == var17) {
                this.field4956[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4954 = new class310[var7 + 1];
        this.field4947 = new int[var7 + 1][];
        for (int var21 = 0; var21 < this.field4943; var21++) {
            int var22 = this.field4941[var21];
            int var23 = this.field4955[var22];
            this.field4947[var22] = new int[this.field4959[var22]];
            for (int var24 = 0; var24 < this.field4959[var22]; var24++) {
                this.field4947[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field4956[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field4956[var22][var25];
                }
                this.field4947[var22][var26] = var3.method676(true);
            }
            this.field4954[var22] = new class310(this.field4947[var22]);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 451)
    public static void method2243(int arg0) {
        field4946 = null;
        field4948 = null;
        int var1 = -94 % ((-arg0 - 47) / 56);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I", line = 470)
    public static final int method2244(int arg0, int arg1, int arg2) {
        field4949++;
        int var3 = arg0 >>> 31;
        if (arg2 <= 84) {
            method2241(17, (String) null);
        }
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([BI)V", line = 502)
    public class322(byte[] arg0, int arg1) {
        this.field4962 = class291.method2075(arg0, 0, arg0.length);
        if (this.field4962 != arg1) {
            throw new RuntimeException();
        }
        this.method2242(arg0, -79);
    }
}
