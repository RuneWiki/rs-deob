import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class91 {

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Lvb;")
    private class182 field1265;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lwj;")
    private class302 field1258;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lab;")
    private class298 field1253;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field1260 = 0;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[S")
    public static short[] field1257 = new short[256];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Ljj;")
    private class44 field1267;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[Lse;")
    private class275[] field1255;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILrg;)V", line = 10)
    public static final void method608(int arg0, class326 arg1) {
        field1256++;
        for (int var2 = 0; var2 < class309.field4804.length; var2++) {
            class309.field4804[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = arg0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var3);
            class309.field4804[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var3 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = var8 + (var7 << 7);
                    class224.field3585[var9] = (class309.field4804[var9 - 1] + class309.field4804[var9 + 1] + class309.field4804[var9 - -128] + class309.field4804[var9 + -128]) / 4;
                }
            }
            int[] var10 = class309.field4804;
            class309.field4804 = class224.field3585;
            class224.field3585 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field4155; var12++) {
            for (int var13 = 0; var13 < arg1.field4163; var13++) {
                if (arg1.field5044[var11++] != 0) {
                    int var14 = var13 + arg1.field4161 + 16;
                    int var15 = var12 + arg1.field4157 + 16;
                    int var16 = (var15 << 7) + var14;
                    class309.field4804[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 104)
    public static final void method609(byte arg0) {
        if (class63.field917 != null) {
            class331 var1 = class63.field917;
            synchronized (class63.field917) {
                class63.field917 = null;
            }
        }
        field1266++;
        int var3 = 107 % ((arg0 + 22) / 52);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V", line = 123)
    public static void method610(byte arg0) {
        int var1 = -43 % ((arg0 + 30) / 33);
        field1257 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Z", line = 132)
    public final boolean method611(int arg0) {
        field1261++;
        if (this.field1267 != null) {
            return true;
        }
        if (this.field1253 == null) {
            if (this.field1265.method1359((byte) 106)) {
                return false;
            }
            this.field1253 = this.field1265.method1369((byte) 0, 255, true, (byte) -103, 255);
        }
        if (this.field1253.field1190) {
            return false;
        }
        this.field1267 = new class44(this.field1253.method578(26));
        this.field1255 = new class275[(this.field1267.field573.length - 5) / 8];
        if (arg0 != 255) {
            this.field1255 = (class275[]) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;Lak;I)Lf;", line = 161)
    public static final class201 method612(String arg0, class172 arg1, int arg2) {
        if (arg2 >= -20) {
            field1257 = (short[]) null;
        }
        int var3 = arg1.method1298((byte) 116, arg0);
        field1268++;
        if (var3 == -1) {
            return new class201(0);
        }
        int[] var4 = arg1.method1300(var3, true);
        class201 var5 = new class201(var4.length);
        for (int var6 = 0; var6 < var5.field3270; var6++) {
            class44 var7 = new class44(arg1.method1287(var4[var6], var3, -1));
            var5.field3262[var6] = var7.method265(0);
            var5.field3268[var6] = var7.method246((byte) -86);
            var5.field3269[var6] = var7.method238((byte) 82);
            var5.field3261[var6] = var7.method238((byte) 82);
        }
        return var5;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/String;)V", line = 199)
    public static final void method613(byte arg0, String arg1) {
        field1264++;
        if (class341.field5311 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class62.method417(-110);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class155.method1109("mem=" + var4 + "k", 0, (String) null, (byte) -47);
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class62.method417(-102);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class155.method1109("Memory before cleanup=" + var7 + "k", 0, (String) null, (byte) -47);
                class100.method687(0);
                class62.method417(-117);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class155.method1109("Memory after cleanup=" + var9 + "k", 0, (String) null, (byte) -47);
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class155.method1109("Number of player models in cache:" + class178.method1334(114), 0, (String) null, (byte) -47);
            }
            if (class232.field3690 && arg1.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class230.field3660);
                System.out.println("oncard_2d:" + class230.field3662);
                System.out.println("oncard_texture:" + class230.field3663);
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class113.method787(500);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class286.field4589.method1372((byte) -67);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class286.field4589.method1371((byte) 104);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class14.field159.method897(5981);
                class320.field4966.method88(18343);
                class286.field4589.method1370(-83);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class129.field2013 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class278.method2012(25, 120);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class247.field3899 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class247.field3899 = false;
            }
            if (arg1.equalsIgnoreCase("::wm0")) {
                class8.method43(0, false, 0, -1, -1);
            }
            if (arg1.equalsIgnoreCase("::wm1")) {
                class8.method43(1, false, 0, -1, -1);
            }
            if (arg1.equalsIgnoreCase("::wm2")) {
                class8.method43(2, false, 0, -1, -1);
            }
            if (arg1.equalsIgnoreCase("::wm3")) {
                class8.method43(3, false, 0, 768, 1024);
            }
            if (arg1.startsWith("::setba")) {
                class105.field1537 = class142.method1047(-23595, arg1.substring(8));
                class61.method412(class14.field159, 3);
                class316.field4888 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class294.method2101(class142.method1047(-23595, arg1.substring(15)));
                class61.method412(class14.field159, 3);
                class316.field4888 = false;
            }
            if (arg1.startsWith("::fps ") && class122.field1909 != 0) {
                class273.method1974(class142.method1047(-23595, arg1.substring(6)), (byte) 37);
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class130.field2055 = class142.method1047(-23595, arg1.substring(12).trim());
                class155.method1109("rect_debug=" + class130.field2055, 0, (String) null, (byte) -47);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class301.field4727 = true;
            }
            if (arg1.startsWith("::hdr") && class232.field3690 && !class127.method924(!class269.method1912(), (byte) 71)) {
                class155.method1109("Failed to enable hdr", 0, (String) null, (byte) -47);
            }
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class98.field1399) {
                    class98.field1399 = false;
                    class155.method1109("Forced tweening disabled.", 0, (String) null, (byte) -47);
                } else {
                    class98.field1399 = true;
                    class155.method1109("Forced tweening ENABLED!", 0, (String) null, (byte) -47);
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class13.field151) {
                    System.out.println("Shift-click disabled.");
                    class13.field151 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class13.field151 = true;
                }
            }
        }
        class194.field3175.method2375(90, 0);
        class172.field2851++;
        if (arg0 < 80) {
            method608(33, (class326) null);
        }
        class194.field3175.method257(-2, arg1.length() - 1);
        class194.field3175.method231(23573, arg1.substring(2));
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjh;)[Ldf;", line = 408)
    public static final class167[] method614(byte arg0, class124 arg1) {
        field1259++;
        if (!arg1.method906(19747)) {
            return new class167[0];
        }
        class161 var2 = arg1.method910(0);
        if (arg0 != -117) {
            method613((byte) -21, (String) null);
        }
        while (var2.field2661 == 0) {
            class121.method867((byte) -127, 10L);
        }
        if (var2.field2661 == 2) {
            return new class167[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field2664);
        class167[] var4 = new class167[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class167 var6 = new class167();
            var4[var5] = var6;
            var6.field2764 = var3[var5 << 2];
            var6.field2767 = var3[(var5 << 2) + 1];
            var6.field2765 = var3[(var5 << 2) + 2];
            var6.field2771 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILtm;Ltm;)Lse;", line = 456)
    public final class275 method615(int arg0, int arg1, class127 arg2, class127 arg3) {
        field1251++;
        return arg0 == -321 ? this.method618(arg2, 255, arg3, arg1, true) : (class275) null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Lp;", line = 469)
    public static final class229 method616(int arg0, int arg1) {
        field1263++;
        class229 var2 = (class229) class301.field4725.method704((byte) 96, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class179.field2970.method1287(arg0, 1, -1);
        int var4 = 61 / ((arg1 + 10) / 40);
        class229 var5 = new class229();
        if (var3 != null) {
            var5.method1616(new class44(var3), arg0, (byte) -114);
        }
        class301.field4725.method703(var5, (long) arg0, (byte) 85);
        return var5;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V", line = 494)
    public final void method617(byte arg0) {
        field1252++;
        if (this.field1255 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1255.length; var2++) {
            if (this.field1255[var2] != null) {
                this.field1255[var2].method1999(true);
            }
        }
        for (int var3 = 0; var3 < this.field1255.length; var3++) {
            if (this.field1255[var3] != null) {
                this.field1255[var3].method1993((byte) 110);
            }
        }
        int var4 = 82 / ((31 - arg0) / 40);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ltm;ILtm;IZ)Lse;", line = 533)
    private final class275 method618(class127 arg0, int arg1, class127 arg2, int arg3, boolean arg4) {
        field1262++;
        if (this.field1267 == null) {
            throw new RuntimeException();
        }
        this.field1267.field586 = arg3 * 8 + 5;
        if (this.field1267.field586 >= this.field1267.field573.length) {
            throw new RuntimeException();
        } else if (this.field1255[arg3] == null) {
            if (arg1 != 255) {
                this.field1253 = (class298) null;
            }
            int var6 = this.field1267.method238((byte) 82);
            int var7 = this.field1267.method238((byte) 82);
            class275 var8 = new class275(arg3, arg2, arg0, this.field1265, this.field1258, var6, var7, arg4);
            this.field1255[arg3] = var8;
            return var8;
        } else {
            return this.field1255[arg3];
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lvb;Lwj;)V", line = 576)
    public class91(class182 arg0, class302 arg1) {
        this.field1265 = arg0;
        this.field1258 = arg1;
        if (!this.field1265.method1359((byte) 114)) {
            this.field1253 = this.field1265.method1369((byte) 0, 255, true, (byte) -103, 255);
        }
    }
}
