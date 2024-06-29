import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class170 extends class123 {

    @OriginalMember(owner = "client!e", name = "y", descriptor = "Z")
    public static boolean field2733 = false;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lgd;")
    public static class325 field2731 = new class325(64);

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public static int field2740 = 0;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "[I")
    public static int[] field2741 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "Lrj;")
    public static class20 field2744;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Ljava/lang/String;")
    public String field2729;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method1265(int arg0, int arg1, int arg2, int arg3) {
        field2732++;
        if (class85.field1374 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2;
        int var7 = arg1 & 0x7F;
        int var8 = arg0 & 0x7F;
        if (arg2 < 3 && (class332.field5184[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var9 = (128 - var8) * class85.field1374[var6][var4][var5] + class85.field1374[var6][var4 + 1][var5] * var8 >> 7;
        int var10 = (128 - var8) * class85.field1374[var6][var4][var5 + 1] + class85.field1374[var6][arg3 + var4][var5 + 1] * var8 >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)I", line = 37)
    public final int method1266(int arg0) {
        if (arg0 != -15430) {
            method1268(70, (byte) 1);
        }
        field2735++;
        return (int) (this.field879 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 49)
    public final void method1267(int arg0) {
        field2743++;
        int var2 = -36 % ((-arg0 - 12) / 53);
        this.field2003 = Long.MIN_VALUE & this.field2003 | class212.method1543(22326) + 500L;
        class96.field1546.method1453(this, 122);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V", line = 60)
    public static final void method1268(int arg0, byte arg1) {
        if (arg1 == -55) {
            field2742++;
            class44.field694.method2285(arg0, (byte) 100);
            class64.field933.method2285(arg0, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Z)V", line = 77)
    public final void method1269(boolean arg0) {
        field2736++;
        if (arg0) {
            this.method1269(false);
        }
        this.field2003 |= Long.MIN_VALUE;
        if (this.method1273(1) == 0L) {
            class181.field2874.method1453(this, 1);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V", line = 91)
    public static void method1270(byte arg0) {
        field2731 = null;
        field2744 = null;
        field2741 = null;
        if (arg0 != -94) {
            method1272(75, -3);
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)I", line = 118)
    public final int method1271(int arg0) {
        if (arg0 == 1193026792) {
            field2738++;
            return (int) this.field879;
        } else {
            return -28;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I", line = 132)
    public static final int method1272(int arg0, int arg1) {
        field2745++;
        int var2 = ((arg1 & 0xAAAAAAAB) >>> 1) + (arg1 & 0x55555555);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCF) >>> 2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg0 > -110) {
            method1270((byte) -123);
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)J", line = 149)
    public final long method1273(int arg0) {
        if (arg0 != 1) {
            this.field2729 = (String) null;
        }
        field2739++;
        return Long.MAX_VALUE & this.field2003;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(II)V", line = 162)
    public class170(int arg0, int arg1) {
        this.field879 = (long) arg1 | (long) arg0 << 32;
    }
}
