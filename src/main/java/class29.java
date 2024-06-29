import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class class29 extends class27 {

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "S")
    public short field423;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "S")
    public short field421;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "Z")
    public boolean field415;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "B")
    public byte field416;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "S")
    public short field420;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "S")
    public short field419;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Lmt;")
    public static class680 field418 = new class680();

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([Lqea;B)I", line = 6)
    public final int method170(class392[] arg0, byte arg1) {
        ++field422;
        int var3 = 0;
        label118: for (int var4 = this.field423; ~var4 >= ~this.field420; ++var4) {
            label116: for (int var5 = this.field419; var5 <= this.field421; ++var5) {
                long var6 = class257.field3366[super.field385][var4][var5];
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
                        class628 var11 = class141.field1915[var10 - 1];
                        for (int var12 = 0; var12 < var3; ++var12) {
                            if (arg0[var12] == var11.field8687) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg0[var3++] = var11.field8687;
                        if (~var3 == -5) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        if (arg1 < 9) {
            return 0;
        } else {
            for (int var13 = var3; ~var13 > -5; ++var13) {
                arg0[var13] = null;
            }
            if (this.field416 != 0) {
                int var14 = -class501.field6888 + this.field423;
                int var15 = -class377.field4997 + this.field419;
                short var16;
                short var17;
                int var18;
                int var19;
                if (~this.field416 == -2) {
                    if (var15 <= var14) {
                        var16 = this.field423;
                        var17 = this.field419;
                        var18 = this.field419 + 1;
                        var19 = this.field423 + -1;
                    } else {
                        var17 = this.field419;
                        var19 = this.field423 + 1;
                        var16 = this.field423;
                        var18 = this.field419 + -1;
                    }
                } else if (~var15 >= ~(-var14)) {
                    var18 = this.field419 + 1;
                    var17 = this.field419;
                    var16 = this.field423;
                    var19 = this.field423 - -1;
                } else {
                    var19 = this.field423 + -1;
                    var17 = this.field419;
                    var18 = this.field419 - 1;
                    var16 = this.field423;
                }
                label82: for (int var20 = 0; var20 < var3; ++var20) {
                    long var21 = class257.field3366[super.field385][var16][var18];
                    while (~var21 != -1L) {
                        class628 var27 = class141.field1915[(int) ((var21 & 65535L) + -1L)];
                        var21 >>>= 16;
                        if (arg0[var20] == var27.field8687) {
                            continue label82;
                        }
                    }
                    long var23 = class257.field3366[super.field385][var19][var17];
                    while (~var23 != -1L) {
                        class628 var26 = class141.field1915[(int) ((var23 & 65535L) + -1L)];
                        var23 >>>= 16;
                        if (arg0[var20] == var26.field8687) {
                            continue label82;
                        }
                    }
                    for (int var25 = var20; ~var25 > ~(var3 + -1); ++var25) {
                        arg0[var25] = arg0[var25 - -1];
                    }
                    --var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)V", line = 176)
    public static final void method185(byte arg0, int arg1) {
        class10.field102 = arg1;
        class158.field2276 = 3;
        ++field424;
        class321.field4289 = 100;
        if (arg0 < 65) {
            field418 = null;
        }
        class619.field8600 = -1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)Z", line = 192)
    public final boolean method171(boolean arg0) {
        ++field417;
        if (arg0) {
            this.method171(true);
        }
        for (int var2 = this.field423; var2 <= this.field420; ++var2) {
            for (int var3 = this.field419; this.field421 >= var3; ++var3) {
                int var4 = -class501.field6888 + var2 + class312.field4204;
                if (var4 >= 0 && var4 < class165.field2371.length) {
                    int var5 = -class377.field4997 + class312.field4204 + var3;
                    if (~var5 <= -1 && ~class165.field2371.length < ~var5 && class165.field2371[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "(I)V", line = 234)
    public void method186(int arg0) {
        ++field425;
        if (arg0 != 13035) {
            this.method170((class392[]) null, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)Z", line = 248)
    public final boolean method164(int arg0) {
        int var2 = 124 / ((-42 - arg0) / 58);
        ++field414;
        return class671.method3813(super.field386, this.field421, 0, this.method176((byte) -126), this.field419, this.field420, this.field423);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V", line = 263)
    public static void method187(boolean arg0) {
        if (!arg0) {
            field418 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 276)
    public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field423 = (short) arg5;
        this.field421 = (short) arg8;
        super.field398 = arg2;
        super.field385 = (byte) arg0;
        this.field415 = arg9;
        super.field388 = arg3;
        this.field416 = arg10;
        super.field386 = (byte) arg1;
        this.field420 = (short) arg6;
        super.field397 = arg4;
        this.field419 = (short) arg7;
    }
}
