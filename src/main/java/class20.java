import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 {

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    private int field284 = -1;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    private int field282 = 0;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[I")
    public static int[] field279 = new int[25];

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field285 = 0;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "[Z")
    public static boolean[] field286 = new boolean[100];

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Z")
    public static boolean field293 = false;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Loa;")
    public static class96 field283;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static final void method138(int arg0) {
        if (arg0 != 6962) {
            method142(-17);
        }
        field295++;
        class222.field3888 = null;
        class261.field4615 = null;
        class255.field4442 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)V")
    private final void method139(int arg0, byte arg1) {
        field289++;
        double var3 = (double) ((arg0 & 0xFF3548) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var13 = 0.0D;
        if (var7 > var11) {
            var11 = var7;
        }
        int var15 = -66 % ((arg1 + 65) / 56);
        double var16 = (var9 + var11) / 2.0D;
        double var18 = 0.0D;
        if (var9 != var11) {
            if (var16 < 0.5D) {
                var18 = (var11 - var9) / (var9 + var11);
            }
            if (var16 >= 0.5D) {
                var18 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        if ((var16 > 0.5D)) {
            this.field281 = (int) ((1.0D - var16) * var18 * 512.0D);
        } else {
            this.field281 = (int) (var16 * var18 * 512.0D);
        }
        this.field296 = (int) (var16 * 256.0D);
        if (this.field281 < 1) {
            this.field281 = 1;
        }
        this.field280 = (int) (var18 * 256.0D);
        if (this.field280 < 0) {
            this.field280 = 0;
        } else if (this.field280 > 255) {
            this.field280 = 255;
        }
        if (this.field296 < 0) {
            this.field296 = 0;
        } else if (this.field296 > 255) {
            this.field296 = 255;
        }
        double var20 = var13 / 6.0D;
        this.field287 = (int) ((double) this.field281 * var20);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILik;I)V")
    private final void method140(int arg0, int arg1, class247 arg2, int arg3) {
        if (arg0 == 1) {
            this.field282 = arg2.method1691(19388);
            this.method139(this.field282, (byte) -128);
        } else if (arg0 == 2) {
            this.field284 = arg2.method1694((byte) -100);
            if (this.field284 == 65535) {
                this.field284 = -1;
            }
        } else if (arg0 == 3) {
            arg2.method1694((byte) -100);
        }
        if (arg3 != -1) {
            this.field281 = -26;
        }
        field288++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljd;I)Llc;")
    public static final class82 method141(class85 arg0, int arg1) {
        field294++;
        if (arg1 > -37) {
            field279 = null;
        }
        for (class82 var2 = (class82) class125.field2209.method110(64); var2 != null; var2 = (class82) class125.field2209.method117((byte) 51)) {
            if (var2.field1488.method612((byte) 111, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public static void method142(int arg0) {
        int var1 = -31 / ((23 - arg0) / 53);
        field279 = null;
        field286 = null;
        field283 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BILik;)V")
    public final void method143(byte arg0, int arg1, class247 arg2) {
        if (arg0 != 102) {
            return;
        }
        field290++;
        while (true) {
            int var4 = arg2.method1711((byte) -67);
            if (var4 == 0) {
                return;
            }
            this.method140(var4, arg1, arg2, -1);
        }
    }
}
