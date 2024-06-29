import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class399 {

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Z")
    public boolean field5947 = false;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field5948 = 0;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field5944 = 50;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "[I")
    public static int[] field5954 = new int[field5944];

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "[I")
    public static int[] field5958 = new int[field5944];

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field5950 = new String[field5944];

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "[I")
    public static int[] field5952 = new int[field5944];

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
    public static int[] field5946 = new int[field5944];

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
    public static int[] field5941 = new int[field5944];

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "[I")
    public static int[] field5961 = new int[field5944];

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public static int field5962 = 0;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "Ljava/lang/String;")
    public static String field5959 = null;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public int field5940;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public int field5956;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lnj;IZI)V")
    private final void method2565(class228 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field5947 = false;
        }
        if (arg3 == 1) {
            this.field5940 = arg0.method1343(255);
        } else if (arg3 == 2) {
            this.field5956 = arg0.method1333((byte) -120);
        } else if (arg3 == 3) {
            this.field5947 = true;
        } else if (arg3 == 4) {
            this.field5940 = -1;
        }
        field5945++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method2566(int arg0) {
        field5952 = null;
        field5959 = null;
        field5958 = null;
        field5961 = null;
        field5946 = null;
        field5954 = null;
        field5950 = null;
        if (arg0 != -1719249469) {
            method2566(32);
        }
        field5941 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
    public static final void method2567(boolean arg0) {
        class30.field434 = null;
        class169.field2271 = null;
        class12.field197 = null;
        class394.field5660 = null;
        class120.field1672 = null;
        field5949++;
        class315.field4609 = arg0;
        class145.method927(0);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)Lrl;")
    public static final class263 method2568(int arg0) {
        field5943++;
        if (arg0 != 16383) {
            field5946 = null;
        }
        class263 var1 = (class263) class253.field3492.method2250(1580);
        if (var1 != null) {
            var1.method322(arg0 ^ 0x3FF4);
            var1.method1302(true);
            return var1;
        }
        class263 var2;
        do {
            var2 = (class263) class163.field2182.method2250(1580);
            if (var2 == null) {
                return null;
            }
            if (var2.method1810(-10472) > class114.method735(113)) {
                return null;
            }
            var2.method322(11);
            var2.method1302(true);
        } while ((Long.MIN_VALUE & var2.field2962) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILnj;)V")
    public final void method2569(int arg0, int arg1, class228 arg2) {
        while (true) {
            int var4 = arg2.method1348(arg1 ^ 0x74);
            if (var4 == 0) {
                if (arg1 != -1) {
                    this.method2575((byte) 101);
                }
                field5960++;
                return;
            }
            this.method2565(arg2, arg0, false, var4);
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    public static final void method2570(int arg0) {
        field5951++;
        if (arg0 <= 90) {
            field5946 = null;
        }
        int var1 = class411.field6071 * 128 + 64;
        int var2 = class115.field1605 * 128 + 64;
        int var3 = class52.method359((byte) -116, var2, var1, class227.field2981) - class374.field5446;
        if (class338.field4873 < 100) {
            if (class400.field5971 < var1) {
                class400.field5971 += class90.field1276 + ((var1 - class400.field5971) * class338.field4873 / 1000);
                if (class400.field5971 > var1) {
                    class400.field5971 = var1;
                }
            }
            if (var1 < class400.field5971) {
                class400.field5971 -= class90.field1276 + ((class400.field5971 - var1) * class338.field4873 / 1000);
                if (var1 > class400.field5971) {
                    class400.field5971 = var1;
                }
            }
            if (class201.field2667 < var3) {
                class201.field2667 += class90.field1276 + ((var3 - class201.field2667) * class338.field4873 / 1000);
                if (var3 < class201.field2667) {
                    class201.field2667 = var3;
                }
            }
            if (var3 < class201.field2667) {
                class201.field2667 -= (class201.field2667 - var3) * class338.field4873 / 1000 + class90.field1276;
                if (var3 > class201.field2667) {
                    class201.field2667 = var3;
                }
            }
            if (class179.field2371 < var2) {
                class179.field2371 += class90.field1276 + ((var2 - class179.field2371) * class338.field4873 / 1000);
                if (var2 < class179.field2371) {
                    class179.field2371 = var2;
                }
            }
            if (class179.field2371 > var2) {
                class179.field2371 -= (class179.field2371 - var2) * class338.field4873 / 1000 + class90.field1276;
                if (class179.field2371 < var2) {
                    class179.field2371 = var2;
                }
            }
        } else {
            class400.field5971 = class411.field6071 * 128 + 64;
            class179.field2371 = class115.field1605 * 128 + 64;
            class201.field2667 = class52.method359((byte) -116, class179.field2371, class400.field5971, class227.field2981) - class374.field5446;
        }
        int var4 = class97.field1361 * 128 + 64;
        int var5 = class166.field2237 * 128 + 64;
        int var6 = class52.method359((byte) -116, var5, var4, class227.field2981) - class75.field1065;
        int var7 = var4 - class400.field5971;
        int var8 = var6 - class201.field2667;
        int var9 = var5 - class179.field2371;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class415.field6101) {
            class415.field6101 += (var11 - class415.field6101 >> 3) * class91.field1281 / 1000 + class68.field880 << 3;
            if (class415.field6101 > var11) {
                class415.field6101 = var11;
            }
        }
        if (var11 < class415.field6101) {
            class415.field6101 -= (class415.field6101 - var11 >> 3) * class91.field1281 / 1000 + class68.field880 << 3;
            if (var11 > class415.field6101) {
                class415.field6101 = var11;
            }
        }
        int var13 = var12 - class5.field66;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class5.field66 += class91.field1281 * var14 / 1000 + class68.field880 << 3;
            class5.field66 &= 0x3FFF;
        }
        if (var14 < 0) {
            class5.field66 -= -var14 * class91.field1281 / 1000 + class68.field880 << 3;
            class5.field66 &= 0x3FFF;
        }
        int var15 = var12 - class5.field66;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class5.field66 = var12;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)I")
    public static int method2571(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
    public static final void method2572(boolean arg0) {
        field5955++;
        class189 var1 = class346.field4984;
        synchronized (class346.field4984) {
            class346.field4984.method1136((byte) -127);
        }
        if (!arg0) {
            method2567(true);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIIII)V")
    public static final void method2573(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg0; var6 <= arg5; var6++) {
            class207.method1221((byte) -126, arg2, arg3, class384.field5560[var6], arg4);
        }
        if (arg1 == -46) {
            field5953++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLii;II)Lcq;")
    public final class67 method2574(boolean arg0, class405 arg1, int arg2, int arg3) {
        field5942++;
        long var5 = (long) (this.field5940 | arg2 << 16 | (arg0 ? 262144 : 0) | arg1.field6028 << 19);
        class67 var7 = (class67) class397.field5905.method1137(var5, 2108653711);
        if (var7 != null) {
            return var7;
        } else if (class117.field1645.method2257(true, this.field5940)) {
            class441 var8 = class441.method2778(class117.field1645, this.field5940, arg3);
            if (var8 != null) {
                var8.field6463 = var8.field6461 = var8.field6465 = var8.field6467 = 0;
                if (arg0) {
                    var8.method2777();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method2780();
                }
            }
            class67 var10 = arg1.method1710(var8, true);
            if (var10 != null) {
                class397.field5905.method1144(var5, var10, arg3 ^ 0xFFFFF268);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Z")
    public final boolean method2575(byte arg0) {
        if (arg0 != 36) {
            this.method2575((byte) 36);
        }
        field5957++;
        return class117.field1645.method2257(true, this.field5940);
    }
}
