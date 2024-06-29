import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class193 extends class107 {

    @OriginalMember(owner = "client!vda", name = "T", descriptor = "Z")
    public boolean field2989 = true;

    @OriginalMember(owner = "client!vda", name = "J", descriptor = "I")
    public static int field2979 = 0;

    @OriginalMember(owner = "client!vda", name = "I", descriptor = "[I")
    public static int[] field2978 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!vda", name = "L", descriptor = "[I")
    public static int[] field2981 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!vda", name = "D", descriptor = "I")
    public static int field2973 = 0;

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!vda", name = "A", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!vda", name = "B", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!vda", name = "E", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!vda", name = "F", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!vda", name = "K", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!vda", name = "M", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!vda", name = "N", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!vda", name = "P", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!vda", name = "Q", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!vda", name = "R", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!vda", name = "H", descriptor = "Lgj;")
    public static class660 field2977;

    @OriginalMember(owner = "client!vda", name = "U", descriptor = "Lor;")
    public class666 field2990;

    @OriginalMember(owner = "client!vda", name = "C", descriptor = "[I")
    private int[] field2972;

    @OriginalMember(owner = "client!vda", name = "O", descriptor = "[I")
    public int[] field2984;

    @OriginalMember(owner = "client!vda", name = "G", descriptor = "[Ljava/lang/String;")
    private String[] field2976;

    @OriginalMember(owner = "client!vda", name = "S", descriptor = "[[I")
    private int[][] field2988;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(JI)V")
    public static final void method1338(long arg0, int arg1) {
        field2975++;
        class4.field30.setTime(new Date(arg0));
        if (arg1 > -11) {
            field2973 = 88;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lea;Lea;I)V")
    public static final void method1339(class571 arg0, class571 arg1, int arg2) {
        field2974++;
        if (arg0.field8061 != null) {
            arg0.method3358(arg2 ^ 0xFFFF9531);
        }
        arg0.field8064 = arg1;
        arg0.field8061 = arg1.field8061;
        arg0.field8061.field8064 = arg0;
        arg0.field8064.field8061 = arg0;
        if (arg2 != -27321) {
            field2978 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(II)Luh;")
    public final class176 method1340(int arg0, int arg1) {
        field2982++;
        if (this.field2972 == null || arg0 < 0 || arg0 > this.field2972.length) {
            return null;
        } else if (arg1 > -44) {
            return null;
        } else {
            return class585.method3418((byte) -7, this.field2972[arg0]);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
    public final void method1341(int arg0) {
        if (arg0 <= 44) {
            method1339(null, null, -40);
        }
        if (this.field2984 != null) {
            for (int var2 = 0; var2 < this.field2984.length; var2++) {
                this.field2984[var2] = class746.method4158(this.field2984[var2], 32768);
            }
        }
        field2971++;
    }

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "(I)I")
    public final int method1342(int arg0) {
        field2985++;
        if (this.field2972 == null) {
            return 0;
        } else if (arg0 < 65) {
            return 39;
        } else {
            return this.field2972.length;
        }
    }

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "(I)Ljava/lang/String;")
    public final String method1343(int arg0) {
        if (arg0 != 25212) {
            this.method1343(45);
        }
        field2968++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2976 == null) {
            return "";
        }
        var2.append(this.field2976[0]);
        for (int var3 = 1; var3 < this.field2976.length; var3++) {
            var2.append("...");
            var2.append(this.field2976[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lso;B)Ljava/lang/String;")
    public final String method1344(class494 arg0, byte arg1) {
        field2970++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2972 != null) {
            for (int var4 = 0; var4 < this.field2972.length; var4++) {
                var3.append(this.field2976[var4]);
                var3.append(this.field2990.method3794(this.method1340(var4, -51), arg0.method2972(class585.method3418((byte) -125, this.field2972[var4]).field2737, -65), (byte) 127, this.field2988[var4]));
            }
        }
        if (arg1 <= 116) {
            field2973 = 45;
        }
        var3.append(this.field2976[this.field2976.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lso;BI)V")
    private final void method1345(class494 arg0, byte arg1, int arg2) {
        field2969++;
        if (arg2 == 1) {
            this.field2976 = class3.method22(true, '<', arg0.method2996(101));
        } else if (arg2 == 2) {
            int var4 = arg0.method2964((byte) 39);
            this.field2984 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2984[var5] = arg0.method2998(true);
            }
        } else if (arg2 == 3) {
            int var6 = arg0.method2964((byte) 118);
            this.field2972 = new int[var6];
            this.field2988 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method2998(true);
                class176 var9 = class585.method3418((byte) -113, var8);
                if (var9 != null) {
                    this.field2972[var7] = var8;
                    this.field2988[var7] = new int[var9.field2734];
                    for (int var10 = 0; var10 < var9.field2734; var10++) {
                        this.field2988[var7][var10] = arg0.method2998(true);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field2989 = false;
        }
        if (arg1 != 2) {
            this.method1349(106, -120, -43);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIII[B)V")
    public static final void method1346(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field2987++;
        if (arg2 != 4110) {
            field2973 = -19;
        }
        if (arg4 <= arg0) {
            return;
        }
        int var6 = arg4 - arg0 >> 2;
        int var7 = arg0 + arg1;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg4 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var7++] = 1;
                }
            }
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "([ILso;Z)V")
    public final void method1347(int[] arg0, class494 arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        field2986++;
        if (this.field2972 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2972.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = this.method1340(var4, -103).field2733;
            if (var5 > 0) {
                arg1.method2950((long) arg0[var4], var5, 7);
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "(B)V")
    public static void method1348(byte arg0) {
        if (arg0 <= 4) {
            field2978 = null;
        }
        field2981 = null;
        field2978 = null;
        field2977 = null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)I")
    public final int method1349(int arg0, int arg1, int arg2) {
        field2980++;
        if (arg2 < 34) {
            return -102;
        } else if (this.field2972 == null || arg0 < 0 || arg0 > this.field2972.length) {
            return -1;
        } else if (this.field2988[arg0] == null || arg1 < 0 || this.field2988[arg0].length < arg1) {
            return -1;
        } else {
            return this.field2988[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(Lso;B)V")
    public final void method1350(class494 arg0, byte arg1) {
        field2983++;
        while (true) {
            int var3 = arg0.method2964((byte) 122);
            if (var3 == 0) {
                if (arg1 > -1) {
                    field2978 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1345(arg0, (byte) 2, var3);
        }
    }
}
