import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class122 {

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
    private int[] field2729;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2727 = 0;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lje;")
    public static class67 field2728 = class85.method592(255, "p11_full");

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lje;")
    public static class67 field2726 = class85.method592(255, " (X");

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Lje;")
    public static class67 field2731 = class85.method592(255, ":clan:");

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lje;")
    public static class67 field2736 = class85.method592(255, "Benutzen");

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "[I")
    public static int[] field2737 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lkc;")
    public static class72 field2734;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Lkc;")
    public static class72 field2735;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)I")
    public final int method956(byte arg0, int arg1) {
        field2730++;
        int var3 = 49 % ((42 - arg0) / 33);
        int var4 = this.field2729.length - 2;
        int var5 = var4 & arg1 << 1;
        while (true) {
            int var6 = this.field2729[var5];
            if (arg1 == var6) {
                return this.field2729[var5 + 1];
            }
            if (var6 == -1) {
                return -1;
            }
            var5 = var4 & var5 + 2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method957(int arg0) {
        field2736 = null;
        field2731 = null;
        field2734 = null;
        if (arg0 != 13501) {
            method958(null, -125, -57, -28);
        }
        field2726 = null;
        field2735 = null;
        field2728 = null;
        field2737 = null;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([I)V")
    public class122(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field2729 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2729[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2729[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2729[var5 + var5] = arg0[var4];
            this.field2729[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lm;III)V")
    public static final void method958(class83 arg0, int arg1, int arg2, int arg3) {
        field2738++;
        if ((arg3 & 0x200) != 0) {
            arg0.field2953 = class9.field196.method623(-125);
            arg0.field2978 = class9.field196.method622((byte) 102);
            arg0.field2949 = class9.field196.method621(6538);
            arg0.field2971 = class9.field196.method623(-34);
            arg0.field2956 = class9.field196.method630((byte) -49) + class34.field627;
            arg0.field2952 = class9.field196.method648(22591) + class34.field627;
            arg0.field2969 = class9.field196.method621(6538);
            arg0.field2950 = 0;
            arg0.field2947 = 1;
        }
        if ((arg3 & 0x8) != 0) {
            int var4 = class9.field196.method649(false);
            int var5 = class9.field196.method622((byte) 102);
            arg0.method1012(var5, 8, class34.field627, var4);
            arg0.field2951 = class34.field627 + 300;
            arg0.field2974 = class9.field196.method621(6538);
            arg0.field2995 = class9.field196.method649(false);
        }
        if ((arg3 & 0x400) != 0) {
            arg0.field2990 = class9.field196.method641(255);
            int var6 = class9.field196.method646((byte) -52);
            if (arg0.field2990 == 65535) {
                arg0.field2990 = -1;
            }
            arg0.field2966 = 0;
            arg0.field2941 = 0;
            arg0.field2962 = var6 >> 16;
            arg0.field2983 = (var6 & 0xFFFF) + class34.field627;
            if (arg0.field2983 > class34.field627) {
                arg0.field2941 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            arg0.field2988 = class9.field196.method648(22591);
            if (arg0.field2988 == 65535) {
                arg0.field2988 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            int var7 = class9.field196.method649(false);
            int var8 = class9.field196.method621(6538);
            arg0.method1012(var8, 2, class34.field627, var7);
            arg0.field2951 = class34.field627 + 300;
            arg0.field2974 = class9.field196.method622((byte) 102);
            arg0.field2995 = class9.field196.method622((byte) 102);
        }
        if ((arg3 & 0x80) != 0) {
            int var9 = class9.field196.method648(22591);
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = class9.field196.method622((byte) 102);
            class16.method112(var10, var9, arg0, true);
        }
        if ((arg3 & 0x1) != 0) {
            int var11 = class9.field196.method648(22591);
            int var12 = class9.field196.method621(6538);
            int var13 = class9.field196.method649(false);
            int var14 = class9.field196.field2043;
            if (arg0.field1854 != null && arg0.field1843 != null) {
                long var15 = arg0.field1854.method476((byte) 77);
                boolean var17 = false;
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < class92.field2059; var18++) {
                        if (class14.field244[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17 && class58.field1149 == 0) {
                    class55.field1100.field2043 = 0;
                    class9.field196.method626(class55.field1100.field1991, var13, 0, (byte) -13);
                    class55.field1100.field2043 = 0;
                    class67 var19 = class100.method785(class158.method1225(2, class55.field1100).method462(true));
                    arg0.field2989 = var19.method459((byte) 52);
                    arg0.field2965 = var11 & 0xFF;
                    arg0.field2977 = var11 >> 8;
                    arg0.field2948 = 150;
                    if (var12 == 2 || var12 == 3) {
                        class88.method614(var19, class49.method314(new class67[] { class142.field3276, arg0.field1854 }, 0), 118, 1);
                    } else if (var12 == 1) {
                        class88.method614(var19, class49.method314(new class67[] { class3.field40, arg0.field1854 }, 0), 92, 1);
                    } else {
                        class88.method614(var19, arg0.field1854, 77, 2);
                    }
                }
            }
            class9.field196.field2043 = var13 + var14;
        }
        if ((arg3 & 0x4) != 0) {
            arg0.field2970 = class9.field196.method630((byte) -49);
            arg0.field2994 = class9.field196.method659(false);
        }
        if (arg2 < 111) {
            field2736 = null;
        }
        if ((arg3 & 0x10) != 0) {
            int var20 = class9.field196.method621(6538);
            byte[] var21 = new byte[var20];
            class91 var22 = new class91(var21);
            class9.field196.method651((byte) -15, 0, var20, var21);
            class4.field59[arg1] = var22;
            arg0.method587(5653, var22);
        }
        if ((arg3 & 0x20) == 0) {
            return;
        }
        arg0.field2989 = class9.field196.method634(-1);
        if (arg0.field2989.method477(0, (byte) 118) == 126) {
            arg0.field2989 = arg0.field2989.method463(1, -93);
            class88.method614(arg0.field2989, arg0.field1854, 104, 2);
        } else if (class37.field667 == arg0) {
            class88.method614(arg0.field2989, arg0.field1854, 64, 2);
        }
        arg0.field2977 = 0;
        arg0.field2965 = 0;
        arg0.field2948 = 150;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII[Lee;I[BIII)V")
    public static final void method959(int arg0, int arg1, int arg2, int arg3, class34[] arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
        field2732++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg2 + var15 > 0 && arg2 + var15 < 103) {
                    arg4[arg0].field611[arg5 + var10][arg2 + var15] = class34.method213(arg4[arg0].field611[arg5 + var10][arg2 + var15], -16777217);
                }
            }
        }
        class91 var11 = new class91(arg6);
        for (int var12 = arg9; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg3 == var12 && arg1 <= var13 && arg1 + 8 > var13 && arg8 <= var14 && arg8 + 8 > var14) {
                        class123.method960(0, (byte) -29, var11, arg7, arg5 + class50.method326(true, var14 & 0x7, var13 & 0x7, arg7), 0, arg0, arg2 + class61.method424((byte) 118, arg7, var13 & 0x7, var14 & 0x7));
                    } else {
                        class123.method960(0, (byte) -29, var11, 0, -1, 0, 0, -1);
                    }
                }
            }
        }
    }
}
