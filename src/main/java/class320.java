import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class320 extends class80 {

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
    private int field4885 = 1;

    @OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
    private int field4892 = 1;

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!wr", name = "Q", descriptor = "[B")
    public static byte[] field4891;

    @OriginalMember(owner = "client!wr", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field4894;

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "Ls;")
    public static class186 field4889;

    @OriginalMember(owner = "client!wr", name = "V", descriptor = "Ls;")
    public static class186 field4896;

    @OriginalMember(owner = "client!wr", name = "W", descriptor = "Ls;")
    public static class186 field4897;

    @OriginalMember(owner = "client!wr", name = "X", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!wr", name = "Z", descriptor = "Lbj;")
    public static class162 field4900;

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!wr", name = "S", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!wr", name = "Y", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "Lza;")
    public static class288 field4895;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wr", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field4901;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/String;II)Z")
    public static final boolean method2053(String arg0, int arg1, int arg2) {
        ++field4893;
        if (~class480.field7076 != -4) {
            class444.field6606 = new class248();
            class444.field6606.field3818 = arg2;
            class444.field6606.field3826 = arg0;
            if (class9.field137 != class522.field7582) {
                class444.field6606.field3824 = class444.field6606.field3818 + 40000;
                class444.field6606.field3815 = 50000 - -class444.field6606.field3818;
            }
            return true;
        } else if (arg1 != -8983) {
            return true;
        } else {
            String var3 = "";
            if (class9.field137 != class522.field7582) {
                var3 = ":" + (arg2 + 7000);
            }
            String var4 = "";
            if (class27.field437 != null) {
                var4 = "/p=" + class27.field437;
            }
            String var5 = "http://" + arg0 + var3 + "/l=" + class146.field2452 + "/a=" + class242.field3745 + var4 + "/j" + (!class407.field6166 ? "0" : "1") + ",o" + (!class364.field5329 ? "0" : "1") + ",a2";
            try {
                class418.field6296.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)V")
    public static void method2054(int arg0) {
        field4896 = null;
        field4895 = null;
        field4897 = null;
        field4894 = null;
        field4900 = null;
        field4891 = null;
        if (arg0 == -2) {
            field4889 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field4884;
        if (arg0 != 255) {
            method2056(-101);
        }
        int[][] var3 = super.field1589.method859(arg1, arg0 ^ -222);
        if (super.field1589.field1884) {
            int var4 = this.field4892 + 1 + this.field4892;
            int var5 = 65536 / var4;
            int var6 = this.field4885 + this.field4885 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field4892 + arg1; ~(this.field4892 + arg1) <= ~var9; ++var9) {
                int[][] var19 = this.method713(0, arg0 + -277, var9 & class359.field5269);
                int[][] var20 = new int[3][class137.field2308];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field4885; ~this.field4885 <= ~var27; ++var27) {
                    int var37 = var27 & class308.field4672;
                    var22 += var25[var37];
                    var23 += var26[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class137.field2308) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class308.field4672 & var31 - this.field4885;
                    int var33 = var22 - var25[var32];
                    int var34 = var21 - var24[var32];
                    ++var31;
                    int var35 = var23 - var26[var32];
                    int var36 = var31 - -this.field4885 & class308.field4672;
                    var21 = var24[var36] + var34;
                    var22 = var25[var36] + var33;
                    var23 = var26[var36] + var35;
                }
                var8[-arg1 + var9 - -this.field4892] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class137.field2308 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field1591 = ~arg2.method1858(-3256) == -2;
                }
            } else {
                this.field4892 = arg2.method1858(-3256);
            }
        } else {
            this.field4885 = arg2.method1858(-3256);
        }
        ++field4887;
        int var5 = 110 % ((28 - arg1) / 53);
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
    public class320() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field4886;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int var4 = this.field4892 - -1 + this.field4892;
            int var5 = 65536 / var4;
            int var6 = this.field4885 + 1 + this.field4885;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field4892; var9 <= this.field4892 + arg0; ++var9) {
                int[] var13 = this.method710(var9 & class359.field5269, 0, (byte) 106);
                int[] var14 = new int[class137.field2308];
                int var15 = 0;
                for (int var16 = -this.field4885; ~var16 >= ~this.field4885; ++var16) {
                    var15 += var13[var16 & class308.field4672];
                }
                int var17 = 0;
                while (var17 < class137.field2308) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class308.field4672 & -this.field4885 + var17];
                    ++var17;
                    var15 = var13[this.field4885 + var17 & class308.field4672] + var18;
                }
                var8[this.field4892 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; ~class137.field2308 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        if (arg1 != -16828) {
            this.field4885 = -24;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)V")
    public static final void method2055(int arg0) {
        if (arg0 != 0) {
            field4898 = -91;
        }
        if (~class480.field7076 != -3) {
            try {
                Method var1 = (field4901 != null ? field4901 : (field4901 = method2057("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class370.field5418 = (int) (var3 / 1048576L) - -1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        } else {
            class370.field5418 = 96;
        }
        ++field4890;
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)V")
    public static final void method2056(int arg0) {
        ++field4883;
        if (class233.field3597) {
            if (arg0 >= -58) {
                method2055(-121);
            }
            class388 var1 = class447.method2677(class341.field5130, 0, class506.field7383);
            if (var1 != null && var1.field5753 != null) {
                class322 var2 = new class322();
                var2.field4918 = var1;
                var2.field4911 = var1.field5753;
                class495.method2982(var2);
            }
            class160.field2579 = -1;
            class233.field3597 = false;
            class271.field4116 = -1;
            if (var1 != null) {
                class429.method2587(var1, (byte) -63);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2057(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class309("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field4888 = 0;
        field4891 = new byte[2048];
        field4894 = new String[8];
        field4889 = new class186(45, 4);
        field4896 = new class186(58, -2);
        field4897 = new class186(78, 0);
        field4898 = 13156520;
        new class309((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        field4900 = new class162(54, 3);
    }
}
