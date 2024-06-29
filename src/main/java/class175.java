import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class class175 extends class249 {

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "[Lgk;")
    public class175[] field3033;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Z")
    public boolean field3034;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "Lmb;")
    public static class96 field3041 = class243.method1708("Verbindung abgebrochen)3", (byte) 104);

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "Lmb;")
    private static class96 field3047 = class243.method1708("yellow:", (byte) 99);

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "Lmb;")
    public static class96 field3042 = field3047;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "Lmb;")
    public static class96 field3038 = field3047;

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "Loa;")
    public static class262 field3048 = new class262();

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "Lmb;")
    public static class96 field3049 = class243.method1708("::fps ", (byte) 115);

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "Lmb;")
    public static class96 field3050 = class243.method1708("Eingabeprozedur geladen)3", (byte) 91);

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "J")
    public static long field3053 = 0L;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "Lne;")
    public class115 field3044;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "Lae;")
    public class89 field3035;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BILrg;)V")
    public void method115(byte arg0, int arg1, class239 arg2) {
        int var4 = -90 / ((arg0 + 22) / 58);
        field3046++;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V")
    public static void method1250(byte arg0) {
        if (arg0 != 10) {
            return;
        }
        field3049 = null;
        field3041 = null;
        field3042 = null;
        field3047 = null;
        field3048 = null;
        field3038 = null;
        field3050 = null;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I")
    public int method1034(int arg0) {
        if (arg0 == -25939) {
            field3032++;
            return -1;
        } else {
            return 88;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)[[I")
    public int[][] method77(int arg0, int arg1) {
        if (arg1 == 64) {
            field3029++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIILnb;Lnb;IIIIJ)V")
    public static final void method1251(int arg0, int arg1, int arg2, int arg3, class108 arg4, class108 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class105 var12 = new class105();
        var12.field1766 = arg10;
        var12.field1758 = arg1 * 128 + 64;
        var12.field1760 = arg2 * 128 + 64;
        var12.field1765 = arg3;
        var12.field1754 = arg4;
        var12.field1757 = arg5;
        var12.field1768 = arg6;
        var12.field1759 = arg7;
        var12.field1755 = arg8;
        var12.field1762 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class259.field4487[var13][arg1][arg2] == null) {
                class259.field4487[var13][arg1][arg2] = new class187(var13, arg1, arg2);
            }
        }
        class259.field4487[arg0][arg1][arg2].field3269 = var12;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
    public void method1038(int arg0) {
        if (this.field3034) {
            this.field3044.method909(-123);
            this.field3044 = null;
        } else {
            this.field3035.method634(arg0 - 23159);
            this.field3035 = null;
        }
        field3040++;
        if (arg0 != 23160) {
            field3042 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBI)V")
    public final void method1252(int arg0, byte arg1, int arg2) {
        field3037++;
        if (arg1 != -34) {
            return;
        }
        int var4 = this.field3028 == 255 ? arg2 : this.field3028;
        if (this.field3034) {
            this.field3044 = new class115(var4, arg2, arg0);
        } else {
            this.field3035 = new class89(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)[I")
    public int[] method1(byte arg0, int arg1) {
        field3036++;
        int var3 = 85 % ((62 - arg0) / 54);
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)[[I")
    public final int[][] method1253(int arg0, int arg1, int arg2) {
        field3039++;
        if (arg1 != -2880) {
            method1250((byte) 95);
        }
        if (this.field3033[arg2].field3034) {
            int[] var4 = this.field3033[arg2].method1((byte) 3, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3033[arg2].method77(arg0, 64);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lrg;B)V")
    public static final void method1254(class239 arg0, byte arg1) {
        field3043++;
        int var2 = arg0.method1666(arg1 + 24374);
        class85.field1432 = new class258[var2];
        if (arg1 != -26) {
            field3050 = null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class85.field1432[var3] = new class258();
            class85.field1432[var3].field4471 = arg0.method1666(arg1 ^ 0xFFFFA0FA);
            class85.field1432[var3].field4472 = arg0.method1641(118);
        }
        class259.field4477 = arg0.method1666(24348);
        class52.field908 = arg0.method1666(24348);
        class17.field248 = arg0.method1666(24348);
        class83.field1414 = new class36[class52.field908 + 1 - class259.field4477];
        for (int var4 = 0; var4 < class17.field248; var4++) {
            int var5 = arg0.method1666(arg1 + 24374);
            class36 var6 = class83.field1414[var5] = new class36();
            var6.field782 = arg0.method1651(4139);
            var6.field783 = arg0.method1617((byte) -43);
            var6.field621 = class259.field4477 + var5;
            var6.field614 = arg0.method1641(122);
            var6.field624 = arg0.method1641(120);
        }
        class250.field4330 = arg0.method1617((byte) -43);
        class31.field488 = true;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)[I")
    public final int[] method1255(int arg0, int arg1, int arg2) {
        field3027++;
        if (arg2 != 128) {
            this.method1252(-21, (byte) -83, 8);
        }
        return this.field3033[arg0].field3034 ? this.field3033[arg0].method1((byte) -103, arg1) : this.field3033[arg0].method77(arg1, 64)[0];
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(IZ)V")
    public class175(int arg0, boolean arg1) {
        this.field3033 = new class175[arg0];
        this.field3034 = arg1;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)I")
    public int method1256(byte arg0) {
        int var2 = -124 % ((13 - arg0) / 59);
        field3030++;
        return -1;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V")
    public void method150(int arg0) {
        if (arg0 == 2) {
            field3031++;
        }
    }
}
