import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class86 extends class729 {

    @OriginalMember(owner = "client!aka", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field1151 = new String[100];

    @OriginalMember(owner = "client!aka", name = "Q", descriptor = "I")
    public static int field1152 = 0;

    @OriginalMember(owner = "client!aka", name = "R", descriptor = "J")
    public static long field1153 = -1L;

    @OriginalMember(owner = "client!aka", name = "G", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!aka", name = "I", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!aka", name = "J", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!aka", name = "K", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!aka", name = "L", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!aka", name = "N", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!aka", name = "O", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!aka", name = "M", descriptor = "Ltf;")
    public static class312 field1148;

    @OriginalMember(owner = "client!aka", name = "H", descriptor = "[B")
    private byte[] field1143;

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(IIII)[B")
    public final byte[] method791(int arg0, int arg1, int arg2, int arg3) {
        this.field1143 = new byte[arg0 * arg2 * arg3 * 2];
        field1150++;
        this.method3433((byte) 18, arg3, arg0, arg2);
        if (arg1 != 0) {
            this.method792(-67, (byte) -89, -73);
        }
        return this.field1143;
    }

    @OriginalMember(owner = "client!aka", name = "<init>", descriptor = "()V")
    public class86() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(IBI)V")
    public final void method792(int arg0, byte arg1, int arg2) {
        field1145++;
        int var4 = arg2 * 2;
        byte var5 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var7 = var4 + 1;
        this.field1143[var10001] = var5;
        this.field1143[var7] = var5;
        int var6 = -123 / ((arg0 + 7) / 36);
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZLkg;III)V")
    public static final void method793(boolean arg0, class287 arg1, int arg2, int arg3, int arg4) {
        field1144++;
        class15 var5 = arg1.method1676(0);
        if (!arg0) {
            return;
        }
        int var6 = arg1.field3380 - arg1.field3434.field1922 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg1.field3429 > 25) {
                if (arg3 < 0 && var5.field243 != -1) {
                    arg1.field3399 = var5.field243;
                    arg1.field3426 = false;
                } else if (arg3 <= 0 || var5.field247 == -1) {
                    arg1.field3399 = var5.field274;
                } else {
                    arg1.field3399 = var5.field247;
                }
                arg1.field3426 = false;
            } else if (!arg1.field3426 || !var5.method199(-9801, arg1.field3399)) {
                arg1.field3399 = var5.method196(-128);
                arg1.field3426 = arg1.field3399 != -1;
            }
        } else if (arg1.field3377 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class367.field4547[arg4] - arg1.field3434.field1922 & 0x3FFF;
            arg1.field3426 = false;
            if (arg2 == 2 && var5.field245 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field258 != -1) {
                    arg1.field3399 = var5.field258;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field270 != -1) {
                    arg1.field3399 = var5.field270;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field241 == -1) {
                    arg1.field3399 = var5.field245;
                } else {
                    arg1.field3399 = var5.field241;
                }
            } else if (arg2 == 0 && var5.field271 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field261 != -1) {
                    arg1.field3399 = var5.field261;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field251 != -1) {
                    arg1.field3399 = var5.field251;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field276 == -1) {
                    arg1.field3399 = var5.field271;
                } else {
                    arg1.field3399 = var5.field276;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field257 != -1) {
                arg1.field3399 = var5.field257;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field272 != -1) {
                arg1.field3399 = var5.field272;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field282 == -1) {
                arg1.field3399 = var5.field274;
            } else {
                arg1.field3399 = var5.field282;
            }
        } else if (var6 == 0 && arg1.field3429 <= 25) {
            arg1.field3426 = false;
            if (arg2 == 2 && var5.field245 != -1) {
                arg1.field3399 = var5.field245;
            } else if (arg2 == 0 && var5.field271 != -1) {
                arg1.field3399 = var5.field271;
            } else {
                arg1.field3399 = var5.field274;
            }
        } else {
            if (arg2 == 2 && var5.field245 != -1) {
                if (arg3 < 0 && var5.field254 != -1) {
                    arg1.field3399 = var5.field254;
                } else if (arg3 <= 0 || var5.field248 == -1) {
                    arg1.field3399 = var5.field245;
                } else {
                    arg1.field3399 = var5.field248;
                }
            } else if (arg2 == 0 && var5.field271 != -1) {
                if (arg3 < 0 && var5.field236 != -1) {
                    arg1.field3399 = var5.field236;
                } else if (arg3 <= 0 || var5.field260 == -1) {
                    arg1.field3399 = var5.field271;
                } else {
                    arg1.field3399 = var5.field260;
                }
            } else if (arg3 < 0 && var5.field262 != -1) {
                arg1.field3399 = var5.field262;
            } else if (arg3 <= 0 || var5.field285 == -1) {
                arg1.field3399 = var5.field274;
            } else {
                arg1.field3399 = var5.field285;
            }
            arg1.field3426 = false;
        }
    }

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "(IBI)Z")
    public static final boolean method794(int arg0, byte arg1, int arg2) {
        if (arg1 == -37) {
            field1146++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(Les;I)Lfd;")
    public static final class554 method795(class403 arg0, int arg1) {
        field1147++;
        int var2 = arg0.method2396((byte) -111);
        class105 var3 = class625.method3549((byte) 94)[arg0.method2396((byte) -82)];
        if (arg1 != 186) {
            return null;
        }
        class4 var4 = class716.method4046((byte) 127)[arg0.method2396((byte) -95)];
        int var5 = arg0.method2365(true);
        int var6 = arg0.method2365(true);
        int var7 = arg0.method2390((byte) -105);
        int var8 = arg0.method2390((byte) -122);
        int var9 = arg0.method2381((byte) 32);
        int var10 = arg0.method2381((byte) 73);
        int var11 = arg0.method2381((byte) 42);
        boolean var12 = arg0.method2396((byte) 43) == 1;
        return new class554(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!aka", name = "d", descriptor = "(I)V")
    public static void method796(int arg0) {
        field1151 = null;
        if (arg0 != -7125) {
            field1153 = -61L;
        }
        field1148 = null;
    }

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "(III)Z")
    public static final boolean method797(int arg0, int arg1, int arg2) {
        field1142++;
        return arg0 < 7 ? true : (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method798(byte arg0, String arg1) {
        class318.method1873("", arg1, (byte) 65, "", "", 0, 0);
        field1149++;
        if (arg0 != -127) {
            method793(false, null, 127, -21, 110);
        }
    }
}
