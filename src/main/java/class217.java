import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class217 extends class264 {

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    private int field3957 = 1;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    private int field3948 = 1;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    private int field3955 = 204;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "Lcf;")
    public static class93 field3950 = class147.method1066("Lade Liste der Welten", -48);

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "Lcf;")
    private static class93 field3958 = class147.method1066("red:", -48);

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "Lcf;")
    public static class93 field3961 = field3958;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "Lcf;")
    public static class93 field3962 = class147.method1066("weiss:", -48);

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "Lcf;")
    public static class93 field3960 = class147.method1066("huffman", -48);

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "Lcf;")
    public static class93 field3954 = field3958;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V")
    public static void method1523(byte arg0) {
        field3962 = null;
        field3954 = null;
        field3950 = null;
        field3961 = null;
        if (arg0 < 100) {
            method1526(62, (class177) null, 40, -53);
        }
        field3960 = null;
        field3958 = null;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(B)V")
    public static final void method1524(byte arg0) {
        ++field3949;
        class230.field4114.method294(arg0 ^ -35);
        if (arg0 != -35) {
            method1527(21, 119, -94, 3, 61, 46, 75);
        }
        class77.field1438.method294(0);
        class126.field2228.method294(arg0 ^ -35);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        if (arg1 > -83) {
            method1524((byte) -1);
        }
        ++field3953;
        int[] var3 = super.field4716.method532((byte) 125, arg0);
        if (super.field4716.field1424) {
            for (int var4 = 0; var4 < class176.field3060; ++var4) {
                int var5 = class144.field2497[var4];
                int var6 = class67.field1220[arg0];
                int var7 = this.field3948 * var5 >> 12;
                int var8 = this.field3957 * var6 >> 12;
                int var9 = var5 % (4096 / this.field3948) * this.field3948;
                int var10 = var6 % (4096 / this.field3957) * this.field3957;
                if (this.field3955 > var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field3955 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field3955) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V")
    public static final void method1525(int arg0) {
        ++field3963;
        if (arg0 <= 69) {
            method1525(44);
        }
        if (class48.field777 != null) {
            class249.method1689((byte) -33, class48.field777);
            class48.field777 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 > 11) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field3955 = arg2.method1891(-115);
                    }
                } else {
                    this.field3957 = arg2.method1907(16832);
                }
            } else {
                this.field3948 = arg2.method1907(16832);
            }
            ++field3959;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILhg;II)[Ldh;")
    public static final class120[] method1526(int arg0, class177 arg1, int arg2, int arg3) {
        ++field3952;
        if (!class149.method1074(arg3, arg1, 16597, arg0)) {
            return null;
        } else {
            if (arg2 <= 9) {
                method1527(-62, -39, 32, -118, -67, 91, 36);
            }
            return class136.method991((byte) -65);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class217() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~class277.field4967 >= ~(-arg4 + arg1) && class147.field2593 >= arg1 + arg4 && arg0 - arg4 >= class26.field342 && class271.field4820 >= arg0 + arg4) {
            class160.method1156(arg2, arg0, arg5, arg1, arg4, arg6, (byte) 0);
        } else {
            class205.method1452(arg5, arg6, arg0, arg4, (byte) 48, arg1, arg2);
        }
        ++field3947;
        if (arg3 > -6) {
            field3950 = null;
        }
    }
}
