import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class180 {

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[[S")
    public static short[][] field2981 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Z")
    public static boolean field2984 = true;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "[[[B")
    public static byte[][][] field2987;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method1347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2988++;
        for (int var6 = arg1; var6 <= arg2; var6++) {
            class80.method545(arg4, -120, arg5, arg3, class281.field4523[var6]);
        }
        if (arg0 != 63) {
            method1351((class172) null, 89, (class172) null);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lak;IBI)[Lek;", line = 34)
    public static final class220[] method1348(class172 arg0, int arg1, byte arg2, int arg3) {
        int var4 = -81 % ((-arg2 - 68) / 44);
        field2986++;
        return class55.method353(arg0, arg3, (byte) -5, arg1) ? class192.method1423(115) : null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 51)
    public static final void method1349(int arg0) {
        class168.field2779.method707(0);
        if (arg0 <= 84) {
            field2987 = (byte[][][]) ((byte[][][]) null);
        }
        class164.field2742.method707(0);
        field2980++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 65)
    public static void method1350(boolean arg0) {
        field2987 = (byte[][][]) null;
        if (!arg0) {
            field2987 = (byte[][][]) ((byte[][][]) null);
        }
        field2981 = (short[][]) null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lak;ILak;)V", line = 81)
    public static final void method1351(class172 arg0, int arg1, class172 arg2) {
        class289.field4635 = arg0;
        if (arg1 == -14628) {
            class304.field4762 = arg2;
            field2979++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljj;I)V", line = 93)
    public static final void method1352(class44 arg0, int arg1) {
        field2982++;
        if (arg1 != 7744) {
            field2981 = (short[][]) ((short[][]) null);
        }
        while (true) {
            while (arg0.field586 < arg0.field573.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method286((byte) -117) == 1) {
                    var3 = arg0.method286((byte) -72);
                    var4 = arg0.method286((byte) -100);
                    var2 = true;
                }
                int var5 = arg0.method286((byte) -120);
                int var6 = arg0.method286((byte) -112);
                int var7 = class93.field1276 + class74.field1048 - var6 * 64 - 1;
                int var8 = var5 * 64 - class27.field377;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < class111.field1650 && class74.field1048 > var7) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var3 * 8 + 8 > var11 && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method246((byte) -97);
                                if (var13 != 0) {
                                    if (class113.field1719[var10][var9] == null) {
                                        class113.field1719[var10][var9] = new byte[4096];
                                    }
                                    class113.field1719[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method246((byte) -9);
                                    if (class195.field3191[var10][var9] == null) {
                                        class195.field3191[var10][var9] = new byte[4096];
                                    }
                                    class195.field3191[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method246((byte) -123);
                        if (var16 != 0) {
                            arg0.field586++;
                        }
                    }
                }
            }
            return;
        }
    }
}
