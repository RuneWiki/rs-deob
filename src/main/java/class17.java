import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FIYHSKKC")
public class class17 {

    @OriginalMember(owner = "client!FIYHSKKC", name = "a", descriptor = "I")
    private static int field721;

    @OriginalMember(owner = "client!FIYHSKKC", name = "c", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!FIYHSKKC", name = "e", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!FIYHSKKC", name = "d", descriptor = "LEHKAWURP;")
    public class12 field724;

    @OriginalMember(owner = "client!FIYHSKKC", name = "f", descriptor = "[I")
    public int[] field726;

    @OriginalMember(owner = "client!FIYHSKKC", name = "g", descriptor = "[I")
    public int[] field727;

    @OriginalMember(owner = "client!FIYHSKKC", name = "h", descriptor = "[I")
    public int[] field728;

    @OriginalMember(owner = "client!FIYHSKKC", name = "i", descriptor = "[I")
    public int[] field729;

    @OriginalMember(owner = "client!FIYHSKKC", name = "b", descriptor = "[LFIYHSKKC;")
    private static class17[] field722;

    @OriginalMember(owner = "client!FIYHSKKC", name = "j", descriptor = "[Z")
    private static boolean[] field730;

    @OriginalMember(owner = "client!FIYHSKKC", name = "a", descriptor = "(I)V")
    public static void method207(int arg0) {
        field722 = new class17[arg0 + 1];
        field730 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field730[var1] = true;
        }
    }

    @OriginalMember(owner = "client!FIYHSKKC", name = "a", descriptor = "([BB)V")
    public static void method208(byte[] arg0, byte arg1) {
        class37 var2 = new class37(arg0, -670);
        var2.field1212 = arg0.length - 8;
        int var3 = var2.method388();
        int var4 = var2.method388();
        int var5 = var2.method388();
        int var6 = var2.method388();
        byte var7 = 0;
        class37 var8 = new class37(arg0, -670);
        var8.field1212 = var7;
        int var9 = var3 + var7 + 2;
        class37 var10 = new class37(arg0, -670);
        if (arg1 == 1) {
            boolean var11 = false;
        } else {
            field721 = -444;
        }
        var10.field1212 = var9;
        int var12 = var4 + var9;
        class37 var13 = new class37(arg0, -670);
        var13.field1212 = var12;
        int var14 = var5 + var12;
        class37 var15 = new class37(arg0, -670);
        var15.field1212 = var14;
        int var16 = var6 + var14;
        class37 var17 = new class37(arg0, -670);
        var17.field1212 = var16;
        class12 var18 = new class12(var17, false);
        int var19 = var8.method388();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var8.method388();
            class17 var26 = field722[var25] = new class17();
            var26.field723 = var15.method386();
            var26.field724 = var18;
            int var27 = var8.method386();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var10.method386();
                if (var32 > 0) {
                    if (var18.field636[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field636[var33] == 0) {
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
                    if (var18.field636[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var13.method399();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var13.method399();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var13.method399();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field636[var30] == 5) {
                        field730[var25] = false;
                    }
                }
            }
            var26.field725 = var29;
            var26.field726 = new int[var29];
            var26.field727 = new int[var29];
            var26.field728 = new int[var29];
            var26.field729 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field726[var31] = var20[var31];
                var26.field727[var31] = var21[var31];
                var26.field728[var31] = var22[var31];
                var26.field729[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "client!FIYHSKKC", name = "b", descriptor = "(I)V")
    public static void method209(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            field721 = 372;
        }
        field722 = null;
    }

    @OriginalMember(owner = "client!FIYHSKKC", name = "c", descriptor = "(I)LFIYHSKKC;")
    public static class17 method210(int arg0) {
        return field722 == null ? null : field722[arg0];
    }

    @OriginalMember(owner = "client!FIYHSKKC", name = "a", descriptor = "(II)Z")
    public static boolean method211(int arg0, int arg1) {
        if (arg1 != 47525) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg0 == -1;
    }
}
