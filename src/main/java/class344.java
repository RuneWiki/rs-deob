import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class344 {

    @OriginalMember(owner = "client!on", name = "d", descriptor = "[C")
    public static char[] field5471 = new char[128];

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field5468 = 0;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "Lvl;")
    public static class164 field5473 = new class164(512);

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lwf;BIIIILml;)V", line = 4)
    public static final void method2423(class250 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class17 arg6) {
        field5474++;
        if (arg6 == null) {
            return;
        }
        int var7;
        if (class112.field1827 == 4) {
            var7 = (int) class261.field4396 & 0x7FF;
        } else {
            var7 = (int) class261.field4396 + class79.field1372 & 0x7FF;
        }
        int var8 = arg3 * arg3 + (arg4 * arg4);
        int var9 = Math.max(arg0.field4081 / 2, arg0.field4157 / 2) + 10;
        if (var8 > var9 * var9 || arg1 > -111) {
            return;
        }
        int var10 = class153.field2438[var7];
        int var11 = class153.field2445[var7];
        if (class112.field1827 != 4) {
            var11 = var11 * 256 / (class4.field41 + 256);
            var10 = var10 * 256 / (class4.field41 + 256);
        }
        int var12 = arg3 * var11 + arg4 * var10 >> 16;
        int var13 = arg4 * var11 - arg3 * var10 >> 16;
        if (class42.field607) {
            ((class58) arg6).method496(arg0.field4081 / 2 + (arg5 - (arg6.field198 / 2 - var12)), arg0.field4157 / 2 + arg2 - arg6.field201 / 2 + -var13, (class58) arg0.method1940((byte) 92, false));
        } else {
            ((class351) arg6).method2479(arg5 + (arg0.field4081 / 2) + var12 - (arg6.field198 / 2), arg0.field4157 / 2 + -(arg6.field201 / 2) + -var13 + arg2, arg0.field4208, arg0.field4188);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BI)I", line = 50)
    public static final int method2424(byte arg0, int arg1) {
        if (arg0 == 93) {
            field5469++;
            return arg1 >> 11 & 0x7F;
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)I", line = 62)
    public static final int method2425(int arg0, byte arg1) {
        int var2 = -124 % ((arg1 - 82) / 34);
        field5470++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V", line = 75)
    public static void method2426(boolean arg0) {
        field5473 = null;
        field5471 = null;
        if (!arg0) {
            method2426(false);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IBLth;I)Lsi;", line = 105)
    public static final class351 method2427(int arg0, byte arg1, class57 arg2, int arg3) {
        field5475++;
        if (class315.method2233(arg0, (byte) 111, arg2, arg3)) {
            int var4 = 41 % ((arg1 - 15) / 34);
            return class186.method1463(0);
        } else {
            return null;
        }
    }
}
