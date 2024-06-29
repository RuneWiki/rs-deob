import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class242 extends class32 {

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "Ljl;")
    public class245 field4408;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "Lqk;")
    public static class207 field4405 = class24.method212(255, "Versteckt");

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public static int field4404 = 0;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "[I")
    public static int[] field4410 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field4411 = 0;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V")
    public static final void method1708(int arg0) {
        field4412++;
        if (class1.field5 == null) {
            return;
        }
        if (class134.field2325 < 10) {
            if (!class58.field1069.method704(class1.field5.field4557, (byte) -110)) {
                class134.field2325 = class241.field4401.method717(true, class1.field5.field4557) / 10;
                return;
            }
            class99.method724(-111);
            class134.field2325 = 10;
        }
        if (class134.field2325 == 10) {
            if (class1.field5.field4550 == 37) {
                class12.field170 = 3.0F;
                class108.field1913 = 3.0F;
            } else if (class1.field5.field4550 == 50) {
                class12.field170 = 4.0F;
                class108.field1913 = 4.0F;
            } else if (class1.field5.field4550 == 75) {
                class12.field170 = 6.0F;
                class108.field1913 = 6.0F;
            } else if (class1.field5.field4550 == 100) {
                class12.field170 = 8.0F;
                class108.field1913 = 8.0F;
            } else if (class1.field5.field4550 == 200) {
                class12.field170 = 16.0F;
                class108.field1913 = 16.0F;
            } else {
                class12.field170 = 8.0F;
                class108.field1913 = 8.0F;
            }
            class111.field1932 = class1.field5.field4556 >> 6 << 6;
            class198.field3473 = class1.field5.field4546 >> 6 << 6;
            class197.field3463 = (class1.field5.field4551 >> 6 << 6) + 64 - class198.field3473;
            class70.field1253 = (class1.field5.field4555 >> 6 << 6) + 64 - class111.field1932;
            int var1 = (class202.field3565.field5104 >> 7) + class21.field349 - class198.field3473;
            int var2 = class70.field1253 + class111.field1932 - (class202.field3565.field5072 >> 7) - class180.field3231 - 1;
            int var3 = var2 + (int) (Math.random() * 10.0D) - 5;
            int var4 = var1 + ((int) (Math.random() * 10.0D) - 5);
            if (var4 >= 0 && var4 < class197.field3463 && var3 >= 0 && var3 < class70.field1253) {
                class276.field4842 = var4;
                class39.field786 = var3;
            } else {
                class276.field4842 = class1.field5.field4553 * 64 - class198.field3473;
                class39.field786 = class111.field1932 + class70.field1253 - (class1.field5.field4544 * 64) - 1;
            }
            class288.method1965(1);
            int var5 = class57.field1058 >> 1;
            class281.field4945 = new int[class135.field2333 + 1];
            int var6 = class5.field79 >> 2 << 10;
            int var7 = class197.field3463 >> 6;
            int var8 = class70.field1253 >> 6;
            class161.field2854 = new byte[var7][var8][];
            class173.field3066 = new byte[var7][var8][];
            class236.field4351 = new int[var7][var8][];
            class170.field3018 = new int[var7][var8][];
            class75.field1388 = new byte[var7][var8][];
            class72.field1327 = new byte[var7][var8][];
            class204.field3593 = new byte[var7][var8][];
            class127.field2221 = new int[var7][var8][];
            class268.method1833(var5, var6, 120);
            class134.field2325 = 20;
        } else if (class134.field2325 == 20) {
            class241.method1703(new class149(class58.field1069.method706(class202.field3559, class1.field5.field4557, 108)), (byte) -96);
            class134.field2325 = 30;
            class119.method851(22705, true);
            class163.method1183(-33);
        } else if (class134.field2325 == 30) {
            class101.method742(118, new class149(class58.field1069.method706(class11.field164, class1.field5.field4557, 36)));
            class134.field2325 = 40;
            class163.method1183(-33);
        } else if (class134.field2325 == 40) {
            class153.method1099(true, new class149(class58.field1069.method706(class177.field3187, class1.field5.field4557, 117)));
            class134.field2325 = 50;
            class163.method1183(-33);
        } else if (class134.field2325 == 50) {
            class40.method307(104, new class149(class58.field1069.method706(class227.field4157, class1.field5.field4557, 119)));
            class134.field2325 = 60;
            class119.method851(22705, true);
            class163.method1183(-33);
        } else if (class134.field2325 == 60) {
            if (class58.field1069.method725(35, class105.method757(false, new class207[] { class1.field5.field4557, class80.field1464 }))) {
                if (!class58.field1069.method704(class105.method757(false, new class207[] { class1.field5.field4557, class80.field1464 }), (byte) -104)) {
                    return;
                }
                class57.field1052 = class162.method1176(class105.method757(false, new class207[] { class1.field5.field4557, class80.field1464 }), -24669, class58.field1069);
            } else {
                class57.field1052 = new class187(0);
            }
            class134.field2325 = 70;
            class163.method1183(-33);
        } else if (class134.field2325 == 70) {
            class248.field4495 = new class42(11, true, class112.field1949);
            class134.field2325 = 73;
            class119.method851(22705, true);
            class163.method1183(-33);
        } else if (class134.field2325 == 73) {
            class102.field1842 = new class42(12, true, class112.field1949);
            class134.field2325 = 76;
            class119.method851(22705, true);
            class163.method1183(-33);
        } else if (class134.field2325 == 76) {
            class159.field2815 = new class42(14, true, class112.field1949);
            class134.field2325 = 79;
            class119.method851(22705, true);
            class163.method1183(-33);
        } else if (class134.field2325 == 79) {
            class98.field1740 = new class42(17, true, class112.field1949);
            class134.field2325 = 82;
            class119.method851(22705, true);
            class163.method1183(-33);
        } else if (class134.field2325 == 82) {
            class106.field1881 = new class42(19, true, class112.field1949);
            class134.field2325 = 85;
            class119.method851(22705, true);
            class163.method1183(-33);
        } else if (class134.field2325 == 85) {
            class267.field4726 = new class42(22, true, class112.field1949);
            class134.field2325 = 88;
            class119.method851(22705, true);
            class163.method1183(-33);
        } else if (class134.field2325 == 88) {
            class255.field4566 = new class42(26, true, class112.field1949);
            class134.field2325 = 91;
            class119.method851(22705, true);
            class163.method1183(-33);
        } else {
            if (arg0 < 48) {
                method1709(62);
            }
            class164.field2904 = new class42(30, true, class112.field1949);
            class134.field2325 = 100;
            class119.method851(22705, true);
            class163.method1183(-33);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V")
    public static void method1709(int arg0) {
        field4405 = null;
        int var1 = -87 % ((arg0 - 31) / 32);
        field4410 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([II[III)V")
    public static final void method1710(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 != -98) {
            method1709(-99);
        }
        field4409++;
        if (arg4 <= arg1) {
            return;
        }
        int var5 = arg1;
        int var6 = (arg1 + arg4) / 2;
        int var7 = arg2[var6];
        arg2[var6] = arg2[arg4];
        arg2[arg4] = var7;
        int var8 = arg0[var6];
        arg0[var6] = arg0[arg4];
        arg0[arg4] = var8;
        for (int var9 = arg1; var9 < arg4; var9++) {
            if (((var9 & 0x1) + var7) < arg2[var9]) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var5];
                arg2[var5] = var10;
                int var11 = arg0[var9];
                arg0[var9] = arg0[var5];
                arg0[var5++] = var11;
            }
        }
        arg2[arg4] = arg2[var5];
        arg2[var5] = var7;
        arg0[arg4] = arg0[var5];
        arg0[var5] = var8;
        method1710(arg0, arg1, arg2, -98, var5 - 1);
        method1710(arg0, var5 + 1, arg2, -98, arg4);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Llh;B)V")
    public static final void method1711(class286 arg0, byte arg1) {
        int var2 = arg0.field5038 - class160.field2844;
        field4407++;
        if (arg1 != 42) {
            method1710((int[]) null, 9, (int[]) null, 9, -59);
        }
        int var3 = arg0.field5027 * 128 + arg0.method83(true) * 64;
        int var4 = arg0.field5067 * 128 + (arg0.method83(true) * 64);
        arg0.field5015 = 0;
        arg0.field5072 += (var4 - arg0.field5072) / var2;
        arg0.field5104 += (var3 - arg0.field5104) / var2;
        if (arg0.field5054 == 0) {
            arg0.field5098 = 1024;
        }
        if (arg0.field5054 == 1) {
            arg0.field5098 = 1536;
        }
        if (arg0.field5054 == 2) {
            arg0.field5098 = 0;
        }
        if (arg0.field5054 == 3) {
            arg0.field5098 = 512;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljl;)V")
    public class242(class245 arg0) {
        this.field4408 = arg0;
    }
}
