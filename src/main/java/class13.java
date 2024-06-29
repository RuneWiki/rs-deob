import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 {

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lkh;")
    public class13 field237;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lc;")
    public class124 field235;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lbj;")
    public static class162 field238 = new class162(72, 2);

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "Ls;")
    public static class186 field248 = new class186(102, -2);

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public int field243;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "Lph;")
    public static class459 field249;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lkh;", line = 9)
    public final class13 method85(int arg0, int arg1) {
        field247++;
        if (arg0 != 72) {
            this.field235 = null;
        }
        return new class13(this.field244, arg1);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I", line = 26)
    public static final int method86(int arg0) {
        field239++;
        if (class387.field5662 == null) {
            if (arg0 != 3) {
                field246 = -19;
            }
            return class259.field3963 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(II)V", line = 42)
    public class13(int arg0, int arg1) {
        this.field244 = arg0;
        this.field236 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lkh;I)V", line = 50)
    public class13(class13 arg0, int arg1) {
        this.field237 = arg0;
        this.field236 = this.field237.field236 + arg1;
        this.field244 = this.field237.field244;
        this.field235 = this.field237.field235;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V", line = 61)
    public static void method87(int arg0) {
        field249 = null;
        field238 = null;
        field248 = null;
        int var1 = -95 / ((-arg0 - 13) / 43);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lti;", line = 73)
    public final class307 method88(byte arg0) {
        int var2 = -72 / ((arg0 - 53) / 55);
        field245++;
        return class293.method1907(this.field244, (byte) -84);
    }
}
