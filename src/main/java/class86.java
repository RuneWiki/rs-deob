import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class86 {

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "[Lac;")
    private class376[] field1171;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "Lgk;")
    public static class331 field1169 = new class331("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "Lgk;")
    public static class331 field1172 = new class331("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field1177 = -1;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public static int field1178 = 503;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "J")
    private long field1166;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "Lac;")
    private class376 field1167;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Liv;II)V", line = 8)
    public static final void method762(class65 arg0, int arg1, int arg2) {
        field1176++;
        if (class231.field3406 != null) {
            try {
                class231.field3406.method2342(0, 0L);
                class231.field3406.method2340(arg2, (byte) 126, arg0.field783, 24);
            } catch (Exception var4) {
            }
        }
        int var3 = -117 / ((47 - arg1) / 53);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)Lac;", line = 38)
    public final class376 method763(boolean arg0) {
        field1168++;
        if (this.field1167 == null) {
            return null;
        }
        class376 var2 = this.field1171[(int) ((long) (this.field1173 - 1) & this.field1166)];
        while (this.field1167 != var2) {
            if (this.field1167.field5561 == this.field1166) {
                class376 var3 = this.field1167;
                this.field1167 = this.field1167.field5564;
                return var3;
            }
            this.field1167 = this.field1167.field5564;
        }
        this.field1167 = null;
        if (!arg0) {
            method766(123, 87);
        }
        return null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(JI)Lac;", line = 71)
    public final class376 method764(long arg0, int arg1) {
        this.field1166 = arg0;
        field1174++;
        class376 var4 = this.field1171[(int) (arg0 & (long) (this.field1173 - 1))];
        for (this.field1167 = var4.field5564; this.field1167 != var4; this.field1167 = this.field1167.field5564) {
            if (this.field1167.field5561 == arg0) {
                class376 var5 = this.field1167;
                this.field1167 = this.field1167.field5564;
                return var5;
            }
        }
        this.field1167 = null;
        if (arg1 != -13373) {
            field1177 = -18;
        }
        return null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V", line = 102)
    public static void method765(int arg0) {
        field1169 = null;
        if (arg0 == -1) {
            field1172 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V", line = 118)
    public static final void method766(int arg0, int arg1) {
        field1165++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        if (arg1 == 9060) {
            class108.field1535 = arg0;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLac;J)V", line = 138)
    public final void method767(byte arg0, class376 arg1, long arg2) {
        field1175++;
        if (arg1.field5565 != null) {
            arg1.method2307((byte) 115);
        }
        class376 var5 = this.field1171[(int) (arg2 & (long) (this.field1173 - 1))];
        arg1.field5564 = var5;
        arg1.field5565 = var5.field5565;
        arg1.field5565.field5564 = arg1;
        arg1.field5561 = arg2;
        arg1.field5564.field5565 = arg1;
        if (arg0 != 75) {
            method762(null, -109, -85);
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(I)V", line = 160)
    public class86(int arg0) {
        this.field1171 = new class376[arg0];
        this.field1173 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class376 var3 = this.field1171[var2] = new class376();
            var3.field5564 = var3;
            var3.field5565 = var3;
        }
    }
}
