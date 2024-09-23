import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "a", descriptor = "B")
    private static byte field151 = 59;

    @OriginalMember(owner = "g", name = "c", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "g", name = "e", descriptor = "I")
    public int field155;

    @OriginalMember(owner = "g", name = "d", descriptor = "Lf;")
    public AnimBase field154;

    @OriginalMember(owner = "g", name = "f", descriptor = "[I")
    public int[] field156;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field157;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field158;

    @OriginalMember(owner = "g", name = "i", descriptor = "[I")
    public int[] field159;

    @OriginalMember(owner = "g", name = "b", descriptor = "[Lg;")
    private static AnimFrame[] field152;

    @OriginalMember(owner = "g", name = "j", descriptor = "[Z")
    private static boolean[] field160;

    @OriginalMember(owner = "g", name = "a", descriptor = "(I)V")
    public static void method44(int arg0) {
        field152 = new AnimFrame[arg0 + 1];
        field160 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field160[var1] = true;
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(I[B)V")
    public static void method45(int arg0, byte[] arg1) {
        Packet var2 = new Packet(false, arg1);
        var2.field716 = arg1.length - 8;
        int var3 = var2.method231();
        int var4 = var2.method231();
        if (arg0 <= 0) {
            return;
        }
        int var5 = var2.method231();
        int var6 = var2.method231();
        byte var7 = 0;
        Packet var8 = new Packet(false, arg1);
        var8.field716 = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(false, arg1);
        var10.field716 = var9;
        int var11 = var4 + var9;
        Packet var12 = new Packet(false, arg1);
        var12.field716 = var11;
        int var13 = var5 + var11;
        Packet var14 = new Packet(false, arg1);
        var14.field716 = var13;
        int var15 = var6 + var13;
        Packet var16 = new Packet(false, arg1);
        var16.field716 = var15;
        AnimBase var17 = new AnimBase(var16, false);
        int var18 = var8.method231();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method231();
            AnimFrame var25 = field152[var24] = new AnimFrame();
            var25.field153 = var14.method229();
            var25.field154 = var17;
            int var26 = var8.method229();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method229();
                if (var31 > 0) {
                    if (var17.field149[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field149[var32] == 0) {
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
                    if (var17.field149[var29] == 3) {
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
                    if (var17.field149[var29] == 5) {
                        field160[var24] = false;
                    }
                }
            }
            var25.field155 = var28;
            var25.field156 = new int[var28];
            var25.field157 = new int[var28];
            var25.field158 = new int[var28];
            var25.field159 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field156[var30] = var19[var30];
                var25.field157[var30] = var20[var30];
                var25.field158[var30] = var21[var30];
                var25.field159[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(B)V")
    public static void method46(byte arg0) {
        if (field151 != arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field152 = null;
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(II)Lg;")
    public static AnimFrame method47(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return field152 == null ? null : field152[arg0];
    }

    @OriginalMember(owner = "g", name = "b", descriptor = "(II)Z")
    public static boolean method48(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return arg0 == -1;
    }
}
