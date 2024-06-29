import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class389 extends class189 {

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public int field5502 = 0;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "Laca;")
    private class726 field5505;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "[I")
    private int[] field5511;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "F")
    public float field5496;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public int field5495;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "Lsr;")
    private class251 field5500;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public int field5510;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public int field5501;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public int field5499;

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "Lrb;")
    public static class352 field5509 = new class352("", 15);

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
    public static int field5512 = -1;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Lada;")
    private class161 field5492;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5504;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5503;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tm", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field5513;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public static final void method2443(int arg0) {
        if (arg0 != 16711935) {
            method2443(10);
        }
        field5493++;
        try {
            Method var1 = (field5513 == null ? (field5513 = method2451("java.lang.Runtime")) : field5513).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class312.field4331 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(FIIII)V")
    public final void method2444(float arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= 7) {
            method2443(-11);
        }
        if (this.field5510 != -1) {
            class502 var6 = this.field5500.field715.method532((byte) 127, this.field5510);
            int var7 = var6.field7192 & 0xFF;
            if (var7 != 0 && var6.field7204 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg3 * 131586;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field7196 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg2 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg2 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = ((var12 & 0x4700FF00) << 8) + (var13 & 0xFF00) + (var14 >> 8);
            }
        }
        field5498++;
        if (arg0 != 1.0F) {
            int var15 = arg2 >> 16 & 0xFF;
            int var16 = (arg2 & 0xFF6D) >> 8;
            int var17 = (int) ((float) var15 * arg0);
            int var18 = arg2 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg0);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg0);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg2 = var20 | var17 << 16 | var19 << 8;
        }
        this.field5504.method3660(arg1 * 4);
        if (this.field5500.field3599 == 0) {
            this.field5504.method3664((byte) arg2);
            this.field5504.method3664((byte) (arg2 >> 8));
            this.field5504.method3664((byte) (arg2 >> 16));
        } else {
            this.field5504.method3664((byte) (arg2 >> 16));
            this.field5504.method3664((byte) (arg2 >> 8));
            this.field5504.method3664((byte) arg2);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
    public final void method2445(int arg0, int arg1) {
        this.field5504.method3656();
        field5497++;
        this.field5492 = this.field5500.method1429(false, arg0 ^ 0x7733);
        this.field5492.method1062(this.field5503, (byte) 113, arg0 * arg1, 4);
        this.field5503 = null;
        this.field5504 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[II)V")
    public final void method2446(int arg0, int[] arg1, int arg2) {
        field5494++;
        class749 var4 = this.field5500.method1635(-14589, this.field5502 * 3);
        Buffer var5 = var4.method2154(27599, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field5500.method1666(var5, true);
        int var7 = arg0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3662()) {
            label122: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg1[var10];
                int var12 = this.field5511[var11];
                short[] var13 = this.field5505.field10129[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var13.length <= var15) {
                                continue label122;
                            }
                            if ((var12 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    var6.method3654(var17);
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
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
            label97: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg1[var18];
                int var21 = this.field5511[var20];
                short[] var22 = this.field5505.field10129[var20];
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
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                    var6.method3655(var26);
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3656();
        if (!var4.method2156((byte) 110) || var7 <= 0) {
            return;
        }
        this.field5500.method1605((this.field5505.field10153 & 0x8) != 0, this.field5510, 32242, (this.field5505.field10153 & 0x7) != 0);
        if (this.field5500.field3582) {
            this.field5500.method444(Integer.MAX_VALUE, this.field5501, this.field5499, this.field5495);
        }
        class328 var19 = this.field5500.method1593(124);
        var19.method2144(1.0F / this.field5496, 0, 1.0F / this.field5496, 1.0F);
        this.field5500.method1600((byte) 95, class184.field2497);
        this.field5500.method1460(1, 1, this.field5492);
        this.field5500.method1479(this.field5505.field10162, 16);
        this.field5500.method1475(var9 + 1 - var8, var7, class441.field6289, arg0 - 17390, var8, var4, 0);
        this.field5500.method1632((byte) -117);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)V")
    public final void method2447(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < -34) {
            this.field5511[this.field5505.field3935 * arg3 + arg2] = class325.method2116(this.field5511[this.field5505.field3935 * arg3 + arg2], 0x1 << arg0);
            field5508++;
            this.field5502++;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)V")
    public final void method2448(byte arg0, int arg1) {
        field5507++;
        if (arg0 >= -41) {
            this.method2444(1.3722576F, -39, -108, -84, -14);
        }
        this.field5504.method3660(arg1 * 4 + 3);
        this.field5504.method3664(-1);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V")
    public final void method2449(int arg0, int arg1) {
        this.field5503 = this.field5500.method1620(-16455, arg0 * 4, true);
        if (arg1 != 31601) {
            this.field5502 = 36;
        }
        field5506++;
        this.field5504 = new Stream(this.field5503, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
    public static void method2450(int arg0) {
        field5509 = null;
        if (arg0 != -1) {
            method2443(77);
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Laca;IIIII)V")
    public class389(class726 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5505 = arg0;
        this.field5511 = new int[this.field5505.field3935 * this.field5505.field3930];
        this.field5496 = arg2;
        this.field5495 = arg5;
        this.field5500 = this.field5505.field10149;
        this.field5510 = arg1;
        this.field5501 = arg3;
        this.field5499 = arg4;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2451(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
