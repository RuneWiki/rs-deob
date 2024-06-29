import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class108 {

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "Lam;")
    public static class286 field1330;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 14)
    public static final void method570(int arg0) {
        field1328++;
        if (class115.field1434) {
            return;
        }
        class77.method432(95, class234.field3225);
        if (class341.field4571 != null) {
            class77.method432(-17, class341.field4571);
        }
        if (arg0 != -22106) {
            method572((byte) 5, -19);
        }
        class115.field1434 = true;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIBIIII)I", line = 39)
    public static final int method571(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if (arg2 >= -54) {
            method570(-55);
        }
        field1329++;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 8 - arg5 - arg1;
        } else {
            return 7 + 1 - arg6 - arg0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)Lml;", line = 71)
    public static final class451 method572(byte arg0, int arg1) {
        field1321++;
        class451 var2 = (class451) class256.field3500.method222((long) arg1, arg0 ^ 0x20D7);
        if (arg0 != -2) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class211.field2868.method1687(0, arg1, 255);
            if (var3 == null || var3.length <= 1) {
                return null;
            } else {
                class451 var4 = class182.method969(var3, arg0 + 25742);
                class256.field3500.method218((long) arg1, (byte) -127, var4);
                return var4;
            }
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIIIIZIZ)Z", line = 96)
    public static final boolean method573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, boolean arg10) {
        field1324++;
        if (!arg8) {
            field1330 = null;
        }
        int var11 = class376.method2258(arg0, class288.field3923, arg6, arg7, class36.field352[class263.field3592], arg4, arg9, arg10, arg1, arg3, 58, class427.field6264.method857((byte) -106), arg2, arg5, class8.field74);
        if (var11 < 1) {
            return false;
        }
        class324.field4321 = class8.field74[var11 - 1];
        class149.field1894 = class288.field3923[var11 - 1];
        class6.field52 = false;
        class200.method1075(9);
        return true;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V", line = 116)
    public static void method574(int arg0) {
        field1330 = null;
        if (arg0 != -1) {
            field1330 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIII)V", line = 129)
    public static final void method575(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class274.field3694; var5++) {
            Rectangle var6 = class128.field1651[var5];
            if ((var6.x + var6.width) > arg4 && var6.x < arg0 + arg4 && arg2 < var6.y + var6.height && var6.y < (arg1 + arg2)) {
                class405.field5895[var5] = true;
            }
        }
        field1322++;
        if (arg3 != 10636) {
            field1330 = null;
        }
    }
}
