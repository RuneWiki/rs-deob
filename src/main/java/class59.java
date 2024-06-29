import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class59 extends class1 {

    @OriginalMember(owner = "client!fc", name = "tb", descriptor = "[B")
    private byte[] field1181 = new byte[512];

    @OriginalMember(owner = "client!fc", name = "ib", descriptor = "I")
    private int field1170 = 0;

    @OriginalMember(owner = "client!fc", name = "sb", descriptor = "I")
    private int field1180 = 5;

    @OriginalMember(owner = "client!fc", name = "jb", descriptor = "I")
    private int field1171 = 1;

    @OriginalMember(owner = "client!fc", name = "zb", descriptor = "I")
    private int field1187 = 2048;

    @OriginalMember(owner = "client!fc", name = "vb", descriptor = "[S")
    private short[] field1183 = new short[512];

    @OriginalMember(owner = "client!fc", name = "mb", descriptor = "I")
    private int field1174 = 5;

    @OriginalMember(owner = "client!fc", name = "pb", descriptor = "I")
    private int field1177 = 2;

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "[I")
    public static int[] field1168 = new int[5];

    @OriginalMember(owner = "client!fc", name = "lb", descriptor = "Loc;")
    public static class151 field1173 = class137.method873(2, "<img=1>");

    @OriginalMember(owner = "client!fc", name = "wb", descriptor = "[I")
    public static int[] field1184 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!fc", name = "ub", descriptor = "I")
    public static int field1182 = 0;

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!fc", name = "kb", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!fc", name = "nb", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!fc", name = "ob", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!fc", name = "qb", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!fc", name = "rb", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!fc", name = "xb", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!fc", name = "yb", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!fc", name = "Ab", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)V")
    public static final void method391(int arg0, int arg1, int arg2, int arg3) {
        ++field1178;
        if (arg1 >= 128 && ~arg0 <= -129 && ~arg1 >= -13057 && arg0 <= 13056) {
            int var4 = -arg2 + class195.method1225(arg1, class234.field4325, arg0, (byte) -118);
            int var5 = var4 - class113.field2011;
            int var6 = arg0 - class181.field3267;
            int var7 = arg1 - class90.field1650;
            int var8 = class61.field1191[class37.field779];
            int var9 = class61.field1208[class37.field779];
            int var10 = class61.field1191[class147.field2640];
            int var11 = class61.field1208[class147.field2640];
            int var12 = var6 * var10 + var7 * var11 >> 16;
            int var13 = var6 * var11 - var7 * var10 >> 16;
            int var15 = var5 * var9 - var8 * var13 >> 16;
            int var16 = var5 * var8 + var9 * var13 >> 16;
            if (var16 < 50) {
                class109.field1932 = -1;
                class162.field2924 = -1;
            } else {
                class109.field1932 = (var15 << 9) / var16 + 167;
                class162.field2924 = (var12 << 9) / var16 + 256;
            }
            if (arg3 != 35867888) {
                method394(-17);
            }
        } else {
            class109.field1932 = -1;
            class162.field2924 = -1;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class59() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
    private final void method392(int arg0) {
        Random var2 = new Random((long) this.field1170);
        if (arg0 == 4125) {
            ++field1179;
            this.field1183 = new short[512];
            if (~this.field1187 < -1) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field1183[var3] = (short) class3.method28(var2, 83, this.field1187);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field1185;
        if (arg0 != 107) {
            field1173 = null;
        }
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (super.field21.field3388) {
            int var4 = class23.field509[arg1] * this.field1174 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class202.field3603 > var7; ++var7) {
                class226.field3932 = Integer.MAX_VALUE;
                class236.field4395 = Integer.MAX_VALUE;
                class161.field2907 = Integer.MAX_VALUE;
                class191.field3383 = Integer.MAX_VALUE;
                int var8 = class195.field3477[var7] * this.field1180 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = this.field1181[255 & (~var11 <= ~this.field1174 ? var11 - this.field1174 : var11)] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (255 & this.field1181[(var14 >= this.field1180 ? -this.field1180 + var14 : var14) + var13 & 255]);
                        int var27 = var15 + 1;
                        int var16 = var8 - (this.field1183[var15] + (var14 << 12));
                        int var17 = -(var11 << 12) + var4 + -this.field1183[var27];
                        int var18 = this.field1171;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 > -1 ? -var16 : var16) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = ~var26 >= ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (~class191.field3383 >= ~var19) {
                            if (~class161.field2907 >= ~var19) {
                                if (~class236.field4395 >= ~var19) {
                                    if (~class226.field3932 < ~var19) {
                                        class226.field3932 = var19;
                                    }
                                } else {
                                    class226.field3932 = class236.field4395;
                                    class236.field4395 = var19;
                                }
                            } else {
                                class226.field3932 = class236.field4395;
                                class236.field4395 = class161.field2907;
                                class161.field2907 = var19;
                            }
                        } else {
                            class226.field3932 = class236.field4395;
                            class236.field4395 = class161.field2907;
                            class161.field2907 = class191.field3383;
                            class191.field3383 = var19;
                        }
                    }
                }
                int var12 = this.field1177;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = class161.field2907 - class191.field3383;
                                }
                            } else {
                                var3[var7] = class226.field3932;
                            }
                        } else {
                            var3[var7] = class236.field4395;
                        }
                    } else {
                        var3[var7] = class161.field2907;
                    }
                } else {
                    var3[var7] = class191.field3383;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field1188;
        this.field1181 = class205.method1297((byte) 64, this.field1170);
        this.method392(arg0 ^ 4126);
        if (arg0 != 3) {
            this.method13(-43, 93, (class229) null);
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)V")
    public static final void method393(byte arg0) {
        if (arg0 <= -17) {
            ++field1175;
            class21.field462 = 0;
            class111.field1956 = 0;
            class227.method1419((byte) 120);
            class220.method1371(5);
            class38.method284(-1);
            for (int var1 = 0; var1 < class21.field462; ++var1) {
                int var3 = class163.field2942[var1];
                if (class200.field3541 != class122.field2190[var3].field4028) {
                    class122.field2190[var3].field3608 = null;
                    class122.field2190[var3] = null;
                }
            }
            if (~class68.field1329 != ~class1.field34.field4101) {
                throw new RuntimeException("gnp1 pos:" + class1.field34.field4101 + " psize:" + class68.field1329);
            } else {
                for (int var2 = 0; ~class23.field505 < ~var2; ++var2) {
                    if (class122.field2190[class81.field1553[var2]] == null) {
                        throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class23.field505);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field1186;
        if (arg0 != 0) {
            method395(false);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field1174 = arg2.method1475(255);
                                }
                            } else {
                                this.field1180 = arg2.method1475(255);
                            }
                        } else {
                            this.field1171 = arg2.method1475(255);
                        }
                    } else {
                        this.field1177 = arg2.method1475(arg0 ^ 255);
                    }
                } else {
                    this.field1187 = arg2.method1490((byte) 73);
                }
            } else {
                this.field1170 = arg2.method1475(255);
            }
        } else {
            this.field1180 = this.field1174 = arg2.method1475(arg0 + 255);
        }
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
    public static void method394(int arg0) {
        if (arg0 != 32215) {
            method394(-59);
        }
        field1173 = null;
        field1168 = null;
        field1184 = null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
    public static final void method395(boolean arg0) {
        try {
            if (class206.field3656 == null) {
                class206.field3656 = new class182(class174.field3151, class126.method761(new class151[] { class124.field2238, class137.method874(class123.field2212, false), class1.field38 }, 10260).method964(10837));
            } else {
                byte[] var1 = class206.field3656.method1147((byte) 18);
                if (var1 != null) {
                    class229 var2 = new class229(var1);
                    class99.field1794 = var2.method1490((byte) 73);
                    class222.field3849 = new class5[class99.field1794];
                    int var3 = 0;
                    while (true) {
                        if (class99.field1794 <= var3) {
                            class215.method1346(0, class211.field3696, class222.field3849.length + -1, class89.field1632, 126, class222.field3849);
                            class233.field4295 = true;
                            class206.field3656 = null;
                            break;
                        }
                        class5 var4 = class222.field3849[var3] = new class5();
                        int var5 = var2.method1490((byte) 73);
                        var4.field92 = (var5 & 32768) != 0;
                        var4.field90 = 32767 & var5;
                        var4.field97 = var2.method1443((byte) -85);
                        var4.field88 = var2.method1466(12435);
                        var4.field89 = var3;
                        var4.field86 = class29.method222(var2.method1490((byte) 73), 82);
                        ++var3;
                    }
                }
            }
            if (arg0) {
                field1184 = null;
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class206.field3656 = null;
        }
        ++field1172;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V")
    public static final void method396(int arg0, int arg1) {
        class227.field3967 = 0;
        ++field1176;
        class45.field937 = -1;
        class16.field387 = arg0;
        class78.field1513 = false;
        class218.field3799 = arg1;
        class187.field3323 = -1;
        class68.field1331 = null;
    }
}
