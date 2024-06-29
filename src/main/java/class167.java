import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class167 {

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    private int field2372 = 0;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    private int field2371 = 128;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    private int field2381 = 0;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Z")
    public boolean field2384 = false;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "Z")
    public boolean field2385 = false;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    private int field2378 = 0;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public int field2375 = -1;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    private int field2395 = 128;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field2377 = 0;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "[I")
    public static int[] field2389 = new int[50];

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Llm;")
    public static class150 field2392 = new class150(64);

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public static int field2396 = 0;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    private int field2379;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Lnh;")
    public static class305 field2382;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "Lnh;")
    public static class305 field2394;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[S")
    private short[] field2380;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "[S")
    private short[] field2390;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "[S")
    private short[] field2391;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "[S")
    private short[] field2393;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lbj;Z)V")
    public final void method1069(class215 arg0, boolean arg1) {
        if (arg1) {
            method1071((byte[]) null, (byte) -60);
        }
        field2374++;
        while (true) {
            int var3 = arg0.method1374((byte) -60);
            if (var3 == 0) {
                return;
            }
            this.method1075(arg0, (byte) 120, var3);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method1070(byte arg0) {
        int var1 = class23.field370 * 128 + 64;
        field2387++;
        int var2 = class142.field1944 * 128 + 64;
        int var3 = class58.method360(var1, var2, false, class166.field2364) - class83.field1140;
        if (class180.field2739 >= 100) {
            class178.field2603 = class142.field1944 * 128 + 64;
            class188.field2848 = class23.field370 * 128 + 64;
            class27.field423 = class58.method360(class188.field2848, class178.field2603, false, class166.field2364) - class83.field1140;
        } else {
            if (var1 > class188.field2848) {
                class188.field2848 += (var1 - class188.field2848) * class180.field2739 / 1000 + class38.field577;
                if (class188.field2848 > var1) {
                    class188.field2848 = var1;
                }
            }
            if (var2 > class178.field2603) {
                class178.field2603 += class38.field577 + ((var2 - class178.field2603) * class180.field2739 / 1000);
                if (var2 < class178.field2603) {
                    class178.field2603 = var2;
                }
            }
            if (class188.field2848 > var1) {
                class188.field2848 -= (class188.field2848 - var1) * class180.field2739 / 1000 + class38.field577;
                if (class188.field2848 < var1) {
                    class188.field2848 = var1;
                }
            }
            if (class27.field423 < var3) {
                class27.field423 += (var3 - class27.field423) * class180.field2739 / 1000 + class38.field577;
                if (class27.field423 > var3) {
                    class27.field423 = var3;
                }
            }
            if (var2 < class178.field2603) {
                class178.field2603 -= (class178.field2603 - var2) * class180.field2739 / 1000 + class38.field577;
                if (class178.field2603 < var2) {
                    class178.field2603 = var2;
                }
            }
            if (var3 < class27.field423) {
                class27.field423 -= (class27.field423 - var3) * class180.field2739 / 1000 + class38.field577;
                if (var3 > class27.field423) {
                    class27.field423 = var3;
                }
            }
        }
        int var4 = 68 / ((arg0 + 68) / 57);
        int var5 = class297.field4726 * 128 + 64;
        int var6 = class312.field5014 * 128 + 64;
        int var7 = class58.method360(var5, var6, false, class166.field2364) - class48.field697;
        int var8 = var6 - class178.field2603;
        int var9 = var5 - class188.field2848;
        int var10 = var7 - class27.field423;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var12 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
        if (var12 < 128) {
            var12 = 128;
        }
        int var13 = (int) (-325.949D * Math.atan2((double) var8, (double) var9)) & 0x7FF;
        if (var12 > 383) {
            var12 = 383;
        }
        int var14 = var13 - class246.field3870;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (class277.field4407 < var12) {
            class277.field4407 += (var12 - class277.field4407) * class105.field1513 / 1000 + class292.field4670;
            if (class277.field4407 > var12) {
                class277.field4407 = var12;
            }
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var12 < class277.field4407) {
            class277.field4407 -= (class277.field4407 - var12) * class105.field1513 / 1000 + class292.field4670;
            if (var12 > class277.field4407) {
                class277.field4407 = var12;
            }
        }
        if (var14 > 0) {
            class246.field3870 += class105.field1513 * var14 / 1000 + class292.field4670;
            class246.field3870 &= 0x7FF;
        }
        if (var14 < 0) {
            class246.field3870 -= -var14 * class105.field1513 / 1000 + class292.field4670;
            class246.field3870 &= 0x7FF;
        }
        int var15 = var13 - class246.field3870;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class246.field3870 = var13;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([BB)Z")
    public static final boolean method1071(byte[] arg0, byte arg1) {
        field2376++;
        class215 var2 = new class215(arg0);
        int var3 = var2.method1374((byte) -60);
        if (var3 != 1) {
            return false;
        } else if (arg1 <= 90) {
            return false;
        } else {
            boolean var4 = var2.method1374((byte) -60) == 1;
            if (var4) {
                class228.method1508(0, var2);
            }
            class17.method123(-103, var2);
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)Lmi;")
    public final class94 method1072(int arg0, int arg1, int arg2, int arg3) {
        field2386++;
        class94 var5 = (class94) class105.field1509.method950((long) this.field2383, (byte) -45);
        if (arg1 != 1) {
            this.field2372 = -72;
        }
        if (var5 == null) {
            class162 var6 = class162.method1036(class38.field584, this.field2379, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field2390 != null) {
                for (int var7 = 0; var7 < this.field2390.length; var7++) {
                    var6.method1034(this.field2390[var7], this.field2393[var7]);
                }
            }
            if (this.field2380 != null) {
                for (int var8 = 0; var8 < this.field2380.length; var8++) {
                    var6.method1028(this.field2380[var8], this.field2391[var8]);
                }
            }
            var5 = var6.method1024(this.field2378 + 64, this.field2381 + 850, -30, -50, -30);
            class105.field1509.method942((long) this.field2383, (byte) 111, var5);
        }
        class94 var9;
        if (this.field2375 == -1 || arg0 == -1) {
            var9 = var5.method404(true, true, true);
        } else {
            var9 = class280.method1815(this.field2375, -102).method1235(-11262, arg3, arg2, var5, arg0);
        }
        if (this.field2371 != 128 || this.field2395 != 128) {
            var9.method438(this.field2371, this.field2395, this.field2371);
        }
        if (this.field2372 != 0) {
            if (this.field2372 == 90) {
                var9.method405();
            }
            if (this.field2372 == 180) {
                var9.method432();
            }
            if (this.field2372 == 270) {
                var9.method435();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1073(int arg0) {
        field2382 = null;
        field2392 = null;
        field2394 = null;
        field2389 = null;
        if (arg0 != -30) {
            field2389 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    public static final void method1074(byte arg0) {
        if (arg0 != 25) {
            field2382 = null;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class72.field1040[var1] = false;
        }
        class105.field1513 = 0;
        class12.field203 = 1;
        class300.field4766 = -1;
        field2388++;
        class80.field1107 = -1;
        class292.field4670 = 0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lbj;BI)V")
    private final void method1075(class215 arg0, byte arg1, int arg2) {
        field2373++;
        int var4 = 110 % ((arg1 - 77) / 40);
        if (arg2 == 1) {
            this.field2379 = arg0.method1379(-128);
        } else if (arg2 == 2) {
            this.field2375 = arg0.method1379(-73);
        } else if (arg2 == 4) {
            this.field2371 = arg0.method1379(-86);
        } else if (arg2 == 5) {
            this.field2395 = arg0.method1379(-118);
        } else if (arg2 == 6) {
            this.field2372 = arg0.method1379(-89);
        } else if (arg2 == 7) {
            this.field2378 = arg0.method1374((byte) -60);
        } else if (arg2 == 8) {
            this.field2381 = arg0.method1374((byte) -60);
        } else if (arg2 == 9) {
            this.field2385 = true;
        } else if (arg2 == 10) {
            this.field2384 = true;
        } else if (arg2 == 40) {
            int var7 = arg0.method1374((byte) -60);
            this.field2390 = new short[var7];
            this.field2393 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2390[var8] = (short) arg0.method1379(-125);
                this.field2393[var8] = (short) arg0.method1379(-96);
            }
        } else if (arg2 == 41) {
            int var5 = arg0.method1374((byte) -60);
            this.field2391 = new short[var5];
            this.field2380 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2380[var6] = (short) arg0.method1379(-72);
                this.field2391[var6] = (short) arg0.method1379(-89);
            }
            return;
        }
    }
}
