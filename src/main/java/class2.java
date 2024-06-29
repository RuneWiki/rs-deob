import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    private int field66 = 0;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "[Lkd;")
    private class73[] field52;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lrd;")
    public static class117 field34 = class95.method812("Bitte warten Sie)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Lrd;")
    public static class117 field46 = null;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field53 = 0;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[Z")
    public static boolean[] field39 = new boolean[5];

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public static int field60 = -1;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    public static int field61 = 0;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Lrd;")
    private static class117 field40 = class95.method812("slide:", (byte) 8);

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "Lrd;")
    private static class117 field64 = class95.method812("scroll:", (byte) 8);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lrd;")
    public static class117 field30 = field64;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "Lrd;")
    public static class117 field49 = field40;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lrd;")
    public static class117 field32 = field40;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lrd;")
    public static class117 field38 = field64;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "Laa;")
    public static class2 field56 = new class2(4096);

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "Lrd;")
    public static class117 field67 = class95.method812("weiss:", (byte) 8);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "J")
    public static long field43;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "J")
    private long field54;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "Lkd;")
    private class73 field62;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "Lkd;")
    private class73 field65;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Lld;")
    public static class80 field42;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "[I")
    public static int[] field41;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "[I")
    public static int[] field51;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "[I")
    public static int[] field59;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "[Ll;")
    public static class76[] field45;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lkd;JI)V")
    public final void method18(class73 arg0, long arg1, int arg2) {
        field48++;
        if (arg0.field2029 != null) {
            arg0.method691(0);
        }
        class73 var5 = this.field52[(int) (arg1 & (long) (this.field33 + arg2))];
        arg0.field2038 = var5;
        arg0.field2029 = var5.field2029;
        arg0.field2048 = arg1;
        arg0.field2029.field2038 = arg0;
        arg0.field2038.field2029 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static final void method19(byte arg0) {
        Object var1 = class118.field2904;
        synchronized (class118.field2904) {
            if (arg0 <= 69) {
                return;
            }
            if (class27.field810 != 0) {
                class27.field810 = 1;
                try {
                    class118.field2904.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        field58++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(JZ)Lkd;")
    public final class73 method20(long arg0, boolean arg1) {
        this.field54 = arg0;
        field50++;
        if (!arg1) {
            return null;
        }
        class73 var4 = this.field52[(int) (arg0 & (long) (this.field33 - 1))];
        for (this.field62 = var4.field2038; this.field62 != var4; this.field62 = this.field62.field2038) {
            if (this.field62.field2048 == arg0) {
                class73 var5 = this.field62;
                this.field62 = this.field62.field2038;
                return var5;
            }
        }
        this.field62 = null;
        return null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Lkd;")
    public final class73 method21(int arg0) {
        field35++;
        if (this.field66 > arg0 && this.field52[this.field66 - 1] != this.field65) {
            class73 var2 = this.field65;
            this.field65 = var2.field2038;
            return var2;
        }
        while (this.field66 < this.field33) {
            class73 var3 = this.field52[this.field66++].field2038;
            if (this.field52[this.field66 - 1] != var3) {
                this.field65 = var3.field2038;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)Lkd;")
    public final class73 method22(int arg0) {
        if (arg0 != 19391) {
            this.method20(101L, false);
        }
        field36++;
        if (this.field62 == null) {
            return null;
        }
        class73 var2 = this.field52[(int) ((long) (this.field33 - 1) & this.field54)];
        while (this.field62 != var2) {
            if (this.field62.field2048 == this.field54) {
                class73 var3 = this.field62;
                this.field62 = this.field62.field2038;
                return var3;
            }
            this.field62 = this.field62.field2038;
        }
        this.field62 = null;
        return null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[BI)I")
    public static final int method23(int arg0, int arg1, byte[] arg2, int arg3) {
        field57++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class61.field1718[(var4 ^ arg2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        return arg1 == -725952120 ? var6 : 125;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
    public static final boolean method24(int arg0, int arg1) {
        if (arg0 != 23664) {
            field37 = -20;
        }
        field47++;
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Lkd;")
    public final class73 method25(boolean arg0) {
        field63++;
        if (arg0) {
            field42 = null;
        }
        this.field66 = 0;
        return this.method21(0);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(I)V")
    public class2(int arg0) {
        this.field52 = new class73[arg0];
        this.field33 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class73 var3 = this.field52[var2] = new class73();
            var3.field2029 = var3;
            var3.field2038 = var3;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public static void method26(boolean arg0) {
        field38 = null;
        field32 = null;
        field67 = null;
        field49 = null;
        field64 = null;
        field40 = null;
        if (arg0) {
            return;
        }
        field30 = null;
        field41 = null;
        field42 = null;
        field34 = null;
        field46 = null;
        field51 = null;
        field59 = null;
        field39 = null;
        field45 = null;
        field56 = null;
    }
}
