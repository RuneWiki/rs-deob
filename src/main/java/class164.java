import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class164 {

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Lss;")
    public static class295 field2335 = null;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "J")
    public static long field2336 = 0L;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "[I")
    public static int[] field2342 = new int[32];

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "Z")
    public static boolean field2341 = true;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field2343;

    static {
        new class83("clan_chat", "clanchat", "conversation_clan", "clan_chat");
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(CII)C", line = 3)
    public static final char method1018(char arg0, int arg1, int arg2) {
        field2337++;
        if (arg2 != -16711936) {
            method1022(52);
        }
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)Ljava/lang/String;", line = 91)
    public static final String method1019(int arg0, int arg1) {
        field2338++;
        if (arg0 >= -68) {
            method1020(true);
        }
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFFD56D) >> 16) + "." + ((arg1 & 0xFFEA) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V", line = 102)
    public static final void method1020(boolean arg0) {
        if (class509.field7473 >= 0) {
            long var1 = class333.method1850(-3562);
            class509.field7473 = (int) ((long) class509.field7473 - (var1 - class66.field914));
            if (class509.field7473 > 0) {
                int var3 = (class509.field7473 << 8) / class16.field175;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class365.field5131 = ((class350.field4792 & 0xFF00) * var3 + (class83.field1158.field7084 & 0xFF00) * var4 & 0xFF0000) + ((class350.field4792 & 0xFF00FF) * var3 + (class83.field1158.field7084 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                float var6 = 1.0F - var5;
                class118.field1588 = (class83.field1158.field7078 - class337.field4648) * var6 + class337.field4648;
                class66.field916 = (class83.field1158.field7098 - class113.field1534) * var6 + class113.field1534;
                class66.field913 = (class83.field1158.field7092 - class97.field1344) * var6 + class97.field1344;
                class168.field2380 = (class83.field1158.field7077 - class302.field4141) * var6 + class302.field4141;
                class378.field5319 = ((class346.field4745 & 0xFF00FF) * var3 + ((class83.field1158.field7081 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class346.field4745 & 0xFF00) * var3 + (class83.field1158.field7081 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class238.field3272 = class159.field2285 * var3 + class83.field1158.field7082 * var4 >> 8;
                class107.field1466 = (class83.field1158.field7079 - class83.field1157) * var6 + class83.field1157;
                class13.field164 = (class83.field1158.field7090 - class131.field1802) * var6 + class131.field1802;
                if (class88.field1209 != class83.field1158.field7089) {
                    class95.field1309 = class329.field4490.method464(class88.field1209, class83.field1158.field7089, var6, class95.field1309);
                }
            } else {
                class66.field916 = class83.field1158.field7098;
                class238.field3272 = class83.field1158.field7082;
                class168.field2380 = class83.field1158.field7077;
                class107.field1466 = class83.field1158.field7079;
                class95.field1309 = class83.field1158.field7089;
                class509.field7473 = -1;
                class118.field1588 = class83.field1158.field7078;
                class378.field5319 = class83.field1158.field7081;
                class365.field5131 = class83.field1158.field7084;
                class13.field164 = class83.field1158.field7090;
                class66.field913 = class83.field1158.field7092;
            }
            class66.field914 = var1;
        }
        if (!arg0) {
            field2341 = false;
        }
        field2343++;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)V", line = 160)
    public static final void method1021(int arg0, int arg1) {
        field2340++;
        class163 var2 = class271.method1546(arg1, arg0, true);
        var2.method1010(1504);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 184)
    public static void method1022(int arg0) {
        field2342 = null;
        if (arg0 != -10821) {
            field2341 = true;
        }
        field2335 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZII)V", line = 200)
    public static final void method1023(int arg0, boolean arg1, int arg2, int arg3) {
        field2339++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg0 < 53) {
            method1023(-51, false, 12, 108);
        }
        class12.field141 = arg2;
        class149.field2109 = arg1;
        class166.field2354 = arg3;
    }
}
