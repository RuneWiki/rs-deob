import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("h")
public class AnimFrame {

    @OriginalMember(owner = "h", name = "a", descriptor = "I")
    private static int field155 = 336;

    @OriginalMember(owner = "h", name = "c", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "h", name = "e", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "h", name = "d", descriptor = "Lg;")
    public AnimBase field158;

    @OriginalMember(owner = "h", name = "f", descriptor = "[I")
    public int[] field160;

    @OriginalMember(owner = "h", name = "g", descriptor = "[I")
    public int[] field161;

    @OriginalMember(owner = "h", name = "h", descriptor = "[I")
    public int[] field162;

    @OriginalMember(owner = "h", name = "i", descriptor = "[I")
    public int[] field163;

    @OriginalMember(owner = "h", name = "b", descriptor = "[Lh;")
    private static AnimFrame[] field156;

    @OriginalMember(owner = "h", name = "a", descriptor = "(I)V")
    public static void method57(int arg0) {
        field156 = new AnimFrame[arg0 + 1];
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(I[B)V")
    public static void method58(int arg0, byte[] arg1) {
        Packet var2 = new Packet(arg1, true);
        var2.field698 = arg1.length - 8;
        int var3 = var2.method233();
        int var4 = var2.method233();
        int var5 = var2.method233();
        int var6 = var2.method233();
        byte var7 = 0;
        Packet var8 = new Packet(arg1, true);
        var8.field698 = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(arg1, true);
        var10.field698 = var9;
        int var11 = var4 + var9;
        Packet var12 = new Packet(arg1, true);
        var12.field698 = var11;
        int var13 = var5 + var11;
        Packet var14 = new Packet(arg1, true);
        if (arg0 >= 0) {
            field155 = 9;
        }
        var14.field698 = var13;
        int var15 = var6 + var13;
        Packet var16 = new Packet(arg1, true);
        var16.field698 = var15;
        AnimBase var17 = new AnimBase(0, var16);
        int var18 = var8.method233();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method233();
            AnimFrame var25 = field156[var24] = new AnimFrame();
            var25.field157 = var14.method231();
            var25.field158 = var17;
            int var26 = var8.method231();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method231();
                if (var31 > 0) {
                    if (var17.field153[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field153[var32] == 0) {
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
                    if (var17.field153[var19[var28]] == 3) {
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
            var25.field159 = var28;
            var25.field160 = new int[var28];
            var25.field161 = new int[var28];
            var25.field162 = new int[var28];
            var25.field163 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field160[var30] = var19[var30];
                var25.field161[var30] = var20[var30];
                var25.field162[var30] = var21[var30];
                var25.field163[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(B)V")
    public static void method59(byte arg0) {
        field156 = null;
        if (arg0 != 7) {
            field155 = -490;
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(II)Lh;")
    public static AnimFrame method60(int arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        } else if (field156 == null) {
            return null;
        } else {
            return field156[arg0];
        }
    }
}
