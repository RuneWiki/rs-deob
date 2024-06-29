import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class538 {

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field7301 = 0;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "Luc;")
    public static class27 field7302 = new class27(75, 3);

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field7304 = 0;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)Lri;")
    public static final class97 method2965(int arg0, int arg1) {
        if (arg1 != 3) {
            return null;
        }
        field7303++;
        class97 var2 = (class97) class624.field8695.method1986((byte) -96, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class319.field4734.method940(0, arg0, arg1 - 3);
        class97 var4 = new class97();
        if (var3 != null) {
            var4.method760(arg0, new class96(var3), (byte) -84);
        }
        class624.field8695.method1985(var4, (long) arg0, (byte) -102);
        return var4;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILln;)V")
    public static final void method2966(int arg0, class345 arg1) {
        field7305++;
        if (!class229.field3278 && arg0 < -35) {
            arg1.method2971(1);
            class315.field4697--;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
    public static void method2967(int arg0) {
        field7302 = null;
        if (arg0 != 0) {
            method2966(-11, null);
        }
    }
}
