import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class210 extends class317 {

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    private int field3033 = 0;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
    private int field3035 = 1;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    private int field3031 = 0;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public static int field3030 = -1;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "Lqc;")
    public static class99 field3029 = new class99(4);

    @OriginalMember(owner = "client!tl", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field3039 = new String[8];

    @OriginalMember(owner = "client!tl", name = "U", descriptor = "Lqc;")
    public static class99 field3038 = new class99(200);

    @OriginalMember(owner = "client!tl", name = "W", descriptor = "I")
    public static int field3040 = 0;

    @OriginalMember(owner = "client!tl", name = "ab", descriptor = "I")
    public static int field3044 = -1;

    @OriginalMember(owner = "client!tl", name = "Y", descriptor = "S")
    public static short field3042 = 205;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!tl", name = "Z", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!tl", name = "X", descriptor = "Lkm;")
    public static class133 field3041;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lcg;II)V", line = 7)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field3036++;
        int var4 = -35 % ((arg1 + 17) / 40);
        if (arg2 == 0) {
            this.field3033 = arg0.method2219(16448);
        } else if (arg2 == 1) {
            this.field3031 = arg0.method2219(16448);
        } else if (arg2 == 3) {
            this.field3035 = arg0.method2219(16448);
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V", line = 50)
    public class210() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)[I", line = 57)
    public final int[] method140(int arg0, int arg1) {
        field3028++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -32);
        if (arg0 != 542) {
            this.field3035 = -113;
        }
        if (this.field4847.field2751) {
            int var4 = class51.field693[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class326.field4933; var6++) {
                int var7 = class99.field1360[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field3033 == 0) {
                    var11 = (var7 - var4) * this.field3035;
                } else {
                    int var9 = var8 * var8 + (var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field3035 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field3031 == 0) {
                    var12 = class115.field1555[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field3031 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lkm;Lkm;Lkm;ILkm;)V", line = 131)
    public static final void method1473(class133 arg0, class133 arg1, class133 arg2, int arg3, class133 arg4) {
        field3027++;
        class23.field294 = arg1;
        class97.field1314 = arg4;
        class37.field422 = arg0;
        class89.field1258 = arg2;
        class241.field3419 = new class344[class89.field1258.method952((byte) 8)][];
        if (arg3 != -4096) {
            method1474((String) null, 98, false);
        }
        class157.field2170 = new boolean[class89.field1258.method952((byte) 112)];
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 148)
    public static final void method1474(String arg0, int arg1, boolean arg2) {
        field3032++;
        int var3 = 0;
        int var4 = arg2 ? 32768 : 0;
        String var5 = arg0.toLowerCase();
        short[] var6 = new short[16];
        int var7 = (arg2 ? class289.field4313 : class72.field997) + var4;
        for (int var8 = var4; var8 < var7; var8++) {
            class287 var9 = class142.method1023((byte) 27, var8);
            if (var9.field4270 && var9.method1974(arg1 - 773410763).toLowerCase().indexOf(var5) != -1) {
                if (var3 >= 50) {
                    class1.field2 = null;
                    class153.field2129 = -1;
                    return;
                }
                if (var6.length <= var3) {
                    short[] var10 = new short[var6.length * 2];
                    for (int var11 = 0; var11 < var3; var11++) {
                        var10[var11] = var6[var11];
                    }
                    var6 = var10;
                }
                var6[var3++] = (short) var8;
            }
        }
        class274.field4106 = 0;
        class1.field2 = var6;
        class153.field2129 = var3;
        String[] var12 = new String[class153.field2129];
        if (arg1 != 27856) {
            field3041 = (class133) null;
        }
        for (int var13 = 0; var13 < class153.field2129; var13++) {
            var12[var13] = class142.method1023((byte) 27, var6[var13]).method1974(-773382907);
        }
        class302.method2058(class1.field2, -3139, var12);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V", line = 224)
    public static final void method1475(boolean arg0) {
        if (class273.field4084 < class343.field5137) {
            class273.field4084 = (float) ((double) class273.field4084 / 30.0D + (double) class273.field4084);
            if (class273.field4084 > class343.field5137) {
                class273.field4084 = class343.field5137;
            }
            class93.method699(79);
        } else if (class273.field4084 > class343.field5137) {
            class273.field4084 = (float) ((double) class273.field4084 - (double) class273.field4084 / 30.0D);
            if (class273.field4084 < class343.field5137) {
                class273.field4084 = class343.field5137;
            }
            class93.method699(69);
        }
        if (arg0) {
            return;
        }
        field3037++;
        if (class126.field1721 == -1 || field3044 == -1) {
            return;
        }
        int var1 = field3044 - class170.field2315;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class170.field2315 += var1;
        int var2 = class126.field1721 - class312.field4712;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class312.field4712 += var2;
        if (var2 == 0 && var1 == 0) {
            field3044 = -1;
            class126.field1721 = -1;
        }
        class93.method699(54);
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V", line = 291)
    public static void method1476(int arg0) {
        field3038 = null;
        if (arg0 == -51) {
            field3041 = null;
            field3039 = null;
            field3029 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V", line = 312)
    public final void method546(int arg0) {
        if (arg0 != -21522) {
            field3044 = -28;
        }
        class98.method714((byte) -120);
        field3034++;
    }
}
