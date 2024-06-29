import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class110 extends class171 {

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[I")
    public static int[] field1630 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "[I")
    public static int[] field1636 = new int[25];

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIB)V", line = 11)
    public final void method242(int arg0, int arg1, byte arg2) {
        if (arg2 >= -105) {
            return;
        }
        field1626++;
        int var4 = this.field1627 * arg1 >> 12;
        int var5 = this.field1633 * arg1 >> 12;
        int var6 = this.field1635 * arg0 >> 12;
        int var7 = this.field1631 * arg0 >> 12;
        class148.method1058(var6, (byte) -116, this.field2672, var5, var4, this.field2663, this.field2667, var7);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIIII)V", line = 30)
    public class110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1633 = arg2;
        this.field1627 = arg0;
        this.field1635 = arg1;
        this.field1631 = arg3;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V", line = 46)
    public static void method731(byte arg0) {
        field1630 = null;
        if (arg0 <= -10) {
            field1636 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 61)
    public static final void method732(int arg0) {
        field1637++;
        for (int var1 = 0; var1 < 100; var1++) {
            class116.field1694[var1] = true;
        }
        if (arg0 != 100) {
            field1632 = 67;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZI)V", line = 79)
    public final void method236(int arg0, boolean arg1, int arg2) {
        field1629++;
        if (!arg1) {
            field1630 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBI)V", line = 89)
    public final void method244(int arg0, byte arg1, int arg2) {
        field1634++;
        if (arg1 < 93) {
            field1636 = (int[]) null;
        }
        int var4 = this.field1633 * arg2 >> 12;
        int var5 = this.field1635 * arg0 >> 12;
        int var6 = this.field1627 * arg2 >> 12;
        int var7 = this.field1631 * arg0 >> 12;
        class249.method1770(var4, var5, var6, this.field2667, false, var7);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Lbb;", line = 108)
    public static final class148 method733(int arg0) {
        field1628++;
        if (class88.field1258 == null) {
            return null;
        }
        class47.field686.method2009(class88.field1258, -30558);
        class148 var1 = (class148) class47.field686.method2011(-1);
        if (arg0 != 16383) {
            field1636 = (int[]) null;
        }
        class312 var2 = class165.method1150(var1.field2378, (byte) -50);
        return var2 != null && var2.field5088 && var2.method2179(11902) ? var1 : class228.method1552(true);
    }
}
