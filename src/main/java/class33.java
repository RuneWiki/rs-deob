import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class33 {

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "Lsha;")
    private class757 field310;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "J")
    public long field318;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "Leo;")
    public static class313 field313 = new class313(1, 2);

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    public static int field316 = -1;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "Ljava/lang/String;")
    public static String field317 = null;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "Lal;")
    public static class109 field312;

    @OriginalMember(owner = "client!mca", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        field314++;
        this.field310.method4152((byte) -46, this.field318);
        super.finalize();
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Laf;B)I", line = 15)
    public static final int method181(class459 arg0, byte arg1) {
        field315++;
        int var2 = arg0.method2721(2, 1);
        if (arg1 >= -89) {
            method183(-80);
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method2721(5, 1);
        } else if (var2 == 2) {
            var3 = arg0.method2721(8, 1);
        } else {
            var3 = arg0.method2721(11, 1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 42)
    public static final Object method182(int arg0, byte[] arg1, boolean arg2) {
        field319++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == -19357) {
            if (arg1.length > 136 && !class115.field1556) {
                try {
                    class102 var3 = (class102) Class.forName("aia").getDeclaredConstructor().newInstance();
                    var3.method789(arg1, -102);
                    return var3;
                } catch (Throwable var4) {
                    class115.field1556 = true;
                }
            }
            return arg2 ? class382.method2372(arg1, arg0 + 19310) : arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V", line = 83)
    public static void method183(int arg0) {
        field313 = null;
        if (arg0 == 8) {
            field312 = null;
            field317 = null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)Z", line = 95)
    public static final boolean method184(byte arg0) {
        if (arg0 != 51) {
            return true;
        }
        field311++;
        class279 var1 = (class279) class769.field10591.method679((byte) -86);
        if (var1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < var1.field4035; var2++) {
            if (var1.field4036[var2] != null && var1.field4036[var2].field8405 == 0) {
                return false;
            }
            if (var1.field4049[var2] != null && var1.field4049[var2].field8405 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lsha;JI)V", line = 149)
    public class33(class757 arg0, long arg1, int arg2) {
        this.field310 = arg0;
        this.field318 = arg1;
    }
}
