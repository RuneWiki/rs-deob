import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class214 {

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "[Z")
    public boolean[] field3272 = new boolean[256];

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public int field3269 = 0;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "[I")
    public int[] field3280 = new int[6];

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "[B")
    public byte[] field3283 = new byte[18002];

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "[[I")
    public int[][] field3278 = new int[6][258];

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "[[B")
    public byte[][] field3289 = new byte[6][258];

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "[B")
    public byte[] field3292 = new byte[4096];

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "[I")
    public int[] field3285 = new int[257];

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "[B")
    public byte[] field3287 = new byte[18002];

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "[I")
    public int[] field3300 = new int[16];

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public int field3297 = 0;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "[[I")
    public int[][] field3281 = new int[6][258];

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "[I")
    public int[] field3290 = new int[256];

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "[Z")
    public boolean[] field3301 = new boolean[16];

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[B")
    public byte[] field3264 = new byte[256];

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "[[I")
    public int[][] field3270 = new int[6][258];

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3267 = 0;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field3279 = -1;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3275 = "Cancel";

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field3282 = 0;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field3276 = 0;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3265 = "Please remove ";

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "B")
    public byte field3263;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public int field3266;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public int field3268;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public int field3294;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    public int field3296;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "Ljava/awt/Image;")
    public static Image field3299;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "[B")
    public byte[] field3288;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "[B")
    public byte[] field3293;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)Lbk;", line = 8)
    public static final class172 method1455(byte arg0, int arg1) {
        if (arg0 != -6) {
            field3282 = 72;
        }
        class172 var2 = (class172) class111.field1645.method652((long) arg1, false);
        field3302++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class305.field4992.method1504(class182.method1265((byte) -12, arg1), true, class170.method1176(arg1, false));
        class172 var4 = new class172();
        var4.field2676 = arg1;
        if (var3 != null) {
            var4.method1188(new class313(var3), (byte) 27);
        }
        class111.field1645.method642(var4, (long) arg1, -123);
        return var4;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 65)
    public static void method1456(int arg0) {
        field3299 = null;
        field3265 = null;
        if (arg0 >= -57) {
            field3275 = (String) null;
        }
        field3275 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIII)Loj;", line = 105)
    public static final class174 method1457(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3277++;
        long var5 = (long) arg4 & 0xFFFFL << 48 | ((long) arg2 & 0xFFFFL) << 32 | (long) arg3 & 0xFFFFL << 16 | (long) arg0 & 0xFFFFL;
        class174 var7 = (class174) class347.field5559.method652(var5, false);
        if (var7 != null) {
            return var7;
        }
        int var8 = 14 % ((-arg1 - 37) / 50);
        class134[] var9 = null;
        class40 var10 = class290.method2053(arg0, 53);
        if (var10.field607 != null) {
            var9 = new class134[var10.field607.length];
            for (int var11 = 0; var11 < var9.length; var11++) {
                class24 var12 = class177.method1244(var10.field607[var11], (byte) -2);
                var9[var11] = new class134(var12.field354, var12.field362, var12.field363, var12.field359, var12.field356, var12.field365, var12.field355, var12.field364);
            }
        }
        class174 var13 = new class174(var10.field606, var9, var10.field612, arg4, arg2, arg3);
        class347.field5559.method642(var13, var5, -85);
        return var13;
    }
}
