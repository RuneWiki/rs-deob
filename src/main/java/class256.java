import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class256 {

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lok;")
    public static class256 field3670 = new class256(1);

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lok;")
    public static class256 field3675 = new class256(2);

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lok;")
    public static class256 field3676 = new class256(4);

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lok;")
    public static class256 field3677 = new class256(1);

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Lok;")
    public static class256 field3678 = new class256(2);

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lok;")
    public static class256 field3679 = new class256(4);

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "Lok;")
    public static class256 field3680 = new class256(2);

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Lok;")
    public static class256 field3681 = new class256(4);

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Ljt;")
    public static class106 field3682 = new class106(8);

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "J")
    public static long field3685 = 0L;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "F")
    public static float field3684;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "Lvd;")
    public static class39 field3683;

    @OriginalMember(owner = "client!ok", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3669++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILha;IIIB)V")
    public static final void method1676(int arg0, int arg1, int arg2, class60 arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3674++;
        arg3.method482(arg0, arg4, arg1, 1, arg2, arg5);
        arg3.method482(arg0 + 1, arg6, arg1 - 2, 1, arg2 + 1, 16);
        arg3.method481(arg6, 88, arg0 + 1, arg2 + 18, arg1 - 2, arg5 + -19);
        if (arg7 >= -29) {
            method1677((byte) 60);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static void method1677(byte arg0) {
        field3670 = null;
        field3680 = null;
        field3679 = null;
        field3682 = null;
        field3675 = null;
        field3683 = null;
        field3681 = null;
        field3677 = null;
        field3676 = null;
        field3678 = null;
        if (arg0 > -73) {
            field3684 = 0.34567574F;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIII)V")
    public static final void method1678(boolean arg0, int arg1, int arg2, int arg3) {
        field3672++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg1 != -19) {
            method1677((byte) 16);
        }
        class266.field3798 = arg0;
        class375.field5681 = arg2;
        client.field4279 = arg3;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I)V")
    private class256(int arg0) {
        this.field3673 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lsca;IZ)V")
    public static final void method1679(class46 arg0, int arg1, boolean arg2) {
        field3671++;
        int var3 = arg0.field569 == arg1 ? arg0.field549 : arg0.field569;
        int var4 = arg0.field573 == 0 ? arg0.field574 : arg0.field573;
        class344.method2182(var3, var4, (byte) 81, arg2, arg0.field610, class86.field1229[arg0.field610 >> 16]);
        if (arg0.field621 != null) {
            class344.method2182(var3, var4, (byte) 81, arg2, arg0.field610, arg0.field621);
        }
        class421 var5 = (class421) class291.field4168.method2287((long) arg0.field610, (byte) -117);
        if (var5 != null) {
            class237.method1572(var5.field6282, arg2, var3, (byte) 0, var4);
        }
    }
}
