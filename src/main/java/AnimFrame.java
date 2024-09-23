import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("h")
public class AnimFrame {

    @OriginalMember(owner = "h", name = "a", descriptor = "Z")
    private static boolean field151 = true;

    @OriginalMember(owner = "h", name = "c", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "h", name = "e", descriptor = "I")
    public int field155;

    @OriginalMember(owner = "h", name = "d", descriptor = "Lg;")
    public AnimBase field154;

    @OriginalMember(owner = "h", name = "f", descriptor = "[I")
    public int[] field156;

    @OriginalMember(owner = "h", name = "g", descriptor = "[I")
    public int[] field157;

    @OriginalMember(owner = "h", name = "h", descriptor = "[I")
    public int[] field158;

    @OriginalMember(owner = "h", name = "i", descriptor = "[I")
    public int[] field159;

    @OriginalMember(owner = "h", name = "b", descriptor = "[Lh;")
    private static AnimFrame[] field152;

    @OriginalMember(owner = "h", name = "a", descriptor = "(I)V")
    public static void method57(int arg0) {
        field152 = new AnimFrame[arg0 + 1];
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(I[B)V")
    public static void method58(int arg0, byte[] arg1) {
        Packet var2 = new Packet(699, arg1);
        var2.field694 = arg1.length - 8;
        int var3 = var2.method233();
        int var4 = var2.method233();
        int var5 = var2.method233();
        int var6 = var2.method233();
        if (arg0 != 4) {
            return;
        }
        byte var7 = 0;
        Packet var8 = new Packet(699, arg1);
        var8.field694 = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(699, arg1);
        var10.field694 = var9;
        int var11 = var4 + var9;
        Packet var12 = new Packet(699, arg1);
        var12.field694 = var11;
        int var13 = var5 + var11;
        Packet var14 = new Packet(699, arg1);
        var14.field694 = var13;
        int var15 = var6 + var13;
        Packet var16 = new Packet(699, arg1);
        var16.field694 = var15;
        AnimBase var17 = new AnimBase((byte) 79, var16);
        int var18 = var8.method233();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method233();
            AnimFrame var25 = field152[var24] = new AnimFrame();
            var25.field153 = var14.method231();
            var25.field154 = var17;
            int var26 = var8.method231();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method231();
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
                    if (var17.field149[var19[var28]] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method244();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method244();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method244();
                    }
                    var27 = var29;
                    var28++;
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

    @OriginalMember(owner = "h", name = "a", descriptor = "(Z)V")
    public static void method59(boolean arg0) {
        field152 = null;
        if (!arg0) {
            field151 = !field151;
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(II)Lh;")
    public static AnimFrame method60(int arg0, int arg1) {
        if (arg1 != -30419) {
            throw new NullPointerException();
        }
        return field152 == null ? null : field152[arg0];
    }
}
