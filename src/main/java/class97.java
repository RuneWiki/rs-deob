import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class97 {

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field1596 = 0;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Lmh;")
    public static class62 field1594 = class201.method1405(true, "M");

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "[Z")
    public static boolean[] field1601 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "[I")
    public static int[] field1597 = new int[1000];

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "Lmh;")
    public static class62 field1602 = class201.method1405(true, "leuchten3:");

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lwi;")
    public static class242 field1595;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method781(byte arg0, int arg1) {
        field1599++;
        class151 var2 = class165.method1194((byte) 1, 11, arg1);
        if (arg0 == -58) {
            var2.method1081(128);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 23)
    public static void method782(int arg0) {
        field1601 = null;
        int var1 = 52 % ((-arg0 - 28) / 49);
        field1597 = null;
        field1602 = null;
        field1595 = null;
        field1594 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([Lmh;III[S)V", line = 95)
    public static final void method783(class62[] arg0, int arg1, int arg2, int arg3, short[] arg4) {
        if (arg1 != -1) {
            return;
        }
        field1593++;
        if (arg3 >= arg2) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        int var6 = arg3;
        class62 var7 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var7;
        short var8 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var8;
        for (int var9 = arg3; var9 < arg2; var9++) {
            if (var7 == null || arg0[var9] != null && arg0[var9].method452(arg1 ^ 0xFFFFFFB6, var7) < (var9 & 0x1)) {
                class62 var10 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6] = var10;
                short var11 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6++] = var11;
            }
        }
        arg0[arg2] = arg0[var6];
        arg0[var6] = var7;
        arg4[arg2] = arg4[var6];
        arg4[var6] = var8;
        method783(arg0, -1, var6 - 1, arg3, arg4);
        method783(arg0, -1, arg2, var6 + 1, arg4);
    }
}
