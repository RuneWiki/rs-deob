import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class213 extends class262 {

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    private int field3238 = 0;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "Lil;")
    private class4 field3230 = new class4(16);

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    private int field3256 = 0;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "Ljo;")
    private class150 field3257 = new class150();

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "J")
    private long field3262 = 0L;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    private int field3232;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "Lqe;")
    private class218 field3244;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "Z")
    private boolean field3254;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "Ljo;")
    private class150 field3260;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "Lte;")
    private class293 field3241;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "Lqe;")
    private class218 field3229;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "Z")
    private boolean field3261;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    private int field3249;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    private int field3234;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "Lvd;")
    private class23 field3250;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "Lbj;")
    private class105 field3252;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field3235 = 0;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "Lui;")
    public static class98 field3246 = new class98(50);

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "[S")
    public static short[] field3259 = new short[256];

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "Lqc;")
    private class357 field3253;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "Z")
    private boolean field3255;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "[B")
    private byte[] field3237;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(IZ)V", line = 5)
    public final void method1440(int arg0, boolean arg1) {
        field3239++;
        if (this.field3244 == null) {
            return;
        }
        if (arg1) {
            this.method1446(60);
        }
        for (class159 var3 = this.field3257.method1081(109); var3 != null; var3 = this.field3257.method1083((byte) 113)) {
            if ((long) arg0 == var3.field2549) {
                return;
            }
        }
        class159 var4 = new class159();
        var4.field2549 = (long) arg0;
        this.field3257.method1077(16711935, var4);
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V", line = 34)
    public final void method1441(byte arg0) {
        field3245++;
        if (this.field3244 == null) {
            return;
        }
        this.field3255 = true;
        if (this.field3260 == null) {
            this.field3260 = new class150();
        }
        if (arg0 != 0) {
            this.field3234 = 55;
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)I", line = 56)
    public final int method1442(int arg0) {
        field3236++;
        int var2 = -11 / ((arg0 + 32) / 41);
        if (this.method1448((byte) 0) == null) {
            return this.field3252 == null ? 0 : this.field3252.method696((byte) 116);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V", line = 84)
    public static void method1443(int arg0) {
        if (arg0 != -2) {
            method1449(84, -57, -91, -72, (byte) -123, 42, 31);
        }
        field3246 = null;
        field3259 = null;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V", line = 95)
    public final void method1444(int arg0) {
        field3242++;
        if (arg0 <= 51) {
            return;
        }
        if (this.field3260 != null) {
            if (this.method1448((byte) 0) == null) {
                return;
            }
            if (this.field3254) {
                boolean var2 = true;
                for (class159 var3 = this.field3260.method1081(-82); var3 != null; var3 = this.field3260.method1083((byte) 113)) {
                    int var4 = (int) var3.field2549;
                    if (this.field3237[var4] == 0) {
                        this.method1454(-1, 1, var4);
                    }
                    if (this.field3237[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method1131(8);
                    }
                }
                while (this.field3253.field5663.length > this.field3256) {
                    if (this.field3253.field5663[this.field3256] == 0) {
                        this.field3256++;
                    } else {
                        if (this.field3250.field343 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3237[this.field3256] == 0) {
                            this.method1454(-1, 1, this.field3256);
                        }
                        if (this.field3237[this.field3256] == 0) {
                            var2 = false;
                            class159 var5 = new class159();
                            var5.field2549 = (long) this.field3256;
                            this.field3260.method1077(16711935, var5);
                        }
                        this.field3256++;
                    }
                }
                if (var2) {
                    this.field3256 = 0;
                    this.field3254 = false;
                }
            } else if (this.field3255) {
                boolean var6 = true;
                for (class159 var7 = this.field3260.method1081(108); var7 != null; var7 = this.field3260.method1083((byte) 113)) {
                    int var8 = (int) var7.field2549;
                    if (this.field3237[var8] != 1) {
                        this.method1454(-1, 2, var8);
                    }
                    if (this.field3237[var8] == 1) {
                        var7.method1131(8);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3256 < this.field3253.field5663.length) {
                    if (this.field3253.field5663[this.field3256] == 0) {
                        this.field3256++;
                    } else {
                        if (this.field3241.method2075(4774)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3237[this.field3256] != 1) {
                            this.method1454(-1, 2, this.field3256);
                        }
                        if (this.field3237[this.field3256] != 1) {
                            var6 = false;
                            class159 var9 = new class159();
                            var9.field2549 = (long) this.field3256;
                            this.field3260.method1077(16711935, var9);
                        }
                        this.field3256++;
                    }
                }
                if (var6) {
                    this.field3256 = 0;
                    this.field3255 = false;
                }
            } else {
                this.field3260 = null;
            }
        }
        if (!this.field3261 || this.field3262 > class19.method122(-12169)) {
            return;
        }
        for (class105 var10 = (class105) this.field3230.method27(125); var10 != null; var10 = (class105) this.field3230.method34(8)) {
            if (!var10.field1513) {
                if (var10.field1515) {
                    if (!var10.field1518) {
                        throw new RuntimeException();
                    }
                    var10.method1131(8);
                } else {
                    var10.field1515 = true;
                }
            }
        }
        this.field3262 = class19.method122(-12169) + 1000L;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(ZI)I", line = 275)
    public final int method1445(boolean arg0, int arg1) {
        if (arg0) {
            this.field3253 = (class357) null;
        }
        class105 var3 = (class105) this.field3230.method29((long) arg1, 103);
        field3247++;
        return var3 == null ? 0 : var3.method696((byte) 105);
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)I", line = 297)
    public final int method1446(int arg0) {
        field3251++;
        if (this.field3253 == null) {
            return 0;
        } else if (this.field3254) {
            if (arg0 <= 47) {
                this.field3250 = (class23) null;
            }
            class159 var2 = this.field3260.method1081(-62);
            return var2 == null ? 0 : (int) var2.field2549;
        } else {
            return this.field3253.field5652;
        }
    }

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "(I)I", line = 322)
    public final int method1447(int arg0) {
        field3226++;
        int var2 = 91 % ((arg0 + 22) / 41);
        return this.field3238;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)Lqc;", line = 334)
    public final class357 method1448(byte arg0) {
        field3243++;
        if (this.field3253 != null) {
            return this.field3253;
        }
        if (this.field3252 == null) {
            if (this.field3241.method2081(arg0 + 20)) {
                return null;
            }
            this.field3252 = this.field3241.method2073((byte) -81, this.field3232, 255, (byte) 0, true);
        }
        if (this.field3252.field1513) {
            return null;
        }
        byte[] var2 = this.field3252.method697(-84);
        if (this.field3252 instanceof class212) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3253 = new class357(var2, this.field3249);
                if (this.field3253.field5661 != this.field3234) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field3253 = null;
                if (this.field3241.method2081(20)) {
                    this.field3252 = null;
                } else {
                    this.field3252 = this.field3241.method2073((byte) -92, this.field3232, 255, (byte) 0, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3253 = new class357(var2, this.field3249);
            } catch (RuntimeException var6) {
                this.field3241.method2071(125);
                this.field3253 = null;
                if (this.field3241.method2081(20)) {
                    this.field3252 = null;
                } else {
                    this.field3252 = this.field3241.method2073((byte) -86, this.field3232, 255, (byte) 0, true);
                }
                return null;
            }
            if (this.field3229 != null) {
                this.field3250.method203(this.field3229, this.field3232, var2, true);
            }
        }
        if (this.field3244 != null) {
            this.field3237 = new byte[this.field3253.field5653];
            this.field3238 = 0;
        }
        if (arg0 != 0) {
            this.field3238 = 59;
        }
        this.field3252 = null;
        return this.field3253;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIBII)V", line = 432)
    public static final void method1449(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3228++;
        if (arg0 >= class341.field5494 && class196.field3001 >= arg1 && arg5 >= class33.field505 && arg3 <= class278.field4586) {
            if (arg6 == 1) {
                class25.method218(arg0, arg2, arg4 + 4004, arg3, arg1, arg5);
            } else {
                class126.method815(arg3, (byte) -65, arg1, arg6, arg5, arg0, arg2);
            }
        } else if (arg6 == 1) {
            class312.method2183(arg0, (byte) 108, arg3, arg5, arg2, arg1);
        } else {
            class216.method1465(arg0, arg1, arg6, 114, arg5, arg2, arg3);
        }
        if (arg4 != 92) {
            field3246 = (class98) null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V", line = 465)
    public final void method1450(byte arg0) {
        field3240++;
        if (this.field3260 == null || this.method1448((byte) 0) == null) {
            return;
        }
        if (arg0 != -73) {
            this.field3250 = (class23) null;
        }
        for (class159 var2 = this.field3257.method1081(-90); var2 != null; var2 = this.field3257.method1083((byte) 113)) {
            int var3 = (int) var2.field2549;
            if (var3 < 0 || var3 >= this.field3253.field5653 || this.field3253.field5663[var3] == 0) {
                var2.method1131(arg0 ^ 0xFFFFFFBF);
            } else {
                if (this.field3237[var3] == 0) {
                    this.method1454(-1, 1, var3);
                }
                if (this.field3237[var3] == -1) {
                    this.method1454(-1, 2, var3);
                }
                if (this.field3237[var3] == 1) {
                    var2.method1131(arg0 ^ 0xFFFFFFBF);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(ILqe;Lqe;Lte;Lvd;IIZ)V", line = 825)
    public class213(int arg0, class218 arg1, class218 arg2, class293 arg3, class23 arg4, int arg5, int arg6, boolean arg7) {
        this.field3232 = arg0;
        this.field3244 = arg1;
        if (this.field3244 == null) {
            this.field3254 = false;
        } else {
            this.field3254 = true;
            this.field3260 = new class150();
        }
        this.field3241 = arg3;
        this.field3229 = arg2;
        this.field3261 = arg7;
        this.field3249 = arg5;
        this.field3234 = arg6;
        this.field3250 = arg4;
        if (this.field3229 != null) {
            this.field3252 = this.field3250.method201(this.field3229, this.field3232, (byte) -71);
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(B)I", line = 515)
    public final int method1451(byte arg0) {
        field3258++;
        if (this.field3253 == null) {
            return 0;
        } else {
            if (arg0 <= 35) {
                this.field3244 = (class218) null;
            }
            return this.field3253.field5652;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIBI)V", line = 532)
    public static final void method1452(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = -27 / ((71 - arg3) / 36);
        for (int var6 = 0; var6 < class60.field916; var6++) {
            if (class21.field263[var6] + class138.field2179[var6] > arg4 && class21.field263[var6] < arg4 + arg0 && (class265.field4360[var6] + class189.field2926[var6]) > arg2 && class265.field4360[var6] < arg1 + arg2) {
                class324.field5309[var6] = true;
            }
        }
        field3231++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)[B", line = 555)
    public final byte[] method1453(boolean arg0, int arg1) {
        field3233++;
        class105 var3 = this.method1454(-1, 0, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method697(-93);
            var3.method1131(8);
            return arg0 ? (byte[]) null : var4;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Lbj;", line = 584)
    private final class105 method1454(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.method1448((byte) 42);
        }
        class105 var4 = (class105) this.field3230.method29((long) arg2, arg0 + 104);
        field3248++;
        if (var4 != null && arg1 == 0 && !var4.field1518 && var4.field1513) {
            var4.method1131(8);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field3244 == null || this.field3237[arg2] == -1) {
                    if (this.field3241.method2081(arg0 + 21)) {
                        return null;
                    }
                    var4 = this.field3241.method2073((byte) -98, arg2, this.field3232, (byte) 2, true);
                } else {
                    var4 = this.field3250.method201(this.field3244, arg2, (byte) -122);
                }
            } else if (arg1 == 1) {
                if (this.field3244 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3250.method206(this.field3244, arg2, (byte) 109);
            } else if (arg1 == 2) {
                if (this.field3244 == null) {
                    throw new RuntimeException();
                }
                if (this.field3237[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3241.method2075(arg0 + 4775)) {
                    return null;
                }
                var4 = this.field3241.method2073((byte) -81, arg2, this.field3232, (byte) 2, false);
            } else {
                throw new RuntimeException();
            }
            this.field3230.method37(false, var4, (long) arg2);
        }
        if (var4.field1513) {
            return null;
        }
        byte[] var5 = var4.method697(68);
        if (!var4 instanceof class212) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class130.field1979.reset();
                class130.field1979.update(var5, 0, var5.length - 2);
                int var10 = (int) class130.field1979.getValue();
                if (this.field3253.field5664[arg2] != var10) {
                    throw new RuntimeException();
                }
                this.field3241.field4880 = 0;
                this.field3241.field4879 = 0;
            } catch (RuntimeException var14) {
                this.field3241.method2071(123);
                var4.method1131(8);
                if (var4.field1518 && !this.field3241.method2081(20)) {
                    class256 var12 = this.field3241.method2073((byte) -101, arg2, this.field3232, (byte) 2, true);
                    this.field3230.method37(false, var12, (long) arg2);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3253.field5666[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field3253.field5666[arg2];
            if (this.field3244 != null) {
                this.field3250.method203(this.field3244, arg2, var5, true);
                if (this.field3237[arg2] != 1) {
                    this.field3238++;
                    this.field3237[arg2] = 1;
                }
            }
            if (!var4.field1518) {
                var4.method1131(8);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class130.field1979.reset();
            class130.field1979.update(var5, 0, var5.length - 2);
            int var6 = (int) class130.field1979.getValue();
            if (this.field3253.field5664[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3253.field5666[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field3237[arg2] != 1) {
                if (this.field3237[arg2] == 0) {
                }
                this.field3238++;
                this.field3237[arg2] = 1;
            }
            if (!var4.field1518) {
                var4.method1131(8);
            }
            return var4;
        } catch (Exception var13) {
            this.field3237[arg2] = -1;
            var4.method1131(8);
            if (var4.field1518 && !this.field3241.method2081(20)) {
                class256 var9 = this.field3241.method2073((byte) -123, arg2, this.field3232, (byte) 2, true);
                this.field3230.method37(false, var9, (long) arg2);
            }
            return null;
        }
    }
}
