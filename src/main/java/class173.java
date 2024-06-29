import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class173 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public int field2747 = 2048;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public int field2748 = 0;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public int field2755 = 2048;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public int field2759 = 0;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "[I")
    public static int[] field2745 = new int[50];

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2754 = "skill: ";

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2751 = new String[200];

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
    public static int[] field2758 = new int[128];

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Lnc;")
    public static class171 field2746;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "[I")
    public static int[] field2749;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILug;I)V", line = 5)
    public final void method1361(int arg0, class25 arg1, int arg2) {
        if (arg0 != 16406) {
            field2754 = (String) null;
        }
        field2756++;
        while (true) {
            int var4 = arg1.method281(110);
            if (var4 == 0) {
                return;
            }
            this.method1363(arg0 ^ 0x4049, arg2, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 44)
    public static void method1362(byte arg0) {
        field2749 = null;
        if (arg0 > -65) {
            field2754 = (String) null;
        }
        field2754 = null;
        field2746 = null;
        field2758 = null;
        field2751 = null;
        field2745 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILug;I)V", line = 65)
    private final void method1363(int arg0, int arg1, class25 arg2, int arg3) {
        field2757++;
        if (arg3 == 1) {
            this.field2748 = arg2.method281(66);
        } else if (arg3 == 2) {
            this.field2755 = arg2.method314((byte) 111);
        } else if (arg3 == 3) {
            this.field2747 = arg2.method314((byte) 98);
        } else if (arg3 == 4) {
            this.field2759 = arg2.method296(-74);
        }
        if (arg0 <= 26) {
            field2749 = (int[]) null;
        }
    }
}
