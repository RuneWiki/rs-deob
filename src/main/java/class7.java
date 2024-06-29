import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class7 extends class306 {

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    private int field160 = 0;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "Loe;")
    private class120 field159 = new class120(16);

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "I")
    private int field177 = 0;

    @OriginalMember(owner = "client!gf", name = "gb", descriptor = "Lvf;")
    private class296 field179 = new class296();

    @OriginalMember(owner = "client!gf", name = "hb", descriptor = "J")
    private long field180 = 0L;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "Lqe;")
    private class177 field164;

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "Z")
    private boolean field176;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "Lvf;")
    private class296 field174;

    @OriginalMember(owner = "client!gf", name = "ib", descriptor = "Z")
    private boolean field181;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "Leh;")
    private class158 field170;

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "Lqe;")
    private class177 field172;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "Lel;")
    private class112 field150;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "Lc;")
    private class293 field154;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "Lmh;")
    public static class128 field148 = class22.method156(124, "Versteckt");

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field149 = 2;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "Z")
    public static boolean field163 = false;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "Lmh;")
    public static class128 field167;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "Lnd;")
    private class303 field165;

    @OriginalMember(owner = "client!gf", name = "fb", descriptor = "Z")
    private boolean field178;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "[B")
    private byte[] field162;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "[I")
    public static int[] field145;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IB)Lqc;", line = 4)
    public static final class4 method41(int arg0, byte arg1) {
        field146++;
        class4 var2 = (class4) class118.field1996.method1836((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 101) {
            field167 = (class128) null;
        }
        byte[] var3 = class299.field5096.method2155(arg0, 16, (byte) 70);
        class4 var4 = new class4();
        if (var3 != null) {
            var4.method26(new class194(var3), -117);
        }
        class118.field1996.method1835((byte) -81, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V", line = 30)
    public final void method42(byte arg0) {
        field152++;
        if (this.field174 == null || this.method52((byte) -97) == null) {
            return;
        }
        class287 var2 = this.field179.method2024(0);
        int var3 = -114 % ((68 - arg0) / 58);
        while (var2 != null) {
            int var4 = (int) var2.field4915;
            if (var4 < 0 || var4 >= this.field165.field5130 || this.field165.field5144[var4] == 0) {
                var2.method1978((byte) -123);
            } else {
                if (this.field162[var4] == 0) {
                    this.method50((byte) -83, 1, var4);
                }
                if (this.field162[var4] == -1) {
                    this.method50((byte) -55, 2, var4);
                }
                if (this.field162[var4] == 1) {
                    var2.method1978((byte) -99);
                }
            }
            var2 = this.field179.method2027(1211754408);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)[B", line = 77)
    public final byte[] method43(byte arg0, int arg1) {
        if (arg0 >= -64) {
            field145 = (int[]) null;
        }
        field147++;
        class293 var3 = this.method50((byte) -109, 0, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1144(100);
            var3.method1978((byte) -100);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V", line = 95)
    public final void method44(int arg0) {
        field153++;
        if (this.field164 == null) {
            return;
        }
        if (arg0 != 1338) {
            field149 = 118;
        }
        this.field178 = true;
        if (this.field174 == null) {
            this.field174 = new class296();
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lcf;I)I", line = 112)
    public static final int method45(class123 arg0, int arg1) {
        if (arg1 > -112) {
            return -69;
        }
        field158++;
        int var2 = arg0.field2071;
        if (arg0.field482 == arg0.field474) {
            var2 = arg0.field2066;
        } else if (arg0.field474 == arg0.field449) {
            var2 = arg0.field2084;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(B)V", line = 134)
    public final void method46(byte arg0) {
        field143++;
        if (this.field174 != null) {
            if (this.method52((byte) -117) == null) {
                return;
            }
            if (this.field176) {
                boolean var6 = true;
                for (class287 var7 = this.field174.method2024(0); var7 != null; var7 = this.field174.method2027(1211754408)) {
                    int var8 = (int) var7.field4915;
                    if (this.field162[var8] == 0) {
                        this.method50((byte) -109, 1, var8);
                    }
                    if (this.field162[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method1978((byte) -100);
                    }
                }
                while (this.field177 < this.field165.field5144.length) {
                    if (this.field165.field5144[this.field177] == 0) {
                        this.field177++;
                    } else {
                        if (this.field170.field2711 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field162[this.field177] == 0) {
                            this.method50((byte) -99, 1, this.field177);
                        }
                        if (this.field162[this.field177] == 0) {
                            class287 var9 = new class287();
                            var9.field4915 = (long) this.field177;
                            var6 = false;
                            this.field174.method2029((byte) -34, var9);
                        }
                        this.field177++;
                    }
                }
                if (var6) {
                    this.field177 = 0;
                    this.field176 = false;
                }
            } else if (this.field178) {
                boolean var2 = true;
                for (class287 var3 = this.field174.method2024(0); var3 != null; var3 = this.field174.method2027(1211754408)) {
                    int var4 = (int) var3.field4915;
                    if (this.field162[var4] != 1) {
                        this.method50((byte) -114, 2, var4);
                    }
                    if (this.field162[var4] == 1) {
                        var3.method1978((byte) -111);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field165.field5144.length > this.field177) {
                    if (this.field165.field5144[this.field177] == 0) {
                        this.field177++;
                    } else {
                        if (this.field150.method672(true)) {
                            var2 = false;
                            break;
                        }
                        if (this.field162[this.field177] != 1) {
                            this.method50((byte) -97, 2, this.field177);
                        }
                        if (this.field162[this.field177] != 1) {
                            class287 var5 = new class287();
                            var2 = false;
                            var5.field4915 = (long) this.field177;
                            this.field174.method2029((byte) -34, var5);
                        }
                        this.field177++;
                    }
                }
                if (var2) {
                    this.field177 = 0;
                    this.field178 = false;
                }
            } else {
                this.field174 = null;
            }
        }
        if (arg0 > -81 || !this.field181 || class71.method470(true) < this.field180) {
            return;
        }
        for (class293 var10 = (class293) this.field159.method729(-106); var10 != null; var10 = (class293) this.field159.method732(1)) {
            if (!var10.field5018) {
                if (var10.field5016) {
                    if (!var10.field5015) {
                        throw new RuntimeException();
                    }
                    var10.method1978((byte) 76);
                } else {
                    var10.field5016 = true;
                }
            }
        }
        this.field180 = class71.method470(true) + 1000L;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)Lng;", line = 316)
    public static final class152 method47(int arg0) {
        if (arg0 < 31) {
            field149 = 24;
        }
        field144++;
        class152 var1;
        if (class247.field4247) {
            var1 = new class67(class72.field1327, class132.field2294, class151.field2607[0], class266.field4603[0], class125.field2106[0], class178.field3128[0], class157.field2690[0], class205.field3614);
        } else {
            var1 = new class127(class72.field1327, class132.field2294, class151.field2607[0], class266.field4603[0], class125.field2106[0], class178.field3128[0], class157.field2690[0], class205.field3614);
        }
        class15.method113(33);
        return var1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lem;I)V", line = 334)
    public static final void method48(class10 arg0, int arg1) {
        if (class66.field1273 == arg0.field370) {
            class26.field581[arg0.field258] = true;
        }
        field140++;
        if (arg1 != 0) {
            field145 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIIII)V", line = 353)
    private static final void method49(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class50.field978 < 100) {
            class217.method1501((byte) -80);
        }
        field157++;
        if (class247.field4247) {
            class269.method1875(arg4, arg2, arg4 + arg3, arg1 + arg2);
        } else {
            class213.method1470(arg4, arg2, arg3 + arg4, arg1 + arg2);
        }
        if (class50.field978 < 100) {
            byte var14 = 20;
            int var15 = arg1 / 2 + arg2 - var14 - 18;
            int var16 = arg4 + (arg3 / 2);
            if (class247.field4247) {
                class269.method1878(arg4, arg2, arg3, arg1, 0);
                class269.method1871(var16 - 152, var15, 304, 34, 9179409);
                class269.method1871(var16 - 151, var15 + 1, 302, 32, 0);
                class269.method1878(var16 - 150, var15 + 2, class50.field978 * 3, 30, 9179409);
                class269.method1878(class50.field978 * 3 + var16 - 150, var15 + 2, 300 - (class50.field978 * 3), 30, 0);
            } else {
                class213.method1464(arg4, arg2, arg3, arg1, 0);
                class213.method1463(var16 - 152, var15, 304, 34, 9179409);
                class213.method1463(var16 - 151, var15 + 1, 302, 32, 0);
                class213.method1464(var16 - 150, var15 + 2, class50.field978 * 3, 30, 9179409);
                class213.method1464(var16 + (class50.field978 * 3) - 150, var15 - -2, 300 - (class50.field978 * 3), 30, 0);
            }
            client.field4159.method2082(class5.field98, var16, var15 + var14, 16777215, -1);
            return;
        }
        class295.field5044 = class310.field5255 - ((int) ((float) arg1 / class143.field2438));
        class315.field5343 = (int) ((float) (arg3 * 2) / class143.field2438);
        int var5 = class143.field2441 - ((int) ((float) arg3 / class143.field2438));
        class53.field1035 = class143.field2441 - ((int) ((float) arg3 / class143.field2438));
        class55.field1061 = (int) ((float) (arg1 * 2) / class143.field2438);
        int var6 = class310.field5255 - ((int) ((float) arg1 / class143.field2438));
        int var7 = (int) ((float) arg3 / class143.field2438) + class143.field2441;
        int var8 = (int) ((float) arg1 / class143.field2438) + class310.field5255;
        if (class247.field4247) {
            if (class157.field2696 == null || class157.field2696.field1058 != arg3 || class157.field2696.field1060 != arg1) {
                class157.field2696 = null;
                class157.field2696 = new class186(arg3, arg1);
            }
            class213.method1460(class157.field2696.field4003, arg3, arg1);
            class190.method1276(var6, arg3, (byte) 69, 0, var7, arg1, var8, 0, var5);
            class81.method516(0, var7, -1, var8, var6, 0, arg1, var5, arg3);
            class170.method1138(var8, var6, var7, arg1, 1, 0, var5, arg3, 0);
            class157.field2696.method278(arg4, arg2);
        } else {
            class190.method1276(var6, arg3 + arg4, (byte) 11, arg2, var7, arg2 + arg1, var8, arg4, var5);
            class81.method516(arg2, var7, -1, var8, var6, arg4, arg2 + arg1, var5, arg3 + arg4);
            class170.method1138(var8, var6, var7, arg1 + arg2, 1, arg2, var5, arg3 + arg4, arg4);
        }
        if (arg0) {
            field145 = (int[]) null;
        }
        if (class240.field4107 > 0) {
            class240.field4107--;
        }
        if (!class208.field3669) {
            return;
        }
        int var9 = arg4 + arg3 - 5;
        int var10 = arg1 + arg2 - 8;
        class132.field2292.method2083(class28.method177((byte) -104, new class128[] { class291.field4982, class257.method1811(class307.field5219, (byte) 127) }), var9, var10, 16776960, -1);
        int var17 = var10 - 15;
        Runtime var11 = Runtime.getRuntime();
        int var12 = (int) ((var11.totalMemory() - var11.freeMemory()) / 1024L);
        int var13 = 16776960;
        if (var12 > 65536) {
            var13 = 16711680;
        }
        class132.field2292.method2083(class28.method177((byte) -90, new class128[] { class292.field5007, class257.method1811(var12, (byte) 81), class236.field4051 }), var9, var17, var13, -1);
        var10 = var17 - 15;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BII)Lc;", line = 465)
    private final class293 method50(byte arg0, int arg1, int arg2) {
        if (arg0 >= -44) {
            this.field178 = false;
        }
        class293 var4 = (class293) this.field159.method728(false, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field5015 && var4.field5018) {
            var4.method1978((byte) 106);
            var4 = null;
        }
        field138++;
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field164 == null || this.field162[arg2] == -1) {
                    if (this.field150.method674(59)) {
                        return null;
                    }
                    var4 = this.field150.method678(-86, this.field156, (byte) 2, true, arg2);
                } else {
                    var4 = this.field170.method1043(arg2, this.field164, (byte) -121);
                }
            } else if (arg1 == 1) {
                if (this.field164 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field170.method1041(3, arg2, this.field164);
            } else if (arg1 == 2) {
                if (this.field164 == null) {
                    throw new RuntimeException();
                }
                if (this.field162[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field150.method672(true)) {
                    return null;
                }
                var4 = this.field150.method678(-88, this.field156, (byte) 2, false, arg2);
            } else {
                throw new RuntimeException();
            }
            this.field159.method730(var4, (long) arg2, (byte) -28);
        }
        if (var4.field5018) {
            return null;
        }
        byte[] var5 = var4.method1144(100);
        if (!var4 instanceof class171) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class193.field3336.reset();
                class193.field3336.update(var5, 0, var5.length - 2);
                int var6 = (int) class193.field3336.getValue();
                if (this.field165.field5132[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field150.field1894 = 0;
                this.field150.field1893 = 0;
            } catch (RuntimeException var14) {
                this.field150.method683(-118);
                var4.method1978((byte) 51);
                if (var4.field5015 && !this.field150.method674(77)) {
                    class281 var8 = this.field150.method678(-66, this.field156, (byte) 2, true, arg2);
                    this.field159.method730(var8, (long) arg2, (byte) -33);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field165.field5134[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field165.field5134[arg2];
            if (this.field164 != null) {
                this.field170.method1038(this.field164, (byte) 112, var5, arg2);
                if (this.field162[arg2] != 1) {
                    this.field160++;
                    this.field162[arg2] = 1;
                }
            }
            if (!var4.field5015) {
                var4.method1978((byte) -109);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class193.field3336.reset();
            class193.field3336.update(var5, 0, var5.length - 2);
            int var9 = (int) class193.field3336.getValue();
            if (this.field165.field5132[arg2] != var9) {
                throw new RuntimeException();
            }
            int var10 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field165.field5134[arg2] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field162[arg2] != 1) {
                if (this.field162[arg2] == 0) {
                }
                this.field160++;
                this.field162[arg2] = 1;
            }
            if (!var4.field5015) {
                var4.method1978((byte) -99);
            }
            return var4;
        } catch (Exception var13) {
            this.field162[arg2] = -1;
            var4.method1978((byte) 72);
            if (var4.field5015 && !this.field150.method674(120)) {
                class281 var12 = this.field150.method678(-95, this.field156, (byte) 2, true, arg2);
                this.field159.method730(var12, (long) arg2, (byte) -122);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)V", line = 676)
    public final void method51(int arg0, boolean arg1) {
        field151++;
        if (this.field164 == null || !arg1) {
            return;
        }
        for (class287 var3 = this.field179.method2024(0); var3 != null; var3 = this.field179.method2027(1211754408)) {
            if (((long) arg0) == var3.field4915) {
                return;
            }
        }
        class287 var4 = new class287();
        var4.field4915 = (long) arg0;
        this.field179.method2029((byte) -34, var4);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Lnd;", line = 706)
    public final class303 method52(byte arg0) {
        field171++;
        if (this.field165 != null) {
            return this.field165;
        } else if (arg0 > -85) {
            return (class303) null;
        } else {
            if (this.field154 == null) {
                if (this.field150.method674(21)) {
                    return null;
                }
                this.field154 = this.field150.method678(-56, 255, (byte) 0, true, this.field156);
            }
            if (this.field154.field5018) {
                return null;
            }
            byte[] var2 = this.field154.method1144(100);
            if (this.field154 instanceof class171) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field165 = new class303(var2, this.field173);
                    if (this.field165.field5138 != this.field166) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var5) {
                    this.field165 = null;
                    if (this.field150.method674(14)) {
                        this.field154 = null;
                    } else {
                        this.field154 = this.field150.method678(-77, 255, (byte) 0, true, this.field156);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field165 = new class303(var2, this.field173);
                } catch (RuntimeException var6) {
                    this.field150.method683(-128);
                    this.field165 = null;
                    if (this.field150.method674(22)) {
                        this.field154 = null;
                    } else {
                        this.field154 = this.field150.method678(-61, 255, (byte) 0, true, this.field156);
                    }
                    return null;
                }
                if (this.field172 != null) {
                    this.field170.method1038(this.field172, (byte) 112, var2, this.field156);
                }
            }
            this.field154 = null;
            if (this.field164 != null) {
                this.field160 = 0;
                this.field162 = new byte[this.field165.field5130];
            }
            return this.field165;
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V", line = 805)
    public static void method53(int arg0) {
        if (arg0 != -23000) {
            field145 = (int[]) null;
        }
        field167 = null;
        field145 = null;
        field148 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)I", line = 817)
    public final int method54(int arg0, byte arg1) {
        field175++;
        class293 var3 = (class293) this.field159.method728(false, (long) arg0);
        if (var3 == null) {
            int var4 = 87 / ((arg1 + 24) / 55);
            return 0;
        } else {
            return var3.method1146(0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(B)I", line = 835)
    public final int method55(byte arg0) {
        field168++;
        if (arg0 != 90) {
            return 40;
        } else if (this.method52((byte) -99) == null) {
            return this.field154 == null ? 0 : this.field154.method1146(0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)I", line = 873)
    private final int method56(boolean arg0) {
        if (!arg0) {
            this.field160 = 54;
        }
        field142++;
        return this.field165 == null ? 0 : this.field165.field5126;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lmh;B)I", line = 900)
    public static final int method57(class128 arg0, byte arg1) {
        field155++;
        int var2 = 0;
        if (arg1 >= -79) {
            return 100;
        }
        while (class97.field1671.length > var2) {
            if (class97.field1671[var2].method861(10362, arg0)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)I", line = 935)
    private final int method58(boolean arg0) {
        field141++;
        if (this.field165 == null) {
            return 0;
        } else if (this.field176) {
            class287 var2 = this.field174.method2024(0);
            if (var2 == null) {
                return 0;
            } else {
                if (arg0) {
                    this.method50((byte) 67, 15, 110);
                }
                return (int) var2.field4915;
            }
        } else {
            return this.field165.field5126;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)I", line = 963)
    public static final int method59(int arg0, int arg1, int arg2, int arg3) {
        field139++;
        if (arg3 != 0) {
            method53(-7);
        }
        return arg2 <= arg1 ? (arg1 <= arg0 ? arg1 : arg0) : arg2;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(ILqe;Lqe;Lel;Leh;IIZ)V", line = 2229)
    public class7(int arg0, class177 arg1, class177 arg2, class112 arg3, class158 arg4, int arg5, int arg6, boolean arg7) {
        this.field156 = arg0;
        this.field164 = arg1;
        if (this.field164 == null) {
            this.field176 = false;
        } else {
            this.field176 = true;
            this.field174 = new class296();
        }
        this.field181 = arg7;
        this.field170 = arg4;
        this.field172 = arg2;
        this.field166 = arg6;
        this.field150 = arg3;
        this.field173 = arg5;
        if (this.field172 != null) {
            this.field154 = this.field170.method1043(this.field156, this.field172, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(Z)I", line = 992)
    private final int method60(boolean arg0) {
        field169++;
        return arg0 ? -101 : this.field160;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIZIII[Lem;I)V", line = 1003)
    public static final void method61(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, class10[] arg8, int arg9) {
        if (class247.field4247) {
            class269.method1875(arg6, arg1, arg0, arg3);
        } else {
            class213.method1470(arg6, arg1, arg0, arg3);
            class141.method943();
        }
        field161++;
        if (arg4) {
            field163 = false;
        }
        for (int var10 = 0; var10 < arg8.length; var10++) {
            class10 var11 = arg8[var10];
            if (var11 != null && (var11.field267 == arg9 || arg9 == -1412584499 && class165.field2839 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class120.field2037[class257.field4424] = var11.field253 + arg5;
                    class275.field4762[class257.field4424] = var11.field309 + arg2;
                    class32.field711[class257.field4424] = var11.field260;
                    class313.field5281[class257.field4424] = var11.field226;
                    var12 = class257.field4424++;
                } else {
                    var12 = arg7;
                }
                var11.field370 = class293.field5011;
                var11.field258 = var12;
                if (!var11.field294 || !client.method1646(var11)) {
                    if (var11.field222 > 0) {
                        class293.method2010(-119, var11);
                    }
                    int var13 = var11.field257;
                    int var14 = var11.field309 + arg2;
                    int var15 = var11.field253 + arg5;
                    if (class3.field57 && (client.method1657(var11) != 0 || var11.field288 == 0) && var13 > 127) {
                        var13 = 127;
                    }
                    if (class165.field2839 == var11) {
                        if (arg9 != -1412584499 && !var11.field285) {
                            class215.field3787 = arg5;
                            class240.field4093 = arg2;
                            class132.field2299 = arg8;
                            continue;
                        }
                        if (class51.field1009 && class256.field4405) {
                            int var16 = class275.field4760;
                            int var17 = class77.field1411;
                            int var18 = var17 - class4.field81;
                            int var19 = var16 - class188.field3264;
                            if (var18 < class30.field681) {
                                var18 = class30.field681;
                            }
                            if (class155.field2668 > var19) {
                                var19 = class155.field2668;
                            }
                            if ((class155.field2668 + class4.field73.field260) < (var11.field260 + var19)) {
                                var19 = class155.field2668 + class4.field73.field260 - var11.field260;
                            }
                            if (var11.field226 + var18 > class30.field681 + class4.field73.field226) {
                                var18 = class30.field681 + class4.field73.field226 - var11.field226;
                            }
                            var14 = var18;
                            var15 = var19;
                        }
                        if (!var11.field285) {
                            var13 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field288 == 2) {
                        var25 = arg3;
                        var20 = arg6;
                        var21 = arg1;
                        var24 = arg0;
                    } else {
                        var20 = arg6 >= var15 ? arg6 : var15;
                        var21 = var14 > arg1 ? var14 : arg1;
                        int var22 = var11.field260 + var15;
                        int var23 = var11.field226 + var14;
                        if (var11.field288 == 9) {
                            var23++;
                            var22++;
                        }
                        var24 = var22 < arg0 ? var22 : arg0;
                        var25 = var23 < arg3 ? var23 : arg3;
                    }
                    if (!var11.field294 || var20 < var24 && var21 < var25) {
                        if (var11.field222 != 0) {
                            if (var11.field222 == 1337 || var11.field222 == 1403 && class247.field4247) {
                                class264.field4581 = var14;
                                class165.field2843 = var15;
                                class266.field4621 = var11;
                                class218.method1505(var15, var14, var11.field222 == 1403, var11.field226, -70, var11.field260);
                                if (class247.field4247) {
                                    class269.method1875(arg6, arg1, arg0, arg3);
                                } else {
                                    class213.method1470(arg6, arg1, arg0, arg3);
                                }
                                continue;
                            }
                            if (var11.field222 == 1338) {
                                if (var11.method79(126)) {
                                    class182.method1242(-113, var12, var14, var11, var15);
                                    if (class247.field4247) {
                                        class269.method1875(arg6, arg1, arg0, arg3);
                                    } else {
                                        class213.method1470(arg6, arg1, arg0, arg3);
                                    }
                                }
                                continue;
                            }
                            if (var11.field222 == 1339) {
                                if (var11.method79(102)) {
                                    class297.method2036(var15, var14, arg4, var12, var11);
                                    if (class247.field4247) {
                                        class269.method1875(arg6, arg1, arg0, arg3);
                                    } else {
                                        class213.method1470(arg6, arg1, arg0, arg3);
                                    }
                                }
                                continue;
                            }
                            if (var11.field222 == 1400) {
                                method49(false, var11.field226, var14, var11.field260, var15);
                                class26.field581[var12] = true;
                                class199.field3468[var12] = true;
                                if (class247.field4247) {
                                    class269.method1875(arg6, arg1, arg0, arg3);
                                } else {
                                    class213.method1470(arg6, arg1, arg0, arg3);
                                }
                                continue;
                            }
                            if (var11.field222 == 1401) {
                                class28.method178(var15, var11.field260, var14, (byte) 3, var11.field226);
                                class26.field581[var12] = true;
                                class199.field3468[var12] = true;
                                if (class247.field4247) {
                                    class269.method1875(arg6, arg1, arg0, arg3);
                                } else {
                                    class213.method1470(arg6, arg1, arg0, arg3);
                                }
                                continue;
                            }
                            if (var11.field222 == 1402) {
                                if (!class247.field4247) {
                                    class220.method1524(false, var15, var14);
                                    class26.field581[var12] = true;
                                    class199.field3468[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field222 == 1405) {
                                if (!class208.field3669) {
                                    continue;
                                }
                                int var111 = var11.field260 + var15;
                                int var112 = var14 + 15;
                                class132.field2292.method2083(class28.method177((byte) -93, new class128[] { class263.field4568, class257.method1811(class307.field5219, (byte) 9) }), var111, var112, 16776960, -1);
                                int var113 = 16776960;
                                Runtime var114 = Runtime.getRuntime();
                                int var115 = (int) ((var114.totalMemory() - var114.freeMemory()) / 1024L);
                                int var126 = var112 + 15;
                                if (var115 > 65536) {
                                    var113 = 16711680;
                                }
                                class132.field2292.method2083(class28.method177((byte) -81, new class128[] { class109.field1847, class257.method1811(var115, (byte) 19), class58.field1116 }), var111, var126, var113, -1);
                                var112 = var126 + 15;
                                if (class247.field4247) {
                                    int var116 = 16776960;
                                    int var117 = (class274.field4746 - (-class274.field4745 - class274.field4744)) / 1024;
                                    if (var117 > 65536) {
                                        var116 = 16711680;
                                    }
                                    class132.field2292.method2083(class28.method177((byte) -55, new class128[] { class99.field1728, class257.method1811(var117, (byte) 37), class58.field1116 }), var111, var112, var116, -1);
                                    var112 += 15;
                                }
                                int var118 = 16776960;
                                int var119 = 0;
                                int var120 = 0;
                                int var121 = 0;
                                for (int var122 = 0; var122 < 27; var122++) {
                                    var119 += class190.field3306[var122].method56(true);
                                    var120 += class190.field3306[var122].method60(false);
                                    var121 += class190.field3306[var122].method58(false);
                                }
                                int var123 = var121 * 100 / var119;
                                int var124 = var120 * 10000 / var119;
                                class128 var125 = class28.method177((byte) -119, new class128[] { class91.field1549, class250.method1749((long) var124, 0, true, 0, 2), class56.field1080, class257.method1811(var123, (byte) 121), class292.field5003 });
                                class34.field724.method2083(var125, var111, var112, var118, -1);
                                var112 += 12;
                                class26.field581[var12] = true;
                                class199.field3468[var12] = true;
                                continue;
                            }
                        }
                        if (!class271.field4721) {
                            if (var11.field288 == 0 && var11.field301 && class252.field4359 >= var20 && class178.field3129 >= var21 && var24 > class252.field4359 && class178.field3129 < var25 && !class3.field57) {
                                class283.field4868[0] = class137.field2359;
                                class210.field3725[0] = class273.field4733;
                                class275.field4769 = 1;
                                class117.field1979[0] = 1003;
                            }
                            if (class252.field4359 >= var20 && var21 <= class178.field3129 && class252.field4359 < var24 && class178.field3129 < var25) {
                                class96.method605(class178.field3129 - var14, var11, 10927, class252.field4359 - var15);
                            }
                        }
                        if (var11.field288 == 0) {
                            if (!var11.field294 && client.method1646(var11) && class279.field4829 != var11) {
                                continue;
                            }
                            if (!var11.field294) {
                                if ((var11.field349 - var11.field226) < var11.field241) {
                                    var11.field241 = var11.field349 - var11.field226;
                                }
                                if (var11.field241 < 0) {
                                    var11.field241 = 0;
                                }
                            }
                            method61(var24, var21, var14 - var11.field241, var25, false, var15 - var11.field281, var20, var12, arg8, var11.field230);
                            if (var11.field348 != null) {
                                method61(var24, var21, var14 - var11.field241, var25, arg4, var15 - var11.field281, var20, var12, var11.field348, var11.field230);
                            }
                            class88 var26 = (class88) class182.field3198.method728(false, (long) var11.field230);
                            if (var26 != null) {
                                if (var26.field1508 == 0 && !class271.field4721 && var20 <= class252.field4359 && class178.field3129 >= var21 && class252.field4359 < var24 && class178.field3129 < var25 && !class3.field57) {
                                    class117.field1979[0] = 1003;
                                    class283.field4868[0] = class137.field2359;
                                    class275.field4769 = 1;
                                    class210.field3725[0] = class273.field4733;
                                }
                                class142.method950(var24, var25, var20, -13238, var12, var21, var26.field1510, var14, var15);
                            }
                            if (class247.field4247) {
                                class269.method1875(arg6, arg1, arg0, arg3);
                            } else {
                                class213.method1470(arg6, arg1, arg0, arg3);
                                class141.method943();
                            }
                        }
                        if (class253.field4366[var12] || class226.field3954 > 1) {
                            if (var11.field288 == 0 && !var11.field294 && var11.field226 < var11.field349) {
                                class248.method1725(var14, -30984, var11.field226, var15 + var11.field260, var11.field349, var11.field241);
                            }
                            if (var11.field288 != 1) {
                                if (var11.field288 == 2) {
                                    int var94 = 0;
                                    for (int var95 = 0; var95 < var11.field229; var95++) {
                                        for (int var96 = 0; var96 < var11.field327; var96++) {
                                            int var97 = (var11.field364 + 32) * var96 + var15;
                                            int var98 = (var11.field223 + 32) * var95 + var14;
                                            if (var94 < 20) {
                                                var98 += var11.field337[var94];
                                                var97 += var11.field287[var94];
                                            }
                                            if (var11.field336[var94] > 0) {
                                                boolean var99 = false;
                                                boolean var100 = false;
                                                int var101 = var11.field336[var94] - 1;
                                                if (arg6 < var97 + 32 && var97 < arg0 && arg1 < (var98 + 32) && arg3 > var98 || class81.field1457 == var11 && class262.field4541 == var94) {
                                                    class55 var102;
                                                    if (class28.field591 == 1 && class176.field3106 == var94 && class43.field872 == var11.field230) {
                                                        var102 = class123.method757(var11.field324[var94], 0, 2, var11.field328, 21254, var101);
                                                    } else {
                                                        var102 = class123.method757(var11.field324[var94], 3153952, 1, var11.field328, 21254, var101);
                                                    }
                                                    if (class141.field2408) {
                                                        class26.field581[var12] = true;
                                                    }
                                                    if (var102 == null) {
                                                        method48(var11, 0);
                                                    } else if (class81.field1457 == var11 && class262.field4541 == var94) {
                                                        int var103 = class275.field4760 - class219.field3867;
                                                        if (var103 < 5 && var103 > -5) {
                                                            var103 = 0;
                                                        }
                                                        int var104 = class77.field1411 - class115.field1943;
                                                        if (var104 < 5 && var104 > -5) {
                                                            var104 = 0;
                                                        }
                                                        if (class259.field4459 < 5) {
                                                            var104 = 0;
                                                            var103 = 0;
                                                        }
                                                        var102.method271(var97 + var103, var98 + var104, 128);
                                                        if (arg9 != -1) {
                                                            int var105;
                                                            int var106;
                                                            if (class247.field4247) {
                                                                var105 = class269.field4665;
                                                                var106 = class269.field4664;
                                                            } else {
                                                                var105 = class213.field3768;
                                                                var106 = class213.field3774;
                                                            }
                                                            class10 var107 = arg8[arg9 & 0xFFFF];
                                                            if (var98 + var104 < var105 && var107.field241 > 0) {
                                                                int var108 = (var105 - var98 - var104) * class50.field992 / 3;
                                                                if (class50.field992 * 10 < var108) {
                                                                    var108 = class50.field992 * 10;
                                                                }
                                                                if (var107.field241 < var108) {
                                                                    var108 = var107.field241;
                                                                }
                                                                var107.field241 -= var108;
                                                                class115.field1943 += var108;
                                                                method48(var107, 0);
                                                            }
                                                            if (var98 + var104 + 32 > var106 && var107.field241 < var107.field349 - var107.field226) {
                                                                int var109 = (var104 + var98 + 32 - var106) * class50.field992 / 3;
                                                                if (var109 > class50.field992 * 10) {
                                                                    var109 = class50.field992 * 10;
                                                                }
                                                                if ((var107.field349 - var107.field226 - var107.field241) < var109) {
                                                                    var109 = var107.field349 - var107.field226 - var107.field241;
                                                                }
                                                                var107.field241 += var109;
                                                                class115.field1943 -= var109;
                                                                method48(var107, 0);
                                                            }
                                                        }
                                                    } else if (class144.field2462 == var11 && class91.field1558 == var94) {
                                                        var102.method271(var97, var98, 128);
                                                    } else {
                                                        var102.method273(var97, var98);
                                                    }
                                                }
                                            } else if (var11.field296 != null && var94 < 20) {
                                                class55 var110 = var11.method77(false, var94);
                                                if (var110 != null) {
                                                    var110.method273(var97, var98);
                                                } else if (class171.field2989) {
                                                    method48(var11, 0);
                                                }
                                            }
                                            var94++;
                                        }
                                    }
                                } else if (var11.field288 == 3) {
                                    int var93;
                                    if (class62.method415((byte) -55, var11)) {
                                        var93 = var11.field346;
                                        if (class279.field4829 == var11 && var11.field339 != 0) {
                                            var93 = var11.field339;
                                        }
                                    } else {
                                        var93 = var11.field256;
                                        if (class279.field4829 == var11 && var11.field246 != 0) {
                                            var93 = var11.field246;
                                        }
                                    }
                                    if (var13 == 0) {
                                        if (var11.field215) {
                                            if (class247.field4247) {
                                                class269.method1878(var15, var14, var11.field260, var11.field226, var93);
                                            } else {
                                                class213.method1464(var15, var14, var11.field260, var11.field226, var93);
                                            }
                                        } else if (class247.field4247) {
                                            class269.method1871(var15, var14, var11.field260, var11.field226, var93);
                                        } else {
                                            class213.method1463(var15, var14, var11.field260, var11.field226, var93);
                                        }
                                    } else if (var11.field215) {
                                        if (class247.field4247) {
                                            class269.method1876(var15, var14, var11.field260, var11.field226, var93, 256 - (var13 & 0xFF));
                                        } else {
                                            class213.method1479(var15, var14, var11.field260, var11.field226, var93, 256 - (var13 & 0xFF));
                                        }
                                    } else if (class247.field4247) {
                                        class269.method1880(var15, var14, var11.field260, var11.field226, var93, 256 - (var13 & 0xFF));
                                    } else {
                                        class213.method1480(var15, var14, var11.field260, var11.field226, var93, 256 - (var13 & 0xFF));
                                    }
                                } else if (var11.field288 == 4) {
                                    class305 var27 = var11.method75(class167.field2861, (byte) 43);
                                    if (var27 != null) {
                                        class128 var28 = var11.field207;
                                        int var29;
                                        if (class62.method415((byte) -55, var11)) {
                                            var29 = var11.field346;
                                            if (class279.field4829 == var11 && var11.field339 != 0) {
                                                var29 = var11.field339;
                                            }
                                            if (var11.field358.method865((byte) -123) > 0) {
                                                var28 = var11.field358;
                                            }
                                        } else {
                                            var29 = var11.field256;
                                            if (class279.field4829 == var11 && var11.field246 != 0) {
                                                var29 = var11.field246;
                                            }
                                        }
                                        if (var11.field294 && var11.field299 != -1) {
                                            class200 var30 = class180.method1226(false, var11.field299);
                                            var28 = var30.field3506;
                                            if (var28 == null) {
                                                var28 = class72.field1339;
                                            }
                                            if ((var30.field3497 == 1 || var11.field252 != 1) && var11.field252 != -1) {
                                                var28 = class28.method177((byte) -92, new class128[] { class102.field1751, var28, class170.field2963, class34.method241((byte) 75, var11.field252) });
                                            }
                                        }
                                        if (class36.field739 == var11) {
                                            var28 = class62.field1186;
                                            var29 = var11.field256;
                                        }
                                        if (!var11.field294) {
                                            var28 = class84.method536(var11, var28, (byte) 90);
                                        }
                                        var27.method2075(var28, var15, var14, var11.field260, var11.field226, var29, var11.field362 ? 0 : -1, var11.field295, var11.field366, var11.field266);
                                    } else if (class171.field2989) {
                                        method48(var11, 0);
                                    }
                                } else if (var11.field288 == 5) {
                                    if (var11.field294) {
                                        class55 var78;
                                        if (var11.field299 == -1) {
                                            var78 = var11.method82((byte) 78, false);
                                        } else {
                                            var78 = class123.method757(var11.field252, var11.field347, var11.field278, var11.field328, 21254, var11.field299);
                                        }
                                        if (var78 != null) {
                                            int var79 = var78.field1065;
                                            int var80 = var78.field1062;
                                            if (var11.field350) {
                                                int var82 = (var11.field226 + var80 - 1) / var80;
                                                int var83 = (var79 + var11.field260 - 1) / var79;
                                                if (class247.field4247) {
                                                    class269.method1874(var15, var14, var11.field260 + var15, var11.field226 + var14);
                                                    boolean var86 = class148.method997(var78.field1058, (byte) -123);
                                                    boolean var87 = class148.method997(var78.field1060, (byte) -77);
                                                    class40 var88 = (class40) var78;
                                                    if (var86 && var87) {
                                                        if (var13 == 0) {
                                                            var88.method279(var15, var14, var83, var82);
                                                        } else {
                                                            var88.method277(var15, var14, 256 - (var13 & 0xFF), var83, var82);
                                                        }
                                                    } else if (var86) {
                                                        for (int var92 = 0; var92 < var82; var92++) {
                                                            if (var13 == 0) {
                                                                var88.method279(var15, var80 * var92 + var14, var83, 1);
                                                            } else {
                                                                var88.method277(var15, var80 * var92 + var14, -(var13 & 0xFF) + 256, var83, 1);
                                                            }
                                                        }
                                                    } else if (var87) {
                                                        for (int var89 = 0; var89 < var83; var89++) {
                                                            if (var13 == 0) {
                                                                var88.method279(var79 * var89 + var15, var14, 1, var82);
                                                            } else {
                                                                var88.method277(var79 * var89 + var15, var14, 256 - (var13 & 0xFF), 1, var82);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var90 = 0; var90 < var83; var90++) {
                                                            for (int var91 = 0; var91 < var82; var91++) {
                                                                if (var13 == 0) {
                                                                    var78.method273(var79 * var90 + var15, var80 * var91 + var14);
                                                                } else {
                                                                    var78.method271(var15 + (var79 * var90), var14 - -(var80 * var91), 256 - (var13 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class269.method1875(arg6, arg1, arg0, arg3);
                                                } else {
                                                    class213.method1467(var15, var14, var11.field260 + var15, var11.field226 + var14);
                                                    for (int var84 = 0; var84 < var83; var84++) {
                                                        for (int var85 = 0; var85 < var82; var85++) {
                                                            if (var11.field371 != 0) {
                                                                var78.method370(var11.field371, var79 / 2 + var79 * var84 + var15, 4096, 127, var80 / 2 + (var14 + (var80 * var85)));
                                                            } else if (var13 == 0) {
                                                                var78.method273(var79 * var84 + var15, var80 * var85 + var14);
                                                            } else {
                                                                var78.method271(var15 + (var79 * var84), var80 * var85 + var14, 256 - (var13 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class213.method1470(arg6, arg1, arg0, arg3);
                                                }
                                            } else {
                                                int var81 = var11.field260 * 4096 / var79;
                                                if (var11.field371 != 0) {
                                                    var78.method370(var11.field371, var11.field260 / 2 + var15, var81, 125, var11.field226 / 2 + var14);
                                                } else if (var13 != 0) {
                                                    var78.method282(var15, var14, var11.field260, var11.field226, 256 - (var13 & 0xFF));
                                                } else if (var11.field260 == var79 && var11.field226 == var80) {
                                                    var78.method273(var15, var14);
                                                } else {
                                                    var78.method283(var15, var14, var11.field260, var11.field226);
                                                }
                                            }
                                        } else if (class171.field2989) {
                                            method48(var11, 0);
                                        }
                                    } else {
                                        class55 var77 = var11.method82((byte) 78, class62.method415((byte) -55, var11));
                                        if (var77 != null) {
                                            var77.method273(var15, var14);
                                        } else if (class171.field2989) {
                                            method48(var11, 0);
                                        }
                                    }
                                } else if (var11.field288 == 6) {
                                    class60 var31 = null;
                                    int var32 = 0;
                                    boolean var33 = class62.method415((byte) -55, var11);
                                    int var34;
                                    if (var33) {
                                        var34 = var11.field217;
                                    } else {
                                        var34 = var11.field275;
                                    }
                                    if (var11.field299 != -1) {
                                        class200 var39 = class180.method1226(arg4, var11.field299);
                                        if (var39 != null) {
                                            class200 var40 = var39.method1393(var11.field252, 32767);
                                            class1 var41 = var34 == -1 ? null : class167.method1091(-36, var34);
                                            var31 = var40.method1383(768, 1, var41, var11.field354);
                                            if (var31 == null) {
                                                method48(var11, 0);
                                            } else {
                                                var32 = -var31.method204() / 2;
                                            }
                                        }
                                    } else if (var11.field283 == 5) {
                                        if (var11.field265 == -1) {
                                            var31 = class50.field989.method38(-1, (class1) null, -1, -28, (class1) null);
                                        } else {
                                            int var35 = var11.field265 & 0x7FF;
                                            if (class104.field1780 == var35) {
                                                var35 = 2047;
                                            }
                                            class123 var36 = class140.field2405[var35];
                                            class1 var37 = var34 == -1 ? null : class167.method1091(-115, var34);
                                            if (var36 != null && (int) var36.field2079.method819((byte) 98) << 11 == (var11.field265 & 0xFFFFF800)) {
                                                var31 = var36.field2078.method38(var11.field354, var37, 0, -106, (class1) null);
                                            }
                                        }
                                    } else if (var34 == -1) {
                                        var31 = var11.method84(class163.field2796.field2078, var33, -1, -74, (class1) null);
                                        if (var31 == null && class171.field2989) {
                                            method48(var11, 0);
                                        }
                                    } else {
                                        class1 var38 = class167.method1091(63, var34);
                                        var31 = var11.method84(class163.field2796.field2078, var33, var11.field354, -122, var38);
                                        if (var31 == null && class171.field2989) {
                                            method48(var11, 0);
                                        }
                                    }
                                    if (var31 != null) {
                                        int var42;
                                        if (var11.field276 > 0) {
                                            var42 = (var11.field260 << 8) / var11.field276;
                                        } else {
                                            var42 = 256;
                                        }
                                        int var43;
                                        if (var11.field361 > 0) {
                                            var43 = (var11.field226 << 8) / var11.field361;
                                        } else {
                                            var43 = 256;
                                        }
                                        int var44 = (var11.field251 * var43 >> 8) + (var14 + (var11.field226 / 2));
                                        int var45 = var11.field260 / 2 + var15 + (var11.field220 * var42 >> 8);
                                        if (class247.field4247) {
                                            if (var11.field286) {
                                                class247.method1711(var45, var44, var11.field264, var11.field305, var42, var43);
                                            } else {
                                                class247.method1695(var45, var44, var42, var43);
                                                class247.method1716((float) var11.field261, (float) var11.field305 * 1.5F);
                                            }
                                            class247.method1715();
                                            class247.method1713(true);
                                            class247.method1681(false);
                                            class8.method64(-73);
                                            if (class226.field3947) {
                                                class269.method1879();
                                                class247.method1693();
                                                class269.method1875(arg6, arg1, arg0, arg3);
                                                class226.field3947 = false;
                                            }
                                            if (var11.field232) {
                                                class247.method1688();
                                            }
                                            int var46 = class141.field2424[var11.field231] * var11.field264 >> 16;
                                            int var47 = class141.field2411[var11.field231] * var11.field264 >> 16;
                                            if (var11.field294) {
                                                var31.method199(0, var11.field290, var11.field225, var11.field231, var11.field212, var11.field228 + var46 + var32, var11.field228 + var47);
                                            } else {
                                                var31.method199(0, var11.field290, 0, var11.field231, 0, var46, var47);
                                            }
                                            if (var11.field232) {
                                                class247.method1692();
                                            }
                                        } else {
                                            class141.method924(var45, var44);
                                            int var48 = class141.field2411[var11.field231] * var11.field264 >> 16;
                                            int var49 = class141.field2424[var11.field231] * var11.field264 >> 16;
                                            if (!var11.field294) {
                                                var31.method199(0, var11.field290, 0, var11.field231, 0, var49, var48);
                                            } else if (var11.field286) {
                                                ((class29) var31).method202(0, var11.field290, var11.field225, var11.field231, var11.field212, var49 - (-var11.field228 - var32), var11.field228 + var48, var11.field264);
                                            } else {
                                                var31.method199(0, var11.field290, var11.field225, var11.field231, var11.field212, var49 + var32 + var11.field228, var11.field228 + var48);
                                            }
                                            class141.method940();
                                        }
                                    }
                                } else {
                                    if (var11.field288 == 7) {
                                        class305 var50 = var11.method75(class167.field2861, (byte) -128);
                                        if (var50 == null) {
                                            if (class171.field2989) {
                                                method48(var11, 0);
                                            }
                                            continue;
                                        }
                                        int var51 = 0;
                                        for (int var52 = 0; var52 < var11.field229; var52++) {
                                            for (int var53 = 0; var53 < var11.field327; var53++) {
                                                if (var11.field336[var51] > 0) {
                                                    class200 var54 = class180.method1226(false, var11.field336[var51] - 1);
                                                    class128 var55;
                                                    if (var54.field3497 != 1 && var11.field324[var51] == 1) {
                                                        var55 = class28.method177((byte) -99, new class128[] { class102.field1751, var54.field3506, class115.field1932 });
                                                    } else {
                                                        var55 = class28.method177((byte) -118, new class128[] { class102.field1751, var54.field3506, class170.field2963, class34.method241((byte) 76, var11.field324[var51]) });
                                                    }
                                                    int var56 = var15 + ((var11.field364 + 115) * var53);
                                                    int var57 = (var11.field223 + 12) * var52 + var14;
                                                    if (var11.field295 == 0) {
                                                        var50.method2067(var55, var56, var57, var11.field256, var11.field362 ? 0 : -1);
                                                    } else if (var11.field295 == 1) {
                                                        var50.method2082(var55, var56 + 57, var57, var11.field256, var11.field362 ? 0 : -1);
                                                    } else {
                                                        var50.method2083(var55, var56 + 115 - 1, var57, var11.field256, var11.field362 ? 0 : -1);
                                                    }
                                                }
                                                var51++;
                                            }
                                        }
                                    }
                                    if (var11.field288 == 8 && class43.field870 == var11 && class98.field1702 == class315.field5342) {
                                        int var58 = 0;
                                        int var59 = 0;
                                        class305 var60 = class132.field2292;
                                        class128 var61 = var11.field207;
                                        class128 var62 = class84.method536(var11, var61, (byte) 90);
                                        while (var62.method865((byte) -91) > 0) {
                                            int var63 = var62.method823(class97.field1680, true);
                                            class128 var64;
                                            if (var63 == -1) {
                                                var64 = var62;
                                                var62 = class273.field4733;
                                            } else {
                                                var64 = var62.method848(0, 126, var63);
                                                var62 = var62.method829(var63 + 4, (byte) 111);
                                            }
                                            int var65 = var60.method2070(var64);
                                            var59 += var60.field5189 + 1;
                                            if (var65 > var58) {
                                                var58 = var65;
                                            }
                                        }
                                        var59 += 7;
                                        int var66 = var14 + var11.field226 + 5;
                                        if (arg3 < (var59 + var66)) {
                                            var66 = arg3 - var59;
                                        }
                                        var58 += 6;
                                        int var67 = var15 - var58 - (-var11.field260 + 5);
                                        if (var67 < var15 + 5) {
                                            var67 = var15 + 5;
                                        }
                                        if (var58 + var67 > arg0) {
                                            var67 = arg0 - var58;
                                        }
                                        if (class247.field4247) {
                                            class269.method1878(var67, var66, var58, var59, 16777120);
                                            class269.method1871(var67, var66, var58, var59, 0);
                                        } else {
                                            class213.method1464(var67, var66, var58, var59, 16777120);
                                            class213.method1463(var67, var66, var58, var59, 0);
                                        }
                                        class128 var68 = var11.field207;
                                        int var69 = var66 + var60.field5189 + 2;
                                        class128 var70 = class84.method536(var11, var68, (byte) 90);
                                        while (var70.method865((byte) 111) > 0) {
                                            int var71 = var70.method823(class97.field1680, true);
                                            class128 var72;
                                            if (var71 == -1) {
                                                var72 = var70;
                                                var70 = class273.field4733;
                                            } else {
                                                var72 = var70.method848(0, 113, var71);
                                                var70 = var70.method829(var71 + 4, (byte) 106);
                                            }
                                            var60.method2067(var72, var67 + 3, var69, 0, -1);
                                            var69 += var60.field5189 + 1;
                                        }
                                    }
                                    if (var11.field288 == 9) {
                                        int var73;
                                        int var74;
                                        int var75;
                                        int var76;
                                        if (var11.field312) {
                                            var73 = var11.field260 + var15;
                                            var74 = var14;
                                            var75 = var15;
                                            var76 = var11.field226 + var14;
                                        } else {
                                            var76 = var14;
                                            var75 = var15;
                                            var74 = var11.field226 + var14;
                                            var73 = var15 + var11.field260;
                                        }
                                        if (var11.field213 == 1) {
                                            if (class247.field4247) {
                                                class269.method1881(var75, var76, var73, var74, var11.field256);
                                            } else {
                                                class213.method1471(var75, var76, var73, var74, var11.field256);
                                            }
                                        } else if (class247.field4247) {
                                            class269.method1873(var75, var76, var73, var74, var11.field256, var11.field213);
                                        } else {
                                            class213.method1477(var75, var76, var73, var74, var11.field256, var11.field213);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
