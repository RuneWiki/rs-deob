import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NGIGHQOG")
public class class37 {

    @OriginalMember(owner = "NGIGHQOG", name = "b", descriptor = "Z")
    private boolean field1135 = true;

    @OriginalMember(owner = "NGIGHQOG", name = "g", descriptor = "I")
    public int field1140 = -1;

    @OriginalMember(owner = "NGIGHQOG", name = "i", descriptor = "[I")
    public int[] field1142 = new int[6];

    @OriginalMember(owner = "NGIGHQOG", name = "j", descriptor = "[I")
    public int[] field1143 = new int[6];

    @OriginalMember(owner = "NGIGHQOG", name = "k", descriptor = "I")
    public int field1144 = 128;

    @OriginalMember(owner = "NGIGHQOG", name = "l", descriptor = "I")
    public int field1145 = 128;

    @OriginalMember(owner = "NGIGHQOG", name = "a", descriptor = "Z")
    private static boolean field1134 = true;

    @OriginalMember(owner = "NGIGHQOG", name = "p", descriptor = "LRPWOWYDL;")
    public static class51 field1149 = new class51(0, 30);

    @OriginalMember(owner = "NGIGHQOG", name = "c", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "NGIGHQOG", name = "e", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "NGIGHQOG", name = "f", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "NGIGHQOG", name = "m", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "NGIGHQOG", name = "n", descriptor = "I")
    public int field1147;

    @OriginalMember(owner = "NGIGHQOG", name = "o", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "NGIGHQOG", name = "h", descriptor = "LZGXCNUJM;")
    public class71 field1141;

    @OriginalMember(owner = "NGIGHQOG", name = "d", descriptor = "[LNGIGHQOG;")
    public static class37[] field1137;

    @OriginalMember(owner = "NGIGHQOG", name = "a", descriptor = "(LFNOQZAYQ;I)V")
    public static void method349(class14 arg0, int arg1) {
        class11 var2 = new class11(arg0.method246("spotanim.dat", null), field1134);
        field1136 = var2.method191();
        if (field1137 == null) {
            field1137 = new class37[field1136];
        }
        for (int var3 = 0; var3 < field1136; var3++) {
            if (field1137[var3] == null) {
                field1137[var3] = new class37();
            }
            field1137[var3].field1138 = var3;
            field1137[var3].method350(var2, -25);
        }
        int var4 = 4 / arg1;
    }

    @OriginalMember(owner = "NGIGHQOG", name = "a", descriptor = "(LDNRIFKTO;I)V")
    public void method350(class11 arg0, int arg1) {
        while (arg1 >= 0) {
            this.field1135 = !this.field1135;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method189();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1139 = arg0.method191();
                } else if (var3 == 2) {
                    this.field1140 = arg0.method191();
                    if (class71.field1727 != null) {
                        this.field1141 = class71.field1727[this.field1140];
                    }
                } else if (var3 == 4) {
                    this.field1144 = arg0.method191();
                } else if (var3 == 5) {
                    this.field1145 = arg0.method191();
                } else if (var3 == 6) {
                    this.field1146 = arg0.method191();
                } else if (var3 == 7) {
                    this.field1147 = arg0.method189();
                } else if (var3 == 8) {
                    this.field1148 = arg0.method189();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1142[var3 - 40] = arg0.method191();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1143[var3 - 50] = arg0.method191();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "NGIGHQOG", name = "a", descriptor = "()LSNMMQNPZ;")
    public class55 method351() {
        class55 var1 = (class55) field1149.method401((long) this.field1138);
        if (var1 != null) {
            return var1;
        }
        class55 var2 = class55.method418(this.field1139);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1142[0] != 0) {
                var2.method432(this.field1142[var3], this.field1143[var3]);
            }
        }
        field1149.method402((byte) 124, (long) this.field1138, var2);
        return var2;
    }
}
