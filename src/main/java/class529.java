import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class529 {

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    private int field7383 = 32;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "Z")
    private boolean field7390 = false;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "J")
    private long field7391 = class224.method1457((byte) -62);

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    private int field7410 = 0;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "[Lua;")
    private class3[] field7409 = new class3[8];

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    private int field7411 = 0;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "[Lua;")
    private class3[] field7406 = new class3[8];

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    private int field7408 = 0;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "Z")
    private boolean field7404 = true;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "J")
    private long field7403 = 0L;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    private int field7414 = 0;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "J")
    private long field7413 = 0L;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lqk;")
    public static class148 field7385 = new class148(97, 17);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public int field7405;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public int field7407;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    private int field7412;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lua;")
    private class3 field7384;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "[I")
    public int[] field7387;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
    public void method2399() throws Exception {
        field7397++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public final synchronized void method3139(byte arg0) {
        field7381++;
        if (this.field7390) {
            return;
        }
        long var2 = class224.method1457((byte) -62);
        try {
            if (var2 > (this.field7391 + 6000L)) {
                this.field7391 = var2 - 6000L;
            }
            while (var2 > (this.field7391 + 5000L)) {
                this.method3146(false, 256);
                this.field7391 += (256000 / class757.field10509);
                var2 = class224.method1457((byte) -62);
            }
        } catch (Exception var7) {
            this.field7391 = var2;
        }
        if (this.field7387 == null) {
            return;
        }
        try {
            if (this.field7403 != 0L) {
                if (var2 < this.field7403) {
                    return;
                }
                this.method2402(this.field7405);
                this.field7404 = true;
                this.field7403 = 0L;
            }
            if (arg0 < 67) {
                this.method2398();
            }
            int var4 = this.method2403();
            if (this.field7411 - var4 > this.field7410) {
                this.field7410 = this.field7411 - var4;
            }
            int var5 = this.field7412 + this.field7407;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field7405) {
                this.field7405 += 1024;
                if (this.field7405 > 16384) {
                    this.field7405 = 16384;
                }
                this.method2398();
                this.method2402(this.field7405);
                var4 = 0;
                this.field7404 = true;
                if (this.field7405 < (var5 + 256)) {
                    var5 = this.field7405 - 256;
                    this.field7412 = var5 - this.field7407;
                }
            }
            while (var5 > var4) {
                this.method3144(this.field7387, 256);
                this.method2399();
                var4 += 256;
            }
            if (this.field7413 < var2) {
                if (this.field7404) {
                    this.field7404 = false;
                } else if (this.field7410 == 0 && this.field7408 == 0) {
                    this.method2398();
                    this.field7403 = var2 + 2000L;
                    return;
                } else {
                    this.field7412 = Math.min(this.field7408, this.field7410);
                    this.field7408 = this.field7410;
                }
                this.field7410 = 0;
                this.field7413 = var2 + 2000L;
            }
            this.field7411 = var4;
        } catch (Exception var6) {
            this.method2398();
            this.field7403 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILua;B)V")
    private final void method3140(int arg0, class3 arg1, byte arg2) {
        field7388++;
        int var4 = arg0 >> 5;
        if (arg2 <= 121) {
            this.field7410 = -44;
        }
        class3 var5 = this.field7406[var4];
        if (var5 == null) {
            this.field7409[var4] = arg1;
        } else {
            var5.field6 = arg1;
        }
        this.field7406[var4] = arg1;
        arg1.field9 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLvj;)Leia;")
    public static final class748 method3141(byte arg0, class26 arg1) {
        arg1.method194((byte) 119);
        field7395++;
        int var2 = arg1.method194((byte) 119);
        class748 var3 = class614.method3600(var2, (byte) 109);
        var3.field10412 = arg1.method194((byte) 119);
        int var4 = arg1.method194((byte) 119);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method194((byte) 119);
            var3.method20(var6, false, arg1);
        }
        if (arg0 == -43) {
            var3.method23((byte) 67);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static void method3142(boolean arg0) {
        if (arg0) {
            method3142(true);
        }
        field7385 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLua;)V")
    public final synchronized void method3143(byte arg0, class3 arg1) {
        field7394++;
        if (arg0 != -41) {
            this.method3149((byte) 30);
        }
        this.field7384 = arg1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([II)V")
    private final void method3144(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class379.field5336) {
            var3 = arg1 << 1;
        }
        class34.method239(arg0, 0, var3);
        this.field7414 -= arg1;
        if (this.field7384 != null && this.field7414 <= 0) {
            this.field7414 += class757.field10509 >> 4;
            class579.method3449(this.field7384, -43);
            this.method3140(this.field7384.method7(), this.field7384, (byte) 127);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
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
                        class3 var10 = null;
                        class3 var11 = this.field7409[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class276 var12 = var11.field8;
                                if (var12 == null || var12.field3702 <= var8) {
                                    var11.field7 = true;
                                    int var13 = var11.method5();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3702 += var13;
                                    }
                                    if (var4 >= this.field7383) {
                                        break label107;
                                    }
                                    class3 var14 = var11.method8();
                                    if (var14 != null) {
                                        int var15 = var11.field9;
                                        while (var14 != null) {
                                            this.method3140(var15 * var14.method7() >> 8, var14, (byte) 124);
                                            var14 = var11.method4();
                                        }
                                    }
                                    class3 var16 = var11.field6;
                                    var11.field6 = null;
                                    if (var10 == null) {
                                        this.field7409[var7] = var16;
                                    } else {
                                        var10.field6 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field7406[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field6;
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
                class3 var18 = this.field7409[var17];
                this.field7409[var17] = this.field7406[var17] = null;
                while (var18 != null) {
                    class3 var19 = var18.field6;
                    var18.field6 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field7414 < 0) {
            this.field7414 = 0;
        }
        if (this.field7384 != null) {
            this.field7384.method10(arg0, 0, arg1);
        }
        this.field7391 = class224.method1457((byte) -62);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public final synchronized void method3145(int arg0) {
        field7396++;
        if (arg0 >= -57) {
            this.field7412 = -21;
        }
        if (class349.field4430 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class349.field4430.field2533[var3] == this) {
                    class349.field4430.field2533[var3] = null;
                }
                if (class349.field4430.field2533[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class349.field4430.field2529 = true;
                while (class349.field4430.field2531) {
                    class740.method4124(50L, 115);
                }
                class349.field4430 = null;
            }
        }
        this.method2398();
        this.field7390 = true;
        this.field7387 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method2400(Component arg0) throws Exception {
        field7393++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
    private final void method3146(boolean arg0, int arg1) {
        field7398++;
        if (arg0) {
            this.method3149((byte) -106);
        }
        this.field7414 -= arg1;
        if (this.field7414 < 0) {
            this.field7414 = 0;
        }
        if (this.field7384 != null) {
            this.field7384.method6(arg1);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()V")
    public void method2398() {
        field7400++;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "()I")
    public int method2403() throws Exception {
        field7386++;
        return this.field7405;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
    public static final void method3147(boolean arg0) throws class425 {
        if (class589.field8461 == 1) {
            class410.field5731.method632(class694.field9698, class720.field10169);
        } else {
            class410.field5731.method632(0, 0);
        }
        if (!arg0) {
            field7382++;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
    public static final void method3148(int arg0, boolean arg1) {
        field7401++;
        if (class275.field3699 != null) {
            class275.field3699.method2461(false);
            class275.field3699 = null;
        }
        class213.field3003 = 0;
        class294.method1723(true);
        class466.method2780();
        for (int var2 = 0; var2 < 4; var2++) {
            class464.field6351[var2].method922(-119);
        }
        class4.method12(false, true);
        System.gc();
        class205.method1371(2, (byte) -112);
        class555.field7841 = -1;
        class105.field1538 = false;
        class637.method3701(arg0 ^ 0xFFFFEF9A);
        class732.method4071(0, true);
        class585.field8427 = 0;
        class510.field7109 = 0;
        class179.field2535 = 0;
        class734.field10279 = 0;
        class441.field6037 = 0;
        class13.field192 = 0;
        for (int var3 = 0; var3 < class349.field4441.length; var3++) {
            class349.field4441[var3] = null;
        }
        class652.method3769(false);
        for (int var4 = 0; var4 < 2048; var4++) {
            class40.field563[var4] = null;
        }
        class676.field9533 = 0;
        class403.field5587.method1385((byte) -97);
        class287.field3776 = 0;
        class118.field1631.method1385((byte) -97);
        class345.method1981(108);
        class19.field236 = 0;
        class554.field7826.method4093(true);
        class154.method976(arg0);
        class534.method3191(arg0 + 7);
        class122.field1667 = null;
        class651.field9206 = 0L;
        if (arg1) {
            class647.method3754(12, true);
            return;
        }
        class647.method3754(3, true);
        try {
            class208.method1378("loggedout", class622.field8847, -9875);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "()V")
    public void method2401() throws Exception {
        field7389++;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public void method2402(int arg0) throws Exception {
        field7392++;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
    public final synchronized void method3149(byte arg0) {
        this.field7404 = true;
        if (arg0 != -20) {
            this.field7405 = 7;
        }
        field7399++;
        try {
            this.method2401();
        } catch (Exception var2) {
            this.method2398();
            this.field7403 = class224.method1457((byte) -62) + 2000L;
        }
    }
}
