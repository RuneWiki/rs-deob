import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class635 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public int field8941 = 0;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public int field8944 = 0;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public int field8942 = 2048;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public int field8947 = 2048;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "F")
    public static float field8948;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "[I")
    public static int[] field8946;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 5)
    public static void method3568(byte arg0) {
        if (arg0 != 30) {
            method3573(87, null);
        }
        field8946 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILnp;)V", line = 15)
    public final void method3569(int arg0, class115 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method620((byte) -126);
            if (var3 == 0) {
                field8940++;
                return;
            }
            this.method3572(255, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BZILlb;III)V", line = 40)
    public static final void method3570(byte arg0, boolean arg1, int arg2, class257 arg3, int arg4, int arg5, int arg6) {
        if (arg0 > -64) {
            return;
        }
        field8949++;
        if (class309.field3825 >= 50 || arg3 == null || arg3.field3208 == null || arg6 >= arg3.field3208.length || arg3.field3208[arg6] == null) {
            return;
        }
        int var7 = arg3.field3208[arg6][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        if (arg3.field3208[arg6].length > 1) {
            int var10 = (int) ((double) arg3.field3208[arg6].length * Math.random());
            if (var10 > 0) {
                var8 = arg3.field3208[arg6][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg1) {
                if (!arg3.field3213) {
                    class421.method2355(-114, 255, var8, 0, var9);
                    return;
                }
                class247.method1454(255, 0, var8, var9, -23, false);
            }
        } else if (class639.field9075.field6809 != 0) {
            int var12 = arg2 - 256 >> 9;
            int var13 = arg5 - 256 >> 9;
            class89.field891[class309.field3825++] = new class340((byte) (arg3.field3213 ? 2 : 1), var8, var9, 0, 255, (var12 << 16) + ((arg4 << 24) + (var13 << 8)) + var11);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIIB)V", line = 101)
    public static final void method3571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field8950++;
        if (arg9 != 74) {
            method3571(108, 28, -9, -81, 111, 124, 90, -55, 52, (byte) 119);
        }
        if (!class255.method1506(arg0, (byte) 113)) {
            return;
        }
        if (class483.field6965[arg0] == null) {
            client.method3751(class102.field1106[arg0], -1, arg5, arg2, arg3, arg8, arg6, arg7, arg1, arg4);
        } else {
            client.method3751(class483.field6965[arg0], -1, arg5, arg2, arg3, arg8, arg6, arg7, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILnp;)V", line = 120)
    private final void method3572(int arg0, int arg1, class115 arg2) {
        if (arg1 == 1) {
            this.field8944 = arg2.method620((byte) -127);
        } else if (arg1 == 2) {
            this.field8947 = arg2.method643((byte) -77);
        } else if (arg1 == 3) {
            this.field8942 = arg2.method643((byte) -77);
        } else if (arg1 == 4) {
            this.field8941 = arg2.method676(-5);
        }
        if (arg0 != 255) {
            this.method3569(113, null);
        }
        field8945++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILtf;)V", line = 158)
    public static final void method3573(int arg0, class701 arg1) {
        class8.field89 = arg1.method3875("hitmarks", (byte) -119);
        field8943++;
        if (arg0 != 0) {
            return;
        }
        class465.field6638 = arg1.method3875("hitbar_default", (byte) -69);
        class445.field6278 = arg1.method3875("timerbar_default", (byte) -119);
        class221.field2683 = arg1.method3875("headicons_pk", (byte) -89);
        class306.field3777 = arg1.method3875("headicons_prayer", (byte) -108);
        class11.field110 = arg1.method3875("hint_headicons", (byte) -115);
        class336.field4232 = arg1.method3875("hint_mapmarkers", (byte) -106);
        class287.field3589 = arg1.method3875("mapflag", (byte) -82);
        class531.field7482 = arg1.method3875("cross", (byte) -90);
        class227.field2813 = arg1.method3875("mapdots", (byte) -67);
        class549.field7862 = arg1.method3875("scrollbar", (byte) -78);
        class305.field3773 = arg1.method3875("name_icons", (byte) -80);
        class497.field7200 = arg1.method3875("floorshadows", (byte) -89);
        class496.field7181 = arg1.method3875("compass", (byte) -82);
        class510.field7324 = arg1.method3875("otherlevel", (byte) -119);
        class467.field6657 = arg1.method3875("hint_mapedge", (byte) -78);
    }
}
