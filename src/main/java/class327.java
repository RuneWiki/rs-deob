import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class327 {

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public int field5112 = -1;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static volatile int field5114 = 0;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field5116 = 0;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "C")
    public static char field5115;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public int field5108;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public int field5109;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public int field5113;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public int field5117;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public int field5118;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public int field5120;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public int field5121;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public int field5122;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public int field5124;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lpk;ZLjava/lang/String;)Lpe;", line = 16)
    public static final class109 method2300(class120 arg0, boolean arg1, String arg2) {
        field5111++;
        int var3 = arg0.method958(112, arg2);
        if (var3 == -1) {
            return new class109(0);
        }
        int[] var4 = arg0.method940(var3, (byte) -60);
        class109 var5 = new class109(var4.length);
        int var6 = 0;
        if (!arg1) {
            return (class109) null;
        }
        while (var6 < var5.field1782) {
            class1 var7 = new class1(arg0.method967(var3, var4[var6], 65280));
            var5.field1775[var6] = var7.method53(32);
            var5.field1776[var6] = var7.method55(4);
            var5.field1780[var6] = var7.method33(false);
            var5.field1781[var6] = var7.method33(false);
            var6++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lpf;Z)V", line = 68)
    public static final void method2301(class92 arg0, boolean arg1) {
        field5119++;
        class71 var2 = (class71) class107.field1754.method79(class106.method851(arg0.field1486, -14), (byte) 0);
        if (arg1) {
            field5116 = 37;
        }
        if (var2 == null) {
            return;
        }
        if (var2.field1089 != null) {
            class181.field2877.method2345(var2.field1089);
            var2.field1089 = null;
        }
        var2.method489(false);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ltk;IIIIIIB)V", line = 91)
    public static final void method2302(class266 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != -2) {
            return;
        }
        field5123++;
        if (class304.field4846) {
            class60.field883 = 32;
        } else {
            class60.field883 = 0;
        }
        class304.field4846 = false;
        if (class129.field2062 != 0) {
            if (arg3 <= arg6 && arg6 < arg3 + 16 && arg2 >= arg4 && (arg4 + 16) > arg2) {
                arg0.field4045 -= 4;
                class280.method1971((byte) 101, arg0);
            } else if (arg3 <= arg6 && arg6 < (arg3 + 16) && arg4 + arg5 - 16 <= arg2 && (arg4 + arg5) > arg2) {
                arg0.field4045 += 4;
                class280.method1971((byte) 101, arg0);
            } else if (arg6 >= arg3 - class60.field883 && class60.field883 + arg3 + 16 > arg6 && arg2 >= (arg4 + 16) && arg2 < arg4 - (16 - arg5)) {
                int var8 = (arg5 - 32) * arg5 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - arg4 - (var8 / 2) - 16;
                int var10 = arg5 - var8 - 32;
                arg0.field4045 = (arg1 - arg5) * var9 / var10;
                class280.method1971((byte) 101, arg0);
                class304.field4846 = true;
            }
        }
        if (class307.field4865 == 0) {
            return;
        }
        int var11 = arg0.field3941;
        if (arg6 >= (arg3 - var11) && arg4 <= arg2 && (arg3 + 16) > arg6 && arg2 <= arg4 + arg5) {
            arg0.field4045 += class307.field4865 * 45;
            class280.method1971((byte) 101, arg0);
        }
    }
}
