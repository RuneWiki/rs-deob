import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class63 extends class251 {

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "[B")
    public byte[] field1049;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field1047 = 0;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "Loe;")
    public static class127 field1046 = new class127(75, -1);

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lbe;IIILwn;BILjava/lang/String;Ltq;Lpm;II)V")
    public static final void method438(class28 arg0, int arg1, int arg2, int arg3, class488 arg4, byte arg5, int arg6, String arg7, class427 arg8, class396 arg9, int arg10, int arg11) {
        field1050++;
        int var12;
        if (class408.field5928 == 4) {
            var12 = (int) class23.field289 & 0x3FFF;
        } else {
            var12 = (int) class23.field289 + class273.field4145 & 0x3FFF;
        }
        int var13 = Math.max(arg8.field6175 / 2, arg8.field6126 / 2) + 10;
        int var14 = arg3 * arg3 + arg10 * arg10;
        if ((var13 * var13) < var14) {
            return;
        }
        int var15 = class195.field3075[var12];
        int var16 = class195.field3077[var12];
        if (class408.field5928 != 4) {
            var15 = var15 * 256 / (class222.field3427 + 256);
            var16 = var16 * 256 / (class222.field3427 + 256);
        }
        int var17 = arg3 * var15 + (arg10 * var16) >> 15;
        if (arg5 != -65) {
            method439(-81);
        }
        int var18 = arg3 * var16 - (arg10 * var15) >> 15;
        int var19 = arg9.method2346(true, null, arg7, 100);
        int var20 = var17 - var19 / 2;
        int var21 = arg9.method2354(100, null, 256, 0, arg7);
        if (-arg8.field6175 <= var20 && var20 <= arg8.field6175 && (-arg8.field6126) <= var18 && arg8.field6126 >= var18) {
            arg4.method2940(0, arg1, arg6, null, 0, var19, 50, arg8.field6126 / 2 + arg6 - var18 - (arg11 + var21), 0, arg7, arg2, 1, 0, arg0, null, arg8.field6175 / 2 + (var20 + arg2));
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "([B)V")
    public class63(byte[] arg0) {
        this.field1049 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
    public static void method439(int arg0) {
        if (arg0 != 1645682511) {
            field1047 = -88;
        }
        field1046 = null;
    }
}
