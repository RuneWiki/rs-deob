import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class55 extends class46 {

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "Lmb;")
    private class132 field933 = class213.field3894;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "Lmb;")
    public static class132 field930 = class166.method1092("Verbindung konnte nicht hergestellt werden)3", 120);

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "Lmb;")
    public static class132 field935 = class166.method1092("loc)3dat", 123);

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "Lmb;")
    public static class132 field936 = class166.method1092("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", 127);

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public static int field923 = 0;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "Lmb;")
    public static class132 field926 = class166.method1092(":duelfriend:", 124);

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "Llc;")
    public static class122 field927 = new class122(8);

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field941 = 0;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public static int field942 = -2;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "Llc;")
    private class122 field934;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "Loc;")
    public static class155 field943;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)Lmb;")
    public final class132 method374(byte arg0, int arg1) {
        field928++;
        if (this.field934 == null) {
            return this.field933;
        }
        class34 var3 = (class34) this.field934.method806(-1, (long) arg1);
        if (var3 == null) {
            return this.field933;
        } else {
            if (arg0 < 108) {
                this.method379(null, false);
            }
            return var3.field561;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)Z")
    public static final boolean method375(boolean arg0) {
        if (!arg0) {
            method375(true);
        }
        field937++;
        return class39.field633 == 0 ? class34.field556.method171((byte) 107) : true;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZLkd;)V")
    private final void method376(int arg0, boolean arg1, class112 arg2) {
        if (arg1) {
            method375(true);
        }
        if (arg0 == 1) {
            this.field929 = arg2.method716(-1308);
        } else if (arg0 == 2) {
            this.field939 = arg2.method716(-1308);
        } else if (arg0 == 3) {
            this.field933 = arg2.method720((byte) 127);
        } else if (arg0 == 4) {
            this.field932 = arg2.method759(87);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method739(-124);
            this.field934 = new class122(class145.method975(1185900324, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method759(54);
                class151 var7;
                if (arg0 == 5) {
                    var7 = new class34(arg2.method720((byte) 102));
                } else {
                    var7 = new class171(arg2.method759(79));
                }
                this.field934.method810(var7, (long) var6, -18274);
            }
        }
        field924++;
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(B)V")
    public static void method377(byte arg0) {
        field943 = null;
        field930 = null;
        field927 = null;
        int var1 = -96 / ((arg0 + 31) / 61);
        field936 = null;
        field926 = null;
        field935 = null;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)I")
    public final int method378(int arg0, int arg1) {
        field938++;
        if (this.field934 == null) {
            return this.field932;
        }
        class171 var3 = (class171) this.field934.method806(-1, (long) arg0);
        if (arg1 == 18738) {
            return var3 == null ? this.field932 : var3.field3189;
        } else {
            return 47;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lkd;Z)V")
    public final void method379(class112 arg0, boolean arg1) {
        if (arg1) {
            this.method379(null, false);
        }
        field931++;
        while (true) {
            int var3 = arg0.method716(-1308);
            if (var3 == 0) {
                return;
            }
            this.method376(var3, false, arg0);
        }
    }
}
