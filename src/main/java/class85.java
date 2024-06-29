import java.awt.Point;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class85 {

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public int field1204 = -1;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public int field1205 = 0;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public int field1201 = -1;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public int field1200 = -1;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public int field1192 = -1;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public int field1213 = 0;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public int field1193 = -1;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public int field1214 = -1;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public int field1199 = -1;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public int field1197 = 0;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public int field1217 = -1;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public int field1221 = -1;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    public int field1222 = -1;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public int field1226 = -1;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public int field1211 = 0;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public int field1202 = -1;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public int field1225 = 0;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public int field1219 = -1;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public int field1223 = -1;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public int field1220 = -1;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public int field1208 = 0;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public int field1203 = -1;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public int field1228 = 0;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public int field1195 = 0;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public int field1218 = -1;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public int field1229 = -1;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public int field1234 = -1;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public int field1196 = 0;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public int field1209 = 0;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    public int field1232 = -1;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    public int field1231 = -1;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public int field1227 = -1;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public int field1230 = -1;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "D")
    public static double field1194 = -1.0D;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "[C")
    public static char[] field1212 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "[I")
    public static int[] field1233;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "[[I")
    public int[][] field1198;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBLbj;)V")
    private final void method550(int arg0, byte arg1, class215 arg2) {
        if (arg1 >= -40) {
            method553(102, 56, (class309) null, -20, 105, -61);
        }
        field1210++;
        if (arg0 == 1) {
            this.field1201 = arg2.method1379(-108);
            this.field1234 = arg2.method1379(-108);
            if (this.field1234 == 65535) {
                this.field1234 = -1;
            }
            if (this.field1201 == 65535) {
                this.field1201 = -1;
            }
        } else if (arg0 == 2) {
            this.field1192 = arg2.method1379(-75);
        } else if (arg0 == 3) {
            this.field1229 = arg2.method1379(-102);
        } else if (arg0 == 4) {
            this.field1231 = arg2.method1379(-81);
        } else if (arg0 == 5) {
            this.field1217 = arg2.method1379(-74);
        } else if (arg0 == 6) {
            this.field1199 = arg2.method1379(-105);
        } else if (arg0 == 7) {
            this.field1223 = arg2.method1379(-122);
        } else if (arg0 == 8) {
            this.field1214 = arg2.method1379(-73);
        } else if (arg0 == 9) {
            this.field1220 = arg2.method1379(-97);
        } else if (arg0 == 26) {
            this.field1211 = (short) (arg2.method1374((byte) -60) * 4);
            this.field1197 = (short) (arg2.method1374((byte) -60) * 4);
        } else if (arg0 == 27) {
            if (this.field1198 == null) {
                this.field1198 = new int[12][];
            }
            int var4 = arg2.method1374((byte) -60);
            this.field1198[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field1198[var4][var5] = arg2.method1356(false);
            }
        } else if (arg0 == 29) {
            this.field1228 = arg2.method1374((byte) -60);
        } else if (arg0 == 30) {
            this.field1195 = arg2.method1379(-112);
        } else if (arg0 == 31) {
            this.field1225 = arg2.method1374((byte) -60);
        } else if (arg0 == 32) {
            this.field1213 = arg2.method1379(-101);
        } else if (arg0 == 33) {
            this.field1196 = arg2.method1356(false);
        } else if (arg0 == 34) {
            this.field1209 = arg2.method1374((byte) -60);
        } else if (arg0 == 35) {
            this.field1205 = arg2.method1379(-112);
        } else if (arg0 == 36) {
            this.field1208 = arg2.method1356(false);
        } else if (arg0 == 37) {
            this.field1200 = arg2.method1374((byte) -60);
        } else if (arg0 == 38) {
            this.field1230 = arg2.method1379(-77);
        } else if (arg0 == 39) {
            this.field1222 = arg2.method1379(-105);
        } else if (arg0 == 40) {
            this.field1203 = arg2.method1379(-105);
        } else if (arg0 == 41) {
            this.field1219 = arg2.method1379(-77);
        } else if (arg0 == 42) {
            this.field1202 = arg2.method1379(-100);
        } else if (arg0 == 43) {
            arg2.method1379(-127);
        } else if (arg0 == 44) {
            arg2.method1379(-90);
        } else if (arg0 == 45) {
            this.field1226 = arg2.method1379(-112);
        } else if (arg0 == 46) {
            this.field1221 = arg2.method1379(-114);
        } else if (arg0 == 47) {
            this.field1227 = arg2.method1379(-89);
        } else if (arg0 == 48) {
            this.field1204 = arg2.method1379(-121);
        } else if (arg0 == 49) {
            this.field1193 = arg2.method1379(-83);
        } else if (arg0 == 50) {
            this.field1232 = arg2.method1379(-95);
            return;
        } else if (arg0 == 51) {
            this.field1218 = arg2.method1379(-87);
            return;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method551(int arg0) {
        if (arg0 <= 117) {
            field1207 = -22;
        }
        field1233 = null;
        field1212 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
    public final void method552(boolean arg0) {
        if (arg0) {
            field1216++;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILnd;III)V")
    public static final void method553(int arg0, int arg1, class309 arg2, int arg3, int arg4, int arg5) {
        field1206++;
        if (arg2.field4960 == -1 && arg2.field4973 == null) {
            return;
        }
        int var6 = class209.field3110 * arg2.field4974 >> 8;
        int var7 = -89 % ((arg0 + 83) / 35);
        int var8 = 0;
        if (arg2.field4969 < arg3) {
            var8 += arg3 - arg2.field4969;
        } else if (arg3 < arg2.field4980) {
            var8 += arg2.field4980 - arg3;
        }
        if (arg2.field4959 < arg1) {
            var8 += arg1 - arg2.field4959;
        } else if (arg1 < arg2.field4971) {
            var8 += arg2.field4971 - arg1;
        }
        if (arg2.field4976 == 0 || (var8 - 64) > arg2.field4976 || class209.field3110 == 0 || arg2.field4968 != arg5) {
            if (arg2.field4979 != null) {
                class116.field1671.method910(arg2.field4979);
                arg2.field4979 = null;
            }
            if (arg2.field4978 != null) {
                class116.field1671.method910(arg2.field4978);
                arg2.field4978 = null;
            }
            return;
        }
        var8 -= 64;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = (arg2.field4976 - var8) * var6 / arg2.field4976;
        if (arg2.field4979 != null) {
            arg2.field4979.method1909(var9);
        } else if (arg2.field4960 >= 0) {
            class28 var10 = class28.method183(class68.field958, arg2.field4960, 0);
            if (var10 != null) {
                class173 var11 = var10.method185().method1098(class42.field633);
                class287 var12 = class287.method1896(var11, 100, var9);
                var12.method1914(-1);
                class116.field1671.method916(var12);
                arg2.field4979 = var12;
            }
        }
        if (arg2.field4978 != null) {
            arg2.field4978.method1909(var9);
            if (!arg2.field4978.method961(-119)) {
                arg2.field4978 = null;
                return;
            }
            return;
        }
        if (arg2.field4973 == null || (arg2.field4964 -= arg4) > 0) {
            return;
        }
        int var13 = (int) ((double) arg2.field4973.length * Math.random());
        class28 var14 = class28.method183(class68.field958, arg2.field4973[var13], 0);
        if (var14 == null) {
            return;
        }
        class173 var15 = var14.method185().method1098(class42.field633);
        class287 var16 = class287.method1896(var15, 100, var9);
        var16.method1914(0);
        class116.field1671.method916(var16);
        arg2.field4978 = var16;
        arg2.field4964 = (int) ((double) (arg2.field4981 - arg2.field4972) * Math.random()) + arg2.field4972;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)I")
    public static final int method554(int arg0, boolean arg1) {
        if (arg1) {
            return -22;
        } else {
            field1191++;
            return arg0 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)I")
    public static final int method555(int arg0) {
        field1235++;
        try {
            if (class223.field3480 == 0) {
                if (class299.method2006(9594) - 5000L < class26.field416) {
                    return 0;
                }
                class35.field536 = class45.field667.method318(class268.field4299, 0, class215.field3259);
                class4.field36 = class299.method2006(9594);
                class223.field3480 = 1;
            }
            if (class299.method2006(9594) > (class4.field36 + 30000L)) {
                return class176.method1105(1310, 1000);
            }
            if (class223.field3480 == 1) {
                if (class35.field536.field4570 == 2) {
                    return class176.method1105(1310, 1001);
                }
                if (class35.field536.field4570 != 1) {
                    return -1;
                }
                class272.field4332 = new class191((Socket) class35.field536.field4567, class45.field667);
                class35.field536 = null;
                int var1 = 0;
                if (class231.field3612) {
                    var1 = class226.field3535;
                }
                class231.field3614.field3280 = 0;
                class231.field3614.method1363(23, 94);
                class231.field3614.method1398(true, var1);
                class272.field4332.method1202((byte) -119, 0, class231.field3614.field3280, class231.field3614.field3287);
                if (class156.field2158 != null) {
                    class156.field2158.method886(500000);
                }
                if (class110.field1585 != null) {
                    class110.field1585.method886(500000);
                }
                int var2 = class272.field4332.method1206(-16);
                if (class156.field2158 != null) {
                    class156.field2158.method886(500000);
                }
                if (class110.field1585 != null) {
                    class110.field1585.method886(500000);
                }
                if (var2 != 0) {
                    return class176.method1105(1310, var2);
                }
                class223.field3480 = 2;
            }
            if (class223.field3480 == 2) {
                if (class272.field4332.method1213((byte) -114) < 2) {
                    return -1;
                }
                class276.field4393 = class272.field4332.method1206(127);
                class276.field4393 <<= 0x8;
                class276.field4393 += class272.field4332.method1206(-102);
                class197.field3018 = 0;
                class81.field1115 = new byte[class276.field4393];
                class223.field3480 = 3;
            }
            if (class223.field3480 == 3) {
                int var3 = class272.field4332.method1213((byte) -112);
                if (var3 < 1) {
                    return -1;
                }
                if (var3 > (class276.field4393 - class197.field3018)) {
                    var3 = class276.field4393 - class197.field3018;
                }
                class272.field4332.method1212(0, class197.field3018, class81.field1115, var3);
                class197.field3018 += var3;
                if (class276.field4393 > class197.field3018) {
                    return -1;
                }
                if (!class167.method1071(class81.field1115, (byte) 121)) {
                    return class176.method1105(1310, 1002);
                }
                class306.field4924 = new class248[class92.field1354];
                int var4 = 0;
                for (int var5 = class268.field4298; var5 <= class185.field2802; var5++) {
                    class248 var6 = class202.method1261(20006, var5);
                    if (var6 != null) {
                        class306.field4924[var4++] = var6;
                    }
                }
                class272.field4332.method1211((byte) 112);
                class245.field3839 = 0;
                class223.field3480 = 0;
                class81.field1115 = null;
                class272.field4332 = null;
                class26.field416 = class299.method2006(9594);
                return 0;
            }
        } catch (IOException var8) {
            return class176.method1105(1310, 1003);
        }
        int var7 = -75 % ((6 - arg0) / 37);
        return -1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
    public static final void method556(int arg0, int arg1) {
        if (arg0 != 2) {
            field1207 = 103;
        }
        if (!class175.field2470) {
            arg1 = -1;
        }
        field1215++;
        if (class314.field5044 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class7 var2 = class181.method1159(arg0 ^ 0x70, arg1);
            class203 var3 = var2.method41(2);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class45.field667.method334((byte) -127, var3.field1534, var3.field1538, new Point(var2.field82, var2.field72), class291.field4645, var3.method1264());
                class314.field5044 = arg1;
            }
        }
        if (arg1 == -1 && class314.field5044 != -1) {
            class45.field667.method334((byte) -90, -1, -1, new Point(), class291.field4645, (int[]) null);
            class314.field5044 = -1;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lbj;Z)V")
    public final void method557(class215 arg0, boolean arg1) {
        field1224++;
        while (true) {
            int var3 = arg0.method1374((byte) -60);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    this.field1225 = -47;
                    return;
                }
            }
            this.method550(var3, (byte) -54, arg0);
        }
    }
}
