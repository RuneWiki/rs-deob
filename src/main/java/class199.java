import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class199 {

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
    private int field2348 = 65000;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "Loca;")
    private class263 field2360 = null;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "Loca;")
    private class263 field2358 = null;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
    private int field2361;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "J")
    public static long field2354 = -1L;

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "[[I")
    public static int[][] field2356 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "Loh;")
    public static class404 field2350;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "Lda;")
    public static class59 field2352;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lbda;I)V", line = 4)
    public static final void method1199(class504 arg0, int arg1) {
        field2355++;
        if (arg0.field7147 != -1) {
            class25 var2 = class637.field9158.method1905(104, arg0.field7147);
            if (var2 == null || var2.field256 == null) {
                arg0.field7122 = false;
                arg0.field7147 = -1;
            } else {
                label365: {
                    arg0.field7101++;
                    if (var2.field256.length > arg0.field7150 && var2.field253[arg0.field7150] < arg0.field7101) {
                        arg0.field7175++;
                        arg0.field7101 = 1;
                        arg0.field7150++;
                        if (!arg0.field7108) {
                            class629.method3607(arg0, var2, -116, arg0.field7150);
                        }
                    }
                    if (var2.field256.length <= arg0.field7150) {
                        arg0.field7101 = 0;
                        arg0.field7150 = 0;
                        if (arg0.field7122) {
                            arg0.field7147 = arg0.method2992(-1).method1522((byte) 117);
                            if (arg0.field7147 == -1) {
                                arg0.field7122 = false;
                                break label365;
                            }
                            var2 = class637.field9158.method1905(50, arg0.field7147);
                        }
                        if (!arg0.field7108) {
                            class629.method3607(arg0, var2, -120, arg0.field7150);
                        }
                    }
                    arg0.field7175 = arg0.field7150 + 1;
                    if (var2.field256 == null) {
                        arg0.field7122 = false;
                        arg0.field7147 = -1;
                    } else if (var2.field256.length <= arg0.field7175) {
                        arg0.field7175 = 0;
                    }
                }
            }
        }
        if (arg0.field7084 != -1 && arg0.field7139 <= class392.field5398) {
            class342 var3 = class173.field2036.method1221(15719, arg0.field7084);
            int var4 = var3.field4431;
            if (var4 == -1) {
                arg0.field7084 = -1;
            } else {
                label366: {
                    class25 var5 = class637.field9158.method1905(53, var4);
                    if (var3.field4418) {
                        if (var5.field270 == 3) {
                            if (arg0.field7188 > 0 && class392.field5398 >= arg0.field7141 && class392.field5398 > arg0.field7167) {
                                arg0.field7084 = -1;
                                break label366;
                            }
                        } else if (var5.field270 == 1 && arg0.field7188 > 0 && class392.field5398 >= arg0.field7141 && class392.field5398 > arg0.field7167) {
                            arg0.field7139 = class392.field5398 + 1;
                            break label366;
                        }
                    }
                    if (var5 == null || var5.field256 == null) {
                        arg0.field7084 = -1;
                    } else {
                        if (arg0.field7082 < 0) {
                            arg0.field7082 = 0;
                            if (!arg0.field7108) {
                                class629.method3607(arg0, var5, -125, 0);
                            }
                        }
                        arg0.field7164++;
                        if (var5.field256.length > arg0.field7082 && var5.field253[arg0.field7082] < arg0.field7164) {
                            arg0.field7082++;
                            arg0.field7164 = 1;
                            if (!arg0.field7108) {
                                class629.method3607(arg0, var5, -114, arg0.field7082);
                            }
                        }
                        if (arg0.field7082 >= var5.field256.length) {
                            if (var3.field4418) {
                                arg0.field7082 -= var5.field263;
                                arg0.field7140++;
                                if (arg0.field7140 >= var5.field262) {
                                    arg0.field7084 = -1;
                                } else if (arg0.field7082 < 0 || var5.field256.length <= arg0.field7082) {
                                    arg0.field7084 = -1;
                                } else if (!arg0.field7108) {
                                    class629.method3607(arg0, var5, -118, arg0.field7082);
                                }
                            } else {
                                arg0.field7084 = -1;
                            }
                        }
                        arg0.field7138 = arg0.field7082 + 1;
                        if (arg0.field7138 >= var5.field256.length) {
                            if (var3.field4418) {
                                arg0.field7138 -= var5.field263;
                                if (var5.field262 <= arg0.field7140 + 1) {
                                    arg0.field7138 = -1;
                                } else if (arg0.field7138 < 0 || var5.field256.length <= arg0.field7138) {
                                    arg0.field7138 = -1;
                                }
                            } else {
                                arg0.field7138 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field7106 != -1 && class392.field5398 >= arg0.field7151) {
            class342 var6 = class173.field2036.method1221(15719, arg0.field7106);
            int var7 = var6.field4431;
            if (var7 == -1) {
                arg0.field7106 = -1;
            } else {
                label369: {
                    class25 var8 = class637.field9158.method1905(98, var7);
                    if (var6.field4418) {
                        if (var8.field270 == 3) {
                            if (arg0.field7188 > 0 && arg0.field7141 <= class392.field5398 && class392.field5398 > arg0.field7167) {
                                arg0.field7106 = -1;
                                break label369;
                            }
                        } else if (var8.field270 == 1 && arg0.field7188 > 0 && class392.field5398 >= arg0.field7141 && arg0.field7167 < class392.field5398) {
                            arg0.field7151 = class392.field5398 + 1;
                            break label369;
                        }
                    }
                    if (var8 == null || var8.field256 == null) {
                        arg0.field7106 = -1;
                    } else {
                        if (arg0.field7133 < 0) {
                            arg0.field7133 = 0;
                            if (!arg0.field7108) {
                                class629.method3607(arg0, var8, -123, 0);
                            }
                        }
                        arg0.field7178++;
                        if (var8.field256.length > arg0.field7133 && arg0.field7178 > var8.field253[arg0.field7133]) {
                            arg0.field7133++;
                            arg0.field7178 = 1;
                            if (!arg0.field7108) {
                                class629.method3607(arg0, var8, -126, arg0.field7133);
                            }
                        }
                        if (var8.field256.length <= arg0.field7133) {
                            if (var6.field4418) {
                                arg0.field7133 -= var8.field263;
                                arg0.field7130++;
                                if (var8.field262 <= arg0.field7130) {
                                    arg0.field7106 = -1;
                                } else if (arg0.field7133 < 0 || arg0.field7133 >= var8.field256.length) {
                                    arg0.field7106 = -1;
                                } else if (!arg0.field7108) {
                                    class629.method3607(arg0, var8, -128, arg0.field7133);
                                }
                            } else {
                                arg0.field7106 = -1;
                            }
                        }
                        arg0.field7158 = arg0.field7133 + 1;
                        if (var8.field256.length <= arg0.field7158) {
                            if (var6.field4418) {
                                arg0.field7158 -= var8.field263;
                                if (var8.field262 <= (arg0.field7130 + 1)) {
                                    arg0.field7158 = -1;
                                } else if (arg0.field7158 < 0 || var8.field256.length <= arg0.field7158) {
                                    arg0.field7158 = -1;
                                }
                            } else {
                                arg0.field7158 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field7145 != -1 && arg0.field7132 <= 1) {
            class25 var9 = class637.field9158.method1905(62, arg0.field7145);
            if (var9.field270 == 3) {
                if (arg0.field7188 > 0 && class392.field5398 >= arg0.field7141 && class392.field5398 > arg0.field7167) {
                    arg0.field7145 = -1;
                    arg0.field7152 = null;
                }
            } else if (var9.field270 == 1 && arg0.field7188 > 0 && arg0.field7141 <= class392.field5398 && class392.field5398 > arg0.field7167) {
                arg0.field7132 = 2;
            }
        }
        if (arg0.field7145 != -1 && arg0.field7132 == 0) {
            class25 var10 = class637.field9158.method1905(79, arg0.field7145);
            if (var10 == null || var10.field256 == null) {
                arg0.field7152 = null;
                arg0.field7145 = -1;
            } else {
                arg0.field7115++;
                if (arg0.field7089 < var10.field256.length && arg0.field7115 > var10.field253[arg0.field7089]) {
                    arg0.field7089++;
                    arg0.field7115 = 1;
                    if (!arg0.field7108) {
                        class629.method3607(arg0, var10, -118, arg0.field7089);
                    }
                }
                if (var10.field256.length <= arg0.field7089) {
                    arg0.field7161++;
                    arg0.field7089 -= var10.field263;
                    if (arg0.field7161 >= var10.field262) {
                        arg0.field7152 = null;
                        arg0.field7145 = -1;
                    } else if (arg0.field7089 < 0 || var10.field256.length <= arg0.field7089) {
                        arg0.field7145 = -1;
                        arg0.field7152 = null;
                    } else if (!arg0.field7108) {
                        class629.method3607(arg0, var10, -119, arg0.field7089);
                    }
                }
                arg0.field7074 = arg0.field7089 + 1;
                if (arg0.field7074 >= var10.field256.length) {
                    arg0.field7074 -= var10.field263;
                    if (var10.field262 <= arg0.field7161 + 1) {
                        arg0.field7074 = -1;
                    } else if (arg0.field7074 < 0 || arg0.field7074 >= var10.field256.length) {
                        arg0.field7074 = -1;
                    }
                }
            }
        }
        if (arg0.field7132 > 0) {
            arg0.field7132--;
        }
        if (arg1 <= 62) {
            method1204(-101, -49, -71, -64, -69, 66);
        }
        for (int var11 = 0; var11 < arg0.field7105.length; var11++) {
            class154 var12 = arg0.field7105[var11];
            if (var12 != null) {
                if (var12.field1700 > 0) {
                    var12.field1700--;
                } else {
                    class25 var13 = class637.field9158.method1905(89, var12.field1690);
                    if (var13 == null || var13.field256 == null) {
                        arg0.field7105[var11] = null;
                    } else {
                        var12.field1699++;
                        if (var12.field1694 < var13.field256.length && var13.field253[var12.field1694] < var12.field1699) {
                            var12.field1699 = 1;
                            var12.field1694++;
                            if (!arg0.field7108) {
                                class629.method3607(arg0, var13, -114, var12.field1694);
                            }
                        }
                        if (var12.field1694 >= var13.field256.length) {
                            var12.field1694 -= var13.field263;
                            var12.field1698++;
                            if (var12.field1698 >= var13.field262) {
                                arg0.field7105[var11] = null;
                            } else if (var12.field1694 < 0 || var12.field1694 >= var13.field256.length) {
                                arg0.field7105[var11] = null;
                            } else if (!arg0.field7108) {
                                class629.method3607(arg0, var13, -124, var12.field1694);
                            }
                        }
                        var12.field1697 = var12.field1694 + 1;
                        if (var12.field1697 >= var13.field256.length) {
                            var12.field1697 -= var13.field263;
                            if ((var12.field1698 + 1) >= var13.field262) {
                                var12.field1697 = -1;
                            } else if (var12.field1697 < 0 || var12.field1697 >= var13.field256.length) {
                                var12.field1697 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "toString", descriptor = "()Ljava/lang/String;", line = 474)
    public final String toString() {
        field2351++;
        return "Cache:" + this.field2361;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V", line = 483)
    public static void method1200(byte arg0) {
        field2352 = null;
        field2356 = null;
        if (arg0 != 107) {
            method1204(-98, -48, 63, -107, 58, -49);
        }
        field2350 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)Lvp;", line = 502)
    public static final class188 method1201(int arg0, int arg1, int arg2) {
        class691 var3 = class638.field9170[arg0][arg1][arg2];
        return var3 == null || var3.field9736 == null ? null : var3.field9736;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)[B", line = 511)
    public final byte[] method1202(int arg0, int arg1) {
        field2349++;
        class263 var3 = this.field2360;
        synchronized (this.field2360) {
            try {
                if (this.field2358.method1587(arg1 - 129) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field2358.method1583((long) (arg0 * 6), arg1 + 253);
                this.field2358.method1590(0, class102.field1062, 6, -1109);
                int var5 = ((class102.field1062[0] & 0xFF) << 16) + (class102.field1062[arg1] & 0xFF) + ((class102.field1062[1] & 0xFF) << 8);
                int var6 = (class102.field1062[3] & 0xFF << 16) + ((class102.field1062[4] & 0xFF) << 8) + (class102.field1062[5] & 0xFF);
                if (var5 < 0 || var5 > this.field2348) {
                    return null;
                } else if (var6 > 0 && this.field2360.method1587(-126) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2360.method1583((long) (var6 * 520), 255);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2360.method1590(0, class102.field1062, var13 + 8, -1109);
                        int var14 = ((class102.field1062[0] & 0xFF) << 8) + (class102.field1062[1] & 0xFF);
                        int var15 = (class102.field1062[2] & 0xFF << 8) + (class102.field1062[3] & 0xFF);
                        int var16 = (class102.field1062[5] & 0xFF << 8) + (((class102.field1062[4] & 0xFF) << 16) + (class102.field1062[6] & 0xFF));
                        int var17 = class102.field1062[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field2361 == var17) {
                            if (var16 >= 0 && this.field2360.method1587(-127) / 520L >= (long) var16) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class102.field1062[var20 + 8];
                                }
                                var6 = var16;
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(ILoca;Loca;I)V", line = 815)
    public class199(int arg0, class263 arg1, class263 arg2, int arg3) {
        this.field2361 = arg0;
        this.field2360 = arg1;
        this.field2358 = arg2;
        this.field2348 = arg3;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II[BI)Z", line = 594)
    public final boolean method1203(int arg0, int arg1, byte[] arg2, int arg3) {
        field2357++;
        class263 var5 = this.field2360;
        synchronized (this.field2360) {
            if (arg3 < 0 || this.field2348 < arg3) {
                throw new IllegalArgumentException();
            } else if (arg1 == 1) {
                boolean var7 = this.method1205(true, arg2, 81, arg3, arg0);
                if (!var7) {
                    var7 = this.method1205(false, arg2, arg1 + 125, arg3, arg0);
                }
                return var7;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIII)I", line = 622)
    public static final int method1204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2359++;
        if (class504.field7120 == null) {
            return 0;
        }
        int var6 = 119 % ((arg5 - 79) / 46);
        if (arg3 < 3) {
            int var7 = arg4 >> 9;
            int var8 = arg1 >> 9;
            if (arg0 < 0 || arg2 < 0 || arg0 > class489.field6976 - 1 || (class153.field1677 - 1) < arg2) {
                return 0;
            }
            if (var7 < 1 || var8 < 1 || var7 > (class489.field6976 - 1) || var8 > class153.field1677 - 1) {
                return 0;
            }
            boolean var9 = (class100.field1043[1][arg4 >> 9][arg1 >> 9] & 0x2) != 0;
            if ((arg4 & 0x1FF) == 0) {
                boolean var10 = (class100.field1043[1][var7 - 1][arg1 >> 9] & 0x2) != 0;
                boolean var11 = (class100.field1043[1][var7][arg1 >> 9] & 0x2) != 0;
                if (var10 != var11) {
                    var9 = (class100.field1043[1][arg0][arg2] & 0x2) != 0;
                }
            }
            if ((arg1 & 0x1FF) == 0) {
                boolean var12 = (class100.field1043[1][arg4 >> 9][var8 - 1] & 0x2) != 0;
                boolean var13 = (class100.field1043[1][arg4 >> 9][var8] & 0x2) != 0;
                if (var12 != var13) {
                    var9 = (class100.field1043[1][arg0][arg2] & 0x2) != 0;
                }
            }
            if (var9) {
                arg3++;
            }
        }
        return class504.field7120[arg3].method1675(arg1, arg4, 65286);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z[BIII)Z", line = 680)
    private final boolean method1205(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field2353++;
        class263 var6 = this.field2360;
        synchronized (this.field2360) {
            try {
                int var8;
                if (arg0) {
                    if (this.field2358.method1587(-127) < (long) (arg4 * 6 + 6)) {
                        return false;
                    }
                    this.field2358.method1583((long) (arg4 * 6), 255);
                    this.field2358.method1590(0, class102.field1062, 6, -1109);
                    var8 = ((class102.field1062[3] & 0xFF) << 16) + (class102.field1062[4] & 0xFF << 8) + (class102.field1062[5] & 0xFF);
                    if (var8 <= 0 || (this.field2360.method1587(-127) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2360.method1587(-128) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class102.field1062[3] = (byte) (var8 >> 16);
                class102.field1062[1] = (byte) (arg3 >> 8);
                class102.field1062[0] = (byte) (arg3 >> 16);
                class102.field1062[4] = (byte) (var8 >> 8);
                class102.field1062[5] = (byte) var8;
                class102.field1062[2] = (byte) arg3;
                this.field2358.method1583((long) (arg4 * 6), 255);
                this.field2358.method1592(0, 6, class102.field1062, -10);
                int var10 = 87 % ((arg2 + 39) / 41);
                int var11 = 0;
                int var12 = 0;
                while (arg3 > var11) {
                    int var13 = 0;
                    if (arg0) {
                        label104: {
                            this.field2360.method1583((long) (var8 * 520), 255);
                            try {
                                this.field2360.method1590(0, class102.field1062, 8, -1109);
                            } catch (EOFException var34) {
                                return true;
                            }
                            int var14 = ((class102.field1062[0] & 0xFF) << 8) + (class102.field1062[1] & 0xFF);
                            int var15 = (class102.field1062[2] & 0xFF << 8) + (class102.field1062[3] & 0xFF);
                            var13 = ((class102.field1062[4] & 0xFF) << 16) + (((class102.field1062[5] & 0xFF) << 8) + (class102.field1062[6] & 0xFF));
                            int var16 = class102.field1062[7] & 0xFF;
                            if (arg4 == var14 && var12 == var15 && this.field2361 == var16) {
                                if (var13 >= 0 && this.field2360.method1587(-126) / 520L >= (long) var13) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg0 = false;
                        var13 = (int) ((this.field2360.method1587(-126) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    if (arg3 - var11 <= 512) {
                        var13 = 0;
                    }
                    class102.field1062[0] = (byte) (arg4 >> 8);
                    class102.field1062[1] = (byte) arg4;
                    class102.field1062[3] = (byte) var12;
                    class102.field1062[2] = (byte) (var12 >> 8);
                    class102.field1062[6] = (byte) var13;
                    class102.field1062[4] = (byte) (var13 >> 16);
                    class102.field1062[5] = (byte) (var13 >> 8);
                    class102.field1062[7] = (byte) this.field2361;
                    this.field2360.method1583((long) (var8 * 520), 255);
                    this.field2360.method1592(0, 8, class102.field1062, -7);
                    int var19 = arg3 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field2360.method1592(var11, var19, arg1, -76);
                    var12++;
                    var11 += var19;
                    var8 = var13;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }
}
