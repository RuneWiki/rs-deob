import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public abstract class class618 extends class487 {

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "Z")
    public boolean field8193 = false;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "S")
    public short field8195;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    public int field8198;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
    public int field8197;

    @OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
    public int field8203;

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "Z")
    public static boolean field8202 = false;

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
    public static int field8206 = 1403;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "I")
    public static int field8201;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "Lbi;")
    public static class449 field8196;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "Ljava/awt/Image;")
    public static Image field8200;

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "[Lxa;")
    public static class468[] field8205;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "([BB)Z")
    public static final boolean method3382(byte[] arg0, byte arg1) {
        field8199++;
        class335 var2 = new class335(arg0);
        int var3 = var2.method2034(255);
        if (var3 != 2) {
            return false;
        }
        if (arg1 < 90) {
            field8202 = false;
        }
        boolean var4 = var2.method2034(255) == 1;
        if (var4) {
            class53.method359(var2, true);
        }
        class236.method1473((byte) -8, var2);
        return true;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)Lwm;")
    public static final class529 method3383(int arg0, int arg1) {
        field8204++;
        class529 var2 = (class529) class549.field7323.method1642(arg0 - 1717, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class666.field9455.method2537(false, arg1, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class529 var4 = class169.method1151(arg0 ^ 0xFFFFFFD8, var3);
            class549.field7323.method1643(var4, 13642, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V")
    public static void method3384(int arg0) {
        field8196 = null;
        if (arg0 > -93) {
            method3384(87);
        }
        field8205 = null;
        field8200 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lag;Z)Z")
    public static final boolean method3385(class641 arg0, boolean arg1) {
        boolean var2 = class467.field6283 == class218.field3099;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method2351(8);
        if (arg0.field8611 < 0 || arg0.field8618 < 0 || arg0.field8622 >= class657.field8966 || arg0.field8610 >= class227.field3196) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field8611; var7 <= arg0.field8622; var7++) {
            for (int var10 = arg0.field8618; var10 <= arg0.field8610; var10++) {
                class24 var11 = class457.method2610(arg0.field8609, var7, var10);
                if (var11 != null) {
                    int var12 = 0;
                    if (var7 > arg0.field8611) {
                        var12++;
                    }
                    if (var7 < arg0.field8622) {
                        var12 += 4;
                    }
                    if (var10 > arg0.field8618) {
                        var12 += 8;
                    }
                    if (var10 < arg0.field8610) {
                        var12 += 2;
                    }
                    class684 var13 = class680.method3798(var12, arg0, 3072);
                    class684 var14 = var11.field409;
                    if (var14 == null) {
                        var11.field409 = var13;
                    } else {
                        while (var14.field9618 != null) {
                            var14 = var14.field9618;
                        }
                        var14.field9618 = var13;
                    }
                    var11.field414 = (byte) (var11.field414 | var12);
                    if (var2 && (class46.field664[var7][var10] & 0xFF000000) != 0) {
                        var3 = class46.field664[var7][var10];
                        var4 = class128.field2144[var7][var10];
                        var5 = class600.field7970[var7][var10];
                    }
                    if (var11.field422 != null && var11.field422.field8195 > var6) {
                        var6 = var11.field422.field8195;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field8611; var8 <= arg0.field8622; var8++) {
                for (int var9 = arg0.field8618; var9 <= arg0.field8610; var9++) {
                    if ((class46.field664[var8][var9] & 0xFF000000) == 0) {
                        class46.field664[var8][var9] = var3;
                        class128.field2144[var8][var9] = var4;
                        class600.field7970[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class677.field9570[class155.field2440++] = arg0;
        }
        if (arg1) {
            arg0.field8616 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(IIIIZZ)V")
    public class618(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field8195 = (short) arg3;
        this.field8198 = arg1;
        this.field8197 = arg2;
        this.field8203 = arg0;
        this.field8193 = arg5;
    }
}
