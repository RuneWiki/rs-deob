import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class364 {

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "[B")
    public static byte[] field5564 = new byte[2048];

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field5568 = 0;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "Ldp;")
    public static class347 field5562 = new class347("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "[[S")
    public static short[][] field5563;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public static void method2170(byte arg0) {
        field5564 = null;
        if (arg0 == -121) {
            field5563 = null;
            field5562 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/awt/Component;IBLec;I)Lwd;")
    public static final class260 method2171(Component arg0, int arg1, byte arg2, class109 arg3, int arg4) {
        if (arg2 >= -43) {
            return null;
        }
        field5565++;
        if (class208.field3009 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class260 var5 = (class260) Class.forName("vq").getDeclaredConstructor().newInstance();
                var5.field3877 = new int[(class116.field1749 ? 2 : 1) * 256];
                var5.field3889 = arg4;
                var5.method1639(arg0);
                var5.field3893 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field3893 > 16384) {
                    var5.field3893 = 16384;
                }
                var5.method1626(var5.field3893);
                if (class219.field3142 > 0 && class98.field1513 == null) {
                    class98.field1513 = new class214();
                    class98.field1513.field3056 = arg3;
                    arg3.method828(class98.field1513, 94, class219.field3142);
                }
                if (class98.field1513 != null) {
                    if (class98.field1513.field3050[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class98.field1513.field3050[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class287 var6 = new class287(arg3, arg1);
                    var6.field3889 = arg4;
                    var6.field3877 = new int[(class116.field1749 ? 2 : 1) * 256];
                    var6.method1639(arg0);
                    var6.field3893 = 16384;
                    var6.method1626(var6.field3893);
                    if (class219.field3142 > 0 && class98.field1513 == null) {
                        class98.field1513 = new class214();
                        class98.field1513.field3056 = arg3;
                        arg3.method828(class98.field1513, 65, class219.field3142);
                    }
                    if (class98.field1513 != null) {
                        if (class98.field1513.field3050[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class98.field1513.field3050[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class260();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)Z")
    public static final boolean method2172(boolean arg0) {
        for (int var1 = class39.field523; var1 < class349.field5377; var1++) {
            class306[][] var2 = class236.field3305[var1];
            for (int var3 = -class489.field7290; var3 <= 0; var3++) {
                int var4 = class487.field7256 + var3;
                int var5 = class487.field7256 - var3;
                if (var4 >= class18.field283 || var5 < class407.field6144) {
                    for (int var6 = -class489.field7290; var6 <= 0; var6++) {
                        int var7 = class301.field4475 + var6;
                        int var8 = class301.field4475 - var6;
                        if (var4 >= class18.field283) {
                            if (var7 >= class508.field7457) {
                                class306 var9 = var2[var4][var7];
                                if (var9 != null && var9.field4590) {
                                    class335.field5175 = arg0;
                                    class159.field2393.method489(var9, 0);
                                    class159.field2393.method493(0);
                                }
                            }
                            if (var8 < class520.field7617) {
                                class306 var10 = var2[var4][var8];
                                if (var10 != null && var10.field4590) {
                                    class335.field5175 = arg0;
                                    class159.field2393.method489(var10, 0);
                                    class159.field2393.method493(0);
                                }
                            }
                        }
                        if (var5 < class407.field6144) {
                            if (var7 >= class508.field7457) {
                                class306 var11 = var2[var5][var7];
                                if (var11 != null && var11.field4590) {
                                    class335.field5175 = arg0;
                                    class159.field2393.method489(var11, 0);
                                    class159.field2393.method493(0);
                                }
                            }
                            if (var8 < class520.field7617) {
                                class306 var12 = var2[var5][var8];
                                if (var12 != null && var12.field4590) {
                                    class335.field5175 = arg0;
                                    class159.field2393.method489(var12, 0);
                                    class159.field2393.method493(0);
                                }
                            }
                        }
                        if (class147.field2219 == 0) {
                            if (class358.field5479) {
                                class159.field2393.method491(24, 1048576);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILkh;IBII)V")
    public static final void method2173(int arg0, int arg1, class400 arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 == 111) {
            field5569++;
            class426.method2528(arg1, arg5, -110, arg0, arg2.field7681, arg3, 0, arg2.field7686, arg6, arg2.field7671);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2174(byte arg0, String arg1) {
        field5571++;
        System.exit(1);
        int var2 = -28 / ((arg0 - 21) / 51);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[B[BIIII)V")
    public static final void method2175(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field5567++;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        if (arg2 != 0) {
            field5563 = null;
        }
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg4[var10001] += arg3[arg6++];
                int var14 = arg8++;
                arg4[var14] += arg3[arg6++];
                int var15 = arg8++;
                arg4[var15] += arg3[arg6++];
                int var16 = arg8++;
                arg4[var16] += arg3[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg4[var10001] += arg3[arg6++];
            }
            arg6 += arg5;
            arg8 += arg7;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(CLjava/lang/String;Z)I")
    public static final int method2176(char arg0, String arg1, boolean arg2) {
        field5570++;
        int var3 = 0;
        int var4 = arg1.length();
        int var5 = 0;
        if (!arg2) {
            return -6;
        }
        while (var4 > var5) {
            if (arg1.charAt(var5) == arg0) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[[I)V")
    public static final void method2177(int arg0, int[][] arg1) {
        int var2 = -118 % ((-arg0 - 4) / 50);
        class306.field4574 = arg1;
        field5572++;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ldr;I)I")
    public static final int method2178(class293 arg0, int arg1) {
        if (arg1 > -106) {
            return -22;
        }
        field5566++;
        int var2 = arg0.method1823(2, 13255);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method1823(5, 13255);
        } else if (var2 == 2) {
            var3 = arg0.method1823(8, 13255);
        } else {
            var3 = arg0.method1823(11, 13255);
        }
        return var3;
    }
}
