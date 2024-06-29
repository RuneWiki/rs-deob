import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class24 extends class51 {

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Z")
    public static boolean field367 = true;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "Ljava/lang/String;")
    public static String field366 = "Use";

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Lug;")
    public static class253 field364;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "[[[B")
    public static byte[][][] field360;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V", line = 4)
    public final void method229(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method234((byte) -127, -1, 124);
        }
        field370++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V", line = 19)
    public final void method230(int arg0, int arg1, int arg2) {
        int var4 = 10 / ((58 - arg0) / 60);
        field357++;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V", line = 31)
    public static void method231(byte arg0) {
        field360 = (byte[][][]) null;
        int var1 = 34 % ((arg0 - 7) / 37);
        field364 = null;
        field366 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 45)
    public static final void method232(String arg0, int arg1) {
        field362++;
        if (client.field1905 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class195.method1449(0);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class131.method971((String) null, (byte) -32, 0, "mem=" + var4 + "k");
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class195.method1449(0);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class131.method971((String) null, (byte) -32, 0, "Memory before cleanup=" + var7 + "k");
                class341.method2360(-27453);
                class195.method1449(0);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class131.method971((String) null, (byte) -32, 0, "Memory after cleanup=" + var9 + "k");
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class131.method971((String) null, (byte) -32, 0, "Number of player models in cache:" + class311.method2159(78));
            }
            if (class109.field1458 && arg0.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class103.field1373);
                System.out.println("oncard_2d:" + class103.field1370);
                System.out.println("oncard_texture:" + class103.field1374);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class153.method1114(-32);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class147.field2322.method2142((byte) 108);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class147.field2322.method2155(98);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class42.field581.method1021((byte) 117);
                class275.field4247.method222((byte) -109);
                class147.field2322.method2143(-1);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class333.field5183 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class68.method538(-119, 25);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class306.field4782 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class306.field4782 = false;
            }
            if (arg0.equalsIgnoreCase("::wm0")) {
                class308.method2132(false, (byte) 13, 0, -1, -1);
            }
            if (arg0.equalsIgnoreCase("::wm1")) {
                class308.method2132(false, (byte) 13, 1, -1, -1);
            }
            if (arg0.equalsIgnoreCase("::wm2")) {
                class308.method2132(false, (byte) 13, 2, -1, -1);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class308.method2132(false, (byte) 13, 3, 768, 1024);
            }
            if (arg0.startsWith("::setba")) {
                class101.field1351 = class192.method1420(arg0.substring(8), 10);
                class135.method985(class42.field581, -128);
                class129.field1892 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class151.method1105(class192.method1420(arg0.substring(15), 10));
                class135.method985(class42.field581, -112);
                class129.field1892 = false;
            }
            if (arg0.startsWith("::fps ") && class6.field109 != 0) {
                class181.method1335(class192.method1420(arg0.substring(6), 10), (byte) 53);
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class193.field3081 = class192.method1420(arg0.substring(12).trim(), 10);
                class131.method971((String) null, (byte) -32, 0, "rect_debug=" + class193.field3081);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class290.field4478 = true;
            }
            if (arg0.startsWith("::hdr") && class109.field1458 && !class14.method138((byte) 11, !class189.method1380())) {
                class131.method971((String) null, (byte) -32, 0, "Failed to enable hdr");
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class270.field4191) {
                    class270.field4191 = false;
                    class131.method971((String) null, (byte) -32, 0, "Forced tweening disabled.");
                } else {
                    class270.field4191 = true;
                    class131.method971((String) null, (byte) -32, 0, "Forced tweening ENABLED!");
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class191.field3044) {
                    System.out.println("Shift-click disabled.");
                    class191.field3044 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class191.field3044 = true;
                }
            }
        }
        class215.field3398++;
        class183.field2965.method1947((byte) 85, 151);
        int var10 = 54 % ((39 - arg1) / 58);
        class183.field2965.method81((byte) -116, arg0.length() - 1);
        class183.field2965.method48(128, arg0.substring(2));
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V", line = 258)
    public static final void method233(boolean arg0) {
        field363++;
        if (class81.field1099 != null) {
            class52 var1 = class81.field1099;
            synchronized (class81.field1099) {
                class81.field1099 = null;
            }
        }
        if (!arg0) {
            method231((byte) 127);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BII)V", line = 275)
    public final void method234(byte arg0, int arg1, int arg2) {
        field358++;
        int var4 = 79 % ((arg0 - 2) / 48);
        int var5 = this.field369 * arg2 >> 12;
        int var6 = this.field359 * arg1 >> 12;
        int var7 = this.field365 * arg2 >> 12;
        int var8 = this.field368 * arg1 >> 12;
        class314.method2189(var6, (byte) 56, var8, var7, this.field652, var5);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(III)Lne;", line = 294)
    public static final class138 method235(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class138 var4 = var3.field1788;
            var3.field1788 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IIIIII)V", line = 306)
    public class24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field365 = arg2;
        this.field359 = arg1;
        this.field369 = arg0;
        this.field368 = arg3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Lfm;", line = 324)
    public static final class336 method236(int arg0, int arg1) {
        field361++;
        class336 var2 = (class336) class39.field558.method1628(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class206.field3258.method1813(0, arg0, true);
        if (var3 == null) {
            return null;
        }
        int var4 = 31 / ((arg1 + 64) / 57);
        class336 var5 = new class336();
        class6 var6 = new class6(var3);
        var6.field111 = var6.field115.length - 2;
        int var7 = var6.method39((byte) 80);
        int var8 = var6.field115.length - var7 - 2 - 12;
        var6.field111 = var8;
        int var9 = var6.method73((byte) 19);
        var5.field5231 = var6.method39((byte) 120);
        var5.field5244 = var6.method39((byte) 55);
        var5.field5242 = var6.method39((byte) 111);
        var5.field5233 = var6.method39((byte) 37);
        int var10 = var6.method58(-288140008);
        if (var10 > 0) {
            var5.field5234 = new class311[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = var6.method39((byte) 114);
                class311 var13 = new class311(class215.method1568(479166497, var12));
                var5.field5234[var11] = var13;
                while ((var12--) > 0) {
                    int var14 = var6.method73((byte) 19);
                    int var15 = var6.method73((byte) 19);
                    var13.method2161(new class233(var15), (long) var14, -1);
                }
            }
        }
        var6.field111 = 0;
        var5.field5235 = var6.method71((byte) 122);
        var5.field5229 = new int[var9];
        var5.field5237 = new String[var9];
        var5.field5236 = new int[var9];
        int var16 = 0;
        while (var6.field111 < var8) {
            int var17 = var6.method39((byte) 38);
            if (var17 == 3) {
                var5.field5237[var16] = var6.method40(false).intern();
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var5.field5236[var16] = var6.method58(-288140008);
            } else {
                var5.field5236[var16] = var6.method73((byte) 19);
            }
            var5.field5229[var16++] = var17;
        }
        class39.field558.method1627((byte) 97, var5, (long) arg0);
        return var5;
    }
}
