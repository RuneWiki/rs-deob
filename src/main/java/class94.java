import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class94 extends class178 {

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "Z")
    public boolean field1206;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "Z")
    public boolean field1211;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "[S")
    public short[] field1203;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field1209 = 100;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field1202 = 0;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "Lus;")
    public static class1 field1207 = new class1(92, -1);

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "Lef;")
    public static class311 field1216 = new class311(4, 14);

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    public static int field1218 = 0;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ltm;III[Z)V")
    public static final void method531(class242 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class53.field725 != class28.field388) {
            int var5 = class178.field2556[arg1].method1209(arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class426 var7 = class178.field2556[var6];
                    if (var7 != null) {
                        var7.method1217(arg0, arg2, var5 - var7.method1209(arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfr;Z)V")
    public static final void method532(class260 arg0, boolean arg1) {
        ++field1197;
        arg0.field3808 = null;
        if (!arg1) {
            if (~class289.field4211 > -21) {
                class204.field3040.method1444(arg0, (byte) 116);
                ++class289.field4211;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZB)V")
    public final void method533(int arg0, boolean arg1, byte arg2) {
        ++field1205;
        int var6;
        if (!arg1) {
            int var4 = this.field1199 * arg0 / 50 + this.field1201 & 2047;
            int var5 = this.field1212;
            if (var5 != 1) {
                if (~var5 != -4) {
                    if (~var5 != -5) {
                        if (var5 != 2) {
                            if (var5 == 5) {
                                var6 = (var4 >= 1024 ? -var4 + 2048 : var4) << 1;
                            } else {
                                var6 = 2048;
                            }
                        } else {
                            var6 = var4;
                        }
                    } else {
                        var6 = var4 >> 10 << 11;
                    }
                } else {
                    var6 = class50.field692[var4] >> 1;
                }
            } else {
                var6 = (class53.field727[var4 << 3] >> 5) + 1024;
            }
        } else {
            var6 = 2048;
        }
        super.field2555 = (float) (this.field1214 - -(this.field1198 * var6 >> 11)) / 2048.0F;
        if (arg2 != -62) {
            method532((class260) null, true);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIILnp;)V")
    public static final void method534(int arg0, int arg1, int arg2, int arg3, int arg4, class313 arg5) {
        arg5.method617(arg3, arg0, arg1 + arg3, arg0 + arg4);
        ++field1204;
        arg5.method1941(arg4, arg0, 1, arg1, arg3, -16777216);
        if (~class482.field6790 <= -101) {
            float var6 = (float) class395.field5628 / (float) class395.field5625;
            int var7 = arg1;
            int var8 = arg4;
            if (!(var6 < 1.0F)) {
                var7 = (int) ((float) arg4 / var6);
            } else {
                var8 = (int) ((float) arg1 * var6);
            }
            int var9 = (arg4 - var8) / 2 + arg0;
            int var10 = (-var7 + arg1) / 2 + arg3;
            if (class363.field5224 == null || ~class363.field5224.method518() != ~arg1 || class363.field5224.method521() != arg4) {
                class395.method2367(class395.field5638, class395.field5628 + class395.field5623, class395.field5638 + class395.field5625, class395.field5623, var10, var9, var10 - -var7, var8 + var9);
                class395.method2362(arg5);
                class363.field5224 = arg5.method626(var10, var9, var7, var8, false);
            }
            class363.field5224.method1079(var10, var9);
            int var11 = class172.field2504 * var7 / class395.field5625;
            int var12 = class128.field1671 * var8 / class395.field5628;
            int var13 = var10 - -(class441.field6110 * var7 / class395.field5625);
            int var14 = var8 + var9 - class342.field4975 * var8 / class395.field5628 + -var12;
            int var15 = -39 % ((arg2 - -9) / 60);
            int var16 = -1996554240;
            if (class456.field6416 == class410.field5756) {
                var16 = -1996488705;
            }
            arg5.method650(var13, var14, var11, var12, var16, 1);
            arg5.method641(var13, var14, var11, var12, var16, 0);
            if (~class303.field4313 < -1) {
                int var17;
                if (~class393.field5582 >= -51) {
                    var17 = class393.field5582 * 5;
                } else {
                    var17 = -(class393.field5582 * 5) + 500;
                }
                for (class80 var18 = (class80) class395.field5609.method2843(1123227612); var18 != null; var18 = (class80) class395.field5609.method2842(1673506446)) {
                    class19 var19 = class395.field5604.method490(36, var18.field980);
                    if (class120.method741(31, var19)) {
                        if (~class269.field3930 != ~var18.field980) {
                            if (~class479.field6719 != 0 && class479.field6719 == var19.field238) {
                                int var20 = var18.field977 * var7 / class395.field5625 + var10;
                                int var21 = (-var18.field978 + class395.field5628) * var8 / class395.field5628 + var9;
                                arg5.method1941(4, var21 + -2, 1, 4, var20 + -2, 16776960 | var17 << 24);
                            }
                        } else {
                            int var22 = var10 - -(var18.field977 * var7 / class395.field5625);
                            int var23 = (-var18.field978 + class395.field5628) * var8 / class395.field5628 + var9;
                            arg5.method1941(4, var23 - 2, 1, 4, var22 + -2, var17 << 24 | 16776960);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
    public static void method535(byte arg0) {
        field1207 = null;
        int var1 = 30 / ((arg0 - -41) / 38);
        field1216 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBIII)V")
    public final void method536(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.field1212 = arg4;
        this.field1214 = arg2;
        this.field1198 = arg0;
        if (arg1 != -62) {
            this.field1215 = 97;
        }
        this.field1199 = arg3;
        ++field1208;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILb;Lb;)V")
    public static final void method537(int arg0, class201 arg1, class201 arg2) {
        class485.field6823 = arg2;
        ++field1213;
        if (arg0 == -674700152) {
            class479.field6718 = arg1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V")
    private final void method538(byte arg0) {
        ++field1210;
        int var2 = this.field1200;
        if (var2 != 2) {
            if (var2 != 3) {
                if (~var2 != -5) {
                    if (~var2 != -6) {
                        if (~var2 != -13) {
                            if (var2 != 13) {
                                if (var2 != 10) {
                                    if (~var2 != -12) {
                                        if (~var2 != -7) {
                                            if (var2 != 7) {
                                                if (var2 != 8) {
                                                    if (~var2 != -10) {
                                                        if (~var2 != -15) {
                                                            if (~var2 != -16) {
                                                                if (var2 == 16) {
                                                                    this.field1199 = 8192;
                                                                    this.field1198 = 256;
                                                                    this.field1212 = 1;
                                                                    this.field1214 = 1792;
                                                                } else {
                                                                    this.field1214 = 0;
                                                                    this.field1212 = 0;
                                                                    this.field1199 = 2048;
                                                                    this.field1198 = 2048;
                                                                }
                                                            } else {
                                                                this.field1212 = 1;
                                                                this.field1199 = 4096;
                                                                this.field1214 = 1536;
                                                                this.field1198 = 512;
                                                            }
                                                        } else {
                                                            this.field1214 = 1280;
                                                            this.field1198 = 768;
                                                            this.field1199 = 2048;
                                                            this.field1212 = 1;
                                                        }
                                                    } else {
                                                        this.field1214 = 1024;
                                                        this.field1199 = 4096;
                                                        this.field1198 = 1024;
                                                        this.field1212 = 3;
                                                    }
                                                } else {
                                                    this.field1212 = 3;
                                                    this.field1198 = 1024;
                                                    this.field1199 = 2048;
                                                    this.field1214 = 1024;
                                                }
                                            } else {
                                                this.field1199 = 4096;
                                                this.field1214 = 1280;
                                                this.field1198 = 768;
                                                this.field1212 = 3;
                                            }
                                        } else {
                                            this.field1214 = 1280;
                                            this.field1212 = 3;
                                            this.field1198 = 768;
                                            this.field1199 = 2048;
                                        }
                                    } else {
                                        this.field1212 = 3;
                                        this.field1198 = 512;
                                        this.field1199 = 4096;
                                        this.field1214 = 1536;
                                    }
                                } else {
                                    this.field1198 = 512;
                                    this.field1199 = 2048;
                                    this.field1212 = 3;
                                    this.field1214 = 1536;
                                }
                            } else {
                                this.field1199 = 8192;
                                this.field1198 = 2048;
                                this.field1212 = 2;
                                this.field1214 = 0;
                            }
                        } else {
                            this.field1214 = 0;
                            this.field1198 = 2048;
                            this.field1212 = 2;
                            this.field1199 = 2048;
                        }
                    } else {
                        this.field1214 = 0;
                        this.field1212 = 4;
                        this.field1198 = 2048;
                        this.field1199 = 8192;
                    }
                } else {
                    this.field1199 = 2048;
                    this.field1212 = 4;
                    this.field1198 = 2048;
                    this.field1214 = 0;
                }
            } else {
                this.field1198 = 2048;
                this.field1212 = 1;
                this.field1199 = 4096;
                this.field1214 = 0;
            }
        } else {
            this.field1214 = 0;
            this.field1198 = 2048;
            this.field1199 = 2048;
            this.field1212 = 1;
        }
        if (arg0 <= 67) {
            method534(83, 41, 84, -6, -16, (class313) null);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    protected class94() {
        if (class50.field692 == null) {
            class149.method940(true);
        }
        this.method538((byte) 92);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lrp;)V")
    public class94(class276 arg0) {
        if (class50.field692 == null) {
            class149.method940(true);
        }
        this.field1215 = arg0.method1701(-23121);
        this.field1206 = ~(this.field1215 & 8) != -1;
        this.field1211 = ~(16 & this.field1215) != -1;
        this.field1215 &= 7;
        super.field2552 = arg0.method1729(65280);
        super.field2546 = arg0.method1729(65280);
        super.field2547 = arg0.method1729(65280);
        super.field2557 = arg0.method1701(-23121);
        int var2 = super.field2557 * 2 + 1;
        this.field1203 = new short[var2];
        for (int var3 = 0; ~var3 > ~this.field1203.length; ++var3) {
            short var5 = (short) arg0.method1729(65280);
            int var6 = var5 >>> 8;
            int var7 = var5 & 255;
            if (var6 >= var2) {
                var6 = var2 + -1;
            }
            if (~(-var6 + var2) > ~var7) {
                var7 = var2 - var6;
            }
            this.field1203[var3] = (short) class248.method1549(var7, var6 << 8);
        }
        super.field2557 = (super.field2557 << class216.field3242) + class248.field3674;
        if (class30.field406 == null) {
            super.field2558 = class490.field6909[65535 & class385.method2324(-1888289119, arg0.method1729(65280))];
        } else {
            super.field2558 = class30.field406[arg0.method1729(65280)];
        }
        int var4 = arg0.method1701(-23121);
        this.field1200 = var4 & 31;
        this.field1201 = (224 & var4) << 3;
        if (~this.field1200 != -32) {
            this.method538((byte) 90);
        }
    }
}
