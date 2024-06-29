import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class599 extends class159 {

    @OriginalMember(owner = "client!bha", name = "G", descriptor = "I")
    public int field8171 = 0;

    @OriginalMember(owner = "client!bha", name = "p", descriptor = "Lqq;")
    private class501 field8155;

    @OriginalMember(owner = "client!bha", name = "A", descriptor = "Lee;")
    private class703 field8166;

    @OriginalMember(owner = "client!bha", name = "y", descriptor = "F")
    public float field8164;

    @OriginalMember(owner = "client!bha", name = "C", descriptor = "I")
    public int field8168;

    @OriginalMember(owner = "client!bha", name = "w", descriptor = "I")
    public int field8162;

    @OriginalMember(owner = "client!bha", name = "o", descriptor = "[I")
    private int[] field8154;

    @OriginalMember(owner = "client!bha", name = "l", descriptor = "I")
    public int field8151;

    @OriginalMember(owner = "client!bha", name = "z", descriptor = "I")
    public int field8165;

    @OriginalMember(owner = "client!bha", name = "u", descriptor = "[I")
    public static int[] field8160 = new int[1];

    @OriginalMember(owner = "client!bha", name = "F", descriptor = "F")
    public static float field8170;

    @OriginalMember(owner = "client!bha", name = "k", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!bha", name = "m", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!bha", name = "n", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!bha", name = "q", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!bha", name = "r", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!bha", name = "s", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!bha", name = "v", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!bha", name = "x", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!bha", name = "E", descriptor = "J")
    public static long field8169;

    @OriginalMember(owner = "client!bha", name = "t", descriptor = "Lkm;")
    private class373 field8159;

    @OriginalMember(owner = "client!bha", name = "H", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8172;

    @OriginalMember(owner = "client!bha", name = "B", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8167;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(III[BIB[BII)V", line = 4)
    public static final void method3355(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte arg5, byte[] arg6, int arg7, int arg8) {
        field8153++;
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg3[var10001] += arg6[arg2++];
                int var14 = arg7++;
                arg3[var14] += arg6[arg2++];
                int var15 = arg7++;
                arg3[var15] += arg6[arg2++];
                int var16 = arg7++;
                arg3[var16] += arg6[arg2++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg3[var10001] += arg6[arg2++];
            }
            arg2 += arg4;
            arg7 += arg8;
        }
        if (arg5 != -57) {
            field8160 = null;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIIFI)V", line = 49)
    public final void method3356(int arg0, int arg1, int arg2, float arg3, int arg4) {
        if (this.field8168 != -1) {
            class577 var6 = this.field8166.field913.method1114(this.field8168, -81);
            int var7 = var6.field7865 & 0xFF;
            if (var7 != 0 && var6.field7855 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field7857 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg0 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg0 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = (var14 >> 8) + (var12 << 8 & 0xFF0069) + (var13 & 0xFF00);
            }
        }
        if (arg2 <= 111) {
            this.method3356(35, 35, -105, -0.36513728F, -64);
        }
        field8156++;
        this.field8172.method3802(arg4 * 4);
        if (arg3 != 1.0F) {
            int var15 = arg0 >> 16 & 0xFF;
            int var16 = (arg0 & 0xFFF2) >> 8;
            int var17 = arg0 & 0xFF;
            int var18 = (int) ((float) var15 * arg3);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg3);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg0 = var19 << 8 | var18 << 16 | var20;
        }
        if (this.field8166.field9591 == 0) {
            this.field8172.method3799((byte) arg0);
            this.field8172.method3799((byte) (arg0 >> 8));
            this.field8172.method3799((byte) (arg0 >> 16));
        } else {
            this.field8172.method3799((byte) (arg0 >> 16));
            this.field8172.method3799((byte) (arg0 >> 8));
            this.field8172.method3799((byte) arg0);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IZ[I)V", line = 169)
    public final void method3357(int arg0, boolean arg1, int[] arg2) {
        field8150++;
        class118 var4 = this.field8166.method3892(2, this.field8171 * 3);
        Buffer var5 = var4.method847(-127, arg1);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field8166.method3889(0, var5);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3798()) {
            label124: for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = arg2[var10];
                short[] var12 = this.field8155.field7037[var11];
                int var13 = this.field8154[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var12.length) {
                                continue label124;
                            }
                            if ((var13 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    var6.method3795(var17);
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label98: for (int var18 = 0; var18 < arg0; var18++) {
                int var20 = arg2[var18];
                short[] var21 = this.field8155.field7037[var20];
                int var22 = this.field8154[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var21.length) {
                                continue label98;
                            }
                            if ((0x1 << var23++ & var22) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    var6.method3804(var26);
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method3797();
        if (!var4.method849(18579) || var7 <= 0) {
            return;
        }
        this.field8166.method3863((this.field8155.field7035 & 0x8) != 0, this.field8168, 27016, (this.field8155.field7035 & 0x7) != 0);
        if (this.field8166.field9598) {
            this.field8166.method456(Integer.MAX_VALUE, this.field8165, this.field8151, this.field8162);
        }
        class532 var19 = this.field8166.method3877(3);
        var19.method3080(1.0F / this.field8164, 1.0F / this.field8164, 1.0F, (byte) -89);
        this.field8166.method3883((byte) 98, class525.field7284);
        this.field8166.method2818(false, this.field8159, 1);
        this.field8166.method2816((byte) 127, this.field8155.field7050);
        this.field8166.method2820(var7, 0, -13847, var9 + 1 - var8, class356.field5191, var8, var4);
        this.field8166.method3878((byte) 86);
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(BLjava/lang/String;)V", line = 325)
    public static final void method3358(byte arg0, String arg1) {
        field8158++;
        class43 var2 = class711.method3943((byte) 74);
        var2.field457.method1725(class377.field5506.field5208, 72);
        var2.field457.method1733(0, -32466);
        int var3 = var2.field457.field3725;
        var2.field457.method1733(645, -32466);
        int[] var4 = class577.method3271(-11416, var2);
        if (arg0 != 30) {
            field8170 = 1.0268377F;
        }
        int var5 = var2.field457.field3725;
        var2.field457.method1678(arg1, (byte) 120);
        var2.field457.method1725(class55.field647, 122);
        var2.field457.field3725 += 7;
        var2.field457.method1717(var2.field457.field3725, 16101, var4, var5);
        var2.field457.method1700(var2.field457.field3725 - var3, 84);
        class409.method2457((byte) -100, var2);
        class23.field232 = 0;
        class537.field7446 = -3;
        class597.field8132 = 1;
        class353.field5128 = 0;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V", line = 359)
    public static void method3359(byte arg0) {
        if (arg0 != -94) {
            method3358((byte) 105, null);
        }
        field8160 = null;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIIZ)V", line = 372)
    public final void method3360(int arg0, int arg1, int arg2, boolean arg3) {
        field8163++;
        if (!arg3) {
            this.field8154[this.field8155.field4174 * arg1 + arg2] = class670.method3699(this.field8154[this.field8155.field4174 * arg1 + arg2], 0x1 << arg0);
            this.field8171++;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IZ)V", line = 387)
    public final void method3361(int arg0, boolean arg1) {
        this.field8172.method3797();
        field8161++;
        this.field8159 = this.field8166.method2795(0, false);
        this.field8159.method2336(false, 4, this.field8167, arg0 * 4);
        this.field8167 = null;
        this.field8172 = null;
        if (!arg1) {
            this.method3357(-115, true, null);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IB)V", line = 405)
    public final void method3362(int arg0, byte arg1) {
        field8157++;
        this.field8172.method3802(arg0 * 4 + 3);
        this.field8172.method3799(-1);
        int var3 = -67 / ((43 - arg1) / 56);
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(II)V", line = 424)
    public final void method3363(int arg0, int arg1) {
        if (arg1 != -9619) {
            this.method3360(49, 126, 100, false);
        }
        this.field8167 = this.field8166.method3835(true, 0, arg0 * 4);
        field8152++;
        this.field8172 = new Stream(this.field8167, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lqq;IIIII)V", line = 443)
    public class599(class501 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8155 = arg0;
        this.field8166 = this.field8155.field7030;
        this.field8164 = arg2;
        this.field8168 = arg1;
        this.field8162 = arg5;
        this.field8154 = new int[this.field8155.field4174 * this.field8155.field4173];
        this.field8151 = arg4;
        this.field8165 = arg3;
    }
}
