import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class445 extends class115 {

    @OriginalMember(owner = "client!ce", name = "Gb", descriptor = "I")
    public static int field6273 = -1;

    @OriginalMember(owner = "client!ce", name = "Bb", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!ce", name = "Cb", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!ce", name = "Eb", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!ce", name = "Fb", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!ce", name = "Hb", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!ce", name = "Ib", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!ce", name = "Jb", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!ce", name = "Kb", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!ce", name = "Lb", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!ce", name = "Mb", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!ce", name = "Nb", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!ce", name = "Ob", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!ce", name = "Pb", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!ce", name = "Qb", descriptor = "I")
    private int field6283;

    @OriginalMember(owner = "client!ce", name = "Db", descriptor = "Llw;")
    private class674 field6270;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "(II)I", line = 5)
    public final int method2574(int arg0, int arg1) {
        ++field6275;
        if (arg0 != 296813219) {
            this.method2576((int[]) null, (byte) 122);
        }
        int var3 = this.field6283 >> 3;
        int var4 = -(7 & this.field6283) + 8;
        this.field6283 += arg1;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (super.field1269[var3++] & class11.field108[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 != var4) {
            var6 = (super.field1269[var3] >> -arg1 + var4 & class11.field108[arg1]) + var5;
        } else {
            var6 = (super.field1269[var3] & class11.field108[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "(I)V", line = 36)
    public final void method2575(int arg0) {
        ++field6276;
        this.field6283 = super.field1218 * 8;
        if (arg0 != 0) {
            this.method2580((byte) -38);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([IB)V", line = 52)
    public final void method2576(int[] arg0, byte arg1) {
        ++field6282;
        this.field6270 = new class674(arg0);
        if (arg1 != 103) {
            this.method2580((byte) 6);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([BIII)V", line = 63)
    public final void method2577(byte[] arg0, int arg1, int arg2, int arg3) {
        for (int var5 = arg1; ~arg3 < ~var5; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field1269[super.field1218++] + -this.field6270.method3718(true));
        }
        ++field6271;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Llw;I)V", line = 77)
    public final void method2578(class674 arg0, int arg1) {
        ++field6277;
        if (arg1 != -1431312856) {
            this.field6283 = 2;
        }
        this.field6270 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "(II)V", line = 91)
    public final void method2579(int arg0, int arg1) {
        ++field6272;
        super.field1269[super.field1218++] = (byte) (arg1 + this.field6270.method3718(true));
        if (arg0 != -23012) {
            method2584((byte) -31, (class701) null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "(B)I", line = 106)
    public final int method2580(byte arg0) {
        ++field6280;
        int var2 = super.field1269[super.field1218++] - this.field6270.method3718(true) & 255;
        if (~var2 > -129) {
            return var2;
        } else {
            if (arg0 != -56) {
                this.method2578((class674) null, -115);
            }
            return (var2 + -128 << 8) - -(255 & super.field1269[super.field1218++] - this.field6270.method3718(true));
        }
    }

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "(II)I", line = 127)
    public final int method2581(int arg0, int arg1) {
        if (arg1 != -129) {
            this.method2578((class674) null, 124);
        }
        ++field6281;
        return arg0 * 8 + -this.field6283;
    }

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "(I)Z", line = 146)
    public final boolean method2582(int arg0) {
        if (arg0 <= 63) {
            this.field6283 = 12;
        }
        ++field6279;
        int var2 = 255 & super.field1269[super.field1218] + -this.field6270.method3720(-1);
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "(B)V", line = 171)
    public final void method2583(byte arg0) {
        ++field6268;
        super.field1218 = (this.field6283 + 7) / 8;
        if (arg0 != -58) {
            field6278 = 124;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLtf;)V", line = 184)
    public static final void method2584(byte arg0, class701 arg1) {
        class42.field415 = arg1;
        ++field6274;
        if (arg0 < 117) {
            method2584((byte) 7, (class701) null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V", line = 195)
    public class445(int arg0) {
        super(arg0);
    }
}
