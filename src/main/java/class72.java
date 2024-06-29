import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 {

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Lec;")
    private static class32 field1693 = class73.method594("Attack", true);

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lec;")
    public static class32 field1700 = class73.method594("Bitte versuchen Sie es in ", true);

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Lec;")
    public static class32 field1705 = field1693;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1696 = 0;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field1707 = 0;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Z")
    public static boolean field1694 = false;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lec;")
    private static class32 field1697 = class73.method594("Loading)3)3)3", true);

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Lec;")
    public static class32 field1706 = class73.method594("sich mit einer anderen Welt zu verbinden)3", true);

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Lec;")
    public static class32 field1709 = field1697;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public int field1699;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public int field1703;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lga;")
    public static class44 field1702;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[B")
    public byte[] field1690;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "[B")
    public byte[] field1704;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method589(int arg0) {
        field1706 = null;
        field1700 = null;
        field1709 = null;
        field1705 = null;
        if (arg0 == 2) {
            field1702 = null;
            field1697 = null;
            field1693 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
    public static final void method590(int arg0, boolean arg1) {
        class149.field3396 += arg0 * 128;
        field1710++;
        short var2 = 256;
        if (class149.field3396 > class5.field99.length) {
            class149.field3396 -= class5.field99.length;
            int var3 = (int) (Math.random() * 12.0D);
            class71.method582(-122, class74.field1753[var3]);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class43.field999[var4 + var5] - class5.field99[class5.field99.length - 1 & class149.field3396 + var4] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class43.field999[var4++] = var27;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class43.field999[var24 + var25] = 255;
                } else {
                    class43.field999[var24 + var25] = 0;
                }
            }
        }
        if (class66.field1586 > 0) {
            class66.field1586 -= arg0 * 4;
        }
        if (class85.field1997 > 0) {
            class85.field1997 -= arg0 * 4;
        }
        if (class66.field1586 == 0 && class85.field1997 == 0) {
            int var9 = (int) ((double) (2000 / arg0) * Math.random());
            if (var9 == 0) {
                class66.field1586 = 1024;
            }
            if (var9 == 1) {
                class85.field1997 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg0; var10++) {
            class81.field1869[var10] = class81.field1869[arg0 + var10];
        }
        if (!arg1) {
            method590(-95, true);
        }
        for (int var11 = var2 - arg0; var11 < var2; var11++) {
            class81.field1869[var11] = (int) (Math.sin((double) class139.field3212 / 14.0D) * 16.0D + Math.sin((double) class139.field3212 / 15.0D) * 14.0D + Math.sin((double) class139.field3212 / 16.0D) * 12.0D);
            class139.field3212++;
        }
        int var12 = ((class140.field3219 & 0x1) + arg0) / 2;
        class53.field1221 += arg0;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class53.field1221 * 100; var13++) {
            int var22 = (int) (Math.random() * 128.0D) + 128;
            int var23 = (int) (Math.random() * 124.0D) + 2;
            class43.field999[(var22 << 7) + var23] = 192;
        }
        class53.field1221 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var21 + var12 < 128) {
                    var19 += class43.field999[var12 + var20 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class43.field999[var20 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class3.field44[var21 + var20] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var2 > var12 + var17) {
                    var16 += class3.field44[var18 + var12 * 128 + var15];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class3.field44[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class43.field999[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lea;Lec;IZILec;I)V")
    public static final void method591(class30 arg0, class32 arg1, int arg2, boolean arg3, int arg4, class32 arg5, int arg6) {
        field1695++;
        int var7 = arg0.method201(3, arg1);
        int var8 = arg0.method215(arg5, var7, true);
        class86.method668(true, arg0, arg4, arg3, var8, arg6, var7);
        if (arg2 < 20) {
            method590(-92, false);
        }
    }
}
