import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class219 {

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    private int field3207 = -1;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "Z")
    public boolean field3204 = true;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "Lmj;")
    private class114 field3201;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    private int field3209;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    private int field3206;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "Lkda;")
    private class492 field3213;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "Llba;")
    private class225 field3203;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    private int field3202;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    private int field3208;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "Lvv;")
    private class463 field3200;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "Z")
    public static boolean field3210;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lvv;II)V", line = 7)
    public final void method1507(class463 arg0, int arg1, int arg2) {
        if (arg1 > 0) {
            this.method1509((byte) -48);
            this.field3201.method988(1, this.field3203);
            this.field3201.method140(this.field3202, this.field3208 + 1 - this.field3202, arg0, class710.field9929, 0, 0, arg1);
        }
        if (arg2 < 23) {
            this.field3205 = 77;
        }
        field3199++;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lmj;Lkda;Lsl;IIIII)V", line = 126)
    public class219(class114 arg0, class492 arg1, class99 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3201 = arg0;
        this.field3209 = arg7;
        this.field3206 = arg6;
        this.field3213 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field5808 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field1460[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field3203 = null;
            this.field3205 = 0;
        } else {
            this.field3202 = Integer.MAX_VALUE;
            this.field3208 = Integer.MIN_VALUE;
            this.field3200 = this.field3201.method84(-119, false);
            this.field3200.method602(17154, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field3200.method1440(true, -15169);
                if (var15 != null) {
                    Stream var16 = this.field3201.method1007(1, var15);
                    if (Stream.method2263()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field5808 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field1460[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field3208) {
                                            this.field3208 = var28;
                                        }
                                        if (var28 < this.field3202) {
                                            this.field3202 = var28;
                                        }
                                        var16.method2259(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field5808 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field1460[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 < this.field3202) {
                                            this.field3202 = var22;
                                        }
                                        if (this.field3208 < var22) {
                                            this.field3208 = var22;
                                        }
                                        var16.method2252(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method2255();
                    if (this.field3200.method1441(32416)) {
                        break;
                    }
                }
            }
            this.field3205 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lss;III)Ljn;", line = 35)
    public static final class136 method1508(class307 arg0, int arg1, int arg2, int arg3) {
        field3214++;
        int var4 = arg3 << 10 | arg0.field4387;
        class136 var5 = (class136) class768.field10604.method245(4768, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class522.field7317.method2988(class522.field7317.method2997((byte) -2, var4), 0);
        if (var6 == null) {
            int var9 = arg2 + 65536 << 10 | arg0.field4387;
            class136 var10 = (class136) class768.field10604.method245(4768, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class522.field7317.method2988(class522.field7317.method2997((byte) -2, var9), 0);
            if (var11 == null) {
                int var14 = -29 % ((arg1 + 63) / 52);
                int var15 = arg0.field4387 | 0x3FFFC00;
                class136 var16 = (class136) class768.field10604.method245(4768, (long) var15 << 16);
                if (var16 != null) {
                    return var16;
                }
                byte[] var17 = class522.field7317.method2988(class522.field7317.method2997((byte) -2, var15), 0);
                if (var17 == null) {
                    return null;
                } else if (var17.length <= 1) {
                    return null;
                } else {
                    class136 var18;
                    try {
                        var18 = class351.method2130((byte) -114, var17);
                    } catch (Exception var22) {
                        throw new RuntimeException(var22.getMessage() + " S: " + var15);
                    }
                    var18.field2264 = arg0;
                    class768.field10604.method243((byte) -4, var18, (long) var15 << 16);
                    return var18;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class136 var12;
                try {
                    var12 = class351.method2130((byte) 45, var11);
                } catch (Exception var21) {
                    throw new RuntimeException(var21.getMessage() + " S: " + var9);
                }
                var12.field2264 = arg0;
                class768.field10604.method243((byte) -4, var12, (long) var9 << 16);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class136 var7;
            try {
                var7 = class351.method2130((byte) -66, var6);
            } catch (Exception var20) {
                throw new RuntimeException(var20.getMessage() + " S: " + var4);
            }
            var7.field2264 = arg0;
            class768.field10604.method243((byte) -4, var7, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V", line = 295)
    private final void method1509(byte arg0) {
        field3211++;
        if (!this.field3204) {
            return;
        }
        this.field3204 = false;
        byte[] var2 = this.field3213.field6750;
        int var3 = 0;
        int var4 = this.field3213.field6751;
        int var5 = this.field3213.field6751 * this.field3209 + this.field3206;
        if (arg0 >= -43) {
            this.field3209 = 106;
        }
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field3203 != null && this.field3207 == var3) {
            this.field3204 = false;
            return;
        }
        this.field3207 = var3;
        int var7 = this.field3206 + (this.field3209 * var4);
        int var8 = 0;
        if (!this.field3201.method69((byte) -68, class547.field7573, class629.field8918)) {
            if (class121.field2056 == null) {
                class121.field2056 = new int[16384];
            }
            int[] var13 = class121.field2056;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var7] == 0) {
                        int var16 = 0;
                        if (var2[var7 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var16++;
                        }
                        var13[var8++] = var16 * 17 << 24;
                    } else {
                        var13[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field3213.field6751 - 128;
            }
            if (this.field3203 == null) {
                this.field3203 = this.field3201.method944(128, 128, 21028, class121.field2056, false);
                this.field3203.method333(false, false, 7536);
            } else {
                this.field3203.method329(128, 0, class121.field2056, 128, 128, 0, 0, -27716);
            }
            return;
        }
        if (class40.field471 == null) {
            class40.field471 = new byte[16384];
        }
        byte[] var9 = class40.field471;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var7] == 0) {
                    int var12 = 0;
                    if (var2[var7 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var12++;
                    }
                    var9[var8++] = (byte) (var12 * 17);
                } else {
                    var9[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field3213.field6751 - 128;
        }
        if (this.field3203 == null) {
            this.field3203 = this.field3201.method990(class547.field7573, false, 128, class40.field471, 128, (byte) -96);
            this.field3203.method333(false, false, 7536);
        } else {
            this.field3203.method331(0, true, class547.field7573, 0, class40.field471, 128, 128, 0, 128);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Z", line = 468)
    public static final boolean method1510(int arg0, int arg1, int arg2) {
        if (arg0 <= 77) {
            return false;
        } else {
            field3212++;
            return (arg2 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V", line = 479)
    public final void method1511(boolean arg0) {
        this.method1507(this.field3200, this.field3205, 101);
        if (!arg0) {
            field3215++;
        }
    }
}
