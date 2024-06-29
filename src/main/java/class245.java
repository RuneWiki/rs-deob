import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class245 {

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public int field3139 = 0;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public int field3143 = 0;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public int field3140 = 2048;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public int field3146 = 2048;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "Lkn;")
    public static class371 field3141 = new class371();

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Ldn;")
    public static class201 field3145;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lbt;B)V", line = 23)
    public final void method1532(class88 arg0, byte arg1) {
        field3144++;
        while (true) {
            int var3 = arg0.method617(2);
            if (var3 == 0) {
                int var4 = 13 / ((arg1 + 27) / 55);
                return;
            }
            this.method1533(-4, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILbt;I)V", line = 43)
    private final void method1533(int arg0, class88 arg1, int arg2) {
        if (arg0 != -4) {
            field3141 = null;
        }
        field3142++;
        if (arg2 == 1) {
            this.field3143 = arg1.method617(2);
        } else if (arg2 == 2) {
            this.field3140 = arg1.method568((byte) 110);
        } else if (arg2 == 3) {
            this.field3146 = arg1.method568((byte) 110);
        } else if (arg2 == 4) {
            this.field3139 = arg1.method603((byte) -10);
            return;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 76)
    public static void method1534(int arg0) {
        field3141 = null;
        field3145 = null;
        if (arg0 != 2048) {
            method1534(-18);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Leo;III)V", line = 87)
    public static final void method1535(class423 arg0, int arg1, int arg2, int arg3) {
        int var4 = 86 / ((24 - arg3) / 57);
        field3147++;
        class42.field614 = arg0;
        class275.field3511 = arg1;
        class294.field3817 = arg2;
    }
}
