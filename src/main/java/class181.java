import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class181 {

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Ler;")
    private class157 field2579 = new class157(128);

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "Lns;")
    private class438 field2581;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Z")
    public static boolean field2577 = false;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field2575 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lcm;")
    public static class449 field2576 = new class449(36, 3);

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Z")
    public static boolean field2582 = false;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "[I")
    public static int[] field2583 = new int[13];

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)Lnv;", line = 4)
    public final class488 method1295(int arg0, boolean arg1) {
        field2574++;
        class157 var3 = this.field2579;
        class488 var4;
        synchronized (this.field2579) {
            var4 = (class488) this.field2579.method1013((long) arg0, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2581.method2650(class203.method1413(arg0, (byte) -128), -94, class8.method71((byte) -86, arg0));
        class488 var6 = new class488();
        if (var5 != null) {
            var6.method2904(false, new class91(var5));
        }
        class157 var7 = this.field2579;
        synchronized (this.field2579) {
            if (arg1) {
                method1296(-94);
            }
            this.field2579.method1012(-97, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 35)
    public static final void method1296(int arg0) {
        if (arg0 == -1) {
            field2573++;
            class223.field3118.method1015((byte) 108);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)Z", line = 48)
    public static final boolean method1297(int arg0, byte arg1, int arg2) {
        field2580++;
        if ((class172.method1208(arg2, arg0, -6118) | (arg2 & 0x10000) != 0) || class379.method2347(arg2, arg0, -16)) {
            return true;
        } else {
            if (arg1 <= 73) {
                method1297(-76, (byte) 122, 17);
            }
            return (arg0 & 0x37) == 0 && class170.method1196(arg2, 45056, arg0);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 81)
    public static void method1298(int arg0) {
        field2576 = null;
        if (arg0 < 100) {
            method1296(-86);
        }
        field2583 = null;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lgo;ILns;)V", line = 138)
    public class181(class331 arg0, int arg1, class438 arg2) {
        this.field2581 = arg2;
        if (this.field2581 != null) {
            int var4 = this.field2581.method2649(47) - 1;
            this.field2581.method2645(1, var4);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II[BIIBI[BI)V", line = 95)
    public static final void method1299(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5, int arg6, byte[] arg7, int arg8) {
        field2578++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        if (arg5 > -62) {
            return;
        }
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg2[var10001] = (byte) (arg2[var10001] - arg7[arg4++]);
                int var14 = arg0++;
                arg2[var14] = (byte) (arg2[var14] - arg7[arg4++]);
                int var15 = arg0++;
                arg2[var15] = (byte) (arg2[var15] - arg7[arg4++]);
                int var16 = arg0++;
                arg2[var16] = (byte) (arg2[var16] - arg7[arg4++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg2[var10001] = (byte) (arg2[var10001] - arg7[arg4++]);
            }
            arg4 += arg8;
            arg0 += arg1;
        }
    }
}
