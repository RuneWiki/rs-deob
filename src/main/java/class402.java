import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class402 {

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "Lhn;")
    public static class509 field5969 = new class509(82, 10);

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "[I")
    public static int[] field5975 = new int[99];

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "Lob;")
    public static class521 field5976;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public int field5973;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "Ltb;")
    public class276 field5968;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "[I")
    public int[] field5972;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
    public static final void method2515(byte arg0) {
        if (arg0 == -18) {
            field5970++;
            class368.method2297(-1);
            class92.method746(980099212);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V")
    public static void method2516(boolean arg0) {
        field5975 = null;
        if (arg0) {
            field5976 = null;
        }
        field5969 = null;
        field5976 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public static final void method2517(int arg0) {
        class366.field5393 = null;
        class48.field612 = null;
        class313.field4722 = null;
        class68.field871 = null;
        class425.field6324 = null;
        class285.field4326 = null;
        class107.field1503 = null;
        class514.field7474 = null;
        class141.field2146 = null;
        field5971++;
        class424.field6318 = null;
        class296.field4508 = null;
        class460.field6697 = null;
        class132.field2030 = null;
        client.field3313 = null;
        class45.field585 = null;
        class185.field2805 = null;
        class530.field7740 = null;
        if (arg0 != 34) {
            field5969 = null;
        }
        class118.field1789 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZIJII)Ljava/lang/String;")
    public static final String method2518(boolean arg0, int arg1, long arg2, int arg3, int arg4) {
        field5974++;
        if (arg3 > -100) {
            method2518(true, 59, -18L, -67, -98);
        }
        char var6 = ',';
        char var7 = '.';
        if (arg1 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg2 < 0L) {
            arg2 = -arg2;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg2 * 10)));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field5975[var1] = var0 / 4;
        }
        field5976 = new class521(34, 8);
    }
}
