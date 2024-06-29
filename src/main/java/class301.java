import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class301 extends class86 {

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    private int field4671 = 2048;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    private int field4676 = 10;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    private int field4673 = 0;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field4669 = 0;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4672 = null;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "[Lni;")
    public static class68[] field4677 = new class68[8];

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    public static int field4680 = 0;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "Lrn;")
    public static class18 field4678;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "Lcn;")
    public static class37 field4683;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "[I")
    private int[] field4670;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "[I")
    private int[] field4679;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 13)
    public final void method476(int arg0) {
        field4667++;
        this.method2170((byte) -109);
        if (arg0 != 0) {
            this.method158(-128, 84);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)[I", line = 30)
    public final int[] method158(int arg0, int arg1) {
        field4675++;
        if (arg1 <= 7) {
            method2172((byte) -31);
        }
        int[] var3 = this.field1225.method1914(arg0, 125);
        if (this.field1225.field3995) {
            int var4 = class135.field2257[arg0];
            if (this.field4673 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field4676; var12++) {
                    if (this.field4670[var12] <= var4 && this.field4670[var12 + 1] > var4) {
                        if (this.field4679[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class65.method639(var3, 0, class93.field1424, var11);
            } else {
                for (int var5 = 0; var5 < class93.field1424; var5++) {
                    int var6 = 0;
                    int var7 = class347.field5515[var5];
                    int var8 = this.field4673;
                    if (var8 == 1) {
                        var6 = var7;
                    } else if (var8 == 2) {
                        var6 = (var7 + var4 - 4096 >> 1) + 2048;
                    } else if (var8 == 3) {
                        var6 = (var7 - var4 >> 1) + 2048;
                    }
                    short var9 = 0;
                    for (int var10 = 0; var10 < this.field4676; var10++) {
                        if (var6 >= this.field4670[var10] && this.field4670[var10 + 1] > var6) {
                            if (this.field4679[var10] > var6) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(II)I", line = 144)
    public static int method2169(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 256)
    public class301() {
        super(0, true);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V", line = 155)
    private final void method2170(byte arg0) {
        int var2 = 0;
        this.field4679 = new int[this.field4676 + 1];
        this.field4670 = new int[this.field4676 + 1];
        field4668++;
        int var3 = 4096 / this.field4676;
        int var4 = this.field4671 * var3 >> 12;
        if (arg0 > -104) {
            return;
        }
        for (int var5 = 0; var5 < this.field4676; var5++) {
            this.field4670[var5] = var2;
            this.field4679[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4670[this.field4676] = 4096;
        this.field4679[this.field4676] = this.field4679[0] + 4096;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[Ljava/lang/String;B[S)V", line = 204)
    public static final void method2171(int arg0, int arg1, String[] arg2, byte arg3, short[] arg4) {
        field4682++;
        if (arg1 < arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg1; var9 < arg0; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method2171(var6 - 1, arg1, arg2, (byte) -112, arg4);
            method2171(arg0, var6 + 1, arg2, (byte) -77, arg4);
        }
        int var12 = -60 % ((-arg3 - 7) / 52);
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V", line = 261)
    public static void method2172(byte arg0) {
        field4678 = null;
        field4677 = null;
        field4672 = null;
        field4683 = null;
        if (arg0 >= -100) {
            method2171(109, -122, (String[]) null, (byte) -23, (short[]) null);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLug;)V", line = 287)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg0 == 0) {
            this.field4676 = arg2.method281(24);
        } else if (arg0 == 1) {
            this.field4671 = arg2.method314((byte) 108);
        } else if (arg0 == 2) {
            this.field4673 = arg2.method281(33);
        }
        field4674++;
        if (arg1) {
            this.method2170((byte) 20);
        }
    }
}
