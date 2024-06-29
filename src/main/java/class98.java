import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class98 {

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    private int field2164 = 0;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    private int field2159;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "[Lld;")
    private class70[] field2152;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Llc;")
    public static class69 field2142 = class69.method470((byte) -128, "Connection timed out");

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Llc;")
    public static class69 field2147 = class69.method470((byte) -100, ":0");

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Llc;")
    public static class69 field2150 = class69.method470((byte) -120, ")3");

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Llc;")
    public static class69 field2146 = class69.method470((byte) -128, "Please contact customer support)3");

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Llc;")
    public static class69 field2154 = class69.method470((byte) -101, "runes");

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Llc;")
    public static class69 field2157 = class69.method470((byte) -128, "@gre@");

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field2158 = -1;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "J")
    private long field2143;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lld;")
    private class70 field2161;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Lld;")
    private class70 field2163;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Loa;")
    public static class85 field2155;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[B")
    public static byte[] field2141;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Lld;")
    public final class70 method739(boolean arg0) {
        field2149++;
        if (!arg0) {
            return null;
        } else if (this.field2161 == null) {
            return null;
        } else {
            class70 var2 = this.field2152[(int) (this.field2143 & (long) (this.field2159 - 1))];
            while (this.field2161 != var2) {
                if (this.field2161.field1554 == this.field2143) {
                    class70 var3 = this.field2161;
                    this.field2161 = this.field2161.field1550;
                    return var3;
                }
                this.field2161 = this.field2161.field1550;
            }
            this.field2161 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method740(int arg0) {
        field2146 = null;
        field2150 = null;
        field2141 = null;
        field2154 = null;
        field2147 = null;
        field2155 = null;
        if (arg0 >= -36) {
            field2142 = null;
        }
        field2142 = null;
        field2157 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lld;")
    private final class70 method741(int arg0) {
        if (arg0 > -22) {
            field2157 = null;
        }
        field2153++;
        if (this.field2164 > 0 && this.field2152[this.field2164 - 1] != this.field2163) {
            class70 var2 = this.field2163;
            this.field2163 = var2.field1550;
            return var2;
        }
        while (this.field2159 > this.field2164) {
            class70 var3 = this.field2152[this.field2164++].field1550;
            if (this.field2152[this.field2164 - 1] != var3) {
                this.field2163 = var3.field1550;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Lld;")
    public final class70 method742(int arg0) {
        if (arg0 != 21816) {
            this.method741(84);
        }
        this.field2164 = 0;
        field2144++;
        return this.method741(-34);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLkc;Llc;Llc;)Lhc;")
    public static final class45 method743(byte arg0, class63 arg1, class69 arg2, class69 arg3) {
        if (arg0 > -53) {
            return null;
        } else {
            field2151++;
            int var4 = arg1.method400(arg3, (byte) 71);
            int var5 = arg1.method390(var4, arg2, 104);
            return class77.method549(var4, arg1, (byte) 59, var5);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)Lld;")
    public final class70 method744(int arg0, long arg1) {
        field2145++;
        this.field2143 = arg1;
        class70 var4 = this.field2152[(int) (arg1 & (long) (this.field2159 + arg0))];
        for (this.field2161 = var4.field1550; this.field2161 != var4; this.field2161 = this.field2161.field1550) {
            if (this.field2161.field1554 == arg1) {
                class70 var5 = this.field2161;
                this.field2161 = this.field2161.field1550;
                return var5;
            }
        }
        this.field2161 = null;
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lld;JI)V")
    public final void method745(class70 arg0, long arg1, int arg2) {
        field2160++;
        if (arg0.field1556 != null) {
            arg0.method502(0);
        }
        class70 var5 = this.field2152[(int) ((long) (this.field2159 + arg2) & arg1)];
        arg0.field1550 = var5;
        arg0.field1556 = var5.field1556;
        arg0.field1556.field1550 = arg0;
        arg0.field1550.field1556 = arg0;
        arg0.field1554 = arg1;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
    public class98(int arg0) {
        this.field2159 = arg0;
        this.field2152 = new class70[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class70 var3 = this.field2152[var2] = new class70();
            var3.field1556 = var3;
            var3.field1550 = var3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILkc;I)[Lda;")
    public static final class20[] method746(int arg0, int arg1, class63 arg2, int arg3) {
        if (arg0 == -10270) {
            field2156++;
            return class101.method768(500, arg1, arg2, arg3) ? class75.method534(255) : null;
        } else {
            return null;
        }
    }
}
