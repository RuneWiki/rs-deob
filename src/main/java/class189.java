import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class189 extends class747 {

    @OriginalMember(owner = "client!lia", name = "G", descriptor = "I")
    private int field2580;

    @OriginalMember(owner = "client!lia", name = "H", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!lia", name = "I", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!lia", name = "K", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!lia", name = "M", descriptor = "I")
    private int field2585;

    @OriginalMember(owner = "client!lia", name = "N", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!lia", name = "O", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!lia", name = "P", descriptor = "I")
    private int field2588;

    @OriginalMember(owner = "client!lia", name = "L", descriptor = "Lfd;")
    public static class298 field2584;

    @OriginalMember(owner = "client!lia", name = "F", descriptor = "Lsha;")
    public static class550 field2579;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILha;)V", line = 4)
    public static final void method1179(int arg0, class548 arg1) {
        if (arg0 != -1786233652) {
            method1180((byte) 20);
        }
        if (!class25.field320) {
            class259.method1754((byte) 24, arg1);
        } else {
            class18.method91(arg0 + 1786233651, arg1);
        }
        ++field2586;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Ldc;II)V", line = 19)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.method1181(106726340, arg0.method476((byte) -106));
        }
        ++field2583;
        if (arg1 != 11608) {
            method1182(127, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "(B)V", line = 48)
    public static void method1180(byte arg0) {
        field2584 = null;
        field2579 = null;
        if (arg0 != -14) {
            method1179(-114, (class548) null);
        }
    }

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "(II)V", line = 59)
    private final void method1181(int arg0, int arg1) {
        this.field2585 = 4080 & arg1 << 4;
        this.field2588 = 4080 & arg1 >> 12;
        this.field2580 = arg1 >> 4 & 4080;
        if (arg0 != 106726340) {
            field2579 = null;
        }
        ++field2587;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IB)Luv;", line = 72)
    public static final class755 method1182(int arg0, byte arg1) {
        ++field2581;
        int var2 = arg0 >> 16;
        if (arg1 != -101) {
            return null;
        } else {
            int var3 = arg0 & 65535;
            if (class266.field3900[var2] == null || class266.field3900[var2][var3] == null) {
                boolean var4 = class424.method2641(var2, arg1 + -11563);
                if (!var4) {
                    return null;
                }
            }
            return class266.field3900[var2][var3];
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "()V", line = 98)
    public class189() {
        this(0);
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(I)V", line = 104)
    private class189(int arg0) {
        super(0, false);
        this.method1181(106726340, arg0);
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(II)[[I", line = 114)
    public final int[][] method688(int arg0, int arg1) {
        ++field2582;
        int[][] var3 = super.field10289.method2200(0, arg1);
        int var4 = -34 / ((arg0 - 35) / 58);
        if (super.field10289.field4906) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class73.field1095 < ~var8; ++var8) {
                var5[var8] = this.field2588;
                var6[var8] = this.field2580;
                var7[var8] = this.field2585;
            }
        }
        return var3;
    }
}
