import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class269 extends class301 {

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field4376 = 0;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field4377 = 0;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "Z")
    public static boolean field4384 = false;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "J")
    public static volatile long field4393 = 0L;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "Lek;")
    public static class206 field4380;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "Lek;")
    public static class206 field4391;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "Lbn;")
    public static class75 field4390;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "Ljava/lang/String;")
    public String field4383;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "[C")
    public char[] field4387;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "[C")
    public char[] field4395;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "[I")
    public int[] field4385;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "[I")
    public int[] field4386;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Loe;BI)V", line = 5)
    private final void method1875(class146 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field4383 = arg0.method1017((byte) -121);
        } else if (arg2 == 2) {
            int var4 = arg0.method1005((byte) 122);
            this.field4395 = new char[var4];
            this.field4385 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4385[var5] = arg0.method989(class115.method856(arg1, 47));
                byte var6 = arg0.method1029(-2);
                this.field4395[var5] = var6 == 0 ? 0 : class251.method1768((byte) 101, var6);
            }
        } else if (arg2 == 3) {
            int var7 = arg0.method1005((byte) 122);
            this.field4387 = new char[var7];
            this.field4386 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4386[var8] = arg0.method989(69);
                byte var9 = arg0.method1029(arg1 - 85);
                this.field4387[var8] = var9 == 0 ? 0 : class251.method1768((byte) 115, var9);
            }
        } else if (arg2 == 4) {
        }
        if (arg1 != 83) {
            method1877((char) 65464, true);
        }
        field4381++;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)V", line = 70)
    public static final void method1876(boolean arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class195.field3271[var1] = false;
        }
        class19.field501 = -1;
        class251.field4122 = 0;
        field4382++;
        class272.field4427 = -1;
        if (arg0) {
            field4377 = 88;
        }
        class6.field208 = 0;
        class69.field1280 = 5;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(CZ)Z", line = 92)
    public static final boolean method1877(char arg0, boolean arg1) {
        if (!arg1) {
            method1877((char) 65527, true);
        }
        field4375++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)V", line = 109)
    public final void method1878(byte arg0) {
        field4389++;
        if (arg0 >= -97) {
            return;
        }
        if (this.field4386 != null) {
            for (int var2 = 0; var2 < this.field4386.length; var2++) {
                this.field4386[var2] = class287.method2034(this.field4386[var2], 32768);
            }
        }
        if (this.field4385 != null) {
            for (int var3 = 0; var3 < this.field4385.length; var3++) {
                this.field4385[var3] = class287.method2034(this.field4385[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IC)I", line = 148)
    public final int method1879(int arg0, char arg1) {
        field4388++;
        if (arg0 != -24246) {
            this.method1881((char) 65439, (byte) 48);
        }
        if (this.field4385 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4385.length; var3++) {
            if (this.field4395[var3] == arg1) {
                return this.field4385[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZII)I", line = 181)
    public static final int method1880(int arg0, boolean arg1, int arg2, int arg3) {
        field4394++;
        class353 var4 = (class353) class216.field3591.method2344(-1, (long) arg3);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg2 != 5) {
            method1877('\u000b', false);
        }
        for (int var6 = 0; var6 < var4.field5646.length; var6++) {
            if (var4.field5646[var6] >= 0 && var4.field5646[var6] < class108.field1989) {
                class11 var7 = class296.method2124(0, var4.field5646[var6]);
                if (var7.field313 != null) {
                    class111 var8 = (class111) var7.field313.method2344(arg2 ^ 0xFFFFFFFA, (long) arg0);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field5642[var6] * var8.field2030;
                        } else {
                            var5 += var8.field2030;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(CB)I", line = 242)
    public final int method1881(char arg0, byte arg1) {
        field4397++;
        if (this.field4386 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 != 124) {
            field4384 = true;
        }
        while (var3 < this.field4386.length) {
            if (this.field4387[var3] == arg0) {
                return this.field4386[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Loe;B)V", line = 267)
    public final void method1882(class146 arg0, byte arg1) {
        if (arg1 != -104) {
            return;
        }
        while (true) {
            int var3 = arg0.method1005((byte) 122);
            if (var3 == 0) {
                field4379++;
                return;
            }
            this.method1875(arg0, (byte) 83, var3);
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V", line = 287)
    public static void method1883(int arg0) {
        field4390 = null;
        field4380 = null;
        if (arg0 == -1) {
            field4391 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)V", line = 313)
    public static final void method1884(byte arg0) {
        for (int var1 = -1; var1 < class252.field4144; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class22.field556[var1];
            }
            class98 var3 = class182.field3151[var2];
            if (var3 != null && var3.field217 > 0) {
                var3.field217--;
                if (var3.field217 == 0) {
                    var3.field122 = null;
                }
            }
        }
        field4396++;
        if (arg0 != -95) {
            method1884((byte) 77);
        }
        for (int var4 = 0; var4 < class255.field4184; var4++) {
            int var5 = class23.field570[var4];
            class314 var6 = class149.field2533[var5];
            if (var6 != null && var6.field217 > 0) {
                var6.field217--;
                if (var6.field217 == 0) {
                    var6.field122 = null;
                }
            }
        }
    }
}
