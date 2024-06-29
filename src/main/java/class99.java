import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class99 extends class544 {

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "Ljava/lang/String;")
    public String field1229;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Z")
    public boolean field1224;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "Z")
    public boolean field1225;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "J")
    public long field1235;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Ljava/lang/String;")
    public String field1228;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Lbg;")
    public static class393 field1226 = new class393();

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "Lvj;")
    public static class373 field1234 = new class373(91, 6);

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 3)
    public static void method606(int arg0) {
        if (arg0 == 3162) {
            field1226 = null;
            field1234 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)V", line = 17)
    public static final void method607(byte arg0, int arg1) {
        for (class544 var2 = class173.field2105.method2638(false); var2 != null; var2 = class173.field2105.method2641(12089)) {
            if (((long) arg1) == (var2.field7967 >> 48 & 0xFFFFL)) {
                var2.method3187(true);
            }
        }
        if (arg0 < 103) {
            field1233 = -122;
        }
        field1231++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)I", line = 45)
    public static final int method608(boolean arg0) {
        field1230++;
        if (class110.field1367 != null) {
            return 3;
        } else if (arg0) {
            return -48;
        } else if (class137.field1675) {
            return 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 73)
    public class99(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field1222 = arg6;
        this.field1229 = arg1;
        this.field1237 = arg7;
        this.field1224 = arg8;
        this.field1225 = arg9;
        this.field1227 = arg3;
        this.field1235 = arg5;
        this.field1228 = arg0;
        this.field1232 = arg4;
        this.field1223 = arg2;
    }
}
