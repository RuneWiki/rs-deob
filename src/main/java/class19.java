import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public abstract class class19 {

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "[J")
    public static long[] field203 = new long[32];

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "Z")
    public static volatile boolean field202 = false;

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "I")
    public static int field205 = -1;

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "[[B")
    public static byte[][] field207 = new byte[1000][];

    @OriginalMember(owner = "mapview!k", name = "i", descriptor = "Lna;")
    public static class26 field210 = class6.method40("Gem Shop", 48);

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "J")
    public static long field206;

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "[I")
    public static int[] field209;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Z[Lna;)V", line = 19)
    public static final void method115(boolean arg0, class26[] arg1) {
        if (!arg0) {
            field203 = null;
        }
        class2.method15(arg1.length, arg1, -2, 0);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Lna;Lna;ILa;)[Lq;", line = 30)
    public static final class30[] method116(class26 arg0, class26 arg1, int arg2, class1 arg3) {
        int var4 = arg3.method10(false, arg1);
        int var5 = arg3.method11(arg0, var4, (byte) 87);
        return arg2 <= 117 ? (class30[]) null : class38.method255(var5, var4, (byte) -120, arg3);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)V", line = 61)
    public static final void method117(int arg0) {
        if (class16.field189.toLowerCase().indexOf("microsoft") == -1) {
            class32.field414[59] = 57;
            class32.field414[92] = 74;
            class32.field414[46] = 72;
            class32.field414[91] = 42;
            class32.field414[47] = 73;
            class32.field414[61] = 27;
            class32.field414[44] = 71;
            if (class16.field194 == null) {
                class32.field414[222] = 59;
                class32.field414[192] = 58;
            } else {
                class32.field414[520] = 59;
                class32.field414[192] = 28;
                class32.field414[222] = 58;
            }
            class32.field414[45] = 26;
            class32.field414[93] = 43;
        } else {
            class32.field414[189] = 26;
            class32.field414[190] = 72;
            class32.field414[192] = 58;
            class32.field414[191] = 73;
            class32.field414[187] = 27;
            class32.field414[186] = 57;
            class32.field414[221] = 43;
            class32.field414[219] = 42;
            class32.field414[220] = 74;
            class32.field414[223] = 28;
            class32.field414[188] = 71;
            class32.field414[222] = 59;
        }
        if (arg0 != -10266) {
            method117(86);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)V", line = 120)
    public static void method119(int arg0) {
        field210 = null;
        field203 = null;
        int var1 = 51 % ((-arg0 - 62) / 61);
        field209 = null;
        field207 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I[B)V")
    public abstract void method118(int arg0, byte[] arg1);

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(I)[B")
    public abstract byte[] method120(int arg0);
}
