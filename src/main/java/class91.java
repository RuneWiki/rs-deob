import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class91 extends class4 {

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public int field2084 = -1;

    @OriginalMember(owner = "client!na", name = "lb", descriptor = "[S")
    private short[] field2098 = new short[6];

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "[I")
    private int[] field2093 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!na", name = "nb", descriptor = "[S")
    private short[] field2100 = new short[6];

    @OriginalMember(owner = "client!na", name = "mb", descriptor = "Z")
    public boolean field2099 = false;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "Loa;")
    private static class98 field2087 = class38.method349(255, "Prepared visibility map");

    @OriginalMember(owner = "client!na", name = "ob", descriptor = "Loa;")
    private static class98 field2101 = class38.method349(255, "Add friend");

    @OriginalMember(owner = "client!na", name = "ib", descriptor = "Loa;")
    public static class98 field2095 = field2087;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "Loa;")
    public static class98 field2089 = field2101;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "Lkb;")
    public static class71 field2088 = new class71();

    @OriginalMember(owner = "client!na", name = "ub", descriptor = "Z")
    public static boolean field2107 = false;

    @OriginalMember(owner = "client!na", name = "tb", descriptor = "Loa;")
    public static class98 field2106 = class38.method349(255, "backright1");

    @OriginalMember(owner = "client!na", name = "rb", descriptor = "Loa;")
    private static class98 field2104 = class38.method349(255, "Loading game screen )2 ");

    @OriginalMember(owner = "client!na", name = "vb", descriptor = "Loa;")
    public static class98 field2108 = field2104;

    @OriginalMember(owner = "client!na", name = "xb", descriptor = "I")
    public static int field2110 = 0;

    @OriginalMember(owner = "client!na", name = "Ab", descriptor = "Loa;")
    public static class98 field2113 = class38.method349(255, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!na", name = "yb", descriptor = "Loa;")
    public static class98 field2111 = null;

    @OriginalMember(owner = "client!na", name = "Bb", descriptor = "I")
    public static int field2114 = -1;

    @OriginalMember(owner = "client!na", name = "sb", descriptor = "Loa;")
    private static class98 field2105 = class38.method349(255, "On");

    @OriginalMember(owner = "client!na", name = "Cb", descriptor = "Loa;")
    public static class98 field2115 = class38.method349(255, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!na", name = "Db", descriptor = "Loa;")
    private static class98 field2116 = class38.method349(255, "Connection lost");

    @OriginalMember(owner = "client!na", name = "Eb", descriptor = "Loa;")
    public static class98 field2117 = field2105;

    @OriginalMember(owner = "client!na", name = "zb", descriptor = "Loa;")
    public static class98 field2112 = field2116;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!na", name = "jb", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!na", name = "kb", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!na", name = "pb", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!na", name = "wb", descriptor = "Lmd;")
    public static class87 field2109;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "[I")
    private int[] field2090;

    @OriginalMember(owner = "client!na", name = "qb", descriptor = "[I")
    public static int[] field2103;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lb;I)V")
    public final void method739(class8 arg0, int arg1) {
        field2091++;
        while (true) {
            int var3 = arg0.method62((byte) 113);
            if (var3 == 0) {
                if (arg1 == 29270) {
                    return;
                } else {
                    field2103 = null;
                    return;
                }
            }
            this.method740(arg0, var3, arg1 - 29273);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lb;II)V")
    private final void method740(class8 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            field2111 = null;
        }
        field2096++;
        if (arg1 == 1) {
            this.field2084 = arg0.method62((byte) 93);
        } else if (arg1 == 2) {
            int var4 = arg0.method62((byte) 122);
            this.field2090 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2090[var5] = arg0.method68(class18.method172(arg2, 3));
            }
        } else if (arg1 == 3) {
            this.field2099 = true;
            return;
        } else if (arg1 < 40 || arg1 >= 50) {
            if (arg1 >= 50 && arg1 < 60) {
                this.field2100[arg1 - 50] = (short) arg0.method68(-2);
                return;
            }
            if (arg1 >= 60 && arg1 < 70) {
                this.field2093[arg1 - 60] = arg0.method68(arg2 + 1);
                return;
            }
        } else {
            this.field2098[arg1 - 40] = (short) arg0.method68(arg2 + 1);
            return;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)Z")
    public final boolean method741(int arg0) {
        field2097++;
        if (arg0 != 8245) {
            return true;
        } else if (this.field2090 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2090.length; var3++) {
                if (!class56.field1253.method1049(0, this.field2090[var3], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    public static void method742(int arg0) {
        field2104 = null;
        field2095 = null;
        field2113 = null;
        field2089 = null;
        field2101 = null;
        field2108 = null;
        field2115 = null;
        field2111 = null;
        field2117 = null;
        if (arg0 < 80) {
            method742(7);
        }
        field2087 = null;
        field2088 = null;
        field2109 = null;
        field2105 = null;
        field2116 = null;
        field2106 = null;
        field2112 = null;
        field2103 = null;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(B)Z")
    public final boolean method743(byte arg0) {
        field2102++;
        if (arg0 >= -14) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2093[var3] != -1 && !class56.field1253.method1049(0, this.field2093[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)Lbd;")
    public final class12 method744(int arg0) {
        field2094++;
        class12[] var2 = new class12[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2093[var4] != -1) {
                var2[var3++] = class12.method133(class56.field1253, this.field2093[var4], 0);
            }
        }
        class12 var5 = new class12(var2, var3);
        int var6 = 0;
        if (arg0 != 32589) {
            this.field2093 = null;
        }
        while (var6 < 6 && this.field2098[var6] != 0) {
            var5.method134(this.field2098[var6], this.field2100[var6]);
            var6++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Lbd;")
    public final class12 method745(boolean arg0) {
        field2085++;
        if (this.field2090 == null) {
            return null;
        }
        if (arg0) {
            this.field2084 = -67;
        }
        class12[] var2 = new class12[this.field2090.length];
        for (int var3 = 0; var3 < this.field2090.length; var3++) {
            var2[var3] = class12.method133(class56.field1253, this.field2090[var3], 0);
        }
        class12 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class12(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field2098[var5] != 0; var5++) {
            var4.method134(this.field2098[var5], this.field2100[var5]);
        }
        return var4;
    }
}
