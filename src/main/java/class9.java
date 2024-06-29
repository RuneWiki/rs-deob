import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class9 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public int field142 = 1;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field144 = 1401;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field147 = 0;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[J")
    public static long[] field143 = new long[32];

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lct;")
    public static class285 field151 = new class285(47, 3);

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "[I")
    public static int[] field152 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "C")
    public char field145;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lre;B)V", line = 4)
    public final void method101(class446 arg0, byte arg1) {
        if (arg1 <= 112) {
            return;
        }
        field146++;
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                return;
            }
            this.method102(arg0, var3, 104);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lre;II)V", line = 25)
    private final void method102(class446 arg0, int arg1, int arg2) {
        if (arg2 != 104) {
            return;
        }
        field148++;
        if (arg1 == 1) {
            this.field145 = class372.method2308(arg0.method2642(true), (byte) -70);
        } else if (arg1 == 2) {
            this.field142 = 0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 46)
    public static void method103(int arg0) {
        field151 = null;
        field152 = null;
        field143 = null;
        if (arg0 <= 72) {
            field144 = 85;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Z", line = 59)
    public static final boolean method104(int arg0, int arg1) {
        field149++;
        if (arg1 != 0) {
            return false;
        } else if (arg0 == 60 || arg0 == 11 || arg0 == 48 || arg0 == 20 || arg0 == 47) {
            return true;
        } else {
            return arg0 == 22 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lbg;B)V", line = 80)
    public static final void method105(class257 arg0, byte arg1) {
        field150++;
        if (arg1 != -83) {
            method105((class257) null, (byte) 43);
        }
        class43 var2 = (class43) class4.field82.method2305((long) arg0.field4609, (byte) 42);
        if (var2 == null) {
            class356.method2192((class271) null, arg0, arg0.field4545, (class349) null, 0, arg0.field4674[0], arg0.field4675[0], (byte) -119);
        } else {
            var2.method316(false);
        }
    }
}
