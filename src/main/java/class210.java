import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class210 {

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public int field2469 = -1;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "[J")
    public static long[] field2477 = new long[100];

    @OriginalMember(owner = "client!su", name = "f", descriptor = "Lbq;")
    public static class289 field2474 = new class289();

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public int field2470;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public int field2471;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public int field2480;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    public int field2481;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "[[[J")
    public static long[][][] field2482;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V", line = 14)
    public static final void method1247(int arg0) {
        field2476++;
        if (arg0 > -99) {
            method1247(69);
        }
        if (class514.field7327 != null) {
            for (int var1 = 0; var1 < class410.field5607; var1++) {
                class514.field7327[var1] = null;
            }
            class514.field7327 = null;
        }
        if (class431.field6321 != null) {
            for (int var2 = 0; var2 < class122.field1285; var2++) {
                class431.field6321[var2] = null;
            }
            class431.field6321 = null;
        }
        if (class675.field9565 != null) {
            for (int var3 = 0; var3 < class382.field5231; var3++) {
                class675.field9565[var3] = null;
            }
            class675.field9565 = null;
        }
        class647.field9249 = -1;
        class244.field2887 = -1;
        class707.field9970 = null;
        class280.field3432 = null;
        class228.field2600 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)I", line = 68)
    public static final int method1248(int arg0, int arg1) {
        if (arg1 > -89) {
            field2474 = null;
        }
        field2475++;
        return (arg0 & 0x3FD0F) >> 11;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V", line = 79)
    public static void method1249(int arg0) {
        if (arg0 == -2) {
            field2482 = null;
            field2474 = null;
            field2477 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIIIBI)V", line = 91)
    public static final void method1250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 != -24) {
            method1248(-19, 67);
        }
        field2473++;
        if (arg0 < 1 || arg1 < 1 || class489.field6976 - 2 < arg0 || (class153.field1677 - 2) < arg1) {
            return;
        }
        int var9 = arg2;
        if (arg2 < 3 && class728.method4056(arg1, arg0, (byte) -101)) {
            var9 = arg2 + 1;
        }
        if (class654.field9334.field9858.method2982(-123) == 0 && !class755.method4199(0, class316.field4035, var9, arg0, arg1)) {
            return;
        }
        if (class638.field9170 == null) {
            return;
        }
        class659.field9413.method594(class275.field3370, arg2, arg6, class205.field2430[arg2], arg0, arg1, 1);
        if (arg8 < 0) {
            return;
        }
        int var10 = class654.field9334.field9855.method2962(arg7 - 96);
        class654.field9334.method3924(true, class654.field9334.field9855, 1);
        class659.field9413.method589(var9, -117, class205.field2430[arg2], arg3, arg4, arg8, arg5, arg1, class275.field3370, arg0, arg2);
        class654.field9334.method3924(true, class654.field9334.field9855, var10);
        return;
    }
}
