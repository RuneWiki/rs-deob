import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class161 extends class188 {

    @OriginalMember(owner = "client!d", name = "x", descriptor = "J")
    public long field2485;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Z")
    public static boolean field2481 = false;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field2479 = -1;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field2472 = 2;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field2482 = 0;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lnk;")
    public static class16 field2473;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "[Lpa;")
    public static class2[] field2477;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "[Lpa;")
    public static class2[] field2478;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "[[I")
    public static int[][] field2484;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 8)
    public static final void method1164(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field2483++;
        for (int var1 = 0; var1 < class218.field3280; var1++) {
            int var2 = class127.field1864[var1];
            class231 var3 = class251.field3974[var2];
            int var4 = class282.field4499.method1043(true);
            if ((var4 & 0x1) != 0) {
                var4 += class282.field4499.method1043(true) << 8;
            }
            if ((var4 & 0x80) != 0) {
                int var5 = class282.field4499.method1046(2);
                int var6 = class282.field4499.method1046(2);
                var3.method1718(var6, 4, var5, class102.field1381);
                var3.field3775 = class102.field1381 + 300;
                var3.field3726 = class282.field4499.method1059((byte) 57);
            }
            if ((var4 & 0x40) != 0) {
                var3.field3734 = class282.field4499.method1040((byte) -127);
                var3.field3751 = 100;
            }
            if ((var4 & 0x100) != 0) {
                var3.field3711 = class282.field4499.method1031(false);
                var3.field3723 = class282.field4499.method1031(false);
            }
            if ((var4 & 0x200) != 0) {
                int var7 = class282.field4499.method1043(true);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class282.field4499.method1031(false);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var8[var11] = var12;
                    var10[var11] = class282.field4499.method1046(arg0 + 3);
                    var9[var11] = class282.field4499.method1048(119);
                }
                class27.method197(var10, var3, arg0 + 2, var8, var9);
            }
            if ((var4 & 0x10) != 0) {
                var3.field3792 = class282.field4499.method1032(0);
                if (var3.field3792 == 65535) {
                    var3.field3792 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var13 = class282.field4499.method1043(true);
                int var14 = class282.field4499.method1043(true);
                var3.method1718(var14, 4, var13, class102.field1381);
            }
            if ((var4 & 0x20) != 0) {
                int var15 = class282.field4499.method1051(1);
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var16 = class282.field4499.method1046(2);
                class110.method715(var3, var15, -14143, var16);
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field3503.method958((byte) 113)) {
                    class75.method475(2045418567, var3);
                }
                var3.method1599(23299, class178.method1229(class282.field4499.method1032(0), 8));
                var3.method1721(362, var3.field3503.field2111);
                var3.field3729 = var3.field3503.field2134;
                var3.field3746 = var3.field3503.field2145;
                if (var3.field3503.method958((byte) -93)) {
                    class218.method1517(0, (class67) null, (byte) 11, var3.field3747[0], var3, (class234) null, var3.field3786[0], class219.field3290);
                }
            }
            if ((var4 & 0x2) != 0) {
                int var17 = class282.field4499.method1051(1);
                int var18 = class282.field4499.method1058((byte) -119);
                if (var17 == 65535) {
                    var17 = -1;
                }
                boolean var19 = true;
                if (var17 != -1 && var3.field3703 != -1 && class289.method2067((byte) -64, class255.method1803(var17, (byte) -51).field4919).field1521 < class289.method2067((byte) -94, class255.method1803(var3.field3703, (byte) -51).field4919).field1521) {
                    var19 = false;
                }
                if (var19) {
                    var3.field3752 = 0;
                    var3.field3785 = var18 >> 16;
                    var3.field3703 = var17;
                    var3.field3791 = 1;
                    var3.field3736 = (var18 & 0xFFFF) + class102.field1381;
                    var3.field3803 = 0;
                    if (class102.field1381 < var3.field3736) {
                        var3.field3803 = -1;
                    }
                    if (var3.field3703 != -1 && class102.field1381 == var3.field3736) {
                        int var20 = class255.method1803(var3.field3703, (byte) -51).field4919;
                        if (var20 != -1) {
                            class111 var21 = class289.method2067((byte) -128, var20);
                            if (var21 != null && var21.field1533 != null) {
                                class313.method2210(var21, 0, 50, var3.field3763, false, var3.field3767);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIB)V", line = 202)
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2480++;
        if (arg4 >= class337.field5389 && arg1 <= class344.field5460 && class244.field3844 <= arg0 && class2.field22 >= arg2) {
            class62.method381(arg3, arg0, arg4, arg2, arg1, (byte) 121);
        } else {
            class78.method503(arg4, arg3, (byte) 106, arg2, arg1, arg0);
        }
        if (arg5 != 122) {
            field2484 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)I", line = 220)
    public static final int method1166(int arg0) {
        if (arg0 >= -11) {
            return -73;
        } else {
            field2476++;
            return class197.field3006.method384((byte) 60);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V", line = 231)
    public static void method1167(byte arg0) {
        field2477 = null;
        field2478 = null;
        field2473 = null;
        field2484 = (int[][]) null;
        if (arg0 > -45) {
            method1166(22);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lnk;II)Lnj;", line = 254)
    public static final class252 method1168(class16 arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            field2474++;
            byte[] var3 = arg0.method124(arg2, arg1 + 12701);
            return var3 == null ? null : new class252(var3);
        } else {
            return (class252) null;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V", line = 276)
    public class161() {
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(J)V", line = 278)
    public class161(long arg0) {
        this.field2485 = arg0;
    }
}
