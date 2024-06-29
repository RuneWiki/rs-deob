import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class188 {

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "[Z")
    public boolean[] field3223 = new boolean[256];

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "[I")
    public int[] field3222 = new int[257];

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "[[I")
    public int[][] field3225 = new int[6][258];

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "[B")
    public byte[] field3220 = new byte[256];

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public int field3237 = 0;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "[I")
    public int[] field3231 = new int[256];

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "[I")
    public int[] field3236 = new int[16];

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "[B")
    public byte[] field3245 = new byte[18002];

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "[[B")
    public byte[][] field3247 = new byte[6][258];

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "[B")
    public byte[] field3219 = new byte[4096];

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public int field3246 = 0;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "[I")
    public int[] field3249 = new int[6];

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "[B")
    public byte[] field3234 = new byte[18002];

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[[I")
    public int[][] field3224 = new int[6][258];

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "[Z")
    public boolean[] field3244 = new boolean[16];

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "[[I")
    public int[][] field3248 = new int[6][258];

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Lda;")
    public static class275 field3233 = class255.method1672(121, "null");

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field3252 = -1;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field3254 = 0;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "B")
    public byte field3226;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public int field3217;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public int field3221;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public int field3241;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public int field3242;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public int field3250;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "Lma;")
    public static class105 field3251;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "[B")
    public byte[] field3228;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "[B")
    public byte[] field3243;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "[I")
    public static int[] field3255;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZLma;Lma;)V")
    public static final void method1243(boolean arg0, class105 arg1, class105 arg2) {
        class5.field73 = class255.method1673(arg2, arg0, 0, class262.field4553, arg1);
        field3216++;
        class35.field578 = (class260) class5.field73;
        class99.field1666 = class255.method1673(arg2, true, 0, class87.field1470, arg1);
        class93.field1599 = class255.method1673(arg2, arg0, 0, class227.field3838, arg1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBIIIZ)Lwb;")
    public static final class179 method1244(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3239++;
        if (arg1 > -120) {
            field3251 = null;
        }
        int var7 = (arg4 << 17) + arg0 + (arg5 ? 65536 : 0) + (arg3 << 19);
        long var8 = (long) arg2 * 3147483667L + (long) var7 * 3849834839L;
        class179 var10 = (class179) class104.field1732.method990(var8, (byte) -116);
        if (var10 != null) {
            return var10;
        }
        class223.field3775 = false;
        class179 var11 = class267.method1756(arg3, arg4, arg0, arg2, false, arg5, -103, false);
        if (var11 != null && !class223.field3775) {
            class104.field1732.method986(0, var8, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1245(int arg0) {
        field3233 = null;
        if (arg0 != 0) {
            field3255 = null;
        }
        field3255 = null;
        field3251 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lwc;")
    public static final class73 method1246(int arg0, int arg1) {
        field3240++;
        class73 var2 = (class73) class225.field3823.method990((long) arg0, (byte) -5);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 6) {
            method1246(20, -91);
        }
        byte[] var3 = class210.field3553.method775(class232.method1511(arg0, (byte) 92), class99.method709(arg0, (byte) 108), -24799);
        class73 var4 = new class73();
        var4.field1197 = arg0;
        if (var3 != null) {
            var4.method475(true, new class85(var3));
        }
        class225.field3823.method986(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lda;I)V")
    public static final void method1247(class275 arg0, int arg1) {
        field3238++;
        if (class74.field1224 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method1833(0);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class74.field1224.length && class74.field1224[var2].field1707 != var3) {
            var2++;
        }
        if (class74.field1224.length <= var2 || class74.field1224[var2] == null) {
            return;
        }
        class149.field2597.method526((byte) -103, 123);
        if (arg1 != -1) {
            field3233 = null;
        }
        class34.field552++;
        class149.field2597.method560(class74.field1224[var2].field1707, -123);
    }
}
