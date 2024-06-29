import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class191 {

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public int field3048 = -1;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public int field3050 = -1;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field3039 = 500;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
    public static boolean field3044 = false;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[C")
    public static char[] field3047 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[I")
    public int[] field3040;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 11)
    public static final void method1409(boolean arg0) {
        field3043++;
        class278.field4291.method2165((byte) -103);
        class79.field1082.method2199(-2288);
        class224.field3555.method2199(-2288);
        if (!arg0) {
            field3045 = -59;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLvl;I)V", line = 26)
    public final void method1410(boolean arg0, class6 arg1, int arg2) {
        field3042++;
        while (true) {
            int var4 = arg1.method58(-288140008);
            if (var4 == 0) {
                if (arg0) {
                    field3045 = 26;
                }
                return;
            }
            this.method1412(1048576, arg2, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 49)
    public static final void method1411(byte arg0) {
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (arg0 > -79) {
                method1409(true);
            }
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class234.field3641 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
        field3041++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILvl;I)V", line = 81)
    private final void method1412(int arg0, int arg1, class6 arg2, int arg3) {
        if (arg3 == 1) {
            this.field3048 = arg2.method39((byte) 78);
        } else if (arg3 == 2) {
            this.field3040 = new int[arg2.method58(-288140008)];
            for (int var5 = 0; var5 < this.field3040.length; var5++) {
                this.field3040[var5] = arg2.method39((byte) 107);
            }
        } else if (arg3 == 3) {
            this.field3050 = arg2.method58(-288140008);
        }
        field3049++;
        if (arg0 != 1048576) {
            field3039 = 73;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 121)
    public static void method1413(int arg0) {
        if (arg0 != -9145) {
            method1411((byte) -127);
        }
        field3047 = null;
    }
}
