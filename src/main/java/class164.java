import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class164 extends class112 {

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    private int field2588 = 4096;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    private int field2592 = 4096;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    private int field2594 = 4096;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public static int field2593 = 0;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "[[B")
    public static byte[][] field2590 = new byte[50][];

    @OriginalMember(owner = "client!df", name = "U", descriptor = "Lwm;")
    public static class152 field2598 = class262.method1805(160, 1);

    @OriginalMember(owner = "client!df", name = "X", descriptor = "Lwm;")
    public static class152 field2601 = class157.method1048("Monde de jeu cr-B-B", 123);

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "Lwm;")
    public static class152 field2603 = class157.method1048("b12_full", 121);

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "Lwm;")
    public static class152 field2604 = class157.method1048("<col=ffffff>", 97);

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "Lah;")
    public static class205 field2600;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "Lah;")
    public static class205 field2602;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILhi;)V", line = 4)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field2596++;
        if (arg0 != 31164) {
            method1099((byte) 73, false, -19, -69, 96, -123);
        }
        if (arg1 == 0) {
            this.field2594 = arg2.method2021((byte) 74);
        } else if (arg1 == 1) {
            this.field2592 = arg2.method2021((byte) 74);
        } else if (arg1 == 2) {
            this.field2588 = arg2.method2021((byte) 74);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)[[I", line = 58)
    public final int[][] method55(int arg0, boolean arg1) {
        if (arg1) {
            method1099((byte) 86, false, -17, -2, -82, -40);
        }
        field2591++;
        int[][] var3 = this.field1594.method656((byte) -7, arg0);
        if (this.field1594.field1402) {
            int[][] var4 = this.method750(0, (byte) -17, arg0);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var4[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class58.field889; var11++) {
                int var12 = var5[var11];
                int var13 = var9[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var12 == var14) {
                    var8[var11] = this.field2594 * var13 >> 12;
                    var7[var11] = this.field2592 * var12 >> 12;
                    var10[var11] = this.field2588 * var14 >> 12;
                } else {
                    var8[var11] = this.field2594;
                    var7[var11] = this.field2592;
                    var10[var11] = this.field2588;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V", line = 120)
    public static void method1097(int arg0) {
        field2590 = (byte[][]) null;
        field2600 = null;
        field2604 = null;
        if (arg0 <= -36) {
            field2598 = null;
            field2601 = null;
            field2602 = null;
            field2603 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 138)
    public class164() {
        super(1, false);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIB)I", line = 155)
    public static final int method1098(int arg0, int arg1, byte arg2) {
        field2595++;
        int var3 = 111 / ((arg2 + 48) / 47);
        int var4 = arg0 >>> 31;
        return (arg0 + var4) / arg1 - var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BZIIII)Lbg;", line = 169)
    public static final class203 method1099(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2589++;
        int var7 = (arg3 << 19) + (arg1 ? 65536 : 0) + arg4 + (arg5 << 17);
        long var8 = (long) arg2 * 3147483667L + (long) var7 * 3849834839L;
        class203 var10 = (class203) class320.field5588.method1620(true, var8);
        if (var10 != null) {
            return var10;
        }
        class181.field2892 = false;
        class203 var11 = class298.method2088(true, arg2, arg1, arg3, arg5, false, false, arg4);
        if (arg0 != 9) {
            field2590 = (byte[][]) ((byte[][]) null);
        }
        if (var11 != null && !class181.field2892) {
            class320.field5588.method1614(var11, var8, (byte) 78);
        }
        return var11;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 206)
    public static final void method1100(boolean arg0) {
        if (!arg0) {
            method1100(true);
        }
        class152.field2430.method1619(11300);
        field2597++;
    }
}
