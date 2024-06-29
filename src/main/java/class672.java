import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public abstract class class672 extends class421 {

    @OriginalMember(owner = "client!it", name = "F", descriptor = "S")
    public short field9364;

    @OriginalMember(owner = "client!it", name = "J", descriptor = "S")
    public short field9368;

    @OriginalMember(owner = "client!it", name = "M", descriptor = "S")
    public short field9371;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "S")
    public short field9360;

    @OriginalMember(owner = "client!it", name = "L", descriptor = "B")
    public byte field9370;

    @OriginalMember(owner = "client!it", name = "A", descriptor = "Z")
    public boolean field9359;

    @OriginalMember(owner = "client!it", name = "G", descriptor = "Z")
    public static boolean field9365 = false;

    @OriginalMember(owner = "client!it", name = "C", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!it", name = "D", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!it", name = "E", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!it", name = "H", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!it", name = "I", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!it", name = "N", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!it", name = "K", descriptor = "[I")
    public static int[] field9369;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(ILha;)Z")
    public final boolean method2456(int arg0, class65 arg1) {
        if (arg0 <= 92) {
            this.method913(7);
        }
        ++field9372;
        return class423.method2565((byte) 89, this.field9368, this.method901(arg1, 125), this.field9371, this.field9364, super.field5749, this.field9360);
    }

    @OriginalMember(owner = "client!it", name = "h", descriptor = "(B)V")
    public static void method3823(byte arg0) {
        field9369 = null;
        int var1 = 64 / ((arg0 - -8) / 39);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I[Lqm;)I")
    public final int method2458(int arg0, class154[] arg1) {
        ++field9366;
        int var3 = 0;
        label118: for (int var4 = this.field9368; ~this.field9371 <= ~var4; ++var4) {
            label116: for (int var5 = this.field9364; this.field9360 >= var5; ++var5) {
                long var6 = class143.field2105[super.field5755][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (var8 > 48L) {
                            continue label116;
                        }
                        int var10 = (int) (var6 >>> (int) var8 & 65535L);
                        if (var10 <= 0) {
                            continue label116;
                        }
                        class456 var11 = class603.field8444[var10 + -1];
                        for (int var12 = 0; var3 > var12; ++var12) {
                            if (arg1[var12] == var11.field6391) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg1[var3++] = var11.field6391;
                        if (var3 == 4) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; var13 < 4; ++var13) {
            arg1[var13] = null;
        }
        if (~this.field9370 != -1) {
            int var14 = this.field9368 - class276.field4007;
            int var15 = -class296.field4301 + this.field9364;
            int var16;
            int var17;
            short var18;
            short var19;
            if (this.field9370 == 1) {
                if (~var15 >= ~var14) {
                    var16 = this.field9368 - 1;
                    var17 = this.field9364 + 1;
                    var18 = this.field9364;
                    var19 = this.field9368;
                } else {
                    var17 = this.field9364 + -1;
                    var18 = this.field9364;
                    var16 = this.field9368 + 1;
                    var19 = this.field9368;
                }
            } else if (~(-var14) > ~var15) {
                var18 = this.field9364;
                var16 = this.field9368 + -1;
                var19 = this.field9368;
                var17 = this.field9364 - 1;
            } else {
                var19 = this.field9368;
                var17 = this.field9364 + 1;
                var18 = this.field9364;
                var16 = this.field9368 + 1;
            }
            label82: for (int var20 = 0; var20 < var3; ++var20) {
                long var21 = class143.field2105[super.field5755][var19][var17];
                while (~var21 != -1L) {
                    class456 var27 = class603.field8444[(int) ((65535L & var21) + -1L)];
                    var21 >>>= 16;
                    if (arg1[var20] == var27.field6391) {
                        continue label82;
                    }
                }
                long var23 = class143.field2105[super.field5755][var16][var18];
                while (var23 != 0L) {
                    class456 var26 = class603.field8444[(int) ((var23 & 65535L) - 1L)];
                    var23 >>>= 16;
                    if (arg1[var20] == var26.field6391) {
                        continue label82;
                    }
                }
                for (int var25 = var20; ~(var3 - 1) < ~var25; ++var25) {
                    arg1[var25] = arg1[var25 + 1];
                }
                --var3;
            }
        }
        if (arg0 != 48) {
            method3823((byte) -76);
        }
        return var3;
    }

    @OriginalMember(owner = "client!it", name = "g", descriptor = "(B)Z")
    public final boolean method2457(byte arg0) {
        ++field9362;
        if (arg0 <= 117) {
            return false;
        } else {
            for (int var2 = this.field9368; this.field9371 >= var2; ++var2) {
                for (int var3 = this.field9364; var3 <= this.field9360; ++var3) {
                    int var4 = class259.field3820 + var2 + -class276.field4007;
                    if (var4 >= 0 && var4 < class735.field10157.length) {
                        int var5 = -class296.field4301 + class259.field3820 + var3;
                        if (var5 >= 0 && ~class735.field10157.length < ~var5 && class735.field10157[var4][var5]) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!it", name = "j", descriptor = "(I)V")
    public void method913(int arg0) {
        if (arg0 != -13764) {
            field9369 = null;
        }
        ++field9361;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        super.field5755 = (byte) arg0;
        this.field9364 = (short) arg7;
        this.field9368 = (short) arg5;
        super.field5741 = arg3;
        this.field9371 = (short) arg6;
        this.field9360 = (short) arg8;
        this.field9370 = arg10;
        this.field9359 = arg9;
        super.field5749 = (byte) arg1;
        super.field5746 = arg4;
        super.field5742 = arg2;
    }
}
