import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class284 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[B")
    public static byte[] field4704 = new byte[32896];

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public int field4717;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    private int field4719;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "J")
    private long field4711;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "J")
    private long field4722;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field4725;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Z")
    public boolean field4702;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "[I")
    public int[] field4705;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "[I")
    private int[] field4723;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[S")
    public static short[] field4703;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "[[I")
    private int[][] field4718;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    public final void method1975(int arg0, int arg1, int arg2) {
        field4700++;
        int var4 = class182.field2916[arg2];
        if (this.field4723[var4] == 0 || class27.method174(true, arg0) == null) {
            return;
        }
        this.field4723[var4] = class312.method2107(arg0, Integer.MIN_VALUE);
        this.method1984(-30);
        if (arg1 < 115) {
            method1983(-31);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static final void method1976(byte arg0) {
        field4709++;
        if (client.method721(false) != 2) {
            return;
        }
        int var1 = class147.field2427 % 104;
        byte var2 = (byte) (class147.field2427 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class161.field2621[var3][var1][var16] = var2;
            }
        }
        if (class182.field2898 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class286.field4737[var4] = -1000000;
            class28.field480[var4] = 1000000;
            class149.field2462[var4] = 0;
            class94.field1536[var4] = 1000000;
            class25.field454[var4] = 0;
        }
        if (arg0 > -6) {
            field4703 = null;
        }
        if (class169.field2739 != 1) {
            int var15 = class277.method1939(class182.field2898, class107.field1758, class76.field1302, (byte) -34);
            if ((var15 - class263.field4393) >= 800 || (class67.field1132[class182.field2898][class107.field1758 >> 7][class76.field1302 >> 7] & 0x4) == 0) {
                return;
            }
            class30.method190(false, 1, class90.field1498, class107.field1758 >> 7, class76.field1302 >> 7, (byte) 104);
            return;
        }
        if ((class67.field1132[class182.field2898][class16.field314.field715 >> 7][class16.field314.field771 >> 7] & 0x4) != 0) {
            class30.method190(false, 0, class90.field1498, class16.field314.field715 >> 7, class16.field314.field771 >> 7, (byte) 125);
        }
        if (class183.field2926 >= 310) {
            return;
        }
        int var5 = class107.field1758 >> 7;
        int var6 = class76.field1302 >> 7;
        int var7 = class16.field314.field715 >> 7;
        int var8 = class16.field314.field771 >> 7;
        int var9;
        if (var7 <= var5) {
            var9 = var5 - var7;
        } else {
            var9 = var7 - var5;
        }
        int var10;
        if (var8 > var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if ((var9 != 0 || var10 != 0) && var9 > -104 && var9 < 104 && var10 > -104 && var10 < 104) {
            if (var10 < var9) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var7) {
                    if (var7 > var5) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class67.field1132[class182.field2898][var5][var6] & 0x4) != 0) {
                        class30.method190(false, 1, class90.field1498, var5, var6, (byte) 112);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var6 < var8) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        if ((class67.field1132[class182.field2898][var5][var6] & 0x4) != 0) {
                            class30.method190(false, 1, class90.field1498, var5, var6, (byte) 103);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var9 * 65536 / var10;
            int var14 = 32768;
            while (var6 != var8) {
                if (var8 > var6) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class67.field1132[class182.field2898][var5][var6] & 0x4) != 0) {
                    class30.method190(false, 1, class90.field1498, var5, var6, (byte) 105);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var5 < var7) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    var14 -= 65536;
                    if ((class67.field1132[class182.field2898][var5][var6] & 0x4) != 0) {
                        class30.method190(false, 1, class90.field1498, var5, var6, (byte) 109);
                        return;
                    }
                }
            }
            return;
        }
        class84.method595(14117, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class26.field462 + "," + class78.field1313, (Throwable) null);
        return;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method1977(int arg0) {
        int[] var1 = new int[class241.field4062];
        field4713++;
        int var2 = 0;
        for (int var3 = 0; var3 < class241.field4062; var3++) {
            class71 var5 = class13.method75(false, var3);
            if (var5.field1206 >= 0 || var5.field1241 >= 0) {
                var1[var2++] = var3;
            }
        }
        if (arg0 != 32513) {
            method1987(117, -117);
        }
        class36.field574 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class36.field574[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BZ)V")
    public final void method1978(byte arg0, boolean arg1) {
        field4710++;
        this.field4702 = arg1;
        this.method1984(arg0 - 62);
        if (arg0 != 32) {
            field4703 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILck;BIIII)Lud;")
    public final class242 method1979(int arg0, int arg1, class163 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4708++;
        long var9 = (long) arg1 << 32 | (long) (arg7 << 16) | (long) arg0;
        if (arg3 != 56) {
            this.method1989((class313[]) null, (class163) null, 47, false, 57, false, -92, 70, -47, 51, 57, (class163) null);
        }
        class242 var11 = (class242) class162.field2633.method99(var9, true);
        if (var11 == null) {
            class229[] var12 = new class229[3];
            int var13 = 0;
            if (!class27.method174(true, arg0).method1255((byte) -100) || !class27.method174(true, arg7).method1255((byte) -59) || !class27.method174(true, arg1).method1255((byte) -116)) {
                return null;
            }
            class229 var14 = class27.method174(true, arg0).method1261(-106);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class229 var15 = class27.method174(true, arg7).method1261(-43);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class229 var16 = class27.method174(true, arg1).method1261(-49);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class229 var17 = new class229(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field4705[var18] < class293.field4823[var18].length) {
                    var17.method1628(class135.field2231[var18], class293.field4823[var18][this.field4705[var18]]);
                }
                if (this.field4705[var18] < class298.field4868[var18].length) {
                    var17.method1628(class121.field2027[var18], class298.field4868[var18][this.field4705[var18]]);
                }
            }
            var11 = var17.method1618(64, 768, -50, -10, -50);
            class162.field2633.method100(var9, var11, 55);
        }
        if (arg2 != null) {
            var11 = arg2.method1204(arg5, arg4, var11, (byte) 124, arg6);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBILck;I)Lud;")
    public final class242 method1980(int arg0, byte arg1, int arg2, class163 arg3, int arg4) {
        field4706++;
        if (this.field4717 != -1) {
            return class217.method1551(7, this.field4717).method346((byte) 75, arg4, arg3, arg2, arg0);
        }
        if (arg1 < 109) {
            this.field4718 = null;
        }
        class242 var6 = (class242) class162.field2633.method99(this.field4711, true);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field4723[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((var17 & Integer.MIN_VALUE) != 0 && !class27.method174(true, var17 & 0x3FFFFFFF).method1255((byte) -40)) {
                        var7 = true;
                    }
                } else if (!class13.method75(false, var17 & 0x3FFFFFFF).method502(2457, this.field4702)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class229[] var9 = new class229[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field4723[var11];
                if ((var14 & 0x40000000) != 0) {
                    class229 var16 = class13.method75(false, var14 & 0x3FFFFFFF).method489(this.field4702, 125);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class229 var15 = class27.method174(true, var14 & 0x3FFFFFFF).method1261(-118);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                }
            }
            class229 var12 = new class229(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (this.field4705[var13] < class293.field4823[var13].length) {
                    var12.method1628(class135.field2231[var13], class293.field4823[var13][this.field4705[var13]]);
                }
                if (this.field4705[var13] < class298.field4868[var13].length) {
                    var12.method1628(class121.field2027[var13], class298.field4868[var13][this.field4705[var13]]);
                }
            }
            var6 = var12.method1618(64, 768, -50, -10, -50);
            class162.field2633.method100(this.field4711, var6, 98);
        }
        if (arg3 != null) {
            var6 = arg3.method1204(arg2, arg0, var6, (byte) 121, arg4);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)V")
    public static final void method1981(int arg0, byte arg1) {
        field4716++;
        class118.field1984 = 3;
        class271.field4507 = -1;
        class84.field1401 = arg0;
        if (arg1 != -33) {
            field4704 = null;
        }
        class146.field2401 = 100;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V")
    public final void method1982(int arg0, int arg1, int arg2) {
        field4724++;
        this.field4705[arg0] = arg1;
        if (arg2 != 100) {
            this.field4718 = null;
        }
        this.method1984(-30);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static final void method1983(int arg0) {
        try {
            Method var1 = (field4725 == null ? (field4725 = method1991("java.lang.Runtime")) : field4725).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class86.field1430 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var5) {
                }
            }
        } catch (Exception var6) {
        }
        field4707++;
        int var4 = -93 / ((-arg0 - 18) / 38);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    private final void method1984(int arg0) {
        field4712++;
        long var2 = this.field4711;
        this.field4711 = -1L;
        long[] var4 = class119.field1995;
        if (arg0 != -30) {
            this.field4723 = null;
        }
        this.field4711 = this.field4711 >>> 8 ^ var4[(int) ((this.field4711 ^ (long) (this.field4719 >> 8)) & 0xFFL)];
        this.field4711 = this.field4711 >>> 8 ^ var4[(int) ((this.field4711 ^ (long) this.field4719) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4711 = var4[(int) (((long) (this.field4723[var5] >> 24) ^ this.field4711) & 0xFFL)] ^ this.field4711 >>> 8;
            this.field4711 = this.field4711 >>> 8 ^ var4[(int) (((long) (this.field4723[var5] >> 16) ^ this.field4711) & 0xFFL)];
            this.field4711 = var4[(int) ((this.field4711 ^ (long) (this.field4723[var5] >> 8)) & 0xFFL)] ^ this.field4711 >>> 8;
            this.field4711 = this.field4711 >>> 8 ^ var4[(int) ((this.field4711 ^ (long) this.field4723[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4711 = var4[(int) (((long) this.field4705[var6] ^ this.field4711) & 0xFFL)] ^ this.field4711 >>> 8;
        }
        this.field4711 = this.field4711 >>> 8 ^ var4[(int) ((this.field4711 ^ (long) (this.field4702 ? 1 : 0)) & 0xFFL)];
        if (var2 != 0L && this.field4711 != var2) {
            class196.field3156.method95(false, var2);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)I")
    public final int method1985(byte arg0) {
        if (arg0 > -11) {
            method1981(-20, (byte) 51);
        }
        field4715++;
        return this.field4717 == -1 ? (this.field4723[11] << 5) + (this.field4723[0] << 15) + ((this.field4705[0] << 25) - -(this.field4705[4] << 20) - -(this.field4723[8] << 10)) + this.field4723[1] : class217.method1551(7, this.field4717).field923 + 305419896;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    public static void method1986(int arg0) {
        field4704 = null;
        if (arg0 != -13964) {
            field4703 = null;
        }
        field4703 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    public static final void method1987(int arg0, int arg1) {
        field4714++;
        class15.field305.method98(1, arg1);
        if (arg0 != -1690092664) {
            method1983(-108);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZBI[I[II)V")
    public final void method1988(boolean arg0, byte arg1, int arg2, int[] arg3, int[] arg4, int arg5) {
        field4720++;
        if (this.field4719 != arg5) {
            this.field4719 = arg5;
            this.field4718 = null;
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class206.field3326; var8++) {
                    class168 var9 = class27.method174(true, var8);
                    if (var9 != null && !var9.field2714 && var9.field2712 == (arg0 ? class158.field2585[var7] : class268.field4463[var7])) {
                        arg4[class182.field2916[var7]] = class312.method2107(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field4717 = arg2;
        this.field4702 = arg0;
        this.field4723 = arg4;
        this.field4705 = arg3;
        this.method1984(-30);
        if (arg1 >= -27) {
            method1977(123);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Loa;Lck;IZIZIIIIILck;)Lud;")
    public final class242 method1989(class313[] arg0, class163 arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class163 arg11) {
        field4701++;
        if (this.field4717 != -1) {
            return class217.method1551(7, this.field4717).method342(arg6, arg4, arg11, arg7, arg9, true, arg8, arg1, arg0, arg10);
        }
        long var13 = this.field4711;
        int[] var15 = this.field4723;
        if (arg1 != null && (arg1.field2647 >= 0 || arg1.field2659 >= 0)) {
            var15 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var15[var16] = this.field4723[var16];
            }
            if (arg1.field2647 >= 0) {
                if (arg1.field2647 == 65535) {
                    var13 ^= 0xFFFFFFFF00000000L;
                    var15[5] = 0;
                } else {
                    var15[5] = class312.method2107(arg1.field2647, 1073741824);
                    var13 ^= (long) var15[5] << 32;
                }
            }
            if (arg1.field2659 >= 0) {
                if (arg1.field2659 == 65535) {
                    var15[3] = 0;
                    var13 ^= 0xFFFFFFFFL;
                } else {
                    var15[3] = class312.method2107(1073741824, arg1.field2659);
                    var13 ^= (long) var15[3];
                }
            }
        }
        class242 var17 = (class242) class196.field3156.method99(var13, true);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var44 = var15[var19];
                if ((var44 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var44) != 0 && !class27.method174(true, var44 & 0x3FFFFFFF).method1257(6957)) {
                        var18 = true;
                    }
                } else if (!class13.method75(false, var44 & 0x3FFFFFFF).method494(this.field4702, arg2 ^ 0xFE06010C)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field4722 != -1L) {
                    var17 = (class242) class196.field3156.method99(this.field4722, true);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class229[] var20 = new class229[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var41 = var15[var21];
                    if ((var41 & 0x40000000) != 0) {
                        class229 var42 = class13.method75(false, var41 & 0x3FFFFFFF).method503(this.field4702, true);
                        if (var42 != null) {
                            var20[var21] = var42;
                        }
                    } else if ((Integer.MIN_VALUE & var41) != 0) {
                        class229 var43 = class27.method174(true, var41 & 0x3FFFFFFF).method1254(116);
                        if (var43 != null) {
                            var20[var21] = var43;
                        }
                    }
                }
                class190 var22 = null;
                if (this.field4719 != -1) {
                    var22 = class233.method1678(this.field4719, 32);
                }
                if (var22 != null && var22.field3078 != null) {
                    for (int var23 = 0; var23 < var22.field3078.length; var23++) {
                        if (var22.field3078[var23] != null && var20[var23] != null) {
                            int var24 = var22.field3078[var23][0];
                            int var25 = var22.field3078[var23][1];
                            int var26 = var22.field3078[var23][2];
                            int var27 = var22.field3078[var23][4];
                            int var28 = var22.field3078[var23][5];
                            int var29 = var22.field3078[var23][3];
                            if (this.field4718 == null) {
                                this.field4718 = new int[var22.field3078.length][];
                            }
                            if (this.field4718[var23] == null) {
                                int[] var30 = this.field4718[var23] = new int[15];
                                if (var29 == 0 && var27 == 0 && var28 == 0) {
                                    var30[13] = -var25;
                                    var30[14] = -var26;
                                    var30[0] = var30[4] = var30[8] = 32768;
                                    var30[12] = -var24;
                                } else {
                                    int var31 = class128.field2130[var29] >> 1;
                                    int var32 = class128.field2133[var27] >> 1;
                                    int var33 = class128.field2130[var27] >> 1;
                                    int var34 = class128.field2133[var29] >> 1;
                                    int var35 = class128.field2133[var28] >> 1;
                                    int var36 = class128.field2130[var28] >> 1;
                                    var30[3] = var31 * var35 + 16384 >> 15;
                                    var30[5] = -var34;
                                    int var37 = var34 * var36 + 16384 >> 15;
                                    var30[7] = -var32 * -var35 + var33 * var37 + 16384 >> 15;
                                    var30[8] = var31 * var33 + 16384 >> 15;
                                    var30[1] = -var35 * var33 + var32 * var37 + 16384 >> 15;
                                    int var38 = var34 * var35 + 16384 >> 15;
                                    var30[0] = var32 * var38 + var33 * var36 + 16384 >> 15;
                                    var30[2] = var31 * var32 + 16384 >> 15;
                                    var30[14] = var30[8] * -var26 + var30[2] * -var24 + var30[5] * -var25 + 16384 >> 15;
                                    var30[4] = var31 * var36 + 16384 >> 15;
                                    var30[6] = -var32 * var36 + (var33 * var38 + 16384) >> 15;
                                    var30[13] = var30[7] * -var26 + var30[1] * -var24 + var30[4] * -var25 + 16384 >> 15;
                                    var30[12] = var30[6] * -var26 + var30[3] * -var25 + var30[0] * -var24 + 16384 >> 15;
                                }
                                var30[9] = var24;
                                var30[11] = var26;
                                var30[10] = var25;
                            }
                            if (var29 != 0 || var27 != 0 || var28 != 0) {
                                var20[var23].method1617(var29, var27, var28);
                            }
                            if (var24 != 0 || var25 != 0 || var26 != 0) {
                                var20[var23].method1629(var24, var25, var26);
                            }
                        }
                    }
                }
                class229 var39 = new class229(var20, var20.length);
                for (int var40 = 0; var40 < 5; var40++) {
                    if (this.field4705[var40] < class293.field4823[var40].length) {
                        var39.method1628(class135.field2231[var40], class293.field4823[var40][this.field4705[var40]]);
                    }
                    if (this.field4705[var40] < class298.field4868[var40].length) {
                        var39.method1628(class121.field2027[var40], class298.field4868[var40][this.field4705[var40]]);
                    }
                }
                var17 = var39.method1618(64, 850, -30, -50, -30);
                if (arg3) {
                    class196.field3156.method100(var13, var17, 74);
                    this.field4722 = var13;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        boolean var48 = false;
        int var49 = arg0 == null ? 0 : arg0.length;
        for (int var50 = 0; var50 < var49; var50++) {
            if (arg0[var50] != null) {
                class163 var73 = class34.method211(arg0[var50].field5040, 3);
                if (var73.field2639 != null) {
                    class49.field843[var50] = var73;
                    var45 = true;
                    int var74 = arg0[var50].field5051;
                    int var75 = arg0[var50].field5045;
                    int var76 = var73.field2639[var74];
                    class166.field2690[var50] = class79.method553(var76 >>> 16, 4);
                    int var77 = var76 & 0xFFFF;
                    class245.field4114[var50] = var77;
                    if (class166.field2690[var50] != null) {
                        var47 |= class166.field2690[var50].method194((byte) -123, var77);
                        var46 |= class166.field2690[var50].method200(var77, (byte) -92);
                        var48 |= var73.field2652;
                    }
                    if ((var73.field2653 || class12.field205) && var75 != -1 && var73.field2639.length > var75) {
                        class150.field2477[var50] = var73.field2638[var74];
                        class300.field4891[var50] = arg0[var50].field5052;
                        int var78 = var73.field2639[var75];
                        class42.field639[var50] = class79.method553(var78 >>> 16, 4);
                        int var79 = var78 & 0xFFFF;
                        class221.field3716[var50] = var79;
                        if (class42.field639[var50] != null) {
                            var47 |= class42.field639[var50].method194((byte) -124, var79);
                            var46 |= class42.field639[var50].method200(var79, (byte) -45);
                        }
                    } else {
                        class150.field2477[var50] = 0;
                        class300.field4891[var50] = 0;
                        class42.field639[var50] = null;
                        class221.field3716[var50] = -1;
                    }
                }
            }
        }
        if (!var45 && arg1 == null && arg11 == null) {
            if (arg5) {
                return var17.method841(false, false, false);
            } else {
                return var17;
            }
        } else if (arg2 == 12) {
            int var51 = -1;
            int var52 = -1;
            int var53 = 0;
            class31 var54 = null;
            class31 var55 = null;
            if (arg1 != null) {
                int var56 = arg1.field2639[arg4];
                int var57 = var56 >>> 16;
                var52 = var56 & 0xFFFF;
                var54 = class79.method553(var57, 4);
                if (var54 != null) {
                    var47 |= var54.method194((byte) -121, var52);
                    var46 |= var54.method200(var52, (byte) -113);
                    var48 |= arg1.field2652;
                }
                if ((arg1.field2653 || class12.field205) && arg7 != -1 && arg7 < arg1.field2639.length) {
                    var53 = arg1.field2638[arg4];
                    int var58 = arg1.field2639[arg7];
                    int var59 = var58 >>> 16;
                    var51 = var58 & 0xFFFF;
                    if (var57 == var59) {
                        var55 = var54;
                    } else {
                        var55 = class79.method553(var51 >>> 16, 4);
                    }
                    if (var55 != null) {
                        var47 |= var55.method194((byte) -116, var51);
                        var46 |= var55.method200(var51, (byte) -109);
                    }
                }
            }
            int var60 = -1;
            int var61 = -1;
            int var62 = 0;
            class31 var63 = null;
            class31 var64 = null;
            if (arg11 != null) {
                int var65 = arg11.field2639[arg8];
                int var66 = var65 >>> 16;
                var63 = class79.method553(var66, arg2 ^ 0x8);
                var60 = var65 & 0xFFFF;
                if (var63 != null) {
                    var47 |= var63.method194((byte) -118, var60);
                    var46 |= var63.method200(var60, (byte) -92);
                    var48 |= arg11.field2652;
                }
                if ((arg11.field2653 || class12.field205) && arg9 != -1 && arg11.field2639.length > arg9) {
                    var62 = arg11.field2638[arg8];
                    int var67 = arg11.field2639[arg9];
                    int var68 = var67 >>> 16;
                    var61 = var67 & 0xFFFF;
                    if (var66 == var68) {
                        var64 = var63;
                    } else {
                        var64 = class79.method553(var61 >>> 16, arg2 - 8);
                    }
                    if (var64 != null) {
                        var47 |= var64.method194((byte) -127, var61);
                        var46 |= var64.method200(var61, (byte) -61);
                    }
                }
            }
            class242 var69 = var17.method841(!var46, !var47, !var48);
            int var70 = 0;
            int var71 = 1;
            while (var70 < var49) {
                if (class166.field2690[var70] != null) {
                    var69.method1736(class166.field2690[var70], class245.field4114[var70], class42.field639[var70], class221.field3716[var70], class300.field4891[var70] - 1, class150.field2477[var70], var71, class49.field843[var70].field2652, this.field4718[var70]);
                }
                var71 <<= 0x1;
                var70++;
            }
            if (var54 != null && var63 != null) {
                var69.method1735(var54, var52, var55, var51, arg10 - 1, var53, var63, var60, var64, var61, arg6 - 1, var62, arg1.field2665, arg1.field2652 | arg11.field2652);
            } else if (var54 != null) {
                var69.method1737(var54, var52, var55, var51, arg10 - 1, var53, arg1.field2652);
            } else if (var63 != null) {
                var69.method1737(var63, var60, var64, var61, arg6 - 1, var62, arg11.field2652);
            }
            for (int var72 = 0; var72 < var49; var72++) {
                class166.field2690[var72] = null;
                class42.field639[var72] = null;
                class49.field843[var72] = null;
            }
            return var69;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I")
    public static int method1990(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1991(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4704[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
