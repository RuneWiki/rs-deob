import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class56 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public int field854 = -1;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public int field856 = -1;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lul;")
    public static class51 field861 = new class51(64);

    @OriginalMember(owner = "client!m", name = "l", descriptor = "[C")
    public static char[] field865 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Ljava/lang/String;")
    public static String field867 = "Loading config - ";

    @OriginalMember(owner = "client!m", name = "o", descriptor = "[Lpi;")
    public static class336[] field868 = new class336[2048];

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
    public int[] field855;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "[I")
    public static int[] field866;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Z", line = 7)
    public static final boolean method499(int arg0) {
        int var1 = 102 % ((arg0 + 62) / 40);
        field859++;
        return class43.field680 ? true : class287.field4570;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILlg;IIBLwb;I)V", line = 23)
    public static final void method500(int arg0, class137 arg1, int arg2, int arg3, byte arg4, class171 arg5, int arg6) {
        field858++;
        if (arg5 == null) {
            return;
        }
        int var7 = -73 / ((36 - arg4) / 50);
        int var8 = (int) class83.field1331 + class243.field3962 & 0x7FF;
        int var9 = Math.max(arg1.field2533 / 2, arg1.field2515 / 2) + 10;
        int var10 = arg3 * arg3 + arg6 * arg6;
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class62.field962[var8];
        int var12 = var11 * 256 / (class4.field59 + 256);
        int var13 = class62.field961[var8];
        int var14 = var13 * 256 / (class4.field59 + 256);
        int var15 = arg6 * var12 + (arg3 * var14) >> 16;
        int var16 = arg6 * var14 - (arg3 * var12) >> 16;
        if (class43.field680) {
            ((class157) arg5).method1253(arg1.field2533 / 2 + var15 + arg0 - (arg5.field2957 / 2), arg1.field2515 / 2 + -(arg5.field2969 / 2) + -var16 + arg2, (class157) arg1.method1120(false, false));
        } else {
            ((class309) arg5).method2148(arg1.field2533 / 2 + arg0 + var15 - (arg5.field2957 / 2), arg2 - -(arg1.field2515 / 2) + -(arg5.field2969 / 2) + -var16, arg1.field2469, arg1.field2510);
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 66)
    public static void method501(int arg0) {
        int var1 = 81 / ((28 - arg0) / 48);
        field865 = null;
        field861 = null;
        field866 = null;
        field867 = null;
        field868 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLpi;I)V", line = 84)
    public final void method502(byte arg0, class336 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method2364(-9069);
            if (var4 == 0) {
                field857++;
                if (arg0 != -65) {
                    method499(43);
                }
                return;
            }
            this.method505(arg1, arg2, var4, arg0 + 66);
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V", line = 102)
    public static final void method503(int arg0) {
        class134.field2348 = 0;
        field862++;
        if (arg0 != 8211) {
            return;
        }
        int var1 = (class218.field3632.field2036 >> 7) + class24.field345;
        int var2 = (class218.field3632.field1985 >> 7) + class34.field484;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class134.field2348 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class134.field2348 = 1;
        }
        if (class134.field2348 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class134.field2348 = 0;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([IZ)[I", line = 131)
    public static final int[] method504(int[] arg0, boolean arg1) {
        if (!arg1) {
            method499(3);
        }
        field860++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class345.method2415(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lpi;III)V", line = 148)
    private final void method505(class336 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == arg3) {
            this.field854 = arg0.method2339((byte) -46);
        } else if (arg2 == 2) {
            this.field855 = new int[arg0.method2364(-9069)];
            for (int var5 = 0; var5 < this.field855.length; var5++) {
                this.field855[var5] = arg0.method2339((byte) -46);
            }
        } else if (arg2 == 3) {
            this.field856 = arg0.method2364(-9069);
        }
        field863++;
    }
}
