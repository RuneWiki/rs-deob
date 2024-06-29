import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class class21 {

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "[I")
    public static int[] field565 = new int[32768];

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field567 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field564 = 0;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lkh;")
    public static class117 field569 = class224.method1450((byte) 125, ":clanreq:");

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method182(int arg0) {
        field569 = null;
        field565 = null;
        if (arg0 > -126) {
            method184(null, -27, 116, true, 46, -22, -26, -76, null, -22);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)V")
    public static final void method183(int arg0, int arg1, byte arg2) {
        field568++;
        class244 var3 = class161.method1144(arg1, (byte) 88);
        int var4 = var3.field4496;
        int var5 = var3.field4500;
        int var6 = var3.field4503;
        int var7 = class72.field1385[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = -56 / ((-arg2 - 43) / 44);
        int var9 = var7 << var5;
        class141.field2561[var4] = class40.method352(class209.method1370(var9, arg0 << var5), class209.method1370(class141.field2561[var4], ~var9));
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([IIIZIIII[BI)V")
    public static final void method184(int[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        field566++;
        int var10 = -(arg1 >> 2);
        int var11 = -(arg1 & 0x3);
        if (!arg3) {
            field567 = -67;
        }
        for (int var12 = -arg4; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg8[arg7++] == 0) {
                    arg9++;
                } else {
                    arg0[arg9++] = arg2;
                }
                if (arg8[arg7++] == 0) {
                    arg9++;
                } else {
                    arg0[arg9++] = arg2;
                }
                if (arg8[arg7++] == 0) {
                    arg9++;
                } else {
                    arg0[arg9++] = arg2;
                }
                if (arg8[arg7++] == 0) {
                    arg9++;
                } else {
                    arg0[arg9++] = arg2;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg8[arg7++] == 0) {
                    arg9++;
                } else {
                    arg0[arg9++] = arg2;
                }
            }
            arg7 += arg5;
            arg9 += arg6;
        }
    }
}
