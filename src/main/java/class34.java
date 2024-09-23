import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OIEBXCSN")
public class class34 {

    @OriginalMember(owner = "OIEBXCSN", name = "h", descriptor = "Z")
    public boolean field1187 = false;

    @OriginalMember(owner = "OIEBXCSN", name = "i", descriptor = "I")
    public int field1188 = -1;

    @OriginalMember(owner = "OIEBXCSN", name = "k", descriptor = "Z")
    public boolean field1190 = true;

    @OriginalMember(owner = "OIEBXCSN", name = "a", descriptor = "I")
    private static int field1180 = 8;

    @OriginalMember(owner = "OIEBXCSN", name = "b", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "OIEBXCSN", name = "e", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "OIEBXCSN", name = "f", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "OIEBXCSN", name = "g", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "OIEBXCSN", name = "j", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "OIEBXCSN", name = "d", descriptor = "Ljava/lang/String;")
    public String field1183;

    @OriginalMember(owner = "OIEBXCSN", name = "c", descriptor = "[LOIEBXCSN;")
    public static class34[] field1182;

    @OriginalMember(owner = "OIEBXCSN", name = "a", descriptor = "(LDTIATKJO;I)V")
    public static void method385(class8 arg0, int arg1) {
        class14 var2 = new class14(-527, arg0.method168("varbit.dat", null));
        field1181 = var2.method204();
        if (arg1 != 1) {
            field1180 = -368;
        }
        if (field1182 == null) {
            field1182 = new class34[field1181];
        }
        for (int var3 = 0; var3 < field1181; var3++) {
            if (field1182[var3] == null) {
                field1182[var3] = new class34();
            }
            field1182[var3].method386(95, var3, var2);
            if (field1182[var3].field1187) {
                class42.field1367[field1182[var3].field1184].field1379 = true;
            }
        }
        if (var2.field768.length != var2.field769) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "OIEBXCSN", name = "a", descriptor = "(IILGHHPHSRU;)V")
    public void method386(int arg0, int arg1, class14 arg2) {
        if (arg0 <= 0) {
            return;
        }
        while (true) {
            int var4 = arg2.method202();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1184 = arg2.method204();
                this.field1185 = arg2.method202();
                this.field1186 = arg2.method202();
            } else if (var4 == 10) {
                this.field1183 = arg2.method209();
            } else if (var4 == 2) {
                this.field1187 = true;
            } else if (var4 == 3) {
                this.field1188 = arg2.method207();
            } else if (var4 == 4) {
                this.field1189 = arg2.method207();
            } else if (var4 == 5) {
                this.field1190 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
