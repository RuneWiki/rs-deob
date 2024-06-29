import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class539 extends class255 implements Runnable {

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public int field7384 = -1;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Z")
    private boolean field7385 = true;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Loi;")
    private class674 field7381;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Ljj;")
    public static class398 field7382 = new class398(29, 7);

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Lxa;")
    public static class424 field7388;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)I")
    public static final int method3036(int arg0, int arg1, int arg2, int arg3) {
        field7383++;
        int var4 = arg2 / arg0;
        int var5 = arg2 & arg0 + arg3;
        int var6 = arg1 / arg0;
        int var7 = arg0 - 1 & arg1;
        int var8 = class637.method3473(var6, var4, true);
        int var9 = class637.method3473(var6, var4 + 1, true);
        int var10 = class637.method3473(var6 + 1, var4, true);
        int var11 = class637.method3473(var6 + 1, var4 + 1, true);
        int var12 = class560.method3133((byte) -113, var8, var9, var5, arg0);
        int var13 = class560.method3133((byte) 66, var10, var11, var5, arg0);
        return class560.method3133((byte) -106, var12, var13, var7, arg0);
    }

    @OriginalMember(owner = "client!ab", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field7385) {
            this.field7381.method3724(this, (byte) 102);
        }
        field7386++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public final void method3037(boolean arg0) {
        field7387++;
        this.field7385 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public final void method3038(int arg0) {
        (new Thread(this, "a")).start();
        field7380++;
        if (arg0 != 31497) {
            field7382 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public static void method3039(int arg0) {
        if (arg0 == -1) {
            field7382 = null;
            field7388 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Loi;)V")
    public class539(class674 arg0) {
        this.field7381 = arg0;
    }
}
