import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class291 extends class260 {

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "Z")
    private boolean field4205 = false;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    private int field4204 = -32768;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    private int field4213 = 0;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    private int field4218 = 0;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    private int field4200 = -1;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "Z")
    private boolean field4220 = false;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "Z")
    private boolean field4223 = true;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "Lfe;")
    private class153 field4222 = null;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    private int field4232 = -1;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    private int field4227 = 0;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    private int field4201;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    private int field4198;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    private int field4229;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    private int field4216;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    private int field4207;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    private int field4221;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    private int field4197;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    private int field4203;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    private int field4226;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    private int field4211;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "Leg;")
    private class314 field4230;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4219 = "Unable to find ";

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "Lcc;")
    public static class327 field4231 = new class327(200);

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
    public static int field4234 = 0;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "[I")
    public static int[] field4235 = new int[2];

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "Lfh;")
    public static class140 field4210;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "Lne;")
    private class187 field4212;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "[Luj;")
    public static class158[] field4233;

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "[Lwe;")
    public static class232[] field4236;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V", line = 4)
    public final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4202++;
        class260 var6 = null;
        if (class47.field623) {
            var6 = this.method1991(true, 6335);
        } else {
            this.method1994(arg4, -127, arg3);
        }
        if (!this.field4220) {
            if (var6 == null) {
                var6 = this.method1998(-67);
            }
            if (var6 == null) {
                return;
            }
            this.method2000(true, var6);
        }
        if (this.field4212 != null) {
            this.field4212.method1351(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIJILne;)V", line = 43)
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class187 arg10) {
        field4217++;
        class260 var13 = this.method1998(-104);
        if (var13 != null) {
            this.method2000(true, var13);
            var13.method585(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4212);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)Lvc;", line = 65)
    private final class260 method1991(boolean arg0, int arg1) {
        field4196++;
        boolean var3 = class74.field978 != class185.field2517;
        class219 var4 = class345.method2392(this.field4221, 0);
        if (var4.field3125 != null) {
            var4 = var4.method1589(arg1 ^ 0x18BF);
        }
        if (var4 == null) {
            if (class47.field623 && !var3) {
                this.method1995(-61);
            }
            this.field4232 = this.field4203;
            this.field4200 = -1;
            return null;
        }
        if (!this.field4205 && this.field4200 != var4.field3157) {
            this.method1993(-1, -1);
        }
        int var5 = this.field4207 & 0x3;
        if (arg1 != 6335) {
            field4236 = (class232[]) null;
        }
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field3096;
            var7 = var4.field3112;
        } else {
            var6 = var4.field3112;
            var7 = var4.field3096;
        }
        int var8 = (var7 >> 1) + this.field4229;
        int var9 = (var6 + 1 >> 1) + this.field4198;
        int var10 = (var6 >> 1) + this.field4198;
        int var11 = this.field4229 + (var7 + 1 >> 1);
        this.method1994(var8 * 128, -127, var10 * 128);
        boolean var12 = !var3 && var4.field3090 && (this.field4200 != var4.field3157 || (this.field4232 != this.field4203 || this.field4230 != null && (this.field4230.field4629 || class354.field5523) && this.field4211 != this.field4203) && class89.field1119 >= 2);
        if (arg0 && !var12) {
            this.field4232 = this.field4203;
            this.field4200 = var4.field3157;
            return null;
        }
        int var13 = (this.field4198 << 7) + (var6 << 6);
        int[][] var14 = (int[][]) null;
        int var15 = (this.field4229 << 7) + (var7 << 6);
        int[][] var16 = class74.field978[this.field4216];
        if (var3) {
            var14 = class185.field2517[0];
        } else if (this.field4216 < 3) {
            var14 = class74.field978[this.field4216 + 1];
        }
        int var17 = var16[var9][var8] + var16[var10][var11] + var16[var9][var11] + var16[var10][var8] >> 2;
        if (class47.field623 && var12) {
            class151.method1160(this.field4222, this.field4213, this.field4218, this.field4227);
        }
        boolean var18 = this.field4222 == null;
        class276 var19;
        if (this.field4230 == null) {
            var19 = var4.method1586(var13, false, this.field4201, var17, var16, var14, var12, this.field4207, var15, -115, var18 ? class16.field199 : this.field4222);
        } else {
            var19 = var4.method1594(var13, var16, this.field4203, arg1 ^ 0x70AC, var15, var17, var12, this.field4207, this.field4201, this.field4197, var14, this.field4230, var18 ? class16.field199 : this.field4222, this.field4211);
        }
        if (var19 == null) {
            this.field4232 = this.field4203;
            this.field4200 = var4.field3157;
            return null;
        }
        if (class47.field623 && var12) {
            int var20 = 0;
            if (var18) {
                class16.field199 = var19.field3958;
            }
            if (this.field4216 != 0) {
                int[][] var21 = class74.field978[0];
                var20 = var17 - (var21[var10][var8] + var21[var9][var8] + var21[var10][var11] + var21[var9][var11] >> 2);
            }
            class153 var22 = var19.field3958;
            if (this.field4223 && class151.method1164(var22, var13, var20, var15)) {
                this.field4223 = false;
            }
            if (!this.field4223) {
                class151.method1162(var22, var13, var20, var15);
                if (var18) {
                    class16.field199 = null;
                }
                this.field4227 = var15;
                this.field4222 = var22;
                this.field4218 = var20;
                this.field4213 = var13;
            }
        }
        this.field4200 = var4.field3157;
        this.field4232 = this.field4203;
        return var19.field3952;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 209)
    public static void method1992(int arg0) {
        if (arg0 != -1) {
            field4231 = (class327) null;
        }
        field4219 = null;
        field4210 = null;
        field4236 = null;
        field4233 = null;
        field4231 = null;
        field4235 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V", line = 231)
    private final void method1993(int arg0, int arg1) {
        field4215++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class219 var5 = class345.method2392(this.field4221, ~arg0);
            class219 var6 = var5;
            if (var5.field3125 != null) {
                var5 = var5.method1589(~arg0);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3163 != null) {
                if (this.field4230 != null && var5.method1601((byte) 54, this.field4230.field4606)) {
                    return;
                }
                var3 = var5.method1596(-1);
                if (this.field4200 != var5.field3157) {
                    var4 = var5.field3140;
                }
            } else if (var5.field3107 == -1) {
                if (var6 != null && var6.field3163 != null) {
                    if (this.field4230 != null && var6.method1601((byte) 54, this.field4230.field4606)) {
                        return;
                    }
                    var3 = var6.method1596(-1);
                    if (this.field4200 != var6.field3157) {
                        var4 = var6.field3140;
                    }
                } else if (var6 != null && var6.field3107 != -1 && this.field4200 != var6.field3157) {
                    var4 = var6.field3140;
                    var3 = var6.field3107;
                }
            } else if (this.field4200 != var5.field3157) {
                var4 = var5.field3140;
                var3 = var5.field3107;
            }
        }
        if (arg0 == var3) {
            this.field4230 = null;
            return;
        }
        if (this.field4230 == null || this.field4230.field4606 != var3) {
            this.field4230 = class207.method1516(var3, 122);
        } else if (this.field4230.field4626 == 0) {
            return;
        }
        if (var4) {
            this.field4203 = (int) (Math.random() * (double) this.field4230.field4631.length);
            this.field4197 = ((int) ((double) this.field4230.field4627[this.field4203] * Math.random())) + 1;
        } else {
            this.field4197 = 1;
            this.field4203 = 0;
        }
        this.field4211 = this.field4203 + 1;
        if (this.field4211 < 0 || this.field4230.field4631.length <= this.field4211) {
            this.field4211 = -1;
        }
        this.field4226 = class313.field4603 - this.field4197;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V", line = 347)
    private final void method1994(int arg0, int arg1, int arg2) {
        field4206++;
        if (arg1 > -125) {
            this.field4232 = -99;
        }
        label92: while (true) {
            if (this.field4230 == null) {
                if (this.field4205) {
                    return;
                }
                this.method1993(-1, -1);
                if (this.field4230 == null) {
                    return;
                }
            }
            int var4 = class313.field4603 - this.field4226;
            if (var4 > 100 && this.field4230.field4636 > 0) {
                int var5 = this.field4230.field4631.length - this.field4230.field4636;
                while (this.field4203 < var5 && this.field4230.field4627[this.field4203] < var4) {
                    var4 -= this.field4230.field4627[this.field4203];
                    this.field4203++;
                }
                if (this.field4203 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4230.field4631.length; var7++) {
                        var6 += this.field4230.field4627[var7];
                    }
                    var4 %= var6;
                }
                this.field4211 = this.field4203 + 1;
                if (this.field4230.field4631.length <= this.field4211) {
                    this.field4211 -= this.field4230.field4636;
                    if (this.field4211 < 0 || this.field4211 >= this.field4230.field4631.length) {
                        this.field4211 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field4230.field4627[this.field4203] >= var4) {
                            this.field4197 = var4;
                            this.field4226 = class313.field4603 - var4;
                            return;
                        }
                        class296.method2025(this.field4230, arg0, arg2, this.field4203, false, false);
                        var4 -= this.field4230.field4627[this.field4203];
                        this.field4203++;
                        if (this.field4230.field4631.length <= this.field4203) {
                            this.field4203 -= this.field4230.field4636;
                            if (this.field4203 < 0 || this.field4230.field4631.length <= this.field4203) {
                                this.field4230 = null;
                                continue label92;
                            }
                        }
                        this.field4211 = this.field4203 + 1;
                    } while (this.field4211 < this.field4230.field4631.length);
                    this.field4211 -= this.field4230.field4636;
                } while (this.field4211 >= 0 && this.field4230.field4631.length > this.field4211);
                this.field4211 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(IIIIIIIZLvc;)V", line = 706)
    public class291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class260 arg8) {
        this.field4201 = arg1;
        this.field4198 = arg4;
        this.field4229 = arg5;
        this.field4216 = arg3;
        this.field4207 = arg2;
        this.field4221 = arg0;
        if (arg8 != null) {
            this.field4205 = true;
            if ((arg8 instanceof class291)) {
                class291 var11 = (class291) arg8;
                if (class47.field623) {
                    var11.method1995(124);
                }
                this.field4197 = var11.field4197;
                this.field4203 = var11.field4203;
                this.field4226 = var11.field4226;
                this.field4211 = var11.field4211;
                this.field4230 = var11.field4230;
            } else if (class47.field623) {
                class219 var10 = class345.method2392(this.field4221, 0);
                if (var10.field3125 != null) {
                    var10 = var10.method1589(0);
                }
                if (var10 != null) {
                    class299.method2059(this.field4198, 0, this.field4207, this.field4216, var10, (byte) 93, 0, this.field4229, this.field4201);
                }
            }
        }
        if (this.field4205) {
            this.method1993(-1, arg6);
        }
        if (class47.field623 && arg8 != null) {
            this.method1991(true, 6335);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 448)
    public final void method1995(int arg0) {
        field4209++;
        if (this.field4222 != null) {
            class151.method1160(this.field4222, this.field4213, this.field4218, this.field4227);
            this.field4222 = null;
        }
        int var2 = 69 % ((-arg0 - 4) / 54);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(ZI)V", line = 472)
    public static final void method1996(boolean arg0, int arg1) {
        for (class96 var2 = (class96) class264.field3831.method413(arg1 + 1253216855); var2 != null; var2 = (class96) class264.field3831.method419(83)) {
            if (var2.field1260 != null) {
                class186.field2548.method2246(var2.field1260);
                var2.field1260 = null;
            }
            if (var2.field1247 != null) {
                class186.field2548.method2246(var2.field1247);
                var2.field1247 = null;
            }
            var2.method179((byte) 51);
        }
        field4225++;
        if (arg0) {
            for (class96 var3 = (class96) class343.field5336.method413(1253231568); var3 != null; var3 = (class96) class343.field5336.method419(37)) {
                if (var3.field1260 != null) {
                    class186.field2548.method2246(var3.field1260);
                    var3.field1260 = null;
                }
                var3.method179((byte) 51);
            }
            for (class96 var4 = (class96) class169.field2344.method2277(13292); var4 != null; var4 = (class96) class169.field2344.method2278((byte) -113)) {
                if (var4.field1260 != null) {
                    class186.field2548.method2246(var4.field1260);
                    var4.field1260 = null;
                }
                var4.method179((byte) 51);
            }
        }
        if (arg1 != 14713) {
            field4236 = (class232[]) null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(III)Lvf;", line = 544)
    public static final class183 method1997(int arg0, int arg1, int arg2) {
        class119 var3 = class345.field5367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class183 var4 = var3.field1558;
            var3.field1558 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)Lvc;", line = 559)
    public final class260 method1998(int arg0) {
        field4224++;
        if (arg0 >= -65) {
            method1992(-126);
        }
        return this.method1991(false, 6335);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 578)
    public static final String method1999(String arg0, String arg1, String arg2, int arg3) {
        if (arg3 > -48) {
            method1999((String) null, (String) null, (String) null, 106);
        }
        field4208++;
        for (int var4 = arg0.indexOf(arg2); var4 != -1; var4 = arg0.indexOf(arg2, var4 + arg1.length())) {
            arg0 = arg0.substring(0, var4) + arg1 + arg0.substring(var4 + arg2.length());
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()I", line = 600)
    public final int method583() {
        field4199++;
        return this.field4204;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLvc;)V", line = 608)
    private final void method2000(boolean arg0, class260 arg1) {
        field4214++;
        if (class47.field623) {
            class128 var5 = (class128) arg1;
            if ((this.field4212 == null || this.field4212.field2565) && (var5.field1746 != null || var5.field1712 != null)) {
                class219 var6 = class345.method2392(this.field4221, 0);
                if (var6.field3125 != null) {
                    var6 = var6.method1589(0);
                }
                if (var6 != null) {
                    this.field4212 = new class187(class313.field4603, var6.field3112, var6.field3096);
                }
            }
            if (this.field4212 != null) {
                this.field4212.method1369(var5.field1746, var5.field1712, false, var5.field1732, var5.field1710, var5.field1699);
            }
        } else {
            class332 var3 = (class332) arg1;
            if ((this.field4212 == null || this.field4212.field2565) && (var3.field4977 != null || var3.field4965 != null)) {
                class219 var4 = class345.method2392(this.field4221, 0);
                if (var4.field3125 != null) {
                    var4 = var4.method1589(0);
                }
                if (var4 != null) {
                    this.field4212 = new class187(class313.field4603, var4.field3112, var4.field3096);
                }
            }
            if (this.field4212 != null) {
                this.field4212.method1369(var3.field4977, var3.field4965, false, var3.field4973, var3.field4964, var3.field4953);
            }
        }
        this.field4220 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "finalize", descriptor = "()V", line = 669)
    protected final void finalize() {
        if (this.field4212 != null) {
            this.field4212.method1360();
        }
        field4228++;
    }
}
