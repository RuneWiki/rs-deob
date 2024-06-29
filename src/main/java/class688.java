import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class688 {

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public int field9696 = 8;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public int field9698 = 16777215;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field9702 = 0;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public int field9695;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public int field9699;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field9700;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public int field9701;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public int field9705;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public int field9707;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "Z")
    public boolean field9703;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "[Llq;")
    public static class549[] field9704;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lud;I)V", line = 10)
    public final void method3867(class35 arg0, int arg1) {
        int var3 = -16 / ((3 - arg1) / 41);
        while (true) {
            int var4 = arg0.method273(255);
            if (var4 == 0) {
                field9700++;
                return;
            }
            this.method3869(var4, (byte) 62, arg0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 36)
    public static void method3868(byte arg0) {
        if (arg0 != 118) {
            method3868((byte) 24);
        }
        field9704 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBLud;)V", line = 50)
    private final void method3869(int arg0, byte arg1, class35 arg2) {
        field9697++;
        int var4 = 0 / ((arg1 + 51) / 37);
        if (arg0 == 1) {
            this.field9696 = arg2.method253(-13900);
        } else if (arg0 == 2) {
            this.field9703 = true;
        } else if (arg0 == 3) {
            this.field9705 = arg2.method225((byte) 91);
            this.field9701 = arg2.method225((byte) 82);
            this.field9699 = arg2.method225((byte) 80);
        } else if (arg0 == 4) {
            this.field9695 = arg2.method273(255);
        } else if (arg0 == 5) {
            this.field9707 = arg2.method253(-13900);
            return;
        } else if (arg0 == 6) {
            this.field9698 = arg2.method239(-90);
            return;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)V", line = 102)
    public static final void method3870(int arg0, byte arg1) {
        field9706++;
        class388.method2424(235);
        if (arg1 != -90) {
            field9702 = 61;
        }
        int var2 = class99.field1677.method2365((byte) 55, arg0).field4507;
        if (var2 == 0) {
            return;
        }
        int var3 = class742.field10408.field7584[arg0];
        if (var2 == 5) {
            class552.field7737 = var3;
        }
        if (var2 == 6) {
            class474.field6798 = var3;
        }
    }
}
