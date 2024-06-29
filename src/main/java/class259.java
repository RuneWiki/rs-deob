import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class259 {

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lle;")
    private class200 field3759 = new class200();

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Ljv;")
    public static class55 field3762 = new class55(4);

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Liv;")
    public static class64 field3765 = new class64(34, 6);

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "Liv;")
    public static class64 field3767 = new class64(83, 3);

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3769 = null;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "F")
    public static float field3770;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "Lle;")
    private class200 field3766;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lle;")
    public final class200 method1671(int arg0) {
        field3760++;
        class200 var2 = this.field3766;
        if (this.field3759 == var2) {
            this.field3766 = null;
            return null;
        }
        if (arg0 != -10033) {
            this.field3759 = null;
        }
        this.field3766 = var2.field2928;
        return var2;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BIIII)V")
    public static final void method1672(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 34) {
            method1675((byte) 37, null);
        }
        for (int var5 = 0; var5 < class100.field1650; var5++) {
            Rectangle var6 = class362.field5483[var5];
            if (arg3 < (var6.x + var6.width) && var6.x < (arg3 + arg4) && arg2 < (var6.y + var6.height) && (arg2 + arg1) > var6.y) {
                class467.field6966[var5] = true;
            }
        }
        field3763++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lle;I)V")
    public final void method1673(class200 arg0, int arg1) {
        if (arg1 != 4304) {
            return;
        }
        if (arg0.field2923 != null) {
            arg0.method1382(7218);
        }
        field3758++;
        arg0.field2923 = this.field3759.field2923;
        arg0.field2928 = this.field3759;
        arg0.field2923.field2928 = arg0;
        arg0.field2928.field2923 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Lle;")
    public final class200 method1674(byte arg0) {
        field3761++;
        class200 var2 = this.field3759.field2928;
        if (this.field3759 == var2) {
            return null;
        }
        if (arg0 >= -45) {
            this.method1679(-119);
        }
        var2.method1382(7218);
        return var2;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method1675(byte arg0, String arg1) {
        if (arg0 != 4) {
            method1672((byte) 52, 75, 30, -23, -49);
        }
        field3754++;
        return class318.method2070(10, arg1, true, -27169);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
    public static final int method1676(int arg0, int arg1) {
        field3757++;
        double var2 = (double) ((arg1 & 0xFFECEE) >> 16) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < arg0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + (var21 >> 5 << 7) + ((var20 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
    public final void method1677(int arg0) {
        field3764++;
        if (arg0 != 489772293) {
            return;
        }
        while (true) {
            class200 var2 = this.field3759.field2928;
            if (this.field3759 == var2) {
                this.field3766 = null;
                return;
            }
            var2.method1382(7218);
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)I")
    public final int method1678(int arg0) {
        field3756++;
        int var2 = 0;
        class200 var3 = this.field3759.field2928;
        if (arg0 != -8081) {
            this.method1679(-106);
        }
        while (this.field3759 != var3) {
            var2++;
            var3 = var3.field2928;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)Lle;")
    public final class200 method1679(int arg0) {
        field3755++;
        class200 var2 = this.field3759.field2928;
        if (this.field3759 == var2) {
            this.field3766 = null;
            return null;
        }
        if (arg0 != 255) {
            method1676(-89, 12);
        }
        this.field3766 = var2.field2928;
        return var2;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public static void method1680(byte arg0) {
        field3765 = null;
        field3769 = null;
        field3767 = null;
        field3762 = null;
        if (arg0 >= -53) {
            method1675((byte) -80, null);
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class259() {
        this.field3759.field2928 = this.field3759;
        this.field3759.field2923 = this.field3759;
    }
}
