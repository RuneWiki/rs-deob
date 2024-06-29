import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class32 extends class467 {

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Ljava/lang/String;")
    public String field492;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "Ljava/lang/String;")
    public String field494;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "J")
    public long field493;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Z")
    public boolean field487;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "Z")
    public boolean field489;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field486 = 0;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "[C")
    public static char[] field491 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "[I")
    public static int[] field490 = new int[14];

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Z")
    public static boolean field496;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public static void method232(byte arg0) {
        field490 = null;
        field491 = null;
        if (arg0 != -39) {
            field491 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IJ)V")
    public static final void method233(int arg0, long arg1) {
        if (arg0 != 1) {
            method233(70, 47L);
        }
        field495++;
        if (class380.field5802 != null) {
            if (class432.field6409 == 1 || class432.field6409 == 5) {
                class381.method2366((byte) -6, arg1);
            } else if (class432.field6409 == 4) {
                class226.method1553(arg1, 0);
            }
        }
        class115.method745(class337.field5242, (long) class405.field6116, (byte) 40);
        if (class329.field5062 != -1) {
            class201.method1404(class329.field5062, arg0 - 107);
        }
        for (int var3 = 0; var3 < class425.field6335; var3++) {
            if (class326.field5002[var3]) {
                class527.field7783[var3] = true;
            }
            class15.field252[var3] = class326.field5002[var3];
            class326.field5002[var3] = false;
        }
        class336.field5233 = class405.field6116;
        if (class337.field5242.method1132()) {
            class369.field5663 = true;
        }
        if (class329.field5062 != -1) {
            class425.field6335 = 0;
            class309.method1992((byte) -120);
        }
        class337.field5242.method1107();
        class242.method1616(class337.field5242, 269555143);
        int var4 = class110.method729(false);
        if (var4 == -1) {
            var4 = class479.field7008;
        }
        if (var4 == -1) {
            var4 = class170.field2470;
        }
        class35.method262(var4, (byte) 71);
        class166.method1166(class339.field5365.field2215, class339.field5365.field2210, -84, class501.field7485, class339.field5365.field2217);
        class501.field7485 = 0;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class32(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field492 = arg0;
        this.field488 = arg6;
        this.field494 = arg1;
        this.field484 = arg7;
        this.field493 = arg5;
        this.field487 = arg9;
        this.field489 = arg8;
        this.field498 = arg4;
        this.field497 = arg2;
        this.field485 = arg3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
    public static final int method234(int arg0, int arg1) {
        if (arg0 != 2716) {
            field486 = 43;
        }
        field499++;
        return arg1 & 0xFF;
    }
}
