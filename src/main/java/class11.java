import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class11 extends class260 {

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "[Lvl;")
    public class11[] field162;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "Z")
    public boolean field167;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "Ljava/util/Calendar;")
    public static Calendar field168 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public static int field171 = -1;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "Lqp;")
    public static class466 field172 = new class466("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "[B")
    public static byte[] field174 = new byte[520];

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "Lal;")
    public static class66 field173 = new class66("stellardawn", 1);

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Lfp;")
    public class212 field158;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Lnv;")
    public class288 field156;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "[[B")
    public static byte[][] field165;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[[I", line = 9)
    public int[][] method41(int arg0, int arg1) {
        int var3 = -5 % ((arg0 + 75) / 49);
        field160++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I", line = 20)
    public int method47(int arg0) {
        if (arg0 != -25029) {
            this.method50(60);
        }
        field161++;
        return -1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lsi;II)V", line = 31)
    public void method43(class391 arg0, int arg1, int arg2) {
        field166++;
        if (arg1 >= -40) {
            this.method50(-60);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIB)[I", line = 42)
    public final int[] method48(int arg0, int arg1, byte arg2) {
        field170++;
        if (arg2 >= -26) {
            return null;
        } else if (this.field162[arg1].field167) {
            return this.field162[arg1].method44(-44, arg0);
        } else {
            return this.field162[arg1].method41(-127, arg0)[0];
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)[[I", line = 66)
    public final int[][] method49(int arg0, int arg1, int arg2) {
        if (arg2 < 104) {
            return null;
        }
        field153++;
        if (this.field162[arg1].field167) {
            int[] var4 = this.field162[arg1].method44(-109, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field162[arg1].method41(34, arg0);
        }
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)I", line = 98)
    public int method50(int arg0) {
        field163++;
        return arg0 == -1 ? -1 : -53;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 110)
    public void method51(byte arg0) {
        if (arg0 != -53) {
            field168 = null;
        }
        field157++;
        if (this.field167) {
            this.field158.method1311(7);
            this.field158 = null;
        } else {
            this.field156.method1717(8);
            this.field156 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V", line = 140)
    public static final void method52(boolean arg0) {
        if (arg0) {
            class89.field1305 = class382.field5586;
            class211.field2950 = class89.field1302;
        } else {
            class89.field1305 = class485.field7086;
            class211.field2950 = class385.field5608;
        }
        class253.field3523 = class89.field1305.length;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)I", line = 164)
    public static final int method53(int arg0, int arg1) {
        if (arg0 == 3) {
            field159++;
            return arg1 & 0xFF;
        } else {
            return -120;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IZ)V", line = 182)
    public class11(int arg0, boolean arg1) {
        this.field162 = new class11[arg0];
        this.field167 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V", line = 192)
    public void method42(boolean arg0) {
        field155++;
        if (!arg0) {
            this.method48(-82, -90, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)I", line = 206)
    public static final int method54(int arg0, int arg1) {
        return class12.field192 == null ? 0 : (class12.field192[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(III)V", line = 209)
    public void method55(int arg0, int arg1, int arg2) {
        field164++;
        int var4 = this.field169 == arg1 ? arg2 : this.field169;
        if (this.field167) {
            this.field158 = new class212(var4, arg2, arg0);
        } else {
            this.field156 = new class288(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V", line = 230)
    public static void method56(int arg0) {
        field173 = null;
        field168 = null;
        field172 = null;
        field174 = null;
        field165 = null;
        if (arg0 != 255) {
            field165 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(II)[I", line = 248)
    public int[] method44(int arg0, int arg1) {
        if (arg0 >= -42) {
            this.field156 = null;
        }
        field154++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }
}
