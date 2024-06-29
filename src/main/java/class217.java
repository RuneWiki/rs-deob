import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class217 extends class150 {

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    private int field3480;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    private int field3476;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    private int field3477;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    private int field3473;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "[I")
    public static int[] field3470 = new int[4096];

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "Z")
    public static boolean field3474 = true;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public static int field3481 = -1;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field3487 = 1;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)V", line = 24)
    public static final void method1569(int arg0, boolean arg1) {
        field3486++;
        byte[][] var2;
        byte var3;
        if (class265.field4126 && arg1) {
            var2 = class30.field508;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class2.field2;
        }
        if (arg0 >= -61) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class84.method605((byte) 52);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class261.field4046[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = var7 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var7 & 0x7) >> 1;
                            int var11 = var7 >> 14 & 0x3FF;
                            int var12 = (var7 & 0x3FFF) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class102.field1728.length; var14++) {
                                if (class102.field1728[var14] == var13 && var2[var14] != null) {
                                    var8 = true;
                                    class159.method1191(64, arg1, var6 * 8, class244.field3772, (var11 & 0x7) * 8, var10, (var12 & 0x7) * 8, var4, var2[var14], var9, var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class297.method2078(var4, 8, var5 * 8, var6 * 8, 8, -124);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V", line = 116)
    public static void method1570(int arg0) {
        field3470 = null;
        int var1 = 24 % ((16 - arg0) / 49);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V", line = 129)
    public final void method1061(int arg0, int arg1, int arg2) {
        field3469++;
        int var4 = this.field3477 * arg1 >> 12;
        int var5 = this.field3473 * arg1 >> 12;
        int var6 = this.field3476 * arg2 >> 12;
        int var7 = this.field3480 * arg2 >> 12;
        if (arg0 != 50) {
            field3485 = 68;
        }
        class82.method590(var6, this.field2408, 4, var7, var4, var5);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZ)V", line = 147)
    public final void method1060(int arg0, int arg1, boolean arg2) {
        field3472++;
        int var4 = this.field3477 * arg0 >> 12;
        int var5 = this.field3476 * arg1 >> 12;
        int var6 = this.field3480 * arg1 >> 12;
        int var7 = this.field3473 * arg0 >> 12;
        if (!arg2) {
            class11.method89(25057, var7, var5, this.field2413, this.field2407, var6, this.field2408, var4);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BZ)V", line = 167)
    public static final void method1571(byte arg0, boolean arg1) {
        field3482++;
        if (class145.field2277 != arg1) {
            int var2 = 50 % ((-arg0 - 33) / 57);
            class145.field2277 = arg1;
            class288.method2027((byte) 83);
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIIIII)V", line = 184)
    public class217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3480 = arg3;
        this.field3476 = arg1;
        this.field3477 = arg0;
        this.field3473 = arg2;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(III)V", line = 201)
    public final void method1063(int arg0, int arg1, int arg2) {
        field3471++;
        int var4 = this.field3477 * arg2 >> 12;
        int var5 = 23 / ((arg1 + 72) / 53);
        int var6 = this.field3473 * arg2 >> 12;
        int var7 = this.field3476 * arg0 >> 12;
        int var8 = this.field3480 * arg0 >> 12;
        class243.method1726(85, this.field2407, var6, this.field2413, var4, var8, var7);
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V", line = 218)
    public static final void method1572(int arg0) {
        class75.field1160 = 0;
        if (arg0 != 4096) {
            return;
        }
        field3484++;
        class9.field137 = 0;
        class85.method609(0);
        class177.method1316((byte) 60);
        class107.method822((byte) -96);
        for (int var1 = 0; var1 < class9.field137; var1++) {
            int var2 = class197.field3126[var1];
            if (class205.field3252 != class138.field2196[var2].field1462) {
                if (class138.field2196[var2].field4778.method1513(true)) {
                    class13.method117(class138.field2196[var2], arg0 - 4064);
                }
                class138.field2196[var2].method2112((class208) null, (byte) 119);
                class138.field2196[var2] = null;
            }
        }
        if (class45.field779 != class267.field4132.field1667) {
            throw new RuntimeException("gnp1 pos:" + class267.field4132.field1667 + " psize:" + class45.field779);
        }
        for (int var3 = 0; var3 < class77.field1173; var3++) {
            if (class138.field2196[class145.field2279[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class77.field1173);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(J[III)Ljava/lang/String;", line = 273)
    public static final String method1573(long arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 != 13682) {
            return (String) null;
        }
        field3479++;
        if (class269.field4195 != null) {
            String var5 = class269.field4195.method1211(arg1, arg2, arg3 - 12543, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lfj;Lfj;I)V", line = 299)
    public static final void method1574(class240 arg0, class240 arg1, int arg2) {
        if (arg1.field3736 != null) {
            arg1.method1701(-97);
        }
        arg1.field3736 = arg0.field3736;
        field3475++;
        arg1.field3739 = arg0;
        arg1.field3736.field3739 = arg1;
        arg1.field3739.field3736 = arg1;
        if (arg2 >= -36) {
            method1572(101);
        }
    }
}
