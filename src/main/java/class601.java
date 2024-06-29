import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class601 {

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public int field8389 = 8;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public int field8379 = 16777215;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lem;")
    public static class206 field8383 = new class206(95, -1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public int field8378;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public int field8380;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public int field8385;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public int field8386;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public int field8387;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Z")
    public boolean field8381;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBLac;)V")
    private final void method3384(int arg0, byte arg1, class501 arg2) {
        field8388++;
        if (arg1 != -84) {
            this.method3384(9, (byte) -47, null);
        }
        if (arg0 == 1) {
            this.field8389 = arg2.method2845(-1);
        } else if (arg0 == 2) {
            this.field8381 = true;
        } else if (arg0 == 3) {
            this.field8380 = arg2.method2875(false);
            this.field8387 = arg2.method2875(false);
            this.field8378 = arg2.method2875(false);
        } else if (arg0 == 4) {
            this.field8385 = arg2.method2874((byte) -75);
            return;
        } else if (arg0 == 5) {
            this.field8386 = arg2.method2845(-1);
            return;
        } else if (arg0 == 6) {
            this.field8379 = arg2.method2819((byte) 72);
            return;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public static void method3385(boolean arg0) {
        field8383 = null;
        if (!arg0) {
            field8383 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLac;)V")
    public final void method3386(byte arg0, class501 arg1) {
        if (arg0 != -55) {
            return;
        }
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                field8377++;
                return;
            }
            this.method3384(var3, (byte) -84, arg1);
        }
    }
}
