import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class56 extends class203 {

    @OriginalMember(owner = "client!gv", name = "I", descriptor = "I")
    public static int field819 = -1;

    @OriginalMember(owner = "client!gv", name = "F", descriptor = "[Z")
    public static boolean[] field816 = new boolean[200];

    @OriginalMember(owner = "client!gv", name = "H", descriptor = "I")
    public static int field818 = -1;

    @OriginalMember(owner = "client!gv", name = "G", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!gv", name = "E", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!gv", name = "J", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!gv", name = "K", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!gv", name = "D", descriptor = "[B")
    private byte[] field814;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lqa;B)V", line = 5)
    public static final void method400(class162 arg0, byte arg1) {
        if (arg1 >= -46) {
            field816 = null;
        }
        if (class207.field2981) {
            class212.method1414(20, arg0);
        } else {
            class374.method2391(arg0, (byte) -89);
        }
        field815++;
    }

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "(I)V", line = 21)
    public static void method401(int arg0) {
        if (arg0 <= 89) {
            method401(12);
        }
        field816 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIZ)[B", line = 41)
    public final byte[] method402(int arg0, int arg1, int arg2, boolean arg3) {
        field820++;
        this.field814 = new byte[arg0 * arg2 * arg1 * 2];
        if (arg3) {
            this.method572(-986971124, arg0, arg1, arg2);
            return this.field814;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lqa;IILia;III[[[B[I[I[I[I[IIBIIZ)V", line = 60)
    public static final void method403(class162 arg0, int arg1, int arg2, class413 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class44.field675 = arg0;
        class211.field3054 = arg1;
        class326.field5047 = arg3;
        class485.field7099 = class44.field675.method488() > 0;
        class97.field1574 = arg4 >> class225.field3278;
        class105.field1653 = arg6 >> class225.field3278;
        class466.field6858 = arg4;
        class504.field7401 = arg6;
        class467.field6863 = arg5;
        class54.field792 = class97.field1574 - class117.field1846;
        if (class54.field792 < 0) {
            class311.field4450 = -class54.field792;
            class54.field792 = 0;
        } else {
            class311.field4450 = 0;
        }
        class354.field5347 = class105.field1653 - class117.field1846;
        if (class354.field5347 < 0) {
            class85.field1425 = -class354.field5347;
            class354.field5347 = 0;
        } else {
            class85.field1425 = 0;
        }
        class227.field3318 = class97.field1574 + class117.field1846;
        if (class227.field3318 > class246.field3560) {
            class227.field3318 = class246.field3560;
        }
        class172.field2576 = class117.field1846 + class105.field1653;
        if (class172.field2576 > class254.field3675) {
            class172.field2576 = class254.field3675;
        }
        for (int var18 = 0; var18 < class117.field1846 + class117.field1846 + 2; var18++) {
            for (int var23 = 0; var23 < class117.field1846 + class117.field1846 + 2; var23++) {
                int var24 = class97.field1574 + var18 - class117.field1846;
                int var25 = class105.field1653 + var23 - class117.field1846;
                if (var24 >= 0 && var25 >= 0 && var24 < class246.field3560 && var25 < class254.field3675) {
                    int var26 = var24 << class225.field3278;
                    int var27 = var25 << class225.field3278;
                    int var28 = class145.field2135[class145.field2135.length - 1].method271(var24, var25) - (0x3E8 << class225.field3278 - 7);
                    int var29 = class62.field1063 == null ? class145.field2135[0].method271(var24, var25) + class427.field6246 : class62.field1063[0].method271(var24, var25) + class427.field6246;
                    class342.field5220[var18][var23] = class44.field675.method526(var26, var28, var27, var26, var29, var27);
                } else {
                    class342.field5220[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class117.field1846 + class117.field1846 + 1; var19++) {
            for (int var22 = 0; var22 < class117.field1846 + class117.field1846 + 1; var22++) {
                class298.field4257[var19][var22] = class342.field5220[var19][var22] || class342.field5220[var19 + 1][var22] || class342.field5220[var19][var22 + 1] || class342.field5220[var19 + 1][var22 + 1];
            }
        }
        class460.field6797 = arg8;
        class470.field6918 = arg9;
        class6.field96 = arg10;
        class68.field1182 = arg11;
        class366.field5498 = arg12;
        class372.method2378();
        class291.method1806((byte) -108);
        for (class482 var20 = (class482) class263.field3780.method1639(-1); var20 != null; var20 = (class482) class263.field3780.method1642((byte) 105)) {
            var20.method1540(-1);
            class412.method2544((byte) -49, var20);
        }
        if (class485.field7099) {
            for (int var21 = 0; var21 < class224.field3245; var21++) {
                class242.field3512[var21].method2866(121, arg17, arg1);
            }
        }
        if (arg2 > 1) {
            class44.field675.method454(0);
            if (class274.field3957 == null || class274.field3957 instanceof class460) {
                class274.field3957 = new class529();
            }
        } else if (class274.field3957 == null || class274.field3957 instanceof class529) {
            class274.field3957 = new class460();
        }
        class274.field3957.method2207(false, arg2);
        class274.field3957.method2209((byte) -126);
        if (class74.field1242 != null) {
            class67.method581(true);
            class274.field3957.method2208(22, true);
            class179.method1271(arg2, null, 0, (byte) 0, arg15, arg16);
            class274.field3957.method2209((byte) -127);
            class274.field3957.method2208(23, true);
            class67.method581(false);
        }
        class179.method1271(arg2, arg7, arg13, arg14, arg15, arg16);
        class274.field3957.method2209((byte) -127);
        class274.field3957.method2212(false);
        class274.field3957.method2209((byte) -127);
        if (arg2 > 1) {
            class44.field675.method468(0);
        }
        class44.field675.method464(0, null);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IBI)V", line = 217)
    public final void method404(int arg0, byte arg1, int arg2) {
        if (arg2 != -12393) {
            method403(null, 101, -87, null, -70, -67, -58, null, null, null, null, null, null, 42, (byte) 45, 102, 67, false);
        }
        field821++;
        int var4 = arg0 * 2;
        byte var5 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field814[var10001] = var5;
        this.field814[var6] = var5;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V", line = 232)
    public class56() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
