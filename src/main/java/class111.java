import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class111 {

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public int field1699 = -1;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public int field1703 = -1;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "[I")
    public static int[] field1701 = new int[64];

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field1697 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[I")
    public int[] field1700;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 11)
    public static void method958(int arg0) {
        field1701 = null;
        if (arg0 != -29498) {
            field1701 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILug;)V", line = 24)
    private final void method959(int arg0, int arg1, int arg2, class25 arg3) {
        field1704++;
        if (arg1 != -23956) {
            field1697 = 23;
        }
        if (arg0 == 1) {
            this.field1699 = arg3.method314((byte) 74);
        } else if (arg0 == 2) {
            this.field1700 = new int[arg3.method281(-128)];
            for (int var5 = 0; var5 < this.field1700.length; var5++) {
                this.field1700[var5] = arg3.method314((byte) 80);
            }
        } else if (arg0 == 3) {
            this.field1703 = arg3.method281(-126);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)I", line = 61)
    public static final int method960(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field1698++;
        if (var4 == 0) {
            return arg1;
        }
        if (arg2 != 1023) {
            method958(3);
        }
        if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILug;)V", line = 88)
    public final void method961(int arg0, int arg1, class25 arg2) {
        while (true) {
            int var4 = arg2.method281(66);
            if (var4 == 0) {
                field1702++;
                if (arg0 >= -2) {
                    method960(-38, 4, -63, 45);
                }
                return;
            }
            this.method959(var4, -23956, arg1, arg2);
        }
    }
}
