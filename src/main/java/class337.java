import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class337 {

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[F")
    public static float[] field5263 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Lmn;")
    public static class162 field5259;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lwp;")
    public static class310 field5262;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
    public static final void method2238(int arg0, int arg1) {
        class228.field3803 = arg1;
        field5261++;
        class457.field7046.method2189(false);
        if (arg0 != 0) {
            field5262 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static void method2239(int arg0) {
        field5263 = null;
        field5262 = null;
        if (arg0 != -20021) {
            method2240(true, -86);
        }
        field5259 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)V")
    public static final void method2240(boolean arg0, int arg1) {
        class500.method3052(arg1);
        field5260++;
        if (!class163.method1031(class148.field1994, 11)) {
            return;
        }
        class468.field7161++;
        if (class468.field7161 < 50 && !arg0) {
            return;
        }
        class468.field7161 = 0;
        if (!class386.field5901 && class338.field5281 != null) {
            class81.method578((byte) 66, class13.field142);
            class83.field1214++;
            try {
                class338.field5281.method1895(arg1 + 10, class170.field2488.field3162, class170.field2488.field3193, 0);
                class170.field2488.field3162 = 0;
            } catch (IOException var2) {
                class386.field5901 = true;
            }
        }
        class500.method3052(0);
    }
}
