import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 extends class134 {

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    private int field215 = 0;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "[I")
    public static int[] field205 = new int[500];

    @OriginalMember(owner = "client!ba", name = "lb", descriptor = "Lwd;")
    private static class150 field223 = class2.method9(true, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!ba", name = "mb", descriptor = "Lwd;")
    private static class150 field224 = class2.method9(true, "Bad session id)3");

    @OriginalMember(owner = "client!ba", name = "ob", descriptor = "Z")
    public static boolean field226 = false;

    @OriginalMember(owner = "client!ba", name = "nb", descriptor = "Z")
    public static boolean field225 = true;

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "Lwd;")
    public static class150 field218 = field223;

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "[I")
    public static int[] field221 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "Lwd;")
    public static class150 field203 = class2.method9(true, "leuchten3:");

    @OriginalMember(owner = "client!ba", name = "rb", descriptor = "I")
    public static int field229 = 0;

    @OriginalMember(owner = "client!ba", name = "qb", descriptor = "Lwd;")
    public static class150 field228 = field224;

    @OriginalMember(owner = "client!ba", name = "sb", descriptor = "Lwd;")
    private static class150 field230 = class2.method9(true, "Use");

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "Lwd;")
    public static class150 field214 = field230;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ba", name = "pb", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "Lce;")
    public static class20 field201;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "Lce;")
    public static class20 field213;

    @OriginalMember(owner = "client!ba", name = "tb", descriptor = "Lhb;")
    public static class51 field231;

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "[[B")
    public static byte[][] field222;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)V")
    private final void method50(byte arg0, int arg1) {
        field208++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var7 < var3) {
            var11 = var7;
        }
        if (var7 > var3) {
            var9 = var7;
        }
        if (var5 < var11) {
            var11 = var5;
        }
        if (var5 > var9) {
            var9 = var5;
        }
        double var13 = 0.0D;
        double var15 = (var9 + var11) / 2.0D;
        double var17 = 0.0D;
        this.field209 = (int) (var15 * 256.0D);
        if (var9 != var11) {
            if (var15 < 0.5D) {
                var17 = (var9 - var11) / (var9 + var11);
            }
            if (var15 >= 0.5D) {
                var17 = (var9 - var11) / (2.0D - var9 - var11);
            }
            if (var3 == var9) {
                var13 = (var7 - var5) / (-var11 + var9);
            } else if (var7 == var9) {
                var13 = (var5 - var3) / (var9 - var11) + 2.0D;
            } else if (var5 == var9) {
                var13 = (var3 - var7) / (var9 - var11) + 4.0D;
            }
        }
        if (this.field209 < 0) {
            this.field209 = 0;
        } else if (this.field209 > 255) {
            this.field209 = 255;
        }
        double var19 = var13 / 6.0D;
        if (var15 > 0.5D) {
            this.field210 = (int) ((1.0D - var15) * var17 * 512.0D);
        } else {
            this.field210 = (int) (var15 * var17 * 512.0D);
        }
        this.field212 = (int) (var17 * 256.0D);
        if (arg0 >= -40) {
            this.method52(68, 70, null);
        }
        if (this.field212 < 0) {
            this.field212 = 0;
        } else if (this.field212 > 255) {
            this.field212 = 255;
        }
        if (this.field210 < 1) {
            this.field210 = 1;
        }
        this.field219 = (int) ((double) this.field210 * var19);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILwb;)V")
    private final void method51(int arg0, int arg1, int arg2, class148 arg3) {
        if (arg0 == 354422672) {
            if (arg2 == 1) {
                this.field215 = arg3.method1152((byte) -110);
            }
            field216++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILwb;)V")
    public final void method52(int arg0, int arg1, class148 arg2) {
        field217++;
        if (arg1 != -265) {
            return;
        }
        while (true) {
            int var4 = arg2.method1137(arg1 ^ 0xFFFFFE08);
            if (var4 == 0) {
                return;
            }
            this.method51(354422672, arg0, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Lbb;")
    public static final class10 method53(int arg0, int arg1) {
        if (arg1 != 1024) {
            method57(-58, 121);
        }
        field206++;
        class10 var2 = (class10) class96.field2213.method440((long) arg0, 26976);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class73.field1820.method315(arg0, true, 14);
        class10 var4 = new class10();
        if (var3 != null) {
            var4.method63(255, new class148(var3));
        }
        class96.field2213.method433(var4, (long) arg0, (byte) -122);
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)I")
    public static final int method54(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 70 % ((arg3 + 20) / 59);
        field220++;
        int var6 = 65536 - class60.field1515[arg0 * 1024 / arg2] >> 1;
        return ((65536 - var6) * arg1 >> 16) + (arg4 * var6 >> 16);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)Z")
    public static final boolean method55(int arg0, int arg1) {
        field202++;
        if (arg1 <= 56) {
            return true;
        } else {
            return (arg0 >> 20 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)V")
    public final void method56(byte arg0) {
        if (arg0 != -11) {
            this.method52(6, -19, null);
        }
        this.method50((byte) -67, this.field215);
        field211++;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)V")
    public static final void method57(int arg0, int arg1) {
        field227++;
        if (arg1 == -1 || !class26.field781[arg1]) {
            return;
        }
        class47.field1255.method321(false, arg1);
        if (class58.field1500[arg1] == null) {
            return;
        }
        int var2 = 42 / ((arg0 - 15) / 55);
        boolean var3 = true;
        for (int var4 = 0; var4 < class58.field1500[arg1].length; var4++) {
            if (class58.field1500[arg1][var4] != null) {
                if (class58.field1500[arg1][var4].field3354 == 2) {
                    var3 = false;
                } else {
                    class58.field1500[arg1][var4] = null;
                }
            }
        }
        if (var3) {
            class58.field1500[arg1] = null;
        }
        class26.field781[arg1] = false;
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(B)V")
    public static void method58(byte arg0) {
        field222 = null;
        field228 = null;
        field203 = null;
        field205 = null;
        field221 = null;
        if (arg0 < 50) {
            method55(-108, 26);
        }
        field214 = null;
        field223 = null;
        field201 = null;
        field224 = null;
        field213 = null;
        field218 = null;
        field231 = null;
        field230 = null;
    }
}
