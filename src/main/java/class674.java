import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class674 extends class96 {

    @OriginalMember(owner = "client!ql", name = "zb", descriptor = "Luc;")
    public static class27 field9484 = new class27(53, -1);

    @OriginalMember(owner = "client!ql", name = "Hb", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field9492 = new Hashtable();

    @OriginalMember(owner = "client!ql", name = "yb", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!ql", name = "Ab", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!ql", name = "Bb", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!ql", name = "Cb", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!ql", name = "Db", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!ql", name = "Eb", descriptor = "I")
    private int field9489;

    @OriginalMember(owner = "client!ql", name = "Fb", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!ql", name = "Gb", descriptor = "I")
    public static int field9491;

    @OriginalMember(owner = "client!ql", name = "Ib", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!ql", name = "Jb", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!ql", name = "Kb", descriptor = "I")
    public static int field9495;

    @OriginalMember(owner = "client!ql", name = "Lb", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!ql", name = "Mb", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!ql", name = "Nb", descriptor = "Lbv;")
    private class277 field9498;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "(I)Z")
    public final boolean method3725(int arg0) {
        int var2 = 52 / ((arg0 - 57) / 40);
        ++field9495;
        int var3 = 255 & super.field1316[super.field1301] - this.field9498.method1683(false);
        return var3 >= 128;
    }

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "(II)I")
    public final int method3726(int arg0, int arg1) {
        ++field9496;
        int var3 = this.field9489 >> 3;
        int var4 = -(7 & this.field9489) + arg1;
        this.field9489 += arg0;
        int var5 = 0;
        while (var4 < arg0) {
            var5 += (class498.field6843[var4] & super.field1316[var3++]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 != var4) {
            var6 = (super.field1316[var3] >> -arg0 + var4 & class498.field6843[arg0]) + var5;
        } else {
            var6 = (class498.field6843[var4] & super.field1316[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(IB)V")
    public final void method3727(int arg0, byte arg1) {
        ++field9491;
        if (arg1 != 108) {
            this.method3728(-30);
        }
        super.field1316[super.field1301++] = (byte) (this.field9498.method1682(false) + arg0);
    }

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "(I)I")
    public final int method3728(int arg0) {
        if (arg0 != 23774) {
            this.method3734(-128, (byte) -119);
        }
        ++field9488;
        int var2 = 255 & super.field1316[super.field1301++] - this.field9498.method1682(false);
        return ~var2 > -129 ? var2 : (255 & super.field1316[super.field1301++] + -this.field9498.method1682(false)) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(I)V")
    public class674(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([IZ)V")
    public final void method3729(int[] arg0, boolean arg1) {
        this.field9498 = new class277(arg0);
        ++field9487;
        if (arg1) {
            this.method3734(-114, (byte) 39);
        }
    }

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "(I)V")
    public final void method3730(int arg0) {
        super.field1301 = (this.field9489 - -7) / 8;
        if (arg0 != -29878) {
            this.method3728(-86);
        }
        ++field9485;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "([BIII)V")
    public final void method3731(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field9493;
        int var5 = 0;
        if (arg1 != -22580) {
            field9486 = 66;
        }
        while (arg3 > var5) {
            arg0[arg2 + var5] = (byte) (super.field1316[super.field1301++] + -this.field9498.method1682(false));
            ++var5;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)V")
    public static final void method3732(int arg0, int arg1, int arg2, int arg3) {
        ++field9494;
        class246.field3501 = new byte[arg2][arg0][arg1];
        if (arg3 != -128) {
            method3735(21);
        }
    }

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "(B)V")
    public final void method3733(byte arg0) {
        this.field9489 = super.field1301 * 8;
        ++field9490;
        if (arg0 > -74) {
            field9492 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(IB)I")
    public final int method3734(int arg0, byte arg1) {
        ++field9497;
        if (arg1 > -31) {
            this.method3734(26, (byte) 78);
        }
        return arg0 * 8 - this.field9489;
    }

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "(I)V")
    public static void method3735(int arg0) {
        field9492 = null;
        int var1 = 73 % ((arg0 - 13) / 48);
        field9484 = null;
    }
}
