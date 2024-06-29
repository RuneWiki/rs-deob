import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class366 extends class754 {

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    private int field4672 = 0;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "Lpfa;")
    private class295 field4694 = new class295(16);

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    private int field4696 = 0;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "Lbq;")
    private class289 field4699 = new class289();

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "J")
    private long field4700 = 0L;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    private int field4692;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "Lrfa;")
    private class199 field4663;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "Z")
    private boolean field4698;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "Lbq;")
    private class289 field4695;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    private int field4678;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "Lgd;")
    private class339 field4693;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "Lrfa;")
    private class199 field4676;

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "Z")
    private boolean field4701;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "Loj;")
    private class379 field4677;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "[B")
    private byte[] field4681;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    private int field4668;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "Lnq;")
    private class459 field4683;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "Lhs;")
    public static class325 field4667 = new class325(3, 2);

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "J")
    public static long field4666;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "Lhq;")
    private class158 field4675;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "Z")
    private boolean field4697;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "[B")
    private byte[] field4684;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "[[[I")
    public static int[][][] field4673;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)I", line = 10)
    public final int method2127(int arg0) {
        field4687++;
        if (this.method2135(true) == null) {
            return this.field4683 == null ? 0 : this.field4683.method1211(100);
        } else {
            if (arg0 <= 47) {
                this.field4700 = -106L;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)I", line = 35)
    public final int method2128(int arg0) {
        if (arg0 != 0) {
            method2131((byte) -46);
        }
        field4670++;
        return this.field4675 == null ? 0 : this.field4675.field1744;
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)V", line = 50)
    public final void method2129(int arg0) {
        field4679++;
        if (arg0 >= -14) {
            this.field4663 = null;
        }
        if (this.field4695 != null) {
            if (this.method2135(true) == null) {
                return;
            }
            if (this.field4698) {
                boolean var2 = true;
                for (class134 var3 = this.field4695.method1719(65280); var3 != null; var3 = this.field4695.method1723(-20665)) {
                    int var5 = (int) var3.field1522;
                    if (this.field4684[var5] == 0) {
                        this.method2133(var5, true, 1);
                    }
                    if (this.field4684[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method864(12983);
                    }
                }
                while (this.field4696 < this.field4675.field1736.length) {
                    if (this.field4675.field1736[this.field4696] == 0) {
                        this.field4696++;
                    } else {
                        if (this.field4677.field5198 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4684[this.field4696] == 0) {
                            this.method2133(this.field4696, true, 1);
                        }
                        if (this.field4684[this.field4696] == 0) {
                            class134 var4 = new class134();
                            var4.field1522 = this.field4696;
                            this.field4695.method1721((byte) 122, var4);
                            var2 = false;
                        }
                        this.field4696++;
                    }
                }
                if (var2) {
                    this.field4698 = false;
                    this.field4696 = 0;
                }
            } else if (this.field4697) {
                boolean var6 = true;
                for (class134 var7 = this.field4695.method1719(65280); var7 != null; var7 = this.field4695.method1723(-20665)) {
                    int var9 = (int) var7.field1522;
                    if (this.field4684[var9] != 1) {
                        this.method2133(var9, true, 2);
                    }
                    if (this.field4684[var9] == 1) {
                        var7.method864(12983);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4696 < this.field4675.field1736.length) {
                    if (this.field4675.field1736[this.field4696] == 0) {
                        this.field4696++;
                    } else {
                        if (this.field4693.method2021((byte) 107)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4684[this.field4696] != 1) {
                            this.method2133(this.field4696, true, 2);
                        }
                        if (this.field4684[this.field4696] != 1) {
                            class134 var8 = new class134();
                            var8.field1522 = this.field4696;
                            this.field4695.method1721((byte) 110, var8);
                            var6 = false;
                        }
                        this.field4696++;
                    }
                }
                if (var6) {
                    this.field4696 = 0;
                    this.field4697 = false;
                }
            } else {
                this.field4695 = null;
            }
        }
        if (!this.field4701 || this.field4700 > class652.method3700(-1)) {
            return;
        }
        for (class459 var10 = (class459) this.field4694.method1753(0); var10 != null; var10 = (class459) this.field4694.method1755(-120)) {
            if (!var10.field6563) {
                if (var10.field6565) {
                    if (!var10.field6561) {
                        throw new RuntimeException();
                    }
                    var10.method864(12983);
                } else {
                    var10.field6565 = true;
                }
            }
        }
        this.field4700 = class652.method3700(-1) + 1000L;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILd;Ljava/awt/Canvas;I)Lha;", line = 238)
    public static final class58 method2130(int arg0, class150 arg1, Canvas arg2, int arg3) {
        if (arg0 > -20) {
            return null;
        } else {
            field4682++;
            return new class417(arg2, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 256)
    public static void method2131(byte arg0) {
        field4667 = null;
        field4673 = null;
        if (arg0 != 1) {
            method2131((byte) 107);
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)I", line = 269)
    public final int method2132(byte arg0) {
        field4689++;
        if (this.field4675 == null) {
            return 0;
        } else if (this.field4698) {
            class134 var2 = this.field4695.method1719(arg0 + 65298);
            if (arg0 != -18) {
                this.method2129(58);
            }
            return var2 == null ? 0 : (int) var2.field1522;
        } else {
            return this.field4675.field1744;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZI)Lnq;", line = 294)
    private final class459 method2133(int arg0, boolean arg1, int arg2) {
        field4669++;
        class459 var4 = (class459) this.field4694.method1754(!arg1, (long) arg0);
        if (var4 != null && arg2 == 0 && !var4.field6561 && var4.field6563) {
            var4.method864(12983);
            var4 = null;
        }
        if (!arg1) {
            this.method2128(-2);
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field4663 == null || this.field4684[arg0] == -1) {
                    if (this.field4693.method2013((byte) -70)) {
                        return null;
                    }
                    var4 = this.field4693.method2009(this.field4692, (byte) 2, arg0, -1802914416, true);
                } else {
                    var4 = this.field4677.method2328(3, arg0, this.field4663);
                }
            } else if (arg2 == 1) {
                if (this.field4663 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4677.method2333(this.field4663, arg0, 28276);
            } else if (arg2 == 2) {
                if (this.field4663 == null) {
                    throw new RuntimeException();
                }
                if (this.field4684[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4693.method2021((byte) -83)) {
                    return null;
                }
                var4 = this.field4693.method2009(this.field4692, (byte) 2, arg0, -1802914416, false);
            } else {
                throw new RuntimeException();
            }
            this.field4694.method1751(var4, 3970, (long) arg0);
        }
        if (var4.field6563) {
            return null;
        }
        byte[] var5 = var4.method1206((byte) -112);
        if (!var4 instanceof class204) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class375.field4827.reset();
                class375.field4827.update(var5, 0, var5.length - 2);
                int var12 = (int) class375.field4827.getValue();
                if (this.field4675.field1750[arg0] != var12) {
                    throw new RuntimeException();
                }
                if (this.field4675.field1749 != null && this.field4675.field1749[arg0] != null) {
                    byte[] var13 = this.field4675.field1749[arg0];
                    byte[] var14 = class327.method1954(0, var5.length - 2, var5, 802);
                    for (int var15 = 0; var15 < 64; var15++) {
                        if (var13[var15] != var14[var15]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field4693.field4381 = 0;
                this.field4693.field4382 = 0;
            } catch (RuntimeException var18) {
                this.field4693.method2006(255);
                var4.method864(12983);
                if (var4.field6561 && !this.field4693.method2013((byte) -70)) {
                    class200 var16 = this.field4693.method2009(this.field4692, (byte) 2, arg0, -1802914416, true);
                    this.field4694.method1751(var16, 3970, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4675.field1739[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field4675.field1739[arg0];
            if (this.field4663 != null) {
                this.field4677.method2329(arg0, var5, this.field4663, false);
                if (this.field4684[arg0] != 1) {
                    this.field4672++;
                    this.field4684[arg0] = 1;
                }
            }
            if (!var4.field6561) {
                var4.method864(12983);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class375.field4827.reset();
            class375.field4827.update(var5, 0, var5.length - 2);
            int var6 = (int) class375.field4827.getValue();
            if (this.field4675.field1750[arg0] != var6) {
                throw new RuntimeException();
            }
            if (this.field4675.field1749 != null && this.field4675.field1749[arg0] != null) {
                byte[] var7 = this.field4675.field1749[arg0];
                byte[] var8 = class327.method1954(0, var5.length - 2, var5, 802);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4675.field1739[arg0] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field4684[arg0] != 1) {
                this.field4672++;
                this.field4684[arg0] = 1;
            }
            if (!var4.field6561) {
                var4.method864(12983);
            }
            return var4;
        } catch (Exception var17) {
            this.field4684[arg0] = -1;
            var4.method864(12983);
            if (var4.field6561 && !this.field4693.method2013((byte) -70)) {
                class200 var11 = this.field4693.method2009(this.field4692, (byte) 2, arg0, -1802914416, true);
                this.field4694.method1751(var11, 3970, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Luk;[III)Lgea;", line = 564)
    public static final class74 method2134(class260 arg0, int[] arg1, int arg2, int arg3) {
        field4680++;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        float[][] var7 = null;
        if (arg0.field3184 != null) {
            int var8 = arg0.field3171;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; var15++) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            for (int var16 = 0; var16 < arg2; var16++) {
                int var23 = arg1[var16];
                if (arg0.field3184[var23] != -1) {
                    int var24 = arg0.field3184[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg0.field3189[var23];
                        } else if (var25 == 1) {
                            var26 = arg0.field3179[var23];
                        } else {
                            var26 = arg0.field3197[var23];
                        }
                        int var27 = arg0.field3226[var26];
                        int var28 = arg0.field3192[var26];
                        int var29 = arg0.field3210[var26];
                        if (var27 < var9[var24]) {
                            var9[var24] = var27;
                        }
                        if (var10[var24] < var27) {
                            var10[var24] = var27;
                        }
                        if (var28 < var11[var24]) {
                            var11[var24] = var28;
                        }
                        if (var12[var24] < var28) {
                            var12[var24] = var28;
                        }
                        if (var29 < var13[var24]) {
                            var13[var24] = var29;
                        }
                        if (var14[var24] < var29) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            var5 = new int[var8];
            var4 = new int[var8];
            var7 = new float[var8][];
            var6 = new int[var8];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg0.field3218[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg0.field3212[var17];
                        var20 = 64.0F / (float) arg0.field3196[var17];
                        if (var19 == 0) {
                            var22 = 1.0F;
                            var21 = 1.0F;
                        } else if (var19 > 0) {
                            var21 = 1.0F;
                            var22 = (float) var19 / 1024.0F;
                        } else {
                            var21 = (float) (-var19) / 1024.0F;
                            var22 = 1.0F;
                        }
                    } else if (var18 == 2) {
                        var21 = 64.0F / (float) arg0.field3212[var17];
                        var22 = 64.0F / (float) arg0.field3227[var17];
                        var20 = 64.0F / (float) arg0.field3196[var17];
                    } else {
                        var21 = (float) arg0.field3212[var17] / 1024.0F;
                        var20 = (float) arg0.field3196[var17] / 1024.0F;
                        var22 = (float) arg0.field3227[var17] / 1024.0F;
                    }
                    var7[var17] = class37.method176(class327.method1956(arg0.field3214[var17], 255), (byte) -4, arg0.field3188[var17], arg0.field3183[var17], var20, var21, arg0.field3176[var17], var22);
                }
            }
        }
        int var30 = 51 / ((-arg3 - 49) / 57);
        return new class74(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)Lhq;", line = 740)
    public final class158 method2135(boolean arg0) {
        if (!arg0) {
            this.field4681 = null;
        }
        field4671++;
        if (this.field4675 != null) {
            return this.field4675;
        }
        if (this.field4683 == null) {
            if (this.field4693.method2013((byte) -70)) {
                return null;
            }
            this.field4683 = this.field4693.method2009(255, (byte) 0, this.field4692, -1802914416, true);
        }
        if (this.field4683.field6563) {
            return null;
        }
        byte[] var2 = this.field4683.method1206((byte) -80);
        if (this.field4683 instanceof class204) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4675 = new class158(var2, this.field4668, this.field4681);
                if (this.field4675.field1741 != this.field4678) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field4675 = null;
                if (this.field4693.method2013((byte) -70)) {
                    this.field4683 = null;
                } else {
                    this.field4683 = this.field4693.method2009(255, (byte) 0, this.field4692, -1802914416, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4675 = new class158(var2, this.field4668, this.field4681);
            } catch (RuntimeException var4) {
                this.field4693.method2006(255);
                this.field4675 = null;
                if (this.field4693.method2013((byte) -70)) {
                    this.field4683 = null;
                } else {
                    this.field4683 = this.field4693.method2009(255, (byte) 0, this.field4692, -1802914416, true);
                }
                return null;
            }
            if (this.field4676 != null) {
                this.field4677.method2329(this.field4692, var2, this.field4676, false);
            }
        }
        if (this.field4663 != null) {
            this.field4672 = 0;
            this.field4684 = new byte[this.field4675.field1748];
        }
        this.field4683 = null;
        return this.field4675;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)I", line = 836)
    public final int method2136(int arg0, byte arg1) {
        if (arg1 > -79) {
            this.field4696 = -108;
        }
        field4664++;
        class459 var3 = (class459) this.field4694.method1754(false, (long) arg0);
        return var3 == null ? 0 : var3.method1211(100);
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)V", line = 854)
    public static final void method2137(int arg0) {
        class683.field9669 = null;
        class274.field3366 = null;
        class592.field8348 = null;
        field4685++;
        class75.field798 = null;
        class161.field1802 = false;
        if (arg0 == 3) {
            class188.field2238 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "(I)V", line = 874)
    public final void method2138(int arg0) {
        field4691++;
        if (this.field4695 == null || this.method2135(true) == null) {
            return;
        }
        for (class134 var2 = this.field4699.method1719(65280); var2 != null; var2 = this.field4699.method1723(arg0 - 51720)) {
            int var3 = (int) var2.field1522;
            if (var3 < 0 || var3 >= this.field4675.field1748 || this.field4675.field1736[var3] == 0) {
                var2.method864(12983);
            } else {
                if (this.field4684[var3] == 0) {
                    this.method2133(var3, true, 1);
                }
                if (this.field4684[var3] == -1) {
                    this.method2133(var3, true, 2);
                }
                if (this.field4684[var3] == 1) {
                    var2.method864(12983);
                }
            }
        }
        if (arg0 != 31055) {
            method2131((byte) 25);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BI)[B", line = 919)
    public final byte[] method2139(byte arg0, int arg1) {
        field4674++;
        if (arg0 > -79) {
            this.method2128(83);
        }
        class459 var3 = this.method2133(arg1, true, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1206((byte) -25);
            var3.method864(12983);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(IB)V", line = 941)
    public final void method2140(int arg0, byte arg1) {
        field4686++;
        if (this.field4663 == null) {
            return;
        }
        for (class134 var3 = this.field4699.method1719(65280); var3 != null; var3 = this.field4699.method1723(-20665)) {
            if ((long) arg0 == var3.field1522) {
                return;
            }
        }
        int var4 = -127 / ((arg1 + 44) / 44);
        class134 var5 = new class134();
        var5.field1522 = arg0;
        this.field4699.method1721((byte) 92, var5);
    }

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "(I)V", line = 971)
    public final void method2141(int arg0) {
        field4690++;
        if (this.field4663 == null) {
            return;
        }
        if (arg0 != -2147483647) {
            this.method2139((byte) -11, -105);
        }
        this.field4697 = true;
        if (this.field4695 == null) {
            this.field4695 = new class289();
        }
    }

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "(I)I", line = 989)
    public final int method2142(int arg0) {
        int var2 = 117 % ((-arg0 - 47) / 41);
        field4665++;
        return this.field4672;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(ILrfa;Lrfa;Lgd;Loj;I[BIZ)V", line = 1024)
    public class366(int arg0, class199 arg1, class199 arg2, class339 arg3, class379 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field4692 = arg0;
        this.field4663 = arg1;
        if (this.field4663 == null) {
            this.field4698 = false;
        } else {
            this.field4698 = true;
            this.field4695 = new class289();
        }
        this.field4678 = arg7;
        this.field4693 = arg3;
        this.field4676 = arg2;
        this.field4701 = arg8;
        this.field4677 = arg4;
        this.field4681 = arg6;
        this.field4668 = arg5;
        if (this.field4676 != null) {
            this.field4683 = this.field4677.method2328(3, this.field4692, this.field4676);
        }
    }
}
