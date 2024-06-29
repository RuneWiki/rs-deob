import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class179 {

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    private int field2314 = 32;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Z")
    private boolean field2309 = false;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "J")
    private long field2330 = class45.method252((byte) -8);

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "J")
    private long field2331 = 0L;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    private int field2332 = 0;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "Z")
    private boolean field2338 = true;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    private int field2340 = 0;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "[Lvb;")
    private class133[] field2334 = new class133[8];

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    private int field2339 = 0;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "J")
    private long field2341 = 0L;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "[Lvb;")
    private class133[] field2336 = new class133[8];

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    private int field2343 = 0;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Z")
    public static boolean field2321 = false;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Lqh;")
    public static class50 field2317 = new class50(512);

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "F")
    public static float field2322;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "Lvb;")
    private class133 field2324;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "[I")
    public int[] field2328;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()V", line = 4)
    public void method55() {
        field2313++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLvb;)V", line = 13)
    public final synchronized void method1039(byte arg0, class133 arg1) {
        field2318++;
        if (arg0 <= -106) {
            this.field2324 = arg1;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 24)
    public final synchronized void method1040(byte arg0) {
        field2326++;
        if (this.field2309) {
            return;
        }
        long var2 = class45.method252((byte) -8);
        try {
            if ((this.field2330 + 500000L) < var2) {
                this.field2330 = var2 - 500000L;
            }
            while ((this.field2330 + 5000L) < var2) {
                this.method1045(256, -125);
                this.field2330 += (256000 / class286.field3762);
            }
        } catch (Exception var8) {
            this.field2330 = var2;
        }
        if (this.field2328 == null) {
            return;
        }
        try {
            if (this.field2341 != 0L) {
                if (var2 < this.field2341) {
                    return;
                }
                this.method54(this.field2337);
                this.field2338 = true;
                this.field2341 = 0L;
            }
            int var4 = 86 % ((arg0 + 9) / 43);
            int var5 = this.method56();
            if ((this.field2340 - var5) > this.field2339) {
                this.field2339 = this.field2340 - var5;
            }
            int var6 = this.field2335 + this.field2333;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if ((var6 + 256) > this.field2337) {
                this.field2337 += 1024;
                if (this.field2337 > 16384) {
                    this.field2337 = 16384;
                }
                this.method55();
                var5 = 0;
                this.method54(this.field2337);
                if (var6 + 256 > this.field2337) {
                    var6 = this.field2337 - 256;
                    this.field2335 = var6 - this.field2333;
                }
                this.field2338 = true;
            }
            while (var6 > var5) {
                this.method1043(this.field2328, 256);
                var5 += 256;
                this.method57();
            }
            if (var2 > this.field2331) {
                if (this.field2338) {
                    this.field2338 = false;
                } else if (this.field2339 == 0 && this.field2332 == 0) {
                    this.method55();
                    this.field2341 = var2 + 2000L;
                    return;
                } else {
                    this.field2335 = Math.min(this.field2332, this.field2339);
                    this.field2332 = this.field2339;
                }
                this.field2339 = 0;
                this.field2331 = var2 + 2000L;
            }
            this.field2340 = var5;
        } catch (Exception var7) {
            this.method55();
            this.field2341 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 143)
    public void method54(int arg0) throws Exception {
        field2325++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lza;Z)V", line = 155)
    public static final void method1041(class287 arg0, boolean arg1) {
        field2319++;
        int var2 = class451.field6723;
        int var3 = class155.field2026;
        int var4 = class366.field4993;
        int var5 = class425.field6180;
        int var6 = -10660793;
        arg0.method1717(var4, var2, var5, var6, -22794, var3);
        arg0.method1717(var4 - 2, var2 - -1, 16, -16777216, -22794, var3 + 1);
        arg0.method1721(var2 + 1, var5 + -19, true, var3 + 18, -16777216, var4 + -2);
        class79.field976.method1878(-1, var3 + 14, class246.field3233.method1823(class374.field5072, (byte) -88), var6, var2 + 3, (byte) -5);
        int var7 = class148.field1951.method349((byte) -65);
        if (arg1) {
            return;
        }
        int var8 = class148.field1951.method347(-121);
        int var9 = 0;
        for (class36 var10 = (class36) class69.field806.method970(12); var10 != null; var10 = (class36) class69.field806.method976((byte) -119)) {
            int var11 = (class391.field5656 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var7 > var2 && var7 < var2 + var4 && var11 - 13 < var8 && var11 + 3 > var8 && var10.field365) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class75.method436(var10.field361, 127)) {
                var13 = class237.field3158.method236(-18315, (int) var10.field367).field2636;
            } else if (var10.field364 != -1) {
                var13 = class237.field3158.method236(-18315, var10.field364).field2636;
            } else if (class497.method2990(var10.field361, 96)) {
                class22 var14 = class339.field4484[(int) var10.field367];
                if (var14 != null) {
                    class212 var15 = var14.field220;
                    if (var15.field2903 != null) {
                        var15 = var15.method1350(class52.field606, -1);
                    }
                    if (var15 != null) {
                        var13 = var15.field2912;
                    }
                }
            } else if (class195.method1115(-14, var10.field361)) {
                Object var16 = null;
                class70 var17;
                if (var10.field361 == 1002) {
                    var17 = class123.field1593.method2920((int) var10.field367, 19219);
                } else {
                    var17 = class123.field1593.method2920((int) (var10.field367 >>> 32 & 0x7FFFFFFFL), 19219);
                }
                if (var17.field848 != null) {
                    var17 = var17.method403(-1, class52.field606);
                }
                if (var17 != null) {
                    var13 = var17.field879;
                }
            }
            String var18 = class496.method2988((byte) 124, var10);
            if (var13 != null) {
                var18 = var18 + class91.method507((byte) 27, var13);
            }
            class79.field976.method1882(class512.field7462, var2 + 3, 0, var11, var18, class125.field1615, (byte) 90, var12);
            if (var10.field363) {
                class483.field7124.method144(var2 + class121.field1570.method1066(112, var18) + 5, var11 + -12);
            }
            var9++;
        }
        class339.method1974(class366.field4993, class155.field2026, class451.field6723, class425.field6180, (byte) 87);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 260)
    public static void method1042(int arg0) {
        int var1 = -19 % ((arg0 - 49) / 51);
        field2317 = null;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "()I", line = 271)
    public int method56() throws Exception {
        field2327++;
        return this.field2337;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([II)V", line = 287)
    private final void method1043(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class495.field7227) {
            var3 = arg1 << 1;
        }
        class438.method2691(arg0, 0, var3);
        this.field2343 -= arg1;
        if (this.field2324 != null && this.field2343 <= 0) {
            this.field2343 += class286.field3762 >> 4;
            class329.method1931(0, this.field2324);
            this.method1048(this.field2324, this.field2324.method805(), 122);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class133 var10 = null;
                        class133 var11 = this.field2334[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class504 var12 = var11.field1755;
                                if (var12 == null || var12.field7336 <= var8) {
                                    var11.field1756 = true;
                                    int var13 = var11.method594();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field7336 += var13;
                                    }
                                    if (var4 >= this.field2314) {
                                        break label107;
                                    }
                                    class133 var14 = var11.method602();
                                    if (var14 != null) {
                                        int var15 = var11.field1754;
                                        while (var14 != null) {
                                            this.method1048(var14, var15 * var14.method805() >> 8, 125);
                                            var14 = var11.method596();
                                        }
                                    }
                                    class133 var16 = var11.field1753;
                                    var11.field1753 = null;
                                    if (var10 == null) {
                                        this.field2334[var7] = var16;
                                    } else {
                                        var10.field1753 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2336[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1753;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class133 var18 = this.field2334[var17];
                this.field2334[var17] = this.field2336[var17] = null;
                while (var18 != null) {
                    class133 var19 = var18.field1753;
                    var18.field1753 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2343 < 0) {
            this.field2343 = 0;
        }
        if (this.field2324 != null) {
            this.field2324.method572(arg0, 0, arg1);
        }
        this.field2330 = class45.method252((byte) -8);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 445)
    public final synchronized void method1044(boolean arg0) {
        if (class34.field347 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class34.field347.field4599[var3] == this) {
                    class34.field347.field4599[var3] = null;
                }
                if (class34.field347.field4599[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class34.field347.field4591 = true;
                while (class34.field347.field4597) {
                    class316.method1873(50L, arg0);
                }
                class34.field347 = null;
            }
        }
        field2316++;
        this.method55();
        this.field2328 = null;
        if (arg0) {
            this.field2324 = null;
        }
        this.field2309 = true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V", line = 492)
    private final void method1045(int arg0, int arg1) {
        this.field2343 -= arg0;
        int var3 = 51 % ((-arg1 - 72) / 44);
        field2311++;
        if (this.field2343 < 0) {
            this.field2343 = 0;
        }
        if (this.field2324 != null) {
            this.field2324.method580(arg0);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjava/lang/String;B)I", line = 508)
    public static final int method1046(int arg0, String arg1, byte arg2) {
        if (arg2 < 102) {
            return 69;
        } else {
            field2312++;
            return class118.method709(true, arg0, (byte) 46, arg1);
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 521)
    public final synchronized void method1047(int arg0) {
        this.field2338 = true;
        field2315++;
        if (arg0 != 2000) {
            this.method1039((byte) 96, null);
        }
        try {
            this.method52();
        } catch (Exception var2) {
            this.method55();
            this.field2341 = class45.method252((byte) -8) + 2000L;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lvb;II)V", line = 541)
    private final void method1048(class133 arg0, int arg1, int arg2) {
        field2310++;
        int var4 = arg1 >> 5;
        class133 var5 = this.field2336[var4];
        if (var5 == null) {
            this.field2334[var4] = arg0;
        } else {
            var5.field1753 = arg0;
        }
        int var6 = 38 % ((74 - arg2) / 46);
        this.field2336[var4] = arg0;
        arg0.field1754 = arg1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 563)
    public void method53(Component arg0) throws Exception {
        field2323++;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 570)
    public final void method1049(int arg0) {
        this.field2338 = true;
        if (arg0 == 256) {
            field2329++;
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "()V", line = 588)
    public void method52() throws Exception {
        field2342++;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "()V", line = 596)
    public void method57() throws Exception {
        field2320++;
    }
}
