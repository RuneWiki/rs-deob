import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class530 implements class183 {

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 3)
    public static final void method3027(byte arg0) {
        if (class126.field1881 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class520.field7335.length; var2++) {
                if (class520.field7335[var2].indexOf("--> ") != -1) {
                    var1++;
                    if (class126.field1881 == var1) {
                        class436.field6383 = class520.field7335[var2].substring(class520.field7335[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        } else {
            class436.field6383 = "";
        }
        field7444++;
        int var3 = -86 % ((7 - arg0) / 54);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lff;JI[I)Ljava/lang/String;", line = 35)
    public final String method1232(class9 arg0, long arg1, int arg2, int[] arg3) {
        if (arg2 != 0) {
            return null;
        }
        field7443++;
        if (class318.field4688 == arg0) {
            class96 var6 = class666.field9402.method570(-7848, arg3[0]);
            return var6.method783((int) arg1, (byte) -71);
        } else if (class539.field7550 == arg0 || class106.field1640 == arg0) {
            class186 var7 = class41.field682.method2228((int) arg1, 0);
            return var7.field2629;
        } else if (class539.field7542 == arg0 || class270.field4057 == arg0 || class360.field5173 == arg0) {
            return class666.field9402.method570(-7848, arg3[0]).method783((int) arg1, (byte) -71);
        } else {
            return null;
        }
    }
}
