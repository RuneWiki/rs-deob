import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class478 implements class121 {

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "Lpe;")
    private class615 field6393;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "Ljava/lang/String;")
    private String field6383;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "J")
    public static long field6384 = 0L;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "[Ljq;")
    public static class348[] field6386 = new class348[14];

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "Z")
    public static boolean field6390 = false;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII[B[BIIZ)V", line = 3)
    public static final void method2649(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, boolean arg8) {
        field6387++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg8) {
            method2651(-98);
        }
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg4[var10001] = (byte) (arg4[var10001] - arg5[arg0++]);
                int var14 = arg6++;
                arg4[var14] = (byte) (arg4[var14] - arg5[arg0++]);
                int var15 = arg6++;
                arg4[var15] = (byte) (arg4[var15] - arg5[arg0++]);
                int var16 = arg6++;
                arg4[var16] = (byte) (arg4[var16] - arg5[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg4[var10001] = (byte) (arg4[var10001] - arg5[arg0++]);
            }
            arg6 += arg1;
            arg0 += arg2;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)Lev;", line = 50)
    public final class144 method900(int arg0) {
        if (arg0 <= 1) {
            method2651(-17);
        }
        field6391++;
        return class144.field1887;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ltc;BLtc;)V", line = 66)
    public static final void method2650(class477 arg0, byte arg1, class477 arg2) {
        field6389++;
        class279.field3650++;
        class11 var3 = class130.method931(class649.field9035, (byte) 54, class275.field3614);
        var3.field114.method2353(arg2.field6234, (byte) -123);
        var3.field114.method2386(arg0.field6221, 1103587288);
        var3.field114.method2414(false, arg0.field6321);
        var3.field114.method2395(arg2.field6221, (byte) -23);
        int var4 = -36 / ((-arg1 - 11) / 33);
        var3.field114.method2389(arg0.field6234, (byte) 124);
        var3.field114.method2395(arg2.field6321, (byte) 127);
        class100.method760(var3, 3);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V", line = 85)
    public static void method2651(int arg0) {
        field6386 = null;
        int var1 = -53 / ((-arg0 - 46) / 50);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)I", line = 95)
    public final int method901(boolean arg0) {
        field6388++;
        if (arg0) {
            return -125;
        } else if (this.field6393.method3370(this.field6383, -2)) {
            return 100;
        } else {
            return this.field6393.method3347((byte) -31, this.field6383);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)Z", line = 110)
    public static final boolean method2652(int arg0, int arg1) {
        if (arg0 <= 106) {
            field6384 = -2L;
        }
        field6385++;
        if (arg1 == 45 || arg1 == 25 || arg1 == 10 || arg1 == 8 || arg1 == 13) {
            return true;
        } else {
            return arg1 == 22 || arg1 == 1001;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z", line = 138)
    public static final boolean method2653(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field6390 = true;
        }
        field6392++;
        return (arg1 & 0x70000) != 0 | class607.method3300(arg1, arg0, 52) || class559.method2992((byte) -84, arg1, arg0);
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lpe;Ljava/lang/String;)V", line = 153)
    public class478(class615 arg0, String arg1) {
        this.field6393 = arg0;
        this.field6383 = arg1;
    }
}
