import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class129 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lsc;")
    private static class128 field2961 = method1017(false, " seconds)3");

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lsc;")
    public static class128 field2960 = field2961;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lsc;")
    public static class128 field2964 = method1017(false, "Texturen geladen)3");

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lsc;")
    public static class128 field2967 = method1017(false, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Lsc;")
    public static class128 field2957 = method1017(false, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[Lmc;")
    public static class86[] field2959 = new class86[2048];

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method1016(int arg0) {
        field2964 = null;
        field2961 = null;
        if (arg0 != 0) {
            field2961 = null;
        }
        field2960 = null;
        field2967 = null;
        field2957 = null;
        field2959 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLjava/lang/String;)Lsc;")
    public static final class128 method1017(boolean arg0, String arg1) {
        field2963++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class128 var4 = new class128();
        var4.field2893 = new byte[var3];
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field2893[var4.field2920++] = (byte) (var7 + var6 * 43 - 48 - 1720);
            } else if (var6 != 0) {
                var4.field2893[var4.field2920++] = (byte) var6;
            }
        }
        var4.method982((byte) 80);
        if (arg0) {
            method1017(true, null);
        }
        return var4.method983((byte) -80);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(JI)Lsc;")
    public static final class128 method1018(long arg0, int arg1) {
        field2966++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class146.field3390[(int) (var8 - arg0 * 37L)];
            }
            if (arg1 != 82) {
                field2960 = null;
            }
            class128 var7 = new class128();
            var7.field2893 = var6;
            var7.field2920 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[BIII[Lda;III)V")
    public static final void method1019(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, class23[] arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg8 + var15 > 0 && arg8 + var15 < 103) {
                    arg6[arg4].field457[arg7 + var10][arg8 + var15] = class25.method224(arg6[arg4].field457[arg7 + var10][arg8 + var15], -16777217);
                }
            }
        }
        class86 var11 = new class86(arg2);
        field2958++;
        if (arg3 != 2048) {
            field2964 = null;
        }
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg9 == var12 && arg0 <= var13 && arg0 + 8 > var13 && var14 >= arg1 && var14 < arg1 + 8) {
                        class108.method834(0, class99.method761(var13 & 0x7, arg5, var14 & 0x7, 0) + arg7, class53.method402(var14 & 0x7, arg5, var13 & 0x7, arg3 + -2041) + arg8, arg5, 0, arg4, var11, arg3 - 27639);
                    } else {
                        class108.method834(0, -1, -1, 0, 0, 0, var11, -25591);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BIILae;ZIB)V")
    public static final void method1020(byte arg0, int arg1, int arg2, class6 arg3, boolean arg4, int arg5, byte arg6) {
        field2962++;
        long var7 = (long) ((arg1 << 16) + arg5);
        class44 var9 = (class44) class31.field613.method969(var7, -88);
        if (var9 != null) {
            return;
        }
        class44 var10 = (class44) class93.field2124.method969(var7, -101);
        if (var10 != null) {
            return;
        }
        int var11 = 55 % ((arg6 - 3) / 33);
        class44 var12 = (class44) class55.field1226.method969(var7, -75);
        if (var12 == null) {
            if (!arg4) {
                class44 var13 = (class44) class99.field2280.method969(var7, -126);
                if (var13 != null) {
                    return;
                }
            }
            class44 var14 = new class44();
            var14.field827 = arg0;
            var14.field825 = arg3;
            var14.field830 = arg2;
            if (arg4) {
                class31.field613.method964(false, var14, var7);
                class20.field375++;
            } else {
                class42.field773.method567(var14, 0);
                class55.field1226.method964(false, var14, var7);
                class117.field2642++;
            }
        } else if (arg4) {
            var12.method339(102);
            class31.field613.method964(false, var12, var7);
            class20.field375++;
            class117.field2642--;
        }
    }
}
