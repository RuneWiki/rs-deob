import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class59 extends OutputStream {

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "[Lma;")
    public static class187[] field957 = new class187[28];

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lp;")
    private static class280 field958 = class18.method140((byte) -119, "flash3:");

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lp;")
    public static class280 field948 = field958;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lp;")
    public static class280 field953 = field958;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Ltg;")
    public static class180 field955;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[Lne;")
    public static class51[] field950;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "[S")
    public static short[] field956;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "[[[B")
    public static byte[][][] field954;

    @OriginalMember(owner = "client!ja", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field959++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method419(int arg0) {
        field950 = null;
        field948 = null;
        if (arg0 != -1770) {
            field950 = null;
        }
        field955 = null;
        field958 = null;
        field954 = null;
        field957 = null;
        field953 = null;
        field956 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 18 / ((40 - arg7) / 41);
        field949++;
        if (arg3 < 1 || arg6 < 1 || arg3 > 102 || arg6 > 102) {
            return;
        }
        if (!class215.method1436(104) && (class259.field4598[0][arg3][arg6] & 0x2) == 0) {
            int var9 = arg2;
            if ((class259.field4598[arg2][arg3][arg6] & 0x8) != 0) {
                var9 = 0;
            }
            if (class23.field427 != var9) {
                return;
            }
        }
        int var10 = arg2;
        if (arg2 < 3 && (class259.field4598[1][arg3][arg6] & 0x2) == 2) {
            var10 = arg2 + 1;
        }
        class215.method1446(var10, arg3, arg2, 104, arg1, arg6, class183.field3211[arg2]);
        if (arg5 < 0) {
            return;
        }
        boolean var11 = class12.field252;
        class12.field252 = true;
        class17.method131(arg4, false, var10, arg2, false, class183.field3211[arg2], arg5, arg0, arg6, arg3, 951286498);
        class12.field252 = var11;
        return;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIZ)V")
    public static final void method421(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class57.field928 = arg1;
        class86.field1411 = arg2;
        class18.field324 = arg3;
        class30.field563 = new class162[arg0][class57.field928][class86.field1411];
        class168.field2937 = new int[arg0][class57.field928 + 1][class86.field1411 + 1];
        if (arg4) {
            class25.field473 = new class162[1][class57.field928][class86.field1411];
            class126.field2204 = new int[class57.field928][class86.field1411];
            class265.field4670 = new int[1][class57.field928 + 1][class86.field1411 + 1];
        } else {
            class25.field473 = null;
            class126.field2204 = null;
            class265.field4670 = null;
        }
        class112.method781(false);
        class191.field3350 = new class33[500];
        class237.field4120 = 0;
        class132.field2355 = new class33[500];
        class57.field916 = 0;
        class3.field98 = new int[arg0][class57.field928 + 1][class86.field1411 + 1];
        class232.field4050 = new class160[5000];
        class230.field4012 = 0;
        class189.field3320 = new class160[100];
        class55.field905 = new boolean[class18.field324 + class18.field324 + 1][class18.field324 + class18.field324 + 1];
        class100.field1639 = new boolean[class18.field324 + class18.field324 + 2][class18.field324 + class18.field324 + 2];
        class249.field4353 = new byte[arg0][class57.field928][class86.field1411];
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)Lad;")
    public static final class248 method422(byte arg0, int arg1) {
        class248 var2 = (class248) class266.field4673.method1480((byte) 50, (long) arg1);
        field952++;
        if (var2 != null) {
            return var2;
        }
        int var3 = 114 % ((46 - arg0) / 62);
        byte[] var4 = class16.field298.method1258(class9.method92(arg1, (byte) 43), class44.method335(arg1, (byte) -91), (byte) 123);
        class248 var5 = new class248();
        if (var4 != null) {
            var5.method1676(0, new class25(var4));
        }
        class266.field4673.method1483((byte) -103, (long) arg1, var5);
        return var5;
    }
}
