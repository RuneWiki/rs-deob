import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class290 {

    @OriginalMember(owner = "client!is", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4635 = "Loaded input handler";

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field4639 = 0;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "[C")
    public static char[] field4636 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public int field4637;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "I")
    private int field4641;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static final void method1949(int arg0) {
        field4632++;
        class89.field1112.method335((byte) 99);
        class338.field5247.method335((byte) -95);
        class182.field2978.method335((byte) 114);
        class84.field1047.method335((byte) -90);
        class7.field92.method335((byte) 115);
        if (arg0 != 1136) {
            field4639 = -44;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IILjg;Z)V")
    private final void method1950(int arg0, int arg1, class186 arg2, boolean arg3) {
        if (!arg3) {
            this.method1951(-36, (class186) null, (byte) 10);
        }
        if (arg0 == 1) {
            this.field4641 = arg2.method1272((byte) -53);
        } else if (arg0 == 2) {
            this.field4637 = arg2.method1322(false);
            this.field4633 = arg2.method1322(false);
        }
        field4640++;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjg;B)V")
    public final void method1951(int arg0, class186 arg1, byte arg2) {
        field4630++;
        if (arg2 < 43) {
            method1949(-83);
        }
        while (true) {
            int var4 = arg1.method1322(false);
            if (var4 == 0) {
                return;
            }
            this.method1950(var4, arg0, arg1, true);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
    public static final void method1952(int arg0, int arg1, int arg2) {
        class232 var3 = class423.field6252[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field3873 != null) {
            var3.field3873 = null;
        }
        if (var3.field3872 != null) {
            var3.field3872 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V")
    public static void method1953(boolean arg0) {
        field4636 = null;
        field4635 = null;
        if (arg0) {
            field4631 = 120;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Lvp;")
    public final class100 method1954(int arg0) {
        field4638++;
        class100 var2 = (class100) class121.field1663.method331((byte) 69, (long) this.field4641);
        if (var2 != null) {
            return var2;
        }
        class100 var3 = class100.method756(class179.field2931, this.field4641, 0);
        if (var3 != null) {
            class121.field1663.method341(64, (long) this.field4641, var3);
        }
        int var4 = -96 / ((17 - arg0) / 44);
        return var3;
    }
}
