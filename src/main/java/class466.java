import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class466 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "[Lmb;")
    public static class410[] field6722;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII[BI[BI)V", line = 3)
    public static final void method2753(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        field6726++;
        int var9 = -(arg0 >> 2);
        if (arg2 != 5) {
            return;
        }
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg5[var10001] = (byte) (arg5[var10001] - arg7[arg1++]);
                int var14 = arg4++;
                arg5[var14] = (byte) (arg5[var14] - arg7[arg1++]);
                int var15 = arg4++;
                arg5[var15] = (byte) (arg5[var15] - arg7[arg1++]);
                int var16 = arg4++;
                arg5[var16] = (byte) (arg5[var16] - arg7[arg1++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg5[var10001] = (byte) (arg5[var10001] - arg7[arg1++]);
            }
            arg4 += arg3;
            arg1 += arg6;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 49)
    public static void method2754(int arg0) {
        int var1 = 31 % ((arg0 - 61) / 45);
        field6722 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V", line = 58)
    public static final void method2755(boolean arg0, int arg1) {
        class513.field7232 = arg1;
        class345.field4470 = -1;
        class90.field1143 = -1;
        if (arg0) {
            field6724++;
            class608.method3333((byte) -59);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 75)
    public static final void method2756(int arg0) {
        class347.field4487.method3571(0, 5);
        field6727++;
        class251.field3182.method632(5, arg0 ^ 0xFFFFB437);
        class5.field52.method2490(false, 5);
        class358.field5112.method888(30, 5);
        class598.field8304.method1445(5, 64);
        class190.field2488.method3953(5, false);
        class646.field8903.method639(arg0, arg0 ^ 0x79);
        class250.field3177.method3612(0, 5);
        class197.field2537.method2538((byte) -124, 5);
        class348.field4512.method946(-2, 5);
        class190.field2501.method2855((byte) -81, 5);
        class37.field551.method2764(5, (byte) 101);
        class70.field946.method1487(5, (byte) -55);
        class188.field2466.method3445(5, -18328);
        class223.field2925.method1245(5, (byte) 125);
        class182.field2384.method3003(5, -7816);
        class696.field9859.method1176((byte) -121, 5);
        class545.field7652.method432(5, arg0 ^ 0xFFFFFF8A);
        class525.field7423.method209(5, true);
        class580.field8064.method1032(5, arg0 + 65);
        class398.field5521.method2713(1000, 5);
        class300.method1771(-65536, 5);
        class726.method4028(0, 50);
        class515.method2956((byte) 78, 50);
        class692.method3862(-2, 5);
        class317.method1858(5, -14903);
        class504.field7104.method775(1, 5);
        class645.field8893.method775(1, 5);
        class229.field2992.method775(1, 5);
        class576.field8038.method775(1, 5);
        class445.field6276.method775(1, 5);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V", line = 114)
    public static final void method2757(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6723++;
        int var5 = 0;
        int var6 = arg3;
        if (arg1 != 5) {
            return;
        }
        int var7 = -arg3;
        int var8 = -1;
        class284.method1709(class15.field220[arg2], arg0 + arg3, -8251, arg0 - arg3, arg4);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class15.field220[arg2 + var6];
                int[] var10 = class15.field220[arg2 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class284.method1709(var9, var11, -8251, var12, arg4);
                class284.method1709(var10, var11, -8251, var12, arg4);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class15.field220[arg2 + var5];
            int[] var16 = class15.field220[arg2 - var5];
            class284.method1709(var15, var13, -8251, var14, arg4);
            class284.method1709(var16, var13, -8251, var14, arg4);
        }
    }
}
