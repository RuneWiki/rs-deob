import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OKJTNJLE")
public class class38 {

    @OriginalMember(owner = "client!OKJTNJLE", name = "e", descriptor = "I")
    public int field1174 = -1;

    @OriginalMember(owner = "client!OKJTNJLE", name = "g", descriptor = "[I")
    public int[] field1176 = new int[6];

    @OriginalMember(owner = "client!OKJTNJLE", name = "h", descriptor = "[I")
    public int[] field1177 = new int[6];

    @OriginalMember(owner = "client!OKJTNJLE", name = "i", descriptor = "I")
    public int field1178 = 128;

    @OriginalMember(owner = "client!OKJTNJLE", name = "j", descriptor = "I")
    public int field1179 = 128;

    @OriginalMember(owner = "client!OKJTNJLE", name = "n", descriptor = "LYITKGHWB;")
    public static class67 field1183 = new class67(30, (byte) 6);

    @OriginalMember(owner = "client!OKJTNJLE", name = "a", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!OKJTNJLE", name = "c", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!OKJTNJLE", name = "d", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "client!OKJTNJLE", name = "k", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!OKJTNJLE", name = "l", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!OKJTNJLE", name = "m", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!OKJTNJLE", name = "f", descriptor = "LBKDXLPEF;")
    public class2 field1175;

    @OriginalMember(owner = "client!OKJTNJLE", name = "b", descriptor = "[LOKJTNJLE;")
    public static class38[] field1171;

    @OriginalMember(owner = "client!OKJTNJLE", name = "a", descriptor = "(BLXOJZVVDK;)V")
    public static void method303(byte arg0, class60 arg1) {
        if (arg0 != -82) {
            return;
        }
        class41 var2 = new class41(888, arg1.method560("spotanim.dat", null));
        field1170 = var2.method342();
        if (field1171 == null) {
            field1171 = new class38[field1170];
        }
        for (int var3 = 0; var3 < field1170; var3++) {
            if (field1171[var3] == null) {
                field1171[var3] = new class38();
            }
            field1171[var3].field1172 = var3;
            field1171[var3].method304(var2, false);
        }
    }

    @OriginalMember(owner = "client!OKJTNJLE", name = "a", descriptor = "(LPQBRPYKE;Z)V")
    public void method304(class41 arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method340();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1173 = arg0.method342();
                } else if (var4 == 2) {
                    this.field1174 = arg0.method342();
                    if (class2.field77 != null) {
                        this.field1175 = class2.field77[this.field1174];
                    }
                } else if (var4 == 4) {
                    this.field1178 = arg0.method342();
                } else if (var4 == 5) {
                    this.field1179 = arg0.method342();
                } else if (var4 == 6) {
                    this.field1180 = arg0.method342();
                } else if (var4 == 7) {
                    this.field1181 = arg0.method340();
                } else if (var4 == 8) {
                    this.field1182 = arg0.method340();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1176[var4 - 40] = arg0.method342();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1177[var4 - 50] = arg0.method342();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!OKJTNJLE", name = "a", descriptor = "()LFLXAIVEA;")
    public class16 method305() {
        class16 var1 = (class16) field1183.method572((long) this.field1172);
        if (var1 != null) {
            return var1;
        }
        class16 var2 = class16.method218(this.field1173);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1176[0] != 0) {
                var2.method232(this.field1176[var3], this.field1177[var3]);
            }
        }
        field1183.method573(false, var2, (long) this.field1172);
        return var2;
    }
}
