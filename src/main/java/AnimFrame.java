import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("h")
public class AnimFrame {

    @OriginalMember(owner = "h", name = "b", descriptor = "I")
    private static int field176 = 3;

    @OriginalMember(owner = "h", name = "d", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "h", name = "f", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "h", name = "e", descriptor = "Lg;")
    public AnimBase field179;

    @OriginalMember(owner = "h", name = "a", descriptor = "Z")
    private static boolean field175;

    @OriginalMember(owner = "h", name = "g", descriptor = "[I")
    public int[] field181;

    @OriginalMember(owner = "h", name = "h", descriptor = "[I")
    public int[] field182;

    @OriginalMember(owner = "h", name = "i", descriptor = "[I")
    public int[] field183;

    @OriginalMember(owner = "h", name = "j", descriptor = "[I")
    public int[] field184;

    @OriginalMember(owner = "h", name = "c", descriptor = "[Lh;")
    private static AnimFrame[] field177;

    @OriginalMember(owner = "h", name = "k", descriptor = "[Z")
    private static boolean[] field185;

    @OriginalMember(owner = "h", name = "a", descriptor = "(I)V")
    public static void method58(int arg0) {
        field177 = new AnimFrame[arg0 + 1];
        field185 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field185[var1] = true;
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "([BZ)V")
    public static void method59(byte[] arg0, boolean arg1) {
        Packet var2 = new Packet(45427, arg0);
        var2.field736 = arg0.length - 8;
        int var3 = var2.method241();
        int var4 = var2.method241();
        int var5 = var2.method241();
        int var6 = var2.method241();
        byte var7 = 0;
        Packet var8 = new Packet(45427, arg0);
        var8.field736 = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(45427, arg0);
        var10.field736 = var9;
        int var11 = var4 + var9;
        Packet var12 = new Packet(45427, arg0);
        var12.field736 = var11;
        int var13 = var5 + var11;
        if (!arg1) {
            field176 = 101;
        }
        Packet var14 = new Packet(45427, arg0);
        var14.field736 = var13;
        int var15 = var6 + var13;
        Packet var16 = new Packet(45427, arg0);
        var16.field736 = var15;
        AnimBase var17 = new AnimBase(false, var16);
        int var18 = var8.method241();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method241();
            AnimFrame var25 = field177[var24] = new AnimFrame();
            var25.field178 = var14.method239();
            var25.field179 = var17;
            int var26 = var8.method239();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method239();
                if (var31 > 0) {
                    if (var17.field173[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field173[var32] == 0) {
                                var19[var28] = var32;
                                var20[var28] = 0;
                                var21[var28] = 0;
                                var22[var28] = 0;
                                var28++;
                                break;
                            }
                        }
                    }
                    var19[var28] = var29;
                    short var33 = 0;
                    if (var17.field173[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method252();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method252();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method252();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field173[var29] == 5) {
                        field185[var24] = false;
                    }
                }
            }
            var25.field180 = var28;
            var25.field181 = new int[var28];
            var25.field182 = new int[var28];
            var25.field183 = new int[var28];
            var25.field184 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field181[var30] = var19[var30];
                var25.field182[var30] = var20[var30];
                var25.field183[var30] = var21[var30];
                var25.field184[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(Z)V")
    public static void method60(boolean arg0) {
        if (!arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field177 = null;
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(II)Lh;")
    public static AnimFrame method61(int arg0, int arg1) {
        if (arg0 != 0) {
            field176 = 157;
        }
        return field177 == null ? null : field177[arg1];
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(BI)Z")
    public static boolean method62(byte arg0, int arg1) {
        if (arg0 == 7) {
            boolean var2 = false;
        }
        return arg1 == -1;
    }
}
