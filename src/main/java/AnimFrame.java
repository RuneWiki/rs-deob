import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "a", descriptor = "I")
    private static int field149 = 1000;

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    private static int field150 = -47594;

    @OriginalMember(owner = "g", name = "d", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "g", name = "f", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "g", name = "e", descriptor = "Lf;")
    public AnimBase field153;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field155;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field156;

    @OriginalMember(owner = "g", name = "i", descriptor = "[I")
    public int[] field157;

    @OriginalMember(owner = "g", name = "j", descriptor = "[I")
    public int[] field158;

    @OriginalMember(owner = "g", name = "c", descriptor = "[Lg;")
    private static AnimFrame[] field151;

    @OriginalMember(owner = "g", name = "k", descriptor = "[Z")
    private static boolean[] field159;

    @OriginalMember(owner = "g", name = "a", descriptor = "(I)V")
    public static void method44(int arg0) {
        field151 = new AnimFrame[arg0 + 1];
        field159 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field159[var1] = true;
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(I[B)V")
    public static void method45(int arg0, byte[] arg1) {
        Packet var2 = new Packet(field149, arg1);
        var2.field703 = arg1.length - 8;
        int var3 = var2.method231();
        int var4 = var2.method231();
        int var5 = var2.method231();
        if (arg0 != -27141) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = var2.method231();
        byte var8 = 0;
        Packet var9 = new Packet(field149, arg1);
        var9.field703 = var8;
        int var10 = var3 + var8 + 2;
        Packet var11 = new Packet(field149, arg1);
        var11.field703 = var10;
        int var12 = var4 + var10;
        Packet var13 = new Packet(field149, arg1);
        var13.field703 = var12;
        int var14 = var5 + var12;
        Packet var15 = new Packet(field149, arg1);
        var15.field703 = var14;
        int var16 = var7 + var14;
        Packet var17 = new Packet(field149, arg1);
        var17.field703 = var16;
        AnimBase var18 = new AnimBase(var17, -694);
        int var19 = var9.method231();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var9.method231();
            AnimFrame var26 = field151[var25] = new AnimFrame();
            var26.field152 = var15.method229();
            var26.field153 = var18;
            int var27 = var9.method229();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var11.method229();
                if (var32 > 0) {
                    if (var18.field147[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field147[var33] == 0) {
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
                    if (var18.field147[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var13.method242();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var13.method242();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var13.method242();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field147[var30] == 5) {
                        field159[var25] = false;
                    }
                }
            }
            var26.field154 = var29;
            var26.field155 = new int[var29];
            var26.field156 = new int[var29];
            var26.field157 = new int[var29];
            var26.field158 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field155[var31] = var20[var31];
                var26.field156[var31] = var21[var31];
                var26.field157[var31] = var22[var31];
                var26.field158[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "g", name = "b", descriptor = "(I)V")
    public static void method46(int arg0) {
        if (arg0 >= 3 && arg0 <= 3) {
            field151 = null;
        }
    }

    @OriginalMember(owner = "g", name = "a", descriptor = "(II)Lg;")
    public static AnimFrame method47(int arg0, int arg1) {
        if (arg1 != -22323) {
            field149 = 28;
        }
        return field151 == null ? null : field151[arg0];
    }

    @OriginalMember(owner = "g", name = "b", descriptor = "(II)Z")
    public static boolean method48(int arg0, int arg1) {
        if (field150 != arg1) {
            throw new NullPointerException();
        }
        return arg0 == -1;
    }
}
