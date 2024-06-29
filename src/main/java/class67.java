import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XMRZESBN")
public class class67 {

    @OriginalMember(owner = "client!XMRZESBN", name = "a", descriptor = "I")
    private static int field1685 = 9;

    @OriginalMember(owner = "client!XMRZESBN", name = "c", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!XMRZESBN", name = "e", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!XMRZESBN", name = "d", descriptor = "LJLLLGAIH;")
    public class28 field1688;

    @OriginalMember(owner = "client!XMRZESBN", name = "f", descriptor = "[I")
    public int[] field1690;

    @OriginalMember(owner = "client!XMRZESBN", name = "g", descriptor = "[I")
    public int[] field1691;

    @OriginalMember(owner = "client!XMRZESBN", name = "h", descriptor = "[I")
    public int[] field1692;

    @OriginalMember(owner = "client!XMRZESBN", name = "i", descriptor = "[I")
    public int[] field1693;

    @OriginalMember(owner = "client!XMRZESBN", name = "b", descriptor = "[LXMRZESBN;")
    private static class67[] field1686;

    @OriginalMember(owner = "client!XMRZESBN", name = "j", descriptor = "[Z")
    private static boolean[] field1694;

    @OriginalMember(owner = "client!XMRZESBN", name = "a", descriptor = "(I)V")
    public static void method582(int arg0) {
        field1686 = new class67[arg0 + 1];
        field1694 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field1694[var1] = true;
        }
    }

    @OriginalMember(owner = "client!XMRZESBN", name = "a", descriptor = "([BB)V")
    public static void method583(byte[] arg0, byte arg1) {
        class7 var2 = new class7(arg0, (byte) 3);
        var2.field91 = arg0.length - 8;
        int var3 = var2.method49();
        int var4 = var2.method49();
        int var5 = var2.method49();
        int var6 = var2.method49();
        byte var7 = 0;
        class7 var8 = new class7(arg0, (byte) 3);
        var8.field91 = var7;
        int var9 = var3 + var7 + 2;
        class7 var10 = new class7(arg0, (byte) 3);
        if (arg1 != -75) {
            field1685 = 123;
        }
        var10.field91 = var9;
        int var11 = var4 + var9;
        class7 var12 = new class7(arg0, (byte) 3);
        var12.field91 = var11;
        int var13 = var5 + var11;
        class7 var14 = new class7(arg0, (byte) 3);
        var14.field91 = var13;
        int var15 = var6 + var13;
        class7 var16 = new class7(arg0, (byte) 3);
        var16.field91 = var15;
        class28 var17 = new class28(var16, false);
        int var18 = var8.method49();
        int[] var19 = new int[500];
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        for (int var23 = 0; var23 < var18; var23++) {
            int var24 = var8.method49();
            class67 var25 = field1686[var24] = new class67();
            var25.field1687 = var14.method47();
            var25.field1688 = var17;
            int var26 = var8.method47();
            int var27 = -1;
            int var28 = 0;
            for (int var29 = 0; var29 < var26; var29++) {
                int var31 = var10.method47();
                if (var31 > 0) {
                    if (var17.field883[var29] != 0) {
                        for (int var32 = var29 - 1; var32 > var27; var32--) {
                            if (var17.field883[var32] == 0) {
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
                    if (var17.field883[var29] == 3) {
                        var33 = 128;
                    }
                    if ((var31 & 0x1) == 0) {
                        var20[var28] = var33;
                    } else {
                        var20[var28] = var12.method60();
                    }
                    if ((var31 & 0x2) == 0) {
                        var21[var28] = var33;
                    } else {
                        var21[var28] = var12.method60();
                    }
                    if ((var31 & 0x4) == 0) {
                        var22[var28] = var33;
                    } else {
                        var22[var28] = var12.method60();
                    }
                    var27 = var29;
                    var28++;
                    if (var17.field883[var29] == 5) {
                        field1694[var24] = false;
                    }
                }
            }
            var25.field1689 = var28;
            var25.field1690 = new int[var28];
            var25.field1691 = new int[var28];
            var25.field1692 = new int[var28];
            var25.field1693 = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var25.field1690[var30] = var19[var30];
                var25.field1691[var30] = var20[var30];
                var25.field1692[var30] = var21[var30];
                var25.field1693[var30] = var22[var30];
            }
        }
    }

    @OriginalMember(owner = "client!XMRZESBN", name = "b", descriptor = "(I)V")
    public static void method584(int arg0) {
        if (arg0 >= 0) {
            field1685 = 417;
        }
        field1686 = null;
    }

    @OriginalMember(owner = "client!XMRZESBN", name = "c", descriptor = "(I)LXMRZESBN;")
    public static class67 method585(int arg0) {
        return field1686 == null ? null : field1686[arg0];
    }

    @OriginalMember(owner = "client!XMRZESBN", name = "a", descriptor = "(ZI)Z")
    public static boolean method586(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return arg1 == -1;
    }
}
