import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class142 extends class121 {

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "Z")
    public boolean field3233 = false;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
    public int field3230 = -1;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    public int field3231 = 99;

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
    public int field3238 = 2;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
    public int field3235 = -1;

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
    public int field3243 = -1;

    @OriginalMember(owner = "client!uc", name = "pb", descriptor = "I")
    public int field3248 = -1;

    @OriginalMember(owner = "client!uc", name = "qb", descriptor = "I")
    public int field3249 = -1;

    @OriginalMember(owner = "client!uc", name = "wb", descriptor = "I")
    public int field3255 = 5;

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "Lhe;")
    public static class54 field3244 = class6.method58("(U5", false);

    @OriginalMember(owner = "client!uc", name = "Cb", descriptor = "Lhe;")
    public static class54 field3261 = class6.method58("runes", false);

    @OriginalMember(owner = "client!uc", name = "yb", descriptor = "Lhe;")
    public static class54 field3257 = class6.method58("<img=1>", false);

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "B")
    public static byte field3241;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!uc", name = "rb", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!uc", name = "sb", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!uc", name = "vb", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!uc", name = "xb", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!uc", name = "Ab", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!uc", name = "Bb", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!uc", name = "Db", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!uc", name = "Eb", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "Lvc;")
    public static class149 field3236;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "[I")
    private int[] field3237;

    @OriginalMember(owner = "client!uc", name = "nb", descriptor = "[I")
    public int[] field3246;

    @OriginalMember(owner = "client!uc", name = "ob", descriptor = "[I")
    public int[] field3247;

    @OriginalMember(owner = "client!uc", name = "tb", descriptor = "[I")
    private int[] field3252;

    @OriginalMember(owner = "client!uc", name = "ub", descriptor = "[I")
    public static int[] field3253;

    @OriginalMember(owner = "client!uc", name = "zb", descriptor = "[I")
    public int[] field3258;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILoa;)Loa;")
    public final class98 method1092(byte arg0, int arg1, class98 arg2) {
        field3260++;
        int var4 = this.field3258[arg1];
        int var5 = 39 % ((arg0 - 6) / 47);
        class107 var6 = class147.method1118((byte) 42, var4 >> 16);
        int var7 = var4 & 0xFFFF;
        if (var6 == null) {
            return arg2.method783(true);
        } else {
            class98 var8 = arg2.method783(!var6.method818((byte) 74, var7));
            var8.method784(var6, var7);
            return var8;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Loa;IB)Loa;")
    public final class98 method1093(class98 arg0, int arg1, byte arg2) {
        field3254++;
        int var4 = -119 / ((40 - arg2) / 45);
        int var5 = this.field3258[arg1];
        class107 var6 = class147.method1118((byte) 44, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method783(true);
        }
        class107 var8 = null;
        int var9 = 0;
        if (this.field3237 != null && this.field3237.length > arg1) {
            int var10 = this.field3237[arg1];
            var8 = class147.method1118((byte) 108, var10 >> 16);
            var9 = var10 & 0xFFFF;
        }
        if (var8 == null || var9 == 65535) {
            class98 var12 = arg0.method783(!var6.method818((byte) 74, var7));
            var12.method784(var6, var7);
            return var12;
        } else {
            class98 var11 = arg0.method783(!var6.method818((byte) 74, var7) & !var8.method818((byte) 74, var9));
            var11.method784(var6, var7);
            var11.method784(var8, var9);
            return var11;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Loa;ILuc;II)Loa;")
    public final class98 method1094(class98 arg0, int arg1, class142 arg2, int arg3, int arg4) {
        int var6 = this.field3258[arg3];
        field3232++;
        class107 var7 = class147.method1118((byte) 67, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method1092((byte) 72, arg1, arg0);
        }
        int var9 = arg2.field3258[arg1];
        class107 var10 = class147.method1118((byte) 63, var9 >> 16);
        if (arg4 != 24073) {
            return null;
        }
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class98 var12 = arg0.method783(!var7.method818((byte) 74, var8));
            var12.method784(var7, var8);
            return var12;
        } else {
            class98 var13 = arg0.method783(!var7.method818((byte) 74, var8) & !var10.method818((byte) 74, var11));
            var13.method767(var7, var8, var10, var11, this.field3252);
            return var13;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public static void method1095(byte arg0) {
        field3244 = null;
        field3257 = null;
        field3261 = null;
        field3236 = null;
        if (arg0 != -80) {
            field3257 = null;
        }
        field3253 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILoa;I)Loa;")
    public final class98 method1096(int arg0, int arg1, class98 arg2, int arg3) {
        field3234++;
        int var5 = this.field3258[arg0];
        class107 var6 = class147.method1118((byte) 62, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method783(true);
        }
        int var8 = arg1 & 0x3;
        if (arg3 != 30000) {
            this.field3247 = null;
        }
        class98 var9 = arg2.method783(!var6.method818((byte) 74, var7));
        if (var8 == 1) {
            var9.method780();
        } else if (var8 == 2) {
            var9.method771();
        } else if (var8 == 3) {
            var9.method775();
        }
        var9.method784(var6, var7);
        if (var8 == 1) {
            var9.method775();
        } else if (var8 == 2) {
            var9.method771();
        } else if (var8 == 3) {
            var9.method780();
        }
        return var9;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    public final void method1097(int arg0) {
        field3259++;
        if (this.field3230 == -1) {
            if (this.field3252 == null) {
                this.field3230 = 0;
            } else {
                this.field3230 = 2;
            }
        }
        if (~this.field3235 != arg0) {
            return;
        }
        if (this.field3252 == null) {
            this.field3235 = 0;
        } else {
            this.field3235 = 2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Z")
    public static final boolean method1098(byte arg0) {
        field3239++;
        long var1 = class102.method801((byte) -42);
        int var3 = (int) (var1 - class14.field414);
        if (var3 > 200) {
            var3 = 200;
        }
        class14.field414 = var1;
        class139.field3182 += var3;
        if (class8.field240 == 0 && class125.field2872 == 0 && class149.field3386 == 0 && class63.field1539 == 0) {
            return true;
        } else if (class75.field1862 == null) {
            return false;
        } else {
            try {
                if (class139.field3182 > 30000) {
                    throw new IOException();
                }
                while (class125.field2872 < 20 && class63.field1539 > 0) {
                    class84 var4 = (class84) class75.field1853.method245((byte) 54);
                    class83 var5 = new class83(4);
                    var5.method649((byte) -27, 1);
                    var5.method653((int) var4.field154, -89);
                    class75.field1862.method1132(4, 0, 121, var5.field2055);
                    class99.field2509.method241(var4, var4.field154, false);
                    class125.field2872++;
                    class63.field1539--;
                }
                while (class8.field240 < 20 && class149.field3386 > 0) {
                    class84 var6 = (class84) class4.field107.method2((byte) -122);
                    class83 var7 = new class83(4);
                    var7.method649((byte) -27, 0);
                    var7.method653((int) var6.field154, 115);
                    class75.field1862.method1132(4, 0, 125, var7.field2055);
                    var6.method936(-1);
                    class72.field1803.method241(var6, var6.field154, false);
                    class8.field240++;
                    class149.field3386--;
                }
                int var8 = -93 / ((arg0 + 12) / 46);
                for (int var9 = 0; var9 < 100; var9++) {
                    int var10 = class75.field1862.method1138(true);
                    if (var10 < 0) {
                        throw new IOException();
                    }
                    if (var10 == 0) {
                        break;
                    }
                    class139.field3182 = 0;
                    byte var11 = 0;
                    if (class67.field1651 == null) {
                        var11 = 8;
                    } else if (class139.field3187 == 0) {
                        var11 = 1;
                    }
                    if (var11 > 0) {
                        int var12 = var11 - class147.field3321.field2076;
                        if (var12 > var10) {
                            var12 = var10;
                        }
                        class75.field1862.method1135(class147.field3321.field2055, 106, class147.field3321.field2076, var12);
                        if (class15.field460 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class147.field3321.field2055[class147.field3321.field2076 + var13] = (byte) class34.method253(class147.field3321.field2055[class147.field3321.field2076 + var13], class15.field460);
                            }
                        }
                        class147.field3321.field2076 += var12;
                        if (var11 > class147.field3321.field2076) {
                            break;
                        }
                        if (class67.field1651 == null) {
                            class147.field3321.field2076 = 0;
                            int var14 = class147.field3321.method638(0);
                            int var15 = class147.field3321.method631((byte) -116);
                            int var16 = class147.field3321.method638(0);
                            int var17 = class147.field3321.method641((byte) 73);
                            long var18 = (long) ((var14 << 16) + var15);
                            class84 var20 = (class84) class99.field2509.method246((byte) 117, var18);
                            class27.field724 = true;
                            if (var20 == null) {
                                var20 = (class84) class72.field1803.method246((byte) 117, var18);
                                class27.field724 = false;
                            }
                            if (var20 == null) {
                                throw new IOException();
                            }
                            class67.field1651 = var20;
                            int var21 = var16 == 0 ? 5 : 9;
                            class77.field1874 = new class83(var17 + var21 + class67.field1651.field2083);
                            class77.field1874.method649((byte) -27, var16);
                            class77.field1874.method658(181, var17);
                            class139.field3187 = 8;
                            class147.field3321.field2076 = 0;
                        } else if (class139.field3187 == 0) {
                            if (class147.field3321.field2055[0] == -1) {
                                class139.field3187 = 1;
                                class147.field3321.field2076 = 0;
                            } else {
                                class67.field1651 = null;
                            }
                        }
                    } else {
                        int var22 = class77.field1874.field2055.length - class67.field1651.field2083;
                        int var23 = 512 - class139.field3187;
                        if (var22 - class77.field1874.field2076 < var23) {
                            var23 = var22 - class77.field1874.field2076;
                        }
                        if (var10 < var23) {
                            var23 = var10;
                        }
                        class75.field1862.method1135(class77.field1874.field2055, 108, class77.field1874.field2076, var23);
                        if (class15.field460 != 0) {
                            for (int var24 = 0; var24 < var23; var24++) {
                                class77.field1874.field2055[class77.field1874.field2076 + var24] = (byte) class34.method253(class77.field1874.field2055[class77.field1874.field2076 + var24], class15.field460);
                            }
                        }
                        class77.field1874.field2076 += var23;
                        class139.field3187 += var23;
                        if (class77.field1874.field2076 == var22) {
                            if (class67.field1651.field154 == 16711935L) {
                                class121.field2817 = class77.field1874;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class31 var26 = class16.field475[var25];
                                    if (var26 != null) {
                                        class121.field2817.field2076 = var25 * 8 + 5;
                                        int var27 = class121.field2817.method641((byte) 73);
                                        int var28 = class121.field2817.method641((byte) 73);
                                        var26.method225(var28, 255, var27);
                                    }
                                }
                            } else {
                                class58.field1473.reset();
                                class58.field1473.update(class77.field1874.field2055, 0, var22);
                                int var29 = (int) class58.field1473.getValue();
                                if (class67.field1651.field2101 != var29) {
                                    try {
                                        class75.field1862.method1130(-31709);
                                    } catch (Exception var31) {
                                    }
                                    class15.field460 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class57.field1445++;
                                    class75.field1862 = null;
                                    return false;
                                }
                                class133.field3002 = 0;
                                class57.field1445 = 0;
                                class67.field1651.field2092.method232((class67.field1651.field154 & 0xFF0000L) == 16711680L, true, (int) (class67.field1651.field154 & 0xFFFFL), class27.field724, class77.field1874.field2055);
                            }
                            class67.field1651.method48(-315);
                            if (class27.field724) {
                                class125.field2872--;
                            } else {
                                class8.field240--;
                            }
                            class139.field3187 = 0;
                            class67.field1651 = null;
                            class77.field1874 = null;
                        } else {
                            if (class139.field3187 != 512) {
                                break;
                            }
                            class139.field3187 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    class75.field1862.method1130(-31709);
                } catch (Exception var30) {
                }
                class133.field3002++;
                class75.field1862 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(BILoa;)Loa;")
    public final class98 method1099(byte arg0, int arg1, class98 arg2) {
        int var4 = this.field3258[arg1];
        field3245++;
        if (arg0 != -77) {
            this.method1093(null, 88, (byte) -94);
        }
        class107 var5 = class147.method1118((byte) 86, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method774(true);
        } else {
            class98 var7 = arg2.method774(!var5.method818((byte) 74, var6));
            var7.method784(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLm;)V")
    public final void method1100(byte arg0, class83 arg1) {
        if (arg0 != -59) {
            this.method1092((byte) -102, 81, null);
        }
        field3262++;
        while (true) {
            int var3 = arg1.method638(arg0 ^ 0xFFFFFFC5);
            if (var3 == 0) {
                return;
            }
            this.method1102(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
    public static final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class16.field476; var5++) {
            if (class49.field1192[var5] + class150.field3390[var5] > arg3 && arg2 + arg3 > class49.field1192[var5] && arg0 < class79.field1943[var5] + class38.field972[var5] && class79.field1943[var5] < arg0 + arg4) {
                class85.field2114[var5] = true;
            }
        }
        if (arg1 == 16052) {
            field3256++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZLm;)V")
    private final void method1102(int arg0, boolean arg1, class83 arg2) {
        if (arg1) {
            return;
        }
        if (arg0 == 1) {
            int var4 = arg2.method631((byte) -110);
            this.field3247 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3247[var5] = arg2.method631((byte) -113);
            }
            this.field3258 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3258[var6] = arg2.method631((byte) -104);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3258[var7] += arg2.method631((byte) -103) << 16;
            }
        } else if (arg0 == 2) {
            this.field3249 = arg2.method631((byte) -109);
        } else if (arg0 == 3) {
            int var8 = arg2.method638(0);
            this.field3252 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3252[var9] = arg2.method638(0);
            }
            this.field3252[var8] = 9999999;
        } else if (arg0 == 4) {
            this.field3233 = true;
        } else if (arg0 == 5) {
            this.field3255 = arg2.method638(0);
        } else if (arg0 == 6) {
            this.field3243 = arg2.method631((byte) -108);
        } else if (arg0 == 7) {
            this.field3248 = arg2.method631((byte) -100);
        } else if (arg0 == 8) {
            this.field3231 = arg2.method638(0);
        } else if (arg0 == 9) {
            this.field3230 = arg2.method638(0);
        } else if (arg0 == 10) {
            this.field3235 = arg2.method638(0);
        } else if (arg0 == 11) {
            this.field3238 = arg2.method638(0);
        } else if (arg0 == 12) {
            int var10 = arg2.method638(0);
            this.field3237 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3237[var11] = arg2.method631((byte) -118);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3237[var12] += arg2.method631((byte) -110) << 16;
            }
        } else if (arg0 == 13) {
            int var13 = arg2.method638(0);
            this.field3246 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3246[var14] = arg2.method670(arg1);
            }
        }
        field3240++;
    }
}
