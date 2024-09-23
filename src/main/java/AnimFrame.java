import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "a", descriptor = "I")
    private static int field148 = 599;

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    private static int field149;

    @OriginalMember(owner = "g", name = "d", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "g", name = "f", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "g", name = "e", descriptor = "Lf;")
    public AnimBase field152;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field154;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field155;

    @OriginalMember(owner = "g", name = "i", descriptor = "[I")
    public int[] field156;

    @OriginalMember(owner = "g", name = "j", descriptor = "[I")
    public int[] field157;

    @OriginalMember(owner = "g", name = "c", descriptor = "[Lg;")
    private static AnimFrame[] field150;

    @OriginalMember(owner = "g", name = "k", descriptor = "[Z")
    private static boolean[] field158;

    @OriginalMember(owner = "g", name = "a", descriptor = "(I)V")
    public static void method44(int arg0) {
        field150 = new AnimFrame[arg0 + 1];
        field158 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field158[var1] = true;
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "([BI)V")
    public static void method45(byte[] arg0, int arg1) {
        Packet var2 = new Packet((byte) 3, arg0);
        var2.field702 = arg0.length - 8;
        int var3 = var2.method226();
        int var4 = var2.method226();
        int var5 = var2.method226();
        int var6 = var2.method226();
        byte var7 = 0;
        Packet var8 = new Packet((byte) 3, arg0);
        var8.field702 = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet((byte) 3, arg0);
        var10.field702 = var9;
        int var11 = var4 + var9;
        Packet var12 = new Packet((byte) 3, arg0);
        var12.field702 = var11;
        int var13 = 79 / arg1;
        int var14 = var5 + var11;
        Packet var15 = new Packet((byte) 3, arg0);
        var15.field702 = var14;
        int var16 = var6 + var14;
        Packet var17 = new Packet((byte) 3, arg0);
        var17.field702 = var16;
        AnimBase var18 = new AnimBase(field149, var17);
        int var19 = var8.method226();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method226();
            AnimFrame var26 = field150[var25] = new AnimFrame();
            var26.field151 = var15.method224();
            var26.field152 = var18;
            int var27 = var8.method224();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method224();
                if (var32 > 0) {
                    if (var18.field146[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field146[var33] == 0) {
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
                    if (var18.field146[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var12.method237();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var12.method237();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var12.method237();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field146[var30] == 5) {
                        field158[var25] = false;
                    }
                }
            }
            var26.field153 = var29;
            var26.field154 = new int[var29];
            var26.field155 = new int[var29];
            var26.field156 = new int[var29];
            var26.field157 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field154[var31] = var20[var31];
                var26.field155[var31] = var21[var31];
                var26.field156[var31] = var22[var31];
                var26.field157[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(B)V")
    public static void method46(byte arg0) {
        field150 = null;
        if (arg0 == 5) {
            boolean var1 = false;
        } else {
            field148 = 286;
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(ZI)Lg;")
    public static AnimFrame method47(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return field150 == null ? null : field150[arg1];
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(II)Z")
    public static boolean method48(int arg0, int arg1) {
        int var2 = 48 / arg1;
        return arg0 == -1;
    }
}
