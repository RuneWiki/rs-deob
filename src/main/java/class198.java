import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class198 {

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "Lke;")
    public static class122 field3046;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Laj;B)Ljc;", line = 4)
    public static final class313 method1397(class1 arg0, byte arg1) {
        field3042++;
        if (arg1 > -10) {
            field3044 = -74;
        }
        return new class313(arg0.method41((byte) -66), arg0.method41((byte) -66), arg0.method41((byte) -66), arg0.method41((byte) -66), arg0.method4(true), arg0.method15((byte) -29));
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method1398(boolean arg0) {
        field3041++;
        if (arg0) {
            class1.field59.method2283((byte) 77);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([IIII[J)V", line = 31)
    public static final void method1399(int[] arg0, int arg1, int arg2, int arg3, long[] arg4) {
        if (arg3 < arg2) {
            int var5 = arg3;
            int var6 = (arg3 + arg2) / 2;
            long var7 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var7;
            int var9 = arg0[var6];
            arg0[var6] = arg0[arg2];
            arg0[arg2] = var9;
            for (int var10 = arg3; var10 < arg2; var10++) {
                if (arg4[var10] < ((long) (var10 & 0x1) + var7)) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var5];
                    arg4[var5] = var11;
                    int var13 = arg0[var10];
                    arg0[var10] = arg0[var5];
                    arg0[var5++] = var13;
                }
            }
            arg4[arg2] = arg4[var5];
            arg4[var5] = var7;
            arg0[arg2] = arg0[var5];
            arg0[var5] = var9;
            method1399(arg0, -1, var5 - 1, arg3, arg4);
            method1399(arg0, -1, arg2, var5 + 1, arg4);
        }
        field3040++;
        if (arg1 != -1) {
            field3046 = (class122) null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 85)
    public static void method1400(int arg0) {
        if (arg0 == -29575) {
            field3046 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Llb;", line = 102)
    public static final class225 method1401(int arg0, int arg1) {
        field3045++;
        if (arg0 != 0) {
            method1402(false, (byte) -37);
        }
        class225 var2 = (class225) class151.field2476.method1183((long) arg1, (byte) -125);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class78.field1228.method967(0, arg1, arg0 ^ 0xFF00);
        } else {
            var3 = class83.field1298.method967(0, arg1 & 0x7FFF, arg0 ^ 0xFF00);
        }
        class225 var4 = new class225();
        if (var3 != null) {
            var4.method1644(new class1(var3), (byte) -92);
        }
        if (arg1 >= 32768) {
            var4.method1653((byte) -121);
        }
        class151.field2476.method1182((byte) -73, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V", line = 132)
    public static final void method1402(boolean arg0, byte arg1) {
        if (arg0) {
            if (class168.field2707 != -1) {
                class88.method703((byte) 54, class168.field2707);
            }
            for (class24 var2 = (class24) class158.field2584.method71((byte) -93); var2 != null; var2 = (class24) class158.field2584.method84(1)) {
                class190.method1367(0, true, var2);
            }
            class168.field2707 = -1;
            class158.field2584 = new class3(8);
            class328.method2306(151);
            class168.field2707 = class285.field4451;
            class281.method1978(-1681, false);
            class141.method1082(-14735);
            class268.method1860((byte) -8, class168.field2707);
        }
        class220.field3430 = -1;
        field3043++;
        class10.method153(false, class178.field2832);
        class345.field5363 = new class92();
        if (arg1 != 86) {
            return;
        }
        class345.field5363.field4671 = 3000;
        class345.field5363.field4672 = 3000;
        if (!class162.field2623 && class109.field1773 == 0) {
            class38.method332(class176.field2815, 67);
            class117.method921((byte) 116, 10);
            return;
        }
        if (class73.field1112 == 2) {
            class137.field2239 = class154.field2510 << 7;
            class152.field2498 = class20.field367 << 7;
        } else {
            class258.method1790(-4422);
        }
        if (class162.field2623) {
            class64.method511(false);
        }
        class61.method492((byte) -104);
        class117.method921((byte) 109, 28);
    }
}
