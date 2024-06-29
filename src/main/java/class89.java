import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class89 extends class15 {

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field1107 = 50;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "[I")
    public static int[] field1113 = new int[field1107];

    @OriginalMember(owner = "client!df", name = "J", descriptor = "[I")
    public static int[] field1110 = new int[field1107];

    @OriginalMember(owner = "client!df", name = "H", descriptor = "[I")
    public static int[] field1108 = new int[field1107];

    @OriginalMember(owner = "client!df", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field1115 = new String[field1107];

    @OriginalMember(owner = "client!df", name = "D", descriptor = "[[B")
    public static byte[][] field1104 = new byte[1000][];

    @OriginalMember(owner = "client!df", name = "R", descriptor = "[I")
    public static int[] field1118 = new int[field1107];

    @OriginalMember(owner = "client!df", name = "B", descriptor = "[I")
    public static int[] field1102 = new int[field1107];

    @OriginalMember(owner = "client!df", name = "S", descriptor = "[I")
    public static int[] field1119 = new int[field1107];

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Lsd;")
    public static class74 field1101 = new class74(53, 1);

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "Lrg;")
    public static class395 field1114;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1117;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "Ljava/lang/String;")
    public String field1120;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "[I")
    public static int[] field1121;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "[I")
    public static int[] field1122;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)I", line = 7)
    public final int method445(int arg0) {
        if (arg0 != -21012) {
            this.field1106 = 54;
        }
        ++field1103;
        return (int) super.field1776;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I", line = 21)
    public static final int method446(int arg0, int arg1) {
        if (arg0 != -744346942) {
            method446(99, -123);
        }
        ++field1105;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V", line = 45)
    public static void method447(int arg0) {
        field1117 = null;
        field1110 = null;
        field1113 = null;
        field1121 = null;
        field1118 = null;
        field1108 = null;
        field1119 = null;
        field1114 = null;
        field1104 = null;
        field1122 = null;
        field1101 = null;
        if (arg0 != 1067336200) {
            field1118 = null;
        }
        field1115 = null;
        field1102 = null;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V", line = 68)
    public final void method448(int arg0) {
        super.field199 = class434.method2591(-19310) - -500L | super.field199 & Long.MIN_VALUE;
        if (arg0 != 13) {
            field1114 = null;
        }
        ++field1116;
        class388.field5549.method2866(this, 674847596);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V", line = 81)
    public final void method449(boolean arg0) {
        if (!arg0) {
            field1121 = null;
        }
        super.field199 |= Long.MIN_VALUE;
        ++field1109;
        if (this.method450((byte) -72) == 0L) {
            class183.field2358.method2866(this, 674847596);
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(B)J", line = 97)
    public final long method450(byte arg0) {
        if (arg0 > -28) {
            this.method445(100);
        }
        ++field1099;
        return super.field199 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)I", line = 147)
    public final int method451(int arg0) {
        if (arg0 != 244325600) {
            field1104 = null;
        }
        ++field1112;
        return (int) (super.field1776 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(II)V", line = 159)
    public class89(int arg0, int arg1) {
        super.field1776 = (long) arg1 | (long) arg0 << 32;
    }
}
