import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class247 extends class290 {

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "[I")
    private int[] field3564 = new int[this.field4337];

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "[I")
    public static int[] field3559 = new int[14];

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field3560 = 0;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field3562 = 0;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    private int field3558;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    private int field3563;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "[B")
    private byte[] field3566;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "[[[B")
    public static byte[][][] field3565;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZC)Z", line = 4)
    public static final boolean method1691(boolean arg0, char arg1) {
        field3569++;
        if (!arg0) {
            field3560 = 48;
        }
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V", line = 16)
    public final void method1049(byte arg0) {
        this.field3563 = 0;
        field3568++;
        if (arg0 != -25) {
            method1693((String) null, false);
        }
        this.field3558 = 0;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V", line = 29)
    public static void method1692(byte arg0) {
        field3565 = (byte[][][]) null;
        field3559 = null;
        if (arg0 >= -10) {
            field3562 = -113;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IB)V", line = 45)
    public void method192(int arg0, byte arg1) {
        this.field3566[this.field3558++] = (byte) ((class47.method303(255, arg1) >> 1) + 127);
        field3561++;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 54)
    public final void method1050(int arg0) {
        field3557++;
        this.field3563 = Math.abs(this.field3563);
        if (this.field3563 >= 4096) {
            this.field3563 = 4095;
        }
        if (arg0 >= 120) {
            this.method192(this.field3558++, (byte) (this.field3563 >> 4));
            this.field3563 = 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 72)
    public static final int method1693(String arg0, boolean arg1) {
        if (!arg1) {
            field3559 = (int[]) null;
        }
        field3567++;
        if (class132.field1811 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class132.field1811.field2397; var2++) {
            if (class170.method1199(true, " ", class132.field1811.field2390[var2], "<br>").equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)V", line = 101)
    public final void method1051(byte arg0, int arg1, int arg2) {
        field3556++;
        if (arg0 != -125) {
            this.method1050(-26);
        }
        this.field3563 += this.field3564[arg2] * arg1 >> 12;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIIF)V", line = 120)
    public class247(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field4337; var7++) {
            this.field3564[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)Z", line = 145)
    public static final boolean method1694(int arg0, boolean arg1) {
        boolean var2 = class40.method240();
        int var3 = -70 % ((-arg0 - 25) / 63);
        field3555++;
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class40.method247();
        } else if (!class40.method249() || !class40.method246() || !class40.method243()) {
            arg1 = false;
        }
        class204.field2911 = arg1;
        class275.method1894((byte) -37, class165.field2258);
        if (arg1 == var2) {
            return false;
        } else {
            ((class204) class184.field2543).method1450((byte) 124);
            return true;
        }
    }
}
