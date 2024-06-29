import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class310 extends class113 {

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field4180 = 100;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "Lqk;")
    public static class146 field4186 = null;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "Laq;")
    public class310 field4181;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "Laq;")
    public class310 field4188;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "Lla;")
    public static class423 field4183;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field4182++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg3 - arg4;
        int var12 = arg5 - arg4;
        int var13 = arg3 * arg3;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        if (arg6 < 38) {
            method1927(56, null);
        }
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class193.field2839[arg1];
        class518.method3153(arg0 - var11, -arg3 + arg0, var39, -7, arg7);
        class518.method3153(arg0 + var11, -var11 + arg0, var39, -7, arg2);
        class518.method3153(arg0 + arg3, arg0 + var11, var39, -7, arg7);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var41 = arg1 - var9;
            int var42 = arg1 + var9;
            int var43 = arg0 + var8;
            int var44 = arg0 - var8;
            if (var40) {
                int var45 = arg0 + var10;
                int var46 = arg0 - var10;
                class518.method3153(var46, var44, class193.field2839[var41], -7, arg7);
                class518.method3153(var45, var46, class193.field2839[var41], -7, arg2);
                class518.method3153(var43, var45, class193.field2839[var41], -7, arg7);
                class518.method3153(var46, var44, class193.field2839[var42], -7, arg7);
                class518.method3153(var45, var46, class193.field2839[var42], -7, arg2);
                class518.method3153(var43, var45, class193.field2839[var42], -7, arg7);
            } else {
                class518.method3153(var43, var44, class193.field2839[var41], -7, arg7);
                class518.method3153(var43, var44, class193.field2839[var42], -7, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I[B)Ltd;")
    public static final class515 method1927(int arg0, byte[] arg1) {
        field4185++;
        if (arg1 == null) {
            throw new RuntimeException("");
        } else if (arg0 == -1) {
            while (true) {
                try {
                    Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                    MediaTracker var3 = new MediaTracker(class660.field9437);
                    var3.addImage(var2, 0);
                    var3.waitForAll();
                    int var4 = var2.getWidth(class660.field9437);
                    int var5 = var2.getHeight(class660.field9437);
                    if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                        int[] var6 = new int[var4 * var5];
                        PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                        var7.grabPixels();
                        return class211.field3164.method3265(var6, var5, var4, var4, 0, (byte) 50);
                    }
                    throw new RuntimeException("");
                } catch (InterruptedException var8) {
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static void method1928(int arg0) {
        field4183 = null;
        field4186 = null;
        if (arg0 != -1) {
            field4180 = -99;
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
    public final void method1929(int arg0) {
        if (arg0 != 0) {
            this.field4181 = null;
        }
        field4187++;
        if (this.field4181 != null) {
            this.field4181.field4188 = this.field4188;
            this.field4188.field4181 = this.field4181;
            this.field4181 = null;
            this.field4188 = null;
        }
    }
}
