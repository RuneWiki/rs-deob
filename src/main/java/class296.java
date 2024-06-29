import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class296 {

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Lse;")
    public static class211 field4658 = null;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Llc;")
    public static class86 field4663 = new class86(50);

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4666 = "";

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4664 = new CRC32();

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4667 = "Allocated memory";

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "[J")
    public static long[] field4677 = new long[100];

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field4676 = 50;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "[I")
    public static int[] field4672 = new int[field4676];

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field4670 = new String[field4676];

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "[I")
    public static int[] field4679 = new int[field4676];

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "[I")
    public static int[] field4675 = new int[field4676];

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field4668 = 100;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "[I")
    public static int[] field4669 = new int[field4676];

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "[I")
    public static int[] field4673 = new int[field4676];

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "[I")
    public static int[] field4678 = new int[field4676];

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "[I")
    public static int[] field4671 = new int[field4676];

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public int field4656;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public int field4661;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lhc;")
    public static class235 field4665;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Ld;")
    public static class244 field4657;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Ljava/awt/Image;")
    public Image field4655;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "[I")
    public int[] field4660;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "[[[Ljd;")
    public static class89[][][] field4674;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public final void method1979(byte arg0) {
        field4662++;
        class64.method407(this.field4660, this.field4661, this.field4656);
        if (arg0 >= -34) {
            method1980(87, 98, -39, -119, -111, true, 18, 11, 93, -23, 41, -24);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIZIIIIII)V")
    public static final void method1980(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg1 - arg11;
        int var13 = arg7 - arg3;
        int var14 = -1;
        field4654++;
        if (class145.field2026 > 0) {
            if (class29.field393 > 10) {
                var14 = (10 + 10 - class29.field393) * 5;
            } else {
                var14 = class29.field393 * 5;
            }
        }
        int var15 = 983040 / arg9;
        int var16 = 983040 / arg2;
        for (int var17 = -var15; var17 < (var12 + var15); var17++) {
            int var19 = arg9 * var17 + arg4 >> 16;
            int var20 = (var17 + 1) * arg9 + arg4 >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var10000 = arg6 + var20;
                int var23 = arg6 + var19;
                int var24 = arg11 + var17 >> 6;
                if (var24 >= 0 && var24 <= (class280.field4333.length - 1)) {
                    int[][] var25 = class280.field4333[var24];
                    for (int var26 = -var16; var26 < (var13 + var16); var26++) {
                        int var27 = arg2 * var26 + arg0 >> 16;
                        int var28 = (var26 + 1) * arg2 + arg0 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg8 + var27;
                            var10000 = arg8 + var28;
                            int var32 = arg3 + var26 >> 6;
                            if (var32 >= 0 && (var25.length - 1) >= var32 && var25[var32] != null) {
                                int var33 = ((var26 + arg3 & 0x3F) << 6) + (arg11 + var17 & 0x3F);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class111 var35 = class76.method489(var34 - 1, 54);
                                    if (!class93.field1296[var35.field1607]) {
                                        if (var14 != -1 && class127.field1781 == var35.field1607) {
                                            class294 var36 = new class294();
                                            var36.field4622 = var30;
                                            var36.field4626 = var23;
                                            var36.field4628 = var35.field1607;
                                            class282.field4370.method988(var36, (byte) -77);
                                        } else {
                                            class156.field2176[var35.field1607].method710(var23 - 7, var30 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class294 var18 = (class294) class282.field4370.method990(-124); var18 != null; var18 = (class294) class282.field4370.method993(-101)) {
            class64.method410(var18.field4626, var18.field4622, 15, 16776960, var14);
            class64.method410(var18.field4626, var18.field4622, 13, 16776960, var14);
            class64.method410(var18.field4626, var18.field4622, 11, 16776960, var14);
            class64.method410(var18.field4626, var18.field4622, 9, 16776960, var14);
            class156.field2176[var18.field4628].method710(var18.field4626 - 7, var18.field4622 + -7);
        }
        if (arg10 > -103) {
            field4668 = 101;
        }
        class282.field4370.method989((byte) -105);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V")
    public static final void method1981(boolean arg0) {
        class108.field1503.method544(arg0);
        field4659++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public abstract void method662(int arg0, int arg1, byte arg2, Graphics arg3);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method661(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method1982(int arg0) {
        field4657 = null;
        field4665 = null;
        field4671 = null;
        field4672 = null;
        field4675 = null;
        field4664 = null;
        field4667 = null;
        field4679 = null;
        field4673 = null;
        field4674 = null;
        field4666 = null;
        field4678 = null;
        field4670 = null;
        if (arg0 != 50) {
            field4674 = null;
        }
        field4663 = null;
        field4669 = null;
        field4677 = null;
        field4658 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method663(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    protected class296() {
    }
}
