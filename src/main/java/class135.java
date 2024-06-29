import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class135 extends class99 {

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    private int field3173 = -1;

    @OriginalMember(owner = "client!tc", name = "gb", descriptor = "[Laf;")
    public class7[] field3188 = new class7[] { null, null, null, null, class25.field669 };

    @OriginalMember(owner = "client!tc", name = "kb", descriptor = "I")
    public int field3192 = 0;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "[Laf;")
    public class7[] field3179 = new class7[] { null, null, class122.field2872, null, null };

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    private int field3174 = 0;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
    public int field3185 = 0;

    @OriginalMember(owner = "client!tc", name = "zb", descriptor = "I")
    public int field3207 = 0;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    private int field3175 = 0;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
    private int field3182 = 128;

    @OriginalMember(owner = "client!tc", name = "jb", descriptor = "Z")
    public boolean field3191 = false;

    @OriginalMember(owner = "client!tc", name = "qb", descriptor = "I")
    private int field3198 = -1;

    @OriginalMember(owner = "client!tc", name = "rb", descriptor = "Laf;")
    public class7 field3199 = class101.field2388;

    @OriginalMember(owner = "client!tc", name = "tb", descriptor = "I")
    public int field3201 = 0;

    @OriginalMember(owner = "client!tc", name = "ob", descriptor = "I")
    private int field3196 = -1;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
    private int field3183 = -1;

    @OriginalMember(owner = "client!tc", name = "mb", descriptor = "I")
    public int field3194 = 0;

    @OriginalMember(owner = "client!tc", name = "Ib", descriptor = "I")
    private int field3216 = 128;

    @OriginalMember(owner = "client!tc", name = "sb", descriptor = "I")
    public int field3200 = -1;

    @OriginalMember(owner = "client!tc", name = "Ob", descriptor = "I")
    private int field3222 = -1;

    @OriginalMember(owner = "client!tc", name = "Jb", descriptor = "I")
    public int field3217 = 0;

    @OriginalMember(owner = "client!tc", name = "Hb", descriptor = "I")
    public int field3215 = 0;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
    public int field3184 = 2000;

    @OriginalMember(owner = "client!tc", name = "Nb", descriptor = "I")
    private int field3221 = 128;

    @OriginalMember(owner = "client!tc", name = "Pb", descriptor = "I")
    private int field3223 = -1;

    @OriginalMember(owner = "client!tc", name = "Mb", descriptor = "I")
    public int field3220 = -1;

    @OriginalMember(owner = "client!tc", name = "Sb", descriptor = "I")
    public int field3226 = 0;

    @OriginalMember(owner = "client!tc", name = "hb", descriptor = "I")
    public int field3189 = 0;

    @OriginalMember(owner = "client!tc", name = "vb", descriptor = "I")
    private int field3203 = -1;

    @OriginalMember(owner = "client!tc", name = "yb", descriptor = "I")
    public int field3206 = 1;

    @OriginalMember(owner = "client!tc", name = "Tb", descriptor = "I")
    private int field3227 = -1;

    @OriginalMember(owner = "client!tc", name = "Xb", descriptor = "I")
    private int field3231 = -1;

    @OriginalMember(owner = "client!tc", name = "Bb", descriptor = "I")
    private int field3209 = -1;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "[I")
    public static int[] field3177 = new int[500];

    @OriginalMember(owner = "client!tc", name = "lb", descriptor = "[I")
    public static int[] field3193 = new int[50];

    @OriginalMember(owner = "client!tc", name = "Ab", descriptor = "Laf;")
    private static class7 field3208 = class48.method406(40, "Too many connections from your address)3");

    @OriginalMember(owner = "client!tc", name = "Qb", descriptor = "Laf;")
    public static class7 field3224 = field3208;

    @OriginalMember(owner = "client!tc", name = "pb", descriptor = "Laf;")
    public static class7 field3197 = class48.method406(40, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field3176 = 0;

    @OriginalMember(owner = "client!tc", name = "Wb", descriptor = "I")
    public static int field3230 = 0;

    @OriginalMember(owner = "client!tc", name = "wb", descriptor = "Laf;")
    public static class7 field3204 = class48.method406(40, "Ausw-=hlen");

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!tc", name = "ib", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!tc", name = "ub", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!tc", name = "xb", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!tc", name = "Cb", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!tc", name = "Db", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!tc", name = "Eb", descriptor = "I")
    private int field3212;

    @OriginalMember(owner = "client!tc", name = "Fb", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!tc", name = "Kb", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!tc", name = "Rb", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!tc", name = "Ub", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!tc", name = "Vb", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!tc", name = "nb", descriptor = "[I")
    public int[] field3195;

    @OriginalMember(owner = "client!tc", name = "Gb", descriptor = "[I")
    public int[] field3214;

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "[S")
    private short[] field3186;

    @OriginalMember(owner = "client!tc", name = "Lb", descriptor = "[S")
    private short[] field3219;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)Z")
    public final boolean method1097(int arg0, boolean arg1) {
        field3218++;
        int var3 = this.field3231;
        int var4 = this.field3227;
        if (arg1) {
            var3 = this.field3196;
            var4 = this.field3223;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!class126.field3005.method584(var3, (byte) 108, 0)) {
            var5 = false;
        }
        if (~var4 != arg0 && !class126.field3005.method584(var4, (byte) -102, 0)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method1098(Throwable arg0, byte arg1) throws IOException {
        field3225++;
        String var2;
        if (arg0 instanceof class155) {
            class155 var3 = (class155) arg0;
            arg0 = var3.field3599;
            var2 = var3.field3608 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        if (arg1 >= -21) {
            method1101(-67, 45);
        }
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)Leb;")
    public final class31 method1099(int arg0, int arg1) {
        field3202++;
        if (this.field3214 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg1 >= this.field3195[var4] && this.field3195[var4] != 0) {
                    var3 = this.field3214[var4];
                }
            }
            if (var3 != -1) {
                return class64.method526(false, var3).method1099(84, 1);
            }
        }
        class31 var5 = (class31) class30.field766.method395(124, (long) this.field3190);
        if (var5 != null) {
            return var5;
        } else if (arg0 < 24) {
            return null;
        } else {
            class15 var6 = class15.method152(class126.field3005, this.field3212, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field3216 != 128 || this.field3182 != 128 || this.field3221 != 128) {
                var6.method149(this.field3216, this.field3182, this.field3221);
            }
            if (this.field3186 != null) {
                for (int var7 = 0; var7 < this.field3186.length; var7++) {
                    var6.method142(this.field3186[var7], this.field3219[var7]);
                }
            }
            class31 var8 = var6.method151(this.field3189 + 64, this.field3226 + 768, -50, -10, -50);
            var8.field799 = true;
            class30.field766.method388(var8, (long) this.field3190, 2047);
            return var8;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ltc;ZLtc;)V")
    public final void method1100(class135 arg0, boolean arg1, class135 arg2) {
        this.field3201 = arg0.field3201;
        this.field3212 = arg0.field3212;
        this.field3194 = 1;
        this.field3207 = arg0.field3207;
        this.field3219 = arg0.field3219;
        this.field3184 = arg0.field3184;
        this.field3185 = arg0.field3185;
        if (arg1) {
            field3230 = 47;
        }
        this.field3191 = arg2.field3191;
        this.field3186 = arg0.field3186;
        this.field3217 = arg0.field3217;
        this.field3215 = arg0.field3215;
        this.field3206 = arg2.field3206;
        this.field3199 = arg2.field3199;
        field3187++;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)Lne;")
    public static final class95 method1101(int arg0, int arg1) {
        field3180++;
        class95 var2 = (class95) class143.field3386.method395(127, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field3352.method572(9, false, arg0);
        class95 var4 = new class95();
        var4.field2239 = arg0;
        if (var3 != null) {
            var4.method777((byte) -20, new class122(var3));
        }
        var4.method773((byte) -104);
        class143.field3386.method388(var4, (long) arg0, 2047);
        return arg1 == 3215 ? var4 : null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IZ)Z")
    public final boolean method1102(int arg0, boolean arg1) {
        field3210++;
        int var3 = this.field3203;
        int var4 = 97 / ((arg0 - 8) / 32);
        int var5 = this.field3198;
        int var6 = this.field3222;
        if (arg1) {
            var5 = this.field3173;
            var6 = this.field3209;
            var3 = this.field3183;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var7 = true;
        if (!class126.field3005.method584(var3, (byte) -109, 0)) {
            var7 = false;
        }
        if (var5 != -1 && !class126.field3005.method584(var5, (byte) -125, 0)) {
            var7 = false;
        }
        if (var6 != -1 && !class126.field3005.method584(var6, (byte) -111, 0)) {
            var7 = false;
        }
        return var7;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)V")
    public final void method1103(byte arg0) {
        if (arg0 != 61) {
            this.field3184 = -50;
        }
        field3211++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static void method1104(boolean arg0) {
        field3224 = null;
        field3208 = null;
        field3204 = null;
        field3177 = null;
        field3197 = null;
        field3193 = null;
        if (arg0) {
            method1101(-92, 101);
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)Lc;")
    public final class15 method1105(int arg0, int arg1) {
        field3178++;
        if (this.field3214 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (this.field3195[var4] <= arg1 && this.field3195[var4] != 0) {
                    var3 = this.field3214[var4];
                }
            }
            if (var3 != -1) {
                return class64.method526(false, var3).method1105(0, 1);
            }
        }
        class15 var5 = class15.method152(class126.field3005, this.field3212, arg0);
        if (var5 == null) {
            return null;
        }
        if (this.field3216 != 128 || this.field3182 != 128 || this.field3221 != 128) {
            var5.method149(this.field3216, this.field3182, this.field3221);
        }
        if (this.field3186 != null) {
            for (int var6 = 0; var6 < this.field3186.length; var6++) {
                var5.method142(this.field3186[var6], this.field3219[var6]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Ltc;")
    public final class135 method1106(int arg0, byte arg1) {
        if (arg1 < 73) {
            return null;
        }
        field3205++;
        if (this.field3214 != null && arg0 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (this.field3195[var4] <= arg0 && this.field3195[var4] != 0) {
                    var3 = this.field3214[var4];
                }
            }
            if (var3 != -1) {
                return class64.method526(false, var3);
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(ILrd;)V")
    public final void method1107(int arg0, class122 arg1) {
        while (true) {
            int var3 = arg1.method931((byte) 124);
            if (var3 == 0) {
                field3213++;
                if (arg0 != 0) {
                    this.method1110(false, true);
                    return;
                }
                return;
            }
            this.method1109(arg1, arg0 + 116, var3);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZB)Lc;")
    public final class15 method1108(boolean arg0, byte arg1) {
        if (arg1 >= -110) {
            this.field3195 = null;
        }
        int var3 = this.field3231;
        int var4 = this.field3227;
        if (arg0) {
            var4 = this.field3223;
            var3 = this.field3196;
        }
        field3229++;
        if (var3 == -1) {
            return null;
        }
        class15 var5 = class15.method152(class126.field3005, var3, 0);
        if (var4 != -1) {
            class15 var6 = class15.method152(class126.field3005, var4, 0);
            class15[] var7 = new class15[] { var5, var6 };
            var5 = new class15(var7, 2);
        }
        if (this.field3186 != null) {
            for (int var8 = 0; var8 < this.field3186.length; var8++) {
                var5.method142(this.field3186[var8], this.field3219[var8]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lrd;II)V")
    private final void method1109(class122 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field3212 = arg0.method965(false);
        } else if (arg2 == 2) {
            this.field3199 = arg0.method979(26250);
        } else if (arg2 == 4) {
            this.field3184 = arg0.method965(false);
        } else if (arg2 == 5) {
            this.field3207 = arg0.method965(false);
        } else if (arg2 == 6) {
            this.field3215 = arg0.method965(false);
        } else if (arg2 == 7) {
            this.field3217 = arg0.method965(false);
            if (this.field3217 > 32767) {
                this.field3217 -= 65536;
            }
        } else if (arg2 == 8) {
            this.field3185 = arg0.method965(false);
            if (this.field3185 > 32767) {
                this.field3185 -= 65536;
            }
        } else if (arg2 == 11) {
            this.field3194 = 1;
        } else if (arg2 == 12) {
            this.field3206 = arg0.method972(64);
        } else if (arg2 == 16) {
            this.field3191 = true;
        } else if (arg2 == 23) {
            this.field3203 = arg0.method965(false);
            this.field3175 = arg0.method931((byte) 124);
        } else if (arg2 == 24) {
            this.field3198 = arg0.method965(false);
        } else if (arg2 == 25) {
            this.field3183 = arg0.method965(false);
            this.field3174 = arg0.method931((byte) 124);
        } else if (arg2 == 26) {
            this.field3173 = arg0.method965(false);
        } else if (arg2 >= 30 && arg2 < 35) {
            this.field3179[arg2 - 30] = arg0.method979(26250);
            if (this.field3179[arg2 - 30].method84(class122.field2929, 126)) {
                this.field3179[arg2 - 30] = null;
            }
        } else if (arg2 >= 35 && arg2 < 40) {
            this.field3188[arg2 - 35] = arg0.method979(26250);
        } else if (arg2 == 40) {
            int var4 = arg0.method931((byte) 124);
            this.field3186 = new short[var4];
            this.field3219 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3186[var5] = (short) arg0.method965(false);
                this.field3219[var5] = (short) arg0.method965(false);
            }
        } else if (arg2 == 78) {
            this.field3222 = arg0.method965(false);
        } else if (arg2 == 79) {
            this.field3209 = arg0.method965(false);
        } else if (arg2 == 90) {
            this.field3231 = arg0.method965(false);
        } else if (arg2 == 91) {
            this.field3196 = arg0.method965(false);
        } else if (arg2 == 92) {
            this.field3227 = arg0.method965(false);
        } else if (arg2 == 93) {
            this.field3223 = arg0.method965(false);
        } else if (arg2 == 95) {
            this.field3201 = arg0.method965(false);
        } else if (arg2 == 97) {
            this.field3200 = arg0.method965(false);
        } else if (arg2 == 98) {
            this.field3220 = arg0.method965(false);
        } else if (arg2 >= 100 && arg2 < 110) {
            if (this.field3214 == null) {
                this.field3214 = new int[10];
                this.field3195 = new int[10];
            }
            this.field3214[arg2 - 100] = arg0.method965(false);
            this.field3195[arg2 - 100] = arg0.method965(false);
        } else if (arg2 == 110) {
            this.field3216 = arg0.method965(false);
        } else if (arg2 == 111) {
            this.field3182 = arg0.method965(false);
        } else if (arg2 == 112) {
            this.field3221 = arg0.method965(false);
        } else if (arg2 == 113) {
            this.field3189 = arg0.method977(true);
        } else if (arg2 == 114) {
            this.field3226 = arg0.method977(true) * 5;
        } else if (arg2 == 115) {
            this.field3192 = arg0.method931((byte) 124);
        }
        int var6 = 28 % ((arg1 - 49) / 57);
        field3228++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZZ)Lc;")
    public final class15 method1110(boolean arg0, boolean arg1) {
        int var3 = this.field3203;
        field3181++;
        int var4 = this.field3222;
        int var5 = this.field3198;
        if (arg0) {
            var3 = this.field3183;
            var5 = this.field3173;
            var4 = this.field3209;
        }
        if (!arg1) {
            this.field3201 = 98;
        }
        if (var3 == -1) {
            return null;
        }
        class15 var6 = class15.method152(class126.field3005, var3, 0);
        if (var5 != -1) {
            class15 var7 = class15.method152(class126.field3005, var5, 0);
            if (var4 == -1) {
                class15[] var8 = new class15[] { var6, var7 };
                var6 = new class15(var8, 2);
            } else {
                class15 var9 = class15.method152(class126.field3005, var4, 0);
                class15[] var10 = new class15[] { var6, var7, var9 };
                var6 = new class15(var10, 3);
            }
        }
        if (!arg0 && this.field3175 != 0) {
            var6.method153(0, this.field3175, 0);
        }
        if (arg0 && this.field3174 != 0) {
            var6.method153(0, this.field3174, 0);
        }
        if (this.field3186 != null) {
            for (int var11 = 0; var11 < this.field3186.length; var11++) {
                var6.method142(this.field3186[var11], this.field3219[var11]);
            }
        }
        return var6;
    }
}
