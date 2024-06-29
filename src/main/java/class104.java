import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public abstract class class104 {

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "Lhda;")
    public static class752 field1432 = new class752(55, 3);

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "Lhda;")
    public static class752 field1433 = new class752(8, 6);

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V")
    public abstract void method769(byte arg0);

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIII)V")
    public static final void method770(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class411.field5711.field3899.method2432(true) * arg3 >> 8;
        field1431++;
        if (arg0 == -1 && !class122.field1996) {
            class80.method631(1);
        } else if (arg0 != -1 && (class453.field6192 != arg0 || !class438.method2521(-105)) && var4 != 0 && !class122.field1996) {
            class224.method1429(arg0, 0, arg1, class165.field2501, false, var4, -114);
            class390.method2314(false);
        }
        if (class453.field6192 != arg0) {
            class637.field8466 = null;
        }
        class453.field6192 = arg0;
        if (arg2 >= -83) {
            field1433 = null;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)Z")
    public final boolean method771(int arg0) {
        if (arg0 > -127) {
            this.method771(33);
        }
        field1434++;
        return this.method777((byte) 102) || this.method776(false) || this.method774(false);
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)I")
    public abstract int method772(int arg0);

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(B)Lqg;")
    public abstract class466 method773(byte arg0);

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z)Z")
    public abstract boolean method774(boolean arg0);

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "(I)V")
    public static void method775(int arg0) {
        field1433 = null;
        field1432 = null;
        if (arg0 != 3161) {
            method779(90, -65, false, null, null);
        }
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(Z)Z")
    public abstract boolean method776(boolean arg0);

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "(B)Z")
    public abstract boolean method777(byte arg0);

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)V")
    public abstract void method778(int arg0);

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIZ[I[Ljava/lang/Object;)V")
    public static final void method779(int arg0, int arg1, boolean arg2, int[] arg3, Object[] arg4) {
        if (arg1 < arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg0; var10++) {
                if (arg3[var10] < ((var10 & var9) + var7)) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method779(var6 - 1, arg1, true, arg3, arg4);
            method779(arg0, var6 + 1, arg2, arg3, arg4);
        }
        field1430++;
        if (!arg2) {
            method775(-59);
        }
    }

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "(B)I")
    public abstract int method780(byte arg0);
}
