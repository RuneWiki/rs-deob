import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class106 {

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Lsf;")
    private class143 field1421 = new class143(256);

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "Lsf;")
    private class143 field1430 = new class143(256);

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lqj;")
    private class238 field1422;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Lqj;")
    private class238 field1424;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Los;")
    public static class378 field1418;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Lmi;")
    public static class408 field1425;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "Ljava/awt/Frame;")
    public static Frame field1428;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "[I")
    public static int[] field1417;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[II)Lok;", line = 4)
    private final class61 method729(int arg0, int arg1, int[] arg2, int arg3) {
        field1420++;
        int var5 = arg1 ^ (arg0 << 4 & 0xFFF2 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class61 var9 = (class61) this.field1430.method954(-48, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class375 var10 = (class375) this.field1421.method954(arg3 - 355, var7);
            if (arg3 != 256) {
                field1413 = 7;
            }
            if (var10 == null) {
                var10 = class375.method2485(this.field1422, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field1421.method956(false, var7, var10);
            }
            class61 var11 = var10.method2486(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method2574((byte) 125);
                this.field1430.method956(false, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 63)
    public static void method730(byte arg0) {
        if (arg0 >= 0) {
            method730((byte) 29);
        }
        field1417 = null;
        field1428 = null;
        field1425 = null;
        field1418 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[III)Lok;", line = 79)
    private final class61 method731(int arg0, int[] arg1, int arg2, int arg3) {
        field1426++;
        int var5 = arg2 ^ (arg3 >>> 12 | (arg3 & 0xFFF) << 4);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        if (arg0 != 18334) {
            this.method731(101, (int[]) null, 87, -55);
        }
        class61 var9 = (class61) this.field1430.method954(-63, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class44 var10 = class44.method328(this.field1424, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class61 var11 = var10.method327();
            this.field1430.method956(false, var7, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field875.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)I", line = 120)
    public static final int method732(int arg0, byte arg1, int arg2) {
        int var3 = -1 / ((arg1 + 47) / 59);
        field1429++;
        int var4 = class194.method1217(arg0 + 91923, (byte) -7, arg2 + 45365, 4) + (class194.method1217(arg0 + 37821, (byte) -7, arg2 + 10294, 2) - 128 >> 1) + (class194.method1217(arg0, (byte) -7, arg2, 1) + -128 >> 2) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[I)Lok;", line = 142)
    public final class61 method733(int arg0, int arg1, int[] arg2) {
        field1415++;
        if (this.field1422.method1469((byte) -125) == 1) {
            return this.method729(0, arg0, arg2, 256);
        }
        if (arg1 >= -85) {
            field1413 = 7;
        }
        if (this.field1422.method1476(arg0, (byte) -72) != 1) {
            throw new RuntimeException();
        }
        return this.method729(arg0, 0, arg2, 256);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 162)
    public static final void method734(int arg0) {
        field1416++;
        if (class222.field3146) {
            return;
        }
        class91.field1263 = true;
        if (class329.field4714) {
            class170.field2244 = (float) ((int) class170.field2244 + 191 & 0xFFFFFF80);
        } else {
            class6.field51 += (24.0F - class6.field51) / 2.0F;
        }
        class222.field3146 = true;
        int var1 = -102 % ((arg0 + 1) / 59);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V", line = 189)
    public static final void method735(int arg0) {
        field1419++;
        class232.field3279.method756(0, 170);
        class431.field6363++;
        class232.field3279.method1707(-115, class6.method51(-70));
        if (arg0 >= -95) {
            field1423 = -61;
        }
        class232.field3279.method1693(class345.field5120, (byte) 64);
        class232.field3279.method1693(class274.field4034, (byte) 123);
        class232.field3279.method1707(21, class369.field5483);
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lqj;Lqj;)V", line = 234)
    public class106(class238 arg0, class238 arg1) {
        this.field1422 = arg1;
        this.field1424 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B[II)Lok;", line = 208)
    public final class61 method736(byte arg0, int[] arg1, int arg2) {
        if (arg0 <= 55) {
            this.field1424 = null;
        }
        field1414++;
        if (this.field1424.method1469((byte) -8) == 1) {
            return this.method731(18334, arg1, arg2, 0);
        } else if (this.field1424.method1476(arg2, (byte) -72) == 1) {
            return this.method731(18334, arg1, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }
}
