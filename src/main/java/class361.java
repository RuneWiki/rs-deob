import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class361 extends class529 {

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public int field5589;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public int field5594;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "[I")
    public static int[] field5586 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field5590 = 0;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "[I")
    public static int[] field5588 = new int[1];

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Z")
    public static boolean field5593 = false;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lqu;")
    public static class219 field5592 = new class219(36, -1);

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Z")
    public static boolean field5596 = false;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field5597 = new String[100];

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Lo;")
    public static class139 field5591;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public static final void method2382(boolean arg0) {
        class148.field1999 = 0;
        class12.field121 = -1;
        class454.field7026 = -1;
        if (arg0) {
            class535.field7842 = -1;
            field5585++;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method2383(int arg0) {
        field5597 = null;
        field5591 = null;
        field5588 = null;
        field5592 = null;
        if (arg0 < 33) {
            field5592 = null;
        }
        field5586 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lpb;Ljava/lang/Object;I)V")
    public static final void method2384(class2 arg0, Object arg1, int arg2) {
        field5595++;
        if (arg0.field11 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field11.peekEvent() != null; var3++) {
            class208.method1464((byte) -109, 1L);
        }
        if (arg1 != null) {
            arg0.field11.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
        int var4 = 69 % ((-arg2 - 10) / 55);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
    public static final Object method2385(boolean arg0, int arg1, byte[] arg2) {
        if (arg1 != -29809) {
            return null;
        }
        field5587++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class258.field4159) {
            try {
                class474 var3 = (class474) Class.forName("nv").getDeclaredConstructor().newInstance();
                var3.method2952(arg1 ^ 0x444F, arg2);
                return var3;
            } catch (Throwable var4) {
                class258.field4159 = true;
            }
        }
        return arg0 ? class242.method1688(arg2, false) : arg2;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(II)V")
    public class361(int arg0, int arg1) {
        this.field5589 = arg0;
        this.field5594 = arg1;
    }
}
