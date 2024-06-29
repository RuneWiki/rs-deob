import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class101 {

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Ljl;")
    public static class332 field1655 = new class332(4);

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field1658 = -1;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field1660 = 0;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field1659 = null;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Ljl;")
    public static class332 field1657 = new class332(500);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lth;")
    public static class57 field1654;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "[[[I")
    public static int[][][] field1656;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V", line = 7)
    public static final void method784(int arg0, boolean arg1) {
        field1650++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class261.method1992(true);
        } else if (arg0 == 2) {
            class49.method386(false);
        } else if (arg0 == 3) {
            class333.method2336(arg1);
        } else {
            throw new RuntimeException();
        }
        if (!arg1) {
            field1659 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 35)
    public static void method785(int arg0) {
        field1659 = null;
        field1656 = (int[][][]) null;
        field1655 = null;
        if (arg0 == -30881) {
            field1657 = null;
            field1654 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)Lim;", line = 53)
    public static final class201 method786(boolean arg0) {
        field1651++;
        class258.field4324 = 0;
        if (arg0) {
            method786(false);
        }
        return class177.method1395(24);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)I", line = 68)
    public static final int method787(int arg0) {
        field1652++;
        if (arg0 != -101) {
            method787(-61);
        }
        if ((double) class174.field2779 == 3.0D) {
            return 37;
        } else if ((double) class174.field2779 == 4.0D) {
            return 50;
        } else if ((double) class174.field2779 == 6.0D) {
            return 75;
        } else if ((double) class174.field2779 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[B", line = 91)
    public static final synchronized byte[] method788(int arg0, int arg1) {
        field1653++;
        if (arg0 != 12244) {
            field1660 = 69;
        }
        if (arg1 == 100 && class301.field4849 > 0) {
            byte[] var2 = class25.field304[--class301.field4849];
            class25.field304[class301.field4849] = null;
            return var2;
        } else if (arg1 == 5000 && class347.field5518 > 0) {
            byte[] var3 = class61.field1030[--class347.field5518];
            class61.field1030[class347.field5518] = null;
            return var3;
        } else if (arg1 == 30000 && class176.field2817 > 0) {
            byte[] var4 = class226.field3724[--class176.field2817];
            class226.field3724[class176.field2817] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)Laj;", line = 127)
    public static final class209 method789(int arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg1 >= class273.field4526 || arg2 < 0 || arg2 >= class162.field2574) {
            return null;
        }
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        class209 var4 = null;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < var3.field531; var7++) {
            class209 var8 = var3.field544[var7];
            if ((var8.field3279 >> 29 & 0x3L) <= 1L && var8.field3283 == arg1 && var8.field3291 == arg2 && (var8.field3289 > var5 || var8.field3280 > var6)) {
                var4 = var8;
                var5 = var8.field3289;
                var6 = var8.field3280;
            }
        }
        return var4;
    }
}
