import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class196 {

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    private static int field3002 = 0;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "Z")
    private static boolean field3001 = false;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "Lok;")
    private static class266 field3003 = new class266();

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
    public static final synchronized void method1355(byte arg0) {
        field3002++;
        if (arg0 != -122) {
            method1358(true);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
    public static final synchronized void method1356(int arg0) {
        field3002--;
        int var1 = 77 % ((-arg0 - 17) / 45);
        if (field3002 == 0) {
            method1358(true);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method1357(boolean arg0, int arg1) {
        field3001 = arg0;
        if (arg1 != -1) {
            method1355((byte) -94);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)V")
    public static final synchronized void method1358(boolean arg0) {
        if (!arg0) {
            method1355((byte) -119);
        }
        while (true) {
            class383 var1 = (class383) field3003.method1736(0);
            if (var1 == null) {
                return;
            }
            var1.field5277.method211(true);
            var1.method3387((byte) 126);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Le;B)V")
    public static final synchronized void method1359(class557 arg0, byte arg1) {
        if (arg1 != 90) {
            method1357(false, 61);
        }
        if (field3001) {
            return;
        }
        if (field3002 <= 0) {
            arg0.method211(false);
        } else {
            class383 var2 = new class383();
            var2.field5277 = arg0;
            field3003.method1727(var2, (byte) 80);
        }
    }
}
