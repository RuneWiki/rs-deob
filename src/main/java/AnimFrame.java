import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JULFQTYK")
public class AnimFrame {

    @OriginalMember(owner = "client!JULFQTYK", name = "a", descriptor = "I")
    private static int field927 = 217;

    @OriginalMember(owner = "client!JULFQTYK", name = "d", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!JULFQTYK", name = "f", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!JULFQTYK", name = "e", descriptor = "LVPIFXIOD;")
    public AnimBase field931;

    @OriginalMember(owner = "client!JULFQTYK", name = "b", descriptor = "Z")
    private static boolean field928;

    @OriginalMember(owner = "client!JULFQTYK", name = "g", descriptor = "[I")
    public int[] field933;

    @OriginalMember(owner = "client!JULFQTYK", name = "h", descriptor = "[I")
    public int[] field934;

    @OriginalMember(owner = "client!JULFQTYK", name = "i", descriptor = "[I")
    public int[] field935;

    @OriginalMember(owner = "client!JULFQTYK", name = "j", descriptor = "[I")
    public int[] field936;

    @OriginalMember(owner = "client!JULFQTYK", name = "c", descriptor = "[LJULFQTYK;")
    private static AnimFrame[] field929;

    @OriginalMember(owner = "client!JULFQTYK", name = "k", descriptor = "[Z")
    private static boolean[] field937;

    @OriginalMember(owner = "client!JULFQTYK", name = "a", descriptor = "(I)V")
    public static void method261(int arg0) {
        field929 = new AnimFrame[arg0 + 1];
        field937 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field937[var1] = true;
        }
    }

    @OriginalMember(owner = "client!JULFQTYK", name = "a", descriptor = "([BZ)V")
    public static void method262(byte[] arg0, boolean arg1) {
        Packet var2 = new Packet(true, arg0);
        var2.pos = arg0.length - 8;
        int var3 = var2.g2();
        int var4 = var2.g2();
        int var5 = var2.g2();
        if (!arg1) {
            return;
        }
        int var6 = var2.g2();
        byte var7 = 0;
        Packet var8 = new Packet(true, arg0);
        var8.pos = var7;
        int var9 = var3 + var7 + 2;
        Packet var10 = new Packet(true, arg0);
        var10.pos = var9;
        int var11 = var4 + var9;
        Packet var12 = new Packet(true, arg0);
        var12.pos = var11;
        int var13 = var5 + var11;
        Packet var14 = new Packet(true, arg0);
        var14.pos = var13;
        int var15 = var6 + var13;
        Packet var16 = new Packet(true, arg0);
        var16.pos = var15;
        AnimBase var17 = new AnimBase(var16, 0);
        int var18 = var8.g2();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.g2();
            AnimFrame var25 = field929[var24] = new AnimFrame();
            var25.field930 = var14.g1();
            var25.field931 = var17;
            int var26 = var8.g1();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.g1();
                if (var31 > 0) {
                    if (var17.field1501[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field1501[var32] == 0) {
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
                    if (var17.field1501[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.gsmart();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.gsmart();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.gsmart();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field1501[var29] == 5) {
                        field937[var24] = false;
                    }
                }
            }
            var25.field932 = var28;
            var25.field933 = new int[var28];
            var25.field934 = new int[var28];
            var25.field935 = new int[var28];
            var25.field936 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field933[var30] = var19[var30];
                var25.field934[var30] = var20[var30];
                var25.field935[var30] = var21[var30];
                var25.field936[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!JULFQTYK", name = "a", descriptor = "(Z)V")
    public static void method263(boolean arg0) {
        if (arg0) {
            field927 = 189;
        }
        field929 = null;
    }

    @OriginalMember(owner = "client!JULFQTYK", name = "b", descriptor = "(I)LJULFQTYK;")
    public static AnimFrame method264(int arg0) {
        return field929 == null ? null : field929[arg0];
    }

    @OriginalMember(owner = "client!JULFQTYK", name = "a", descriptor = "(ZI)Z")
    public static boolean method265(boolean arg0, int arg1) {
        if (!arg0) {
            field928 = !field928;
        }
        return arg1 == -1;
    }
}
