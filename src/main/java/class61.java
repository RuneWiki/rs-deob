import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class61 extends class295 {

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field948 = 0;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "Z")
    public static boolean field952 = true;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "[I")
    public static int[] field950 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "[Loq;")
    public class120[] field947;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "[[B")
    private byte[][] field944;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Z", line = 4)
    public final boolean method546(int arg0, byte arg1) {
        int var3 = -65 % ((43 - arg1) / 48);
        field943++;
        return this.field947[arg0].field1684;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V", line = 16)
    public static void method547(int arg0) {
        if (arg0 != 3) {
            field948 = 56;
        }
        field950 = null;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)V", line = 27)
    public static final void method548(byte arg0) {
        field954++;
        for (int var1 = -1; var1 < class174.field2579; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class134.field1921[var1];
            }
            class338 var6 = class220.field3044[var5];
            if (var6 != null && var6.field4969 > 0) {
                var6.field4969--;
                if (var6.field4969 == 0) {
                    var6.field4975 = null;
                }
            }
        }
        int var2 = 0;
        if (arg0 < 46) {
            method547(114);
        }
        while (class221.field3055 > var2) {
            int var3 = class209.field2891[var2];
            class127 var4 = class298.field4012[var3];
            if (var4 != null && var4.field4969 > 0) {
                var4.field4969--;
                if (var4.field4969 == 0) {
                    var4.field4975 = null;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILbi;II)V", line = 84)
    public static final void method549(int arg0, class139 arg1, int arg2, int arg3) {
        if (arg2 > -86) {
            return;
        }
        field951++;
        class179 var4 = arg1.method1091((byte) -91, class249.field3415);
        if (var4 == null) {
            return;
        }
        class249.field3415.method111(arg0, arg3, arg1.field2027 + arg0, arg3 - -arg1.field2011);
        if (class24.field433 >= 3) {
            class249.field3415.method154(-16777216, var4, arg0, arg3);
        } else {
            class27.field475.method731((float) arg1.field2027 / 2.0F + (float) arg0, (float) arg1.field2011 / 2.0F + (float) arg3, 4096, (int) (-class313.field4229) & 0x3FFF << 2, var4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(B)Z", line = 110)
    public final boolean method550(byte arg0) {
        field953++;
        if (this.field947 != null) {
            return true;
        }
        if (this.field944 == null) {
            if (!class293.field3961.method2645(this.field946, 31822)) {
                return false;
            }
            int[] var2 = class293.field3961.method2641(this.field946, -124);
            this.field944 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field944[var3] = class293.field3961.method2633(var2[var3], class331.method2109(arg0, -20), this.field946);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field944.length; var5++) {
            byte[] var14 = this.field944[var5];
            int var15 = var14[1] & 0xFF | var14[0] & 0xFF << 8;
            var4 &= class89.field1312.method2635(var15, (byte) 45);
        }
        if (!var4) {
            return false;
        }
        if (arg0 != 19) {
            this.field947 = null;
        }
        class166 var6 = new class166();
        int var7 = class293.field3961.method2626(this.field946, 36);
        this.field947 = new class120[var7];
        int[] var8 = class293.field3961.method2641(this.field946, -126);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field944[var9];
            int var11 = var10[1] & 0xFF | var10[0] & 0xFF << 8;
            class215 var12 = null;
            for (class215 var13 = (class215) var6.method1240((byte) -90); var13 != null; var13 = (class215) var6.method1245(1)) {
                if (var13.field2983 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class215(var11, class89.field1312.method2656(arg0 ^ 0x77, var11));
                var6.method1249(var12, (byte) -108);
            }
            this.field947[var8[var9]] = new class120(var10, var12);
        }
        this.field944 = null;
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Z", line = 222)
    public final boolean method551(int arg0, int arg1) {
        field945++;
        if (arg0 != 0) {
            method547(-11);
        }
        return this.field947[arg1].field1686;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I)V", line = 235)
    public class61(int arg0) {
        this.field946 = arg0;
    }
}
