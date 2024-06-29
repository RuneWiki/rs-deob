import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class398 {

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lfba;")
    private class348 field5698 = new class348(64);

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lla;")
    private class423 field5695;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Lfba;")
    public static class348 field5694 = new class348(64);

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field5697 = 0;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "[I")
    public static int[] field5699;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method2412(byte arg0) {
        if (arg0 == -51) {
            field5694 = null;
            field5699 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lpca;")
    public final class157 method2413(int arg0, int arg1) {
        field5696++;
        class348 var3 = this.field5698;
        class157 var4;
        synchronized (this.field5698) {
            var4 = (class157) this.field5698.method2216(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field5695;
        byte[] var6;
        synchronized (this.field5695) {
            var6 = this.field5695.method2600(0, arg1, arg0);
        }
        class157 var7 = new class157();
        if (var6 != null) {
            var7.method1120(-124, new class479(var6));
        }
        class348 var8 = this.field5698;
        synchronized (this.field5698) {
            this.field5698.method2213((byte) -16, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lqk;IBI)V")
    public static final void method2414(class146 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 > -95) {
            field5697 = 78;
        }
        if (arg0.field2129 == 0) {
            arg0.field1992 = arg0.field2014;
        } else if (arg0.field2129 == 1) {
            arg0.field1992 = (arg1 - arg0.field1997) / 2 + arg0.field2014;
        } else if (arg0.field2129 == 2) {
            arg0.field1992 = arg1 - arg0.field1997 - arg0.field2014;
        } else if (arg0.field2129 == 3) {
            arg0.field1992 = arg0.field2014 * arg1 >> 14;
        } else if (arg0.field2129 == 4) {
            arg0.field1992 = (arg0.field2014 * arg1 >> 14) + (arg1 - arg0.field1997) / 2;
        } else {
            arg0.field1992 = arg1 - (arg0.field2014 * arg1 >> 14) - arg0.field1997;
        }
        if (arg0.field2092 == 0) {
            arg0.field2103 = arg0.field2026;
        } else if (arg0.field2092 == 1) {
            arg0.field2103 = (arg3 - arg0.field2016) / 2 + arg0.field2026;
        } else if (arg0.field2092 == 2) {
            arg0.field2103 = arg3 - arg0.field2016 - arg0.field2026;
        } else if (arg0.field2092 == 3) {
            arg0.field2103 = arg0.field2026 * arg3 >> 14;
        } else if (arg0.field2092 == 4) {
            arg0.field2103 = (arg3 - arg0.field2016) / 2 + (arg0.field2026 * arg3 >> 14);
        } else {
            arg0.field2103 = arg3 - (arg0.field2026 * arg3 >> 14) - arg0.field2016;
        }
        field5700++;
        if (!class284.field3960 || client.method2732(arg0).field6793 == 0 && arg0.field2112 != 0) {
            return;
        }
        if (arg0.field2103 < 0) {
            arg0.field2103 = 0;
        } else if ((arg0.field2103 + arg0.field2016) > arg3) {
            arg0.field2103 = arg3 - arg0.field2016;
        }
        if (arg0.field1992 < 0) {
            arg0.field1992 = 0;
        } else if ((arg0.field1997 + arg0.field1992) > arg1) {
            arg0.field1992 = arg1 - arg0.field1997;
            return;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lmp;ILla;)V")
    public class398(class315 arg0, int arg1, class423 arg2) {
        this.field5695 = arg2;
        this.field5695.method2616(5, 0);
    }
}
