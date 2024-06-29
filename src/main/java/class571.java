import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class571 extends class694 {

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    private int field7671 = 4096;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    private int field7678 = 4096;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    private int field7679 = 4096;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    private int field7680 = 409;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "[I")
    private int[] field7677 = new int[3];

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "Ljava/lang/String;")
    public static String field7672 = null;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 13)
    public class571() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)Z", line = 16)
    public static final boolean method3144(boolean arg0, int arg1) {
        ++field7673;
        if (!arg0) {
            return true;
        } else {
            return arg1 == 0 || ~arg1 == -2 || ~arg1 == -3;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjr;B)V", line = 35)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            int var5 = arg1.method736(-126);
                            this.field7677[1] = class249.method1537(65280, var5) >> 4;
                            this.field7677[2] = class249.method1537(0, var5 >> 12);
                            this.field7677[0] = class249.method1537(var5, 16711680) << 4;
                        }
                    } else {
                        this.field7678 = arg1.method743((byte) -128);
                    }
                } else {
                    this.field7679 = arg1.method743((byte) -102);
                }
            } else {
                this.field7671 = arg1.method743((byte) -55);
            }
        } else {
            this.field7680 = arg1.method743((byte) -23);
        }
        int var6 = -107 % ((arg2 - 58) / 63);
        ++field7676;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V", line = 103)
    public static final void method3145(boolean arg0) {
        class208.field3075 = -1;
        class86.field1181 = 1;
        if (!arg0) {
            ++field7670;
            long var1 = 0L;
            if (class690.field9699 != null) {
                class96 var3 = new class96(class513.method2851(0, class532.method2942(class690.field9699, 124)));
                long var4 = var3.method715(true);
                class129.field1775 = var3.method715(true);
                class402.method2295(31644, "", true, class170.method1166(var4, (byte) -128));
            } else {
                class35.method161(35, (byte) -82);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)V", line = 131)
    public static void method3146(int arg0) {
        if (arg0 != -21565) {
            field7672 = null;
        }
        field7672 = null;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)[[I", line = 141)
    public final int[][] method15(int arg0, int arg1) {
        ++field7675;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (arg0 != -22151) {
            return null;
        } else {
            if (super.field9740.field8738) {
                int[][] var4 = this.method3812(arg1, 0, -14032);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class465.field6544; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field7677[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (~this.field7680 > ~var13) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field7677[1] + var14;
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (~var15 < ~this.field7680) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field7677[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (~var17 < ~this.field7680) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field7678 * var12 >> 12;
                                var9[var11] = this.field7679 * var14 >> 12;
                                var10[var11] = this.field7671 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[BLmc;)Lch;", line = 237)
    public static final class426 method3147(int arg0, int arg1, byte[] arg2, class120 arg3) {
        ++field7674;
        if (arg2 == null) {
            return null;
        } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg0, var4);
            OpenGL.glProgramRawARB(arg0, 34933, arg2);
            if (arg1 != 65280) {
                field7672 = null;
            }
            OpenGL.glGetIntegerv(34379, class323.field4783, 0);
            if (class323.field4783[0] != -1) {
                OpenGL.glBindProgramARB(arg0, 0);
                return null;
            } else {
                OpenGL.glBindProgramARB(arg0, 0);
                return new class426(arg3, arg0, var4);
            }
        }
    }
}
