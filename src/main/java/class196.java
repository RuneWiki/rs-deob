import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class196 extends class69 {

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Ljava/lang/String;")
    public String field3164;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Z")
    public static boolean field3169 = false;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "[I")
    public static int[] field3162 = new int[5];

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Z")
    public static boolean field3163 = true;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Leg;")
    public static class272 field3166 = new class272(5);

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public static void method1324(int arg0) {
        if (arg0 != -90540144) {
            method1324(-19);
        }
        field3162 = null;
        field3166 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3167++;
        int var9 = arg7 - arg1;
        int var10 = arg5 - arg8;
        int var11 = (arg0 - arg2 << 16) / var9;
        int var12 = (arg3 - arg4 << 16) / var10;
        class104.method734(arg6, arg2, arg7, var11, (byte) -128, 0, arg1, arg8, var12, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class196() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILhi;)V")
    public static final void method1326(int arg0, class264 arg1) {
        field3168++;
        int var2 = arg1.method1729(false);
        class244.field3907 = new class220[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class244.field3907[var3] = new class220();
            class244.field3907[var3].field3514 = arg1.method1729(false);
            class244.field3907[var3].field3516 = arg1.method1787(29960);
        }
        class26.field315 = arg1.method1729(false);
        if (arg0 < 7) {
            return;
        }
        class77.field1046 = arg1.method1729(false);
        class82.field1143 = arg1.method1729(false);
        class238.field3803 = new class219[class77.field1046 + 1 - class26.field315];
        for (int var4 = 0; var4 < class82.field1143; var4++) {
            int var5 = arg1.method1729(false);
            class219 var6 = class238.field3803[var5] = new class219();
            var6.field2635 = arg1.method1779(-113);
            var6.field2634 = arg1.method1765((byte) 121);
            var6.field3508 = class26.field315 + var5;
            var6.field3509 = arg1.method1787(29960);
            var6.field3505 = arg1.method1787(29960);
        }
        class79.field1081 = arg1.method1765((byte) 105);
        field3169 = true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(JI)V")
    public static final void method1327(long arg0, int arg1) {
        field3165++;
        class83.field1148.field4195 = 0;
        class83.field1148.method1757(21, (byte) -38);
        class83.field1148.method1762(arg0, (byte) 122);
        class62.field883 = 0;
        class102.field1539 = 0;
        if (arg1 != 7971) {
            method1326(5, (class264) null);
        }
        class95.field1429 = 1;
        class104.field1736 = -3;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class196(String arg0) {
        this.field3164 = arg0;
    }
}
