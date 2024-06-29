import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class140 {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Lre;")
    public static class266 field2335 = new class266();

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Z")
    public static boolean field2337 = false;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLsb;Lsb;)V")
    public static final void method1042(byte arg0, class124 arg1, class124 arg2) {
        class279.field4423 = arg2;
        if (arg0 != -101) {
            method1043(73, -10, -35, -87, 15);
        }
        class28.field489 = arg1;
        field2334++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1043(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class273.field4367 * arg3 + class237.field3744 * arg0 >> 16;
        int var6 = class237.field3744 * arg3 - class273.field4367 * arg0 >> 16;
        int var7 = class119.field2004 * arg1 + class100.field1518 * var6 >> 16;
        int var8 = class100.field1518 * arg1 - class119.field2004 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class119.field2004 * arg2 + class100.field1518 * var6 >> 16;
        int var12 = class100.field1518 * arg2 - class119.field2004 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class19.field302 && var13 < class19.field302) {
            return false;
        } else if (var9 > class161.field2625 && var13 > class161.field2625) {
            return false;
        } else if (var10 < class144.field2381 && var14 < class144.field2381) {
            return false;
        } else {
            return var10 <= class234.field3706 || var14 <= class234.field3706;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZ)Lgj;")
    public static final class38 method1044(int arg0, boolean arg1) {
        class38 var2 = (class38) class23.field350.method1155((long) arg0, arg1);
        field2338++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class293.field4658.method900(32, arg0, false);
        class38 var4 = new class38();
        if (var3 != null) {
            var4.method315(new class136(var3), -31523);
        }
        var4.method318((byte) -87);
        class23.field350.method1161(var4, (byte) -118, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)I")
    public static int method1045(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method1046(int arg0) {
        if (arg0 != -5236) {
            method1046(-8);
        }
        field2335 = null;
    }
}
