import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public abstract class class459 extends class692 {

    @OriginalMember(owner = "client!iaa", name = "v", descriptor = "S")
    public short field6865;

    @OriginalMember(owner = "client!iaa", name = "H", descriptor = "Z")
    public boolean field6877;

    @OriginalMember(owner = "client!iaa", name = "E", descriptor = "B")
    public byte field6874;

    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "S")
    public short field6871;

    @OriginalMember(owner = "client!iaa", name = "A", descriptor = "S")
    public short field6870;

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "S")
    public short field6869;

    @OriginalMember(owner = "client!iaa", name = "u", descriptor = "I")
    public static int field6864 = -1;

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "Lrl;")
    public static class672 field6863 = new class672(62, -1);

    @OriginalMember(owner = "client!iaa", name = "w", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!iaa", name = "x", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!iaa", name = "C", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!iaa", name = "D", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!iaa", name = "F", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!iaa", name = "G", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "(I)V")
    public static void method2877(int arg0) {
        field6863 = null;
        int var1 = -117 % ((arg0 - -57) / 53);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B[Lcp;)I")
    public final int method1473(byte arg0, class674[] arg1) {
        ++field6866;
        int var3 = 0;
        label116: for (int var4 = this.field6865; var4 <= this.field6870; ++var4) {
            label114: for (int var5 = this.field6869; this.field6871 >= var5; ++var5) {
                long var6 = class99.field1601[super.field9695][var4][var5];
                long var8 = 0L;
                while (true) {
                    label109: while (true) {
                        if (var8 > 48L) {
                            continue label114;
                        }
                        int var10 = (int) (var6 >>> (int) var8 & 65535L);
                        if (~var10 >= -1) {
                            continue label114;
                        }
                        class263 var11 = class529.field7714[var10 + -1];
                        for (int var12 = 0; ~var12 > ~var3; ++var12) {
                            if (arg1[var12] == var11.field4300) {
                                var8 += 16L;
                                continue label109;
                            }
                        }
                        arg1[var3++] = var11.field4300;
                        if (var3 == 4) {
                            break label116;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        int var13 = var3;
        if (arg0 >= -43) {
            field6872 = 24;
        }
        while (~var13 > -5) {
            arg1[var13] = null;
            ++var13;
        }
        if (this.field6874 != 0) {
            int var14 = this.field6865 - class325.field5056;
            int var15 = this.field6869 - class542.field7902;
            int var16;
            int var17;
            short var18;
            short var19;
            if (~this.field6874 == -2) {
                if (~var14 <= ~var15) {
                    var16 = this.field6869 + 1;
                    var17 = this.field6865 + -1;
                    var18 = this.field6869;
                    var19 = this.field6865;
                } else {
                    var18 = this.field6869;
                    var16 = this.field6869 - 1;
                    var19 = this.field6865;
                    var17 = this.field6865 + 1;
                }
            } else if (var15 <= -var14) {
                var16 = this.field6869 + 1;
                var19 = this.field6865;
                var17 = this.field6865 + 1;
                var18 = this.field6869;
            } else {
                var17 = this.field6865 - 1;
                var18 = this.field6869;
                var16 = this.field6869 - 1;
                var19 = this.field6865;
            }
            label80: for (int var20 = 0; var20 < var3; ++var20) {
                long var21 = class99.field1601[super.field9695][var19][var16];
                while (~var21 != -1L) {
                    class263 var27 = class529.field7714[(int) ((var21 & 65535L) + -1L)];
                    var21 >>>= 16;
                    if (arg1[var20] == var27.field4300) {
                        continue label80;
                    }
                }
                long var23 = class99.field1601[super.field9695][var17][var18];
                while (~var23 != -1L) {
                    class263 var26 = class529.field7714[(int) ((65535L & var23) + -1L)];
                    var23 >>>= 16;
                    if (arg1[var20] == var26.field4300) {
                        continue label80;
                    }
                }
                for (int var25 = var20; ~(var3 + -1) < ~var25; ++var25) {
                    arg1[var25] = arg1[var25 + 1];
                }
                --var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILie;)Lpg;")
    public static final class682 method2878(int arg0, class6 arg1) {
        ++field6875;
        if (arg0 > -60) {
            return null;
        } else {
            int var2 = arg1.method67(12021);
            class254 var3 = class411.method2620(0)[arg1.method70(-9059)];
            class395 var4 = class129.method1125(0)[arg1.method70(-9059)];
            int var5 = arg1.method45(-8652);
            int var6 = arg1.method45(-8652);
            return new class682(var2, var3, var4, var5, var6);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "(I)Z")
    public final boolean method1472(int arg0) {
        if (arg0 > -97) {
            this.method1473((byte) 91, (class674[]) null);
        }
        ++field6868;
        return class116.method1043(super.field9703, this.field6865, this.field6870, this.field6871, this.field6869, (byte) 85, this.method393(0));
    }

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "(I)Z")
    public final boolean method1474(int arg0) {
        ++field6876;
        int var2 = this.field6865;
        if (arg0 != -1) {
            field6872 = 47;
        }
        while (var2 <= this.field6870) {
            for (int var3 = this.field6869; this.field6871 >= var3; ++var3) {
                int var4 = var2 - class325.field5056 + class443.field6744;
                if (~var4 <= -1 && class37.field509.length > var4) {
                    int var5 = -class542.field7902 + var3 + class443.field6744;
                    if (~var5 <= -1 && var5 < class37.field509.length && class37.field509[var4][var5]) {
                        return true;
                    }
                }
            }
            ++var2;
        }
        return false;
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field6865 = (short) arg5;
        super.field9695 = (byte) arg0;
        this.field6877 = arg9;
        this.field6874 = arg10;
        this.field6871 = (short) arg8;
        this.field6870 = (short) arg6;
        super.field9705 = arg4;
        super.field9701 = arg3;
        this.field6869 = (short) arg7;
        super.field9696 = arg2;
        super.field9703 = (byte) arg1;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)V")
    public void method960(boolean arg0) {
        if (arg0) {
            ++field6873;
        }
    }
}
