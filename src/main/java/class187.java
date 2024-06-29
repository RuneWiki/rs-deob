import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class187 extends class349 {

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    private int field2285 = 0;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    private int field2286 = 1;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    private int field2292 = 0;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "Lcb;")
    public static class318 field2290 = new class318(101, 0);

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "Z")
    public static boolean field2296 = false;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "Z")
    public static boolean field2297 = false;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "Z")
    public static boolean field2295;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field2289;
        int var3 = 23 % ((arg0 - 56) / 41);
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int var5 = class54.field709[arg1];
            int var6 = var5 + -2048 >> 1;
            for (int var7 = 0; ~class39.field497 < ~var7; ++var7) {
                int var8 = class29.field283[var7];
                int var9 = var8 + -2048 >> 1;
                int var10;
                if (this.field2292 == 0) {
                    var10 = (var8 - var5) * this.field2286;
                } else {
                    int var11 = var9 * var9 - -(var6 * var6) >> 12;
                    int var12 = (int) (4096.0D * Math.sqrt((double) ((float) var11 / 4096.0F)));
                    var10 = (int) ((double) (this.field2286 * var12) * 3.141592653589793D);
                }
                int var13 = var10 - (-4096 & var10);
                if (this.field2285 != 0) {
                    if (~this.field2285 == -3) {
                        var13 -= 2048;
                        if (~var13 > -1) {
                            var13 = -var13;
                        }
                        var13 = 2048 - var13 << 1;
                    }
                } else {
                    var13 = class339.field4960[(4092 & var13) >> 4] + 4096 >> 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/awt/Canvas;Le;I)Loa;")
    public static final class689 method1197(Canvas arg0, class479 arg1, int arg2) {
        ++field2287;
        return arg2 != 4092 ? null : new class682(arg0, arg1);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZIIZ)I")
    public static final int method1198(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        ++field2291;
        class149 var5 = class255.method1597(arg3, arg1, 27628);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            for (int var7 = arg0; ~var7 > ~var5.field1873.length; ++var7) {
                if (~var5.field1873[var7] <= -1 && var5.field1873[var7] < class237.field3088.field2832) {
                    class660 var8 = class237.field3088.method1349(-1, var5.field1873[var7]);
                    int var9 = var8.method3658(arg2, arg0 ^ -104, class191.field2486.method1256(arg2, arg0 + -3934).field7999);
                    if (arg4) {
                        var6 += var5.field1877[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(B)V")
    public static void method1199(byte arg0) {
        field2290 = null;
        int var1 = -71 / ((arg0 - 8) / 41);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 != 4095) {
            field2297 = false;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field2286 = arg2.method957((byte) -92);
                }
            } else {
                this.field2285 = arg2.method957((byte) -114);
            }
        } else {
            this.field2292 = arg2.method957((byte) -109);
        }
        ++field2293;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
    public final void method11(byte arg0) {
        ++field2288;
        class55.method350(0);
        if (arg0 > -51) {
            field2296 = true;
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class187() {
        super(0, true);
    }
}
