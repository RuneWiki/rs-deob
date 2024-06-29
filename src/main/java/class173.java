import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class173 extends class208 {

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    private int field2370 = 0;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Lec;")
    private class129 field2363 = new class129(16);

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    private int field2379 = 0;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "Laq;")
    private class90 field2382 = new class90();

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "J")
    private long field2386 = 0L;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    private int field2351;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "Lr;")
    private class99 field2376;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Z")
    private boolean field2383;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "Laq;")
    private class90 field2380;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "Z")
    private boolean field2384;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "Lrb;")
    private class197 field2371;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Lr;")
    private class99 field2364;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "Lcl;")
    private class145 field2377;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    private int field2368;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Leo;")
    private class163 field2352;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lvg;")
    public static class33 field2348 = new class33();

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "[I")
    public static int[] field2366 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Z")
    public static boolean field2367 = false;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lvk;")
    private class207 field2354;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2375;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "Z")
    private boolean field2381;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[B")
    private byte[] field2358;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)I", line = 6)
    public final int method1130(boolean arg0) {
        field2360++;
        if (this.field2354 == null) {
            return 0;
        } else if (arg0) {
            return this.field2354.field2846;
        } else {
            return 17;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 23)
    public final void method1131(byte arg0) {
        field2355++;
        if (this.field2380 == null) {
            return;
        }
        if (arg0 <= 110) {
            this.field2379 = -48;
        }
        if (this.method1146(255) == null) {
            return;
        }
        for (class390 var2 = this.field2382.method646(48); var2 != null; var2 = this.field2382.method641(false)) {
            int var3 = (int) var2.field5600;
            if (var3 < 0 || var3 >= this.field2354.field2845 || this.field2354.field2855[var3] == 0) {
                var2.method2467((byte) -94);
            } else {
                if (this.field2358[var3] == 0) {
                    this.method1145(1000, var3, 1);
                }
                if (this.field2358[var3] == -1) {
                    this.method1145(1000, var3, 2);
                }
                if (this.field2358[var3] == 1) {
                    var2.method2467((byte) -111);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lkh;B)Lul;", line = 70)
    public static final class343 method1132(class11 arg0, byte arg1) {
        int var2 = -78 % ((25 - arg1) / 57);
        field2347++;
        return new class343(arg0.method207(7124), arg0.method207(7124), arg0.method207(7124), arg0.method207(7124), arg0.method208(27308), arg0.method208(27308), arg0.method172((byte) 52));
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)I", line = 80)
    public final int method1133(byte arg0) {
        if (arg0 != 1) {
            this.field2364 = null;
        }
        field2373++;
        if (this.field2354 == null) {
            return 0;
        } else if (this.field2383) {
            class390 var2 = this.field2380.method646(48);
            return var2 == null ? 0 : (int) var2.field5600;
        } else {
            return this.field2354.field2846;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V", line = 111)
    public final void method1134(int arg0) {
        field2362++;
        if (arg0 != 250) {
            this.method1147(-65, 42);
        }
        if (this.field2380 != null) {
            if (this.method1146(255) == null) {
                return;
            }
            if (this.field2383) {
                boolean var6 = true;
                for (class390 var7 = this.field2380.method646(48); var7 != null; var7 = this.field2380.method641(false)) {
                    int var9 = (int) var7.field5600;
                    if (this.field2358[var9] == 0) {
                        this.method1145(1000, var9, 1);
                    }
                    if (this.field2358[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2467((byte) -101);
                    }
                }
                while (this.field2379 < this.field2354.field2855.length) {
                    if (this.field2354.field2855[this.field2379] == 0) {
                        this.field2379++;
                    } else {
                        if (this.field2377.field2076 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field2358[this.field2379] == 0) {
                            this.method1145(arg0 ^ 0x312, this.field2379, 1);
                        }
                        if (this.field2358[this.field2379] == 0) {
                            class390 var8 = new class390();
                            var8.field5600 = (long) this.field2379;
                            this.field2380.method643(var8, -57);
                            var6 = false;
                        }
                        this.field2379++;
                    }
                }
                if (var6) {
                    this.field2379 = 0;
                    this.field2383 = false;
                }
            } else if (this.field2381) {
                boolean var2 = true;
                for (class390 var3 = this.field2380.method646(48); var3 != null; var3 = this.field2380.method641(false)) {
                    int var5 = (int) var3.field5600;
                    if (this.field2358[var5] != 1) {
                        this.method1145(1000, var5, 2);
                    }
                    if (this.field2358[var5] == 1) {
                        var3.method2467((byte) 119);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field2379 < this.field2354.field2855.length) {
                    if (this.field2354.field2855[this.field2379] == 0) {
                        this.field2379++;
                    } else {
                        if (this.field2371.method1273((byte) -82)) {
                            var2 = false;
                            break;
                        }
                        if (this.field2358[this.field2379] != 1) {
                            this.method1145(arg0 + 750, this.field2379, 2);
                        }
                        if (this.field2358[this.field2379] != 1) {
                            class390 var4 = new class390();
                            var4.field5600 = (long) this.field2379;
                            this.field2380.method643(var4, -25);
                            var2 = false;
                        }
                        this.field2379++;
                    }
                }
                if (var2) {
                    this.field2381 = false;
                    this.field2379 = 0;
                }
            } else {
                this.field2380 = null;
            }
        }
        if (!this.field2384 || class385.method2442(arg0 - 6881) < this.field2386) {
            return;
        }
        for (class163 var10 = (class163) this.field2363.method885(-87); var10 != null; var10 = (class163) this.field2363.method881((byte) -68)) {
            if (!var10.field2254) {
                if (var10.field2258) {
                    if (!var10.field2257) {
                        throw new RuntimeException();
                    }
                    var10.method2467((byte) 111);
                } else {
                    var10.field2258 = true;
                }
            }
        }
        this.field2386 = class385.method2442(-6631) + 1000L;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 292)
    public final void method1135(int arg0, int arg1) {
        field2385++;
        if (this.field2376 == null || arg0 >= -10) {
            return;
        }
        for (class390 var3 = this.field2382.method646(48); var3 != null; var3 = this.field2382.method641(false)) {
            if (((long) arg1) == var3.field5600) {
                return;
            }
        }
        class390 var4 = new class390();
        var4.field5600 = (long) arg1;
        this.field2382.method643(var4, -67);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)Lmh;", line = 332)
    public static final class378 method1136(int arg0, int arg1) {
        field2369++;
        class378 var2 = (class378) class67.field1008.method904(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class314.field4298.method1745(arg1, (byte) -92, 33);
        class378 var4 = new class378();
        if (arg0 != 21742) {
            field2366 = null;
        }
        if (var3 != null) {
            var4.method2416(-16711, arg1, new class11(var3));
        }
        class67.field1008.method902((long) arg1, (byte) 112, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IZ)Z", line = 356)
    public static final boolean method1137(int arg0, boolean arg1) {
        if (arg0 >= -126) {
            field2375 = null;
        }
        field2353++;
        boolean var2 = class64.field949.method141();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class64.field949.method60();
        } else if (!class64.field949.method99()) {
            arg1 = false;
        }
        if (var2 == arg1) {
            return false;
        } else {
            class288.field4049 = arg1;
            class271.method1775(class241.field3426, 41);
            return true;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILms;I)I", line = 394)
    public static final int method1138(int arg0, class453 arg1, int arg2) {
        int var3 = -119 % ((64 - arg2) / 55);
        field2361++;
        if (!client.method1091(arg1).method960(true, arg0) && arg1.field6366 == null) {
            return -1;
        } else if (arg1.field6316 == null || arg0 >= arg1.field6316.length) {
            return -1;
        } else {
            return arg1.field6316[arg0];
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lms;III)V", line = 409)
    public static final void method1139(class453 arg0, int arg1, int arg2, int arg3) {
        field2365++;
        class241 var4 = arg0.method2811(class64.field949, (byte) -113);
        if (var4 == null) {
            return;
        }
        class64.field949.method136(arg3, arg2, arg0.field6342 + arg3, arg0.field6447 + arg2);
        if (arg1 != -277) {
            field2375 = null;
        }
        if (class53.field743 >= 3) {
            class64.field949.method86(-16777216, var4, arg3, arg2);
        } else {
            class144.field2061.method1500((float) arg0.field6342 / 2.0F + (float) arg3, (float) arg0.field6447 / 2.0F + (float) arg2, 4096, (int) (-class333.field4599) & 0x3FFF << 2, var4, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)I", line = 435)
    public final int method1140(int arg0) {
        if (arg0 >= -70) {
            this.method1135(34, 7);
        }
        field2374++;
        return this.field2370;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V", line = 446)
    public final void method1141(int arg0) {
        if (arg0 != -1280662168) {
            this.method1145(-52, 116, -83);
        }
        field2350++;
        if (this.field2376 != null) {
            this.field2381 = true;
            if (this.field2380 == null) {
                this.field2380 = new class90();
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)I", line = 468)
    public final int method1142(int arg0, boolean arg1) {
        if (arg1) {
            method1138(109, (class453) null, 68);
        }
        field2356++;
        class163 var3 = (class163) this.field2363.method886((long) arg0, 25651);
        return var3 == null ? 0 : var3.method1078(29783);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)I", line = 488)
    public final int method1143(boolean arg0) {
        field2349++;
        if (!arg0) {
            this.field2372 = -41;
        }
        if (this.method1146(255) == null) {
            return this.field2352 == null ? 0 : this.field2352.method1078(29783);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V", line = 513)
    public static void method1144(int arg0) {
        if (arg0 != -18626) {
            field2348 = null;
        }
        field2375 = null;
        field2366 = null;
        field2348 = null;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(ILr;Lr;Lrb;Lcl;IIZ)V", line = 887)
    public class173(int arg0, class99 arg1, class99 arg2, class197 arg3, class145 arg4, int arg5, int arg6, boolean arg7) {
        this.field2351 = arg0;
        this.field2376 = arg1;
        if (this.field2376 == null) {
            this.field2383 = false;
        } else {
            this.field2383 = true;
            this.field2380 = new class90();
        }
        this.field2372 = arg6;
        this.field2384 = arg7;
        this.field2371 = arg3;
        this.field2364 = arg2;
        this.field2377 = arg4;
        this.field2368 = arg5;
        if (this.field2364 != null) {
            this.field2352 = this.field2377.method990(this.field2351, this.field2364, (byte) -93);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Leo;", line = 529)
    private final class163 method1145(int arg0, int arg1, int arg2) {
        field2359++;
        class163 var4 = (class163) this.field2363.method886((long) arg1, 25651);
        if (var4 != null && arg2 == 0 && !var4.field2257 && var4.field2254) {
            var4.method2467((byte) -128);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field2376 == null || this.field2358[arg1] == -1) {
                    if (this.field2371.method1276((byte) -28)) {
                        return null;
                    }
                    var4 = this.field2371.method1271(arg1, true, arg0 - 1126, (byte) 2, this.field2351);
                } else {
                    var4 = this.field2377.method990(arg1, this.field2376, (byte) -123);
                }
            } else if (arg2 == 1) {
                if (this.field2376 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2377.method989(this.field2376, arg1, 0);
            } else if (arg2 == 2) {
                if (this.field2376 == null) {
                    throw new RuntimeException();
                }
                if (this.field2358[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2371.method1273((byte) -82)) {
                    return null;
                }
                var4 = this.field2371.method1271(arg1, false, -98, (byte) 2, this.field2351);
            } else {
                throw new RuntimeException();
            }
            this.field2363.method883((byte) -54, (long) arg1, var4);
        }
        if (var4.field2254) {
            return null;
        } else if (arg0 == 1000) {
            byte[] var5 = var4.method1075(-7537);
            if (!var4 instanceof class392) {
                try {
                    if (var5 == null || var5.length <= 2) {
                        throw new RuntimeException();
                    }
                    class50.field693.reset();
                    class50.field693.update(var5, 0, var5.length - 2);
                    int var6 = (int) class50.field693.getValue();
                    if (this.field2354.field2856[arg1] != var6) {
                        throw new RuntimeException();
                    }
                    this.field2371.field2729 = 0;
                    this.field2371.field2731 = 0;
                } catch (RuntimeException var12) {
                    this.field2371.method1272(-20053);
                    var4.method2467((byte) -75);
                    if (var4.field2257 && !this.field2371.method1276((byte) -28)) {
                        class272 var7 = this.field2371.method1271(arg1, true, arg0 - 1099, (byte) 2, this.field2351);
                        this.field2363.method883((byte) -54, (long) arg1, var7);
                    }
                    return null;
                }
                var5[var5.length - 2] = (byte) (this.field2354.field2843[arg1] >>> 8);
                var5[var5.length - 1] = (byte) this.field2354.field2843[arg1];
                if (this.field2376 != null) {
                    this.field2377.method994(7383, var5, this.field2376, arg1);
                    if (this.field2358[arg1] != 1) {
                        this.field2370++;
                        this.field2358[arg1] = 1;
                    }
                }
                if (!var4.field2257) {
                    var4.method2467((byte) 65);
                }
                return var4;
            }
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class50.field693.reset();
                class50.field693.update(var5, 0, var5.length - 2);
                int var8 = (int) class50.field693.getValue();
                if (this.field2354.field2856[arg1] != var8) {
                    throw new RuntimeException();
                }
                int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field2354.field2843[arg1] & 0xFFFF) != var9) {
                    throw new RuntimeException();
                }
                if (this.field2358[arg1] != 1) {
                    this.field2370++;
                    this.field2358[arg1] = 1;
                }
                if (!var4.field2257) {
                    var4.method2467((byte) 65);
                }
                return var4;
            } catch (Exception var11) {
                this.field2358[arg1] = -1;
                var4.method2467((byte) -121);
                if (var4.field2257 && !this.field2371.method1276((byte) -28)) {
                    class272 var10 = this.field2371.method1271(arg1, true, 84, (byte) 2, this.field2351);
                    this.field2363.method883((byte) -54, (long) arg1, var10);
                }
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Lvk;", line = 747)
    public final class207 method1146(int arg0) {
        field2378++;
        if (this.field2354 != null) {
            return this.field2354;
        } else if (arg0 == 255) {
            if (this.field2352 == null) {
                if (this.field2371.method1276((byte) -28)) {
                    return null;
                }
                this.field2352 = this.field2371.method1271(this.field2351, true, -93, (byte) 0, 255);
            }
            if (this.field2352.field2254) {
                return null;
            }
            byte[] var2 = this.field2352.method1075(-7537);
            if (this.field2352 instanceof class392) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field2354 = new class207(var2, this.field2368);
                    if (this.field2354.field2857 != this.field2372) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field2354 = null;
                    if (this.field2371.method1276((byte) -28)) {
                        this.field2352 = null;
                    } else {
                        this.field2352 = this.field2371.method1271(this.field2351, true, 120, (byte) 0, 255);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field2354 = new class207(var2, this.field2368);
                } catch (RuntimeException var4) {
                    this.field2371.method1272(arg0 ^ 0xFFFFB154);
                    this.field2354 = null;
                    if (this.field2371.method1276((byte) -28)) {
                        this.field2352 = null;
                    } else {
                        this.field2352 = this.field2371.method1271(this.field2351, true, 37, (byte) 0, 255);
                    }
                    return null;
                }
                if (this.field2364 != null) {
                    this.field2377.method994(arg0 + 7128, var2, this.field2364, this.field2351);
                }
            }
            this.field2352 = null;
            if (this.field2376 != null) {
                this.field2370 = 0;
                this.field2358 = new byte[this.field2354.field2845];
            }
            return this.field2354;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)[B", line = 849)
    public final byte[] method1147(int arg0, int arg1) {
        field2357++;
        class163 var3 = this.method1145(1000, arg1, 0);
        if (var3 == null) {
            return null;
        }
        if (arg0 != -650) {
            this.field2372 = -78;
        }
        byte[] var4 = var3.method1075(arg0 - 6887);
        var3.method2467((byte) -64);
        return var4;
    }
}
