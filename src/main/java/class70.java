import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class70 {

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lsc;")
    private static class128 field1568 = class129.method1017(false, "glow3:");

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "[[I")
    public static int[][] field1564 = new int[104][104];

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lsc;")
    public static class128 field1569 = field1568;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Lsc;")
    public static class128 field1576 = class129.method1017(false, "Versteckt");

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field1580 = 0;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Lsc;")
    private static class128 field1575 = class129.method1017(false, "Prepared visibility map");

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lsc;")
    public static class128 field1563 = field1575;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lsc;")
    public static class128 field1574 = field1568;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Lsf;")
    public static class131 field1567;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lua;")
    public static class140 field1571;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "[Li;")
    public static class56[] field1566;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method523(int arg0) {
        field1564 = null;
        field1569 = null;
        field1567 = null;
        field1575 = null;
        field1568 = null;
        field1563 = null;
        field1571 = null;
        field1574 = null;
        field1566 = null;
        field1576 = null;
        if (arg0 != 12) {
            method526((byte) -33);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([Lsc;III)Lsc;")
    public static final class128 method524(class128[] arg0, int arg1, int arg2, int arg3) {
        field1573++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg0[arg1 + var5] == null) {
                arg0[arg1 + var5] = class64.field1363;
            }
            var4 += arg0[arg1 + var5].field2920;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; var8++) {
            class128 var10 = arg0[arg1 + var8];
            class101.method768(var10.field2893, 0, var6, var7, var10.field2920);
            var7 += var10.field2920;
        }
        if (arg3 <= 14) {
            method527(109, -117);
        }
        class128 var9 = new class128();
        var9.field2920 = var4;
        var9.field2893 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(JZ)V")
    public static final void method525(long arg0, boolean arg1) {
        if (!arg1) {
            method527(-19, 0);
        }
        field1577++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class35.field675; var3++) {
            if (class54.field1106[var3] == arg0) {
                class21.field399++;
                class35.field675--;
                for (int var4 = var3; var4 < class35.field675; var4++) {
                    class111.field2502[var4] = class111.field2502[var4 + 1];
                    class12.field200[var4] = class12.field200[var4 + 1];
                    class54.field1106[var4] = class54.field1106[var4 + 1];
                    class11.field188[var4] = class11.field188[var4 + 1];
                }
                class75.field1648 = class135.field3186;
                class152.field3502.method507(-96, 142);
                class152.field3502.method651(-1070186000, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static final void method526(byte arg0) {
        if (arg0 < 77) {
            method523(28);
        }
        field1565++;
        if (class92.field2083 != null) {
            class92.field2083.method502((byte) -1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Ltb;")
    public static final class134 method527(int arg0, int arg1) {
        field1572++;
        class134 var2 = (class134) class42.field782.method917((long) arg1, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class23.field477.method1023(arg1, arg0, (byte) -35);
        class134 var4 = new class134();
        if (var3 != null) {
            var4.method1081(-2269, new class86(var3));
        }
        var4.method1091(-2);
        class42.field782.method913((long) arg1, var4, (byte) 119);
        return var4;
    }
}
