import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class20 extends class329 {

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field304 = 0;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "[J")
    public static long[] field305 = new long[100];

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "Ljava/lang/String;")
    public String field308;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "Ljava/lang/String;")
    public String field313;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Lrn;", line = 4)
    public final class37 method198(byte arg0) {
        field309++;
        return arg0 == -34 ? class132.field2265[this.field5237] : (class37) null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZILwi;IIZ)V", line = 17)
    public static final void method199(boolean arg0, int arg1, class285 arg2, int arg3, int arg4, boolean arg5) {
        field310++;
        if (class131.field2256 >= 50 || arg2 == null || arg2.field4535 == null || arg2.field4535.length <= arg4 || arg2.field4535[arg4] == null) {
            return;
        }
        int var6 = arg2.field4535[arg4][0];
        int var7 = var6 >> 8;
        if (arg2.field4535[arg4].length > 1) {
            int var8 = (int) (Math.random() * (double) arg2.field4535[arg4].length);
            if (var8 > 0) {
                var7 = arg2.field4535[arg4][var8];
            }
        }
        int var9 = var6 & 0x1F;
        int var10 = (var6 & 0xF1) >> 5;
        if (var9 == 0) {
            if (arg0) {
                class286.method1956(255, 0, var7, 0, var10);
            }
        } else if (class29.field393 != 0 && arg5) {
            int var11 = (arg1 - 64) / 128;
            class123.field2135[class131.field2256] = var7;
            class4.field62[class131.field2256] = var10;
            class271.field4320[class131.field2256] = 0;
            int var12 = (arg3 - 64) / 128;
            class133.field2272[class131.field2256] = null;
            class170.field2941[class131.field2256] = 255;
            class329.field5241[class131.field2256] = (var12 << 16) + (var11 << 8) + var9;
            class131.field2256++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V", line = 76)
    public static final void method200(int arg0) {
        field311++;
        if (!class179.field3027) {
            return;
        }
        int var1 = 0 % ((arg0 + 53) / 35);
        class137 var2 = class60.method557(class230.field3839, 98, class17.field281);
        if (var2 != null && var2.field2429 != null) {
            class258 var3 = new class258();
            var3.field4173 = var2.field2429;
            var3.field4168 = var2;
            class179.method1376(var3, false);
        }
        class179.field3027 = false;
        class321.field5075 = -1;
        class258.method1793(var2, 0);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)V", line = 111)
    public static void method201(boolean arg0) {
        if (arg0) {
            method199(false, 10, (class285) null, -88, 51, true);
        }
        field305 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)I", line = 126)
    public static final int method202(int arg0, byte arg1) {
        if (arg1 <= 93) {
            return 94;
        }
        field312++;
        if (arg0 <= 0) {
            return arg0 < 0 ? -1 : 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)V", line = 147)
    public static final void method203(int arg0, int arg1, int arg2) {
        field307++;
        class30 var3 = class99.method857((byte) 116, arg0, 5);
        if (arg2 == 28) {
            var3.method277(true);
            var3.field438 = arg1;
        }
    }
}
