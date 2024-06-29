import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 {

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1287 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lmd;")
    public static class87 field1283;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Z")
    public static boolean field1289;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)V")
    public static final void method450(long arg0, int arg1) {
        field1288++;
        int var3 = -53 % ((arg1 - 34) / 49);
        if (arg0 != 0L) {
            class14.field268++;
            class15.field304.method867(66, true);
            class15.field304.method990(arg0, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lba;")
    public static final class9 method451(int arg0, int arg1) {
        field1286++;
        class9 var2 = (class9) class9.field165.method1162((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class47.field1077.method669(0, arg0, -109);
        if (var3 == null) {
            return null;
        }
        class9 var4 = new class9();
        class127 var5 = new class127(var3);
        var5.field2995 = var5.field2960.length + arg1;
        int var6 = var5.method986(-104);
        var4.field159 = var5.method1020(false);
        int var7 = 0;
        var4.field160 = var5.method1020(false);
        var4.field154 = var5.method1020(false);
        var4.field151 = var5.method1020(false);
        var5.field2995 = 0;
        var4.field162 = var5.method1008((byte) -87);
        var4.field158 = new int[var6];
        var4.field149 = new int[var6];
        var4.field157 = new class136[var6];
        while (var5.field2995 < var5.field2960.length - 12) {
            int var8 = var5.method1020(false);
            if (var8 == 3) {
                var4.field157[var7] = var5.method1010(-14330);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field158[var7] = var5.method1011(126);
            } else {
                var4.field158[var7] = var5.method986(42);
            }
            var4.field149[var7++] = var8;
        }
        class9.field165.method1164((long) arg0, var4, (byte) 127);
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static void method452(boolean arg0) {
        if (arg0) {
            method455(-23, 54, -56, 74);
        }
        field1283 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZ)V")
    public static final void method453(int arg0, int arg1, boolean arg2) {
        field1285++;
        if (class147.field3400 != 0 && arg0 != -1) {
            class120.method937(arg0, false, class147.field3400, class28.field625, 0, 1);
            class47.field1078 = true;
        }
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILmd;I)Lnb;")
    public static final class92 method454(int arg0, int arg1, class87 arg2, int arg3) {
        field1290++;
        int var4 = 5 / ((-arg0 - 43) / 52);
        return class78.method565(arg2, arg3, -123, arg1) ? class13.method89((byte) 105) : null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)I")
    public static final int method455(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field1284++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            if (arg2 != 5097) {
                field1289 = false;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method456(int arg0) {
        field1282++;
        for (class43 var1 = (class43) class71.field1492.method512(0); var1 != null; var1 = (class43) class71.field1492.method520((byte) 43)) {
            if (var1.field984 != null) {
                var1.method349((byte) 24);
            }
        }
        if (arg0 != -20633) {
            field1289 = false;
        }
    }
}
