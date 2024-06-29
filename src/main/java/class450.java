import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class450 extends class540 implements class706 {

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "Lke;")
    public static class622 field6459 = new class622(70, 6);

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "I")
    public static int field6463 = 0;

    @OriginalMember(owner = "client!mea", name = "y", descriptor = "I")
    public static int field6466 = 0;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "C")
    public char field6455;

    @OriginalMember(owner = "client!mea", name = "w", descriptor = "F")
    public static float field6464;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
    public int field6450;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "I")
    public int field6453;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
    public int field6454;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!mea", name = "t", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!mea", name = "u", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!mea", name = "x", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "J")
    public long field6458;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)I", line = 7)
    public final int method2709(byte arg0) {
        int var2 = 28 / ((-arg0 - 60) / 60);
        field6456++;
        return this.field6454;
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)C", line = 17)
    public final char method2710(int arg0) {
        field6461++;
        if (arg0 != -9159) {
            field6463 = 50;
        }
        return this.field6455;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)J", line = 28)
    public final long method2711(int arg0) {
        if (arg0 != -10422) {
            this.method2709((byte) -81);
        }
        field6462++;
        return this.field6458;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIII)V", line = 39)
    public static final void method2712(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field6463 <= (arg2 - arg3) && arg2 + arg3 <= class285.field4372 && class738.field10297 <= arg1 - arg3 && (arg1 + arg3) <= class414.field5846) {
            class164.method1282(arg2, arg1, arg4, arg3, 9);
        } else {
            class386.method2361(arg3, arg1, arg2, arg4, true);
        }
        if (arg0 <= 70) {
            method2716(false);
        }
        field6451++;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIB)Z", line = 59)
    public static final boolean method2713(int arg0, int arg1, byte arg2) {
        if (arg2 < 52) {
            field6459 = null;
        }
        field6460++;
        return (arg0 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)I", line = 70)
    public final int method2714(int arg0) {
        field6452++;
        return arg0 == 18923 ? this.field6450 : 49;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)I", line = 90)
    public final int method2715(byte arg0) {
        field6457++;
        if (arg0 != 50) {
            field6459 = null;
        }
        return this.field6453;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V", line = 106)
    public static void method2716(boolean arg0) {
        if (!arg0) {
            method2713(-86, 26, (byte) -17);
        }
        field6459 = null;
    }
}
