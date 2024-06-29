import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class57 {

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public int field1200 = -1;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public int field1204 = 5;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public int field1203 = 2;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "Z")
    public boolean field1212 = false;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public int field1209 = -1;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public int field1194 = -1;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "Z")
    public boolean field1211 = false;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public int field1195 = 0;

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "I")
    public int field1217 = -1;

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "I")
    public int field1215 = -1;

    @OriginalMember(owner = "client!jv", name = "y", descriptor = "I")
    public int field1216 = 99;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "Z")
    public boolean field1206 = false;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!jv", name = "A", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "Lgs;")
    public class34 field1201;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "[I")
    private int[] field1192;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "[I")
    public int[] field1202;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "[I")
    public int[] field1210;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "[Z")
    public boolean[] field1197;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "[[I")
    public int[][] field1214;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IC)Z", line = 4)
    public static final boolean method513(int arg0, char arg1) {
        if (arg0 == -96) {
            field1198++;
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 22)
    public final void method514(int arg0) {
        field1199++;
        if (~this.field1200 == arg0) {
            if (this.field1197 == null) {
                this.field1200 = 0;
            } else {
                this.field1200 = 2;
            }
        }
        if (this.field1209 != -1) {
            return;
        }
        if (this.field1197 == null) {
            this.field1209 = 0;
        } else {
            this.field1209 = 2;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lnn;BI)V", line = 54)
    private final void method515(class289 arg0, byte arg1, int arg2) {
        if (arg1 != 19) {
            this.field1215 = -99;
        }
        if (arg2 == 1) {
            int var13 = arg0.method1841((byte) -124);
            this.field1210 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1210[var14] = arg0.method1841((byte) 42);
            }
            this.field1202 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field1202[var15] = arg0.method1841((byte) -123);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field1202[var16] = (arg0.method1841((byte) -128) << 16) + this.field1202[var16];
            }
        } else if (arg2 == 2) {
            this.field1215 = arg0.method1841((byte) 73);
        } else if (arg2 == 3) {
            this.field1197 = new boolean[256];
            int var11 = arg0.method1858(-3256);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1197[arg0.method1858(-3256)] = true;
            }
        } else if (arg2 == 5) {
            this.field1204 = arg0.method1858(-3256);
        } else if (arg2 == 6) {
            this.field1217 = arg0.method1841((byte) 81);
        } else if (arg2 == 7) {
            this.field1194 = arg0.method1841((byte) -122);
        } else if (arg2 == 8) {
            this.field1216 = arg0.method1858(arg1 ^ 0xFFFFF35B);
        } else if (arg2 == 9) {
            this.field1209 = arg0.method1858(-3256);
        } else if (arg2 == 10) {
            this.field1200 = arg0.method1858(arg1 - 3275);
        } else if (arg2 == 11) {
            this.field1203 = arg0.method1858(-3256);
        } else if (arg2 == 12) {
            int var8 = arg0.method1858(-3256);
            this.field1192 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1192[var9] = arg0.method1841((byte) -128);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field1192[var10] += arg0.method1841((byte) 119) << 16;
            }
        } else if (arg2 == 13) {
            int var4 = arg0.method1841((byte) 33);
            this.field1214 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1858(arg1 ^ 0xFFFFF35B);
                if (var6 > 0) {
                    this.field1214[var5] = new int[var6];
                    this.field1214[var5][0] = arg0.method1863(107);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field1214[var5][var7] = arg0.method1841((byte) 23);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field1212 = true;
        } else if (arg2 == 15) {
            this.field1211 = true;
        } else if (arg2 == 16) {
            this.field1206 = true;
        } else if (arg2 == 17) {
            this.field1195 = arg0.method1858(-3256);
        }
        field1196++;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIBIILe;I)Le;", line = 213)
    public final class374 method516(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class374 arg6, int arg7) {
        field1218++;
        int var9 = this.field1210[arg0];
        int var10 = this.field1202[arg0];
        class119 var11 = this.field1201.method240(var10 >> 16, 31706);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method746(arg3, arg7, true);
        }
        class119 var13 = null;
        if ((this.field1211 || class424.field6376) && arg1 != -1 && arg1 < this.field1202.length) {
            int var14 = this.field1202[arg1];
            var13 = this.field1201.method240(var14 >> 16, 31706);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field1212) {
            arg7 |= 0x200;
        }
        if (var11.method958(16, var12)) {
            arg7 |= 0x80;
        }
        if (var11.method963(true, var12)) {
            arg7 |= 0x100;
        }
        if (var11.method961(-5269, var12)) {
            arg7 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method958(arg2 ^ 0xFFFFFFA2, arg1)) {
                arg7 |= 0x80;
            }
            if (var13.method963(true, arg1)) {
                arg7 |= 0x100;
            }
            if (var13.method961(-5269, arg1)) {
                arg7 |= 0x400;
            }
        }
        int var15 = arg7 | arg2;
        class374 var16 = arg6.method746(arg3, var15, true);
        var16.method2296(this.field1212, arg4, var9, arg5 - 1, var11, arg1, var13, 16383, var12);
        return var16;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILe;III)Le;", line = 281)
    public final class374 method517(int arg0, int arg1, class374 arg2, int arg3, int arg4, int arg5) {
        field1193++;
        int var7 = this.field1210[arg4];
        int var8 = this.field1202[arg4];
        class119 var9 = this.field1201.method240(var8 >> 16, 31706);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method746((byte) 1, arg5, true);
        }
        class119 var11 = null;
        if ((this.field1211 || class424.field6376) && arg3 != -1 && arg3 < this.field1202.length) {
            int var12 = this.field1202[arg3];
            var11 = this.field1201.method240(var12 >> 16, 31706);
            arg3 = var12 & 0xFFFF;
        }
        class119 var13 = null;
        class119 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (arg1 != 256) {
            this.field1201 = null;
        }
        if (this.field1192 != null) {
            if (arg4 < this.field1192.length) {
                var15 = this.field1192[arg4];
                if (var15 != 65535) {
                    var13 = this.field1201.method240(var15 >> 16, 31706);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1211 || class424.field6376) && arg3 != -1 && this.field1192.length > arg3) {
                var16 = this.field1192[arg3];
                if (var16 != 65535) {
                    var14 = this.field1201.method240(var16 >> 16, 31706);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1212) {
            arg5 |= 0x200;
        }
        if (var9.method958(arg1 ^ 0xFFFFFE85, var10)) {
            arg5 |= 0x80;
        }
        if (var9.method963(true, var10)) {
            arg5 |= 0x100;
        }
        if (var9.method961(-5269, var10)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method958(-124, var15)) {
                arg5 |= 0x80;
            }
            if (var13.method963(true, var15)) {
                arg5 |= 0x100;
            }
            if (var13.method961(arg1 ^ 0xFFFFEA6B, var15)) {
                arg5 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method958(-123, arg3)) {
                arg5 |= 0x80;
            }
            if (var11.method963(true, arg3)) {
                arg5 |= 0x100;
            }
            if (var11.method961(-5269, arg3)) {
                arg5 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method958(arg1 - 141, var16)) {
                arg5 |= 0x80;
            }
            if (var14.method963(true, var16)) {
                arg5 |= 0x100;
            }
            if (var14.method961(-5269, var16)) {
                arg5 |= 0x400;
            }
        }
        int var17 = arg5 | 0x20;
        class374 var18 = arg2.method746((byte) 1, var17, true);
        var18.method2296(this.field1212, 0, var7, arg0 - 1, var9, arg3, var11, 16383, var10);
        if (var13 != null) {
            var18.method2296(this.field1212, 0, var7, arg0 - 1, var13, var16, var14, 16383, var15);
        }
        return var18;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIZ)I", line = 423)
    public final int method518(int arg0, int arg1, int arg2, boolean arg3) {
        field1213++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field1202[arg0];
        class119 var8 = null;
        class119 var9 = this.field1201.method240(var7 >> 16, 31706);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field1211 || class424.field6376) && arg2 != -1 && this.field1202.length > arg2) {
            int var11 = this.field1202[arg2];
            var8 = this.field1201.method240(var11 >> 16, 31706);
            var6 = var11 & 0xFFFF;
        }
        if (this.field1212) {
            var5 |= 0x200;
        }
        if (var9.method958(126, var10)) {
            var5 |= 0x80;
        }
        int var12 = -16 / ((-arg1 - 39) / 32);
        if (var9.method963(true, var10)) {
            var5 |= 0x100;
        }
        if (var9.method961(-5269, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method958(-126, var6)) {
                var5 |= 0x80;
            }
            if (var8.method963(true, var6)) {
                var5 |= 0x100;
            }
            if (var8.method961(-5269, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field1192 != null && arg3) {
            if (this.field1192.length > arg0) {
                int var13 = this.field1192[arg0];
                if (var13 != 65535) {
                    class119 var14 = this.field1201.method240(var13 >> 16, 31706);
                    int var15 = var13 & 0xFFFF;
                    if (var14 != null) {
                        if (var14.method958(-128, var15)) {
                            var5 |= 0x80;
                        }
                        if (var14.method963(true, var15)) {
                            var5 |= 0x100;
                        }
                        if (var14.method961(-5269, var15)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field1211 || class424.field6376) && arg2 != -1 && this.field1192.length > arg2) {
                int var16 = this.field1192[arg2];
                if (var16 != 65535) {
                    class119 var17 = this.field1201.method240(var16 >> 16, 31706);
                    int var18 = var16 & 0xFFFF;
                    if (var17 != null) {
                        if (var17.method958(-15, var18)) {
                            var5 |= 0x80;
                        }
                        if (var17.method963(true, var18)) {
                            var5 |= 0x100;
                        }
                        if (var17.method961(-5269, var18)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "([BBI)[B", line = 557)
    public static final byte[] method519(byte[] arg0, byte arg1, int arg2) {
        field1208++;
        byte[] var3 = new byte[arg2];
        int var4 = 74 % ((-arg1 - 81) / 42);
        class394.method2448(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILnn;)V", line = 578)
    public final void method520(int arg0, class289 arg1) {
        if (arg0 <= 116) {
            this.method516(-14, -80, -68, (byte) 105, 24, -118, null, -30);
        }
        field1207++;
        while (true) {
            int var3 = arg1.method1858(-3256);
            if (var3 == 0) {
                return;
            }
            this.method515(arg1, (byte) 19, var3);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "()V", line = 602)
    public static final void method521() {
        if (class224.field3513 != null) {
            for (int var0 = 0; var0 < class224.field3513.length; var0++) {
                for (int var1 = 0; var1 < class493.field7231; var1++) {
                    for (int var2 = 0; var2 < class220.field3464; var2++) {
                        if (class224.field3513[var0][var1][var2] != null) {
                            class224.field3513[var0][var1][var2].method1537((byte) -48);
                        }
                        class224.field3513[var0][var1][var2] = null;
                    }
                }
            }
        }
        class224.field3513 = null;
        class531.field7727 = null;
        if (class310.field4698 != null) {
            for (int var3 = 0; var3 < class310.field4698.length; var3++) {
                for (int var4 = 0; var4 < class493.field7231; var4++) {
                    for (int var5 = 0; var5 < class220.field3464; var5++) {
                        if (class310.field4698[var3][var4][var5] != null) {
                            class310.field4698[var3][var4][var5].method1537((byte) 118);
                        }
                        class310.field4698[var3][var4][var5] = null;
                    }
                }
            }
        }
        class310.field4698 = null;
        class293.field4481 = null;
        class518.field7511 = null;
        class520.field7560 = null;
        class296.field4501 = 0;
        if (class161.field2589 != null) {
            for (int var6 = 0; var6 < class296.field4501; var6++) {
                class161.field2589[var6] = null;
            }
        }
        if (class62.field1266 != null) {
            for (int var7 = 0; var7 < class229.field3555; var7++) {
                class62.field1266[var7] = null;
            }
            class229.field3555 = 0;
        }
        if (class248.field3825 != null) {
            for (int var8 = 0; var8 < class429.field6417; var8++) {
                class248.field3825[var8] = null;
            }
            for (int var9 = 0; var9 < class138.field2320; var9++) {
                for (int var10 = 0; var10 < class493.field7231; var10++) {
                    for (int var11 = 0; var11 < class220.field3464; var11++) {
                        class383.field5598[var9][var10][var11] = 0L;
                    }
                }
            }
            class429.field6417 = 0;
        }
        class486.field7165 = null;
        class256.method1649((byte) -12);
        class146.field2446.method538(false);
        class214.field3393 = null;
        class281.field4248 = null;
        class283.field4264 = null;
        class192.field3104 = null;
        class63.field1292 = null;
        class34.field522 = null;
    }
}
