import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class316 {

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    private int field4908 = 32;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Z")
    private boolean field4886 = false;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "J")
    private long field4892 = class283.method2038((byte) 127);

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    private int field4913 = 0;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "J")
    private long field4914 = 0L;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "[Lsm;")
    private class264[] field4919 = new class264[8];

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "[Lsm;")
    private class264[] field4921 = new class264[8];

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    private int field4915 = 0;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    private int field4920 = 0;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "Z")
    private boolean field4917 = true;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    private int field4923 = 0;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "J")
    private long field4924 = 0L;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Z")
    public static boolean field4888 = true;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4887 = " from your ignore list first.";

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field4903 = 0;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "[F")
    public static float[] field4898 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    public int field4916;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    private int field4918;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "Lsm;")
    private class264 field4910;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "Lgn;")
    public static class77 field4901;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "[I")
    public int[] field4905;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "[[Z")
    public static boolean[][] field4906;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lsm;Z)V", line = 6)
    public final synchronized void method2217(class264 arg0, boolean arg1) {
        field4902++;
        if (arg1) {
            this.field4918 = -70;
        }
        this.field4910 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()V", line = 18)
    public void method297() throws Exception {
        field4907++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 26)
    public final synchronized void method2218(int arg0) {
        field4889++;
        if (this.field4886) {
            return;
        }
        long var2 = class283.method2038((byte) 122);
        try {
            if (this.field4892 + 500000L < var2) {
                this.field4892 = var2 - 500000L;
            }
            while (this.field4892 + 5000L < var2) {
                this.method2224(-128, 256);
                this.field4892 += (long) (256000 / class338.field5275);
            }
        } catch (Exception var9) {
            this.field4892 = var2;
        }
        if (this.field4905 == null) {
            return;
        }
        try {
            if (this.field4914 != 0L) {
                if (var2 < this.field4914) {
                    return;
                }
                this.method299(this.field4916);
                this.field4917 = true;
                this.field4914 = 0L;
            }
            int var5 = this.method298();
            if ((this.field4923 - var5) > this.field4913) {
                this.field4913 = this.field4923 - var5;
            }
            int var6 = this.field4922 + this.field4918;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if ((var6 + 256) > this.field4916) {
                var5 = 0;
                this.field4916 += 1024;
                if (this.field4916 > 16384) {
                    this.field4916 = 16384;
                }
                this.method301();
                this.method299(this.field4916);
                this.field4917 = true;
                if (var6 + 256 > this.field4916) {
                    var6 = this.field4916 - 256;
                    this.field4918 = var6 - this.field4922;
                }
            }
            while (var5 < var6) {
                this.method2229(this.field4905, 256);
                this.method297();
                var5 += 256;
            }
            if (arg0 >= -17) {
                return;
            }
            if (var2 > this.field4924) {
                if (this.field4917) {
                    this.field4917 = false;
                } else if (this.field4913 == 0 && this.field4920 == 0) {
                    this.method301();
                    this.field4914 = var2 + 2000L;
                    return;
                } else {
                    this.field4918 = Math.min(this.field4920, this.field4913);
                    this.field4920 = this.field4913;
                }
                this.field4924 = var2 + 2000L;
                this.field4913 = 0;
            }
            this.field4923 = var5;
        } catch (Exception var8) {
            this.method301();
            this.field4914 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()I", line = 152)
    public int method298() throws Exception {
        field4909++;
        return this.field4916;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 170)
    public void method299(int arg0) throws Exception {
        field4897++;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V", line = 182)
    public final void method2219(int arg0) {
        field4893++;
        this.field4917 = true;
        if (arg0 < 72) {
            this.method2218(86);
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "()V", line = 194)
    public void method296() throws Exception {
        field4912++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILsm;)V", line = 201)
    private final void method2220(int arg0, int arg1, class264 arg2) {
        field4885++;
        int var4 = arg0 >> 5;
        class264 var5 = this.field4921[var4];
        if (var5 == null) {
            this.field4919[var4] = arg2;
        } else {
            var5.field4283 = arg2;
        }
        this.field4921[var4] = arg2;
        arg2.field4281 = arg0;
        if (arg1 < 90) {
            this.method2220(-64, 123, (class264) null);
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "()V", line = 222)
    public void method301() {
        field4883++;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V", line = 235)
    public final synchronized void method2221(int arg0) {
        if (class99.field1429 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class99.field1429.field4993[var3] == this) {
                    class99.field1429.field4993[var3] = null;
                }
                if (class99.field1429.field4993[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class99.field1429.field4984 = true;
                while (class99.field1429.field4986) {
                    class121.method867((byte) 72, 50L);
                }
                class99.field1429 = null;
            }
        }
        if (arg0 >= 43) {
            field4890++;
            this.method301();
            this.field4886 = true;
            this.field4905 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V", line = 282)
    public final synchronized void method2222(int arg0) {
        this.field4917 = true;
        try {
            this.method296();
        } catch (Exception var3) {
            this.method301();
            this.field4914 = class283.method2038((byte) 125) + 2000L;
        }
        if (arg0 < 124) {
            this.field4917 = false;
        }
        field4894++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 304)
    public static final void method2223(byte arg0) {
        field4899++;
        try {
            if (arg0 > 0) {
                field4898 = (float[]) null;
            }
            if (class286.field4586 == 1) {
                int var1 = class211.field3459.method872(-127);
                if (var1 > 0 && class211.field3459.method859((byte) 73)) {
                    int var2 = var1 - class281.field4529;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class211.field3459.method852(-16257, var2);
                    return;
                }
                class211.field3459.method857(25544);
                class211.field3459.method862(-27502);
                if (class325.field5040 == null) {
                    class286.field4586 = 0;
                } else {
                    class286.field4586 = 2;
                }
                class14.field156 = null;
                class146.field2272 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class211.field3459.method857(25544);
            class325.field5040 = null;
            class146.field2272 = null;
            class286.field4586 = 0;
            class14.field156 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 351)
    private final void method2224(int arg0, int arg1) {
        field4884++;
        this.field4915 -= arg1;
        if (this.field4915 < 0) {
            this.field4915 = 0;
        }
        if (this.field4910 != null) {
            this.field4910.method127(arg1);
        }
        if (arg0 >= -74) {
            this.field4915 = 27;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[Log;)V", line = 380)
    public static final void method2225(int arg0, int arg1, class157[] arg2) {
        field4891++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class157 var4 = arg2[var3];
            if (var4 != null && var4.field2463 == arg1 && (!var4.field2421 || !client.method777(var4))) {
                if (var4.field2478 == 0) {
                    if (!var4.field2421 && client.method777(var4) && class256.field4101 != var4) {
                        continue;
                    }
                    method2225(-1, var4.field2486, arg2);
                    if (var4.field2472 != null) {
                        method2225(arg0, var4.field2486, var4.field2472);
                    }
                    class90 var5 = (class90) class243.field3842.method451((long) var4.field2486, (byte) 100);
                    if (var5 != null) {
                        class76.method519(var5.field1249, arg0 ^ 0x5A64);
                    }
                }
                if (var4.field2478 == 6) {
                    if (var4.field2581 != -1 || var4.field2545 != -1) {
                        boolean var6 = class103.method709(85, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2545;
                        } else {
                            var7 = var4.field2581;
                        }
                        if (var7 != -1) {
                            class202 var8 = class325.method2274(var7, -126);
                            if (var8 != null) {
                                var4.field2476 += class36.field477;
                                while (var8.field3290[var4.field2497] < var4.field2476) {
                                    var4.field2476 -= var8.field3290[var4.field2497];
                                    var4.field2497++;
                                    if (var4.field2497 >= var8.field3293.length) {
                                        var4.field2497 -= var8.field3301;
                                        if (var4.field2497 < 0 || var8.field3293.length <= var4.field2497) {
                                            var4.field2497 = 0;
                                        }
                                    }
                                    var4.field2584 = var4.field2497 + 1;
                                    if (var8.field3293.length <= var4.field2584) {
                                        var4.field2584 -= var8.field3301;
                                        if (var4.field2584 < 0 || var4.field2584 >= var8.field3293.length) {
                                            var4.field2584 = -1;
                                        }
                                    }
                                    class320.method2252(var4, 0);
                                }
                            }
                        }
                    }
                    if (var4.field2604 != 0 && !var4.field2421) {
                        int var9 = var4.field2604 >> 16;
                        int var10 = class36.field477 * var9;
                        var4.field2492 = var4.field2492 + var10 & 0x7FF;
                        int var11 = var4.field2604 << 16 >> 16;
                        int var12 = class36.field477 * var11;
                        var4.field2574 = var4.field2574 + var12 & 0x7FF;
                        class320.method2252(var4, 0);
                    }
                }
            }
        }
        if (arg0 != -1) {
            field4887 = (String) null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 503)
    public void method300(Component arg0) throws Exception {
        field4911++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Log;B)Ljava/lang/String;", line = 512)
    public static final String method2226(class157 arg0, byte arg1) {
        field4896++;
        if (client.method766(arg0).method2029((byte) -79) == 0) {
            return null;
        } else if (arg1 <= 115) {
            return (String) null;
        } else if (arg0.field2429 == null || arg0.field2429.trim().length() == 0) {
            return class301.field4727 ? "Hidden-use" : null;
        } else {
            return arg0.field2429;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 536)
    public static final void method2227(byte arg0) {
        field4904++;
        int var1 = -127 / ((arg0 + 39) / 56);
        class301.field4725.method702((byte) 123);
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V", line = 546)
    public static void method2228(int arg0) {
        field4906 = (boolean[][]) null;
        field4898 = null;
        field4887 = null;
        field4901 = null;
        int var1 = 20 / ((arg0 + 62) / 45);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([II)V", line = 561)
    private final void method2229(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class44.field553) {
            var3 = arg1 << 1;
        }
        class9.method52(arg0, 0, var3);
        this.field4915 -= arg1;
        if (this.field4910 != null && this.field4915 <= 0) {
            this.field4915 += class338.field5275 >> 4;
            class156.method1118(0, this.field4910);
            this.method2220(this.field4910.method1886(), 103, this.field4910);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class264 var10 = null;
                        class264 var11 = this.field4919[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class216 var12 = var11.field4284;
                                if (var12 == null || var12.field3510 <= var8) {
                                    var11.field4282 = true;
                                    int var13 = var11.method126();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3510 += var13;
                                    }
                                    if (var4 >= this.field4908) {
                                        break label105;
                                    }
                                    class264 var14 = var11.method119();
                                    if (var14 != null) {
                                        int var15 = var11.field4281;
                                        while (var14 != null) {
                                            this.method2220(var15 * var14.method1886() >> 8, 112, var14);
                                            var14 = var11.method125();
                                        }
                                    }
                                    class264 var16 = var11.field4283;
                                    var11.field4283 = null;
                                    if (var10 == null) {
                                        this.field4919[var7] = var16;
                                    } else {
                                        var10.field4283 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4921[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4283;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class264 var18 = this.field4919[var17];
                this.field4919[var17] = this.field4921[var17] = null;
                while (var18 != null) {
                    class264 var19 = var18.field4283;
                    var18.field4283 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4915 < 0) {
            this.field4915 = 0;
        }
        if (this.field4910 != null) {
            this.field4910.method116(arg0, 0, arg1);
        }
        this.field4892 = class283.method2038((byte) 122);
    }
}
