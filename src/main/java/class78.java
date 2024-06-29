import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class78 {

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field1173 = 0;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Z")
    private boolean field1174 = false;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public int field1191 = 0;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lsf;")
    public static class108 field1175 = class140.method973(255, " s(West d-Bconnect-B)3");

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lsf;")
    public static class108 field1180 = class140.method973(255, "0");

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field1187 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field1193 = 0;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "[I")
    public static int[] field1183 = new int[32];

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    private int field1186;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "J")
    public long field1177;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lsf;")
    public static class108 field1181;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lik;")
    public static class262 field1168;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[[Z")
    public static boolean[][] field1179;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)Lsf;", line = 9)
    public static final class108 method509(byte arg0, int arg1) {
        field1172++;
        int var2 = 81 / ((arg0 - 36) / 50);
        return arg1 < 999999999 ? class79.method518(false, arg1) : class57.field839;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILrm;B)V", line = 24)
    private final void method510(int arg0, class249 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field1186 = arg1.method1712(-1);
        } else if (arg0 == 2) {
            arg1.method1731(true);
        } else if (arg0 == 3) {
            this.field1176 = arg1.method1738(-1756395344);
            this.field1189 = arg1.method1738(-1756395344);
            this.field1190 = arg1.method1738(-1756395344);
        } else if (arg0 == 4) {
            this.field1182 = arg1.method1731(true);
            this.field1171 = arg1.method1738(-1756395344);
        } else if (arg0 == 6) {
            this.field1170 = arg1.method1731(true);
        } else if (arg0 == 8) {
            this.field1191 = 1;
        } else if (arg0 == 9) {
            this.field1173 = 1;
        } else if (arg0 == 10) {
            this.field1174 = true;
        }
        int var4 = -90 / ((arg2 - 36) / 33);
        field1178++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 103)
    public final void method511(int arg0) {
        field1169++;
        this.field1185 = class263.field4649[this.field1186];
        if (arg0 != 1246) {
            return;
        }
        this.field1194 = (int) Math.sqrt((double) (this.field1189 * this.field1189 + (this.field1176 * this.field1176 + (this.field1190 * this.field1190))));
        if (this.field1171 == 0) {
            this.field1171 = 1;
        }
        if (this.field1182 == 0) {
            this.field1177 = 2147483647L;
        } else if (this.field1182 == 1) {
            this.field1177 = (long) (this.field1194 * 8 / this.field1171);
            this.field1177 *= this.field1177;
        } else if (this.field1182 == 2) {
            this.field1177 = (long) (this.field1194 * 8 / this.field1171);
        }
        if (this.field1174) {
            this.field1194 *= -1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 141)
    public static void method512(byte arg0) {
        field1168 = null;
        field1175 = null;
        field1183 = null;
        if (arg0 == -11) {
            field1181 = null;
            field1180 = null;
            field1179 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(BI)V", line = 176)
    public static final void method513(byte arg0, int arg1) {
        field1188++;
        class126.field2121 = arg1;
        class25.field382 = -1;
        class25.field382 = -1;
        class137.method943(-1);
        if (arg0 != -1) {
            field1181 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lrm;I)V", line = 202)
    public final void method514(class249 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1731(true);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.method510(-34, (class249) null, (byte) -108);
                }
                field1192++;
                return;
            }
            this.method510(var3, arg0, (byte) -79);
        }
    }
}
