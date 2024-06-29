import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class93 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field1561 = 0;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "[I")
    public static int[] field1567 = new int[14];

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Z")
    public static boolean field1568 = false;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field1571 = 0;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V", line = 6)
    public static final void method728(int arg0, int arg1) {
        field1565++;
        class165.field2617.method2334(4, arg0);
        if (arg1 == 14) {
            class261.field4394.method2334(4, arg0);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V", line = 30)
    public static final void method729(int arg0, int arg1, int arg2) {
        class169.field2691 = new class332(arg2);
        field1570++;
        int var3 = -40 % ((7 - arg1) / 52);
        class46.field745 = new class332(arg0);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 44)
    public static void method730(int arg0) {
        if (arg0 >= -82) {
            field1561 = 31;
        }
        field1567 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 62)
    public static final String method731(int arg0, String[] arg1, int arg2, int arg3) {
        field1564++;
        if (arg0 > -23) {
            field1568 = false;
        }
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var11 = arg1[arg3];
            return var11 == null ? "null" : var11.toString();
        } else {
            int var4 = arg2 + arg3;
            int var5 = 0;
            for (int var6 = arg3; var6 < var4; var6++) {
                String var7 = arg1[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var5);
            for (int var9 = arg3; var9 < var4; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }
}
