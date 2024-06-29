import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class class277 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
    public static int[] field4359 = new int[32];

    @OriginalMember(owner = "client!g", name = "a", descriptor = "[S")
    public static short[] field4358 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Z")
    public static boolean field4368 = false;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lf;")
    public static class36 field4360 = null;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lma;")
    public static final class188 method1862(int arg0, int arg1) {
        field4366++;
        class188 var2 = (class188) class193.field3095.method480((long) arg0, 82);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1252.method1357(class76.method533(arg0, -29138), class127.method903((byte) 96, arg0), -1);
        class188 var4 = new class188();
        var4.field3054 = arg0;
        if (arg1 <= 18) {
            field4360 = null;
        }
        if (var3 != null) {
            var4.method1285(false, new class221(var3));
        }
        class193.field3095.method474((long) arg0, (byte) 106, var4);
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZIILbl;)V")
    public static final void method1863(boolean arg0, int arg1, int arg2, class33 arg3) {
        if ((arg1 & 0x1) != 0) {
            int var4 = class67.field1103.method1517((byte) -96);
            byte[] var5 = new byte[var4];
            class221 var6 = new class221(var5);
            class67.field1103.method1555(18379, var4, 0, var5);
            class16.field265[arg2] = var6;
            arg3.method285(var6, (byte) -99);
        }
        if (!arg0) {
            method1862(21, -100);
        }
        field4362++;
        if ((arg1 & 0x8) != 0) {
            arg3.field3411 = class67.field1103.method1521((byte) 113);
            arg3.field3313 = class67.field1103.method1515(-1);
        }
        if ((arg1 & 0x100) != 0) {
            int var7 = class67.field1103.method1515(-1);
            int var8 = class67.field1103.method1505(112);
            boolean var9 = true;
            if (var7 == 65535) {
                var7 = -1;
            }
            if (var7 != -1 && arg3.field3352 != -1 && class49.method384(method1862(var7, 78).field3050, 16).field2855 < class49.method384(method1862(arg3.field3352, 27).field3050, -104).field2855) {
                var9 = false;
            }
            if (var9) {
                arg3.field3366 = 0;
                arg3.field3410 = var8 >> 16;
                arg3.field3323 = 0;
                arg3.field3347 = 1;
                arg3.field3348 = class222.field3682 + (var8 & 0xFFFF);
                arg3.field3352 = var7;
                if (arg3.field3348 > class222.field3682) {
                    arg3.field3366 = -1;
                }
                if (arg3.field3352 != -1 && class222.field3682 == arg3.field3348) {
                    int var10 = method1862(arg3.field3352, 44).field3050;
                    if (var10 != -1) {
                        class181 var11 = class49.method384(var10, 75);
                        if (var11 != null && var11.field2848 != null) {
                            class132.method934((byte) 112, var11, arg3.field3389, arg3.field3341, 0, class167.field2655 == arg3);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x4) != 0) {
            int var12 = class67.field1103.method1512((byte) -127);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class67.field1103.method1519((byte) 126);
            class139.method965(arg3, var13, var12, (byte) -58);
        }
        if ((arg1 & 0x400) != 0) {
            int var14 = class67.field1103.method1528(19380);
            int var15 = class67.field1103.method1519((byte) 127);
            arg3.method1431(var14, 18570, class222.field3682, var15);
        }
        if ((arg1 & 0x2) != 0) {
            arg3.field3401 = class67.field1103.method1539(114);
            if (arg3.field3401.charAt(0) == '~') {
                arg3.field3401 = arg3.field3401.substring(1);
                class226.method1588(arg3.method284(0), 2, (byte) -84, arg3.field3401);
            } else if (class167.field2655 == arg3) {
                class226.method1588(arg3.method284(0), 2, (byte) -27, arg3.field3401);
            }
            arg3.field3343 = 0;
            arg3.field3403 = 150;
            arg3.field3395 = 0;
        }
        if ((arg1 & 0x800) != 0) {
            int var16 = class67.field1103.method1517((byte) -96);
            int[] var17 = new int[var16];
            int[] var18 = new int[var16];
            int[] var19 = new int[var16];
            for (int var20 = 0; var20 < var16; var20++) {
                int var21 = class67.field1103.method1512((byte) -123);
                if (var21 == 65535) {
                    var21 = -1;
                }
                var17[var20] = var21;
                var18[var20] = class67.field1103.method1534(false);
                var19[var20] = class67.field1103.method1512((byte) -123);
            }
            class32.method276(var17, true, arg3, var19, var18);
        }
        if ((arg1 & 0x10) != 0) {
            arg3.field3374 = class67.field1103.method1515(-1);
            if (arg3.field3374 == 65535) {
                arg3.field3374 = -1;
            }
        }
        if ((arg1 & 0x20) != 0) {
            int var22 = class67.field1103.method1528(19380);
            int var23 = class67.field1103.method1517((byte) -96);
            arg3.method1431(var22, 18570, class222.field3682, var23);
            arg3.field3390 = class222.field3682 + 300;
            arg3.field3345 = class67.field1103.method1553((byte) 81);
        }
        if ((arg1 & 0x80) != 0) {
            int var24 = class67.field1103.method1515(-1);
            int var25 = class67.field1103.method1534(!arg0);
            int var26 = class67.field1103.method1534(false);
            int var27 = class67.field1103.field3655;
            boolean var28 = (var24 & 0x8000) != 0;
            if (arg3.field525 != null && arg3.field528 != null) {
                long var29 = class74.method522((byte) -123, arg3.field525);
                boolean var31 = false;
                if (var25 <= 1) {
                    if (var28 || (!class215.field3516 || class74.field1201) && !class9.field134) {
                        for (int var32 = 0; var32 < class185.field2910; var32++) {
                            if (class183.field2884[var32] == var29) {
                                var31 = true;
                                break;
                            }
                        }
                    } else {
                        var31 = true;
                    }
                }
                if (!var31 && class225.field3731 == 0) {
                    class16.field280.field3655 = 0;
                    class67.field1103.method1501(0, class16.field280.field3653, 107, var26);
                    class16.field280.field3655 = 0;
                    int var33 = -1;
                    String var35;
                    if (var28) {
                        var24 &= 0x7FFF;
                        class250 var34 = class271.method1834(class16.field280, 126);
                        var33 = var34.field3976;
                        var35 = var34.field3978.method789(class16.field280, (byte) -128);
                    } else {
                        var35 = class269.method1819(class61.method437(8346, class44.method364((byte) 80, class16.field280)));
                    }
                    arg3.field3401 = var35.trim();
                    arg3.field3403 = 150;
                    arg3.field3395 = var24 >> 8;
                    arg3.field3343 = var24 & 0xFF;
                    if (var25 == 2) {
                        class28.method240("<img=1>" + arg3.method284(0), var33, (String) null, var28 ? 17 : 1, var35, -69);
                    } else if (var25 == 1) {
                        class28.method240("<img=0>" + arg3.method284(0), var33, (String) null, var28 ? 17 : 1, var35, -52);
                    } else {
                        class28.method240(arg3.method284(0), var33, (String) null, var28 ? 17 : 2, var35, -54);
                    }
                }
            }
            class67.field1103.field3655 = var26 + var27;
        }
        if ((arg1 & 0x200) == 0) {
            return;
        }
        arg3.field3357 = class67.field1103.method1534(false);
        arg3.field3370 = class67.field1103.method1534(!arg0);
        arg3.field3316 = class67.field1103.method1553((byte) 81);
        arg3.field3359 = class67.field1103.method1553((byte) 81);
        arg3.field3373 = class67.field1103.method1512((byte) -128) + class222.field3682;
        arg3.field3339 = class67.field1103.method1527(-10661) + class222.field3682;
        arg3.field3375 = class67.field1103.method1534(false);
        arg3.field3399 = 1;
        arg3.field3346 = 0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)V")
    public static final void method1864(byte arg0, int arg1) {
        field4365++;
        if (arg0 <= -116 && arg1 >= 0 && class132.field2102.length > arg1) {
            class132.field2102[arg1] = !class132.field2102[arg1];
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I")
    public abstract int method1688(int arg0);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)I")
    public static final int method1865(boolean arg0) {
        field4363++;
        if (!arg0) {
            field4359 = null;
        }
        return class183.field2869 && class73.field1193[81] && class205.field3291 > 2 ? class6.field75[class205.field3291 - 2] : class6.field75[class205.field3291 - 1];
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1690(Component arg0, byte arg1);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1689(int arg0, Component arg1);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method1866(byte arg0) {
        field4360 = null;
        field4358 = null;
        field4359 = null;
        if (arg0 < 88) {
            field4358 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZII)I")
    public static final int method1867(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field4358 = null;
        }
        field4361++;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V")
    public static final void method1868(int arg0, int arg1) {
        field4364++;
        class126.field2046 = arg1;
        class129.field2090 = -1;
        class129.field2090 = -1;
        if (arg0 != -65536) {
            field4359 = null;
        }
        class6.method47(arg0 + 65622);
    }
}
