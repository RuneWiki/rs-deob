import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class10 extends class317 {

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    private int field102 = 0;

    @OriginalMember(owner = "client!mj", name = "gb", descriptor = "I")
    private int field109 = 0;

    @OriginalMember(owner = "client!mj", name = "kb", descriptor = "I")
    private int field113 = 0;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "Z")
    public static boolean field91 = false;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "Ljava/lang/String;")
    public static String field99 = "Hidden";

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "Ljava/lang/String;")
    public static String field87 = "Loading defaults - ";

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "[I")
    public static int[] field105 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!mj", name = "hb", descriptor = "Z")
    public static boolean field110 = false;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client!mj", name = "ib", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!mj", name = "jb", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "Lkm;")
    public static class133 field88;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "Lkm;")
    public static class133 field90;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "Z")
    public static boolean field93;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZZIII)V", line = 4)
    public static final void method52(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg0 > arg6) {
            int var7 = arg6;
            int var8 = (arg0 + arg6) / 2;
            class259 var9 = class262.field3848[var8];
            class262.field3848[var8] = class262.field3848[arg0];
            class262.field3848[arg0] = var9;
            for (int var10 = arg6; var10 < arg0; var10++) {
                if (class148.method1074(arg2, arg4, arg5, arg3, var9, (byte) -43, class262.field3848[var10]) <= 0) {
                    class259 var11 = class262.field3848[var10];
                    class262.field3848[var10] = class262.field3848[var7];
                    class262.field3848[var7++] = var11;
                }
            }
            class262.field3848[arg0] = class262.field3848[var7];
            class262.field3848[var7] = var9;
            method52(var7 - 1, -58, arg2, arg3, arg4, arg5, arg6);
            method52(arg0, -74, arg2, arg3, arg4, arg5, var7 + 1);
        }
        if (arg1 > -45) {
            method59(false, (byte) -116, -21L);
        }
        field89++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[[I", line = 50)
    public final int[][] method53(int arg0, int arg1) {
        field92++;
        int[][] var3 = this.field4840.method1625(arg1, -13241);
        int var4 = -116 / ((-arg0 - 31) / 37);
        if (this.field4840.field3352) {
            int[][] var5 = this.method2227(0, 65, arg1);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class326.field4933; var12++) {
                this.method55(var8[var12], var6[var12], var7[var12], true);
                this.field101 += this.field102;
                this.field103 += this.field109;
                while (this.field101 < 0) {
                    this.field101 += 4096;
                }
                this.field96 += this.field113;
                if (this.field103 < 0) {
                    this.field103 = 0;
                }
                if (this.field103 > 4096) {
                    this.field103 = 4096;
                }
                if (this.field96 < 0) {
                    this.field96 = 0;
                }
                if (this.field96 > 4096) {
                    this.field96 = 4096;
                }
                while (this.field101 > 4096) {
                    this.field101 -= 4096;
                }
                this.method54(this.field96, (byte) -120, this.field101, this.field103);
                var9[var12] = this.field108;
                var10[var12] = this.field94;
                var11[var12] = this.field100;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBII)V", line = 124)
    private final void method54(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = 33 % ((-arg1 - 16) / 50);
        field112++;
        int var6 = arg3 > 2048 ? arg0 + arg3 - (arg0 * arg3 >> 12) : (arg0 + 4096) * arg3 >> 12;
        if (var6 <= 0) {
            this.field108 = this.field94 = this.field100 = arg3;
            return;
        }
        int var7 = arg2 * 6;
        int var8 = arg3 + arg3 - var6;
        int var9 = (var6 - var8 << 12) / var6;
        int var10 = var7 >> 12;
        int var12 = var9 * var6 >> 12;
        int var13 = var7 - (var10 << 12);
        int var14 = var12 * var13 >> 12;
        int var15 = var8 + var14;
        int var16 = var6 - var14;
        if (var10 == 0) {
            this.field100 = var8;
            this.field94 = var15;
            this.field108 = var6;
        } else if (var10 == 1) {
            this.field108 = var16;
            this.field100 = var8;
            this.field94 = var6;
        } else if (var10 == 2) {
            this.field94 = var6;
            this.field100 = var15;
            this.field108 = var8;
        } else if (var10 == 3) {
            this.field108 = var8;
            this.field94 = var16;
            this.field100 = var6;
        } else if (var10 == 4) {
            this.field94 = var8;
            this.field100 = var6;
            this.field108 = var15;
        } else if (var10 == 5) {
            this.field108 = var6;
            this.field94 = var8;
            this.field100 = var16;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIZ)V", line = 230)
    private final void method55(int arg0, int arg1, int arg2, boolean arg3) {
        field111++;
        int var5 = arg1 < arg2 ? arg2 : arg1;
        int var6 = arg0 > var5 ? arg0 : var5;
        int var7 = arg1 > arg2 ? arg2 : arg1;
        int var8 = var7 <= arg0 ? var7 : arg0;
        int var9 = var6 - var8;
        if (var9 > 0) {
            int var10 = (var6 - arg2 << 12) / var9;
            int var11 = (var6 - arg1 << 12) / var9;
            int var12 = (var6 - arg0 << 12) / var9;
            if (arg2 == var6) {
                this.field101 = arg1 == var8 ? var12 + 20480 : -var11 + 4096;
            } else if (arg1 == var6) {
                this.field101 = arg0 == var8 ? var10 + 4096 : 12288 - var12;
            } else {
                this.field101 = arg2 == var8 ? var11 + 12288 : -var10 + 20480;
            }
            this.field101 /= 6;
        } else {
            this.field101 = 0;
        }
        this.field103 = (var6 + var8) / 2;
        if (this.field103 > 0 && this.field103 < 4096) {
            this.field96 = (var9 << 12) / (this.field103 <= 2048 ? this.field103 * 2 : 8192 - (this.field103 * 2));
        } else {
            this.field96 = 0;
        }
        if (!arg3) {
            method62(106, (char) 65520);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 291)
    public class10() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)I", line = 295)
    public static final int method56(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(II)V", line = 320)
    public static final void method57(int arg0, int arg1) {
        if (!class296.field4389) {
            arg1 = -1;
        }
        field106++;
        if (class338.field5083 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class327 var2 = class82.method641(arg1, arg0 ^ 0x21);
            class178 var3 = var2.method2288(0);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class165.field2258.method621(class150.field2079, var3.method1231(), var3.field2325, var3.field2319, new Point(var2.field4935, var2.field4940), 28581);
                class338.field5083 = arg1;
            }
        }
        if (~arg1 == arg0 && class338.field5083 != -1) {
            class165.field2258.method621(class150.field2079, (int[]) null, -1, -1, new Point(), 28581);
            class338.field5083 = -1;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLcg;)V", line = 359)
    public static final void method58(byte arg0, class316 arg1) {
        for (int var2 = 0; var2 < class188.field2604; var2++) {
            int var3 = arg1.method2193(arg0 ^ 0xFFFF3FDF);
            int var4 = arg1.method2220((byte) 99);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class226.field3238[var3] != null) {
                class226.field3238[var3].field2084 = var4;
            }
        }
        if (arg0 != -33) {
            method57(96, 107);
        }
        field95++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZBJ)V", line = 390)
    public static final void method59(boolean arg0, byte arg1, long arg2) {
        field107++;
        if (arg2 == 0L) {
            return;
        }
        if (class64.field826 >= 100) {
            class93.method695((byte) 121, 0, class123.field1662, "");
            return;
        }
        String var4 = class256.method1746(arg2, 0);
        for (int var5 = 0; var5 < class64.field826; var5++) {
            if (class143.field1966[var5] == arg2) {
                class93.method695((byte) -11, 0, var4 + class15.field174, "");
                return;
            }
        }
        for (int var6 = 0; var6 < class44.field535; var6++) {
            if (class89.field1254[var6] == arg2) {
                class93.method695((byte) 117, 0, class33.field396 + var4 + class143.field1964, "");
                return;
            }
        }
        int var7 = 122 % ((26 - arg1) / 50);
        if (var4.equals(class173.field2356.field3439)) {
            class93.method695((byte) 95, 0, class196.field2748, "");
            return;
        }
        class302.field4512++;
        class143.field1966[class64.field826] = arg2;
        class231.field3269[class64.field826] = class127.method916(arg2, (byte) -126);
        class113.field1551[class64.field826++] = arg0;
        class201.field2856 = class185.field2549;
        class90.field1264.method2238(131, (byte) -128);
        class90.field1264.method2202(arg2, -107);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lcg;II)V", line = 463)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field97++;
        int var4 = 113 / ((arg1 + 17) / 40);
        if (arg2 == 0) {
            this.field102 = arg0.method2161(28984);
        } else if (arg2 == 1) {
            this.field113 = (arg0.method2192(3) << 12) / 100;
        } else if (arg2 == 2) {
            this.field109 = (arg0.method2192(3) << 12) / 100;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 513)
    public static final String method61(int arg0, byte arg1) {
        field86++;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else {
            if (arg1 > -101) {
                method63((byte) 30);
            }
            return arg0 < 10000000 ? "<col=ffffff>" + arg0 / 1000 + class252.field3619 + "</col>" : "<col=00ff80>" + arg0 / 1000000 + class253.field3624 + "</col>";
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IC)Z", line = 530)
    public static final boolean method62(int arg0, char arg1) {
        if (arg0 != -5855) {
            return true;
        }
        field98++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)V", line = 559)
    public static void method63(byte arg0) {
        field99 = null;
        if (arg0 != 85) {
            method59(true, (byte) 118, 75L);
        }
        field87 = null;
        field105 = null;
        field90 = null;
        field88 = null;
    }
}
