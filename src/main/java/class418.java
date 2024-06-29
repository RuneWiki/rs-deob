import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class418 {

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "Lco;")
    private class210 field6017 = new class210(128);

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "Lg;")
    private class470 field6024;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Lss;")
    public static class140 field6015 = new class140(11, 15);

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "[[S")
    public static short[][] field6023 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "Ljt;")
    public static class290 field6021;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static void method2484(int arg0) {
        field6015 = null;
        field6021 = null;
        field6023 = null;
        if (arg0 != 22437) {
            method2486(true, false);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
    public final void method2485(int arg0, int arg1) {
        class210 var3 = this.field6017;
        synchronized (this.field6017) {
            if (arg0 != -14019) {
                this.method2488(90, 44);
            }
            this.field6017.method1166(arg1, (byte) -52);
        }
        field6020++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZZ)V")
    public static final void method2486(boolean arg0, boolean arg1) {
        class300.method1887(class110.field1336, (byte) -23, class464.field6541, class57.field725, arg0);
        if (arg1) {
            method2484(-124);
        }
        field6019++;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
    public final void method2487(int arg0) {
        class210 var2 = this.field6017;
        synchronized (this.field6017) {
            if (arg0 < 102) {
                this.field6017 = null;
            }
            this.field6017.method1165((byte) 118);
        }
        field6016++;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(II)Lqi;")
    public final class225 method2488(int arg0, int arg1) {
        field6022++;
        class210 var3 = this.field6017;
        class225 var4;
        synchronized (this.field6017) {
            var4 = (class225) this.field6017.method1163((byte) -27, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6024.method2768(-20472, arg0, 1);
        class225 var6 = new class225();
        if (var5 != null) {
            var6.method1243(new class179(var5), arg1 ^ 0xFFFF95D1);
        }
        class210 var7 = this.field6017;
        synchronized (this.field6017) {
            if (arg1 != 128) {
                this.field6017 = null;
            }
            this.field6017.method1172((long) arg0, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V")
    public final void method2489(int arg0) {
        field6018++;
        class210 var2 = this.field6017;
        synchronized (this.field6017) {
            if (arg0 != 13494) {
                method2484(-87);
            }
            this.field6017.method1169(1076);
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lci;ILg;)V")
    public class418(class421 arg0, int arg1, class470 arg2) {
        this.field6024 = arg2;
        this.field6024.method2755(-107, 1);
    }
}
