import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class330 extends class199 {

    @OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
    private int field4825 = 0;

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
    private int field4827 = 4096;

    @OriginalMember(owner = "client!mo", name = "db", descriptor = "[I")
    public static int[] field4835 = new int[32];

    @OriginalMember(owner = "client!mo", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4829 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!mo", name = "eb", descriptor = "Z")
    public static boolean field4836 = false;

    @OriginalMember(owner = "client!mo", name = "gb", descriptor = "I")
    public static int field4838 = 0;

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!mo", name = "U", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!mo", name = "W", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!mo", name = "Y", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!mo", name = "ab", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!mo", name = "bb", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!mo", name = "cb", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!mo", name = "fb", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!mo", name = "Z", descriptor = "Lpm;")
    public static class69 field4831;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(B)I", line = 7)
    public static final int method2283(byte arg0) {
        field4826++;
        if (arg0 > -7) {
            method2286(-72);
        }
        return ((class204.field2843 == 0 ? 0 : 1) << 22) + ((class101.field1319 == 0 ? 0 : 1) << 21) + ((class75.field991 == 0 ? 0 : 1) << 20) + ((class280.field3995 ? 1 : 0) << 16) + ((class67.field856 ? 1 : 0) << 13) + (class89.field1119 & 0x3 << 11) + ((class40.field506 ? 1 : 0) << 9) + ((class80.field1017 ? 1 : 0) << 8) + ((class343.field5340 ? 1 : 0) << 7) + ((class199.field2803 ? 1 : 0) << 4) + (((class180.field2467 ? 1 : 0) << 3) + (class254.field3713 & 0x7) - -((class329.field4812 ? 1 : 0) << 5)) + ((class27.field313 ? 1 : 0) << 6) + ((class122.field1603 ? 1 : 0) << 10) + (((class177.field2436 ? 1 : 0) << 15) - (-(class58.field745 << 17) - ((class103.field1343 ? 1 : 0) << 19))) + (class187.method1356() << 23);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/awt/Component;BILpm;I)Ltj;", line = 19)
    public static final class354 method2284(Component arg0, byte arg1, int arg2, class69 arg3, int arg4) {
        field4834++;
        if (class85.field1091 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class354 var5 = (class354) Class.forName("kb").getDeclaredConstructor().newInstance();
                var5.field5544 = arg2;
                var5.field5530 = new int[(class82.field1059 ? 2 : 1) * 256];
                var5.method29(arg0);
                int var6 = -123 / ((-arg1 - 60) / 49);
                var5.field5546 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field5546 > 16384) {
                    var5.field5546 = 16384;
                }
                var5.method27(var5.field5546);
                if (class255.field3736 > 0 && class82.field1063 == null) {
                    class82.field1063 = new class357();
                    class82.field1063.field5578 = arg3;
                    arg3.method494(class255.field3736, true, class82.field1063);
                }
                if (class82.field1063 != null) {
                    if (class82.field1063.field5579[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class82.field1063.field5579[arg4] = var5;
                }
                return var5;
            } catch (Throwable var11) {
                try {
                    class4 var8 = new class4(arg3, arg4);
                    var8.field5544 = arg2;
                    var8.field5530 = new int[(class82.field1059 ? 2 : 1) * 256];
                    var8.method29(arg0);
                    var8.field5546 = 16384;
                    var8.method27(var8.field5546);
                    if (class255.field3736 > 0 && class82.field1063 == null) {
                        class82.field1063 = new class357();
                        class82.field1063.field5578 = arg3;
                        arg3.method494(class255.field3736, true, class82.field1063);
                    }
                    if (class82.field1063 != null) {
                        if (class82.field1063.field5579[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class82.field1063.field5579[arg4] = var8;
                    }
                    return var8;
                } catch (Throwable var10) {
                    return new class354();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V", line = 448)
    public class330() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)I", line = 108)
    public static final int method2285(int arg0, int arg1) {
        field4828++;
        if (arg1 != 2) {
            method2288(false);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLfd;I)V", line = 123)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg0 != -43) {
            method2287((byte) 16);
        }
        field4824++;
        if (arg2 == 0) {
            this.field4825 = arg1.method2083((byte) -52);
        } else if (arg2 == 1) {
            this.field4827 = arg1.method2083((byte) -66);
        }
    }

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)V", line = 160)
    public static final void method2286(int arg0) {
        if (arg0 == 256) {
            field4833++;
            class240.field3488.method2258((byte) 86);
            class293.field4260.method2258((byte) 86);
            class347.field5393.method2258((byte) 86);
        }
    }

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "(B)V", line = 174)
    public static void method2287(byte arg0) {
        field4829 = null;
        if (arg0 == -98) {
            field4831 = null;
            field4835 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V", line = 187)
    public static final void method2288(boolean arg0) {
        int var1 = class209.field2967;
        int var2 = class65.field815;
        field4837++;
        int var3 = class117.field1534 - 3;
        if (arg0) {
            method2288(false);
        }
        byte var4 = 20;
        int var5 = class146.field2038;
        if (class84.field1088 == null || class343.field5337 == null) {
            if (class1.field7.method1076(client.field1630, 75) && class1.field7.method1076(class9.field105, 102)) {
                class84.field1088 = class116.method852(class1.field7, client.field1630, true, 0);
                class343.field5337 = class116.method852(class1.field7, class9.field105, true, 0);
                if (class47.field623) {
                    if ((class84.field1088 instanceof class301)) {
                        class84.field1088 = new class120((class11) class84.field1088);
                    } else {
                        class84.field1088 = new class361((class11) class84.field1088);
                    }
                    if ((class343.field5337 instanceof class301)) {
                        class343.field5337 = new class120((class11) class343.field5337);
                    } else {
                        class343.field5337 = new class361((class11) class343.field5337);
                    }
                }
            } else if (class47.field623) {
                class129.method987(var1, var2, var5, var4, class58.field748, 256 - class14.field158);
            } else {
                class37.method239(var1, var2, var5, var4, class58.field748, 256 - class14.field158);
            }
        }
        if (class84.field1088 != null && class343.field5337 != null) {
            int var6 = (var5 - (class343.field5337.field2252 * 2)) / class84.field1088.field2252;
            for (int var7 = 0; var7 < var6; var7++) {
                class84.field1088.method85(class84.field1088.field2252 * var7 + var1 + class343.field5337.field2252, var2);
            }
            class343.field5337.method85(var1, var2);
            class343.field5337.method87(var1 + var5 - class343.field5337.field2252, var2);
        }
        class186.field2554.method1900(class75.field986, var1 + 3, var2 + 14, class335.field5236, -1);
        if (class47.field623) {
            class129.method987(var1, var2 + var4, var5, var3 - var4, class58.field748, 256 - class14.field158);
        } else {
            class37.method239(var1, var2 + var4, var5, var3 - var4, class58.field748, 256 - class14.field158);
        }
        int var8 = class105.field1361;
        int var9 = class80.field1028;
        for (int var10 = 0; var10 < class66.field853; var10++) {
            int var11 = (class66.field853 - var10 - 1) * 15 + var2 + var4 + 13;
            if (var1 < var8 && (var1 + var5) > var8 && (var11 - 13) < var9 && (var11 + 3) > var9) {
                if (class47.field623) {
                    class129.method987(var1, var11 - 12, var5, 15, class335.field5227, 256 - class276.field3960);
                } else {
                    class37.method239(var1, var11 - 12, var5, 15, class335.field5227, 256 - class276.field3960);
                }
            }
        }
        if ((class56.field720 == null || class261.field3781 == null || class101.field1321 == null) && class1.field7.method1076(class161.field2304, 125) && class1.field7.method1076(class282.field4022, 83) && class1.field7.method1076(class16.field189, 115)) {
            class56.field720 = class116.method852(class1.field7, class161.field2304, true, 0);
            class261.field3781 = class116.method852(class1.field7, class282.field4022, !arg0, 0);
            class101.field1321 = class116.method852(class1.field7, class16.field189, true, 0);
            if (class47.field623) {
                if (class56.field720 instanceof class301) {
                    class56.field720 = new class120((class11) class56.field720);
                } else {
                    class56.field720 = new class361((class11) class56.field720);
                }
                if (class261.field3781 instanceof class301) {
                    class261.field3781 = new class120((class11) class261.field3781);
                } else {
                    class261.field3781 = new class361((class11) class261.field3781);
                }
                if (class101.field1321 instanceof class301) {
                    class101.field1321 = new class120((class11) class101.field1321);
                } else {
                    class101.field1321 = new class361((class11) class101.field1321);
                }
            }
        }
        if (class56.field720 != null && class261.field3781 != null && class101.field1321 != null) {
            int var12 = (var5 - (class101.field1321.field2252 * 2)) / class56.field720.field2252;
            for (int var13 = 0; var13 < var12; var13++) {
                class56.field720.method85(class101.field1321.field2252 + var1 + (class56.field720.field2252 * var13), var2 - class56.field720.field2250 + var3);
            }
            int var14 = (var3 - var4 - class101.field1321.field2250) / class261.field3781.field2250;
            for (int var15 = 0; var15 < var14; var15++) {
                class261.field3781.method85(var1, class261.field3781.field2250 * var15 + var2 + var4);
                class261.field3781.method87(var1 + var5 - class261.field3781.field2252, class261.field3781.field2250 * var15 + var4 + var2);
            }
            class101.field1321.method85(var1, var2 + var3 - class101.field1321.field2250);
            class101.field1321.method87(var1 + var5 - class101.field1321.field2252, -class101.field1321.field2250 + var2 + var3);
        }
        for (int var16 = 0; var16 < class66.field853; var16++) {
            int var17 = (class66.field853 - var16 - 1) * 15 + var2 + var4 + 13;
            int var18 = class335.field5236;
            if (var8 > var1 && (var1 + var5) > var8 && var17 - 13 < var9 && (var17 + 3) > var9) {
                var18 = class272.field3899;
            }
            class186.field2554.method1900(class28.method184((byte) 111, var16), var1 + 3, var17, var18, 0);
        }
        class221.method1610(class209.field2967, class65.field815, class117.field1534, 128, class146.field2038);
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(II)I", line = 362)
    public static final int method2289(int arg0, int arg1) {
        field4830++;
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return arg0 == 26957 ? 0 : 86;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)[I", line = 414)
    public final int[] method190(int arg0, int arg1) {
        field4832++;
        if (arg0 != -1735) {
            this.field4825 = -73;
        }
        int[] var3 = this.field2802.method2502(arg1, -75);
        if (this.field2802.field5637) {
            int[] var4 = this.method1467(-7764, arg1, 0);
            for (int var5 = 0; var5 < class95.field1235; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field4825 && this.field4827 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
