import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "a", descriptor = "I")
    private static int field146 = -32;

    @OriginalMember(owner = "g", name = "d", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "g", name = "f", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "g", name = "e", descriptor = "Lf;")
    public AnimBase field150;

    @OriginalMember(owner = "g", name = "b", descriptor = "Z")
    private static boolean field147;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field152;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field153;

    @OriginalMember(owner = "g", name = "i", descriptor = "[I")
    public int[] field154;

    @OriginalMember(owner = "g", name = "j", descriptor = "[I")
    public int[] field155;

    @OriginalMember(owner = "g", name = "c", descriptor = "[Lg;")
    private static AnimFrame[] field148;

    @OriginalMember(owner = "g", name = "k", descriptor = "[Z")
    private static boolean[] field156;

    @OriginalMember(owner = "g", name = "a", descriptor = "(I)V")
    public static void method44(int arg0) {
        field148 = new AnimFrame[arg0 + 1];
        field156 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field156[var1] = true;
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "([BB)V")
    public static void method45(byte[] arg0, byte arg1) {
        if (arg1 != 35) {
            return;
        }
        Packet var2 = new Packet(arg0, (byte) -93);
        var2.field713 = arg0.length - 8;
        int var3 = var2.method231();
        int var4 = var2.method231();
        int var5 = var2.method231();
        int var6 = var2.method231();
        byte var7 = 0;
        Packet var8 = new Packet(arg0, (byte) -93);
        var8.field713 = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(arg0, (byte) -93);
        var10.field713 = var9;
        int var11 = var4 + var9;
        Packet var12 = new Packet(arg0, (byte) -93);
        var12.field713 = var11;
        int var13 = var5 + var11;
        Packet var14 = new Packet(arg0, (byte) -93);
        var14.field713 = var13;
        int var15 = var6 + var13;
        Packet var16 = new Packet(arg0, (byte) -93);
        var16.field713 = var15;
        AnimBase var17 = new AnimBase(var16, -238);
        int var18 = var8.method231();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method231();
            AnimFrame var25 = field148[var24] = new AnimFrame();
            var25.field149 = var14.method229();
            var25.field150 = var17;
            int var26 = var8.method229();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method229();
                if (var31 > 0) {
                    if (var17.field144[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field144[var32] == 0) {
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
                    if (var17.field144[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method242();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method242();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method242();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field144[var29] == 5) {
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

    @OriginalMember(owner = "g", name = "a", descriptor = "(Z)V")
    public static void method46(boolean arg0) {
        field148 = null;
        if (arg0) {
            field146 = -449;
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(BI)Lg;")
    public static AnimFrame method47(byte arg0, int arg1) {
        if (arg0 != -14) {
            field147 = !field147;
        }
        return field148 == null ? null : field148[arg1];
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(II)Z")
    public static boolean method48(int arg0, int arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return arg1 == -1;
    }
}
