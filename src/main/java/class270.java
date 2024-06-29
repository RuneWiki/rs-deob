import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class270 {

    @OriginalMember(owner = "client!q", name = "k", descriptor = "B")
    private byte field3604;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public int field3597;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public int field3600;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field3595;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lld;")
    public static class105 field3601 = new class105();

    @OriginalMember(owner = "client!q", name = "o", descriptor = "[I")
    public static int[] field3608 = new int[250];

    @OriginalMember(owner = "client!q", name = "n", descriptor = "[I")
    public static int[] field3607 = new int[4096];

    @OriginalMember(owner = "client!q", name = "q", descriptor = "F")
    public static float field3610;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "[[I")
    public static int[][] field3605;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method1531(byte arg0) {
        field3607 = null;
        field3608 = null;
        field3601 = null;
        if (arg0 != 5) {
            method1534(100, 21, 126, (String) null, -67);
        }
        field3605 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)I")
    public final int method1532(int arg0) {
        if (arg0 != 7) {
            this.method1532(-119);
        }
        field3602++;
        return this.field3604 & 0x7;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIB)V")
    public static final void method1533(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3596++;
        if (arg4 > -14) {
            return;
        }
        class106 var5 = class250.method1400(8, -17, arg2);
        var5.method658(0);
        var5.field1589 = arg1;
        var5.field1584 = arg3;
        var5.field1590 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public static final void method1534(int arg0, int arg1, int arg2, String arg3, int arg4) {
        field3598++;
        class464 var5 = class78.method519(arg0, arg4, (byte) -72);
        if (var5 == null) {
            return;
        }
        if (var5.field6395 != null) {
            class82 var6 = new class82();
            var6.field1085 = var5.field6395;
            var6.field1095 = arg1;
            var6.field1086 = var5;
            var6.field1096 = arg3;
            class382.method2340(var6);
        }
        boolean var7 = true;
        if (var5.field6359 != 0) {
            var7 = class445.method2618(var5, arg2 + 65);
        }
        if (!var7 || !client.method1046(var5).method1258(arg1 + arg2, -22114)) {
            return;
        }
        if (arg1 == 1) {
            class491.method2861(class434.field5901, 1);
            class33.field500++;
            class481.method2805(arg4, arg2 - 2, var5.field6402, arg0);
        }
        if (arg1 == 2) {
            class491.method2861(class460.field6230, 1);
            class168.field2326++;
            class481.method2805(arg4, -3, var5.field6402, arg0);
        }
        if (arg1 == 3) {
            class338.field4544++;
            class491.method2861(class111.field1685, arg2 ^ 0xFFFFFFFE);
            class481.method2805(arg4, -3, var5.field6402, arg0);
        }
        if (arg1 == 4) {
            class294.field3927++;
            class491.method2861(class295.field3937, arg2 + 2);
            class481.method2805(arg4, -3, var5.field6402, arg0);
        }
        if (arg1 == 5) {
            class491.method2861(class106.field1582, 1);
            class146.field2094++;
            class481.method2805(arg4, -3, var5.field6402, arg0);
        }
        if (arg1 == 6) {
            class429.field5816++;
            class491.method2861(class461.field6238, 1);
            class481.method2805(arg4, -3, var5.field6402, arg0);
        }
        if (arg1 == 7) {
            class266.field3518++;
            class491.method2861(class178.field2412, 1);
            class481.method2805(arg4, arg2 - 2, var5.field6402, arg0);
        }
        if (arg1 == 8) {
            class491.method2861(class7.field84, 1);
            class249.field3321++;
            class481.method2805(arg4, -3, var5.field6402, arg0);
        }
        if (arg1 == 9) {
            class491.method2861(class456.field6185, 1);
            class223.field2966++;
            class481.method2805(arg4, -3, var5.field6402, arg0);
        }
        if (arg1 == 10) {
            class491.method2861(class302.field4026, 1);
            client.field2449++;
            class481.method2805(arg4, -3, var5.field6402, arg0);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lmr;B)V")
    public static final void method1535(class86 arg0, byte arg1) {
        field3603++;
        boolean var2 = false;
        if (class70.field968 == arg0.field1120 || arg0.field1137 == -1 || arg0.field1130 != 0) {
            var2 = true;
        } else {
            class181 var3 = class395.field5477.method266(16107, arg0.field1137);
            if (var3.field2490 || (arg0.field1169 + 1) > var3.field2466[arg0.field1150]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field1120 - arg0.field1167;
            int var5 = class70.field968 - arg0.field1167;
            int var6 = arg0.field1158 * 128 + (arg0.method545(false) * 64);
            int var7 = arg0.field1126 * 128 + arg0.method545(false) * 64;
            int var8 = arg0.field1112 * 128 + arg0.method545(false) * 64;
            int var9 = arg0.field1139 * 128 + (arg0.method545(false) * 64);
            arg0.field6501 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field6507 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field1196 = 0;
        if (arg0.field1157 == 0) {
            arg0.method547(8192, 121);
        }
        int var10 = 106 / ((60 - arg1) / 37);
        if (arg0.field1157 == 1) {
            arg0.method547(12288, 118);
        }
        if (arg0.field1157 == 2) {
            arg0.method547(0, 121);
        }
        if (arg0.field1157 == 3) {
            arg0.method547(4096, 120);
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)I")
    public final int method1536(byte arg0) {
        if (arg0 >= -9) {
            return 34;
        } else {
            field3599++;
            return (this.field3604 & 0x8) == 8 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class270() {
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lbt;)V")
    public class270(class32 arg0) {
        this.field3604 = arg0.method211(29861);
        this.field3594 = arg0.method215((byte) 115);
        this.field3597 = arg0.method222(1024);
        this.field3600 = arg0.method222(1024);
        this.field3595 = arg0.method222(1024);
        this.field3606 = arg0.method222(1024);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3607[var0] = class89.method575(var0, (byte) -79);
        }
        field3610 = 0.0F;
    }
}
