import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class class395 extends class318 {

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "Z")
    public boolean field5675;

    @OriginalMember(owner = "client!ht", name = "I", descriptor = "S")
    public short field5679;

    @OriginalMember(owner = "client!ht", name = "H", descriptor = "B")
    public byte field5678;

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "S")
    public short field5673;

    @OriginalMember(owner = "client!ht", name = "M", descriptor = "S")
    public short field5683;

    @OriginalMember(owner = "client!ht", name = "J", descriptor = "S")
    public short field5680;

    @OriginalMember(owner = "client!ht", name = "K", descriptor = "Lkr;")
    public static class602 field5681 = new class602(118, 6);

    @OriginalMember(owner = "client!ht", name = "D", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!ht", name = "F", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!ht", name = "G", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!ht", name = "L", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!ht", name = "N", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!ht", name = "O", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "(I)V", line = 6)
    public static void method2466(int arg0) {
        if (arg0 != 0) {
            field5684 = -18;
        }
        field5681 = null;
    }

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "(I)Z", line = 17)
    public final boolean method628(int arg0) {
        ++field5677;
        int var2 = this.field5680;
        if (arg0 < 95) {
            this.field5675 = true;
        }
        while (~var2 >= ~this.field5683) {
            for (int var3 = this.field5673; var3 <= this.field5679; ++var3) {
                int var4 = var2 - class103.field1410 - -class218.field2854;
                if (~var4 <= -1 && class417.field5900.length > var4) {
                    int var5 = class218.field2854 + var3 + -class307.field4314;
                    if (~var5 <= -1 && class417.field5900.length > var5 && class417.field5900[var4][var5]) {
                        return true;
                    }
                }
            }
            ++var2;
        }
        return false;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)Z", line = 65)
    public static final boolean method2467(int arg0, int arg1, int arg2) {
        ++field5676;
        if (arg1 != -11098) {
            return false;
        } else {
            return (16 & arg0) != 0;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([Ltj;B)I", line = 83)
    public final int method626(class687[] arg0, byte arg1) {
        ++field5682;
        int var3 = 0;
        if (arg1 != -80) {
            this.field5680 = 71;
        }
        label118: for (int var4 = this.field5680; var4 <= this.field5683; ++var4) {
            label116: for (int var5 = this.field5673; this.field5679 >= var5; ++var5) {
                long var6 = class142.field2015[super.field4408][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (var8 > 48L) {
                            continue label116;
                        }
                        int var10 = (int) (65535L & var6 >>> (int) var8);
                        if (~var10 >= -1) {
                            continue label116;
                        }
                        class131 var11 = class532.field7385[var10 + -1];
                        for (int var12 = 0; ~var3 < ~var12; ++var12) {
                            if (arg0[var12] == var11.field1842) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg0[var3++] = var11.field1842;
                        if (var3 == 4) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; var13 < 4; ++var13) {
            arg0[var13] = null;
        }
        if (this.field5678 != 0) {
            int var14 = -class103.field1410 + this.field5680;
            int var15 = -class307.field4314 + this.field5673;
            short var16;
            int var17;
            int var18;
            short var19;
            if (this.field5678 == 1) {
                if (var14 >= var15) {
                    var16 = this.field5680;
                    var17 = this.field5680 + -1;
                    var18 = this.field5673 - -1;
                    var19 = this.field5673;
                } else {
                    var19 = this.field5673;
                    var18 = this.field5673 + -1;
                    var16 = this.field5680;
                    var17 = this.field5680 + 1;
                }
            } else if (-var14 < var15) {
                var17 = this.field5680 + -1;
                var16 = this.field5680;
                var19 = this.field5673;
                var18 = this.field5673 + -1;
            } else {
                var16 = this.field5680;
                var19 = this.field5673;
                var17 = this.field5680 - -1;
                var18 = this.field5673 + 1;
            }
            label82: for (int var20 = 0; ~var20 > ~var3; ++var20) {
                long var21 = class142.field2015[super.field4408][var16][var18];
                while (var21 != 0L) {
                    class131 var27 = class532.field7385[(int) ((var21 & 65535L) - 1L)];
                    var21 >>>= 16;
                    if (arg0[var20] == var27.field1842) {
                        continue label82;
                    }
                }
                long var23 = class142.field2015[super.field4408][var17][var19];
                while (~var23 != -1L) {
                    class131 var26 = class532.field7385[(int) ((65535L & var23) + -1L)];
                    var23 >>>= 16;
                    if (arg0[var20] == var26.field1842) {
                        continue label82;
                    }
                }
                for (int var25 = var20; var25 < var3 + -1; ++var25) {
                    arg0[var25] = arg0[var25 + 1];
                }
                --var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 251)
    public class395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field5675 = arg9;
        super.field4410 = arg2;
        this.field5679 = (short) arg8;
        this.field5678 = arg10;
        this.field5673 = (short) arg7;
        super.field4408 = (byte) arg0;
        this.field5683 = (short) arg6;
        this.field5680 = (short) arg5;
        super.field4418 = arg4;
        super.field4419 = (byte) arg1;
        super.field4413 = arg3;
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(Lha;B)Z", line = 270)
    public final boolean method627(class548 arg0, byte arg1) {
        ++field5685;
        if (arg1 <= 80) {
            field5684 = 25;
        }
        return class743.method4142(this.field5683, this.field5679, super.field4419, this.field5680, this.method653(arg0, (byte) 13), this.field5673, 16443);
    }

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "(I)V", line = 282)
    public void method2468(int arg0) {
        int var2 = -102 / ((-71 - arg0) / 41);
        ++field5674;
    }
}
