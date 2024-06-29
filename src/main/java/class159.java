import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class159 {

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lgfa;")
    private class150 field2283 = new class150();

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lgfa;")
    private class150 field2295 = new class150();

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Lgfa;")
    private class150 field2300 = new class150();

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "Lgfa;")
    private class150 field2301 = new class150();

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "Lio;")
    private class157 field2305 = new class157(4);

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public volatile int field2308 = 0;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public volatile int field2306 = 0;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "B")
    private byte field2309 = 0;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Lio;")
    private class157 field2307 = new class157(8);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[Llr;")
    public static class277[] field2279 = new class277[0];

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    private int field2304;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "J")
    private long field2302;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "Lth;")
    private class284 field2303;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "Lwd;")
    private class352 field2310;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "Lup;")
    public static class372 field2299;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lsba;")
    public static class647 field2282;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Z")
    public final boolean method976(int arg0) {
        if (arg0 != 20) {
            method988((byte) -22);
        }
        field2289++;
        return this.method984(117) >= 20;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Z")
    public final boolean method977(boolean arg0) {
        field2288++;
        if (this.field2303 != null) {
            long var2 = class529.method2982((byte) -69);
            int var4 = (int) (var2 - this.field2302);
            this.field2302 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2304 += var4;
            if (this.field2304 > 30000) {
                try {
                    this.field2303.method1679(1);
                } catch (Exception var27) {
                }
                this.field2303 = null;
            }
        }
        if (this.field2303 == null) {
            return this.method989(3) == 0 && this.method984(118) == 0;
        }
        try {
            this.field2303.method1684(-119);
            for (class352 var5 = (class352) this.field2283.method878(arg0); var5 != null; var5 = (class352) this.field2283.method880(-11278)) {
                this.field2305.field2219 = 0;
                this.field2305.method915(-31914, 1);
                this.field2305.method951((int) var5.field4564, 24);
                this.field2303.method1687(4, 127, this.field2305.field2199, 0);
                this.field2295.method879((byte) -73, var5);
            }
            for (class352 var6 = (class352) this.field2300.method878(arg0); var6 != null; var6 = (class352) this.field2300.method880(-11278)) {
                this.field2305.field2219 = 0;
                this.field2305.method915(-31914, 0);
                this.field2305.method951((int) var6.field4564, -9);
                this.field2303.method1687(4, 126, this.field2305.field2199, 0);
                this.field2301.method879((byte) -87, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field2303.method1683(-31136);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field2304 = 0;
                byte var9 = 0;
                if (this.field2310 == null) {
                    var9 = 8;
                } else if (this.field2310.field4695 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field2310.field4690.field2199.length - this.field2310.field4694;
                    int var11 = 512 - this.field2310.field4695;
                    if (var11 > (var10 - this.field2310.field4690.field2219)) {
                        var11 = var10 - this.field2310.field4690.field2219;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field2303.method1688(0, this.field2310.field4690.field2219, this.field2310.field4690.field2199, var11);
                    if (this.field2309 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field2310.field4690.field2199[this.field2310.field4690.field2219 + var12] = (byte) class50.method268(this.field2310.field4690.field2199[this.field2310.field4690.field2219 + var12], this.field2309);
                        }
                    }
                    this.field2310.field4695 += var11;
                    this.field2310.field4690.field2219 += var11;
                    if (this.field2310.field4690.field2219 == var10) {
                        this.field2310.method1982((byte) -24);
                        this.field2310.field2536 = false;
                        this.field2310 = null;
                    } else if (this.field2310.field4695 == 512) {
                        this.field2310.field4695 = 0;
                    }
                } else {
                    int var13 = var9 - this.field2307.field2219;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field2303.method1688(0, this.field2307.field2219, this.field2307.field2199, var13);
                    if (this.field2309 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field2307.field2199[this.field2307.field2219 + var14] = (byte) class50.method268(this.field2307.field2199[this.field2307.field2219 + var14], this.field2309);
                        }
                    }
                    this.field2307.field2219 += var13;
                    if (var9 <= this.field2307.field2219) {
                        if (this.field2310 == null) {
                            this.field2307.field2219 = 0;
                            int var15 = this.field2307.method930(255);
                            int var16 = this.field2307.method963(-123);
                            int var17 = this.field2307.method930(255);
                            int var18 = this.field2307.method908(arg0);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class352 var24;
                            if (var20) {
                                for (var24 = (class352) this.field2301.method878(false); var24 != null && var24.field4564 != var21; var24 = (class352) this.field2301.method880(-11278)) {
                                }
                            } else {
                                for (var24 = (class352) this.field2295.method878(false); var24 != null && var24.field4564 != var21; var24 = (class352) this.field2295.method880(-11278)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field2310 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field2310.field4690 = new class157(var18 + var25 + this.field2310.field4694);
                            this.field2310.field4690.method915(-31914, var19);
                            this.field2310.field4690.method958(0, var18);
                            this.field2307.field2219 = 0;
                            this.field2310.field4695 = 8;
                        } else if (this.field2310.field4695 != 0) {
                            throw new IOException();
                        } else if (this.field2307.field2199[0] == -1) {
                            this.field2307.field2219 = 0;
                            this.field2310.field4695 = 1;
                        } else {
                            this.field2310 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field2303.method1679(1);
            } catch (Exception var26) {
            }
            this.field2308++;
            this.field2303 = null;
            this.field2306 = -2;
            return this.method989(3) == 0 && this.method984(73) == 0;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILwv;Lwv;)V")
    public static final void method978(int arg0, class423 arg1, class423 arg2) {
        class87.field1070++;
        field2281++;
        class229 var3 = class97.method550(class71.field841, false, class616.field8528);
        var3.field2971.method958(arg0 - 8, arg1.field5685);
        var3.field2971.method918(24551, arg1.field5610);
        var3.field2971.method939(arg1.field5552, (byte) 48);
        var3.field2971.method946((byte) -77, arg2.field5552);
        if (arg0 != 8) {
            field2279 = null;
        }
        var3.field2971.method921(arg2.field5610, -59);
        var3.field2971.method937(arg2.field5685, -1972311984);
        class307.method1805(var3, -14704);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
    public final void method979(int arg0, boolean arg1) {
        field2297++;
        if (this.field2303 == null) {
            return;
        }
        try {
            this.field2305.field2219 = 0;
            this.field2305.method915(-31914, arg1 ? 2 : 3);
            this.field2305.method951(0, arg0 ^ 0x19);
            this.field2303.method1687(arg0, 125, this.field2305.field2199, 0);
        } catch (IOException var4) {
            try {
                this.field2303.method1679(1);
            } catch (Exception var3) {
            }
            this.field2306 = -2;
            this.field2308++;
            this.field2303 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Z")
    public final boolean method980(int arg0) {
        field2284++;
        if (arg0 != 4) {
            this.field2302 = -2L;
        }
        return this.method989(3) >= 20;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBIBZ)Lwd;")
    public final class352 method981(int arg0, byte arg1, int arg2, byte arg3, boolean arg4) {
        if (arg1 <= 51) {
            this.field2302 = -93L;
        }
        field2287++;
        long var6 = (long) ((arg2 << 16) + arg0);
        class352 var8 = new class352();
        var8.field2538 = arg4;
        var8.field4564 = var6;
        var8.field4694 = arg3;
        if (arg4) {
            if (this.method989(3) >= 20) {
                throw new RuntimeException();
            }
            this.field2283.method879((byte) -72, var8);
        } else if (this.method984(77) < 20) {
            this.field2300.method879((byte) -110, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public final void method982(int arg0) {
        field2285++;
        try {
            this.field2303.method1679(1);
        } catch (Exception var2) {
        }
        this.field2308++;
        this.field2309 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field2306 = -1;
        if (arg0 > -33) {
            field2279 = null;
        }
        this.field2303 = null;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
    public final void method983(int arg0) {
        field2280++;
        if (this.field2303 != null) {
            this.field2303.method1679(arg0 - 24312);
        }
        if (arg0 != 24313) {
            this.field2308 = -74;
        }
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)I")
    private final int method984(int arg0) {
        if (arg0 < 71) {
            this.method979(98, false);
        }
        field2293++;
        return this.field2300.method886(0) + this.field2301.method886(0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLth;Z)V")
    public final void method985(boolean arg0, class284 arg1, boolean arg2) {
        field2298++;
        if (this.field2303 != null) {
            try {
                this.field2303.method1679(1);
            } catch (Exception var8) {
            }
            this.field2303 = null;
        }
        this.field2303 = arg1;
        this.method991(-2);
        this.method979(4, arg0);
        this.field2310 = null;
        this.field2307.field2219 = 0;
        while (true) {
            class352 var4 = (class352) this.field2295.method885((byte) -102);
            if (var4 == null) {
                while (true) {
                    class352 var5 = (class352) this.field2301.method885((byte) -99);
                    if (var5 == null) {
                        if (this.field2309 != 0) {
                            try {
                                this.field2305.field2219 = 0;
                                this.field2305.method915(-31914, 4);
                                this.field2305.method915(-31914, this.field2309);
                                this.field2305.method918(24551, 0);
                                this.field2303.method1687(4, 125, this.field2305.field2199, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field2303.method1679(1);
                                } catch (Exception var6) {
                                }
                                this.field2303 = null;
                                this.field2308++;
                                this.field2306 = -2;
                            }
                        }
                        this.field2304 = 0;
                        if (arg2) {
                            return;
                        } else {
                            this.field2302 = class529.method2982((byte) -69);
                            return;
                        }
                    }
                    this.field2300.method879((byte) -89, var5);
                }
            }
            this.field2283.method879((byte) -111, var4);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILwv;)Ljava/lang/String;")
    public static final String method986(int arg0, class423 arg1) {
        field2290++;
        if (client.method3858(arg1).method37((byte) 81) == 0) {
            return null;
        } else if (arg1.field5632 == null || arg1.field5632.trim().length() == 0) {
            return class452.field5967 ? "Hidden-use" : null;
        } else if (arg0 == 6874) {
            return arg1.field5632;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
    public final void method987(int arg0) {
        if (this.field2303 != null) {
            this.field2303.method1682(-6137);
        }
        int var2 = 48 / ((22 - arg0) / 62);
        field2296++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method988(byte arg0) {
        int var1 = 8 / ((arg0 - 38) / 53);
        field2279 = null;
        field2282 = null;
        field2299 = null;
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)I")
    public final int method989(int arg0) {
        field2292++;
        return arg0 == 3 ? this.field2283.method886(0) + this.field2295.method886(0) : -80;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public final void method990(byte arg0) {
        field2291++;
        if (this.field2303 == null) {
            return;
        }
        try {
            this.field2305.field2219 = 0;
            this.field2305.method915(-31914, 7);
            this.field2305.method951(0, -122);
            this.field2303.method1687(4, 127, this.field2305.field2199, 0);
            int var2 = 10 / ((-arg0 - 23) / 62);
        } catch (IOException var4) {
            try {
                this.field2303.method1679(1);
            } catch (Exception var3) {
            }
            this.field2308++;
            this.field2303 = null;
            this.field2306 = -2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "(I)V")
    private final void method991(int arg0) {
        field2286++;
        if (this.field2303 == null) {
            return;
        }
        try {
            this.field2305.field2219 = 0;
            this.field2305.method915(-31914, 6);
            this.field2305.method951(3, -116);
            this.field2303.method1687(4, 124, this.field2305.field2199, 0);
        } catch (IOException var3) {
            try {
                this.field2303.method1679(1);
            } catch (Exception var2) {
            }
            this.field2303 = null;
            this.field2308++;
            this.field2306 = -2;
        }
        if (arg0 != -2) {
            field2279 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)V")
    public static final void method992(int arg0) {
        if (arg0 != 3139) {
            method988((byte) 51);
        }
        class448.field5935 = 0;
        field2294++;
        int var1 = (class408.field5369.field398 >> 9) + class125.field1745;
        int var2 = (class408.field5369.field397 >> 9) + class4.field23;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class448.field5935 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class448.field5935 = 1;
        }
        if (class448.field5935 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class448.field5935 = 0;
        }
    }
}
