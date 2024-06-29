import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class300 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Z")
    public boolean field4859 = false;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public int field4870 = -1;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Z")
    public boolean field4867 = false;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Z")
    public boolean field4863 = false;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public int field4875 = 99;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public int field4872 = 2;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public int field4868 = -1;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Z")
    public boolean field4862 = false;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public int field4871 = -1;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public int field4876 = -1;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public int field4878 = -1;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public int field4892 = 5;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static volatile int field4869 = -1;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lsf;")
    public static class124 field4865 = new class124(260);

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field4883 = 0;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field4889 = new String[500];

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field4887 = 0;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "F")
    public static float field4881;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public int field4860;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "[I")
    private int[] field4873;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "[I")
    public int[] field4877;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "[I")
    public int[] field4885;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "[I")
    public static int[] field4886;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "[Z")
    public boolean[] field4864;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "[[I")
    public int[][] field4874;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 6)
    public final void method2143(int arg0) {
        if (this.field4870 == -1) {
            if (this.field4864 == null) {
                this.field4870 = 0;
            } else {
                this.field4870 = 2;
            }
        }
        int var2 = -108 / ((arg0 + 58) / 58);
        if (this.field4876 == -1) {
            if (this.field4864 == null) {
                this.field4876 = 0;
            } else {
                this.field4876 = 2;
            }
        }
        field4891++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILhb;III)Lhb;", line = 41)
    public final class42 method2144(int arg0, class42 arg1, int arg2, int arg3, int arg4) {
        field4882++;
        int var6 = this.field4885[arg3];
        int var7 = this.field4877[arg3];
        class133 var8 = class198.method1354(var6 >> 16, (byte) 74);
        int var9 = var6 & 0xFFFF;
        if (var8 == null) {
            return arg1.method349(true, true, true);
        }
        class133 var10 = null;
        class133 var11 = null;
        if ((this.field4859 || class139.field2362) && arg4 != -1 && arg4 < this.field4885.length) {
            int var12 = this.field4885[arg4];
            var11 = class198.method1354(var12 >> 16, (byte) 74);
            arg4 = var12 & 0xFFFF;
        }
        class133 var13 = null;
        int var14 = 0;
        int var15 = arg2;
        if (this.field4873 != null) {
            if (arg3 < this.field4873.length) {
                var14 = this.field4873[arg3];
                if (var14 != 65535) {
                    var10 = class198.method1354(var14 >> 16, (byte) 74);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field4859 || class139.field2362) && arg4 != -1 && this.field4873.length > arg4) {
                var15 = this.field4873[arg4];
                if (var15 != 65535) {
                    var13 = class198.method1354(var15 >> 16, (byte) 74);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method936(21603, var9);
        boolean var17 = !var8.method939(var9, 121);
        if (var10 != null) {
            var16 &= !var10.method936(arg2 + 21603, var14);
            var17 &= !var10.method939(var14, 124);
        }
        if (var11 != null) {
            var16 &= !var11.method936(21603, arg4);
            var17 &= !var11.method939(arg4, 121);
        }
        if (var13 != null) {
            var16 &= !var13.method936(21603, var15);
            var17 &= !var13.method939(var15, 126);
        }
        class42 var18 = arg1.method349(var16, var17, !this.field4862);
        var18.method335(var8, var9, var11, arg4, arg0 - 1, var7, this.field4862);
        if (var10 != null) {
            var18.method335(var10, var14, var13, var15, arg0 - 1, var7, this.field4862);
        }
        return var18;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILhb;I)Lhb;", line = 143)
    public final class42 method2145(int arg0, int arg1, int arg2, class42 arg3, int arg4) {
        field4879++;
        int var6 = this.field4877[arg1];
        int var7 = this.field4885[arg1];
        class133 var8 = class198.method1354(var7 >> 16, (byte) 74);
        int var9 = var7 & arg2;
        if (var8 == null) {
            return arg3.method355(true, true, true);
        }
        class133 var10 = null;
        if ((this.field4859 || class139.field2362) && arg0 != -1 && this.field4885.length > arg0) {
            int var11 = this.field4885[arg0];
            var10 = class198.method1354(var11 >> 16, (byte) 74);
            arg0 = var11 & 0xFFFF;
        }
        class42 var12;
        if (var10 == null) {
            var12 = arg3.method355(!var8.method936(21603, var9), !var8.method939(var9, 106), !this.field4862);
        } else {
            var12 = arg3.method355(!var8.method936(21603, var9) & !var10.method936(21603, arg0), !var8.method939(var9, 108) & !var10.method939(arg0, arg2 ^ 0xFF89), !this.field4862);
        }
        var12.method335(var8, var9, var10, arg0, arg4 - 1, var6, this.field4862);
        return var12;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 177)
    public static void method2146(int arg0) {
        field4889 = null;
        if (arg0 == 2) {
            field4865 = null;
            field4886 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILoe;)V", line = 222)
    public final void method2147(int arg0, class146 arg1) {
        if (arg0 != -2) {
            this.field4875 = -44;
        }
        field4888++;
        while (true) {
            int var3 = arg1.method1005((byte) 122);
            if (var3 == 0) {
                return;
            }
            this.method2149(-3215, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)Z", line = 265)
    public static final boolean method2148(int arg0) {
        field4866++;
        if (class216.field3604) {
            try {
                return !(Boolean) class186.method1305(class59.field1164.field2658, false, "showingVideoAd");
            } catch (Throwable var2) {
            }
        }
        if (arg0 != 2) {
            field4886 = (int[]) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILoe;I)V", line = 285)
    private final void method2149(int arg0, class146 arg1, int arg2) {
        field4890++;
        if (arg0 != -3215) {
            this.method2147(19, (class146) null);
        }
        if (arg2 == 1) {
            int var13 = arg1.method989(arg0 ^ 0xFFFFF304);
            this.field4877 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4877[var14] = arg1.method989(105);
            }
            this.field4885 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field4885[var15] = arg1.method989(125);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field4885[var16] = (arg1.method989(65) << 16) + this.field4885[var16];
            }
        } else if (arg2 == 2) {
            this.field4871 = arg1.method989(arg0 ^ 0xFFFFF339);
        } else if (arg2 == 3) {
            this.field4864 = new boolean[256];
            int var4 = arg1.method1005((byte) 122);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4864[arg1.method1005((byte) 122)] = true;
            }
        } else if (arg2 == 4) {
            this.field4867 = true;
        } else if (arg2 == 5) {
            this.field4892 = arg1.method1005((byte) 122);
        } else if (arg2 == 6) {
            this.field4868 = arg1.method989(63);
        } else if (arg2 == 7) {
            this.field4878 = arg1.method989(93);
        } else if (arg2 == 8) {
            this.field4875 = arg1.method1005((byte) 122);
        } else if (arg2 == 9) {
            this.field4870 = arg1.method1005((byte) 122);
        } else if (arg2 == 10) {
            this.field4876 = arg1.method1005((byte) 122);
        } else if (arg2 == 11) {
            this.field4872 = arg1.method1005((byte) 122);
        } else if (arg2 == 12) {
            int var6 = arg1.method1005((byte) 122);
            this.field4873 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4873[var7] = arg1.method989(75);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field4873[var8] = (arg1.method989(102) << 16) + this.field4873[var8];
            }
        } else if (arg2 == 13) {
            int var9 = arg1.method989(arg0 ^ 0xFFFFF316);
            this.field4874 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg1.method1005((byte) 122);
                if (var11 > 0) {
                    this.field4874[var10] = new int[var11];
                    this.field4874[var10][0] = arg1.method1025((byte) -60);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field4874[var10][var12] = arg1.method989(96);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field4862 = true;
        } else if (arg2 == 15) {
            this.field4859 = true;
        } else if (arg2 == 16) {
            this.field4863 = true;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILhb;IIB)Lhb;", line = 452)
    public final class42 method2150(int arg0, int arg1, class42 arg2, int arg3, int arg4, byte arg5) {
        int var7 = this.field4877[arg0];
        field4880++;
        int var8 = this.field4885[arg0];
        class133 var9 = class198.method1354(var8 >> 16, (byte) 74);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method349(true, true, true);
        }
        int var11 = arg1 & 0x3;
        class133 var12 = null;
        if ((this.field4859 || class139.field2362) && arg4 != -1 && arg4 < this.field4885.length) {
            int var13 = this.field4885[arg4];
            var12 = class198.method1354(var13 >> 16, (byte) 74);
            arg4 = var13 & 0xFFFF;
        }
        class42 var14;
        if (var12 == null) {
            var14 = arg2.method349(!var9.method936(21603, var10), !var9.method939(var10, 123), !this.field4862);
        } else {
            var14 = arg2.method349(!var9.method936(21603, var10) & !var12.method936(21603, arg4), !var9.method939(var10, 109) & !var12.method939(arg4, 110), !this.field4862);
        }
        if (arg5 > -69) {
            return (class42) null;
        }
        if (this.field4862 && class241.field4016) {
            if (var11 == 1) {
                ((class294) var14).method2114();
            } else if (var11 == 2) {
                ((class294) var14).method2082();
            } else if (var11 == 3) {
                ((class294) var14).method2086();
            }
        } else if (var11 == 1) {
            var14.method354();
        } else if (var11 == 2) {
            var14.method341();
        } else if (var11 == 3) {
            var14.method343();
        }
        var14.method335(var9, var10, var12, arg4, arg3 - 1, var7, this.field4862);
        if (this.field4862 && class241.field4016) {
            if (var11 == 1) {
                ((class294) var14).method2086();
            } else if (var11 == 2) {
                ((class294) var14).method2082();
            } else if (var11 == 3) {
                ((class294) var14).method2114();
            }
        } else if (var11 == 1) {
            var14.method343();
        } else if (var11 == 2) {
            var14.method341();
        } else if (var11 == 3) {
            var14.method354();
        }
        return var14;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lhb;IIIIB)Lhb;", line = 563)
    public final class42 method2151(class42 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4861++;
        int var7 = this.field4877[arg1];
        int var8 = this.field4885[arg1];
        class133 var9 = class198.method1354(var8 >> 16, (byte) 74);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method347(true, true, true);
        }
        int var11 = arg4 & 0x3;
        if (arg5 > -105) {
            field4887 = 2;
        }
        class133 var12 = null;
        if ((this.field4859 || class139.field2362) && arg2 != -1 && this.field4885.length > arg2) {
            int var13 = this.field4885[arg2];
            var12 = class198.method1354(var13 >> 16, (byte) 74);
            arg2 = var13 & 0xFFFF;
        }
        class42 var14;
        if (var12 == null) {
            var14 = arg0.method347(!var9.method936(21603, var10), !var9.method939(var10, 107), !this.field4862);
        } else {
            var14 = arg0.method347(!var9.method936(21603, var10) & !var12.method936(21603, arg2), !var9.method939(var10, 127) & !var12.method939(arg2, 117), !this.field4862);
        }
        if (class241.field4016 && this.field4862) {
            if (var11 == 1) {
                ((class294) var14).method2114();
            } else if (var11 == 2) {
                ((class294) var14).method2082();
            } else if (var11 == 3) {
                ((class294) var14).method2086();
            }
        } else if (var11 == 1) {
            var14.method354();
        } else if (var11 == 2) {
            var14.method341();
        } else if (var11 == 3) {
            var14.method343();
        }
        var14.method335(var9, var10, var12, arg2, arg3 - 1, var7, this.field4862);
        if (class241.field4016 && this.field4862) {
            if (var11 == 1) {
                ((class294) var14).method2086();
            } else if (var11 == 2) {
                ((class294) var14).method2082();
            } else if (var11 == 3) {
                ((class294) var14).method2114();
            }
        } else if (var11 == 1) {
            var14.method343();
        } else if (var11 == 2) {
            var14.method341();
        } else if (var11 == 3) {
            var14.method354();
        }
        return var14;
    }
}
