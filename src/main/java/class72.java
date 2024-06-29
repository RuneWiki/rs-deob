import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class72 extends class326 {

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    private int field998 = 32768;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public static int field1002 = 0;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    public static int field1005 = 0;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "[I")
    public static int[] field1003 = new int[5];

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 8)
    public class72() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[[I", line = 16)
    public final int[][] method253(int arg0, byte arg1) {
        int var3 = 93 % ((60 - arg1) / 51);
        field996++;
        int[][] var4 = this.field5104.method2365((byte) 52, arg0);
        if (this.field5104.field5325) {
            int[] var5 = this.method2287(1, arg0, -3896);
            int[] var6 = this.method2287(2, arg0, -3896);
            int[] var7 = var4[1];
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            for (int var10 = 0; var10 < class166.field2731; var10++) {
                int var11 = (var5[var10] * 255 & 0xFF705) >> 12;
                int var12 = var6[var10] * this.field998 >> 12;
                int var13 = class282.field4363[var11] * var12 >> 12;
                int var14 = class333.field5184[var11] * var12 >> 12;
                int var15 = class29.field427 & (var14 >> 12) + arg0;
                int var16 = (var13 >> 12) + var10 & class215.field3397;
                int[][] var17 = this.method2293(-15033, var15, 0);
                var8[var10] = var17[0][var16];
                var7[var10] = var17[1][var16];
                var9[var10] = var17[2][var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZLnn;ZILnn;I)I", line = 72)
    public static final int method554(int arg0, boolean arg1, class187 arg2, boolean arg3, int arg4, class187 arg5, int arg6) {
        field1004++;
        int var7 = class23.method227(arg1, arg2, arg4, 1, arg5);
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var8 = class23.method227(arg3, arg2, arg0, 1, arg5);
            if (arg6 >= -80) {
                field1003 = (int[]) null;
            }
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZLvl;)V", line = 111)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field998 = arg2.method39((byte) 39) << 4;
        } else if (arg0 == 1) {
            this.field5121 = arg2.method58(-288140008) == 1;
        }
        if (arg1) {
            method558(false, 65, -102, (String) null);
        }
        field999++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)[I", line = 143)
    public final int[] method103(int arg0, int arg1) {
        if (arg0 > -25) {
            return (int[]) null;
        }
        field991++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int[] var4 = this.method2287(1, arg1, -3896);
            int[] var5 = this.method2287(2, arg1, -3896);
            for (int var6 = 0; var6 < class166.field2731; var6++) {
                int var7 = (var4[var6] & 0xFF2) >> 4;
                int var8 = var5[var6] * this.field998 >> 12;
                int var9 = class282.field4363[var7] * var8 >> 12;
                int var10 = class333.field5184[var7] * var8 >> 12;
                int var11 = class215.field3397 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg1 & class29.field427;
                int[] var13 = this.method2287(0, var12, -3896);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(III)V", line = 192)
    public static final void method555(int arg0, int arg1, int arg2) {
        field997++;
        if (class286.method2022((byte) -33, arg2)) {
            if (arg1 >= -21) {
                field1002 = 99;
            }
            class231.method1668(arg0, (byte) -128, class269.field4182[arg2]);
        }
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(III)V", line = 209)
    public static final void method556(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class267.field4165; var3++) {
            class10 var4 = class238.method1703(29555, var3);
            if (var4 != null) {
                int var5 = var4.field184;
                if (var5 >= 0 && !class31.field466.method465(true, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field176 >= 0) {
                    int var6 = var4.field176;
                    int var7 = (var6 & 0x7F) + arg0;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (var6 + arg2 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class31.field461[class275.method1933(96, -1, var8)];
                } else if (var5 >= 0) {
                    var9 = class31.field461[class275.method1933(96, -1, class31.field466.method458(17701, var5))];
                } else if (var4.field180 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field180;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class31.field461[class275.method1933(96, -1, var12)];
                }
                class343.field5332[var3 + 1] = var9;
            }
        }
        if (arg1 < 109) {
            method554(-106, false, (class187) null, false, -44, (class187) null, -52);
        }
        field993++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IC)Z", line = 284)
    public static final boolean method557(int arg0, char arg1) {
        int var2 = 22 % ((-arg0 - 1) / 58);
        field1006++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZIILjava/lang/String;)Z", line = 293)
    public static final boolean method558(boolean arg0, int arg1, int arg2, String arg3) {
        field1001++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 > -118) {
            return false;
        } else {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = arg3.length();
            int var7 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                char var9 = arg3.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg0) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (var11 >= arg1) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg1 * var7 + var11;
                if ((var10 / arg1) != var7) {
                    return false;
                }
                var5 = true;
                var7 = var10;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(B)V", line = 366)
    public final void method99(byte arg0) {
        class59.method480(true);
        if (arg0 != 31) {
            method559((byte) -123);
        }
        field994++;
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(B)V", line = 390)
    public static void method559(byte arg0) {
        if (arg0 != 83) {
            method554(0, false, (class187) null, false, -96, (class187) null, -111);
        }
        field1003 = null;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)I", line = 403)
    public static final int method560(int arg0, int arg1) {
        field1000++;
        if (class275.field4247 != null) {
            class275.field4247.method218(true);
            class275.field4247 = null;
        }
        if (arg1 > -124) {
            method554(114, true, (class187) null, true, -113, (class187) null, -49);
        }
        class29.field415++;
        if (class29.field415 > 4) {
            class29.field415 = 0;
            class14.field221 = 0;
            return arg0;
        }
        class14.field221 = 0;
        if (class64.field928 == class60.field893) {
            class64.field928 = class233.field3636;
        } else {
            class64.field928 = class60.field893;
        }
        return -1;
    }
}
