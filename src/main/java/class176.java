import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class176 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "[I")
    public static int[] field3177 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lbf;")
    public static class199 field3180 = new class199(64);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "J")
    public static long field3181;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Lrg;")
    public static class226 field3183;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Lpk;")
    public static class99 field3184;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZIIILgi;II)V")
    public static final void method1258(boolean arg0, int arg1, int arg2, int arg3, class155 arg4, int arg5, int arg6) {
        long var7 = 0L;
        field3178++;
        if (arg5 == 0) {
            var7 = class20.method116(arg1, arg2, arg3);
        } else if (arg5 == 1) {
            var7 = class177.method1263(arg1, arg2, arg3);
        } else if (arg5 == 2) {
            var7 = class59.method433(arg1, arg2, arg3);
        } else if (arg5 == 3) {
            var7 = class237.method1689(arg1, arg2, arg3);
        }
        boolean var9 = true;
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        boolean var12 = false;
        int var13 = ((int) var7 & 0x3900CE) >> 20;
        int var14 = (int) var7 >> 14 & 0x1F;
        if (arg0) {
            return;
        }
        class22 var15 = class33.method251(0, var10);
        if (var15.method134(arg0)) {
            class132.method923(arg3, -96, arg2, arg1, var15);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg5 == 0) {
            class127.method893(arg1, arg2, arg3);
            if (var15.field393 != 0) {
                arg4.method1123(var14, (byte) 127, var15.field388, arg2, arg3, var13);
                return;
            }
        } else if (arg5 == 1) {
            class241.method1706(arg1, arg2, arg3);
        } else if (arg5 == 2) {
            class68.method493(arg1, arg2, arg3);
            if (var15.field393 != 0 && var15.field392 + arg2 < 104 && var15.field392 + arg3 < 104 && (arg2 + var15.field414) < 104 && var15.field414 + arg3 < 104) {
                arg4.method1121(var13, var15.field392, arg3, arg2, var15.field414, (byte) -62, var15.field388);
                return;
            }
        } else {
            if (arg5 == 3) {
                class118.method840(arg1, arg2, arg3);
                if (var15.field393 == 1) {
                    arg4.method1132(arg2, -262145, arg3);
                    return;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static final void method1259(byte arg0) {
        if (arg0 != -64) {
            field3177 = null;
        }
        class108.field1917.method1390((byte) 122);
        field3179++;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
    public static void method1260(byte arg0) {
        field3177 = null;
        field3183 = null;
        if (arg0 <= -81) {
            field3184 = null;
            field3180 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)I")
    public static final int method1261(byte arg0) {
        field3182++;
        if (class13.field183) {
            return 0;
        } else if (class212.method1512(-28)) {
            if (arg0 != 86) {
                method1261((byte) 27);
            }
            return class256.field4585 ? 2 : 1;
        } else {
            return 1;
        }
    }
}
