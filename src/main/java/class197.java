import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class197 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lck;")
    public static class119 field3154 = class298.method1987((byte) 121, "x");

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lck;")
    public static class119 field3160 = class298.method1987((byte) 28, "Stufe)2");

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Lck;")
    public static class119 field3162 = class298.method1987((byte) 49, "::gc");

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lva;")
    public static class36 field3156;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V", line = 11)
    public static final void method1262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3157++;
        int var8 = arg0 + 1;
        class36.method282(arg3, arg4, arg2, class256.field4113[arg0], 26175);
        int var9 = arg5 - 1;
        class36.method282(arg3, arg4, arg2, class256.field4113[arg5], 26175);
        int var6 = var8;
        if (arg1 != 13697) {
            return;
        }
        while (var6 <= var9) {
            int[] var7 = class256.field4113[var6];
            var7[arg4] = var7[arg3] = arg2;
            var6++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[B", line = 35)
    public static final synchronized byte[] method1263(int arg0, int arg1) {
        field3159++;
        if (arg0 != -20909) {
            return (byte[]) null;
        } else if (arg1 == 100 && class3.field52 > 0) {
            byte[] var2 = class173.field2757[--class3.field52];
            class173.field2757[class3.field52] = null;
            return var2;
        } else if (arg1 == 5000 && class244.field3956 > 0) {
            byte[] var3 = class20.field290[--class244.field3956];
            class20.field290[class244.field3956] = null;
            return var3;
        } else if (arg1 == 30000 && class88.field1349 > 0) {
            byte[] var4 = class36.field545[--class88.field1349];
            class36.field545[class88.field1349] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)I", line = 74)
    public static final int method1264(int arg0, int arg1, int arg2, int arg3) {
        field3158++;
        if (arg0 >= -89) {
            method1266((byte) 6);
        }
        return arg2 <= arg1 ? (arg3 >= arg1 ? arg1 : arg3) : arg2;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)Lli;", line = 95)
    public static final class86 method1265(int arg0, int arg1) {
        class86 var2 = (class86) class111.field1701.method524((byte) 118, (long) arg0);
        field3161++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class63.field1002.method261(-1, 11, arg0);
        if (arg1 <= 8) {
            return (class86) null;
        }
        class86 var4 = new class86();
        if (var3 != null) {
            var4.method573(new class3(var3), true);
        }
        class111.field1701.method527((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 120)
    public static void method1266(byte arg0) {
        field3160 = null;
        field3154 = null;
        field3156 = null;
        int var1 = -6 % ((arg0 - 36) / 47);
        field3162 = null;
    }
}
