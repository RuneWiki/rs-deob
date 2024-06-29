import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class210 extends class205 {

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    private int field3900 = 5;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "[B")
    private byte[] field3898 = new byte[512];

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "[S")
    private short[] field3894 = new short[512];

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    private int field3901 = 2;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "I")
    private int field3905 = 1;

    @OriginalMember(owner = "client!ub", name = "mb", descriptor = "I")
    private int field3910 = 0;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    private int field3893 = 5;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    private int field3895 = 2048;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    public static int field3904 = 127;

    @OriginalMember(owner = "client!ub", name = "lb", descriptor = "[I")
    public static int[] field3909 = new int[2000];

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!ub", name = "nb", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "[I")
    public static int[] field3896;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILab;I)[Lva;")
    public static final class219[] method1338(int arg0, int arg1, class3 arg2, int arg3) {
        if (arg1 != -1) {
            return null;
        } else {
            ++field3907;
            return !class47.method344(arg2, arg3, -54, arg0) ? null : class227.method1491((byte) 76);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        if (arg0) {
            this.field3893 = -104;
        }
        ++field3899;
        this.field3898 = class3.method25(this.field3910, 511);
        this.method1340(115);
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public static void method1339(byte arg0) {
        if (arg0 < 26) {
            method1339((byte) 27);
        }
        field3909 = null;
        field3896 = null;
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
    private final void method1340(int arg0) {
        Random var2 = new Random((long) this.field3910);
        ++field3911;
        this.field3894 = new short[512];
        if (this.field3895 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field3894[var3] = (short) class217.method1384(Integer.MIN_VALUE, this.field3895, var2);
            }
        }
        if (arg0 < 102) {
            this.field3893 = -63;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field3893 = arg0.method662((byte) -100);
                                }
                            } else {
                                this.field3900 = arg0.method662((byte) -83);
                            }
                        } else {
                            this.field3905 = arg0.method662((byte) -117);
                        }
                    } else {
                        this.field3901 = arg0.method662((byte) -95);
                    }
                } else {
                    this.field3895 = arg0.method675(2);
                }
            } else {
                this.field3910 = arg0.method662((byte) -98);
            }
        } else {
            this.field3900 = this.field3893 = arg0.method662((byte) -88);
        }
        ++field3897;
        int var5 = -24 % ((arg1 - -47) / 34);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field3902;
        if (arg0 != 0) {
            this.method1340(78);
        }
        int[] var3 = super.field3810.method557(6978, arg1);
        if (super.field3810.field1635) {
            int var4 = 2048 - -(class218.field4051[arg1] * this.field3893);
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class118.field2245 < ~var7; ++var7) {
                class67.field1264 = Integer.MAX_VALUE;
                class125.field2387 = Integer.MAX_VALUE;
                class52.field992 = Integer.MAX_VALUE;
                class18.field439 = Integer.MAX_VALUE;
                int var8 = class230.field4319[var7] * this.field3900 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = this.field3898[255 & (this.field3893 <= var11 ? -this.field3893 + var11 : var11)] & 255;
                    for (int var14 = var9 - 1; var10 >= var14; ++var14) {
                        int var15 = 2 * (255 & this.field3898[255 & (~this.field3900 >= ~var14 ? -this.field3900 + var14 : var14) + var13]);
                        int var10000 = -(var14 << 12) + var8;
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field3894[var15];
                        int var17 = -(var11 << 12) - (this.field3894[var27] - var4);
                        int var18 = this.field3905;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (var16 >= 0 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = ~var25 >= ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class18.field439 <= var19) {
                            if (~class52.field992 >= ~var19) {
                                if (~var19 <= ~class125.field2387) {
                                    if (var19 < class67.field1264) {
                                        class67.field1264 = var19;
                                    }
                                } else {
                                    class67.field1264 = class125.field2387;
                                    class125.field2387 = var19;
                                }
                            } else {
                                class67.field1264 = class125.field2387;
                                class125.field2387 = class52.field992;
                                class52.field992 = var19;
                            }
                        } else {
                            class67.field1264 = class125.field2387;
                            class125.field2387 = class52.field992;
                            class52.field992 = class18.field439;
                            class18.field439 = var19;
                        }
                    }
                }
                int var12 = this.field3901;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class18.field439 + class52.field992;
                                }
                            } else {
                                var3[var7] = class67.field1264;
                            }
                        } else {
                            var3[var7] = class125.field2387;
                        }
                    } else {
                        var3[var7] = class52.field992;
                    }
                } else {
                    var3[var7] = class18.field439;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class210() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V")
    public static final void method1341(int arg0) {
        for (int var1 = 0; var1 < class52.field993; ++var1) {
            int var10002 = class96.field1792[var1]--;
            if (~class96.field1792[var1] <= 9) {
                class4 var4 = class91.field1720[var1];
                if (var4 == null) {
                    var4 = class4.method49(class153.field2941, class121.field2309[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class96.field1792[var1] += var4.method48();
                    class91.field1720[var1] = var4;
                }
                if (~class96.field1792[var1] > -1) {
                    int var11;
                    if (~class70.field1307[var1] != -1) {
                        int var5 = (class70.field1307[var1] & 16722568) >> 16;
                        int var6 = (255 & class70.field1307[var1]) * 128;
                        int var7 = var5 * 128 + 64 + -class17.field432.field1353;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class70.field1307[var1] >> 8 & 255;
                        int var9 = var8 * 128 + -class17.field432.field1360 - -64;
                        if (~var9 > -1) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 + -128;
                        if (var6 < var10) {
                            class96.field1792[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var11 = (var6 - var10) * field3904 / var6;
                    } else {
                        var11 = class134.field2585;
                    }
                    if (~var11 < -1) {
                        class171 var12 = var4.method46().method1087(class184.field3410);
                        class198 var13 = class198.method1220(var12, 100, var11);
                        var13.method1230(class115.field2198[var1] - 1);
                        class18.field443.method751(var13);
                    }
                    class96.field1792[var1] = -100;
                }
            } else {
                --class52.field993;
                for (int var3 = var1; ~class52.field993 < ~var3; ++var3) {
                    class121.field2309[var3] = class121.field2309[var3 + 1];
                    class91.field1720[var3] = class91.field1720[var3 + 1];
                    class115.field2198[var3] = class115.field2198[var3 - -1];
                    class96.field1792[var3] = class96.field1792[var3 - -1];
                    class70.field1307[var3] = class70.field1307[var3 + 1];
                }
                --var1;
            }
        }
        ++field3906;
        int var2 = -63 / ((44 - arg0) / 37);
        if (class176.field3293 && !class84.method545(0)) {
            if (~class25.field567 != -1 && class192.field3537 != -1) {
                class109.method713((byte) 74, class25.field567, false, class192.field3537, 0, class187.field3466);
            }
            class176.field3293 = false;
        } else if (~class25.field567 != -1 && ~class192.field3537 != 0 && !class84.method545(0)) {
            ++class69.field1288;
            class42.field895.method1347((byte) -90, 175);
            class42.field895.method684(class192.field3537, 63);
            class192.field3537 = -1;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method1342(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field3903;
        if (arg5 > -97) {
            field3896 = null;
        }
        int var7 = arg3 & 3;
        if (~(arg2 & 1) == -2) {
            int var8 = arg4;
            arg4 = arg6;
            arg6 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (~var7 == -2) {
            return -arg1 + 7 + -arg4 + 1;
        } else {
            return ~var7 == -3 ? -arg0 + 7 - (arg6 + -1) : arg1;
        }
    }
}
