import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class295 extends class66 {

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "Z")
    public boolean field4624;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Ljava/lang/String;")
    public String field4626;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "Z")
    public boolean field4630;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public int field4625;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "J")
    public long field4627;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public int field4631;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Ljava/lang/String;")
    public String field4623;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public int field4620;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "[I")
    public static int[] field4622 = new int[25];

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method2061(byte arg0) {
        field4622 = null;
        if (arg0 != 116) {
            field4622 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZIIII)Z")
    public static final boolean method2062(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4629++;
        for (int var6 = arg5; var6 <= arg3; var6++) {
            for (int var7 = arg4; var7 <= arg2; var7++) {
                if (class139.field2345[var6][var7] == arg0 && class17.field280[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (!arg1) {
            method2062(-104, false, -101, -51, -122, -79);
        }
        return false;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2063(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class17.field282.field4860 != arg2 && arg1 != 0 && class275.field4413 < 50 && arg5 != -1) {
            class674.field9494[class275.field4413++] = new class681((byte) 1, arg5, arg1, arg0, arg6, arg3, arg4, null);
        }
        field4621++;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class295(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field4624 = arg9;
        this.field4626 = arg1;
        this.field4630 = arg8;
        this.field4632 = arg4;
        this.field4628 = arg6;
        this.field4625 = arg2;
        this.field4627 = arg5;
        this.field4631 = arg3;
        this.field4623 = arg0;
        this.field4620 = arg7;
    }
}
