import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class362 extends class154 {

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    private int field5724;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    private int field5727;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    private int field5726;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    private int field5721;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "I")
    private int field5731;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    private int field5733;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    private int field5728;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    private int field5722;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field5725 = 0;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public static int field5732 = 0;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "Ll;")
    public static class66 field5734 = new class66(32);

    @OriginalMember(owner = "client!in", name = "G", descriptor = "[I")
    public static int[] field5742 = new int[128];

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "[B")
    public static byte[] field5741;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZIZIZ)V", line = 4)
    public static final void method2543(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        if (!arg2) {
            field5739 = -127;
        }
        field5729++;
        class20.method228(!arg2, arg3, arg4, arg0, class31.field484.length - 1, arg1, 0);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 18)
    public class362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5724 = arg7;
        this.field5727 = arg1;
        this.field5726 = arg4;
        this.field5721 = arg5;
        this.field5731 = arg2;
        this.field5733 = arg3;
        this.field5728 = arg0;
        this.field5722 = arg6;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BI)V", line = 36)
    public static final void method2544(byte arg0, int arg1) {
        field5737++;
        if (arg0 != 112) {
            method2548(false, 124, 32, true, -113, -36, -100);
        }
        class9.field129.method649((byte) 75, arg1);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V", line = 50)
    public final void method1268(int arg0, int arg1, int arg2) {
        field5738++;
        int var4 = this.field5728 * arg0 >> 12;
        if (arg1 <= 91) {
            this.field5728 = -49;
        }
        int var5 = this.field5727 * arg2 >> 12;
        int var6 = this.field5731 * arg0 >> 12;
        int var7 = this.field5726 * arg0 >> 12;
        int var8 = this.field5733 * arg2 >> 12;
        int var9 = this.field5721 * arg2 >> 12;
        int var10 = this.field5722 * arg0 >> 12;
        int var11 = this.field5724 * arg2 >> 12;
        class208.method1545(var5, var8, var6, var9, var11, var7, this.field2498, 643358728, var4, var10);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIILqf;JLqf;Lqf;)V", line = 77)
    public static final void method2545(int arg0, int arg1, int arg2, int arg3, class64 arg4, long arg5, class64 arg6, class64 arg7) {
        class98 var9 = new class98();
        var9.field1474 = arg4;
        var9.field1472 = arg1 * 128 + 64;
        var9.field1478 = arg2 * 128 + 64;
        var9.field1475 = arg3;
        var9.field1484 = arg5;
        var9.field1481 = arg6;
        var9.field1480 = arg7;
        int var10 = 0;
        class329 var11 = class170.field2689[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field5063; var12++) {
                class297 var13 = var11.field5070[var12];
                if ((var13.field4611 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4605.method21();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1479 = -var10;
        if (class170.field2689[arg0][arg1][arg2] == null) {
            class170.field2689[arg0][arg1][arg2] = new class329(arg0, arg1, arg2);
        }
        class170.field2689[arg0][arg1][arg2].field5047 = var9;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 121)
    public static final String method2546(int arg0, String arg1) {
        field5723++;
        String var2 = class244.method1839(client.method1025(768, arg1), 84);
        if (var2 == null) {
            var2 = "";
        }
        if (arg0 != 136) {
            method2545(-116, 15, -76, -24, (class64) null, -57L, (class64) null, (class64) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(IBI)V", line = 136)
    public final void method1269(int arg0, byte arg1, int arg2) {
        if (arg1 > 37) {
            field5735++;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IBI)V", line = 147)
    public final void method1265(int arg0, byte arg1, int arg2) {
        field5730++;
        int var4 = -43 / ((-arg1 - 4) / 40);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 163)
    public static void method2547(int arg0) {
        field5741 = null;
        field5734 = null;
        field5742 = null;
        if (arg0 < 117) {
            field5740 = 100;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZIIZIII)V", line = 185)
    public static final void method2548(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class300.field4650 = arg1;
        class100.field1513 = arg4;
        field5736++;
        class236.field3671 = arg5;
        if (arg0) {
            field5742 = (int[]) null;
        }
        class187.field2934 = arg2;
        class279.field4305 = arg6;
        if (arg3 && class236.field3671 >= 100) {
            class10.field143 = class300.field4650 * 128 + 64;
            class151.field2465 = class187.field2934 * 128 + 64;
            class64.field975 = class193.method1469(class10.field143, class151.field2465, (byte) -47, class119.field1826) - class100.field1513;
        }
        class314.field4858 = 2;
    }
}
