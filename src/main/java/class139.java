import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class139 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public int field1941 = 2048;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public int field1947 = 0;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public int field1949 = 0;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public int field1950 = 2048;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Lkg;")
    public static class82 field1946;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILp;I)V", line = 11)
    private final void method923(int arg0, int arg1, class107 arg2, int arg3) {
        int var5 = -17 % ((arg1 + 33) / 34);
        field1943++;
        if (arg3 == 1) {
            this.field1947 = arg2.method661(-1);
        } else if (arg3 == 2) {
            this.field1950 = arg2.method624(14612);
        } else if (arg3 == 3) {
            this.field1941 = arg2.method624(14612);
        } else if (arg3 == 4) {
            this.field1949 = arg2.method656(84);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BC)B", line = 44)
    public static final byte method924(byte arg0, char arg1) {
        int var2 = -28 / ((-arg0 - 70) / 56);
        field1945++;
        byte var3;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var3 = (byte) arg1;
        } else if (arg1 == '€') {
            var3 = -128;
        } else if (arg1 == '‚') {
            var3 = -126;
        } else if (arg1 == 'ƒ') {
            var3 = -125;
        } else if (arg1 == '„') {
            var3 = -124;
        } else if (arg1 == '…') {
            var3 = -123;
        } else if (arg1 == '†') {
            var3 = -122;
        } else if (arg1 == '‡') {
            var3 = -121;
        } else if (arg1 == 'ˆ') {
            var3 = -120;
        } else if (arg1 == '‰') {
            var3 = -119;
        } else if (arg1 == 'Š') {
            var3 = -118;
        } else if (arg1 == '‹') {
            var3 = -117;
        } else if (arg1 == 'Œ') {
            var3 = -116;
        } else if (arg1 == 'Ž') {
            var3 = -114;
        } else if (arg1 == '‘') {
            var3 = -111;
        } else if (arg1 == '’') {
            var3 = -110;
        } else if (arg1 == '“') {
            var3 = -109;
        } else if (arg1 == '”') {
            var3 = -108;
        } else if (arg1 == '•') {
            var3 = -107;
        } else if (arg1 == '–') {
            var3 = -106;
        } else if (arg1 == '—') {
            var3 = -105;
        } else if (arg1 == '˜') {
            var3 = -104;
        } else if (arg1 == '™') {
            var3 = -103;
        } else if (arg1 == 'š') {
            var3 = -102;
        } else if (arg1 == '›') {
            var3 = -101;
        } else if (arg1 == 'œ') {
            var3 = -100;
        } else if (arg1 == 'ž') {
            var3 = -98;
        } else if (arg1 == 'Ÿ') {
            var3 = -97;
        } else {
            var3 = 63;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V", line = 167)
    public static void method925(boolean arg0) {
        field1946 = null;
        if (arg0) {
            field1946 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V", line = 178)
    public static final void method926(int arg0, byte arg1) {
        field1944++;
        if (arg1 >= 13) {
            class64.method399(class64.field835, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
            class64.method403(-50.0F, -60.0F, -50.0F);
            class64.method398(class64.field836, 0, false);
            class64.method397();
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILp;I)V", line = 197)
    public final void method927(int arg0, class107 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method661(-1);
            if (var4 == 0) {
                field1948++;
                if (arg0 != 0) {
                    this.method923(-33, 65, (class107) null, 54);
                }
                return;
            }
            this.method923(arg2, -84, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 217)
    public static final void method928(byte arg0) {
        field1942++;
        class133.field1826.method1237((byte) 92);
        if (arg0 > -15) {
            method926(-62, (byte) 63);
        }
    }
}
