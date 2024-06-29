import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class123 extends class115 {

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    public static int field2206 = 0;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "Lub;")
    public static class227 field2212 = class257.method1749(")3runescape)3com", 17263);

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field2217 = 0;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    private int field2216;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "Lub;")
    public class227 field2219;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2218;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "[[Z")
    public static boolean[][] field2210;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "[[[B")
    public static byte[][][] field2215;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZLnj;)V")
    public final void method759(boolean arg0, class226 arg1) {
        field2207++;
        while (true) {
            int var3 = arg1.method1471(255);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    field2217 = 122;
                    return;
                }
            }
            this.method761(16373, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ln;III)Z")
    public static final boolean method760(class138 arg0, int arg1, int arg2, int arg3) {
        int var4 = -70 % ((5 - arg3) / 48);
        byte[] var5 = arg0.method884(arg2, -97, arg1);
        field2213++;
        if (var5 == null) {
            return false;
        } else {
            class219.method1385(var5, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILnj;)V")
    private final void method761(int arg0, int arg1, class226 arg2) {
        field2211++;
        if (arg0 != 16373) {
            field2215 = null;
        }
        if (arg1 == 1) {
            this.field2216 = arg2.method1471(255);
        } else if (arg1 == 2) {
            this.field2220 = arg2.method1478(-32053);
        } else if (arg1 == 5) {
            this.field2219 = arg2.method1480(105);
            return;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIBI)V")
    public static final void method762(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 <= 4) {
            field2206 = -128;
        }
        field2209++;
        class151 var5 = (class151) class42.field688.method1298(-128, (long) arg0);
        if (var5 == null) {
            var5 = new class151();
            class42.field688.method1300(var5, (long) arg0, -2875);
        }
        if (var5.field2625.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field2625.length; var8++) {
                var7[var8] = var5.field2625[var8];
                var6[var8] = var5.field2626[var8];
            }
            for (int var9 = var5.field2625.length; var9 < arg2; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field2626 = var6;
            var5.field2625 = var7;
        }
        var5.field2625[arg2] = arg4;
        var5.field2626[arg2] = arg1;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)Z")
    public final boolean method763(byte arg0) {
        if (arg0 != 5) {
            this.method759(true, (class226) null);
        }
        field2214++;
        return this.field2216 == 115;
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)V")
    public static void method764(byte arg0) {
        field2210 = null;
        field2218 = null;
        field2212 = null;
        int var1 = 101 % ((arg0 - 36) / 33);
        field2215 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIILfh;JZ)V")
    public static final void method765(int arg0, int arg1, int arg2, int arg3, class180 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class133 var8 = new class133();
        var8.field2304 = arg4;
        var8.field2311 = arg1 * 128 + 64;
        var8.field2307 = arg2 * 128 + 64;
        var8.field2313 = arg3;
        var8.field2312 = arg5;
        if (class261.field4539[arg0][arg1][arg2] == null) {
            class261.field4539[arg0][arg1][arg2] = new class108(arg0, arg1, arg2);
        }
        class261.field4539[arg0][arg1][arg2].field2039 = var8;
    }
}
