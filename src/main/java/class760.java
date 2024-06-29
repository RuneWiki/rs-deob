import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class760 extends class766 {

    @OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
    public int field10526;

    @OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
    public int field10519;

    @OriginalMember(owner = "client!vca", name = "v", descriptor = "[I")
    public int[] field10525;

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "[[I")
    public int[][] field10518;

    @OriginalMember(owner = "client!vca", name = "s", descriptor = "[I")
    public int[] field10522;

    @OriginalMember(owner = "client!vca", name = "t", descriptor = "[Z")
    public boolean[] field10523;

    @OriginalMember(owner = "client!vca", name = "u", descriptor = "Lsv;")
    public static class570 field10524 = new class570(5, 8);

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
    public static int field10527 = -1;

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "I")
    public static int field10517;

    @OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
    public static int field10520;

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "I")
    public static int field10521;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILhia;Ljg;ILll;IIILha;)V")
    public static final void method4195(int arg0, class49 arg1, class770 arg2, int arg3, class548 arg4, int arg5, int arg6, int arg7, class475 arg8) {
        if (arg6 != -1) {
            field10524 = null;
        }
        field10517++;
        int var9 = arg7 - (arg0 / 2) - 5;
        int var10 = arg3 + 2;
        if (arg4.field7585 != 0) {
            arg8.method2765(var10, arg5 * arg1.method381() + arg3 + 1 - var10, 98, arg4.field7585, var9, arg0 + 10);
        }
        if (arg4.field7607 != 0) {
            arg8.method2771((arg3 + arg5 * arg1.method381() + 1) - var10, var9, arg4.field7607, 104, var10, arg0 + 10);
        }
        int var11 = arg4.field7615;
        if (arg2.field10635 && arg4.field7579 != -1) {
            var11 = arg4.field7579;
        }
        for (int var12 = 0; var12 < arg5; var12++) {
            String var13 = class363.field5167[var12];
            if (arg5 - 1 > var12) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg1.method385(arg8, var13, arg7, arg3, var11, true);
            arg3 += arg1.method381();
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IZ)V")
    public static final void method4196(int arg0, boolean arg1) {
        if (class420.field5820.field9471.method3201(17539) == 0) {
            arg0 = -1;
        }
        field10520++;
        if (class538.field7471 == arg0) {
            return;
        }
        if (!arg1) {
            field10527 = -16;
        }
        if (arg0 != -1) {
            class108 var2 = class422.field5876.method3123(arg0, 33);
            class418 var3 = var2.method868(6877);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class336.field4775.method906(var3.method2460(), var3.method2467(), class213.field3128, var3.method2469(), new Point(var2.field1548, var2.field1540), (byte) 110);
                class538.field7471 = arg0;
            }
        }
        if (arg0 == -1 && class538.field7471 != -1) {
            class336.field4775.method906(null, -1, class213.field3128, -1, new Point(), (byte) 117);
            class538.field7471 = -1;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
    public static void method4197(int arg0) {
        field10524 = null;
        if (arg0 != -1) {
            method4195(105, null, null, 77, null, -58, -110, 7, null);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Ljava/lang/String;IZI)V")
    public static final void method4198(String arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 <= 105) {
            method4198(null, -43, false, -65);
        }
        field10521++;
        class203.method1430(187);
        class766.method4234((byte) -78);
        class743.method4102(-1);
        class442.method2620(arg2, (byte) -80, arg3, arg0);
        class433.method2593(-79);
        class657.method3686(false, class686.field9702);
        class431.method2551(class686.field9702, 3);
        class256.method1682(class686.field9702, 92, class176.field2648);
        class364.method2190(-28517);
        class552.method3187(-17080, class581.field8365);
        class31.method262((byte) -109);
        class319.method1936((byte) 108);
        if (class141.field2306 == 3) {
            class75.method690(true, 4);
        } else if (class141.field2306 == 7) {
            class75.method690(true, 8);
        } else if (class141.field2306 == 10) {
            class75.method690(true, 11);
        } else if (class141.field2306 == 1 || class141.field2306 == 2) {
            class322.method1948(false);
        }
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(I[B)V")
    public class760(int arg0, byte[] arg1) {
        this.field10526 = arg0;
        class431 var3 = new class431(arg1);
        this.field10519 = var3.method2557(14929);
        this.field10525 = new int[this.field10519];
        this.field10518 = new int[this.field10519][];
        this.field10522 = new int[this.field10519];
        this.field10523 = new boolean[this.field10519];
        for (int var4 = 0; var4 < this.field10519; var4++) {
            this.field10525[var4] = var3.method2557(14929);
            if (this.field10525[var4] == 6) {
                this.field10525[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field10519; var5++) {
            this.field10523[var5] = var3.method2557(14929) == 1;
        }
        for (int var6 = 0; var6 < this.field10519; var6++) {
            this.field10522[var6] = var3.method2565((byte) -113);
        }
        for (int var7 = 0; var7 < this.field10519; var7++) {
            this.field10518[var7] = new int[var3.method2557(14929)];
        }
        for (int var8 = 0; var8 < this.field10519; var8++) {
            for (int var9 = 0; var9 < this.field10518[var8].length; var9++) {
                this.field10518[var8][var9] = var3.method2557(14929);
            }
        }
    }
}
