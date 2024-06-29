import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class282 extends class254 {

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public int field5064 = 0;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "Z")
    public static volatile boolean field5062 = true;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "Llj;")
    public static class25 field5069 = new class25(32);

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "Lcf;")
    private static class93 field5072 = class147.method1066("flash2:", -48);

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "Lcf;")
    public static class93 field5071 = field5072;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "Lcf;")
    public static class93 field5070 = field5072;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILee;I)V")
    private final void method1933(int arg0, class280 arg1, int arg2) {
        if (arg0 != 4999) {
            field5072 = null;
        }
        field5066++;
        if (arg2 == 2) {
            this.field5064 = arg1.method1891(-126);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public static void method1934(int arg0) {
        field5070 = null;
        field5072 = null;
        field5071 = null;
        if (arg0 == -1) {
            field5069 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILee;)V")
    public final void method1935(int arg0, class280 arg1) {
        while (true) {
            int var3 = arg1.method1907(16832);
            if (var3 == 0) {
                if (arg0 < 61) {
                    this.method1935(4, (class280) null);
                }
                field5068++;
                return;
            }
            this.method1933(4999, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIILcf;I)V")
    public static final void method1936(int arg0, int arg1, int arg2, class93 arg3, int arg4) {
        field5065++;
        class181 var5 = class5.method21(arg2, arg0, (byte) 40);
        if (var5 == null) {
            return;
        }
        if (var5.field3242 != null) {
            class223 var6 = new class223();
            var6.field4017 = var5;
            var6.field4012 = arg3;
            var6.field4023 = arg4;
            var6.field4015 = var5.field3242;
            class106.method763(var6, (byte) 81);
        }
        boolean var7 = true;
        if (var5.field3218 > 0) {
            var7 = class266.method1776(var5, (byte) -113);
        }
        if (!var7 || !client.method1109(var5).method1440(arg1 - 49, arg1 + arg4)) {
            return;
        }
        if (arg4 == 1) {
            class155.field2705++;
            class285.field5105.method1568(145, (byte) 94);
            class285.field5105.method1886(arg2, 2);
            class285.field5105.method1908(-79, arg0);
        }
        if (arg4 == 2) {
            class175.field3041++;
            class285.field5105.method1568(223, (byte) 117);
            class285.field5105.method1886(arg2, arg1 + 3);
            class285.field5105.method1908(-123, arg0);
        }
        if (arg4 == 3) {
            class260.field4671++;
            class285.field5105.method1568(104, (byte) 106);
            class285.field5105.method1886(arg2, 2);
            class285.field5105.method1908(-111, arg0);
        }
        if (arg4 == 4) {
            class285.field5105.method1568(30, (byte) 91);
            class189.field3466++;
            class285.field5105.method1886(arg2, 2);
            class285.field5105.method1908(-117, arg0);
        }
        if (arg4 == 5) {
            class285.field5105.method1568(138, (byte) 90);
            class259.field4660++;
            class285.field5105.method1886(arg2, 2);
            class285.field5105.method1908(-87, arg0);
        }
        if (arg4 == 6) {
            class285.field5105.method1568(103, (byte) 102);
            class49.field786++;
            class285.field5105.method1886(arg2, arg1 + 3);
            class285.field5105.method1908(-109, arg0);
        }
        if (arg4 == 7) {
            class169.field2978++;
            class285.field5105.method1568(211, (byte) 91);
            class285.field5105.method1886(arg2, 2);
            class285.field5105.method1908(-117, arg0);
        }
        if (arg4 == 8) {
            class285.field5105.method1568(217, (byte) 95);
            class285.field5105.method1886(arg2, 2);
            class285.field5105.method1908(-77, arg0);
            class205.field3691++;
        }
        if (arg4 == 9) {
            class285.field5105.method1568(72, (byte) 65);
            class285.field5105.method1886(arg2, 2);
            client.field2717++;
            class285.field5105.method1908(arg1 - 94, arg0);
        }
        if (arg4 == 10) {
            class217.field3951++;
            class285.field5105.method1568(50, (byte) 98);
            class285.field5105.method1886(arg2, arg1 ^ 0xFFFFFFFD);
            class285.field5105.method1908(-120, arg0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)V")
    public static final void method1937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5067++;
        int var6 = class141.method1027(class26.field342, arg2, false, class271.field4820);
        int var7 = class141.method1027(class26.field342, arg5, false, class271.field4820);
        int var8 = class141.method1027(class277.field4967, arg4, false, class147.field2593);
        if (arg0 < 52) {
            method1936(-98, 96, -60, (class93) null, -70);
        }
        int var9 = class141.method1027(class277.field4967, arg3, false, class147.field2593);
        for (int var10 = var6; var10 <= var7; var10++) {
            class58.method337(var8, class76.field1406[var10], arg1, var9, false);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1938(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class210.field3821 = arg1;
        class256.field4623 = arg2;
        class11.field153 = arg3;
        class164.field2897 = new class41[arg0][class210.field3821][class256.field4623];
        class69.field1265 = new int[arg0][class210.field3821 + 1][class256.field4623 + 1];
        if (arg4) {
            class193.field3543 = new class41[1][class210.field3821][class256.field4623];
            class162.field2863 = new int[class210.field3821][class256.field4623];
            class270.field4815 = new int[1][class210.field3821 + 1][class256.field4623 + 1];
        } else {
            class193.field3543 = null;
            class162.field2863 = null;
            class270.field4815 = null;
        }
        class231.method1582(false);
        class108.field1855 = new class268[500];
        class280.field5029 = 0;
        class258.field4642 = new class268[500];
        class246.field4429 = 0;
        class208.field3732 = new int[arg0][class210.field3821 + 1][class256.field4623 + 1];
        class251.field4509 = new class229[5000];
        class24.field306 = 0;
        class264.field4701 = new class229[100];
        class15.field200 = new boolean[class11.field153 + class11.field153 + 1][class11.field153 + class11.field153 + 1];
        class167.field2953 = new boolean[class11.field153 + class11.field153 + 2][class11.field153 + class11.field153 + 2];
        class134.field2350 = new byte[arg0][class210.field3821][class256.field4623];
    }
}
