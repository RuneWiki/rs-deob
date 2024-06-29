import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class647 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Ljava/util/Calendar;")
    public static Calendar field8679 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "F")
    public static float field8684;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Ltga;")
    public static class258 field8683;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V", line = 16)
    public static final void method3624(int arg0, boolean arg1) {
        field8686++;
        if (class102.field1401 == arg0) {
            return;
        }
        if (arg0 == 13) {
            if (class420.field5918 == null) {
                class656.method3658(class336.field4726, class605.field8178, -29993, class707.field9849);
            } else {
                class479.method2915(class336.field4726, (byte) -128);
            }
        }
        if (arg0 != 13 && class197.field2653 != null) {
            class197.field2653.method2226((byte) -117);
            class197.field2653 = null;
        }
        if (arg0 == 3) {
            class62.method443(class544.field7545 != class12.field106, 103);
        }
        if (arg0 == 7) {
            class360.method2293(class544.field7545 != class211.field2789, 24023);
        }
        if (arg0 == 5) {
            if (class420.field5918 == null) {
                class76.method569(class707.field9849, (byte) 89, class605.field8178);
            } else {
                class65.method528(-26881);
            }
        } else if (arg0 == 6) {
            if (class420.field5918 == null) {
                class656.method3658(class336.field4726, class605.field8178, -29993, class707.field9849);
            } else {
                class479.method2915(class336.field4726, (byte) -127);
            }
        } else if (arg0 == 9) {
            if (class420.field5918 == null) {
                class656.method3658(class336.field4726, class605.field8178, -29993, class707.field9849);
            } else {
                class479.method2915(class336.field4726, (byte) -126);
            }
        } else if (arg0 == 12) {
            if (class420.field5918 == null) {
                class76.method569(class707.field9849, (byte) 119, class605.field8178);
            } else {
                class65.method528(-26881);
            }
        }
        if (class81.method587(-87, class102.field1401)) {
            class27.field350.field3498 = 2;
            class171.field2377.field3498 = 2;
            class244.field3628.field3498 = 2;
            class41.field502.field3498 = 2;
            class589.field8029.field3498 = 2;
            class604.field8153.field3498 = 2;
            class259.field3748.field3498 = 2;
        }
        if (class81.method587(-56, arg0)) {
            class552.field7683 = 0;
            class584.field7969 = 0;
            class401.field5752 = 1;
            class757.field10567 = 1;
            class693.field9626 = 0;
            class507.method3048(true, 64);
            class27.field350.field3498 = 1;
            class171.field2377.field3498 = 1;
            class244.field3628.field3498 = 1;
            class41.field502.field3498 = 1;
            class589.field8029.field3498 = 1;
            class604.field8153.field3498 = 1;
            class259.field3748.field3498 = 1;
        }
        if (arg0 == 11 || arg0 == 3) {
            class723.method4042((byte) 122);
        }
        boolean var2 = arg0 == 2 || class346.method2214(arg0, 11703) || class425.method2643(arg0, -102);
        if (!arg1) {
            field8679 = null;
        }
        boolean var3 = class102.field1401 == 2 || class346.method2214(class102.field1401, 11703) || class425.method2643(class102.field1401, -104);
        if (var2 != var3) {
            if (var2) {
                class61.field883 = class756.field10560;
                if (class332.field4707.field4796.method1140(0) == 0) {
                    class721.method4040(2, (byte) -63);
                } else {
                    class630.method3540(2, false, class332.field4707.field4796.method1140(0), (byte) 117, class756.field10560, class477.field6645, 0);
                    class512.method3059(-1);
                }
                class396.field5689.method1923(false, -25670);
            } else {
                class721.method4040(2, (byte) -106);
                class396.field5689.method1923(true, -25670);
            }
        }
        if (class81.method587(-100, arg0) || arg0 == 13) {
            class129.field1802.method281();
        }
        class102.field1401 = arg0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V", line = 164)
    public static final void method3625(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 2) {
            method3625(49, -53, -25, -79, -57);
        }
        field8680++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        class102.method675(arg4, -119, arg0 - arg1, arg0 + arg1, class538.field7454[arg2]);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class538.field7454[arg2 + var6];
                int[] var10 = class538.field7454[arg2 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class102.method675(arg4, 108, var12, var11, var9);
                class102.method675(arg4, 57, var12, var11, var10);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class538.field7454[arg2 + var5];
            int[] var16 = class538.field7454[arg2 - var5];
            class102.method675(arg4, arg3 - 127, var14, var13, var15);
            class102.method675(arg4, 83, var14, var13, var16);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 221)
    public static void method3626(int arg0) {
        field8683 = null;
        if (arg0 != 12) {
            field8679 = null;
        }
        field8679 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II[BIIII[BI)V", line = 232)
    public static final void method3627(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        field8682++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        int var11 = -arg3;
        if (arg5 >= -85) {
            return;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg2[var10001] += arg7[arg0++];
                int var14 = arg6++;
                arg2[var14] += arg7[arg0++];
                int var15 = arg6++;
                arg2[var15] += arg7[arg0++];
                int var16 = arg6++;
                arg2[var16] += arg7[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg2[var10001] += arg7[arg0++];
            }
            arg6 += arg1;
            arg0 += arg4;
            var11++;
        }
    }
}
