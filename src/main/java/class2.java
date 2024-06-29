import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class2 {

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lij;")
    private static class50 field33 = class78.method578(125, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Lij;")
    public static class50 field32 = field33;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field34 = 0;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Lij;")
    private static class50 field36 = class78.method578(126, "Starting 3d library");

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lij;")
    public static class50 field35 = field36;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Lij;")
    private static class50 field37 = class78.method578(121, " has logged in)3");

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lij;")
    public static class50 field31 = field37;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "D")
    public static double field20;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lwh;")
    public static class163 field29;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[I")
    public static int[] field27;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static final void method4(int arg0) {
        class64.field1222 = 0;
        field16++;
        int var1 = (class239.field4067.field3990 >> 7) + class61.field1124;
        int var2 = (class239.field4067.field4027 >> 7) + class254.field4394;
        if (arg0 != 1252) {
            return;
        }
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class64.field1222 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class64.field1222 = 1;
        }
        if (class64.field1222 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class64.field1222 = 0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)J")
    public static final long method5(int arg0, int arg1, int arg2) {
        class65 var3 = class59.field1089[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1244; var4++) {
            class106 var5 = var3.field1236[var4];
            if ((var5.field1905 >> 29 & 0x3L) == 2L && var5.field1913 == arg1 && var5.field1906 == arg2) {
                return var5.field1905;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static final void method6(byte arg0) {
        field30++;
        try {
            if (field29 == null) {
                field29 = new class163(class186.field3058, class80.method589(new class50[] { class41.method313(arg0 ^ 0x70), class66.field1270 }, 28743).method388(22338));
            }
            if (arg0 != -113) {
                method9(false);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            field29 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[B)Lij;")
    public static final class50 method7(int arg0, int arg1, int arg2, byte[] arg3) {
        field26++;
        if (arg2 != -15075) {
            method12(115, 106, 73, -105, 95);
        }
        class50 var4 = new class50();
        var4.field898 = 0;
        var4.field909 = new byte[arg1];
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field909[var4.field898++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)V")
    public static final void method8(int arg0, byte arg1) {
        field22++;
        class137 var2 = client.method608(2, false, arg0);
        var2.method947(0);
        if (arg1 < 31) {
            field31 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static void method9(boolean arg0) {
        if (arg0) {
            method6((byte) -40);
        }
        field27 = null;
        field33 = null;
        field37 = null;
        field36 = null;
        field31 = null;
        field32 = null;
        field29 = null;
        field35 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBII)I")
    public static final int method10(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 97) {
            return 24;
        }
        field21++;
        if (arg0 <= arg2) {
            return arg3 >= arg2 ? arg2 : arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZB)V")
    public static final void method11(boolean arg0, byte arg1) {
        field24++;
        if (arg1 != -114) {
            field29 = null;
        }
        class193.field3208 = arg0;
        class222.field3743 = !class174.method1198(0);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V")
    public static final void method12(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class60.field1094; var5++) {
            if (arg2 < (class238.field4046[var5] + class172.field2877[var5]) && class238.field4046[var5] < arg2 + arg4 && (class159.field2741[var5] + class151.field2624[var5]) > arg3 && arg0 + arg3 > class159.field2741[var5]) {
                class210.field3492[var5] = true;
            }
        }
        if (arg1 >= -80) {
            field27 = null;
        }
        field28++;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)Z")
    public static final boolean method13(int arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            field29 = null;
        }
        field18++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class243 var3 = class53.method426((byte) -90, arg0);
        return var3.method1650(arg2 ^ 0xFFFFFF80, arg1);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIII)V")
    public static final void method14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field23++;
        if (arg2 != -3063) {
            field34 = 114;
        }
        if (arg1 == arg4) {
            class5.method35(arg3, arg5, arg1, (byte) 6, arg0);
        } else if (class177.field2953 <= arg3 - arg1 && (arg1 + arg3) <= class224.field3773 && arg0 - arg4 >= class100.field1855 && class97.field1816 >= arg0 + arg4) {
            class186.method1256(arg0, arg5, arg4, -86, arg1, arg3);
        } else {
            class247.method1682(797590370, arg3, arg0, arg4, arg1, arg5);
        }
    }
}
