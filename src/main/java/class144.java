import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class144 extends class137 {

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "[I")
    public int[] field2725 = new int[5];

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "[Lqi;")
    public class132[] field2746 = new class132[5];

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public int field2747 = 0;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public int field2727;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public int field2743;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "Lhh;")
    public static class163 field2718 = class137.method1065("VOLL", 17);

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field2719 = 0;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "[I")
    public static int[] field2721 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Lhh;")
    public static class163 field2716 = class137.method1065("(U0a )2 non)2existant gosub script)2num: ", 17);

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "Lqh;")
    public static class69 field2730 = null;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    public int field2735;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    public int field2741;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    public int field2745;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "Lvd;")
    public class125 field2729;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "Leg;")
    public class144 field2740;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "Lei;")
    public class159 field2731;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Lhh;")
    public static class163 field2715;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "Lwg;")
    public class211 field2736;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "Lte;")
    public class29 field2737;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "Lrc;")
    public class47 field2733;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "Lk;")
    public class93 field2742;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "Z")
    public boolean field2724;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "Z")
    public boolean field2732;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "Z")
    public boolean field2739;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "[Lsf;")
    public static class223[] field2722;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)Ln;")
    public static final class139 method1091(int arg0) {
        field2714++;
        if (arg0 != -1523175774) {
            field2730 = null;
        }
        try {
            return (class139) Class.forName("gg").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field2730 = null;
        field2722 = null;
        if (arg0 != -9162) {
            field2730 = null;
        }
        field2721 = null;
        field2715 = null;
        field2718 = null;
        field2716 = null;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
    public static final void method1093(int arg0) {
        if (arg0 != -15060) {
            field2722 = null;
        }
        for (int var1 = -1; var1 < class95.field1791; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class246.field4340[var1];
            }
            class126 var3 = class106.field2029[var2];
            if (var3 != null) {
                class43.method329(-114, var3.field3645, var3);
            }
        }
        field2734++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([BIII)Z")
    public static final boolean method1094(byte[] arg0, int arg1, int arg2, int arg3) {
        field2717++;
        boolean var4 = true;
        if (arg2 < 109) {
            return false;
        }
        class81 var5 = new class81(arg0);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method612(true);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method636(59);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method622(true) >> 2;
                    int var15 = var13 + arg1;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class35 var17 = class9.method64(false, var6);
                        if (var14 != 22 || class119.field2247 || var17.field598 != 0 || var17.field570 == 1 || var17.field564) {
                            if (!var17.method255(0)) {
                                var4 = false;
                                class231.field4154++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method636(124);
                if (var10 == 0) {
                    break;
                }
                var5.method622(true);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)I")
    public static final int method1095(int arg0, byte arg1) {
        field2723++;
        class215 var2 = class260.method1762(-94, arg0);
        int var3 = -51 % ((arg1 - 1) / 63);
        int var4 = var2.field3923;
        int var5 = var2.field3926;
        int var6 = class157.field2897[var5 - var4];
        int var7 = var2.field3914;
        return class119.field2252[var7] >> var4 & var6;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1096(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2720++;
        if (class127.field2465 <= (arg2 - arg0) && arg2 + arg0 <= class252.field4407 && class182.field3344 <= (arg1 - arg0) && class201.field3593 >= arg0 + arg1) {
            class87.method685(arg3, arg2, arg1, arg0, 787, arg4, arg5);
        } else {
            class165.method1241(arg1, (byte) 76, arg4, arg0, arg3, arg5, arg2);
        }
        int var7 = 79 / ((arg6 - 19) / 45);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(III)V")
    public class144(int arg0, int arg1, int arg2) {
        this.field2744 = this.field2727 = arg0;
        this.field2743 = arg2;
        this.field2726 = arg1;
    }
}
