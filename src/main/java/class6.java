import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BKYAWERN")
public class class6 {

    @OriginalMember(owner = "client!BKYAWERN", name = "a", descriptor = "Z")
    private static boolean field92 = true;

    @OriginalMember(owner = "client!BKYAWERN", name = "c", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!BKYAWERN", name = "e", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!BKYAWERN", name = "d", descriptor = "LGCTCRUHH;")
    public class18 field95;

    @OriginalMember(owner = "client!BKYAWERN", name = "i", descriptor = "[I")
    public int[] field100;

    @OriginalMember(owner = "client!BKYAWERN", name = "f", descriptor = "[I")
    public int[] field97;

    @OriginalMember(owner = "client!BKYAWERN", name = "g", descriptor = "[I")
    public int[] field98;

    @OriginalMember(owner = "client!BKYAWERN", name = "h", descriptor = "[I")
    public int[] field99;

    @OriginalMember(owner = "client!BKYAWERN", name = "b", descriptor = "[LBKYAWERN;")
    private static class6[] field93;

    @OriginalMember(owner = "client!BKYAWERN", name = "j", descriptor = "[Z")
    private static boolean[] field101;

    @OriginalMember(owner = "client!BKYAWERN", name = "a", descriptor = "(I)V")
    public static void method111(int arg0) {
        field93 = new class6[arg0 + 1];
        field101 = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            field101[var1] = true;
        }
    }

    @OriginalMember(owner = "client!BKYAWERN", name = "a", descriptor = "([BI)V")
    public static void method112(byte[] arg0, int arg1) {
        class3 var2 = new class3(arg0, -990);
        var2.field50 = arg0.length - 8;
        int var3 = var2.method56();
        int var4 = var2.method56();
        if (arg1 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = var2.method56();
        int var7 = var2.method56();
        byte var8 = 0;
        class3 var9 = new class3(arg0, -990);
        var9.field50 = var8;
        int var10 = var3 + var8 + 2;
        class3 var11 = new class3(arg0, -990);
        var11.field50 = var10;
        int var12 = var4 + var10;
        class3 var13 = new class3(arg0, -990);
        var13.field50 = var12;
        int var14 = var6 + var12;
        class3 var15 = new class3(arg0, -990);
        var15.field50 = var14;
        int var16 = var7 + var14;
        class3 var17 = new class3(arg0, -990);
        var17.field50 = var16;
        class18 var18 = new class18(-10875, var17);
        int var19 = var9.method56();
        int[] var20 = new int[500];
        int[] var21 = new int[500];
        int[] var22 = new int[500];
        int[] var23 = new int[500];
        for (int var24 = 0; var24 < var19; var24++) {
            int var25 = var9.method56();
            class6 var26 = field93[var25] = new class6();
            var26.field94 = var15.method54();
            var26.field95 = var18;
            int var27 = var9.method54();
            int var28 = -1;
            int var29 = 0;
            for (int var30 = 0; var30 < var27; var30++) {
                int var32 = var11.method54();
                if (var32 > 0) {
                    if (var18.field846[var30] != 0) {
                        for (int var33 = var30 - 1; var33 > var28; var33--) {
                            if (var18.field846[var33] == 0) {
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
                    if (var18.field846[var30] == 3) {
                        var34 = 128;
                    }
                    if ((var32 & 0x1) == 0) {
                        var21[var29] = var34;
                    } else {
                        var21[var29] = var13.method67();
                    }
                    if ((var32 & 0x2) == 0) {
                        var22[var29] = var34;
                    } else {
                        var22[var29] = var13.method67();
                    }
                    if ((var32 & 0x4) == 0) {
                        var23[var29] = var34;
                    } else {
                        var23[var29] = var13.method67();
                    }
                    var28 = var30;
                    var29++;
                    if (var18.field846[var30] == 5) {
                        field101[var25] = false;
                    }
                }
            }
            var26.field96 = var29;
            var26.field97 = new int[var29];
            var26.field98 = new int[var29];
            var26.field99 = new int[var29];
            var26.field100 = new int[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                var26.field97[var31] = var20[var31];
                var26.field98[var31] = var21[var31];
                var26.field99[var31] = var22[var31];
                var26.field100[var31] = var23[var31];
            }
        }
    }

    @OriginalMember(owner = "client!BKYAWERN", name = "b", descriptor = "(I)V")
    public static void method113(int arg0) {
        field93 = null;
        int var1 = 51 / arg0;
    }

    @OriginalMember(owner = "client!BKYAWERN", name = "c", descriptor = "(I)LBKYAWERN;")
    public static class6 method114(int arg0) {
        return field93 == null ? null : field93[arg0];
    }

    @OriginalMember(owner = "client!BKYAWERN", name = "a", descriptor = "(BI)Z")
    public static boolean method115(byte arg0, int arg1) {
        if (arg0 != 7) {
            field92 = !field92;
        }
        return arg1 == -1;
    }
}
