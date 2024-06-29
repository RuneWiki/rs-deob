import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class141 {

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public int field2152 = 5;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public int field2162 = -1;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public int field2149 = 99;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "Z")
    public boolean field2151 = false;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public int field2167 = 2;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public int field2145 = -1;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Z")
    public boolean field2153 = false;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "Z")
    public boolean field2161 = false;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public int field2170 = -1;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public int field2174 = -1;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
    public int field2175 = -1;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "Z")
    public boolean field2173 = false;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field2144 = 0;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Lwm;")
    public static class152 field2142 = null;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "Lwm;")
    public static class152 field2165 = class157.method1048(" GMT", 93);

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "Lwm;")
    public static class152 field2163 = class157.method1048("Eingabeprozedur geladen)3", 115);

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "Lwm;")
    public static class152 field2178 = class157.method1048("floorshadows", 110);

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public int field2171;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "Lah;")
    public static class205 field2172;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "[I")
    private int[] field2148;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "[I")
    public int[] field2150;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "[I")
    public int[] field2177;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[Z")
    public boolean[] field2143;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "[[I")
    public int[][] field2158;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 8)
    public final void method885(int arg0) {
        if (this.field2145 == -1) {
            if (this.field2143 == null) {
                this.field2145 = 0;
            } else {
                this.field2145 = 2;
            }
        }
        if (~this.field2175 == arg0) {
            if (this.field2143 == null) {
                this.field2175 = 0;
            } else {
                this.field2175 = 2;
            }
        }
        field2168++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 40)
    public static void method886(byte arg0) {
        field2163 = null;
        field2172 = null;
        if (arg0 > -91) {
            field2172 = (class205) null;
        }
        field2178 = null;
        field2165 = null;
        field2142 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BIIII)I", line = 63)
    public static final int method887(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2176++;
        if (arg0 > -119) {
            field2142 = (class152) null;
        }
        int var5 = 65536 - class181.field2886[arg1 * 1024 / arg4] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIBILw;)Lw;", line = 82)
    public final class271 method888(int arg0, int arg1, int arg2, byte arg3, int arg4, class271 arg5) {
        int var7 = -24 % ((arg3 - 19) / 62);
        field2147++;
        int var8 = this.field2150[arg2];
        int var9 = this.field2177[arg2];
        class93 var10 = class137.method867(var9 >> 16, (byte) 53);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            return arg5.method163(true, true, true);
        }
        int var12 = arg4 & 0x3;
        class93 var13 = null;
        if ((this.field2161 || class58.field890) && arg1 != -1 && arg1 < this.field2177.length) {
            int var14 = this.field2177[arg1];
            var13 = class137.method867(var14 >> 16, (byte) 63);
            arg1 = var14 & 0xFFFF;
        }
        class271 var15;
        if (var13 == null) {
            var15 = arg5.method163(!var10.method616(var11, 243), !var10.method614(var11, 0), !this.field2153);
        } else {
            var15 = arg5.method163(!var10.method616(var11, 243) & !var13.method616(arg1, 243), !var10.method614(var11, 0) & !var13.method614(arg1, 0), !this.field2153);
        }
        if (class217.field3516 && this.field2153) {
            if (var12 == 1) {
                ((class319) var15).method2249();
            } else if (var12 == 2) {
                ((class319) var15).method2233();
            } else if (var12 == 3) {
                ((class319) var15).method2229();
            }
        } else if (var12 == 1) {
            var15.method132();
        } else if (var12 == 2) {
            var15.method131();
        } else if (var12 == 3) {
            var15.method161();
        }
        var15.method1863(var10, var11, var13, arg1, arg0 - 1, var8, this.field2153);
        if (class217.field3516 && this.field2153) {
            if (var12 == 1) {
                ((class319) var15).method2229();
            } else if (var12 == 2) {
                ((class319) var15).method2233();
            } else if (var12 == 3) {
                ((class319) var15).method2249();
            }
        } else if (var12 == 1) {
            var15.method161();
        } else if (var12 == 2) {
            var15.method131();
        } else if (var12 == 3) {
            var15.method132();
        }
        return var15;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIILw;I)Lw;", line = 179)
    public final class271 method889(int arg0, int arg1, int arg2, class271 arg3, int arg4) {
        int var6 = this.field2150[arg1];
        field2157++;
        int var7 = this.field2177[arg1];
        class93 var8 = class137.method867(var7 >> 16, (byte) 61);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method140(true, true, true);
        }
        class93 var10 = null;
        if ((this.field2161 || class58.field890) && arg0 != -1 && arg0 < this.field2177.length) {
            int var11 = this.field2177[arg0];
            var10 = class137.method867(var11 >> 16, (byte) 72);
            arg0 = var11 & 0xFFFF;
        }
        class271 var12;
        if (var10 == null) {
            var12 = arg3.method140(!var8.method616(var9, 243), !var8.method614(var9, 0), !this.field2153);
        } else {
            var12 = arg3.method140(!var8.method616(var9, arg4 + 242) & !var10.method616(arg0, 243), !var8.method614(var9, 0) & !var10.method614(arg0, arg4 - 1), !this.field2153);
        }
        var12.method1863(var8, var9, var10, arg0, arg2 - arg4, var6, this.field2153);
        return var12;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BILw;III)Lw;", line = 213)
    public final class271 method890(byte arg0, int arg1, class271 arg2, int arg3, int arg4, int arg5) {
        field2155++;
        int var7 = 66 / ((arg0 + 52) / 57);
        int var8 = this.field2150[arg3];
        int var9 = this.field2177[arg3];
        class93 var10 = class137.method867(var9 >> 16, (byte) 58);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            return arg2.method142(true, true, true);
        }
        int var12 = arg5 & 0x3;
        class93 var13 = null;
        if ((this.field2161 || class58.field890) && arg1 != -1 && this.field2177.length > arg1) {
            int var14 = this.field2177[arg1];
            var13 = class137.method867(var14 >> 16, (byte) 97);
            arg1 = var14 & 0xFFFF;
        }
        class271 var15;
        if (var13 == null) {
            var15 = arg2.method142(!var10.method616(var11, 243), !var10.method614(var11, 0), !this.field2153);
        } else {
            var15 = arg2.method142(!var10.method616(var11, 243) & !var13.method616(arg1, 243), !var10.method614(var11, 0) & !var13.method614(arg1, 0), !this.field2153);
        }
        if (this.field2153 && class217.field3516) {
            if (var12 == 1) {
                ((class319) var15).method2249();
            } else if (var12 == 2) {
                ((class319) var15).method2233();
            } else if (var12 == 3) {
                ((class319) var15).method2229();
            }
        } else if (var12 == 1) {
            var15.method132();
        } else if (var12 == 2) {
            var15.method131();
        } else if (var12 == 3) {
            var15.method161();
        }
        var15.method1863(var10, var11, var13, arg1, arg4 - 1, var8, this.field2153);
        if (this.field2153 && class217.field3516) {
            if (var12 == 1) {
                ((class319) var15).method2229();
            } else if (var12 == 2) {
                ((class319) var15).method2233();
            } else if (var12 == 3) {
                ((class319) var15).method2249();
            }
        } else if (var12 == 1) {
            var15.method161();
        } else if (var12 == 2) {
            var15.method131();
        } else if (var12 == 3) {
            var15.method132();
        }
        return var15;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lhi;B)V", line = 314)
    public final void method891(class291 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2011(-62);
            if (var3 == 0) {
                field2159++;
                if (arg1 <= 6) {
                    field2163 = (class152) null;
                }
                return;
            }
            this.method894((byte) 91, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIILw;I)Lw;", line = 335)
    public final class271 method892(int arg0, int arg1, int arg2, class271 arg3, int arg4) {
        int var6 = this.field2150[arg2];
        int var7 = this.field2177[arg2];
        class93 var8 = class137.method867(var7 >> 16, (byte) 112);
        int var9 = var7 & 0xFFFF;
        field2146++;
        if (var8 == null) {
            return arg3.method142(true, true, true);
        }
        class93 var10 = null;
        class93 var11 = null;
        if ((this.field2161 || class58.field890) && arg1 != -1 && arg1 < this.field2177.length) {
            int var12 = this.field2177[arg1];
            var10 = class137.method867(var12 >> 16, (byte) 75);
            arg1 = var12 & 0xFFFF;
        }
        int var13 = 0;
        int var14 = 0;
        class93 var15 = null;
        if (this.field2148 != null) {
            if (this.field2148.length > arg2) {
                var13 = this.field2148[arg2];
                if (var13 != 65535) {
                    var15 = class137.method867(var13 >> 16, (byte) 91);
                    var13 &= 0xFFFF;
                }
            }
            if ((this.field2161 || class58.field890) && arg1 != -1 && this.field2148.length > arg1) {
                var14 = this.field2148[arg1];
                if (var14 != 65535) {
                    var11 = class137.method867(var14 >> 16, (byte) 44);
                    var14 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method616(var9, 243);
        if (arg4 < 75) {
            this.method891((class291) null, (byte) -37);
        }
        boolean var17 = !var8.method614(var9, 0);
        if (var15 != null) {
            var16 &= !var15.method616(var13, 243);
            var17 &= !var15.method614(var13, 0);
        }
        if (var10 != null) {
            var16 &= !var10.method616(arg1, 243);
            var17 &= !var10.method614(arg1, 0);
        }
        if (var11 != null) {
            var16 &= !var11.method616(var14, 243);
            var17 &= !var11.method614(var14, 0);
        }
        class271 var18 = arg3.method142(var16, var17, !this.field2153);
        var18.method1863(var8, var9, var10, arg1, arg0 - 1, var6, this.field2153);
        if (var15 != null) {
            var18.method1863(var15, var13, var11, var14, arg0 - 1, var6, this.field2153);
        }
        return var18;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)I", line = 432)
    public static final int method893(int arg0, boolean arg1) {
        if (arg1) {
            method893(-16, false);
        }
        field2160++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BILhi;)V", line = 446)
    private final void method894(byte arg0, int arg1, class291 arg2) {
        field2169++;
        if (arg0 < 71) {
            this.field2148 = (int[]) null;
        }
        if (arg1 == 1) {
            int var13 = arg2.method2021((byte) 74);
            this.field2150 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2150[var14] = arg2.method2021((byte) 74);
            }
            this.field2177 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2177[var15] = arg2.method2021((byte) 74);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2177[var16] += arg2.method2021((byte) 74) << 16;
            }
        } else if (arg1 == 2) {
            this.field2162 = arg2.method2021((byte) 74);
        } else if (arg1 == 3) {
            this.field2143 = new boolean[256];
            int var11 = arg2.method2011(-94);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2143[arg2.method2011(-35)] = true;
            }
        } else if (arg1 == 4) {
            this.field2173 = true;
        } else if (arg1 == 5) {
            this.field2152 = arg2.method2011(-69);
        } else if (arg1 == 6) {
            this.field2174 = arg2.method2021((byte) 74);
        } else if (arg1 == 7) {
            this.field2170 = arg2.method2021((byte) 74);
        } else if (arg1 == 8) {
            this.field2149 = arg2.method2011(-28);
        } else if (arg1 == 9) {
            this.field2175 = arg2.method2011(-35);
        } else if (arg1 == 10) {
            this.field2145 = arg2.method2011(-44);
        } else if (arg1 == 11) {
            this.field2167 = arg2.method2011(-92);
        } else if (arg1 == 12) {
            int var8 = arg2.method2011(-111);
            this.field2148 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2148[var9] = arg2.method2021((byte) 74);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2148[var10] = (arg2.method2021((byte) 74) << 16) + this.field2148[var10];
            }
        } else if (arg1 == 13) {
            int var4 = arg2.method2021((byte) 74);
            this.field2158 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2011(-48);
                if (var6 > 0) {
                    this.field2158[var5] = new int[var6];
                    this.field2158[var5][0] = arg2.method2009((byte) 64);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field2158[var5][var7] = arg2.method2021((byte) 74);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2153 = true;
        } else if (arg1 == 15) {
            this.field2161 = true;
        } else if (arg1 == 16) {
            this.field2151 = true;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V", line = 668)
    public static final void method895(byte arg0) {
        class8.field104 = new class183();
        int var1 = 37 / ((arg0 - 65) / 58);
        field2166++;
    }
}
