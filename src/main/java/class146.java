import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class146 implements class125 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[Lja;")
    private class455[] field1952 = new class455[9];

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    private int field1968 = 0;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    private int field1977 = -1;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "Lna;")
    private class211 field1966;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    private int field1973;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "Lss;")
    public static class213 field1974 = new class213("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    private int field1957;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    private int field1971;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    private int field1976;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIBIILsj;II)Z")
    public static final boolean method876(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, class284 arg8, int arg9, int arg10) {
        field1969++;
        int var11 = arg0;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg0 - var13;
        int var16 = arg3 - var14;
        if (arg5 != -112) {
            method889(-123, -96, -114, 27, 116, 91);
        }
        class258.field4160[var13][var14] = 99;
        class418.field6347[var13][var14] = 0;
        byte var17 = 0;
        class21.field248[var17] = arg0;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class299.field4713[var10001] = arg3;
        int[][] var19 = arg8.field4485;
        while (var26 != var18) {
            var12 = class299.field4713[var18];
            var11 = class21.field248[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            int var22 = var11 - arg8.field4494;
            int var23 = var12 - arg8.field4480;
            if (arg4 == -4) {
                if (arg1 == var11 && arg9 == var12) {
                    class525.field7746 = var12;
                    class300.field4716 = var11;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class263.method1805(var11, 2, arg6, arg9, (byte) 91, arg1, 2, var12, arg7)) {
                    class525.field7746 = var12;
                    class300.field4716 = var11;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg8.method1911(var12, arg6, arg1, 2, arg9, arg7, var11, 2, arg10, (byte) -79)) {
                    class300.field4716 = var11;
                    class525.field7746 = var12;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg8.method1912(arg6, (byte) 98, var11, var12, arg1, arg7, arg9, arg10, 2)) {
                    class300.field4716 = var11;
                    class525.field7746 = var12;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg8.method1921(2, var12, arg9, arg1, arg2, var11, arg4, arg5 + 2883984)) {
                    class525.field7746 = var12;
                    class300.field4716 = var11;
                    return true;
                }
            } else if (arg8.method1918(var11, arg9, 2, arg1, arg2, arg4, var12, 97)) {
                class525.field7746 = var12;
                class300.field4716 = var11;
                return true;
            }
            int var25 = class418.field6347[var21][var20] + 1;
            if (var21 > 0 && class258.field4160[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class21.field248[var26] = var11 - 1;
                class299.field4713[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class258.field4160[var21 - 1][var20] = 2;
                class418.field6347[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class258.field4160[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class21.field248[var26] = var11 + 1;
                class299.field4713[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class258.field4160[var21 + 1][var20] = 8;
                class418.field6347[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class258.field4160[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class21.field248[var26] = var11;
                class299.field4713[var26] = var12 - 1;
                class258.field4160[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class418.field6347[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class258.field4160[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class21.field248[var26] = var11;
                class299.field4713[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class258.field4160[var21][var20 + 1] = 4;
                class418.field6347[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class258.field4160[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class21.field248[var26] = var11 - 1;
                class299.field4713[var26] = var12 - 1;
                class258.field4160[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class418.field6347[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class258.field4160[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class21.field248[var26] = var11 + 1;
                class299.field4713[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class258.field4160[var21 + 1][var20 - 1] = 9;
                class418.field6347[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class258.field4160[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class21.field248[var26] = var11 - 1;
                class299.field4713[var26] = var12 + 1;
                class258.field4160[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class418.field6347[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class258.field4160[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class21.field248[var26] = var11 + 1;
                class299.field4713[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class258.field4160[var21 + 1][var20 + 1] = 12;
                class418.field6347[var21 + 1][var20 + 1] = var25;
            }
        }
        class525.field7746 = var12;
        class300.field4716 = var11;
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
    public final void method783(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field1973);
        int var2 = -81 / ((arg0 + 29) / 34);
        field1981++;
        this.field1968 |= 0x4;
        this.field1977 = this.method883(0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public final void method778(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (arg0 < 11) {
            this.method890(44, 12);
        }
        field1970++;
        this.field1968 &= 0xFFFFFFFE;
        this.field1977 = this.method883(0);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public final void method779(int arg0) {
        field1955++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field1968 &= 0xFFFFFFFD;
        this.field1977 = this.method883(arg0 + 23670);
        if (arg0 != -23670) {
            this.field1976 = -40;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
    public final void method877(int arg0, int arg1) {
        field1959++;
        if (this.field1977 == -1) {
            throw new RuntimeException();
        }
        if (arg0 != 28154) {
            this.field1977 = 25;
        }
        OpenGL.glDrawBuffer(class24.field270[arg1]);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[J[III)V")
    public static final void method878(int arg0, long[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 > arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg4; var11++) {
                if (arg1[var11] < ((long) (var10 & var11) + var7)) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var9;
            method878(-121, arg1, arg2, arg3, var6 - 1);
            method878(-104, arg1, arg2, var6 + 1, arg4);
        }
        field1964++;
        if (arg0 > -102) {
            method885(-15, null, null);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lsa;IZ)V")
    public final void method879(class532 arg0, int arg1, boolean arg2) {
        field1980++;
        if (arg2) {
            this.method884(11401, 0, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V")
    public final void method880(int arg0, int arg1) {
        if (this.field1952[arg1] != null) {
            this.field1952[arg1].method82(arg0 - 1675886574);
        }
        field1953++;
        if (arg0 == 1675886592) {
            this.field1957 &= ~(0x1 << arg1);
            this.field1952[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBLtr;)V")
    public final void method881(int arg0, byte arg1, class85 arg2) {
        field1951++;
        if (this.field1977 == -1) {
            throw new RuntimeException();
        }
        if (arg1 > -100) {
            this.field1957 = -109;
        }
        int var4 = 0x1 << arg0;
        if ((this.field1957 & ~var4) == 0) {
            this.field1976 = arg2.field1240;
            this.field1971 = arg2.field1237;
        } else if (this.field1971 != arg2.field1237 || this.field1976 != arg2.field1240) {
            throw new RuntimeException();
        }
        arg2.method592((byte) -100, class24.field270[arg0], this.field1977);
        this.field1952[arg0] = arg2;
        this.field1957 |= var4;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
    public final void method782(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field1973);
        field1960++;
        this.field1968 |= 0x2;
        this.field1977 = this.method883(0);
        if (arg0 >= -1) {
            method878(-81, null, null, -123, 97);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)I")
    public final int method882(byte arg0) {
        field1962++;
        if (arg0 != -64) {
            this.method779(72);
        }
        return this.field1976;
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)I")
    private final int method883(int arg0) {
        field1972++;
        if ((this.field1968 & 0x4) != 0) {
            return 36160;
        } else if ((this.field1968 & 0x2) == 0) {
            return (this.field1968 & 0x1) == arg0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILsa;I)V")
    private final void method884(int arg0, int arg1, class532 arg2, int arg3) {
        field1978++;
        if (this.field1977 == -1) {
            throw new RuntimeException();
        } else if (arg0 == 11401) {
            int var5 = 0x1 << arg3;
            if ((this.field1957 & ~var5) == 0) {
                this.field1971 = arg2.field7799;
                this.field1976 = arg2.field7803;
            } else if (this.field1971 != arg2.field7799 || this.field1976 != arg2.field7803) {
                throw new RuntimeException();
            }
            arg2.method3166(class24.field270[arg3], arg1, this.field1977, (byte) 12);
            this.field1952[arg3] = arg2;
            this.field1957 |= var5;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILza;Lmd;)I")
    public static final int method885(int arg0, class497 arg1, class186 arg2) {
        field1975++;
        if (arg0 > -105) {
            field1974 = null;
        }
        if (arg2.field2703 != -1) {
            return arg2.field2703;
        }
        if (arg2.field2708 != -1) {
            class476 var3 = arg1.field7480.method1366(arg1.method1267() ? arg2.field2708 : arg2.field2712, (byte) -5);
            if (!var3.field7269) {
                return var3.field7281;
            }
        }
        return arg2.field2693;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public final void method781(byte arg0) {
        if (arg0 != -70) {
            method889(-62, 112, -125, -34, -20, 124);
        }
        OpenGL.glBindFramebufferEXT(36008, this.field1973);
        field1954++;
        this.field1968 |= 0x1;
        this.field1977 = this.method883(0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBIILea;)V")
    private final void method886(int arg0, byte arg1, int arg2, int arg3, class15 arg4) {
        field1958++;
        if (this.field1977 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg3;
        if ((~var6 & this.field1957) == 0) {
            this.field1971 = arg4.field156;
            this.field1976 = arg4.field156;
        } else if (this.field1971 != arg4.field156 || this.field1976 != arg4.field156) {
            throw new RuntimeException();
        }
        arg4.method85(arg2, arg0, class24.field270[arg3], (byte) -128, this.field1977);
        this.field1952[arg3] = arg4;
        this.field1957 |= var6;
        if (arg1 < 62) {
            this.method890(0, 14);
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V")
    public static void method887(byte arg0) {
        if (arg0 >= -75) {
            field1974 = null;
        }
        field1974 = null;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)Z")
    public final boolean method888(int arg0) {
        field1961++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1977);
        if (var2 == 36053) {
            return arg0 == 18274 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)V")
    public static final void method889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1965++;
        int var6 = class405.method2598(class222.field3750, class462.field7105, arg1, (byte) 80);
        int var7 = class405.method2598(class222.field3750, class462.field7105, arg5, (byte) 103);
        int var8 = class405.method2598(class460.field7096, class178.field2609, arg4, (byte) 89);
        int var9 = class405.method2598(class460.field7096, class178.field2609, arg2, (byte) 91);
        if (arg3 != -1) {
            method885(-30, null, null);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class280.method1888(var8, var9, (byte) 82, class103.field1521[var10], arg0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)V")
    public final void method890(int arg0, int arg1) {
        field1979++;
        if (~this.field1977 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class24.field270[arg1]);
    }

    @OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1967++;
        this.field1966.method1511(this.field1973, (byte) -18);
        super.finalize();
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
    public final void method780(int arg0) {
        field1963++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        if (arg0 == -13668) {
            this.field1968 &= 0xFFFFFFFB;
            this.field1977 = this.method883(0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILea;I)V")
    public final void method891(int arg0, int arg1, class15 arg2, int arg3) {
        if (arg1 == 2) {
            field1956++;
            this.method886(0, (byte) 96, arg3, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lna;)V")
    public class146(class211 arg0) {
        if (!arg0.field3529) {
            throw new IllegalStateException("");
        }
        this.field1966 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class54.field794, 0);
        this.field1973 = class54.field794[0];
    }

    static {
        new class213("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
    }
}
