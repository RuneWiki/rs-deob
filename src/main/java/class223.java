import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class223 {

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    private int field3320 = 32;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "J")
    private long field3329 = class287.method1928(27332);

    @OriginalMember(owner = "client!u", name = "u", descriptor = "[Lfb;")
    private class50[] field3335 = new class50[8];

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    private int field3338 = 0;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "[Lfb;")
    private class50[] field3340 = new class50[8];

    @OriginalMember(owner = "client!u", name = "v", descriptor = "J")
    private long field3336 = 0L;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    private int field3345 = 0;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    private int field3347 = 0;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "J")
    private long field3342 = 0L;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "Z")
    private boolean field3346 = true;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    private int field3343 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public int field3337;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    private int field3339;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public int field3344;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Lfb;")
    private class50 field3327;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[I")
    public int[] field3330;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public final synchronized void method1448(int arg0) {
        if (arg0 >= -77) {
            this.method1449((byte) 53);
        }
        field3326++;
        this.field3346 = true;
        try {
            this.method48();
        } catch (Exception var2) {
            this.method47();
            this.field3336 = class287.method1928(27332) + 2000L;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public void method48() throws Exception {
        field3325++;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
    public int method44() throws Exception {
        field3328++;
        return this.field3337;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public final synchronized void method1449(byte arg0) {
        field3322++;
        if (this.field3330 == null) {
            return;
        }
        long var2 = class287.method1928(27332);
        try {
            if (this.field3336 != 0L) {
                if (var2 < this.field3336) {
                    return;
                }
                this.method43(this.field3337);
                this.field3336 = 0L;
                this.field3346 = true;
            }
            int var4 = this.method44();
            if (this.field3347 - var4 > this.field3338) {
                this.field3338 = this.field3347 - var4;
            }
            int var5 = this.field3344 + this.field3339;
            if (arg0 <= 19) {
                method1453(true);
            }
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3337) {
                this.field3337 += 1024;
                var4 = 0;
                if (this.field3337 > 16384) {
                    this.field3337 = 16384;
                }
                this.method47();
                this.method43(this.field3337);
                if ((var5 + 256) > this.field3337) {
                    var5 = this.field3337 - 256;
                    this.field3339 = var5 - this.field3344;
                }
                this.field3346 = true;
            }
            while (var4 < var5) {
                var4 += 256;
                this.method1451(this.field3330, 256);
                this.method46();
            }
            if (this.field3342 < var2) {
                if (this.field3346) {
                    this.field3346 = false;
                } else if (this.field3338 == 0 && this.field3345 == 0) {
                    this.method47();
                    this.field3336 = var2 + 2000L;
                    return;
                } else {
                    this.field3339 = Math.min(this.field3345, this.field3338);
                    this.field3345 = this.field3338;
                }
                this.field3338 = 0;
                this.field3342 = var2 + 2000L;
            }
            this.field3347 = var4;
        } catch (Exception var7) {
            this.method47();
            this.field3336 = var2 + 2000L;
        }
        try {
            if ((this.field3329 + 500000L) < var2) {
                var2 = this.field3329;
            }
            while (this.field3329 + 5000L < var2) {
                this.method1454(false, 256);
                this.field3329 += (long) (256000 / class276.field4426);
            }
        } catch (Exception var6) {
            this.field3329 = var2;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lfb;I)V")
    public final synchronized void method1450(class50 arg0, int arg1) {
        this.field3327 = arg0;
        if (arg1 != 2000) {
            field3332 = -30;
        }
        field3321++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method45(Component arg0) throws Exception {
        field3318++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([II)V")
    private final void method1451(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class24.field323) {
            var3 = arg1 << 1;
        }
        class164.method1095(arg0, 0, var3);
        this.field3343 -= arg1;
        if (this.field3327 != null && this.field3343 <= 0) {
            this.field3343 += class276.field4426 >> 4;
            class250.method1645(3230, this.field3327);
            this.method1456(this.field3327, this.field3327.method341(), false);
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
                        class50 var10 = null;
                        class50 var11 = this.field3340[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class125 var12 = var11.field744;
                                if (var12 == null || var12.field1811 <= var8) {
                                    var11.field745 = true;
                                    int var13 = var11.method278();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1811 += var13;
                                    }
                                    if (var4 >= this.field3320) {
                                        break label107;
                                    }
                                    class50 var14 = var11.method276();
                                    if (var14 != null) {
                                        int var15 = var11.field743;
                                        while (var14 != null) {
                                            this.method1456(var14, var15 * var14.method341() >> 8, false);
                                            var14 = var11.method283();
                                        }
                                    }
                                    class50 var16 = var11.field742;
                                    var11.field742 = null;
                                    if (var10 == null) {
                                        this.field3340[var7] = var16;
                                    } else {
                                        var10.field742 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3335[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field742;
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
                class50 var18 = this.field3340[var17];
                this.field3340[var17] = this.field3335[var17] = null;
                while (var18 != null) {
                    class50 var19 = var18.field742;
                    var18.field742 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3343 < 0) {
            this.field3343 = 0;
        }
        if (this.field3327 != null) {
            this.field3327.method277(arg0, 0, arg1);
        }
        this.field3329 = class287.method1928(27332);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ID)V")
    public static final void method1452(int arg0, double arg1) {
        field3316++;
        if (arg0 >= -82) {
            field3332 = -82;
        }
        if (class226.field3403 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class54.field818[var3] = var4 <= 255 ? var4 : 255;
        }
        class226.field3403 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)I")
    public static final int method1453(boolean arg0) {
        field3333++;
        if (!arg0) {
            method1452(-33, 0.3926212285216929D);
        }
        if ((double) class9.field166 == 3.0D) {
            return 37;
        } else if ((double) class9.field166 == 4.0D) {
            return 50;
        } else if ((double) class9.field166 == 6.0D) {
            return 75;
        } else if ((double) class9.field166 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)V")
    private final void method1454(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        this.field3343 -= arg1;
        field3323++;
        if (this.field3343 < 0) {
            this.field3343 = 0;
        }
        if (this.field3327 != null) {
            this.field3327.method281(arg1);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V")
    public final void method1455(boolean arg0) {
        this.field3346 = true;
        field3324++;
        if (arg0) {
            this.method1449((byte) 10);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "()V")
    public void method47() {
        field3331++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lfb;IZ)V")
    private final void method1456(class50 arg0, int arg1, boolean arg2) {
        field3315++;
        if (arg2) {
            this.method1450((class50) null, 66);
        }
        int var4 = arg1 >> 5;
        class50 var5 = this.field3335[var4];
        if (var5 == null) {
            this.field3340[var4] = arg0;
        } else {
            var5.field742 = arg0;
        }
        this.field3335[var4] = arg0;
        arg0.field743 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(Z)V")
    public final synchronized void method1457(boolean arg0) {
        if (!arg0) {
            this.method1451((int[]) null, 74);
        }
        field3319++;
        if (class286.field4546 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class286.field4546.field167[var3] == this) {
                    class286.field4546.field167[var3] = null;
                }
                if (class286.field4546.field167[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class286.field4546.field170 = true;
                while (class286.field4546.field168) {
                    class98.method660(50L, -105);
                }
                class286.field4546 = null;
            }
        }
        this.method47();
        this.field3330 = null;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "()V")
    public void method46() throws Exception {
        field3317++;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
    public void method43(int arg0) throws Exception {
        field3334++;
    }
}
