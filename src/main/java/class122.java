import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class122 extends class89 {

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    private int field2182 = 4096;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "Z")
    private boolean field2190 = true;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field2185 = 0;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field2184 = 0;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "Lda;")
    private static class275 field2192 = class255.method1672(126, "Starting 3d Library");

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "Lda;")
    public static class275 field2186 = field2192;

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "Z")
    public static boolean field2194 = true;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lne;")
    public static class137 field2193 = new class137(4);

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "Lda;")
    private static class275 field2195 = class255.method1672(121, "Close");

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "Lda;")
    public static class275 field2197 = field2195;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lkb;")
    public static class259 field2191;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V")
    public static void method889(int arg0) {
        field2197 = null;
        if (arg0 != -9721) {
            field2186 = null;
        }
        field2193 = null;
        field2186 = null;
        field2191 = null;
        field2195 = null;
        field2192 = null;
    }

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)Lkb;")
    public static final class259 method890(int arg0) {
        int var1 = class32.field480[0] * class152.field2662[0];
        ++field2187;
        byte[] var2 = class67.field1101[0];
        int[] var3 = new int[var1];
        if (arg0 != 1340077356) {
            method891(47, false);
        }
        for (int var4 = 0; ~var4 > ~var1; ++var4) {
            var3[var4] = class270.field4695[class19.method98(var2[var4], 255)];
        }
        class259 var5 = new class259(class267.field4646, class250.field4419, class114.field2010[0], class246.field4357[0], class152.field2662[0], class32.field480[0], var3);
        class134.method978(126);
        return var5;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        if (!arg0) {
            this.method49(-99, (class85) null, 125);
        }
        ++field2183;
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (super.field1512.field2007) {
            int[] var4 = this.method645(74, 0, class277.field4837 & arg1 + -1);
            int[] var5 = this.method645(41, 0, arg1);
            int[] var6 = this.method645(76, 0, class277.field4837 & arg1 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class65.field1070; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2182;
                int var12 = (var5[class1.field11 & var10 + 1] + -var5[class1.field11 & var10 + -1]) * this.field2182;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                }
                if (this.field2190) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class122() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IZ)Z")
    public static final boolean method891(int arg0, boolean arg1) {
        if (arg1) {
            method889(77);
        }
        ++field2189;
        return (1 & arg0 >> 31) != 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field2190 = arg1.method564((byte) 114) == 1;
            }
        } else {
            this.field2182 = arg1.method608(14);
        }
        ++field2196;
        if (arg0 != -20503) {
            this.method21(false, -10);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(III)I")
    public static final int method892(int arg0, int arg1, int arg2) {
        if (arg1 != 25171) {
            return -41;
        } else {
            ++field2188;
            class248 var3 = (class248) class118.field2125.method1871(0, (long) arg2);
            if (var3 == null) {
                return -1;
            } else {
                return ~arg0 <= -1 && ~arg0 > ~var3.field4372.length ? var3.field4372[arg0] : -1;
            }
        }
    }
}
