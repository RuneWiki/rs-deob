import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class20 extends class51 {

    @OriginalMember(owner = "client!bi", name = "ib", descriptor = "I")
    private int field347 = 0;

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
    private int field344 = 4096;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "I")
    public static int field343 = 0;

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "Led;")
    public static class43 field342 = class191.method1219("mapfunction", false);

    @OriginalMember(owner = "client!bi", name = "hb", descriptor = "[I")
    public static int[] field346 = new int[50];

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!bi", name = "kb", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!bi", name = "lb", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!bi", name = "mb", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!bi", name = "nb", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "Lga;")
    public static class58 field339;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IB)Lba;")
    public static final class12 method97(int arg0, byte arg1) {
        class12 var2 = (class12) class201.field3945.method1106(100, (long) arg0);
        ++field350;
        if (arg1 < 103) {
            method97(87, (byte) -101);
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class17.field272.method367(5, arg0, (byte) -34);
            class12 var4 = new class12();
            if (var3 != null) {
                var4.method55(new class89(var3), 2);
            }
            class201.field3945.method1107((long) arg0, var4, -107);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            return null;
        } else {
            ++field338;
            int[] var3 = super.field1025.method39(arg1, (byte) 39);
            if (super.field1025.field154) {
                int[] var4 = this.method314(0, (byte) -51, arg1);
                for (int var5 = 0; ~var5 > ~class122.field2442; ++var5) {
                    int var6 = var4[var5];
                    if (~var6 > ~this.field347) {
                        var3[var5] = this.field347;
                    } else if (~var6 >= ~this.field344) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field344;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([Lqh;II[BIII)V")
    public static final void method98(class153[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        for (int var7 = 0; var7 < 4; ++var7) {
            for (int var13 = 0; ~var13 > -65; ++var13) {
                for (int var14 = 0; var14 < 64; ++var14) {
                    if (~(arg5 + var13) < -1 && ~(arg5 - -var13) > -104 && arg6 + var14 > 0 && ~(arg6 + var14) > -104) {
                        arg0[var7].field3094[arg5 + var13][arg6 + var14] = class7.method38(arg0[var7].field3094[arg5 + var13][arg6 + var14], -16777217);
                    }
                }
            }
        }
        ++field340;
        class89 var8 = new class89(arg3);
        int var9 = 0;
        int var10 = 48 / ((18 - arg1) / 39);
        while (~var9 > -5) {
            for (int var11 = 0; var11 < 64; ++var11) {
                for (int var12 = 0; ~var12 > -65; ++var12) {
                    class128.method827(arg6 + var12, var8, 1, 0, arg4, arg2, arg5 + var11, var9);
                }
            }
            ++var9;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field341;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1029 = ~arg0.method538((byte) -79) == -2;
                }
            } else {
                this.field344 = arg0.method555(-1113627096);
            }
        } else {
            this.field347 = arg0.method555(-1113627096);
        }
        if (arg1 != 0) {
            method98((class153[]) null, -68, -111, (byte[]) null, 103, 60, 125);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        ++field352;
        if (arg1 != -94) {
            this.method99(85, (byte) 100);
        }
        int[][] var3 = super.field1027.method1087(arg0, -2);
        if (super.field1027.field3428) {
            int[][] var4 = this.method306(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class122.field2442 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field347 < ~var12) {
                    var8[var11] = this.field347;
                } else if (var12 > this.field344) {
                    var8[var11] = this.field344;
                } else {
                    var8[var11] = var12;
                }
                if (~this.field347 >= ~var13) {
                    if (~this.field344 <= ~var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field344;
                    }
                } else {
                    var9[var11] = this.field347;
                }
                if (~var14 > ~this.field347) {
                    var10[var11] = this.field347;
                } else if (var14 <= this.field344) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field344;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
    public static void method100(int arg0) {
        field346 = null;
        if (arg0 != 0) {
            field339 = null;
        }
        field339 = null;
        field342 = null;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class20() {
        super(1, false);
    }
}
