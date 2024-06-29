import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public abstract class class127 extends class402 {

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Lm;")
    public static class242 field1656 = new class242();

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "Lir;")
    public static class185 field1662;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "Z")
    public boolean field1661;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method107(byte arg0) {
        if (arg0 < 119) {
            return false;
        } else {
            field1658++;
            return false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZZIIZII)V", line = 16)
    public static final void method898(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg5 > arg3) {
            int var7 = (arg3 + arg5) / 2;
            int var8 = arg3;
            class184 var9 = class1.field15[var7];
            class1.field15[var7] = class1.field15[arg5];
            class1.field15[arg5] = var9;
            for (int var10 = arg3; var10 < arg5; var10++) {
                if (class237.method1542(arg6, arg2, var9, arg4, arg1, class1.field15[var10], true) <= 0) {
                    class184 var11 = class1.field15[var10];
                    class1.field15[var10] = class1.field15[var8];
                    class1.field15[var8++] = var11;
                }
            }
            class1.field15[arg5] = class1.field15[var8];
            class1.field15[var8] = var9;
            method898(true, arg1, arg2, arg3, arg4, var8 - 1, arg6);
            method898(true, arg1, arg2, var8 + 1, arg4, arg5, arg6);
        }
        field1652++;
        if (!arg0) {
            field1656 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 64)
    public static void method899(int arg0) {
        if (arg0 == 1) {
            field1662 = null;
            field1656 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V", line = 76)
    public static final void method900(int arg0) {
        class199.field2752.method366(-83);
        field1655++;
        if (arg0 != 1) {
            method898(true, true, -10, 57, false, -18, -33);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIZ)I", line = 88)
    public static final int method901(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method901(87, 35, false);
        }
        field1651++;
        return arg1 == 4 || arg1 == 5 ? class437.field6351[arg0 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V", line = 105)
    public final void method114(int arg0) {
        if (arg0 == 2) {
            field1653++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILtj;BIZLkm;I)V", line = 124)
    public final void method112(int arg0, class298 arg1, byte arg2, int arg3, boolean arg4, class402 arg5, int arg6) {
        int var8 = 12 / ((46 - arg2) / 45);
        field1660++;
        throw new IllegalStateException();
    }
}
