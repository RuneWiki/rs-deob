import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "a", descriptor = "I")
    private static int field150 = 39405;

    @OriginalMember(owner = "g", name = "c", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "g", name = "e", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "g", name = "d", descriptor = "Lf;")
    public AnimBase field153;

    @OriginalMember(owner = "g", name = "f", descriptor = "[I")
    public int[] field155;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field156;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field157;

    @OriginalMember(owner = "g", name = "i", descriptor = "[I")
    public int[] field158;

    @OriginalMember(owner = "g", name = "b", descriptor = "[Lg;")
    private static AnimFrame[] field151;

    @OriginalMember(owner = "g", name = "j", descriptor = "[Z")
    private static boolean[] field159;

    @OriginalMember(owner = "g", name = "a", descriptor = "(I)V")
    public static void method44(int arg0) {
        field151 = new AnimFrame[arg0 + 1];
        field159 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field159[var1] = true;
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(I[B)V")
    public static void method45(int arg0, byte[] arg1) {
        Packet var2 = new Packet(arg1, -26728);
        var2.field717 = arg1.length - 8;
        int var3 = var2.method231();
        int var4 = var2.method231();
        int var5 = var2.method231();
        int var6 = var2.method231();
        byte var7 = 0;
        Packet var8 = new Packet(arg1, -26728);
        var8.field717 = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(arg1, -26728);
        var10.field717 = var9;
        int var11 = var4 + var9;
        Packet var12 = new Packet(arg1, -26728);
        var12.field717 = var11;
        int var13 = var5 + var11;
        if (arg0 < 3 || arg0 > 3) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        Packet var15 = new Packet(arg1, -26728);
        var15.field717 = var13;
        int var16 = var6 + var13;
        Packet var17 = new Packet(arg1, -26728);
        var17.field717 = var16;
        AnimBase var18 = new AnimBase(var17, true);
        int var19 = var8.method231();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method231();
            AnimFrame var26 = field151[var25] = new AnimFrame();
            var26.field152 = var15.method229();
            var26.field153 = var18;
            int var27 = var8.method229();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method229();
                if (var32 > 0) {
                    if (var18.field148[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field148[var33] == 0) {
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
                    if (var18.field148[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var12.method242();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var12.method242();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var12.method242();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field148[var30] == 5) {
                        field159[var25] = false;
                    }
                }
            }
            var26.field154 = var29;
            var26.field155 = new int[var29];
            var26.field156 = new int[var29];
            var26.field157 = new int[var29];
            var26.field158 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field155[var31] = var20[var31];
                var26.field156[var31] = var21[var31];
                var26.field157[var31] = var22[var31];
                var26.field158[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "g", name = "b", descriptor = "(I)V")
    public static void method46(int arg0) {
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field151 = null;
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(ZI)Lg;")
    public static AnimFrame method47(boolean arg0, int arg1) {
        if (!arg0) {
            field150 = -277;
        }
        return field151 == null ? null : field151[arg1];
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(II)Z")
    public static boolean method48(int arg0, int arg1) {
        if (arg1 != 45733) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 == -1;
    }
}
