import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class352 implements class121 {

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "I")
    public int field4617;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public int field4607;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "Lida;")
    public class215 field4605;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "Lce;")
    public class278 field4608;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "Lpr;")
    public static class407 field4613 = new class407(38, 19);

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "Lce;")
    public static class278 field4614 = new class278();

    @OriginalMember(owner = "client!kda", name = "n", descriptor = "Lpca;")
    public static class653 field4618 = new class653(4);

    @OriginalMember(owner = "client!kda", name = "o", descriptor = "Lpr;")
    public static class407 field4619 = new class407(87, -1);

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Lqv;")
    public class406 method484(int arg0) {
        field4606++;
        return arg0 == 16236 ? null : null;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZLoa;)V")
    public static final void method1951(boolean arg0, class635 arg1) {
        if (!arg0) {
            method1951(false, null);
        }
        for (class202 var2 = (class202) class515.field7362.method93((byte) 104); var2 != null; var2 = (class202) class515.field7362.method92(0)) {
            if (var2.field2486) {
                var2.method1233(arg1);
            }
        }
        field4615++;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIIII)V")
    public static final void method1952(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != -29087) {
            field4616 = 21;
        }
        field4611++;
        if (class601.field8530.field2841 != 0 && arg0 != 0 && class479.field7037 < 50 && arg1 != -1) {
            class259.field3301[class479.field7037++] = new class561((byte) 1, arg1, arg0, arg5, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V")
    public static void method1953(byte arg0) {
        field4618 = null;
        if (arg0 <= -21) {
            field4614 = null;
            field4613 = null;
            field4619 = null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lida;Lce;IIIII)V")
    public class352(class215 arg0, class278 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4617 = arg4;
        this.field4607 = arg5;
        this.field4610 = arg2;
        this.field4609 = arg6;
        this.field4605 = arg0;
        this.field4608 = arg1;
        this.field4612 = arg3;
    }
}
