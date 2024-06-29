import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class493 {

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    private int field7207 = 32;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "Z")
    private boolean field7209 = false;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "J")
    private long field7194 = class173.method1134(true);

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "J")
    private long field7212 = 0L;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    private int field7213 = 0;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "Z")
    private boolean field7217 = true;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "[Lar;")
    private class3[] field7216 = new class3[8];

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "[Lar;")
    private class3[] field7214 = new class3[8];

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
    private int field7220 = 0;

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "J")
    private long field7219 = 0L;

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "I")
    private int field7221 = 0;

    @OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
    private int field7223 = 0;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    private int field7215;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
    public int field7218;

    @OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
    public int field7222;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "Lar;")
    private class3 field7203;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "[I")
    public int[] field7205;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "[I")
    public static int[] field7206;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
    public void method2() {
        field7201++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
    public final synchronized void method2945(byte arg0) {
        field7208++;
        if (class179.field2299 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class179.field2299.field4025[var3] == this) {
                    class179.field2299.field4025[var3] = null;
                }
                if (class179.field2299.field4025[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class179.field2299.field4026 = true;
                while (class179.field2299.field4027) {
                    class463.method2773(50L, 78);
                }
                class179.field2299 = null;
            }
        }
        this.method2();
        this.field7205 = null;
        this.field7209 = true;
        if (arg0 <= 20) {
            this.field7218 = -117;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lar;II)V")
    private final void method2946(class3 arg0, int arg1, int arg2) {
        field7210++;
        int var4 = arg1 >> 5;
        if (arg2 != 0) {
            this.field7221 = -101;
        }
        class3 var5 = this.field7216[var4];
        if (var5 == null) {
            this.field7214[var4] = arg0;
        } else {
            var5.field21 = arg0;
        }
        this.field7216[var4] = arg0;
        arg0.field22 = arg1;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public final synchronized void method2947(int arg0) {
        field7196++;
        if (this.field7209) {
            return;
        }
        long var2 = class173.method1134(true);
        try {
            if (var2 > this.field7194 + 500000L) {
                this.field7194 = var2 - 500000L;
            }
            while (var2 > (this.field7194 + 5000L)) {
                this.method2953(115, 256);
                this.field7194 += (256000 / class426.field5847);
            }
        } catch (Exception var8) {
            this.field7194 = var2;
        }
        if (this.field7205 == null) {
            return;
        }
        try {
            if (this.field7212 != 0L) {
                if (this.field7212 > var2) {
                    return;
                }
                this.method6(this.field7222);
                this.field7217 = true;
                this.field7212 = 0L;
            }
            int var4 = -10 / ((-arg0 - 8) / 36);
            int var5 = this.method1();
            if (this.field7220 < (this.field7213 - var5)) {
                this.field7220 = this.field7213 - var5;
            }
            int var6 = this.field7218 + this.field7215;
            if ((var6 + 256) > 16384) {
                var6 = 16128;
            }
            if (var6 + 256 > this.field7222) {
                this.field7222 += 1024;
                if (this.field7222 > 16384) {
                    this.field7222 = 16384;
                }
                this.method2();
                var5 = 0;
                this.method6(this.field7222);
                if (this.field7222 < var6 + 256) {
                    var6 = this.field7222 - 256;
                    this.field7215 = var6 - this.field7218;
                }
                this.field7217 = true;
            }
            while (var5 < var6) {
                this.method2948(this.field7205, 256);
                var5 += 256;
                this.method3();
            }
            if (this.field7219 < var2) {
                if (this.field7217) {
                    this.field7217 = false;
                } else if (this.field7220 == 0 && this.field7223 == 0) {
                    this.method2();
                    this.field7212 = var2 + 2000L;
                    return;
                } else {
                    this.field7215 = Math.min(this.field7223, this.field7220);
                    this.field7223 = this.field7220;
                }
                this.field7220 = 0;
                this.field7219 = var2 + 2000L;
            }
            this.field7213 = var5;
        } catch (Exception var7) {
            this.method2();
            this.field7212 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method4(Component arg0) throws Exception {
        field7200++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "([II)V")
    private final void method2948(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class414.field5502) {
            var3 = arg1 << 1;
        }
        class526.method3112(arg0, 0, var3);
        this.field7221 -= arg1;
        if (this.field7203 != null && this.field7221 <= 0) {
            this.field7221 += class426.field5847 >> 4;
            class125.method790(0, this.field7203);
            this.method2946(this.field7203, this.field7203.method14(), 0);
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
                        class3 var11 = this.field7214[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class170 var12 = var11.field20;
                                if (var12 == null || var12.field2213 <= var8) {
                                    var11.field23 = true;
                                    int var13 = var11.method13();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2213 += var13;
                                    }
                                    if (var4 >= this.field7207) {
                                        break label107;
                                    }
                                    class3 var14 = var11.method15();
                                    if (var14 != null) {
                                        int var15 = var11.field22;
                                        while (var14 != null) {
                                            this.method2946(var14, var15 * var14.method14() >> 8, 0);
                                            var14 = var11.method16();
                                        }
                                    }
                                    class3 var16 = var11.field21;
                                    var11.field21 = null;
                                    if (var10 == null) {
                                        this.field7214[var7] = var16;
                                    } else {
                                        var10.field21 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field7216[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field21;
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
                class3 var18 = this.field7214[var17];
                this.field7214[var17] = this.field7216[var17] = null;
                while (var18 != null) {
                    class3 var19 = var18.field21;
                    var18.field21 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field7221 < 0) {
            this.field7221 = 0;
        }
        if (this.field7203 != null) {
            this.field7203.method17(arg0, 0, arg1);
        }
        this.field7194 = class173.method1134(true);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "()V")
    public void method3() throws Exception {
        field7202++;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
    public static void method2949(int arg0) {
        field7206 = null;
        if (arg0 != -17377) {
            method2949(58);
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)V")
    public final void method2950(byte arg0) {
        int var2 = 60 % ((arg0 - 82) / 41);
        this.field7217 = true;
        field7193++;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "()I")
    public int method1() throws Exception {
        field7199++;
        return this.field7222;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lar;I)V")
    public final synchronized void method2951(class3 arg0, int arg1) {
        if (arg1 == 0) {
            this.field7203 = arg0;
            field7204++;
        }
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "()V")
    public void method5() throws Exception {
        field7211++;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
    public final synchronized void method2952(int arg0) {
        this.field7217 = true;
        field7195++;
        try {
            this.method5();
            if (arg0 != 2000) {
                this.method2();
            }
        } catch (Exception var2) {
            this.method2();
            this.field7212 = class173.method1134(true) + 2000L;
        }
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)V")
    public void method6(int arg0) throws Exception {
        field7198++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
    private final void method2953(int arg0, int arg1) {
        this.field7221 -= arg1;
        field7197++;
        if (this.field7221 < 0) {
            this.field7221 = 0;
        }
        if (this.field7203 != null) {
            this.field7203.method18(arg1);
        }
        if (arg0 < 76) {
            this.field7221 = 33;
        }
    }
}
