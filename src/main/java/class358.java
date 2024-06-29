import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class358 extends class90 {

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "Ljava/lang/Object;")
    private Object field5424;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "[I")
    public static int[] field5421 = new int[13];

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "Ldq;")
    public static class489 field5426 = new class489(2, 4);

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BI)Z", line = 3)
    public static final boolean method2308(byte arg0, int arg1) {
        field5425++;
        if (arg1 == 25 || arg1 == 9 || arg1 == 11 || arg1 == 19 || arg1 == 1010) {
            return true;
        } else if (arg1 == 5 || arg1 == 1001) {
            return true;
        } else {
            if (arg0 != -17) {
                field5426 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 22)
    public static final long method2309(String arg0, byte arg1) {
        field5423++;
        long var2 = 0L;
        if (arg1 != -83) {
            method2309(null, (byte) -100);
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (1 - (97 - var6));
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(B)Z", line = 68)
    public final boolean method733(byte arg0) {
        int var2 = 1 / ((arg0 - 55) / 46);
        field5419++;
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Lqd;", line = 81)
    public static final class311 method2310(int arg0, int arg1, int arg2) {
        class165 var3 = class36.field545[arg0][arg1][arg2];
        return var3 == null || var3.field2487 == null ? null : var3.field2487;
    }

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "(I)V", line = 92)
    public static void method2311(int arg0) {
        if (arg0 >= 88) {
            field5421 = null;
            field5426 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "(I)V", line = 103)
    public static final void method2312(int arg0) {
        int var1 = -21 / ((arg0 + 24) / 43);
        class114.method841(false, class509.field7448);
        class101.field1614++;
        field5422++;
        class86.field1436.method1874(class473.field6978, (byte) -110);
    }

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 119)
    public final Object method731(int arg0) {
        field5418++;
        return arg0 == 174 ? this.field5424 : null;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 130)
    public class358(Object arg0, int arg1) {
        super(arg1);
        this.field5424 = arg0;
    }
}
