import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class162 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lph;")
    public static class114 field2073 = new class114(128);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Llg;")
    public static class20 field2076;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public static final void method871(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field2072++;
        if (arg4 < 6) {
            method874(-122);
        }
        class198 var7 = new class198();
        var7.field2643 = class234.field3224 + arg0;
        var7.field2642 = arg5;
        var7.field2650 = arg2;
        var7.field2652 = arg6;
        var7.field2645 = arg3;
        var7.field2644 = arg1;
        class118.field1467.method992(var7, -88);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI)Lgs;")
    public static final class40 method872(int arg0, byte arg1, int arg2) {
        field2075++;
        class40 var3 = (class40) class87.field970.method308((long) arg0 | (long) arg2 << 32, (byte) -103);
        if (arg1 != 92) {
            method872(-26, (byte) 42, -99);
        }
        if (var3 == null) {
            var3 = new class40(arg2, arg0);
            class87.field970.method314(var3.field4510, var3, 7079);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static final void method873(int arg0) {
        field2071++;
        if (arg0 != 1282152096) {
            field2073 = null;
        }
        class208.method1127(false, -90);
        if (class232.field3205 >= 0 && class232.field3205 != 0) {
            class429.method2657(class232.field3205, 616516448);
            class232.field3205 = -1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public static void method874(int arg0) {
        field2076 = null;
        if (arg0 > -57) {
            method873(44);
        }
        field2073 = null;
    }
}
