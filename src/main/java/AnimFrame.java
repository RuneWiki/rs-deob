import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "g", name = "d", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "g", name = "c", descriptor = "Lf;")
    public AnimBase field150;

    @OriginalMember(owner = "g", name = "e", descriptor = "[I")
    public int[] field152;

    @OriginalMember(owner = "g", name = "f", descriptor = "[I")
    public int[] field153;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field154;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field155;

    @OriginalMember(owner = "g", name = "a", descriptor = "[Lg;")
    private static AnimFrame[] field148;

    @OriginalMember(owner = "g", name = "i", descriptor = "[Z")
    private static boolean[] field156;

    @OriginalMember(owner = "g", name = "a", descriptor = "(I)V")
    public static void method44(int arg0) {
        field148 = new AnimFrame[arg0 + 1];
        field156 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field156[var1] = true;
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(I[B)V")
    public static void method45(int arg0, byte[] arg1) {
        Packet var2 = new Packet(arg1, (byte) 1);
        if (arg0 >= 0) {
            return;
        }
        var2.field709 = arg1.length - 8;
        int var3 = var2.method226();
        int var4 = var2.method226();
        int var5 = var2.method226();
        int var6 = var2.method226();
        byte var7 = 0;
        Packet var8 = new Packet(arg1, (byte) 1);
        var8.field709 = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(arg1, (byte) 1);
        var10.field709 = var9;
        int var11 = var4 + var9;
        Packet var12 = new Packet(arg1, (byte) 1);
        var12.field709 = var11;
        int var13 = var5 + var11;
        Packet var14 = new Packet(arg1, (byte) 1);
        var14.field709 = var13;
        int var15 = var6 + var13;
        Packet var16 = new Packet(arg1, (byte) 1);
        var16.field709 = var15;
        AnimBase var17 = new AnimBase(10470, var16);
        int var18 = var8.method226();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method226();
            AnimFrame var25 = field148[var24] = new AnimFrame();
            var25.field149 = var14.method224();
            var25.field150 = var17;
            int var26 = var8.method224();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method224();
                if (var31 > 0) {
                    if (var17.field146[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field146[var32] == 0) {
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
                    if (var17.field146[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method237();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method237();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method237();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field146[var29] == 5) {
                        field156[var24] = false;
                    }
                }
            }
            var25.field151 = var28;
            var25.field152 = new int[var28];
            var25.field153 = new int[var28];
            var25.field154 = new int[var28];
            var25.field155 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field152[var30] = var19[var30];
                var25.field153[var30] = var20[var30];
                var25.field154[var30] = var21[var30];
                var25.field155[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(B)V")
    public static void method46(byte arg0) {
        if (arg0 == 1) {
            field148 = null;
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(II)Lg;")
    public static AnimFrame method47(int arg0, int arg1) {
        if (arg1 != 6) {
            throw new NullPointerException();
        }
        return field148 == null ? null : field148[arg0];
    }

    @OriginalMember(owner = "g", name = "b", descriptor = "(II)Z")
    public static boolean method48(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 == -1;
    }
}
