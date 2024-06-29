import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class232 extends class59 {

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    private int field3834 = 4096;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "I")
    private int field3846 = 0;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "Lph;")
    public static class229 field3832 = class266.method1858(" ", 0);

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "Lph;")
    public static class229 field3830 = null;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "Lph;")
    public static class229 field3840 = class266.method1858("blinken1:", 0);

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    public static int field3842 = 0;

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
    public static int field3844 = 0;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "Lvm;")
    public static class202 field3838 = new class202(64);

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "F")
    public static float field3839;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "Lw;")
    public static class41 field3837;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIZIZ)V", line = 4)
    public static final void method1650(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field3843++;
        class141.method1014(arg4, arg1, (byte) 127, arg2, arg3, class240.field3967.length - 1, arg0);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V", line = 13)
    public static void method1651(byte arg0) {
        field3837 = null;
        field3830 = null;
        field3840 = null;
        field3838 = null;
        if (arg0 < 92) {
            method1651((byte) -73);
        }
        field3832 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)[[I", line = 31)
    public final int[][] method116(int arg0, int arg1) {
        if (arg1 != 4588) {
            field3830 = (class229) null;
        }
        int[][] var3 = this.field838.method1796(true, arg0);
        field3836++;
        if (this.field838.field4334) {
            int[][] var4 = this.method397(arg1 - 4587, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class293.field4789; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field3846 > var12) {
                    var8[var11] = this.field3846;
                } else if (this.field3834 < var12) {
                    var8[var11] = this.field3834;
                } else {
                    var8[var11] = var12;
                }
                if (var13 < this.field3846) {
                    var9[var11] = this.field3846;
                } else if (var13 <= this.field3834) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field3834;
                }
                if (this.field3846 > var14) {
                    var10[var11] = this.field3846;
                } else if (var14 > this.field3834) {
                    var10[var11] = this.field3834;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BILhb;)V", line = 117)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg1 == 0) {
            this.field3846 = arg2.method1161(true);
        } else if (arg1 == 1) {
            this.field3834 = arg2.method1161(true);
        } else if (arg1 == 2) {
            this.field841 = arg2.method1178(arg0 ^ 0x7B) == 1;
        }
        field3829++;
        if (arg0 != 115) {
            this.method116(-119, -85);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 149)
    public class232() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)[I", line = 163)
    public final int[] method63(boolean arg0, int arg1) {
        field3831++;
        if (!arg0) {
            method1651((byte) -63);
        }
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int[] var4 = this.method394(arg1, 0, (byte) 126);
            for (int var5 = 0; var5 < class293.field4789; var5++) {
                int var6 = var4[var5];
                if (this.field3846 > var6) {
                    var3[var5] = this.field3846;
                } else if (this.field3834 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field3834;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILsi;Lsi;Lsi;Llh;)Z", line = 210)
    public static final boolean method1652(int arg0, class66 arg1, class66 arg2, class66 arg3, class63 arg4) {
        class156.field2536 = arg2;
        class60.field854 = arg1;
        if (arg0 != -2) {
            method1654(-58, 35);
        }
        class326.field5577 = arg3;
        field3833++;
        class224.field3685 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)Z", line = 227)
    public static final boolean method1653(boolean arg0) {
        if (arg0) {
            method1650(84, 118, true, -99, true);
        }
        field3835++;
        try {
            return class138.method993((byte) 103);
        } catch (IOException var5) {
            class19.method114(4096);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class296.field4837 + "," + class134.field2187 + "," + class225.field3700 + " - " + class187.field3052 + "," + (class1.field9 + class230.field3820.field5104[0]) + "," + (class230.field3820.field5159[0] + class1.field1) + " - ";
            for (int var4 = 0; class187.field3052 > var4 && var4 < 50; var4++) {
                var3 = var3 + class88.field1497.field2668[var4] + ",";
            }
            class110.method834(var3, var6, -1);
            class110.method836(false);
            return true;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)I", line = 282)
    public static final int method1654(int arg0, int arg1) {
        field3845++;
        if (arg0 != 6724) {
            return -35;
        } else if (arg1 >= 97 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }
}
