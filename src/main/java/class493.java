import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class493 extends class86 {

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field7198 = 0;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Lud;")
    public static class63 field7194 = new class63("WTI", 5);

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "[B")
    public static byte[] field7206 = new byte[2048];

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Ljava/lang/String;")
    public String field7193;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "[C")
    public char[] field7195;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "[C")
    public char[] field7201;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "[I")
    public int[] field7196;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "[I")
    public int[] field7205;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)Lmj;", line = 6)
    public static final class70 method2924(int arg0, int arg1, int arg2) {
        class420 var3 = class380.field5802[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6271;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V", line = 13)
    public static final void method2925(int arg0) {
        field7199++;
        int var1 = class287.field4285.length;
        int var2 = 0;
        if (arg0 != -10253) {
            field7198 = 1;
        }
        while (var1 > var2) {
            if (class287.field4285[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class337.field5300; var4++) {
                    if (class306.field4495[var4] == class253.field3509[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class306.field4495[class337.field5300] = class253.field3509[var2];
                    var3 = class337.field5300++;
                }
                class91 var5 = new class91(class287.field4285[var2]);
                int var6 = 0;
                while (class287.field4285[var2].length > var5.field1292 && var6 < 511 && class25.field411 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method631(10494);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1F85) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class253.field3509[var2] >> 8) * 64 + var10 - class82.field1105;
                    int var13 = (class253.field3509[var2] & 0xFF) * 64 + var11 - class437.field6477;
                    class329 var14 = class410.field6175.method1216(var5.method631(arg0 + 20747), false);
                    if (class151.field2174[var7] == null && (var14.field5101 & 0x1) > 0 && class430.field6399 == var9 && var12 >= 0 && class96.field1403 > (var14.field5083 + var12) && var13 >= 0 && var14.field5083 + var13 < class485.field7122) {
                        class151.field2174[var7] = new class194();
                        class151.field2174[var7].field5254 = var7;
                        class194 var15 = class151.field2174[var7];
                        class259.field3609[class25.field411++] = var7;
                        var15.field5330 = class405.field6116;
                        var15.method1364(var14, 81);
                        var15.method2180(var15.field2768.field5083, (byte) 0);
                        var15.field5245 = var15.field2768.field5099 << 3;
                        if (var15.field5245 == 0) {
                            var15.method2184(0, 14839);
                        } else {
                            var15.method2184((var15.field2768.field5086 + 4 & 0x7DA00007) << 11, arg0 + 25092);
                        }
                        var15.method1366(var15.method2091(arg0 ^ 0x1380), var9, var13, var12, true, 31883);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FIIIIFIFFI[BFLut;)V", line = 112)
    public static final void method2926(float arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, float arg7, float arg8, int arg9, byte[] arg10, float arg11, class462 arg12) {
        for (int var13 = arg2; var13 < arg9; var13++) {
            class308.method1985(arg12, arg1, arg4, arg6, arg5, arg10, -125, arg8, arg9, arg0, arg7, arg11, var13, arg3);
            arg1 += arg3 * arg6;
        }
        field7203++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ICI)C", line = 129)
    public static final char method2927(int arg0, char arg1, int arg2) {
        if (arg2 != 121) {
            method2930((byte) -96);
        }
        field7192++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V", line = 221)
    public final void method2928(int arg0) {
        if (arg0 != 32768) {
            return;
        }
        if (this.field7205 != null) {
            for (int var2 = 0; var2 < this.field7205.length; var2++) {
                this.field7205[var2] = class286.method1860(this.field7205[var2], 32768);
            }
        }
        field7191++;
        if (this.field7196 != null) {
            for (int var3 = 0; var3 < this.field7196.length; var3++) {
                this.field7196[var3] = class286.method1860(this.field7196[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IC)I", line = 254)
    public final int method2929(int arg0, char arg1) {
        field7202++;
        if (this.field7196 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field7196.length; var3++) {
            if (this.field7201[var3] == arg1) {
                return this.field7196[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V", line = 275)
    public static void method2930(byte arg0) {
        if (arg0 < -98) {
            field7206 = null;
            field7194 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IC)I", line = 286)
    public final int method2931(int arg0, char arg1) {
        field7197++;
        if (this.field7205 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field7205.length; var3++) {
            if (this.field7195[var3] == arg1) {
                return this.field7205[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ltl;I)V", line = 311)
    public final void method2932(class91 arg0, int arg1) {
        field7200++;
        while (true) {
            int var3 = arg0.method618((byte) 100);
            if (var3 == 0) {
                if (arg1 <= 11) {
                    this.field7195 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method2933((byte) -34, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLtl;I)V", line = 333)
    private final void method2933(byte arg0, class91 arg1, int arg2) {
        if (arg2 == 1) {
            this.field7193 = arg1.method621(2029169511);
        } else if (arg2 == 2) {
            int var7 = arg1.method618((byte) 100);
            this.field7201 = new char[var7];
            this.field7196 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field7196[var8] = arg1.method631(10494);
                byte var10 = arg1.method619((byte) -23);
                this.field7201[var8] = var10 == 0 ? 0 : class396.method2437(var10, -5513);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method618((byte) 100);
            this.field7195 = new char[var4];
            this.field7205 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7205[var5] = arg1.method631(10494);
                byte var6 = arg1.method619((byte) -23);
                this.field7195[var5] = var6 == 0 ? 0 : class396.method2437(var6, -5513);
            }
        }
        field7204++;
        int var9 = 73 % ((4 - arg0) / 33);
    }
}
