import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class305 extends class29 {

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4758 = "Attack";

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "[C")
    public static char[] field4761 = new char[128];

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "Z")
    public static boolean field4762 = false;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4765 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Lol;")
    private class246 field4751;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "Lkb;")
    public static class39 field4757;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "[I")
    public static int[] field4754;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;IZ)Ljava/lang/String;", line = 8)
    public final String method2129(String arg0, int arg1, boolean arg2) {
        field4763++;
        if (!arg2) {
            return (String) null;
        } else if (this.field4751 == null) {
            return arg0;
        } else {
            class98 var4 = (class98) this.field4751.method1743((long) arg1, (byte) -66);
            return var4 == null ? arg0 : var4.field1490;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(IBI)I", line = 32)
    public final int method2130(int arg0, byte arg1, int arg2) {
        field4756++;
        if (this.field4751 == null) {
            return arg0;
        }
        class310 var4 = (class310) this.field4751.method1743((long) arg2, (byte) -92);
        if (arg1 > -115) {
            field4754 = (int[]) null;
        }
        return var4 == null ? arg0 : var4.field4844;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIILok;Lug;)V", line = 54)
    public static final void method2131(int arg0, int arg1, int arg2, int arg3, int arg4, class160 arg5, class321 arg6) {
        field4752++;
        if (arg6 == null) {
            return;
        }
        int var7 = (int) class312.field4862 + class339.field5253 & 0x7FF;
        int var8 = arg0 * arg0 + arg4 * arg4;
        int var9 = Math.max(arg5.field2458 / 2, arg5.field2590 / 2) + 10;
        if (var9 * var9 < var8) {
            return;
        }
        int var10 = class25.field355[var7];
        int var11 = var10 * 256 / (class313.field4882 + 256);
        int var12 = class25.field359[var7];
        int var13 = var12 * 256 / (class313.field4882 + 256);
        int var14 = arg4 * var13 - arg0 * var11 >> 16;
        int var15 = arg0 * var13 + arg4 * var11 >> 16;
        int var16 = -30 % ((58 - arg2) / 40);
        if (class186.field2991) {
            ((class14) arg6).method83(arg5.field2458 / 2 + var15 + arg3 - (arg6.field5028 / 2), arg5.field2590 / 2 + -var14 + -(arg6.field5027 / 2) + arg1, (class14) arg5.method1100(false, 122));
        } else {
            ((class298) arg6).method2080(arg3 + (arg5.field2458 / 2) - (arg6.field5028 / 2 + -var15), arg5.field2590 / 2 + -var14 + -(arg6.field5027 / 2) + arg1, arg5.field2569, arg5.field2438);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILkb;II)[Lug;", line = 90)
    public static final class321[] method2132(int arg0, class39 arg1, int arg2, int arg3) {
        field4750++;
        if (arg2 == 256) {
            return class288.method2026(arg0, arg3, arg1, -51) ? class40.method277(103) : null;
        } else {
            return (class321[]) null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)Ldg;", line = 106)
    public static final class335 method2133(byte arg0) {
        field4760++;
        if (arg0 != -13) {
            method2132(-100, (class39) null, 25, 31);
        }
        try {
            return (class335) Class.forName("we").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILim;)Ljava/lang/String;", line = 121)
    public static final String method2134(int arg0, class192 arg1) {
        field4766++;
        if (arg0 <= 86) {
            method2132(-107, (class39) null, 94, 93);
        }
        return class313.method2181((byte) -126, 32767, arg1);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZLim;)V", line = 144)
    public final void method2135(boolean arg0, class192 arg1) {
        if (arg0) {
            this.field4751 = (class246) null;
        }
        field4759++;
        while (true) {
            int var3 = arg1.method1399(-1172389784);
            if (var3 == 0) {
                return;
            }
            this.method2137(var3, arg1, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(B)V", line = 164)
    public static void method2136(byte arg0) {
        field4765 = null;
        field4757 = null;
        field4758 = null;
        field4761 = null;
        field4754 = null;
        if (arg0 != -71) {
            field4765 = (Calendar) null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILim;B)V", line = 188)
    private final void method2137(int arg0, class192 arg1, byte arg2) {
        field4755++;
        if (arg0 == 249) {
            int var4 = arg1.method1399(-1172389784);
            if (this.field4751 == null) {
                int var5 = class290.method2032(101, var4);
                this.field4751 = new class246(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method1399(-1172389784) == 1;
                int var8 = arg1.method1378(false);
                class71 var9;
                if (var7) {
                    var9 = new class98(arg1.method1355((byte) 89));
                } else {
                    var9 = new class310(arg1.method1354((byte) -123));
                }
                this.field4751.method1750(var9, (byte) 122, (long) var8);
            }
        }
        int var10 = -43 / ((arg2 - 15) / 53);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lol;Luh;I)Lkd;", line = 237)
    public static final class83 method2138(class246 arg0, class291 arg1, int arg2) {
        field4764++;
        long var3 = ((long) arg1.field4591 << 32) + ((long) arg1.field4589 << 56) + (long) ((arg1.field4586 + 1 << 16) + arg1.field4585);
        if (arg2 != 2) {
            method2136((byte) -57);
        }
        class83 var5 = (class83) arg0.method1743(var3, (byte) -110);
        if (var5 == null) {
            var5 = new class83(arg1.field4586, (float) arg1.field4585, true, false, arg1.field4591);
            arg0.method1750(var5, (byte) 119, var3);
        }
        return var5;
    }
}
