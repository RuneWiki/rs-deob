import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class45 extends class71 {

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public int field565 = 0;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Leha;")
    private class166 field554;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "[I")
    private int[] field555;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "F")
    public float field569;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Lrl;")
    private class232 field568;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Lal;")
    public static class125 field559;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "Lrv;")
    private class440 field570;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "Ljaclib/memory/Stream;")
    private Stream field571;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field562;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "[[B")
    public static byte[][] field563;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V", line = 10)
    public final void method242(int arg0, int arg1) {
        field567++;
        this.field571.method2613();
        this.field570 = this.field568.method319((byte) 74, false);
        this.field570.method2141(arg1 * 4, 4, false, this.field562);
        this.field562 = null;
        this.field571 = null;
        int var3 = -29 / ((-arg0 - 60) / 41);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 26)
    public static void method243(int arg0) {
        field563 = null;
        field559 = null;
        if (arg0 != -31651) {
            method244(-22, null);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/lang/String;)I", line = 40)
    public static final int method244(int arg0, String arg1) {
        field566++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = arg0; var4 < var2; var4++) {
            var3 = class27.method156(true, arg1.charAt(var4)) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(FIIII)V", line = 60)
    public final void method245(float arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field572 != -1) {
            class239 var6 = this.field568.field7623.method521(this.field572, 121);
            int var7 = var6.field3570 & 0xFF;
            if (var7 != 0 && var6.field3561 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field3578 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg1 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg1 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var14 >> 8) + ((var12 & 0xCB00FF00) << 8) + (var13 & 0xFF00);
            }
        }
        if (arg4 != 131586) {
            this.method245(-0.057176594F, -43, 84, -120, 64);
        }
        field561++;
        if (arg0 != 1.0F) {
            int var15 = arg1 >> 16 & 0xFF;
            int var16 = (arg1 & 0xFFCF) >> 8;
            int var17 = (int) ((float) var15 * arg0);
            int var18 = arg1 & 0xFF;
            int var19 = (int) ((float) var16 * arg0);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
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
            arg1 = var20 | var19 << 8 | var17 << 16;
        }
        this.field571.method2618(arg3 * 4);
        if (this.field568.field3435 == 0) {
            this.field571.method2606((byte) arg1);
            this.field571.method2606((byte) (arg1 >> 8));
            this.field571.method2606((byte) (arg1 >> 16));
        } else {
            this.field571.method2606((byte) (arg1 >> 16));
            this.field571.method2606((byte) (arg1 >> 8));
            this.field571.method2606((byte) arg1);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([III)V", line = 183)
    public final void method246(int[] arg0, int arg1, int arg2) {
        field556++;
        if (arg1 != -1) {
            return;
        }
        class174 var4 = this.field568.method1526(this.field565 * 3, (byte) -41);
        Buffer var5 = var4.method968(true, (byte) 45);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field568.method1473(-1969469652, var5);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method2614()) {
            label99: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg0[var18];
                int var21 = this.field555[var20];
                short[] var22 = this.field554.field2300[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var22.length) {
                                continue label99;
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
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                    var6.method2610(var26);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label123: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg0[var10];
                short[] var12 = this.field554.field2300[var11];
                int var13 = this.field555[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var12.length <= var15) {
                                continue label123;
                            }
                            if ((0x1 << var14++ & var13) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    var6.method2619(var17);
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method2613();
        if (!var4.method975(-114) || var7 <= 0) {
            return;
        }
        this.field568.method1477((this.field554.field2292 & 0x7) != 0, (this.field554.field2292 & 0x8) != 0, -126, this.field572);
        if (this.field568.field3374) {
            this.field568.method1501(Integer.MAX_VALUE, this.field553, this.field560, this.field573);
        }
        class474 var19 = this.field568.method1410((byte) -117);
        var19.method2886(1.0F, 1.0F / this.field569, 1.0F / this.field569, (byte) -65);
        this.field568.method1460(class393.field5647, -126);
        this.field568.method314(-69, 1, this.field570);
        this.field568.method265(arg1 + 1025, this.field554.field2320);
        this.field568.method342(var9 + 1 - var8, 7, var4, class542.field7529, var7, var8, 0);
        this.field568.method1459(0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)V", line = 345)
    public final void method247(int arg0, byte arg1) {
        if (arg1 != -88) {
            this.field568 = null;
        }
        field564++;
        this.field571.method2618(arg0 * 4 + 3);
        this.field571.method2606(-1);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)V", line = 357)
    public final void method248(int arg0, int arg1) {
        this.field562 = this.field568.method1500(true, arg0 * arg1, false);
        field558++;
        this.field571 = new Stream(this.field562, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V", line = 370)
    public final void method249(int arg0, int arg1, int arg2, int arg3) {
        this.field555[this.field554.field4814 * arg3 + arg0] = class678.method3817(this.field555[this.field554.field4814 * arg3 + arg0], 0x1 << arg2);
        field557++;
        if (arg1 != -14875) {
            this.method242(100, -48);
        }
        this.field565++;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Leha;IIIII)V", line = 385)
    public class45(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field554 = arg0;
        this.field555 = new int[this.field554.field4817 * this.field554.field4814];
        this.field569 = arg2;
        this.field560 = arg4;
        this.field553 = arg3;
        this.field568 = this.field554.field2295;
        this.field573 = arg5;
        this.field572 = arg1;
    }
}
