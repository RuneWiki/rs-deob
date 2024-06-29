import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class34 extends class72 {

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "Lae;")
    private static class6 field805 = class64.method474(117, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "Lae;")
    public static class6 field812 = class64.method474(120, "rot:");

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "Lae;")
    public static class6 field811 = field805;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "Lae;")
    public static class6 field803 = null;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "Lae;")
    public static class6 field813 = class64.method474(103, ":");

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field810 = 0;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Z")
    public static boolean field808 = false;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "B")
    public byte field804;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "J")
    public static long field806;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "Lvb;")
    public class129 field809;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V", line = 7)
    public static void method307(int arg0) {
        field813 = null;
        field803 = null;
        field812 = null;
        field811 = null;
        if (arg0 < -44) {
            field805 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIBIII)V", line = 27)
    public static final void method308(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field807++;
        if (class75.field1688 == arg5 && class130.field3167 == arg1 && (class92.field2180 == arg0 || !class82.field2017)) {
            return;
        }
        class75.field1688 = arg5;
        class130.field3167 = arg1;
        class92.field2180 = arg0;
        if (!class82.field2017) {
            class92.field2180 = 0;
        }
        class139.method1122((byte) 40, 25);
        class43.method359(false, class15.field319, null, 118);
        int var6 = class130.field3164;
        class130.field3164 = arg5 * 8 - 48;
        int var7 = class61.field1329;
        int var8 = class130.field3164 - var6;
        int var9 = class130.field3164;
        int var10 = 10 % ((arg2 + 40) / 51);
        class61.field1329 = arg1 * 8 - 48;
        int var11 = class61.field1329 - var7;
        int var12 = class61.field1329;
        for (int var13 = 0; var13 < 32768; var13++) {
            class2 var29 = class49.field1097[var13];
            if (var29 != null) {
                for (int var30 = 0; var30 < 10; var30++) {
                    var29.field1796[var30] -= var8;
                    var29.field1726[var30] -= var11;
                }
                var29.field1752 -= var11 * 128;
                var29.field1783 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class66 var27 = class20.field387[var14];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field1796[var28] -= var8;
                    var27.field1726[var28] -= var11;
                }
                var27.field1752 -= var11 * 128;
                var27.field1783 -= var8 * 128;
            }
        }
        class15.field305 = arg0;
        byte var15 = 0;
        byte var16 = 104;
        byte var17 = 1;
        class12.field229.method607(arg4, false, (byte) -120, arg3);
        byte var18 = 0;
        if (var8 < 0) {
            var15 = 103;
            var16 = -1;
            var17 = -1;
        }
        byte var19 = 104;
        byte var20 = 1;
        if (var11 < 0) {
            var19 = -1;
            var20 = -1;
            var18 = 103;
        }
        for (int var21 = var15; var21 != var16; var21 += var17) {
            for (int var23 = var18; var23 != var19; var23 += var20) {
                int var24 = var8 + var21;
                int var25 = var23 + var11;
                for (int var26 = 0; var26 < 4; var26++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                        class27.field682[var26][var21][var23] = class27.field682[var26][var24][var25];
                    } else {
                        class27.field682[var26][var21][var23] = null;
                    }
                }
            }
        }
        for (class103 var22 = (class103) class24.field609.method798(false); var22 != null; var22 = (class103) class24.field609.method792((byte) -87)) {
            var22.field2444 -= var11;
            var22.field2435 -= var8;
            if (var22.field2435 < 0 || var22.field2444 < 0 || var22.field2435 >= 104 || var22.field2444 >= 104) {
                var22.method498(114);
            }
        }
        class41.field916 = 0;
        if (class54.field1201 != 0) {
            class87.field2091 -= var11;
            class54.field1201 -= var8;
        }
        class87.field2095 = -1;
        class47.field1042 = false;
        class25.field629.method782(-3);
        class37.field851.method782(-3);
    }
}
