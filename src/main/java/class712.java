import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class class712 extends class61 {

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "B")
    public byte field9995;

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "Z")
    public boolean field9992;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "S")
    public short field9990;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "S")
    public short field9991;

    @OriginalMember(owner = "client!ar", name = "P", descriptor = "S")
    public short field9997;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "S")
    public short field9994;

    @OriginalMember(owner = "client!ar", name = "O", descriptor = "[I")
    public static int[] field9996 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "I")
    public static int field9988;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    public static int field9989;

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "I")
    public static int field9993;

    @OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
    public static int field9998;

    @OriginalMember(owner = "client!ar", name = "R", descriptor = "I")
    public static int field9999;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B[Lkp;)I")
    public final int method528(byte arg0, class515[] arg1) {
        ++field9993;
        int var3 = 0;
        label118: for (int var4 = this.field9994; ~var4 >= ~this.field9991; ++var4) {
            label116: for (int var5 = this.field9997; var5 <= this.field9990; ++var5) {
                long var6 = class425.field5640[super.field808][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (~var8 < -49L) {
                            continue label116;
                        }
                        int var10 = (int) (var6 >>> (int) var8 & 65535L);
                        if (var10 <= 0) {
                            continue label116;
                        }
                        class110 var11 = class331.field4094[var10 + -1];
                        for (int var12 = 0; ~var3 < ~var12; ++var12) {
                            if (arg1[var12] == var11.field1374) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg1[var3++] = var11.field1374;
                        if (~var3 == -5) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        if (arg0 != -48) {
            return 119;
        } else {
            for (int var13 = var3; ~var13 > -5; ++var13) {
                arg1[var13] = null;
            }
            if (~this.field9995 != -1) {
                int var14 = this.field9994 - class463.field6493;
                int var15 = -class619.field8331 + this.field9997;
                int var16;
                int var17;
                short var18;
                short var19;
                if (this.field9995 != 1) {
                    if (-var14 < var15) {
                        var16 = this.field9997 - 1;
                        var17 = this.field9994 + -1;
                        var18 = this.field9997;
                        var19 = this.field9994;
                    } else {
                        var18 = this.field9997;
                        var16 = this.field9997 + 1;
                        var17 = this.field9994 - -1;
                        var19 = this.field9994;
                    }
                } else if (~var15 < ~var14) {
                    var19 = this.field9994;
                    var18 = this.field9997;
                    var16 = this.field9997 + -1;
                    var17 = this.field9994 + 1;
                } else {
                    var18 = this.field9997;
                    var17 = this.field9994 + -1;
                    var19 = this.field9994;
                    var16 = this.field9997 + 1;
                }
                label82: for (int var20 = 0; var3 > var20; ++var20) {
                    long var21 = class425.field5640[super.field808][var19][var16];
                    while (~var21 != -1L) {
                        class110 var27 = class331.field4094[(int) ((var21 & 65535L) + -1L)];
                        var21 >>>= 16;
                        if (arg1[var20] == var27.field1374) {
                            continue label82;
                        }
                    }
                    long var23 = class425.field5640[super.field808][var17][var18];
                    while (var23 != 0L) {
                        class110 var26 = class331.field4094[(int) ((var23 & 65535L) - 1L)];
                        var23 >>>= 16;
                        if (arg1[var20] == var26.field1374) {
                            continue label82;
                        }
                    }
                    for (int var25 = var20; ~var25 > ~(var3 + -1); ++var25) {
                        arg1[var25] = arg1[var25 + 1];
                    }
                    --var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)Z")
    public final boolean method529(int arg0) {
        ++field9988;
        if (arg0 != -31509) {
            method4035(28);
        }
        for (int var2 = this.field9994; ~var2 >= ~this.field9991; ++var2) {
            for (int var3 = this.field9997; ~var3 >= ~this.field9990; ++var3) {
                int var4 = class573.field7852 + var2 + -class463.field6493;
                if (~var4 <= -1 && ~class308.field3820.length < ~var4) {
                    int var5 = var3 - class619.field8331 + class573.field7852;
                    if (~var5 <= -1 && class308.field3820.length > var5 && class308.field3820[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(B)V")
    public void method671(byte arg0) {
        if (arg0 <= 122) {
            this.field9991 = -18;
        }
        ++field9989;
    }

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(B)V")
    public static void method4034(byte arg0) {
        int var1 = -127 % ((arg0 - 69) / 46);
        field9996 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lha;B)Z")
    public final boolean method523(class66 arg0, byte arg1) {
        ++field9998;
        int var3 = 48 % ((18 - arg1) / 55);
        return class416.method2489(this.field9994, this.field9991, super.field811, this.field9990, -23152, this.method507(false, arg0), this.field9997);
    }

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)V")
    public static final void method4035(int arg0) {
        ++field9999;
        int var1 = 0;
        for (int var2 = 0; ~class596.field8090 < ~var2; ++var2) {
            for (int var4 = 0; class107.field1350 > var4; ++var4) {
                if (class103.method853(11806, true, var4, var2, class107.field1351, var1)) {
                    ++var1;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        int var3 = 47 / ((arg0 - 76) / 48);
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        super.field808 = (byte) arg0;
        this.field9995 = arg10;
        this.field9992 = arg9;
        this.field9990 = (short) arg8;
        this.field9991 = (short) arg6;
        this.field9997 = (short) arg7;
        super.field809 = arg3;
        super.field811 = (byte) arg1;
        this.field9994 = (short) arg5;
        super.field813 = arg4;
        super.field823 = arg2;
    }
}
