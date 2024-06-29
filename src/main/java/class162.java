import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class162 extends class68 {

    @OriginalMember(owner = "client!di", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field2772;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!di", name = "V", descriptor = "Lij;")
    private static class50 field2781 = class78.method578(127, "Checking for updates )2 ");

    @OriginalMember(owner = "client!di", name = "O", descriptor = "Lij;")
    public static class50 field2774 = field2781;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "Z")
    public static boolean field2776 = false;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "Lbf;")
    public static class47 field2779;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V")
    public static final void method1132(byte arg0) {
        field2780++;
        if (arg0 >= -115) {
            method1137(-72, -120L);
        }
        int[] var1 = new int[class34.field667];
        int var2 = 0;
        for (int var3 = 0; var3 < class34.field667; var3++) {
            class239 var5 = class15.method111(var3, false);
            if (var5.field4106 >= 0 || var5.field4109 >= 0) {
                var1[var2++] = var3;
            }
        }
        class207.field3444 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class207.field3444[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)V")
    public static final void method1133(int arg0, byte arg1) {
        class205.field3395.method770(true, arg0);
        field2782++;
        if (arg1 != -100) {
            method1134((byte) 123);
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)V")
    public static void method1134(byte arg0) {
        field2781 = null;
        field2774 = null;
        int var1 = 74 / ((-arg0 - 20) / 54);
        field2779 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lda;Lp;Lda;ILda;)Z")
    public static final boolean method1135(class22 arg0, class84 arg1, class22 arg2, int arg3, class22 arg4) {
        if (arg3 != 9240) {
            field2773 = -88;
        }
        class174.field2906 = arg0;
        class210.field3499 = arg4;
        field2778++;
        class161.field2761 = arg1;
        class35.field682 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class162(Object arg0) {
        this.field2772 = arg0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method525(byte arg0) {
        if (arg0 > -32) {
            return null;
        } else {
            field2771++;
            return this.field2772;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;Z)I")
    public static final int method1136(KeyEvent arg0, boolean arg1) {
        field2777++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (!arg1) {
            method1134((byte) -93);
        }
        return var2;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(Z)Z")
    public final boolean method523(boolean arg0) {
        if (!arg0) {
            field2769 = -76;
        }
        field2775++;
        return false;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IJ)V")
    public static final void method1137(int arg0, long arg1) {
        field2770++;
        if (arg1 <= 0L) {
            return;
        }
        int var3 = -17 % ((arg0 - 6) / 51);
        if ((arg1 % 10L) == 0L) {
            class127.method915(1, arg1 - 1L);
            class127.method915(1, 1L);
        } else {
            class127.method915(1, arg1);
        }
    }
}
