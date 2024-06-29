import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class177 {

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lng;")
    private class226 field2608 = new class226(64);

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lng;")
    public class226 field2612 = new class226(64);

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Lic;")
    public class491 field2602;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Lic;")
    private class491 field2603;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Lki;")
    public static class498 field2604 = new class498(80, 2);

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "Lki;")
    public static class498 field2611 = new class498(42, -1);

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "[I")
    public static int[] field2614 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2613;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    public final void method1201(boolean arg0) {
        class226 var2 = this.field2608;
        synchronized (this.field2608) {
            this.field2608.method1539(-109);
            if (!arg0) {
                field2613 = null;
            }
        }
        field2607++;
        class226 var3 = this.field2612;
        synchronized (this.field2612) {
            this.field2612.method1539(-62);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)Lpb;")
    public final class464 method1202(boolean arg0, int arg1) {
        field2610++;
        class226 var3 = this.field2608;
        class464 var4;
        synchronized (this.field2608) {
            var4 = (class464) this.field2608.method1536((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2603.method2945(34, arg1, arg0);
        class464 var6 = new class464();
        var6.field6869 = this;
        if (var5 != null) {
            var6.method2787(new class209(var5), -13605);
        }
        class226 var7 = this.field2608;
        synchronized (this.field2608) {
            this.field2608.method1542(var6, (byte) 112, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method1203(int arg0) {
        field2614 = null;
        field2604 = null;
        field2613 = null;
        field2611 = null;
        if (arg0 != 34) {
            method1203(-58);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
    public final void method1204(int arg0, int arg1) {
        class226 var3 = this.field2608;
        synchronized (this.field2608) {
            this.field2608.method1534(arg1 + 1476186137, arg0);
        }
        field2605++;
        class226 var4 = this.field2612;
        synchronized (this.field2612) {
            this.field2612.method1534(arg1 ^ arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public final void method1205(byte arg0) {
        if (arg0 >= -51) {
            this.method1204(-41, 57);
        }
        field2601++;
        class226 var2 = this.field2608;
        synchronized (this.field2608) {
            this.field2608.method1540(0);
        }
        class226 var3 = this.field2612;
        synchronized (this.field2612) {
            this.field2612.method1540(0);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
    public final void method1206(int arg0, int arg1, int arg2) {
        field2606++;
        if (arg0 != 128) {
            field2613 = null;
        }
        this.field2608 = new class226(arg1);
        this.field2612 = new class226(arg2);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BIII)I")
    public static final int method1207(byte arg0, int arg1, int arg2, int arg3) {
        field2609++;
        if (arg1 == arg3) {
            return arg1;
        }
        int var4 = -97 % ((72 - arg0) / 46);
        int var5 = 128 - arg2;
        int var6 = (arg1 & 0x7F) * var5 + ((arg3 & 0x7F) * arg2) >> 7;
        int var7 = (arg1 & 0x380) * var5 + (arg3 & 0x380) * arg2 >> 7;
        int var8 = (arg1 & 0xFC00) * var5 + ((arg3 & 0xFC00) * arg2) >> 7;
        return var7 & 0x380 | var8 & 0xFC00 | var6 & 0x7F;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lai;ILic;Lic;)V")
    public class177(class423 arg0, int arg1, class491 arg2, class491 arg3) {
        this.field2602 = arg3;
        this.field2603 = arg2;
        this.field2603.method2942(false, 34);
    }
}
