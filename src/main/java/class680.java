import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class680 extends class154 {

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "I")
    public int field9478 = 0;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Lek;")
    private class535 field9461;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "[I")
    private int[] field9464;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Lsf;")
    private class551 field9463;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "F")
    public float field9468;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public int field9470;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public int field9477;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public int field9462;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public int field9471;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Lfja;")
    public static class783 field9460 = new class783(106, 6);

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "J")
    public static long field9466 = 0L;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field9469 = -60;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field9458;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field9467;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public static int field9472;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field9475;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Lmha;")
    private class438 field9459;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9474;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field9465;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fk", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field9480;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
    public final void method3829(int arg0, int arg1) {
        this.field9474.method3904(arg0 * 4 + 3);
        if (arg1 != 131586) {
            method3833(-121);
        }
        field9458++;
        this.field9474.method3908(-1);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIZ)Z")
    public static final boolean method3830(int arg0, int arg1, int arg2, boolean arg3) {
        field9475++;
        boolean var4 = arg3;
        class237 var5 = (class237) class454.method2624(arg2, arg0, arg1);
        if (var5 != null) {
            var4 = arg3 & class548.method3081(false, var5);
        }
        class237 var6 = (class237) class614.method3480(arg2, arg0, arg1, field9480 == null ? (field9480 = method3837("bea")) : field9480);
        if (var6 != null) {
            var4 &= class548.method3081(false, var6);
        }
        class237 var7 = (class237) class572.method3313(arg2, arg0, arg1);
        if (var7 != null) {
            var4 &= class548.method3081(false, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)V")
    public final void method3831(byte arg0, int arg1) {
        if (arg0 <= 120) {
            this.field9461 = null;
        }
        this.field9465 = this.field9463.method3161(true, arg1 * 4, true);
        field9479++;
        this.field9474 = new Stream(this.field9465, 0, arg1 * 4);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
    public final void method3832(int arg0, int arg1) {
        field9476++;
        this.field9474.method3901();
        this.field9459 = this.field9463.method818(0, false);
        this.field9459.method1738(21990, this.field9465, 4, arg0 * 4);
        if (arg1 < -75) {
            this.field9465 = null;
            this.field9474 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method3833(int arg0) {
        if (arg0 != 255) {
            method3833(90);
        }
        field9460 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIBI)V")
    public final void method3834(int arg0, int arg1, byte arg2, int arg3) {
        this.field9464[this.field9461.field4037 * arg3 + arg0] = class530.method3011(this.field9464[this.field9461.field4037 * arg3 + arg0], 0x1 << arg1);
        field9467++;
        this.field9478++;
        int var5 = -5 % ((-arg2 - 74) / 42);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BIFII)V")
    public final void method3835(byte arg0, int arg1, float arg2, int arg3, int arg4) {
        field9473++;
        if (arg0 != -10) {
            return;
        }
        if (this.field9462 != -1) {
            class311 var6 = this.field9463.field970.method1270(this.field9462, true);
            int var7 = var6.field4241 & 0xFF;
            if (var7 != 0 && var6.field4250 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg4 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((var8 & 0xFF00) * var7 + ((arg1 & 0xFF00) * var10) & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field4236 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg1 >> 16 & 0xFF) * var11;
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
                arg1 = (var13 & 0xFF00) + (var14 >> 8) + (var12 << 8 & 0xFF0084);
            }
        }
        if (arg2 != 1.0F) {
            int var15 = arg1 >> 16 & 0xFF;
            int var16 = arg1 >> 8 & 0xFF;
            int var17 = arg1 & 0xFF;
            int var18 = (int) ((float) var15 * arg2);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var20 | var19 << 8 | var18 << 16;
        }
        this.field9474.method3904(arg3 * 4);
        if (this.field9463.field7694 == 0) {
            this.field9474.method3908((byte) arg1);
            this.field9474.method3908((byte) (arg1 >> 8));
            this.field9474.method3908((byte) (arg1 >> 16));
        } else {
            this.field9474.method3908((byte) (arg1 >> 16));
            this.field9474.method3908((byte) (arg1 >> 8));
            this.field9474.method3908((byte) arg1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([IZI)V")
    public final void method3836(int[] arg0, boolean arg1, int arg2) {
        field9472++;
        class226 var4 = this.field9463.method3136((byte) -117, this.field9478 * 3);
        Buffer var5 = var4.method1545(true, -4450);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field9463.method3170((byte) 5, var5);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3910()) {
            label101: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg0[var18];
                short[] var21 = this.field9461.field7269[var20];
                int var22 = this.field9464[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var21.length) {
                                continue label101;
                            }
                            if ((var22 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                    var6.method3912(var26);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label127: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg0[var10];
                short[] var12 = this.field9461.field7269[var11];
                int var13 = this.field9464[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var12.length) {
                                continue label127;
                            }
                            if ((var13 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    var6.method3903(var17);
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method3901();
        if (var4.method1544(102) && var7 > 0) {
            this.field9463.method3131(this.field9462, 0, (this.field9461.field7270 & 0x7) != 0, (this.field9461.field7270 & 0x8) != 0);
            if (this.field9463.field7714) {
                this.field9463.method569(Integer.MAX_VALUE, this.field9471, this.field9477, this.field9470);
            }
            class421 var19 = this.field9463.method3125(0);
            var19.method2490(1.0F / this.field9468, 1.0F / this.field9468, -14978, 1.0F);
            this.field9463.method3099(25, class462.field6288);
            this.field9463.method863(1, (byte) 117, this.field9459);
            this.field9463.method846((byte) -120, this.field9461.field7284);
            this.field9463.method830(var9 + 1 - var8, var4, class501.field6860, (byte) 95, var7, var8, 0);
            this.field9463.method3108(3);
        }
        if (arg1) {
            this.field9470 = 54;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lek;IIIII)V")
    public class680(class535 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9461 = arg0;
        this.field9464 = new int[this.field9461.field4037 * this.field9461.field4034];
        this.field9463 = this.field9461.field7241;
        this.field9468 = arg2;
        this.field9470 = arg5;
        this.field9477 = arg4;
        this.field9462 = arg1;
        this.field9471 = arg3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3837(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
