import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class411 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[I")
    public static int[] field5662 = new int[100];

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field5665 = 0;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lc;")
    public static class436 field5666;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[I")
    public static int[] field5661;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 5)
    public static void method2546(byte arg0) {
        field5661 = null;
        if (arg0 != -113) {
            field5666 = null;
        }
        field5666 = null;
        field5662 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)I", line = 17)
    public static final int method2547(byte arg0, int arg1, int arg2) {
        field5667++;
        if (arg0 != -12) {
            field5662 = null;
        }
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg1 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLbg;Ljava/lang/String;)I", line = 44)
    public static final int method2548(byte arg0, class242 arg1, String arg2) {
        field5664++;
        int var3 = arg1.field3211;
        if (arg0 == 41) {
            byte[] var4 = class349.method2228(arg2, true);
            arg1.method1577(-2, var4.length);
            arg1.field3211 += class146.field1722.method1002(16325, arg1.field3188, var4, arg1.field3211, var4.length, 0);
            return arg1.field3211 - var3;
        } else {
            return -120;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIBI)Lpe;", line = 73)
    public static final class107 method2549(int arg0, int arg1, byte arg2, int arg3) {
        field5663++;
        int var4 = arg0 | arg1 << 8;
        class107 var5 = (class107) class420.field5741.method648(1, (long) var4 << 16);
        int var6 = -33 / ((arg2 - 45) / 48);
        if (var5 != null) {
            return var5;
        }
        byte[] var7 = class108.field1294.method1805(class108.field1294.method1817(120, var4), true);
        if (var7 == null) {
            int var9 = arg3 + 65536 << 8 | arg0;
            class107 var10 = (class107) class420.field5741.method648(1, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class108.field1294.method1805(class108.field1294.method1817(120, var9), true);
            if (var11 == null) {
                int var13 = arg0 | 0xFFFF00;
                class107 var14 = (class107) class420.field5741.method648(1, (long) var13 << 16);
                if (var14 != null) {
                    return var14;
                }
                byte[] var15 = class108.field1294.method1805(class108.field1294.method1817(120, var13), true);
                if (var15 == null) {
                    return null;
                } else if (var15.length <= 1) {
                    return null;
                } else {
                    class107 var16 = class190.method1177(var15, -40);
                    var16.field1277 = arg0;
                    class420.field5741.method643((long) var13 << 16, var16, (byte) 122);
                    return var16;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class107 var12 = class190.method1177(var11, -40);
                var12.field1277 = arg0;
                class420.field5741.method643((long) var9 << 16, var12, (byte) 122);
                return var12;
            }
        } else if (var7.length <= 1) {
            return null;
        } else {
            class107 var8 = class190.method1177(var7, -40);
            var8.field1277 = arg0;
            class420.field5741.method643((long) var4 << 16, var8, (byte) 122);
            return var8;
        }
    }
}
