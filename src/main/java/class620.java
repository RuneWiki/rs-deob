import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public abstract class class620 extends class210 {

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "Z")
    public boolean field7856;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "S")
    public short field7849;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "S")
    public short field7852;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "S")
    public short field7850;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "S")
    public short field7844;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "B")
    public byte field7845;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "Lk;")
    public static class66 field7843 = new class66("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "[Z")
    public static boolean[] field7851;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lha;I)Z")
    public final boolean method717(class570 arg0, int arg1) {
        ++field7846;
        int var3 = 40 % ((21 - arg1) / 53);
        return class243.method1599((byte) 39, this.field7850, this.field7849, this.field7844, super.field2889, this.field7852, this.method170(79, arg0));
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZI)V")
    public static final void method3316(boolean arg0, int arg1) {
        ++field7855;
        if (arg0) {
            field7851 = null;
        }
        if (class1.field6 == 1) {
            class761.field10375 = arg1;
        } else if (class1.field6 == 2) {
            class747.field10205 = arg1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "(B)V")
    public static final void method3317(byte arg0) {
        ++field7853;
        if (arg0 <= -112) {
            class702.field9291.method884(class117.field1596, ~class485.field6252.field6920.method75(false) != -2 ? -1 : class316.field3941 + 256 << 2, 0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
    public void method2186(int arg0) {
        ++field7847;
        if (arg0 != 621526601) {
            this.field7850 = 127;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(Z)V")
    public static void method3318(boolean arg0) {
        field7843 = null;
        if (!arg0) {
            method3316(true, 45);
        }
        field7851 = null;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Z")
    public final boolean method718(int arg0) {
        ++field7848;
        for (int var2 = this.field7852; var2 <= this.field7849; ++var2) {
            for (int var3 = this.field7844; this.field7850 >= var3; ++var3) {
                int var4 = -class454.field5914 + class76.field1069 + var2;
                if (var4 >= 0 && class145.field1873.length > var4) {
                    int var5 = var3 - -class76.field1069 + -class309.field3875;
                    if (var5 >= 0 && ~var5 > ~class145.field1873.length && class145.field1873[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        if (arg0 > -95) {
            this.method719((class757[]) null, 62);
        }
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([Lgu;I)I")
    public final int method719(class757[] arg0, int arg1) {
        ++field7854;
        int var3 = 0;
        label118: for (int var4 = this.field7852; ~var4 >= ~this.field7849; ++var4) {
            label116: for (int var5 = this.field7844; ~var5 >= ~this.field7850; ++var5) {
                long var6 = class412.field5464[super.field2895][var4][var5];
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
                        class739 var11 = class491.field6306[var10 + -1];
                        for (int var12 = 0; var12 < var3; ++var12) {
                            if (arg0[var12] == var11.field10006) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg0[var3++] = var11.field10006;
                        if (~var3 == -5) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; ~var13 > -5; ++var13) {
            arg0[var13] = null;
        }
        if (arg1 <= 62) {
            field7843 = null;
        }
        if (~this.field7845 != -1) {
            int var14 = -class454.field5914 + this.field7852;
            int var15 = -class309.field3875 + this.field7844;
            int var16;
            short var17;
            int var18;
            short var19;
            if (this.field7845 != 1) {
                if (~(-var14) <= ~var15) {
                    var16 = this.field7852 - -1;
                    var17 = this.field7844;
                    var18 = this.field7844 - -1;
                    var19 = this.field7852;
                } else {
                    var16 = this.field7852 - 1;
                    var18 = this.field7844 + -1;
                    var19 = this.field7852;
                    var17 = this.field7844;
                }
            } else if (~var15 >= ~var14) {
                var18 = this.field7844 + 1;
                var16 = this.field7852 + -1;
                var17 = this.field7844;
                var19 = this.field7852;
            } else {
                var19 = this.field7852;
                var17 = this.field7844;
                var16 = this.field7852 + 1;
                var18 = this.field7844 + -1;
            }
            label81: for (int var20 = 0; ~var20 > ~var3; ++var20) {
                long var21 = class412.field5464[super.field2895][var19][var18];
                while (var21 != 0L) {
                    class739 var27 = class491.field6306[(int) ((65535L & var21) - 1L)];
                    var21 >>>= 16;
                    if (arg0[var20] == var27.field10006) {
                        continue label81;
                    }
                }
                long var23 = class412.field5464[super.field2895][var16][var17];
                while (var23 != 0L) {
                    class739 var26 = class491.field6306[(int) ((65535L & var23) - 1L)];
                    var23 >>>= 16;
                    if (arg0[var20] == var26.field10006) {
                        continue label81;
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

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        super.field2892 = arg3;
        this.field7856 = arg9;
        this.field7849 = (short) arg6;
        super.field2900 = arg4;
        this.field7852 = (short) arg5;
        this.field7850 = (short) arg8;
        this.field7844 = (short) arg7;
        super.field2895 = (byte) arg0;
        this.field7845 = arg10;
        super.field2889 = (byte) arg1;
        super.field2896 = arg2;
    }
}
