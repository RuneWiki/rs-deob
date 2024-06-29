import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class419 extends class179 {

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public int field6033;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public int field6032;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Llj;")
    public static class415 field6031;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[Lil;")
    public static class7[] field6034;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 7)
    public static final void method2454(byte arg0) {
        if (class466.field7158 < 0) {
            class466.field7158 = 0;
            class226.field3471 = -1;
            class403.field5863 = -1;
        }
        field6030++;
        if (class492.field7500 < class466.field7158) {
            class226.field3471 = -1;
            class466.field7158 = class492.field7500;
            class403.field5863 = -1;
        }
        if (arg0 < 119) {
            field6031 = null;
        }
        if (class264.field3989 < 0) {
            class403.field5863 = -1;
            class226.field3471 = -1;
            class264.field3989 = 0;
        }
        if (class492.field7485 < class264.field3989) {
            class403.field5863 = -1;
            class226.field3471 = -1;
            class264.field3989 = class492.field7485;
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V", line = 47)
    public static void method2455(int arg0) {
        field6031 = null;
        if (arg0 > -26) {
            field6031 = null;
        }
        field6034 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII[BIII[B)V", line = 60)
    public static final void method2456(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (arg3 != -1) {
            return;
        }
        field6028++;
        int var9 = -(arg6 >> 2);
        int var10 = -(arg6 & 0x3);
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg8[var10001] = (byte) (arg8[var10001] - arg4[arg1++]);
                int var14 = arg0++;
                arg8[var14] = (byte) (arg8[var14] - arg4[arg1++]);
                int var15 = arg0++;
                arg8[var15] = (byte) (arg8[var15] - arg4[arg1++]);
                int var16 = arg0++;
                arg8[var16] = (byte) (arg8[var16] - arg4[arg1++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg8[var10001] = (byte) (arg8[var10001] - arg4[arg1++]);
            }
            arg0 += arg7;
            arg1 += arg5;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(II)V", line = 105)
    public class419(int arg0, int arg1) {
        this.field6033 = arg1;
        this.field6032 = arg0;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V", line = 115)
    public static final void method2457(boolean arg0) {
        if (!arg0) {
            class329.field4937.method1933(class116.field1956, class52.field797, class349.field5150);
            field6029++;
        }
    }
}
