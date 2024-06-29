import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class448 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
    public static int[] field6739 = new int[13];

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field6745 = 0;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lpa;")
    public static class254 field6744 = new class254(11, 3);

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lla;")
    public static class319 field6748 = new class319(38, -2);

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field6750 = 1;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lgk;")
    public static class336 field6743;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6747;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Z")
    public abstract boolean method2327(int arg0);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I")
    public abstract int method2325(int arg0);

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public abstract void method2318(int arg0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Loq;")
    public abstract class245 method2319(byte arg0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([SII)[S")
    public static final short[] method2735(short[] arg0, int arg1, int arg2) {
        field6742++;
        short[] var3 = new short[arg1];
        class192.method1303(arg0, 0, var3, 0, arg1);
        return arg2 == 69 ? var3 : null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
    public abstract int method2323(byte arg0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIZLuu;I)V")
    public static final void method2736(int arg0, int arg1, int arg2, boolean arg3, class191 arg4, int arg5) {
        class342.field5271 = arg1;
        class406.field6164 = 1;
        if (arg2 != 0) {
            field6748 = null;
        }
        class433.field6577 = arg3;
        class162.field2114 = arg5;
        class372.field5667 = arg0;
        class474.field7042 = 10000;
        class445.field6686 = arg4;
        field6740++;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)Z")
    public abstract boolean method2322(int arg0);

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public abstract void method2321(int arg0);

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)Z")
    public final boolean method2737(int arg0) {
        if (arg0 != -231) {
            field6743 = null;
        }
        field6738++;
        return this.method2322(-28950) || this.method2327(-32309) || this.method2326((byte) -51);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
    public static void method2738(byte arg0) {
        field6743 = null;
        if (arg0 == -2) {
            field6748 = null;
            field6747 = null;
            field6744 = null;
            field6739 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BII)I")
    public static final int method2739(byte arg0, int arg1, int arg2) {
        int var3 = 59 % ((-arg0 - 3) / 33);
        field6741++;
        int var4 = 0;
        while (arg2 > 0) {
            var4 = var4 << 1 | arg1 & 0x1;
            arg2--;
            arg1 >>>= 0x1;
        }
        return var4;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)Z")
    public abstract boolean method2326(byte arg0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(CI)C")
    public static final char method2740(char arg0, int arg1) {
        field6746++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg1 != 69) {
            return (char) 65427;
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }
}
