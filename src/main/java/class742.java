import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class742 extends class585 {

    @OriginalMember(owner = "client!fka", name = "E", descriptor = "I")
    private int field10283 = 20;

    @OriginalMember(owner = "client!fka", name = "J", descriptor = "I")
    private int field10288 = 0;

    @OriginalMember(owner = "client!fka", name = "M", descriptor = "I")
    private int field10291 = 0;

    @OriginalMember(owner = "client!fka", name = "L", descriptor = "I")
    private int field10290 = 1365;

    @OriginalMember(owner = "client!fka", name = "F", descriptor = "Lbu;")
    public static class21 field10284 = new class21(9, 3);

    @OriginalMember(owner = "client!fka", name = "N", descriptor = "[I")
    public static int[] field10292 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!fka", name = "O", descriptor = "Lbg;")
    public static class488 field10293 = null;

    @OriginalMember(owner = "client!fka", name = "G", descriptor = "I")
    public static int field10285;

    @OriginalMember(owner = "client!fka", name = "H", descriptor = "I")
    public static int field10286;

    @OriginalMember(owner = "client!fka", name = "I", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!fka", name = "K", descriptor = "I")
    public static int field10289;

    @OriginalMember(owner = "client!fka", name = "<init>", descriptor = "()V")
    public class742() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fka", name = "c", descriptor = "(I)V")
    public static void method4130(int arg0) {
        field10292 = null;
        field10284 = null;
        if (arg0 != 5971) {
            field10284 = null;
        }
    }

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field10286;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 < 123) {
            this.method54((class494) null, 4, -112);
        }
        if (super.field8255.field3677) {
            for (int var4 = 0; ~class293.field4278 < ~var4; ++var4) {
                int var5 = (class581.field8200[var4] << 12) / this.field10290 + this.field10291;
                int var6 = (class633.field8892[arg0] << 12) / this.field10290 + this.field10288;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && ~var13 > ~this.field10283) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var7 + var11;
                    var12 = var10 * var10 >> 12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~var13 <= ~(this.field10283 - 1) ? 0 : (var13 << 12) / this.field10283;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(BLtd;ILso;)V")
    public static final void method4131(byte arg0, class477 arg1, int arg2, class494 arg3) {
        ++field10285;
        class304 var4 = new class304();
        var4.field4381 = arg3.method2964((byte) 87);
        var4.field4379 = arg3.method2976(-128);
        if (arg0 <= 106) {
            field10293 = null;
        }
        var4.field4385 = new class141[var4.field4381];
        var4.field4384 = new int[var4.field4381];
        var4.field4383 = new int[var4.field4381];
        var4.field4377 = new class141[var4.field4381];
        var4.field4382 = new byte[var4.field4381][][];
        var4.field4380 = new int[var4.field4381];
        for (int var5 = 0; var4.field4381 > var5; ++var5) {
            try {
                int var6 = arg3.method2964((byte) 115);
                if (~var6 != -1 && ~var6 != -2 && var6 != 2) {
                    if (~var6 == -4 || var6 == 4) {
                        String var7 = arg3.method2996(119);
                        String var8 = arg3.method2996(127);
                        int var9 = arg3.method2964((byte) 120);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; var11 < var9; ++var11) {
                            var10[var11] = arg3.method2996(126);
                        }
                        byte[][] var12 = new byte[var9][];
                        if (var6 == 3) {
                            for (int var13 = 0; var13 < var9; ++var13) {
                                int var14 = arg3.method2976(-124);
                                var12[var13] = new byte[var14];
                                arg3.method2958(true, var12[var13], 0, var14);
                            }
                        }
                        var4.field4384[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; ~var16 > ~var9; ++var16) {
                            var15[var16] = class321.method2069(var10[var16], (byte) 121);
                        }
                        var4.field4385[var5] = arg1.method2848(var15, 1, class321.method2069(var7, (byte) 121), var8);
                        var4.field4382[var5] = var12;
                    }
                } else {
                    String var17 = arg3.method2996(118);
                    String var18 = arg3.method2996(118);
                    int var19 = 0;
                    if (~var6 == -2) {
                        var19 = arg3.method2976(-127);
                    }
                    var4.field4384[var5] = var6;
                    var4.field4383[var5] = var19;
                    var4.field4377[var5] = arg1.method2841(var18, class321.method2069(var17, (byte) 121), (byte) -79);
                }
            } catch (ClassNotFoundException var20) {
                var4.field4380[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4380[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4380[var5] = -3;
            } catch (Exception var23) {
                var4.field4380[var5] = -4;
            } catch (Throwable var24) {
                var4.field4380[var5] = -5;
            }
        }
        class791.field10851.method1727(var4, (byte) 81);
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field10289;
        if (arg1 != 1) {
            this.method55(-62, -6);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field10288 = arg0.method2998(true);
                    }
                } else {
                    this.field10291 = arg0.method2998(true);
                }
            } else {
                this.field10283 = arg0.method2998(true);
            }
        } else {
            this.field10290 = arg0.method2998(true);
        }
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(IIIIIIBLjava/lang/String;)V")
    public static final void method4132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, String arg7) {
        ++field10287;
        class544 var8 = new class544();
        var8.field7816 = arg5;
        var8.field7822 = arg7;
        var8.field7818 = arg3;
        var8.field7819 = arg1;
        var8.field7815 = arg4;
        if (arg6 == 32) {
            var8.field7820 = arg2;
            var8.field7821 = class192.field2961 + arg0;
            class610.field8580.method2173(arg6 ^ -89, var8);
        }
    }
}
