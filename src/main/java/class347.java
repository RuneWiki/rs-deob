import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class347 extends class93 implements Runnable {

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public int field5128 = -1;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Z")
    private boolean field5132 = true;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "Lch;")
    private class326 field5131;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Z")
    public static boolean field5127 = false;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "Lgd;")
    public static class227 field5134;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method2160(int arg0) {
        if (arg0 == 0) {
            field5134 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public final void method2161(byte arg0) {
        int var2 = 44 % ((22 - arg0) / 45);
        this.field5132 = false;
        field5124++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILah;Z)V")
    public static final void method2162(int arg0, class263 arg1, boolean arg2) {
        field5133++;
        class189.field3194 = arg2;
        class219.field3588 = 0;
        class376.method2366(arg1, (byte) -10);
        class417.method2611(arg1, -1);
        if (class189.field3194) {
            System.out.println("---endgpp---");
        }
        if (arg1.field3556 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field3556 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public final void method2163(int arg0) {
        field5130++;
        if (arg0 == -24576) {
            (new Thread(this, "a")).start();
        }
    }

    @OriginalMember(owner = "client!pi", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field5132) {
            this.field5131.method2076(-22545, this);
        }
        field5129++;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lch;)V")
    public class347(class326 arg0) {
        this.field5131 = arg0;
    }
}
