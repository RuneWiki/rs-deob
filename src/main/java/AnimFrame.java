import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("h")
public class AnimFrame {

    @OriginalMember(owner = "h", name = "c", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "h", name = "e", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "h", name = "d", descriptor = "Lg;")
    public AnimBase field168;

    @OriginalMember(owner = "h", name = "a", descriptor = "Z")
    private static boolean field165;

    @OriginalMember(owner = "h", name = "f", descriptor = "[I")
    public int[] field170;

    @OriginalMember(owner = "h", name = "g", descriptor = "[I")
    public int[] field171;

    @OriginalMember(owner = "h", name = "h", descriptor = "[I")
    public int[] field172;

    @OriginalMember(owner = "h", name = "i", descriptor = "[I")
    public int[] field173;

    @OriginalMember(owner = "h", name = "b", descriptor = "[Lh;")
    private static AnimFrame[] field166;

    @OriginalMember(owner = "h", name = "j", descriptor = "[Z")
    private static boolean[] field174;

    @OriginalMember(owner = "h", name = "a", descriptor = "(I)V")
    public static void method58(int arg0) {
        field166 = new AnimFrame[arg0 + 1];
        field174 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field174[var1] = true;
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "([BI)V")
    public static void method59(byte[] arg0, int arg1) {
        Packet var2 = new Packet(16, arg0);
        var2.field717 = arg0.length - 8;
        int var3 = var2.method241();
        int var4 = var2.method241();
        int var5 = var2.method241();
        int var6 = var2.method241();
        byte var7 = 0;
        Packet var8 = new Packet(16, arg0);
        var8.field717 = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(16, arg0);
        var10.field717 = var9;
        int var11 = var4 + var9;
        Packet var12 = new Packet(16, arg0);
        var12.field717 = var11;
        int var13 = var5 + var11;
        Packet var14 = new Packet(16, arg0);
        if (arg1 <= 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        var14.field717 = var13;
        int var16 = var6 + var13;
        Packet var17 = new Packet(16, arg0);
        var17.field717 = var16;
        AnimBase var18 = new AnimBase(var17, 12574);
        int var19 = var8.method241();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method241();
            AnimFrame var26 = field166[var25] = new AnimFrame();
            var26.field167 = var14.method239();
            var26.field168 = var18;
            int var27 = var8.method239();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method239();
                if (var32 > 0) {
                    if (var18.field163[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field163[var33] == 0) {
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
                    if (var18.field163[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var12.method252();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var12.method252();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var12.method252();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field163[var30] == 5) {
                        field174[var25] = false;
                    }
                }
            }
            var26.field169 = var29;
            var26.field170 = new int[var29];
            var26.field171 = new int[var29];
            var26.field172 = new int[var29];
            var26.field173 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field170[var31] = var20[var31];
                var26.field171[var31] = var21[var31];
                var26.field172[var31] = var22[var31];
                var26.field173[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(Z)V")
    public static void method60(boolean arg0) {
        if (arg0) {
            field165 = !field165;
        }
        field166 = null;
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(ZI)Lh;")
    public static AnimFrame method61(boolean arg0, int arg1) {
        if (!arg0) {
            field165 = !field165;
        }
        return field166 == null ? null : field166[arg1];
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(BI)Z")
    public static boolean method62(byte arg0, int arg1) {
        if (arg0 != 17) {
            throw new NullPointerException();
        }
        return arg1 == -1;
    }
}
