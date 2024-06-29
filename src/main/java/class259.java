import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class259 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lck;")
    public static class119 field4142 = class298.method1987((byte) 51, "overlay)3dat");

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "[[[I")
    public static int[][][] field4144;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lck;I)V", line = 5)
    public static final void method1654(class119 arg0, int arg1) {
        field4145++;
        if (class13.field211 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method786((byte) 112);
        if (var3 == 0L) {
            return;
        }
        while (class13.field211.length > var2 && class13.field211[var2].field1218 != var3) {
            var2++;
        }
        if (var2 >= class13.field211.length || class13.field211[var2] == null) {
            return;
        }
        class6.field149.method966(arg1 - 11746, 53);
        class6.field149.method29(2069, class13.field211[var2].field1218);
        if (arg1 != 11746) {
            method1655(-29);
        }
        class31.field440++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 45)
    public static void method1655(int arg0) {
        field4142 = null;
        if (arg0 != 0) {
            method1654((class119) null, -54);
        }
        field4144 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)V", line = 57)
    public static final void method1656(boolean arg0, int arg1) {
        if (class87.field1320 == null || class87.field1320.length < arg1) {
            class87.field1320 = new int[arg1];
        }
        field4141++;
        if (arg0) {
            method1655(-9);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILck;)Lck;", line = 72)
    public static final class119 method1657(int arg0, class119 arg1) {
        field4140++;
        class154 var2 = class49.method369(arg1, false);
        if (var2 == null) {
            return class93.field1429;
        } else {
            int var3 = 50 % ((-arg0 - 8) / 51);
            return var2.field2458;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)J", line = 94)
    public static final long method1658(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        return var3 == null || var3.field1598 == null ? 0L : var3.field1598.field3175;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ldl;Lva;Lva;Z)V", line = 102)
    public static final void method1659(class271 arg0, class36 arg1, class36 arg2, boolean arg3) {
        if (arg3) {
            class169.field2681 = arg2;
            class263.field4283 = arg1;
            field4143++;
            class97.field1483 = arg0;
        }
    }
}
