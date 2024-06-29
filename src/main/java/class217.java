import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class217 {

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "[Z")
    public boolean[] field3271 = new boolean[256];

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "[Z")
    public boolean[] field3278 = new boolean[16];

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "[[I")
    public int[][] field3281 = new int[6][258];

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "[B")
    public byte[] field3291 = new byte[18002];

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    public int field3290 = 0;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "[[I")
    public int[][] field3283 = new int[6][258];

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "[B")
    public byte[] field3300 = new byte[4096];

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "[B")
    public byte[] field3296 = new byte[18002];

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "[I")
    public int[] field3301 = new int[6];

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public int field3294 = 0;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "[I")
    public int[] field3303 = new int[16];

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "[I")
    public int[] field3307 = new int[257];

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "[[I")
    public int[][] field3308 = new int[6][258];

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "[B")
    public byte[] field3284 = new byte[256];

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "[I")
    public int[] field3305 = new int[256];

    @OriginalMember(owner = "client!dn", name = "P", descriptor = "[[B")
    public byte[][] field3310 = new byte[6][258];

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field3293 = -1;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field3297 = 0;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public static int field3289 = 0;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "Lom;")
    public static class156 field3302 = new class156();

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "B")
    public byte field3306;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public int field3276;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public int field3285;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    public int field3292;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "Llm;")
    public static class210 field3287;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "Lqb;")
    public static class89 field3299;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "[B")
    public byte[] field3270;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "[B")
    public byte[] field3288;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 48)
    public static final void method1492(byte arg0) {
        if (arg0 != -28) {
            method1495((byte[]) null, -107, -108, 118, (String) null, (byte) 79);
        }
        field3282++;
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class84.field1251 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 119)
    public static final void method1493(int arg0) {
        field3286++;
        class154.field2317.method2182(false);
        class311.field4732.method2182(false);
        int var1 = 40 % ((arg0 + 24) / 50);
        class184.field2757.method2182(false);
        class94.field1412.method2182(false);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)V", line = 133)
    public static void method1494(byte arg0) {
        field3299 = null;
        int var1 = 64 / ((-arg0 - 15) / 55);
        field3287 = null;
        field3302 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "([BIIILjava/lang/String;B)I", line = 159)
    public static final int method1495(byte[] arg0, int arg1, int arg2, int arg3, String arg4, byte arg5) {
        field3275++;
        int var6 = arg3 - arg1;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg2 + var7] = -97;
            } else {
                arg0[arg2 + var7] = 63;
            }
        }
        if (arg5 > -69) {
            field3297 = -82;
        }
        return var6;
    }
}
