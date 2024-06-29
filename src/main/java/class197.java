import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class197 extends class119 {

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field2687 = 0;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "Lsa;")
    public static class207 field2685;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Luj;")
    public class387 field2683;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "[B")
    public byte[] field2690;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "[[S")
    public static short[][] field2682;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "[[[Lds;")
    public static class14[][][] field2689;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)[B")
    public final byte[] method921(byte arg0) {
        ++field2680;
        if (arg0 < 122) {
            return null;
        } else if (super.field1745) {
            throw new RuntimeException();
        } else {
            return this.field2690;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I[B[BIIIIII)V")
    public static final void method1305(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != -1131291358) {
            method1306(-128);
        }
        ++field2688;
        int var9 = -(arg6 >> 2);
        int var10 = -(arg6 & 3);
        for (int var11 = -arg4; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg7++;
                arg2[var10001] = (byte) (arg2[var10001] + -arg1[arg0++]);
                int var14 = arg7++;
                arg2[var14] = (byte) (arg2[var14] + -arg1[arg0++]);
                int var15 = arg7++;
                arg2[var15] = (byte) (arg2[var15] + -arg1[arg0++]);
                int var16 = arg7++;
                arg2[var16] = (byte) (arg2[var16] + -arg1[arg0++]);
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg7++;
                arg2[var10001] = (byte) (arg2[var10001] + -arg1[arg0++]);
            }
            arg7 += arg5;
            arg0 += arg8;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
    public final int method922(int arg0) {
        ++field2681;
        if (super.field1745) {
            return 0;
        } else {
            int var2 = -50 % ((arg0 - 59) / 59);
            return 100;
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public static void method1306(int arg0) {
        field2682 = null;
        field2689 = null;
        if (arg0 == 30812) {
            field2685 = null;
        }
    }
}
