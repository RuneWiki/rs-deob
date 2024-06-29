import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class136 {

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "Z")
    public static boolean field111 = false;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Lpd;")
    private static class94 field109 = class28.method249(25, "Welcome to RuneScape");

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field118 = 0;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Lpd;")
    public static class94 field116 = class28.method249(-99, "headicons_hint");

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "Lpd;")
    public static class94 field121 = field109;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field126 = 0;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "Lpd;")
    private static class94 field128 = class28.method249(41, "Enter name of player to add to list");

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Lpd;")
    public static class94 field113 = field128;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "Ls;")
    public static class111 field122;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "[I")
    public static int[] field114;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "[I")
    public int[] field115;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "[I")
    public int[] field123;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "[I")
    public int[] field127;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "[Ltd;")
    public class118[] field119;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "[Ltd;")
    public class118[] field124;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "[[[B")
    public byte[][][] field125;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBIIII)V", line = 5)
    public static final void method35(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field112++;
        if (class19.field522 == arg0 && class75.field1838 == arg2 && (class102.field2581 == arg5 || !class115.field2912)) {
            return;
        }
        class19.field522 = arg0;
        class75.field1838 = arg2;
        class102.field2581 = arg5;
        if (!class115.field2912) {
            class102.field2581 = 0;
        }
        class1.method6(false, 25);
        class135.method1065(false, (byte) 124, class84.field2125, null);
        int var6 = class45.field1117;
        int var7 = class31.field891;
        class31.field891 = (arg0 - 6) * 8;
        int var8 = class31.field891 - var7;
        class45.field1117 = (arg2 - 6) * 8;
        int var9 = class31.field891;
        int var10 = class45.field1117 - var6;
        int var11 = class45.field1117;
        for (int var12 = 0; var12 < 32768; var12++) {
            class80 var29 = class28.field803[var12];
            if (var29 != null) {
                for (int var30 = 0; var30 < 10; var30++) {
                    var29.field165[var30] -= var8;
                    var29.field219[var30] -= var10;
                }
                var29.field222 -= var10 * 128;
                var29.field177 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class89 var27 = class85.field2138[var13];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field165[var28] -= var8;
                    var27.field219[var28] -= var10;
                }
                var27.field177 -= var8 * 128;
                var27.field222 -= var10 * 128;
            }
        }
        class64.field1589 = arg5;
        class80.field2044.method46(false, arg3, 0, arg4);
        int var14 = 73 / ((arg1 + 66) / 32);
        byte var15 = 0;
        byte var16 = 1;
        byte var17 = 0;
        byte var18 = 104;
        if (var8 < 0) {
            var18 = -1;
            var15 = 103;
            var16 = -1;
        }
        byte var19 = 104;
        byte var20 = 1;
        if (var10 < 0) {
            var17 = 103;
            var20 = -1;
            var19 = -1;
        }
        for (int var21 = var15; var21 != var18; var21 += var16) {
            for (int var23 = var17; var23 != var19; var23 += var20) {
                int var24 = var8 + var21;
                int var25 = var10 + var23;
                for (int var26 = 0; var26 < 4; var26++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                        class9.field243[var26][var21][var23] = class9.field243[var26][var24][var25];
                    } else {
                        class9.field243[var26][var21][var23] = null;
                    }
                }
            }
        }
        for (class37 var22 = (class37) class39.field1007.method895(-14156); var22 != null; var22 = (class37) class39.field1007.method893(true)) {
            var22.field967 -= var8;
            var22.field962 -= var10;
            if (var22.field967 < 0 || var22.field962 < 0 || var22.field967 >= 104 || var22.field962 >= 104) {
                var22.method1074((byte) -28);
            }
        }
        class9.field245 = 0;
        if (class14.field355 != 0) {
            class14.field355 -= var8;
            class12.field306 -= var10;
        }
        class101.field2559 = false;
        class25.field680 = -1;
        class102.field2564.method888(7107);
        class1.field40.method888(7107);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 183)
    public static void method36(int arg0) {
        if (arg0 != 104) {
            return;
        }
        field109 = null;
        field122 = null;
        field114 = null;
        field116 = null;
        field113 = null;
        field121 = null;
        field128 = null;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 237)
    public static final void method37(int arg0) {
        field110++;
        class86.field2185 = new class4(32);
        if (arg0 < 113) {
            method36(-25);
        }
    }
}
