import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class167 extends class223 {

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    private final int field2704;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    private final int field2710;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    private final int field2697;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    private final int field2696;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "Ltl;")
    public static class59 field2707 = class85.method639("Bitte warten Sie)3)3)3", 9588);

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "[[Lmk;")
    public static class150[][] field2711 = new class150[13][13];

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V", line = 12)
    public static final void method1178(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class41.field610[var1] = false;
        }
        if (arg0 != -1) {
            method1180((class137) null, (byte) -25, (class137) null);
        }
        class200.field3313 = -1;
        class170.field2753 = -1;
        field2698++;
        class266.field4585 = 1;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(III)V", line = 31)
    public final void method1144(int arg0, int arg1, int arg2) {
        int var4 = this.field2697 * arg1 >> 12;
        int var5 = this.field2710 * arg1 >> 12;
        field2709++;
        if (arg2 != -19486) {
            field2702 = 124;
        }
        int var6 = this.field2704 * arg0 >> 12;
        int var7 = this.field2696 * arg0 >> 12;
        class121.method903(this.field3621, var6, -2, var4, this.field3608, var7, var5);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V", line = 58)
    public final void method1148(int arg0, int arg1, int arg2) {
        int var4 = this.field2697 * arg0 >> 12;
        field2695++;
        int var5 = this.field2696 * arg1 >> 12;
        if (arg2 <= -54) {
            int var6 = this.field2710 * arg0 >> 12;
            int var7 = this.field2704 * arg1 >> 12;
            class96.method726(var7, var4, var6, (byte) -125, var5, this.field3618);
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)I", line = 85)
    public static final int method1179(int arg0, int arg1) {
        field2708++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        int var3 = 62 % ((-arg1 - 72) / 53);
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lre;BLre;)V", line = 134)
    public static final void method1180(class137 arg0, byte arg1, class137 arg2) {
        field2699++;
        if (arg0.field2258 != null) {
            arg0.method997(121);
        }
        arg0.field2258 = arg2;
        arg0.field2263 = arg2.field2263;
        if (arg1 <= -16) {
            arg0.field2258.field2263 = arg0;
            arg0.field2263.field2258 = arg0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[B)Lpc;", line = 155)
    public static final class118 method1181(int arg0, byte[] arg1) {
        field2701++;
        if (arg1 == null) {
            return null;
        } else {
            class118 var2 = new class118(arg1, class243.field4061, class311.field5274, class41.field615, class236.field3925, class53.field794);
            int var3 = 47 / ((arg0 - 43) / 60);
            class133.method974((byte) 114);
            return var2;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BIIII)V", line = 174)
    public static final void method1182(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2706++;
        if (arg0 != -4) {
            method1183(115);
        }
        for (int var5 = 0; var5 < class129.field2137; var5++) {
            if ((class40.field599[var5] + class249.field4144[var5]) > arg2 && class249.field4144[var5] < (arg2 + arg1) && arg4 < (class229.field3718[var5] + class78.field1249[var5]) && class229.field3718[var5] < arg3 + arg4) {
                class44.field719[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V", line = 195)
    public static final void method1183(int arg0) {
        field2703++;
        class131.method963(-12390, 0, arg0);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V", line = 206)
    public final void method1149(int arg0, int arg1, int arg2) {
        field2700++;
        int var4 = -47 % ((arg1 - 75) / 43);
        int var5 = this.field2697 * arg2 >> 12;
        int var6 = this.field2710 * arg2 >> 12;
        int var7 = this.field2696 * arg0 >> 12;
        int var8 = this.field2704 * arg0 >> 12;
        class23.method151(this.field3608, this.field3618, var8, var6, this.field3621, var7, (byte) -122, var5);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIIII)V", line = 229)
    public class167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2704 = arg3;
        this.field2710 = arg2;
        this.field2697 = arg0;
        this.field2696 = arg1;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V", line = 241)
    public static final void method1184(int arg0) {
        if (arg0 == -1780302036) {
            class297.field5088.method1482((byte) 30);
            field2705++;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 253)
    public static void method1185(byte arg0) {
        field2711 = (class150[][]) null;
        if (arg0 < -60) {
            field2707 = null;
        }
    }
}
