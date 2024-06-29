import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class377 extends class694 {

    @OriginalMember(owner = "client!du", name = "z", descriptor = "I")
    private int field5144 = 0;

    @OriginalMember(owner = "client!du", name = "D", descriptor = "Lcja;")
    private class46 field5148 = new class46(16);

    @OriginalMember(owner = "client!du", name = "J", descriptor = "I")
    private int field5154 = 0;

    @OriginalMember(owner = "client!du", name = "G", descriptor = "Ljia;")
    private class645 field5151 = new class645();

    @OriginalMember(owner = "client!du", name = "L", descriptor = "J")
    private long field5156 = 0L;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    private int field5135;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "Lrt;")
    private class241 field5124;

    @OriginalMember(owner = "client!du", name = "H", descriptor = "Z")
    private boolean field5152;

    @OriginalMember(owner = "client!du", name = "F", descriptor = "Ljia;")
    private class645 field5150;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    private int field5131;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "[B")
    private byte[] field5128;

    @OriginalMember(owner = "client!du", name = "K", descriptor = "Z")
    private boolean field5155;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "Lus;")
    private class1 field5122;

    @OriginalMember(owner = "client!du", name = "w", descriptor = "Lma;")
    private class14 field5141;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "Lrt;")
    private class241 field5123;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    private int field5132;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "Lfn;")
    private class150 field5138;

    @OriginalMember(owner = "client!du", name = "A", descriptor = "[Z")
    public static boolean[] field5145 = new boolean[100];

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!du", name = "x", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!du", name = "y", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!du", name = "B", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!du", name = "C", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!du", name = "E", descriptor = "Lega;")
    private class740 field5149;

    @OriginalMember(owner = "client!du", name = "I", descriptor = "Z")
    private boolean field5153;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "[B")
    private byte[] field5133;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "[S")
    public static short[] field5130;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V", line = 7)
    public final void method2290(int arg0) {
        if (arg0 != -2) {
            this.method2299((byte) -84);
        }
        field5147++;
        if (this.field5124 != null) {
            this.field5153 = true;
            if (this.field5150 == null) {
                this.field5150 = new class645();
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZII)Lfn;", line = 26)
    private final class150 method2291(boolean arg0, int arg1, int arg2) {
        field5139++;
        class150 var4 = (class150) this.field5148.method337((long) arg1, 1);
        if (var4 != null && arg2 == 0 && !var4.field2490 && var4.field2489) {
            var4.method1207(111);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field5124 == null || this.field5133[arg1] == -1) {
                    if (this.field5122.method8(-23158)) {
                        return null;
                    }
                    var4 = this.field5122.method1(true, (byte) -50, arg1, this.field5135, (byte) 2);
                } else {
                    var4 = this.field5141.method80(this.field5124, arg1, (byte) -69);
                }
            } else if (arg2 == 1) {
                if (this.field5124 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5141.method79(this.field5124, arg1, (byte) -126);
            } else if (arg2 == 2) {
                if (this.field5124 == null) {
                    throw new RuntimeException();
                }
                if (this.field5133[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5122.method12(arg0)) {
                    return null;
                }
                var4 = this.field5122.method1(false, (byte) -50, arg1, this.field5135, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field5148.method341((long) arg1, var4, (byte) 94);
        }
        if (var4.field2489) {
            return null;
        } else if (arg0) {
            byte[] var5 = var4.method1194((byte) 118);
            if (!(var4 instanceof class312)) {
                try {
                    if (var5 == null || var5.length <= 2) {
                        throw new RuntimeException();
                    }
                    class463.field6291.reset();
                    class463.field6291.update(var5, 0, var5.length - 2);
                    int var6 = (int) class463.field6291.getValue();
                    if (this.field5149.field10203[arg1] != var6) {
                        throw new RuntimeException();
                    }
                    if (this.field5149.field10215 != null && this.field5149.field10215[arg1] != null) {
                        byte[] var7 = this.field5149.field10215[arg1];
                        byte[] var8 = class323.method2056((byte) -122, var5.length - 2, var5, 0);
                        for (int var9 = 0; var9 < 64; var9++) {
                            if (var7[var9] != var8[var9]) {
                                throw new RuntimeException();
                            }
                        }
                    }
                    this.field5122.field28 = 0;
                    this.field5122.field30 = 0;
                } catch (RuntimeException var17) {
                    this.field5122.method11(57);
                    var4.method1207(88);
                    if (var4.field2490 && !this.field5122.method8(-23158)) {
                        class257 var10 = this.field5122.method1(true, (byte) -50, arg1, this.field5135, (byte) 2);
                        this.field5148.method341((long) arg1, var10, (byte) 60);
                    }
                    return null;
                }
                var5[var5.length - 2] = (byte) (this.field5149.field10221[arg1] >>> 8);
                var5[var5.length - 1] = (byte) this.field5149.field10221[arg1];
                if (this.field5124 != null) {
                    this.field5141.method81(var5, true, this.field5124, arg1);
                    if (this.field5133[arg1] != 1) {
                        this.field5144++;
                        this.field5133[arg1] = 1;
                    }
                }
                if (!var4.field2490) {
                    var4.method1207(115);
                }
                return var4;
            }
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class463.field6291.reset();
                class463.field6291.update(var5, 0, var5.length - 2);
                int var11 = (int) class463.field6291.getValue();
                if (this.field5149.field10203[arg1] != var11) {
                    throw new RuntimeException();
                }
                if (this.field5149.field10215 != null && this.field5149.field10215[arg1] != null) {
                    byte[] var12 = this.field5149.field10215[arg1];
                    byte[] var13 = class323.method2056((byte) -122, var5.length - 2, var5, 0);
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (var12[var14] != var13[var14]) {
                            throw new RuntimeException();
                        }
                    }
                }
                int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field5149.field10221[arg1] & 0xFFFF) != var15) {
                    throw new RuntimeException();
                }
                if (this.field5133[arg1] != 1) {
                    this.field5144++;
                    this.field5133[arg1] = 1;
                }
                if (!var4.field2490) {
                    var4.method1207(100);
                }
                return var4;
            } catch (Exception var18) {
                this.field5133[arg1] = -1;
                var4.method1207(101);
                if (var4.field2490 && !this.field5122.method8(-23158)) {
                    class257 var16 = this.field5122.method1(true, (byte) -50, arg1, this.field5135, (byte) 2);
                    this.field5148.method341((long) arg1, var16, (byte) 64);
                }
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(B)I", line = 288)
    public final int method2292(byte arg0) {
        field5146++;
        if (arg0 != 0) {
            this.field5135 = 30;
        }
        return this.field5144;
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(I)V", line = 301)
    public static void method2293(int arg0) {
        if (arg0 == 27522) {
            field5130 = null;
            field5145 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(B)I", line = 313)
    public final int method2294(byte arg0) {
        field5125++;
        if (arg0 >= -115) {
            return -16;
        } else if (this.method2296((byte) -94) == null) {
            return this.field5138 == null ? 0 : this.field5138.method1192(100);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!du", name = "d", descriptor = "(B)V", line = 335)
    public final void method2295(byte arg0) {
        if (arg0 != -71) {
            method2300((byte) 0);
        }
        field5126++;
        if (this.field5150 == null || this.method2296((byte) -94) == null) {
            return;
        }
        for (class154 var2 = this.field5151.method3589((byte) -128); var2 != null; var2 = this.field5151.method3591(0)) {
            int var3 = (int) var2.field2528;
            if (var3 < 0 || var3 >= this.field5149.field10214 || this.field5149.field10217[var3] == 0) {
                var2.method1207(103);
            } else {
                if (this.field5133[var3] == 0) {
                    this.method2291(true, var3, 1);
                }
                if (this.field5133[var3] == -1) {
                    this.method2291(true, var3, 2);
                }
                if (this.field5133[var3] == 1) {
                    var2.method1207(85);
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)Lega;", line = 381)
    public final class740 method2296(byte arg0) {
        field5142++;
        if (this.field5149 != null) {
            return this.field5149;
        }
        if (this.field5138 == null) {
            if (this.field5122.method8(-23158)) {
                return null;
            }
            this.field5138 = this.field5122.method1(true, (byte) -50, this.field5135, 255, (byte) 0);
        }
        if (this.field5138.field2489) {
            return null;
        }
        byte[] var2 = this.field5138.method1194((byte) 118);
        if (arg0 != -94) {
            return null;
        }
        if (this.field5138 instanceof class312) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5149 = new class740(var2, this.field5132, this.field5128);
                if (this.field5149.field10210 != this.field5131) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field5149 = null;
                if (this.field5122.method8(-23158)) {
                    this.field5138 = null;
                } else {
                    this.field5138 = this.field5122.method1(true, (byte) -50, this.field5135, 255, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5149 = new class740(var2, this.field5132, this.field5128);
            } catch (RuntimeException var4) {
                this.field5122.method11(57);
                this.field5149 = null;
                if (this.field5122.method8(-23158)) {
                    this.field5138 = null;
                } else {
                    this.field5138 = this.field5122.method1(true, (byte) -50, this.field5135, 255, (byte) 0);
                }
                return null;
            }
            if (this.field5123 != null) {
                this.field5141.method81(var2, true, this.field5123, this.field5135);
            }
        }
        this.field5138 = null;
        if (this.field5124 != null) {
            this.field5133 = new byte[this.field5149.field10214];
            this.field5144 = 0;
        }
        return this.field5149;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BI)V", line = 479)
    public final void method2297(byte arg0, int arg1) {
        field5140++;
        if (arg0 != 14) {
            field5127 = 33;
        }
        if (this.field5124 == null) {
            return;
        }
        for (class154 var3 = this.field5151.method3589((byte) -128); var3 != null; var3 = this.field5151.method3591(0)) {
            if ((long) arg1 == var3.field2528) {
                return;
            }
        }
        class154 var4 = new class154();
        var4.field2528 = arg1;
        this.field5151.method3594((byte) 100, var4);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZI)I", line = 513)
    public final int method2298(boolean arg0, int arg1) {
        field5121++;
        class150 var3 = (class150) this.field5148.method337((long) arg1, 1);
        if (var3 == null) {
            if (arg0) {
                this.field5122 = null;
            }
            return 0;
        } else {
            return var3.method1192(100);
        }
    }

    @OriginalMember(owner = "client!du", name = "e", descriptor = "(B)V", line = 534)
    public final void method2299(byte arg0) {
        field5143++;
        if (this.field5150 != null) {
            if (this.method2296((byte) -94) == null) {
                return;
            }
            if (this.field5152) {
                boolean var2 = true;
                for (class154 var3 = this.field5150.method3589((byte) -127); var3 != null; var3 = this.field5150.method3591(0)) {
                    int var5 = (int) var3.field2528;
                    if (this.field5133[var5] == 0) {
                        this.method2291(true, var5, 1);
                    }
                    if (this.field5133[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1207(120);
                    }
                }
                while (this.field5149.field10217.length > this.field5154) {
                    if (this.field5149.field10217[this.field5154] == 0) {
                        this.field5154++;
                    } else {
                        if (this.field5141.field213 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field5133[this.field5154] == 0) {
                            this.method2291(true, this.field5154, 1);
                        }
                        if (this.field5133[this.field5154] == 0) {
                            class154 var4 = new class154();
                            var4.field2528 = this.field5154;
                            this.field5150.method3594((byte) -28, var4);
                            var2 = false;
                        }
                        this.field5154++;
                    }
                }
                if (var2) {
                    this.field5152 = false;
                    this.field5154 = 0;
                }
            } else if (this.field5153) {
                boolean var6 = true;
                for (class154 var7 = this.field5150.method3589((byte) -127); var7 != null; var7 = this.field5150.method3591(0)) {
                    int var9 = (int) var7.field2528;
                    if (this.field5133[var9] != 1) {
                        this.method2291(true, var9, 2);
                    }
                    if (this.field5133[var9] == 1) {
                        var7.method1207(108);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field5149.field10217.length > this.field5154) {
                    if (this.field5149.field10217[this.field5154] == 0) {
                        this.field5154++;
                    } else {
                        if (this.field5122.method12(true)) {
                            var6 = false;
                            break;
                        }
                        if (this.field5133[this.field5154] != 1) {
                            this.method2291(true, this.field5154, 2);
                        }
                        if (this.field5133[this.field5154] != 1) {
                            class154 var8 = new class154();
                            var8.field2528 = this.field5154;
                            this.field5150.method3594((byte) -99, var8);
                            var6 = false;
                        }
                        this.field5154++;
                    }
                }
                if (var6) {
                    this.field5154 = 0;
                    this.field5153 = false;
                }
            } else {
                this.field5150 = null;
            }
        }
        int var10 = 54 % ((66 - arg0) / 32);
        if (!this.field5155 || this.field5156 > class197.method1423(1)) {
            return;
        }
        for (class150 var11 = (class150) this.field5148.method335(-29067); var11 != null; var11 = (class150) this.field5148.method336(103)) {
            if (!var11.field2489) {
                if (var11.field2487) {
                    if (!var11.field2490) {
                        throw new RuntimeException();
                    }
                    var11.method1207(94);
                } else {
                    var11.field2487 = true;
                }
            }
        }
        this.field5156 = class197.method1423(1) + 1000L;
    }

    @OriginalMember(owner = "client!du", name = "f", descriptor = "(B)V", line = 712)
    public static final void method2300(byte arg0) {
        field5136++;
        int var1 = -114 / ((arg0 + 8) / 54);
        class153.field2516 = new class645();
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)[B", line = 725)
    public final byte[] method2301(int arg0, int arg1) {
        if (arg1 != -3272) {
            return null;
        }
        field5129++;
        class150 var3 = this.method2291(true, arg0, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1194((byte) 118);
            var3.method1207(98);
            return var4;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)I", line = 752)
    public final int method2302(boolean arg0) {
        field5137++;
        if (this.field5149 == null) {
            return 0;
        } else if (this.field5152) {
            if (!arg0) {
                this.method2296((byte) -71);
            }
            class154 var2 = this.field5150.method3589((byte) -128);
            return var2 == null ? 0 : (int) var2.field2528;
        } else {
            return this.field5149.field10204;
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(ILrt;Lrt;Lus;Lma;I[BIZ)V", line = 814)
    public class377(int arg0, class241 arg1, class241 arg2, class1 arg3, class14 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field5135 = arg0;
        this.field5124 = arg1;
        if (this.field5124 == null) {
            this.field5152 = false;
        } else {
            this.field5152 = true;
            this.field5150 = new class645();
        }
        this.field5131 = arg7;
        this.field5128 = arg6;
        this.field5155 = arg8;
        this.field5122 = arg3;
        this.field5141 = arg4;
        this.field5123 = arg2;
        this.field5132 = arg5;
        if (this.field5123 != null) {
            this.field5138 = this.field5141.method80(this.field5123, this.field5135, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!du", name = "g", descriptor = "(B)I", line = 787)
    public final int method2303(byte arg0) {
        field5134++;
        int var2 = 39 % ((arg0 - 20) / 46);
        return this.field5149 == null ? 0 : this.field5149.field10204;
    }
}
