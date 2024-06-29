import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class214 {

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
    private int[] field3716;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Loh;")
    private static class258 field3711 = class153.method1046("K", 98);

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Loh;")
    public static class258 field3715 = class153.method1046("blinken2:", 103);

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Loh;")
    public static class258 field3719 = field3711;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Loh;")
    public static class258 field3713 = field3711;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[[[B")
    public static byte[][][] field3721;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([I)V", line = 20)
    public class214(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3716 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3716[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3716[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3716[var5 + var5] = arg0[var4];
            this.field3716[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)Loh;", line = 58)
    public static final class258 method1456(int arg0, byte arg1) {
        if (arg1 != 77) {
            field3718 = 120;
        }
        field3714++;
        return class100.method755(arg1 - 83, new class258[] { class218.method1481(arg1 ^ 0xFFFFFFFA, arg0 >> 24 & 0xFF), class287.field4946, class218.method1481(arg1 ^ 0x64, arg0 >> 16 & 0xFF), class287.field4946, class218.method1481(105, (arg0 & 0xFF96) >> 8), class287.field4946, class218.method1481(62, arg0 & 0xFF) });
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 82)
    public static final void method1457(boolean arg0) {
        class304.method2126();
        field3717++;
        class304.method2127();
        if (arg0) {
            method1457(true);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 96)
    public static void method1458(int arg0) {
        field3713 = null;
        if (arg0 != 1) {
            field3713 = (class258) null;
        }
        field3711 = null;
        field3719 = null;
        field3715 = null;
        field3721 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I", line = 116)
    public final int method1459(int arg0, int arg1) {
        field3722++;
        int var3 = (this.field3716.length >> 1) - 1;
        if (arg0 != -16494) {
            return 77;
        }
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field3716[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3716[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILs;IBII)V", line = 146)
    public static final void method1460(int arg0, int arg1, class171 arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3712++;
        int var7 = arg0 * arg0 + arg1 * arg1;
        int var8 = 33 / ((64 - arg4) / 35);
        if (var7 > 360000) {
            return;
        }
        int var9 = Math.min(arg2.field3002 / 2, arg2.field3054 / 2);
        if (var9 * var9 >= var7) {
            class182.method1243(arg3, 96, arg2, arg6, arg0, class249.field4296[arg5], arg1);
            return;
        }
        var9 -= 10;
        int var10 = class68.field1177 + class271.field4702 & 0x7FF;
        int var11 = class266.field4642[var10];
        int var12 = class266.field4636[var10];
        int var13 = var12 * 256 / (class239.field4169 + 256);
        int var14 = var11 * 256 / (class239.field4169 + 256);
        int var15 = arg0 * var13 + arg1 * var14 >> 16;
        int var16 = arg1 * var13 - (arg0 * var14) >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var9 * Math.sin(var17));
        int var20 = (int) ((double) var9 * Math.cos(var17));
        if (class257.field4390) {
            ((class221) class44.field668[arg5]).method1497(240, 240, (arg3 - (-(arg2.field3002 / 2) - var19)) * 16, (arg2.field3054 / 2 + arg6 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class41) class44.field668[arg5]).method325(arg2.field3002 / 2 + var19 + arg3 - 10, arg6 + -10 - (-(arg2.field3054 / 2) + var20), 20, 20, 15, 15, var17, 256);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V", line = 191)
    public static final void method1461(boolean arg0) {
        if (arg0) {
            method1457(true);
        }
        field3720++;
        if (class215.field3729 != null) {
            class122 var1 = class215.field3729;
            synchronized (class215.field3729) {
                class215.field3729 = null;
            }
        }
    }
}
