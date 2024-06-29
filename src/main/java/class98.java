import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class98 extends class6 {

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "Loh;")
    public static class258 field1748 = class153.method1046("<col=ffff00>", 95);

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "Loh;")
    public static class258 field1746 = class153.method1046(")4p=", 95);

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Loh;")
    public static class258 field1744 = class153.method1046(")1", 114);

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "[Lba;")
    public static class51[] field1753 = new class51[27];

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "[Z")
    public static boolean[] field1754 = new boolean[200];

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "Loh;")
    public static class258 field1750 = class153.method1046("Abbrechen", 122);

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "Loh;")
    public class258 field1751;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "Loh;")
    public class258 field1752;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "[I")
    public static int[] field1749;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)Lmg;", line = 13)
    public final class105 method741(int arg0) {
        field1742++;
        return arg0 == 1 ? class310.field5256[this.field86] : (class105) null;
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V", line = 43)
    public static void method742(int arg0) {
        field1748 = null;
        field1746 = null;
        field1750 = null;
        field1744 = null;
        field1749 = null;
        field1754 = null;
        field1753 = null;
        if (arg0 != 16777215) {
            field1748 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIIIII)V", line = 65)
    public static final void method743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1745++;
        int var11 = arg3 - arg10;
        int var12 = arg0 - arg6;
        boolean var13;
        if (class61.field1090 > 0 && class61.field1090 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg9;
        int var15 = 983040 / arg1;
        if (arg7 != 26284) {
            method742(17);
        }
        for (int var16 = -var14; var16 < (var12 + var14); var16++) {
            int var17 = arg9 * var16 + arg8 >> 16;
            int var18 = (var16 + 1) * arg9 + arg8 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var10000 = arg2 + var18;
                int var21 = arg2 + var17;
                int var22 = var16 + arg6 >> 6;
                if (var22 >= 0 && var22 <= (class272.field4710.length - 1)) {
                    int[][] var23 = class272.field4710[var22];
                    for (int var24 = -var15; var24 < var11 + var15; var24++) {
                        int var25 = arg4 + ((var24 + 1) * arg1) >> 16;
                        int var26 = arg1 * var24 + arg4 >> 16;
                        int var27 = var25 - var26;
                        if (var27 > 0) {
                            int var28 = arg5 + var26;
                            var10000 = arg5 + var25;
                            int var30 = arg10 + var24 >> 6;
                            if (var30 >= 0 && (var23.length - 1) >= var30 && var23[var30] != null) {
                                int var31 = ((arg10 + var24 & 0x3F) << 6) + (var16 + arg6 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class101 var33 = class123.method898(arg7 - 27219, var32 - 1);
                                    if (var13 && class106.field1896 == var33.field1848) {
                                        class237 var34 = new class237();
                                        var34.field4142 = var28;
                                        var34.field4144 = var33.field1848;
                                        var34.field4150 = var21;
                                        class70.field1218.method82(var34, (byte) -39);
                                    }
                                    class82.field1384[var33.field1848].method327(var21 - 7, var28 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class237 var35 = (class237) class70.field1218.method83(arg7 - 26351); var35 != null; var35 = (class237) class70.field1218.method87((byte) -80)) {
            class82.field1384[var35.field4144].method327(var35.field4150 - 7, var35.field4142 + -7);
            class211.method1405(var35.field4150, var35.field4142, 15, 16776960, 128);
            class211.method1405(var35.field4150, var35.field4142, 7, 16777215, 256);
        }
        class70.field1218.method80(0);
    }
}
