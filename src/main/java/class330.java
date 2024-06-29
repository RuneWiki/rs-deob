import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class330 extends class498 {

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Ljava/lang/String;")
    public String field4813;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Leh;")
    public static class246 field4815 = new class246(111, 7);

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "Lwm;")
    public static class403 field4816 = new class403(new byte[5000]);

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field4817 = 1;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "Ltd;")
    public static class320 field4819 = new class320();

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "Ltn;")
    public static class60 field4820 = new class60(16, 8);

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "Ldu;")
    public static class242 field4821 = new class242(4, 5);

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "[Lya;")
    public static class38[] field4818;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 5)
    public static void method1983(int arg0) {
        field4818 = null;
        field4820 = null;
        field4815 = null;
        field4819 = null;
        if (arg0 <= 60) {
            field4818 = null;
        }
        field4816 = null;
        field4821 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([Ljava/lang/Object;[IIZI)V", line = 24)
    public static final void method1984(Object[] arg0, int[] arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            method1984(null, null, 99, false, 9);
        }
        if (arg2 < arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg2;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg2; var10 < arg4; var10++) {
                if ((var9 & var10) + var7 > arg1[var10]) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    Object var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method1984(arg0, arg1, arg2, arg3, var6 - 1);
            method1984(arg0, arg1, var6 + 1, true, arg4);
        }
        field4814++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[B)Lvf;", line = 84)
    public static final class106 method1985(int arg0, byte[] arg1) {
        field4812++;
        class106 var2 = new class106();
        class403 var3 = new class403(arg1);
        var3.field5665 = var3.field5663.length - 2;
        int var4 = var3.method2338(0);
        int var5 = var3.field5663.length - var4 - 2 - 12;
        var3.field5665 = var5;
        int var6 = var3.method2319((byte) 95);
        var2.field1410 = var3.method2338(arg0);
        var2.field1399 = var3.method2338(0);
        var2.field1395 = var3.method2338(0);
        var2.field1406 = var3.method2338(0);
        int var7 = var3.method2357((byte) 104);
        if (var7 > 0) {
            var2.field1397 = new class406[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2338(0);
                class406 var10 = new class406(class280.method1749(arg0 ^ 0xFFFF8441, var9));
                var2.field1397[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method2319((byte) 97);
                    int var12 = var3.method2319((byte) 82);
                    var10.method2413((long) var11, new class254(var12), -1);
                }
            }
        }
        var3.field5665 = 0;
        var2.field1398 = var3.method2381(false);
        var2.field1405 = new int[var6];
        var2.field1407 = new int[var6];
        var2.field1394 = new String[var6];
        int var13 = 0;
        while (var3.field5665 < var5) {
            int var14 = var3.method2338(arg0);
            if (var14 == 3) {
                var2.field1394[var13] = var3.method2356(-25178).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1407[var13] = var3.method2357((byte) 123);
            } else {
                var2.field1407[var13] = var3.method2319((byte) 81);
            }
            var2.field1405[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 160)
    public class330() {
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 163)
    public class330(String arg0, int arg1) {
        this.field4813 = arg0;
    }
}
