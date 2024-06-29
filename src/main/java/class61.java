import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class61 extends class246 {

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "Lsf;")
    private class551 field837;

    @OriginalMember(owner = "client!gda", name = "p", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "client!gda", name = "q", descriptor = "I")
    private int field842;

    @OriginalMember(owner = "client!gda", name = "u", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "client!gda", name = "r", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
    private int field836;

    @OriginalMember(owner = "client!gda", name = "t", descriptor = "Lfja;")
    public static class783 field845 = new class783(80, -1);

    @OriginalMember(owner = "client!gda", name = "x", descriptor = "Lem;")
    public static class239 field849 = new class239();

    @OriginalMember(owner = "client!gda", name = "y", descriptor = "Z")
    public static boolean field850 = false;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!gda", name = "s", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!gda", name = "w", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!gda", name = "v", descriptor = "Lpj;")
    private class158 field847;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIILha;IBI)Lka;")
    public static final class499 method423(int arg0, int arg1, int arg2, class66 arg3, int arg4, byte arg5, int arg6) {
        field838++;
        long var7 = (long) arg2;
        class499 var9 = (class499) class663.field9208.method266((byte) -122, var7);
        short var10 = 2055;
        if (var9 == null) {
            class5 var11 = class245.method1636(arg2, class109.field1705, 0, 2);
            if (var11 == null) {
                return null;
            }
            if (var11.field101 < 13) {
                var11.method35((byte) -113, 2);
            }
            var9 = arg3.method505(var11, var10, class547.field7432, 64, 768);
            class663.field9208.method270(var9, var7, -124);
        }
        if (arg5 < 60) {
            return null;
        }
        class499 var12 = var9.method324((byte) 2, var10, true);
        if (arg0 != 0) {
            var12.method320(arg0);
        }
        if (arg4 != 0) {
            var12.method316(arg4);
        }
        if (arg6 != 0) {
            var12.method302(arg6);
        }
        if (arg1 != 0) {
            var12.method305(0, arg1, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)V")
    public static void method424(byte arg0) {
        if (arg0 != 69) {
            method423(99, 88, -18, null, -40, (byte) -101, -3);
        }
        field845 = null;
        field849 = null;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)Z")
    public static final boolean method425(int arg0, int arg1, int arg2) {
        if (arg1 != 16340) {
            field850 = true;
        }
        field844++;
        if (arg2 >= 0 && arg0 >= 0 && arg2 < class554.field7832[1].length && arg0 < class554.field7832[1][arg2].length) {
            return (class554.field7832[1][arg2][arg0] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)[B")
    public static final byte[] method426(int arg0, int arg1) {
        field835++;
        class700 var2 = (class700) class14.field217.method1077((long) arg1, (byte) 123);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class38.method235(var7, 119, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class700(var3);
            class14.field217.method1079(var2, (long) arg1, (byte) -102);
        }
        return arg0 == 2 ? var2.field9651 : null;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIIII)V")
    public static final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field839++;
        if (arg5 != 29270) {
            field849 = null;
        }
        class12[] var7 = class13.field198;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class12 var9 = var7[var8];
            if (var9 != null && var9.field194 == 2) {
                class68.method621((byte) -102, var9.field183 * 2, arg4 >> 1, var9.field187, var9.field193, arg3 >> 1, var9.field188, arg0, arg6);
                if (class538.field7307[0] > -1 && (class440.field5977 % 20) < 10) {
                    class604 var10 = class18.field424[var9.field195];
                    int var11 = class538.field7307[0] + arg2 - 12;
                    int var12 = arg1 + class538.field7307[1] - 28;
                    var10.method3430(var11, var12);
                    class686.method3861(var11, var11 + var10.method224(), arg5 ^ 0x2A84, var12, var12 + var10.method218());
                }
            }
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lsf;IIIIII)V")
    public class61(class551 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field837 = arg0;
        this.field841 = arg6;
        this.field840 = arg4;
        this.field842 = arg2;
        this.field846 = arg1;
        this.field843 = arg3;
        this.field836 = arg5;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)Lpj;")
    public final class158 method428(boolean arg0) {
        field848++;
        if (this.field847 == null) {
            class111.field1735[3] = this.field840;
            class162 var2 = this.field837.field970;
            class111.field1735[0] = this.field846;
            class111.field1735[5] = this.field841;
            class111.field1735[4] = this.field836;
            class111.field1735[2] = this.field843;
            class111.field1735[1] = this.field842;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1274(class111.field1735[var5], 21532)) {
                    return null;
                }
                class311 var7 = var2.method1270(class111.field1735[var5], true);
                int var8 = var7.field4248 ? 64 : 128;
                if (var7.field4238 > 0) {
                    var3 = 1;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class21.field459[var6] = var2.method1269(1.0F, var4, false, class111.field1735[var6], var4, !arg0);
            }
            this.field847 = this.field837.method847(var4, (byte) -117, var3 != 0, class21.field459);
        }
        if (arg0) {
            this.method428(false);
        }
        return this.field847;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(BI)V")
    public static final void method429(byte arg0, int arg1) {
        field834++;
        int var2 = 104 / ((arg0 + 24) / 49);
        if (class659.method3706(108, arg1)) {
            class473.method2720(-1, class431.field5870[arg1], 106);
        }
    }
}
