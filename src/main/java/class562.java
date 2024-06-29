import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class562 {

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Lkp;")
    public static class421 field8019;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field8017;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field8018;

    static {
        new class474("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field8019 = new class421(1);
        field8020 = 0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)[B", line = 3)
    public static final synchronized byte[] method3249(int arg0, int arg1) {
        field8017++;
        if (arg1 == 100 && class68.field745 > 0) {
            byte[] var2 = class113.field1391[--class68.field745];
            class113.field1391[class68.field745] = null;
            return var2;
        } else if (arg1 == 5000 && class278.field3885 > 0) {
            byte[] var3 = class546.field7817[--class278.field3885];
            class546.field7817[class278.field3885] = null;
            return var3;
        } else if (arg0 == arg1 && class473.field7001 > 0) {
            byte[] var4 = class490.field7145[--class473.field7001];
            class490.field7145[class473.field7001] = null;
            return var4;
        } else {
            if (class91.field1049 != null) {
                for (int var5 = 0; var5 < class315.field4603.length; var5++) {
                    if (class315.field4603[var5] == arg1 && class618.field8972[var5] > 0) {
                        byte[] var6 = class91.field1049[var5][--class618.field8972[var5]];
                        class91.field1049[var5][class618.field8972[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I", line = 60)
    public static final int method3250(int arg0) {
        field8018++;
        if (class375.field5714 == null) {
            if (arg0 != -32068) {
                method3249(-68, 92);
            }
            return class191.field2513 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)I", line = 76)
    public static final int method3251(int arg0, byte arg1) {
        field8016++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else {
            int var2 = -128 / ((-arg1 - 49) / 57);
            if (arg0 == 6410 || arg0 == 34847) {
                return 6410;
            } else if (arg0 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V", line = 114)
    public static void method3252(int arg0) {
        if (arg0 != -1) {
            method3251(27, (byte) 5);
        }
        field8019 = null;
    }
}
