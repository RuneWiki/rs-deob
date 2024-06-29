import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class139 extends class197 {

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    private int field2365 = 4;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    private int field2373 = 4;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "[I")
    public static int[] field2364 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field2366 = 0;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "Loh;")
    public static class258 field2374 = class153.method1046("Konfig geladen)3", 117);

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "Loh;")
    private static class258 field2377 = class153.method1046("glow3:", 102);

    @OriginalMember(owner = "client!j", name = "X", descriptor = "Loh;")
    public static class258 field2375 = field2377;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "Loh;")
    public static class258 field2371 = field2377;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Lkl;")
    public static class65 field2368;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)I", line = 6)
    public static int method962(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 17)
    public static void method963(int arg0) {
        field2377 = null;
        field2374 = null;
        field2368 = null;
        field2364 = null;
        field2375 = null;
        field2371 = null;
        if (arg0 < 116) {
            field2375 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 207)
    public class139() {
        super(1, false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)[[I", line = 50)
    public final int[][] method101(int arg0, byte arg1) {
        int var3 = 109 % ((1 - arg1) / 37);
        field2369++;
        int[][] var4 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765) {
            int var5 = class214.field3723 / this.field2373;
            int var6 = class190.field3362 / this.field2365;
            int[][] var7;
            if (var5 <= 0) {
                var7 = this.method1322(0, 0, 0);
            } else {
                int var8 = arg0 % var5;
                var7 = this.method1322(0, class214.field3723 * var8 / var5, 0);
            }
            int[] var9 = var7[1];
            int[] var10 = var7[0];
            int[] var11 = var4[0];
            int[] var12 = var7[2];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; var15 < class190.field3362; var15++) {
                int var16;
                if (var6 <= 0) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var6;
                    var16 = class190.field3362 * var17 / var6;
                }
                var11[var15] = var10[var16];
                var13[var15] = var9[var16];
                var14[var15] = var12[var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILva;I)V", line = 126)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2365 = arg1.method1589(105);
        } else if (arg2 == 1) {
            this.field2373 = arg1.method1589(102);
        }
        field2378++;
        if (arg0 != 7955) {
            field2377 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[I", line = 158)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            field2366 = -29;
        }
        int[] var3 = this.field3456.method2104(arg1, 0);
        field2370++;
        if (this.field3456.field5115) {
            int var4 = class190.field3362 / this.field2365;
            int var5 = class214.field3723 / this.field2373;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1327(0, -123, class214.field3723 * var6 / var5);
            } else {
                var7 = this.method1327(0, -120, 0);
            }
            for (int var8 = 0; var8 < class190.field3362; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class190.field3362 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }
}
