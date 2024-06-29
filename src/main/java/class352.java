import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class352 extends class181 {

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "B")
    public byte field4694;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public int field4695;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "J")
    public static long field4692;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "Lio;")
    public class157 field4690;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[BI[BIIII)V", line = 4)
    public static final void method2081(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4691;
        if (arg8 != 31626) {
            field4692 = 126L;
        }
        int var9 = -(arg3 >> 2);
        int var10 = -(3 & arg3);
        for (int var11 = -arg1; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg0++;
                arg4[var10001] = (byte) (arg4[var10001] + -arg2[arg5++]);
                int var14 = arg0++;
                arg4[var14] = (byte) (arg4[var14] + -arg2[arg5++]);
                int var15 = arg0++;
                arg4[var15] = (byte) (arg4[var15] + -arg2[arg5++]);
                int var16 = arg0++;
                arg4[var16] = (byte) (arg4[var16] + -arg2[arg5++]);
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg0++;
                arg4[var10001] = (byte) (arg4[var10001] + -arg2[arg5++]);
            }
            arg0 += arg7;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)I", line = 49)
    public final int method438(byte arg0) {
        if (arg0 != -112) {
            return -53;
        } else {
            ++field4693;
            return this.field4690 == null ? 0 : this.field4690.field2219 * 100 / (this.field4690.field2199.length + -this.field4694);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)[B", line = 72)
    public final byte[] method437(int arg0) {
        ++field4689;
        if (!super.field2536 && ~(this.field4690.field2199.length + -this.field4694) >= ~this.field4690.field2219) {
            if (arg0 != 4) {
                this.method438((byte) 30);
            }
            return this.field4690.field2199;
        } else {
            throw new RuntimeException();
        }
    }
}
