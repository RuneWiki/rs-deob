import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class122 extends class435 {

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1989 = null;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "Z")
    public static boolean field1988 = false;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public static void method981(int arg0) {
        if (arg0 != -15337) {
            method983(29, 28);
        }
        field1989 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method982(boolean arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            class637.field9048 = class98.method761((byte) -117, 0, class450.field6495, class126.field2061, class525.field7713.field5969 * 2, class703.field9939);
            if (arg2 != null) {
                class637.field9048.method118(0);
                class490 var3 = class128.method1014(class399.field5771, -1, 0, class51.field678);
                class395 var4 = class637.field9048.method804(var3, class628.method3544(class468.field6754, class51.field678, 0), true);
                class461.method2680(true);
                class194.method1361(class637.field9048, (byte) -12, true, var3, var4, arg2);
            }
        } else {
            class98 var5 = null;
            if (arg2 != null) {
                var5 = class98.method761((byte) -117, 0, class450.field6495, class126.field2061, 0, class703.field9939);
                var5.method118(0);
                class490 var6 = class128.method1014(class399.field5771, -1, 0, class51.field678);
                class395 var7 = var5.method804(var6, class628.method3544(class468.field6754, class51.field678, 0), true);
                class461.method2680(true);
                class194.method1361(var5, (byte) -12, true, var6, var7, arg2);
            }
            try {
                class637.field9048 = class98.method761((byte) -117, arg1, class450.field6495, class126.field2061, class525.field7713.field5969 * 2, class703.field9939);
                if (arg2 != null) {
                    var5.method118(0);
                    class490 var8 = class128.method1014(class399.field5771, -1, 0, class51.field678);
                    class395 var9 = var5.method804(var8, class628.method3544(class468.field6754, class51.field678, 0), true);
                    class461.method2680(!arg0);
                    class194.method1361(var5, (byte) -12, true, var8, var9, arg2);
                }
                if (class637.field9048.method798()) {
                    boolean var10 = true;
                    try {
                        var10 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var13) {
                    }
                    class698 var11;
                    if (var10) {
                        var11 = class637.field9048.method783(146800640);
                    } else {
                        var11 = class637.field9048.method783(104857600);
                    }
                    class637.field9048.method822(var11);
                }
            } catch (Throwable var14) {
                arg1 = 0;
                class637.field9048 = class98.method761((byte) -117, 0, class450.field6495, class126.field2061, 0, class703.field9939);
            }
            if (var5 != null) {
                try {
                    var5.method753(1);
                } catch (Throwable var12) {
                }
            }
        }
        field1986++;
        class76.field1182 = arg1;
        class440.method2571((byte) -96);
        class637.field9048.method781(32);
        class410.field5865 = class637.field9048.method812();
        class70.field1103 = class637.field9048.method812();
        class47.method370(0);
        class637.field9048.method793(!class525.field7713.field5980);
        if (class637.field9048.method739()) {
            class677.method3829((byte) -128, class525.field7713.field5964);
        }
        class611.method3464(class580.field8504 >> 3, class430.field6136 >> 3, class637.field9048, true);
        class403.method2433(-99);
        class438.field6302 = true;
        class622.field8855 = arg0;
        class332.field4625 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I")
    public static final int method983(int arg0, int arg1) {
        field1987++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= ~arg0) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V")
    public class122(int arg0, int arg1) {
        this.field1991 = arg1;
        this.field1990 = arg0;
    }
}
