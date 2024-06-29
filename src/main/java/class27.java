import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class27 extends class86 {

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field307 = new String[500];

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "[I")
    public static int[] field304 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    public int field310;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "[I")
    public static int[] field314;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field306;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 10)
    public static void method179(boolean arg0) {
        if (arg0) {
            method180(-53, (byte) 119);
        }
        field304 = null;
        field314 = null;
        field306 = null;
        field307 = null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IB)I", line = 29)
    public static final int method180(int arg0, byte arg1) {
        if (arg1 != 101) {
            field304 = (int[]) null;
        }
        if (class297.field4661 != null) {
            class297.field4661.method916(-25224);
            class297.field4661 = null;
        }
        class78.field1103++;
        field308++;
        if (class78.field1103 > 4) {
            class21.field228 = 0;
            class78.field1103 = 0;
            return arg0;
        }
        class21.field228 = 0;
        if (class93.field1341 == class31.field398) {
            class31.field398 = class294.field4627;
        } else {
            class31.field398 = class93.field1341;
        }
        return -1;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIII)V", line = 84)
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field303++;
        int var6 = this.field311 << 3;
        int var7 = this.field316 << 3;
        int var8 = (arg3 << 4) + (var6 & 0xF);
        int var9 = (arg1 << 4) + (var7 & 0xF);
        this.method183(var6, var7, var8, var9, arg4, arg0);
        if (arg2 != 85323683) {
            method188(121, -68, 75, (class184) null, -11, -18, 100);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILek;III)V", line = 110)
    public static final void method188(int arg0, int arg1, int arg2, class184 arg3, int arg4, int arg5, int arg6) {
        field309++;
        int var7 = arg4 * arg4 + (arg5 * arg5);
        if (arg2 != 16) {
            method179(true);
        }
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg3.field2890 / 2, arg3.field2904 / 2);
        if (var8 * var8 >= var7) {
            class81.method636(arg6, arg4, -2067, arg1, arg3, arg5, class40.field596[arg0]);
            return;
        }
        var8 -= 10;
        int var9 = class99.field1459 + class136.field2125 & 0x7FF;
        int var10 = class56.field838[var9];
        int var11 = class56.field830[var9];
        int var12 = var11 * 256 / (class317.field4929 + 256);
        int var13 = var10 * 256 / (class317.field4929 + 256);
        int var14 = arg4 * var12 + arg5 * var13 >> 16;
        int var15 = arg5 * var12 - (arg4 * var13) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) (Math.cos(var16) * (double) var8);
        if (class36.field534) {
            ((class221) class228.field3528[arg0]).method1580(240, 240, (arg3.field2890 / 2 + (arg6 + var18)) * 16, (arg3.field2904 / 2 + arg1 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class134) class228.field3528[arg0]).method1015(arg3.field2890 / 2 + var18 + arg6 - 10, arg3.field2904 / 2 + arg1 + -var19 - 10, 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)V")
    public abstract void method181(int arg0, int arg1);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
    public abstract void method182(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
    public abstract void method184(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)V")
    public abstract void method186(int arg0, int arg1);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIII)V")
    public abstract void method187(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(II)V")
    public abstract void method189(int arg0, int arg1);
}
