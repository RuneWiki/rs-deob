import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class214 extends class53 implements class133 {

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field2751 = 0;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "[I")
    public static int[] field2749 = new int[250];

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "[S")
    public static short[] field2752 = new short[256];

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Z")
    public final boolean method703(int arg0, int arg1, int arg2) {
        field2755++;
        if (arg1 == 11360) {
            super.method292(false, arg0);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljaclib/memory/Source;IBI)Z")
    public final boolean method704(Source arg0, int arg1, byte arg2, int arg3) {
        int var5 = -3 / ((74 - arg2) / 40);
        field2757++;
        super.method294(35040, arg1, arg0);
        return true;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Z")
    public final boolean method290(int arg0) {
        if (arg0 != 22526) {
            method1393(null, -90, 0.45156726F, -92, 62, 0.64668804F, 82, null, (byte) -116, -0.63756585F, -0.1903501F, -93, 0.0423278F);
        }
        field2754++;
        return this.method290(22526);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public static void method1390(int arg0) {
        if (arg0 < 7) {
            method1393(null, -22, -0.19598567F, -58, -126, 0.29670912F, 5, null, (byte) -70, 0.20584972F, 0.31219417F, -115, 0.14333409F);
        }
        field2752 = null;
        field2749 = null;
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V")
    public static final void method1391(int arg0) {
        field2759++;
        class163.field2072.method3472((byte) -128);
        if (arg0 != -18053) {
            field2752 = null;
        }
        class464.field6599.method3472((byte) -128);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILcl;IIII)V")
    public static final void method1392(int arg0, class72 arg1, int arg2, int arg3, int arg4, int arg5) {
        field2753++;
        if (arg1.field999 == -1 && arg1.field982 == null) {
            return;
        }
        int var6 = 0;
        if (arg1.field1001 < arg3) {
            var6 += arg3 - arg1.field1001;
        } else if (arg1.field980 > arg3) {
            var6 += arg1.field980 - arg3;
        }
        int var7 = class501.field6954.field7838 * arg1.field994 >> 8;
        if (arg0 > arg1.field988) {
            var6 += arg0 - arg1.field988;
        } else if (arg1.field992 > arg0) {
            var6 += arg1.field992 - arg0;
        }
        if (arg1.field975 == 0 || arg1.field975 < (var6 - 256) || class501.field6954.field7838 == 0 || arg1.field983 != arg5) {
            if (arg1.field993 != null) {
                class92.field1224.method250(arg1.field993);
                arg1.field993 = null;
            }
            if (arg1.field996 != null) {
                class92.field1224.method250(arg1.field996);
                arg1.field996 = null;
            }
            return;
        }
        var6 -= 256;
        if (arg4 != 5183) {
            field2751 = 78;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg1.field975 - var6) * var7 / arg1.field975;
        if (arg1.field993 != null) {
            arg1.field993.method1354(var8);
        } else if (arg1.field999 >= 0) {
            class490 var9 = class490.method2753(class35.field547, arg1.field999, 0);
            if (var9 != null) {
                class300 var10 = var9.method2756().method1836(class90.field1220);
                class213 var11 = class213.method1358(var10, 100, var8);
                var11.method1353(-1);
                class92.field1224.method257(var11);
                arg1.field993 = var11;
            }
        }
        if (arg1.field996 != null) {
            arg1.field996.method1354(var8);
            if (arg1.field996.method591(arg4 - 5077)) {
                return;
            }
            arg1.field996 = null;
        } else if (arg1.field982 != null && (arg1.field979 -= arg2) <= 0) {
            int var12 = (int) (Math.random() * (double) arg1.field982.length);
            class490 var13 = class490.method2753(class35.field547, arg1.field982[var12], 0);
            if (var13 != null) {
                class300 var14 = var13.method2756().method1836(class90.field1220);
                class213 var15 = class213.method1358(var14, 100, var8);
                var15.method1353(0);
                class92.field1224.method257(var15);
                arg1.field979 = (int) (Math.random() * (double) (arg1.field998 - arg1.field976)) + arg1.field976;
                arg1.field996 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public final void method296(byte arg0) {
        super.method296(arg0);
        field2750++;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lph;Z)V")
    public class214(class442 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lj;IFIIFI[BBFFIF)V")
    public static final void method1393(class323 arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, byte[] arg7, byte arg8, float arg9, float arg10, int arg11, float arg12) {
        for (int var13 = 0; var13 < arg4; var13++) {
            class236.method1488(var13, arg2, arg7, arg9, arg5, true, arg3, arg0, arg1, arg10, arg4, arg6, arg12, arg11);
            arg3 += arg6 * arg11;
        }
        field2756++;
        if (arg8 != 12) {
            method1391(-3);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method297(byte arg0, boolean arg1) {
        if (arg0 != 52) {
            method1390(24);
        }
        field2758++;
        return super.method297((byte) 52, arg1);
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)I")
    public final int method288(int arg0) {
        if (arg0 != 7224) {
            field2752 = null;
        }
        field2748++;
        return super.method288(7224);
    }
}
