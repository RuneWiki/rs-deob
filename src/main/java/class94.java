import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class94 {

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "Lil;")
    public static class7 field1233 = new class7();

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "Lni;")
    public static class522 field1236;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIZII)V")
    public static final void method649(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1234++;
        class252 var5 = class150.method916(arg0, -40, 10);
        if (!arg2) {
            field1236 = null;
        }
        var5.method1502((byte) -103);
        var5.field3247 = arg3;
        var5.field3251 = arg1;
        var5.field3250 = arg4;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIII[BZI[BI)V")
    public static final void method650(int arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5, int arg6, byte[] arg7, int arg8) {
        if (arg5) {
            return;
        }
        field1235++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg4[var10001] = (byte) (arg4[var10001] - arg7[arg6++]);
                int var14 = arg8++;
                arg4[var14] = (byte) (arg4[var14] - arg7[arg6++]);
                int var15 = arg8++;
                arg4[var15] = (byte) (arg4[var15] - arg7[arg6++]);
                int var16 = arg8++;
                arg4[var16] = (byte) (arg4[var16] - arg7[arg6++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg4[var10001] = (byte) (arg4[var10001] - arg7[arg6++]);
            }
            arg6 += arg2;
            arg8 += arg1;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZIIII)Lhr;")
    public static final class526 method651(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1232++;
        class526 var5 = new class526();
        var5.field7064 = arg4;
        var5.field7062 = arg2;
        if (arg1 >= -125) {
            return null;
        }
        class520.field6994.method2558(var5, (long) arg3, -1);
        class401.method2320(arg2, -12889);
        class218 var6 = class357.method2056(arg3, -9820);
        if (var6 != null) {
            class277.method1652(1, var6);
        }
        if (class414.field5851 != null) {
            class277.method1652(1, class414.field5851);
            class414.field5851 = null;
        }
        class339.method2000(44);
        if (var6 != null) {
            class676.method3845(var6, !arg0, (byte) 66);
        }
        if (!arg0) {
            class498.method2786(arg2);
        }
        if (!arg0 && class116.field1543 != -1) {
            class522.method2904(1, class116.field1543, -121);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLcm;)I")
    public static final int method652(byte arg0, class729 arg1) {
        field1231++;
        if (arg0 != 115) {
            return -85;
        } else if (class55.field558 == arg1) {
            return 9216;
        } else if (class686.field9624 == arg1) {
            return 34065;
        } else if (class514.field6953 == arg1) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
    public static void method653(int arg0) {
        field1233 = null;
        field1236 = null;
        if (arg0 != -1443) {
            method651(true, -27, 83, -34, -122);
        }
    }
}
