import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class8 {

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field54 = new String[200];

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lap;")
    public static class310 field61 = new class310(76, 0);

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lgj;")
    public static class450 field62 = new class450();

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Z")
    public static boolean field63 = false;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Lnl;")
    public static class435 field53;

    @OriginalMember(owner = "client!bc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field55++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method44(byte arg0) {
        if (arg0 != 25) {
            field63 = false;
        }
        field53 = null;
        field54 = null;
        field61 = null;
        field62 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(CB)Z")
    public static final boolean method45(char arg0, byte arg1) {
        field59++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class227.method1547((byte) 45, arg0)) {
            return true;
        } else if (arg1 <= 6) {
            return true;
        } else {
            char[] var2 = class126.field1716;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class223.field3223;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
    public static final int method46(int arg0, int arg1) {
        field57++;
        if (arg1 > -105) {
            field53 = null;
        }
        return arg0 == 16711935 ? -1 : class24.method172(17414, arg0);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(II)V")
    public class8(int arg0, int arg1) {
        this.field60 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
    public static final void method47(byte arg0, int arg1) {
        class336 var2 = class282.field4052;
        synchronized (class282.field4052) {
            class282.field4052.method2120((byte) 102, arg1);
        }
        field58++;
        if (arg0 <= -113) {
            class336 var3 = class402.field5517;
            synchronized (class402.field5517) {
                class402.field5517.method2120((byte) -114, arg1);
            }
        }
    }
}
