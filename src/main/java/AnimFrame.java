import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("h")
public class AnimFrame {

    @OriginalMember(owner = "h", name = "a", descriptor = "I")
    private static int field162 = 43763;

    @OriginalMember(owner = "h", name = "d", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "h", name = "f", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "h", name = "e", descriptor = "Lg;")
    public AnimBase field166;

    @OriginalMember(owner = "h", name = "b", descriptor = "Z")
    private static boolean field163;

    @OriginalMember(owner = "h", name = "g", descriptor = "[I")
    public int[] field168;

    @OriginalMember(owner = "h", name = "h", descriptor = "[I")
    public int[] field169;

    @OriginalMember(owner = "h", name = "i", descriptor = "[I")
    public int[] field170;

    @OriginalMember(owner = "h", name = "j", descriptor = "[I")
    public int[] field171;

    @OriginalMember(owner = "h", name = "c", descriptor = "[Lh;")
    private static AnimFrame[] field164;

    @OriginalMember(owner = "h", name = "a", descriptor = "(I)V")
    public static void method58(int arg0) {
        field164 = new AnimFrame[arg0 + 1];
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(Z[B)V")
    public static void method59(boolean arg0, byte[] arg1) {
        Packet var2 = new Packet(arg1, false);
        var2.field713 = arg1.length - 8;
        int var3 = var2.method240();
        int var4 = var2.method240();
        int var5 = var2.method240();
        int var6 = var2.method240();
        byte var7 = 0;
        Packet var8 = new Packet(arg1, false);
        var8.field713 = var7;
        if (!arg0) {
            field162 = -78;
        }
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(arg1, false);
        var10.field713 = var9;
        int var11 = var4 + var9;
        Packet var12 = new Packet(arg1, false);
        var12.field713 = var11;
        int var13 = var5 + var11;
        Packet var14 = new Packet(arg1, false);
        var14.field713 = var13;
        int var15 = var6 + var13;
        Packet var16 = new Packet(arg1, false);
        var16.field713 = var15;
        AnimBase var17 = new AnimBase(false, var16);
        int var18 = var8.method240();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method240();
            AnimFrame var25 = field164[var24] = new AnimFrame();
            var25.field165 = var14.method238();
            var25.field166 = var17;
            int var26 = var8.method238();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method238();
                if (var31 > 0) {
                    if (var17.field160[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field160[var32] == 0) {
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
                    if (var17.field160[var19[var28]] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method251();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method251();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method251();
                    }
                    var27 = var29;
                    var28++;
                }
            }
            var25.field167 = var28;
            var25.field168 = new int[var28];
            var25.field169 = new int[var28];
            var25.field170 = new int[var28];
            var25.field171 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field168[var30] = var19[var30];
                var25.field169[var30] = var20[var30];
                var25.field170[var30] = var21[var30];
                var25.field171[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(B)V")
    public static void method60(byte arg0) {
        field164 = null;
        if (arg0 == 6) {
            boolean var1 = false;
        } else {
            field163 = !field163;
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(II)Lh;")
    public static AnimFrame method61(int arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        } else if (field164 == null) {
            return null;
        } else {
            return field164[arg0];
        }
    }
}
