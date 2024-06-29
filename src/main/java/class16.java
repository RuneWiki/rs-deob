import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class16 extends class368 {

    @OriginalMember(owner = "client!uda", name = "J", descriptor = "Lcb;")
    public static class318 field138 = new class318(8, 16);

    @OriginalMember(owner = "client!uda", name = "B", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!uda", name = "D", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!uda", name = "H", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!uda", name = "K", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!uda", name = "C", descriptor = "Lpq;")
    public static class159 field132;

    @OriginalMember(owner = "client!uda", name = "E", descriptor = "Lpq;")
    public static class159 field134;

    @OriginalMember(owner = "client!uda", name = "I", descriptor = "Lvh;")
    public class403 field137;

    @OriginalMember(owner = "client!uda", name = "F", descriptor = "[B")
    public byte[] field135;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "(I)V")
    public static void method85(int arg0) {
        if (arg0 != 15969) {
            field132 = null;
        }
        field138 = null;
        field134 = null;
        field132 = null;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)I")
    public final int method86(int arg0) {
        ++field139;
        if (super.field5297) {
            return 0;
        } else {
            return arg0 > -74 ? -92 : 100;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II[BI[BIIII)V")
    public static final void method87(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field136;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg5 & arg7);
        for (int var11 = -arg0; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg8++;
                arg4[var10001] = (byte) (arg4[var10001] + -arg2[arg6++]);
                int var14 = arg8++;
                arg4[var14] = (byte) (arg4[var14] + -arg2[arg6++]);
                int var15 = arg8++;
                arg4[var15] = (byte) (arg4[var15] + -arg2[arg6++]);
                int var16 = arg8++;
                arg4[var16] = (byte) (arg4[var16] + -arg2[arg6++]);
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg8++;
                arg4[var10001] = (byte) (arg4[var10001] + -arg2[arg6++]);
            }
            arg6 += arg1;
            arg8 += arg3;
        }
    }

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "(I)[B")
    public final byte[] method88(int arg0) {
        int var2 = 30 / ((arg0 - -11) / 40);
        ++field131;
        if (super.field5297) {
            throw new RuntimeException();
        } else {
            return this.field135;
        }
    }
}
