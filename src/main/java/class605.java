import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class605 {

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "Ldha;")
    private class83 field8450 = new class83();

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "Ldha;")
    private class83 field8460 = new class83();

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "Ldha;")
    private class83 field8465 = new class83();

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "Ldha;")
    private class83 field8467 = new class83();

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "Lso;")
    private class494 field8470 = new class494(4);

    @OriginalMember(owner = "client!gu", name = "A", descriptor = "B")
    private byte field8474 = 0;

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "I")
    public volatile int field8473 = 0;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
    public volatile int field8472 = 0;

    @OriginalMember(owner = "client!gu", name = "B", descriptor = "Lso;")
    private class494 field8475 = new class494(8);

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "Lip;")
    public static class735 field8453 = new class735();

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field8449;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
    private int field8468;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "J")
    public static long field8463;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "J")
    public static long field8466;

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "J")
    private long field8471;

    @OriginalMember(owner = "client!gu", name = "C", descriptor = "Lkka;")
    private class327 field8476;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "Lsv;")
    private class686 field8469;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
    public final void method3503(int arg0) {
        if (arg0 < 81) {
            this.field8476 = null;
        }
        field8452++;
        if (this.field8469 != null) {
            this.field8469.method3871((byte) 101);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIBZ)Lkka;")
    public final class327 method3504(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field8456++;
        long var6 = (long) ((arg1 << 16) + arg2);
        if (arg0 > -126) {
            this.field8469 = null;
        }
        class327 var8 = new class327();
        var8.field4565 = arg3;
        var8.field1597 = var6;
        var8.field928 = arg4;
        if (arg4) {
            if (this.method3509(27) >= 20) {
                throw new RuntimeException();
            }
            this.field8450.method626((byte) -111, var8);
        } else if (this.method3506((byte) 123) < 20) {
            this.field8465.method626((byte) -119, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
    public static void method3505(byte arg0) {
        int var1 = 79 % ((-arg0 - 75) / 42);
        field8453 = null;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)I")
    private final int method3506(byte arg0) {
        field8448++;
        if (arg0 <= 113) {
            this.field8468 = 46;
        }
        return this.field8465.method632(92) + this.field8467.method632(53);
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)V")
    public final void method3507(byte arg0) {
        if (this.field8469 != null) {
            this.field8469.method3866(26931);
        }
        field8449++;
        if (arg0 != 107) {
            this.field8460 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
    public final void method3508(boolean arg0) {
        field8455++;
        if (this.field8469 == null || arg0) {
            return;
        }
        try {
            this.field8470.field7042 = 0;
            this.field8470.method2952(0, 7);
            this.field8470.method2995(13, 0);
            this.field8469.method3875(0, 90, this.field8470.field7050, 4);
        } catch (IOException var3) {
            try {
                this.field8469.method3871((byte) 110);
            } catch (Exception var2) {
            }
            this.field8469 = null;
            this.field8472 = -2;
            this.field8473++;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I")
    public final int method3509(int arg0) {
        int var2 = 47 % ((arg0 + 40) / 57);
        field8454++;
        return this.field8450.method632(51) + this.field8460.method632(82);
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
    private final void method3510(int arg0) {
        field8457++;
        if (this.field8469 == null) {
            return;
        }
        try {
            this.field8470.field7042 = 0;
            this.field8470.method2952(0, arg0);
            this.field8470.method2995(-107, 3);
            this.field8469.method3875(0, -68, this.field8470.field7050, 4);
        } catch (IOException var3) {
            try {
                this.field8469.method3871((byte) 107);
            } catch (Exception var2) {
            }
            this.field8469 = null;
            this.field8472 = -2;
            this.field8473++;
        }
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)Z")
    public final boolean method3511(int arg0) {
        if (this.field8469 != null) {
            long var2 = class459.method2731(100);
            int var4 = (int) (var2 - this.field8471);
            this.field8471 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field8468 += var4;
            if (this.field8468 > 30000) {
                try {
                    this.field8469.method3871((byte) 117);
                } catch (Exception var27) {
                }
                this.field8469 = null;
            }
        }
        field8462++;
        if (this.field8469 == null) {
            return this.method3509(-99) == 0 && this.method3506((byte) 119) == 0;
        }
        try {
            this.field8469.method3865((byte) 121);
            class327 var5 = (class327) this.field8450.method636(256);
            if (arg0 <= 117) {
                this.field8470 = null;
            }
            while (var5 != null) {
                this.field8470.field7042 = 0;
                this.field8470.method2952(0, 1);
                this.field8470.method2995(27, (int) var5.field1597);
                this.field8469.method3875(0, 103, this.field8470.field7050, 4);
                this.field8460.method626((byte) 126, var5);
                var5 = (class327) this.field8450.method637(false);
            }
            for (class327 var6 = (class327) this.field8465.method636(256); var6 != null; var6 = (class327) this.field8465.method637(false)) {
                this.field8470.field7042 = 0;
                this.field8470.method2952(0, 0);
                this.field8470.method2995(86, (int) var6.field1597);
                this.field8469.method3875(0, 122, this.field8470.field7050, 4);
                this.field8467.method626((byte) 89, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field8469.method3868((byte) 47);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field8468 = 0;
                byte var9 = 0;
                if (this.field8476 == null) {
                    var9 = 8;
                } else if (this.field8476.field4564 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field8475.field7042;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field8469.method3872(this.field8475.field7042, true, var10, this.field8475.field7050);
                    if (this.field8474 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field8475.field7050[this.field8475.field7042 + var11] = (byte) class587.method3425(this.field8475.field7050[this.field8475.field7042 + var11], this.field8474);
                        }
                    }
                    this.field8475.field7042 += var10;
                    if (this.field8475.field7042 >= var9) {
                        if (this.field8476 == null) {
                            this.field8475.field7042 = 0;
                            int var12 = this.field8475.method2964((byte) 42);
                            int var13 = this.field8475.method2998(true);
                            int var14 = this.field8475.method2964((byte) 65);
                            int var15 = this.field8475.method2976(-127);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class327 var21;
                            if (var17) {
                                for (var21 = (class327) this.field8467.method636(256); var21 != null && var21.field1597 != var18; var21 = (class327) this.field8467.method637(false)) {
                                }
                            } else {
                                for (var21 = (class327) this.field8460.method636(256); var21 != null && var21.field1597 != var18; var21 = (class327) this.field8460.method637(false)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field8476 = var21;
                            this.field8476.field4567 = new class494(var15 + var22 + this.field8476.field4565);
                            this.field8476.field4567.method2952(0, var16);
                            this.field8476.field4567.method2959(var15, (byte) -118);
                            this.field8476.field4564 = 8;
                            this.field8475.field7042 = 0;
                        } else if (this.field8476.field4564 != 0) {
                            throw new IOException();
                        } else if (this.field8475.field7050[0] == -1) {
                            this.field8475.field7042 = 0;
                            this.field8476.field4564 = 1;
                        } else {
                            this.field8476 = null;
                        }
                    }
                } else {
                    int var23 = this.field8476.field4567.field7050.length - this.field8476.field4565;
                    int var24 = 512 - this.field8476.field4564;
                    if ((var23 - this.field8476.field4567.field7042) < var24) {
                        var24 = var23 - this.field8476.field4567.field7042;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field8469.method3872(this.field8476.field4567.field7042, true, var24, this.field8476.field4567.field7050);
                    if (this.field8474 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field8476.field4567.field7050[this.field8476.field4567.field7042 + var25] = (byte) class587.method3425(this.field8476.field4567.field7050[this.field8476.field4567.field7042 + var25], this.field8474);
                        }
                    }
                    this.field8476.field4567.field7042 += var24;
                    this.field8476.field4564 += var24;
                    if (this.field8476.field4567.field7042 == var23) {
                        this.field8476.method827(3);
                        this.field8476.field930 = false;
                        this.field8476 = null;
                    } else if (this.field8476.field4564 == 512) {
                        this.field8476.field4564 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field8469.method3871((byte) 115);
            } catch (Exception var26) {
            }
            this.field8469 = null;
            this.field8472 = -2;
            this.field8473++;
            return this.method3509(94) == 0 && this.method3506((byte) 125) == 0;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZLsv;)V")
    public final void method3512(int arg0, boolean arg1, class686 arg2) {
        field8459++;
        if (this.field8469 != null) {
            try {
                this.field8469.method3871((byte) 100);
            } catch (Exception var8) {
            }
            this.field8469 = null;
        }
        if (arg0 != -2) {
            this.field8474 = -34;
        }
        this.field8469 = arg2;
        this.method3510(6);
        this.method3514(arg1, 119);
        this.field8476 = null;
        this.field8475.field7042 = 0;
        while (true) {
            class327 var4 = (class327) this.field8460.method633(18801);
            if (var4 == null) {
                while (true) {
                    class327 var5 = (class327) this.field8467.method633(arg0 + 18803);
                    if (var5 == null) {
                        if (this.field8474 != 0) {
                            try {
                                this.field8470.field7042 = 0;
                                this.field8470.method2952(0, 4);
                                this.field8470.method2952(0, this.field8474);
                                this.field8470.method2957(0, 1267307848);
                                this.field8469.method3875(0, arg0 - 109, this.field8470.field7050, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field8469.method3871((byte) 98);
                                } catch (Exception var6) {
                                }
                                this.field8472 = -2;
                                this.field8473++;
                                this.field8469 = null;
                            }
                        }
                        this.field8468 = 0;
                        this.field8471 = class459.method2731(97);
                        return;
                    }
                    this.field8465.method626((byte) 104, var5);
                }
            }
            this.field8450.method626((byte) -128, var4);
        }
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)Z")
    public final boolean method3513(int arg0) {
        if (arg0 > -30) {
            this.method3512(-68, true, null);
        }
        field8461++;
        return this.method3506((byte) 121) >= 20;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)V")
    public final void method3514(boolean arg0, int arg1) {
        field8458++;
        if (this.field8469 == null) {
            return;
        }
        try {
            this.field8470.field7042 = 0;
            if (arg1 < 94) {
                this.method3509(69);
            }
            this.field8470.method2952(0, arg0 ? 2 : 3);
            this.field8470.method2995(70, 0);
            this.field8469.method3875(0, 81, this.field8470.field7050, 4);
        } catch (IOException var4) {
            try {
                this.field8469.method3871((byte) 99);
            } catch (Exception var3) {
            }
            this.field8473++;
            this.field8472 = -2;
            this.field8469 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)Z")
    public final boolean method3515(byte arg0) {
        field8451++;
        int var2 = 94 % ((-arg0 - 47) / 61);
        return this.method3509(18) >= 20;
    }

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)V")
    public final void method3516(int arg0) {
        try {
            this.field8469.method3871((byte) 118);
        } catch (Exception var2) {
        }
        field8464++;
        if (arg0 < -24) {
            this.field8474 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
            this.field8472 = -1;
            this.field8469 = null;
            this.field8473++;
        }
    }
}
