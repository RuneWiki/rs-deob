import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class527 {

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public int field7018 = 128;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public int field7020 = 128;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public int field7019;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public int field7021;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public int field7015;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public int field7013;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Z")
    public static boolean field7016 = false;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Ldb;")
    public static class298 field7024 = new class298(80, 4);

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "[I")
    public static int[] field7027 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Llt;")
    public static class633 field7026 = new class633("LIVE", 0);

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "Z")
    public static boolean field7028 = false;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "F")
    public static float field7025;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)V")
    public static final void method2941(int arg0, byte arg1) {
        if (class431.field5903 == null) {
            class431.field5903 = new byte[4][class34.field530][class34.field531];
        }
        int var2 = 18 % ((arg0 - 51) / 42);
        field7017++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < class34.field530; var4++) {
                for (int var5 = 0; var5 < class34.field531; var5++) {
                    class431.field5903[var3][var4][var5] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILgba;II)V")
    public static final void method2942(int arg0, class625 arg1, int arg2, int arg3) {
        if (class400.field5305) {
            class538 var4 = class2.field26 == -1 ? null : class282.field4001.method3062((byte) -92, class2.field26);
            if (client.method1701(arg1).method353(-106) && (class658.field9093 & 0x20) != 0 && (var4 == null || arg1.method3417(123, var4.field7101, class2.field26) != var4.field7101)) {
                class483.method2701(arg1.field8327, false, true, class214.field3060 + " -> " + arg1.field8357, 0L, 50, arg1.field8418, arg1.field8403, class425.field5847, class680.field9585, 6967);
                class397.field5283++;
            }
        }
        field7012++;
        if (arg0 != 12) {
            return;
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class477.method2673(arg1, -128, var5);
            if (var9 != null) {
                class483.method2701(arg1.field8327, false, true, arg1.field8357, (long) (var5 + 1), 1006, arg1.field8418, arg1.field8403, class178.method1198(arg1, var5, (byte) -128), var9, arg0 + 6955);
                class55.field754++;
            }
        }
        String var6 = class80.method637(-123, arg1);
        if (var6 != null) {
            class483.method2701(arg1.field8327, false, true, arg1.field8357, 0L, 10, arg1.field8418, arg1.field8403, arg1.field8375, var6, arg0 + 6955);
            class307.field4238++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class477.method2673(arg1, -119, var7);
            if (var8 != null) {
                class483.method2701(arg1.field8327, false, true, arg1.field8357, (long) (var7 + 1), 4, arg1.field8418, arg1.field8403, class178.method1198(arg1, var7, (byte) -124), var8, 6967);
                class55.field754++;
            }
        }
        if (!client.method1701(arg1).method356(false)) {
            return;
        }
        if (arg1.field8284 == null) {
            class483.method2701(arg1.field8327, false, true, "", 0L, 12, arg1.field8418, arg1.field8403, -1, class72.field1073.method546(class516.field6892, (byte) -35), 6967);
        } else {
            class483.method2701(arg1.field8327, false, true, "", 0L, 12, arg1.field8418, arg1.field8403, -1, arg1.field8284, arg0 ^ 0x1B3B);
        }
        class361.field4872++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Lug;")
    public final class527 method2943(int arg0) {
        field7014++;
        if (arg0 != -32575) {
            this.method2945(false, null);
        }
        return new class527(this.field7019, this.field7020, this.field7018, this.field7013, this.field7015, this.field7021);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B[[[Lfba;)V")
    public static final void method2944(byte arg0, class24[][][] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class24[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class24 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field422 instanceof class532) {
                            ((class532) var6.field422).method144(false);
                        }
                        if (var6.field396 instanceof class532) {
                            ((class532) var6.field396).method144(false);
                        }
                        if (var6.field413 instanceof class532) {
                            ((class532) var6.field413).method144(false);
                        }
                        if (var6.field411 instanceof class532) {
                            ((class532) var6.field411).method144(false);
                        }
                        if (var6.field406 instanceof class532) {
                            ((class532) var6.field406).method144(false);
                        }
                        for (class684 var7 = var6.field409; var7 != null; var7 = var7.field9618) {
                            class641 var8 = var7.field9619;
                            if (var8 instanceof class532) {
                                ((class532) var8).method144(false);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= 90) {
            method2944((byte) 57, null);
        }
        field7022++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLug;)V")
    public final void method2945(boolean arg0, class527 arg1) {
        this.field7018 = arg1.field7018;
        if (!arg0) {
            field7024 = null;
        }
        field7023++;
        this.field7015 = arg1.field7015;
        this.field7013 = arg1.field7013;
        this.field7020 = arg1.field7020;
        this.field7021 = arg1.field7021;
        this.field7019 = arg1.field7019;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public static void method2946(int arg0) {
        field7027 = null;
        field7024 = null;
        if (arg0 <= 118) {
            method2942(-74, null, 101, -13);
        }
        field7026 = null;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V")
    public class527(int arg0) {
        this.field7019 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IIIIII)V")
    private class527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7021 = arg5;
        this.field7015 = arg4;
        this.field7020 = arg1;
        this.field7013 = arg3;
        this.field7018 = arg2;
        this.field7019 = arg0;
    }
}
