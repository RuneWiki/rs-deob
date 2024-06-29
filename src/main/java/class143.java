import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class143 {

    @OriginalMember(owner = "client!su", name = "d", descriptor = "Lsp;")
    private class452 field2189 = new class452();

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "Lsp;")
    private class452 field2193;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "[Lrd;")
    public static class224[] field2191;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)Lsp;")
    public final class452 method1019(int arg0) {
        field2190++;
        class452 var2 = this.field2189.field6598;
        if (arg0 != 65408) {
            this.field2193 = null;
        }
        if (this.field2189 == var2) {
            return null;
        } else {
            var2.method2754(arg0 ^ 0xF6E49DE0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BII)I")
    public static final int method1020(byte arg0, int arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        field2195++;
        int var4 = -6 / ((arg0 - 74) / 47);
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lsp;I)V")
    public final void method1021(class452 arg0, int arg1) {
        if (arg1 > -78) {
            method1025(-120);
        }
        field2192++;
        if (arg0.field6603 != null) {
            arg0.method2754(-152804768);
        }
        arg0.field6603 = this.field2189.field6603;
        arg0.field6598 = this.field2189;
        arg0.field6603.field6598 = arg0;
        arg0.field6598.field6603 = arg0;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)Lsp;")
    public final class452 method1022(int arg0) {
        field2194++;
        if (arg0 != -3) {
            return null;
        }
        class452 var2 = this.field2193;
        if (this.field2189 == var2) {
            this.field2193 = null;
            return null;
        } else {
            this.field2193 = var2.field6598;
            return var2;
        }
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(I)I")
    public final int method1023(int arg0) {
        field2187++;
        int var2 = 0;
        class452 var3 = this.field2189.field6598;
        if (arg0 <= 104) {
            field2191 = null;
        }
        while (this.field2189 != var3) {
            var3 = var3.field6598;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)Lsp;")
    public final class452 method1024(byte arg0) {
        field2188++;
        if (arg0 <= 66) {
            this.method1019(62);
        }
        class452 var2 = this.field2189.field6598;
        if (this.field2189 == var2) {
            this.field2193 = null;
            return null;
        } else {
            this.field2193 = var2.field6598;
            return var2;
        }
    }

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(I)V")
    public static void method1025(int arg0) {
        if (arg0 != -127) {
            field2191 = null;
        }
        field2191 = null;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
    public class143() {
        this.field2189.field6603 = this.field2189;
        this.field2189.field6598 = this.field2189;
    }

    @OriginalMember(owner = "client!su", name = "e", descriptor = "(I)V")
    public final void method1026(int arg0) {
        while (true) {
            class452 var2 = this.field2189.field6598;
            if (this.field2189 == var2) {
                field2186++;
                this.field2193 = null;
                if (arg0 != -15663) {
                    field2191 = null;
                    return;
                }
                return;
            }
            var2.method2754(-152804768);
        }
    }
}
