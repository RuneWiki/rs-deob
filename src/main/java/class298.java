import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class298 {

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    private int field4095 = -1;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Z")
    public boolean field4103 = true;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    private int field4091;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lhk;")
    private class111 field4099;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    private int field4098;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lpk;")
    private class211 field4092;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    private int field4100;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Lkf;")
    private class268 field4107;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lnc;")
    private class26 field4096;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lrs;")
    private class679 field4093;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Lfja;")
    public static class783 field4108 = new class783(27, -2);

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field4109 = 0;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "[[I")
    public static int[][] field4105;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 3)
    public static void method1913(int arg0) {
        field4105 = null;
        field4108 = null;
        if (arg0 != 0) {
            field4105 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 14)
    public static final void method1914(int arg0) {
        class118.field2159++;
        field4097++;
        class537 var1 = class476.method2729(class718.field9879, (byte) -46, class551.field7498);
        if (arg0 >= -30) {
            field4109 = -114;
        }
        var1.field7295.method781(34, class27.field510);
        class173.method1314(false, var1);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lnc;II)V", line = 35)
    private final void method1915(class26 arg0, int arg1, int arg2) {
        field4101++;
        if (arg1 != 0) {
            this.method1920(-124);
            this.field4099.method939(this.field4107, arg2 + 8448);
            this.field4099.method951(393, arg2, arg0, arg1, 4);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 51)
    public final void method1916(byte arg0) {
        this.method1915(this.field4096, this.field4100, 0);
        if (arg0 > -124) {
            method1918(76);
        }
        field4104++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILul;)I", line = 65)
    public static final int method1917(int arg0, class599 arg1) {
        if (arg0 >= -67) {
            method1913(-68);
        }
        field4094++;
        if (class320.field4368 == arg1) {
            return 6407;
        } else if (class530.field7176 == arg1) {
            return 6408;
        } else if (class485.field6566 == arg1) {
            return 6406;
        } else if (class14.field216 == arg1) {
            return 6409;
        } else if (class159.field2562 == arg1) {
            return 6410;
        } else if (class707.field9721 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V", line = 100)
    public static final void method1918(int arg0) {
        if (arg0 == 0) {
            if (class341.field4602 == 2) {
                class34.field571[0].method2535(class102.field1651[0]);
                class34.field571[1].method2535(class102.field1651[1]);
            } else if (class341.field4602 == 3) {
                class34.field571[0].method2535(class102.field1651[0]);
                class34.field571[1].method2535(class102.field1651[1]);
                class34.field571[2].method2535(class102.field1651[2]);
            } else {
                class34.field571[0].method2535(class102.field1651[0]);
                class34.field571[1].method2535(class102.field1651[1]);
                class34.field571[2].method2535(class102.field1651[2]);
                class34.field571[3].method2535(class102.field1651[3]);
            }
        } else if (arg0 == 1) {
            if (class341.field4602 == 2) {
                class34.field571[0].method2535(class102.field1651[2]);
            } else if (class341.field4602 == 3) {
                class34.field571[0].method2535(class102.field1651[3]);
                class34.field571[1].method2535(class102.field1651[4]);
            } else {
                class34.field571[0].method2535(class102.field1651[4]);
                class34.field571[1].method2535(class102.field1651[5]);
                class34.field571[2].method2535(class102.field1651[6]);
            }
        } else if (arg0 == 2) {
            if (class341.field4602 == 2) {
                class34.field571[0].method2535(class102.field1651[3]);
                return;
            }
            if (class341.field4602 == 3) {
                class34.field571[0].method2535(class102.field1651[5]);
                return;
            }
            class34.field571[0].method2535(class102.field1651[7]);
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lhk;Lpk;Lvca;IIIII)V", line = 294)
    public class298(class111 arg0, class211 arg1, class297 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4091 = arg6;
        this.field4099 = arg0;
        this.field4098 = arg7;
        this.field4092 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field4037 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field4055[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field4100 = var10;
        if (var10 <= 0) {
            this.field4107 = null;
        } else {
            class93 var14 = new class93(var10 * 2);
            if (this.field4099.field2000) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field4037 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field4055[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method781(13, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field4037 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field4055[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method748(255, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field4096 = this.field4099.method932((byte) 25, false, 5123, var14.field1442, var14.field1413);
            this.field4093 = new class679(this.field4099, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z[BII)V", line = 175)
    public final void method1919(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field4102++;
        this.field4093.method175(arg0, arg1, this.field4099.method993(arg3, 105) * arg2, arg3);
        this.method1915(this.field4093, arg2, 0);
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V", line = 185)
    private final void method1920(int arg0) {
        field4106++;
        if (!this.field4103) {
            return;
        }
        this.field4103 = false;
        byte[] var2 = this.field4092.field3160;
        byte[] var3 = this.field4099.field2082;
        int var4 = 0;
        if (arg0 > -123) {
            return;
        }
        int var5 = this.field4092.field3148;
        int var6 = this.field4092.field3148 * this.field4098 + this.field4091;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4107 != null && this.field4095 == var4) {
            this.field4103 = false;
            return;
        }
        this.field4095 = var4;
        int var8 = 0;
        int var9 = this.field4098 * var5 + this.field4091;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field4092.field3148 - 128;
        }
        if (this.field4107 == null) {
            this.field4107 = new class268(this.field4099, 3553, 6406, 128, 128, false, this.field4099.field2082, 6406, false);
            this.field4107.method1742(111, false, false);
            this.field4107.method126(true, -22513);
        } else {
            this.field4107.method1741(128, 0, 0, 0, 128, this.field4099.field2082, 0, -115, false, 6406);
        }
    }
}
