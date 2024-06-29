import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class227 extends class130 {

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "Lae;")
    public class267 field3856;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field3859 = 0;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "Z")
    public static boolean field3866 = false;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "Lke;")
    public static class106 field3865 = new class106();

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "[[[B")
    public static byte[][][] field3858;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method1640(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3860++;
        class299 var5 = class158.method1135(arg1, -94, 8);
        var5.method2091(11);
        var5.field5157 = arg4;
        var5.field5153 = arg0;
        var5.field5152 = arg2;
        int var6 = -78 / ((2 - arg3) / 32);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBIIILja;II)V", line = 27)
    public static final void method1641(int arg0, byte arg1, int arg2, int arg3, int arg4, class60 arg5, int arg6, int arg7) {
        field3863++;
        if (class304.field5207) {
            class7.field174 = 32;
        } else {
            class7.field174 = 0;
        }
        if (arg1 <= 98) {
            field3859 = -85;
        }
        class304.field5207 = false;
        if (class260.field4472 != 0) {
            if (arg6 <= arg4 && arg6 + 16 > arg4 && arg0 <= arg2 && arg0 + 16 > arg2) {
                arg5.field1022 -= 4;
                class190.method1342(arg5, 0);
            } else if (arg4 >= arg6 && arg4 < (arg6 + 16) && arg2 >= (arg0 + arg3 - 16) && (arg0 + arg3) > arg2) {
                arg5.field1022 += 4;
                class190.method1342(arg5, 0);
            } else if (arg4 >= (arg6 - class7.field174) && arg4 < (class7.field174 + arg6 + 16) && (arg0 + 16) <= arg2 && arg2 < arg3 + arg0 - 16) {
                int var8 = (arg3 - 32) * arg3 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - (var8 / 2) - arg0 - 16;
                int var10 = arg3 - var8 - 32;
                arg5.field1022 = (arg7 - arg3) * var9 / var10;
                class190.method1342(arg5, 0);
                class304.field5207 = true;
            }
        }
        if (class266.field4570 == 0) {
            return;
        }
        int var11 = arg5.field1163;
        if (arg6 - var11 <= arg4 && arg0 <= arg2 && arg4 < arg6 + 16 && arg2 <= arg0 + arg3) {
            arg5.field1022 += class266.field4570 * 45;
            class190.method1342(arg5, 0);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V", line = 95)
    public static final void method1642(int arg0, int arg1, int arg2) {
        field3861++;
        class106 var3 = class274.field4712[class20.field364][arg1][arg2];
        if (var3 == null) {
            class109.method797(class20.field364, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class258 var5 = (class258) var3.method778(arg0 ^ arg0);
        class258 var6 = null;
        while (var5 != null) {
            class92 var7 = class132.method949(var5.field4459.field2742, false);
            int var8 = var7.field1721;
            if (var7.field1704 == 1) {
                var8 = (var5.field4459.field2740 + 1) * var8;
            }
            if (var4 < var8) {
                var6 = var5;
                var4 = var8;
            }
            var5 = (class258) var3.method775(26517);
        }
        if (var6 == null) {
            class109.method797(class20.field364, arg1, arg2);
            return;
        }
        var3.method782(var6, 22774);
        class258 var9 = (class258) var3.method778(0);
        class155 var10 = null;
        class155 var11 = null;
        while (var9 != null) {
            class155 var12 = var9.field4459;
            if (var6.field4459.field2742 != var12.field2742) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field2742 != var12.field2742 && var11 == null) {
                    var11 = var12;
                }
            }
            var9 = (class258) var3.method775(26517);
        }
        long var13 = (long) ((arg2 << 7) + arg1 + 1610612736);
        class188.method1326(class20.field364, arg1, arg2, class15.method169(arg2 * 128 + 64, 13257, class20.field364, arg1 * 128 + 64), var6.field4459, var13, var10, var11);
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V", line = 170)
    public static void method1643(int arg0) {
        field3858 = (byte[][][]) null;
        if (arg0 != -2) {
            method1645(-2, 28);
        }
        field3865 = null;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V", line = 181)
    public static final void method1644(byte arg0) {
        class135.field2392.method1187(0);
        if (arg0 == 64) {
            field3862++;
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lae;)V", line = 192)
    public class227(class267 arg0) {
        this.field3856 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Lqa;", line = 206)
    public static final class122 method1645(int arg0, int arg1) {
        class122 var2 = (class122) class111.field2047.method329((long) arg1, (byte) -63);
        field3864++;
        if (arg0 != 16) {
            method1643(51);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class268.field4625.method1580(0, arg1, 11);
        class122 var4 = new class122();
        if (var3 != null) {
            var4.method862(true, new class13(var3));
        }
        class111.field2047.method331((long) arg1, var4, (byte) 90);
        return var4;
    }
}
