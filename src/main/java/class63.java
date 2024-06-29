import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class63 extends class292 {

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "F")
    private float field1427 = 0.0F;

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "Lj;")
    private class504 field1425;

    @OriginalMember(owner = "client!pv", name = "B", descriptor = "I")
    public static int field1431 = 0;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BILhw;)V")
    public final void method603(byte arg0, int arg1, class116 arg2) {
        ++field1421;
        if (arg0 <= 28) {
            this.method603((byte) 127, -106, (class116) null);
        }
        super.field4393.method3266(-2, arg2);
    }

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        ++field1423;
        if (arg0 != 24561) {
            this.method599(true, (byte) -87);
        }
        return this.field1425.method2996(true);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZB)V")
    public final void method602(boolean arg0, byte arg1) {
        if (arg1 != 54) {
            this.field1427 = 0.42570913F;
        }
        ++field1420;
        super.field4393.method3232(class509.field7205, class525.field7399, (byte) -101);
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lcf;Lj;)V")
    public class63(class562 arg0, class504 arg1) {
        super(arg0);
        this.field1425 = arg1;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIILjava/lang/Class;)Lvr;")
    public static final class122 method756(int arg0, int arg1, int arg2, Class arg3) {
        class370 var4 = class257.field3792[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class636 var5 = var4.field5497; var5 != null; var5 = var5.field9171) {
                class122 var6 = var5.field9172;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field2220 == arg1 && var6.field2230 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        ++field1429;
        if (arg0 >= 27) {
            super.field4393.method3223(15, 1);
            super.field4393.method3232(class509.field7205, class509.field7205, (byte) -116);
            super.field4393.method3231(0, class435.field6296, (byte) -107);
            super.field4393.method3224(0, (byte) -80, class435.field6296);
            super.field4393.method2886((byte) -97, 1);
            super.field4393.method3266(-2, (class116) null);
            super.field4393.method3223(15, 0);
            super.field4393.method3224(0, (byte) -80, class435.field6296);
        }
    }

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "(I)I")
    public static final int method757(int arg0) {
        ++field1424;
        if ((double) class407.field5876 == 3.0D) {
            return 37;
        } else if ((double) class407.field5876 == 4.0D) {
            return 50;
        } else if ((double) class407.field5876 == 6.0D) {
            return 75;
        } else {
            if (arg0 > -97) {
                field1431 = 124;
            }
            return (double) class407.field5876 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(ZB)V")
    public final void method599(boolean arg0, byte arg1) {
        ++field1426;
        super.field4393.method3223(15, 1);
        super.field4393.method3232(class121.field2184, class525.field7399, (byte) -92);
        super.field4393.method2845(class435.field6296, 89, true, false, 0);
        super.field4393.method3224(0, (byte) -80, class661.field9521);
        if (arg1 == -116) {
            super.field4393.method2886((byte) -99, 0);
            super.field4393.method3223(15, 0);
            super.field4393.method3242((byte) -73, -16777216);
            super.field4393.method3224(0, (byte) -80, class370.field5487);
            this.method759(-1);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIII)V")
    public static final void method758(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1422;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        if (arg0 == 1) {
            int var9 = class107.method968(class379.field5612, arg0 + 111, class704.field9911, arg1 + arg3);
            int var10 = class107.method968(class379.field5612, 126, class704.field9911, -arg1 + arg3);
            class705.method3938(var9, arg2, 30336, var10, class582.field8429[arg4]);
            while (var6 > var5) {
                var8 += 2;
                var7 += var8;
                if (var7 > 0) {
                    --var6;
                    var7 -= var6 << 1;
                    int var11 = arg4 - var6;
                    int var12 = arg4 + var6;
                    if (var12 >= class309.field4556 && ~var11 >= ~client.field4115) {
                        int var13 = class107.method968(class379.field5612, 127, class704.field9911, arg3 + var5);
                        int var14 = class107.method968(class379.field5612, arg0 ^ 125, class704.field9911, -var5 + arg3);
                        if (~client.field4115 <= ~var12) {
                            class705.method3938(var13, arg2, 30336, var14, class582.field8429[var12]);
                        }
                        if (class309.field4556 <= var11) {
                            class705.method3938(var13, arg2, 30336, var14, class582.field8429[var11]);
                        }
                    }
                }
                ++var5;
                int var15 = -var5 + arg4;
                int var16 = arg4 + var5;
                if (class309.field4556 <= var16 && var15 <= client.field4115) {
                    int var17 = class107.method968(class379.field5612, 108, class704.field9911, arg3 + var6);
                    int var18 = class107.method968(class379.field5612, 109, class704.field9911, -var6 + arg3);
                    if (~var16 >= ~client.field4115) {
                        class705.method3938(var17, arg2, 30336, var18, class582.field8429[var16]);
                    }
                    if (class309.field4556 <= var15) {
                        class705.method3938(var17, arg2, arg0 + 30335, var18, class582.field8429[var15]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        ++field1430;
        super.field4393.method3223(15, 1);
        if ((arg0 & 128) != 0) {
            super.field4393.method3266(-2, (class116) null);
        } else if (~(arg2 & 1) != -2) {
            if (this.field1425.field7154) {
                super.field4393.method3266(-2, this.field1425.field7155);
            } else {
                super.field4393.method3266(-2, this.field1425.field7152[0]);
            }
        } else if (!this.field1425.field7154) {
            int var4 = super.field4393.field8123 % 4000 * 16 / 4000;
            super.field4393.method3266(-2, this.field1425.field7152[var4]);
        } else {
            this.field1427 = (float) (super.field4393.field8123 % 4000) / 4000.0F;
            super.field4393.method3266(-2, this.field1425.field7155);
        }
        super.field4393.method3223(15, 0);
        int var5 = -45 / ((arg1 - -45) / 59);
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V")
    public final void method759(int arg0) {
        if (super.field4393.method3192((byte) 78) == 0) {
            class391 var2 = super.field4393.method3263((byte) -106);
            super.field4393.method3223(15, 1);
            class391 var3 = super.field4393.method3240(true);
            var3.method896(var2);
            var3.method2406(0.125F, 1.0F, 0.125F, false);
            var3.method2413(-123, 0.0F, this.field1427, 0.0F);
            super.field4393.method3265((byte) -88, class634.field9110);
            super.field4393.method3223(15, 0);
        }
        ++field1428;
        if (arg0 != -1) {
            field1431 = 23;
        }
    }
}
