import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class143 extends class386 {

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "Lhw;")
    public static class208 field1932 = new class208(new byte[5000]);

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
    public static int field1934 = 1;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "Lo;")
    public static class139 field1929;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILoq;III)V")
    public static final void method864(int arg0, class156 arg1, int arg2, int arg3, int arg4) {
        field1931++;
        class407 var5 = (class407) class541.field7904.method2123(77);
        if (arg0 != -469715737) {
            return;
        }
        while (var5 != null) {
            if (var5.field6159 == arg2 && (arg3 << 7) == var5.field6155 && arg4 << 7 == var5.field6160 && var5.field6157.field2082 == arg1.field2082) {
                if (var5.field6148 != null) {
                    class411.field6231.method482(var5.field6148);
                    var5.field6148 = null;
                }
                if (var5.field6144 != null) {
                    class411.field6231.method482(var5.field6144);
                    var5.field6144 = null;
                }
                var5.method3149(arg0 + 469715831);
                return;
            }
            var5 = (class407) class541.field7904.method2126((byte) 61);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
    public static void method865(byte arg0) {
        field1932 = null;
        int var1 = 4 % ((64 - arg0) / 37);
        field1929 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IBIIII)I")
    public static final int method866(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1933++;
        if (arg1 < 2) {
            return -78;
        } else if (class53.field732 == null) {
            return 0;
        } else {
            if (arg4 < 3) {
                int var6 = arg5 >> 7;
                int var7 = arg2 >> 7;
                if (arg0 < 0 || arg3 < 0 || arg0 > class135.field1839 - 1 || arg3 > class197.field3038 - 1) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || var6 > (class135.field1839 - 1) || var7 > (class197.field3038 - 1)) {
                    return 0;
                }
                boolean var8 = (class416.field6309[1][arg5 >> 7][arg2 >> 7] & 0x2) != 0;
                if ((arg5 & 0x7F) == 0) {
                    boolean var9 = (class416.field6309[1][var6 - 1][arg2 >> 7] & 0x2) != 0;
                    boolean var10 = (class416.field6309[1][var6][arg2 >> 7] & 0x2) != 0;
                    if (var9 != var10) {
                        var8 = (class416.field6309[1][arg0][arg3] & 0x2) != 0;
                    }
                }
                if ((arg2 & 0x7F) == 0) {
                    boolean var11 = (class416.field6309[1][arg5 >> 7][var7 - 1] & 0x2) != 0;
                    boolean var12 = (class416.field6309[1][arg5 >> 7][var7] & 0x2) != 0;
                    if (var11 != var12) {
                        var8 = (class416.field6309[1][arg0][arg3] & 0x2) != 0;
                    }
                }
                if (var8) {
                    arg4++;
                }
            }
            return class53.field732[arg4].method692(arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)V")
    public static final void method867(int arg0, int arg1) {
        field1930++;
        if (arg0 <= -20) {
            class456 var2 = class233.method1654(arg1, 9, -112);
            var2.method2862(0);
        }
    }
}
