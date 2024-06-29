import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class56 {

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    private int field1025 = 0;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    private int field1028 = -1;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lef;")
    private class175 field1026 = new class175();

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Z")
    public boolean field1035 = false;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    private int field1031;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    private int field1021;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[[I")
    private int[][] field1022;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "[Lfc;")
    private class92[] field1024;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "[J")
    public static long[] field1030 = new long[256];

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Z")
    public static boolean field1034;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Leg;")
    public static class33 field1037;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "[I")
    public static int[] field1039;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)I")
    public static final int method374(int arg0, byte arg1) {
        field1032++;
        int var2 = -20 % ((-arg1 - 43) / 56);
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method375(byte arg0) {
        if (arg0 >= 72) {
            field1039 = null;
            field1030 = null;
            field1037 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)[[I")
    public final int[][] method376(byte arg0) {
        field1038++;
        if (this.field1031 != this.field1021) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 <= 98) {
            field1036 = 96;
        }
        while (this.field1031 > var2) {
            this.field1024[var2] = class147.field2475;
            var2++;
        }
        return this.field1022;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public final void method377(boolean arg0) {
        for (int var2 = 0; var2 < this.field1031; var2++) {
            this.field1022[var2] = null;
        }
        this.field1022 = null;
        this.field1024 = null;
        field1029++;
        this.field1026.method1178(arg0);
        this.field1026 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I")
    public final int[] method378(int arg0, int arg1) {
        field1027++;
        if (arg1 != 0) {
            field1036 = 30;
        }
        if (this.field1031 == this.field1021) {
            this.field1035 = this.field1024[arg0] == null;
            this.field1024[arg0] = class147.field2475;
            return this.field1022[arg0];
        } else if (this.field1031 == 1) {
            this.field1035 = this.field1028 != arg0;
            this.field1028 = arg0;
            return this.field1022[0];
        } else {
            class92 var3 = this.field1024[arg0];
            if (var3 == null) {
                this.field1035 = true;
                if (this.field1025 >= this.field1031) {
                    class92 var4 = (class92) this.field1026.method1177(true);
                    var3 = new class92(arg0, var4.field1504);
                    this.field1024[var4.field1513] = null;
                    var4.method655(63);
                } else {
                    var3 = new class92(arg0, this.field1025);
                    this.field1025++;
                }
                this.field1024[arg0] = var3;
            } else {
                this.field1035 = false;
            }
            this.field1026.method1170(true, var3);
            return this.field1022[var3.field1504];
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(III)V")
    public class56(int arg0, int arg1, int arg2) {
        this.field1031 = arg0;
        this.field1021 = arg1;
        this.field1022 = new int[this.field1031][arg2];
        this.field1024 = new class92[this.field1021];
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1030[var0] = var1;
        }
        field1034 = false;
        field1037 = null;
        field1036 = 0;
        field1039 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
    }
}
