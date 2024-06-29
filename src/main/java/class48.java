import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 extends class123 {

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public int field1059 = -1;

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "Z")
    public boolean field1065 = true;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "I")
    public int field1066 = 0;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "I")
    public int field1070 = -1;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "Lvc;")
    private static class137 field1062 = class45.method325("Cancel", -46);

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "Lvc;")
    public static class137 field1063 = field1062;

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "Lmd;")
    public static class84 field1071 = new class84();

    @OriginalMember(owner = "client!gf", name = "nb", descriptor = "Lvc;")
    public static class137 field1082 = class45.method325("backleft1", -46);

    @OriginalMember(owner = "client!gf", name = "ib", descriptor = "Lvc;")
    public static class137 field1077 = class45.method325("bevor Sie den Vorgang wiederholen)3", -46);

    @OriginalMember(owner = "client!gf", name = "qb", descriptor = "Lvc;")
    private static class137 field1085 = class45.method325("Loading friend list", -46);

    @OriginalMember(owner = "client!gf", name = "ob", descriptor = "Lvc;")
    public static class137 field1083 = class45.method325("Classic", -46);

    @OriginalMember(owner = "client!gf", name = "rb", descriptor = "I")
    public static int field1086 = -1;

    @OriginalMember(owner = "client!gf", name = "hb", descriptor = "Lvc;")
    private static class137 field1076 = class45.method325("To create a new account you need to", -46);

    @OriginalMember(owner = "client!gf", name = "lb", descriptor = "Lvc;")
    public static class137 field1080 = field1076;

    @OriginalMember(owner = "client!gf", name = "jb", descriptor = "Lvc;")
    public static class137 field1078 = field1085;

    @OriginalMember(owner = "client!gf", name = "pb", descriptor = "Lvc;")
    private static class137 field1084 = class45.method325("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members", -46);

    @OriginalMember(owner = "client!gf", name = "sb", descriptor = "I")
    public static int field1087 = 128;

    @OriginalMember(owner = "client!gf", name = "tb", descriptor = "I")
    public static int field1088 = 0;

    @OriginalMember(owner = "client!gf", name = "gb", descriptor = "Lvc;")
    public static class137 field1075 = field1084;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "client!gf", name = "fb", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!gf", name = "mb", descriptor = "Lia;")
    public static class57 field1081;

    @OriginalMember(owner = "client!gf", name = "kb", descriptor = "[I")
    public static int[] field1079;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V")
    public final void method344(byte arg0) {
        if (arg0 != 90) {
            method348((byte) 47);
        }
        field1072++;
        if (this.field1059 != -1) {
            this.method345(this.field1059, arg0 ^ 0x5A);
            this.field1067 = this.field1057;
            this.field1061 = this.field1060;
            this.field1058 = this.field1073;
        }
        this.method345(this.field1066, 0);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
    private final void method345(int arg0, int arg1) {
        field1074++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        double var11 = var3;
        double var13 = 0.0D;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var15 = (double) arg1;
        if (var11 < var7) {
            var11 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field1073 = (int) (var17 * 256.0D);
        if (this.field1073 < 0) {
            this.field1073 = 0;
        } else if (this.field1073 > 255) {
            this.field1073 = 255;
        }
        this.field1060 = (int) (var15 * 256.0D);
        if (this.field1060 < 0) {
            this.field1060 = 0;
        } else if (this.field1060 > 255) {
            this.field1060 = 255;
        }
        double var19 = var13 / 6.0D;
        this.field1057 = (int) (var19 * 256.0D);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lqe;III)V")
    private final void method346(class109 arg0, int arg1, int arg2, int arg3) {
        field1064++;
        if (arg2 != 8) {
            this.method349(null, 109, 118);
        }
        if (arg1 == 1) {
            this.field1066 = arg0.method822((byte) 43);
        } else if (arg1 == 2) {
            this.field1070 = arg0.method838(255);
        } else if (arg1 == 5) {
            this.field1065 = false;
            return;
        } else if (arg1 == 7) {
            this.field1059 = arg0.method822((byte) 43);
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
    public static void method347(int arg0) {
        if (arg0 >= -59) {
            method348((byte) -40);
        }
        field1062 = null;
        field1085 = null;
        field1078 = null;
        field1083 = null;
        field1082 = null;
        field1075 = null;
        field1076 = null;
        field1080 = null;
        field1079 = null;
        field1063 = null;
        field1071 = null;
        field1081 = null;
        field1077 = null;
        field1084 = null;
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(B)V")
    public static final void method348(byte arg0) {
        int var1 = 78 / ((arg0 + 30) / 57);
        class71.field1493.method763((byte) -128);
        class67.field1379.method763((byte) 106);
        class34.field726.method763((byte) -125);
        field1068++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lqe;II)V")
    public final void method349(class109 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            return;
        }
        while (true) {
            int var4 = arg0.method838(255);
            if (var4 == 0) {
                field1069++;
                return;
            }
            this.method346(arg0, var4, 8, arg1);
        }
    }
}
