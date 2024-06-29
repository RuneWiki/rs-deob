import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class477 extends class356 {

    @OriginalMember(owner = "client!baa", name = "I", descriptor = "Z")
    public boolean field6951 = true;

    @OriginalMember(owner = "client!baa", name = "v", descriptor = "Z")
    public static boolean field6938 = false;

    @OriginalMember(owner = "client!baa", name = "u", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!baa", name = "w", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!baa", name = "x", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!baa", name = "y", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!baa", name = "B", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!baa", name = "C", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!baa", name = "E", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!baa", name = "F", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!baa", name = "H", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!baa", name = "J", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!baa", name = "K", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!baa", name = "G", descriptor = "Lnba;")
    public class268 field6949;

    @OriginalMember(owner = "client!baa", name = "A", descriptor = "Lgp;")
    public static class45 field6943;

    @OriginalMember(owner = "client!baa", name = "M", descriptor = "[I")
    private int[] field6955;

    @OriginalMember(owner = "client!baa", name = "N", descriptor = "[I")
    public int[] field6956;

    @OriginalMember(owner = "client!baa", name = "L", descriptor = "[Ljava/lang/String;")
    private String[] field6954;

    @OriginalMember(owner = "client!baa", name = "D", descriptor = "[[I")
    private int[][] field6946;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V", line = 3)
    public final void method2781(byte arg0) {
        if (this.field6956 != null) {
            for (int var2 = 0; var2 < this.field6956.length; var2++) {
                this.field6956[var2] = class139.method776(this.field6956[var2], 32768);
            }
        }
        int var3 = 126 / ((36 - arg0) / 57);
        field6939++;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILiaa;I)V", line = 35)
    private final void method2782(int arg0, class452 arg1, int arg2) {
        field6945++;
        if (arg2 != -3) {
            return;
        }
        if (arg0 == 1) {
            this.field6954 = class107.method674(arg1.method2516(68), arg2 ^ 0xFFFFFFFC, '<');
        } else if (arg0 == 2) {
            int var4 = arg1.method2541(arg2 + 84);
            this.field6956 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6956[var5] = arg1.method2574(-1758460248);
            }
            return;
        } else if (arg0 == 3) {
            int var6 = arg1.method2541(102);
            this.field6955 = new int[var6];
            this.field6946 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method2574(-1758460248);
                class108 var9 = class501.method2884((byte) -52, var8);
                if (var9 != null) {
                    this.field6955[var7] = var8;
                    this.field6946[var7] = new int[var9.field1252];
                    for (int var10 = 0; var10 < var9.field1252; var10++) {
                        this.field6946[var7][var10] = arg1.method2574(-1758460248);
                    }
                }
            }
            return;
        } else if (arg0 == 4) {
            this.field6951 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "(B)I", line = 111)
    public final int method2783(byte arg0) {
        if (arg0 < 27) {
            return 113;
        } else {
            field6953++;
            return this.field6955 == null ? 0 : this.field6955.length;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)Lfv;", line = 128)
    public final class108 method2784(int arg0, int arg1) {
        field6950++;
        if (this.field6955 == null || arg0 < 0 || this.field6955.length < arg0) {
            return null;
        } else {
            if (arg1 != -1) {
                field6938 = false;
            }
            return class501.method2884((byte) -52, this.field6955[arg0]);
        }
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)Ljava/lang/String;", line = 143)
    public final String method2785(int arg0) {
        int var2 = -87 / ((arg0 + 52) / 56);
        field6948++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field6954 == null) {
            return "";
        }
        var3.append(this.field6954[0]);
        for (int var4 = 1; var4 < this.field6954.length; var4++) {
            var3.append("...");
            var3.append(this.field6954[var4]);
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(III)I", line = 169)
    public final int method2786(int arg0, int arg1, int arg2) {
        field6941++;
        if (arg1 != 0) {
            this.method2783((byte) -8);
        }
        if (this.field6955 == null || arg2 < 0 || this.field6955.length < arg2) {
            return -1;
        } else if (this.field6946[arg2] == null || arg0 < 0 || arg0 > this.field6946[arg2].length) {
            return -1;
        } else {
            return this.field6946[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(II)V", line = 189)
    public static final void method2787(int arg0, int arg1) {
        if (arg0 == -1) {
            field6937++;
            class530 var2 = class242.method1402(-126, 8, arg1);
            var2.method3027((byte) -94);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILiaa;)V", line = 203)
    public final void method2788(int arg0, class452 arg1) {
        if (arg0 != -1) {
            field6943 = null;
        }
        field6952++;
        while (true) {
            int var3 = arg1.method2541(113);
            if (var3 == 0) {
                return;
            }
            this.method2782(var3, arg1, -3);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Liaa;I)Ljava/lang/String;", line = 226)
    public final String method2789(class452 arg0, int arg1) {
        if (arg1 < 108) {
            return null;
        }
        field6947++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field6955 != null) {
            for (int var4 = 0; var4 < this.field6955.length; var4++) {
                var3.append(this.field6954[var4]);
                var3.append(this.field6949.method1514((byte) -100, this.field6946[var4], this.method2784(var4, -1), arg0.method2550(-123, class501.method2884((byte) -52, this.field6955[var4]).field1259)));
            }
        }
        var3.append(this.field6954[this.field6954.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "(II)V", line = 256)
    public static final void method2790(int arg0, int arg1) {
        class269 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class137 var4 = class275.field3477[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class272.field3451; var5++) {
                    for (int var6 = 0; var6 < class181.field2222; var6++) {
                        var2 = var4.method240(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class8.field70;
                            int var8 = var5 << class8.field70;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class137 var10 = class275.field3477[var9];
                                if (var10 != null) {
                                    int var11 = var4.method253(var6, var5) - var10.method253(var6, var5);
                                    int var12 = var4.method253(var6 + 1, var5) - var10.method253(var6 + 1, var5);
                                    int var13 = var4.method253(var6 + 1, var5 + 1) - var10.method253(var6 + 1, var5 + 1);
                                    int var14 = var4.method253(var6, var5 + 1) - var10.method253(var6, var5 + 1);
                                    var10.method251(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Liaa;[II)V", line = 321)
    public final void method2791(class452 arg0, int[] arg1, int arg2) {
        field6942++;
        if (this.field6955 == null) {
            return;
        }
        int var4 = 0;
        if (arg2 != 31544) {
            this.method2781((byte) 75);
        }
        while (this.field6955.length > var4) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = this.method2784(var4, -1).field1256;
            if (var5 > 0) {
                arg0.method2526((byte) 105, var5, (long) arg1[var4]);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lwba;FFBIFIIFIF)[B", line = 354)
    public static final byte[] method2792(class46 arg0, float arg1, float arg2, byte arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, float arg10) {
        if (arg3 != -77) {
            field6943 = null;
        }
        field6940++;
        byte[] var11 = new byte[arg6 * arg7 * arg9];
        class92.method583(arg7, arg10, 0, arg8, true, arg0, arg6, arg4, arg9, var11, arg2, arg5, arg1);
        return var11;
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "(I)V", line = 370)
    public static void method2793(int arg0) {
        if (arg0 != -5566) {
            method2787(-15, 65);
        }
        field6943 = null;
    }
}
