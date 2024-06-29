import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class188 {

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    private int field3136 = 65000;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lul;")
    private class39 field3138 = null;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Lul;")
    private class39 field3143 = null;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    private int field3137;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field3142 = -1;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field3140 = 0;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIZ[B)Z", line = 12)
    private final boolean method1417(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        field3134++;
        class39 var6 = this.field3138;
        synchronized (this.field3138) {
            try {
                int var7;
                boolean var10000;
                if (arg3) {
                    if (((long) (arg1 * 6 + 6)) > this.field3143.method262(-106)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field3143.method260((long) (arg1 * 6), -30524);
                    this.field3143.method272(6, arg2, 0, class39.field600);
                    var7 = ((class39.field600[4] & 0xFF) << 8) + (class39.field600[3] & 0xFF << 16) + (class39.field600[5] & 0xFF);
                    if (var7 <= 0 || (this.field3138.method262(arg2 - 96) / 520L) < ((long) var7)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field3138.method262(-123) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class39.field600[0] = (byte) (arg0 >> 16);
                class39.field600[3] = (byte) (var7 >> 16);
                class39.field600[2] = (byte) arg0;
                int var8 = 0;
                class39.field600[4] = (byte) (var7 >> 8);
                class39.field600[5] = (byte) var7;
                class39.field600[1] = (byte) (arg0 >> 8);
                this.field3143.method260((long) (arg1 * 6), arg2 ^ 0xFFFF88C4);
                this.field3143.method263(103, 6, arg2, class39.field600);
                int var9 = 0;
                while (true) {
                    if (arg0 > var8) {
                        label135: {
                            int var10 = 0;
                            if (arg3) {
                                this.field3138.method260((long) (var7 * 520), arg2 ^ 0xFFFF88C4);
                                try {
                                    this.field3138.method272(8, 0, 0, class39.field600);
                                } catch (EOFException var18) {
                                    break label135;
                                }
                                var10 = (class39.field600[6] & 0xFF) + ((class39.field600[5] & 0xFF) << 8) + (class39.field600[4] & 0xFF << 16);
                                int var12 = (class39.field600[0] & 0xFF << 8) + (class39.field600[1] & 0xFF);
                                int var13 = ((class39.field600[2] & 0xFF) << 8) + (class39.field600[3] & 0xFF);
                                int var14 = class39.field600[7] & 0xFF;
                                if (arg1 != var12 || var9 != var13 || this.field3137 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (this.field3138.method262(-103) / 520L) < ((long) var10)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field3138.method262(-82) + 519L) / 520L);
                                arg3 = false;
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class39.field600[7] = (byte) this.field3137;
                            if ((arg0 - var8) <= 512) {
                                var10 = 0;
                            }
                            class39.field600[3] = (byte) var9;
                            class39.field600[1] = (byte) arg1;
                            class39.field600[6] = (byte) var10;
                            class39.field600[5] = (byte) (var10 >> 8);
                            class39.field600[0] = (byte) (arg1 >> 8);
                            int var15 = arg0 - var8;
                            class39.field600[2] = (byte) (var9 >> 8);
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class39.field600[4] = (byte) (var10 >> 16);
                            var9++;
                            this.field3138.method260((long) (var7 * 520), -30524);
                            var7 = var10;
                            this.field3138.method263(109, 8, 0, class39.field600);
                            this.field3138.method263(-89, var15, var8, arg4);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V", line = 131)
    public static final void method1418(int arg0, int arg1) {
        if (arg0 >= 118) {
            field3132++;
            class156 var2 = class206.method1525(8, -32701, arg1);
            var2.method1184((byte) 87);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)I", line = 156)
    public static final int method1419(int arg0, int arg1) {
        field3139++;
        int var2 = 13 / ((68 - arg0) / 38);
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIZIIIIIIIII)Z", line = 169)
    public static final boolean method1420(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg10 != 3) {
            return false;
        }
        field3146++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class104.field1750[var12][var13] = 0;
                class43.field707[var12][var13] = 99999999;
            }
        }
        int var14 = arg9;
        class104.field1750[arg9][arg11] = 99;
        class43.field707[arg9][arg11] = 0;
        int var15 = arg11;
        int var16 = 0;
        byte var17 = 0;
        boolean var18 = false;
        class263.field4567[var17] = arg9;
        int var32 = var17 + 1;
        class2.field10[var17] = arg11;
        int[][] var19 = class286.field4931[class67.field1174].field1766;
        while (var16 != var32) {
            var14 = class263.field4567[var16];
            var15 = class2.field10[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg0 == var14 && arg3 == var15) {
                var18 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class286.field4931[class67.field1174].method817(var14, var15, arg8, 1, arg1 - 1, arg0, false, arg3)) {
                    var18 = true;
                    break;
                }
                if (arg1 < 10 && class286.field4931[class67.field1174].method823(var14, arg3, arg1 - 1, arg8, 5252, arg0, 1, var15)) {
                    var18 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg4 != 0 && class286.field4931[class67.field1174].method806(arg6, 2, var14, arg4, arg3, 1, arg0, arg7, var15)) {
                var18 = true;
                break;
            }
            int var20 = class43.field707[var14][var15] + 1;
            if (var14 > 0 && class104.field1750[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0) {
                class263.field4567[var32] = var14 - 1;
                class2.field10[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class104.field1750[var14 - 1][var15] = 2;
                class43.field707[var14 - 1][var15] = var20;
            }
            if (var14 < 103 && class104.field1750[var14 + 1][var15] == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0) {
                class263.field4567[var32] = var14 + 1;
                class2.field10[var32] = var15;
                class104.field1750[var14 + 1][var15] = 8;
                var32 = var32 + 1 & 0xFFF;
                class43.field707[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class104.field1750[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class263.field4567[var32] = var14;
                class2.field10[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class104.field1750[var14][var15 - 1] = 1;
                class43.field707[var14][var15 - 1] = var20;
            }
            if (var15 < 103 && class104.field1750[var14][var15 + 1] == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class263.field4567[var32] = var14;
                class2.field10[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class104.field1750[var14][var15 + 1] = 4;
                class43.field707[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class104.field1750[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class263.field4567[var32] = var14 - 1;
                class2.field10[var32] = var15 - 1;
                class104.field1750[var14 - 1][var15 - 1] = 3;
                class43.field707[var14 - 1][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && var15 > 0 && class104.field1750[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class263.field4567[var32] = var14 + 1;
                class2.field10[var32] = var15 - 1;
                class104.field1750[var14 + 1][var15 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class43.field707[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 103 && class104.field1750[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class263.field4567[var32] = var14 - 1;
                class2.field10[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class104.field1750[var14 - 1][var15 + 1] = 6;
                class43.field707[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 103 && var15 < 103 && class104.field1750[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class263.field4567[var32] = var14 + 1;
                class2.field10[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class104.field1750[var14 + 1][var15 + 1] = 12;
                class43.field707[var14 + 1][var15 + 1] = var20;
            }
        }
        class118.field1998 = 0;
        if (!var18) {
            if (!arg2) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg0 - var23; var24 <= arg0 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class43.field707[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg0 > var24) {
                            var26 = arg0 - var24;
                        } else if (var24 > (arg0 + arg7 - 1)) {
                            var26 = var24 + 1 - arg0 - arg7;
                        }
                        int var27 = 0;
                        if (var25 < arg3) {
                            var27 = arg3 - var25;
                        } else if (var25 > (arg3 + arg4 - 1)) {
                            var27 = var25 + 1 - arg3 - arg4;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var22 > class43.field707[var24][var25]) {
                            var21 = var28;
                            var14 = var24;
                            var22 = class43.field707[var24][var25];
                            var15 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg9 == var14 && arg11 == var15) {
                return false;
            }
            class118.field1998 = 1;
        }
        byte var29 = 0;
        class263.field4567[var29] = var14;
        int var33 = var29 + 1;
        class2.field10[var29] = var15;
        int var30;
        int var31 = var30 = class104.field1750[var14][var15];
        while (arg9 != var14 || arg11 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class263.field4567[var33] = var14;
                class2.field10[var33++] = var15;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            var31 = class104.field1750[var14][var15];
        }
        if (var33 > 0) {
            class111.method865(arg5, arg10 ^ 0x3, var33);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(ILul;Lul;I)V", line = 787)
    public class188(int arg0, class39 arg1, class39 arg2, int arg3) {
        this.field3137 = arg0;
        this.field3136 = arg3;
        this.field3143 = arg2;
        this.field3138 = arg1;
    }

    @OriginalMember(owner = "client!ci", name = "toString", descriptor = "()Ljava/lang/String;", line = 462)
    public final String toString() {
        field3129++;
        return "Cache:" + this.field3137;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III[B)Z", line = 476)
    public final boolean method1421(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != -2805) {
            field3131 = -58;
        }
        field3144++;
        class39 var5 = this.field3138;
        synchronized (this.field3138) {
            if (arg0 < 0 || this.field3136 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1417(arg0, arg1, 0, true, arg3);
            if (!var6) {
                var6 = this.method1417(arg0, arg1, arg2 ^ 0xFFFFF50B, false, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIBZI[B[Lpk;)V", line = 502)
    public static final void method1422(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, byte[] arg6, class104[] arg7) {
        field3145++;
        if (!arg4) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg5 + var9 > 0 && (arg5 + var9) < 103 && arg1 + var10 > 0 && arg1 + var10 < 103) {
                            arg7[var8].field1766[arg5 + var9][arg1 + var10] = class235.method1710(arg7[var8].field1766[arg5 + var9][arg1 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg4) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class60 var12 = new class60(arg6);
        if (arg3 > -76) {
            method1419(-121, -28);
        }
        for (int var13 = 0; var13 < var11; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class24.method168(0, var13, 0, arg2, var12, arg4, var15 + arg1, arg0, arg5 + var14);
                }
            }
        }
        if (arg4) {
            return;
        }
        class230 var16 = null;
        label120: while (true) {
            int var18;
            label113: do {
                while (var12.field1012 < var12.field997.length) {
                    int var17 = var12.method501(0);
                    if (var17 != 0) {
                        if (var17 != 1) {
                            throw new IllegalStateException();
                        }
                        var18 = var12.method501(0);
                        continue label113;
                    }
                    var16 = new class230(var12);
                }
                if (var16 == null) {
                    var16 = new class230();
                }
                for (int var23 = 0; var23 < 8; var23++) {
                    for (int var24 = 0; var24 < 8; var24++) {
                        int var25 = (arg5 >> 3) + var23;
                        int var26 = (arg1 >> 3) + var24;
                        if (var25 >= 0 && var25 < 13 && var26 >= 0 && var26 < 13) {
                            class213.field3629[var25][var26] = var16;
                        }
                    }
                }
                break label120;
            } while (var18 <= 0);
            for (int var19 = 0; var19 < var18; var19++) {
                class102 var20 = new class102(var12);
                var20.field1730 += arg5 << 7;
                int var21 = var20.field1730 >> 7;
                var20.field1719 += arg1 << 7;
                int var22 = var20.field1719 >> 7;
                if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                    var20.field1736 = class53.field879[var20.field1715][var21][var22] - var20.field1736;
                    class209.method1542(var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Leg;", line = 663)
    public static final class285 method1423(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4086; var4++) {
            class285 var5 = var3.field4083[var4];
            if ((var5.field4914 >> 29 & 0x3L) == 2L && var5.field4907 == arg1 && var5.field4895 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)[B", line = 702)
    public final byte[] method1424(int arg0, int arg1) {
        field3133++;
        class39 var3 = this.field3138;
        synchronized (this.field3138) {
            try {
                Object var10000;
                if (this.field3143.method262(-89) < ((long) (arg0 * 6 + 6))) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field3143.method260((long) (arg0 * 6), -30524);
                this.field3143.method272(6, 0, 0, class39.field600);
                int var4 = (class39.field600[0] & 0xFF << 16) + (class39.field600[1] & 0xFF << 8) + (class39.field600[2] & 0xFF);
                int var5 = (class39.field600[5] & 0xFF) + ((class39.field600[4] & 0xFF) << 8) + ((class39.field600[3] & 0xFF) << 16);
                if (var4 < 0 || this.field3136 < var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || this.field3138.method262(-97) / 520L < (long) var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    if (arg1 != 7599) {
                        this.field3136 = 32;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    byte[] var8 = new byte[var4];
                    while (var4 > var7) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field3138.method260((long) (var5 * 520), -30524);
                        int var9 = var4 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field3138.method272(var9 + 8, 0, 0, class39.field600);
                        int var10 = ((class39.field600[2] & 0xFF) << 8) + (class39.field600[3] & 0xFF);
                        int var11 = ((class39.field600[4] & 0xFF) << 16) + ((class39.field600[5] & 0xFF) << 8) + (class39.field600[6] & 0xFF);
                        int var12 = class39.field600[7] & 0xFF;
                        int var13 = (class39.field600[0] & 0xFF << 8) + (class39.field600[1] & 0xFF);
                        if (arg0 != var13 || var6 != var10 || this.field3137 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (this.field3138.method262(-114) / 520L) < ((long) var11)) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var6++;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var8[var7++] = class39.field600[var14 + 8];
                        }
                        var5 = var11;
                    }
                    byte[] var19 = var8;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }
}
