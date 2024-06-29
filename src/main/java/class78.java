import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class78 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    private int field1045;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lld;")
    public static class105 field1050 = new class105();

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lh;")
    public static class434 field1052 = new class434(81, 8);

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[[Z")
    public static boolean[][] field1055 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lld;")
    public static class105 field1054 = new class105();

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "[I")
    public static int[] field1056 = new int[8];

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method513(int arg0) {
        field1051++;
        if (!class289.field3899) {
            return;
        }
        class464 var1 = method519(class210.field2841, class38.field559, (byte) -72);
        if (var1 != null && var1.field6421 != null) {
            class82 var2 = new class82();
            var2.field1086 = var1;
            var2.field1085 = var1.field6421;
            class382.method2340(var2);
        }
        class289.field3899 = false;
        class97.field1417 = arg0;
        class336.field4538 = -1;
        if (var1 != null) {
            class490.method2854(var1, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!mc", name = "toString", descriptor = "()Ljava/lang/String;", line = 35)
    public final String toString() {
        field1047++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/lang/String;)V", line = 45)
    public static final void method514(int arg0, String arg1) {
        class447.method2624(97, "", arg0, arg1, 0, "");
        field1046++;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 53)
    public static void method515(int arg0) {
        field1056 = null;
        field1054 = null;
        field1055 = null;
        if (arg0 == -1) {
            field1050 = null;
            field1052 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)I", line = 68)
    public final int method516(int arg0) {
        if (arg0 == -5544) {
            field1044++;
            return this.field1045;
        } else {
            return 11;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lnk;B)Lnk;", line = 86)
    public static final class464 method517(class464 arg0, byte arg1) {
        if (arg1 != 79) {
            method515(-102);
        }
        field1043++;
        class464 var2 = client.method1057(arg0);
        if (var2 == null) {
            var2 = arg0.field6335;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)[Loj;", line = 102)
    public static final class235[] method518(int arg0) {
        field1049++;
        if (arg0 != 0) {
            method513(-11);
        }
        return new class235[] { class60.field812, class214.field2875, class413.field5646 };
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)Lnk;", line = 113)
    public static final class464 method519(int arg0, int arg1, byte arg2) {
        field1053++;
        class464 var3 = class150.method888((byte) -115, arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field6360 == null || arg1 >= var3.field6360.length) {
            return null;
        } else if (arg2 == -72) {
            return var3.field6360[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V", line = 140)
    public class78(int arg0, int arg1) {
        this.field1045 = arg0;
    }
}
