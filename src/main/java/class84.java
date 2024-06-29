import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class84 {

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "Ljava/lang/String;")
    private String field1142 = "null";

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
    public static int field1150 = -1;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
    public static int field1154 = -1;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "Lem;")
    public static class239 field1147 = new class239();

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "Lkh;")
    public static class17 field1157 = null;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "C")
    public char field1141;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "C")
    public char field1145;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "Lcja;")
    private class46 field1143;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "Lcja;")
    public class46 field1153;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V")
    private final void method672(byte arg0) {
        field1144++;
        this.field1143 = new class46(this.field1153.method339(true));
        int var2 = -28 % (-arg0 / 59);
        for (class682 var3 = (class682) this.field1153.method335(-29067); var3 != null; var3 = (class682) this.field1153.method336(125)) {
            class746 var4 = new class746(var3.field9498, (int) var3.field2528);
            this.field1143.method341(class381.method2322((byte) 62, var3.field9498), var4, (byte) 52);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lfca;I)V")
    public final void method673(class93 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method793((byte) 45);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.field1153 = null;
                }
                field1151++;
                return;
            }
            this.method676(arg0, 25471, var3);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
    public static void method674(int arg0) {
        field1157 = null;
        field1147 = null;
        if (arg0 != 0) {
            field1154 = -34;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BI)I")
    public final int method675(byte arg0, int arg1) {
        int var3 = 72 / ((arg0 - 76) / 50);
        field1149++;
        if (this.field1153 == null) {
            return this.field1148;
        } else {
            class345 var4 = (class345) this.field1153.method337((long) arg1, 1);
            return var4 == null ? this.field1148 : var4.field4640;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lfca;II)V")
    private final void method676(class93 arg0, int arg1, int arg2) {
        field1152++;
        if (arg1 != 25471) {
            field1154 = 102;
        }
        if (arg2 == 1) {
            this.field1141 = class283.method1823(-27037, arg0.method766((byte) 122));
        } else if (arg2 == 2) {
            this.field1145 = class283.method1823(-27037, arg0.method766((byte) 122));
        } else if (arg2 == 3) {
            this.field1142 = arg0.method752(0);
        } else if (arg2 == 4) {
            this.field1148 = arg0.method773(3);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method763(arg1 - 25366);
            this.field1153 = new class46(class241.method1609((byte) -105, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method773(arg1 - 25468);
                class154 var7;
                if (arg2 == 5) {
                    var7 = new class682(arg0.method752(0));
                } else {
                    var7 = new class345(arg0.method773(3));
                }
                this.field1153.method341((long) var6, var7, (byte) 98);
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method677(int arg0, int arg1) {
        field1146++;
        if (this.field1153 == null) {
            return this.field1142;
        }
        if (arg1 != -6) {
            field1154 = 59;
        }
        class682 var3 = (class682) this.field1153.method337((long) arg0, arg1 ^ 0xFFFFFFFB);
        return var3 == null ? this.field1142 : var3.field9498;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method678(byte arg0, String arg1) {
        field1156++;
        if (this.field1153 == null) {
            return false;
        }
        if (this.field1143 == null) {
            this.method672((byte) 68);
        }
        for (class746 var3 = (class746) this.field1143.method337(class381.method2322((byte) 62, arg1), 1); var3 != null; var3 = (class746) this.field1143.method344((byte) 122)) {
            if (var3.field10304.equals(arg1)) {
                return true;
            }
        }
        if (arg0 <= 68) {
            this.method677(-87, -54);
        }
        return false;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Z)V")
    private final void method679(boolean arg0) {
        field1140++;
        this.field1143 = new class46(this.field1153.method339(true));
        if (arg0) {
            this.method672((byte) 5);
        }
        for (class345 var2 = (class345) this.field1153.method335(-29067); var2 != null; var2 = (class345) this.field1153.method336(93)) {
            class345 var3 = new class345((int) var2.field2528);
            this.field1143.method341((long) var2.field4640, var3, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(II)Z")
    public final boolean method680(int arg0, int arg1) {
        field1155++;
        if (this.field1153 == null) {
            return false;
        }
        if (this.field1143 == null) {
            this.method679(false);
        }
        if (arg1 == 0) {
            class345 var3 = (class345) this.field1143.method337((long) arg0, 1);
            return var3 != null;
        } else {
            return true;
        }
    }
}
