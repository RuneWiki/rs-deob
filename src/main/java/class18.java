import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class class18 {

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field250 = 0;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Lne;")
    public static class235 field253 = new class235(4);

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field255 = 0;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Lwm;")
    private static class152 field256 = class157.method1048("rating: ", 125);

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "Lwm;")
    public static class152 field257 = field256;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Lwm;")
    public static class152 field259 = class157.method1048("hitmarks", 127);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Lah;")
    public static class205 field260;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILuj;ZI)V", line = 9)
    public static final void method114(int arg0, int arg1, int arg2, class141 arg3, boolean arg4, int arg5) {
        field254++;
        if (class150.field2329 >= 50 || arg3.field2158 == null || arg1 >= arg3.field2158.length || arg3.field2158[arg1] == null) {
            return;
        }
        int var6 = arg3.field2158[arg1][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 5 & 0x7;
        if (arg3.field2158[arg1].length > 1) {
            int var9 = (int) ((double) arg3.field2158[arg1].length * Math.random());
            if (var9 > 0) {
                var7 = arg3.field2158[arg1][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg4) {
                class125.method795(-30990, var8, 0, var7);
            }
        } else if (class72.field1048 != 0) {
            class77.field1098[class150.field2329] = var7;
            if (arg5 == 28972) {
                class192.field3040[class150.field2329] = var8;
                int var11 = (arg0 - 64) / 128;
                int var12 = (arg2 - 64) / 128;
                class281.field4795[class150.field2329] = 0;
                class169.field2656[class150.field2329] = null;
                class106.field1516[class150.field2329] = (var11 << 16) + (var12 << 8) + var10;
                class150.field2329++;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIIIII)V", line = 73)
    public static final void method115(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 >= class308.field5283 && arg1 <= class238.field3902 && class157.field2505 <= arg2 && arg4 <= class110.field1553) {
            class313.method2182(arg1, arg4, arg5, (byte) -125, arg2, arg3);
        } else {
            class136.method862(-1, arg5, arg2, arg4, arg3, arg1);
        }
        if (arg0 <= -88) {
            field252++;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 91)
    public static void method117(int arg0) {
        field253 = null;
        field257 = null;
        if (arg0 <= 0) {
            method114(-30, -72, 68, (class141) null, false, 67);
        }
        field259 = null;
        field256 = null;
        field260 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V", line = 106)
    public static final void method118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class123 var5 = (class123) class225.field3655.method1586((long) arg3, -60);
        if (var5 == null) {
            var5 = new class123();
            class225.field3655.method1593((long) arg3, var5, 27497);
        }
        if (arg0 >= var5.field1730.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field1730.length; var8++) {
                var6[var8] = var5.field1730[var8];
                var7[var8] = var5.field1729[var8];
            }
            for (int var9 = var5.field1730.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1730 = var6;
            var5.field1729 = var7;
        }
        field249++;
        var5.field1730[arg0] = arg4;
        var5.field1729[arg0] = arg2;
        if (arg1 >= -25) {
            field255 = 113;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[B)V")
    public abstract void method116(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)[B")
    public abstract byte[] method119(int arg0);
}
