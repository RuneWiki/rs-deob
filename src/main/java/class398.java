import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class398 extends class419 {

    @OriginalMember(owner = "client!hu", name = "S", descriptor = "Lqd;")
    public static class277 field5297 = null;

    @OriginalMember(owner = "client!hu", name = "M", descriptor = "I")
    public static int field5291 = 0;

    @OriginalMember(owner = "client!hu", name = "P", descriptor = "[I")
    public static int[] field5294 = new int[3];

    @OriginalMember(owner = "client!hu", name = "L", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!hu", name = "O", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!hu", name = "Q", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!hu", name = "R", descriptor = "I")
    public int field5296;

    @OriginalMember(owner = "client!hu", name = "T", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!hu", name = "V", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!hu", name = "W", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!hu", name = "U", descriptor = "Ljb;")
    public class374 field5299;

    @OriginalMember(owner = "client!hu", name = "N", descriptor = "Lnc;")
    public static class440 field5292;

    @OriginalMember(owner = "client!hu", name = "X", descriptor = "[B")
    public byte[] field5302;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(II)I")
    public static final int method2367(int arg0, int arg1) {
        if (arg0 <= 10) {
            return 17;
        } else {
            ++field5295;
            int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
            int var3 = arg1 * 6 + -61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "(I)I")
    public final int method2368(int arg0) {
        ++field5298;
        if (arg0 != -11948) {
            this.method2370((byte) 100);
        }
        return super.field5569 ? 0 : 100;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)V")
    public static final void method2369(int arg0, boolean arg1) {
        ++field5301;
        if (arg1 && class230.field2945 != null) {
            class127.field1746 = class230.field2945.field4164;
        } else {
            class127.field1746 = -1;
        }
        class412.field5499 = 0;
        class230.field2945 = null;
        class14.field240 = null;
        class176.field2250 = null;
        class230.method1458();
        if (arg0 != 30935) {
            method2371(17, -15, 51, 13, 25);
        }
        class230.field2953.method47(0);
        class448.field6230 = null;
        class108.field1474 = null;
        class203.field2665 = -1;
        class46.field672 = null;
        class216.field2774 = null;
        class163.field2108 = null;
        class391.field5119 = null;
        class240.field3103 = null;
        class230.field2959 = null;
        class162.field2104 = null;
        class294.field3816 = -1;
        class527.field7784 = null;
        class230.field2950.method1091(23665);
        class230.field2949.method1559(64, (byte) -128, 64);
        class230.field2950.method1089(64, -105, 128);
        class230.field2948.method1165(1370821792, 64);
        class301.field3898.method1524(64, false);
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(B)[B")
    public final byte[] method2370(byte arg0) {
        ++field5290;
        if (arg0 != -32) {
            field5297 = null;
        }
        if (super.field5569) {
            throw new RuntimeException();
        } else {
            return this.field5302;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIII)V")
    public static final void method2371(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class203.field2667 != null) {
            class203.field2667[arg0][arg1] = -16777216 | arg2;
        }
        if (class187.field2443 != null) {
            class187.field2443[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class507.field7443 != null) {
            class507.field7443[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "(I)V")
    public static void method2372(int arg0) {
        if (arg0 == 5024) {
            field5292 = null;
            field5294 = null;
            field5297 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(ZI)V")
    public static final void method2373(boolean arg0, int arg1) {
        class11 var2 = class65.field826;
        synchronized (class65.field826) {
            class65.field826.method80(-102, arg1);
        }
        if (arg0) {
            ++field5293;
        }
    }
}
