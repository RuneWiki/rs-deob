import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class87 extends class382 {

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1781 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "[I")
    public static int[] field1784 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "F")
    public static float field1785;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "Lo;")
    public static class24 field1783;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "Lhw;")
    public class87 field1778;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "Lhw;")
    public class87 field1780;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "[[B")
    public static byte[][] field1782;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
    public static void method802(int arg0) {
        field1782 = null;
        field1783 = null;
        if (arg0 >= -79) {
            method802(102);
        }
        field1781 = null;
        field1784 = null;
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V")
    public static final void method803(int arg0) {
        field1777++;
        int var1 = class268.field4063 * 128 + 64;
        int var2 = class239.field3715 * 128 + 64;
        int var3 = class483.method2899(class211.field3371, var1, var2, false) - class195.field3138;
        if (class422.field6356 < 100) {
            if (var1 > class509.field7427) {
                class509.field7427 += (var1 - class509.field7427) * class422.field6356 / 1000 + class309.field4689;
                if (class509.field7427 > var1) {
                    class509.field7427 = var1;
                }
            }
            if (class509.field7427 > var1) {
                class509.field7427 -= (class509.field7427 - var1) * class422.field6356 / 1000 + class309.field4689;
                if (class509.field7427 < var1) {
                    class509.field7427 = var1;
                }
            }
            if (class428.field6406 < var3) {
                class428.field6406 += (var3 - class428.field6406) * class422.field6356 / 1000 + class309.field4689;
                if (var3 < class428.field6406) {
                    class428.field6406 = var3;
                }
            }
            if (class432.field6435 < var2) {
                class432.field6435 += (var2 - class432.field6435) * class422.field6356 / 1000 + class309.field4689;
                if (var2 < class432.field6435) {
                    class432.field6435 = var2;
                }
            }
            if (class428.field6406 > var3) {
                class428.field6406 -= (class428.field6406 - var3) * class422.field6356 / 1000 + class309.field4689;
                if (var3 > class428.field6406) {
                    class428.field6406 = var3;
                }
            }
            if (var2 < class432.field6435) {
                class432.field6435 -= (class432.field6435 - var2) * class422.field6356 / 1000 + class309.field4689;
                if (class432.field6435 < var2) {
                    class432.field6435 = var2;
                }
            }
        } else {
            class509.field7427 = class268.field4063 * 128 + 64;
            class432.field6435 = class239.field3715 * 128 + 64;
            class428.field6406 = class483.method2899(class211.field3371, class509.field7427, class432.field6435, false) - class195.field3138;
        }
        int var4 = class522.field7579 * 128 + 64;
        int var5 = class457.field6778 * 128 + 64;
        int var6 = class483.method2899(class211.field3371, var5, var4, false) - class102.field1944;
        int var7 = var5 - class509.field7427;
        if (arg0 != -26657) {
            method803(-46);
        }
        int var8 = var6 - class428.field6406;
        int var9 = var4 - class432.field6435;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class41.field577 < var11) {
            class41.field577 += (var11 - class41.field577 >> 3) * class471.field6992 / 1000 + class417.field6288 << 3;
            if (var11 < class41.field577) {
                class41.field577 = var11;
            }
        }
        if (var11 < class41.field577) {
            class41.field577 -= (class41.field577 - var11 >> 3) * class471.field6992 / 1000 + class417.field6288 << 3;
            if (class41.field577 < var11) {
                class41.field577 = var11;
            }
        }
        int var13 = var12 - class139.field2325;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class139.field2325 += class417.field6288 + (class471.field6992 * var14 / 1000) << 3;
            class139.field2325 &= 0x3FFF;
        }
        if (var14 < 0) {
            class139.field2325 -= -var14 * class471.field6992 / 1000 + class417.field6288 << 3;
            class139.field2325 &= 0x3FFF;
        }
        int var15 = var12 - class139.field2325;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class139.field2325 = var12;
        }
        class311.field4707 = 0;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)V")
    public final void method804(byte arg0) {
        field1779++;
        if (this.field1780 == null) {
            return;
        }
        this.field1780.field1778 = this.field1778;
        this.field1778.field1780 = this.field1780;
        this.field1778 = null;
        this.field1780 = null;
        int var2 = -67 % ((arg0 - 47) / 54);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIII)V")
    public static final void method805(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1786++;
        if (arg3 != 16777215) {
            return;
        }
        if (arg6 - arg4 >= class467.field6940 && (arg4 + arg6) <= class43.field600 && class372.field5455 <= arg5 - arg4 && (arg4 + arg5) <= class216.field3415) {
            class234.method1539(arg0, arg5, arg6, arg4, arg2, -73, arg1);
        } else {
            class195.method1316(arg6, arg5, arg2, arg0, arg1, arg4, -1);
        }
    }
}
