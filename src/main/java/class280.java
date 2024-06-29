import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class280 extends class198 {

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "J")
    private long field4031 = -1L;

    @OriginalMember(owner = "client!jaa", name = "z", descriptor = "Ljava/lang/String;")
    private String field4039 = null;

    @OriginalMember(owner = "client!jaa", name = "x", descriptor = "I")
    public static int field4037 = 0;

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!jaa", name = "v", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!jaa", name = "w", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!jaa", name = "y", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!jaa", name = "u", descriptor = "[Lde;")
    public static class418[] field4034;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(CB)I", line = 5)
    public static final int method1779(char arg0, byte arg1) {
        if (arg1 > -122) {
            return 84;
        } else {
            field4038++;
            return arg0 >= '\u0000' && class668.field9390.length > arg0 ? class668.field9390[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILlm;)V", line = 22)
    public final void method858(int arg0, class50 arg1) {
        if (arg0 != 3) {
            this.field4031 = -85L;
        }
        arg1.method393(arg0 ^ 0x46, this.field4039, this.field4031);
        field4036++;
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V", line = 39)
    public static void method1780(int arg0) {
        field4034 = null;
        if (arg0 != -1) {
            field4034 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lgga;B)V", line = 50)
    public static final void method1781(class513 arg0, byte arg1) {
        field4033++;
        class588.field8445 = arg0;
        if (arg1 != 34) {
            method1780(-84);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "(I)V", line = 61)
    public static final void method1782(int arg0) {
        class656.field9264 = class466.method2725(2048, true, 0.4F, 35, 8, arg0, 8, arg0 - 102);
        field4032++;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZLol;)V", line = 73)
    public final void method855(boolean arg0, class431 arg1) {
        field4035++;
        if (arg1.method2557(14929) != 255) {
            arg1.field5983--;
            this.field4031 = arg1.method2567((byte) -126);
        }
        if (arg0) {
            this.field4039 = arg1.method2578(1712145680);
            if (class580.field8359) {
                System.out.println("memberhash:" + this.field4031 + " membername:" + this.field4039);
            }
        }
    }
}
