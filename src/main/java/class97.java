import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class97 {

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Llc;")
    public static class143 field1772 = class66.method374("Zugewiesener Speicher)3", -1);

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "[I")
    public static int[] field1775 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lgf;")
    public static class7 field1777;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)[Lfe;")
    public static final class212[] method570(byte arg0) {
        field1771++;
        if (arg0 != -41) {
            field1769 = -30;
        }
        class212[] var1 = new class212[class167.field2986];
        for (int var2 = 0; var2 < class167.field2986; var2++) {
            var1[var2] = new class100(class257.field4628, class70.field1332, class126.field2226[var2], class32.field536[var2], class41.field697[var2], class153.field2766[var2], class282.field4961[var2], class111.field1961);
        }
        class258.method1708(0);
        return var1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Llf;BIIIII)V")
    public static final void method571(class106 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -106) {
            return;
        }
        long var7 = 0L;
        if (arg5 == 0) {
            var7 = class13.method104(arg2, arg6, arg4);
        } else if (arg5 == 1) {
            var7 = class8.method66(arg2, arg6, arg4);
        } else if (arg5 == 2) {
            var7 = class141.method851(arg2, arg6, arg4);
        } else if (arg5 == 3) {
            var7 = class273.method1801(arg2, arg6, arg4);
        }
        field1770++;
        boolean var9 = false;
        int var10 = ((int) var7 & 0x7F47B) >> 14;
        boolean var11 = false;
        boolean var12 = true;
        int var13 = (int) var7 >> 20 & 0x3;
        int var14 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class209 var15 = class34.method232(167, var14);
        if (var15.method1456(true)) {
            class161.method1067((byte) -126, var15, arg2, arg6, arg4);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg5 != 0) {
            if (arg5 == 1) {
                class129.method782(arg2, arg6, arg4);
            } else if (arg5 == 2) {
                class282.method1860(arg2, arg6, arg4);
                if (var15.field3890 != 0 && arg6 + var15.field3877 < 104 && var15.field3877 + arg4 < 104 && var15.field3836 + arg6 < 104 && (var15.field3836 + arg4) < 104) {
                    arg0.method636(var13, (byte) 17, var15.field3895, arg4, var15.field3877, var15.field3836, arg6);
                    return;
                }
                return;
            } else if (arg5 == 3) {
                class264.method1763(arg2, arg6, arg4);
                if (var15.field3890 == 1) {
                    arg0.method642(arg4, arg6, 3900);
                    return;
                }
            }
            return;
        }
        class178.method1170(arg2, arg6, arg4);
        if (var15.field3890 != 0) {
            arg0.method637(var15.field3895, (byte) 97, arg6, arg4, var10, var13);
            return;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static final void method572(boolean arg0) {
        for (int var1 = -1; var1 < class107.field1889; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class30.field467[var1];
            }
            class32 var3 = class6.field97[var2];
            if (var3 != null) {
                class137.method820(29802, var3.method218((byte) -123), var3);
            }
        }
        if (!arg0) {
            field1769 = -111;
        }
        field1776++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method573(int arg0) {
        if (arg0 != 30085) {
            method570((byte) -74);
        }
        field1777 = null;
        field1775 = null;
        field1772 = null;
    }
}
