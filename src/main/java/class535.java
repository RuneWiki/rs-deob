import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class535 {

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Z")
    public boolean field7493 = false;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public int field7492 = -1;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public int field7501 = 1;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "Z")
    public boolean field7496 = false;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public int field7499 = 64;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public int field7500 = 2;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public int field7503 = 64;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field7497 = 0;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Log;B)I")
    public static final int method3095(class602 arg0, byte arg1) {
        field7498++;
        int var2 = arg0.field8651;
        class658 var3 = arg0.method3465(0);
        if (arg1 <= 40) {
            method3095(null, (byte) 76);
        }
        if (arg0.field8748) {
            var2 = arg0.field8648;
        } else if (arg0.field8766 == var3.field9467 || arg0.field8766 == var3.field9472 || arg0.field8766 == var3.field9474 || arg0.field8766 == var3.field9484) {
            var2 = arg0.field8627;
        } else if (arg0.field8766 == var3.field9454 || arg0.field8766 == var3.field9480 || arg0.field8766 == var3.field9462 || arg0.field8766 == var3.field9451) {
            var2 = arg0.field8633;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3096(String arg0, int arg1) {
        field7502++;
        if (arg0 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg1 != -17804) {
            return -57;
        }
        while (class164.field2749 > var2) {
            if (arg0.equalsIgnoreCase(class343.field5109[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIILqh;)V")
    private final void method3097(int arg0, int arg1, int arg2, class61 arg3) {
        int var5 = -75 / ((-arg0 - 27) / 40);
        if (arg2 == 1) {
            this.field7492 = arg3.method723((byte) -25);
            if (this.field7492 == 65535) {
                this.field7492 = -1;
            }
        } else if (arg2 == 2) {
            this.field7503 = arg3.method723((byte) -25) + 1;
            this.field7499 = arg3.method723((byte) -25) + 1;
        } else if (arg2 == 3) {
            arg3.method710((byte) 43);
        } else if (arg2 == 4) {
            this.field7500 = arg3.method732(-559537960);
        } else if (arg2 == 5) {
            this.field7501 = arg3.method732(-559537960);
        } else if (arg2 == 6) {
            this.field7496 = true;
        } else if (arg2 == 7) {
            this.field7493 = true;
        }
        field7494++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lqh;IZ)V")
    public final void method3098(class61 arg0, int arg1, boolean arg2) {
        field7495++;
        if (!arg2) {
            method3095(null, (byte) -99);
        }
        while (true) {
            int var4 = arg0.method732(-559537960);
            if (var4 == 0) {
                return;
            }
            this.method3097(126, arg1, var4, arg0);
        }
    }
}
