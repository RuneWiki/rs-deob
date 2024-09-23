import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "c", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "g", name = "e", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "g", name = "d", descriptor = "Lf;")
    public AnimBase field151;

    @OriginalMember(owner = "g", name = "a", descriptor = "Z")
    private static boolean field148;

    @OriginalMember(owner = "g", name = "f", descriptor = "[I")
    public int[] field153;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field154;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field155;

    @OriginalMember(owner = "g", name = "i", descriptor = "[I")
    public int[] field156;

    @OriginalMember(owner = "g", name = "b", descriptor = "[Lg;")
    private static AnimFrame[] field149;

    @OriginalMember(owner = "g", name = "j", descriptor = "[Z")
    private static boolean[] field157;

    @OriginalMember(owner = "g", name = "a", descriptor = "(I)V")
    public static void method44(int arg0) {
        field149 = new AnimFrame[arg0 + 1];
        field157 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field157[var1] = true;
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(I[B)V")
    public static void method45(int arg0, byte[] arg1) {
        Packet var2 = new Packet(arg1, 185);
        var2.field708 = arg1.length - 8;
        int var3 = var2.method227();
        int var4 = var2.method227();
        int var5 = var2.method227();
        int var6 = var2.method227();
        byte var7 = 0;
        Packet var8 = new Packet(arg1, 185);
        var8.field708 = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(arg1, 185);
        if (arg0 >= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        var10.field708 = var9;
        int var12 = var4 + var9;
        Packet var13 = new Packet(arg1, 185);
        var13.field708 = var12;
        int var14 = var5 + var12;
        Packet var15 = new Packet(arg1, 185);
        var15.field708 = var14;
        int var16 = var6 + var14;
        Packet var17 = new Packet(arg1, 185);
        var17.field708 = var16;
        AnimBase var18 = new AnimBase(true, var17);
        int var19 = var8.method227();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method227();
            AnimFrame var26 = field149[var25] = new AnimFrame();
            var26.field150 = var15.method225();
            var26.field151 = var18;
            int var27 = var8.method225();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method225();
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
                        var21[var29] = var13.method238();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var13.method238();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var13.method238();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field146[var30] == 5) {
                        field157[var25] = false;
                    }
                }
            }
            var26.field152 = var29;
            var26.field153 = new int[var29];
            var26.field154 = new int[var29];
            var26.field155 = new int[var29];
            var26.field156 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field153[var31] = var20[var31];
                var26.field154[var31] = var21[var31];
                var26.field155[var31] = var22[var31];
                var26.field156[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "g", name = "b", descriptor = "(I)V")
    public static void method46(int arg0) {
        field149 = null;
        if (arg0 != 0) {
            field148 = !field148;
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(IB)Lg;")
    public static AnimFrame method47(int arg0, byte arg1) {
        if (arg1 != -104) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return field149 == null ? null : field149[arg0];
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(II)Z")
    public static boolean method48(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 == -1;
    }
}
