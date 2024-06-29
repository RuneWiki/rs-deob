import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class259 extends class258 {

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Ljava/lang/String;")
    private String field3489 = null;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "J")
    private long field3491 = -1L;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Lgh;")
    public static class54 field3481 = new class54(15, 0, 1, 0);

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Luw;")
    public static class208 field3486 = new class208(47, -1);

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Ltea;")
    public static class589 field3483;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "Lap;")
    public static class610 field3487;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLmc;)V")
    public final void method546(byte arg0, class234 arg1) {
        field3485++;
        int var3 = -111 / ((arg0 - 7) / 41);
        if (arg1.method1509(true) != 255) {
            arg1.field3133--;
            this.field3491 = arg1.method1516(-11290);
        }
        this.field3489 = arg1.method1508(8);
        if (class346.field4235) {
            System.out.println("memberhash:" + this.field3491 + " membername:" + this.field3489);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lim;B)V")
    public final void method547(class652 arg0, byte arg1) {
        arg0.method3516(this.field3489, 1, this.field3491);
        field3490++;
        if (arg1 <= 123) {
            method1656(101, -99, -93, false, (byte) 8, 60);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method1653(byte arg0) {
        class497.field6373 = 200;
        field3480++;
        if (arg0 != -102) {
            method1655(null, true, -5, -51, 31, true, 48L, 75, -123, -63L, -112, null, true);
        }
        class564.field7166 = (int) ((double) class240.field3280 * 34.46D);
        class564.field7166 <<= 0x2;
        if (class576.field7320.method992()) {
            class564.field7166 += 512;
        }
        class351.method2027((byte) -107, false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static void method1654(boolean arg0) {
        field3486 = null;
        if (!arg0) {
            field3487 = null;
        }
        field3483 = null;
        field3487 = null;
        field3481 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;ZIIIZJIIJILjava/lang/String;Z)V")
    public static final void method1655(String arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, long arg6, int arg7, int arg8, long arg9, int arg10, String arg11, boolean arg12) {
        field3488++;
        if (!class525.field6678 && class628.field7982 < 500 && arg4 == 6070) {
            int var15 = arg3 == -1 ? class20.field185 : arg3;
            class765 var16 = new class765(arg0, arg11, var15, arg8, arg2, arg6, arg10, arg7, arg12, arg1, arg9, arg5);
            class264.method1673(8212, var16);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIZBI)V")
    public static final void method1656(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        field3482++;
        long var6 = (long) (arg5 | (arg3 ? Integer.MIN_VALUE : 0));
        if (arg4 < 69) {
            field3483 = null;
        }
        class148 var8 = (class148) class85.field1197.method2616(var6, (byte) -111);
        if (var8 == null) {
            var8 = new class148();
            class85.field1197.method2619(var8, var6, -1);
        }
        if (arg1 >= var8.field1892.length) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; var11 < var8.field1892.length; var11++) {
                var9[var11] = var8.field1892[var11];
                var10[var11] = var8.field1884[var11];
            }
            for (int var12 = var8.field1892.length; var12 < arg1; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field1884 = var10;
            var8.field1892 = var9;
        }
        var8.field1892[arg1] = arg2;
        var8.field1884[arg1] = arg0;
    }
}
