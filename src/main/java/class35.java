import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MKJLFPRH")
public class class35 {

    @OriginalMember(owner = "MKJLFPRH", name = "e", descriptor = "I")
    public int field1201 = -1;

    @OriginalMember(owner = "MKJLFPRH", name = "g", descriptor = "[I")
    public int[] field1203 = new int[6];

    @OriginalMember(owner = "MKJLFPRH", name = "h", descriptor = "[I")
    public int[] field1204 = new int[6];

    @OriginalMember(owner = "MKJLFPRH", name = "i", descriptor = "I")
    public int field1205 = 128;

    @OriginalMember(owner = "MKJLFPRH", name = "j", descriptor = "I")
    public int field1206 = 128;

    @OriginalMember(owner = "MKJLFPRH", name = "n", descriptor = "LJETHVCIV;")
    public static class24 field1210 = new class24(false, 30);

    @OriginalMember(owner = "MKJLFPRH", name = "a", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "MKJLFPRH", name = "c", descriptor = "I")
    public int field1199;

    @OriginalMember(owner = "MKJLFPRH", name = "d", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "MKJLFPRH", name = "k", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "MKJLFPRH", name = "l", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "MKJLFPRH", name = "m", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "MKJLFPRH", name = "f", descriptor = "LOXBPHQKK;")
    public class42 field1202;

    @OriginalMember(owner = "MKJLFPRH", name = "b", descriptor = "[LMKJLFPRH;")
    public static class35[] field1198;

    @OriginalMember(owner = "MKJLFPRH", name = "a", descriptor = "(LMNPBQFWE;B)V")
    public static void method421(class37 arg0, byte arg1) {
        if (arg1 != 0) {
            return;
        }
        class3 var2 = new class3(false, arg0.method429("spotanim.dat", null));
        field1197 = var2.method17();
        if (field1198 == null) {
            field1198 = new class35[field1197];
        }
        for (int var3 = 0; var3 < field1197; var3++) {
            if (field1198[var3] == null) {
                field1198[var3] = new class35();
            }
            field1198[var3].field1199 = var3;
            field1198[var3].method422(674, var2);
        }
    }

    @OriginalMember(owner = "MKJLFPRH", name = "a", descriptor = "(ILBJPWOXRJ;)V")
    public void method422(int arg0, class3 arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method15();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1200 = arg1.method17();
                } else if (var3 == 2) {
                    this.field1201 = arg1.method17();
                    if (class42.field1314 != null) {
                        this.field1202 = class42.field1314[this.field1201];
                    }
                } else if (var3 == 4) {
                    this.field1205 = arg1.method17();
                } else if (var3 == 5) {
                    this.field1206 = arg1.method17();
                } else if (var3 == 6) {
                    this.field1207 = arg1.method17();
                } else if (var3 == 7) {
                    this.field1208 = arg1.method15();
                } else if (var3 == 8) {
                    this.field1209 = arg1.method15();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1203[var3 - 40] = arg1.method17();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1204[var3 - 50] = arg1.method17();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "MKJLFPRH", name = "a", descriptor = "()LJLNSJQDR;")
    public class26 method423() {
        class26 var1 = (class26) field1210.method315((long) this.field1199);
        if (var1 != null) {
            return var1;
        }
        class26 var2 = class26.method328(1, this.field1200);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1203[0] != 0) {
                var2.method342(this.field1203[var3], this.field1204[var3]);
            }
        }
        field1210.method316(-363, var2, (long) this.field1199);
        return var2;
    }
}
