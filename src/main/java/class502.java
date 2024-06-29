import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class502 extends class45 {

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public int field6900 = 0;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "Led;")
    public static class116 field6912 = new class116();

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "[I")
    public static int[] field6925 = new int[50];

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    public static int field6926 = -1;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public int field6891;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public int field6894;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public int field6898;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public int field6902;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public int field6904;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public int field6907;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public int field6911;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public int field6913;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public int field6914;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    public int field6916;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public int field6919;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "Lql;")
    public class161 field6901;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Lql;")
    public class161 field6910;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "Lnu;")
    public class351 field6920;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "Lkba;")
    public class573 field6909;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "Lpga;")
    public class577 field6899;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "Lpga;")
    public class577 field6917;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "Ltc;")
    public class600 field6905;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Lbga;")
    public class655 field6893;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "Lbga;")
    public class655 field6915;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Z")
    public boolean field6896;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Z")
    public boolean field6906;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "Z")
    public boolean field6922;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "[I")
    public int[] field6918;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "[I")
    public static int[] field6923;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "[Lwv;")
    public static class423[] field6924;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BII)V")
    public static final void method2849(byte arg0, int arg1, int arg2) {
        if (arg0 != 82) {
            method2850(null, 80, null, 1);
        }
        if (class152.field2092 == 1) {
            class342.method1988(arg2, class61.field759, arg1, arg0 ^ 0xFFFFFFD3);
        } else if (class152.field2092 == 2) {
            class500.method2845(arg1, arg2, -30906);
        }
        field6895++;
        class61.field759 = null;
        class152.field2092 = 0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lio;ILgba;I)V")
    public static final void method2850(class157 arg0, int arg1, class388 arg2, int arg3) {
        field6921++;
        class365 var4 = new class365();
        var4.field4825 = arg0.method930(255);
        var4.field4824 = arg0.method908(false);
        var4.field4821 = new int[var4.field4825];
        if (arg3 != -1) {
            field6926 = 95;
        }
        var4.field4819 = new int[var4.field4825];
        var4.field4815 = new class661[var4.field4825];
        var4.field4816 = new int[var4.field4825];
        var4.field4823 = new byte[var4.field4825][][];
        var4.field4826 = new class661[var4.field4825];
        for (int var5 = 0; var5 < var4.field4825; var5++) {
            try {
                int var6 = arg0.method930(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg0.method925(78);
                    String var18 = arg0.method925(92);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method908(false);
                    }
                    var4.field4821[var5] = var6;
                    var4.field4816[var5] = var19;
                    var4.field4815[var5] = arg2.method2222(arg3 + 101, var18, class632.method3507(var17, 0));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg0.method925(arg3 + 39);
                    String var8 = arg0.method925(67);
                    int var9 = arg0.method930(255);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg0.method925(114);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method908(false);
                            var12[var13] = new byte[var14];
                            arg0.method962(var12[var13], 93, var14, 0);
                        }
                    }
                    var4.field4821[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class632.method3507(var10[var16], class50.method268(arg3, -1));
                    }
                    var4.field4826[var5] = arg2.method2229(var8, class632.method3507(var7, 0), 29497, var15);
                    var4.field4823[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4819[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4819[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4819[var5] = -3;
            } catch (Exception var23) {
                var4.field4819[var5] = -4;
            } catch (Throwable var24) {
                var4.field4819[var5] = -5;
            }
        }
        class259.field3385.method2507(var4, (byte) -122);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method2851(int arg0) {
        field6925 = null;
        field6923 = null;
        field6924 = null;
        field6912 = null;
        if (arg0 != -3) {
            field6925 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
    public static final void method2852(int arg0, int arg1) {
        field6903++;
        class256 var2 = class592.method3279((byte) -83, 1, arg1);
        var2.method1546((byte) 115);
        if (arg0 != 10475) {
            method2854((byte) 8, null);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public final void method2853(byte arg0) {
        field6908++;
        int var2 = this.field6894;
        boolean var3 = this.field6922;
        if (this.field6905 != null) {
            class600 var6 = this.field6905.method3324((byte) 124, class564.field7696);
            if (var6 == null) {
                this.field6911 = 0;
                this.field6922 = false;
                this.field6918 = null;
                this.field6916 = 0;
                this.field6906 = false;
                this.field6914 = 0;
                this.field6902 = 0;
                this.field6894 = -1;
            } else {
                this.field6911 = var6.field8292;
                this.field6902 = var6.field8303 << 9;
                this.field6894 = var6.field8285;
                this.field6922 = var6.field8316;
                this.field6918 = var6.field8331;
                this.field6914 = var6.field8263;
                this.field6916 = var6.field8260;
                this.field6906 = var6.field8314;
            }
        } else if (this.field6920 != null) {
            int var4 = class273.method1644(13600, this.field6920);
            if (var2 != var4) {
                this.field6894 = var4;
                class384 var5 = this.field6920.field4671;
                if (var5.field5121 != null) {
                    var5 = var5.method2203(3, class564.field7696);
                }
                if (var5 == null) {
                    this.field6922 = this.field6920.field4671.field5088;
                    this.field6914 = this.field6902 = 0;
                } else {
                    this.field6902 = var5.field5134 << 9;
                    this.field6914 = var5.field5108;
                    this.field6922 = var5.field5088;
                }
            }
        } else if (this.field6909 != null) {
            this.field6894 = class580.method3197(this.field6909, 0);
            this.field6922 = this.field6909.field7802;
            this.field6902 = this.field6909.field7793 << 9;
            this.field6914 = this.field6909.field7833;
        }
        int var7 = -34 / ((-arg0 - 29) / 42);
        if (this.field6894 == var2 && this.field6922 == var3) {
            return;
        }
        if (this.field6915 == null) {
            return;
        }
        class126.field1759.method1345(this.field6915);
        this.field6910 = null;
        this.field6917 = null;
        this.field6915 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLrc;)Lri;")
    public static final class634 method2854(byte arg0, class29 arg1) {
        field6892++;
        class634 var2;
        if (class117.field1492 == null) {
            var2 = new class634();
        } else {
            var2 = class117.field1492;
            class117.field1492 = class117.field1492.field8764;
            var2.field8764 = null;
            class316.field4236--;
        }
        var2.field8767 = arg1;
        int var3 = 74 / ((-arg0 - 65) / 50);
        return var2;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([S[Ljava/lang/String;III)V")
    public static final void method2855(short[] arg0, String[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 > arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method2855(arg0, arg1, -1, var6 - 1, arg4);
            method2855(arg0, arg1, -1, arg3, var6 + 1);
        }
        field6897++;
        if (arg2 != -1) {
            field6925 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()V")
    public static final void method2856() {
        for (int var0 = 0; var0 < class392.field5241; var0++) {
            class29 var1 = class420.field5512[var0];
            class327.method1903(var1, true);
            class420.field5512[var0] = null;
        }
        class392.field5241 = 0;
    }
}
