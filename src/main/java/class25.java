import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IBCKUTPD")
public class class25 {

    @OriginalMember(owner = "IBCKUTPD", name = "a", descriptor = "I")
    private static int field861 = 3;

    @OriginalMember(owner = "IBCKUTPD", name = "c", descriptor = "I")
    public int field863;

    @OriginalMember(owner = "IBCKUTPD", name = "e", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "IBCKUTPD", name = "d", descriptor = "LMXTMAEWO;")
    public class36 field864;

    @OriginalMember(owner = "IBCKUTPD", name = "f", descriptor = "[I")
    public int[] field866;

    @OriginalMember(owner = "IBCKUTPD", name = "g", descriptor = "[I")
    public int[] field867;

    @OriginalMember(owner = "IBCKUTPD", name = "h", descriptor = "[I")
    public int[] field868;

    @OriginalMember(owner = "IBCKUTPD", name = "i", descriptor = "[I")
    public int[] field869;

    @OriginalMember(owner = "IBCKUTPD", name = "b", descriptor = "[LIBCKUTPD;")
    private static class25[] field862;

    @OriginalMember(owner = "IBCKUTPD", name = "j", descriptor = "[Z")
    private static boolean[] field870;

    @OriginalMember(owner = "IBCKUTPD", name = "a", descriptor = "(I)V")
    public static void method305(int arg0) {
        field862 = new class25[arg0 + 1];
        field870 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field870[var1] = true;
        }
    }

    @OriginalMember(owner = "IBCKUTPD", name = "a", descriptor = "(B[B)V")
    public static void method306(byte arg0, byte[] arg1) {
        class17 var2 = new class17(arg1, -26583);
        var2.field779 = arg1.length - 8;
        int var3 = var2.method226();
        int var4 = var2.method226();
        int var5 = var2.method226();
        int var6 = var2.method226();
        byte var7 = 0;
        if (arg0 != 4) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        class17 var9 = new class17(arg1, -26583);
        var9.field779 = var7;
        int var10 = var3 + var7 + 2;
        class17 var11 = new class17(arg1, -26583);
        var11.field779 = var10;
        int var12 = var4 + var10;
        class17 var13 = new class17(arg1, -26583);
        var13.field779 = var12;
        int var14 = var5 + var12;
        class17 var15 = new class17(arg1, -26583);
        var15.field779 = var14;
        int var16 = var6 + var14;
        class17 var17 = new class17(arg1, -26583);
        var17.field779 = var16;
        class36 var18 = new class36((byte) -89, var17);
        int var19 = var9.method226();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var9.method226();
            class25 var26 = field862[var25] = new class25();
            var26.field863 = var15.method224();
            var26.field864 = var18;
            int var27 = var9.method224();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var11.method224();
                if (var32 > 0) {
                    if (var18.field1116[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field1116[var33] == 0) {
                                var20[var29] = var33;
                                var21[var29] = 0;
                                var22[var29] = 0;
                                var23[var29] = 0;
                                var29++;
                                break;
                            }
                        }
                    }
                    var20[var29] = var30;
                    short var34 = 0;
                    if (var18.field1116[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var13.method237();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var13.method237();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var13.method237();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field1116[var30] == 5) {
                        field870[var25] = false;
                    }
                }
            }
            var26.field865 = var29;
            var26.field866 = new int[var29];
            var26.field867 = new int[var29];
            var26.field868 = new int[var29];
            var26.field869 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field866[var31] = var20[var31];
                var26.field867[var31] = var21[var31];
                var26.field868[var31] = var22[var31];
                var26.field869[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "IBCKUTPD", name = "b", descriptor = "(I)V")
    public static void method307(int arg0) {
        field862 = null;
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
    }

    @OriginalMember(owner = "IBCKUTPD", name = "c", descriptor = "(I)LIBCKUTPD;")
    public static class25 method308(int arg0) {
        return field862 == null ? null : field862[arg0];
    }

    @OriginalMember(owner = "IBCKUTPD", name = "a", descriptor = "(IZ)Z")
    public static boolean method309(int arg0, boolean arg1) {
        if (arg1) {
            field861 = 363;
        }
        return arg0 == -1;
    }
}
