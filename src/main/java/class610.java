import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class610 extends class38 {

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    private int field8627 = 0;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    private int field8631 = 0;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    private int field8629 = 1;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "Lmia;")
    public static class63 field8625 = new class63(32, 7);

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field8630;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -4) {
                    this.field8629 = arg2.method3745(-6314);
                }
            } else {
                this.field8631 = arg2.method3745(-6314);
            }
        } else {
            this.field8627 = arg2.method3745(-6314);
        }
        if (arg0 < 34) {
            this.method190(-119, -27, (class645) null);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        ++field8628;
        if (arg0 > 120) {
            class417.method2634((byte) -118);
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class610() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(B)V")
    public static void method3538(byte arg0) {
        int var1 = -41 / ((72 - arg0) / 50);
        field8625 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)V")
    public static final void method3539(int arg0, boolean arg1) {
        ++field8624;
        if (!arg1) {
            field8632 = -118;
        }
        if (~class654.field9174 == -2) {
            class739.field10367 = arg0;
        } else if (~class654.field9174 == -3) {
            class209.field3057 = arg0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        ++field8623;
        if (arg0 >= -43) {
            this.method199((byte) 46, -55);
        }
        int[] var3 = super.field397.method1376(arg1, (byte) 109);
        if (super.field397.field3005) {
            int var4 = class136.field1816[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class729.field10216; ++var6) {
                int var7 = class255.field3666[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field8627 != 0) {
                    int var9 = var8 * var8 - -(var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field8629 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field8629;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field8631 == 0) {
                    var12 = class149.field2330[var12 >> 4 & 255] + 4096 >> 1;
                } else if (~this.field8631 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lvt;I)V")
    public static final void method3540(class304 arg0, int arg1) {
        ++field8626;
        arg0.method1913((byte) -82);
        int var2 = 0;
        for (int var3 = 0; ~class254.field3653 < ~var3; ++var3) {
            int var15 = class345.field4993[var3];
            if ((1 & class727.field10157[var15]) == 0) {
                if (var2 > 0) {
                    --var2;
                    class727.field10157[var15] = (byte) class625.method3600(class727.field10157[var15], 2);
                } else {
                    int var16 = arg0.method1914(11356, 1);
                    if (~var16 == -1) {
                        var2 = class45.method322(-3, arg0);
                        class727.field10157[var15] = (byte) class625.method3600(class727.field10157[var15], 2);
                    } else {
                        class127.method892(var15, (byte) -20, arg0);
                    }
                }
            }
        }
        arg0.method1926((byte) 44);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        } else {
            arg0.method1913((byte) -116);
            for (int var4 = 0; class254.field3653 > var4; ++var4) {
                int var13 = class345.field4993[var4];
                if (~(class727.field10157[var13] & 1) != -1) {
                    if (var2 > 0) {
                        class727.field10157[var13] = (byte) class625.method3600(class727.field10157[var13], 2);
                        --var2;
                    } else {
                        int var14 = arg0.method1914(11356, 1);
                        if (var14 == 0) {
                            var2 = class45.method322(-3, arg0);
                            class727.field10157[var13] = (byte) class625.method3600(class727.field10157[var13], 2);
                        } else {
                            class127.method892(var13, (byte) -20, arg0);
                        }
                    }
                }
            }
            arg0.method1926((byte) 44);
            if (var2 != 0) {
                throw new RuntimeException("nsn1");
            } else {
                arg0.method1913((byte) -90);
                for (int var5 = 0; ~var5 > ~class752.field10510; ++var5) {
                    int var11 = class314.field4453[var5];
                    if (~(class727.field10157[var11] & 1) != -1) {
                        if (var2 > 0) {
                            --var2;
                            class727.field10157[var11] = (byte) class625.method3600(class727.field10157[var11], 2);
                        } else {
                            int var12 = arg0.method1914(11356, 1);
                            if (~var12 == -1) {
                                var2 = class45.method322(-3, arg0);
                                class727.field10157[var11] = (byte) class625.method3600(class727.field10157[var11], 2);
                            } else if (class133.method939(arg0, var11, 13706)) {
                                class727.field10157[var11] = (byte) class625.method3600(class727.field10157[var11], 2);
                            }
                        }
                    }
                }
                arg0.method1926((byte) 44);
                if (~var2 != -1) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg0.method1913((byte) -88);
                    for (int var6 = arg1; ~var6 > ~class752.field10510; ++var6) {
                        int var9 = class314.field4453[var6];
                        if ((class727.field10157[var9] & 1) == 0) {
                            if (~var2 < -1) {
                                class727.field10157[var9] = (byte) class625.method3600(class727.field10157[var9], 2);
                                --var2;
                            } else {
                                int var10 = arg0.method1914(11356, 1);
                                if (~var10 == -1) {
                                    var2 = class45.method322(-3, arg0);
                                    class727.field10157[var9] = (byte) class625.method3600(class727.field10157[var9], 2);
                                } else if (class133.method939(arg0, var9, 13706)) {
                                    class727.field10157[var9] = (byte) class625.method3600(class727.field10157[var9], 2);
                                }
                            }
                        }
                    }
                    arg0.method1926((byte) 44);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class254.field3653 = 0;
                        class752.field10510 = 0;
                        for (int var7 = 1; ~var7 > -2049; ++var7) {
                            class727.field10157[var7] = (byte) (class727.field10157[var7] >> 1);
                            class689 var8 = class314.field4456[var7];
                            if (var8 != null) {
                                class345.field4993[class254.field3653++] = var7;
                            } else {
                                class314.field4453[class752.field10510++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }
}
