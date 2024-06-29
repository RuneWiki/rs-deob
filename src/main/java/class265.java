import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class265 extends RuntimeException {

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Ljava/lang/String;")
    public String field4672;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4671;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Laj;")
    public static class1 field4666 = new class1();

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[I")
    public static int[] field4668 = new int[5];

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field4673 = -1;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "[Lud;")
    public static class285[] field4675;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[[[B")
    public static byte[][][] field4670;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIZIIII)V", line = 8)
    public static final void method1915(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field4674++;
        if (arg3) {
            field4675 = (class285[]) null;
        }
        if (arg1 >= class260.field4593 && arg4 <= class79.field1202 && class266.field4677 <= arg2 && class166.field2984 >= arg7) {
            class88.method605(arg7, arg4, arg0, arg2, arg5, arg6, -127, arg1);
        } else {
            class161.method1117(arg0, arg5, arg2, arg7, -118, arg4, arg1, arg6);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(JI)V", line = 26)
    public static final void method1916(long arg0, int arg1) {
        field4669++;
        if (arg1 != -1 || arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class120.field2056; var3++) {
            if (class254.field4423[var3] == arg0) {
                class120.field2056--;
                for (int var4 = var3; var4 < class120.field2056; var4++) {
                    class197.field3563[var4] = class197.field3563[var4 + 1];
                    class176.field3204[var4] = class176.field3204[var4 + 1];
                    class14.field168[var4] = class14.field168[var4 + 1];
                    class254.field4423[var4] = class254.field4423[var4 + 1];
                    class295.field5154[var4] = class295.field5154[var4 + 1];
                    client.field4539[var4] = client.field4539[var4 + 1];
                }
                class290.field5084 = class242.field4217;
                class329.field5617++;
                class256.field4471.method1427(138, 0);
                class256.field4471.method1735((byte) -15, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBI)I", line = 74)
    public static final int method1917(int arg0, byte arg1, int arg2) {
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        if (arg1 != 71) {
            return 101;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        field4665++;
        return arg2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 106)
    public static final void method1918(int arg0) {
        field4667++;
        for (int var1 = 0; var1 < class315.field5419; var1++) {
            int var10002 = class54.field796[var1]--;
            if (class54.field796[var1] >= -10) {
                class275 var3 = class154.field2768[var1];
                if (var3 == null) {
                    var3 = class275.method1985(class291.field5104, class21.field322[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class54.field796[var1] += var3.method1986();
                    class154.field2768[var1] = var3;
                }
                if (class54.field796[var1] < 0) {
                    int var4;
                    if (class62.field1004[var1] == 0) {
                        var4 = class15.field194;
                    } else {
                        int var5 = (class62.field1004[var1] & 0xFF) * 128;
                        int var6 = class62.field1004[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class95.field1513.field4452;
                        int var8 = (class62.field1004[var1] & 0xFF85) >> 8;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var9 = var8 * 128 + 64 - class95.field1513.field4457;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var10 > var5) {
                            class54.field796[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class42.field561 / var5;
                    }
                    if (var4 > 0) {
                        class244 var11 = var3.method1987().method1684(class191.field3477);
                        class179 var12 = class179.method1279(var11, 100, var4);
                        var12.method1297(class266.field4681[var1] - 1);
                        class213.field3789.method2191(var12);
                    }
                    class54.field796[var1] = -100;
                }
            } else {
                class315.field5419--;
                for (int var2 = var1; var2 < class315.field5419; var2++) {
                    class21.field322[var2] = class21.field322[var2 + 1];
                    class154.field2768[var2] = class154.field2768[var2 + 1];
                    class266.field4681[var2] = class266.field4681[var2 + 1];
                    class54.field796[var2] = class54.field796[var2 + 1];
                    class62.field1004[var2] = class62.field1004[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != -18506) {
            field4673 = -40;
        }
        if (class95.field1524 && !class99.method692(120)) {
            if (class203.field3671 != 0 && class155.field2797 != -1) {
                class134.method921(0, class96.field1535, class203.field3671, -8949, false, class155.field2797);
            }
            class95.field1524 = false;
        } else if (class203.field3671 != 0 && class155.field2797 != -1 && !class99.method692(116)) {
            class256.field4471.method1427(167, 0);
            class201.field3638++;
            class256.field4471.method1741(class155.field2797, -1580277072);
            class155.field2797 = -1;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 239)
    public static void method1919(int arg0) {
        field4675 = null;
        field4666 = null;
        field4670 = (byte[][][]) null;
        field4668 = null;
        int var1 = 51 / ((arg0 + 56) / 32);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 254)
    public class265(Throwable arg0, String arg1) {
        this.field4672 = arg1;
        this.field4671 = arg0;
    }
}
