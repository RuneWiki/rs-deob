import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class395 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lbq;")
    public static class289 field5414 = new class289();

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Ldh;")
    public static class320 field5419 = new class320(15, 0);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Loh;")
    public static class404 field5420;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)[Luw;", line = 4)
    public static final class416[] method2420(int arg0) {
        field5418++;
        if (arg0 != 0) {
            field5419 = null;
        }
        return new class416[] { class324.field4143, class289.field3554, class202.field2398 };
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 17)
    public static void method2421(byte arg0) {
        field5419 = null;
        field5420 = null;
        field5414 = null;
        if (arg0 != -7) {
            method2424(-39);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIZILjava/lang/String;Lha;I)V", line = 30)
    public static final void method2422(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5, class58 arg6, int arg7) {
        field5416++;
        if (class309.field3842 == null || class743.field10379 == null) {
            if (class394.field5410.method2463((byte) 109, class261.field3242) && class394.field5410.method2463((byte) 99, class608.field8641)) {
                class309.field3842 = arg6.method434(class155.method953(class394.field5410, class261.field3242, 0), true);
                class155 var8 = class155.method953(class394.field5410, class608.field8641, 0);
                class743.field10379 = arg6.method434(var8, true);
                var8.method947();
                class286.field3511 = arg6.method434(var8, true);
            } else {
                arg6.method370(arg4, arg2, arg0, arg7, class275.field3369 | 255 - class738.field10316 << 24, 1);
            }
        }
        if (class309.field3842 != null && class743.field10379 != null) {
            int var9 = (arg0 - (class743.field10379.method503() * 2)) / class309.field3842.method503();
            for (int var10 = 0; var10 < var9; var10++) {
                class309.field3842.method824(arg4 + (class743.field10379.method503() + (class309.field3842.method503() * var10)), arg2);
            }
            class743.field10379.method824(arg4, arg2);
            class286.field3511.method824(arg4 + arg0 - class286.field3511.method503(), arg2);
        }
        class567.field8070.method442(arg4 + 3, -1, arg2 - -14, class697.field9813 | 0xFF000000, arg5, 0);
        arg6.method370(arg4, arg2 + arg7, arg0, arg1 - arg7, class275.field3369 | -class738.field10316 + 255 << 24, 1);
        if (!arg3) {
            method2424(114);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Z", line = 74)
    public static final boolean method2423(int arg0) {
        class442.field6417++;
        class619.field8851 = true;
        if (arg0 != 0) {
            field5419 = null;
        }
        field5417++;
        return true;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 87)
    public static final void method2424(int arg0) {
        class515.field7347 = 0;
        class261.field3244 = 0;
        field5415++;
        if (arg0 != -24112) {
            method2424(19);
        }
        for (int var1 = 0; var1 < class486.field6971; var1++) {
            int var2 = class712.field10031 * var1;
            for (int var3 = 0; var3 < class712.field10031; var3++) {
                int var4 = var2 + var3;
                class151.field1667[var4].method768(class125.field1313 * var3, class541.field7787 * var1, class125.field1313, class541.field7787, 0, 0, true, true);
            }
        }
    }
}
