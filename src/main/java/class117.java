import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class117 extends class176 {

    @OriginalMember(owner = "client!rv", name = "Xb", descriptor = "[Ljava/lang/String;")
    private static final String[] field1716 = new String[] { method1167(method1166("r\u001e!m\u000f")), method1167(method1166("{F!\u0007Z")), method1167(method1166("gEc/")), method1167(method1166("{F!\u000fZ")), method1167(method1166("{F!\u000bZ")), method1167(method1166("{F!\tZ")), method1167(method1166("{F!\u0001Z")), method1167(method1166("{F!\u0005Z")), method1167(method1166("{F!\bZ")), method1167(method1166("{F!\u0004Z")), method1167(method1166("{F!\u0006Z")), method1167(method1166("{F!\u0000Z")), method1167(method1166("{F!\nZ")), method1167(method1166("{F!\u0002Z")) };

    @OriginalMember(owner = "client!rv", name = "Nb", descriptor = "[Ljava/lang/String;")
    public static String[] field1710 = new String[100];

    @OriginalMember(owner = "client!rv", name = "Mb", descriptor = "Lpo;")
    public static class585 field1711 = new class585(method1167(method1166("zDj/\u001ehBk\"\u0005g")), method1167(method1166("ZDj/\u001ehB/\u0007\u0013~^")), 1);

    @OriginalMember(owner = "client!rv", name = "Pb", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!rv", name = "Hb", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!rv", name = "Ob", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!rv", name = "Lb", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!rv", name = "Ib", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!rv", name = "Ub", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!rv", name = "Qb", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!rv", name = "Sb", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!rv", name = "Vb", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!rv", name = "Kb", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!rv", name = "Tb", descriptor = "I")
    private int field1713;

    @OriginalMember(owner = "client!rv", name = "Rb", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!rv", name = "Wb", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!rv", name = "Jb", descriptor = "Lwha;")
    private class296 field1708;

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "(II)V")
    public final void method1154(int arg0, int arg1) {
        try {
            super.field2805[super.field2799++] = (byte) (this.field1708.method2554((byte) 125) + arg0);
            if (arg1 == 2) {
                ++field1709;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1716[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILwha;)V")
    public final void method1155(int arg0, class296 arg1) {
        try {
            if (arg0 != -128) {
                this.field1713 = -40;
            }
            ++field1715;
            this.field1708 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1716[1] + arg0 + ',' + (arg1 != null ? field1716[0] : field1716[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "B", descriptor = "(I)V")
    public final void method1156(int arg0) {
        try {
            if (arg0 <= -121) {
                ++field1703;
                this.field1713 = super.field2799 * 8;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1716[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(I)V")
    public class117(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "(I)Z")
    public final boolean method1157(int arg0) {
        try {
            ++field1707;
            int var2 = super.field2805[super.field2799] + -this.field1708.method2552(100) & 255;
            if (~var2 > -129) {
                return false;
            } else {
                return arg0 != 979521160 ? true : true;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1716[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "(I)I")
    public final int method1158(int arg0) {
        try {
            ++field1706;
            if (arg0 > -54) {
                this.field1708 = null;
            }
            int var2 = 255 & super.field2805[super.field2799++] - this.field1708.method2554((byte) 126);
            return var2 < 128 ? var2 : (super.field2805[super.field2799++] - this.field1708.method2554((byte) 126) & 255) + (var2 + -128 << 8);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1716[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "(I)V")
    public static void method1159(int arg0) {
        try {
            field1711 = null;
            if (arg0 != 9230) {
                method1159(58);
            }
            field1710 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1716[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "(I)V")
    public final void method1160(int arg0) {
        try {
            super.field2799 = (this.field1713 + arg0) / 8;
            ++field1702;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1716[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II[BIII[BII)V")
    public static final void method1161(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            ++field1701;
            int var9 = -(arg5 >> 2);
            int var15 = -(arg5 & 3);
            if (arg1 <= 62) {
                method1161(103, 81, (byte[]) null, -89, 58, -71, (byte[]) null, 17, 50);
            }
            for (int var10 = -arg0; ~var10 > -1; ++var10) {
                int var10001;
                for (int var11 = var9; var11 < 0; ++var11) {
                    var10001 = arg4++;
                    arg2[var10001] = (byte) (arg2[var10001] + -arg6[arg7++]);
                    int var16 = arg4++;
                    arg2[var16] = (byte) (arg2[var16] + -arg6[arg7++]);
                    int var17 = arg4++;
                    arg2[var17] = (byte) (arg2[var17] + -arg6[arg7++]);
                    int var18 = arg4++;
                    arg2[var18] = (byte) (arg2[var18] + -arg6[arg7++]);
                }
                for (int var12 = var15; var12 < 0; ++var12) {
                    var10001 = arg4++;
                    arg2[var10001] = (byte) (arg2[var10001] + -arg6[arg7++]);
                }
                arg4 += arg8;
                arg7 += arg3;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field1716[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1716[0] : field1716[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1716[0] : field1716[2]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I[BII)V")
    public final void method1162(int arg0, byte[] arg1, int arg2, int arg3) {
        try {
            int var5 = 103 % ((arg2 - -38) / 52);
            for (int var6 = 0; ~arg3 < ~var6; ++var6) {
                arg1[arg0 + var6] = (byte) (super.field2805[super.field2799++] + -this.field1708.method2554((byte) 127));
            }
            ++field1704;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1716[6] + arg0 + ',' + (arg1 != null ? field1716[0] : field1716[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "(II)I")
    public final int method1163(int arg0, int arg1) {
        try {
            ++field1700;
            int var3 = this.field1713 >> 3;
            int var4 = 8 - (this.field1713 & 7);
            int var5 = 0;
            int var6 = -17 / ((-37 - arg1) / 43);
            this.field1713 += arg0;
            while (~var4 > ~arg0) {
                var5 += (super.field2805[var3++] & class90.field1336[var4]) << -var4 + arg0;
                arg0 -= var4;
                var4 = 8;
            }
            int var7;
            if (arg0 == var4) {
                var7 = (super.field2805[var3] & class90.field1336[var4]) + var5;
            } else {
                var7 = (super.field2805[var3] >> -arg0 + var4 & class90.field1336[arg0]) + var5;
            }
            return var7;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1716[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "(II)I")
    public final int method1164(int arg0, int arg1) {
        try {
            if (arg0 != 8) {
                this.method1154(41, 55);
            }
            ++field1712;
            return arg1 * 8 + -this.field1713;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1716[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "([IB)V")
    public final void method1165(int[] arg0, byte arg1) {
        try {
            if (arg1 > -108) {
                field1710 = null;
            }
            ++field1714;
            this.field1708 = new class296(arg0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1716[13] + (arg0 != null ? field1716[0] : field1716[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1166(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 114);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1167(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 15;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 114;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
