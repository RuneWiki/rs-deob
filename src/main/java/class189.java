import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class189 implements Runnable {

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "[Lir;")
    public volatile class19[] field2728 = new class19[2];

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Z")
    public volatile boolean field2724 = false;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Z")
    public volatile boolean field2719 = false;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2726 = 0;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Lrd;")
    public class185 field2731;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "[I")
    public static int[] field2722;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[I")
    public static int[] field2723;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1287(int arg0) {
        field2730++;
        int var1 = class160.field2105 * 128 + 64;
        int var2 = class65.field745 * 128 + 64;
        int var3 = class114.method709(class129.field1570, var1, 0, var2) - class440.field6291;
        if (class289.field4064 >= 100) {
            class334.field4730 = class160.field2105 * 128 + 64;
            class265.field3774 = class65.field745 * 128 + 64;
            class276.field3925 = class114.method709(class129.field1570, class334.field4730, 0, class265.field3774) - class440.field6291;
        } else {
            if (var1 > class334.field4730) {
                class334.field4730 += class106.field1268 + ((var1 - class334.field4730) * class289.field4064 / 1000);
                if (class334.field4730 > var1) {
                    class334.field4730 = var1;
                }
            }
            if (class334.field4730 > var1) {
                class334.field4730 -= (class334.field4730 - var1) * class289.field4064 / 1000 + class106.field1268;
                if (var1 > class334.field4730) {
                    class334.field4730 = var1;
                }
            }
            if (var3 > class276.field3925) {
                class276.field3925 += (var3 - class276.field3925) * class289.field4064 / 1000 + class106.field1268;
                if (var3 < class276.field3925) {
                    class276.field3925 = var3;
                }
            }
            if (var3 < class276.field3925) {
                class276.field3925 -= (class276.field3925 - var3) * class289.field4064 / 1000 + class106.field1268;
                if (class276.field3925 < var3) {
                    class276.field3925 = var3;
                }
            }
            if (class265.field3774 < var2) {
                class265.field3774 += (var2 - class265.field3774) * class289.field4064 / 1000 + class106.field1268;
                if (class265.field3774 > var2) {
                    class265.field3774 = var2;
                }
            }
            if (var2 < class265.field3774) {
                class265.field3774 -= (class265.field3774 - var2) * class289.field4064 / 1000 + class106.field1268;
                if (var2 > class265.field3774) {
                    class265.field3774 = var2;
                }
            }
        }
        int var4 = class168.field2346 * 128 + 64;
        int var5 = class253.field3627 * 128 + 64;
        int var6 = class114.method709(class129.field1570, var4, 0, var5) - class371.field5229;
        int var7 = var4 - class334.field4730;
        int var8 = var6 - class276.field3925;
        int var9 = var5 - class265.field3774;
        if (arg0 > -79) {
            field2726 = -11;
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class138.field1722 < var11) {
            class138.field1722 += class392.field5532 + ((var11 - class138.field1722 >> 3) * class98.field1193 / 1000) << 3;
            if (class138.field1722 > var11) {
                class138.field1722 = var11;
            }
        }
        if (class138.field1722 > var11) {
            class138.field1722 -= (class138.field1722 - var11 >> 3) * class98.field1193 / 1000 + class392.field5532 << 3;
            if (var11 > class138.field1722) {
                class138.field1722 = var11;
            }
        }
        int var13 = var12 - class377.field5324;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class377.field5324 += class392.field5532 + (class98.field1193 * var14 / 1000) << 3;
            class377.field5324 &= 0x3FFF;
        }
        if (var14 < 0) {
            class377.field5324 -= -var14 * class98.field1193 / 1000 + class392.field5532 << 3;
            class377.field5324 &= 0x3FFF;
        }
        int var15 = var12 - class377.field5324;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class232.field3265 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class377.field5324 = var12;
        }
    }

    @OriginalMember(owner = "client!ng", name = "run", descriptor = "()V", line = 156)
    public final void run() {
        this.field2719 = true;
        field2729++;
        try {
            while (!this.field2724) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class19 var2 = this.field2728[var1];
                    if (var2 != null) {
                        var2.method140(255);
                    }
                }
                class150.method907(10L, (byte) -32);
                class215.method1447((Object) null, this.field2731, (byte) -59);
            }
        } catch (Exception var9) {
            class422.method2663((String) null, var9, -25);
        } finally {
            Object var6 = null;
            this.field2719 = false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Lkb;", line = 192)
    public static final class412 method1288(int arg0, int arg1) {
        field2725++;
        class237 var2 = class254.field3653;
        class412 var3;
        synchronized (class254.field3653) {
            var3 = (class412) class254.field3653.method1625((long) arg1, 0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class162.field2205.method2431((byte) 107, class192.method1301((byte) -116, arg1), class138.method855(arg1, -27872));
        class412 var5 = new class412();
        var5.field5929 = arg1;
        if (var4 != null) {
            var5.method2629((byte) 117, new class236(var4));
        }
        var5.method2628(124);
        if (arg0 != -8192) {
            method1288(-74, -5);
        }
        class237 var6 = class254.field3653;
        synchronized (class254.field3653) {
            class254.field3653.method1622((byte) 13, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lon;I)V", line = 226)
    public static final void method1289(class184 arg0, int arg1) {
        field2721++;
        int var2 = arg0.field2561;
        if (arg1 != -1) {
            method1290(57);
        }
        if (var2 == 327) {
            arg0.field2532 = 150;
            arg0.field2604 = (int) (Math.sin((double) field2726 / 40.0D) * 256.0D) & 0x3FFF;
            arg0.field2539 = 5;
            arg0.field2520 = -1;
        } else if (var2 == 328) {
            if (class384.field5422.field487 == null) {
                arg0.field2520 = 0;
                arg0.field2560 = 0;
            } else {
                arg0.field2532 = 150;
                arg0.field2604 = (int) (Math.sin((double) field2726 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2520 = 2047;
                arg0.field2539 = 5;
                arg0.field2560 = class302.method1988((byte) 77, class384.field5422.field487);
                arg0.field2541 = class384.field5422.field5609;
                arg0.field2544 = class384.field5422.field5640;
                arg0.field2550 = 0;
                arg0.field2566 = class384.field5422.field5643;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 276)
    public static void method1290(int arg0) {
        field2722 = null;
        field2723 = null;
        if (arg0 != 0) {
            method1290(122);
        }
    }
}
