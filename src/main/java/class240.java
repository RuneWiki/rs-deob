import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class240 {

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "Log;")
    public static class157 field3805 = null;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field3815 = 0;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Lhh;")
    public static class169 field3813 = new class169();

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field3818 = 0;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public static int field3817 = 0;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public int field3808;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public int field3810;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public int field3812;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "Z")
    public static boolean field3809;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)Lbk;", line = 15)
    public static final class126 method1721(byte arg0, int arg1) {
        field3806++;
        class126 var2 = (class126) class106.field1572.method704((byte) 48, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -121) {
            method1723(77, -2, -119);
        }
        class126 var3 = class195.method1437(arg1, class165.field2756, arg0 ^ 0x34, class126.field1969, false);
        if (var3 != null) {
            class106.field1572.method703(var3, (long) arg1, (byte) -105);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 46)
    public static void method1722(byte arg0) {
        field3805 = null;
        field3813 = null;
        if (arg0 != 111) {
            method1723(1, -74, -61);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V", line = 59)
    public static final void method1723(int arg0, int arg1, int arg2) {
        field3814++;
        class169 var3 = class108.field1593[class49.field698][arg2][arg1];
        if (var3 == null) {
            class236.method1707(class49.field698, arg2, arg1);
            return;
        }
        class185 var4 = null;
        int var5 = -99999999;
        for (class185 var6 = (class185) var3.method1240(3); var6 != null; var6 = (class185) var3.method1235(false)) {
            class330 var7 = class285.method2054(var6.field3064.field2020, 0);
            int var8 = var7.field5110;
            if (var7.field5097 == 1) {
                var8 = (var6.field3064.field2021 + 1) * var8;
            }
            if (var5 < var8) {
                var4 = var6;
                var5 = var8;
            }
        }
        if (var4 == null) {
            class236.method1707(class49.field698, arg2, arg1);
            return;
        }
        var3.method1231(-23, var4);
        class129 var9 = null;
        class185 var10 = (class185) var3.method1240(arg0 - 1610612733);
        class129 var11 = null;
        while (var10 != null) {
            class129 var12 = var10.field3064;
            if (var4.field3064.field2020 != var12.field2020) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field2020 != var12.field2020 && var11 == null) {
                    var11 = var12;
                }
            }
            var10 = (class185) var3.method1235(false);
        }
        long var13 = (long) (arg2 + (arg1 << 7) + arg0);
        class29.method167(class49.field698, arg2, arg1, class123.method889(1, class49.field698, arg2 * 128 + 64, arg1 * 128 + 64), var4.field3064, var13, var9, var11);
    }
}
