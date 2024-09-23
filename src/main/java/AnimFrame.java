import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("h")
public class AnimFrame {

    @OriginalMember(owner = "h", name = "a", descriptor = "Z")
    private static boolean field156 = true;

    @OriginalMember(owner = "h", name = "c", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "h", name = "e", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "h", name = "d", descriptor = "Lg;")
    public AnimBase field159;

    @OriginalMember(owner = "h", name = "f", descriptor = "[I")
    public int[] field161;

    @OriginalMember(owner = "h", name = "g", descriptor = "[I")
    public int[] field162;

    @OriginalMember(owner = "h", name = "h", descriptor = "[I")
    public int[] field163;

    @OriginalMember(owner = "h", name = "i", descriptor = "[I")
    public int[] field164;

    @OriginalMember(owner = "h", name = "b", descriptor = "[Lh;")
    private static AnimFrame[] field157;

    @OriginalMember(owner = "h", name = "j", descriptor = "[Z")
    private static boolean[] field165;

    @OriginalMember(owner = "h", name = "a", descriptor = "(I)V")
    public static void method58(int arg0) {
        field157 = new AnimFrame[arg0 + 1];
        field165 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field165[var1] = true;
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(I[B)V")
    public static void method59(int arg0, byte[] arg1) {
        Packet var2 = new Packet(arg1, 337);
        var2.field710 = arg1.length - 8;
        int var3 = var2.method241();
        int var4 = var2.method241();
        int var5 = var2.method241();
        int var6 = var2.method241();
        byte var7 = 0;
        Packet var8 = new Packet(arg1, 337);
        var8.field710 = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(arg1, 337);
        var10.field710 = var9;
        int var11 = var4 + var9;
        Packet var12 = new Packet(arg1, 337);
        var12.field710 = var11;
        int var13 = var5 + var11;
        Packet var14 = new Packet(arg1, 337);
        var14.field710 = var13;
        int var15 = var6 + var13;
        Packet var16 = new Packet(arg1, 337);
        var16.field710 = var15;
        AnimBase var17 = new AnimBase(var16, field156);
        int var18 = var8.method241();
        if (arg0 >= 0) {
            return;
        }
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method241();
            AnimFrame var25 = field157[var24] = new AnimFrame();
            var25.field158 = var14.method239();
            var25.field159 = var17;
            int var26 = var8.method239();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method239();
                if (var31 > 0) {
                    if (var17.field154[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field154[var32] == 0) {
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
                    if (var17.field154[var29] == 3) {
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
                    if (var17.field154[var29] == 5) {
                        field165[var24] = false;
                    }
                }
            }
            var25.field160 = var28;
            var25.field161 = new int[var28];
            var25.field162 = new int[var28];
            var25.field163 = new int[var28];
            var25.field164 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field161[var30] = var19[var30];
                var25.field162[var30] = var20[var30];
                var25.field163[var30] = var21[var30];
                var25.field164[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(Z)V")
    public static void method60(boolean arg0) {
        if (arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field157 = null;
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(IB)Lh;")
    public static AnimFrame method61(int arg0, byte arg1) {
        if (arg1 != -18) {
            throw new NullPointerException();
        }
        return field157 == null ? null : field157[arg0];
    }

    @OriginalMember(owner = "h", name = "a", descriptor = "(II)Z")
    public static boolean method62(int arg0, int arg1) {
        if (arg0 != 0) {
            field156 = !field156;
        }
        return arg1 == -1;
    }
}
