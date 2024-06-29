import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class192 {

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Lrg;")
    private class217 field3392 = new class217();

    @OriginalMember(owner = "client!si", name = "u", descriptor = "Lrg;")
    private class217 field3404 = new class217();

    @OriginalMember(owner = "client!si", name = "x", descriptor = "Lrg;")
    private class217 field3407 = new class217();

    @OriginalMember(owner = "client!si", name = "y", descriptor = "Lrg;")
    private class217 field3408 = new class217();

    @OriginalMember(owner = "client!si", name = "A", descriptor = "Lfk;")
    private class14 field3410 = new class14(4);

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public volatile int field3415 = 0;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "B")
    private byte field3418 = 0;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public volatile int field3417 = 0;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "Lfk;")
    private class14 field3416 = new class14(8);

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[Leb;")
    public static class230[] field3388 = new class230[500];

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Leb;")
    private static class230 field3395 = class68.method589(0, "Connected to update server");

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Leb;")
    public static class230 field3398 = class68.method589(0, "mapdots");

    @OriginalMember(owner = "client!si", name = "p", descriptor = "[I")
    public static int[] field3399 = new int[25];

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field3400 = 0;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Leb;")
    public static class230 field3389 = field3395;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    private int field3414;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "J")
    private long field3412;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "Lka;")
    public static class245 field3413;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "Loh;")
    private class261 field3411;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "Luh;")
    private class99 field3419;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[I")
    public static int[] field3384;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIII)V")
    public static final void method1361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = class176.method1283(arg0, arg1, arg5);
        if (arg4 != 2) {
            method1367(-111);
        }
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x31F2F5) >> 20;
            int var9 = ((int) var6 & 0x7CBF3) >> 14;
            int var10 = arg3;
            if (var6 > 0L) {
                var10 = arg2;
            }
            int var11 = (52736 - arg5 * 512) * 4 + ((arg1 * 4) + 24624);
            int var12 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            int[] var13 = class87.field1516;
            class194 var14 = class251.method1776(var12, arg4 + 65278);
            if (var14.field3467 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var13[var11] = var10;
                        var13[var11 + 512] = var10;
                        var13[var11 + 1024] = var10;
                        var13[var11 + 1536] = var10;
                    } else if (var8 == 1) {
                        var13[var11] = var10;
                        var13[var11 + 1] = var10;
                        var13[var11 + 2] = var10;
                        var13[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var13[var11 + 3] = var10;
                        var13[var11 + 512 + 3] = var10;
                        var13[var11 + 1027] = var10;
                        var13[var11 + 1539] = var10;
                    } else if (var8 == 3) {
                        var13[var11 + 1536] = var10;
                        var13[var11 + 1536 + 1] = var10;
                        var13[var11 + 1536 + 2] = var10;
                        var13[var11 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var13[var11] = var10;
                    } else if (var8 == 1) {
                        var13[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var13[var11 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var13[var11 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var13[var11] = var10;
                        var13[var11 + 512] = var10;
                        var13[var11 + 1024] = var10;
                        var13[var11 + 1536] = var10;
                    } else if (var8 == 0) {
                        var13[var11] = var10;
                        var13[var11 + 1] = var10;
                        var13[var11 + 2] = var10;
                        var13[var11 + 3] = var10;
                    } else if (var8 == 1) {
                        var13[var11 + 3] = var10;
                        var13[var11 + 512 + 3] = var10;
                        var13[var11 + 1024 + 3] = var10;
                        var13[var11 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var13[var11 + 1536] = var10;
                        var13[var11 + 1537] = var10;
                        var13[var11 + 2 + 1536] = var10;
                        var13[var11 + 1536 + 3] = var10;
                    }
                }
            } else {
                class69 var15 = null;
                if (!var14.field3486) {
                    var15 = class238.field4120[var14.field3467];
                } else if (var8 == 0) {
                    var15 = class238.field4120[var14.field3467];
                } else if (var8 == 1) {
                    var15 = class96.field1731[var14.field3467];
                } else if (var8 == 2) {
                    var15 = class243.field4185[var14.field3467];
                } else if (var8 == 3) {
                    var15 = class66.field1234[var14.field3467];
                }
                if (var15 != null) {
                    int var16 = (var14.field3500 * 4 - var15.field861) / 2;
                    int var17 = (var14.field3476 * 4 - var15.field867) / 2;
                    var15.method405(arg1 * 4 + var16 + 48, (-arg5 - var14.field3476 + 104) * 4 + 48 + var17);
                }
            }
        }
        long var18 = class178.method1297(arg0, arg1, arg5);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class194 var23 = class251.method1776(var22, arg4 + 65278);
            if (var23.field3467 != -1) {
                class69 var24 = null;
                if (!var23.field3486) {
                    var24 = class238.field4120[var23.field3467];
                } else if (var20 == 0) {
                    var24 = class238.field4120[var23.field3467];
                } else if (var20 == 1) {
                    var24 = class96.field1731[var23.field3467];
                } else if (var20 == 2) {
                    var24 = class243.field4185[var23.field3467];
                } else if (var20 == 3) {
                    var24 = class66.field1234[var23.field3467];
                }
                if (var24 != null) {
                    int var25 = (var23.field3500 * 4 - var24.field861) / 2;
                    int var26 = (var23.field3476 * 4 - var24.field867) / 2;
                    var24.method405(48 - (-(arg1 * 4) - var25), (-arg5 + 104 + -var23.field3476) * 4 + 48 + var26);
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                if (var18 > 0L) {
                    var27 = 15597568;
                }
                int[] var28 = class87.field1516;
                int var29 = arg1 * 4 + ((-(arg5 * 512) + 52736) * 4) + 24624;
                if (var20 == 0 || var20 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1 + 1024] = var27;
                    var28[var29 + 512 + 2] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 1 + 512] = var27;
                    var28[var29 + 1024 + 2] = var27;
                    var28[var29 + 1539] = var27;
                }
            }
        }
        long var30 = class191.method1359(arg0, arg1, arg5);
        field3390++;
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) var30 >> 20 & 0x3;
        int var33 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class194 var34 = class251.method1776(var33, 65280);
        if (var34.field3467 == -1) {
            return;
        }
        class69 var35 = null;
        if (!var34.field3486) {
            var35 = class238.field4120[var34.field3467];
        } else if (var32 == 0) {
            var35 = class238.field4120[var34.field3467];
        } else if (var32 == 1) {
            var35 = class96.field1731[var34.field3467];
        } else if (var32 == 2) {
            var35 = class243.field4185[var34.field3467];
        } else if (var32 == 3) {
            var35 = class66.field1234[var34.field3467];
        }
        if (var35 != null) {
            int var36 = (var34.field3500 * 4 - var35.field861) / 2;
            int var37 = (var34.field3476 * 4 - var35.field867) / 2;
            var35.method405(48 - (-(arg1 * 4) - var36), 48 - (-((104 - arg5 + -var34.field3476) * 4) + -var37));
            return;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
    public final void method1362(int arg0, boolean arg1) {
        field3394++;
        if (this.field3411 == null) {
            return;
        }
        try {
            this.field3410.field318 = 0;
            int var3 = 43 / ((arg0 - 33) / 49);
            this.field3410.method170((byte) 113, arg1 ? 2 : 3);
            this.field3410.method164(0, (byte) -76);
            this.field3411.method1817(this.field3410.field269, 0, -12152, 4);
        } catch (IOException var5) {
            try {
                this.field3411.method1818(-2);
            } catch (Exception var4) {
            }
            this.field3417++;
            this.field3411 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Z")
    public final boolean method1363(boolean arg0) {
        field3406++;
        if (arg0) {
            this.method1368(-27);
        }
        return this.method1365((byte) 37) >= 20;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Loh;ZB)V")
    public final void method1364(class261 arg0, boolean arg1, byte arg2) {
        if (this.field3411 != null) {
            try {
                this.field3411.method1818(-2);
            } catch (Exception var8) {
            }
            this.field3411 = null;
        }
        this.field3411 = arg0;
        field3403++;
        if (arg2 > -127) {
            field3389 = null;
        }
        this.method1373(3);
        this.method1362(-70, arg1);
        this.field3416.field318 = 0;
        this.field3419 = null;
        while (true) {
            class99 var4 = (class99) this.field3404.method1498(0);
            if (var4 == null) {
                while (true) {
                    class99 var5 = (class99) this.field3408.method1498(0);
                    if (var5 == null) {
                        if (this.field3418 != 0) {
                            try {
                                this.field3410.field318 = 0;
                                this.field3410.method170((byte) 114, 4);
                                this.field3410.method170((byte) 114, this.field3418);
                                this.field3410.method181(-20053, 0);
                                this.field3411.method1817(this.field3410.field269, 0, -12152, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field3411.method1818(-2);
                                } catch (Exception var6) {
                                }
                                this.field3411 = null;
                                this.field3417++;
                            }
                        }
                        this.field3414 = 0;
                        this.field3412 = class201.method1419(5);
                        return;
                    }
                    this.field3407.method1494(-28, var5);
                }
            }
            this.field3392.method1494(46, var4);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)I")
    private final int method1365(byte arg0) {
        if (arg0 != 37) {
            this.method1365((byte) 3);
        }
        field3409++;
        return this.field3407.method1499(arg0 ^ 0xFFFFFFBE) + this.field3408.method1499(-101);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLkk;)V")
    public static final void method1366(boolean arg0, class223 arg1) {
        if (arg0) {
            field3388 = null;
        }
        class265.field4708 = arg1;
        field3402++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1367(int arg0) {
        field3395 = null;
        field3389 = null;
        field3398 = null;
        field3384 = null;
        field3388 = null;
        int var1 = -10 % ((-arg0 - 37) / 55);
        field3399 = null;
        field3413 = null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)Z")
    public final boolean method1368(int arg0) {
        field3386++;
        if (arg0 == 11358) {
            return this.method1372(false) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
    public final void method1369(int arg0) {
        field3397++;
        if (arg0 < -123) {
            this.field3418 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
            this.field3415++;
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
    public final void method1370(int arg0) {
        field3387++;
        if (this.field3411 == null) {
            return;
        }
        try {
            if (arg0 >= 80) {
                this.field3410.field318 = 0;
                this.field3410.method170((byte) 124, 7);
                this.field3410.method164(0, (byte) -76);
                this.field3411.method1817(this.field3410.field269, 0, -12152, 4);
            }
        } catch (IOException var3) {
            try {
                this.field3411.method1818(-2);
            } catch (Exception var2) {
            }
            this.field3411 = null;
            this.field3417++;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)Z")
    public final boolean method1371(byte arg0) {
        if (this.field3411 != null) {
            long var2 = class201.method1419(5);
            int var4 = (int) (var2 - this.field3412);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3414 += var4;
            this.field3412 = var2;
            if (this.field3414 > 30000) {
                try {
                    this.field3411.method1818(-2);
                } catch (Exception var27) {
                }
                this.field3411 = null;
            }
        }
        field3405++;
        if (this.field3411 == null) {
            return this.method1372(false) == 0 && this.method1365((byte) 37) == 0;
        }
        try {
            for (class99 var5 = (class99) this.field3392.method1497(true); var5 != null; var5 = (class99) this.field3392.method1495((byte) 36)) {
                this.field3410.field318 = 0;
                this.field3410.method170((byte) 117, 1);
                this.field3410.method164((int) var5.field4534, (byte) -76);
                this.field3411.method1817(this.field3410.field269, 0, -12152, 4);
                this.field3404.method1494(-127, var5);
            }
            for (class99 var6 = (class99) this.field3407.method1497(true); var6 != null; var6 = (class99) this.field3407.method1495((byte) 36)) {
                this.field3410.field318 = 0;
                this.field3410.method170((byte) 112, 0);
                this.field3410.method164((int) var6.field4534, (byte) -76);
                this.field3411.method1817(this.field3410.field269, 0, -12152, 4);
                this.field3408.method1494(104, var6);
            }
            int var7 = 0;
            if (arg0 >= -105) {
                return true;
            }
            while (var7 < 100) {
                int var8 = this.field3411.method1816(0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3414 = 0;
                byte var9 = 0;
                if (this.field3419 == null) {
                    var9 = 8;
                } else if (this.field3419.field1828 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field3416.field318;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field3411.method1819(var10, this.field3416.field318, this.field3416.field269, (byte) 111);
                    if (this.field3418 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field3416.field269[this.field3416.field318 + var11] = (byte) class168.method1239(this.field3416.field269[this.field3416.field318 + var11], this.field3418);
                        }
                    }
                    this.field3416.field318 += var10;
                    if (var9 <= this.field3416.field318) {
                        if (this.field3419 == null) {
                            this.field3416.field318 = 0;
                            int var12 = this.field3416.method200(255);
                            int var13 = this.field3416.method161(4);
                            int var14 = this.field3416.method200(255);
                            boolean var15 = (var14 & 0x80) != 0;
                            int var16 = this.field3416.method187((byte) 61);
                            long var17 = (long) ((var12 << 16) + var13);
                            int var19 = var14 & 0x7F;
                            Object var20 = null;
                            class99 var21;
                            if (var15) {
                                for (var21 = (class99) this.field3408.method1497(true); var21 != null && var21.field4534 != var17; var21 = (class99) this.field3408.method1495((byte) 36)) {
                                }
                            } else {
                                for (var21 = (class99) this.field3404.method1497(true); var21 != null && var21.field4534 != var17; var21 = (class99) this.field3404.method1495((byte) 36)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var19 == 0 ? 5 : 9;
                            this.field3419 = var21;
                            this.field3419.field1834 = new class14(var16 - (-this.field3419.field1829 - var22));
                            this.field3419.field1834.method170((byte) 125, var19);
                            this.field3419.field1834.method165(var16, 1380186760);
                            this.field3419.field1828 = 8;
                            this.field3416.field318 = 0;
                        } else if (this.field3419.field1828 != 0) {
                            throw new IOException();
                        } else if (this.field3416.field269[0] == -1) {
                            this.field3419.field1828 = 1;
                            this.field3416.field318 = 0;
                        } else {
                            this.field3419 = null;
                        }
                    }
                } else {
                    int var23 = 512 - this.field3419.field1828;
                    int var24 = this.field3419.field1834.field269.length - this.field3419.field1829;
                    if (var24 - this.field3419.field1834.field318 < var23) {
                        var23 = var24 - this.field3419.field1834.field318;
                    }
                    if (var8 < var23) {
                        var23 = var8;
                    }
                    this.field3411.method1819(var23, this.field3419.field1834.field318, this.field3419.field1834.field269, (byte) 101);
                    if (this.field3418 != 0) {
                        for (int var25 = 0; var25 < var23; var25++) {
                            this.field3419.field1834.field269[this.field3419.field1834.field318 + var25] = (byte) class168.method1239(this.field3419.field1834.field269[this.field3419.field1834.field318 + var25], this.field3418);
                        }
                    }
                    this.field3419.field1834.field318 += var23;
                    this.field3419.field1828 += var23;
                    if (this.field3419.field1834.field318 == var24) {
                        this.field3419.method1785(-115);
                        this.field3419.field2050 = false;
                        this.field3419 = null;
                    } else if (this.field3419.field1828 == 512) {
                        this.field3419.field1828 = 0;
                    }
                }
                var7++;
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3411.method1818(-2);
            } catch (Exception var26) {
            }
            this.field3417++;
            this.field3411 = null;
            return this.method1372(false) == 0 && this.method1365((byte) 37) == 0;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)I")
    public final int method1372(boolean arg0) {
        field3396++;
        if (arg0) {
            this.method1368(-52);
        }
        return this.field3392.method1499(-101) + this.field3404.method1499(-101);
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V")
    private final void method1373(int arg0) {
        field3391++;
        if (this.field3411 == null) {
            return;
        }
        try {
            this.field3410.field318 = 0;
            this.field3410.method170((byte) 125, 6);
            this.field3410.method164(arg0, (byte) -76);
            this.field3411.method1817(this.field3410.field269, 0, -12152, 4);
        } catch (IOException var3) {
            try {
                this.field3411.method1818(-2);
            } catch (Exception var2) {
            }
            this.field3417++;
            this.field3411 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)V")
    public final void method1374(int arg0) {
        if (this.field3411 != null) {
            this.field3411.method1818(-2);
        }
        field3385++;
        if (arg0 != -1) {
            this.field3417 = -105;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BBZII)Luh;")
    public final class99 method1375(byte arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field3393++;
        if (arg0 < 96) {
            this.method1373(44);
        }
        long var6 = (long) ((arg3 << 16) + arg4);
        class99 var8 = new class99();
        var8.field1829 = arg1;
        var8.field4534 = var6;
        var8.field2046 = arg2;
        if (arg2) {
            if (this.method1372(false) >= 20) {
                throw new RuntimeException();
            }
            this.field3392.method1494(-127, var8);
        } else if (this.method1365((byte) 37) < 20) {
            this.field3407.method1494(-128, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }
}
