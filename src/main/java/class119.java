import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class119 {

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public int field2094 = -1;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Z")
    public boolean field2097 = false;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[I")
    private int[] field2104 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
    public static int[] field2092 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Lag;")
    public static class235 field2109 = new class235(5000);

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[I")
    private int[] field2090;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "[Ljd;")
    public static class85[] field2112;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[S")
    private short[] field2091;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[S")
    private short[] field2093;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "[S")
    private short[] field2103;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "[S")
    private short[] field2111;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Lnd;")
    public final class202 method857(int arg0) {
        field2096++;
        if (this.field2090 == null) {
            return null;
        }
        class202[] var2 = new class202[this.field2090.length];
        for (int var3 = arg0; var3 < this.field2090.length; var3++) {
            var2[var3] = class202.method1367(class141.field2476, this.field2090[var3], 0);
        }
        class202 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class202(var2, var2.length);
        }
        if (this.field2103 != null) {
            for (int var5 = 0; var5 < this.field2103.length; var5++) {
                var4.method1358(this.field2103[var5], this.field2093[var5]);
            }
        }
        if (this.field2091 != null) {
            for (int var6 = 0; var6 < this.field2091.length; var6++) {
                var4.method1350(this.field2091[var6], this.field2111[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILwd;B)V")
    private final void method858(int arg0, class217 arg1, byte arg2) {
        if (arg2 < 38) {
            return;
        }
        field2108++;
        if (arg0 == 1) {
            this.field2094 = arg1.method1487(255);
        } else if (arg0 == 2) {
            int var4 = arg1.method1487(255);
            this.field2090 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2090[var5] = arg1.method1441(101);
            }
            return;
        } else if (arg0 == 3) {
            this.field2097 = true;
            return;
        } else if (arg0 == 40) {
            int var6 = arg1.method1487(255);
            this.field2103 = new short[var6];
            this.field2093 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2103[var7] = (short) arg1.method1441(-114);
                this.field2093[var7] = (short) arg1.method1441(-115);
            }
            return;
        } else if (arg0 == 41) {
            int var8 = arg1.method1487(255);
            this.field2111 = new short[var8];
            this.field2091 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2091[var9] = (short) arg1.method1441(-100);
                this.field2111[var9] = (short) arg1.method1441(-17);
            }
            return;
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field2104[arg0 - 60] = arg1.method1441(-37);
            return;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Z")
    public final boolean method859(int arg0) {
        field2100++;
        if (this.field2090 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field2090.length; var3++) {
            if (!class141.field2476.method163(0, (byte) 111, this.field2090[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public static void method860(int arg0) {
        field2109 = null;
        field2112 = null;
        if (arg0 == -1) {
            field2092 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Z")
    public final boolean method861(boolean arg0) {
        field2106++;
        if (arg0) {
            method865((Component) null, 42, 22, (class138) null, (byte) -51);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2104[var3] != -1 && !class141.field2476.method163(0, (byte) 121, this.field2104[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B[IIIIII[BII)V")
    public static final void method862(byte arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9) {
        field2101++;
        int var10 = -(arg9 >> 2);
        int var11 = -(arg9 & 0x3);
        if (arg0 != 72) {
            method865((Component) null, -15, 17, (class138) null, (byte) 62);
        }
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg7[arg2++] == 0) {
                    arg5++;
                } else {
                    arg1[arg5++] = arg4;
                }
                if (arg7[arg2++] == 0) {
                    arg5++;
                } else {
                    arg1[arg5++] = arg4;
                }
                if (arg7[arg2++] == 0) {
                    arg5++;
                } else {
                    arg1[arg5++] = arg4;
                }
                if (arg7[arg2++] == 0) {
                    arg5++;
                } else {
                    arg1[arg5++] = arg4;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg7[arg2++] == 0) {
                    arg5++;
                } else {
                    arg1[arg5++] = arg4;
                }
            }
            arg5 += arg8;
            arg2 += arg3;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
    public static final void method863(int arg0) {
        field2095++;
        int var1 = class57.field1029.method1081(class45.field824);
        for (int var2 = 0; var2 < class136.field2368; var2++) {
            int var6 = class57.field1029.method1081(class79.method584(var2, -12022));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        class70.field1339 = class136.field2368 * 15 + 22;
        var1 += 8;
        int var3 = class52.field950;
        class244.field4247 = var1;
        int var4 = class56.field1000 - (var1 / 2);
        class205.field3406 = true;
        if (var1 + var4 > class1.field1) {
            var4 = class1.field1 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (arg0 != -28459) {
            method860(67);
        }
        int var5 = class136.field2368 * 15 + 21;
        class129.field2267 = var4;
        if (var3 + var5 > class136.field2370) {
            var3 = class136.field2370 - var5;
        }
        if (var3 < 0) {
            var3 = 0;
        }
        class231.field3864 = var3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)Lnd;")
    public final class202 method864(byte arg0) {
        field2102++;
        class202[] var2 = new class202[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2104[var4] != -1) {
                var2[var3++] = class202.method1367(class141.field2476, this.field2104[var4], 0);
            }
        }
        if (arg0 != 13) {
            this.method867((class217) null, (byte) -58);
        }
        class202 var5 = new class202(var2, var3);
        if (this.field2103 != null) {
            for (int var6 = 0; var6 < this.field2103.length; var6++) {
                var5.method1358(this.field2103[var6], this.field2093[var6]);
            }
        }
        if (this.field2091 != null) {
            for (int var7 = 0; var7 < this.field2091.length; var7++) {
                var5.method1350(this.field2091[var7], this.field2111[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/awt/Component;IILn;B)Lf;")
    public static final class82 method865(Component arg0, int arg1, int arg2, class138 arg3, byte arg4) {
        field2105++;
        if (class160.field2755 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class82 var5 = (class82) Class.forName("sd").getDeclaredConstructor().newInstance();
                var5.field1509 = arg1;
                var5.field1488 = new int[(class106.field1920 ? 2 : 1) * 256];
                var5.method23(arg0);
                var5.field1505 = (arg1 & 0xFFFFFC00) + 1024;
                if (arg4 < 55) {
                    return null;
                }
                if (var5.field1505 > 16384) {
                    var5.field1505 = 16384;
                }
                var5.method22(var5.field1505);
                if (class101.field1864 > 0 && class260.field4521 == null) {
                    class260.field4521 = new class192();
                    class260.field4521.field3191 = arg3;
                    arg3.method956(class260.field4521, (byte) -120, class101.field1864);
                }
                if (class260.field4521 != null) {
                    if (class260.field4521.field3187[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class260.field4521.field3187[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class4 var6 = new class4(arg3, arg2);
                    var6.field1488 = new int[(class106.field1920 ? 2 : 1) * 256];
                    var6.field1509 = arg1;
                    var6.method23(arg0);
                    var6.field1505 = 16384;
                    var6.method22(var6.field1505);
                    if (class101.field1864 > 0 && class260.field4521 == null) {
                        class260.field4521 = new class192();
                        class260.field4521.field3191 = arg3;
                        arg3.method956(class260.field4521, (byte) -125, class101.field1864);
                    }
                    if (class260.field4521 != null) {
                        if (class260.field4521.field3187[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class260.field4521.field3187[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class82();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
    public static final void method866(int arg0) {
        field2107++;
        class173.field2882.method763(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lwd;B)V")
    public final void method867(class217 arg0, byte arg1) {
        if (arg1 != -127) {
            method865((Component) null, -5, -39, (class138) null, (byte) -44);
        }
        field2110++;
        while (true) {
            int var3 = arg0.method1487(arg1 + 382);
            if (var3 == 0) {
                return;
            }
            this.method858(var3, arg0, (byte) 94);
        }
    }
}
