import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class85 extends class270 {

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    private int field1379 = 2048;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    private int field1383 = 4096;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    private int field1385 = 0;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    private int field1386 = 8192;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    private int field1387 = 0;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    private int field1388 = 2048;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    private int field1380 = 12288;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "Z")
    public static boolean field1392 = false;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1377 = null;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "Lof;")
    public static class421 field1389;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "[I")
    public static int[] field1373;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BJ)V")
    public static final void method647(byte arg0, long arg1) {
        try {
            if (arg0 != 28) {
                return;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        ++field1384;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class85() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)Z")
    private final boolean method648(int arg0, byte arg1, int arg2) {
        ++field1374;
        int var4 = (arg0 + arg2) * this.field1380 >> 12;
        if (arg1 != -114) {
            this.field1385 = -122;
        }
        int var5 = class133.field2145[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field1380;
        int var7 = (var6 << 12) / this.field1386;
        int var8 = this.field1383 * var7 >> 12;
        return arg0 - arg2 < var8 && -arg2 + arg0 > -var8;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)V")
    public static void method649(byte arg0) {
        field1389 = null;
        if (arg0 != 102) {
            field1373 = null;
        }
        field1373 = null;
        field1377 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lmb;I)Z")
    public static final boolean method650(class258 arg0, int arg1) {
        ++field1393;
        if (arg0.field3784 == null) {
            return false;
        } else {
            int var2 = -95 / ((arg1 - 41) / 49);
            for (int var3 = 0; ~var3 > ~arg0.field3784.length; ++var3) {
                int var4 = class416.method2603(var3, arg0, (byte) 118);
                int var5 = arg0.field3797[var3];
                if (arg0.field3784[var3] == 2) {
                    if (~var4 <= ~var5) {
                        return false;
                    }
                } else if (arg0.field3784[var3] == 3) {
                    if (var5 >= var4) {
                        return false;
                    }
                } else if (arg0.field3784[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V")
    public static final void method651(int arg0, byte arg1) {
        if (arg1 <= 33) {
            field1373 = null;
        }
        class18 var2 = class63.field1013;
        synchronized (class63.field1013) {
            class63.field1013.method104(arg0, (byte) -34);
        }
        ++field1381;
        class18 var3 = class197.field2875;
        synchronized (class197.field2875) {
            class197.field2875.method104(arg0, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)[I")
    public final int[] method81(byte arg0, int arg1) {
        ++field1391;
        if (arg0 <= 26) {
            method650((class258) null, -74);
        }
        int[] var3 = super.field4053.method396(arg1, -87);
        if (super.field4053.field815) {
            int var4 = class364.field5185[arg1] + -2048;
            for (int var5 = 0; ~class161.field2445 < ~var5; ++var5) {
                int var6 = class136.field2168[var5] + -2048;
                int var7 = this.field1379 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field1385 + var4;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = this.field1387 + var6;
                int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = this.field1388 + var4;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method652(var12, -102, var9) && !this.method648(var18, (byte) -114, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)Z")
    private final boolean method652(int arg0, int arg1, int arg2) {
        ++field1378;
        int var4 = (-arg2 + arg0) * this.field1380 >> 12;
        int var5 = -76 / ((arg1 - 14) / 54);
        int var6 = class133.field2145[var4 * 255 >> 12 & 255];
        int var7 = (var6 << 12) / this.field1380;
        int var8 = (var7 << 12) / this.field1386;
        int var9 = this.field1383 * var8 >> 12;
        return ~(arg0 + arg2) > ~var9 && -var9 < arg0 + arg2;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        ++field1390;
        if (arg0) {
            class164.method1269(0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        ++field1376;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field1386 = arg1.method320((byte) -87);
                                }
                            } else {
                                this.field1383 = arg1.method320((byte) -87);
                            }
                        } else {
                            this.field1380 = arg1.method320((byte) -87);
                        }
                    } else {
                        this.field1388 = arg1.method320((byte) -87);
                    }
                } else {
                    this.field1387 = arg1.method320((byte) -87);
                }
            } else {
                this.field1385 = arg1.method320((byte) -87);
            }
        } else {
            this.field1379 = arg1.method320((byte) -87);
        }
        if (arg0 != 108) {
            method653(-88);
        }
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)Z")
    public static final boolean method653(int arg0) {
        ++field1382;
        class365 var1 = class193.field2851;
        synchronized (class193.field2851) {
            if (class157.field2401 == class152.field2320) {
                return false;
            } else {
                class382.field5464 = class419.field6107[class157.field2401];
                class292.field4334 = class122.field1936[class157.field2401];
                class157.field2401 = class157.field2401 - arg0 & 127;
                return true;
            }
        }
    }
}
