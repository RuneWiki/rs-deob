import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class66 {

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lqe;")
    public static class168 field926 = method448("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 99);

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lqe;")
    public static class168 field928 = method448("Lade Wordpack )2 ", 23);

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lqe;")
    public static class168 field929 = method448(" )2>", 42);

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Lqe;")
    public static class168 field935 = method448(" steht bereits auf Ihrer Ignorieren)2Liste(Q", -115);

    @OriginalMember(owner = "client!u", name = "i", descriptor = "J")
    public static volatile long field931 = 0L;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static volatile int field932 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field934;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public static final void method446() {
        for (int var0 = 0; var0 < class89.field1395; var0++) {
            for (int var5 = 0; var5 < class90.field1406; var5++) {
                for (int var6 = 0; var6 < class32.field386; var6++) {
                    class254.field4395[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class134.field2337; var1++) {
            for (int var4 = 0; var4 < class134.field2340[var1]; var4++) {
                class134.field2341[var1][var4] = null;
            }
            class134.field2340[var1] = 0;
        }
        for (int var2 = 0; var2 < class185.field3261; var2++) {
            class252.field4369[var2] = null;
        }
        class185.field3261 = 0;
        for (int var3 = 0; var3 < class14.field135.length; var3++) {
            class14.field135[var3] = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method447(int arg0) {
        field935 = null;
        field926 = null;
        field928 = null;
        field929 = null;
        if (arg0 > -41) {
            method446();
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;I)Lqe;")
    public static final class168 method448(String arg0, int arg1) {
        field924++;
        int var2 = -77 % ((arg1 + 50) / 58);
        int var3 = 0;
        byte[] var4 = arg0.getBytes();
        int var5 = var4.length;
        class168 var6 = new class168();
        var6.field2904 = new byte[var5];
        while (var3 < var5) {
            int var7 = var4[var3++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var3 >= var5) {
                    break;
                }
                int var8 = var4[var3++] & 0xFF;
                var6.field2904[var6.field2870++] = (byte) ((var7 - 40) * 43 + var8 - 48);
            } else if (var7 != 0) {
                var6.field2904[var6.field2870++] = (byte) var7;
            }
        }
        var6.method1070(-14668);
        return var6.method1107(0);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILmj;ZIIILgd;)V")
    public static final void method449(int arg0, class129 arg1, boolean arg2, int arg3, int arg4, int arg5, class65 arg6) {
        field925++;
        if (arg6 == null || arg2) {
            return;
        }
        int var7 = arg3 * arg3 + arg4 * arg4;
        int var8 = class103.field1665 + class159.field2742 & 0x7FF;
        int var9 = Math.max(arg1.field2175 / 2, arg1.field2210 / 2) + 10;
        if (var9 * var9 < var7) {
            return;
        }
        int var10 = class248.field4301[var8];
        int var11 = class248.field4297[var8];
        int var12 = var11 * 256 / (class100.field1583 + 256);
        int var13 = var10 * 256 / (class100.field1583 + 256);
        int var14 = arg3 * var13 + arg4 * var12 >> 16;
        int var15 = arg4 * var13 - arg3 * var12 >> 16;
        ((class15) arg6).method65(arg5 + var14 + arg1.field2175 / 2 - arg6.field917 / 2, arg1.field2210 / 2 + (arg0 - var15) + -(arg6.field911 / 2), arg1.field2150, arg1.field2206);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V")
    public static final void method450(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class163.field2792 == 1) {
            class232.field3936[class147.field2555 / 100].method73(class57.field782 - 8, class214.field3703 + -8);
        }
        if (class163.field2792 == 2) {
            class232.field3936[class147.field2555 / 100 + 4].method73(class57.field782 - 8, class214.field3703 + -8);
        }
        field923++;
        if (arg2 != 28540) {
            field932 = -42;
        }
        class135.method914(-2260);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lnh;I[B)V")
    public final void method451(class112 arg0, int arg1, byte[] arg2) {
        int var4 = 99 / ((arg1 + 45) / 53);
        field933++;
        if (arg0.field1780[arg0.field1821] != 31 || arg0.field1780[arg0.field1821 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field934 == null) {
            this.field934 = new Inflater(true);
        }
        try {
            this.field934.setInput(arg0.field1780, arg0.field1821 + 10, -8 - arg0.field1821 + arg0.field1780.length + -10);
            this.field934.inflate(arg2);
        } catch (Exception var5) {
            this.field934.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field934.reset();
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class66() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
    public static final void method452(int arg0) {
        if (arg0 <= 124) {
            return;
        }
        for (int var1 = 0; var1 < class84.field1278; var1++) {
            int var2 = class38.field521[var1];
            class222 var3 = class229.field3898[var2];
            int var4 = class112.field1815.method758(true);
            if ((var4 & 0x10) != 0) {
                var3.field198 = class112.field1815.method728((byte) -116);
                int var5 = class112.field1815.method767(-121);
                var3.field217 = 0;
                var3.field183 = 0;
                if (var3.field198 == 65535) {
                    var3.field198 = -1;
                }
                var3.field218 = var5 >> 16;
                var3.field156 = class133.field2326 + (var5 & 0xFFFF);
                if (class133.field2326 < var3.field156) {
                    var3.field183 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field181 = class112.field1815.method766(22102);
                if (var3.field181 == 65535) {
                    var3.field181 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field227 = class112.field1815.method751((byte) -96);
                var3.field185 = 100;
            }
            if ((var4 & 0x8) != 0) {
                int var6 = class112.field1815.method778(128);
                int var7 = class112.field1815.method758(true);
                var3.method92(var7, -1, var6, class133.field2326);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field3814.method1195(-79)) {
                    class111.method717(var3, (byte) -16);
                }
                var3.field3814 = class74.method504(class112.field1815.method731(false), (byte) -59);
                var3.field225 = var3.field3814.field3197;
                var3.field196 = var3.field3814.field3163;
                var3.field188 = var3.field3814.field3215;
                var3.field171 = var3.field3814.field3189;
                var3.field192 = var3.field3814.field3184;
                var3.field208 = var3.field3814.field3187;
                var3.field224 = var3.field3814.field3165;
                var3.field204 = var3.field3814.field3195;
                var3.field179 = var3.field3814.field3169;
                if (var3.field3814.method1195(-120)) {
                    class230.method1484(var3.field206[0], var3, null, class196.field3401, null, var3.field219[0], (byte) 112, 0);
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field207 = class112.field1815.method731(false);
                var3.field175 = class112.field1815.method731(false);
            }
            if ((var4 & 0x4) != 0) {
                int var8 = class112.field1815.method762(false);
                int var9 = class112.field1815.method743(-30935);
                var3.method92(var9, -1, var8, class133.field2326);
                var3.field191 = class133.field2326 + 300;
                var3.field199 = class112.field1815.method762(false);
            }
            if ((var4 & 0x80) != 0) {
                int var10 = class112.field1815.method731(false);
                int var11 = class112.field1815.method743(-30935);
                if (var10 == 65535) {
                    var10 = -1;
                }
                class51.method356(var11, 122, var3, var10);
            }
        }
        field927++;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(III)V")
    private class66(int arg0, int arg1, int arg2) {
    }
}
