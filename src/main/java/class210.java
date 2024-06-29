import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class210 {

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    private int field4031 = 32;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "J")
    private long field4032 = class24.method165(128);

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "[Lvh;")
    private class203[] field4044 = new class203[8];

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    private int field4042 = 0;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Z")
    private boolean field4043 = true;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    private int field4045 = 0;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    private int field4046 = 0;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    private int field4050 = 0;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "[Lvh;")
    private class203[] field4051 = new class203[8];

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "J")
    private long field4049 = 0L;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "J")
    private long field4052 = 0L;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Ltg;")
    private static class184 field4026 = class135.method812("wishes to trade with you)3", 3);

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Ltg;")
    public static class184 field4028 = class135.method812("mapdots", 3);

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Ltg;")
    public static class184 field4025 = field4026;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Ltg;")
    public static class184 field4022 = class135.method812("sich mit einer anderen Welt zu verbinden)3", 3);

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Ltg;")
    private static class184 field4035 = class135.method812("Walk here", 3);

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Lr;")
    public static class159 field4037 = null;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "Ltg;")
    public static class184 field4054 = field4035;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    private int field4053;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Lvh;")
    private class203 field4033;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "[I")
    public int[] field4041;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILvh;)V")
    private final void method1330(int arg0, int arg1, class203 arg2) {
        if (arg1 != 1585301701) {
            return;
        }
        int var4 = arg0 >> 5;
        field4038++;
        class203 var5 = this.field4051[var4];
        if (var5 == null) {
            this.field4044[var4] = arg2;
        } else {
            var5.field3914 = arg2;
        }
        this.field4051[var4] = arg2;
        arg2.field3916 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
    public final synchronized void method1331(boolean arg0) {
        if (arg0) {
            return;
        }
        this.field4043 = true;
        field4024++;
        try {
            this.method415();
        } catch (Exception var2) {
            this.method419();
            this.field4049 = class24.method165(128) + 2000L;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
    public void method416() throws Exception {
        field4016++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIB)V")
    public static final void method1332(int arg0, int arg1, byte arg2) {
        if (arg2 != 55) {
            method1333(false, 110);
        }
        int var3 = 0;
        class179[] var4 = class2.field57;
        while (var3 < var4.length) {
            class179 var5 = var4[var3];
            if (var5 != null && var5.field3413 == 2) {
                class46.method267((var5.field3407 - class57.field1020 << 7) + var5.field3412, var5.field3409 * 2, -1, (var5.field3405 - class129.field2331 << 7) + var5.field3410);
                if (class20.field383 > -1 && class161.field2903 % 20 < 10) {
                    class120.field2159[var5.field3411].method835(class20.field383 + arg1 - 12, arg0 - (-class88.field1655 + 28));
                }
            }
            var3++;
        }
        field4030++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)Ltg;")
    public static final class184 method1333(boolean arg0, int arg1) {
        field4036++;
        return class174.field3298[arg1].method1159(arg0) > 0 ? class144.method884(0, new class184[] { class38.field719[arg1], class78.field1417, class174.field3298[arg1] }) : class38.field719[arg1];
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLvh;)V")
    public final synchronized void method1334(byte arg0, class203 arg1) {
        field4023++;
        if (arg0 <= 38) {
            this.method1339((byte) -119);
        }
        this.field4033 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public void method420(int arg0) throws Exception {
        field4020++;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()V")
    public void method419() {
        field4019++;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "()V")
    public void method415() throws Exception {
        field4040++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V")
    private final void method1335(int arg0, boolean arg1) {
        field4017++;
        this.field4050 -= arg0;
        if (this.field4050 < 0) {
            this.field4050 = 0;
        }
        if (!arg1) {
            this.method1337(true);
        }
        if (this.field4033 != null) {
            this.field4033.method134(arg0);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static void method1336(int arg0) {
        field4025 = null;
        field4028 = null;
        field4054 = null;
        field4022 = null;
        field4026 = null;
        field4035 = null;
        if (arg0 != 24775) {
            method1332(-13, 14, (byte) -94);
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "()I")
    public int method417() throws Exception {
        field4027++;
        return this.field4047;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V")
    public final void method1337(boolean arg0) {
        field4029++;
        this.field4043 = true;
        if (arg0) {
            this.method1334((byte) -8, null);
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public final synchronized void method1338(int arg0) {
        field4039++;
        if (this.field4041 == null) {
            return;
        }
        if (arg0 != 6555) {
            this.field4050 = 112;
        }
        long var2 = class24.method165(arg0 - 6427);
        try {
            if (this.field4049 != 0L) {
                if (this.field4049 > var2) {
                    return;
                }
                this.method420(this.field4047);
                this.field4049 = 0L;
                this.field4043 = true;
            }
            int var4 = this.method417();
            int var5 = this.field4048 + this.field4053;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field4046 - var4 > this.field4045) {
                this.field4045 = this.field4046 - var4;
            }
            if (var5 + 256 > this.field4047) {
                this.field4047 += 1024;
                if (this.field4047 > 16384) {
                    this.field4047 = 16384;
                }
                this.method419();
                var4 = 0;
                this.method420(this.field4047);
                if (var5 + 256 > this.field4047) {
                    var5 = this.field4047 - 256;
                    this.field4053 = var5 - this.field4048;
                }
                this.field4043 = true;
            }
            while (var5 > var4) {
                this.method1340(this.field4041, 256);
                this.method416();
                var4 += 256;
            }
            if (this.field4052 < var2) {
                if (this.field4043) {
                    this.field4043 = false;
                } else if (this.field4045 == 0 && this.field4042 == 0) {
                    this.method419();
                    this.field4049 = var2 + 2000L;
                    return;
                } else {
                    this.field4053 = Math.min(this.field4042, this.field4045);
                    this.field4042 = this.field4045;
                }
                this.field4045 = 0;
                this.field4052 = var2 + 2000L;
            }
            this.field4046 = var4;
        } catch (Exception var7) {
            this.method419();
            this.field4049 = var2 + 2000L;
        }
        try {
            if (this.field4032 + 500000L < var2) {
                var2 = this.field4032;
            }
            while (this.field4032 + 5000L < var2) {
                this.method1335(256, true);
                this.field4032 += 256000 / field4018;
            }
        } catch (Exception var6) {
            this.field4032 = var2;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public final synchronized void method1339(byte arg0) {
        if (class174.field3302 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class174.field3302.field3168[var3] == this) {
                    class174.field3302.field3168[var3] = null;
                }
                if (class174.field3302.field3168[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class174.field3302.field3176 = true;
                while (class174.field3302.field3154) {
                    class151.method926((byte) 101, 50L);
                }
                class174.field3302 = null;
            }
        }
        field4034++;
        this.method419();
        this.field4041 = null;
        int var4 = 27 % ((-arg0 - 69) / 54);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method418(Component arg0) throws Exception {
        field4021++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([II)V")
    private final void method1340(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class120.field2167) {
            var3 = arg1 << 1;
        }
        class93.method538(arg0, 0, var3);
        this.field4050 -= arg1;
        if (this.field4033 != null && this.field4050 <= 0) {
            this.field4050 += field4018 >> 4;
            class16.method98(this.field4033, 87);
            this.method1330(this.field4033.method987(), 1585301701, this.field4033);
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
                        class203 var10 = null;
                        class203 var11 = this.field4044[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class53 var12 = var11.field3917;
                                if (var12 == null || var12.field959 <= var8) {
                                    var11.field3915 = true;
                                    int var13 = var11.method136();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field959 += var13;
                                    }
                                    if (var4 >= this.field4031) {
                                        break label107;
                                    }
                                    class203 var14 = var11.method137();
                                    if (var14 != null) {
                                        int var15 = var11.field3916;
                                        while (var14 != null) {
                                            this.method1330(var15 * var14.method987() >> 8, 1585301701, var14);
                                            var14 = var11.method145();
                                        }
                                    }
                                    class203 var16 = var11.field3914;
                                    var11.field3914 = null;
                                    if (var10 == null) {
                                        this.field4044[var7] = var16;
                                    } else {
                                        var10.field3914 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4051[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3914;
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
                class203 var18 = this.field4044[var17];
                this.field4044[var17] = this.field4051[var17] = null;
                while (var18 != null) {
                    class203 var19 = var18.field3914;
                    var18.field3914 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4050 < 0) {
            this.field4050 = 0;
        }
        if (this.field4033 != null) {
            this.field4033.method138(arg0, 0, arg1);
        }
        this.field4032 = class24.method165(128);
    }
}
