import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class121 extends class303 {

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field1938 = 0;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "Z")
    public static boolean field1939 = false;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field1945 = -1;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 5)
    public static final void method921(String arg0, boolean arg1, int arg2) {
        String var3 = arg0.toLowerCase();
        field1942++;
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class134.field2122; var6++) {
            class179 var7 = class208.method1521(-1361, var6);
            if ((!arg1 || var7.field2834) && var7.field2810 == -1 && var7.field2842 == -1 && var7.field2813 == 0 && var7.field2825.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class114.field1871 = null;
                    class297.field4681 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var8 = new short[var4.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var4[var9];
                    }
                    var4 = var8;
                }
                var4[var5++] = (short) var6;
            }
        }
        class297.field4681 = var5;
        if (arg2 != 2) {
            return;
        }
        client.field3902 = 0;
        class114.field1871 = var4;
        String[] var10 = new String[class297.field4681];
        for (int var11 = 0; var11 < class297.field4681; var11++) {
            var10[var11] = class208.method1521(-1361, var4[var11]).field2825;
        }
        class124.method934(class114.field1871, var10, true);
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V", line = 80)
    public static final void method922(byte arg0) {
        field1936++;
        if (arg0 != -52) {
            field1945 = -52;
        }
        class219.field3511.method1832((byte) 49);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZII)V", line = 91)
    public static final void method923(boolean arg0, int arg1, int arg2) {
        if (class70.field1108 != arg1) {
            class291.field4427 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class291.field4427[var3] = (var3 << 12) / arg1;
            }
            class40.field724 = arg1 - 1;
            class70.field1108 = arg1;
            class124.field1977 = arg1 == 64 ? 2048 : 4096;
        }
        if (class247.field3815 != arg2) {
            if (class70.field1108 == arg2) {
                class36.field591 = class291.field4427;
            } else {
                class36.field591 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class36.field591[var4] = (var4 << 12) / arg2;
                }
            }
            class247.field3815 = arg2;
            class12.field240 = arg2 - 1;
        }
        field1941++;
        if (arg0) {
            method926(false);
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 136)
    public class121() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 147)
    public static final void method924(int arg0, byte arg1, String arg2) {
        field1943++;
        class4 var3 = class67.method510(1, 2, arg0);
        var3.method14(24710);
        if (arg1 > -40) {
            method929(-9, 65, -115, true, -89, -0.13461974F, 89, -87);
        }
        var3.field29 = arg2;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(II)I", line = 165)
    public static final int method925(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)Z", line = 177)
    public static final boolean method926(boolean arg0) {
        field1940++;
        try {
            if (class326.field5060 == 2) {
                if (class62.field956 == null) {
                    class62.field956 = class192.method1419(class34.field572, class14.field268, class196.field3120);
                    if (class62.field956 == null) {
                        return false;
                    }
                }
                if (class16.field320 == null) {
                    class16.field320 = new class104(class128.field2047, class159.field2511);
                }
                if (class45.field769.method263((byte) -127, class81.field1217, 22050, class16.field320, class62.field956)) {
                    class45.field769.method256(-26289145);
                    class45.field769.method267(class147.field2371, -108);
                    class45.field769.method284(class14.field264, class62.field956, -92);
                    class34.field572 = null;
                    class16.field320 = null;
                    class62.field956 = null;
                    class326.field5060 = 0;
                    return true;
                }
            }
            if (arg0) {
                method930((byte) -66, (class101) null, (String) null);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class45.field769.method282(0);
            class16.field320 = null;
            class326.field5060 = 0;
            class62.field956 = null;
            class34.field572 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(B)I", line = 227)
    public static final int method927(byte arg0) {
        if (arg0 > -46) {
            return -13;
        } else {
            field1935++;
            return 2;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)[I", line = 240)
    public final int[] method67(int arg0, int arg1) {
        field1944++;
        if (arg0 != -3) {
            return (int[]) null;
        }
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int var4 = class36.field591[arg1];
            for (int var5 = 0; var5 < class70.field1108; var5++) {
                var3[var5] = this.method928(class291.field4427[var5], var4, 1376312589) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(III)I", line = 272)
    private final int method928(int arg0, int arg1, int arg2) {
        field1934++;
        if (arg2 != 1376312589) {
            method929(69, 3, -53, true, 127, -1.1051918F, 12, 83);
        }
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 << 1 ^ var4;
        return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIZIFII)[I", line = 288)
    public static final int[] method929(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5, int arg6, int arg7) {
        int[] var8 = new int[arg6];
        class91 var9 = new class91();
        var9.field1493 = arg1;
        var9.field1491 = (int) ((float) arg4 * arg5);
        var9.field1486 = arg0;
        var9.field1497 = arg7;
        var9.field1494 = arg2;
        field1946++;
        var9.field1503 = arg3;
        var9.method70(93);
        method923(false, arg6, 1);
        var9.method656(0, (byte) -128, var8);
        return var8;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLpe;Ljava/lang/String;)I", line = 311)
    public static final int method930(byte arg0, class101 arg1, String arg2) {
        int var3 = arg1.field1667;
        byte[] var4 = class323.method2209(false, arg2);
        arg1.method774(-14642, var4.length);
        if (arg0 > -112) {
            method924(116, (byte) -25, (String) null);
        }
        field1937++;
        arg1.field1667 += class230.field3656.method179((byte) -19, arg1.field1667, var4, var4.length, 0, arg1.field1661);
        return arg1.field1667 - var3;
    }
}
