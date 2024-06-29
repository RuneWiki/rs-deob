import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class504 extends class535 {

    @OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
    private int field7290 = 4096;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
    private int field7288 = 0;

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "Lqt;")
    public static class459 field7289 = new class459(2, 7);

    @OriginalMember(owner = "client!gn", name = "P", descriptor = "Lqv;")
    public static class316 field7293 = new class316(4, 6);

    @OriginalMember(owner = "client!gn", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field7294 = "";

    @OriginalMember(owner = "client!gn", name = "S", descriptor = "I")
    public static int field7296 = 0;

    @OriginalMember(owner = "client!gn", name = "T", descriptor = "[I")
    public static int[] field7297 = new int[14];

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!gn", name = "N", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!gn", name = "O", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!gn", name = "R", descriptor = "Ltc;")
    public static class240 field7295;

    @OriginalMember(owner = "client!gn", name = "I", descriptor = "Lci;")
    public static class320 field7287;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBI)V")
    public static final void method2943(int arg0, byte arg1, int arg2) {
        ++field7291;
        if (class175.method1224(arg0, 7607)) {
            class372.method2275(-11958, arg2, class283.field4217[arg0]);
            if (arg1 > -14) {
                method2945(-30, -39);
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        ++field7286;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field7290 = arg1.method3018(566990904);
            }
        } else {
            this.field7288 = arg1.method3018(566990904);
        }
        if (arg2 != -6232) {
            method2943(108, (byte) -80, -100);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V")
    public static void method2944(boolean arg0) {
        field7289 = null;
        field7295 = null;
        if (arg0) {
            field7294 = null;
            field7297 = null;
            field7293 = null;
            field7287 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
    public class504() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)Z")
    public static final boolean method2945(int arg0, int arg1) {
        ++field7284;
        if (arg1 > -80) {
            method2945(-119, -63);
        }
        return arg0 == 2 || arg0 == 6 || arg0 == 9;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)[I")
    public final int[] method65(int arg0, int arg1) {
        ++field7285;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (arg1 != 1) {
            method2945(67, 116);
        }
        if (super.field7885.field2086) {
            int[] var4 = this.method3158(arg1 + 65, 0, arg0);
            for (int var5 = 0; ~var5 > ~class174.field2597; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field7288 >= ~var6 && this.field7290 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
