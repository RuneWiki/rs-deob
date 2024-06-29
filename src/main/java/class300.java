import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class300 {

    @OriginalMember(owner = "client!a", name = "g", descriptor = "[I")
    public static int[] field4780 = new int[2];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lcg;")
    public static class49 field4775;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 4)
    public static void method2072(int arg0) {
        field4775 = null;
        if (arg0 != -2897) {
            method2074((byte) -63);
        }
        field4780 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V", line = 15)
    public static final void method2073(int arg0, int arg1) {
        class27.method248(52);
        class124.method1039(89);
        if (arg0 < 122) {
            return;
        }
        field4776++;
        int var2 = class254.method1766(arg1, 103).field4713;
        if (var2 == 0) {
            return;
        }
        int var3 = class116.field2006[arg1];
        if (var2 == 9) {
            class130.field2237 = var3;
        }
        if (var2 == 6) {
            class104.field1738 = var3;
        }
        if (var2 == 5) {
            class38.field554 = var3;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V", line = 56)
    public static final void method2074(byte arg0) {
        int var1 = -62 / ((arg0 - 53) / 56);
        field4778++;
        int var2 = 0;
        for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                if (class44.method394(var2, -98, class279.field4430, var4, var3, true)) {
                    var2++;
                }
                if (var2 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)V", line = 87)
    public static final void method2075(int arg0, boolean arg1) {
        class257.field4133.method469(-11815, arg0);
        if (!arg1) {
            method2074((byte) 92);
        }
        field4777++;
        class342.field5447.method469(-11815, arg0);
        class85.field1359.method469(-11815, arg0);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Ldj;", line = 122)
    public static final class354 method2076(int arg0, int arg1) {
        if (arg1 > -18) {
            field4780 = (int[]) null;
        }
        field4779++;
        class354 var2 = (class354) class341.field5438.method467(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class249.field4035.method441(false, 4, arg0);
        class354 var4 = new class354();
        if (var3 != null) {
            var4.method2467(new class336(var3), 22200, arg0);
        }
        class341.field5438.method465(var4, (long) arg0, (byte) 124);
        return var4;
    }
}
