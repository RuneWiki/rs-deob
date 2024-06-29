import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class544 {

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Lvg;")
    private class49 field7922 = new class49(128);

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Lvg;")
    public class49 field7923 = new class49(64);

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Lri;")
    public class97 field7911;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Lri;")
    private class97 field7913;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "J")
    public static long field7918 = 20000000L;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field7910;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 12)
    public final void method3284(int arg0) {
        field7910++;
        class49 var2 = this.field7922;
        synchronized (this.field7922) {
            this.field7922.method563(0);
        }
        class49 var3 = this.field7923;
        synchronized (this.field7923) {
            this.field7923.method563(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 30)
    public final void method3285(int arg0) {
        class49 var2 = this.field7922;
        synchronized (this.field7922) {
            this.field7922.method569(0);
        }
        field7920++;
        if (arg0 != -1) {
            field7918 = -28L;
        }
        class49 var3 = this.field7923;
        synchronized (this.field7923) {
            this.field7923.method569(0);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lvca;", line = 46)
    public final class257 method3286(int arg0, int arg1) {
        field7917++;
        class49 var3 = this.field7922;
        class257 var4;
        synchronized (this.field7922) {
            var4 = (class257) this.field7922.method560(false, (long) arg1);
            if (arg0 != 29982) {
                field7918 = 60L;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field7913;
        byte[] var6;
        synchronized (this.field7913) {
            var6 = this.field7913.method926(36, -125, arg1);
        }
        class257 var7 = new class257();
        var7.field4070 = this;
        var7.field4079 = arg1;
        if (var6 != null) {
            var7.method1824(new class6(var6), 126);
        }
        var7.method1820(false);
        class49 var8 = this.field7922;
        synchronized (this.field7922) {
            this.field7922.method559(var7, (long) arg1, arg0 - 29982);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V", line = 80)
    public final void method3287(int arg0, int arg1, int arg2) {
        field7916++;
        this.field7922 = new class49(arg1);
        this.field7923 = new class49(arg2);
        if (arg0 != 9729) {
            field7918 = 6L;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)V", line = 94)
    public final void method3288(int arg0, byte arg1) {
        field7919++;
        class49 var3 = this.field7922;
        synchronized (this.field7922) {
            this.field7922.method573((byte) 117, arg0);
        }
        class49 var4 = this.field7923;
        synchronized (this.field7923) {
            this.field7923.method573((byte) 124, arg0);
            int var5 = -58 % ((-arg1 - 70) / 35);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)Z", line = 109)
    public static final boolean method3289(int arg0, int arg1, int arg2) {
        if (arg1 != -30085) {
            method3291(54);
        }
        field7921++;
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V", line = 122)
    public static final void method3290(int arg0) {
        field7912++;
        if (class610.field8677 != -1) {
            class150.method1250(0, false, class610.field8677, -1, -1);
            class610.field8677 = -1;
        }
        if (arg0 >= -23) {
            method3289(16, 83, 74);
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 140)
    public static final void method3291(int arg0) {
        field7914++;
        if (class17.field282.method2095(class497.field7259, 9408) != 2) {
            return;
        }
        byte var1 = (byte) (class607.field8632 - 4 & 0xFF);
        int var2 = class607.field8632 % class275.field4426;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class417.field6374; var18++) {
                class428.field6538[var3][var2][var18] = var1;
            }
        }
        if (class423.field6439 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class645.field9067[var4] = -1000000;
            class680.field9541[var4] = 1000000;
            class232.field3692[var4] = 0;
            class257.field4077[var4] = 1000000;
            class16.field266[var4] = 0;
        }
        int var5 = class567.field8141.field9696;
        int var6 = class567.field8141.field9705;
        if (class126.field2062 != 1 && class664.field9243 == -1) {
            int var7 = class202.method1568(class675.field9521, class423.field6439, class412.field6318, 2);
            if (var7 - class607.field8638 < 3200 && (class690.field9676[class423.field6439][class675.field9521 >> 9][class412.field6318 >> 9] & 0x4) != 0) {
                class210.method1596(class454.field6818, 1, false, class675.field9521 >> 9, class412.field6318 >> 9, 512);
            }
        } else {
            if (class126.field2062 != 1) {
                var6 = class81.field1005;
                var5 = class664.field9243;
            }
            if ((class690.field9676[class423.field6439][var5 >> 9][var6 >> 9] & 0x4) != 0) {
                class210.method1596(class454.field6818, 0, false, var5 >> 9, var6 >> 9, 512);
            }
            if (class13.field197 < 2560) {
                int var8 = class675.field9521 >> 9;
                int var9 = class412.field6318 >> 9;
                int var10 = var5 >> 9;
                int var11 = var6 >> 9;
                int var12;
                if (var8 >= var10) {
                    var12 = var8 - var10;
                } else {
                    var12 = var10 - var8;
                }
                int var13;
                if (var9 >= var11) {
                    var13 = var9 - var11;
                } else {
                    var13 = var11 - var9;
                }
                if (var12 == 0 && var13 == 0 || (-class275.field4426) >= var12 || var12 >= class275.field4426 || var13 <= (-class417.field6374) || class417.field6374 <= var13) {
                    class660.method3790(10216, null, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class612.field8702 + "," + class626.field8855);
                    return;
                }
                if (var12 > var13) {
                    int var14 = var13 * 65536 / var12;
                    int var15 = 32768;
                    while (var8 != var10) {
                        if (var10 > var8) {
                            var8++;
                        } else if (var8 > var10) {
                            var8--;
                        }
                        if ((class690.field9676[class423.field6439][var8][var9] & 0x4) != 0) {
                            class210.method1596(class454.field6818, 1, false, var8, var9, 512);
                            break;
                        }
                        var15 += var14;
                        if (var15 >= 65536) {
                            if (var9 < var11) {
                                var9++;
                            } else if (var11 < var9) {
                                var9--;
                            }
                            var15 -= 65536;
                            if ((class690.field9676[class423.field6439][var8][var9] & 0x4) != 0) {
                                class210.method1596(class454.field6818, 1, false, var8, var9, 512);
                                break;
                            }
                        }
                    }
                } else {
                    int var16 = var12 * 65536 / var13;
                    int var17 = 32768;
                    while (var9 != var11) {
                        if (var11 > var9) {
                            var9++;
                        } else if (var9 > var11) {
                            var9--;
                        }
                        if ((class690.field9676[class423.field6439][var8][var9] & 0x4) != 0) {
                            class210.method1596(class454.field6818, 1, false, var8, var9, 512);
                            break;
                        }
                        var17 += var16;
                        if (var17 >= 65536) {
                            var17 -= 65536;
                            if (var8 < var10) {
                                var8++;
                            } else if (var10 < var8) {
                                var8--;
                            }
                            if ((class690.field9676[class423.field6439][var8][var9] & 0x4) != 0) {
                                class210.method1596(class454.field6818, 1, false, var8, var9, 512);
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= 85) {
            field7915 = 84;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lei;ILri;Lri;)V", line = 345)
    public class544(class162 arg0, int arg1, class97 arg2, class97 arg3) {
        this.field7911 = arg3;
        this.field7913 = arg2;
        this.field7913.method949(36, 0);
    }
}
