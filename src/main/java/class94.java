import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class94 extends class12 {

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Lad;")
    public static class5 field2213 = class88.method674("@whi@ )4 ", -125);

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "[Ltb;")
    public static class116[] field2223 = new class116[256];

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field2227 = -1;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "Lad;")
    public static class5 field2233 = class88.method674("Wen m-Ochten Sie entfernen?", 15);

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "Lad;")
    public static class5 field2214 = class88.method674("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -118);

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field2231 = 0;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "[I")
    public static int[] field2218 = new int[2000];

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public int field2225;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    public int field2235;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "I")
    public int field2239;

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "Luc;")
    public static class123 field2230;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "Lde;")
    public class24 field2215;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "Lde;")
    public class24 field2224;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "Lld;")
    public class70 field2238;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Z")
    public static boolean field2219;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "[I")
    public int[] field2217;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBLrc;)I", line = 8)
    public static final int method718(int arg0, byte arg1, class105 arg2) {
        field2236++;
        if (arg2.field2566 == null || arg0 >= arg2.field2566.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field2566[arg0];
            int var4 = 0;
            int var5 = 0;
            if (arg1 != -42) {
                field2223 = null;
            }
            byte var6 = 0;
            while (true) {
                int var7 = 0;
                int var8 = var3[var5++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var4;
                }
                if (var8 == 1) {
                    var7 = class73.field1757[var3[var5++]];
                }
                if (var8 == 2) {
                    var7 = class98.field2367[var3[var5++]];
                }
                if (var8 == 3) {
                    var7 = class30.field754[var3[var5++]];
                }
                if (var8 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class105 var12 = class52.method435(var11, false);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class3.method21((byte) 78, var13).field697 || class14.field407)) {
                        for (int var14 = 0; var14 < var12.field2620.length; var14++) {
                            if (var13 + 1 == var12.field2620[var14]) {
                                var7 += var12.field2609[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class128.field3058[var3[var5++]];
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 6) {
                    var7 = class102.field2491[class98.field2367[var3[var5++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class128.field3058[var3[var5++]] * 100 / 46875;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 8) {
                    var7 = class82.field1932.field2790;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class6.field221[var15]) {
                            var7 += class98.field2367[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class105 var18 = class52.method435(var17, false);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class3.method21((byte) 37, var19).field697 || class14.field407)) {
                        for (int var20 = 0; var20 < var18.field2620.length; var20++) {
                            if (var19 + 1 == var18.field2620[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class120.field2978;
                }
                if (var8 == 12) {
                    var7 = class91.field2154;
                }
                if (var8 == 13) {
                    int var21 = class128.field3058[var3[var5++]];
                    int var22 = var3[var5++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var3[var5++];
                    var7 = class1.method3(arg1 - 25, var23);
                }
                if (var8 == 18) {
                    var7 = (class82.field1932.field112 >> 7) + class47.field1235;
                }
                if (var8 == 19) {
                    var7 = (class82.field1932.field120 >> 7) + class106.field2659;
                }
                if (var8 == 20) {
                    var7 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var7;
                    }
                    if (var6 == 1) {
                        var4 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var4 /= var7;
                    }
                    if (var6 == 3) {
                        var4 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)I", line = 216)
    public static final int method719(int arg0, int arg1, int arg2, int arg3) {
        field2216++;
        if (~(class12.field371[arg3][arg1][arg2] & 0x8) == arg0) {
            return arg3 <= 0 || (class12.field371[1][arg1][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 232)
    public static void method720(int arg0) {
        field2230 = null;
        field2213 = null;
        field2214 = null;
        field2233 = null;
        field2218 = null;
        if (arg0 > -55) {
            method722(-48, 26);
        }
        field2223 = null;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V", line = 252)
    public final void method721(int arg0) {
        field2228++;
        int var2 = this.field2221;
        class70 var3 = this.field2238.method551(-119);
        if (var3 == null) {
            this.field2217 = null;
            this.field2212 = 0;
            this.field2221 = -1;
            this.field2240 = 0;
            this.field2239 = 0;
        } else {
            this.field2240 = var3.field1672;
            this.field2217 = var3.field1650;
            this.field2221 = var3.field1694;
            this.field2239 = var3.field1665;
            this.field2212 = var3.field1683 * 128;
        }
        if (arg0 != -17) {
            method718(68, (byte) -80, null);
        }
        if (this.field2221 != var2 && this.field2215 != null) {
            class58.field1417.method568(this.field2215);
            this.field2215 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Lnc;", line = 291)
    public static final class81 method722(int arg0, int arg1) {
        if (arg1 != 16) {
            field2230 = null;
        }
        class81 var2 = (class81) class129.field3127.method98(-8, (long) arg0);
        field2232++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class103.field2507.method857(30580, 16, arg0);
        class81 var4 = new class81();
        if (var3 != null) {
            var4.method630(-1, new class39(var3));
        }
        class129.field3127.method102((long) arg0, var4, 91);
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIIIII)V", line = 318)
    public static final void method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2229++;
        class132 var10 = null;
        for (class132 var11 = (class132) class78.field1844.method180(arg9 - 10614); var11 != null; var11 = (class132) class78.field1844.method181(arg9 - 10614)) {
            if (var11.field3193 == arg5 && var11.field3200 == arg8 && var11.field3187 == arg0 && var11.field3198 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (arg9 != 10614) {
            return;
        }
        if (var10 == null) {
            var10 = new class132();
            var10.field3193 = arg5;
            var10.field3187 = arg0;
            var10.field3200 = arg8;
            var10.field3198 = arg7;
            class120.method952(var10, -128);
            class78.field1844.method176(var10, -19597);
        }
        var10.field3202 = arg1;
        var10.field3203 = arg2;
        var10.field3205 = arg6;
        var10.field3186 = arg4;
        var10.field3197 = arg3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqc;", line = 401)
    public static final class99 method724(Throwable arg0, String arg1) {
        field2234++;
        class99 var2;
        if (arg0 instanceof class99) {
            var2 = (class99) arg0;
            var2.field2392 = var2.field2392 + ' ' + arg1;
        } else {
            var2 = new class99(arg0, arg1);
        }
        return var2;
    }
}
