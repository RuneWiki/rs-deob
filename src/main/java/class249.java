import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class249 extends class208 {

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "[Lfi;")
    public class250[] field4182 = new class250[5];

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public int field4194 = 0;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "[I")
    public int[] field4199 = new int[5];

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public int field4190;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    public int field4202;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public int field4196;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lve;")
    public static class255 field4169 = class87.method607(73, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lve;")
    public static class255 field4171 = class87.method607(122, "; Max)2Age=");

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lve;")
    private static class255 field4170 = class87.method607(96, "K");

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Z")
    public static boolean field4167 = false;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "Lve;")
    public static class255 field4177 = field4170;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "Lve;")
    public static class255 field4186 = class87.method607(84, "settings");

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Z")
    public static boolean field4174 = false;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lve;")
    private static class255 field4175 = class87.method607(117, "Loaded update list");

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "Lve;")
    public static class255 field4178 = field4175;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "Lve;")
    public static class255 field4201 = field4170;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public int field4188;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public int field4195;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "Lfc;")
    public class213 field4183;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "Ljf;")
    public class216 field4192;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Lam;")
    public class243 field4179;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "Lsc;")
    public class249 field4197;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "Lc;")
    public class293 field4200;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "Lsi;")
    public class304 field4184;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "Lbb;")
    public class84 field4189;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Lrg;")
    public static class88 field4168;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "Z")
    public boolean field4187;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "Z")
    public boolean field4191;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "Z")
    public boolean field4198;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "[[B")
    public static byte[][] field4164;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)V", line = 15)
    public static final void method1714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4173++;
        if (arg4 >= 1 && arg2 >= 1 && arg4 <= 102 && arg2 <= 102) {
            if (!class96.method761(true) && (class166.field2800[0][arg4][arg2] & 0x2) == 0) {
                int var8 = arg3;
                if ((class166.field2800[arg3][arg4][arg2] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class87.field1415 != var8) {
                    return;
                }
            }
            int var9 = arg3;
            if (arg3 < 3 && (class166.field2800[1][arg4][arg2] & 0x2) == 2) {
                var9 = arg3 + 1;
            }
            class54.method339(arg2, class310.field5292[arg3], arg3, (byte) 68, arg0, var9, arg4);
            if (arg5 >= 0) {
                boolean var10 = class229.field3788;
                class229.field3788 = true;
                class44.method268(false, arg3, class310.field5292[arg3], arg7, arg1, var9, arg5, arg6 + 30055, arg4, arg2, false);
                class229.field3788 = var10;
            }
        }
        if (arg6 != -30054) {
            field4178 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V", line = 68)
    public static final void method1715(byte arg0) {
        field4176++;
        int var1 = (class256.field4373 >> 10) + (class268.field4615 >> 3);
        int var2 = (class221.field3723 >> 10) + (class197.field3355 >> 3);
        if (arg0 <= 50) {
            return;
        }
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 18;
        class222.field3737 = new byte[var5][];
        class223.field3747 = new int[var5];
        class288.field4957 = new int[var5];
        class229.field3799 = new int[var5][4];
        class236.field3923 = new byte[var5][];
        class116.field1976 = new int[var5];
        byte var6 = 8;
        class53.field836 = new int[var5];
        class244.field4113 = new byte[var5][];
        class72.field1192 = new int[var5];
        class149.field2511 = new byte[var5][];
        field4164 = new byte[var5][];
        class50.field756 = new int[var5];
        int var7 = 0;
        for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
            for (int var9 = (var1 - 6) / 8; var9 <= (var1 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class116.field1976[var7] = var10;
                class223.field3747[var7] = class174.field2883.method619(class3.method14(new class255[] { class76.field1250, class215.method1532(var8, true), class255.field4360, class215.method1532(var9, true) }, (byte) -97), 20053);
                class72.field1192[var7] = class174.field2883.method619(class3.method14(new class255[] { class95.field1636, class215.method1532(var8, true), class255.field4360, class215.method1532(var9, true) }, (byte) -63), 20053);
                class53.field836[var7] = class174.field2883.method619(class3.method14(new class255[] { class37.field568, class215.method1532(var8, true), class255.field4360, class215.method1532(var9, true) }, (byte) -71), 20053);
                class50.field756[var7] = class174.field2883.method619(class3.method14(new class255[] { class137.field2288, class215.method1532(var8, true), class255.field4360, class215.method1532(var9, true) }, (byte) -82), 20053);
                class288.field4957[var7] = class174.field2883.method619(class3.method14(new class255[] { class162.field2720, class215.method1532(var8, true), class255.field4360, class215.method1532(var9, true) }, (byte) -128), 20053);
                if (class53.field836[var7] == -1) {
                    class223.field3747[var7] = -1;
                    class72.field1192[var7] = -1;
                    class50.field756[var7] = -1;
                    class288.field4957[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class53.field836.length; var11++) {
            class53.field836[var11] = -1;
            class223.field3747[var11] = -1;
            class72.field1192[var11] = -1;
            class50.field756[var11] = -1;
            class288.field4957[var11] = -1;
        }
        class282.method1991(var1, var6, var4, (byte) 43, true, var3, var2);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V", line = 155)
    public static void method1716(int arg0) {
        field4186 = null;
        if (arg0 != 2) {
            method1717((byte) -110);
        }
        field4170 = null;
        field4171 = null;
        field4201 = null;
        field4164 = (byte[][]) null;
        field4177 = null;
        field4175 = null;
        field4178 = null;
        field4168 = null;
        field4169 = null;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)V", line = 182)
    public static final void method1717(byte arg0) {
        if (arg0 < 3) {
            field4201 = (class255) null;
        }
        class301.field5142.method554(0);
        class300.field5108.method554(0);
        field4165++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V", line = 203)
    public static final void method1718(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -124 % ((23 - arg2) / 57);
        field4166++;
        if (arg3 - arg4 >= class125.field2082 && class30.field473 >= (arg3 + arg4) && arg1 - arg4 >= class261.field4427 && (arg1 + arg4) <= class11.field156) {
            class236.method1640(arg0, arg4, arg1, (byte) -77, arg3);
        } else {
            class310.method2149(arg3, 1073741823, arg1, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(III)V", line = 221)
    public class249(int arg0, int arg1, int arg2) {
        this.field4185 = arg1;
        this.field4190 = arg2;
        this.field4196 = this.field4202 = arg0;
    }
}
