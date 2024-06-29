import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class64 extends class227 {

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    private int field967;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    private int field970;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    private int field965;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field968 = 0;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "[J")
    public static long[] field975 = new long[32];

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "[[Z")
    public static boolean[][] field971;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
    public static void method484(int arg0) {
        field975 = null;
        if (arg0 != 0) {
            method484(-72);
        }
        field971 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIB)V")
    public final void method485(int arg0, int arg1, byte arg2) {
        if (arg2 != 124) {
            field971 = null;
        }
        ++field974;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
    public final void method486(int arg0, int arg1, int arg2) {
        ++field966;
        if (arg2 != 769) {
            field968 = 50;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(III)V")
    public final void method487(int arg0, int arg1, int arg2) {
        int var4 = this.field967 * arg0 >> 12;
        int var5 = this.field965 * arg0 >> 12;
        int var6 = this.field970 * arg2 >> 12;
        ++field972;
        if (arg1 == 8199) {
            int var7 = this.field973 * arg2 >> 12;
            class292.method1985(var6, var4, var7, super.field3331, var5, true);
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IIIIII)V")
    public class64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field973 = arg3;
        this.field967 = arg2;
        this.field970 = arg1;
        this.field965 = arg0;
    }
}
