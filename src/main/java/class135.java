import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class135 extends class12 {

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
    private int field3273;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "[I")
    public int[] field3277;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "[[I")
    public int[][] field3270;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "[Lub;")
    public static class122[] field3260 = new class122[1000];

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field3254 = 0;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "[[B")
    public static byte[][] field3265 = new byte[1000][];

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public static int field3266 = 2301979;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "[B")
    public static byte[] field3267 = new byte[520];

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    public static int field3268 = 7759444;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "Lad;")
    public static class5 field3269 = class88.method674("", -85);

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "Lad;")
    public static class5 field3275 = field3269;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "Lad;")
    public static class5 field3261 = field3269;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Lad;")
    public static class5 field3258 = field3269;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "Lad;")
    public static class5 field3256 = field3269;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lad;")
    public static class5 field3262 = field3269;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "Lad;")
    public static class5 field3272 = field3269;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
    public static int field3274 = 0;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "Lvd;")
    public static class130 field3263;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "[I")
    public static int[] field3259;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)I", line = 16)
    public static final int method1034(int arg0, int arg1, int arg2, int arg3) {
        field3257++;
        int var4 = arg3 / arg1;
        int var5 = arg3 & arg1 - 1;
        int var6 = arg2 / arg1;
        int var7 = arg1 - 1 & arg2;
        int var8 = class4.method26(var6, var4, true);
        int var9 = class4.method26(var6, var4 + 1, true);
        if (arg0 > -34) {
            method1035((byte) -81);
        }
        int var10 = class4.method26(var6 + 1, var4, true);
        int var11 = class4.method26(var6 + 1, var4 + 1, true);
        int var12 = class5.method62(arg1, (byte) 124, var5, var9, var8);
        int var13 = class5.method62(arg1, (byte) -90, var5, var11, var10);
        return class5.method62(arg1, (byte) 127, var7, var13, var12);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V", line = 52)
    public static void method1035(byte arg0) {
        field3263 = null;
        field3275 = null;
        field3261 = null;
        field3265 = null;
        field3262 = null;
        field3256 = null;
        field3258 = null;
        if (arg0 != 49) {
            field3274 = -62;
        }
        field3269 = null;
        field3272 = null;
        field3260 = null;
        field3259 = null;
        field3267 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([BZ)V", line = 103)
    public static final void method1036(byte[] arg0, boolean arg1) {
        class39 var2 = new class39(arg0);
        field3253++;
        var2.field957 = arg0.length - 2;
        class74.field1771 = var2.method343((byte) -6);
        class61.field1504 = new int[class74.field1771];
        class16.field432 = new int[class74.field1771];
        class17.field458 = new byte[class74.field1771][];
        class43.field1095 = new int[class74.field1771];
        class38.field930 = new int[class74.field1771];
        var2.field957 = arg0.length - class74.field1771 * 8 - 7;
        class5.field216 = var2.method343((byte) -6);
        class90.field2112 = var2.method343((byte) -6);
        int var3 = (var2.method330(-30864) & 0xFF) + 1;
        if (arg1) {
            field3261 = null;
        }
        for (int var4 = 0; var4 < class74.field1771; var4++) {
            class61.field1504[var4] = var2.method343((byte) -6);
        }
        for (int var5 = 0; var5 < class74.field1771; var5++) {
            class38.field930[var5] = var2.method343((byte) -6);
        }
        for (int var6 = 0; var6 < class74.field1771; var6++) {
            class16.field432[var6] = var2.method343((byte) -6);
        }
        for (int var7 = 0; var7 < class74.field1771; var7++) {
            class43.field1095[var7] = var2.method343((byte) -6);
        }
        var2.field957 = arg0.length + 3 - var3 * 3 - class74.field1771 * 8 - 7;
        class46.field1198 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class46.field1198[var8] = var2.method342(-4);
            if (class46.field1198[var8] == 0) {
                class46.field1198[var8] = 1;
            }
        }
        var2.field957 = 0;
        for (int var9 = 0; var9 < class74.field1771; var9++) {
            int var10 = class16.field432[var9];
            int var11 = class43.field1095[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class17.field458[var9] = var13;
            int var14 = var2.method330(-30864);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method318(-1);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method318(-1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I[B)V", line = 244)
    public class135(int arg0, byte[] arg1) {
        this.field3271 = arg0;
        class39 var3 = new class39(arg1);
        this.field3273 = var3.method330(-30864);
        this.field3277 = new int[this.field3273];
        this.field3270 = new int[this.field3273][];
        for (int var4 = 0; var4 < this.field3273; var4++) {
            this.field3277[var4] = var3.method330(-30864);
        }
        for (int var5 = 0; var5 < this.field3273; var5++) {
            this.field3270[var5] = new int[var3.method330(-30864)];
        }
        for (int var6 = 0; var6 < this.field3273; var6++) {
            for (int var7 = 0; var7 < this.field3270[var6].length; var7++) {
                this.field3270[var6][var7] = var3.method330(-30864);
            }
        }
    }
}
