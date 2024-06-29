import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class41 extends class129 {

    @OriginalMember(owner = "client!ge", name = "ob", descriptor = "I")
    private int field1049 = 0;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "Lv;")
    private static class122 field1030 = class55.method425(-89, "cyan:");

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "Lv;")
    private static class122 field1028 = class55.method425(-91, "purple:");

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "Lv;")
    public static class122 field1029 = class55.method425(-95, "@cr1@");

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "Z")
    public static boolean field1035 = false;

    @OriginalMember(owner = "client!ge", name = "ib", descriptor = "Lv;")
    public static class122 field1043 = field1030;

    @OriginalMember(owner = "client!ge", name = "jb", descriptor = "[I")
    public static int[] field1044 = new int[5];

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "Lv;")
    private static class122 field1027 = class55.method425(-100, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!ge", name = "mb", descriptor = "Lv;")
    public static class122 field1047 = class55.method425(-79, "Fehler beim Laden Ihres Charakter)2Profils");

    @OriginalMember(owner = "client!ge", name = "kb", descriptor = "Lv;")
    public static class122 field1045 = class55.method425(-53, "b12_full");

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "Lv;")
    private static class122 field1038 = class55.method425(-122, "yellow:");

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "Lv;")
    public static class122 field1031 = field1038;

    @OriginalMember(owner = "client!ge", name = "qb", descriptor = "Lv;")
    public static class122 field1051 = class55.method425(-107, "Lade Benutzeroberfl\u001c1che )2 ");

    @OriginalMember(owner = "client!ge", name = "sb", descriptor = "Lv;")
    private static class122 field1053 = class55.method425(-56, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!ge", name = "nb", descriptor = "[Lcc;")
    public static class16[] field1048 = new class16[4];

    @OriginalMember(owner = "client!ge", name = "hb", descriptor = "Lv;")
    public static class122 field1042 = field1028;

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "Lv;")
    public static class122 field1039 = class55.method425(-49, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lv;")
    public static class122 field1036 = field1053;

    @OriginalMember(owner = "client!ge", name = "tb", descriptor = "Lv;")
    public static class122 field1054 = field1027;

    @OriginalMember(owner = "client!ge", name = "ub", descriptor = "Lv;")
    public static class122 field1055 = class55.method425(-52, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "client!ge", name = "gb", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ge", name = "lb", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ge", name = "pb", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ge", name = "rb", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V", line = 6)
    public final void method347(int arg0) {
        this.method349(this.field1049, 255);
        field1037++;
        if (arg0 != 4) {
            this.method349(18, -5);
        }
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V", line = 18)
    public static final void method348(int arg0) {
        field1041++;
        class51 var1 = (class51) class91.field2333.method311((byte) 101);
        if (arg0 != 6291) {
            return;
        }
        while (var1 != null) {
            if (var1.field1296 != null) {
                class63.field1604.method854(var1.field1296);
                var1.field1296 = null;
            }
            if (var1.field1322 != null) {
                class63.field1604.method854(var1.field1322);
                var1.field1322 = null;
            }
            var1 = (class51) class91.field2333.method302((byte) -65);
        }
        class91.field2333.method308((byte) 104);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 51)
    private final void method349(int arg0, int arg1) {
        field1034++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = var3;
        double var11 = (double) (arg0 >> 8 & arg1) / 256.0D;
        if (var3 > var11) {
            var7 = var11;
        }
        if (var5 < var7) {
            var7 = var5;
        }
        if (var11 > var3) {
            var9 = var11;
        }
        if (var9 < var5) {
            var9 = var5;
        }
        double var13 = 0.0D;
        double var15 = (var7 + var9) / 2.0D;
        this.field1052 = (int) (var15 * 256.0D);
        double var17 = 0.0D;
        if (var7 != var9) {
            if (var3 == var9) {
                var13 = (var11 - var5) / (-var7 + var9);
            } else if (var9 == var11) {
                var13 = (var5 - var3) / (var9 - var7) + 2.0D;
            } else if (var5 == var9) {
                var13 = (var3 - var11) / (var9 - var7) + 4.0D;
            }
            if (var15 < 0.5D) {
                var17 = (var9 - var7) / (var7 + var9);
            }
            if (var15 >= 0.5D) {
                var17 = (var9 - var7) / (2.0D - var9 - var7);
            }
        }
        double var19 = var13 / 6.0D;
        if (var15 > 0.5D) {
            this.field1033 = (int) ((1.0D - var15) * var17 * 512.0D);
        } else {
            this.field1033 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1052 < 0) {
            this.field1052 = 0;
        } else if (this.field1052 > 255) {
            this.field1052 = 255;
        }
        if (this.field1033 < 1) {
            this.field1033 = 1;
        }
        this.field1025 = (int) (var17 * 256.0D);
        if (this.field1025 < 0) {
            this.field1025 = 0;
        } else if (this.field1025 > 255) {
            this.field1025 = 255;
        }
        this.field1040 = (int) ((double) this.field1033 * var19);
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V", line = 144)
    public static void method350(int arg0) {
        field1039 = null;
        field1036 = null;
        field1038 = null;
        field1043 = null;
        field1055 = null;
        field1027 = null;
        field1045 = null;
        field1029 = null;
        field1028 = null;
        field1031 = null;
        field1053 = null;
        field1047 = null;
        field1054 = null;
        field1044 = null;
        field1042 = null;
        field1030 = null;
        if (arg0 != 383) {
            method351(-90);
        }
        field1048 = null;
        field1051 = null;
    }

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)V", line = 177)
    public static final void method351(int arg0) {
        field1050++;
        int var1 = class49.field1249 + class70.field1828.field343;
        int var2 = class60.field1554 + class70.field1828.field349;
        if (class91.field2328 - var1 < -500 || class91.field2328 - var1 > 500 || class55.field1415 - var2 < -500 || class55.field1415 - var2 > 500) {
            class91.field2328 = var1;
            class55.field1415 = var2;
        }
        if (class91.field2328 != var1) {
            class91.field2328 += (var1 - class91.field2328) / 16;
        }
        if (class55.field1415 != var2) {
            class55.field1415 += (var2 - class55.field1415) / 16;
        }
        int var3 = class55.field1415 >> 7;
        if (class131.field3172[96]) {
            class37.field962 += (-class37.field962 - 24) / 2;
        } else if (class131.field3172[97]) {
            class37.field962 += (24 - class37.field962) / 2;
        } else {
            class37.field962 /= 2;
        }
        int var4 = class91.field2328 >> 7;
        if (class131.field3172[98]) {
            class8.field184 += (12 - class8.field184) / 2;
        } else if (class131.field3172[99]) {
            class8.field184 += (-class8.field184 - 12) / 2;
        } else {
            class8.field184 /= 2;
        }
        class63.field1598 = class37.field962 / 2 + class63.field1598 & 0x7FF;
        int var5 = 0;
        class83.field2173 += class8.field184 / 2;
        if (class83.field2173 < 128) {
            class83.field2173 = 128;
        }
        if (class83.field2173 > 383) {
            class83.field2173 = 383;
        }
        int var6 = class108.method837((byte) 59, class91.field2328, class55.field1415, class34.field848);
        if (var4 > 3 && var3 > 3 && var4 < 100 && var3 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var3 - 4; var8 <= var3 + 4; var8++) {
                    int var9 = class34.field848;
                    if (var9 < 3 && (class54.field1408[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class93.field2372[var9][var7][var8];
                    if (var10 > var5) {
                        var5 = var10;
                    }
                }
            }
        }
        if (arg0 != 100) {
            return;
        }
        int var11 = var5 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class100.field2512 < var11) {
            class100.field2512 += (var11 - class100.field2512) / 24;
        } else if (class100.field2512 > var11) {
            class100.field2512 += (var11 - class100.field2512) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lkd;IB)V", line = 318)
    public final void method352(class64 arg0, int arg1, byte arg2) {
        field1026++;
        if (arg2 >= -65) {
            return;
        }
        while (true) {
            int var4 = arg0.method520(-124);
            if (var4 == 0) {
                return;
            }
            this.method353(arg0, 0, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lkd;III)V", line = 364)
    private final void method353(class64 arg0, int arg1, int arg2, int arg3) {
        field1032++;
        if (arg1 == 0 && arg3 == 1) {
            this.field1049 = arg0.method503(arg1 + 65280);
        }
    }
}
