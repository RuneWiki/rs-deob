import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class124 extends class766 {

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public int field2119 = 0;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "Lsl;")
    private class99 field2115;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public int field2114;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "F")
    public float field2117;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "[I")
    private int[] field2123;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "Lmj;")
    private class114 field2130;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "Lwba;")
    private class601 field2125;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2116;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2121;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Ljava/lang/Object;")
    public static Object field2113;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(BI)V")
    public final void method1070(byte arg0, int arg1) {
        field2110++;
        this.field2116.method2262(arg1 * 4 + 3);
        if (arg0 < 16) {
            this.method1078(-29, -116);
        }
        this.field2116.method2254(-1);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II[I)V")
    public final void method1071(int arg0, int arg1, int[] arg2) {
        field2112++;
        class463 var4 = this.field2130.method942(this.field2119 * 3, (byte) 123);
        Buffer var5 = var4.method1440(true, -15169);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field2130.method1007(arg1, var5);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method2263()) {
            label122: for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = arg2[var10];
                short[] var12 = this.field2115.field1460[var11];
                int var13 = this.field2123[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var12.length <= var15) {
                                continue label122;
                            }
                            if ((0x1 << var14++ & var13) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                    var6.method2259(var17);
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label97: for (int var18 = 0; var18 < arg0; var18++) {
                int var20 = arg2[var18];
                int var21 = this.field2123[var20];
                short[] var22 = this.field2115.field1460[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var22.length) {
                                continue label97;
                            }
                            if ((var21 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                    var6.method2252(var26);
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method2255();
        if (!var4.method1441(32416) || var7 <= 0) {
            return;
        }
        this.field2130.method963(this.field2114, (this.field2115.field1433 & 0x7) != 0, (byte) -124, (this.field2115.field1433 & 0x8) != 0);
        if (this.field2130.field1939) {
            this.field2130.method440(Integer.MAX_VALUE, this.field2118, this.field2122, this.field2124);
        }
        class742 var19 = this.field2130.method943(arg1 ^ 0xFFFFA4E5);
        var19.method4086(1.0F / this.field2117, 0, 1.0F, 1.0F / this.field2117);
        this.field2130.method983(-54, class608.field8647);
        this.field2130.method71((byte) -43, 1, this.field2125);
        this.field2130.method89(this.field2115.field1466, 127);
        this.field2130.method140(var8, var9 + 1 - var8, var4, class710.field9929, arg1 - 1, 0, var7);
        this.field2130.method1013(true);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static final void method1072(byte arg0) {
        field2126++;
        if (class420.field5820.field9460.method3420(17539) != 2) {
            return;
        }
        byte var1 = (byte) (class626.field8887 - 4 & 0xFF);
        int var2 = class626.field8887 % class192.field2891;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class456.field6225; var18++) {
                class23.field257[var3][var2][var18] = var1;
            }
        }
        if (class403.field5560 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class509.field6988[var4] = -1000000;
            class411.field5632[var4] = 1000000;
            class486.field6695[var4] = 0;
            class126.field2151[var4] = 1000000;
            class728.field10158[var4] = 0;
        }
        int var5 = class719.field10041.field10347;
        int var6 = class719.field10041.field10350;
        if (class783.field10725 != 1 && class743.field10323 == -1) {
            int var7 = class577.method3399(class286.field4204, class733.field10199, arg0 - 8831, class403.field5560);
            if (var7 - class243.field3482 < 3200 && (class336.field4782[class403.field5560][class733.field10199 >> 9][class286.field4204 >> 9] & 0x4) != 0) {
                class77.method695(class514.field7096, 1, class286.field4204 >> 9, false, class733.field10199 >> 9, -115);
            }
        } else {
            if (class783.field10725 != 1) {
                var6 = class401.field5533;
                var5 = class743.field10323;
            }
            if ((class336.field4782[class403.field5560][var5 >> 9][var6 >> 9] & 0x4) != 0) {
                class77.method695(class514.field7096, 0, var6 >> 9, false, var5 >> 9, arg0 - 205);
            }
            if (class99.field1437 < 2560) {
                int var8 = class733.field10199 >> 9;
                int var9 = class286.field4204 >> 9;
                int var10 = var5 >> 9;
                int var11 = var6 >> 9;
                int var12;
                if (var10 > var8) {
                    var12 = var10 - var8;
                } else {
                    var12 = var8 - var10;
                }
                int var13;
                if (var9 < var11) {
                    var13 = var11 - var9;
                } else {
                    var13 = var9 - var11;
                }
                if (var12 == 0 && var13 == 0 || -class192.field2891 >= var12 || var12 >= class192.field2891 || var13 <= (-class456.field6225) || class456.field6225 <= var13) {
                    class349.method2122(null, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class222.field3266 + "," + class697.field9798, arg0 - 106);
                    return;
                }
                if (var13 < var12) {
                    int var14 = var13 * 65536 / var12;
                    int var15 = 32768;
                    while (var8 != var10) {
                        if (var8 < var10) {
                            var8++;
                        } else if (var10 < var8) {
                            var8--;
                        }
                        if ((class336.field4782[class403.field5560][var8][var9] & 0x4) != 0) {
                            class77.method695(class514.field7096, 1, var9, false, var8, arg0 ^ 0xFFFFFFF8);
                            break;
                        }
                        var15 += var14;
                        if (var15 >= 65536) {
                            var15 -= 65536;
                            if (var9 < var11) {
                                var9++;
                            } else if (var11 < var9) {
                                var9--;
                            }
                            if ((class336.field4782[class403.field5560][var8][var9] & 0x4) != 0) {
                                class77.method695(class514.field7096, 1, var9, false, var8, -75);
                                break;
                            }
                        }
                    }
                } else {
                    int var16 = var12 * 65536 / var13;
                    int var17 = 32768;
                    while (var9 != var11) {
                        if (var9 < var11) {
                            var9++;
                        } else if (var11 < var9) {
                            var9--;
                        }
                        if ((class336.field4782[class403.field5560][var8][var9] & 0x4) != 0) {
                            class77.method695(class514.field7096, 1, var9, false, var8, -115);
                            break;
                        }
                        var17 += var16;
                        if (var17 >= 65536) {
                            if (var8 < var10) {
                                var8++;
                            } else if (var8 > var10) {
                                var8--;
                            }
                            var17 -= 65536;
                            if ((class336.field4782[class403.field5560][var8][var9] & 0x4) != 0) {
                                class77.method695(class514.field7096, 1, var9, false, var8, -43);
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 107) {
            field2113 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
    public final void method1073(int arg0, int arg1) {
        if (arg1 == 65535) {
            field2128++;
            this.field2121 = this.field2130.method999(true, arg0 * 4, arg1 ^ 0xFFFF005C);
            this.field2116 = new Stream(this.field2121, 0, arg0 * 4);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1074(String arg0, int arg1) {
        field2120++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class381.field5340; var2++) {
            if (arg0.equalsIgnoreCase(class586.field8428[var2])) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class719.field10041.field212)) {
            return true;
        } else {
            if (arg1 != -2779) {
                method1074(null, 17);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIF)V")
    public final void method1075(int arg0, int arg1, int arg2, int arg3, float arg4) {
        field2129++;
        if (this.field2114 != -1) {
            class719 var6 = this.field2130.field6447.method847(this.field2114, arg3 + 11809);
            int var7 = var6.field10046 & 0xFF;
            if (var7 != 0 && var6.field10031 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg2 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field10043 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg1 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg1 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var14 >> 8) + ((var12 & 0xCC00FF00) << 8) + (var13 & 0xFF00);
            }
        }
        this.field2116.method2262(arg0 * 4);
        if (arg3 != -11923) {
            return;
        }
        if (arg4 != 1.0F) {
            int var15 = arg1 >> 16 & 0xFF;
            int var16 = arg1 >> 8 & 0xFF;
            int var17 = arg1 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg4);
            int var20 = (int) ((float) var17 * arg4);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var18 << 16 | var19 << 8 | var20;
        }
        if (this.field2130.field1920 == 0) {
            this.field2116.method2254((byte) arg1);
            this.field2116.method2254((byte) (arg1 >> 8));
            this.field2116.method2254((byte) (arg1 >> 16));
        } else {
            this.field2116.method2254((byte) (arg1 >> 16));
            this.field2116.method2254((byte) (arg1 >> 8));
            this.field2116.method2254((byte) arg1);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method1076(int arg0) {
        if (arg0 != 4) {
            method1072((byte) 61);
        }
        field2113 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)V")
    public final void method1077(int arg0, int arg1, int arg2, int arg3) {
        field2111++;
        this.field2123[this.field2115.field5808 * arg0 + arg3] = class694.method3895(this.field2123[this.field2115.field5808 * arg0 + arg3], 0x1 << arg1);
        this.field2119++;
        if (arg2 >= -22) {
            this.method1073(120, -62);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
    public final void method1078(int arg0, int arg1) {
        if (arg0 > -46) {
            this.method1075(80, 59, 95, 118, -3.0711262F);
        }
        field2131++;
        this.field2116.method2255();
        this.field2125 = this.field2130.method135(false, 0);
        this.field2125.method38((byte) 99, 4, this.field2121, arg1 * 4);
        this.field2121 = null;
        this.field2116 = null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lsl;IIIII)V")
    public class124(class99 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2115 = arg0;
        this.field2114 = arg1;
        this.field2124 = arg5;
        this.field2117 = arg2;
        this.field2123 = new int[this.field2115.field5809 * this.field2115.field5808];
        this.field2118 = arg3;
        this.field2122 = arg4;
        this.field2130 = this.field2115.field1440;
    }
}
