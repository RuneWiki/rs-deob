import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class168 extends class138 {

    @OriginalMember(owner = "client!re", name = "J", descriptor = "[B")
    public byte[] field2646;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "Lck;")
    public static class119 field2649 = class298.method1987((byte) 53, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!re", name = "K", descriptor = "[I")
    public static int[] field2647 = new int[200];

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Lwi;")
    public static class23 field2652;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "[[Z")
    public static boolean[][] field2648;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lva;IZ)Lbe;", line = 10)
    public static final class81 method1060(class36 arg0, int arg1, boolean arg2) {
        field2642++;
        if (!arg2) {
            field2649 = (class119) null;
        }
        return class236.method1513(arg0, (byte) 67, arg1) ? class73.method520(0) : null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V", line = 29)
    public static final void method1061(int arg0, boolean arg1) {
        field2645++;
        int var2 = class204.field3240.length;
        if (arg0 != 26001) {
            field2652 = (class23) null;
        }
        byte[][] var3;
        if (arg1) {
            var3 = class146.field2352;
        } else {
            var3 = class142.field2274;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class150.field2382[var4] >> 8) * 64 - class30.field421;
                int var7 = (class150.field2382[var4] & 0xFF) * 64 - class189.field2995;
                class91.method624(4096);
                class57.method428(8120, var5, var6, var7, class217.field3510, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V", line = 68)
    public static final void method1062(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2653++;
        class142 var5 = (class142) class185.field2933.method1329((byte) 90, (long) arg2);
        if (var5 == null) {
            var5 = new class142();
            class185.field2933.method1326((long) arg2, (byte) -116, var5);
        }
        if (arg0 != 0) {
            field2648 = (boolean[][]) ((boolean[][]) null);
        }
        if (arg3 >= var5.field2265.length) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field2265.length; var8++) {
                var6[var8] = var5.field2265[var8];
                var7[var8] = var5.field2270[var8];
            }
            for (int var9 = var5.field2265.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2265 = var6;
            var5.field2270 = var7;
        }
        var5.field2265[arg3] = arg1;
        var5.field2270[arg3] = arg4;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIZII)V", line = 146)
    public static final void method1063(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class232.field3743 = arg2;
        class46.field680 = arg5;
        class240.field3845 = arg6;
        class234.field3775 = arg1;
        if (arg0 != 7463) {
            return;
        }
        class22.field313 = arg3;
        field2643++;
        if (arg4 && class22.field313 >= 100) {
            class62.field987 = class234.field3775 * 128 + 64;
            class70.field1097 = class232.field3743 * 128 + 64;
            class281.field4638 = class207.method1304(class10.field189, (byte) 97, class62.field987, class70.field1097) - class240.field3845;
        }
        class68.field1063 = 2;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V", line = 178)
    public static final void method1064(byte arg0) {
        field2651++;
        class22.field333.method962(8);
        int var1 = class22.field333.method961(-126, 8);
        if (class157.field2499 > var1) {
            for (int var2 = var1; var2 < class157.field2499; var2++) {
                class157.field2502[class193.field3089++] = class23.field348[var2];
            }
        }
        if (class157.field2499 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class157.field2499 = 0;
        int var3 = 12 % ((65 - arg0) / 44);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class23.field348[var4];
            class163 var6 = class70.field1103[var5];
            int var7 = class22.field333.method961(58, 1);
            if (var7 == 0) {
                class23.field348[class157.field2499++] = var5;
                var6.field4984 = class1.field15;
            } else {
                int var8 = class22.field333.method961(-122, 2);
                if (var8 == 0) {
                    class23.field348[class157.field2499++] = var5;
                    var6.field4984 = class1.field15;
                    class113.field1723[class81.field1238++] = var5;
                } else if (var8 == 1) {
                    class23.field348[class157.field2499++] = var5;
                    var6.field4984 = class1.field15;
                    int var9 = class22.field333.method961(20, 3);
                    var6.method1985(var9, false, (byte) -41);
                    int var10 = class22.field333.method961(-108, 1);
                    if (var10 == 1) {
                        class113.field1723[class81.field1238++] = var5;
                    }
                } else if (var8 == 2) {
                    class23.field348[class157.field2499++] = var5;
                    var6.field4984 = class1.field15;
                    int var11 = class22.field333.method961(75, 3);
                    var6.method1985(var11, true, (byte) -41);
                    int var12 = class22.field333.method961(-123, 3);
                    var6.method1985(var12, true, (byte) -41);
                    int var13 = class22.field333.method961(100, 1);
                    if (var13 == 1) {
                        class113.field1723[class81.field1238++] = var5;
                    }
                } else if (var8 == 3) {
                    class157.field2502[class193.field3089++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BII)I", line = 279)
    public static final int method1065(byte arg0, int arg1, int arg2) {
        class142 var3 = (class142) class185.field2933.method1329((byte) 90, (long) arg2);
        if (arg0 != -78) {
            method1065((byte) 53, 3, 50);
        }
        field2644++;
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field2270.length > arg1) {
            return var3.field2270[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "([B)V", line = 297)
    public class168(byte[] arg0) {
        this.field2646 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V", line = 306)
    public static void method1066(int arg0) {
        if (arg0 == 0) {
            field2652 = null;
            field2649 = null;
            field2648 = (boolean[][]) null;
            field2647 = null;
        }
    }
}
