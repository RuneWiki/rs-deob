import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("h")
public class AnimFrame {

    @OriginalMember(owner = "h", name = "c", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "h", name = "e", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "h", name = "d", descriptor = "Lg;")
    public AnimBase field165;

    @OriginalMember(owner = "h", name = "a", descriptor = "Z")
    private static boolean field162;

    @OriginalMember(owner = "h", name = "f", descriptor = "[I")
    public int[] field167;

    @OriginalMember(owner = "h", name = "g", descriptor = "[I")
    public int[] field168;

    @OriginalMember(owner = "h", name = "h", descriptor = "[I")
    public int[] field169;

    @OriginalMember(owner = "h", name = "i", descriptor = "[I")
    public int[] field170;

    @OriginalMember(owner = "h", name = "b", descriptor = "[Lh;")
    private static AnimFrame[] field163;

    @OriginalMember(owner = "h", name = "j", descriptor = "[Z")
    private static boolean[] field171;

    @OriginalMember(owner = "h", name = "a", descriptor = "(I)V")
    public static void method58(int arg0) {
        field163 = new AnimFrame[arg0 + 1];
        field171 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field171[var1] = true;
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(I[B)V")
    public static void method59(int arg0, byte[] arg1) {
        Packet var2 = new Packet(arg1, (byte) 3);
        var2.field711 = arg1.length - 8;
        int var3 = var2.method241();
        int var4 = var2.method241();
        int var5 = var2.method241();
        int var6 = var2.method241();
        byte var7 = 0;
        Packet var8 = new Packet(arg1, (byte) 3);
        var8.field711 = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(arg1, (byte) 3);
        var10.field711 = var9;
        int var11 = var4 + var9;
        if (arg0 < 2 || arg0 > 2) {
            field162 = !field162;
        }
        Packet var12 = new Packet(arg1, (byte) 3);
        var12.field711 = var11;
        int var13 = var5 + var11;
        Packet var14 = new Packet(arg1, (byte) 3);
        var14.field711 = var13;
        int var15 = var6 + var13;
        Packet var16 = new Packet(arg1, (byte) 3);
        var16.field711 = var15;
        AnimBase var17 = new AnimBase(var16, true);
        int var18 = var8.method241();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method241();
            AnimFrame var25 = field163[var24] = new AnimFrame();
            var25.field164 = var14.method239();
            var25.field165 = var17;
            int var26 = var8.method239();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method239();
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
                    if (var17.field160[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method252();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method252();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method252();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field160[var29] == 5) {
                        field171[var24] = false;
                    }
                }
            }
            var25.field166 = var28;
            var25.field167 = new int[var28];
            var25.field168 = new int[var28];
            var25.field169 = new int[var28];
            var25.field170 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field167[var30] = var19[var30];
                var25.field168[var30] = var20[var30];
                var25.field169[var30] = var21[var30];
                var25.field170[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "h", name = "b", descriptor = "(I)V")
    public static void method60(int arg0) {
        field163 = null;
        int var1 = 94 / arg0;
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(II)Lh;")
    public static AnimFrame method61(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return field163 == null ? null : field163[arg1];
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(BI)Z")
    public static boolean method62(byte arg0, int arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return arg1 == -1;
    }
}
