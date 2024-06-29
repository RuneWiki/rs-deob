import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Ljd;")
    public class90 field113 = new class90();

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field98 = 0;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field104 = 7759444;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lrf;")
    public static class163 field97 = class53.method392(110, "Texturen geladen)3");

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field106 = 0;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
    public static volatile boolean field102 = false;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lrf;")
    public static class163 field110 = class53.method392(-87, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field100 = 0;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Lrf;")
    public static class163 field114 = class53.method392(-109, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Ljd;")
    private class90 field117;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "[Lpf;")
    public static class145[] field112;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Ljd;")
    public final class90 method45(int arg0) {
        field99++;
        class90 var2 = this.field113.field1942;
        if (this.field113 == var2) {
            return null;
        } else if (arg0 == 0) {
            var2.method630(arg0 + 27);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Ljd;")
    public final class90 method46(int arg0) {
        field107++;
        int var2 = 55 % ((-arg0 - 48) / 50);
        class90 var3 = this.field113.field1942;
        if (this.field113 == var3) {
            this.field117 = null;
            return null;
        } else {
            this.field117 = var3.field1942;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)Ljd;")
    public final class90 method47(int arg0) {
        if (arg0 <= 112) {
            return null;
        }
        field111++;
        class90 var2 = this.field117;
        if (this.field113 == var2) {
            this.field117 = null;
            return null;
        } else {
            this.field117 = var2.field1948;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Ljd;")
    public final class90 method48(int arg0) {
        field105++;
        class90 var2 = this.field113.field1948;
        if (this.field113 == var2) {
            this.field117 = null;
            return null;
        }
        this.field117 = var2.field1948;
        if (arg0 != 0) {
            this.method51(84, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static void method49(boolean arg0) {
        if (!arg0) {
            method49(false);
        }
        field114 = null;
        field112 = null;
        field97 = null;
        field110 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLjd;Ljd;)V")
    public final void method50(boolean arg0, class90 arg1, class90 arg2) {
        if (arg2.field1948 != null) {
            arg2.method630(16);
        }
        arg2.field1942 = arg1;
        field101++;
        arg2.field1948 = arg1.field1948;
        arg2.field1948.field1942 = arg2;
        arg2.field1942.field1948 = arg2;
        if (arg0) {
            this.field117 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjd;)V")
    public final void method51(int arg0, class90 arg1) {
        field103++;
        if (arg1.field1948 != null) {
            arg1.method630(61);
        }
        arg1.field1942 = this.field113;
        if (arg0 != 0) {
            this.method45(-8);
        }
        arg1.field1948 = this.field113.field1948;
        arg1.field1948.field1942 = arg1;
        arg1.field1942.field1948 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljd;I)V")
    public final void method52(class90 arg0, int arg1) {
        if (arg1 != 0) {
            field112 = null;
        }
        if (arg0.field1948 != null) {
            arg0.method630(51);
        }
        field115++;
        arg0.field1948 = this.field113;
        arg0.field1942 = this.field113.field1942;
        arg0.field1948.field1942 = arg0;
        arg0.field1942.field1948 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)Ljd;")
    public final class90 method53(int arg0) {
        if (arg0 != 7759444) {
            return null;
        }
        field108++;
        class90 var2 = this.field117;
        if (this.field113 == var2) {
            this.field117 = null;
            return null;
        } else {
            this.field117 = var2.field1942;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public final void method54(byte arg0) {
        field109++;
        if (arg0 <= 89) {
            field102 = true;
        }
        while (true) {
            class90 var2 = this.field113.field1942;
            if (this.field113 == var2) {
                return;
            }
            var2.method630(43);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class5() {
        this.field113.field1942 = this.field113;
        this.field113.field1948 = this.field113;
    }
}
