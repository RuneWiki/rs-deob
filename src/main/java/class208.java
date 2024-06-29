import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class class208 extends class745 {

    @OriginalMember(owner = "client!km", name = "I", descriptor = "S")
    public short field3030;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "B")
    public byte field3034;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "S")
    public short field3027;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "S")
    public short field3035;

    @OriginalMember(owner = "client!km", name = "P", descriptor = "Z")
    public boolean field3037;

    @OriginalMember(owner = "client!km", name = "Q", descriptor = "S")
    public short field3038;

    @OriginalMember(owner = "client!km", name = "R", descriptor = "[Leg;")
    public static class406[] field3039 = null;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "F")
    public static float field3031 = 1024.0F;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!km", name = "O", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!km", name = "S", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "[Leba;")
    public static class284[] field3032;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(Z)V", line = 4)
    public static void method1443(boolean arg0) {
        if (arg0) {
            field3039 = null;
        }
        field3039 = null;
        field3032 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[Lmfa;)I", line = 19)
    public final int method1424(int arg0, class217[] arg1) {
        ++field3029;
        int var3 = 0;
        label118: for (int var4 = this.field3027; ~var4 >= ~this.field3030; ++var4) {
            label116: for (int var5 = this.field3035; var5 <= this.field3038; ++var5) {
                long var6 = class293.field4281[super.field10361][var4][var5];
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
                        class284 var11 = field3032[var10 + -1];
                        for (int var12 = 0; ~var3 < ~var12; ++var12) {
                            if (arg1[var12] == var11.field4161) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg1[var3++] = var11.field4161;
                        if (var3 == 4) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        if (arg0 != 4) {
            return -77;
        } else {
            for (int var13 = var3; ~var13 > -5; ++var13) {
                arg1[var13] = null;
            }
            if (this.field3034 != 0) {
                int var14 = -class277.field3995 + this.field3027;
                int var15 = this.field3035 - class3.field47;
                short var16;
                int var17;
                int var18;
                short var19;
                if (this.field3034 == 1) {
                    if (~var14 <= ~var15) {
                        var16 = this.field3035;
                        var17 = this.field3027 + -1;
                        var18 = this.field3035 + 1;
                        var19 = this.field3027;
                    } else {
                        var18 = this.field3035 - 1;
                        var17 = this.field3027 + 1;
                        var19 = this.field3027;
                        var16 = this.field3035;
                    }
                } else if (~(-var14) <= ~var15) {
                    var16 = this.field3035;
                    var17 = this.field3027 + 1;
                    var18 = this.field3035 + 1;
                    var19 = this.field3027;
                } else {
                    var16 = this.field3035;
                    var18 = this.field3035 + -1;
                    var19 = this.field3027;
                    var17 = this.field3027 + -1;
                }
                label82: for (int var20 = 0; var3 > var20; ++var20) {
                    long var21 = class293.field4281[super.field10361][var19][var18];
                    while (var21 != 0L) {
                        class284 var27 = field3032[(int) ((65535L & var21) + -1L)];
                        var21 >>>= 16;
                        if (arg1[var20] == var27.field4161) {
                            continue label82;
                        }
                    }
                    long var23 = class293.field4281[super.field10361][var17][var16];
                    while (~var23 != -1L) {
                        class284 var26 = field3032[(int) ((65535L & var23) + -1L)];
                        var23 >>>= 16;
                        if (arg1[var20] == var26.field4161) {
                            continue label82;
                        }
                    }
                    for (int var25 = var20; ~(var3 - 1) < ~var25; ++var25) {
                        arg1[var25] = arg1[var25 - -1];
                    }
                    --var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIB)Z", line = 188)
    public static final boolean method1444(int arg0, int arg1, byte arg2) {
        if (arg2 >= -5) {
            return true;
        } else {
            ++field3036;
            return (arg1 & 65536) != 0;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLha;)Z", line = 202)
    public final boolean method1428(byte arg0, class475 arg1) {
        if (arg0 > -88) {
            return true;
        } else {
            ++field3033;
            return class642.method3640(this.field3035, this.field3030, -101, super.field10349, this.method205((byte) 45, arg1), this.field3027, this.field3038);
        }
    }

    @OriginalMember(owner = "client!km", name = "i", descriptor = "(I)V", line = 213)
    public void method1445(int arg0) {
        ++field3028;
        if (arg0 != 245373737) {
            this.method1445(102);
        }
    }

    @OriginalMember(owner = "client!km", name = "g", descriptor = "(B)Z", line = 224)
    public final boolean method1429(byte arg0) {
        ++field3026;
        int var2 = this.field3027;
        if (arg0 <= 123) {
            this.method1424(-29, (class217[]) null);
        }
        while (var2 <= this.field3030) {
            for (int var3 = this.field3035; ~var3 >= ~this.field3038; ++var3) {
                int var4 = var2 - class277.field3995 + class162.field2499;
                if (~var4 <= -1 && class737.field10233.length > var4) {
                    int var5 = class162.field2499 + var3 + -class3.field47;
                    if (~var5 <= -1 && ~var5 > ~class737.field10233.length && class737.field10233[var4][var5]) {
                        return true;
                    }
                }
            }
            ++var2;
        }
        return false;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 269)
    public static final void method1446(String arg0, byte arg1) {
        if (arg1 != -40) {
            field3031 = 0.26693374F;
        }
        System.exit(1);
        ++field3040;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 282)
    public class208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        super.field10350 = arg4;
        this.field3030 = (short) arg6;
        super.field10358 = arg3;
        this.field3034 = arg10;
        super.field10347 = arg2;
        this.field3027 = (short) arg5;
        super.field10349 = (byte) arg1;
        super.field10361 = (byte) arg0;
        this.field3035 = (short) arg7;
        this.field3037 = arg9;
        this.field3038 = (short) arg8;
    }
}
