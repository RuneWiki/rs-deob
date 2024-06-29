import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class308 extends class52 {

    @OriginalMember(owner = "client!lv", name = "w", descriptor = "I")
    private int field4387 = 0;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "Lib;")
    private class106 field4379 = new class106(16);

    @OriginalMember(owner = "client!lv", name = "J", descriptor = "I")
    private int field4400 = 0;

    @OriginalMember(owner = "client!lv", name = "G", descriptor = "Lpk;")
    private class133 field4397 = new class133();

    @OriginalMember(owner = "client!lv", name = "L", descriptor = "J")
    private long field4402 = 0L;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "Lst;")
    private class297 field4372;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
    private int field4374;

    @OriginalMember(owner = "client!lv", name = "D", descriptor = "Z")
    private boolean field4394;

    @OriginalMember(owner = "client!lv", name = "H", descriptor = "Lpk;")
    private class133 field4398;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    private int field4371;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    private int field4375;

    @OriginalMember(owner = "client!lv", name = "K", descriptor = "Z")
    private boolean field4401;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "Lst;")
    private class297 field4373;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "Lvn;")
    private class204 field4376;

    @OriginalMember(owner = "client!lv", name = "B", descriptor = "Lvl;")
    private class11 field4392;

    @OriginalMember(owner = "client!lv", name = "x", descriptor = "Lec;")
    private class157 field4388;

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "[I")
    public static int[] field4382 = new int[1];

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!lv", name = "u", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!lv", name = "v", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!lv", name = "y", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!lv", name = "z", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!lv", name = "A", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!lv", name = "C", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!lv", name = "E", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!lv", name = "I", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!lv", name = "t", descriptor = "Lrt;")
    private class151 field4384;

    @OriginalMember(owner = "client!lv", name = "F", descriptor = "Z")
    private boolean field4396;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "[B")
    private byte[] field4378;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)I")
    public final int method1905(byte arg0) {
        field4390++;
        if (this.field4384 == null) {
            return 0;
        } else {
            int var2 = 77 % ((29 - arg0) / 35);
            return this.field4384.field2128;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)Lec;")
    private final class157 method1906(int arg0, int arg1, int arg2) {
        field4369++;
        class157 var4 = (class157) this.field4379.method875((long) arg2, 124);
        if (var4 != null && arg0 == 0 && !var4.field2234 && var4.field2230) {
            var4.method1525((byte) -46);
            var4 = null;
        }
        if (arg1 <= 24) {
            return null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field4372 == null || this.field4378[arg2] == -1) {
                    if (this.field4376.method1417(0)) {
                        return null;
                    }
                    var4 = this.field4376.method1422(this.field4374, (byte) 2, (byte) 66, true, arg2);
                } else {
                    var4 = this.field4392.method71(this.field4372, -20214, arg2);
                }
            } else if (arg0 == 1) {
                if (this.field4372 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4392.method70(-1, this.field4372, arg2);
            } else if (arg0 == 2) {
                if (this.field4372 == null) {
                    throw new RuntimeException();
                }
                if (this.field4378[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4376.method1429((byte) -46)) {
                    return null;
                }
                var4 = this.field4376.method1422(this.field4374, (byte) 2, (byte) -94, false, arg2);
            } else {
                throw new RuntimeException();
            }
            this.field4379.method878((long) arg2, -2301, var4);
        }
        if (var4.field2230) {
            return null;
        }
        byte[] var5 = var4.method1123(false);
        if (!var4 instanceof class158) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class351.field4866.reset();
                class351.field4866.update(var5, 0, var5.length - 2);
                int var6 = (int) class351.field4866.getValue();
                if (this.field4384.field2130[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field4376.field2976 = 0;
                this.field4376.field2978 = 0;
            } catch (RuntimeException var12) {
                this.field4376.method1421((byte) 87);
                var4.method1525((byte) 96);
                if (var4.field2234 && !this.field4376.method1417(0)) {
                    class276 var7 = this.field4376.method1422(this.field4374, (byte) 2, (byte) -57, true, arg2);
                    this.field4379.method878((long) arg2, -2301, var7);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4384.field2129[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field4384.field2129[arg2];
            if (this.field4372 != null) {
                this.field4392.method74(5, arg2, var5, this.field4372);
                if (this.field4378[arg2] != 1) {
                    this.field4387++;
                    this.field4378[arg2] = 1;
                }
            }
            if (!var4.field2234) {
                var4.method1525((byte) -88);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class351.field4866.reset();
            class351.field4866.update(var5, 0, var5.length - 2);
            int var8 = (int) class351.field4866.getValue();
            if (this.field4384.field2130[arg2] != var8) {
                throw new RuntimeException();
            }
            int var9 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4384.field2129[arg2] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field4378[arg2] != 1) {
                this.field4387++;
                this.field4378[arg2] = 1;
            }
            if (!var4.field2234) {
                var4.method1525((byte) 118);
            }
            return var4;
        } catch (Exception var11) {
            this.field4378[arg2] = -1;
            var4.method1525((byte) -57);
            if (var4.field2234 && !this.field4376.method1417(0)) {
                class276 var10 = this.field4376.method1422(this.field4374, (byte) 2, (byte) -124, true, arg2);
                this.field4379.method878((long) arg2, -2301, var10);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V")
    public static final void method1907(int arg0) {
        int var1 = -118 % ((arg0 - 75) / 51);
        field4385++;
        if (class401.field5943 < 0) {
            return;
        }
        long var2 = class437.method2644(-60);
        class401.field5943 = (int) ((long) class401.field5943 - (var2 - class100.field1403));
        if (class401.field5943 <= 0) {
            class223.field3274 = class346.field4803.field2866;
            class151.field2131 = class346.field4803.field2859;
            class480.field7059 = class346.field4803.field2864;
            class53.field580 = class346.field4803.field2860;
            class140.field1986 = class346.field4803.field2849;
            class233.field3427 = class346.field4803.field2861;
            class527.field7755 = class346.field4803.field2852;
            class23.field248 = class346.field4803.field2856;
            class401.field5943 = -1;
            class108.field1543 = class346.field4803.field2858;
            class510.field7529 = class346.field4803.field2855;
        } else {
            int var4 = (class401.field5943 << 8) / class371.field5519;
            int var5 = 255 - var4;
            float var6 = (float) var4 / 255.0F;
            class23.field248 = ((class447.field6601 & 0xFF00) * var4 + (class346.field4803.field2856 & 0xFF00) * var5 & 0xFF0000) + ((class447.field6601 & 0xFF00FF) * var4 + (class346.field4803.field2856 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8;
            float var7 = 1.0F - var6;
            class233.field3427 = (class346.field4803.field2861 - class366.field5454) * var7 + class366.field5454;
            class480.field7059 = class364.field5091 * var4 + class346.field4803.field2864 * var5 >> 8;
            class527.field7755 = (class346.field4803.field2852 - class273.field4036) * var7 + class273.field4036;
            class151.field2131 = ((class17.field201 & 0xFF00FF) * var4 + ((class346.field4803.field2859 & 0xFF00FF) * var5) & 0xFF00FF00) + ((class17.field201 & 0xFF00) * var4 + (class346.field4803.field2859 & 0xFF00) * var5 & 0xFF0000) >>> 8;
            class108.field1543 = (class346.field4803.field2858 - class400.field5932) * var7 + class400.field5932;
            class140.field1986 = (class346.field4803.field2849 - class340.field4711) * var7 + class340.field4711;
            class223.field3274 = (class346.field4803.field2866 - class245.field3609) * var7 + class245.field3609;
            class510.field7529 = (class346.field4803.field2855 - class99.field1334) * var7 + class99.field1334;
            if (class240.field3541 != class346.field4803.field2860) {
                class53.field580 = class326.field4576.method375(class240.field3541, class346.field4803.field2860, var7, class53.field580);
            }
        }
        class100.field1403 = var2;
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)[B")
    public final byte[] method517(int arg0, int arg1) {
        if (arg0 <= 45) {
            this.method1905((byte) -86);
        }
        field4377++;
        class157 var3 = this.method1906(0, 86, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1123(false);
            var3.method1525((byte) -31);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "(I)V")
    public final void method1908(int arg0) {
        field4381++;
        if (this.field4398 != null) {
            if (this.method515((byte) -111) == null) {
                return;
            }
            if (this.field4394) {
                boolean var6 = true;
                for (class223 var7 = this.field4398.method1018(arg0 ^ 0x5CF7); var7 != null; var7 = this.field4398.method1022((byte) -112)) {
                    int var9 = (int) var7.field3271;
                    if (this.field4378[var9] == 0) {
                        this.method1906(1, 98, var9);
                    }
                    if (this.field4378[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1525((byte) 121);
                    }
                }
                while (this.field4400 < this.field4384.field2126.length) {
                    if (this.field4384.field2126[this.field4400] == 0) {
                        this.field4400++;
                    } else {
                        if (this.field4392.field136 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field4378[this.field4400] == 0) {
                            this.method1906(1, 86, this.field4400);
                        }
                        if (this.field4378[this.field4400] == 0) {
                            class223 var8 = new class223();
                            var8.field3271 = this.field4400;
                            var6 = false;
                            this.field4398.method1015(false, var8);
                        }
                        this.field4400++;
                    }
                }
                if (var6) {
                    this.field4400 = 0;
                    this.field4394 = false;
                }
            } else if (this.field4396) {
                boolean var2 = true;
                for (class223 var3 = this.field4398.method1018(arg0 - 23627); var3 != null; var3 = this.field4398.method1022((byte) -112)) {
                    int var5 = (int) var3.field3271;
                    if (this.field4378[var5] != 1) {
                        this.method1906(2, arg0 - 23651, var5);
                    }
                    if (this.field4378[var5] == 1) {
                        var3.method1525((byte) -51);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field4400 < this.field4384.field2126.length) {
                    if (this.field4384.field2126[this.field4400] == 0) {
                        this.field4400++;
                    } else {
                        if (this.field4376.method1429((byte) -46)) {
                            var2 = false;
                            break;
                        }
                        if (this.field4378[this.field4400] != 1) {
                            this.method1906(2, 83, this.field4400);
                        }
                        if (this.field4378[this.field4400] != 1) {
                            class223 var4 = new class223();
                            var4.field3271 = this.field4400;
                            var2 = false;
                            this.field4398.method1015(false, var4);
                        }
                        this.field4400++;
                    }
                }
                if (var2) {
                    this.field4400 = 0;
                    this.field4396 = false;
                }
            } else {
                this.field4398 = null;
            }
        }
        if (arg0 != 23747) {
            this.method1906(102, -17, 93);
        }
        if (!this.field4401 || this.field4402 > class437.method2644(-82)) {
            return;
        }
        for (class157 var10 = (class157) this.field4379.method880((byte) -23); var10 != null; var10 = (class157) this.field4379.method879((byte) -20)) {
            if (!var10.field2230) {
                if (var10.field2231) {
                    if (!var10.field2234) {
                        throw new RuntimeException();
                    }
                    var10.method1525((byte) 122);
                } else {
                    var10.field2231 = true;
                }
            }
        }
        this.field4402 = class437.method2644(-122) + 1000L;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)I")
    public final int method1909(boolean arg0) {
        field4386++;
        if (arg0) {
            return -119;
        } else if (this.field4384 == null) {
            return 0;
        } else if (this.field4394) {
            class223 var2 = this.field4398.method1018(43);
            return var2 == null ? 0 : (int) var2.field3271;
        } else {
            return this.field4384.field2128;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IB)I")
    public final int method516(int arg0, byte arg1) {
        field4393++;
        class157 var3 = (class157) this.field4379.method875((long) arg0, 125);
        if (arg1 <= 113) {
            method1907(117);
        }
        return var3 == null ? 0 : var3.method1122(81);
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(B)V")
    public final void method1910(byte arg0) {
        field4391++;
        if (this.field4398 == null || this.method515((byte) -120) == null || arg0 > -85) {
            return;
        }
        for (class223 var2 = this.field4397.method1018(68); var2 != null; var2 = this.field4397.method1022((byte) -112)) {
            int var3 = (int) var2.field3271;
            if (var3 < 0 || var3 >= this.field4384.field2138 || this.field4384.field2126[var3] == 0) {
                var2.method1525((byte) -60);
            } else {
                if (this.field4378[var3] == 0) {
                    this.method1906(1, 123, var3);
                }
                if (this.field4378[var3] == -1) {
                    this.method1906(2, 34, var3);
                }
                if (this.field4378[var3] == 1) {
                    var2.method1525((byte) -36);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lwn;[[BI)V")
    public static final void method1911(class507 arg0, byte[][] arg1, int arg2) {
        field4380++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class65 var11 = new class65(var10);
                int var12 = class411.field6110[var5] >> 8;
                int var13 = class411.field6110[var5] & 0xFF;
                int var14 = var12 * 64 - class340.field4713;
                int var15 = var13 * 64 - class476.field7013;
                class106.method876((byte) -109);
                arg0.method1734(-115, class340.field4713, class476.field7013, var11, var14, class455.field6684, var15);
                arg0.method3024(0, var3, var15, class225.field3300, var14, var11);
                if (!arg0.field3990 && (class60.field695 / 8) == var12 && (class251.field3702 / 8) == var13 && var3[0] != -1) {
                    class423.field6245 = class428.field6311.method2702(var3[1], var3[0], 120, var3[2], var3[3], class172.field2451);
                    class487.field7161 = var3[4];
                }
            }
        }
        if (arg2 != -32652) {
            return;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class411.field6110[var6] >> 8) * 64 - class340.field4713;
            int var8 = (class411.field6110[var6] & 0xFF) * 64 - class476.field7013;
            byte[] var9 = arg1[var6];
            if (var9 == null && class251.field3702 < 800) {
                class106.method876((byte) -109);
                arg0.method1730(var7, arg2 ^ 0xFFFF8090, var8, 64, 64);
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "(I)V")
    public static void method1912(int arg0) {
        if (arg0 != 0) {
            field4395 = -59;
        }
        field4382 = null;
    }

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "(I)I")
    public final int method1913(int arg0) {
        if (arg0 != -1398) {
            field4382 = null;
        }
        field4368++;
        if (this.method515((byte) -114) == null) {
            return this.field4388 == null ? 0 : this.field4388.method1122(43);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)V")
    public final void method513(int arg0, int arg1) {
        field4389++;
        if (this.field4372 == null) {
            return;
        }
        for (class223 var3 = this.field4397.method1018(61); var3 != null; var3 = this.field4397.method1022((byte) -112)) {
            if (((long) arg0) == var3.field3271) {
                return;
            }
        }
        if (arg1 != 0) {
            this.field4384 = null;
        }
        class223 var4 = new class223();
        var4.field3271 = arg0;
        this.field4397.method1015(false, var4);
    }

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "(B)V")
    public final void method1914(byte arg0) {
        if (arg0 <= 1) {
            return;
        }
        field4383++;
        if (this.field4372 != null) {
            this.field4396 = true;
            if (this.field4398 == null) {
                this.field4398 = new class133();
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "(I)I")
    public final int method1915(int arg0) {
        field4370++;
        if (arg0 >= -94) {
            this.method517(124, 35);
        }
        return this.field4387;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)Lrt;")
    public final class151 method515(byte arg0) {
        field4399++;
        if (this.field4384 != null) {
            return this.field4384;
        }
        if (this.field4388 == null) {
            if (this.field4376.method1417(0)) {
                return null;
            }
            this.field4388 = this.field4376.method1422(255, (byte) 0, (byte) -74, true, this.field4374);
        }
        if (this.field4388.field2230) {
            return null;
        }
        byte[] var2 = this.field4388.method1123(false);
        if (this.field4388 instanceof class158) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4384 = new class151(var2, this.field4371);
                if (this.field4384.field2139 != this.field4375) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field4384 = null;
                if (this.field4376.method1417(0)) {
                    this.field4388 = null;
                } else {
                    this.field4388 = this.field4376.method1422(255, (byte) 0, (byte) 68, true, this.field4374);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4384 = new class151(var2, this.field4371);
            } catch (RuntimeException var4) {
                this.field4376.method1421((byte) -101);
                this.field4384 = null;
                if (this.field4376.method1417(0)) {
                    this.field4388 = null;
                } else {
                    this.field4388 = this.field4376.method1422(255, (byte) 0, (byte) -101, true, this.field4374);
                }
                return null;
            }
            if (this.field4373 != null) {
                this.field4392.method74(5, this.field4374, var2, this.field4373);
            }
        }
        this.field4388 = null;
        if (this.field4372 != null) {
            this.field4378 = new byte[this.field4384.field2138];
            this.field4387 = 0;
        }
        if (arg0 >= -75) {
            this.method1913(-116);
        }
        return this.field4384;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(ILst;Lst;Lvn;Lvl;IIZ)V")
    public class308(int arg0, class297 arg1, class297 arg2, class204 arg3, class11 arg4, int arg5, int arg6, boolean arg7) {
        this.field4372 = arg1;
        this.field4374 = arg0;
        if (this.field4372 == null) {
            this.field4394 = false;
        } else {
            this.field4394 = true;
            this.field4398 = new class133();
        }
        this.field4371 = arg5;
        this.field4375 = arg6;
        this.field4401 = arg7;
        this.field4373 = arg2;
        this.field4376 = arg3;
        this.field4392 = arg4;
        if (this.field4373 != null) {
            this.field4388 = this.field4392.method71(this.field4373, -20214, this.field4374);
        }
    }
}
