import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class2 {

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "[I")
    private int[] field38;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "[I")
    public static int[] field35 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "[I")
    public static int[] field41 = new int[50];

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Loc;")
    public static class99 field30 = class48.method402((byte) -104, "Titelbild geladen)3");

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Loc;")
    private static class99 field36 = class48.method402((byte) -104, "Please close the interface you have open before using (Wreport abuse(W");

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Loc;")
    public static class99 field29 = field36;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Loc;")
    private static class99 field44 = class48.method402((byte) -104, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Loc;")
    public static class99 field27 = field44;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Ldc;")
    public static class24 field33;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Ljc;")
    public static class64 field26;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "[I")
    public static int[] field43;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "[Loc;")
    public static class99[] field42;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "[[[B")
    public static byte[][][] field39;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[[[I")
    public static int[][][] field31;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Loc;B)Z")
    public static final boolean method7(class99 arg0, byte arg1) {
        if (arg1 != -51) {
            field42 = null;
        }
        field28++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class9.field230; var2++) {
            if (arg0.method845(class17.field463[var2], 63)) {
                return true;
            }
        }
        return arg0.method845(class69.field1770.field3034, arg1 ^ 0xFFFFFFF2);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(JB)V")
    public static final void method8(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 == 23) {
            field32++;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZI)I")
    public final int method9(boolean arg0, int arg1) {
        field34++;
        int var3 = this.field38.length - 2;
        if (!arg0) {
            field27 = null;
        }
        int var4 = arg1 << 1 & var3;
        while (true) {
            int var5 = this.field38[var4];
            if (arg1 == var5) {
                return this.field38[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method10(int arg0) {
        if (arg0 > -18) {
            method8(-117L, (byte) -103);
        }
        field39 = null;
        field42 = null;
        field35 = null;
        field36 = null;
        field43 = null;
        field44 = null;
        field31 = null;
        field41 = null;
        field27 = null;
        field29 = null;
        field26 = null;
        field33 = null;
        field30 = null;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([I)V")
    public class2(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field38 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field38[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field38[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field38[var5 + var5] = arg0[var4];
            this.field38[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZI)I")
    public static final int method11(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method7(null, (byte) -14);
        }
        field40++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
