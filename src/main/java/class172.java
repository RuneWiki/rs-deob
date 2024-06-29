import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public abstract class class172 extends class488 {

    @OriginalMember(owner = "client!qda", name = "J", descriptor = "B")
    public byte field2255;

    @OriginalMember(owner = "client!qda", name = "w", descriptor = "Z")
    public boolean field2242;

    @OriginalMember(owner = "client!qda", name = "I", descriptor = "S")
    public short field2254;

    @OriginalMember(owner = "client!qda", name = "B", descriptor = "S")
    public short field2247;

    @OriginalMember(owner = "client!qda", name = "x", descriptor = "S")
    public short field2243;

    @OriginalMember(owner = "client!qda", name = "y", descriptor = "S")
    public short field2244;

    @OriginalMember(owner = "client!qda", name = "z", descriptor = "I")
    public static int field2245 = 0;

    @OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
    public static int field2252 = -1;

    @OriginalMember(owner = "client!qda", name = "A", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!qda", name = "C", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!qda", name = "D", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!qda", name = "E", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!qda", name = "F", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!qda", name = "H", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "(I)Z", line = 3)
    public final boolean method787(int arg0) {
        ++field2251;
        if (arg0 != 4095) {
            this.method1092(19);
        }
        for (int var2 = this.field2247; this.field2254 >= var2; ++var2) {
            for (int var3 = this.field2243; var3 <= this.field2244; ++var3) {
                int var4 = -class516.field7041 + var2 + class479.field6372;
                if (var4 >= 0 && ~var4 > ~class354.field4511.length) {
                    int var5 = class479.field6372 + var3 - class204.field2599;
                    if (~var5 <= -1 && var5 < class354.field4511.length && class354.field4511[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "(B)Z", line = 46)
    public final boolean method786(byte arg0) {
        if (arg0 < 111) {
            this.field2254 = 75;
        }
        ++field2246;
        return class77.method463((byte) 57, this.method71(-103), this.field2243, this.field2254, super.field6456, this.field2244, this.field2247);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "([Lgga;I)I", line = 60)
    public final int method785(class332[] arg0, int arg1) {
        ++field2253;
        int var3 = -66 % ((arg1 - -87) / 32);
        int var4 = 0;
        label114: for (int var5 = this.field2247; ~this.field2254 <= ~var5; ++var5) {
            label112: for (int var6 = this.field2243; ~var6 >= ~this.field2244; ++var6) {
                long var7 = class704.field9932[super.field6470][var5][var6];
                long var9 = 0L;
                while (true) {
                    label107: while (true) {
                        if (~var9 < -49L) {
                            continue label112;
                        }
                        int var11 = (int) (var7 >>> (int) var9 & 65535L);
                        if (var11 <= 0) {
                            continue label112;
                        }
                        class378 var12 = class352.field4498[var11 + -1];
                        for (int var13 = 0; var13 < var4; ++var13) {
                            if (arg0[var13] == var12.field4779) {
                                var9 += 16L;
                                continue label107;
                            }
                        }
                        arg0[var4++] = var12.field4779;
                        if (~var4 == -5) {
                            break label114;
                        }
                        var9 += 16L;
                    }
                }
            }
        }
        for (int var14 = var4; var14 < 4; ++var14) {
            arg0[var14] = null;
        }
        if (~this.field2255 != -1) {
            int var15 = -class516.field7041 + this.field2247;
            int var16 = -class204.field2599 + this.field2243;
            int var17;
            short var18;
            short var19;
            int var20;
            if (this.field2255 != 1) {
                if (var16 <= -var15) {
                    var17 = this.field2247 - -1;
                    var18 = this.field2243;
                    var19 = this.field2247;
                    var20 = this.field2243 + 1;
                } else {
                    var20 = this.field2243 + -1;
                    var17 = this.field2247 - 1;
                    var19 = this.field2247;
                    var18 = this.field2243;
                }
            } else if (var16 <= var15) {
                var18 = this.field2243;
                var17 = this.field2247 + -1;
                var19 = this.field2247;
                var20 = this.field2243 - -1;
            } else {
                var17 = this.field2247 - -1;
                var20 = this.field2243 + -1;
                var19 = this.field2247;
                var18 = this.field2243;
            }
            label78: for (int var21 = 0; var21 < var4; ++var21) {
                long var22 = class704.field9932[super.field6470][var19][var20];
                while (~var22 != -1L) {
                    class378 var28 = class352.field4498[(int) ((var22 & 65535L) - 1L)];
                    var22 >>>= 16;
                    if (arg0[var21] == var28.field4779) {
                        continue label78;
                    }
                }
                long var24 = class704.field9932[super.field6470][var17][var18];
                while (var24 != 0L) {
                    class378 var27 = class352.field4498[(int) ((65535L & var24) + -1L)];
                    var24 >>>= 16;
                    if (arg0[var21] == var27.field4779) {
                        continue label78;
                    }
                }
                for (int var26 = var21; var26 < var4 + -1; ++var26) {
                    arg0[var26] = arg0[var26 - -1];
                }
                --var4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "(I)V", line = 226)
    public void method1092(int arg0) {
        ++field2248;
        if (arg0 != 0) {
            this.method1092(30);
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 252)
    public class172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field2255 = arg10;
        this.field2242 = arg9;
        super.field6461 = arg2;
        this.field2254 = (short) arg6;
        super.field6470 = (byte) arg0;
        this.field2247 = (short) arg5;
        this.field2243 = (short) arg7;
        super.field6458 = arg3;
        super.field6456 = (byte) arg1;
        this.field2244 = (short) arg8;
        super.field6464 = arg4;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(BII)Z", line = 270)
    public static final boolean method1093(byte arg0, int arg1, int arg2) {
        ++field2250;
        if (arg0 != -110) {
            field2245 = -110;
        }
        if (~arg1 == -12) {
            arg1 = 10;
        }
        class441 var3 = class428.field5352.method3138((byte) 104, arg2);
        if (~arg1 <= -6 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method2364(78, arg1);
    }
}
