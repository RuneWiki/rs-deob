import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class87 extends class75 {

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field1911 = 0;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Lod;")
    public static class101 field1915 = class46.method335(116, "::noclip");

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Z")
    public static boolean field1910 = false;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field1919 = 0;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "[I")
    public static int[] field1921 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!md", name = "L", descriptor = "[I")
    public static int[] field1916 = new int[2000];

    @OriginalMember(owner = "client!md", name = "H", descriptor = "Z")
    public static volatile boolean field1912 = true;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "Lod;")
    private static class101 field1922 = class46.method335(-66, "Your account has been disabled)3");

    @OriginalMember(owner = "client!md", name = "T", descriptor = "Lod;")
    public static class101 field1924 = class46.method335(104, "");

    @OriginalMember(owner = "client!md", name = "U", descriptor = "Lod;")
    public static class101 field1925 = class46.method335(-89, "blaugr-Un:");

    @OriginalMember(owner = "client!md", name = "I", descriptor = "Lod;")
    public static class101 field1913 = field1922;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "B")
    public byte field1920;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "Lt;")
    public class132 field1914;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBI)V")
    public static final void method624(int arg0, int arg1, byte arg2, int arg3) {
        class49.method367(13057);
        class38.method278(arg1, arg0, class6.field79.field2572 + arg1, class6.field79.field2574 + arg0);
        if (class32.field842 == 2 || class32.field842 == 5) {
            class38.method279(arg1 + 25, arg0 - -5, 0, class10.field147, class119.field2633);
        } else {
            int var4 = class82.field1778.field1341 / 32 + 48;
            int var5 = 464 - class82.field1778.field1298 / 32;
            int var6 = class97.field2100 + class79.field1652 & 0x7FF;
            class130.field2956.method927(arg1 + 25, arg0 + 5, 146, 151, var4, var5, var6, class141.field3260 + 256, class10.field147, class119.field2633);
            for (int var7 = 0; var7 < class112.field2405; var7++) {
                int var37 = class6.field92[var7] * 4 + 2 - class82.field1778.field1341 / 32;
                int var38 = class85.field1854[var7] * 4 + 2 - class82.field1778.field1298 / 32;
                class98.method679(arg0, class127.field2899[var7], arg1, var37, false, var38);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class78 var34 = class54.field1219[class95.field2040][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class82.field1778.field1341 / 32;
                        int var36 = var33 * 4 + 2 - class82.field1778.field1298 / 32;
                        class98.method679(arg0, class143.field3301[0], arg1, var35, false, var36);
                    }
                }
            }
            for (int var9 = 0; var9 < class40.field959; var9++) {
                class62 var29 = class18.field376[class73.field1586[var9]];
                if (var29 != null && var29.method95(-21094)) {
                    class115 var30 = var29.field1374;
                    if (var30 != null && var30.field2555 != null) {
                        var30 = var30.method879((byte) 49);
                    }
                    if (var30 != null && var30.field2539 && var30.field2518) {
                        int var31 = var29.field1341 / 32 - class82.field1778.field1341 / 32;
                        int var32 = var29.field1298 / 32 - class82.field1778.field1298 / 32;
                        class98.method679(arg0, class143.field3301[1], arg1, var31, false, var32);
                    }
                }
            }
            for (int var10 = 0; var10 < class150.field3442; var10++) {
                class13 var21 = class94.field2032[class143.field3285[var10]];
                if (var21 != null && var21.method95(-21094)) {
                    int var22 = var21.field1298 / 32 - class82.field1778.field1298 / 32;
                    int var23 = var21.field1341 / 32 - class82.field1778.field1341 / 32;
                    boolean var24 = false;
                    long var25 = var21.field276.method717(-96);
                    for (int var27 = 0; var27 < class101.field2205; var27++) {
                        if (class39.field929[var27] == var25 && class78.field1623[var27] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class82.field1778.field285 != 0 && var21.field285 != 0 && class82.field1778.field285 == var21.field285) {
                        var28 = true;
                    }
                    if (var24) {
                        class98.method679(arg0, class143.field3301[3], arg1, var23, false, var22);
                    } else if (var28) {
                        class98.method679(arg0, class143.field3301[4], arg1, var23, false, var22);
                    } else {
                        class98.method679(arg0, class143.field3301[2], arg1, var23, false, var22);
                    }
                }
            }
            if (class31.field801 != 0 && class143.field3305 % 20 < 10) {
                if (class31.field801 == 1 && class7.field97 >= 0 && class18.field376.length > class7.field97) {
                    class62 var11 = class18.field376[class7.field97];
                    if (var11 != null) {
                        int var12 = var11.field1341 / 32 - class82.field1778.field1341 / 32;
                        int var13 = var11.field1298 / 32 - class82.field1778.field1298 / 32;
                        class149.method1163(arg2 + 238, class138.field3209[1], var13, arg1, arg0, var12);
                    }
                }
                if (class31.field801 == 2) {
                    int var14 = (class40.field961 - class56.field1260) * 4 + 2 - class82.field1778.field1341 / 32;
                    int var15 = (class97.field2101 - class75.field1597) * 4 + 2 - class82.field1778.field1298 / 32;
                    class149.method1163(116, class138.field3209[1], var15, arg1, arg0, var14);
                }
                if (class31.field801 == 10 && class142.field3272 >= 0 && class94.field2032.length > class142.field3272) {
                    class13 var16 = class94.field2032[class142.field3272];
                    if (var16 != null) {
                        int var17 = var16.field1298 / 32 - class82.field1778.field1298 / 32;
                        int var18 = var16.field1341 / 32 - class82.field1778.field1341 / 32;
                        class149.method1163(-127, class138.field3209[1], var17, arg1, arg0, var18);
                    }
                }
            }
            if (class130.field2973 != 0) {
                int var19 = class152.field3470 * 4 + 2 - class82.field1778.field1298 / 32;
                int var20 = class130.field2973 * 4 + 2 - class82.field1778.field1341 / 32;
                class98.method679(arg0, class138.field3209[0], arg1, var20, false, var19);
            }
            class38.method275(arg1 + 93 + 4, arg0 + 82 - 4, 3, 3, 16777215);
        }
        if (class32.field842 < 3) {
            class31.field800.method927(arg1, arg0, 33, 33, 25, 25, class97.field2100, 256, class12.field253, class43.field1032);
        } else {
            class38.method279(arg1, arg0, 0, class12.field253, class43.field1032);
        }
        if (class78.field1626[arg3]) {
            class6.field79.method884(arg1, arg0);
        }
        class132.field3021[arg3] = true;
        if (arg2 != -113) {
            field1924 = null;
        }
        field1917++;
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V")
    public static void method625(int arg0) {
        field1913 = null;
        field1922 = null;
        field1921 = null;
        field1925 = null;
        field1924 = null;
        if (arg0 != 25654) {
            method625(-26);
        }
        field1916 = null;
        field1915 = null;
    }
}
