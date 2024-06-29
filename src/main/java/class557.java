import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class557 extends class601 {

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "[Lmg;")
    private class518[] field7085;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[[I)V")
    private final void method3021(byte arg0, int[][] arg1) {
        int var3 = -106 % ((arg0 - 63) / 32);
        ++field7084;
        int var4 = class418.field5518;
        int var5 = class418.field5514;
        class640.method3462(arg1, false);
        class70.method418(class511.field6519, (byte) -110, 0, 0, class104.field1388);
        if (this.field7085 != null) {
            for (int var6 = 0; var6 < this.field7085.length; ++var6) {
                class518 var7 = this.field7085[var6];
                int var8 = var7.field6595;
                int var9 = var7.field6594;
                if (~var8 <= -1) {
                    if (var9 < 0) {
                        var7.method1044(var5, var4, (byte) 24);
                    } else {
                        var7.method1041(var4, var5, (byte) 124);
                    }
                } else if (var9 >= 0) {
                    var7.method1042(-23442, var4, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        int var4 = 49 / ((arg2 - 40) / 52);
        ++field7082;
        if (~arg1 == -1) {
            this.field7085 = new class518[arg0.method1509(true)];
            for (int var5 = 0; this.field7085.length > var5; ++var5) {
                int var6 = arg0.method1509(true);
                if (var6 != 0) {
                    if (var6 != 1) {
                        if (~var6 != -3) {
                            if (~var6 == -4) {
                                this.field7085[var5] = class640.method3461(-1464641040, arg0);
                            }
                        } else {
                            this.field7085[var5] = class570.method3067((byte) -13, arg0);
                        }
                    } else {
                        this.field7085[var5] = class718.method3850(false, arg0);
                    }
                } else {
                    this.field7085[var5] = class622.method3321(arg0, false);
                }
            }
        } else if (arg1 == 1) {
            super.field7646 = ~arg0.method1509(true) == -2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[[I")
    public final int[][] method638(int arg0, int arg1) {
        ++field7080;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (arg0 != 2017) {
            this.method259((class234) null, -119, 51);
        }
        if (super.field7647.field8306) {
            int var4 = class418.field5518;
            int var5 = class418.field5514;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field7647.method3511((byte) -7);
            this.method3021((byte) -86, var6);
            for (int var8 = 0; ~var8 > ~class418.field5514; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class418.field5518; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class249.method1625(var15 << 4, 4080);
                    var12[var14] = class249.method1625(4080, var15 >> 4);
                    var11[var14] = class249.method1625(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field7081;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (arg1 >= -76) {
            return null;
        } else {
            if (super.field7643.field4364) {
                this.method3021((byte) -90, super.field7643.method2053((byte) -112));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class557() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[B)V")
    public static final void method3022(byte arg0, byte[] arg1) {
        if (arg0 >= 15) {
            ++field7083;
            class234 var2 = new class234(arg1);
            while (true) {
                while (true) {
                    int var3 = var2.method1509(true);
                    if (~var3 == -1) {
                        return;
                    }
                    if (~var3 == -2) {
                        int[] var4 = class33.field369 = new int[6];
                        var4[0] = var2.method1553((byte) -121);
                        var4[1] = var2.method1553((byte) -121);
                        var4[2] = var2.method1553((byte) -127);
                        var4[3] = var2.method1553((byte) -107);
                        var4[4] = var2.method1553((byte) -125);
                        var4[5] = var2.method1553((byte) -119);
                    } else if (~var3 != -5) {
                        if (var3 == 5) {
                            int var5 = var2.method1509(true);
                            class600.field7627 = new int[var5];
                            for (int var6 = 0; ~var5 < ~var6; ++var6) {
                                class600.field7627[var6] = var2.method1553((byte) -109);
                                if (class600.field7627[var6] == 65535) {
                                    class600.field7627[var6] = -1;
                                }
                            }
                        }
                    } else {
                        int var7 = var2.method1509(true);
                        class398.field5247 = new int[var7];
                        for (int var8 = 0; var7 > var8; ++var8) {
                            class398.field5247[var8] = var2.method1553((byte) -117);
                            if (~class398.field5247[var8] == -65536) {
                                class398.field5247[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
