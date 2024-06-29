import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class395 {

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lv;")
    private class165 field5610;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Ljn;")
    public static class134 field5605 = new class134(50, 4);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lig;")
    public static class141 field5616;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lae;")
    public static class283 field5615;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lsja;")
    private class69 field5613;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILv;)V", line = 4)
    public final void method2433(int arg0, class165 arg1) {
        field5609++;
        this.field5610 = arg1;
        if (arg0 != 16) {
            field5616 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 17)
    public static final void method2434(byte arg0) {
        int var1 = 64 % ((arg0 - 32) / 59);
        field5607++;
        if (!class590.field8317) {
            class590.field8317 = true;
            class109.field1314 = true;
            class256.field3781 += (12.0F - class256.field3781) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 32)
    public static final int method2435(String arg0, int arg1) {
        field5606++;
        if (arg1 != 1) {
            field5615 = null;
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V", line = 49)
    public static void method2436(byte arg0) {
        field5616 = null;
        field5615 = null;
        field5605 = null;
        if (arg0 != 72) {
            field5616 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lsja;", line = 63)
    public final class69 method2437(int arg0) {
        field5614++;
        class69 var2 = this.field5610.field2103.field767;
        if (arg0 != 1316) {
            return null;
        } else if (this.field5610.field2103 == var2) {
            this.field5613 = null;
            return null;
        } else {
            this.field5613 = var2.field767;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)C", line = 85)
    public static final char method2438(byte arg0, int arg1) {
        field5612++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (arg1 != -128) {
            field5605 = null;
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class171.field2172[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Lsja;", line = 115)
    public final class69 method2439(int arg0) {
        field5611++;
        if (arg0 != 5154) {
            method2436((byte) 43);
        }
        class69 var2 = this.field5613;
        if (this.field5610.field2103 == var2) {
            this.field5613 = null;
            return null;
        } else {
            this.field5613 = var2.field767;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 140)
    public class395() {
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lv;)V", line = 143)
    public class395(class165 arg0) {
        this.field5610 = arg0;
    }
}
