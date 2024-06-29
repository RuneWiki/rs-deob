import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class86 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Lda;")
    private class44 field1772;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "S")
    public static short field1766 = 1;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Los;")
    public static class309 field1775;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[I")
    public static int[] field1776;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[Lo;")
    public static class24[] field1767;

    static {
        new class309(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field1775 = new class309("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)[Lje;", line = 8)
    public static final class278[] method796(int arg0) {
        field1769++;
        if (arg0 != 1939) {
            field1775 = null;
        }
        return new class278[] { class267.field4052, class196.field3145, class263.field4014, class223.field3475, class257.field3944, class535.field7841, class499.field7327, class212.field3382, class271.field4113, class39.field564, class304.field4548, class470.field6968, class276.field4181, class458.field6790 };
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZBLik;Z)V", line = 20)
    public static final void method797(boolean arg0, byte arg1, class141 arg2, boolean arg3) {
        int var4 = -42 / ((25 - arg1) / 50);
        field1771++;
        int var5 = arg2.field2342;
        int var6 = (int) arg2.field3977;
        arg2.method1676(true);
        if (arg3) {
            class406.method2520(var5, -334);
        }
        class525.method3106(var5, (byte) -82);
        class388 var7 = class271.method1716(27411, var6);
        if (var7 != null) {
            class429.method2587(var7, (byte) -63);
        }
        method800(false);
        if (!arg0 && class155.field2523 != -1) {
            class187.method1277(class155.field2523, 1, -3816);
        }
        class107 var8 = new class107(class470.field6975);
        for (class141 var9 = (class141) var8.method913(true); var9 != null; var9 = (class141) var8.method914(114)) {
            if (!var9.method1677(-1)) {
                var9 = (class141) var8.method913(true);
                if (var9 == null) {
                    return;
                }
            }
            if (var9.field2338 == 3) {
                int var10 = (int) var9.field3977;
                if ((var10 >>> 16) == var5) {
                    method797(arg0, (byte) -83, var9, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 80)
    public static void method798(byte arg0) {
        field1767 = null;
        field1775 = null;
        field1776 = null;
        if (arg0 <= 78) {
            method796(-62);
        }
    }

    @OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V", line = 92)
    protected final void finalize() throws Throwable {
        this.field1772.method415((byte) -97, this.field1765);
        field1773++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIZ)Lsd;", line = 101)
    public static final class63 method799(int arg0, int arg1, boolean arg2) {
        field1770++;
        class63 var3 = new class63();
        if (arg2) {
            return null;
        }
        var3.field1286 = -1;
        var3.field1301 = -1;
        var3.field1273 = arg0 + 1 + 5;
        var3.field1287 = arg1 + 6;
        var3.field1283 = new int[var3.field1287][var3.field1273];
        var3.method555((byte) -101);
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 120)
    public static final void method800(boolean arg0) {
        field1768++;
        class328 var1 = (class328) class373.field5469.method1892(92);
        if (arg0) {
            method799(26, -107, false);
        }
        while (var1 != null) {
            if (class420.method2568((byte) -54, var1.field4972)) {
                class338.method2123(var1, (byte) 108);
            }
            var1 = (class328) class373.field5469.method1893((byte) -2);
        }
        if (class332.field5041 == 1) {
            class18.method120((byte) 67);
            return;
        }
        class205.method1403(0, class383.field5601, class280.field4218, class186.field2991, class229.field3561);
        int var2 = class272.field4126.method2808(class265.field4034.method1977(class146.field2452, -75), -77);
        for (class328 var3 = (class328) class373.field5469.method1892(98); var3 != null; var3 = (class328) class373.field5469.method1893((byte) -2)) {
            int var4 = class462.method2774((byte) 43, var3);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class383.field5601 = var2 + 8;
        class186.field2991 = (class192.field3105 ? 26 : 22) + class332.field5041 * 16;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 166)
    public static final void method801(int arg0) {
        class419.field6326 = new class388[class458.field6783.method2759(arg0 - 1931)][];
        field1774++;
        class329.field4994 = new class388[class458.field6783.method2759(16460)][];
        class182.field2935 = new boolean[class458.field6783.method2759(arg0 - 1931)];
        if (arg0 != 18391) {
            method797(false, (byte) 48, null, false);
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lda;II)V", line = 192)
    public class86(class44 arg0, int arg1, int arg2) {
        this.field1765 = arg2;
        this.field1772 = arg0;
    }
}
