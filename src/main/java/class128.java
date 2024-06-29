import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class128 extends class44 {

    @OriginalMember(owner = "client!vb", name = "yb", descriptor = "I")
    public int field3138 = 1000;

    @OriginalMember(owner = "client!vb", name = "vb", descriptor = "J")
    public static long field3135 = 0L;

    @OriginalMember(owner = "client!vb", name = "zb", descriptor = "La;")
    public static class1 field3139 = class113.method934(-11538, "@cya@");

    @OriginalMember(owner = "client!vb", name = "tb", descriptor = "[La;")
    public static class1[] field3133 = new class1[100];

    @OriginalMember(owner = "client!vb", name = "Gb", descriptor = "I")
    public static int field3146 = 0;

    @OriginalMember(owner = "client!vb", name = "Hb", descriptor = "La;")
    private static class1 field3147 = class113.method934(-11538, " from your friend list first");

    @OriginalMember(owner = "client!vb", name = "Bb", descriptor = "La;")
    public static class1 field3141 = field3147;

    @OriginalMember(owner = "client!vb", name = "Ib", descriptor = "La;")
    public static class1 field3148 = class113.method934(-11538, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!vb", name = "sb", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!vb", name = "Ab", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!vb", name = "Db", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!vb", name = "Eb", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!vb", name = "Fb", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!vb", name = "ub", descriptor = "Lu;")
    public static class120 field3134;

    @OriginalMember(owner = "client!vb", name = "xb", descriptor = "Le;")
    public static class25 field3137;

    @OriginalMember(owner = "client!vb", name = "Cb", descriptor = "[I")
    public static int[] field3142;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Z", line = 17)
    public static final boolean method1015(int arg0, int arg1) {
        field3136++;
        if (!class134.method1055(arg1, 127)) {
            return false;
        }
        class100[] var2 = class117.field2925[arg1];
        if (arg0 != 29378) {
            field3143 = 125;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.length; var4++) {
            class100 var5 = var2[var4];
            if (var5 != null && var5.field2492 == 6) {
                if (var5.field2468 != -1 || var5.field2462 != -1) {
                    boolean var6 = class115.method950(false, var5);
                    int var7;
                    if (var6) {
                        var7 = var5.field2462;
                    } else {
                        var7 = var5.field2468;
                    }
                    if (var7 != -1) {
                        class47 var8 = class4.method104(var7, 2);
                        var5.field2469 += class9.field322;
                        label55: while (true) {
                            do {
                                do {
                                    if (var8.field1225[var5.field2463] >= var5.field2469) {
                                        break label55;
                                    }
                                    var3 = true;
                                    var5.field2469 -= var8.field1225[var5.field2463];
                                    var5.field2463++;
                                } while (var5.field2463 < var8.field1244.length);
                                var5.field2463 -= var8.field1256;
                            } while (var5.field2463 >= 0 && var5.field2463 < var8.field1244.length);
                            var5.field2463 = 0;
                        }
                    }
                }
                if (var5.field2531 != 0) {
                    var3 = true;
                    int var9 = var5.field2531 >> 16;
                    int var10 = var5.field2531 << 16 >> 16;
                    int var11 = class9.field322 * var9;
                    var5.field2499 = var5.field2499 + var11 & 0x7FF;
                    int var12 = class9.field322 * var10;
                    var5.field2466 = var5.field2466 + var12 & 0x7FF;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIIII)V", line = 138)
    public void method770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3145++;
        class91 var10 = this.method42(-38);
        if (var10 != null) {
            this.field3138 = var10.field3138;
            var10.method770(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)Lpa;", line = 168)
    public class91 method42(int arg0) {
        int var2 = 87 / ((arg0 - 41) / 47);
        field3132++;
        return null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V", line = 187)
    public static void method1016(byte arg0) {
        field3148 = null;
        field3133 = null;
        if (arg0 > -112) {
            method1016((byte) 59);
        }
        field3137 = null;
        field3134 = null;
        field3147 = null;
        field3142 = null;
        field3139 = null;
        field3141 = null;
    }
}
