import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class277 {

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "[F")
    public float[] field4202 = new float[4];

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "Z")
    public boolean field4218 = false;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public int field4214;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Z")
    public boolean field4198;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "Z")
    public boolean field4219;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public int field4222;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public int field4208;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
    public int field4224;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "[S")
    public short[] field4204;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public int field4213;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public int field4196;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    private int field4209;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    public static int field4217 = 0;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "F")
    public float field4206;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "F")
    public float field4223;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    private int field4200;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    private int field4203;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    private int field4210;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
    private int field4226;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Lkf;")
    public class171 field4205;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Lph;")
    public static class361 field4199;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2019(boolean arg0) {
        if (!arg0) {
            method2028(-28, 56);
        }
        field4199 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIZ)V", line = 17)
    public final void method2020(boolean arg0, int arg1, boolean arg2) {
        field4220++;
        int var4 = this.field4203 * arg1 / 50 + this.field4209 & 0x7FF;
        int var5 = this.field4200;
        int var6;
        if (var5 == 1) {
            var6 = (class345.field5339[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class275.field4162[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field4206 = (float) ((this.field4210 * var6 >> 11) + this.field4226) / 2048.0F;
        float var7 = this.field4206 / 255.0F;
        this.field4202[1] = var7 * (float) class287.method2076(this.field4213 >> 8, 255);
        this.field4202[0] = var7 * (float) class287.method2076(this.field4213 >> 16, 255);
        if (!arg2) {
            this.field4202[2] = (float) class287.method2076(this.field4213, 255) * var7;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 94)
    public static final void method2021(int arg0) {
        field4212++;
        class229.method1711((byte) 95, false);
        boolean var1 = true;
        class157.field2268 = 0;
        for (int var2 = 0; var2 < class178.field2560.length; var2++) {
            if (class312.field4655[var2] != -1 && class178.field2560[var2] == null) {
                class178.field2560[var2] = class244.field3640.method2520(class312.field4655[var2], 0, (byte) -25);
                if (class178.field2560[var2] == null) {
                    class157.field2268++;
                    var1 = false;
                }
            }
            if (class12.field185[var2] != -1 && class333.field5155[var2] == null) {
                class333.field5155[var2] = class244.field3640.method2525(0, class12.field185[var2], 1, class57.field830[var2]);
                if (class333.field5155[var2] == null) {
                    var1 = false;
                    class157.field2268++;
                }
            }
            if (class141.field2031) {
                if (class98.field1390[var2] != -1 && class208.field3041[var2] == null) {
                    class208.field3041[var2] = class244.field3640.method2520(class98.field1390[var2], 0, (byte) -25);
                    if (class208.field3041[var2] == null) {
                        class157.field2268++;
                        var1 = false;
                    }
                }
                if (class57.field842[var2] != -1 && class219.field3275[var2] == null) {
                    class219.field3275[var2] = class244.field3640.method2520(class57.field842[var2], 0, (byte) -25);
                    if (class219.field3275[var2] == null) {
                        class157.field2268++;
                        var1 = false;
                    }
                }
            }
            if (class312.field4642 != null && class296.field4445[var2] == null && class312.field4642[var2] != -1) {
                class296.field4445[var2] = class244.field3640.method2525(0, class312.field4642[var2], 1, class57.field830[var2]);
                if (class296.field4445[var2] == null) {
                    class157.field2268++;
                    var1 = false;
                }
            }
        }
        if (class62.field901 == null) {
            if (class158.field2283 == null || !class165.field2365.method2516((byte) 100, class158.field2283.field4262 + "_labels")) {
                class62.field901 = new class109(0);
            } else if (class165.field2365.method2541(arg0 ^ 0xCBC, class158.field2283.field4262 + "_labels")) {
                class62.field901 = class166.method1182(arg0 + 31551, class158.field2283.field4262 + "_labels", class189.field2692, class165.field2365);
            } else {
                class157.field2268++;
                var1 = false;
            }
        }
        if (!var1) {
            class99.field1409 = 1;
            return;
        }
        class165.field2352 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class178.field2560.length; var4++) {
            byte[] var5 = class333.field5155[var4];
            if (var5 != null) {
                int var6 = (class85.field1201[var4] & 0xFF) * 64 - class202.field2968;
                int var7 = (class85.field1201[var4] >> 8) * 64 - class272.field4123;
                if (class276.field4187) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class81.method667(true, var6, var7, var5);
            }
            if (class141.field2031) {
                byte[] var8 = class219.field3275[var4];
                if (var8 != null) {
                    int var9 = (class85.field1201[var4] >> 8) * 64 - class272.field4123;
                    int var10 = (class85.field1201[var4] & 0xFF) * 64 - class202.field2968;
                    if (class276.field4187) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class81.method667(true, var10, var9, var8);
                }
            }
        }
        if (!var3) {
            class99.field1409 = 2;
            return;
        }
        if (class99.field1409 != 0) {
            class355.method2470((byte) -44, class127.field1851 + "<br>(100%)", true);
        }
        class32.method228(0);
        class279.method2039((byte) 82);
        boolean var11 = false;
        if (class141.field2031 && class267.field4078) {
            for (int var12 = 0; var12 < class178.field2560.length; var12++) {
                if (class219.field3275[var12] != null || class208.field3041[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class258.method1898(4, 104, 104, class141.field2031 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class92.field1269[var13].method744(false);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class230.field3491[var14][var15][var16] = 0;
                }
            }
        }
        class192.method1386(2, false);
        if (class141.field2031) {
            class24.field346.method1745();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class24.field348[var17][var18].field2625 = true;
                }
            }
        }
        if (class141.field2031) {
            class268.method1980();
        }
        if (class141.field2031) {
            class255.method1869(arg0 ^ 0xFFFFD676);
        }
        class32.method228(0);
        System.gc();
        class229.method1711((byte) 112, true);
        class196.method1401(105, false);
        if (!class276.field4187) {
            class191.method1381(false, (byte) -102);
            class229.method1711((byte) 106, true);
            if (class141.field2031) {
                int var19 = class1.field55.field5162[0] >> 3;
                int var20 = class1.field55.field5186[0] >> 3;
                class299.method2120(var19, 256, var20);
            }
            class275.method2008((byte) -66, false);
            if (class296.field4445 != null) {
                class124.method927(arg0 + 30453);
            }
        }
        if (class276.field4187) {
            class262.method1944(false, arg0 ^ 0x5801D888);
            class229.method1711((byte) 125, true);
            if (class141.field2031) {
                int var21 = class1.field55.field5186[0] >> 3;
                int var22 = class1.field55.field5162[0] >> 3;
                class299.method2120(var22, 256, var21);
            }
            class299.method2125(false, (byte) -93);
        }
        class279.method2039((byte) 82);
        class229.method1711((byte) 115, true);
        class23.method134(arg0 + 31477, class276.field4187 ? class255.field3815 : (int[][][]) null, class92.field1269, false);
        if (class141.field2031) {
            class268.method1986();
        }
        class229.method1711((byte) 109, true);
        int var23 = class215.field3169;
        if (class321.field4835 < var23) {
            var23 = class321.field4835;
        }
        if (class321.field4835 - 1 > var23) {
            int var24 = class321.field4835 - 1;
        }
        if (class3.method15((byte) 93)) {
            class287.method2074(0);
        } else {
            class287.method2074(class215.field3169);
        }
        class48.method414(25482);
        if (arg0 != -31477) {
            field4199 = (class361) null;
        }
        if (class141.field2031 && var11) {
            class119.method892(true);
            class196.method1401(arg0 ^ 0xFFFF8562, true);
            if (!class276.field4187) {
                class191.method1381(true, (byte) -102);
                class229.method1711((byte) 105, true);
                class275.method2008((byte) -112, true);
            }
            if (class276.field4187) {
                class262.method1944(true, -1476502141);
                class229.method1711((byte) 119, true);
                class299.method2125(true, (byte) -93);
            }
            class279.method2039((byte) 82);
            class229.method1711((byte) 92, true);
            class23.method134(0, class276.field4187 ? class255.field3815 : (int[][][]) null, class92.field1269, true);
            class229.method1711((byte) 80, true);
            class48.method414(25482);
            class119.method892(false);
        }
        if (class141.field2031) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class24.field348[var25][var26].method1261(class132.field1930[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class241.method1776(var28, true, var27);
            }
        }
        class292.method2101((byte) 34);
        class32.method228(0);
        class116.method871(120);
        class279.method2039((byte) 82);
        class74.field1080 = false;
        if (class141.field2031) {
            class206.method1504(true, 16555);
        }
        if (class131.field1905 != null && class67.field973 != null && class194.field2819 == 25) {
            class107.field1533.method1915(true, 104);
            class107.field1533.method1354(1057001181, (byte) -108);
            class267.field4068++;
        }
        if (!class276.field4187) {
            int var29 = (class169.field2446 - 6) / 8;
            int var30 = (class169.field2446 + 6) / 8;
            int var31 = (class324.field4884 - 6) / 8;
            int var32 = (class324.field4884 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= (var30 + 1); var33++) {
                for (int var34 = var31 - 1; var34 <= (var32 + 1); var34++) {
                    if (var29 > var33 || var33 > var30 || var34 < var31 || var34 > var32) {
                        class244.field3640.method2533((byte) 114, "m" + var33 + "_" + var34);
                        class244.field3640.method2533((byte) -99, "l" + var33 + "_" + var34);
                    }
                }
            }
        }
        if (class194.field2819 == 28) {
            class250.method1837(10, 40);
        } else {
            class250.method1837(30, 40);
            if (class67.field973 != null) {
                class107.field1533.method1915(true, 48);
            }
        }
        class3.method16(arg0 + 31603);
        class32.method228(0);
        class273.method2006(107);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIBI)Lwd;", line = 596)
    public static final class82 method2022(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4207++;
        long var5 = (long) arg0 & 0xFFFFL | (long) arg2 & 0xFFFFL << 32 | (long) arg1 & 0xFFFFL << 48 | (long) arg4 & 0xFFFFL << 16;
        class82 var7 = (class82) class148.field2130.method461((byte) 120, var5);
        if (var7 != null) {
            return var7;
        }
        class198[] var8 = null;
        if (arg3 != 69) {
            return (class82) null;
        }
        class348 var9 = class227.method1698(-16, arg0);
        if (var9.field5374 != null) {
            var8 = new class198[var9.field5374.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class290 var11 = class48.method409((byte) 59, var9.field5374[var10]);
                var8[var10] = new class198(var11.field4385, var11.field4384, var11.field4396, var11.field4391, var11.field4390, var11.field4387, var11.field4383, var11.field4393);
            }
        }
        class82 var12 = new class82(var9.field5380, var8, var9.field5379, arg1, arg2, arg4);
        class148.field2130.method460(var12, -26089, var5);
        return var12;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 638)
    public static final void method2023(int arg0) {
        if (arg0 != 0) {
            field4217 = 94;
        }
        field4211++;
        class241.field3591.method462(24);
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V", line = 655)
    private final void method2024(int arg0) {
        field4216++;
        if (arg0 == -7735) {
            int var2 = (this.field4225 << 7) + 64;
            this.field4223 = 1.0F / (float) (var2 * var2);
        }
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V", line = 672)
    public static final void method2025(int arg0) {
        if (arg0 >= -10) {
            method2021(-10);
        }
        field4221++;
        class265.field4049.method458((byte) 96);
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V", line = 1042)
    protected class277() {
        if (class275.field4162 == null) {
            class112.method850(81);
        }
        this.method2027(-87);
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lsb;)V", line = 1052)
    public class277(class190 arg0) {
        if (class275.field4162 == null) {
            class112.method850(33);
        }
        this.field4214 = arg0.method1319(255);
        this.field4198 = (this.field4214 & 0x8) != 0;
        this.field4219 = (this.field4214 & 0x10) != 0;
        this.field4214 &= 0x7;
        this.field4222 = arg0.method1317((byte) 69);
        this.field4208 = arg0.method1317((byte) 96);
        this.field4224 = arg0.method1317((byte) 48);
        this.field4225 = arg0.method1319(255);
        this.method2024(-7735);
        this.field4204 = new short[this.field4225 * 2 + 1];
        for (int var2 = 0; var2 < this.field4204.length; var2++) {
            this.field4204[var2] = (short) arg0.method1317((byte) 45);
        }
        this.field4213 = class345.field5349[arg0.method1317((byte) 30)];
        int var3 = arg0.method1319(255);
        this.field4196 = var3 & 0x1F;
        this.field4209 = (var3 & 0xE0) << 3;
        if (this.field4196 != 31) {
            this.method2027(-126);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V", line = 695)
    public final void method2026(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4197++;
        this.field4226 = arg3;
        if (arg4 == 0) {
            this.field4210 = arg0;
            this.field4203 = arg2;
            this.field4200 = arg1;
        }
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)V", line = 723)
    private final void method2027(int arg0) {
        if (arg0 > -84) {
            this.field4214 = 40;
        }
        int var2 = this.field4196;
        if (var2 == 2) {
            this.field4210 = 2048;
            this.field4200 = 1;
            this.field4226 = 0;
            this.field4203 = 2048;
        } else if (var2 == 3) {
            this.field4210 = 2048;
            this.field4226 = 0;
            this.field4203 = 4096;
            this.field4200 = 1;
        } else if (var2 == 4) {
            this.field4203 = 2048;
            this.field4226 = 0;
            this.field4200 = 4;
            this.field4210 = 2048;
        } else if (var2 == 5) {
            this.field4210 = 2048;
            this.field4203 = 8192;
            this.field4200 = 4;
            this.field4226 = 0;
        } else if (var2 == 12) {
            this.field4200 = 2;
            this.field4226 = 0;
            this.field4203 = 2048;
            this.field4210 = 2048;
        } else if (var2 == 13) {
            this.field4210 = 2048;
            this.field4226 = 0;
            this.field4200 = 2;
            this.field4203 = 8192;
        } else if (var2 == 10) {
            this.field4203 = 2048;
            this.field4226 = 1536;
            this.field4200 = 3;
            this.field4210 = 512;
        } else if (var2 == 11) {
            this.field4210 = 512;
            this.field4226 = 1536;
            this.field4200 = 3;
            this.field4203 = 4096;
        } else if (var2 == 6) {
            this.field4203 = 2048;
            this.field4200 = 3;
            this.field4226 = 1280;
            this.field4210 = 768;
        } else if (var2 == 7) {
            this.field4226 = 1280;
            this.field4200 = 3;
            this.field4203 = 4096;
            this.field4210 = 768;
        } else if (var2 == 8) {
            this.field4200 = 3;
            this.field4203 = 2048;
            this.field4226 = 1024;
            this.field4210 = 1024;
        } else if (var2 == 9) {
            this.field4210 = 1024;
            this.field4200 = 3;
            this.field4226 = 1024;
            this.field4203 = 4096;
        } else if (var2 == 14) {
            this.field4226 = 1280;
            this.field4200 = 1;
            this.field4210 = 768;
            this.field4203 = 2048;
        } else if (var2 == 15) {
            this.field4226 = 1536;
            this.field4200 = 1;
            this.field4210 = 512;
            this.field4203 = 4096;
        } else if (var2 == 16) {
            this.field4203 = 8192;
            this.field4200 = 1;
            this.field4226 = 1792;
            this.field4210 = 256;
        } else {
            this.field4226 = 0;
            this.field4203 = 2048;
            this.field4210 = 2048;
            this.field4200 = 0;
        }
        field4215++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Z", line = 918)
    public static final boolean method2028(int arg0, int arg1) {
        field4201++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class216.field3186[arg1];
        if (arg0 >= -30) {
            method2028(-29, -114);
        }
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1004;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILno;IBIILei;ILqm;)V", line = 943)
    public static final void method2029(int arg0, class181 arg1, int arg2, byte arg3, int arg4, int arg5, class261 arg6, int arg7, class228 arg8) {
        field4195++;
        class349 var9 = new class349();
        var9.field5403 = arg4 * 128;
        var9.field5387 = arg2;
        int var10 = 63 % ((arg3 + 73) / 33);
        var9.field5386 = arg0 * 128;
        if (arg6 != null) {
            var9.field5388 = arg6;
            var9.field5394 = arg6.field3890;
            var9.field5390 = arg6.field3944;
            var9.field5392 = arg6.field3897 * 128;
            var9.field5399 = arg6.field3966;
            var9.field5406 = arg6.field3916;
            int var12 = arg6.field3962;
            int var13 = arg6.field3907;
            var9.field5400 = arg6.field3917;
            if (arg7 == 1 || arg7 == 3) {
                var12 = arg6.field3907;
                var13 = arg6.field3962;
            }
            var9.field5389 = (arg4 + var13) * 128;
            var9.field5396 = (arg0 + var12) * 128;
            if (arg6.field3895 != null) {
                var9.field5393 = true;
                var9.method2446(7819);
            }
            if (var9.field5400 != null) {
                var9.field5391 = var9.field5394 + (int) ((double) (var9.field5390 - var9.field5394) * Math.random());
            }
            class247.field3654.method106(var9, -126);
        } else if (arg1 != null) {
            class214 var11 = arg1.field2609;
            var9.field5384 = arg1;
            if (var11.field3142 != null) {
                var9.field5393 = true;
                var11 = var11.method1539(false);
            }
            if (var11 != null) {
                var9.field5396 = (arg0 + var11.field3083) * 128;
                var9.field5389 = (arg4 + var11.field3083) * 128;
                var9.field5399 = class312.method2186(arg1, 255);
                var9.field5406 = var11.field3140;
                var9.field5392 = var11.field3111 * 128;
            }
            class158.field2282.method106(var9, -126);
        } else if (arg8 != null) {
            var9.field5404 = arg8;
            var9.field5396 = (arg8.method1700(-96) + arg0) * 128;
            var9.field5389 = (arg4 + arg8.method1700(-117)) * 128;
            var9.field5399 = class180.method1249(arg8, 0);
            var9.field5392 = arg8.field3432 * 128;
            var9.field5406 = arg8.field3448;
            class50.field746.method1400((long) arg5, 106, var9);
        }
    }
}
