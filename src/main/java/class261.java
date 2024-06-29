import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class class261 extends class312 {

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public static int field4044 = -1;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "Ljava/awt/Frame;")
    public static Frame field4045;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILwf;Lwf;)I", line = 5)
    public static final int method1737(int arg0, class306 arg1, class306 arg2) {
        int var3 = 0;
        field4041++;
        if (arg2.method2093(-99, class215.field3402)) {
            var3++;
        }
        if (arg2.method2093(-120, class95.field1452)) {
            var3++;
        }
        if (arg2.method2093(arg0 ^ 0x36, class323.field5032)) {
            var3++;
        }
        if (arg1.method2093(102, class215.field3402)) {
            var3++;
        }
        if (arg1.method2093(-110, class95.field1452)) {
            var3++;
        }
        if (arg0 == 10) {
            if (arg1.method2093(arg0 + 30, class323.field5032)) {
                var3++;
            }
            return var3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLjh;I)I", line = 44)
    public static final int method1738(boolean arg0, class207 arg1, int arg2) {
        field4043++;
        if (arg0) {
            method1738(true, (class207) null, 81);
        }
        if (!client.method888(arg1).method724((byte) 104, arg2) && arg1.field3238 == null) {
            return -1;
        } else if (arg1.field3261 == null || arg1.field3261.length <= arg2) {
            return -1;
        } else {
            return arg1.field3261[arg2];
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V", line = 58)
    public static void method1739(byte arg0) {
        field4045 = null;
        int var1 = 120 % ((arg0 - 3) / 34);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZIBJI)Ljava/lang/String;", line = 74)
    public static final String method1740(boolean arg0, int arg1, byte arg2, long arg3, int arg4) {
        field4042++;
        if (arg2 != 18) {
            return (String) null;
        }
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            arg3 = -arg3;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg3 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1144(int arg0);

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)Z")
    public abstract boolean method1142(int arg0);
}
