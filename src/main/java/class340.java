import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class class340 extends class361 {

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "S")
    public short field4390;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "S")
    public short field4395;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "B")
    public byte field4394;

    @OriginalMember(owner = "client!cs", name = "R", descriptor = "S")
    public short field4402;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "Z")
    public boolean field4385;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "S")
    public short field4387;

    @OriginalMember(owner = "client!cs", name = "O", descriptor = "I")
    public static int field4399 = -1;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "Lpea;")
    public static class722 field4391 = new class722(1);

    @OriginalMember(owner = "client!cs", name = "Q", descriptor = "[Lwc;")
    public static class66[] field4401 = new class66[14];

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!cs", name = "P", descriptor = "Ljava/awt/Image;")
    public static Image field4400;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)I", line = 4)
    public static final int method2022(int arg0, int arg1, int arg2) {
        ++field4397;
        if (~arg1 != -2 && ~arg1 != -4) {
            return arg0 < 122 ? 119 : class34.field368[arg2 & 3];
        } else {
            return class385.field5362[3 & arg2];
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIII[B[BII)V", line = 19)
    public static final void method2023(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, byte[] arg6, int arg7, int arg8) {
        ++field4389;
        if (arg1 != -1060076894) {
            method2022(78, -18, -86);
        }
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 3);
        for (int var11 = -arg8; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg0++;
                arg6[var10001] = (byte) (arg6[var10001] + -arg5[arg4++]);
                int var14 = arg0++;
                arg6[var14] = (byte) (arg6[var14] + -arg5[arg4++]);
                int var15 = arg0++;
                arg6[var15] = (byte) (arg6[var15] + -arg5[arg4++]);
                int var16 = arg0++;
                arg6[var16] = (byte) (arg6[var16] + -arg5[arg4++]);
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg0++;
                arg6[var10001] = (byte) (arg6[var10001] + -arg5[arg4++]);
            }
            arg0 += arg7;
            arg4 += arg2;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B[Lada;)I", line = 69)
    public final int method1150(byte arg0, class163[] arg1) {
        ++field4386;
        int var3 = 0;
        label118: for (int var4 = this.field4395; ~this.field4390 <= ~var4; ++var4) {
            label116: for (int var5 = this.field4387; ~var5 >= ~this.field4402; ++var5) {
                long var6 = class210.field2482[super.field4628][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (~var8 < -49L) {
                            continue label116;
                        }
                        int var10 = (int) (65535L & var6 >>> (int) var8);
                        if (var10 <= 0) {
                            continue label116;
                        }
                        class614 var11 = class745.field10409[var10 + -1];
                        for (int var12 = 0; ~var12 > ~var3; ++var12) {
                            if (arg1[var12] == var11.field8785) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg1[var3++] = var11.field8785;
                        if (~var3 == -5) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; ~var13 > -5; ++var13) {
            arg1[var13] = null;
        }
        if (~this.field4394 != -1) {
            int var14 = -class440.field6387 + this.field4395;
            int var15 = -class444.field6433 + this.field4387;
            int var16;
            short var17;
            short var18;
            int var19;
            if (~this.field4394 != -2) {
                if (~var15 >= ~(-var14)) {
                    var16 = this.field4395 + 1;
                    var17 = this.field4395;
                    var18 = this.field4387;
                    var19 = this.field4387 + 1;
                } else {
                    var19 = this.field4387 + -1;
                    var16 = this.field4395 + -1;
                    var17 = this.field4395;
                    var18 = this.field4387;
                }
            } else if (var15 > var14) {
                var19 = this.field4387 + -1;
                var16 = this.field4395 + 1;
                var17 = this.field4395;
                var18 = this.field4387;
            } else {
                var18 = this.field4387;
                var19 = this.field4387 + 1;
                var17 = this.field4395;
                var16 = this.field4395 - 1;
            }
            label82: for (int var20 = 0; ~var20 > ~var3; ++var20) {
                long var21 = class210.field2482[super.field4628][var17][var19];
                while (var21 != 0L) {
                    class614 var27 = class745.field10409[(int) ((var21 & 65535L) + -1L)];
                    var21 >>>= 16;
                    if (arg1[var20] == var27.field8785) {
                        continue label82;
                    }
                }
                long var23 = class210.field2482[super.field4628][var16][var18];
                while (var23 != 0L) {
                    class614 var26 = class745.field10409[(int) ((65535L & var23) + -1L)];
                    var23 >>>= 16;
                    if (arg1[var20] == var26.field8785) {
                        continue label82;
                    }
                }
                for (int var25 = var20; ~var25 > ~(var3 + -1); ++var25) {
                    arg1[var25] = arg1[var25 + 1];
                }
                --var3;
            }
        }
        if (arg0 > -44) {
            this.field4395 = -15;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)Z", line = 242)
    public final boolean method1154(int arg0) {
        ++field4396;
        for (int var2 = this.field4395; this.field4390 >= var2; ++var2) {
            for (int var3 = this.field4387; ~var3 >= ~this.field4402; ++var3) {
                int var4 = class626.field8992 + var2 - class440.field6387;
                if (var4 >= 0 && ~class233.field2770.length < ~var4) {
                    int var5 = -class444.field6433 + var3 + class626.field8992;
                    if (~var5 <= -1 && var5 < class233.field2770.length && class233.field2770[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        if (arg0 != -1) {
            this.field4395 = 94;
        }
        return false;
    }

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "(B)V", line = 288)
    public static void method2024(byte arg0) {
        field4400 = null;
        field4391 = null;
        field4401 = null;
        if (arg0 != 60) {
            field4401 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "(I)V", line = 301)
    public void method1069(int arg0) {
        if (arg0 >= 13) {
            ++field4388;
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)Z", line = 312)
    public final boolean method1152(int arg0) {
        ++field4398;
        if (arg0 != -4) {
            this.method1069(60);
        }
        return class461.method2809((byte) 86, this.field4395, super.field4633, this.field4402, this.field4387, this.method985(4), this.field4390);
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 335)
    public class340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field4390 = (short) arg6;
        this.field4395 = (short) arg5;
        super.field4635 = arg2;
        super.field4627 = arg3;
        this.field4394 = arg10;
        super.field4633 = (byte) arg1;
        super.field4628 = (byte) arg0;
        super.field4629 = arg4;
        this.field4402 = (short) arg8;
        this.field4385 = arg9;
        this.field4387 = (short) arg7;
    }
}
